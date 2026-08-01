package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements defpackage.InterfaceC0708 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public boolean f281;

    @Override // defpackage.InterfaceC0708
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo6(defpackage.InterfaceC0770 r2, defpackage.EnumC2255 r3) {
            r1 = this;
            ᲈᛶᛱᛲ r0 = defpackage.EnumC2255.ON_DESTROY
            if (r3 != r0) goto Le
            r3 = 0
            r1.f281 = r3
            androidx.lifecycle.ᛷᲁᛳᛳ r2 = r2.mo0()
            r2.m112(r1)
        Le:
            return
    }
}
