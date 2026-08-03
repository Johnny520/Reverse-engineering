package x6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21201g;

    public /* synthetic */ c(int r1) {
            r0 = this;
            r0.f21201g = r1
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            int r0 = r4.f21201g
            switch(r0) {
                case 0: goto L201;
                case 1: goto L1d7;
                case 2: goto L19d;
                case 3: goto L164;
                case 4: goto L10e;
                case 5: goto Le6;
                case 6: goto Lcc;
                case 7: goto Lb2;
                case 8: goto L76;
                case 9: goto L5e;
                case 10: goto L46;
                case 11: goto L2e;
                case 12: goto L16;
                default: goto L5;
            }
        L5:
            u6.d r6 = (u6.d) r6
            java.lang.reflect.Method r6 = r6.f13528c
            java.lang.Object r6 = r6.getDefaultValue()
            boolean r5 = gg.l.a(r6, r5)
        L11:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L16:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            u6.d r6 = (u6.d) r6
            java.lang.reflect.Method r6 = r6.f13528c
            boolean r6 = r6.isDefault()
            if (r6 == r5) goto L28
            r5 = 1
            goto L29
        L28:
            r5 = 0
        L29:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L2e:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            u6.d r6 = (u6.d) r6
            java.lang.reflect.Method r6 = r6.f13528c
            boolean r6 = r6.isDefault()
            if (r6 != r5) goto L40
            r5 = 1
            goto L41
        L40:
            r5 = 0
        L41:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L46:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            u6.d r6 = (u6.d) r6
            java.lang.reflect.Method r6 = r6.f13528c
            boolean r6 = r6.isBridge()
            if (r6 == r5) goto L58
            r5 = 1
            goto L59
        L58:
            r5 = 0
        L59:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L5e:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            u6.d r6 = (u6.d) r6
            java.lang.reflect.Method r6 = r6.f13528c
            boolean r6 = r6.isBridge()
            if (r6 != r5) goto L70
            r5 = 1
            goto L71
        L70:
            r5 = 0
        L71:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L76:
            java.lang.String r5 = (java.lang.String) r5
            u6.c r6 = (u6.c) r6
            java.lang.reflect.Member r6 = r6.a()
            boolean r0 = r6 instanceof java.lang.reflect.Method
            if (r0 == 0) goto L8c
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.String r6 = r6.toGenericString()
            r6.getClass()
            goto Lac
        L8c:
            boolean r0 = r6 instanceof java.lang.reflect.Constructor
            if (r0 == 0) goto L9a
            java.lang.reflect.Constructor r6 = (java.lang.reflect.Constructor) r6
            java.lang.String r6 = r6.toGenericString()
            r6.getClass()
            goto Lac
        L9a:
            boolean r0 = r6 instanceof java.lang.reflect.Field
            if (r0 == 0) goto La8
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            java.lang.String r6 = r6.toGenericString()
            r6.getClass()
            goto Lac
        La8:
            java.lang.String r6 = r6.toString()
        Lac:
            boolean r5 = gg.l.a(r6, r5)
            goto L11
        Lb2:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            u6.c r6 = (u6.c) r6
            java.lang.reflect.Member r6 = r6.a()
            boolean r6 = r6.isSynthetic()
            if (r6 == r5) goto Lc6
            r5 = 1
            goto Lc7
        Lc6:
            r5 = 0
        Lc7:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        Lcc:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            u6.c r6 = (u6.c) r6
            java.lang.reflect.Member r6 = r6.a()
            boolean r6 = r6.isSynthetic()
            if (r6 != r5) goto Le0
            r5 = 1
            goto Le1
        Le0:
            r5 = 0
        Le1:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        Le6:
            fg.l r5 = (fg.l) r5
            u6.d r6 = (u6.d) r6
            java.lang.reflect.Method r6 = r6.f13528c     // Catch: java.lang.Throwable -> Lfd
            java.lang.reflect.Type r6 = r6.getGenericReturnType()     // Catch: java.lang.Throwable -> Lfd
            r6.getClass()     // Catch: java.lang.Throwable -> Lfd
            java.lang.Object r5 = r5.invoke(r6)     // Catch: java.lang.Throwable -> Lfd
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> Lfd
            r5.getClass()     // Catch: java.lang.Throwable -> Lfd
            goto L104
        Lfd:
            r5 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r5)
            r5 = r6
        L104:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r0 = r5 instanceof sf.f
            if (r0 == 0) goto L10b
            r5 = r6
        L10b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            return r5
        L10e:
            fg.l r5 = (fg.l) r5
            u6.c r6 = (u6.c) r6
            l3.w r0 = s6.a.f12364h     // Catch: java.lang.Throwable -> L153
            java.lang.reflect.Member r6 = r6.a()     // Catch: java.lang.Throwable -> L153
            int r6 = r6.getModifiers()     // Catch: java.lang.Throwable -> L153
            r0.getClass()     // Catch: java.lang.Throwable -> L153
            zf.b r0 = s6.a.f12366j     // Catch: java.lang.Throwable -> L153
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L153
            r1.<init>()     // Catch: java.lang.Throwable -> L153
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L153
        L12a:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L153
            if (r2 == 0) goto L145
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L153
            r3 = r2
            s6.a r3 = (s6.a) r3     // Catch: java.lang.Throwable -> L153
            int r3 = r3.f12367g     // Catch: java.lang.Throwable -> L153
            r3 = r3 & r6
            if (r3 == 0) goto L13e
            r3 = 1
            goto L13f
        L13e:
            r3 = 0
        L13f:
            if (r3 == 0) goto L12a
            r1.add(r2)     // Catch: java.lang.Throwable -> L153
            goto L12a
        L145:
            java.util.Set r6 = tf.m.U1(r1)     // Catch: java.lang.Throwable -> L153
            java.lang.Object r5 = r5.invoke(r6)     // Catch: java.lang.Throwable -> L153
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L153
            r5.getClass()     // Catch: java.lang.Throwable -> L153
            goto L15a
        L153:
            r5 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r5)
            r5 = r6
        L15a:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r0 = r5 instanceof sf.f
            if (r0 == 0) goto L161
            r5 = r6
        L161:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            return r5
        L164:
            java.util.Set r5 = (java.util.Set) r5
            u6.c r6 = (u6.c) r6
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L178
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L178
            goto L197
        L178:
            java.util.Iterator r5 = r5.iterator()
        L17c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L197
            java.lang.Object r0 = r5.next()
            s6.a r0 = (s6.a) r0
            java.lang.reflect.Member r1 = r6.a()
            int r1 = r1.getModifiers()
            int r0 = r0.f12367g
            r0 = r0 & r1
            if (r0 == 0) goto L17c
            r5 = 0
            goto L198
        L197:
            r5 = 1
        L198:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L19d:
            java.util.Set r5 = (java.util.Set) r5
            u6.c r6 = (u6.c) r6
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L1b1
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1b1
            goto L1d1
        L1b1:
            java.util.Iterator r5 = r5.iterator()
        L1b5:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L1d1
            java.lang.Object r0 = r5.next()
            s6.a r0 = (s6.a) r0
            java.lang.reflect.Member r1 = r6.a()
            int r1 = r1.getModifiers()
            int r0 = r0.f12367g
            r0 = r0 & r1
            if (r0 == 0) goto L1cf
            goto L1b5
        L1cf:
            r5 = 0
            goto L1d2
        L1d1:
            r5 = 1
        L1d2:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L1d7:
            fg.l r5 = (fg.l) r5
            u6.c r6 = (u6.c) r6
            java.lang.reflect.Member r6 = r6.a()     // Catch: java.lang.Throwable -> L1f0
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L1f0
            r6.getClass()     // Catch: java.lang.Throwable -> L1f0
            java.lang.Object r5 = r5.invoke(r6)     // Catch: java.lang.Throwable -> L1f0
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L1f0
            r5.getClass()     // Catch: java.lang.Throwable -> L1f0
            goto L1f7
        L1f0:
            r5 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r5)
            r5 = r6
        L1f7:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r0 = r5 instanceof sf.f
            if (r0 == 0) goto L1fe
            r5 = r6
        L1fe:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            return r5
        L201:
            java.lang.String r5 = (java.lang.String) r5
            u6.c r6 = (u6.c) r6
            java.lang.reflect.Member r6 = r6.a()
            java.lang.String r6 = r6.getName()
            r6.getClass()
            boolean r5 = r6.equals(r5)
            goto L11
    }
}
