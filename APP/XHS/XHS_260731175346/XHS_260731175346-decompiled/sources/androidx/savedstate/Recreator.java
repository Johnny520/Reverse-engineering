package androidx.savedstate;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements xhss.InterfaceC0712 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.InterfaceC0056 f71;

    public Recreator(xhss.InterfaceC0056 r1) {
            r0 = this;
            r0.<init>()
            r0.f71 = r1
            return
    }

    @Override // xhss.InterfaceC0712
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo0(xhss.InterfaceC0386 r3, xhss.EnumC1174 r4) {
            r2 = this;
            java.lang.String r0 = "Class "
            xhss.ᲈᲀᛵᛸ r1 = xhss.EnumC1174.ON_CREATE
            if (r4 != r1) goto La9
            androidx.lifecycle.ᛷᛵᛵᲈ r3 = r3.mo63()
            r3.m29(r2)
            xhss.ᛱᛶᲁᛶ r2 = r2.f71
            xhss.ᲇᛸᛲᲁ r3 = r2.mo175()
            java.lang.String r4 = "androidx.savedstate.Restarter"
            android.os.Bundle r3 = r3.m1720(r4)
            if (r3 != 0) goto L1c
            goto L2e
        L1c:
            java.lang.String r4 = "classes_to_restore"
            java.util.ArrayList r3 = r3.getStringArrayList(r4)
            if (r3 == 0) goto La3
            java.util.Iterator r3 = r3.iterator()
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L2f
        L2e:
            return
        L2f:
            java.lang.Object r3 = r3.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Class<androidx.savedstate.Recreator> r4 = androidx.savedstate.Recreator.class
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L96
            r1 = 0
            java.lang.Class r4 = java.lang.Class.forName(r3, r1, r4)     // Catch: java.lang.ClassNotFoundException -> L96
            java.lang.Class<xhss.ᛶᛱᛸᛴ> r1 = xhss.InterfaceC0536.class
            java.lang.Class r4 = r4.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L96
            r1 = 0
            java.lang.reflect.Constructor r4 = r4.getDeclaredConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> L7a
            r0 = 1
            r4.setAccessible(r0)
            java.lang.Object r4 = r4.newInstance(r1)     // Catch: java.lang.Exception -> L65
            xhss.ᛶᛱᛸᛴ r4 = (xhss.InterfaceC0536) r4     // Catch: java.lang.Exception -> L65
            r3 = r2
            xhss.ᲁᲇᛸᲀ r3 = (xhss.InterfaceC0996) r3
            xhss.ᲈᲀᲀᛱ r3 = r3.mo1290()
            r2.mo175()
            r3.getClass()
            java.util.HashSet r2 = new java.util.HashSet
            throw r1
        L65:
            r2 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to instantiate "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3, r2)
            throw r4
        L7a:
            r2 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.getSimpleName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r4 = " must have default constructor in order to be automatically recreated"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r3.<init>(r4, r2)
            throw r3
        L96:
            r2 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r1 = " wasn't found"
            java.lang.String r3 = xhss.AbstractC0390.m781(r0, r3, r1)
            r4.<init>(r3, r2)
            throw r4
        La3:
            java.lang.String r2 = "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""
            xhss.C0532.m950(r2)
            return
        La9:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "Next event must be ON_CREATE"
            r2.<init>(r3)
            throw r2
    }
}
