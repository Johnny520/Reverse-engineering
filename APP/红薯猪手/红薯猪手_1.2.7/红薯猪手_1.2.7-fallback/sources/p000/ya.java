package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class ya extends android.app.AlertDialog {

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public static final int f1207 = 0;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public static final int f1208 = 0;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public static final float f1209 = 0.0f;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public static final float f1210 = 0.0f;

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public static final int f1211 = 0;

    /* JADX INFO: renamed from: ۥ۠, reason: contains not printable characters */
    public static final int f1212 = 0;

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public static final int f1213 = 0;

    /* JADX INFO: renamed from: ۥ۠۠, reason: contains not printable characters */
    public static final int f1214 = 0;

    /* JADX INFO: renamed from: ۥ۠ۡ, reason: contains not printable characters */
    public static final int f1215 = 0;

    /* JADX INFO: renamed from: ۥ۠ۢ, reason: contains not printable characters */
    public static final int f1216 = 0;

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public static final int f1217 = 0;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.Context f1218;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.view.View f1219;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f1220;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public boolean f1221;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public boolean f1222;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public int f1223;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public int f1224;

    static {
            r0 = 1092616192(0x41200000, float:10.0)
            int r1 = p000.tb.m427(r0)
            p000.ya.f1207 = r1
            r1 = 1097859072(0x41700000, float:15.0)
            int r1 = p000.tb.m427(r1)
            p000.ya.f1208 = r1
            r1 = 1098907648(0x41800000, float:16.0)
            p000.ya.f1209 = r1
            r1 = 1096810496(0x41600000, float:14.0)
            p000.ya.f1210 = r1
            r1 = 1109393408(0x42200000, float:40.0)
            int r1 = p000.tb.m427(r1)
            p000.ya.f1211 = r1
            r1 = 1106247680(0x41f00000, float:30.0)
            int r1 = p000.tb.m427(r1)
            p000.ya.f1212 = r1
            r1 = 7
            byte[] r2 = new byte[r1]
            r2 = {x0076: FILL_ARRAY_DATA , data: [-39, -70, -70, -9, -40, -112, -65} // fill-array
            r3 = 6
            byte[] r4 = new byte[r3]
            r4 = {x007e: FILL_ARRAY_DATA , data: [-6, -4, -125, -78, -22, -89} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r4)
            int r2 = android.graphics.Color.parseColor(r2)
            p000.ya.f1213 = r2
            byte[] r1 = new byte[r1]
            r1 = {x0086: FILL_ARRAY_DATA , data: [3, 106, -57, -95, -59, -71, 101} // fill-array
            byte[] r2 = new byte[r3]
            r2 = {x008e: FILL_ARRAY_DATA , data: [32, 47, -126, -28, -128, -4} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r2)
            android.graphics.Color.parseColor(r1)
            r1 = 255(0xff, float:3.57E-43)
            r2 = 248(0xf8, float:3.48E-43)
            r3 = 196(0xc4, float:2.75E-43)
            int r2 = android.graphics.Color.argb(r1, r1, r2, r3)
            p000.ya.f1214 = r2
            r2 = 245(0xf5, float:3.43E-43)
            r3 = 123(0x7b, float:1.72E-43)
            r4 = 0
            int r1 = android.graphics.Color.argb(r1, r2, r3, r4)
            p000.ya.f1215 = r1
            int r0 = p000.tb.m427(r0)
            p000.ya.f1216 = r0
            r0 = 1084227584(0x40a00000, float:5.0)
            int r0 = p000.tb.m427(r0)
            p000.ya.f1217 = r0
            return
    }

    public ya(android.content.Context r3, int r4) {
            r2 = this;
            r0 = 3
            byte[] r0 = new byte[r0]
            r0 = {x001c: FILL_ARRAY_DATA , data: [-5, 125, -105} // fill-array
            r1 = 6
            byte[] r1 = new byte[r1]
            r1 = {x0022: FILL_ARRAY_DATA , data: [-104, 5, -29, -26, 115, 39} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.h4.m189(r0, r3)
            r2.<init>(r3, r4)
            r2.f1218 = r3
            r3 = 1
            r2.f1220 = r3
            return
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(android.os.Bundle r3) {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto La
            r1 = 1
            r0.requestFeature(r1)
        La:
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L15
            r1 = 1024(0x400, float:1.435E-42)
            r0.addFlags(r1)
        L15:
            super.onCreate(r3)
            android.view.View r3 = r2.mo120()
            r2.f1219 = r3
            if (r3 == 0) goto L24
            r2.setContentView(r3)
            goto L3e
        L24:
            int r3 = p000.o.f829
            r3 = 45
            byte[] r3 = new byte[r3]
            r3 = {x0040: FILL_ARRAY_DATA , data: [-36, -117, -96, 103, -117, 6, -36, -86, -110, 103, -86, 17, -46, -84, -115, 101, -118, 40, -33, -90, -126, 106, -125, 35, -43, -66, -65, 106, -104, 49, -46, -125, -89, 101, -124, 61, -33, -66, -77, 103, -72, 23, -46, -126, -74} // fill-array
            r0 = 6
            byte[] r0 = new byte[r0]
            r0 = {x005c: FILL_ARRAY_DATA , data: [58, 2, 51, -126, 55, -122} // fill-array
            java.lang.String r3 = p000.oa.m332(r3, r0)
            r0 = 0
            p000.o.m318(r0, r3)
            r2.dismiss()
        L3e:
            return
    }

    @Override // android.app.Dialog
    public void show() {
            r12 = this;
            super.show()
            android.view.View r0 = r12.f1219
            if (r0 == 0) goto L1dc
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.content.Context r1 = r12.f1218
            r2 = 6
            byte[] r3 = new byte[r2]
            r3 = {x01de: FILL_ARRAY_DATA , data: [-24, -15, 17, -102, -33, 43} // fill-array
            byte[] r4 = new byte[r2]
            r4 = {x01e6: FILL_ARRAY_DATA , data: [-97, -104, 127, -2, -80, 92} // fill-array
            java.lang.String r3 = p000.oa.m332(r3, r4)
            java.lang.Object r1 = r1.getSystemService(r3)
            r3 = 63
            byte[] r4 = new byte[r3]
            r4 = {x01ee: FILL_ARRAY_DATA , data: [62, 5, -94, 105, 89, -96, 49, 30, -96, 106, 13, -29, 50, 21, -18, 102, 24, -80, 36, 80, -70, 106, 89, -83, 63, 30, -29, 107, 12, -81, 60, 80, -70, 124, 9, -90, 112, 17, -96, 97, 11, -84, 57, 20, -32, 115, 16, -90, 39, 94, -103, 108, 23, -89, 63, 7, -125, 100, 23, -94, 55, 21, -68} // fill-array
            byte[] r5 = new byte[r2]
            r5 = {x0212: FILL_ARRAY_DATA , data: [80, 112, -50, 5, 121, -61} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r5)
            p000.h4.m187(r4, r1)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getMetrics(r0)
            boolean r1 = r12.f1222
            r4 = 57
            r5 = 9
            r6 = -1
            r7 = 1
            r8 = 0
            if (r1 == 0) goto Ldc
            android.view.Window r1 = r12.getWindow()
            if (r1 == 0) goto Lfc
            android.graphics.drawable.ColorDrawable r9 = new android.graphics.drawable.ColorDrawable
            byte[] r5 = new byte[r5]
            r5 = {x021a: FILL_ARRAY_DATA , data: [2, 16, -65, -27, 49, 118, 17, 22, -71} // fill-array
            byte[] r10 = new byte[r2]
            r10 = {x0224: FILL_ARRAY_DATA , data: [33, 38, -119, -43, 1, 70} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r10)
            int r5 = android.graphics.Color.parseColor(r5)
            r9.<init>(r5)
            r1.setBackgroundDrawable(r9)
            android.view.WindowManager$LayoutParams r5 = r1.getAttributes()
            android.content.Context r9 = r12.f1218
            byte[] r10 = new byte[r4]
            r10 = {x022c: FILL_ARRAY_DATA , data: [-3, 66, 78, 31, -72, -8, -14, 89, 76, 28, -20, -69, -15, 82, 2, 16, -7, -24, -25, 23, 86, 28, -72, -11, -4, 89, 15, 29, -19, -9, -1, 23, 86, 10, -24, -2, -77, 86, 76, 23, -22, -12, -6, 83, 12, 18, -24, -21, -67, 118, 65, 7, -15, -19, -6, 67, 91} // fill-array
            byte[] r11 = new byte[r2]
            r11 = {x024e: FILL_ARRAY_DATA , data: [-109, 55, 34, 115, -104, -101} // fill-array
            java.lang.String r10 = p000.oa.m332(r10, r11)
            p000.h4.m187(r10, r9)
            android.app.Activity r9 = (android.app.Activity) r9
            android.view.Window r9 = r9.getWindow()
            android.view.View r9 = r9.getDecorView()
            int r9 = r9.getHeight()
            r5.height = r9
            int r9 = r0.widthPixels
            r5.width = r9
            android.view.View r9 = r1.getDecorView()
            r10 = 1280(0x500, float:1.794E-42)
            r9.setSystemUiVisibility(r10)
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r9 < r10) goto La4
            r5.layoutInDisplayCutoutMode = r7
        La4:
            r1.setAttributes(r5)
            android.view.View r5 = new android.view.View
            android.content.Context r9 = r12.f1218
            r5.<init>(r9)
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r9.<init>(r6, r6)
            r5.setLayoutParams(r9)
            r5.setBackgroundColor(r8)
            ۟.wa r9 = new ۟.wa
            r9.<init>(r12, r7)
            r5.setOnClickListener(r9)
            android.view.View r1 = r1.getDecorView()
            byte[] r3 = new byte[r3]
            r3 = {x0256: FILL_ARRAY_DATA , data: [64, -1, -122, 71, -57, -118, 79, -28, -124, 68, -109, -55, 76, -17, -54, 72, -122, -102, 90, -86, -98, 68, -57, -121, 65, -28, -57, 69, -110, -123, 66, -86, -98, 82, -105, -116, 14, -21, -124, 79, -107, -122, 71, -18, -60, 92, -114, -115, 73, -17, -98, 5, -95, -101, 79, -25, -113, 103, -122, -112, 65, -1, -98} // fill-array
            byte[] r9 = new byte[r2]
            r9 = {x027a: FILL_ARRAY_DATA , data: [46, -118, -22, 43, -25, -23} // fill-array
            java.lang.String r3 = p000.oa.m332(r3, r9)
            p000.h4.m187(r3, r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r1.addView(r5, r8)
            goto Lfc
        Ldc:
            android.view.Window r1 = r12.getWindow()
            if (r1 == 0) goto Lfc
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable
            byte[] r5 = new byte[r5]
            r5 = {x0282: FILL_ARRAY_DATA , data: [-69, -55, 10, 31, -46, 4, -88, -55, 10} // fill-array
            byte[] r9 = new byte[r2]
            r9 = {x028c: FILL_ARRAY_DATA , data: [-104, -7, 58, 47, -30, 52} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r9)
            int r5 = android.graphics.Color.parseColor(r5)
            r3.<init>(r5)
            r1.setBackgroundDrawable(r3)
        Lfc:
            android.view.Window r1 = r12.getWindow()
            if (r1 == 0) goto L10b
            android.view.View r1 = r1.getDecorView()
            if (r1 == 0) goto L10b
            r1.setPadding(r8, r8, r8, r8)
        L10b:
            android.view.View r1 = r12.f1219
            p000.h4.m186(r1)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r3 = 76
            byte[] r3 = new byte[r3]
            r3 = {x0294: FILL_ARRAY_DATA , data: [105, -16, -108, -116, 21, 67, 102, -21, -106, -113, 65, 0, 101, -32, -40, -125, 84, 83, 115, -91, -116, -113, 21, 78, 104, -21, -43, -114, 64, 76, 107, -91, -116, -103, 69, 69, 39, -28, -106, -124, 71, 79, 110, -31, -42, -105, 92, 68, 96, -32, -116, -50, 115, 82, 102, -24, -99, -84, 84, 89, 104, -16, -116, -50, 121, 65, 126, -22, -115, -108, 101, 65, 117, -28, -107, -109} // fill-array
            byte[] r5 = new byte[r2]
            r5 = {x02be: FILL_ARRAY_DATA , data: [7, -123, -8, -32, 53, 32} // fill-array
            java.lang.String r3 = p000.oa.m332(r3, r5)
            p000.h4.m187(r3, r1)
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r1.setMargins(r8, r8, r8, r8)
            r3 = 17
            r1.gravity = r3
            int r3 = r12.f1223
            if (r3 == 0) goto L13e
            int r5 = r12.f1224
            if (r5 == 0) goto L13e
            r1.width = r3
            r1.height = r5
            goto L1d4
        L13e:
            boolean r3 = r12.f1221
            if (r3 == 0) goto L16a
            int r0 = r0.widthPixels
            r1.width = r0
            android.content.Context r0 = r12.f1218
            byte[] r3 = new byte[r4]
            r3 = {x02c6: FILL_ARRAY_DATA , data: [-96, -63, -126, -107, -54, 108, -81, -38, -128, -106, -98, 47, -84, -47, -50, -102, -117, 124, -70, -108, -102, -106, -54, 97, -95, -38, -61, -105, -97, 99, -94, -108, -102, -128, -102, 106, -18, -43, -128, -99, -104, 96, -89, -48, -64, -104, -102, 127, -32, -11, -115, -115, -125, 121, -89, -64, -105} // fill-array
            byte[] r2 = new byte[r2]
            r2 = {x02e8: FILL_ARRAY_DATA , data: [-50, -76, -18, -7, -22, 15} // fill-array
            java.lang.String r2 = p000.oa.m332(r3, r2)
            p000.h4.m187(r2, r0)
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            int r0 = r0.getHeight()
            r1.height = r0
            goto L1d4
        L16a:
            int r2 = r0.heightPixels
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r3
            int r3 = r0.widthPixels
            float r3 = (float) r3
            float r2 = r2 / r3
            r3 = 1071225242(0x3fd9999a, float:1.7)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L17e
            r2 = 1112014848(0x42480000, float:50.0)
            goto L180
        L17e:
            r2 = 1099956224(0x41900000, float:18.0)
        L180:
            float r3 = p000.c4.m107(r7, r2)
            int r3 = (int) r3
            float r2 = p000.c4.m107(r7, r2)
            int r2 = (int) r2
            r1.setMargins(r3, r8, r2, r8)
            boolean r2 = r12.f1220
            if (r2 == 0) goto L193
            r0 = -2
            goto L19b
        L193:
            int r0 = r0.heightPixels
            float r0 = (float) r0
            r2 = 1063675494(0x3f666666, float:0.9)
            float r0 = r0 * r2
            int r0 = (int) r0
        L19b:
            r1.height = r0
            boolean r0 = r12.f1222
            if (r0 == 0) goto L1ab
            r0 = 1108082688(0x420c0000, float:35.0)
            float r0 = p000.c4.m107(r7, r0)
            int r0 = (int) r0
            r1.setMargins(r8, r0, r8, r0)
        L1ab:
            android.view.View r0 = r12.f1219
            p000.h4.m186(r0)
            r2 = 1092616192(0x41200000, float:10.0)
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r7, r2, r3)
            int r2 = (int) r2
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            r3.setShape(r8)
            r3.setGradientType(r8)
            float r2 = (float) r2
            r3.setCornerRadius(r2)
            r3.setColor(r6)
            r0.setBackground(r3)
        L1d4:
            android.view.View r0 = r12.f1219
            p000.h4.m186(r0)
            r0.setLayoutParams(r1)
        L1dc:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.widget.TextView m479() {
            r4 = this;
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r4.f1218
            r0.<init>(r1)
            r1 = 16
            r0.setGravity(r1)
            r1 = -1
            r0.setBackgroundColor(r1)
            float r2 = p000.ya.f1210
            r0.setTextSize(r2)
            r2 = -7829368(0xffffffffff888888, float:NaN)
            r0.setTextColor(r2)
            int r2 = p000.ya.f1208
            r3 = 0
            r0.setPadding(r2, r3, r2, r3)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -2
            r2.<init>(r1, r3)
            r0.setLayoutParams(r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final android.widget.TextView m480() {
            r4 = this;
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r4.f1218
            r0.<init>(r1)
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x0048: FILL_ARRAY_DATA , data: [-64, -103, -42, 74, -13, -113} // fill-array
            byte[] r1 = new byte[r1]
            r1 = {x0050: FILL_ARRAY_DATA , data: [40, 38, 66, -81, 104, 17} // fill-array
            java.lang.String r1 = p000.oa.m332(r2, r1)
            r0.setText(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            int r2 = p000.ya.f1211
            int r2 = r2 * 3
            int r2 = r2 / 2
            r3 = -1
            r1.<init>(r3, r2)
            r0.setLayoutParams(r1)
            int r1 = p000.ya.f1208
            r2 = 0
            r0.setPadding(r2, r2, r1, r2)
            r1 = 21
            r0.setGravity(r1)
            float r1 = p000.ya.f1209
            r0.setTextSize(r1)
            r1 = -7829368(0xffffffffff888888, float:NaN)
            r0.setTextColor(r1)
            ۟.wa r1 = new ۟.wa
            r1.<init>(r4, r2)
            r0.setOnClickListener(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final android.widget.LinearLayout m481() {
            r3 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r1 = r3.f1218
            r0.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r0.setLayoutParams(r1)
            r1 = 1
            r0.setOrientation(r1)
            r0.setBackgroundColor(r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final android.widget.RelativeLayout m482(java.lang.String r9) {
            r8 = this;
            r0 = 5
            byte[] r0 = new byte[r0]
            r0 = {x00e4: FILL_ARRAY_DATA , data: [2, -31, 53, 22, -64} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x00ec: FILL_ARRAY_DATA , data: [118, -120, 65, 122, -91, 77} // fill-array
            p000.oa.m332(r0, r2)
            android.widget.RelativeLayout r0 = new android.widget.RelativeLayout
            android.content.Context r2 = r8.f1218
            r0.<init>(r2)
            r2 = 1092616192(0x41200000, float:10.0)
            int r2 = p000.tb.m427(r2)
            int r3 = p000.ya.f1213
            android.graphics.drawable.GradientDrawable r2 = p000.tb.m425(r2, r3)
            r0.setBackground(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r4 = 1113325568(0x425c0000, float:55.0)
            int r5 = p000.tb.m427(r4)
            r6 = -1
            r2.<init>(r6, r5)
            r0.setLayoutParams(r2)
            android.widget.TextView r2 = r8.m483(r3)
            r2.setText(r9)
            android.widget.RelativeLayout$LayoutParams r9 = new android.widget.RelativeLayout$LayoutParams
            int r5 = p000.tb.m427(r4)
            r9.<init>(r6, r5)
            r5 = 9
            r9.addRule(r5)
            r0.addView(r2, r9)
            android.widget.TextView r9 = r8.m483(r3)
            r2 = 1084227584(0x40a00000, float:5.0)
            int r2 = p000.tb.m427(r2)
            android.graphics.drawable.GradientDrawable r2 = p000.tb.m426(r2, r6)
            r9.setBackground(r2)
            byte[] r2 = new byte[r1]
            r2 = {x00f4: FILL_ARRAY_DATA , data: [41, 37, -76, -102, 94, -105} // fill-array
            byte[] r5 = new byte[r1]
            r5 = {x00fc: FILL_ARRAY_DATA , data: [-64, -94, 57, 127, -50, 56} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r5)
            r9.setText(r2)
            r2 = 1096810496(0x41600000, float:14.0)
            r9.setTextSize(r2)
            r2 = 8
            r9.setVisibility(r2)
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            r9.setTypeface(r2)
            ۟.xa r2 = new ۟.xa
            r5 = 0
            r2.<init>(r5)
            r9.setOnClickListener(r2)
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r6 = -2
            r7 = 1106247680(0x41f00000, float:30.0)
            int r7 = p000.tb.m427(r7)
            r2.<init>(r6, r7)
            r6 = 1110704128(0x42340000, float:45.0)
            int r7 = p000.tb.m427(r6)
            r2.setMargins(r5, r5, r7, r5)
            r5 = 11
            r2.addRule(r5)
            r7 = 15
            r2.addRule(r7)
            r0.addView(r9, r2)
            android.widget.TextView r2 = r8.m483(r3)
            r3 = 3
            byte[] r3 = new byte[r3]
            r3 = {x0104: FILL_ARRAY_DATA , data: [-49, -111, -89} // fill-array
            byte[] r1 = new byte[r1]
            r1 = {x010a: FILL_ARRAY_DATA , data: [45, 26, 9, 121, 111, -115} // fill-array
            java.lang.String r1 = p000.oa.m332(r3, r1)
            r2.setText(r1)
            r1 = 17
            r2.setGravity(r1)
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            int r3 = p000.tb.m427(r6)
            int r4 = p000.tb.m427(r4)
            r1.<init>(r3, r4)
            r1.addRule(r5)
            r1.addRule(r7)
            r0.addView(r2, r1)
            ۟.q1 r1 = new ۟.q1
            r3 = 2
            r1.<init>(r3, r9)
            r2.setOnClickListener(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final android.widget.TextView m483(int r4) {
            r3 = this;
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r3.f1218
            r0.<init>(r1)
            int r1 = p000.ya.f1208
            r2 = 0
            r0.setPadding(r1, r2, r1, r2)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setTextColor(r1)
            r1 = 1092616192(0x41200000, float:10.0)
            int r1 = p000.tb.m427(r1)
            android.graphics.drawable.GradientDrawable r4 = p000.tb.m425(r1, r4)
            r0.setBackground(r4)
            float r4 = p000.ya.f1209
            r1 = 5
            float r1 = (float) r1
            float r4 = r4 + r1
            r0.setTextSize(r4)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT_BOLD
            r0.setTypeface(r4)
            r4 = 16
            r0.setGravity(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r1 = 1113325568(0x425c0000, float:55.0)
            int r1 = p000.tb.m427(r1)
            r2 = -1
            r4.<init>(r2, r1)
            r0.setLayoutParams(r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final android.content.Context m484() {
            r1 = this;
            android.content.Context r0 = r1.f1218
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟ */
    public abstract android.view.View mo120();

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final void m485(boolean r1) {
            r0 = this;
            r0.f1222 = r1
            r0.show()
            return
    }
}
