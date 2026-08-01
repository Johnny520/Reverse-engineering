package defpackage;

/* JADX INFO: renamed from: ᛸᲀᛸᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C1560 extends defpackage.AbstractC1024 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public defpackage.AbstractC0758 f6898;

    public C1560() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f6898 = r0
            return
    }

    @Override // defpackage.AbstractC1024
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.AbstractC0758 mo1979() {
            r0 = this;
            ᛴᲀᲈᛴ r0 = r0.f6898
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "Adapter for type with cyclic dependency has been used before dependency has been resolved"
            defpackage.C2264.m3676(r0)
            r0 = 0
            return r0
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r1, java.lang.Object r2) {
            r0 = this;
            ᛴᲀᲈᛴ r0 = r0.f6898
            if (r0 == 0) goto L8
            r0.mo561(r1, r2)
            return
        L8:
            java.lang.String r0 = "Adapter for type with cyclic dependency has been used before dependency has been resolved"
            defpackage.C2264.m3676(r0)
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r1) {
            r0 = this;
            ᛴᲀᲈᛴ r0 = r0.f6898
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.mo562(r1)
            return r0
        L9:
            java.lang.String r0 = "Adapter for type with cyclic dependency has been used before dependency has been resolved"
            defpackage.C2264.m3676(r0)
            r0 = 0
            return r0
    }
}
