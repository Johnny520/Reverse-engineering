package defpackage;

/* JADX INFO: renamed from: ᲀᛱᛴᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1618 extends defpackage.AbstractC0762 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f7128;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f7129;

    public /* synthetic */ C1618(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f7129 = r1
            r0.f7128 = r2
            r0.<init>()
            return
    }

    @Override // defpackage.AbstractC0762, defpackage.InterfaceC2045
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public void mo1689() {
            r2 = this;
            int r0 = r2.f7129
            r1 = 0
            java.lang.Object r2 = r2.f7128
            switch(r0) {
                case 0: goto L28;
                case 1: goto L9;
                default: goto L8;
            }
        L8:
            return
        L9:
            ᛸᛱᛱᛲ r2 = (defpackage.LayoutInflaterFactory2C1411) r2
            androidx.appcompat.widget.ActionBarContextView r0 = r2.f6168
            r0.setVisibility(r1)
            androidx.appcompat.widget.ActionBarContextView r0 = r2.f6168
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L27
            androidx.appcompat.widget.ActionBarContextView r2 = r2.f6168
            android.view.ViewParent r2 = r2.getParent()
            android.view.View r2 = (android.view.View) r2
            java.util.WeakHashMap r0 = defpackage.AbstractC0858.f3911
            r2.requestApplyInsets()
        L27:
            return
        L28:
            ᛴᛷᛸᲀ r2 = (defpackage.RunnableC0712) r2
            ᛸᛱᛱᛲ r2 = r2.f3364
            androidx.appcompat.widget.ActionBarContextView r2 = r2.f6168
            r2.setVisibility(r1)
            return
    }

    @Override // defpackage.InterfaceC2045
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo1855() {
            r3 = this;
            int r0 = r3.f7129
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.Object r3 = r3.f7128
            r2 = 0
            switch(r0) {
                case 0: goto L59;
                case 1: goto L4a;
                default: goto La;
            }
        La:
            ᛴᛵᲇᲇ r3 = (defpackage.C0682) r3
            java.lang.Object r3 = r3.f3285
            ᛸᛱᛱᛲ r3 = (defpackage.LayoutInflaterFactory2C1411) r3
            androidx.appcompat.widget.ActionBarContextView r0 = r3.f6168
            r1 = 8
            r0.setVisibility(r1)
            android.widget.PopupWindow r0 = r3.f6172
            if (r0 == 0) goto L1f
            r0.dismiss()
            goto L36
        L1f:
            androidx.appcompat.widget.ActionBarContextView r0 = r3.f6168
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L36
            androidx.appcompat.widget.ActionBarContextView r0 = r3.f6168
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            java.util.WeakHashMap r1 = defpackage.AbstractC0858.f3911
            r0.requestApplyInsets()
        L36:
            androidx.appcompat.widget.ActionBarContextView r0 = r3.f6168
            r0.m24()
            ᲇᲇᛱᛳ r0 = r3.f6177
            r0.m3553(r2)
            r3.f6177 = r2
            android.view.ViewGroup r3 = r3.f6152
            java.util.WeakHashMap r0 = defpackage.AbstractC0858.f3911
            r3.requestApplyInsets()
            return
        L4a:
            ᛸᛱᛱᛲ r3 = (defpackage.LayoutInflaterFactory2C1411) r3
            androidx.appcompat.widget.ActionBarContextView r0 = r3.f6168
            r0.setAlpha(r1)
            ᲇᲇᛱᛳ r0 = r3.f6177
            r0.m3553(r2)
            r3.f6177 = r2
            return
        L59:
            ᛴᛷᛸᲀ r3 = (defpackage.RunnableC0712) r3
            ᛸᛱᛱᛲ r3 = r3.f3364
            androidx.appcompat.widget.ActionBarContextView r0 = r3.f6168
            r0.setAlpha(r1)
            ᲇᲇᛱᛳ r0 = r3.f6177
            r0.m3553(r2)
            r3.f6177 = r2
            return
    }
}
