package p000;

/* JADX INFO: renamed from: bx */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0093bx {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.ConcurrentHashMap f1879 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.Set f1880 = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.AbstractC0093bx.f1879 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r0.getClass()
            p000.AbstractC0093bx.f1880 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.Class m1082(java.lang.ClassLoader r11, java.lang.String r12) {
            r11.getClass()
            r12.getClass()
            boolean r0 = p000.q02.m4671(r12)
            r1 = 0
            if (r0 == 0) goto Le
            goto L39
        Le:
            int r0 = java.lang.System.identityHashCode(r11)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "@"
            r2.append(r0)
            r2.append(r12)
            java.lang.String r0 = r2.toString()
            java.util.concurrent.ConcurrentHashMap r2 = p000.AbstractC0093bx.f1879
            java.lang.Object r3 = r2.get(r0)
            java.lang.Class r3 = (java.lang.Class) r3
            if (r3 == 0) goto L31
            return r3
        L31:
            java.util.Set r3 = p000.AbstractC0093bx.f1880
            boolean r4 = r3.contains(r0)
            if (r4 == 0) goto L3a
        L39:
            return r1
        L3a:
            java.lang.String[] r4 = new java.lang.String[]{r12}
            java.util.ArrayList r4 = p000.AbstractC1021yh.m6899(r4)
            java.lang.String r5 = "X.C"
            r6 = 0
            boolean r7 = p000.x02.m6485(r12, r5, r6)
            java.lang.String r8 = "X."
            r9 = 1
            if (r7 == 0) goto L6a
            r7 = 3
            java.lang.Character r10 = p000.q02.m4665(r12, r7)
            if (r10 == 0) goto L6a
            char r10 = r10.charValue()
            boolean r10 = java.lang.Character.isDigit(r10)
            if (r10 != r9) goto L6a
            java.lang.String r7 = r12.substring(r7)
            java.lang.String r7 = r8.concat(r7)
            r4.add(r7)
        L6a:
            boolean r7 = p000.x02.m6485(r12, r8, r6)
            if (r7 == 0) goto L8c
            r7 = 2
            java.lang.Character r8 = p000.q02.m4665(r12, r7)
            if (r8 == 0) goto L8c
            char r8 = r8.charValue()
            boolean r8 = java.lang.Character.isDigit(r8)
            if (r8 != r9) goto L8c
            java.lang.String r12 = r12.substring(r7)
            java.lang.String r12 = r5.concat(r12)
            r4.add(r12)
        L8c:
            java.util.Set r12 = p000.AbstractC0984xh.m6670(r4)
            java.util.List r12 = p000.AbstractC0984xh.m6666(r12)
            java.util.Iterator r12 = r12.iterator()
        L98:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto Lb4
            java.lang.Object r4 = r12.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Class r5 = java.lang.Class.forName(r4, r6, r11)     // Catch: java.lang.Throwable -> Lac
            r2.put(r0, r5)     // Catch: java.lang.Throwable -> Lac
            return r5
        Lac:
            java.lang.Class r4 = r11.loadClass(r4)     // Catch: java.lang.Throwable -> L98
            r2.put(r0, r4)     // Catch: java.lang.Throwable -> L98
            return r4
        Lb4:
            r3.add(r0)
            return r1
    }
}
