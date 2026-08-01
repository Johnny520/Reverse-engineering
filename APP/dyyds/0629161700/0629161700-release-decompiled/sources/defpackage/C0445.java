package defpackage;

/* JADX INFO: renamed from: ᛳᛳᲇᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0445 implements defpackage.InterfaceC1405 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.AbstractC0758 f2188;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2189;

    public /* synthetic */ C0445(defpackage.AbstractC0758 r1, int r2) {
            r0 = this;
            r0.f2189 = r2
            r0.f2188 = r1
            r0.<init>()
            return
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.f2189
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Factory[type="
            r0.<init>(r1)
            java.lang.Class<java.util.Calendar> r1 = java.util.Calendar.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "+"
            r0.append(r1)
            java.lang.Class<java.util.GregorianCalendar> r1 = java.util.GregorianCalendar.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ",adapter="
            r0.append(r1)
            ᛴᲀᲈᛴ r2 = r2.f2188
            ᲁᛲᲀᲁ r2 = (defpackage.C1819) r2
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.InterfaceC1405
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final defpackage.AbstractC0758 mo690(defpackage.C1950 r2, defpackage.C1949 r3) {
            r1 = this;
            int r2 = r1.f2189
            ᛴᲀᲈᛴ r1 = r1.f2188
            r0 = 0
            switch(r2) {
                case 0: goto L16;
                default: goto L8;
            }
        L8:
            java.lang.Class r2 = r3.f8476
            java.lang.Class<java.util.Calendar> r3 = java.util.Calendar.class
            if (r2 == r3) goto L12
            java.lang.Class<java.util.GregorianCalendar> r3 = java.util.GregorianCalendar.class
            if (r2 != r3) goto L15
        L12:
            r0 = r1
            ᲁᛲᲀᲁ r0 = (defpackage.C1819) r0
        L15:
            return r0
        L16:
            java.lang.Class r2 = r3.f8476
            java.lang.Class<java.lang.Number> r3 = java.lang.Number.class
            if (r2 != r3) goto L1f
            r0 = r1
            ᛱᲁᲁᛲ r0 = (defpackage.C0186) r0
        L1f:
            return r0
    }
}
