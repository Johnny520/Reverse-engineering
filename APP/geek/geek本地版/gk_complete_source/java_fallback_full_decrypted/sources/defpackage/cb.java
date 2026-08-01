package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class cb extends defpackage.bb {
    public static int h0(java.lang.Iterable r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lb
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            return r1
        Lb:
            r1 = 10
            return r1
    }
}
