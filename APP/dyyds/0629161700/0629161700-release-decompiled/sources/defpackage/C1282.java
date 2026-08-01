package defpackage;

/* JADX INFO: renamed from: ᛷᛵᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1282 extends defpackage.AbstractC1178 {
    @Override // defpackage.AbstractC0992
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.util.List mo1885() {
            r3 = this;
            ᛷᲇᛱᲈ r0 = r3.f4430
            if (r0 == 0) goto L15
            java.util.List r1 = defpackage.AbstractC0849.m1795(r3, r0)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L14
            defpackage.AbstractC0849.m1784(r3, r0)
            ᲀᛶᲇ r3 = defpackage.C1698.f7558
            return r3
        L14:
            return r1
        L15:
            java.lang.String r3 = "You must provide a configuration to resolve the member use build(configuration)."
            defpackage.C2264.m3684(r3)
            r3 = 0
            return r3
    }
}
