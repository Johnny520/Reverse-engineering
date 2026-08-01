package defpackage;

/* JADX INFO: renamed from: ᲈᲇᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2357 implements defpackage.InterfaceC2267 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final java.util.Set f10169 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.InterfaceC2267 f10170;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "http"
            java.lang.String r2 = "https"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            defpackage.C2357.f10169 = r0
            return
    }

    public C2357(defpackage.InterfaceC2267 r1) {
            r0 = this;
            r0.<init>()
            r0.f10170 = r1
            return
    }

    @Override // defpackage.InterfaceC2267
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final boolean mo1265(java.lang.Object r1) {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            java.util.Set r0 = defpackage.C2357.f10169
            java.lang.String r1 = r1.getScheme()
            boolean r0 = r0.contains(r1)
            return r0
    }

    @Override // defpackage.InterfaceC2267
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final defpackage.C0402 mo1266(java.lang.Object r2, int r3, int r4, defpackage.C0533 r5) {
            r1 = this;
            android.net.Uri r2 = (android.net.Uri) r2
            ᲈᛸᛳᛲ r0 = new ᲈᛸᛳᛲ
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            ᲈᛶᲀᛳ r1 = r1.f10170
            ᛳᛱᛱᛲ r1 = r1.mo1266(r0, r3, r4, r5)
            return r1
    }
}
