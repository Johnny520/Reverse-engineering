package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y1<T> extends java.util.ArrayList<T> {
    public final T a() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lc
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            return r0
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "list is empty"
            r0.<init>(r1)
            throw r0
    }
}
