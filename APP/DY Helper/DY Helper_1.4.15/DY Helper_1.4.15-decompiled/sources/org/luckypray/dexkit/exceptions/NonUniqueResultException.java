package org.luckypray.dexkit.exceptions;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class NonUniqueResultException extends java.lang.RuntimeException {
    public NonUniqueResultException() {
            r0 = this;
            r0.<init>()
            return
    }

    public NonUniqueResultException(int r2) {
            r1 = this;
            java.lang.String r0 = "query did not return a unique result: "
            java.lang.String r2 = p000.a12.m17(r0, r2)
            r1.<init>(r2)
            return
    }

    public NonUniqueResultException(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1)
            return
    }
}
