package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class FragmentManager$6 implements defpackage.InterfaceC0708 {
    @Override // defpackage.InterfaceC0708
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo6(defpackage.InterfaceC0770 r1, defpackage.EnumC2255 r2) {
            r0 = this;
            ᲈᛶᛱᛲ r0 = defpackage.EnumC2255.ON_START
            r1 = 0
            if (r2 == r0) goto Lb
            ᲈᛶᛱᛲ r0 = defpackage.EnumC2255.ON_DESTROY
            if (r2 == r0) goto La
            return
        La:
            throw r1
        Lb:
            throw r1
    }
}
