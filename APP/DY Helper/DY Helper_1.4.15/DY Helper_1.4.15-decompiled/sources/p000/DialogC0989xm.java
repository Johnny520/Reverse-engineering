package p000;

/* JADX INFO: renamed from: xm */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class DialogC0989xm extends android.app.Dialog implements p000.hr0, p000.kq1 {

    /* JADX INFO: renamed from: ε */
    public p000.jr0 f12210;

    /* JADX INFO: renamed from: ζ */
    public final p000.C0574n5 f12211;

    /* JADX INFO: renamed from: η */
    public final p000.d51 f12212;

    public DialogC0989xm(android.content.Context r2, int r3) {
            r1 = this;
            r1.<init>(r2, r3)
            jq1 r2 = new jq1
            η r3 = new η
            r0 = 14
            r3.<init>(r0, r1)
            r2.<init>(r1, r3)
            n5 r3 = new n5
            r3.<init>(r2)
            r1.f12211 = r3
            d51 r2 = new d51
            ν r3 = new ν
            r0 = 10
            r3.<init>(r0, r1)
            r2.<init>(r3)
            r1.f12212 = r2
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m6682(p000.DialogC0989xm r0) {
            super.onBackPressed()
            return
    }

    @Override // android.app.Dialog
    public void addContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r1.getClass()
            r0.m6683()
            super.addContentView(r1, r2)
            return
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
            r0 = this;
            d51 r0 = r0.f12212
            r0.m1653()
            return
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L1c
            android.window.OnBackInvokedDispatcher r0 = p000.AbstractC1124.m7329(r2)
            r0.getClass()
            d51 r1 = r2.f12212
            r1.getClass()
            r1.f2897 = r0
            boolean r0 = r1.f2899
            r1.m1654(r0)
        L1c:
            n5 r0 = r2.f12211
            r0.m3972(r3)
            jr0 r3 = r2.f12210
            if (r3 != 0) goto L2c
            jr0 r3 = new jr0
            r3.<init>(r2)
            r2.f12210 = r3
        L2c:
            br0 r2 = p000.br0.ON_CREATE
            r3.m2983(r2)
            return
    }

    @Override // android.app.Dialog
    public final android.os.Bundle onSaveInstanceState() {
            r1 = this;
            android.os.Bundle r0 = super.onSaveInstanceState()
            r0.getClass()
            n5 r1 = r1.f12211
            r1.m3973(r0)
            return r0
    }

    @Override // android.app.Dialog
    public final void onStart() {
            r1 = this;
            super.onStart()
            jr0 r0 = r1.f12210
            if (r0 != 0) goto Le
            jr0 r0 = new jr0
            r0.<init>(r1)
            r1.f12210 = r0
        Le:
            br0 r1 = p000.br0.ON_RESUME
            r0.m2983(r1)
            return
    }

    @Override // android.app.Dialog
    public void onStop() {
            r2 = this;
            jr0 r0 = r2.f12210
            if (r0 != 0) goto Lb
            jr0 r0 = new jr0
            r0.<init>(r2)
            r2.f12210 = r0
        Lb:
            br0 r1 = p000.br0.ON_DESTROY
            r0.m2983(r1)
            r0 = 0
            r2.f12210 = r0
            super.onStop()
            return
    }

    @Override // android.app.Dialog
    public void setContentView(int r1) {
            r0 = this;
            r0.m6683()
            super.setContentView(r1)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View r1) {
            r0 = this;
            r1.getClass()
            r0.m6683()
            super.setContentView(r1)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r1.getClass()
            r0.m6683()
            super.setContentView(r1, r2)
            return
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: α */
    public final p000.C0574n5 mo189() {
            r0 = this;
            n5 r0 = r0.f12211
            java.lang.Object r0 = r0.f7388
            n5 r0 = (p000.C0574n5) r0
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final void m6683() {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            r0.getClass()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            r1 = 2131297158(0x7f090386, float:1.8212253E38)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            r0.getClass()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            r1 = 2131297159(0x7f090387, float:1.8212255E38)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            r0.getClass()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            r1 = 2131297160(0x7f090388, float:1.8212257E38)
            r0.setTag(r1, r2)
            return
    }

    @Override // p000.hr0
    /* JADX INFO: renamed from: δ */
    public final p000.jr0 mo192() {
            r1 = this;
            jr0 r0 = r1.f12210
            if (r0 != 0) goto Lb
            jr0 r0 = new jr0
            r0.<init>(r1)
            r1.f12210 = r0
        Lb:
            return r0
    }
}
