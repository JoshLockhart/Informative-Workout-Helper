package com.lockhart.joshua.informativeworkouthelper;

import android.content.Context;
import android.content.res.Resources;

class Muscle {

    String getEquipmentString(Context context, String equipment) {
        String equipmentString = null;
        Resources res = context.getResources();
        switch (equipment) {
            case "Dumbbells":
                equipmentString = res.getString(R.string.dumbbells);
                break;
            case "Barbell":
                equipmentString = res.getString(R.string.barbell);
                break;
            case "Cable":
                equipmentString = res.getString(R.string.cable);
                break;
            case "Suspension Trainer":
                equipmentString = res.getString(R.string.suspension);
                break;
            case "Machine":
                equipmentString = res.getString(R.string.machine);
                break;
            case "Body Weight":
                equipmentString = res.getString(R.string.bodyWeight);
                break;
        }
        return equipmentString;
    }


    static class Chest extends Muscle {

        int[] getImages(String equipment) {
            int[] images = new int[0];
            switch (equipment) {
                case "Dumbbells":
                    images = new int[] {R.drawable.dumbbell_press_1, R.drawable.decline_dumbbell_press_1, R.drawable.incline_dumbbell_press_1, R.drawable.dumbbell_fly_1, R.drawable.decline_dumbbell_fly_1, R.drawable.incline_dumbbell_fly_1, R.drawable.dumbbell_pullover_1};
                    break;
                case "Barbell":
                    images = new int[] {R.drawable.barbell_press_1, R.drawable.decline_barbell_press_1, R.drawable.incline_barbell_press_1};
                    break;
                case "Cable":
                    images = new int[] {R.drawable.incline_cable_press_1, R.drawable.incline_cable_fly_1, R.drawable.cable_crossover_1, R.drawable.low_cable_crossover_1, R.drawable.high_cable_crossover_1};
                    break;
                case "Suspension Trainer":
                    images = new int[]{R.drawable.suspension_pushup_1, R.drawable.suspension_fly_1};
                    break;
                case "Machine":
                    images = new int[]{R.drawable.leverage_machine_press_1, R.drawable.decline_leverage_machine_press_1, R.drawable.incline_leverage_machine_press_1, R.drawable.smith_machine_press_1, R.drawable.decline_smith_machine_press_1, R.drawable.incline_smith_machine_press_1, R.drawable.butterfly_machine_1};
                    break;
                case "Body Weight":
                    images = new int[]{R.drawable.pushup_1, R.drawable.incline_pushup_1, R.drawable.wide_pushup_1, R.drawable.single_arm_pushup_1, R.drawable.chest_dips_1};
                    break;
                }
                    return images;
    }

        int[] getImagesTwo(String equipment) {
            int[] imagesTwo = new int[0];
            switch (equipment) {
                case "Dumbbells":
                    imagesTwo = new int[] {R.drawable.dumbbell_press_2, R.drawable.decline_dumbbell_press_2, R.drawable.incline_dumbbell_press_2, R.drawable.dumbbell_fly_2, R.drawable.decline_dumbbell_fly_2, R.drawable.incline_dumbbell_fly_2, R.drawable.dumbbell_pullover_2};
                    break;
                case "Barbell":
                    imagesTwo = new int[] {R.drawable.barbell_press_2, R.drawable.decline_barbell_press_2, R.drawable.incline_barbell_press_2};
                    break;
                case "Cable":
                    imagesTwo = new int[] {R.drawable.incline_cable_press_2, R.drawable.incline_cable_fly_2, R.drawable.cable_crossover_2, R.drawable.low_cable_crossover_2, R.drawable.high_cable_crossover_2};
                    break;
                case "Suspension Trainer":
                    imagesTwo = new int[]{R.drawable.suspension_pushup_2, R.drawable.suspension_fly_2};
                    break;
                case "Machine":
                    imagesTwo = new int[]{R.drawable.leverage_machine_press_2, R.drawable.decline_leverage_machine_press_2, R.drawable.incline_leverage_machine_press_2, R.drawable.smith_machine_press_2, R.drawable.decline_smith_machine_press_2, R.drawable.incline_smith_machine_press_2, R.drawable.butterfly_machine_2};
                    break;
                case "Body Weight":
                    imagesTwo = new int[]{R.drawable.pushup_2, R.drawable.incline_pushup_2, R.drawable.wide_pushup_2, R.drawable.single_arm_pushup_2, R.drawable.chest_dips_2};
                    break;
            }
            return imagesTwo;
        }

        String[] getExerciseListTitles(Context context, String equipment) {
            String[] exerciseListTitles = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    exerciseListTitles = res.getStringArray(R.array.chestDumbbellListTitles);
                    break;
                case "Barbell":
                    exerciseListTitles = res.getStringArray(R.array.chestBarbellListTitles);
                    break;
                case "Cable":
                    exerciseListTitles = res.getStringArray(R.array.chestCableListTitles);
                    break;
                case "Suspension Trainer":
                    exerciseListTitles = res.getStringArray(R.array.chestSuspensionListTitles);
                    break;
                case "Machine":
                    exerciseListTitles = res.getStringArray(R.array.chestMachineListTitles);
                    break;
                case "Body Weight":
                    exerciseListTitles = res.getStringArray(R.array.chestBodyWeightListTitles);
                    break;
            }
            return exerciseListTitles;
        }

