package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ll1 implements p000.fr0 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f6708;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object f6709;

    public /* synthetic */ ll1(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f6708 = r1
            r0.f6709 = r2
            r0.<init>()
            return
    }

    @Override // p000.fr0
    /* JADX INFO: renamed from: κ */
    public final void mo743(p000.hr0 r5, p000.br0 r6) {
            r4 = this;
            int r0 = r4.f6708
            switch(r0) {
                case 0: goto L71;
                case 1: goto L59;
                case 2: goto L4d;
                default: goto L5;
            }
        L5:
            br0 r0 = p000.br0.ON_CREATE
            if (r6 != r0) goto L47
            jr0 r5 = r5.mo192()
            r5.m2985(r4)
            java.lang.Object r4 = r4.f6709
            eq1 r4 = (p000.eq1) r4
            boolean r5 = r4.f3644
            if (r5 != 0) goto L4c
            n5 r5 = r4.f3643
            java.lang.String r6 = "androidx.lifecycle.internal.SavedStateHandlesProvider"
            android.os.Bundle r5 = r5.m3985(r6)
            r6 = 0
            l91[] r0 = new p000.l91[r6]
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r0, r6)
            l91[] r6 = (p000.l91[]) r6
            android.os.Bundle r6 = p000.jx0.m3044(r6)
            android.os.Bundle r0 = r4.f3645
            if (r0 == 0) goto L34
            r6.putAll(r0)
        L34:
            if (r5 == 0) goto L39
            r6.putAll(r5)
        L39:
            r4.f3645 = r6
            r5 = 1
            r4.f3644 = r5
            h22 r4 = r4.f3646
            java.lang.Object r4 = r4.getValue()
            fq1 r4 = (p000.fq1) r4
            goto L4c
        L47:
            java.lang.String r4 = "Next event must be ON_CREATE, it was "
            p000.C1080.m7282(r6, r4)
        L4c:
            return
        L4d:
            br0 r5 = p000.br0.ON_STOP
            if (r6 != r5) goto L58
            java.lang.Object r4 = r4.f6709
            n60 r4 = (p000.n60) r4
            r4.getClass()
        L58:
            return
        L59:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.Object r4 = r4.f6709
            e90[] r4 = (p000.e90[]) r4
            int r5 = r4.length
            r6 = 0
            r0 = 0
            if (r5 > 0) goto L6e
            int r5 = r4.length
            if (r5 > 0) goto L6b
            return
        L6b:
            r4 = r4[r0]
            throw r6
        L6e:
            r4 = r4[r0]
            throw r6
        L71:
            java.lang.Object r0 = r4.f6709
            kq1 r0 = (p000.kq1) r0
            br0 r1 = p000.br0.ON_CREATE
            if (r6 != r1) goto L169
            jr0 r5 = r5.mo192()
            r5.m2985(r4)
            n5 r4 = r0.mo189()
            java.lang.String r5 = "androidx.savedstate.Restarter"
            android.os.Bundle r4 = r4.m3985(r5)
            if (r4 != 0) goto L8e
            goto L168
        L8e:
            java.lang.String r5 = "classes_to_restore"
            java.util.ArrayList r4 = r4.getStringArrayList(r5)
            if (r4 == 0) goto L163
            java.util.Iterator r4 = r4.iterator()
        L9a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L168
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "Class "
            java.lang.Class<ll1> r1 = p000.ll1.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L156
            r2 = 0
            java.lang.Class r1 = java.lang.Class.forName(r5, r2, r1)     // Catch: java.lang.ClassNotFoundException -> L156
            java.lang.Class<gq1> r2 = p000.gq1.class
            java.lang.Class r1 = r1.asSubclass(r2)     // Catch: java.lang.ClassNotFoundException -> L156
            r1.getClass()     // Catch: java.lang.ClassNotFoundException -> L156
            r2 = 0
            java.lang.reflect.Constructor r6 = r1.getDeclaredConstructor(r2)     // Catch: java.lang.NoSuchMethodException -> L13a
            r1 = 1
            r6.setAccessible(r1)
            java.lang.Object r6 = r6.newInstance(r2)     // Catch: java.lang.Exception -> L12d
            r6.getClass()     // Catch: java.lang.Exception -> L12d
            gq1 r6 = (p000.gq1) r6     // Catch: java.lang.Exception -> L12d
            boolean r5 = r0 instanceof p000.r92
            if (r5 == 0) goto L127
            r5 = r0
            r92 r5 = (p000.r92) r5
            q92 r5 = r5.mo191()
            n5 r6 = r0.mo189()
            r5.getClass()
            java.util.LinkedHashMap r5 = r5.f8929
            java.util.HashSet r1 = new java.util.HashSet
            java.util.Set r2 = r5.keySet()
            java.util.Collection r2 = (java.util.Collection) r2
            r1.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        Lf1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L111
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r2.getClass()
            java.lang.Object r2 = r5.get(r2)
            m92 r2 = (p000.m92) r2
            if (r2 != 0) goto L109
            goto Lf1
        L109:
            jr0 r3 = r0.mo192()
            p000.jx0.m3043(r2, r6, r3)
            goto Lf1
        L111:
            java.util.HashSet r1 = new java.util.HashSet
            java.util.Set r5 = r5.keySet()
            java.util.Collection r5 = (java.util.Collection) r5
            r1.<init>(r5)
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto L9a
            r6.m3975()
            goto L9a
        L127:
            java.lang.String r4 = "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: "
            p000.C1080.m7282(r0, r4)
            goto L168
        L12d:
            r4 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "Failed to instantiate "
            java.lang.String r5 = p000.lz1.m3687(r0, r5)
            r6.<init>(r5, r4)
            throw r6
        L13a:
            r4 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = r1.getSimpleName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            r1.append(r0)
            java.lang.String r6 = " must have default constructor in order to be automatically recreated"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r5.<init>(r6, r4)
            throw r5
        L156:
            r4 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = " wasn't found"
            java.lang.String r5 = p000.lz1.m3674(r6, r5, r1)
            r0.<init>(r5, r4)
            throw r0
        L163:
            java.lang.String r4 = "SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""
            p000.C1080.m7279(r4)
        L168:
            return
        L169:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.String r5 = "Next event must be ON_CREATE"
            r4.<init>(r5)
            throw r4
    }
}
