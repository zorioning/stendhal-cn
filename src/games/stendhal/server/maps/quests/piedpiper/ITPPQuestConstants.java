/* $Id$ */
/***************************************************************************
 *                   (C) Copyright 2003-2010 - Stendhal                    *
 ***************************************************************************
 ***************************************************************************
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 ***************************************************************************/
package games.stendhal.server.maps.quests.piedpiper;

import java.util.Arrays;
import java.util.List;

public interface ITPPQuestConstants {

	/**
	 * related to quest part.
	 * <ul>
	 * <li> INACTIVE - quest isn't active
	 * <li> INVASION - part I (rats invasion)
	 * <li> AWAITING - part II (彼德彼伯 called)
	 * <li> OUTGOING - part III (彼德彼伯 killing rats)
	 * <li> CHILDRENS - part IV (彼德彼伯 takes childrens away)
	 * <li> FINAL - part V (return childrens back to Ados)
	 * </ul>
	 */

	public enum TPP_Phase {
		TPP_INACTIVE,
		TPP_INVASION,
		TPP_AWAITING ,
		TPP_OUTGOING,
		TPP_CHILDRENS,
		TPP_FINAL
	}

	public TPP_Phase INACTIVE = TPP_Phase.TPP_INACTIVE;
	public TPP_Phase INVASION = TPP_Phase.TPP_INVASION;
	public TPP_Phase AWAITING = TPP_Phase.TPP_AWAITING;
	public TPP_Phase OUTGOING = TPP_Phase.TPP_OUTGOING;
	public TPP_Phase CHILDRENS = TPP_Phase.TPP_CHILDRENS;
	public TPP_Phase FINAL = TPP_Phase.TPP_FINAL;

	final String QUEST_SLOT = "the_pied_piper";

	final String INACTIVE_TIME_MAX = "QUEST_INACTIVE_TIME_MAX";
	final String INACTIVE_TIME_MIN = "QUEST_INACTIVE_TIME_MIN";
	final String INVASION_TIME_MIN = "QUEST_INVASION_TIME_MIN";
	final String INVASION_TIME_MAX = "QUEST_INVASION_TIME_MAX";
	final String AWAITING_TIME_MIN = "QUEST_AWAITING_TIME_MIN";
	final String AWAITING_TIME_MAX = "QUEST_AWAITING_TIME_MAX";
	final String OUTGOING_TIME_MIN = "QUEST_OUTGOING_TIME_MIN";
	final String OUTGOING_TIME_MAX = "QUEST_OUTGOING_TIME_MAX";
	final String CHILDRENS_TIME_MIN = "QUEST_CHILDRENS_TIME_MIN";
	final String CHILDRENS_TIME_MAX = "QUEST_CHILDRENS_TIME_MAX";
	final String FINAL_TIME_MIN = "QUEST_FINAL_TIME_MIN";
	final String FINAL_TIME_MAX = "QUEST_FINAL_TIME_MAX";
	final String SHOUT_TIME = "QUEST_SHOUT_TIME";

	/**
	 * List of game zones, where rats will appears.
	 *
	 * TODO: add other Ados buildings here, and improve summonRats() function
	 *       to avoid placing rats inside closed areas within houses.
	 */
	public final List<String> RAT_ZONES = Arrays.asList(
// can't be used because NPC can block creature
//			"int_阿多斯_银库",
			"int_阿多斯_酒吧",
//			"int_阿多斯_酒吧_1",
			"int_阿多斯_军营_0",
			"int_阿多斯_军营_1",
			"int_阿多斯_面包店",
			"int_阿多斯_卡若琳_小屋_0",
			"int_阿多斯_教堂_0",
			"int_阿多斯_教堂_1",
//			"int_阿多斯_菲琳娜_小屋",
			"int_阿多斯_渔民_小屋_north",
			"int_阿多斯_金匠",
//			"int_阿多斯_闹鬼_小屋",
			"int_阿多斯_图书馆",
			"int_阿多斯_肉_市场",
			"int_阿多斯_罗斯_小屋",
			"int_阿多斯_缝纫_店",
//			"int_阿多斯_储藏室",
//			"int_阿多斯_旅馆_0",
			"int_阿多斯_市_政厅",
			"int_阿多斯_市_政厅_1",
			"int_阿多斯_市_政厅_2",
			"int_阿多斯_市_政厅_3",
			"0_阿多斯_城_n",
			"0_阿多斯_城",
			"0_阿多斯_城_s");

	/**
	 * List of creatures types to create.
	 */
	public final List<String> RAT_TYPES = Arrays.asList(
			"老鼠",
			"洞穴老鼠",
			"毒液鼠",
			"利齿鼠",
			"巨型鼠",
			"鼠人弓箭手");

	/**
	 * List of reward moneys quantities for each type of killed rats.
	 */
	public final List<Integer> RAT_REWARDS = Arrays.asList(
			10,
			20,
			100,
			160,
			360,
			800);

}
