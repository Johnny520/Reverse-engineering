package defpackage;

/* JADX INFO: renamed from: ᛸᛴᲁᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1479 implements defpackage.InterfaceC1872 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C0389 f6559;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public android.os.Bundle f6560;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1020 f6561;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public boolean f6562;

    public C1479(defpackage.C1020 r2, defpackage.InterfaceC2120 r3) {
            r1 = this;
            r1.<init>()
            r1.f6561 = r2
            ᛷᛴᛶᲁ r2 = new ᛷᛴᛶᲁ
            r0 = 2
            r2.<init>(r0, r3)
            ᛲᲈᛶᲈ r3 = new ᛲᲈᛶᲈ
            r3.<init>(r2)
            r1.f6559 = r3
            return
    }

    @Override // defpackage.InterfaceC1872
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.os.Bundle mo2688() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            android.os.Bundle r1 = r3.f6560
            if (r1 == 0) goto Lc
            r0.putAll(r1)
        Lc:
            ᛲᲈᛶᲈ r1 = r3.f6559
            java.lang.Object r1 = r1.getValue()
            ᛵᲈᛱᲈ r1 = (defpackage.C0989) r1
            java.util.LinkedHashMap r1 = r1.f4417
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L28
            r1 = 0
            r3.f6562 = r1
            return r0
        L28:
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r3 = r3.getValue()
            r3.getClass()
            defpackage.C2264.m3679()
            r3 = 0
            return r3
    }
}
