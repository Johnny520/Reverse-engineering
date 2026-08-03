package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0455 extends androidx.fragment.app.DialogInterfaceOnCancelListenerC7607 {
    public C0455() {
            r0 = this;
            r0.<init>()
            return
    }

    public C0455(@Yue.InterfaceC3573 int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC7607
    @Yue.InterfaceC4410
    public android.app.Dialog onCreateDialog(@Yue.InterfaceC4544 android.os.Bundle r3) {
            r2 = this;
            Yue.ۥ۟ۡۡۡ r3 = new Yue.ۥ۟ۡۡۡ
            android.content.Context r0 = r2.getContext()
            int r1 = r2.getTheme()
            r3.<init>(r0, r1)
            return r3
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC7607
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setupDialog(@Yue.InterfaceC4410 android.app.Dialog r4, int r5) {
            r3 = this;
            boolean r0 = r4 instanceof Yue.DialogC0454
            if (r0 == 0) goto L1e
            r0 = r4
            Yue.ۥ۟ۡۡۡ r0 = (Yue.DialogC0454) r0
            r1 = 1
            if (r5 == r1) goto L1a
            r2 = 2
            if (r5 == r2) goto L1a
            r2 = 3
            if (r5 == r2) goto L11
            goto L21
        L11:
            android.view.Window r4 = r4.getWindow()
            r5 = 24
            r4.addFlags(r5)
        L1a:
            r0.supportRequestWindowFeature(r1)
            goto L21
        L1e:
            super.setupDialog(r4, r5)
        L21:
            return
    }
}
