package com.example.a30daysofsmalltalk.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30daysofsmalltalk.R


data class DailyTasks(
    @StringRes val dayNumber: Int,
    @StringRes val challengeTitle: Int,
    @StringRes val challengeDescription: Int,
    @DrawableRes val imageResourceId: Int,
    //val isCompleted: Boolean = false
)

val dailyTasks = listOf(
    DailyTasks(R.string.day1, R.string.challenge_title_day1, R.string.challenge_desc_day1, R.drawable.day1),
    DailyTasks(R.string.day2, R.string.challenge_title_day2, R.string.challenge_desc_day2, R.drawable.day2),
    DailyTasks(R.string.day3, R.string.challenge_title_day3, R.string.challenge_desc_day3, R.drawable.day3),
    DailyTasks(R.string.day4, R.string.challenge_title_day4, R.string.challenge_desc_day4, R.drawable.day4),
    DailyTasks(R.string.day5, R.string.challenge_title_day5, R.string.challenge_desc_day5, R.drawable.day5),
    DailyTasks(R.string.day6, R.string.challenge_title_day6, R.string.challenge_desc_day6, R.drawable.day6),
    DailyTasks(R.string.day7, R.string.challenge_title_day7, R.string.challenge_desc_day7, R.drawable.day7),
    DailyTasks(R.string.day8, R.string.challenge_title_day8, R.string.challenge_desc_day8, R.drawable.day8),
    DailyTasks(R.string.day9, R.string.challenge_title_day9, R.string.challenge_desc_day9, R.drawable.day9),
    DailyTasks(R.string.day10, R.string.challenge_title_day10, R.string.challenge_desc_day10, R.drawable.day10),
    DailyTasks(R.string.day11, R.string.challenge_title_day11, R.string.challenge_desc_day11, R.drawable.day11),
    DailyTasks(R.string.day12, R.string.challenge_title_day12, R.string.challenge_desc_day12, R.drawable.day12),
    DailyTasks(R.string.day13, R.string.challenge_title_day13, R.string.challenge_desc_day13, R.drawable.day13),
    DailyTasks(R.string.day14, R.string.challenge_title_day14, R.string.challenge_desc_day14, R.drawable.day14),
    DailyTasks(R.string.day15, R.string.challenge_title_day15, R.string.challenge_desc_day15, R.drawable.day15),
    DailyTasks(R.string.day16, R.string.challenge_title_day16, R.string.challenge_desc_day16, R.drawable.day16),
    DailyTasks(R.string.day17, R.string.challenge_title_day17, R.string.challenge_desc_day17, R.drawable.day17),
    DailyTasks(R.string.day18, R.string.challenge_title_day18, R.string.challenge_desc_day18, R.drawable.day18),
    DailyTasks(R.string.day19, R.string.challenge_title_day19, R.string.challenge_desc_day19, R.drawable.day19),
    DailyTasks(R.string.day20, R.string.challenge_title_day20, R.string.challenge_desc_day20, R.drawable.day20),
    DailyTasks(R.string.day21, R.string.challenge_title_day21, R.string.challenge_desc_day21, R.drawable.day21),
    DailyTasks(R.string.day22, R.string.challenge_title_day22, R.string.challenge_desc_day22, R.drawable.day22),
    DailyTasks(R.string.day23, R.string.challenge_title_day23, R.string.challenge_desc_day23, R.drawable.day23),
    DailyTasks(R.string.day24, R.string.challenge_title_day24, R.string.challenge_desc_day24, R.drawable.day24),
    DailyTasks(R.string.day25, R.string.challenge_title_day25, R.string.challenge_desc_day25, R.drawable.day25),
    DailyTasks(R.string.day26, R.string.challenge_title_day26, R.string.challenge_desc_day26, R.drawable.day26),
    DailyTasks(R.string.day27, R.string.challenge_title_day27, R.string.challenge_desc_day27, R.drawable.day27),
    DailyTasks(R.string.day28, R.string.challenge_title_day28, R.string.challenge_desc_day28, R.drawable.day28),
    DailyTasks(R.string.day29, R.string.challenge_title_day29, R.string.challenge_desc_day29, R.drawable.day29),
    DailyTasks(R.string.day30, R.string.challenge_title_day30, R.string.challenge_desc_day30, R.drawable.day30)
)

