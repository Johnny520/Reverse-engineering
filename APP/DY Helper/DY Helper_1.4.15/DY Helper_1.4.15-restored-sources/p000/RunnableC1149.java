package p000;

/* JADX INFO: renamed from: ｓ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1149 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f13511;

    /* JADX INFO: renamed from: ζ */
    public java.lang.Object f13512;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f13513;

    public /* synthetic */ RunnableC1149(int r1, java.lang.Object r2, java.lang.Object r3, boolean r4) {
            r0 = this;
            r0.f13511 = r1
            r0.f13512 = r2
            r0.f13513 = r3
            r0.<init>()
            return
    }

    public /* synthetic */ RunnableC1149(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f13511 = r2
            r0.f13513 = r1
            r0.f13512 = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r12 = this;
            int r0 = r12.f13511
            r1 = 16
            r2 = 1
            r3 = 0
            r4 = 0
            switch(r0) {
                case 0: goto L150;
                case 1: goto L13e;
                case 2: goto L68;
                case 3: goto L5c;
                case 4: goto L32;
                case 5: goto L28;
                default: goto La;
            }
        La:
            java.lang.Object r0 = r12.f13512
            android.view.View r0 = (android.view.View) r0
            int r1 = r0.getLeft()
            java.lang.Object r12 = r12.f13513
            androidx.appcompat.widget.ScrollingTabContainerView r12 = (androidx.appcompat.widget.ScrollingTabContainerView) r12
            int r2 = r12.getWidth()
            int r0 = r0.getWidth()
            int r2 = r2 - r0
            int r2 = r2 / 2
            int r1 = r1 - r2
            r12.smoothScrollTo(r1, r4)
            r12.f637 = r3
            return
        L28:
            java.lang.Object r0 = r12.f13512
            r50 r0 = (p000.r50) r0
            java.lang.Object r12 = r12.f13513
            r0.accept(r12)
            return
        L32:
            java.lang.Object r0 = r12.f13513
            qr0 r0 = (p000.qr0) r0
            kotlinx.coroutines.α r3 = r0.f9087
        L38:
            java.lang.Object r5 = r12.f13512     // Catch: java.lang.Throwable -> L40
            java.lang.Runnable r5 = (java.lang.Runnable) r5     // Catch: java.lang.Throwable -> L40
            r5.run()     // Catch: java.lang.Throwable -> L40
            goto L46
        L40:
            r5 = move-exception
            hz r6 = p000.C0377hz.f4846
            p000.AbstractC0073bd.m890(r6, r5)
        L46:
            java.lang.Runnable r5 = r0.m4942()
            if (r5 != 0) goto L4d
            goto L5b
        L4d:
            r12.f13512 = r5
            int r4 = r4 + r2
            if (r4 < r1) goto L38
            boolean r5 = r3.mo3392(r0)
            if (r5 == 0) goto L38
            r3.mo1950(r0, r12)
        L5b:
            return
        L5c:
            java.lang.Object r0 = r12.f13512
            ae r0 = (p000.C0015ae) r0
            java.lang.Object r12 = r12.f13513
            nc0 r12 = (p000.nc0) r12
            r0.m69(r12)
            return
        L68:
            boolean r0 = p000.C1036yw.f12851
            if (r0 != 0) goto L6e
            goto L13d
        L6e:
            int r0 = p000.C1036yw.f12852
            if (r0 > 0) goto L90
            android.os.Handler r0 = p000.C1036yw.f12843
            p000.C1036yw.f12851 = r4
            java.lang.String r0 = "倒计时归零，执行退出"
            r1 = 4
            java.lang.String r2 = "DYHelper:DurationAlert"
            p000.C0888ux.m5988(r2, r0, r3, r1, r3)
            android.os.Handler r0 = p000.C1036yw.f12843
            p000.C1036yw.m7039()
            java.lang.Object r0 = r12.f13512
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r12 = r12.f13513
            xw r12 = (p000.C0999xw) r12
            p000.C1036yw.m7037(r0, r12)
            goto L13d
        L90:
            android.os.Handler r0 = p000.C1036yw.f12843
            java.lang.Object r0 = r12.f13512
            android.app.Activity r0 = (android.app.Activity) r0
            int r5 = p000.C1036yw.f12852
            java.lang.String r6 = "即将退出，剩余 "
            r7 = -1
            android.content.res.Resources r8 = r0.getResources()     // Catch: java.lang.Throwable -> L117
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()     // Catch: java.lang.Throwable -> L117
            float r8 = r8.density     // Catch: java.lang.Throwable -> L117
            android.widget.LinearLayout r9 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L117
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L117
            r9.setOrientation(r2)     // Catch: java.lang.Throwable -> L117
            r10 = 17
            r9.setGravity(r10)     // Catch: java.lang.Throwable -> L117
            r11 = 24
            float r11 = (float) r11     // Catch: java.lang.Throwable -> L117
            float r11 = r11 * r8
            int r11 = (int) r11     // Catch: java.lang.Throwable -> L117
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L117
            float r1 = r1 * r8
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L117
            r9.setPadding(r11, r1, r11, r1)     // Catch: java.lang.Throwable -> L117
            android.graphics.drawable.GradientDrawable r8 = new android.graphics.drawable.GradientDrawable     // Catch: java.lang.Throwable -> L117
            r8.<init>()     // Catch: java.lang.Throwable -> L117
            r11 = -422829568(0xffffffffe6cc2200, float:-4.8199498E23)
            r8.setColor(r11)     // Catch: java.lang.Throwable -> L117
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L117
            r8.setCornerRadius(r1)     // Catch: java.lang.Throwable -> L117
            r9.setBackground(r8)     // Catch: java.lang.Throwable -> L117
            android.widget.TextView r1 = new android.widget.TextView     // Catch: java.lang.Throwable -> L117
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L117
            java.lang.String r8 = " 即将退出抖音"
            r1.setText(r8)     // Catch: java.lang.Throwable -> L117
            r8 = 1097859072(0x41700000, float:15.0)
            r1.setTextSize(r8)     // Catch: java.lang.Throwable -> L117
            r1.setTextColor(r7)     // Catch: java.lang.Throwable -> L117
            r1.setTypeface(r3, r2)     // Catch: java.lang.Throwable -> L117
            r1.setGravity(r10)     // Catch: java.lang.Throwable -> L117
            r9.addView(r1)     // Catch: java.lang.Throwable -> L117
            android.widget.TextView r1 = new android.widget.TextView     // Catch: java.lang.Throwable -> L117
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L117
            java.lang.String r2 = "触摸屏幕任意位置可取消"
            r1.setText(r2)     // Catch: java.lang.Throwable -> L117
            r2 = 1094713344(0x41400000, float:12.0)
            r1.setTextSize(r2)     // Catch: java.lang.Throwable -> L117
            r2 = -855638017(0xffffffffccffffff, float:-1.3421772E8)
            r1.setTextColor(r2)     // Catch: java.lang.Throwable -> L117
            r1.setGravity(r10)     // Catch: java.lang.Throwable -> L117
            r9.addView(r1)     // Catch: java.lang.Throwable -> L117
            android.widget.Toast r1 = new android.widget.Toast     // Catch: java.lang.Throwable -> L117
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L117
            r1.setView(r9)     // Catch: java.lang.Throwable -> L117
            r1.setDuration(r4)     // Catch: java.lang.Throwable -> L117
            r1.setGravity(r10, r4, r4)     // Catch: java.lang.Throwable -> L117
            r1.show()     // Catch: java.lang.Throwable -> L117
            goto L12f
        L117:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12f
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L12f
            r1.append(r5)     // Catch: java.lang.Throwable -> L12f
            java.lang.String r2 = "s"
            r1.append(r2)     // Catch: java.lang.Throwable -> L12f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L12f
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r4)     // Catch: java.lang.Throwable -> L12f
            r0.show()     // Catch: java.lang.Throwable -> L12f
        L12f:
            int r0 = p000.C1036yw.f12852
            android.os.Handler r1 = p000.C1036yw.f12843
            int r0 = r0 + r7
            p000.C1036yw.f12852 = r0
            android.os.Handler r0 = p000.C1036yw.f12843
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r12, r1)
        L13d:
            return
        L13e:
            java.lang.Object r0 = r12.f13512
            y21 r0 = (p000.y21) r0
            java.lang.Object r12 = r12.f13513
            android.graphics.Typeface r12 = (android.graphics.Typeface) r12
            java.lang.Object r0 = r0.f12428
            y5 r0 = (p000.C1009y5) r0
            if (r0 == 0) goto L14f
            r0.m6835(r12)
        L14f:
            return
        L150:
            java.lang.Object r0 = r12.f13512
            ｑ r0 = (p000.C1147) r0
            java.lang.Object r12 = r12.f13513
            androidx.appcompat.widget.γ r12 = (androidx.appcompat.widget.C0030) r12
            iz0 r1 = r12.f792
            if (r1 == 0) goto L163
            gz0 r2 = r1.f5255
            if (r2 == 0) goto L163
            r2.mo221(r1)
        L163:
            wz0 r1 = r12.f797
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L180
            android.os.IBinder r1 = r1.getWindowToken()
            if (r1 == 0) goto L180
            boolean r1 = r0.m5039()
            if (r1 == 0) goto L176
            goto L17e
        L176:
            android.view.View r1 = r0.f9167
            if (r1 != 0) goto L17b
            goto L180
        L17b:
            r0.m5041(r4, r4, r4, r4)
        L17e:
            r12.f808 = r0
        L180:
            r12.f787 = r3
            return
    }
}
