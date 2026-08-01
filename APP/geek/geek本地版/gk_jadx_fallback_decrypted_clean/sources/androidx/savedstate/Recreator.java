package androidx.savedstate;

/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements defpackage.mq {
    public final defpackage.u10 a;

    public Recreator(defpackage.u10 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.mq
    public final void b(defpackage.oq r13, defpackage.iq r14) {
            r12 = this;
            iq r0 = defpackage.iq.ON_CREATE
            if (r14 != r0) goto L187
            androidx.lifecycle.a r13 = r13.e()
            r13.f(r12)
            u10 r13 = r12.a
            a3 r13 = r13.b()
            java.lang.String r14 = "androidx.savedstate.Restarter"
            android.os.Bundle r13 = r13.c(r14)
            if (r13 != 0) goto L1b
            goto L17e
        L1b:
            java.lang.String r14 = "classes_to_restore"
            java.util.ArrayList r13 = r13.getStringArrayList(r14)
            if (r13 == 0) goto L17f
            int r14 = r13.size()
            r0 = 0
            r1 = r0
        L29:
            if (r1 >= r14) goto L17e
            java.lang.Object r2 = r13.get(r1)
            int r1 = r1 + 1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Class<androidx.savedstate.Recreator> r3 = androidx.savedstate.Recreator.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L16f
            java.lang.Class r3 = java.lang.Class.forName(r2, r0, r3)     // Catch: java.lang.ClassNotFoundException -> L16f
            java.lang.Class<s10> r4 = defpackage.s10.class
            java.lang.Class r3 = r3.asSubclass(r4)     // Catch: java.lang.ClassNotFoundException -> L16f
            java.lang.String r4 = "{\n                Class.…class.java)\n            }"
            defpackage.ip.n(r4, r3)     // Catch: java.lang.ClassNotFoundException -> L16f
            r4 = 0
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L151
            r5 = 1
            r3.setAccessible(r5)
            java.lang.Object r3 = r3.newInstance(r4)     // Catch: java.lang.Exception -> L13c
            java.lang.String r6 = "{\n                constr…wInstance()\n            }"
            defpackage.ip.n(r6, r3)     // Catch: java.lang.Exception -> L13c
            s10 r3 = (defpackage.s10) r3     // Catch: java.lang.Exception -> L13c
            u10 r2 = r12.a
            boolean r3 = r2 instanceof defpackage.sa0
            if (r3 == 0) goto L134
            r3 = r2
            sa0 r3 = (defpackage.sa0) r3
            ra0 r3 = r3.d()
            a3 r6 = r2.b()
            r3.getClass()
            java.util.HashSet r7 = new java.util.HashSet
            java.util.LinkedHashMap r8 = r3.a
            java.util.Set r8 = r8.keySet()
            r7.<init>(r8)
            java.util.Iterator r7 = r7.iterator()
        L7f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Ld4
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "key"
            defpackage.ip.o(r9, r8)
            java.util.LinkedHashMap r9 = r3.a
            java.lang.Object r8 = r9.get(r8)
            pa0 r8 = (defpackage.pa0) r8
            defpackage.ip.l(r8)
            androidx.lifecycle.a r9 = r2.e()
            java.lang.String r10 = "registry"
            defpackage.ip.o(r10, r6)
            java.lang.String r10 = "lifecycle"
            defpackage.ip.o(r10, r9)
            java.lang.String r10 = "androidx.lifecycle.savedstate.vm.tag"
            java.util.HashMap r11 = r8.a
            if (r11 != 0) goto Lb1
            r8 = r4
            goto Lb9
        Lb1:
            monitor-enter(r11)
            java.util.HashMap r8 = r8.a     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object r8 = r8.get(r10)     // Catch: java.lang.Throwable -> Ld1
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Ld1
        Lb9:
            androidx.lifecycle.SavedStateHandleController r8 = (androidx.lifecycle.SavedStateHandleController) r8
            if (r8 == 0) goto L7f
            boolean r10 = r8.a
            if (r10 != 0) goto L7f
            if (r10 == 0) goto Lcb
            java.lang.String r13 = "Already attached to lifecycleOwner"
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>(r13)
            throw r14
        Lcb:
            r8.a = r5
            r9.a(r8)
            throw r4
        Ld1:
            r13 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Ld1
            throw r13
        Ld4:
            java.util.HashSet r2 = new java.util.HashSet
            java.util.LinkedHashMap r3 = r3.a
            java.util.Set r3 = r3.keySet()
            r2.<init>(r3)
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L29
            java.lang.Class<fq> r2 = defpackage.fq.class
            boolean r3 = r6.e
            if (r3 == 0) goto L12c
            java.lang.Object r3 = r6.b
            s2 r3 = (defpackage.s2) r3
            if (r3 != 0) goto Lf6
            s2 r3 = new s2
            r3.<init>(r6)
        Lf6:
            r6.b = r3
            r2.getDeclaredConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L10e
            java.lang.Object r3 = r6.b
            s2 r3 = (defpackage.s2) r3
            if (r3 == 0) goto L29
            java.lang.String r2 = r2.getName()
            java.lang.Object r3 = r3.b
            java.util.LinkedHashSet r3 = (java.util.LinkedHashSet) r3
            r3.add(r2)
            goto L29
        L10e:
            r13 = move-exception
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Class "
            r0.<init>(r1)
            java.lang.String r1 = r2.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " must have default constructor in order to be automatically recreated"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0, r13)
            throw r14
        L12c:
            java.lang.String r13 = "Can not perform this action after onSaveInstanceState"
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>(r13)
            throw r14
        L134:
            java.lang.String r13 = "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner"
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>(r13)
            throw r14
        L13c:
            r13 = move-exception
            java.lang.RuntimeException r14 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to instantiate "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0, r13)
            throw r14
        L151:
            r13 = move-exception
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Class "
            r0.<init>(r1)
            java.lang.String r1 = r3.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " must have default constructor in order to be automatically recreated"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0, r13)
            throw r14
        L16f:
            r13 = move-exception
            java.lang.RuntimeException r14 = new java.lang.RuntimeException
            java.lang.String r0 = "Class "
            java.lang.String r1 = " wasn't found"
            java.lang.String r0 = defpackage.z30.j(r0, r2, r1)
            r14.<init>(r0, r13)
            throw r14
        L17e:
            return
        L17f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""
            r13.<init>(r14)
            throw r13
        L187:
            java.lang.AssertionError r13 = new java.lang.AssertionError
            java.lang.String r14 = "Next event must be ON_CREATE"
            r13.<init>(r14)
            throw r13
    }
}
