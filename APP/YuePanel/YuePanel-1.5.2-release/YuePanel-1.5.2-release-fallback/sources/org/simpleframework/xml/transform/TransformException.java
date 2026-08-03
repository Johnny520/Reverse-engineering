package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
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
