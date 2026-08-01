package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements defpackage.InterfaceC0708 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1479 f280;

    public SavedStateHandleAttacher(defpackage.C1479 r1) {
            r0 = this;
            r0.<init>()
            r0.f280 = r1
            return
    }

    @Override // defpackage.InterfaceC0708
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo6(defpackage.InterfaceC0770 r2, defpackage.EnumC2255 r3) {
            r1 = this;
            ᲈᛶᛱᛲ r0 = defpackage.EnumC2255.ON_CREATE
            if (r3 != r0) goto L38
            androidx.lifecycle.ᛷᲁᛳᛳ r2 = r2.mo0()
            r2.m112(r1)
            ᛸᛴᲁᛷ r1 = r1.f280
            boolean r2 = r1.f6562
            if (r2 != 0) goto L37
            ᛶᛲᛱᛸ r2 = r1.f6561
            java.lang.String r3 = "androidx.lifecycle.internal.SavedStateHandlesProvider"
            android.os.Bundle r2 = r2.m1970(r3)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            android.os.Bundle r0 = r1.f6560
            if (r0 == 0) goto L25
            r3.putAll(r0)
        L25:
            if (r2 == 0) goto L2a
            r3.putAll(r2)
        L2a:
            r1.f6560 = r3
            r2 = 1
            r1.f6562 = r2
            ᛲᲈᛶᲈ r1 = r1.f6559
            java.lang.Object r1 = r1.getValue()
            ᛵᲈᛱᲈ r1 = (defpackage.C0989) r1
        L37:
            return
        L38:
            java.lang.String r1 = "Next event must be ON_CREATE, it was "
            defpackage.C0086.m558(r3, r1)
            return
    }
}
