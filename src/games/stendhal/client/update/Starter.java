//*****************************************************************************
//*****************************************************************************
//
//                               Important note
//
// Please note that this file is compiled using Java 1.2 in the build-script
// in order to display a dialogbox to the user in case an old version of java
// is used. As we compile it with Java 1.2 no new features may be used in this
// class.
//
//*****************************************************************************
//*****************************************************************************

/***************************************************************************
 *                   (C) Copyright 2003-2011 - Stendhal                    *
 ***************************************************************************
 ***************************************************************************
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 ***************************************************************************/
package games.stendhal.client.update;

import javax.swing.JOptionPane;

/**
 * This class can be compiled with a lower version of Java and will display an
 * error message if the java version is too old.
 *
 * @author hendrik
 */
public class Starter {

	/**
	 * Starts stendhal.
	 *
	 * @param args
	 *            args
	 */
	public static void main(final String[] args) {
		try {
			final String version = System.getProperty("java.specification.version");
			if (Float.parseFloat(version) < 1.8f) {
				JOptionPane.showMessageDialog(
						null,
<<<<<<< HEAD
						"游戏需要JAVA版本至少为 Java 7。"
=======
						"You need at least Java 8 (also known as 1.8.0) but you only have "
>>>>>>> 3afd5d892a4f0731e7d7cbc5707f8cca4a98b26f
						+ version
						+ ". 你可以在 https://java.com 下载");
			}
		} catch (final RuntimeException e) {
			// ignore
		}

		ClientRunner.run(args);
	}
}