        String[] getExerciseTitles(Context context, String equipment) {
            String[] exerciseTitles = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    exerciseTitles = res.getStringArray(R.array.chestDumbbellTitles);
                    break;
                case "Barbell":
                    exerciseTitles = res.getStringArray(R.array.chestBarbellTitles);
                    break;
                case "Cable":
                    exerciseTitles = res.getStringArray(R.array.chestCableTitles);
                    break;
                case "Suspension Trainer":
                    exerciseTitles = res.getStringArray(R.array.chestSuspensionTitles);
                    break;
                case "Machine":
                    exerciseTitles = res.getStringArray(R.array.chestMachineTitles);
                    break;
                case "Body Weight":
                    exerciseTitles = res.getStringArray(R.array.chestBodyWeightTitles);
                    break;
            }
            return exerciseTitles;
        }

        String[] getDifficulties(Context context, String equipment) {
            String[] difficulties = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    difficulties = res.getStringArray(R.array.chestDumbbellDifficulties);
                    break;
                case "Barbell":
                    difficulties = res.getStringArray(R.array.chestBarbellDifficulties);
                    break;
                case "Cable":
                    difficulties = res.getStringArray(R.array.chestCableDifficulties);
                    break;
                case "Suspension Trainer":
                    difficulties = res.getStringArray(R.array.chestSuspensionDifficulties);
                    break;
                case "Machine":
                    difficulties = res.getStringArray(R.array.chestMachineDifficulties);
                    break;
                case "Body Weight":
                    difficulties = res.getStringArray(R.array.chestBodyWeightDifficulties);
                    break;
            }
            return difficulties;
        }

        String[] getYoutubeCodes(Context context, String equipment) {
            String[] youtubeCodes = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    youtubeCodes = res.getStringArray(R.array.chestDumbbellYouTubeCodes);
                    break;
                case "Barbell":
                    youtubeCodes = res.getStringArray(R.array.chestBarbellYouTubeCodes);
                    break;
                case "Cable":
                    youtubeCodes = res.getStringArray(R.array.chestCableYouTubeCodes);
                    break;
                case "Suspension Trainer":
                    youtubeCodes = res.getStringArray(R.array.chestSuspensionYouTubeCodes);
                    break;
                case "Machine":
                    youtubeCodes = res.getStringArray(R.array.chestMachineYouTubeCodes);
                    break;
                case "Body Weight":
                    youtubeCodes = res.getStringArray(R.array.chestBodyWeightYouTubeCodes);
                    break;
            }
            return youtubeCodes;
        }

        String[] getTextInstructions(Context context, String equipment) {
            String[] textInstructions = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    textInstructions = res.getStringArray(R.array.chestDumbbellTextInstructions);
                    break;
                case "Barbell":
                    textInstructions = res.getStringArray(R.array.chestBarbellTextInstructions);
                    break;
                case "Cable":
                    textInstructions = res.getStringArray(R.array.chestCableTextInstructions);
                    break;
                case "Suspension Trainer":
                    textInstructions = res.getStringArray(R.array.chestSuspensionTextInstructions);
                    break;
                case "Machine":
                    textInstructions = res.getStringArray(R.array.chestMachineTextInstructions);
                    break;
                case "Body Weight":
                    textInstructions = res.getStringArray(R.array.chestBodyWeightTextInstructions);
                    break;
            }
            return textInstructions;
        }

    }

    static class Back extends  Muscle {

        int[] getImages(String equipment) {
            int[] images = new int[0];
            switch (equipment) {
                case "Dumbbells":
                    images = new int[] {R.drawable.one_arm_dumbbell_row_1, R.drawable.incline_dumbbell_row_1, R.drawable.bent_over_dumbbell_row_1};
                    break;
                case "Barbell":
                    images = new int[] {R.drawable.bent_over_barbell_row_1, R.drawable.barbell_good_morning_1, R.drawable.t_bar_row_1, R.drawable.incline_barbell_row_1};
                    break;
                case "Cable":
                    images = new int[] {R.drawable.lat_pulldown_1, R.drawable.straight_arm_pulldown_1, R.drawable.cable_row_1, R.drawable.high_pulley_row_1};
                    break;
                case "Suspension Trainer":
                    images = new int[] {R.drawable.suspension_row_1};
                    break;
                case "Machine":
                    images = new int[] {R.drawable.assisted_pullup_1, R.drawable.lying_t_bar_row_1};
                    break;
                case "Body Weight":
                    images = new int[] {R.drawable.pullup_1, R.drawable.superman_1};
                    break;
            }
            return images;
        }

        int[] getImagesTwo(String equipment) {
            int[] imagesTwo = new int[0];
            switch (equipment) {
                case "Dumbbells":
                    imagesTwo = new int[] {R.drawable.one_arm_dumbbell_row_2, R.drawable.incline_dumbbell_row_2, R.drawable.bent_over_dumbbell_row_2};
                    break;
                case "Barbell":
                    imagesTwo = new int[] {R.drawable.bent_over_barbell_row_2, R.drawable.barbell_good_morning_2, R.drawable.t_bar_row_2, R.drawable.incline_barbell_row_2};
                    break;
                case "Cable":
                    imagesTwo = new int[] {R.drawable.lat_pulldown_2, R.drawable.straight_arm_pulldown_2, R.drawable.cable_row_2, R.drawable.high_pulley_row_2};
                    break;
                case "Suspension Trainer":
                    imagesTwo = new int[] {R.drawable.suspension_row_2};
                    break;
                case "Machine":
                    imagesTwo = new int[] {R.drawable.assisted_pullup_2, R.drawable.lying_t_bar_row_2};
                    break;
                case "Body Weight":
                    imagesTwo = new int[] {R.drawable.pullup_2, R.drawable.superman_2};
                    break;
            }
            return imagesTwo;
        }

        String[] getExerciseListTitles(Context context, String equipment) {
            String[] exerciseListTitles = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    exerciseListTitles = res.getStringArray(R.array.backDumbbellListTitles);
                    break;
                case "Barbell":
                    exerciseListTitles = res.getStringArray(R.array.backBarbellListTitles);
                    break;
                case "Cable":
                    exerciseListTitles = res.getStringArray(R.array.backCableListTitles);
                    break;
                case "Suspension Trainer":
                    exerciseListTitles = res.getStringArray(R.array.backSuspensionListTitles);
                    break;
                case "Machine":
                    exerciseListTitles = res.getStringArray(R.array.backMachineListTitles);
                    break;
                case "Body Weight":
                    exerciseListTitles = res.getStringArray(R.array.backBodyWeightListTitles);
                    break;
            }
            return exerciseListTitles;
        }

        String[] getExerciseTitles(Context context, String equipment) {
            String[] exerciseTitles = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    exerciseTitles = res.getStringArray(R.array.backDumbbellTitles);
                    break;
                case "Barbell":
                    exerciseTitles = res.getStringArray(R.array.backBarbellTitles);
                    break;
                case "Cable":
                    exerciseTitles = res.getStringArray(R.array.backCableTitles);
                    break;
                case "Suspension Trainer":
                    exerciseTitles = res.getStringArray(R.array.backSuspensionTitles);
                    break;
                case "Machine":
                    exerciseTitles = res.getStringArray(R.array.backMachineTitles);
                    break;
                case "Body Weight":
                    exerciseTitles = res.getStringArray(R.array.backBodyWeightTitles);
                    break;
            }
            return exerciseTitles;
        }

        String[] getDifficulties(Context context, String equipment) {
            String[] difficulties = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    difficulties = res.getStringArray(R.array.backDumbbellDifficulties);
                    break;
                case "Barbell":
                    difficulties = res.getStringArray(R.array.backBarbellDifficulties);
                    break;
                case "Cable":
                    difficulties = res.getStringArray(R.array.backCableDifficulties);
                    break;
                case "Suspension Trainer":
                    difficulties = res.getStringArray(R.array.backSuspensionDifficulties);
                    break;
                case "Machine":
                    difficulties = res.getStringArray(R.array.backMachineDifficulties);
                    break;
                case "Body Weight":
                    difficulties = res.getStringArray(R.array.backBodyWeightDifficulties);
                    break;
            }
            return difficulties;
        }

        String[] getYoutubeCodes(Context context, String equipment) {
            String[] youtubeCodes = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    youtubeCodes = res.getStringArray(R.array.backDumbbellYouTubeCodes);
                    break;
                case "Barbell":
                    youtubeCodes = res.getStringArray(R.array.backBarbellYouTubeCodes);
                    break;
                case "Cable":
                    youtubeCodes = res.getStringArray(R.array.backCableYouTubeCodes);
                    break;
                case "Suspension Trainer":
                    youtubeCodes = res.getStringArray(R.array.backSuspensionYouTubeCodes);
                    break;
                case "Machine":
                    youtubeCodes = res.getStringArray(R.array.backMachineYouTubeCodes);
                    break;
                case "Body Weight":
                    youtubeCodes = res.getStringArray(R.array.backBodyWeightYouTubeCodes);
                    break;
            }
            return youtubeCodes;
        }

        String[] getTextInstructions(Context context, String equipment) {
            String[] textInstructions = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    textInstructions = res.getStringArray(R.array.backDumbbellTextInstructions);
                    break;
                case "Barbell":
                    textInstructions = res.getStringArray(R.array.backBarbellTextInstructions);
                    break;
                case "Cable":
                    textInstructions = res.getStringArray(R.array.backCableTextInstructions);
                    break;
                case "Suspension Trainer":
                    textInstructions = res.getStringArray(R.array.backSuspensionTextInstructions);
                    break;
                case "Machine":
                    textInstructions = res.getStringArray(R.array.backMachineTextInstructions);
                    break;
                case "Body Weight":
                    textInstructions = res.getStringArray(R.array.backBodyWeightTextInstructions);
                    break;
            }
            return textInstructions;
        }

    }

    static class Legs extends  Muscle {

        int[] getImages(String equipment) {
            int[] images = new int[0];
            switch (equipment) {
                case "Dumbbells":
                    images = new int[]{R.drawable.dumbbell_squat_1, R.drawable.dumbbell_goblet_squat_1, R.drawable.stiff_leg_dumbbell_squat_1, R.drawable.dumbbell_lunge_1, R.drawable.dumbbell_stepup_1};
                    break;
                case "Barbell":
                    images = new int[]{R.drawable.barbell_squat_1, R.drawable.barbell_deadlift_1, R.drawable.barbell_glute_bridge_1};
                    break;
                case "Cable":
                    images = new int[]{R.drawable.cable_kickbacks_1, R.drawable.cable_hip_adduction_1};
                    break;
                case "Machine":
                    images = new int[]{R.drawable.leg_press_1, R.drawable.calf_raise_1, R.drawable.hip_adductor_1, R.drawable.hip_abductor_1, R.drawable.stairmaster_1, R.drawable.leg_curl_1};
                    break;
                case "Body Weight":
                    images = new int[]{R.drawable.bodyweight_squat_1, R.drawable.bodyweight_lunge_1, R.drawable.stepup_1};
                    break;
            }
            return images;
        }

        int[] getImagesTwo(String equipment) {
            int[] imagesTwo = new int[0];
            switch (equipment) {
                case "Dumbbells":
                    imagesTwo = new int[]{R.drawable.dumbbell_squat_2, R.drawable.dumbbell_goblet_squat_2, R.drawable.stiff_leg_dumbbell_squat_2, R.drawable.dumbbell_lunge_2, R.drawable.dumbbell_stepup_2};
                    break;
                case "Barbell":
                    imagesTwo = new int[]{R.drawable.barbell_squat_2, R.drawable.barbell_deadlift_2, R.drawable.barbell_glute_bridge_2};
                    break;
                case "Cable":
                    imagesTwo = new int[]{R.drawable.cable_kickbacks_2, R.drawable.cable_hip_adduction_2};
                    break;
                case "Machine":
                    imagesTwo = new int[]{R.drawable.leg_press_2, R.drawable.calf_raise_2, R.drawable.hip_adductor_2, R.drawable.hip_abductor_2, R.drawable.stairmaster_2, R.drawable.leg_curl_2};
                    break;
                case "Body Weight":
                    imagesTwo = new int[]{R.drawable.bodyweight_squat_2, R.drawable.bodyweight_lunge_2, R.drawable.stepup_2};
                    break;
            }
            return imagesTwo;
        }

        String[] getExerciseListTitles(Context context, String equipment) {
            String[] exerciseListTitles = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    exerciseListTitles = res.getStringArray(R.array.legsDumbbellListTitles);
                    break;
                case "Barbell":
                    exerciseListTitles = res.getStringArray(R.array.legsBarbellListTitles);
                    break;
                case "Cable":
                    exerciseListTitles = res.getStringArray(R.array.legsCableListTitles);
                    break;
                case "Machine":
                    exerciseListTitles = res.getStringArray(R.array.legsMachineListTitles);
                    break;
                case "Body Weight":
                    exerciseListTitles = res.getStringArray(R.array.legsBodyWeightListTitles);
                    break;
            }
            return exerciseListTitles;
        }

        String[] getExerciseTitles(Context context, String equipment) {
            String[] exerciseTitles = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    exerciseTitles = res.getStringArray(R.array.legsDumbbellTitles);
                    break;
                case "Barbell":
                    exerciseTitles = res.getStringArray(R.array.legsBarbellTitles);
                    break;
                case "Cable":
                    exerciseTitles = res.getStringArray(R.array.legsCableTitles);
                    break;
                case "Machine":
                    exerciseTitles = res.getStringArray(R.array.legsMachineTitles);
                    break;
                case "Body Weight":
                    exerciseTitles = res.getStringArray(R.array.legsBodyWeightTitles);
                    break;
            }
            return exerciseTitles;
        }

        String[] getDifficulties(Context context, String equipment) {
            String[] difficulties = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    difficulties = res.getStringArray(R.array.legsDumbbellDifficulties);
                    break;
                case "Barbell":
                    difficulties = res.getStringArray(R.array.legsBarbellDifficulties);
                    break;
                case "Cable":
                    difficulties = res.getStringArray(R.array.legsCableDifficulties);
                    break;
                case "Machine":
                    difficulties = res.getStringArray(R.array.legsMachineDifficulties);
                    break;
                case "Body Weight":
                    difficulties = res.getStringArray(R.array.legsBodyWeightDifficulties);
                    break;
            }
            return difficulties;
        }

        String[] getYoutubeCodes(Context context, String equipment) {
            String[] youtubeCodes = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    youtubeCodes = res.getStringArray(R.array.legsDumbbellYouTubeCodes);
                    break;
                case "Barbell":
                    youtubeCodes = res.getStringArray(R.array.legsBarbellYouTubeCodes);
                    break;
                case "Cable":
                    youtubeCodes = res.getStringArray(R.array.legsCableYouTubeCodes);
                    break;
                case "Machine":
                    youtubeCodes = res.getStringArray(R.array.legsMachineYouTubeCodes);
                    break;
                case "Body Weight":
                    youtubeCodes = res.getStringArray(R.array.legsBodyWeightYouTubeCodes);
                    break;
            }
            return youtubeCodes;
        }

        String[] getTextInstructions(Context context, String equipment) {
            String[] textInstructions = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    textInstructions = res.getStringArray(R.array.legsDumbbellTextInstructions);
                    break;
                case "Barbell":
                    textInstructions = res.getStringArray(R.array.legsBarbellTextInstructions);
                    break;
                case "Cable":
                    textInstructions = res.getStringArray(R.array.legsCableTextInstructions);
                    break;
                case "Machine":
                    textInstructions = res.getStringArray(R.array.legsMachineTextInstructions);
                    break;
                case "Body Weight":
                    textInstructions = res.getStringArray(R.array.legsBodyWeightTextInstructions);
                    break;
            }
            return textInstructions;
        }

    }

    static class Abdominals extends  Muscle {

        int[] getImages(String equipment) {
            int[] images = new int[0];
            switch (equipment) {
                case "Dumbbells":
                    images = new int[]{R.drawable.spell_caster_1, R.drawable.dumbbell_side_bend_1};
                    break;
                case "Barbell":
                    images = new int[]{R.drawable.barbell_landmine_1};
                    break;
                case "Cable":
                    images = new int[]{R.drawable.cable_crunch_1, R.drawable.cable_reverse_crunch_1, R.drawable.cable_lift_1};
                    break;
                case "Suspension Trainer":
                    images = new int[]{R.drawable.suspended_fallout_1, R.drawable.suspended_reverse_crunch_1};
                    break;
                case "Machine":
                    images = new int[]{R.drawable.ab_crunch_machine_1};
                    break;
                case "Body Weight":
                    images = new int[]{R.drawable.crunch_1, R.drawable.reverse_crunch_1, R.drawable.oblique_crunch_1, R.drawable.suitcase_crunch_1, R.drawable.plank_1, R.drawable.spider_crawl_1};
                    break;
            }
            return images;
        }

        int[] getImagesTwo(String equipment) {
            int[] imagesTwo = new int[0];
            switch (equipment) {
                case "Dumbbells":
                    imagesTwo = new int[]{R.drawable.spell_caster_2, R.drawable.dumbbell_side_bend_2};
                    break;
                case "Barbell":
                    imagesTwo = new int[]{R.drawable.barbell_landmine_2};
                    break;
                case "Cable":
                    imagesTwo = new int[]{R.drawable.cable_crunch_2, R.drawable.cable_reverse_crunch_2, R.drawable.cable_lift_2};
                    break;
                case "Suspension Trainer":
                    imagesTwo = new int[]{R.drawable.suspended_fallout_2, R.drawable.suspended_reverse_crunch_2};
                    break;
                case "Machine":
                    imagesTwo = new int[]{R.drawable.ab_crunch_machine_2};
                    break;
                case "Body Weight":
                    imagesTwo = new int[]{R.drawable.crunch_2, R.drawable.reverse_crunch_2, R.drawable.oblique_crunch_2, R.drawable.suitcase_crunch_2, R.drawable.plank_2, R.drawable.spider_crawl_2};
                    break;
            }
            return imagesTwo;
        }

        String[] getExerciseListTitles(Context context, String equipment) {
            String[] exerciseListTitles = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    exerciseListTitles = res.getStringArray(R.array.abdominalsDumbbellListTitles);
                    break;
                case "Barbell":
                    exerciseListTitles = res.getStringArray(R.array.abdominalsBarbellListTitles);
                    break;
                case "Cable":
                    exerciseListTitles = res.getStringArray(R.array.abdominalsCableListTitles);
                    break;
                case "Suspension Trainer":
                    exerciseListTitles = res.getStringArray(R.array.abdominalsSuspensionListTitles);
                    break;
                case "Machine":
                    exerciseListTitles = res.getStringArray(R.array.abdominalsMachineListTitles);
                    break;
                case "Body Weight":
                    exerciseListTitles = res.getStringArray(R.array.abdominalsBodyWeightListTitles);
                    break;
            }
            return exerciseListTitles;
        }

        String[] getExerciseTitles(Context context, String equipment) {
            String[] exerciseTitles = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    exerciseTitles = res.getStringArray(R.array.abdominalsDumbbellTitles);
                    break;
                case "Barbell":
                    exerciseTitles = res.getStringArray(R.array.abdominalsBarbellTitles);
                    break;
                case "Cable":
                    exerciseTitles = res.getStringArray(R.array.abdominalsCableTitles);
                    break;
                case "Suspension Trainer":
                    exerciseTitles = res.getStringArray(R.array.abdominalsSuspensionTitles);
                    break;
                case "Machine":
                    exerciseTitles = res.getStringArray(R.array.abdominalsMachineTitles);
                    break;
                case "Body Weight":
                    exerciseTitles = res.getStringArray(R.array.abdominalsBodyWeightTitles);
                    break;
            }
            return exerciseTitles;
        }

        String[] getDifficulties(Context context, String equipment) {
            String[] difficulties = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    difficulties = res.getStringArray(R.array.abdominalsDumbbellDifficulties);
                    break;
                case "Barbell":
                    difficulties = res.getStringArray(R.array.abdominalsBarbellDifficulties);
                    break;
                case "Cable":
                    difficulties = res.getStringArray(R.array.abdominalsCableDifficulties);
                    break;
                case "Suspension Trainer":
                    difficulties = res.getStringArray(R.array.abdominalsSuspensionDifficulties);
                    break;
                case "Machine":
                    difficulties = res.getStringArray(R.array.abdominalsMachineDifficulties);
                    break;
                case "Body Weight":
                    difficulties = res.getStringArray(R.array.abdominalsBodyWeightDifficulties);
                    break;
            }
            return difficulties;
        }

        String[] getYoutubeCodes(Context context, String equipment) {
            String[] youtubeCodes = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    youtubeCodes = res.getStringArray(R.array.abdominalsDumbbellYouTubeCodes);
                    break;
                case "Barbell":
                    youtubeCodes = res.getStringArray(R.array.abdominalsBarbellYouTubeCodes);
                    break;
                case "Cable":
                    youtubeCodes = res.getStringArray(R.array.abdominalsCableYouTubeCodes);
                    break;
                case "Suspension Trainer":
                    youtubeCodes = res.getStringArray(R.array.abdominalsSuspensionYouTubeCodes);
                    break;
                case "Machine":
                    youtubeCodes = res.getStringArray(R.array.abdominalsMachineYouTubeCodes);
                    break;
                case "Body Weight":
                    youtubeCodes = res.getStringArray(R.array.abdominalsBodyWeightYouTubeCodes);
                    break;
            }
            return youtubeCodes;
        }

        String[] getTextInstructions(Context context, String equipment) {
            String[] textInstructions = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    textInstructions = res.getStringArray(R.array.abdominalsDumbbellTextInstructions);
                    break;
                case "Barbell":
                    textInstructions = res.getStringArray(R.array.abdominalsBarbellTextInstructions);
                    break;
                case "Cable":
                    textInstructions = res.getStringArray(R.array.abdominalsCableTextInstructions);
                    break;
                case "Suspension Trainer":
                    textInstructions = res.getStringArray(R.array.abdominalsSuspensionTextInstructions);
                    break;
                case "Machine":
                    textInstructions = res.getStringArray(R.array.abdominalsMachineTextInstructions);
                    break;
                case "Body Weight":
                    textInstructions = res.getStringArray(R.array.abdominalsBodyWeightTextInstructions);
                    break;
            }
            return textInstructions;
        }
    }

    static class Triceps extends  Muscle {

        int[] getImages(String equipment) {
            int[] images = new int[0];
            switch (equipment) {
                case "Dumbbells":
                    images = new int[]{R.drawable.seated_tricep_extension_1, R.drawable.dumbbell_kickback_1, R.drawable.lying_tricep_extension_1};
                    break;
                case "Cable":
                    images = new int[]{R.drawable.cable_tricep_extension_1, R.drawable.cable_tricep_overhead_extension_1};
                    break;
                case "Machine":
                    images = new int[]{R.drawable.dip_machine_1, R.drawable.machine_tricep_extension_1};
                    break;
                case "Body Weight":
                    images = new int[]{R.drawable.tricep_dips_1, R.drawable.body_up_1};
                    break;
            }
            return images;
        }

        int[] getImagesTwo(String equipment) {
            int[] imagesTwo = new int[0];
            switch (equipment) {
                case "Dumbbells":
                    imagesTwo = new int[]{R.drawable.seated_tricep_extension_2, R.drawable.dumbbell_kickback_2, R.drawable.lying_tricep_extension_2};
                    break;
                case "Cable":
                    imagesTwo = new int[]{R.drawable.cable_tricep_extension_2, R.drawable.cable_tricep_overhead_extension_2};
                    break;
                case "Machine":
                    imagesTwo = new int[]{R.drawable.dip_machine_2, R.drawable.machine_tricep_extension_2};
                    break;
                case "Body Weight":
                    imagesTwo = new int[]{R.drawable.tricep_dips_2, R.drawable.body_up_2};
                    break;
            }
            return imagesTwo;
        }

        String[] getExerciseListTitles(Context context, String equipment) {
            String[] exerciseListTitles = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    exerciseListTitles = res.getStringArray(R.array.tricepsDumbbellListTitles);
                    break;
                case "Cable":
                    exerciseListTitles = res.getStringArray(R.array.tricepsCableListTitles);
                    break;
                case "Machine":
                    exerciseListTitles = res.getStringArray(R.array.tricepsMachineListTitles);
                    break;
                case "Body Weight":
                    exerciseListTitles = res.getStringArray(R.array.tricepsBodyWeightListTitles);
                    break;
            }
            return exerciseListTitles;
        }

        String[] getExerciseTitles(Context context, String equipment) {
            String[] exerciseTitles = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    exerciseTitles = res.getStringArray(R.array.tricepsDumbbellTitles);
                    break;
                case "Cable":
                    exerciseTitles = res.getStringArray(R.array.tricepsCableTitles);
                    break;
                case "Machine":
                    exerciseTitles = res.getStringArray(R.array.tricepsMachineTitles);
                    break;
                case "Body Weight":
                    exerciseTitles = res.getStringArray(R.array.tricepsBodyWeightTitles);
                    break;
            }
            return exerciseTitles;
        }

        String[] getDifficulties(Context context, String equipment) {
            String[] difficulties = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    difficulties = res.getStringArray(R.array.tricepsDumbbellDifficulties);
                    break;
                case "Cable":
                    difficulties = res.getStringArray(R.array.tricepsCableDifficulties);
                    break;
                case "Machine":
                    difficulties = res.getStringArray(R.array.tricepsMachineDifficulties);
                    break;
                case "Body Weight":
                    difficulties = res.getStringArray(R.array.tricepsBodyWeightDifficulties);
                    break;
            }
            return difficulties;
        }

        String[] getYoutubeCodes(Context context, String equipment) {
            String[] youtubeCodes = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    youtubeCodes = res.getStringArray(R.array.tricepsDumbbellYouTubeCodes);
                    break;
                case "Cable":
                    youtubeCodes = res.getStringArray(R.array.tricepsCableYouTubeCodes);
                    break;
                case "Machine":
                    youtubeCodes = res.getStringArray(R.array.tricepsMachineYouTubeCodes);
                    break;
                case "Body Weight":
                    youtubeCodes = res.getStringArray(R.array.tricepsBodyWeightYouTubeCodes);
                    break;
            }
            return youtubeCodes;
        }

        String[] getTextInstructions(Context context, String equipment) {
            String[] textInstructions = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    textInstructions = res.getStringArray(R.array.tricepsDumbbellTextInstructions);
                    break;
                case "Cable":
                    textInstructions = res.getStringArray(R.array.tricepsCableTextInstructions);
                    break;
                case "Machine":
                    textInstructions = res.getStringArray(R.array.tricepsMachineTextInstructions);
                    break;
                case "Body Weight":
                    textInstructions = res.getStringArray(R.array.tricepsBodyWeightTextInstructions);
                    break;
            }
            return textInstructions;
        }
    }

    static class Biceps extends  Muscle {

        int[] getImages(String equipment) {
            int[] images = new int[0];
            switch (equipment) {
                case "Dumbbells":
                    images = new int[]{R.drawable.bicep_curl_1, R.drawable.incline_dumbbell_curl_1, R.drawable.hammer_curl_1, R.drawable.incline_hammer_curl_1};
                    break;
                case "Cable":
                    images = new int[]{R.drawable.cable_curl_1, R.drawable.cable_hammer_curl_1, R.drawable.reverse_cable_curl_1, R.drawable.overhead_cable_curl_1};
                    break;
                case "Machine":
                    images = new int[]{R.drawable.machine_preacher_curls_1};
                    break;
            }
            return images;
        }

        int[] getImagesTwo(String equipment) {
            int[] imagesTwo = new int[0];
            switch (equipment) {
                case "Dumbbells":
                    imagesTwo = new int[]{R.drawable.bicep_curl_2, R.drawable.incline_dumbbell_curl_2, R.drawable.hammer_curl_2, R.drawable.incline_hammer_curl_2};
                    break;
                case "Cable":
                    imagesTwo = new int[]{R.drawable.cable_curl_2, R.drawable.cable_hammer_curl_2, R.drawable.reverse_cable_curl_2, R.drawable.overhead_cable_curl_2};
                    break;
                case "Machine":
                    imagesTwo = new int[] {R.drawable.machine_preacher_curls_2};
                    break;
            }
            return imagesTwo;
        }

        String[] getExerciseListTitles(Context context, String equipment) {
            String[] exerciseListTitles = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    exerciseListTitles = res.getStringArray(R.array.bicepsDumbbellListTitles);
                    break;
                case "Cable":
                    exerciseListTitles = res.getStringArray(R.array.bicepsCableListTitles);
                    break;
                case "Machine":
                    exerciseListTitles = res.getStringArray(R.array.bicepsMachineListTitles);
                    break;
            }
            return exerciseListTitles;
        }

        String[] getExerciseTitles(Context context, String equipment) {
            String[] exerciseTitles = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    exerciseTitles = res.getStringArray(R.array.bicepsDumbbellTitles);
                    break;
                case "Cable":
                    exerciseTitles = res.getStringArray(R.array.bicepsCableTitles);
                    break;
                case "Machine":
                    exerciseTitles = res.getStringArray(R.array.bicepsMachineTitles);
                    break;
            }
            return exerciseTitles;
        }

        String[] getDifficulties(Context context, String equipment) {
            String[] difficulties = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    difficulties = res.getStringArray(R.array.bicepsDumbbellDifficulties);
                    break;
                case "Cable":
                    difficulties = res.getStringArray(R.array.bicepsCableDifficulties);
                    break;
                case "Machine":
                    difficulties = res.getStringArray(R.array.bicepsMachineDifficulties);
                    break;
            }
            return difficulties;
        }

        String[] getYoutubeCodes(Context context, String equipment) {
            String[] youtubeCodes = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    youtubeCodes = res.getStringArray(R.array.bicepsDumbbellYouTubeCodes);
                    break;
                case "Cable":
                    youtubeCodes = res.getStringArray(R.array.bicepsCableYouTubeCodes);
                    break;
                case "Machine":
                    youtubeCodes = res.getStringArray(R.array.bicepsMachineYouTubeCodes);
                    break;
            }
            return youtubeCodes;
        }

        String[] getTextInstructions(Context context, String equipment) {
            String[] textInstructions = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    textInstructions = res.getStringArray(R.array.bicepsDumbbellTextInstructions);
                    break;
                case "Cable":
                    textInstructions = res.getStringArray(R.array.bicepsCableTextInstructions);
                    break;
                case "Machine":
                    textInstructions = res.getStringArray(R.array.bicepsMachineTextInstructions);
                    break;
            }
            return textInstructions;
        }

    }

    static class Shoulders extends  Muscle {

        int[] getImages(String equipment) {
            int[] images = new int[0];
            switch (equipment) {
                case "Dumbbells":
                    images = new int[]{R.drawable.dumbbell_shoulder_press_1, R.drawable.front_dumbbell_raise_1, R.drawable.side_dumbbell_raise_1, R.drawable.upright_dumbbell_row_1, R.drawable.dumbbell_shrug_1, R.drawable.reverse_dumbbell_fly_1};
                    break;
                case "Barbell":
                    images = new int[]{R.drawable.barbell_shoulder_press_1, R.drawable.barbell_shrug_1};
                    break;
                case "Cable":
                    images = new int[]{R.drawable.front_cable_raise_1, R.drawable.side_cable_raise_1, R.drawable.reverse_cable_fly_1, R.drawable.cable_shoulder_press_1, R.drawable.upright_cable_row_1, R.drawable.cable_shrug_1};
                    break;
                case "Suspension Trainer":
                    images = new int[]{R.drawable.reverse_suspension_fly_1};
                    break;
                case "Machine":
                    images = new int[]{R.drawable.leverage_shrug_1, R.drawable.leverage_shoulder_press_1, R.drawable.reverse_machine_fly_1};
                    break;
            }
            return images;
        }

        int[] getImagesTwo(String equipment) {
            int[] imagesTwo = new int[0];
            switch (equipment) {
                case "Dumbbells":
                    imagesTwo = new int[]{R.drawable.dumbbell_shoulder_press_2, R.drawable.front_dumbbell_raise_2, R.drawable.side_dumbbell_raise_2, R.drawable.upright_dumbbell_row_2, R.drawable.dumbbell_shrug_2, R.drawable.reverse_dumbbell_fly_2};
                    break;
                case "Barbell":
                    imagesTwo = new int[]{R.drawable.barbell_shoulder_press_2, R.drawable.barbell_shrug_2};
                    break;
                case "Cable":
                    imagesTwo = new int[]{R.drawable.front_cable_raise_2, R.drawable.side_cable_raise_2, R.drawable.reverse_cable_fly_2, R.drawable.cable_shoulder_press_2, R.drawable.upright_cable_row_2, R.drawable.cable_shrug_2};
                    break;
                case "Suspension Trainer":
                    imagesTwo = new int[]{R.drawable.reverse_suspension_fly_2};
                    break;
                case "Machine":
                    imagesTwo = new int[]{R.drawable.leverage_shrug_2, R.drawable.leverage_shoulder_press_2, R.drawable.reverse_machine_fly_2};
                    break;
            }
            return imagesTwo;
        }

        String[] getExerciseListTitles(Context context, String equipment) {
            String[] exerciseListTitles = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    exerciseListTitles = res.getStringArray(R.array.shouldersDumbbellListTitles);
                    break;
                case "Barbell":
                    exerciseListTitles = res.getStringArray(R.array.shouldersBarbellListTitles);
                    break;
                case "Cable":
                    exerciseListTitles = res.getStringArray(R.array.shouldersCableListTitles);
                    break;
                case "Suspension Trainer":
                    exerciseListTitles = res.getStringArray(R.array.shouldersSuspensionListTitles);
                    break;
                case "Machine":
                    exerciseListTitles = res.getStringArray(R.array.shouldersMachineListTitles);
                    break;
            }
            return exerciseListTitles;
        }

        String[] getExerciseTitles(Context context, String equipment) {
            String[] exerciseTitles = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    exerciseTitles = res.getStringArray(R.array.shouldersDumbbellTitles);
                    break;
                case "Barbell":
                    exerciseTitles = res.getStringArray(R.array.shouldersBarbellTitles);
                    break;
                case "Cable":
                    exerciseTitles = res.getStringArray(R.array.shouldersCableTitles);
                    break;
                case "Suspension Trainer":
                    exerciseTitles = res.getStringArray(R.array.shouldersSuspensionTitles);
                    break;
                case "Machine":
                    exerciseTitles = res.getStringArray(R.array.shouldersMachineTitles);
                    break;
            }
            return exerciseTitles;
        }

        String[] getDifficulties(Context context, String equipment) {
            String[] difficulties = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    difficulties = res.getStringArray(R.array.shouldersDumbbellDifficulties);
                    break;
                case "Barbell":
                    difficulties = res.getStringArray(R.array.shouldersBarbellDifficulties);
                    break;
                case "Cable":
                    difficulties = res.getStringArray(R.array.shouldersCableDifficulties);
                    break;
                case "Suspension Trainer":
                    difficulties = res.getStringArray(R.array.shouldersSuspensionDifficulties);
                    break;
                case "Machine":
                    difficulties = res.getStringArray(R.array.shouldersMachineDifficulties);
                    break;
            }
            return difficulties;
        }

        String[] getYoutubeCodes(Context context, String equipment) {
            String[] youtubeCodes = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    youtubeCodes = res.getStringArray(R.array.shouldersDumbbellYouTubeCodes);
                    break;
                case "Barbell":
                    youtubeCodes = res.getStringArray(R.array.shouldersBarbellYouTubeCodes);
                    break;
                case "Cable":
                    youtubeCodes = res.getStringArray(R.array.shouldersCableYouTubeCodes);
                    break;
                case "Suspension Trainer":
                    youtubeCodes = res.getStringArray(R.array.shouldersSuspensionYouTubeCodes);
                    break;
                case "Machine":
                    youtubeCodes = res.getStringArray(R.array.shouldersMachineYouTubeCodes);
                    break;
            }
            return youtubeCodes;
        }

        String[] getTextInstructions(Context context, String equipment) {
            String[] textInstructions = new String[0];
            Resources res = context.getResources();
            switch (equipment) {
                case "Dumbbells":
                    textInstructions = res.getStringArray(R.array.shouldersDumbbellTextInstructions);
                    break;
                case "Barbell":
                    textInstructions = res.getStringArray(R.array.shouldersBarbellTextInstructions);
                    break;
                case "Cable":
                    textInstructions = res.getStringArray(R.array.shouldersCableTextInstructions);
                    break;
                case "Suspension Trainer":
                    textInstructions = res.getStringArray(R.array.shouldersSuspensionTextInstructions);
                    break;
                case "Machine":
                    textInstructions = res.getStringArray(R.array.shouldersMachineTextInstructions);
                    break;
            }
            return textInstructions;
        }
    }


}
