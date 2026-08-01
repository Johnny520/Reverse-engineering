package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zb0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f13026;

    public /* synthetic */ zb0(int r1) {
            r0 = this;
            r0.f13026 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r10) {
            r9 = this;
            int r9 = r9.f13026
            java.lang.String r0 = "null"
            r1 = 3
            r2 = 0
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r5 = 0
            r6 = 0
            r7 = 1
            switch(r9) {
                case 0: goto L3f1;
                case 1: goto L3e1;
                case 2: goto L3d0;
                case 3: goto L3c8;
                case 4: goto L3c0;
                case 5: goto L3b0;
                case 6: goto L3a4;
                case 7: goto L372;
                case 8: goto L334;
                case 9: goto L2f2;
                case 10: goto L2eb;
                case 11: goto L2e1;
                case 12: goto L23f;
                case 13: goto L235;
                case 14: goto L1c3;
                case 15: goto L195;
                case 16: goto L186;
                case 17: goto L167;
                case 18: goto L160;
                case 19: goto L14c;
                case 20: goto Lcc;
                case 21: goto Lc5;
                case 22: goto Lbb;
                case 23: goto Lb0;
                case 24: goto La5;
                case 25: goto L9e;
                case 26: goto L4a;
                case 27: goto L32;
                case 28: goto L1f;
                default: goto Lf;
            }
        Lf:
            java.lang.Long r10 = (java.lang.Long) r10
            long r9 = r10.longValue()
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 <= 0) goto L1a
            r6 = r7
        L1a:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            return r9
        L1f:
            java.lang.String r10 = (java.lang.String) r10
            r10.getClass()
            android.os.Handler r9 = p000.ah0.f229
            ea r0 = new ea
            r1 = 4
            r0.<init>(r10, r1)
            r9.post(r0)
            s62 r9 = p000.s62.f9751
            return r9
        L32:
            java.lang.String r10 = (java.lang.String) r10
            r10.getClass()
            dk0 r9 = p000.ah0.f241
            boolean r9 = r9.f3196
            if (r9 == 0) goto L47
            android.os.Handler r9 = p000.ah0.f229
            fb0 r10 = new fb0
            r10.<init>(r1)
            r9.post(r10)
        L47:
            s62 r9 = p000.s62.f9751
            return r9
        L4a:
            java.lang.String r10 = (java.lang.String) r10
            r10.getClass()
            ym1 r9 = p000.hk0.f4753
            java.lang.String r9 = "*"
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L91
            java.lang.String r9 = "im_time_label_enabled"
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L91
            java.lang.String r9 = "im_time_label_format"
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L91
            java.lang.String r9 = "im_time_label_text"
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L91
            java.lang.String r9 = "im_time_label_light_color"
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L91
            java.lang.String r9 = "im_time_label_dark_color"
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L91
            java.lang.String r9 = "im_anti_recall_enabled"
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L91
            java.lang.String r9 = "im_recall_mark_enabled"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L9b
        L91:
            android.os.Handler r9 = p000.ah0.f229
            ea r0 = new ea
            r0.<init>(r10, r1)
            r9.post(r0)
        L9b:
            s62 r9 = p000.s62.f9751
            return r9
        L9e:
            java.lang.Class r10 = (java.lang.Class) r10
            java.lang.String r9 = r10.getName()
            return r9
        La5:
            if (r10 == 0) goto Laf
            java.lang.Class r9 = r10.getClass()
            java.lang.String r0 = r9.getName()
        Laf:
            return r0
        Lb0:
            if (r10 == 0) goto Lba
            java.lang.Class r9 = r10.getClass()
            java.lang.String r0 = r9.getName()
        Lba:
            return r0
        Lbb:
            java.lang.Class r10 = (java.lang.Class) r10
            r10.getClass()
            java.lang.String r9 = r10.getName()
            return r9
        Lc5:
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            java.lang.Class r9 = r10.getReturnType()
            return r9
        Lcc:
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            java.lang.Class[] r9 = r10.getParameterTypes()
            r9.getClass()
            int r0 = r9.length
            r1 = r6
        Ld7:
            if (r1 >= r0) goto L147
            r2 = r9[r1]
            java.lang.Class<java.util.List> r3 = java.util.List.class
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto L144
            java.lang.Class r9 = r10.getReturnType()
            r9.getClass()
            java.lang.Class r10 = java.lang.Void.TYPE
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L147
            boolean r10 = r9.isPrimitive()
            if (r10 != 0) goto L147
            boolean r10 = r9.isArray()
            if (r10 != 0) goto L147
            boolean r10 = r9.equals(r4)
            if (r10 == 0) goto L105
            goto L147
        L105:
            boolean r10 = r3.isAssignableFrom(r9)
            if (r10 == 0) goto L10c
            goto L147
        L10c:
            java.lang.String r4 = "io.reactivex."
            java.lang.String r5 = "kotlinx."
            java.lang.String r0 = "java."
            java.lang.String r1 = "kotlin."
            java.lang.String r2 = "android."
            java.lang.String r3 = "androidx."
            java.lang.String[] r10 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            java.util.List r10 = p000.AbstractC1021yh.m6897(r10)
            java.lang.String r9 = r9.getName()
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L12b
            goto L142
        L12b:
            java.util.Iterator r10 = r10.iterator()
        L12f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L142
            java.lang.Object r0 = r10.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = p000.x02.m6485(r9, r0, r6)
            if (r0 == 0) goto L12f
            goto L147
        L142:
            r6 = r7
            goto L147
        L144:
            int r1 = r1 + 1
            goto Ld7
        L147:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            return r9
        L14c:
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            boolean r9 = r10.isSynthetic()
            if (r9 != 0) goto L15a
            boolean r9 = r10.isBridge()
            if (r9 == 0) goto L15b
        L15a:
            r6 = r7
        L15b:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            return r9
        L160:
            java.lang.Class r10 = (java.lang.Class) r10
            java.lang.String r9 = r10.getName()
            return r9
        L167:
            java.lang.String r10 = (java.lang.String) r10
            r10.getClass()
            java.lang.String r9 = "hidden_contact_enabled_v2"
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L17c
            java.lang.String r9 = "hidden_contacts_v2"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L183
        L17c:
            be0 r9 = p000.be0.f1670
            java.lang.String r10 = "config_changed"
            r9.m944(r10)
        L183:
            s62 r9 = p000.s62.f9751
            return r9
        L186:
            java.lang.String r10 = (java.lang.String) r10
            r10.getClass()
            be0 r9 = p000.be0.f1670
            java.lang.String r10 = "profile_changed"
            r9.m944(r10)
            s62 r9 = p000.s62.f9751
            return r9
        L195:
            java.lang.Class r10 = (java.lang.Class) r10
            r10.getClass()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L19f:
            if (r10 == 0) goto L1c2
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L1c2
            java.lang.reflect.Field[] r0 = r10.getDeclaredFields()
            r0.getClass()
            int r1 = r0.length
            r2 = r6
        L1b0:
            if (r2 >= r1) goto L1bd
            r3 = r0[r2]
            r3.setAccessible(r7)     // Catch: java.lang.Throwable -> L1b7
        L1b7:
            r9.add(r3)
            int r2 = r2 + 1
            goto L1b0
        L1bd:
            java.lang.Class r10 = r10.getSuperclass()
            goto L19f
        L1c2:
            return r9
        L1c3:
            java.lang.Class r10 = (java.lang.Class) r10
            r10.getClass()
            java.util.List r9 = p000.vd0.m6174(r10)
            java.util.Iterator r10 = r9.iterator()
            r1 = r5
            r0 = r6
        L1d2:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L1fa
            java.lang.Object r2 = r10.next()
            r3 = r2
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class r3 = r3.getType()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "~79380C0D8C98F945BB08C5D5DB5DF1EAD9B59028068ACB54724044B8894FBBCB0991F2748ACD993981847A"
            java.lang.String r4 = p000.jf0.m2957(r4)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L1d2
            if (r0 == 0) goto L1f7
        L1f5:
            r1 = r5
            goto L1fd
        L1f7:
            r1 = r2
            r0 = r7
            goto L1d2
        L1fa:
            if (r0 != 0) goto L1fd
            goto L1f5
        L1fd:
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            if (r1 != 0) goto L234
            java.util.Iterator r9 = r9.iterator()
            r10 = r5
        L206:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L22d
            java.lang.Object r0 = r9.next()
            r1 = r0
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            java.lang.Class r1 = r1.getType()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "~7954D7E14DB7341B6A011C494738772667DB63664E455DD5DA57E5C48FD7B3E094AA60E23CF26DE3BAC25A60400A2726"
            java.lang.String r2 = p000.jf0.m2957(r2)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L206
            if (r6 == 0) goto L22a
            goto L231
        L22a:
            r10 = r0
            r6 = r7
            goto L206
        L22d:
            if (r6 != 0) goto L230
            goto L231
        L230:
            r5 = r10
        L231:
            r1 = r5
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L234:
            return r1
        L235:
            java.lang.Class r10 = (java.lang.Class) r10
            r10.getClass()
            sd0 r9 = p000.vd0.m6196(r10)
            return r9
        L23f:
            java.lang.Class r10 = (java.lang.Class) r10
            r10.getClass()
            java.lang.reflect.Method[] r9 = r10.getMethods()
            r9.getClass()
            java.util.List r9 = java.util.Arrays.asList(r9)
            r9.getClass()
            java.lang.reflect.Method[] r10 = r10.getDeclaredMethods()
            r10.getClass()
            java.util.List r10 = java.util.Arrays.asList(r10)
            r10.getClass()
            java.util.ArrayList r9 = p000.AbstractC0984xh.m6651(r9, r10)
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L272:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L2cc
            java.lang.Object r1 = r9.next()
            r2 = r1
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class r4 = r2.getDeclaringClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            r4 = 35
            r3.append(r4)
            java.lang.String r4 = r2.getName()
            r3.append(r4)
            r4 = 40
            r3.append(r4)
            java.lang.Class[] r2 = r2.getParameterTypes()
            r2.getClass()
            zb0 r4 = new zb0
            r6 = 10
            r4.<init>(r6)
            r6 = 30
            java.lang.String r8 = ","
            java.lang.String r2 = p000.AbstractC0312g7.m2256(r2, r8, r5, r4, r6)
            r3.append(r2)
            r2 = 41
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            boolean r2 = r10.add(r2)
            if (r2 == 0) goto L272
            r0.add(r1)
            goto L272
        L2cc:
            java.util.Iterator r9 = r0.iterator()
        L2d0:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L2e0
            java.lang.Object r10 = r9.next()
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            r10.setAccessible(r7)     // Catch: java.lang.Throwable -> L2d0
            goto L2d0
        L2e0:
            return r0
        L2e1:
            java.lang.Class r10 = (java.lang.Class) r10
            r10.getClass()
            sd0 r9 = p000.vd0.m6196(r10)
            return r9
        L2eb:
            java.lang.Class r10 = (java.lang.Class) r10
            java.lang.String r9 = r10.getName()
            return r9
        L2f2:
            java.lang.Class r10 = (java.lang.Class) r10
            r10.getClass()
            java.util.List r9 = p000.vd0.m6174(r10)
            java.util.Iterator r9 = r9.iterator()
            r10 = r5
        L300:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L328
            java.lang.Object r0 = r9.next()
            r1 = r0
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r2 = r1.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            if (r2 != 0) goto L300
            java.lang.Class r1 = r1.getType()
            boolean r1 = p000.ln0.m3626(r1, r4)
            if (r1 == 0) goto L300
            if (r6 == 0) goto L325
        L323:
            r10 = r5
            goto L32b
        L325:
            r10 = r0
            r6 = r7
            goto L300
        L328:
            if (r6 != 0) goto L32b
            goto L323
        L32b:
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            if (r10 == 0) goto L333
            r10.setAccessible(r7)
            r5 = r10
        L333:
            return r5
        L334:
            java.lang.Class r10 = (java.lang.Class) r10
            r10.getClass()
            java.util.List r9 = p000.vd0.m6174(r10)
            java.util.Iterator r9 = r9.iterator()
            r10 = r5
        L342:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L36b
            java.lang.Object r0 = r9.next()
            r1 = r0
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r2 = r1.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            if (r2 != 0) goto L342
            java.lang.String r1 = p000.vd0.m6197(r1)
            java.lang.String r2 = "extra_info"
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L342
            if (r6 == 0) goto L368
            goto L36f
        L368:
            r10 = r0
            r6 = r7
            goto L342
        L36b:
            if (r6 != 0) goto L36e
            goto L36f
        L36e:
            r5 = r10
        L36f:
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            return r5
        L372:
            java.lang.Class r10 = (java.lang.Class) r10
            r10.getClass()
            java.util.List r9 = p000.vd0.m6174(r10)
            java.util.Iterator r9 = r9.iterator()
            r10 = r5
        L380:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L39d
            java.lang.Object r0 = r9.next()
            r1 = r0
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            java.lang.Class r1 = r1.getType()
            boolean r1 = p000.ln0.m3626(r1, r4)
            if (r1 == 0) goto L380
            if (r6 == 0) goto L39a
            goto L3a1
        L39a:
            r10 = r0
            r6 = r7
            goto L380
        L39d:
            if (r6 != 0) goto L3a0
            goto L3a1
        L3a0:
            r5 = r10
        L3a1:
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            return r5
        L3a4:
            xd0 r10 = (p000.xd0) r10
            r10.getClass()
            java.lang.String r9 = r10.f12133
            java.lang.Long r9 = p000.x02.m6488(r9)
            return r9
        L3b0:
            xd0 r10 = (p000.xd0) r10
            r10.getClass()
            java.lang.String r9 = r10.f12137
            boolean r9 = p000.q02.m4671(r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L3c0:
            rb0 r10 = (p000.rb0) r10
            r10.getClass()
            s62 r9 = p000.s62.f9751
            return r9
        L3c8:
            db0 r10 = (p000.db0) r10
            r10.getClass()
            s62 r9 = p000.s62.f9751
            return r9
        L3d0:
            ic0 r10 = (p000.ic0) r10
            r10.getClass()
            long r9 = r10.f4993
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 <= 0) goto L3dc
            r6 = r7
        L3dc:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            return r9
        L3e1:
            java.lang.Long r10 = (java.lang.Long) r10
            long r9 = r10.longValue()
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 <= 0) goto L3ec
            r6 = r7
        L3ec:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            return r9
        L3f1:
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            st r9 = p000.C0810st.f10010     // Catch: java.lang.Throwable -> L400
            java.lang.String r2 = ""
            pt r9 = r9.m5568(r0, r2)     // Catch: java.lang.Throwable -> L400
            goto L408
        L400:
            r0 = move-exception
            r9 = r0
            eo1 r0 = new eo1
            r0.<init>(r9)
            r9 = r0
        L408:
            boolean r0 = r9 instanceof p000.eo1
            if (r0 == 0) goto L40d
            r9 = r5
        L40d:
            pt r9 = (p000.C0699pt) r9
            if (r9 == 0) goto L42c
            java.lang.String r9 = r9.f8694
            java.lang.CharSequence r9 = p000.q02.m4660(r9)
            java.lang.String r9 = r9.toString()
            if (r9 == 0) goto L42c
            boolean r0 = p000.q02.m4671(r9)
            if (r0 != 0) goto L424
            goto L425
        L424:
            r9 = r5
        L425:
            if (r9 == 0) goto L42c
            l91 r5 = new l91
            r5.<init>(r10, r9)
        L42c:
            return r5
    }
}
