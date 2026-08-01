package defpackage;

/* JADX INFO: renamed from: ᲈᛲᛴᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2188 implements defpackage.InterfaceC1192 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.ThreadLocal f9281;

    public C2188(java.lang.ThreadLocal r1) {
            r0 = this;
            r0.<init>()
            r0.f9281 = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.C2188
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᲈᛲᛴᛳ r4 = (defpackage.C2188) r4
            java.lang.ThreadLocal r3 = r3.f9281
            java.lang.ThreadLocal r4 = r4.f9281
            boolean r3 = defpackage.AbstractC0498.m1280(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            java.lang.ThreadLocal r0 = r0.f9281
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ThreadLocalKey(threadLocal="
            r0.<init>(r1)
            java.lang.ThreadLocal r2 = r2.f9281
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
