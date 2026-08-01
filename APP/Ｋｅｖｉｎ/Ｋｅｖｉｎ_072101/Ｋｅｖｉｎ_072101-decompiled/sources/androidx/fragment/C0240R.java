package androidx.fragment;

/* JADX INFO: renamed from: androidx.fragment.R */
/* JADX INFO: loaded from: classes.dex */
public final class C0240R {

    /* JADX INFO: renamed from: androidx.fragment.R$anim */
    public static final class anim {
        public static int fragment_fast_out_extra_slow_in;

        static {
                r0 = 2130771992(0x7f010018, float:1.714709E38)
                androidx.fragment.C0240R.anim.fragment_fast_out_extra_slow_in = r0
                return
        }

        public anim() {
                r3 = this;
                r3.<init>()
                int r1 = kevin.fun.hook.audio.C1115.m98()
                r0 = 1616(0x650, float:2.264E-42)
            L9:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lf;
                    case 49: goto L12;
                    case 204: goto L17;
                    case 239: goto L26;
                    default: goto Le;
                }
            Le:
                goto L9
            Lf:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L9
            L12:
                if (r1 < 0) goto Lf
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L9
            L17:
                java.lang.String r0 = "zoL36N9LP"
                java.lang.String r0 = androidx.core.C1072.m925(r0)
                double r0 = java.lang.Double.parseDouble(r0)
                java.io.PrintStream r2 = java.lang.System.out
                r2.println(r0)
            L26:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.R$animator */
    public static final class animator {
        public static int fragment_close_enter;
        public static int fragment_close_exit;
        public static int fragment_fade_enter;
        public static int fragment_fade_exit;
        public static int fragment_open_enter;
        public static int fragment_open_exit;

        static {
                r0 = 2130837504(0x7f020000, float:1.7279964E38)
                androidx.fragment.C0240R.animator.fragment_close_enter = r0
                r0 = 2130837505(0x7f020001, float:1.7279966E38)
                androidx.fragment.C0240R.animator.fragment_close_exit = r0
                r0 = 2130837506(0x7f020002, float:1.7279968E38)
                androidx.fragment.C0240R.animator.fragment_fade_enter = r0
                r0 = 2130837507(0x7f020003, float:1.727997E38)
                androidx.fragment.C0240R.animator.fragment_fade_exit = r0
                r0 = 2130837508(0x7f020004, float:1.7279972E38)
                androidx.fragment.C0240R.animator.fragment_open_enter = r0
                r0 = 2130837509(0x7f020005, float:1.7279974E38)
                androidx.fragment.C0240R.animator.fragment_open_exit = r0
                return
        }

