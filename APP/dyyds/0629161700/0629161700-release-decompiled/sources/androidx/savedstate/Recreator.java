package androidx.savedstate;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements defpackage.InterfaceC0708 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC1386 f342;

    public Recreator(defpackage.InterfaceC1386 r1) {
            r0 = this;
            r0.<init>()
            r0.f342 = r1
            return
    }

    @Override // defpackage.InterfaceC0708
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo6(defpackage.InterfaceC0770 r10, defpackage.EnumC2255 r11) {
            r9 = this;
            ᲈᛶᛱᛲ r0 = defpackage.EnumC2255.ON_CREATE
            if (r11 != r0) goto L15b
            androidx.lifecycle.ᛷᲁᛳᛳ r10 = r10.mo0()
            r10.m112(r9)
            ᛷᲇᛶᲈ r10 = r9.f342
            ᛶᛲᛱᛸ r10 = r10.mo4()
            java.lang.String r11 = "androidx.savedstate.Restarter"
            android.os.Bundle r10 = r10.m1970(r11)
            if (r10 != 0) goto L1b
            goto L154
        L1b:
            java.lang.String r11 = "classes_to_restore"
            java.util.ArrayList r10 = r10.getStringArrayList(r11)
            if (r10 == 0) goto L155
            java.util.Iterator r10 = r10.iterator()
        L27:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L154
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Class<androidx.savedstate.Recreator> r0 = androidx.savedstate.Recreator.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L148
            r1 = 0
            java.lang.Class r0 = java.lang.Class.forName(r11, r1, r0)     // Catch: java.lang.ClassNotFoundException -> L148
            java.lang.Class<ᲁᲈᛷᛶ> r1 = defpackage.InterfaceC1968.class
            java.lang.Class r0 = r0.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L148
            r1 = 0
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> L12a
            r2 = 1
            r0.setAccessible(r2)
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L115
            ᲁᲈᛷᛶ r0 = (defpackage.InterfaceC1968) r0     // Catch: java.lang.Exception -> L115
            ᛷᲇᛶᲈ r11 = r9.f342
            boolean r0 = r11 instanceof defpackage.InterfaceC2120
            if (r0 == 0) goto L10f
            r0 = r11
            ᲇᲀᛵᲀ r0 = (defpackage.InterfaceC2120) r0
            ᛳᛴᛱᲀ r0 = r0.mo1()
            ᛶᛲᛱᛸ r3 = r11.mo4()
            r0.getClass()
            java.util.HashSet r4 = new java.util.HashSet
            java.util.LinkedHashMap r5 = r0.f2205
            java.util.Set r5 = r5.keySet()
            r4.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L76:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lb3
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.util.LinkedHashMap r6 = r0.f2205
            java.lang.Object r5 = r6.get(r5)
            ᛵᲈᛱᲈ r5 = (defpackage.C0989) r5
            androidx.lifecycle.ᛷᲁᛳᛳ r6 = r11.mo0()
            java.lang.String r7 = "androidx.lifecycle.savedstate.vm.tag"
            java.util.HashMap r8 = r5.f4416
            monitor-enter(r8)
            java.util.HashMap r5 = r5.f4416     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r5 = r5.get(r7)     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lb0
            androidx.lifecycle.SavedStateHandleController r5 = (androidx.lifecycle.SavedStateHandleController) r5
            if (r5 == 0) goto L76
            boolean r7 = r5.f281
            if (r7 != 0) goto L76
            if (r7 == 0) goto Laa
            java.lang.String r9 = "Already attached to lifecycleOwner"
            defpackage.C2264.m3676(r9)
            return
        Laa:
            r5.f281 = r2
            r6.m110(r5)
            throw r1
        Lb0:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lb0
            throw r9
        Lb3:
            java.util.HashSet r11 = new java.util.HashSet
            java.util.LinkedHashMap r0 = r0.f2205
            java.util.Set r0 = r0.keySet()
            r11.<init>(r0)
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L27
            java.lang.Class<ᲁᲈᛵᛶ> r11 = defpackage.C1964.class
            boolean r0 = r3.f4548
            if (r0 == 0) goto L109
            java.lang.Object r0 = r3.f4552
            ᲁᛸᲁᛱ r0 = (defpackage.C1904) r0
            if (r0 != 0) goto Ld5
            ᲁᛸᲁᛱ r0 = new ᲁᛸᲁᛱ
            r0.<init>(r3)
        Ld5:
            r3.f4552 = r0
            r11.getDeclaredConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> Leb
            java.lang.Object r0 = r3.f4552
            ᲁᛸᲁᛱ r0 = (defpackage.C1904) r0
            if (r0 == 0) goto L27
            java.lang.String r11 = r11.getName()
            java.util.LinkedHashSet r0 = r0.f8265
            r0.add(r11)
            goto L27
        Leb:
            r9 = move-exception
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Class "
            java.lang.String r11 = r11.getSimpleName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r11)
            java.lang.String r11 = " must have default constructor in order to be automatically recreated"
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r10.<init>(r11, r9)
            throw r10
        L109:
            java.lang.String r9 = "Can not perform this action after onSaveInstanceState"
            defpackage.C2264.m3676(r9)
            return
        L10f:
            java.lang.String r9 = "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner"
            defpackage.C2264.m3676(r9)
            return
        L115:
            r9 = move-exception
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to instantiate "
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.<init>(r11, r9)
            throw r10
        L12a:
            r9 = move-exception
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Class "
            java.lang.String r0 = r0.getSimpleName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r11)
            r1.append(r0)
            java.lang.String r11 = " must have default constructor in order to be automatically recreated"
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r10.<init>(r11, r9)
            throw r10
        L148:
            r9 = move-exception
            java.lang.String r10 = "Class "
            java.lang.String r0 = " wasn't found"
            java.lang.String r10 = defpackage.AbstractC0225.m817(r10, r11, r0)
            defpackage.C0086.m548(r10, r9)
        L154:
            return
        L155:
            java.lang.String r9 = "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""
            defpackage.C2264.m3676(r9)
            return
        L15b:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            java.lang.String r10 = "Next event must be ON_CREATE"
            r9.<init>(r10)
            throw r9
    }
}
