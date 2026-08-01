package defpackage;

/* JADX INFO: renamed from: ᲈᛶᲀᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2269 extends java.lang.InheritableThreadLocal {
    @Override // java.lang.InheritableThreadLocal
    public final java.lang.Object childValue(java.lang.Object r1) {
            r0 = this;
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            return r0
    }
}
