package androidx.activity.result;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class ActivityResultRegistry$1 implements defpackage.InterfaceC0708 {
    @Override // defpackage.InterfaceC0708
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo6(defpackage.InterfaceC0770 r1, defpackage.EnumC2255 r2) {
            r0 = this;
            ᲈᛶᛱᛲ r0 = defpackage.EnumC2255.ON_START
            boolean r0 = r0.equals(r2)
            r1 = 0
            if (r0 != 0) goto L1c
            ᲈᛶᛱᛲ r0 = defpackage.EnumC2255.ON_STOP
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1b
            ᲈᛶᛱᛲ r0 = defpackage.EnumC2255.ON_DESTROY
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1a
            return
        L1a:
            throw r1
        L1b:
            throw r1
        L1c:
            throw r1
    }
}
