package org.simpleframework.xml.transform;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class TransformException extends org.simpleframework.xml.core.PersistenceException {
    public TransformException(java.lang.String r1, java.lang.Object... r2) {
            r0 = this;
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.<init>(r1, r2)
            return
    }

    public TransformException(java.lang.Throwable r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = this;
            java.lang.String r2 = java.lang.String.format(r2, r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r0.<init>(r2, r1)
            return
    }
}
