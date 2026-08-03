package androidx.databinding;

/* JADX INFO: loaded from: classes.dex */
public class MergedDataBinderMapper extends a.H4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f888a;
    public final java.util.concurrent.CopyOnWriteArrayList b;

    public MergedDataBinderMapper() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.f888a = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.b = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            return
    }

    public final void b(a.H4 r3) {
            r2 = this;
            java.lang.Class r0 = r3.getClass()
            java.util.HashSet r1 = r2.f888a
            boolean r0 = r1.add(r0)
            if (r0 == 0) goto L29
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.b
            r0.add(r3)
            java.util.List r3 = r3.a()
            java.util.Iterator r3 = r3.iterator()
        L19:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r3.next()
            a.H4 r0 = (a.H4) r0
            r2.b(r0)
            goto L19
        L29:
            return
    }
}
