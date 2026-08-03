package p000;

/* JADX INFO: loaded from: classes.dex */
public final class z4 extends p000.ya {

    /* JADX INFO: renamed from: ۥ۠ۤ, reason: contains not printable characters */
    public final p000.kb f1245;

    /* JADX INFO: renamed from: ۥ۠ۥ, reason: contains not printable characters */
    public final p000.kb f1246;

    public z4(android.app.Activity r6) {
            r5 = this;
            r0 = 15
            byte[] r0 = new byte[r0]
            r0 = {x004a: FILL_ARRAY_DATA , data: [40, -93, -95, 85, -8, -119, 42, -74, -119, 88, -39, -100, -32, 32, 44} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x0056: FILL_ARRAY_DATA , data: [-50, 14, 2, -80, 100, 33} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            r2 = 7
            byte[] r3 = new byte[r2]
            r3 = {x005e: FILL_ARRAY_DATA , data: [68, -116, 52, -74, -74, 91, 83} // fill-array
            byte[] r4 = new byte[r1]
            r4 = {x0066: FILL_ARRAY_DATA , data: [39, -29, 90, -62, -45, 35} // fill-array
            p000.oa.m332(r3, r4)
            byte[] r2 = new byte[r2]
            r2 = {x006e: FILL_ARRAY_DATA , data: [-92, -108, 43, -15, -62, -68, -76} // fill-array
            byte[] r1 = new byte[r1]
            r1 = {x0076: FILL_ARRAY_DATA , data: [-64, -15, 77, -91, -89, -60} // fill-array
            p000.oa.m332(r2, r1)
            r1 = 0
            r5.<init>(r6, r1)
            ۟.y4 r1 = new ۟.y4
            r1.<init>(r6, r0)
            ۟.kb r0 = new ۟.kb
            r0.<init>(r1)
            r5.f1245 = r0
            ۟.x4 r0 = new ۟.x4
            r0.<init>(r6)
            ۟.kb r6 = new ۟.kb
            r6.<init>(r0)
            r5.f1246 = r6
            return
    }

    @Override // p000.ya, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            r1 = 0
            r0.setCancelable(r1)
            r0.setCanceledOnTouchOutside(r1)
            return
    }

    @Override // p000.ya, android.app.Dialog
    public final void show() {
            r0 = this;
            super.show()
            return
    }

    @Override // p000.ya
    /* JADX INFO: renamed from: ۥۣ۟ */
    public final android.view.View mo120() {
            r6 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r1 = r6.getContext()
            r0.<init>(r1)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r1.<init>(r2, r2)
            r0.setLayoutParams(r1)
            r1 = 17
            r0.setGravity(r1)
            r1 = 1
            r0.setOrientation(r1)
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = android.util.TypedValue.applyDimension(r1, r3, r2)
            int r2 = (int) r2
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            r5 = 0
            r4.setShape(r5)
            r4.setGradientType(r5)
            float r2 = (float) r2
            r4.setCornerRadius(r2)
            r2 = -1
            r4.setColor(r2)
            r0.setBackground(r4)
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r1 = android.util.TypedValue.applyDimension(r1, r3, r2)
            int r1 = (int) r1
            r0.setPadding(r1, r1, r1, r1)
            ۟.kb r1 = r6.f1246
            java.lang.Object r1 = r1.m238()
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.addView(r1)
            ۟.kb r1 = r6.f1245
            java.lang.Object r1 = r1.m238()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.addView(r1)
            return r0
    }
}
