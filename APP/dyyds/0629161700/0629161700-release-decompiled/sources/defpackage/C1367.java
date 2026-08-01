package defpackage;

/* JADX INFO: renamed from: ᛷᲁᛳᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1367 implements defpackage.InterfaceC1151 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C2188 f5977;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.ThreadLocal f5978;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f5979;

    public C1367(java.lang.Object r1, java.lang.ThreadLocal r2) {
            r0 = this;
            r0.<init>()
            r0.f5979 = r1
            r0.f5978 = r2
            ᲈᛲᛴᛳ r1 = new ᲈᛲᛴᛳ
            r1.<init>(r2)
            r0.f5977 = r1
            return
    }

    @Override // defpackage.InterfaceC1151
    public final defpackage.InterfaceC1192 getKey() {
            r0 = this;
            ᲈᛲᛴᛳ r0 = r0.f5977
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ThreadLocal(value="
            r0.<init>(r1)
            java.lang.Object r1 = r2.f5979
            r0.append(r1)
            java.lang.String r1 = ", threadLocal = "
            r0.append(r1)
            java.lang.ThreadLocal r2 = r2.f5978
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.InterfaceC0493
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final java.lang.Object mo969(java.lang.Object r1, defpackage.InterfaceC2087 r2) {
            r0 = this;
            java.lang.Object r0 = r2.mo388(r1, r0)
            return r0
    }

    @Override // defpackage.InterfaceC0493
    /* JADX INFO: renamed from: ᛳᲁᲈᲁ */
    public final defpackage.InterfaceC1151 mo970(defpackage.InterfaceC1192 r2) {
            r1 = this;
            ᲈᛲᛴᛳ r0 = r1.f5977
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L9
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // defpackage.InterfaceC0493
    /* JADX INFO: renamed from: ᛴᛸᲀ */
    public final defpackage.InterfaceC0493 mo971(defpackage.InterfaceC0493 r1) {
            r0 = this;
            ᛳᛵᲈᛵ r0 = defpackage.AbstractC0397.m1146(r0, r1)
            return r0
    }

    @Override // defpackage.InterfaceC0493
    /* JADX INFO: renamed from: ᲀᲀᛴᛳ */
    public final defpackage.InterfaceC0493 mo972(defpackage.InterfaceC1192 r2) {
            r1 = this;
            ᲈᛲᛴᛳ r0 = r1.f5977
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto La
            ᛲᛶᛳᛱ r1 = defpackage.C0303.f1620
        La:
            return r1
    }
}