        public animator() {
                r2 = this;
                r2.<init>()
                int r1 = androidx.activity.C1063.m300()
                r0 = 1616(0x650, float:2.264E-42)
            L9:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lf;
                    case 49: goto L12;
                    case 204: goto L17;
                    case 239: goto L26;
                    default: goto Le;
                }
            Le:
                goto L9
            Lf:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L9
            L12:
                if (r1 > 0) goto Lf
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L9
            L17:
                java.lang.String r0 = "m4cCPVrZ4NcQErwzSP4T52oA2ZtKK"
                java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3639(r0)
                java.lang.Double r0 = java.lang.Double.valueOf(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L26:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.R$attr */
    public static final class attr {
        public static int alpha;
        public static int font;
        public static int fontProviderAuthority;
        public static int fontProviderCerts;
        public static int fontProviderFetchStrategy;
        public static int fontProviderFetchTimeout;
        public static int fontProviderPackage;
        public static int fontProviderQuery;
        public static int fontStyle;
        public static int fontVariationSettings;
        public static int fontWeight;
        public static int ttcIndex;

        static {
                r0 = 2130968617(0x7f040029, float:1.7545893E38)
                androidx.fragment.C0240R.attr.alpha = r0
                r0 = 2130968705(0x7f040081, float:1.7546071E38)
                androidx.fragment.C0240R.attr.font = r0
                r0 = 2130968707(0x7f040083, float:1.7546075E38)
                androidx.fragment.C0240R.attr.fontProviderAuthority = r0
                r0 = 2130968708(0x7f040084, float:1.7546077E38)
                androidx.fragment.C0240R.attr.fontProviderCerts = r0
                r0 = 2130968709(0x7f040085, float:1.754608E38)
                androidx.fragment.C0240R.attr.fontProviderFetchStrategy = r0
                r0 = 2130968710(0x7f040086, float:1.7546081E38)
                androidx.fragment.C0240R.attr.fontProviderFetchTimeout = r0
                r0 = 2130968711(0x7f040087, float:1.7546083E38)
                androidx.fragment.C0240R.attr.fontProviderPackage = r0
                r0 = 2130968712(0x7f040088, float:1.7546085E38)
                androidx.fragment.C0240R.attr.fontProviderQuery = r0
                r0 = 2130968714(0x7f04008a, float:1.754609E38)
                androidx.fragment.C0240R.attr.fontStyle = r0
                r0 = 2130968715(0x7f04008b, float:1.7546091E38)
                androidx.fragment.C0240R.attr.fontVariationSettings = r0
                r0 = 2130968716(0x7f04008c, float:1.7546093E38)
                androidx.fragment.C0240R.attr.fontWeight = r0
                r0 = 2130968852(0x7f040114, float:1.754637E38)
                androidx.fragment.C0240R.attr.ttcIndex = r0
                return
        }

        public attr() {
                r2 = this;
                r2.<init>()
                int r1 = androidx.activity.C1066.m518()
                r0 = 1616(0x650, float:2.264E-42)
            L9:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lf;
                    case 49: goto L12;
                    case 204: goto L17;
                    case 239: goto L26;
                    default: goto Le;
                }
            Le:
                goto L9
            Lf:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L9
            L12:
                if (r1 > 0) goto Lf
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L9
            L17:
                java.lang.String r0 = "w2N6jJsKIgMIbs"
                java.lang.String r0 = kevin.fun.hook.audio.C1114.m7912(r0)
                java.lang.Long r0 = java.lang.Long.decode(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L26:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.R$color */
    public static final class color {
        public static int notification_action_color_filter;
        public static int notification_icon_bg_color;
        public static int ripple_material_light;
        public static int secondary_text_default_material_light;

        static {
                r0 = 2131099713(0x7f060041, float:1.7811787E38)
                androidx.fragment.C0240R.color.notification_action_color_filter = r0
                r0 = 2131099714(0x7f060042, float:1.781179E38)
                androidx.fragment.C0240R.color.notification_icon_bg_color = r0
                r0 = 2131099724(0x7f06004c, float:1.781181E38)
                androidx.fragment.C0240R.color.ripple_material_light = r0
                r0 = 2131099726(0x7f06004e, float:1.7811813E38)
                androidx.fragment.C0240R.color.secondary_text_default_material_light = r0
                return
        }

        public color() {
                r2 = this;
                r2.<init>()
                int r1 = androidx.lifecycle.process.C1088.m2011()
                r0 = 1616(0x650, float:2.264E-42)
            L9:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lf;
                    case 49: goto L12;
                    case 204: goto L17;
                    case 239: goto L26;
                    default: goto Le;
                }
            Le:
                goto L9
            Lf:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L9
            L12:
                if (r1 < 0) goto Lf
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L9
            L17:
                java.lang.String r0 = "Ud09L7"
                java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8604(r0)
                java.lang.Long r0 = java.lang.Long.decode(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L26:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.R$dimen */
    public static final class dimen {
        public static int compat_button_inset_horizontal_material;
        public static int compat_button_inset_vertical_material;
        public static int compat_button_padding_horizontal_material;
        public static int compat_button_padding_vertical_material;
        public static int compat_control_corner_material;
        public static int compat_notification_large_icon_max_height;
        public static int compat_notification_large_icon_max_width;
        public static int notification_action_icon_size;
        public static int notification_action_text_size;
        public static int notification_big_circle_margin;
        public static int notification_content_margin_start;
        public static int notification_large_icon_height;
        public static int notification_large_icon_width;
        public static int notification_main_column_padding_top;
        public static int notification_media_narrow_margin;
        public static int notification_right_icon_size;
        public static int notification_right_side_padding_top;
        public static int notification_small_icon_background_padding;
        public static int notification_small_icon_size_as_large;
        public static int notification_subtext_size;
        public static int notification_top_pad;
        public static int notification_top_pad_large_text;

        static {
                r0 = 2131165265(0x7f070051, float:1.7944742E38)
                androidx.fragment.C0240R.dimen.compat_button_inset_horizontal_material = r0
                r0 = 2131165266(0x7f070052, float:1.7944744E38)
                androidx.fragment.C0240R.dimen.compat_button_inset_vertical_material = r0
                r0 = 2131165267(0x7f070053, float:1.7944746E38)
                androidx.fragment.C0240R.dimen.compat_button_padding_horizontal_material = r0
                r0 = 2131165268(0x7f070054, float:1.7944748E38)
                androidx.fragment.C0240R.dimen.compat_button_padding_vertical_material = r0
                r0 = 2131165269(0x7f070055, float:1.794475E38)
                androidx.fragment.C0240R.dimen.compat_control_corner_material = r0
                r0 = 2131165270(0x7f070056, float:1.7944752E38)
                androidx.fragment.C0240R.dimen.compat_notification_large_icon_max_height = r0
                r0 = 2131165271(0x7f070057, float:1.7944754E38)
                androidx.fragment.C0240R.dimen.compat_notification_large_icon_max_width = r0
                r0 = 2131165281(0x7f070061, float:1.7944775E38)
                androidx.fragment.C0240R.dimen.notification_action_icon_size = r0
                r0 = 2131165282(0x7f070062, float:1.7944777E38)
                androidx.fragment.C0240R.dimen.notification_action_text_size = r0
                r0 = 2131165283(0x7f070063, float:1.7944779E38)
                androidx.fragment.C0240R.dimen.notification_big_circle_margin = r0
                r0 = 2131165284(0x7f070064, float:1.794478E38)
                androidx.fragment.C0240R.dimen.notification_content_margin_start = r0
                r0 = 2131165285(0x7f070065, float:1.7944783E38)
                androidx.fragment.C0240R.dimen.notification_large_icon_height = r0
                r0 = 2131165286(0x7f070066, float:1.7944785E38)
                androidx.fragment.C0240R.dimen.notification_large_icon_width = r0
                r0 = 2131165287(0x7f070067, float:1.7944787E38)
                androidx.fragment.C0240R.dimen.notification_main_column_padding_top = r0
                r0 = 2131165288(0x7f070068, float:1.7944789E38)
                androidx.fragment.C0240R.dimen.notification_media_narrow_margin = r0
                r0 = 2131165289(0x7f070069, float:1.794479E38)
                androidx.fragment.C0240R.dimen.notification_right_icon_size = r0
                r0 = 2131165290(0x7f07006a, float:1.7944793E38)
                androidx.fragment.C0240R.dimen.notification_right_side_padding_top = r0
                r0 = 2131165291(0x7f07006b, float:1.7944795E38)
                androidx.fragment.C0240R.dimen.notification_small_icon_background_padding = r0
                r0 = 2131165292(0x7f07006c, float:1.7944797E38)
                androidx.fragment.C0240R.dimen.notification_small_icon_size_as_large = r0
                r0 = 2131165293(0x7f07006d, float:1.79448E38)
                androidx.fragment.C0240R.dimen.notification_subtext_size = r0
                r0 = 2131165294(0x7f07006e, float:1.7944801E38)
                androidx.fragment.C0240R.dimen.notification_top_pad = r0
                r0 = 2131165295(0x7f07006f, float:1.7944803E38)
                androidx.fragment.C0240R.dimen.notification_top_pad_large_text = r0
                return
        }

        public dimen() {
                r2 = this;
                r2.<init>()
                int r1 = androidx.interpolator.C1083.m1725()
                r0 = 1616(0x650, float:2.264E-42)
            L9:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lf;
                    case 49: goto L12;
                    case 204: goto L17;
                    case 239: goto L26;
                    default: goto Le;
                }
            Le:
                goto L9
            Lf:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L9
            L12:
                if (r1 < 0) goto Lf
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L9
            L17:
                java.lang.String r0 = "eC5mRDinseYNujZyuoVn3"
                java.lang.String r0 = androidx.appcompat.resources.C1068.m670(r0)
                java.lang.Double r0 = java.lang.Double.valueOf(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L26:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.R$drawable */
    public static final class drawable {
        public static int notification_action_background;
        public static int notification_bg;
        public static int notification_bg_low;
        public static int notification_bg_low_normal;
        public static int notification_bg_low_pressed;
        public static int notification_bg_normal;
        public static int notification_bg_normal_pressed;
        public static int notification_icon_background;
        public static int notification_template_icon_bg;
        public static int notification_template_icon_low_bg;
        public static int notification_tile_bg;
        public static int notify_panel_notification_icon_bg;

        static {
                r0 = 2131230826(0x7f08006a, float:1.8077716E38)
                androidx.fragment.C0240R.drawable.notification_action_background = r0
                r0 = 2131230827(0x7f08006b, float:1.8077718E38)
                androidx.fragment.C0240R.drawable.notification_bg = r0
                r0 = 2131230828(0x7f08006c, float:1.807772E38)
                androidx.fragment.C0240R.drawable.notification_bg_low = r0
                r0 = 2131230829(0x7f08006d, float:1.8077722E38)
                androidx.fragment.C0240R.drawable.notification_bg_low_normal = r0
                r0 = 2131230830(0x7f08006e, float:1.8077724E38)
                androidx.fragment.C0240R.drawable.notification_bg_low_pressed = r0
                r0 = 2131230831(0x7f08006f, float:1.8077726E38)
                androidx.fragment.C0240R.drawable.notification_bg_normal = r0
                r0 = 2131230832(0x7f080070, float:1.8077728E38)
                androidx.fragment.C0240R.drawable.notification_bg_normal_pressed = r0
                r0 = 2131230833(0x7f080071, float:1.807773E38)
                androidx.fragment.C0240R.drawable.notification_icon_background = r0
                r0 = 2131230835(0x7f080073, float:1.8077734E38)
                androidx.fragment.C0240R.drawable.notification_template_icon_bg = r0
                r0 = 2131230836(0x7f080074, float:1.8077736E38)
                androidx.fragment.C0240R.drawable.notification_template_icon_low_bg = r0
                r0 = 2131230837(0x7f080075, float:1.8077738E38)
                androidx.fragment.C0240R.drawable.notification_tile_bg = r0
                r0 = 2131230838(0x7f080076, float:1.807774E38)
                androidx.fragment.C0240R.drawable.notify_panel_notification_icon_bg = r0
                return
        }

        public drawable() {
                r2 = this;
                r2.<init>()
                int r1 = androidx.emoji2.C1080.m1539()
                r0 = 1616(0x650, float:2.264E-42)
            L9:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lf;
                    case 49: goto L12;
                    case 204: goto L17;
                    case 239: goto L26;
                    default: goto Le;
                }
            Le:
                goto L9
            Lf:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L9
            L12:
                if (r1 < 0) goto Lf
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L9
            L17:
                java.lang.String r0 = "YXQ6mb"
                java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8604(r0)
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L26:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.R$id */
    public static final class id {
        public static int accessibility_action_clickable_span;
        public static int accessibility_custom_action_0;
        public static int accessibility_custom_action_1;
        public static int accessibility_custom_action_10;
        public static int accessibility_custom_action_11;
        public static int accessibility_custom_action_12;
        public static int accessibility_custom_action_13;
        public static int accessibility_custom_action_14;
        public static int accessibility_custom_action_15;
        public static int accessibility_custom_action_16;
        public static int accessibility_custom_action_17;
        public static int accessibility_custom_action_18;
        public static int accessibility_custom_action_19;
        public static int accessibility_custom_action_2;
        public static int accessibility_custom_action_20;
        public static int accessibility_custom_action_21;
        public static int accessibility_custom_action_22;
        public static int accessibility_custom_action_23;
        public static int accessibility_custom_action_24;
        public static int accessibility_custom_action_25;
        public static int accessibility_custom_action_26;
        public static int accessibility_custom_action_27;
        public static int accessibility_custom_action_28;
        public static int accessibility_custom_action_29;
        public static int accessibility_custom_action_3;
        public static int accessibility_custom_action_30;
        public static int accessibility_custom_action_31;
        public static int accessibility_custom_action_4;
        public static int accessibility_custom_action_5;
        public static int accessibility_custom_action_6;
        public static int accessibility_custom_action_7;
        public static int accessibility_custom_action_8;
        public static int accessibility_custom_action_9;
        public static int action_container;
        public static int action_divider;
        public static int action_image;
        public static int action_text;
        public static int actions;
        public static int async;
        public static int blocking;
        public static int chronometer;
        public static int dialog_button;
        public static int forever;
        public static int fragment_container_view_tag;
        public static int icon;
        public static int icon_group;
        public static int info;
        public static int italic;
        public static int line1;
        public static int line3;
        public static int normal;
        public static int notification_background;
        public static int notification_main_column;
        public static int notification_main_column_container;
        public static int right_icon;
        public static int right_side;
        public static int special_effects_controller_view_tag;
        public static int tag_accessibility_actions;
        public static int tag_accessibility_clickable_spans;
        public static int tag_accessibility_heading;
        public static int tag_accessibility_pane_title;
        public static int tag_screen_reader_focusable;
        public static int tag_transition_group;
        public static int tag_unhandled_key_event_manager;
        public static int tag_unhandled_key_listeners;
        public static int text;
        public static int text2;
        public static int time;
        public static int title;
        public static int view_tree_lifecycle_owner;
        public static int view_tree_saved_state_registry_owner;
        public static int view_tree_view_model_store_owner;
        public static int visible_removing_fragment_view_tag;

        static {
                r0 = 2131296262(0x7f090006, float:1.8210436E38)
                androidx.fragment.C0240R.id.accessibility_action_clickable_span = r0
                r0 = 2131296263(0x7f090007, float:1.8210438E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_0 = r0
                r0 = 2131296264(0x7f090008, float:1.821044E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_1 = r0
                r0 = 2131296265(0x7f090009, float:1.8210442E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_10 = r0
                r0 = 2131296266(0x7f09000a, float:1.8210444E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_11 = r0
                r0 = 2131296267(0x7f09000b, float:1.8210446E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_12 = r0
                r0 = 2131296268(0x7f09000c, float:1.8210448E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_13 = r0
                r0 = 2131296269(0x7f09000d, float:1.821045E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_14 = r0
                r0 = 2131296270(0x7f09000e, float:1.8210452E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_15 = r0
                r0 = 2131296271(0x7f09000f, float:1.8210454E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_16 = r0
                r0 = 2131296272(0x7f090010, float:1.8210456E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_17 = r0
                r0 = 2131296273(0x7f090011, float:1.8210458E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_18 = r0
                r0 = 2131296274(0x7f090012, float:1.821046E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_19 = r0
                r0 = 2131296275(0x7f090013, float:1.8210462E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_2 = r0
                r0 = 2131296276(0x7f090014, float:1.8210464E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_20 = r0
                r0 = 2131296277(0x7f090015, float:1.8210466E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_21 = r0
                r0 = 2131296278(0x7f090016, float:1.8210468E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_22 = r0
                r0 = 2131296279(0x7f090017, float:1.821047E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_23 = r0
                r0 = 2131296280(0x7f090018, float:1.8210472E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_24 = r0
                r0 = 2131296281(0x7f090019, float:1.8210474E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_25 = r0
                r0 = 2131296282(0x7f09001a, float:1.8210476E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_26 = r0
                r0 = 2131296283(0x7f09001b, float:1.8210478E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_27 = r0
                r0 = 2131296284(0x7f09001c, float:1.821048E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_28 = r0
                r0 = 2131296285(0x7f09001d, float:1.8210482E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_29 = r0
                r0 = 2131296286(0x7f09001e, float:1.8210484E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_3 = r0
                r0 = 2131296287(0x7f09001f, float:1.8210486E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_30 = r0
                r0 = 2131296288(0x7f090020, float:1.8210488E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_31 = r0
                r0 = 2131296289(0x7f090021, float:1.821049E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_4 = r0
                r0 = 2131296290(0x7f090022, float:1.8210493E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_5 = r0
                r0 = 2131296291(0x7f090023, float:1.8210495E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_6 = r0
                r0 = 2131296292(0x7f090024, float:1.8210497E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_7 = r0
                r0 = 2131296293(0x7f090025, float:1.8210499E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_8 = r0
                r0 = 2131296294(0x7f090026, float:1.82105E38)
                androidx.fragment.C0240R.id.accessibility_custom_action_9 = r0
                r0 = 2131296302(0x7f09002e, float:1.8210517E38)
                androidx.fragment.C0240R.id.action_container = r0
                r0 = 2131296304(0x7f090030, float:1.821052E38)
                androidx.fragment.C0240R.id.action_divider = r0
                r0 = 2131296305(0x7f090031, float:1.8210523E38)
                androidx.fragment.C0240R.id.action_image = r0
                r0 = 2131296311(0x7f090037, float:1.8210535E38)
                androidx.fragment.C0240R.id.action_text = r0
                r0 = 2131296312(0x7f090038, float:1.8210537E38)
                androidx.fragment.C0240R.id.actions = r0
                r0 = 2131296317(0x7f09003d, float:1.8210547E38)
                androidx.fragment.C0240R.id.async = r0
                r0 = 2131296319(0x7f09003f, float:1.8210551E38)
                androidx.fragment.C0240R.id.blocking = r0
                r0 = 2131296325(0x7f090045, float:1.8210563E38)
                androidx.fragment.C0240R.id.chronometer = r0
                r0 = 2131296333(0x7f09004d, float:1.821058E38)
                androidx.fragment.C0240R.id.dialog_button = r0
                r0 = 2131296340(0x7f090054, float:1.8210594E38)
                androidx.fragment.C0240R.id.forever = r0
                r0 = 2131296341(0x7f090055, float:1.8210596E38)
                androidx.fragment.C0240R.id.fragment_container_view_tag = r0
                r0 = 2131296346(0x7f09005a, float:1.8210606E38)
                androidx.fragment.C0240R.id.icon = r0
                r0 = 2131296347(0x7f09005b, float:1.8210608E38)
                androidx.fragment.C0240R.id.icon_group = r0
                r0 = 2131296350(0x7f09005e, float:1.8210614E38)
                androidx.fragment.C0240R.id.info = r0
                r0 = 2131296351(0x7f09005f, float:1.8210616E38)
                androidx.fragment.C0240R.id.italic = r0
                r0 = 2131296352(0x7f090060, float:1.8210618E38)
                androidx.fragment.C0240R.id.line1 = r0
                r0 = 2131296353(0x7f090061, float:1.821062E38)
                androidx.fragment.C0240R.id.line3 = r0
                r0 = 2131296361(0x7f090069, float:1.8210637E38)
                androidx.fragment.C0240R.id.normal = r0
                r0 = 2131296362(0x7f09006a, float:1.8210639E38)
                androidx.fragment.C0240R.id.notification_background = r0
                r0 = 2131296363(0x7f09006b, float:1.821064E38)
                androidx.fragment.C0240R.id.notification_main_column = r0
                r0 = 2131296364(0x7f09006c, float:1.8210643E38)
                androidx.fragment.C0240R.id.notification_main_column_container = r0
                r0 = 2131296371(0x7f090073, float:1.8210657E38)
                androidx.fragment.C0240R.id.right_icon = r0
                r0 = 2131296372(0x7f090074, float:1.8210659E38)
                androidx.fragment.C0240R.id.right_side = r0
                r0 = 2131296393(0x7f090089, float:1.8210701E38)
                androidx.fragment.C0240R.id.special_effects_controller_view_tag = r0
                r0 = 2131296401(0x7f090091, float:1.8210718E38)
                androidx.fragment.C0240R.id.tag_accessibility_actions = r0
                r0 = 2131296402(0x7f090092, float:1.821072E38)
                androidx.fragment.C0240R.id.tag_accessibility_clickable_spans = r0
                r0 = 2131296403(0x7f090093, float:1.8210722E38)
                androidx.fragment.C0240R.id.tag_accessibility_heading = r0
                r0 = 2131296404(0x7f090094, float:1.8210724E38)
                androidx.fragment.C0240R.id.tag_accessibility_pane_title = r0
                r0 = 2131296408(0x7f090098, float:1.8210732E38)
                androidx.fragment.C0240R.id.tag_screen_reader_focusable = r0
                r0 = 2131296410(0x7f09009a, float:1.8210736E38)
                androidx.fragment.C0240R.id.tag_transition_group = r0
                r0 = 2131296411(0x7f09009b, float:1.8210738E38)
                androidx.fragment.C0240R.id.tag_unhandled_key_event_manager = r0
                r0 = 2131296412(0x7f09009c, float:1.821074E38)
                androidx.fragment.C0240R.id.tag_unhandled_key_listeners = r0
                r0 = 2131296414(0x7f09009e, float:1.8210744E38)
                androidx.fragment.C0240R.id.text = r0
                r0 = 2131296415(0x7f09009f, float:1.8210746E38)
                androidx.fragment.C0240R.id.text2 = r0
                r0 = 2131296418(0x7f0900a2, float:1.8210752E38)
                androidx.fragment.C0240R.id.time = r0
                r0 = 2131296419(0x7f0900a3, float:1.8210754E38)
                androidx.fragment.C0240R.id.title = r0
                r0 = 2131296428(0x7f0900ac, float:1.8210772E38)
                androidx.fragment.C0240R.id.view_tree_lifecycle_owner = r0
                r0 = 2131296430(0x7f0900ae, float:1.8210776E38)
                androidx.fragment.C0240R.id.view_tree_saved_state_registry_owner = r0
                r0 = 2131296431(0x7f0900af, float:1.8210778E38)
                androidx.fragment.C0240R.id.view_tree_view_model_store_owner = r0
                r0 = 2131296432(0x7f0900b0, float:1.821078E38)
                androidx.fragment.C0240R.id.visible_removing_fragment_view_tag = r0
                return
        }

        public id() {
                r2 = this;
                r2.<init>()
                int r1 = androidx.vectordrawable.C1105.m3314()
                r0 = 1616(0x650, float:2.264E-42)
            L9:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lf;
                    case 49: goto L12;
                    case 204: goto L17;
                    case 239: goto L26;
                    default: goto Le;
                }
            Le:
                goto L9
            Lf:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L9
            L12:
                if (r1 < 0) goto Lf
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L9
            L17:
                java.lang.String r0 = "67"
                java.lang.String r0 = androidx.core.C1073.m1027(r0)
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L26:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.R$integer */
    public static final class integer {
        public static int status_bar_notification_info_maxnum;

        static {
                r0 = 2131361796(0x7f0a0004, float:1.8343354E38)
                androidx.fragment.C0240R.integer.status_bar_notification_info_maxnum = r0
                return
        }

        public integer() {
                r2 = this;
                r2.<init>()
                int r1 = kevin.fun.hook.C1120.m8652()
                r0 = 1616(0x650, float:2.264E-42)
            L9:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lf;
                    case 49: goto L12;
                    case 204: goto L17;
                    case 239: goto L26;
                    default: goto Le;
                }
            Le:
                goto L9
            Lf:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L9
            L12:
                if (r1 < 0) goto Lf
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L9
            L17:
                java.lang.String r0 = "ZXW5FPo8ZpYdq9x5wT5f5"
                java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3639(r0)
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L26:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.R$layout */
    public static final class layout {
        public static int custom_dialog;
        public static int notification_action;
        public static int notification_action_tombstone;
        public static int notification_template_custom_big;
        public static int notification_template_icon_group;
        public static int notification_template_part_chronometer;
        public static int notification_template_part_time;

        static {
                r0 = 2131492892(0x7f0c001c, float:1.8609249E38)
                androidx.fragment.C0240R.layout.custom_dialog = r0
                r0 = 2131492896(0x7f0c0020, float:1.8609257E38)
                androidx.fragment.C0240R.layout.notification_action = r0
                r0 = 2131492897(0x7f0c0021, float:1.8609259E38)
                androidx.fragment.C0240R.layout.notification_action_tombstone = r0
                r0 = 2131492898(0x7f0c0022, float:1.860926E38)
                androidx.fragment.C0240R.layout.notification_template_custom_big = r0
                r0 = 2131492899(0x7f0c0023, float:1.8609263E38)
                androidx.fragment.C0240R.layout.notification_template_icon_group = r0
                r0 = 2131492900(0x7f0c0024, float:1.8609265E38)
                androidx.fragment.C0240R.layout.notification_template_part_chronometer = r0
                r0 = 2131492901(0x7f0c0025, float:1.8609267E38)
                androidx.fragment.C0240R.layout.notification_template_part_time = r0
                return
        }

        public layout() {
                r2 = this;
                r2.<init>()
                int r1 = androidx.core.ktx.C1071.m854()
                r0 = 1616(0x650, float:2.264E-42)
            L9:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lf;
                    case 49: goto L12;
                    case 204: goto L17;
                    case 239: goto L26;
                    default: goto Le;
                }
            Le:
                goto L9
            Lf:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L9
            L12:
                if (r1 > 0) goto Lf
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L9
            L17:
                java.lang.String r0 = "ftt2QzkTwc08Hz6o"
                java.lang.String r0 = androidx.activity.C1064.m367(r0)
                java.lang.Long r0 = java.lang.Long.decode(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L26:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.R$string */
    public static final class string {
        public static int status_bar_notification_info_overflow;

        static {
                r0 = 2131558437(0x7f0d0025, float:1.874219E38)
                androidx.fragment.C0240R.string.status_bar_notification_info_overflow = r0
                return
        }

        public string() {
                r3 = this;
                r3.<init>()
                int r1 = kevin.fun.hook.audio.C1116.m8064()
                r0 = 1616(0x650, float:2.264E-42)
            L9:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lf;
                    case 49: goto L12;
                    case 204: goto L17;
                    case 239: goto L26;
                    default: goto Le;
                }
            Le:
                goto L9
            Lf:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L9
            L12:
                if (r1 < 0) goto Lf
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L9
            L17:
                java.lang.String r0 = "ZS9XbiMcLUqCjzJ"
                java.lang.String r0 = androidx.lifecycle.viewmodel.C1093.m2376(r0)
                double r0 = java.lang.Double.parseDouble(r0)
                java.io.PrintStream r2 = java.lang.System.out
                r2.println(r0)
            L26:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.R$style */
    public static final class style {
        public static int TextAppearance_Compat_Notification;
        public static int TextAppearance_Compat_Notification_Info;
        public static int TextAppearance_Compat_Notification_Line2;
        public static int TextAppearance_Compat_Notification_Time;
        public static int TextAppearance_Compat_Notification_Title;
        public static int Widget_Compat_NotificationActionContainer;
        public static int Widget_Compat_NotificationActionText;

        static {
                r0 = 2131624174(0x7f0e00ee, float:1.887552E38)
                androidx.fragment.C0240R.style.TextAppearance_Compat_Notification = r0
                r0 = 2131624175(0x7f0e00ef, float:1.8875522E38)
                androidx.fragment.C0240R.style.TextAppearance_Compat_Notification_Info = r0
                r0 = 2131624176(0x7f0e00f0, float:1.8875524E38)
                androidx.fragment.C0240R.style.TextAppearance_Compat_Notification_Line2 = r0
                r0 = 2131624177(0x7f0e00f1, float:1.8875526E38)
                androidx.fragment.C0240R.style.TextAppearance_Compat_Notification_Time = r0
                r0 = 2131624178(0x7f0e00f2, float:1.8875528E38)
                androidx.fragment.C0240R.style.TextAppearance_Compat_Notification_Title = r0
                r0 = 2131624286(0x7f0e015e, float:1.8875747E38)
                androidx.fragment.C0240R.style.Widget_Compat_NotificationActionContainer = r0
                r0 = 2131624287(0x7f0e015f, float:1.887575E38)
                androidx.fragment.C0240R.style.Widget_Compat_NotificationActionText = r0
                return
        }

        public style() {
                r2 = this;
                r2.<init>()
                int r1 = org.luckypray.dexkit.C1125.m10627()
                r0 = 1616(0x650, float:2.264E-42)
            L9:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lf;
                    case 49: goto L12;
                    case 204: goto L17;
                    case 239: goto L26;
                    default: goto Le;
                }
            Le:
                goto L9
            Lf:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L9
            L12:
                if (r1 < 0) goto Lf
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L9
            L17:
                java.lang.String r0 = "pXhZXPdhkKxhfJA"
                java.lang.String r0 = androidx.activity.C1066.m487(r0)
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L26:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.R$styleable */
    public static final class styleable {
        public static int[] ColorStateListItem;
        public static int ColorStateListItem_alpha;
        public static int ColorStateListItem_android_alpha;
        public static int ColorStateListItem_android_color;
        public static int[] FontFamily;
        public static int[] FontFamilyFont;
        public static int FontFamilyFont_android_font;
        public static int FontFamilyFont_android_fontStyle;
        public static int FontFamilyFont_android_fontVariationSettings;
        public static int FontFamilyFont_android_fontWeight;
        public static int FontFamilyFont_android_ttcIndex;
        public static int FontFamilyFont_font;
        public static int FontFamilyFont_fontStyle;
        public static int FontFamilyFont_fontVariationSettings;
        public static int FontFamilyFont_fontWeight;
        public static int FontFamilyFont_ttcIndex;
        public static int FontFamily_fontProviderAuthority;
        public static int FontFamily_fontProviderCerts;
        public static int FontFamily_fontProviderFetchStrategy;
        public static int FontFamily_fontProviderFetchTimeout;
        public static int FontFamily_fontProviderPackage;
        public static int FontFamily_fontProviderQuery;
        public static int[] Fragment;
        public static int[] FragmentContainerView;
        public static int FragmentContainerView_android_name;
        public static int FragmentContainerView_android_tag;
        public static int Fragment_android_id;
        public static int Fragment_android_name;
        public static int Fragment_android_tag;
        public static int[] GradientColor;
        public static int[] GradientColorItem;
        public static int GradientColorItem_android_color;
        public static int GradientColorItem_android_offset;
        public static int GradientColor_android_centerColor;
        public static int GradientColor_android_centerX;
        public static int GradientColor_android_centerY;
        public static int GradientColor_android_endColor;
        public static int GradientColor_android_endX;
        public static int GradientColor_android_endY;
        public static int GradientColor_android_gradientRadius;
        public static int GradientColor_android_startColor;
        public static int GradientColor_android_startX;
        public static int GradientColor_android_startY;
        public static int GradientColor_android_tileMode;
        public static int GradientColor_android_type;

        static {
                r7 = 5
                r6 = 3
                r5 = 2
                r4 = 1
                r3 = 0
                int[] r0 = new int[r7]
                int r1 = androidx.vectordrawable.C1105.f131
                r1 = r1 ^ 358(0x166, float:5.02E-43)
                r2 = 16843173(0x10101a5, float:2.3694738E-38)
                r0[r1] = r2
                int r1 = androidx.loader.C1097.f123
                r1 = r1 ^ 115(0x73, float:1.61E-43)
                r2 = 16843551(0x101031f, float:2.3695797E-38)
                r0[r1] = r2
                int r1 = androidx.loader.C1099.f125
                r1 = r1 ^ 857(0x359, float:1.201E-42)
                r2 = 16844359(0x1010647, float:2.3698062E-38)
                r0[r1] = r2
                int r1 = androidx.activity.C1063.f89
                r1 = r1 ^ 1
                r2 = 2130968617(0x7f040029, float:1.7545893E38)
                r0[r1] = r2
                int r1 = androidx.drawerlayout.C1077.f103
                r1 = r1 ^ 282(0x11a, float:3.95E-43)
                r2 = 2130968732(0x7f04009c, float:1.7546126E38)
                r0[r1] = r2
                androidx.fragment.C0240R.styleable.ColorStateListItem = r0
                androidx.fragment.C0240R.styleable.ColorStateListItem_alpha = r6
                androidx.fragment.C0240R.styleable.ColorStateListItem_android_alpha = r4
                androidx.fragment.C0240R.styleable.ColorStateListItem_android_color = r3
                r0 = 7
                int[] r0 = new int[r0]
                r0 = {x00fc: FILL_ARRAY_DATA , data: [2130968707, 2130968708, 2130968709, 2130968710, 2130968711, 2130968712, 2130968713} // fill-array
                androidx.fragment.C0240R.styleable.FontFamily = r0
                r0 = 10
                int[] r0 = new int[r0]
                r0 = {x010e: FILL_ARRAY_DATA , data: [16844082, 16844083, 16844095, 16844143, 16844144, 2130968705, 2130968714, 2130968715, 2130968716, 2130968852} // fill-array
                androidx.fragment.C0240R.styleable.FontFamilyFont = r0
                androidx.fragment.C0240R.styleable.FontFamilyFont_android_font = r3
                androidx.fragment.C0240R.styleable.FontFamilyFont_android_fontStyle = r5
                r0 = 4
                androidx.fragment.C0240R.styleable.FontFamilyFont_android_fontVariationSettings = r0
                androidx.fragment.C0240R.styleable.FontFamilyFont_android_fontWeight = r4
                androidx.fragment.C0240R.styleable.FontFamilyFont_android_ttcIndex = r6
                androidx.fragment.C0240R.styleable.FontFamilyFont_font = r7
                r0 = 6
                androidx.fragment.C0240R.styleable.FontFamilyFont_fontStyle = r0
                r0 = 7
                androidx.fragment.C0240R.styleable.FontFamilyFont_fontVariationSettings = r0
                r0 = 8
                androidx.fragment.C0240R.styleable.FontFamilyFont_fontWeight = r0
                r0 = 9
                androidx.fragment.C0240R.styleable.FontFamilyFont_ttcIndex = r0
                androidx.fragment.C0240R.styleable.FontFamily_fontProviderAuthority = r3
                androidx.fragment.C0240R.styleable.FontFamily_fontProviderCerts = r4
                androidx.fragment.C0240R.styleable.FontFamily_fontProviderFetchStrategy = r5
                androidx.fragment.C0240R.styleable.FontFamily_fontProviderFetchTimeout = r6
                r0 = 4
                androidx.fragment.C0240R.styleable.FontFamily_fontProviderPackage = r0
                androidx.fragment.C0240R.styleable.FontFamily_fontProviderQuery = r7
                int[] r0 = new int[r6]
                int r1 = androidx.lifecycle.viewmodel.C1093.f119
                r1 = r1 ^ (-118(0xffffffffffffff8a, float:NaN))
                r2 = 16842755(0x1010003, float:2.3693566E-38)
                r0[r1] = r2
                int r1 = kevin.fun.hook.audio.C1115.f404
                r1 = r1 ^ 803(0x323, float:1.125E-42)
                r2 = 16842960(0x10100d0, float:2.369414E-38)
                r0[r1] = r2
                int r1 = kevin.fun.hook.audio.C1116.f405
                r1 = r1 ^ 80
                r2 = 16842961(0x10100d1, float:2.3694144E-38)
                r0[r1] = r2
                androidx.fragment.C0240R.styleable.Fragment = r0
                int[] r0 = new int[r5]
                int r1 = androidx.loader.C1096.f122
                r1 = r1 ^ (-959(0xfffffffffffffc41, float:NaN))
                r2 = 16842755(0x1010003, float:2.3693566E-38)
                r0[r1] = r2
                int r1 = androidx.customview.C1074.f100
                r1 = r1 ^ 242(0xf2, float:3.39E-43)
                r2 = 16842961(0x10100d1, float:2.3694144E-38)
                r0[r1] = r2
                androidx.fragment.C0240R.styleable.FragmentContainerView = r0
                androidx.fragment.C0240R.styleable.FragmentContainerView_android_name = r3
                androidx.fragment.C0240R.styleable.FragmentContainerView_android_tag = r4
                androidx.fragment.C0240R.styleable.Fragment_android_id = r4
                androidx.fragment.C0240R.styleable.Fragment_android_name = r3
                androidx.fragment.C0240R.styleable.Fragment_android_tag = r5
                r0 = 12
                int[] r0 = new int[r0]
                r0 = {x0126: FILL_ARRAY_DATA , data: [16843165, 16843166, 16843169, 16843170, 16843171, 16843172, 16843265, 16843275, 16844048, 16844049, 16844050, 16844051} // fill-array
                androidx.fragment.C0240R.styleable.GradientColor = r0
                int[] r0 = new int[r5]
                int r1 = androidx.lifecycle.process.C1089.f115
                r1 = r1 ^ 928(0x3a0, float:1.3E-42)
                r2 = 16843173(0x10101a5, float:2.3694738E-38)
                r0[r1] = r2
                int r1 = androidx.appcompat.resources.C1068.f94
                r1 = r1 ^ 527(0x20f, float:7.38E-43)
                r2 = 16844052(0x1010514, float:2.36972E-38)
                r0[r1] = r2
                androidx.fragment.C0240R.styleable.GradientColorItem = r0
                androidx.fragment.C0240R.styleable.GradientColorItem_android_color = r3
                androidx.fragment.C0240R.styleable.GradientColorItem_android_offset = r4
                r0 = 7
                androidx.fragment.C0240R.styleable.GradientColor_android_centerColor = r0
                androidx.fragment.C0240R.styleable.GradientColor_android_centerX = r6
                r0 = 4
                androidx.fragment.C0240R.styleable.GradientColor_android_centerY = r0
                androidx.fragment.C0240R.styleable.GradientColor_android_endColor = r4
                r0 = 10
                androidx.fragment.C0240R.styleable.GradientColor_android_endX = r0
                r0 = 11
                androidx.fragment.C0240R.styleable.GradientColor_android_endY = r0
                androidx.fragment.C0240R.styleable.GradientColor_android_gradientRadius = r7
                androidx.fragment.C0240R.styleable.GradientColor_android_startColor = r3
                r0 = 8
                androidx.fragment.C0240R.styleable.GradientColor_android_startX = r0
                r0 = 9
                androidx.fragment.C0240R.styleable.GradientColor_android_startY = r0
                r0 = 6
                androidx.fragment.C0240R.styleable.GradientColor_android_tileMode = r0
                androidx.fragment.C0240R.styleable.GradientColor_android_type = r5
                return
        }

        public styleable() {
                r2 = this;
                r2.<init>()
                int r1 = androidx.loader.C1096.m2651()
                r0 = 1616(0x650, float:2.264E-42)
            L9:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lf;
                    case 49: goto L12;
                    case 204: goto L17;
                    case 239: goto L26;
                    default: goto Le;
                }
            Le:
                goto L9
            Lf:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L9
            L12:
                if (r1 < 0) goto Lf
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L9
            L17:
                java.lang.String r0 = "ccAxLLadNaK3pMYgENX"
                java.lang.String r0 = androidx.lifecycle.process.C1087.m1957(r0)
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L26:
                return
        }
    }

    static {
            return
    }

    public C0240R() {
            r2 = this;
            r2.<init>()
            int r1 = androidx.emoji2.C1080.m1539()
            r0 = 1616(0x650, float:2.264E-42)
        L9:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lf;
                case 49: goto L12;
                case 204: goto L17;
                case 239: goto L26;
                default: goto Le;
            }
        Le:
            goto L9
        Lf:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L9
        L12:
            if (r1 < 0) goto Lf
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L9
        L17:
            java.lang.String r0 = "2vPqehXNCE7rkshJQ8FlMAnL71dk"
            java.lang.String r0 = org.luckypray.dexkit.C1123.m10497(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L26:
            return
    }
}
