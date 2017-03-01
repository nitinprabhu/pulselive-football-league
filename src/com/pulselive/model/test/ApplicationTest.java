package com.pulselive.model.test;

import java.util.ArrayList;
import java.util.List;

import com.pulselive.model.LeagueTable;
import com.pulselive.model.LeagueTableEntry;
import com.pulselive.model.Match;

/**
 * 
 * @author nitinprabhu
 *
 */
public class ApplicationTest
{

	public static void main(String[] args)
	{

		// Matches
		Match match1 = new Match("Arsenal", "Chelsea", 2, 1);
		Match match2 = new Match("Chelsea", "Arsenal", 3, 3);
		Match match3 = new Match("ManU", "ManchesterCity", 1, 3);
		Match match4 = new Match("ManchesterCity", "ManU", 1, 0);
		Match match5 = new Match("Arsenal", "ManU", 0, 2);
		Match match6 = new Match("ManU", "Arsenal", 1, 0);
		Match match7 = new Match("Chelsea", "ManchesterCity", 3, 0);
		Match match8 = new Match("ManchesterCity", "Chelsea", 3, 3);
		Match match9 = new Match("Chelsea", "ManU", 1, 1);
		Match match10 = new Match("ManU", "Chelsea", 2, 2);
		Match match11 = new Match("Arsenal", "ManchesterCity", 1, 0);
		Match match12 = new Match("ManchesterCity", "Arsenal", 2, 4);

		// List of Matches
		List<Match> matches = new ArrayList<Match>();
		matches.add(match1);
		matches.add(match2);
		matches.add(match3);
		matches.add(match4);
		matches.add(match5);
		matches.add(match6);
		matches.add(match7);
		matches.add(match8);
		matches.add(match9);
		matches.add(match10);
		matches.add(match11);
		matches.add(match12);

		LeagueTable table = new LeagueTable(matches);

		List<LeagueTableEntry> list = table.getTableEntries();

		//Overridden tostring() of LeagueTableEntry so that output prints points, goal difference, goals for and then team names
		System.out.println(list);
	}
}
