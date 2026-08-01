package defpackage;

/* JADX INFO: renamed from: ᛶᛱᲀᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1015 implements defpackage.InterfaceC1405 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.AbstractC0758 f4523;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Class f4524;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Class f4525;

    public C1015(java.lang.Class r1, java.lang.Class r2, defpackage.AbstractC0758 r3) {
            r0 = this;
            r0.<init>()
            r0.f4525 = r1
            r0.f4524 = r2
            r0.f4523 = r3
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Factory[type="
            r0.<init>(r1)
            java.lang.Class r1 = r2.f4524
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "+"
            r0.append(r1)
            java.lang.Class r1 = r2.f4525
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ",adapter="
            r0.append(r1)
            ᛴᲀᲈᛴ r2 = r2.f4523
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.InterfaceC1405
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final defpackage.AbstractC0758 mo690(defpackage.C1950 r1, defpackage.C1949 r2) {
            r0 = this;
            java.lang.Class r1 = r2.f8476
            java.lang.Class r2 = r0.f4525
            if (r1 == r2) goto Ld
            java.lang.Class r2 = r0.f4524
            if (r1 != r2) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            ᛴᲀᲈᛴ r0 = r0.f4523
            return r0
    }
}
