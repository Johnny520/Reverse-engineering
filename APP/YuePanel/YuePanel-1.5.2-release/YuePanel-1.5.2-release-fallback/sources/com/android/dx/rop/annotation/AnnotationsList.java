package com.android.dx.rop.annotation;

/* JADX INFO: loaded from: classes.dex */
public final class AnnotationsList extends com.android.dx.util.FixedSizeList {
    public static final com.android.dx.rop.annotation.AnnotationsList EMPTY = null;

    static {
            com.android.dx.rop.annotation.AnnotationsList r0 = new com.android.dx.rop.annotation.AnnotationsList
            r1 = 0
            r0.<init>(r1)
            com.android.dx.rop.annotation.AnnotationsList.EMPTY = r0
            return
    }

    public AnnotationsList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.android.dx.rop.annotation.AnnotationsList combine(com.android.dx.rop.annotation.AnnotationsList r5, com.android.dx.rop.annotation.AnnotationsList r6) {
            int r0 = r5.size()
            int r1 = r6.size()
            if (r0 != r1) goto L28
            com.android.dx.rop.annotation.AnnotationsList r1 = new com.android.dx.rop.annotation.AnnotationsList
            r1.<init>(r0)
            r2 = 0
        L10:
            if (r2 >= r0) goto L24
            com.android.dx.rop.annotation.Annotations r3 = r5.get(r2)
            com.android.dx.rop.annotation.Annotations r4 = r6.get(r2)
            com.android.dx.rop.annotation.Annotations r3 = com.android.dx.rop.annotation.Annotations.combine(r3, r4)
            r1.set(r2, r3)
            int r2 = r2 + 1
            goto L10
        L24:
            r1.setImmutable()
            return r1
        L28:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "list1.size() != list2.size()"
            r5.<init>(r6)
            throw r5
    }

    public com.android.dx.rop.annotation.Annotations get(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get0(r1)
            com.android.dx.rop.annotation.Annotations r1 = (com.android.dx.rop.annotation.Annotations) r1
            return r1
    }

    public void set(int r1, com.android.dx.rop.annotation.Annotations r2) {
            r0 = this;
            r2.throwIfMutable()
            r0.set0(r1, r2)
            return
    }
}
