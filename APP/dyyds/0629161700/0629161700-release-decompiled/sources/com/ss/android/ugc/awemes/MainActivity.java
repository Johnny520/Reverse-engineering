package com.ss.android.ugc.awemes;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends android.app.Activity implements defpackage.InterfaceC1221 {

    @java.lang.Deprecated
    public static final int APP_ITEM_OFFSET = 2;
    private static final defpackage.C1391 Companion = null;

    @java.lang.Deprecated
    public static final int FRAMEWORK_STATUS_POSITION = 0;

    @java.lang.Deprecated
    public static final int LAUNCHER_ICON_POSITION = 1;

    @java.lang.Deprecated
    public static final int VIEW_TYPE_APP = 3;

    @java.lang.Deprecated
    public static final int VIEW_TYPE_FRAMEWORK_STATUS = 0;

    @java.lang.Deprecated
    public static final int VIEW_TYPE_LAUNCHER_ICON = 1;

    @java.lang.Deprecated
    public static final int VIEW_TYPE_MESSAGE = 2;
    private final com.ss.android.ugc.awemes.MainActivity.AdaptedAppAdapter adapter;
    private defpackage.C1851 currentXposedService;
    private android.widget.TextView frameworkBadgeText;
    private android.widget.TextView frameworkDetailText;
    private android.widget.TextView frameworkStatusText;
    private final defpackage.InterfaceC0277 launcherAliasComponent$delegate;
    private android.widget.TextView launcherIconStatusText;
    private android.widget.Switch launcherIconSwitch;
    private defpackage.C0055 recyclerView;
    private boolean refreshingLauncherIconSwitch;
    private android.widget.LinearLayout root;
    private java.util.List<defpackage.C1226> runningTargets;

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public final class AdaptedAppAdapter extends defpackage.AbstractC1191 {
        private final java.util.List<com.ss.android.ugc.awemes.MainActivity.InstalledAdaptedApp> apps;
        private java.lang.String message;
        final /* synthetic */ com.ss.android.ugc.awemes.MainActivity this$0;

        public AdaptedAppAdapter(com.ss.android.ugc.awemes.MainActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.apps = r1
                return
        }

        private final android.view.View createAppCard(android.view.ViewGroup r6) {
                r5 = this;
                android.widget.LinearLayout r0 = new android.widget.LinearLayout
                android.content.Context r6 = r6.getContext()
                r0.<init>(r6)
                com.ss.android.ugc.awemes.MainActivity r5 = r5.this$0
                r6 = 1
                r0.setOrientation(r6)
                r1 = 14
                int r2 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r5, r1)
                r0.setPadding(r2, r2, r2, r2)
                r2 = -982413924015662(0xfffc827fef0961d2, double:NaN)
                java.lang.String r2 = "#FFFFFF"
                int r2 = com.ss.android.ugc.awemes.MainActivity.access$color(r5, r2)
                float r1 = com.ss.android.ugc.awemes.MainActivity.access$getDpFloat(r5, r1)
                r3 = -982448283754030(0xfffc8277ef0961d2, double:NaN)
                java.lang.String r3 = "#F0F1F3"
                int r3 = com.ss.android.ugc.awemes.MainActivity.access$color(r5, r3)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                int r4 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r5, r6)
                android.graphics.drawable.GradientDrawable r1 = com.ss.android.ugc.awemes.MainActivity.access$roundRect(r5, r2, r1, r3, r4)
                r0.setBackground(r1)
                float r6 = com.ss.android.ugc.awemes.MainActivity.access$getDpFloat(r5, r6)
                r0.setElevation(r6)
                ᛵᛲᲁᛴ r6 = new ᛵᛲᲁᛴ
                r1 = -1
                r2 = -2
                r6.<init>(r1, r2)
                r1 = 10
                int r5 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r5, r1)
                r6.bottomMargin = r5
                r0.setLayoutParams(r6)
                return r0
        }

        private final android.widget.TextView createMessageView(android.view.ViewGroup r5) {
                r4 = this;
                android.widget.TextView r0 = new android.widget.TextView
                android.content.Context r5 = r5.getContext()
                r0.<init>(r5)
                com.ss.android.ugc.awemes.MainActivity r4 = r4.this$0
                r5 = 17
                r0.setGravity(r5)
                r5 = 1097859072(0x41700000, float:15.0)
                r0.setTextSize(r5)
                r1 = -982379564277294(0xfffc8287ef0961d2, double:NaN)
                java.lang.String r5 = "#86909C"
                int r5 = com.ss.android.ugc.awemes.MainActivity.access$color(r4, r5)
                r0.setTextColor(r5)
                r5 = 16
                int r1 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r4, r5)
                r2 = 48
                int r3 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r4, r2)
                int r5 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r4, r5)
                int r2 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r4, r2)
                r0.setPadding(r1, r3, r5, r2)
                ᛵᛲᲁᛴ r5 = new ᛵᛲᲁᛴ
                r1 = -1
                r2 = -2
                r5.<init>(r1, r2)
                r1 = 10
                int r4 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r4, r1)
                r5.bottomMargin = r4
                r0.setLayoutParams(r5)
                return r0
        }

        @Override // defpackage.AbstractC1191
        public int getItemCount() {
                r2 = this;
                java.util.List<com.ss.android.ugc.awemes.MainActivity$InstalledAdaptedApp> r0 = r2.apps
                int r0 = r0.size()
                int r0 = r0 + 2
                java.util.List<com.ss.android.ugc.awemes.MainActivity$InstalledAdaptedApp> r1 = r2.apps
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L16
                java.lang.String r2 = r2.message
                if (r2 == 0) goto L16
                r2 = 1
                goto L17
            L16:
                r2 = 0
            L17:
                int r0 = r0 + r2
                return r0
        }

        @Override // defpackage.AbstractC1191
        public int getItemViewType(int r2) {
                r1 = this;
                if (r2 != 0) goto L4
                r1 = 0
                return r1
            L4:
                r0 = 1
                if (r2 != r0) goto L8
                return r0
            L8:
                java.util.List<com.ss.android.ugc.awemes.MainActivity$InstalledAdaptedApp> r2 = r1.apps
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L16
                java.lang.String r1 = r1.message
                if (r1 == 0) goto L16
                r1 = 2
                return r1
            L16:
                r1 = 3
                return r1
        }

        @Override // defpackage.AbstractC1191
        public void onBindViewHolder(defpackage.AbstractC2316 r24, int r25) {
                r23 = this;
                r0 = r23
                r1 = r24
                r2 = -982345204538926(0xfffc828fef0961d2, double:NaN)
                boolean r2 = r1 instanceof com.ss.android.ugc.awemes.C0015
                if (r2 == 0) goto L1b
                r0 = r1
                com.ss.android.ugc.awemes.ᲇᛶᛵᲇ r0 = (com.ss.android.ugc.awemes.C0015) r0
                com.ss.android.ugc.awemes.MainActivity$AdaptedAppAdapter r0 = r0.f447
                com.ss.android.ugc.awemes.MainActivity r0 = r0.this$0
                com.ss.android.ugc.awemes.MainActivity.access$updateFrameworkStatusCard(r0)
                return
            L1b:
                boolean r2 = r1 instanceof com.ss.android.ugc.awemes.C0013
                if (r2 == 0) goto L2a
                r0 = r1
                com.ss.android.ugc.awemes.ᛷᛸᛵᲇ r0 = (com.ss.android.ugc.awemes.C0013) r0
                com.ss.android.ugc.awemes.MainActivity$AdaptedAppAdapter r0 = r0.f444
                com.ss.android.ugc.awemes.MainActivity r0 = r0.this$0
                com.ss.android.ugc.awemes.MainActivity.access$updateLauncherIconCard(r0)
                return
            L2a:
                boolean r2 = r1 instanceof com.ss.android.ugc.awemes.C0012
                if (r2 == 0) goto L4b
                com.ss.android.ugc.awemes.ᛷᛲᲇᲈ r1 = (com.ss.android.ugc.awemes.C0012) r1
                java.lang.String r0 = r0.message
                if (r0 != 0) goto L3d
                r2 = -982375269309998(0xfffc8288ef0961d2, double:NaN)
                java.lang.String r0 = ""
            L3d:
                r2 = -932399029853742(0xfffcaffcef0961d2, double:NaN)
                android.widget.TextView r1 = r1.f443
                r1.setText(r0)
                return
            L4b:
                boolean r2 = r1 instanceof com.ss.android.ugc.awemes.C0014
                if (r2 == 0) goto L440
                com.ss.android.ugc.awemes.ᛷᲁᛳᛳ r1 = (com.ss.android.ugc.awemes.C0014) r1
                java.util.List<com.ss.android.ugc.awemes.MainActivity$InstalledAdaptedApp> r0 = r0.apps
                r2 = 2
                int r3 = r25 + (-2)
                java.lang.Object r0 = r0.get(r3)
                com.ss.android.ugc.awemes.MainActivity$InstalledAdaptedApp r0 = (com.ss.android.ugc.awemes.MainActivity.InstalledAdaptedApp) r0
                r3 = -170733824548398(0xffff64b7ef0961d2, double:NaN)
                android.widget.LinearLayout r3 = r1.f445
                r3.removeAllViews()
                android.widget.LinearLayout r4 = new android.widget.LinearLayout
                android.content.Context r5 = r3.getContext()
                r4.<init>(r5)
                r5 = 0
                r4.setOrientation(r5)
                r6 = 16
                r4.setGravity(r6)
                android.widget.ImageView r7 = new android.widget.ImageView
                android.content.Context r8 = r3.getContext()
                r7.<init>(r8)
                com.ss.android.ugc.awemes.MainActivity$AdaptedAppAdapter r1 = r1.f446
                com.ss.android.ugc.awemes.MainActivity r8 = r1.this$0
                android.graphics.drawable.Drawable r9 = r0.getIcon()
                r7.setImageDrawable(r9)
                android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
                r10 = 48
                int r11 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r8, r10)
                int r8 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r8, r10)
                r9.<init>(r11, r8)
                r7.setLayoutParams(r9)
                r4.addView(r7)
                android.widget.LinearLayout r7 = new android.widget.LinearLayout
                android.content.Context r8 = r3.getContext()
                r7.<init>(r8)
                com.ss.android.ugc.awemes.MainActivity r8 = r1.this$0
                r9 = 1
                r7.setOrientation(r9)
                android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
                r11 = -2
                r12 = 1065353216(0x3f800000, float:1.0)
                r10.<init>(r5, r11, r12)
                r13 = 12
                int r8 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r8, r13)
                r10.leftMargin = r8
                r7.setLayoutParams(r10)
                android.widget.TextView r8 = new android.widget.TextView
                android.content.Context r10 = r3.getContext()
                r8.<init>(r10)
                com.ss.android.ugc.awemes.MainActivity r10 = r1.this$0
                java.lang.String r14 = r0.getLabel()
                r8.setText(r14)
                r14 = 1099431936(0x41880000, float:17.0)
                r8.setTextSize(r14)
                android.graphics.Typeface r14 = android.graphics.Typeface.DEFAULT_BOLD
                r8.setTypeface(r14)
                r15 = -170751004417582(0xffff64b3ef0961d2, double:NaN)
                java.lang.String r15 = "#1F2329"
                int r10 = com.ss.android.ugc.awemes.MainActivity.access$color(r10, r15)
                r8.setTextColor(r10)
                r8.setMaxLines(r9)
                r7.addView(r8)
                android.widget.TextView r8 = new android.widget.TextView
                android.content.Context r10 = r3.getContext()
                r8.<init>(r10)
                com.ss.android.ugc.awemes.MainActivity r10 = r1.this$0
                java.lang.String r15 = r0.getPackageName()
                r8.setText(r15)
                r15 = 1094713344(0x41400000, float:12.0)
                r8.setTextSize(r15)
                r16 = -170785364155950(0xffff64abef0961d2, double:NaN)
                java.lang.String r11 = "#86909C"
                int r11 = com.ss.android.ugc.awemes.MainActivity.access$color(r10, r11)
                r8.setTextColor(r11)
                r11 = 3
                int r10 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r10, r11)
                r8.setPadding(r5, r10, r5, r5)
                r8.setMaxLines(r9)
                r7.addView(r8)
                r4.addView(r7)
                boolean r7 = r0.isCurrentVersionAdapted()
                com.ss.android.ugc.awemes.MainActivity r8 = r1.this$0
                if (r7 == 0) goto L148
                r16 = -170879853436462(0xffff6495ef0961d2, double:NaN)
            L13d:
                java.lang.String r10 = "#E8F7F0"
                int r8 = com.ss.android.ugc.awemes.MainActivity.access$color(r8, r10)
                r17 = r8
                goto L14e
            L148:
                r16 = -170914213174830(0xffff648def0961d2, double:NaN)
                goto L13d
            L14e:
                com.ss.android.ugc.awemes.MainActivity r8 = r1.this$0
                if (r7 == 0) goto L160
                r18 = -170948572913198(0xffff6485ef0961d2, double:NaN)
            L157:
                java.lang.String r10 = "#0E9F6E"
                int r8 = com.ss.android.ugc.awemes.MainActivity.access$color(r8, r10)
                goto L166
            L160:
                r18 = -170982932651566(0xffff647def0961d2, double:NaN)
                goto L157
            L166:
                android.widget.TextView r10 = new android.widget.TextView
                android.content.Context r11 = r3.getContext()
                r10.<init>(r11)
                com.ss.android.ugc.awemes.MainActivity r11 = r1.this$0
                if (r7 == 0) goto L17d
                r18 = -171017292389934(0xffff6475ef0961d2, double:NaN)
            L178:
                java.lang.String r7 = "当前已适配"
                goto L183
            L17d:
                r18 = -171043062193710(0xffff646fef0961d2, double:NaN)
                goto L178
            L183:
                r10.setText(r7)
                r10.setTextSize(r15)
                r10.setTypeface(r14)
                r7 = 17
                r10.setGravity(r7)
                r10.setTextColor(r8)
                r8 = 10
                int r7 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r11, r8)
                r9 = 6
                int r12 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r11, r9)
                int r2 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r11, r8)
                int r8 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r11, r9)
                r10.setPadding(r7, r12, r2, r8)
                r2 = 999(0x3e7, float:1.4E-42)
                float r18 = com.ss.android.ugc.awemes.MainActivity.access$getDpFloat(r11, r2)
                r21 = 12
                r22 = 0
                r19 = 0
                r20 = 0
                r16 = r11
                android.graphics.drawable.GradientDrawable r7 = com.ss.android.ugc.awemes.MainActivity.roundRect$default(r16, r17, r18, r19, r20, r21, r22)
                r10.setBackground(r7)
                r4.addView(r10)
                r3.addView(r4)
                com.ss.android.ugc.awemes.MainActivity r4 = r1.this$0
                ᛷᛲᛵᛳ r4 = com.ss.android.ugc.awemes.MainActivity.access$findRunningTarget(r4, r0)
                android.widget.LinearLayout r7 = new android.widget.LinearLayout
                android.content.Context r8 = r3.getContext()
                r7.<init>(r8)
                com.ss.android.ugc.awemes.MainActivity r8 = r1.this$0
                r7.setOrientation(r5)
                r7.setGravity(r6)
                int r6 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r8, r13)
                r7.setPadding(r5, r6, r5, r5)
                android.widget.TextView r6 = new android.widget.TextView
                android.content.Context r10 = r3.getContext()
                r6.<init>(r10)
                java.lang.String r10 = r0.getUpdateVersionCode()
                boolean r11 = defpackage.AbstractC1347.m2524(r10)
                if (r11 == 0) goto L201
                r10 = -171240630689326(0xffff6441ef0961d2, double:NaN)
                java.lang.String r10 = "未读取到 UPDATE_VERSION_CODE"
            L201:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r16 = -171348004871726(0xffff6428ef0961d2, double:NaN)
                java.lang.String r12 = "当前版本: "
                r11.<init>(r12)
                java.lang.String r12 = r0.getVersionName()
                boolean r16 = defpackage.AbstractC1347.m2524(r12)
                if (r16 == 0) goto L222
                r16 = -171378069642798(0xffff6421ef0961d2, double:NaN)
                java.lang.String r12 = "-"
            L222:
                r17 = r14
                r13 = -171386659577390(0xffff641fef0961d2, double:NaN)
                r11.append(r12); r11.append(" (")
                java.lang.String r12 = r0.getVersionCode()
                boolean r13 = defpackage.AbstractC1347.m2524(r12)
                if (r13 == 0) goto L23f
                r12 = -171399544479278(0xffff641cef0961d2, double:NaN)
                java.lang.String r12 = "-"
            L23f:
                r11.append(r12)
                r12 = -171408134413870(0xffff641aef0961d2, double:NaN)
                java.lang.String r12 = ")  /  "
                r11.append(r12)
                r11.append(r10)
                java.lang.String r10 = r11.toString()
                r6.setText(r10)
                r6.setTextSize(r15)
                r10 = -171438199184942(0xffff6413ef0961d2, double:NaN)
                java.lang.String r10 = "#4E5969"
                int r10 = com.ss.android.ugc.awemes.MainActivity.access$color(r8, r10)
                r6.setTextColor(r10)
                r10 = 2
                r6.setMaxLines(r10)
                android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
                r11 = -2
                r12 = 1065353216(0x3f800000, float:1.0)
                r10.<init>(r5, r11, r12)
                if (r4 != 0) goto L27b
                r8 = r5
                goto L281
            L27b:
                r4 = 10
                int r8 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r8, r4)
            L281:
                r10.rightMargin = r8
                r6.setLayoutParams(r10)
                r7.addView(r6)
                r3.addView(r7)
                android.widget.TextView r4 = new android.widget.TextView
                android.content.Context r6 = r3.getContext()
                r4.<init>(r6)
                com.ss.android.ugc.awemes.MainActivity r6 = r1.this$0
                r7 = -170819723894318(0xffff64a3ef0961d2, double:NaN)
                java.lang.String r7 = "已适配版本"
                r4.setText(r7)
                r4.setTextSize(r15)
                r7 = r17
                r4.setTypeface(r7)
                r7 = -170845493698094(0xffff649def0961d2, double:NaN)
                java.lang.String r7 = "#86909C"
                int r7 = com.ss.android.ugc.awemes.MainActivity.access$color(r6, r7)
                r4.setTextColor(r7)
                r7 = 12
                int r6 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r6, r7)
                r4.setPadding(r5, r6, r5, r5)
                r3.addView(r4)
                java.util.List r4 = r0.getAdaptedUpdateVersionCodes()
                java.lang.String r0 = r0.getUpdateVersionCode()
                android.widget.LinearLayout r6 = new android.widget.LinearLayout
                android.content.Context r7 = r3.getContext()
                r6.<init>(r7)
                com.ss.android.ugc.awemes.MainActivity r7 = r1.this$0
                r8 = 1
                r6.setOrientation(r8)
                r8 = 8
                int r7 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r7, r8)
                r6.setPadding(r5, r7, r5, r5)
                r7 = 3
                java.util.ArrayList r4 = defpackage.AbstractC1107.m2112(r7, r4)
                com.ss.android.ugc.awemes.MainActivity r1 = r1.this$0
                java.util.Iterator r4 = r4.iterator()
            L2f2:
                boolean r7 = r4.hasNext()
                if (r7 == 0) goto L43d
                java.lang.Object r7 = r4.next()
                java.util.List r7 = (java.util.List) r7
                android.widget.LinearLayout r10 = new android.widget.LinearLayout
                android.content.Context r11 = r3.getContext()
                r10.<init>(r11)
                r10.setOrientation(r5)
                android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
                r12 = -1
                r13 = -2
                r11.<init>(r12, r13)
                int r12 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r1, r8)
                r11.bottomMargin = r12
                r10.setLayoutParams(r11)
                java.util.Iterator r11 = r7.iterator()
                r12 = r5
            L31f:
                boolean r13 = r11.hasNext()
                if (r13 == 0) goto L407
                java.lang.Object r13 = r11.next()
                int r14 = r12 + 1
                if (r12 < 0) goto L402
                java.lang.String r13 = (java.lang.String) r13
                boolean r16 = defpackage.AbstractC0498.m1280(r13, r0)
                android.widget.TextView r8 = new android.widget.TextView
                android.content.Context r5 = r3.getContext()
                r8.<init>(r5)
                r8.setText(r13)
                r8.setTextSize(r15)
                if (r16 == 0) goto L347
                android.graphics.Typeface r5 = android.graphics.Typeface.DEFAULT_BOLD
                goto L349
            L347:
                android.graphics.Typeface r5 = android.graphics.Typeface.DEFAULT
            L349:
                r8.setTypeface(r5)
                if (r16 == 0) goto L35c
                r17 = -171068831997486(0xffff6469ef0961d2, double:NaN)
            L353:
                java.lang.String r5 = "#FFFFFF"
                int r5 = com.ss.android.ugc.awemes.MainActivity.access$color(r1, r5)
                goto L362
            L35c:
                r17 = -171103191735854(0xffff6461ef0961d2, double:NaN)
                goto L353
            L362:
                r8.setTextColor(r5)
                r5 = 17
                r8.setGravity(r5)
                r13 = 10
                int r5 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r1, r13)
                int r15 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r1, r9)
                int r2 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r1, r13)
                int r13 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r1, r9)
                r8.setPadding(r5, r15, r2, r13)
                if (r16 == 0) goto L3a6
                r15 = -171137551474222(0xffff6459ef0961d2, double:NaN)
                java.lang.String r2 = "#FE2C55"
                int r17 = com.ss.android.ugc.awemes.MainActivity.access$color(r1, r2)
                r2 = 999(0x3e7, float:1.4E-42)
                float r18 = com.ss.android.ugc.awemes.MainActivity.access$getDpFloat(r1, r2)
                r21 = 12
                r22 = 0
                r19 = 0
                r20 = 0
                r16 = r1
                android.graphics.drawable.GradientDrawable r1 = com.ss.android.ugc.awemes.MainActivity.roundRect$default(r16, r17, r18, r19, r20, r21, r22)
                r5 = r16
                r2 = 1
                goto L3d4
            L3a6:
                r5 = r1
                r2 = 999(0x3e7, float:1.4E-42)
                r15 = -171171911212590(0xffff6451ef0961d2, double:NaN)
                java.lang.String r1 = "#FFF0F3"
                int r1 = com.ss.android.ugc.awemes.MainActivity.access$color(r5, r1)
                float r13 = com.ss.android.ugc.awemes.MainActivity.access$getDpFloat(r5, r2)
                r15 = -171206270950958(0xffff6449ef0961d2, double:NaN)
                java.lang.String r15 = "#FFD5DE"
                int r15 = com.ss.android.ugc.awemes.MainActivity.access$color(r5, r15)
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                r2 = 1
                int r9 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r5, r2)
                android.graphics.drawable.GradientDrawable r1 = com.ss.android.ugc.awemes.MainActivity.access$roundRect(r5, r1, r13, r15, r9)
            L3d4:
                r8.setBackground(r1)
                android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
                r9 = 0
                r13 = -2
                r15 = 1065353216(0x3f800000, float:1.0)
                r1.<init>(r9, r13, r15)
                int r9 = defpackage.AbstractC0425.m1184(r7)
                if (r12 >= r9) goto L3ef
                r9 = 8
                int r12 = com.ss.android.ugc.awemes.MainActivity.access$getDp(r5, r9)
                r1.rightMargin = r12
                goto L3f1
            L3ef:
                r9 = 8
            L3f1:
                r8.setLayoutParams(r1)
                r10.addView(r8)
                r1 = r5
                r8 = r9
                r12 = r14
                r2 = 999(0x3e7, float:1.4E-42)
                r5 = 0
                r9 = 6
                r15 = 1094713344(0x41400000, float:12.0)
                goto L31f
            L402:
                defpackage.AbstractC0425.m1196()
                r0 = 0
                throw r0
            L407:
                r5 = r1
                r9 = r8
                r2 = 1
                int r1 = r7.size()
                r7 = 3
                int r11 = 3 - r1
                r1 = 0
            L412:
                if (r1 >= r11) goto L42c
                android.view.View r8 = new android.view.View
                android.content.Context r12 = r3.getContext()
                r8.<init>(r12)
                android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
                r13 = 0
                r14 = -2
                r15 = 1065353216(0x3f800000, float:1.0)
                r12.<init>(r13, r14, r15)
                r10.addView(r8, r12)
                int r1 = r1 + 1
                goto L412
            L42c:
                r13 = 0
                r14 = -2
                r15 = 1065353216(0x3f800000, float:1.0)
                r6.addView(r10)
                r1 = r5
                r8 = r9
                r5 = r13
                r2 = 999(0x3e7, float:1.4E-42)
                r9 = 6
                r15 = 1094713344(0x41400000, float:12.0)
                goto L2f2
            L43d:
                r3.addView(r6)
            L440:
                return
        }

        @Override // defpackage.AbstractC1191
        public defpackage.AbstractC2316 onCreateViewHolder(android.view.ViewGroup r3, int r4) {
                r2 = this;
                r0 = -982315139767854(0xfffc8296ef0961d2, double:NaN)
                if (r4 == 0) goto L30
                r0 = 1
                if (r4 == r0) goto L24
                r0 = 2
                if (r4 == r0) goto L1a
                com.ss.android.ugc.awemes.ᛷᲁᛳᛳ r4 = new com.ss.android.ugc.awemes.ᛷᲁᛳᛳ
                android.view.View r3 = r2.createAppCard(r3)
                r4.<init>(r2, r3)
                return r4
            L1a:
                com.ss.android.ugc.awemes.ᛷᛲᲇᲈ r4 = new com.ss.android.ugc.awemes.ᛷᛲᲇᲈ
                android.widget.TextView r2 = r2.createMessageView(r3)
                r4.<init>(r2)
                return r4
            L24:
                com.ss.android.ugc.awemes.ᛷᛸᛵᲇ r3 = new com.ss.android.ugc.awemes.ᛷᛸᛵᲇ
                com.ss.android.ugc.awemes.MainActivity r4 = r2.this$0
                android.view.View r4 = com.ss.android.ugc.awemes.MainActivity.access$createLauncherIconCard(r4)
                r3.<init>(r2, r4)
                return r3
            L30:
                com.ss.android.ugc.awemes.ᲇᛶᛵᲇ r3 = new com.ss.android.ugc.awemes.ᲇᛶᛵᲇ
                com.ss.android.ugc.awemes.MainActivity r4 = r2.this$0
                android.view.View r4 = com.ss.android.ugc.awemes.MainActivity.access$createFrameworkStatusCard(r4)
                r3.<init>(r2, r4)
                return r3
        }

        public final void submitList(java.util.List<com.ss.android.ugc.awemes.MainActivity.InstalledAdaptedApp> r3, java.lang.String r4) {
                r2 = this;
                r0 = -982237830356526(0xfffc82a8ef0961d2, double:NaN)
                r0 = -982259305193006(0xfffc82a3ef0961d2, double:NaN)
                java.util.List<com.ss.android.ugc.awemes.MainActivity$InstalledAdaptedApp> r0 = r2.apps
                r0.clear()
                java.util.List<com.ss.android.ugc.awemes.MainActivity$InstalledAdaptedApp> r0 = r2.apps
                r0.addAll(r3)
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L21
                goto L22
            L21:
                r4 = 0
            L22:
                r2.message = r4
                r2.notifyDataSetChanged()
                return
        }

        public final void submitMessage(java.lang.String r3) {
                r2 = this;
                r0 = -982203470618158(0xfffc82b0ef0961d2, double:NaN)
                java.util.List<com.ss.android.ugc.awemes.MainActivity$InstalledAdaptedApp> r0 = r2.apps
                r0.clear()
                r2.message = r3
                r2.notifyDataSetChanged()
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static final class InstalledAdaptedApp {
        private final java.util.List<java.lang.String> adaptedUpdateVersionCodes;
        private final android.graphics.drawable.Drawable icon;
        private final boolean isCurrentVersionAdapted;
        private final java.lang.String label;
        private final java.lang.String packageName;
        private final java.lang.String updateVersionCode;
        private final java.lang.String versionCode;
        private final java.lang.String versionName;

        public InstalledAdaptedApp(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, android.graphics.drawable.Drawable r8, java.util.List<java.lang.String> r9, boolean r10) {
                r2 = this;
                r0 = -942316109340206(0xfffca6f7ef0961d2, double:NaN)
                r0 = -942341879143982(0xfffca6f1ef0961d2, double:NaN)
                r0 = -942393418751534(0xfffca6e5ef0961d2, double:NaN)
                r0 = -942444958359086(0xfffca6d9ef0961d2, double:NaN)
                r0 = -942496497966638(0xfffca6cdef0961d2, double:NaN)
                r0 = -942573807377966(0xfffca6bbef0961d2, double:NaN)
                r0 = -942595282214446(0xfffca6b6ef0961d2, double:NaN)
                r2.<init>()
                r2.label = r3
                r2.packageName = r4
                r2.versionName = r5
                r2.versionCode = r6
                r2.updateVersionCode = r7
                r2.icon = r8
                r2.adaptedUpdateVersionCodes = r9
                r2.isCurrentVersionAdapted = r10
                return
        }

        public static /* synthetic */ com.ss.android.ugc.awemes.MainActivity.InstalledAdaptedApp copy$default(com.ss.android.ugc.awemes.MainActivity.InstalledAdaptedApp r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, android.graphics.drawable.Drawable r6, java.util.List r7, boolean r8, int r9, java.lang.Object r10) {
                r10 = r9 & 1
                if (r10 == 0) goto L6
                java.lang.String r1 = r0.label
            L6:
                r10 = r9 & 2
                if (r10 == 0) goto Lc
                java.lang.String r2 = r0.packageName
            Lc:
                r10 = r9 & 4
                if (r10 == 0) goto L12
                java.lang.String r3 = r0.versionName
            L12:
                r10 = r9 & 8
                if (r10 == 0) goto L18
                java.lang.String r4 = r0.versionCode
            L18:
                r10 = r9 & 16
                if (r10 == 0) goto L1e
                java.lang.String r5 = r0.updateVersionCode
            L1e:
                r10 = r9 & 32
                if (r10 == 0) goto L24
                android.graphics.drawable.Drawable r6 = r0.icon
            L24:
                r10 = r9 & 64
                if (r10 == 0) goto L2a
                java.util.List<java.lang.String> r7 = r0.adaptedUpdateVersionCodes
            L2a:
                r9 = r9 & 128(0x80, float:1.8E-43)
                if (r9 == 0) goto L30
                boolean r8 = r0.isCurrentVersionAdapted
            L30:
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                r2 = r0
                com.ss.android.ugc.awemes.MainActivity$InstalledAdaptedApp r0 = r2.copy(r3, r4, r5, r6, r7, r8, r9, r10)
                return r0
        }

        public final java.lang.String component1() {
                r0 = this;
                java.lang.String r0 = r0.label
                return r0
        }

        public final java.lang.String component2() {
                r0 = this;
                java.lang.String r0 = r0.packageName
                return r0
        }

        public final java.lang.String component3() {
                r0 = this;
                java.lang.String r0 = r0.versionName
                return r0
        }

        public final java.lang.String component4() {
                r0 = this;
                java.lang.String r0 = r0.versionCode
                return r0
        }

        public final java.lang.String component5() {
                r0 = this;
                java.lang.String r0 = r0.updateVersionCode
                return r0
        }

        public final android.graphics.drawable.Drawable component6() {
                r0 = this;
                android.graphics.drawable.Drawable r0 = r0.icon
                return r0
        }

        public final java.util.List<java.lang.String> component7() {
                r0 = this;
                java.util.List<java.lang.String> r0 = r0.adaptedUpdateVersionCodes
                return r0
        }

        public final boolean component8() {
                r0 = this;
                boolean r0 = r0.isCurrentVersionAdapted
                return r0
        }

        public final com.ss.android.ugc.awemes.MainActivity.InstalledAdaptedApp copy(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, android.graphics.drawable.Drawable r8, java.util.List<java.lang.String> r9, boolean r10) {
                r2 = this;
                r0 = -942706951364142(0xfffca69cef0961d2, double:NaN)
                r0 = -942732721167918(0xfffca696ef0961d2, double:NaN)
                r0 = -942784260775470(0xfffca68aef0961d2, double:NaN)
                r0 = -942835800383022(0xfffca67eef0961d2, double:NaN)
                r0 = -942887339990574(0xfffca672ef0961d2, double:NaN)
                r0 = -942964649401902(0xfffca660ef0961d2, double:NaN)
                r0 = -942986124238382(0xfffca65bef0961d2, double:NaN)
                com.ss.android.ugc.awemes.MainActivity$InstalledAdaptedApp r2 = new com.ss.android.ugc.awemes.MainActivity$InstalledAdaptedApp
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                return r2
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.ss.android.ugc.awemes.MainActivity.InstalledAdaptedApp
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.ss.android.ugc.awemes.MainActivity$InstalledAdaptedApp r5 = (com.ss.android.ugc.awemes.MainActivity.InstalledAdaptedApp) r5
                java.lang.String r1 = r4.label
                java.lang.String r3 = r5.label
                boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.packageName
                java.lang.String r3 = r5.packageName
                boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                java.lang.String r1 = r4.versionName
                java.lang.String r3 = r5.versionName
                boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
                if (r1 != 0) goto L2d
                return r2
            L2d:
                java.lang.String r1 = r4.versionCode
                java.lang.String r3 = r5.versionCode
                boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
                if (r1 != 0) goto L38
                return r2
            L38:
                java.lang.String r1 = r4.updateVersionCode
                java.lang.String r3 = r5.updateVersionCode
                boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
                if (r1 != 0) goto L43
                return r2
            L43:
                android.graphics.drawable.Drawable r1 = r4.icon
                android.graphics.drawable.Drawable r3 = r5.icon
                boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
                if (r1 != 0) goto L4e
                return r2
            L4e:
                java.util.List<java.lang.String> r1 = r4.adaptedUpdateVersionCodes
                java.util.List<java.lang.String> r3 = r5.adaptedUpdateVersionCodes
                boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
                if (r1 != 0) goto L59
                return r2
            L59:
                boolean r4 = r4.isCurrentVersionAdapted
                boolean r5 = r5.isCurrentVersionAdapted
                if (r4 == r5) goto L60
                return r2
            L60:
                return r0
        }

        public final java.util.List<java.lang.String> getAdaptedUpdateVersionCodes() {
                r0 = this;
                java.util.List<java.lang.String> r0 = r0.adaptedUpdateVersionCodes
                return r0
        }

        public final android.graphics.drawable.Drawable getIcon() {
                r0 = this;
                android.graphics.drawable.Drawable r0 = r0.icon
                return r0
        }

        public final java.lang.String getLabel() {
                r0 = this;
                java.lang.String r0 = r0.label
                return r0
        }

        public final java.lang.String getPackageName() {
                r0 = this;
                java.lang.String r0 = r0.packageName
                return r0
        }

        public final java.lang.String getUpdateVersionCode() {
                r0 = this;
                java.lang.String r0 = r0.updateVersionCode
                return r0
        }

        public final java.lang.String getVersionCode() {
                r0 = this;
                java.lang.String r0 = r0.versionCode
                return r0
        }

        public final java.lang.String getVersionName() {
                r0 = this;
                java.lang.String r0 = r0.versionName
                return r0
        }

        public int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.label
                int r0 = r0.hashCode()
                r1 = 31
                int r0 = r0 * r1
                java.lang.String r2 = r3.packageName
                int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
                java.lang.String r2 = r3.versionName
                int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
                java.lang.String r2 = r3.versionCode
                int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
                java.lang.String r2 = r3.updateVersionCode
                int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
                android.graphics.drawable.Drawable r2 = r3.icon
                int r2 = r2.hashCode()
                int r2 = r2 + r0
                int r2 = r2 * r1
                java.util.List<java.lang.String> r0 = r3.adaptedUpdateVersionCodes
                int r0 = r0.hashCode()
                int r0 = r0 + r2
                int r0 = r0 * r1
                boolean r3 = r3.isCurrentVersionAdapted
                int r3 = java.lang.Boolean.hashCode(r3)
                int r3 = r3 + r0
                return r3
        }

        public final boolean isCurrentVersionAdapted() {
                r0 = this;
                boolean r0 = r0.isCurrentVersionAdapted
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = -943097793388078(0xfffca641ef0961d2, double:NaN)
                java.lang.String r1 = "InstalledAdaptedApp(label="
                r0.<init>(r1)
                java.lang.String r1 = r4.label
                r2 = -943213757505070(0xfffca626ef0961d2, double:NaN)
                r0.append(r1); r0.append(", packageName=")
                java.lang.String r1 = r4.packageName
                r2 = -943278182014510(0xfffca617ef0961d2, double:NaN)
                r0.append(r1); r0.append(", versionName=")
                java.lang.String r1 = r4.versionName
                r2 = -943342606523950(0xfffca608ef0961d2, double:NaN)
                r0.append(r1); r0.append(", versionCode=")
                java.lang.String r1 = r4.versionCode
                r2 = -943407031033390(0xfffca5f9ef0961d2, double:NaN)
                r0.append(r1); r0.append(", updateVersionCode=")
                java.lang.String r1 = r4.updateVersionCode
                r2 = -943497225346606(0xfffca5e4ef0961d2, double:NaN)
                r0.append(r1); r0.append(", icon=")
                android.graphics.drawable.Drawable r1 = r4.icon
                r0.append(r1)
                r1 = -943531585084974(0xfffca5dcef0961d2, double:NaN)
                java.lang.String r1 = ", adaptedUpdateVersionCodes="
                r0.append(r1)
                java.util.List<java.lang.String> r1 = r4.adaptedUpdateVersionCodes
                r0.append(r1)
                r1 = -943656139136558(0xfffca5bfef0961d2, double:NaN)
                java.lang.String r1 = ", isCurrentVersionAdapted="
                r0.append(r1)
                boolean r4 = r4.isCurrentVersionAdapted
                r0.append(r4)
                r4 = 41
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                return r4
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.awemes.MainActivity$ᛷᲁᛳᛳ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static final class C0009 {

        /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
        @defpackage.InterfaceC1248("packageName")
        private final java.lang.String f421;

        /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
        @defpackage.InterfaceC1248(alternate = {"versionCode"}, value = "updateVersionCode")
        private final java.lang.String f422;

        public C0009() {
                r4 = this;
                r0 = -806157056122414(0xfffd22cdef0961d2, double:NaN)
                java.lang.String r0 = ""
                r1 = -806161351089710(0xfffd22ccef0961d2, double:NaN)
                java.lang.String r1 = ""
                r2 = -806028207103534(0xfffd22ebef0961d2, double:NaN)
                r2 = -806079746711086(0xfffd22dfef0961d2, double:NaN)
                r4.<init>()
                r4.f421 = r0
                r4.f422 = r1
                return
        }

        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.ss.android.ugc.awemes.MainActivity.C0009
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.ss.android.ugc.awemes.MainActivity$ᛷᲁᛳᛳ r5 = (com.ss.android.ugc.awemes.MainActivity.C0009) r5
                java.lang.String r1 = r4.f421
                java.lang.String r3 = r5.f421
                boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r4 = r4.f422
                java.lang.String r5 = r5.f422
                boolean r4 = defpackage.AbstractC0498.m1280(r4, r5)
                if (r4 != 0) goto L22
                return r2
            L22:
                return r0
        }

        public final int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.f421
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r1.f422
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public final java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = -806294495075886(0xfffd22adef0961d2, double:NaN)
                java.lang.String r1 = "AdaptedVersion(packageName="
                r0.<init>(r1)
                java.lang.String r1 = r4.f421
                r2 = -806414754160174(0xfffd2291ef0961d2, double:NaN)
                r0.append(r1); r0.append(", updateVersionCode=")
                java.lang.String r4 = r4.f422
                r1 = 41
                java.lang.String r4 = defpackage.AbstractC0225.m823(r0, r4, r1)
                return r4
        }

        /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
        public final java.lang.String m296() {
                r0 = this;
                java.lang.String r0 = r0.f421
                return r0
        }

        /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
        public final java.lang.String m297() {
                r0 = this;
                java.lang.String r0 = r0.f422
                return r0
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.awemes.MainActivity$ᲇᛶᛵᲇ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static final class C0010 extends defpackage.C1949<java.util.List<? extends com.ss.android.ugc.awemes.MainActivity.C0009>> {
    }

    static {
            ᛷᲇᲁᛷ r0 = new ᛷᲇᲁᛷ
            r0.<init>()
            com.ss.android.ugc.awemes.MainActivity.Companion = r0
            return
    }

    public MainActivity() {
            r2 = this;
            r2.<init>()
            ᲀᛶᲇ r0 = defpackage.C1698.f7558
            r2.runningTargets = r0
            com.ss.android.ugc.awemes.MainActivity$AdaptedAppAdapter r0 = new com.ss.android.ugc.awemes.MainActivity$AdaptedAppAdapter
            r0.<init>(r2)
            r2.adapter = r0
            ᛲᲀ r0 = new ᛲᲀ
            r1 = 12
            r0.<init>(r1, r2)
            ᛲᲈᛶᲈ r1 = new ᛲᲈᛶᲈ
            r1.<init>(r0)
            r2.launcherAliasComponent$delegate = r1
            return
    }

    public static final /* synthetic */ int access$color(com.ss.android.ugc.awemes.MainActivity r0, java.lang.String r1) {
            int r0 = r0.color(r1)
            return r0
    }

    public static final /* synthetic */ android.view.View access$createFrameworkStatusCard(com.ss.android.ugc.awemes.MainActivity r0) {
            android.view.View r0 = r0.createFrameworkStatusCard()
            return r0
    }

    public static final /* synthetic */ android.view.View access$createLauncherIconCard(com.ss.android.ugc.awemes.MainActivity r0) {
            android.view.View r0 = r0.createLauncherIconCard()
            return r0
    }

    public static final /* synthetic */ defpackage.C1226 access$findRunningTarget(com.ss.android.ugc.awemes.MainActivity r0, com.ss.android.ugc.awemes.MainActivity.InstalledAdaptedApp r1) {
            ᛷᛲᛵᛳ r0 = r0.findRunningTarget(r1)
            return r0
    }

    public static final /* synthetic */ int access$getDp(com.ss.android.ugc.awemes.MainActivity r0, int r1) {
            int r0 = r0.getDp(r1)
            return r0
    }

    public static final /* synthetic */ float access$getDpFloat(com.ss.android.ugc.awemes.MainActivity r0, int r1) {
            float r0 = r0.getDpFloat(r1)
            return r0
    }

    public static final /* synthetic */ void access$hotReloadApp(com.ss.android.ugc.awemes.MainActivity r0, com.ss.android.ugc.awemes.MainActivity.InstalledAdaptedApp r1) {
            r0.hotReloadApp(r1)
            return
    }

    public static final /* synthetic */ void access$loadAdaptedApps(com.ss.android.ugc.awemes.MainActivity r0) {
            r0.loadAdaptedApps()
            return
    }

    public static final /* synthetic */ android.graphics.drawable.GradientDrawable access$roundRect(com.ss.android.ugc.awemes.MainActivity r0, int r1, float r2, java.lang.Integer r3, int r4) {
            android.graphics.drawable.GradientDrawable r0 = r0.roundRect(r1, r2, r3, r4)
            return r0
    }

    public static final /* synthetic */ void access$showInstalledAppsPermissionDenied(com.ss.android.ugc.awemes.MainActivity r0) {
            r0.showInstalledAppsPermissionDenied()
            return
    }

    public static final /* synthetic */ void access$updateFrameworkStatusCard(com.ss.android.ugc.awemes.MainActivity r0) {
            r0.updateFrameworkStatusCard()
            return
    }

    public static final /* synthetic */ void access$updateLauncherIconCard(com.ss.android.ugc.awemes.MainActivity r0) {
            r0.updateLauncherIconCard()
            return
    }

    private final int color(java.lang.String r1) {
            r0 = this;
            int r0 = android.graphics.Color.parseColor(r1)
            return r0
    }

    private final android.view.View createContentView() {
            r8 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r8)
            r1 = 1
            r0.setOrientation(r1)
            r1 = -187965233339950(0xffff550bef0961d2, double:NaN)
            java.lang.String r1 = "#F7F8FA"
            int r1 = r8.color(r1)
            r0.setBackgroundColor(r1)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r0.setLayoutParams(r1)
            r8.root = r0
            ᛱᛳᛶᛱ r0 = new ᛱᛳᛶᛱ
            r1 = 0
            r0.<init>(r8, r1)
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            r4 = 0
            r3.<init>(r4)
            r0.setLayoutManager(r3)
            com.ss.android.ugc.awemes.MainActivity$AdaptedAppAdapter r3 = r8.adapter
            r0.setAdapter(r3)
            r3 = 2
            r0.setOverScrollMode(r3)
            r0.setClipToPadding(r4)
            r3 = 12
            int r5 = r8.getDp(r3)
            int r6 = r8.getStatusBarHeight()
            r7 = 10
            int r7 = r8.getDp(r7)
            int r6 = r6 + r7
            int r3 = r8.getDp(r3)
            r7 = 24
            int r7 = r8.getDp(r7)
            r0.setPadding(r5, r6, r3, r7)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r2, r4, r5)
            r0.setLayoutParams(r3)
            r8.recyclerView = r0
            ᲈᛱᲇᛲ r2 = new ᲈᛱᲇᛲ
            r2.<init>(r8)
            java.util.WeakHashMap r3 = defpackage.AbstractC0858.f3911
            defpackage.AbstractC2204.m3604(r0, r2)
            ᛱᛳᛶᛱ r0 = r8.recyclerView
            if (r0 != 0) goto L80
            r2 = -188055427653166(0xffff54f6ef0961d2, double:NaN)
            r0 = r1
        L80:
            r0.requestApplyInsets()
            android.widget.LinearLayout r0 = r8.root
            if (r0 != 0) goto L90
            r2 = -188111262228014(0xffff54e9ef0961d2, double:NaN)
            r0 = r1
        L90:
            ᛱᛳᛶᛱ r2 = r8.recyclerView
            if (r2 != 0) goto L9d
            r2 = -188132737064494(0xffff54e4ef0961d2, double:NaN)
            r2 = r1
        L9d:
            r0.addView(r2)
            com.ss.android.ugc.awemes.MainActivity$AdaptedAppAdapter r0 = r8.adapter
            r2 = -188188571639342(0xffff54d7ef0961d2, double:NaN)
            java.lang.String r2 = "正在读取已安装应用..."
            r0.submitMessage(r2)
            android.widget.LinearLayout r8 = r8.root
            if (r8 != 0) goto Lbb
            r2 = -188244406214190(0xffff54caef0961d2, double:NaN)
            return r1
        Lbb:
            return r8
    }

    private static final defpackage.C2300 createContentView$lambda$4(com.ss.android.ugc.awemes.MainActivity r4, android.view.View r5, defpackage.C2300 r6) {
            r0 = -192599503052334(0xffff50d4ef0961d2, double:NaN)
            r0 = -192620977888814(0xffff50cfef0961d2, double:NaN)
            r0 = 1
            ᛲᲇᲀᲈ r1 = r6.f9727
            ᛶᛳᛴᛲ r0 = r1.mo357(r0)
            int r0 = r0.f4598
            r1 = 12
            int r2 = r4.getDp(r1)
            r3 = 10
            int r3 = r4.getDp(r3)
            int r0 = r0 + r3
            int r1 = r4.getDp(r1)
            r3 = 24
            int r4 = r4.getDp(r3)
            r5.setPadding(r2, r0, r1, r4)
            return r6
    }

    private final android.view.View createFrameworkStatusCard() {
            r10 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r10)
            r1 = 1
            r0.setOrientation(r1)
            r2 = 14
            int r3 = r10.getDp(r2)
            r0.setPadding(r3, r3, r3, r3)
            r3 = -188265881050670(0xffff54c5ef0961d2, double:NaN)
            java.lang.String r3 = "#FFFFFF"
            int r3 = r10.color(r3)
            float r2 = r10.getDpFloat(r2)
            r4 = -188300240789038(0xffff54bdef0961d2, double:NaN)
            java.lang.String r4 = "#F0F1F3"
            int r4 = r10.color(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r5 = r10.getDp(r1)
            android.graphics.drawable.GradientDrawable r2 = r10.roundRect(r3, r2, r4, r5)
            r0.setBackground(r2)
            float r2 = r10.getDpFloat(r1)
            r0.setElevation(r2)
            ᛵᛲᲁᛴ r2 = new ᛵᛲᲁᛴ
            r3 = -1
            r4 = -2
            r2.<init>(r3, r4)
            r3 = 10
            int r5 = r10.getDp(r3)
            r2.bottomMargin = r5
            r0.setLayoutParams(r2)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r10)
            r5 = 0
            r2.setOrientation(r5)
            r6 = 16
            r2.setGravity(r6)
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r6.<init>(r10)
            r6.setOrientation(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r7 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r5, r4, r7)
            r6.setLayoutParams(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r10)
            r7 = -188334600527406(0xffff54b5ef0961d2, double:NaN)
            java.lang.String r4 = "框架状态"
            r1.setText(r4)
            r4 = 1098907648(0x41800000, float:16.0)
            r1.setTextSize(r4)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT_BOLD
            r1.setTypeface(r4)
            r7 = -188356075363886(0xffff54b0ef0961d2, double:NaN)
            java.lang.String r7 = "#1F2329"
            int r7 = r10.color(r7)
            r1.setTextColor(r7)
            r6.addView(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r10)
            r7 = 1094713344(0x41400000, float:12.0)
            r1.setTextSize(r7)
            r8 = -188390435102254(0xffff54a8ef0961d2, double:NaN)
            java.lang.String r8 = "#4E5969"
            int r8 = r10.color(r8)
            r1.setTextColor(r8)
            r8 = 4
            int r8 = r10.getDp(r8)
            r1.setPadding(r5, r8, r5, r5)
            r10.frameworkStatusText = r1
            r6.addView(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r10)
            r1.setTextSize(r7)
            r1.setTypeface(r4)
            r4 = 17
            r1.setGravity(r4)
            int r4 = r10.getDp(r3)
            r8 = 6
            int r9 = r10.getDp(r8)
            int r3 = r10.getDp(r3)
            int r8 = r10.getDp(r8)
            r1.setPadding(r4, r9, r3, r8)
            r10.frameworkBadgeText = r1
            r2.addView(r6)
            android.widget.TextView r1 = r10.frameworkBadgeText
            if (r1 != 0) goto L103
            r3 = -188510694186542(0xffff548cef0961d2, double:NaN)
            r1 = 0
        L103:
            r2.addView(r1)
            r0.addView(r2)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r10)
            r1.setTextSize(r7)
            r2 = -188592298565166(0xffff5479ef0961d2, double:NaN)
            java.lang.String r2 = "#4E5969"
            int r2 = r10.color(r2)
            r1.setTextColor(r2)
            r2 = 12
            int r2 = r10.getDp(r2)
            r1.setPadding(r5, r2, r5, r5)
            r10.frameworkDetailText = r1
            r0.addView(r1)
            r10.updateFrameworkStatusCard()
            return r0
    }

    private final android.view.View createLauncherIconCard() {
            r8 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r8)
            r1 = 1
            r0.setOrientation(r1)
            r2 = 14
            int r3 = r8.getDp(r2)
            r0.setPadding(r3, r3, r3, r3)
            r3 = -188712557649454(0xffff545def0961d2, double:NaN)
            java.lang.String r3 = "#FFFFFF"
            int r3 = r8.color(r3)
            float r2 = r8.getDpFloat(r2)
            r4 = -188746917387822(0xffff5455ef0961d2, double:NaN)
            java.lang.String r4 = "#F0F1F3"
            int r4 = r8.color(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r5 = r8.getDp(r1)
            android.graphics.drawable.GradientDrawable r2 = r8.roundRect(r3, r2, r4, r5)
            r0.setBackground(r2)
            float r2 = r8.getDpFloat(r1)
            r0.setElevation(r2)
            ᛵᛲᲁᛴ r2 = new ᛵᛲᲁᛴ
            r3 = -1
            r4 = -2
            r2.<init>(r3, r4)
            r3 = 10
            int r3 = r8.getDp(r3)
            r2.bottomMargin = r3
            r0.setLayoutParams(r2)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r8)
            r3 = 0
            r2.setOrientation(r3)
            r5 = 16
            r2.setGravity(r5)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r8)
            r5.setOrientation(r1)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r7 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r3, r4, r7)
            r5.setLayoutParams(r6)
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r8)
            r6 = -188781277126190(0xffff544def0961d2, double:NaN)
            java.lang.String r6 = "启动器图标"
            r4.setText(r6)
            r6 = 1098907648(0x41800000, float:16.0)
            r4.setTextSize(r6)
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT_BOLD
            r4.setTypeface(r6)
            r6 = -188807046929966(0xffff5447ef0961d2, double:NaN)
            java.lang.String r6 = "#1F2329"
            int r6 = r8.color(r6)
            r4.setTextColor(r6)
            r5.addView(r4)
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r8)
            r6 = 1094713344(0x41400000, float:12.0)
            r4.setTextSize(r6)
            r6 = -188841406668334(0xffff543fef0961d2, double:NaN)
            java.lang.String r6 = "#4E5969"
            int r6 = r8.color(r6)
            r4.setTextColor(r6)
            r6 = 4
            int r6 = r8.getDp(r6)
            r4.setPadding(r3, r6, r3, r3)
            r8.launcherIconStatusText = r4
            r5.addView(r4)
            android.widget.Switch r4 = new android.widget.Switch
            r4.<init>(r8)
            r6 = -188974550654510(0xffff5420ef0961d2, double:NaN)
            java.lang.String r6 = "显示"
            r4.setText(r6)
            r6 = 1095761920(0x41500000, float:13.0)
            r4.setTextSize(r6)
            r6 = -188987435556398(0xffff541def0961d2, double:NaN)
            java.lang.String r6 = "#4E5969"
            int r6 = r8.color(r6)
            r4.setTextColor(r6)
            r6 = 8
            int r6 = r8.getDp(r6)
            r4.setPadding(r6, r3, r3, r3)
            ᛲᛸᛳᲁ r3 = new ᛲᛸᛳᲁ
            r3.<init>(r1, r8)
            r4.setOnCheckedChangeListener(r3)
            r8.launcherIconSwitch = r4
            r2.addView(r5)
            android.widget.Switch r1 = r8.launcherIconSwitch
            if (r1 != 0) goto L116
            r3 = -189021795294766(0xffff5415ef0961d2, double:NaN)
            r1 = 0
        L116:
            r2.addView(r1)
            r0.addView(r2)
            r8.updateLauncherIconCard()
            return r0
    }

    private static final void createLauncherIconCard$lambda$20$lambda$19(com.ss.android.ugc.awemes.MainActivity r2, android.widget.CompoundButton r3, boolean r4) {
            r0 = -192651042659886(0xffff50c8ef0961d2, double:NaN)
            boolean r0 = r2.refreshingLauncherIconSwitch
            if (r0 != 0) goto L36
            boolean r3 = r3.isPressed()
            if (r3 != 0) goto L13
            goto L36
        L13:
            boolean r3 = r2.setLauncherIconVisible(r4)
            if (r3 == 0) goto L33
            if (r4 == 0) goto L25
            r3 = -192681107430958(0xffff50c1ef0961d2, double:NaN)
        L20:
            java.lang.String r3 = "启动器图标已显示"
            goto L2b
        L25:
            r3 = -192719762136622(0xffff50b8ef0961d2, double:NaN)
            goto L20
        L2b:
            r4 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r4)
            r3.show()
        L33:
            r2.updateLauncherIconCard()
        L36:
            return
    }

    private final defpackage.C1226 findRunningTarget(com.ss.android.ugc.awemes.MainActivity.InstalledAdaptedApp r8) {
            r7 = this;
            java.util.List<ᛷᛲᛵᛳ> r7 = r7.runningTargets
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        Lb:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r7.next()
            r2 = r1
            ᛷᛲᛵᛳ r2 = (defpackage.C1226) r2
            java.lang.String r3 = r2.f5520
            java.lang.String r4 = r8.getPackageName()
            boolean r3 = defpackage.AbstractC0498.m1280(r3, r4)
            if (r3 != 0) goto L49
            java.lang.String r2 = r2.f5520
            r3 = -191465631686190(0xffff51dcef0961d2, double:NaN)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r8.getPackageName()
            r3.append(r4)
            r4 = 58
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto Lb
        L49:
            r0.add(r1)
            goto Lb
        L4d:
            java.util.Iterator r7 = r0.iterator()
            boolean r8 = r7.hasNext()
            if (r8 != 0) goto L59
            r7 = 0
            goto La4
        L59:
            java.lang.Object r8 = r7.next()
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L65
        L63:
            r7 = r8
            goto La4
        L65:
            r0 = r8
            ᛷᛲᛵᛳ r0 = (defpackage.C1226) r0
            int r0 = r0.f5518
            int r0 = defpackage.AbstractC0225.m812(r0)
            r1 = 0
            r2 = 3
            r3 = 1
            r4 = 2
            if (r0 == r3) goto L7e
            if (r0 == r4) goto L7c
            if (r0 == r2) goto L7a
            r0 = r2
            goto L7f
        L7a:
            r0 = r3
            goto L7f
        L7c:
            r0 = r4
            goto L7f
        L7e:
            r0 = r1
        L7f:
            java.lang.Object r5 = r7.next()
            r6 = r5
            ᛷᛲᛵᛳ r6 = (defpackage.C1226) r6
            int r6 = r6.f5518
            int r6 = defpackage.AbstractC0225.m812(r6)
            if (r6 == r3) goto L98
            if (r6 == r4) goto L96
            if (r6 == r2) goto L94
            r6 = r2
            goto L99
        L94:
            r6 = r3
            goto L99
        L96:
            r6 = r4
            goto L99
        L98:
            r6 = r1
        L99:
            if (r0 <= r6) goto L9d
            r8 = r5
            r0 = r6
        L9d:
            boolean r5 = r7.hasNext()
            if (r5 != 0) goto L7f
            goto L63
        La4:
            ᛷᛲᛵᛳ r7 = (defpackage.C1226) r7
            return r7
    }

    private final java.lang.String formatFrameworkCapabilities(long r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 4
            boolean r6 = r6.hasFlag(r7, r1)
            if (r6 == 0) goto L1a
            r6 = -191375437372974(0xffff51f1ef0961d2, double:NaN)
            java.lang.String r6 = "API调用保护"
            r0.add(r6)
            goto L26
        L1a:
            r6 = -191409797111342(0xffff51e9ef0961d2, double:NaN)
            java.lang.String r6 = "未开启API调用保护"
            r0.add(r6)
        L26:
            r6 = -191457041751598(0xffff51deef0961d2, double:NaN)
            java.lang.String r1 = "、"
            r4 = 0
            r5 = 62
            r2 = 0
            r3 = 0
            java.lang.String r6 = defpackage.AbstractC1107.m2125(r0, r1, r2, r3, r4, r5)
            return r6
    }

    private final defpackage.C1851 getApi102ServiceOrNull() {
            r3 = this;
            ᲁᛴᲈᲁ r3 = r3.currentXposedService
            r0 = 0
            if (r3 != 0) goto L6
            return r0
        L6:
            int r1 = r3.m3263()     // Catch: java.lang.Throwable -> L11
            r2 = 102(0x66, float:1.43E-43)
            if (r1 < r2) goto Lf
            goto L18
        Lf:
            r3 = r0
            goto L18
        L11:
            r3 = move-exception
            ᛴᛸᛲᲀ r1 = new ᛴᛸᛲᲀ
            r1.<init>(r3)
            r3 = r1
        L18:
            boolean r1 = r3 instanceof defpackage.C0723
            if (r1 == 0) goto L1d
            goto L1e
        L1d:
            r0 = r3
        L1e:
            ᲁᛴᲈᲁ r0 = (defpackage.C1851) r0
            return r0
    }

    private final int getDp(int r1) {
            r0 = this;
            float r1 = (float) r1
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            int r0 = (int) r1
            return r0
    }

    private final float getDpFloat(int r1) {
            r0 = this;
            float r1 = (float) r1
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            return r1
    }

    private final java.util.List<android.content.pm.ApplicationInfo> getInstalledApplications(android.content.pm.PackageManager r2) {
            r1 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto Lf
            android.content.pm.PackageManager$ApplicationInfoFlags r1 = defpackage.AbstractC1306.m2433()
            java.util.List r1 = defpackage.AbstractC1306.m2424(r2, r1)
            return r1
        Lf:
            r1 = 128(0x80, float:1.8E-43)
            java.util.List r1 = r2.getInstalledApplications(r1)
            return r1
    }

    private final android.content.ComponentName getLauncherAliasComponent() {
            r0 = this;
            ᛲᛴᛱᛵ r0 = r0.launcherAliasComponent$delegate
            java.lang.Object r0 = r0.getValue()
            android.content.ComponentName r0 = (android.content.ComponentName) r0
            return r0
    }

    private final android.content.pm.PackageInfo getPackageInfo(android.content.pm.PackageManager r2, java.lang.String r3) {
            r1 = this;
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L15
            r0 = 33
            if (r1 < r0) goto Lf
            android.content.pm.PackageManager$PackageInfoFlags r1 = defpackage.AbstractC1306.m2429()     // Catch: java.lang.Throwable -> L15
            android.content.pm.PackageInfo r1 = defpackage.AbstractC1306.m2430(r2, r3, r1)     // Catch: java.lang.Throwable -> L15
            return r1
        Lf:
            r1 = 0
            android.content.pm.PackageInfo r1 = r2.getPackageInfo(r3, r1)     // Catch: java.lang.Throwable -> L15
            return r1
        L15:
            r1 = 0
            return r1
    }

    private final int getStatusBarHeight() {
            r5 = this;
            android.content.res.Resources r0 = r5.getResources()
            r1 = -192436294295086(0xffff50faef0961d2, double:NaN)
            java.lang.String r1 = "status_bar_height"
            r2 = -192513603706414(0xffff50e8ef0961d2, double:NaN)
            java.lang.String r2 = "dimen"
            r3 = -192539373510190(0xffff50e2ef0961d2, double:NaN)
            java.lang.String r3 = "android"
            int r0 = r0.getIdentifier(r1, r2, r3)
            if (r0 <= 0) goto L2e
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getDimensionPixelSize(r0)
            return r5
        L2e:
            r0 = 24
            int r5 = r5.getDp(r0)
            return r5
    }

    private final boolean hasFlag(long r1, long r3) {
            r0 = this;
            long r0 = r1 & r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    private final void hotReloadApp(com.ss.android.ugc.awemes.MainActivity.InstalledAdaptedApp r5) {
            r4 = this;
            ᲁᛴᲈᲁ r0 = r4.getApi102ServiceOrNull()
            r1 = 0
            if (r0 != 0) goto L18
            r2 = -191551531032110(0xffff51c8ef0961d2, double:NaN)
            java.lang.String r5 = "当前 Xposed 服务不支持 API 102 热重载"
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r5, r1)
            r4.show()
            return
        L18:
            ᛷᛲᛵᛳ r2 = r4.findRunningTarget(r5)
            if (r2 != 0) goto L44
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = -191671790116398(0xffff51acef0961d2, double:NaN)
            java.lang.String r2 = "未找到 "
            r0.<init>(r2)
            java.lang.String r5 = r5.getLabel()
            r2 = -191693264952878(0xffff51a7ef0961d2, double:NaN)
            r0.append(r5); r0.append(" 的挂载进程");             java.lang.String r5 = r0.toString()
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r1)
            r5.show()
            r4.refreshRunningTargets()
            return
        L44:
            ᲈᛱᲇᛲ r5 = new ᲈᛱᲇᛲ     // Catch: java.lang.Throwable -> L4f
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L4f
            r0.m3259(r2, r5)     // Catch: java.lang.Throwable -> L4f
            ᲁᲀᛱᲁ r5 = defpackage.C1907.f8270     // Catch: java.lang.Throwable -> L4f
            goto L56
        L4f:
            r5 = move-exception
            ᛴᛸᛲᲀ r0 = new ᛴᛸᛲᲀ
            r0.<init>(r5)
            r5 = r0
        L56:
            java.lang.Throwable r5 = defpackage.C2165.m3569(r5)
            if (r5 == 0) goto L8e
            r2 = -191723329723950(0xffff51a0ef0961d2, double:NaN)
            java.lang.String r0 = "热重载失败"
            r4.log(r0, r5)
            r2 = -191749099527726(0xffff519aef0961d2, double:NaN)
            java.lang.String r0 = "热重载失败："
            java.lang.String r5 = r5.getMessage()
            if (r5 != 0) goto L80
            r2 = -191779164298798(0xffff5193ef0961d2, double:NaN)
            java.lang.String r5 = "未知错误"
        L80:
            java.lang.String r5 = r0.concat(r5)
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r1)
            r5.show()
            r4.refreshRunningTargets()
        L8e:
            return
    }

    private static final void hotReloadApp$lambda$42$lambda$41(com.ss.android.ugc.awemes.MainActivity r2, defpackage.C1226 r3, defpackage.C0195 r4) {
            r0 = -193368302198318(0xffff5021ef0961d2, double:NaN)
            r0 = -193424136773166(0xffff5014ef0961d2, double:NaN)
            ᛸᛳᛴᲁ r3 = new ᛸᛳᛴᲁ
            r0 = 5
            r3.<init>(r2, r0, r4)
            r2.runOnUiThread(r3)
            return
    }

    private static final void hotReloadApp$lambda$42$lambda$41$lambda$40(com.ss.android.ugc.awemes.MainActivity r4, defpackage.C0195 r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -193179323637294(0xffff504def0961d2, double:NaN)
            java.lang.String r1 = "热重载: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r2 = 2
            log$default(r4, r0, r1, r2, r1)
            java.lang.String r0 = r5.f1264
            if (r0 == 0) goto L25
            boolean r3 = defpackage.AbstractC1347.m2524(r0)
            if (r3 != 0) goto L25
            r1 = r0
        L25:
            ᲇᛴᲀᛸ r5 = r5.f1263
            int r5 = r5.ordinal()
            if (r5 == 0) goto L66
            r0 = 1
            if (r5 == r0) goto L5c
            if (r5 == r2) goto L52
            r0 = 3
            if (r5 == r0) goto L48
            r0 = 4
            if (r5 != r0) goto L42
            r2 = -193286697819694(0xffff5034ef0961d2, double:NaN)
            java.lang.String r5 = "目标进程已退出"
            goto L6f
        L42:
            ᛸᛵᛳᲀ r4 = new ᛸᛵᛳᲀ
            r4.<init>()
            throw r4
        L48:
            r2 = -193230863244846(0xffff5041ef0961d2, double:NaN)
            java.lang.String r5 = "热重载进行中"
            goto L6f
        L52:
            r2 = -193321057558062(0xffff502cef0961d2, double:NaN)
            java.lang.String r5 = "当前模块不支持热重载"
            goto L6f
        L5c:
            r2 = -193260928015918(0xffff503aef0961d2, double:NaN)
            java.lang.String r5 = "热重载失败"
            goto L6f
        L66:
            r2 = -193205093441070(0xffff5047ef0961d2, double:NaN)
            java.lang.String r5 = "热重载成功"
        L6f:
            if (r1 != 0) goto L72
            goto L84
        L72:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r5 = 65306(0xff1a, float:9.1513E-41)
            r0.append(r5)
            r0.append(r1)
            java.lang.String r5 = r0.toString()
        L84:
            r0 = 0
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r0)
            r5.show()
            r4.refreshRunningTargets()
            return
    }

    private final boolean isLauncherIconShowing() {
            r2 = this;
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L1d
            android.content.ComponentName r2 = r2.getLauncherAliasComponent()     // Catch: java.lang.Throwable -> L1d
            int r2 = r0.getComponentEnabledSetting(r2)     // Catch: java.lang.Throwable -> L1d
            r0 = 2
            if (r2 == r0) goto L17
            r0 = 3
            if (r2 == r0) goto L17
            r0 = 4
            if (r2 == r0) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r2 = move-exception
            ᛴᛸᛲᲀ r0 = new ᛴᛸᛲᲀ
            r0.<init>(r2)
            r2 = r0
        L24:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r1 = r2 instanceof defpackage.C0723
            if (r1 == 0) goto L2b
            r2 = r0
        L2b:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
    }

    private static final android.content.ComponentName launcherAliasComponent_delegate$lambda$0(com.ss.android.ugc.awemes.MainActivity r4) {
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.String r4 = r4.getPackageName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = defpackage.AbstractC2344.m3828()
            r1.append(r2)
            r2 = -192573733248558(0xffff50daef0961d2, double:NaN)
            java.lang.String r2 = ".Home"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r4, r1)
            return r0
    }

    private final java.util.List<com.ss.android.ugc.awemes.MainActivity.C0009> loadAdaptationList() {
            r3 = this;
            ᲀᛶᲇ r0 = defpackage.C1698.f7558
            r1 = -189541486337582(0xffff539cef0961d2, double:NaN)
            java.lang.String r1 = "dex/adaptation_list"     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = r3.nativeLoadConfig(r1)     // Catch: java.lang.Throwable -> L2c
            boolean r1 = defpackage.AbstractC1347.m2524(r3)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L16
            return r0
        L16:
            com.ss.android.ugc.awemes.MainActivity$ᲇᛶᛵᲇ r1 = new com.ss.android.ugc.awemes.MainActivity$ᲇᛶᛵᲇ     // Catch: java.lang.Throwable -> L2c
            r1.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.reflect.Type r1 = r1.f8477     // Catch: java.lang.Throwable -> L2c
            ᲁᲇᲀᛸ r2 = new ᲁᲇᲀᛸ     // Catch: java.lang.Throwable -> L2c
            r2.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r3 = r2.m3369(r3, r1)     // Catch: java.lang.Throwable -> L2c
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L2c
            if (r3 != 0) goto L2b
            return r0
        L2b:
            return r3
        L2c:
            return r0
    }

    private final void loadAdaptedApps() {
            r3 = this;
            com.ss.android.ugc.awemes.MainActivity$AdaptedAppAdapter r0 = r3.adapter
            r1 = -189485651762734(0xffff53a9ef0961d2, double:NaN)
            java.lang.String r1 = "正在读取已安装应用..."
            r0.submitMessage(r1)
            java.lang.Thread r0 = new java.lang.Thread
            ᲁᲈᛳ r1 = new ᲁᲈᛳ
            r2 = 4
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r0.start()
            return
    }

    private static final void loadAdaptedApps$lambda$26(com.ss.android.ugc.awemes.MainActivity r6) {
            java.util.List r0 = r6.loadAdaptationList()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.ss.android.ugc.awemes.MainActivity$ᛷᲁᛳᛳ r3 = (com.ss.android.ugc.awemes.MainActivity.C0009) r3
            java.lang.String r4 = r3.m296()
            boolean r4 = defpackage.AbstractC1347.m2524(r4)
            if (r4 != 0) goto Ld
            java.lang.String r3 = r3.m297()
            boolean r3 = defpackage.AbstractC1347.m2524(r3)
            if (r3 != 0) goto Ld
            r1.add(r2)
            goto Ld
        L32:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L3b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L60
            java.lang.Object r2 = r1.next()
            r3 = r2
            com.ss.android.ugc.awemes.MainActivity$ᛷᲁᛳᛳ r3 = (com.ss.android.ugc.awemes.MainActivity.C0009) r3
            java.lang.String r3 = r3.m296()
            java.lang.Object r4 = r0.get(r3)
            if (r4 != 0) goto L5a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.put(r3, r4)
        L5a:
            java.util.List r4 = (java.util.List) r4
            r4.add(r2)
            goto L3b
        L60:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r2 = r0.size()
            int r2 = defpackage.AbstractC1893.m3323(r2)
            r1.<init>(r2)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L75:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lbd
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = defpackage.AbstractC0575.m1369(r2)
            r4.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L98:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Lac
            java.lang.Object r5 = r2.next()
            com.ss.android.ugc.awemes.MainActivity$ᛷᲁᛳᛳ r5 = (com.ss.android.ugc.awemes.MainActivity.C0009) r5
            java.lang.String r5 = r5.m297()
            r4.add(r5)
            goto L98
        Lac:
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>(r4)
            java.util.List r2 = defpackage.AbstractC1107.m2113(r2)
            java.util.List r2 = defpackage.AbstractC1107.m2111(r2)
            r1.put(r3, r2)
            goto L75
        Lbd:
            java.util.List r0 = r6.loadInstalledApps(r1)
            ᛵᛸᲇ r2 = new ᛵᛸᲇ
            r3 = 1
            r2.<init>(r6, r0, r1, r3)
            r6.runOnUiThread(r2)
            return
    }

    private static final void loadAdaptedApps$lambda$26$lambda$25(com.ss.android.ugc.awemes.MainActivity r2, java.util.List r3, java.util.Map r4) {
            com.ss.android.ugc.awemes.MainActivity$AdaptedAppAdapter r2 = r2.adapter
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L12
            r0 = -192758416842286(0xffff50afef0961d2, double:NaN)
            java.lang.String r4 = "未读取到适配列表"
            goto L1b
        L12:
            r0 = -192797071547950(0xffff50a6ef0961d2, double:NaN)
            java.lang.String r4 = "当前设备没有安装适配列表中的应用"
        L1b:
            r2.submitList(r3, r4)
            return
    }

    private final void loadAdaptedAppsAfterPermissionCheck() {
            r4 = this;
            java.lang.String r0 = "com.android.permission.GET_INSTALLED_APPS"
            ᲁᛱᛲᛳ r1 = defpackage.AbstractC0956.m1904(r0)
            if (r1 == 0) goto L9
            goto L13
        L9:
            ᛷᛱᛸᛵ r1 = new ᛷᛱᛸᛵ
            r1.<init>()
            ᲈᛸᛲᛵ r2 = defpackage.AbstractC0956.f4262
            r2.m3734(r0, r1)
        L13:
            r2 = -189103399673390(0xffff5402ef0961d2, double:NaN)
            r0 = 1
            boolean r0 = r1.mo2347(r4, r0)
            if (r0 == 0) goto L26
            r4.loadAdaptedApps()
            return
        L26:
            com.ss.android.ugc.awemes.MainActivity$AdaptedAppAdapter r0 = r4.adapter
            r2 = -189253723528750(0xffff53dfef0961d2, double:NaN)
            java.lang.String r2 = "需要读取应用列表权限，用于判断已安装应用适配状态"
            r0.submitMessage(r2)
            ᛳᲀᲁᲈ r0 = new ᛳᲀᲁᲈ
            r0.<init>(r4)
            java.lang.Object r2 = r0.f2713
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.remove(r1)
            r2.add(r1)
            ᛶᲈᛱᲈ r1 = new ᛶᲈᛱᲈ
            r1.<init>(r4)
            r0.m1342(r1)
            return
    }

    private final java.util.List<com.ss.android.ugc.awemes.MainActivity.InstalledAdaptedApp> loadInstalledApps(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r7) {
            r6 = this;
            android.content.pm.PackageManager r0 = r6.getPackageManager()
            java.util.List r1 = r6.getInstalledApplications(r0)
            ᛵᲀᛱᲈ r2 = new ᛵᲀᛱᲈ
            r3 = 0
            r2.<init>(r3, r1)
            ᲈᲈᛸᲁ r1 = new ᲈᲈᛸᲁ
            r3 = 4
            r1.<init>(r3, r7)
            ᛷᛵᛵᛶ r4 = new ᛷᛵᛵᛶ
            r5 = 1
            r4.<init>(r2, r5, r1)
            ᛸᲀᛶᛶ r1 = new ᛸᲀᛶᛶ
            r1.<init>(r6, r0, r7, r3)
            ᛱᛷᛷᛲ r6 = new ᛱᛷᛷᛲ
            r7 = 2
            r6.<init>(r4, r1, r7)
            com.ss.android.ugc.awemes.ᛵᛱᛵᛲ r7 = new com.ss.android.ugc.awemes.ᛵᛱᛵᛲ
            r7.<init>()
            com.ss.android.ugc.awemes.ᲇᛸᲁᛱ r0 = new com.ss.android.ugc.awemes.ᲇᛸᲁᛱ
            r0.<init>(r7)
            ᛱᛷᛷᛲ r7 = new ᛱᛷᛷᛲ
            r7.<init>(r6, r0, r5)
            java.util.List r6 = defpackage.AbstractC0591.m1392(r7)
            return r6
    }

    private static final boolean loadInstalledApps$lambda$27(java.util.Map r2, android.content.pm.ApplicationInfo r3) {
            r0 = -192870085991982(0xffff5095ef0961d2, double:NaN)
            java.lang.String r3 = r3.packageName
            boolean r2 = r2.containsKey(r3)
            return r2
    }

    private static final com.ss.android.ugc.awemes.MainActivity.InstalledAdaptedApp loadInstalledApps$lambda$28(com.ss.android.ugc.awemes.MainActivity r12, android.content.pm.PackageManager r13, java.util.Map r14, android.content.pm.ApplicationInfo r15) {
            r0 = -192882970893870(0xffff5092ef0961d2, double:NaN)
            java.lang.String r0 = r15.packageName
            r1 = -192917330632238(0xffff508aef0961d2, double:NaN)
            android.content.pm.PackageInfo r0 = r12.getPackageInfo(r13, r0)
            java.lang.String r1 = r15.packageName
            java.lang.Object r14 = r14.get(r1)
            java.util.List r14 = (java.util.List) r14
            if (r14 != 0) goto L22
            ᲀᛶᲇ r14 = defpackage.C1698.f7558
        L22:
            android.os.Bundle r1 = r15.metaData
            r2 = 0
            if (r1 == 0) goto L3b
            r3 = -192968870239790(0xffff507eef0961d2, double:NaN)
            java.lang.String r3 = "UPDATE_VERSION_CODE"
            java.lang.Object r1 = r1.get(r3)
            if (r1 == 0) goto L3b
            java.lang.String r1 = r1.toString()
            goto L3c
        L3b:
            r1 = r2
        L3c:
            if (r1 != 0) goto L47
            r3 = -193054769585710(0xffff506aef0961d2, double:NaN)
            java.lang.String r1 = ""
        L47:
            r8 = r1
            com.ss.android.ugc.awemes.MainActivity$InstalledAdaptedApp r3 = new com.ss.android.ugc.awemes.MainActivity$InstalledAdaptedApp
            java.lang.CharSequence r1 = r15.loadLabel(r13)
            java.lang.String r4 = r1.toString()
            java.lang.String r5 = r15.packageName
            r6 = -193059064553006(0xffff5069ef0961d2, double:NaN)
            if (r0 == 0) goto L61
            java.lang.String r1 = r0.versionName
            goto L62
        L61:
            r1 = r2
        L62:
            if (r1 != 0) goto L6d
            r6 = -193110604160558(0xffff505def0961d2, double:NaN)
            java.lang.String r1 = ""
        L6d:
            r6 = r1
            if (r0 == 0) goto L74
            java.lang.String r2 = r12.longVersionCodeCompat(r0)
        L74:
            if (r2 != 0) goto L7f
            r0 = -193114899127854(0xffff505cef0961d2, double:NaN)
            java.lang.String r2 = ""
        L7f:
            r7 = r2
            android.graphics.drawable.Drawable r9 = r15.loadIcon(r13)
            r12 = -193119194095150(0xffff505bef0961d2, double:NaN)
            java.util.List r12 = defpackage.AbstractC1107.m2111(r14)
            int r13 = r12.size()
            r15 = 1
            if (r13 > r15) goto L9d
            java.util.List r12 = defpackage.AbstractC1107.m2113(r12)
        L9b:
            r10 = r12
            goto La5
        L9d:
            java.util.List r12 = defpackage.AbstractC1107.m2118(r12)
            java.util.Collections.reverse(r12)
            goto L9b
        La5:
            boolean r12 = defpackage.AbstractC1347.m2524(r8)
            if (r12 != 0) goto Lb3
            boolean r12 = r14.contains(r8)
            if (r12 == 0) goto Lb3
        Lb1:
            r11 = r15
            goto Lb5
        Lb3:
            r15 = 0
            goto Lb1
        Lb5:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r3
    }

    public static /* synthetic */ void log$default(com.ss.android.ugc.awemes.MainActivity r0, java.lang.String r1, java.lang.Throwable r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.log(r1, r2)
            return
    }

    private final java.lang.String longVersionCodeCompat(android.content.pm.PackageInfo r1) {
            r0 = this;
            long r0 = r1.getLongVersionCode()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }

    private final native java.lang.String nativeLoadConfig(java.lang.String r1);

    private static final void onServiceStateChanged$lambda$1(com.ss.android.ugc.awemes.MainActivity r0, defpackage.C1851 r1) {
            r0.currentXposedService = r1
            r0.refreshRunningTargets()
            return
    }

    private final void refreshRunningTargets() {
            r3 = this;
            ᲁᛴᲈᲁ r0 = r3.getApi102ServiceOrNull()
            ᲀᛶᲇ r1 = defpackage.C1698.f7558
            if (r0 == 0) goto L1c
            java.util.List r0 = r0.m3265()     // Catch: java.lang.Throwable -> Ld
            goto L14
        Ld:
            r0 = move-exception
            ᛴᛸᛲᲀ r2 = new ᛴᛸᛲᲀ
            r2.<init>(r0)
            r0 = r2
        L14:
            boolean r2 = r0 instanceof defpackage.C0723
            if (r2 == 0) goto L19
            r0 = r1
        L19:
            java.util.List r0 = (java.util.List) r0
            goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 != 0) goto L20
            goto L21
        L20:
            r1 = r0
        L21:
            r3.runningTargets = r1
            com.ss.android.ugc.awemes.MainActivity$AdaptedAppAdapter r3 = r3.adapter
            r3.notifyDataSetChanged()
            return
    }

    private final android.graphics.drawable.GradientDrawable roundRect(int r1, float r2, java.lang.Integer r3, int r4) {
            r0 = this;
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r0.setColor(r1)
            r0.setCornerRadius(r2)
            if (r3 == 0) goto L16
            if (r4 <= 0) goto L16
            int r1 = r3.intValue()
            r0.setStroke(r4, r1)
        L16:
            return r0
    }

    public static /* synthetic */ android.graphics.drawable.GradientDrawable roundRect$default(com.ss.android.ugc.awemes.MainActivity r0, int r1, float r2, java.lang.Integer r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 4
            if (r6 == 0) goto L5
            r3 = 0
        L5:
            r5 = r5 & 8
            if (r5 == 0) goto La
            r4 = 0
        La:
            android.graphics.drawable.GradientDrawable r0 = r0.roundRect(r1, r2, r3, r4)
            return r0
    }

    private final void setFrameworkBadge(java.lang.String r10, int r11, int r12) {
            r9 = this;
            android.widget.TextView r0 = r9.frameworkBadgeText
            r1 = 0
            if (r0 != 0) goto Le
            r2 = -191130624237102(0xffff522aef0961d2, double:NaN)
            r0 = r1
        Le:
            r0.setText(r10)
            android.widget.TextView r10 = r9.frameworkBadgeText
            if (r10 != 0) goto L1e
            r2 = -191212228615726(0xffff5217ef0961d2, double:NaN)
            r10 = r1
        L1e:
            r10.setTextColor(r11)
            android.widget.TextView r10 = r9.frameworkBadgeText
            if (r10 != 0) goto L2e
            r10 = -191293832994350(0xffff5204ef0961d2, double:NaN)
            goto L2f
        L2e:
            r1 = r10
        L2f:
            r10 = 999(0x3e7, float:1.4E-42)
            float r4 = r9.getDpFloat(r10)
            r7 = 12
            r8 = 0
            r5 = 0
            r6 = 0
            r2 = r9
            r3 = r12
            android.graphics.drawable.GradientDrawable r9 = roundRect$default(r2, r3, r4, r5, r6, r7, r8)
            r1.setBackground(r9)
            return
    }

    private final boolean setLauncherIconVisible(boolean r6) {
            r5 = this;
            r0 = 1
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L14
            android.content.ComponentName r2 = r5.getLauncherAliasComponent()     // Catch: java.lang.Throwable -> L14
            if (r6 == 0) goto Ld
            r6 = r0
            goto Le
        Ld:
            r6 = 2
        Le:
            r1.setComponentEnabledSetting(r2, r6, r0)     // Catch: java.lang.Throwable -> L14
            ᲁᲀᛱᲁ r6 = defpackage.C1907.f8270     // Catch: java.lang.Throwable -> L14
            goto L1b
        L14:
            r6 = move-exception
            ᛴᛸᛲᲀ r1 = new ᛴᛸᛲᲀ
            r1.<init>(r6)
            r6 = r1
        L1b:
            java.lang.Throwable r1 = defpackage.C2165.m3569(r6)
            if (r1 == 0) goto L45
            r2 = -192367574818350(0xffff510aef0961d2, double:NaN)
            java.lang.String r2 = "切换启动器图标失败："
            java.lang.String r1 = r1.getMessage()
            if (r1 != 0) goto L39
            r3 = -192414819458606(0xffff50ffef0961d2, double:NaN)
            java.lang.String r1 = "未知错误"
        L39:
            java.lang.String r1 = r2.concat(r1)
            r2 = 0
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r1, r2)
            r5.show()
        L45:
            boolean r5 = r6 instanceof defpackage.C0723
            r5 = r5 ^ r0
            return r5
    }

    private final void showInstalledAppsPermissionDenied() {
            r2 = this;
            com.ss.android.ugc.awemes.MainActivity$AdaptedAppAdapter r2 = r2.adapter
            r0 = -189361097711150(0xffff53c6ef0961d2, double:NaN)
            java.lang.String r0 = "未授予读取应用列表权限，无法判断当前设备已安装的适配应用"
            r2.submitMessage(r0)
            return
    }

    private final void updateFrameworkStatusCard() {
            r11 = this;
            android.widget.TextView r0 = r11.frameworkStatusText
            if (r0 != 0) goto L5
            return
        L5:
            ᲁᛴᲈᲁ r0 = r11.currentXposedService
            r1 = 0
            if (r0 != 0) goto L81
            r2 = -189627385683502(0xffff5388ef0961d2, double:NaN)
            java.lang.String r0 = "未激活"
            r2 = -189644565552686(0xffff5384ef0961d2, double:NaN)
            java.lang.String r2 = "#D46B08"
            int r2 = r11.color(r2)
            r3 = -189678925291054(0xffff537cef0961d2, double:NaN)
            java.lang.String r3 = "#FFF4E8"
            int r3 = r11.color(r3)
            r11.setFrameworkBadge(r0, r2, r3)
            android.widget.TextView r0 = r11.frameworkStatusText
            if (r0 != 0) goto L3d
            r2 = -189713285029422(0xffff5374ef0961d2, double:NaN)
            r0 = r1
        L3d:
            r2 = -189799184375342(0xffff5360ef0961d2, double:NaN)
            java.lang.String r2 = "未连接到 Xposed 服务"
            r0.setText(r2)
            android.widget.TextView r0 = r11.frameworkStatusText
            if (r0 != 0) goto L56
            r2 = -189863608884782(0xffff5351ef0961d2, double:NaN)
            r0 = r1
        L56:
            r2 = -189949508230702(0xffff533def0961d2, double:NaN)
            java.lang.String r2 = "#D46B08"
            int r2 = r11.color(r2)
            r0.setTextColor(r2)
            android.widget.TextView r11 = r11.frameworkDetailText
            if (r11 != 0) goto L73
            r2 = -189983867969070(0xffff5335ef0961d2, double:NaN)
            goto L74
        L73:
            r1 = r11
        L74:
            r2 = -190069767314990(0xffff5321ef0961d2, double:NaN)
            java.lang.String r11 = "模块版本：260629161700\n请在 LSPosed 或兼容框架中启用模块并配置作用域"
            r1.setText(r11)
            return
        L81:
            java.lang.String r2 = r0.m3264()     // Catch: java.lang.Throwable -> L115
            r3 = -190267335810606(0xffff52f3ef0961d2, double:NaN)
            java.lang.String r3 = r0.m3261()     // Catch: java.lang.Throwable -> L115
            r4 = -190361825091118(0xffff52ddef0961d2, double:NaN)
            long r4 = r0.m3260()     // Catch: java.lang.Throwable -> L115
            int r6 = r0.m3263()     // Catch: java.lang.Throwable -> L115
            long r7 = r0.m3262()     // Catch: java.lang.Throwable -> L115
            java.util.ArrayList r0 = r0.m3266()     // Catch: java.lang.Throwable -> L115
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L115
            ᲁᛴᛲᛲ r9 = new ᲁᛴᛲᛲ     // Catch: java.lang.Throwable -> L115
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L115
            r10.<init>()     // Catch: java.lang.Throwable -> L115
            r10.append(r2)     // Catch: java.lang.Throwable -> L115
            r2 = 32
            r10.append(r2)     // Catch: java.lang.Throwable -> L115
            r10.append(r3)     // Catch: java.lang.Throwable -> L115
            r2 = -190469199273518(0xffff52c4ef0961d2, double:NaN)
            java.lang.String r2 = " ("     // Catch: java.lang.Throwable -> L115
            r10.append(r2)     // Catch: java.lang.Throwable -> L115
            r10.append(r4)     // Catch: java.lang.Throwable -> L115
            r2 = 41
            r10.append(r2)     // Catch: java.lang.Throwable -> L115
            java.lang.String r2 = r10.toString()     // Catch: java.lang.Throwable -> L115
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L115
            r3.<init>()     // Catch: java.lang.Throwable -> L115
            r4 = -190482084175406(0xffff52c1ef0961d2, double:NaN)
            java.lang.String r4 = "API "     // Catch: java.lang.Throwable -> L115
            r3.append(r4)     // Catch: java.lang.Throwable -> L115
            r3.append(r6)     // Catch: java.lang.Throwable -> L115
            r4 = -190503559011886(0xffff52bcef0961d2, double:NaN)
            java.lang.String r4 = " · 作用域 "     // Catch: java.lang.Throwable -> L115
            r3.append(r4)     // Catch: java.lang.Throwable -> L115
            r3.append(r0)     // Catch: java.lang.Throwable -> L115
            r4 = -190537918750254(0xffff52b4ef0961d2, double:NaN)
            java.lang.String r0 = " 个应用 · "     // Catch: java.lang.Throwable -> L115
            r3.append(r0)     // Catch: java.lang.Throwable -> L115
            java.lang.String r0 = r11.formatFrameworkCapabilities(r7)     // Catch: java.lang.Throwable -> L115
            r3.append(r0)     // Catch: java.lang.Throwable -> L115
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L115
            r9.<init>(r2, r0)     // Catch: java.lang.Throwable -> L115
            goto L11b
        L115:
            r0 = move-exception
            ᛴᛸᛲᲀ r9 = new ᛴᛸᛲᲀ
            r9.<init>(r0)
        L11b:
            java.lang.Throwable r0 = defpackage.C2165.m3569(r9)
            if (r0 != 0) goto L122
            goto L14c
        L122:
            ᲁᛴᛲᛲ r9 = new ᲁᛴᛲᛲ
            r2 = -190572278488622(0xffff52acef0961d2, double:NaN)
            java.lang.String r2 = "框架服务已连接"
            r3 = -190606638226990(0xffff52a4ef0961d2, double:NaN)
            java.lang.String r3 = "读取框架信息失败："
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L145
            r4 = -190649587899950(0xffff529aef0961d2, double:NaN)
            java.lang.String r0 = "未知错误"
        L145:
            java.lang.String r0 = r3.concat(r0)
            r9.<init>(r2, r0)
        L14c:
            ᲁᛴᛲᛲ r9 = (defpackage.C1841) r9
            r2 = -190671062736430(0xffff5295ef0961d2, double:NaN)
            java.lang.String r0 = "已激活"
            r2 = -190688242605614(0xffff5291ef0961d2, double:NaN)
            java.lang.String r2 = "#0E9F6E"
            int r2 = r11.color(r2)
            r3 = -190722602343982(0xffff5289ef0961d2, double:NaN)
            java.lang.String r3 = "#E8F7F0"
            int r3 = r11.color(r3)
            r11.setFrameworkBadge(r0, r2, r3)
            android.widget.TextView r0 = r11.frameworkStatusText
            if (r0 != 0) goto L181
            r2 = -190756962082350(0xffff5281ef0961d2, double:NaN)
            r0 = r1
        L181:
            java.lang.String r2 = r9.f8037
            r0.setText(r2)
            android.widget.TextView r0 = r11.frameworkStatusText
            if (r0 != 0) goto L193
            r2 = -190842861428270(0xffff526def0961d2, double:NaN)
            r0 = r1
        L193:
            r2 = -190928760774190(0xffff5259ef0961d2, double:NaN)
            java.lang.String r2 = "#0E9F6E"
            int r2 = r11.color(r2)
            r0.setTextColor(r2)
            android.widget.TextView r11 = r11.frameworkDetailText
            if (r11 != 0) goto L1b0
            r2 = -190963120512558(0xffff5251ef0961d2, double:NaN)
            goto L1b1
        L1b0:
            r1 = r11
        L1b1:
            r2 = -191049019858478(0xffff523def0961d2, double:NaN)
            java.lang.String r11 = "模块版本：260629161700\n"
            java.lang.String r0 = r9.f8038
            java.lang.String r11 = r11.concat(r0)
            r1.setText(r11)
            return
    }

    private final void updateLauncherIconCard() {
            r5 = this;
            boolean r0 = r5.isLauncherIconShowing()
            r1 = 1
            r5.refreshingLauncherIconSwitch = r1
            android.widget.Switch r1 = r5.launcherIconSwitch
            r2 = 0
            if (r1 != 0) goto L15
            r3 = -191800639135278(0xffff518eef0961d2, double:NaN)
            r1 = r2
        L15:
            r1.setChecked(r0)
            android.widget.Switch r1 = r5.launcherIconSwitch
            if (r1 != 0) goto L25
            r3 = -191882243513902(0xffff517bef0961d2, double:NaN)
            r1 = r2
        L25:
            if (r0 == 0) goto L31
            r3 = -191963847892526(0xffff5168ef0961d2, double:NaN)
        L2c:
            java.lang.String r3 = "显示"
            goto L37
        L31:
            r3 = -191976732794414(0xffff5165ef0961d2, double:NaN)
            goto L2c
        L37:
            r1.setText(r3)
            r1 = 0
            r5.refreshingLauncherIconSwitch = r1
            android.widget.TextView r1 = r5.launcherIconStatusText
            if (r1 != 0) goto L4a
            r3 = -191989617696302(0xffff5162ef0961d2, double:NaN)
            r1 = r2
        L4a:
            if (r0 == 0) goto L56
            r3 = -192088401944110(0xffff514bef0961d2, double:NaN)
            java.lang.String r3 = "当前状态：桌面图标已显示"
            goto L5f
        L56:
            r3 = -192144236518958(0xffff513eef0961d2, double:NaN)
            java.lang.String r3 = "当前状态：桌面图标已隐藏"
        L5f:
            r1.setText(r3)
            android.widget.TextView r1 = r5.launcherIconStatusText
            if (r1 != 0) goto L6f
            r3 = -192200071093806(0xffff5131ef0961d2, double:NaN)
            goto L70
        L6f:
            r2 = r1
        L70:
            if (r0 == 0) goto L80
            r0 = -192298855341614(0xffff511aef0961d2, double:NaN)
        L77:
            java.lang.String r0 = "#0E9F6E"
            int r5 = r5.color(r0)
            goto L86
        L80:
            r0 = -192333215079982(0xffff5112ef0961d2, double:NaN)
            goto L77
        L86:
            r2.setTextColor(r5)
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static /* synthetic */ defpackage.C2300 m286(com.ss.android.ugc.awemes.MainActivity r0, android.view.View r1, defpackage.C2300 r2) {
            ᲈᛸᛱᲀ r0 = createContentView$lambda$4(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static /* synthetic */ android.content.ComponentName m287(com.ss.android.ugc.awemes.MainActivity r0) {
            android.content.ComponentName r0 = launcherAliasComponent_delegate$lambda$0(r0)
            return r0
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static /* synthetic */ boolean m288(java.util.Map r0, android.content.pm.ApplicationInfo r1) {
            boolean r0 = loadInstalledApps$lambda$27(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static /* synthetic */ com.ss.android.ugc.awemes.MainActivity.InstalledAdaptedApp m289(com.ss.android.ugc.awemes.MainActivity r0, android.content.pm.PackageManager r1, java.util.Map r2, android.content.pm.ApplicationInfo r3) {
            com.ss.android.ugc.awemes.MainActivity$InstalledAdaptedApp r0 = loadInstalledApps$lambda$28(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static /* synthetic */ void m290(com.ss.android.ugc.awemes.MainActivity r0, android.widget.CompoundButton r1, boolean r2) {
            createLauncherIconCard$lambda$20$lambda$19(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static /* synthetic */ void m291(com.ss.android.ugc.awemes.MainActivity r0, java.util.List r1, java.util.LinkedHashMap r2) {
            loadAdaptedApps$lambda$26$lambda$25(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static /* synthetic */ void m292(com.ss.android.ugc.awemes.MainActivity r0) {
            loadAdaptedApps$lambda$26(r0)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static /* synthetic */ void m293(com.ss.android.ugc.awemes.MainActivity r0, defpackage.C1851 r1) {
            onServiceStateChanged$lambda$1(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static /* synthetic */ void m294(com.ss.android.ugc.awemes.MainActivity r0, defpackage.C0195 r1) {
            hotReloadApp$lambda$42$lambda$41$lambda$40(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static /* synthetic */ void m295(com.ss.android.ugc.awemes.MainActivity r0, defpackage.C1226 r1, defpackage.C0195 r2) {
            hotReloadApp$lambda$42$lambda$41(r0, r1, r2)
            return
    }

    public final void log(java.lang.String r3, java.lang.Throwable r4) {
            r2 = this;
            r0 = -187840679288366(0xffff5528ef0961d2, double:NaN)
            r0 = -187875039026734(0xffff5520ef0961d2, double:NaN)
            java.lang.String r2 = "dyyds"
            android.util.Log.d(r2, r3, r4)
            return
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            r0 = -187900808830510(0xffff551aef0961d2, double:NaN)
            java.lang.String r3 = "native"
            java.lang.System.loadLibrary(r3)
            android.view.Window r3 = r2.getWindow()
            r0 = -187930873601582(0xffff5513ef0961d2, double:NaN)
            java.lang.String r0 = "#F7F8FA"
            int r0 = r2.color(r0)
            r3.setStatusBarColor(r0)
            android.view.Window r3 = r2.getWindow()
            android.view.View r3 = r3.getDecorView()
            r0 = 8192(0x2000, float:1.148E-41)
            r3.setSystemUiVisibility(r0)
            android.view.View r3 = r2.createContentView()
            r2.setContentView(r3)
            r2.loadAdaptedAppsAfterPermissionCheck()
            return
    }

    @Override // defpackage.InterfaceC1221
    public void onServiceStateChanged(defpackage.C1851 r3) {
            r2 = this;
            ᛸᛳᛴᲁ r0 = new ᛸᛳᛴᲁ
            r1 = 6
            r0.<init>(r2, r1, r3)
            r2.runOnUiThread(r0)
            return
    }

    @Override // android.app.Activity
    public void onStart() {
            r2 = this;
            super.onStart()
            ᲁᛴᲈᲁ r0 = com.ss.android.ugc.awemes.MainApp.f424
            r0 = -733035237908014(0xfffd654eef0961d2, double:NaN)
            java.util.concurrent.CopyOnWriteArraySet r0 = com.ss.android.ugc.awemes.MainApp.f423
            r0.add(r2)
            ᲁᛴᲈᲁ r1 = com.ss.android.ugc.awemes.MainApp.f424
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L1d
            r2.onServiceStateChanged(r1)
        L1d:
            return
    }

    @Override // android.app.Activity
    public void onStop() {
            r2 = this;
            ᲁᛴᲈᲁ r0 = com.ss.android.ugc.awemes.MainApp.f424
            r0 = -733073892613678(0xfffd6545ef0961d2, double:NaN)
            java.util.concurrent.CopyOnWriteArraySet r0 = com.ss.android.ugc.awemes.MainApp.f423
            r0.remove(r2)
            super.onStop()
            return
    }
}
