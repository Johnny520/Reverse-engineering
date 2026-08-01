package defpackage;

/* JADX INFO: renamed from: ᛵᛴᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C0882 implements defpackage.InterfaceC1405 {
    public C0882() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC1405
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final defpackage.AbstractC0758 mo690(defpackage.C1950 r1, defpackage.C1949 r2) {
            r0 = this;
            java.lang.Class r0 = r2.f8476
            java.lang.Class<java.lang.Enum> r1 = java.lang.Enum.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L1d
            if (r0 != r1) goto Ld
            goto L1d
        Ld:
            boolean r1 = r0.isEnum()
            if (r1 != 0) goto L17
            java.lang.Class r0 = r0.getSuperclass()
        L17:
            ᲇᛲᛷᛸ r1 = new ᲇᛲᛷᛸ
            r1.<init>(r0)
            return r1
        L1d:
            r0 = 0
            return r0
    }
}
