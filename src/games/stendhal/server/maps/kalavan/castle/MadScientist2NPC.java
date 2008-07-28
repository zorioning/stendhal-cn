package games.stendhal.server.maps.kalavan.castle;

import games.stendhal.server.core.config.ZoneConfigurator;
import games.stendhal.server.core.engine.StendhalRPZone;
import games.stendhal.server.core.pathfinder.FixedPath;
import games.stendhal.server.core.pathfinder.Node;
import games.stendhal.server.entity.npc.SpeakerNPC;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Builds a mad scientist NPC who give thread to a player if needed. 
 *
 * @author tigertoes
 */
public class MadScientist2NPC implements ZoneConfigurator {

	/**
	 * Configure a zone.
	 *
	 * @param	zone		The zone to be configured.
	 * @param	attributes	Configuration attributes.
	 */
	public void configureZone(final StendhalRPZone zone, final Map<String, String> attributes) {
		buildNPC(zone);
	}

	private void buildNPC(final StendhalRPZone zone) {
		final SpeakerNPC npc = new SpeakerNPC("Boris Karlova") {

			@Override
			protected void createPath() {
				final List<Node> nodes = new LinkedList<Node>();
				nodes.add(new Node(95, 113));
				nodes.add(new Node(98, 113));
				nodes.add(new Node(98, 115));
				nodes.add(new Node(101, 115));
				nodes.add(new Node(101, 113));
				nodes.add(new Node(98, 113));
				nodes.add(new Node(98, 115));
				nodes.add(new Node(95, 115));
				nodes.add(new Node(95, 114));
				nodes.add(new Node(101, 114));
				nodes.add(new Node(101, 113));
				setPath(new FixedPath(nodes, true));
			}
				// remaining behaviour defined in maps.quests.MithrilCloak
			@Override
			    protected void createDialog() {
	 	     }
		    
		};

		npc.setDescription("You see someone that is somewhat strange. Perhaps you shouldn't bother him?");
		npc.setEntityClass("madscientistnpc");
		npc.setPosition(95, 113);
		npc.initHP(100);
		zone.add(npc);
	}
}
