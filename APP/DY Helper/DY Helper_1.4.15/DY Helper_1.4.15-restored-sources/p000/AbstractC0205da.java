package p000;

/* JADX INFO: renamed from: da */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0205da {

    /* JADX INFO: renamed from: α */
    public static android.app.Dialog f2994;

    /* JADX INFO: renamed from: β */
    public static final android.os.Handler f2995 = null;

    /* JADX INFO: renamed from: γ */
    public static p000.RunnableC0106ca f2996;

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p000.AbstractC0205da.f2995 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static android.app.Dialog m1677(android.content.Context r11, java.lang.String r12, java.lang.String r13) {
            android.app.Dialog r0 = new android.app.Dialog
            r0.<init>(r11)
            android.content.res.Resources r1 = r11.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r2 = 20
            float r2 = (float) r2
            float r2 = r2 * r1
            int r2 = (int) r2
            r3 = 16842801(0x1010031, float:2.3693695E-38)
            r4 = -1
            int r3 = m1679(r11, r3, r4)
            r4 = 16842806(0x1010036, float:2.369371E-38)
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r4 = m1679(r11, r4, r5)
            r5 = 16842808(0x1010038, float:2.3693715E-38)
            r6 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            int r5 = m1679(r11, r5, r6)
            r6 = 16843829(0x1010435, float:2.3696576E-38)
            r7 = -65536(0xffffffffffff0000, float:NaN)
            int r6 = m1679(r11, r6, r7)
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r11)
            r8 = 1
            r7.setOrientation(r8)
            r7.setPadding(r2, r2, r2, r2)
            r7.setBackgroundColor(r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r11)
            java.lang.String r8 = "DY Helper 封禁"
            r3.setText(r8)
            r8 = 1101004800(0x41a00000, float:20.0)
            r3.setTextSize(r8)
            r3.setTextColor(r6)
            r6 = 17
            r3.setGravity(r6)
            r8 = 10
            float r8 = (float) r8
            float r8 = r8 * r1
            int r8 = (int) r8
            r9 = 0
            r3.setPadding(r9, r9, r9, r8)
            r7.addView(r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r11)
            java.lang.String r10 = "UID: "
            java.lang.String r12 = r10.concat(r12)
            r3.setText(r12)
            r12 = 1098907648(0x41800000, float:16.0)
            r3.setTextSize(r12)
            r3.setTextColor(r4)
            r3.setGravity(r6)
            r3.setPadding(r9, r9, r9, r8)
            r7.addView(r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r11)
            boolean r8 = p000.q02.m4671(r13)
            if (r8 == 0) goto L96
            java.lang.String r13 = "未知原因"
        L96:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "封禁原因: "
            r8.<init>(r10)
            r8.append(r13)
            java.lang.String r13 = r8.toString()
            r3.setText(r13)
            r3.setTextSize(r12)
            r3.setTextColor(r4)
            r3.setGravity(r6)
            r3.setPadding(r9, r9, r9, r2)
            r7.addView(r3)
            android.widget.TextView r12 = new android.widget.TextView
            r12.<init>(r11)
            java.lang.String r13 = "应用将在 5 秒后退出"
            r12.setText(r13)
            r13 = 1096810496(0x41600000, float:14.0)
            r12.setTextSize(r13)
            r12.setTextColor(r5)
            r12.setGravity(r6)
            java.lang.String r13 = "countdown_text"
            r12.setTag(r13)
            r7.addView(r12)
            r0.setContentView(r7)
            r0.setCancelable(r9)
            r0.setCanceledOnTouchOutside(r9)
            android.view.Window r12 = r0.getWindow()
            if (r12 == 0) goto L102
            android.graphics.drawable.ColorDrawable r13 = new android.graphics.drawable.ColorDrawable
            r13.<init>(r9)
            r12.setBackgroundDrawable(r13)
            r13 = 300(0x12c, float:4.2E-43)
            float r13 = (float) r13
            float r13 = r13 * r1
            int r13 = (int) r13
            r1 = -2
            r12.setLayout(r13, r1)
            boolean r13 = r11 instanceof android.app.Activity
            if (r13 != 0) goto L102
            boolean r11 = android.provider.Settings.canDrawOverlays(r11)
            if (r11 == 0) goto L102
            r11 = 2038(0x7f6, float:2.856E-42)
            r12.setType(r11)
        L102:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static void m1678() {
            r0 = 0
            ca r1 = p000.AbstractC0205da.f2996     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            android.os.Handler r2 = p000.AbstractC0205da.f2995     // Catch: java.lang.Throwable -> Lb
            r2.removeCallbacks(r1)     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r1 = move-exception
            goto L19
        Ld:
            p000.AbstractC0205da.f2996 = r0     // Catch: java.lang.Throwable -> Lb
            android.app.Dialog r1 = p000.AbstractC0205da.f2994     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L16
            r1.dismiss()     // Catch: java.lang.Throwable -> Lb
        L16:
            p000.AbstractC0205da.f2994 = r0     // Catch: java.lang.Throwable -> Lb
            return
        L19:
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "dismiss failed: "
            java.lang.String r1 = p000.lz1.m3687(r2, r1)
            r2 = 4
            java.lang.String r3 = "r323590de2ec75a5c"
            p000.C0888ux.m5988(r3, r1, r0, r2, r0)
            return
    }

    /* JADX INFO: renamed from: γ */
    public static int m1679(android.content.Context r3, int r4, int r5) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r3.getTheme()
            r2 = 1
            boolean r4 = r1.resolveAttribute(r4, r0, r2)
            if (r4 == 0) goto L37
            int r4 = r0.resourceId
            if (r4 == 0) goto L34
            int r3 = r3.getColor(r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L24:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            boolean r5 = r3 instanceof p000.eo1
            if (r5 == 0) goto L2d
            r3 = r4
        L2d:
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            return r3
        L34:
            int r3 = r0.data
            return r3
        L37:
            return r5
    }
}
