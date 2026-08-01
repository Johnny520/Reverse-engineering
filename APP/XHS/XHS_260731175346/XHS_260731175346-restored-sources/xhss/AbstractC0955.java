package xhss;

/* JADX INFO: renamed from: xhss.ᲁᛵᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0955 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final float[][] f3096 = null;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final float[] f3097 = null;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final xhss.C0623 f3098 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final float[][] f3099 = null;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final float[][] f3100 = null;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static xhss.C0623 f3101;

    static {
            r0 = 3
            float[] r1 = new float[r0]
            r1 = {x0050: FILL_ARRAY_DATA , data: [1053652383, 1059484093, -1118648123} // fill-array
            float[] r2 = new float[r0]
            r2 = {x005a: FILL_ARRAY_DATA , data: [-1098898655, 1067067965, 1027330407} // fill-array
            float[] r3 = new float[r0]
            r3 = {x0064: FILL_ARRAY_DATA , data: [-1157087275, 1028162020, 1064566818} // fill-array
            float[][] r1 = new float[][]{r1, r2, r3}
            xhss.AbstractC0955.f3099 = r1
            float[] r1 = new float[r0]
            r1 = {x006e: FILL_ARRAY_DATA , data: [1072584765, -1082036021, 1041810539} // fill-array
            float[] r2 = new float[r0]
            r2 = {x0078: FILL_ARRAY_DATA , data: [1053190625, 1059002158, -1139603558} // fill-array
            float[] r3 = new float[r0]
            r3 = {x0082: FILL_ARRAY_DATA , data: [-1132345847, -1123302273, 1065772348} // fill-array
            float[][] r1 = new float[][]{r1, r2, r3}
            xhss.AbstractC0955.f3096 = r1
            float[] r1 = new float[r0]
            r1 = {x008c: FILL_ARRAY_DATA , data: [1119754256, 1120403456, 1121567769} // fill-array
            xhss.AbstractC0955.f3097 = r1
            float[] r1 = new float[r0]
            r1 = {x0096: FILL_ARRAY_DATA , data: [1054023191, 1052187149, 1043912633} // fill-array
            float[] r2 = new float[r0]
            r2 = {x00a0: FILL_ARRAY_DATA , data: [1046066128, 1060575065, 1033100696} // fill-array
            float[] r0 = new float[r0]
            r0 = {x00aa: FILL_ARRAY_DATA , data: [1017006063, 1039404073, 1064520140} // fill-array
            float[][] r0 = new float[][]{r1, r2, r0}
            xhss.AbstractC0955.f3100 = r0
            xhss.ᛷᛱᛳᲁ r0 = new xhss.ᛷᛱᛳᲁ
            r1 = 0
            r0.<init>(r1, r1, r1)
            xhss.AbstractC0955.f3098 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static void m1551(int r5) {
            r0 = 2
            if (r0 > r5) goto L8
            r1 = 37
            if (r5 >= r1) goto L8
            return
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            xhss.ᛱᛲᲇᲀ r2 = new xhss.ᛱᛲᲇᲀ
            r3 = 36
            r4 = 1
            r2.<init>(r0, r3, r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "radix "
            r0.<init>(r3)
            r0.append(r5)
            java.lang.String r5 = " was not in valid range "
            r0.append(r5)
            r0.append(r2)
            java.lang.String r5 = r0.toString()
            r1.<init>(r5)
            throw r1
    }

    /* JADX INFO: renamed from: ᛳᛶᛷᲀ, reason: contains not printable characters */
    public static float m1552() {
            r0 = 4603300005328146291(0x3fe234f72c234f73, double:0.5689655172413793)
            r2 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r0 = java.lang.Math.pow(r0, r2)
            float r0 = (float) r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r1
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final boolean m1553(char r2, char r3, boolean r4) {
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            r1 = 0
            if (r4 != 0) goto L8
            return r1
        L8:
            char r2 = java.lang.Character.toUpperCase(r2)
            char r3 = java.lang.Character.toUpperCase(r3)
            if (r2 == r3) goto L1e
            char r2 = java.lang.Character.toLowerCase(r2)
            char r3 = java.lang.Character.toLowerCase(r3)
            if (r2 != r3) goto L1d
            goto L1e
        L1d:
            return r1
        L1e:
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public static xhss.C0985[] m1554(int r3) {
            xhss.ᲁᲁᛱᲀ[] r0 = new xhss.C0985[r3]
            r1 = 0
        L3:
            if (r1 >= r3) goto Lf
            xhss.ᲁᲁᛱᲀ r2 = new xhss.ᲁᲁᛱᲀ
            r2.<init>()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L3
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public static final java.lang.Object m1555(xhss.C0333 r1, xhss.C0333 r2, xhss.InterfaceC0517 r3) {
            r0 = r3
            xhss.ᛷᛲᛳᛴ r0 = (xhss.AbstractC0631) r0     // Catch: java.lang.Throwable -> Lb
            xhss.AbstractC0060.m179(r0)     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r3.mo115(r2, r1)     // Catch: java.lang.Throwable -> Lb
            goto L13
        Lb:
            r2 = move-exception
            xhss.ᛷᲁᲇᛷ r3 = new xhss.ᛷᲁᲇᛷ
            r0 = 0
            r3.<init>(r2, r0)
            r2 = r3
        L13:
            xhss.ᛸᛴᛸᲈ r3 = xhss.EnumC0757.f2533
            if (r2 != r3) goto L18
            goto L33
        L18:
            java.lang.Object r1 = r1.m1335(r2)
            xhss.ᛶᛲᛷᛵ r2 = xhss.AbstractC0485.f1784
            if (r1 != r2) goto L21
            goto L33
        L21:
            boolean r2 = r1 instanceof xhss.C0711
            if (r2 != 0) goto L34
            boolean r2 = r1 instanceof xhss.C0853
            if (r2 == 0) goto L2d
            r2 = r1
            xhss.ᲀᛳᲈᛳ r2 = (xhss.C0853) r2
            goto L2e
        L2d:
            r2 = 0
        L2e:
            if (r2 == 0) goto L32
            xhss.ᛲᲀᛵᛳ r1 = r2.f2763
        L32:
            r3 = r1
        L33:
            return r3
        L34:
            xhss.ᛷᲁᲇᛷ r1 = (xhss.C0711) r1
            java.lang.Throwable r1 = r1.f2385
            throw r1
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public static float m1556(android.widget.EdgeEffect r2, float r3, float r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            float r2 = xhss.AbstractC0621.m1082(r2, r3, r4)
            return r2
        Lb:
            r2.onPull(r3, r4)
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static xhss.C0277 m1557() {
            r0 = 0
            java.lang.reflect.Method r1 = xhss.C0614.f2113     // Catch: java.lang.Exception -> L37
            if (r1 != 0) goto L6
            return r0
        L6:
            int r2 = xhss.AbstractC1080.f3479     // Catch: java.lang.Exception -> L37
            java.lang.Class r2 = r1.getDeclaringClass()     // Catch: java.lang.Exception -> L37
            r3 = -230489881675845(0xffff2e5ee47a77bb, double:NaN)
        /* removed unused decoded string */ // Catch: java.lang.Exception -> L37
            xhss.ᲇᛵᛲᲁ r2 = xhss.C0915.m1504(r2)     // Catch: java.lang.Exception -> L37
            xhss.ᛵᛸᲈᛲ r2 = r2.m1695()     // Catch: java.lang.Exception -> L37
            java.lang.Class r3 = r1.getDeclaringClass()     // Catch: java.lang.Exception -> L37
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L37
            r2.f1862 = r3     // Catch: java.lang.Exception -> L37
            java.util.List r2 = r2.m920()     // Catch: java.lang.Exception -> L37
            java.lang.Object r2 = xhss.AbstractC0713.m1240(r2)     // Catch: java.lang.Exception -> L37
            xhss.ᛸᛴᲁᛸ r2 = (xhss.C0759) r2     // Catch: java.lang.Exception -> L37
            if (r2 == 0) goto L39
            java.lang.Object r2 = r2.m1302()     // Catch: java.lang.Exception -> L37
            goto L3a
        L37:
            r1 = move-exception
            goto L7d
        L39:
            r2 = r0
        L3a:
            java.lang.Object r1 = r1.invoke(r2, r0)     // Catch: java.lang.Exception -> L37
            xhss.ᛳᛵᲁᲀ r2 = new xhss.ᛳᛵᲁᲀ     // Catch: java.lang.Exception -> L37
            xhss.ᲇᲁᛱᛸ r3 = xhss.C1085.f3497     // Catch: java.lang.Exception -> L37
            r4 = -230588665923653(0xffff2e47e47a77bb, double:NaN)
            java.lang.String r4 = "registerTime"     // Catch: java.lang.Exception -> L37
            r3.getClass()     // Catch: java.lang.Exception -> L37
            java.lang.String r3 = xhss.C1085.m1753(r1, r4)     // Catch: java.lang.Exception -> L37
            r4 = -230644500498501(0xffff2e3ae47a77bb, double:NaN)
            java.lang.String r4 = "redId"     // Catch: java.lang.Exception -> L37
            java.lang.String r4 = xhss.C1085.m1753(r1, r4)     // Catch: java.lang.Exception -> L37
            r5 = -230670270302277(0xffff2e34e47a77bb, double:NaN)
            java.lang.String r5 = "nickname"     // Catch: java.lang.Exception -> L37
            java.lang.String r5 = xhss.C1085.m1753(r1, r5)     // Catch: java.lang.Exception -> L37
            r6 = -230708925007941(0xffff2e2be47a77bb, double:NaN)
            java.lang.String r6 = "userid"     // Catch: java.lang.Exception -> L37
            java.lang.String r1 = xhss.C1085.m1753(r1, r6)     // Catch: java.lang.Exception -> L37
            r2.<init>(r3, r4, r5, r1)     // Catch: java.lang.Exception -> L37
            return r2
        L7d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = -230738989779013(0xffff2e24e47a77bb, double:NaN)
            java.lang.String r3 = "getCurrentUserInfo error "
            r2.<init>(r3)
            java.lang.String r3 = r1.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = -278279982778437(0xffff02e7e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r3 = -278314342516805(0xffff02dfe47a77bb, double:NaN)
        /* removed unused decoded string */ 
            xhss.ᲇᲁᛱᛸ r3 = xhss.C1085.f3497
            r3.getClass()
            xhss.C1085.m1764(r2, r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static void m1558(xhss.C0962 r12, xhss.C0843 r13) {
            int r13 = r13.f2741
            r0 = 12
            if (r13 != r0) goto L8
            r13 = 10
        L8:
            switch(r13) {
                case 1: goto L6e;
                case 2: goto L60;
                case 3: goto L52;
                case 4: goto L44;
                case 5: goto L36;
                case 6: goto L28;
                case 7: goto L1a;
                case 8: goto Lc;
                default: goto Lb;
            }
        Lb:
            return
        Lc:
            java.lang.String r4 = "(D)Ljava/lang/Double;"
            r5 = 0
            r1 = 184(0xb8, float:2.58E-43)
            java.lang.String r2 = "java/lang/Double"
            java.lang.String r3 = "valueOf"
            r0 = r12
            r0.m1584(r1, r2, r3, r4, r5)
            return
        L1a:
            r6 = r12
            java.lang.String r10 = "(J)Ljava/lang/Long;"
            r11 = 0
            r7 = 184(0xb8, float:2.58E-43)
            java.lang.String r8 = "java/lang/Long"
            java.lang.String r9 = "valueOf"
            r6.m1584(r7, r8, r9, r10, r11)
            return
        L28:
            r6 = r12
            java.lang.String r10 = "(F)Ljava/lang/Float;"
            r11 = 0
            r7 = 184(0xb8, float:2.58E-43)
            java.lang.String r8 = "java/lang/Float"
            java.lang.String r9 = "valueOf"
            r6.m1584(r7, r8, r9, r10, r11)
            return
        L36:
            r6 = r12
            java.lang.String r10 = "(I)Ljava/lang/Integer;"
            r11 = 0
            r7 = 184(0xb8, float:2.58E-43)
            java.lang.String r8 = "java/lang/Integer"
            java.lang.String r9 = "valueOf"
            r6.m1584(r7, r8, r9, r10, r11)
            return
        L44:
            r6 = r12
            java.lang.String r10 = "(S)Ljava/lang/Short;"
            r11 = 0
            r7 = 184(0xb8, float:2.58E-43)
            java.lang.String r8 = "java/lang/Short"
            java.lang.String r9 = "valueOf"
            r6.m1584(r7, r8, r9, r10, r11)
            return
        L52:
            r6 = r12
            java.lang.String r10 = "(B)Ljava/lang/Byte;"
            r11 = 0
            r7 = 184(0xb8, float:2.58E-43)
            java.lang.String r8 = "java/lang/Byte"
            java.lang.String r9 = "valueOf"
            r6.m1584(r7, r8, r9, r10, r11)
            return
        L60:
            r6 = r12
            java.lang.String r10 = "(C)Ljava/lang/Character;"
            r11 = 0
            r7 = 184(0xb8, float:2.58E-43)
            java.lang.String r8 = "java/lang/Character"
            java.lang.String r9 = "valueOf"
            r6.m1584(r7, r8, r9, r10, r11)
            return
        L6e:
            r6 = r12
            java.lang.String r10 = "(Z)Ljava/lang/Boolean;"
            r11 = 0
            r7 = 184(0xb8, float:2.58E-43)
            java.lang.String r8 = "java/lang/Boolean"
            java.lang.String r9 = "valueOf"
            r6.m1584(r7, r8, r9, r10, r11)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public static float m1559(int r6) {
            float r6 = (float) r6
            r0 = 1132396544(0x437f0000, float:255.0)
            float r6 = r6 / r0
            r0 = 1025879782(0x3d25aee6, float:0.04045)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r1 = 1120403456(0x42c80000, float:100.0)
            if (r0 > 0) goto L13
            r0 = 1095678034(0x414eb852, float:12.92)
            float r6 = r6 / r0
        L11:
            float r6 = r6 * r1
            return r6
        L13:
            r0 = 1029785518(0x3d6147ae, float:0.055)
            float r6 = r6 + r0
            r0 = 1065814589(0x3f870a3d, float:1.055)
            float r6 = r6 / r0
            double r2 = (double) r6
            r4 = 4612586738567610368(0x4003333340000000, double:2.4000000953674316)
            double r2 = java.lang.Math.pow(r2, r4)
            float r6 = (float) r2
            goto L11
    }

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public static void m1560(android.content.Context r14) {
            r0 = -11931880884293(0xfffff525e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            xhss.ᲇᲁᛱᛸ r0 = xhss.C1085.f3497
            r0.getClass()
            xhss.C1085.m1752(r14)
            xhss.ᛳᛵᲁᲀ r7 = m1557()
            if (r7 != 0) goto L23
            r0 = -11966240622661(0xfffff51de47a77bb, double:NaN)
            java.lang.String r14 = "获取登录账号失败."
            xhss.C1085.m1766(r14)
            return
        L23:
            java.lang.String r4 = r7.f1070
            if (r4 == 0) goto L114
            boolean r0 = xhss.AbstractC0120.m342(r4)
            if (r0 == 0) goto L2f
            goto L114
        L2f:
            java.lang.String r0 = r7.f1071
            if (r0 == 0) goto L114
            boolean r0 = xhss.AbstractC0120.m342(r0)
            if (r0 == 0) goto L3b
            goto L114
        L3b:
            xhss.C1085.m1752(r14)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r14)
            r1 = -12052139968581(0xfffff509e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r1 = 0
            r2 = 1678442524(0x640b001c, float:1.0256421E22)
            r3 = 0
            android.view.View r0 = r0.inflate(r2, r1, r3)
            r1 = 1678245970(0x64080052, float:1.0035121E22)
            android.view.View r2 = xhss.AbstractC0775.m1320(r0, r1)
            r10 = r2
            android.widget.Button r10 = (android.widget.Button) r10
            if (r10 == 0) goto Lfb
            r1 = 1678245971(0x64080053, float:1.0035122E22)
            android.view.View r2 = xhss.AbstractC0775.m1320(r0, r1)
            r11 = r2
            android.widget.Button r11 = (android.widget.Button) r11
            if (r11 == 0) goto Lfb
            r1 = 1678246005(0x64080075, float:1.003516E22)
            android.view.View r2 = xhss.AbstractC0775.m1320(r0, r1)
            r12 = r2
            android.widget.EditText r12 = (android.widget.EditText) r12
            if (r12 == 0) goto Lfb
            r1 = 1678246172(0x6408011c, float:1.0035349E22)
            android.view.View r2 = xhss.AbstractC0775.m1320(r0, r1)
            r13 = r2
            android.widget.TextView r13 = (android.widget.TextView) r13
            if (r13 == 0) goto Lfb
            r1 = 1678246174(0x6408011e, float:1.0035351E22)
            android.view.View r2 = xhss.AbstractC0775.m1320(r0, r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto Lfb
            r1 = 1678246176(0x64080120, float:1.0035353E22)
            android.view.View r2 = xhss.AbstractC0775.m1320(r0, r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto Lfb
            xhss.ᲁᲀᛸᛶ r2 = new xhss.ᲁᲀᛸᛶ
            r9 = r0
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13)
            r0 = -12095089641541(0xfffff4ffe47a77bb, double:NaN)
        /* removed unused decoded string */ 
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r1 = 1678639270(0x640e00a6, float:1.0477938E22)
            r0.<init>(r14, r1)
            android.app.AlertDialog$Builder r0 = r0.setView(r9)
            android.app.AlertDialog r6 = r0.create()
            r6.setCancelable(r3)
            android.view.Window r0 = r6.getWindow()
            if (r0 == 0) goto Lc9
            r1 = 17170445(0x106000d, float:2.461195E-38)
            r0.setBackgroundDrawableResource(r1)
        Lc9:
            r6.show()
            xhss.ᲇᲇᛷᲈ r0 = new xhss.ᲇᲇᛷᲈ
            r0.<init>(r3, r6)
            r10.setOnClickListener(r0)
            r0 = -12180988987461(0xfffff4ebe47a77bb, double:NaN)
            java.lang.String r0 = "当前账号："
            java.lang.String r0 = r0.concat(r4)
            r13.setText(r0)
            xhss.ᛸᛸᛲᲁ r0 = new xhss.ᛸᛸᛲᲁ
            r0.<init>(r4, r7, r14)
            r13.setOnLongClickListener(r0)
            xhss.ᛶᛵᲈᛱ r5 = new xhss.ᛶᛵᲈᛱ
            r5.<init>()
            xhss.ᛴᛳᛷᛲ r1 = new xhss.ᛴᛳᛷᛲ
            r3 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r11.setOnClickListener(r1)
            return
        Lfb:
            android.content.res.Resources r14 = r0.getResources()
            java.lang.String r14 = r14.getResourceName(r1)
            r0 = -355683883386949(0xfffebc81e47a77bb, double:NaN)
            java.lang.String r0 = "Missing required view with ID: "
            java.lang.String r14 = r0.concat(r14)
            xhss.C0532.m953(r14)
            return
        L114:
            r0 = -12009190295621(0xfffff513e47a77bb, double:NaN)
            java.lang.String r14 = "获取登录账号失败."
            xhss.C1085.m1766(r14)
            return
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static xhss.C0857 m1561() {
            xhss.ᛳᛵᲁᲀ r0 = m1557()     // Catch: java.lang.Exception -> L28
            xhss.ᲀᛴᛳᛸ r1 = new xhss.ᲀᛴᛳᛸ     // Catch: java.lang.Exception -> L28
            if (r0 == 0) goto Lc
            java.lang.String r2 = r0.f1070     // Catch: java.lang.Exception -> L28
            if (r2 != 0) goto L15
        Lc:
            r2 = -230391097428037(0xffff2e75e47a77bb, double:NaN)
            java.lang.String r2 = ""     // Catch: java.lang.Exception -> L28
        L15:
            if (r0 == 0) goto L1b
            java.lang.String r0 = r0.f1071     // Catch: java.lang.Exception -> L28
            if (r0 != 0) goto L24
        L1b:
            r3 = -230395392395333(0xffff2e74e47a77bb, double:NaN)
            java.lang.String r0 = ""     // Catch: java.lang.Exception -> L28
        L24:
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> L28
            return r1
        L28:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = -230399687362629(0xffff2e73e47a77bb, double:NaN)
            java.lang.String r2 = "getUserInfo error "
            r1.<init>(r2)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = -278279982778437(0xffff02e7e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r2 = -278314342516805(0xffff02dfe47a77bb, double:NaN)
        /* removed unused decoded string */ 
            xhss.ᲇᲁᛱᛸ r2 = xhss.C1085.f3497
            r2.getClass()
            xhss.C1085.m1764(r1, r0)
            xhss.ᲀᛴᛳᛸ r0 = new xhss.ᲀᛴᛳᛸ
            r1 = -230481291741253(0xffff2e60e47a77bb, double:NaN)
            java.lang.String r1 = ""
            r2 = -230485586708549(0xffff2e5fe47a77bb, double:NaN)
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static java.lang.String m1562() {
            xhss.ᛳᛵᲁᲀ r0 = m1557()     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto Lc
            java.lang.String r0 = r0.f1073     // Catch: java.lang.Exception -> L16
            if (r0 != 0) goto Lb
            goto Lc
        Lb:
            return r0
        Lc:
            r0 = -230850658928709(0xffff2e0ae47a77bb, double:NaN)
            java.lang.String r0 = ""     // Catch: java.lang.Exception -> L16
            return r0
        L16:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = -230854953896005(0xffff2e09e47a77bb, double:NaN)
            java.lang.String r2 = "getUserId error "
            r1.<init>(r2)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = -278279982778437(0xffff02e7e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r2 = -278314342516805(0xffff02dfe47a77bb, double:NaN)
        /* removed unused decoded string */ 
            xhss.ᲇᲁᛱᛸ r2 = xhss.C1085.f3497
            r2.getClass()
            xhss.C1085.m1764(r1, r0)
            r0 = -230927968340037(0xffff2df8e47a77bb, double:NaN)
            java.lang.String r0 = ""
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public static xhss.C0481 m1563(java.lang.String r8) {
            java.lang.String r0 = "HTTP/1."
            r1 = 0
            boolean r0 = xhss.AbstractC0226.m492(r8, r0, r1)
            r2 = 4
            xhss.ᲈᛲᛵᛴ r3 = xhss.EnumC1122.f3614
            xhss.ᲈᛲᛵᛴ r4 = xhss.EnumC1122.f3620
            r5 = 32
            java.lang.String r6 = "Unexpected status line: "
            if (r0 == 0) goto L43
            int r0 = r8.length()
            r1 = 9
            if (r0 < r1) goto L39
            r0 = 8
            char r0 = r8.charAt(r0)
            if (r0 != r5) goto L39
            r0 = 7
            char r0 = r8.charAt(r0)
            int r0 = r0 + (-48)
            if (r0 == 0) goto L58
            r3 = 1
            if (r0 != r3) goto L2f
            goto L57
        L2f:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r6.concat(r8)
            r0.<init>(r8)
            throw r0
        L39:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r6.concat(r8)
            r0.<init>(r8)
            throw r0
        L43:
            java.lang.String r0 = "ICY "
            boolean r0 = xhss.AbstractC0226.m492(r8, r0, r1)
            if (r0 == 0) goto L4d
            r1 = r2
            goto L58
        L4d:
            java.lang.String r0 = "SOURCETABLE "
            boolean r0 = xhss.AbstractC0226.m492(r8, r0, r1)
            if (r0 == 0) goto La6
            r1 = 12
        L57:
            r3 = r4
        L58:
            int r0 = r8.length()
            int r4 = r1 + 3
            if (r0 < r4) goto L9c
            java.lang.String r0 = r8.substring(r1, r4)
            java.lang.Integer r0 = xhss.AbstractC0264.m585(r0)
            if (r0 == 0) goto L92
            int r0 = r0.intValue()
            int r7 = r8.length()
            if (r7 <= r4) goto L8a
            char r4 = r8.charAt(r4)
            if (r4 != r5) goto L80
            int r1 = r1 + r2
            java.lang.String r8 = r8.substring(r1)
            goto L8c
        L80:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r6.concat(r8)
            r0.<init>(r8)
            throw r0
        L8a:
            java.lang.String r8 = ""
        L8c:
            xhss.ᛵᛶᛳ r1 = new xhss.ᛵᛶᛳ
            r1.<init>(r3, r0, r8)
            return r1
        L92:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r6.concat(r8)
            r0.<init>(r8)
            throw r0
        L9c:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r6.concat(r8)
            r0.<init>(r8)
            throw r0
        La6:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r6.concat(r8)
            r0.<init>(r8)
            throw r0
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public static int m1564(int r1) {
            if (r1 >= 0) goto L3
            return r1
        L3:
            r0 = 3
            if (r1 >= r0) goto L9
            int r1 = r1 + 1
            return r1
        L9:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 >= r0) goto L16
            float r1 = (float) r1
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            int r1 = (int) r1
            return r1
        L16:
            r1 = 2147483647(0x7fffffff, float:NaN)
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public static final void m1565(xhss.InterfaceC0362 r3, java.lang.Throwable r4) {
            xhss.ᛳᛴᲀᲁ r0 = xhss.C0263.f978     // Catch: java.lang.Throwable -> Lf
            xhss.ᛳᛵᲈᛲ r0 = r3.mo442(r0)     // Catch: java.lang.Throwable -> Lf
            xhss.ᛴᛳᲈᛴ r0 = (xhss.C0351) r0     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto Lb
            return
        Lb:
            xhss.AbstractC0694.m1200(r3, r4)
            return
        Lf:
            r0 = move-exception
            if (r4 != r0) goto L13
            goto L1e
        L13:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Exception while trying to handle coroutine exception"
            r1.<init>(r2, r0)
            xhss.AbstractC1178.m1874(r1, r4)
            r4 = r1
        L1e:
            xhss.AbstractC0694.m1200(r3, r4)
            return
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static java.lang.String m1566(java.lang.String r6) {
            int r0 = r6.length()
            int r1 = r0 + 3
            char[] r1 = new char[r1]
            r2 = 103(0x67, float:1.44E-43)
            r3 = 0
            r1[r3] = r2
            r2 = 101(0x65, float:1.42E-43)
            r4 = 1
            r1[r4] = r2
            r2 = 2
            r5 = 116(0x74, float:1.63E-43)
            r1[r2] = r5
            char r2 = r6.charAt(r3)
            r3 = 97
            if (r2 < r3) goto L26
            r3 = 122(0x7a, float:1.71E-43)
            if (r2 > r3) goto L26
            int r2 = r2 + (-32)
            char r2 = (char) r2
        L26:
            r3 = 3
            r1[r3] = r2
        L29:
            if (r4 >= r0) goto L36
            int r2 = r4 + 3
            char r3 = r6.charAt(r4)
            r1[r2] = r3
            int r4 = r4 + 1
            goto L29
        L36:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1)
            return r6
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static xhss.EnumC1122 m1567(java.lang.String r2) {
            java.lang.String r0 = "http/1.0"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            xhss.ᲈᛲᛵᛴ r2 = xhss.EnumC1122.f3614
            return r2
        Lb:
            java.lang.String r0 = "http/1.1"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L16
            xhss.ᲈᛲᛵᛴ r2 = xhss.EnumC1122.f3620
            return r2
        L16:
            java.lang.String r0 = "h2_prior_knowledge"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L21
            xhss.ᲈᛲᛵᛴ r2 = xhss.EnumC1122.f3619
            return r2
        L21:
            java.lang.String r0 = "h2"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2c
            xhss.ᲈᛲᛵᛴ r2 = xhss.EnumC1122.f3621
            return r2
        L2c:
            java.lang.String r0 = "spdy/3.1"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L37
            xhss.ᲈᛲᛵᛴ r2 = xhss.EnumC1122.f3615
            return r2
        L37:
            java.lang.String r0 = "quic"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L42
            xhss.ᲈᛲᛵᛴ r2 = xhss.EnumC1122.f3617
            return r2
        L42:
            java.lang.String r0 = "h3"
            r1 = 0
            boolean r0 = xhss.AbstractC0226.m492(r2, r0, r1)
            if (r0 == 0) goto L4e
            xhss.ᲈᛲᛵᛴ r2 = xhss.EnumC1122.f3616
            return r2
        L4e:
            java.lang.String r0 = "Unexpected protocol: "
            java.lang.String r2 = r0.concat(r2)
            xhss.C0532.m947(r2)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static float m1568(android.widget.EdgeEffect r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            float r2 = xhss.AbstractC0621.m1081(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public static java.util.Map m1569(xhss.C0857... r5) {
            int r0 = r5.length
            if (r0 <= 0) goto L1e
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r5.length
            int r1 = m1564(r1)
            r0.<init>(r1)
            int r1 = r5.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L1d
            r3 = r5[r2]
            java.lang.Object r4 = r3.f2767
            java.lang.Object r3 = r3.f2768
            r0.put(r4, r3)
            int r2 = r2 + 1
            goto Lf
        L1d:
            return r0
        L1e:
            xhss.ᛶᛵᲈᛴ r5 = xhss.C0566.f1998
            return r5
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public static int m1570(float r15) {
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 >= 0) goto L9
            r15 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            return r15
        L9:
            r0 = 1120272384(0x42c60000, float:99.0)
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 <= 0) goto L11
            r15 = -1
            return r15
        L11:
            r0 = 1098907648(0x41800000, float:16.0)
            float r1 = r15 + r0
            r2 = 1122500608(0x42e80000, float:116.0)
            float r1 = r1 / r2
            r3 = 1090519040(0x41000000, float:8.0)
            int r3 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            r4 = 1147261687(0x4461d2f7, float:903.2963)
            if (r3 <= 0) goto L25
            float r15 = r1 * r1
            float r15 = r15 * r1
            goto L26
        L25:
            float r15 = r15 / r4
        L26:
            float r3 = r1 * r1
            float r3 = r3 * r1
            r5 = 1007753895(0x3c111aa7, float:0.008856452)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 <= 0) goto L34
            r5 = r7
            goto L35
        L34:
            r5 = r6
        L35:
            if (r5 == 0) goto L39
            r8 = r3
            goto L3d
        L39:
            float r8 = r1 * r2
            float r8 = r8 - r0
            float r8 = r8 / r4
        L3d:
            if (r5 == 0) goto L40
            goto L44
        L40:
            float r1 = r1 * r2
            float r1 = r1 - r0
            float r3 = r1 / r4
        L44:
            float[] r0 = xhss.AbstractC0955.f3097
            r1 = r0[r6]
            float r8 = r8 * r1
            double r9 = (double) r8
            r1 = r0[r7]
            float r15 = r15 * r1
            double r11 = (double) r15
            r15 = 2
            r15 = r0[r15]
            float r3 = r3 * r15
            double r13 = (double) r3
            int r15 = xhss.AbstractC0785.m1355(r9, r11, r13)
            return r15
    }
}
