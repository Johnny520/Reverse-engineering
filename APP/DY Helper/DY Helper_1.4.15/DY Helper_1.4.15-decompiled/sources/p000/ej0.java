package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ej0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3570;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.ClassLoader f3571;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f3572;

    public /* synthetic */ ej0(java.lang.ClassLoader r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.f3570 = r3
            r0.f3571 = r1
            r0.f3572 = r2
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r19) {
            r18 = this;
            r0 = r18
            int r1 = r0.f3570
            r2 = 0
            r3 = 1
            java.lang.Object r4 = r0.f3572
            java.lang.ClassLoader r0 = r0.f3571
            switch(r1) {
                case 0: goto L38;
                default: goto Ld;
            }
        Ld:
            r1 = r19
            org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1
            r1.getClass()
            vj0 r5 = p000.vj0.f11310
            java.util.List r3 = p000.vj0.m6256(r1, r0, r3)
            java.util.ArrayList r3 = p000.vj0.m6254(r4, r3)
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L25
            goto L37
        L25:
            java.util.List r0 = p000.vj0.m6256(r1, r0, r2)
            java.util.ArrayList r3 = p000.vj0.m6254(r4, r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L37
            java.util.List r3 = p000.vj0.m6261(r4)
        L37:
            return r3
        L38:
            r1 = r19
            th0 r1 = (p000.th0) r1
            r1.getClass()
            long r5 = r1.f10375
            wi0 r7 = p000.wi0.f11726
            java.lang.String r8 = r1.f10373
            r0.getClass()
            boolean r7 = p000.q02.m4671(r8)
            r9 = 0
            if (r7 == 0) goto L52
        L4f:
            r0 = r9
            goto Ld2
        L52:
            java.util.concurrent.atomic.AtomicReference r7 = p000.wi0.f11729
            r7.set(r0)
            ci0 r7 = p000.ci0.f2128
            java.lang.Object r7 = r7.m1214(r0)
            if (r7 != 0) goto L60
            goto L4f
        L60:
            java.lang.String r10 = "~795CFE82BF8D864C285649BA56CE33B4C18838459A84C50FE419E35FE204466F8D2561AAF8AA290694109CAA750A811D72F9"
            java.lang.String r10 = p000.jf0.m2957(r10)
            java.lang.Class r0 = p000.AbstractC0093bx.m1082(r0, r10)
            if (r0 != 0) goto L6d
            goto L4f
        L6d:
            java.util.ArrayList r0 = p000.wi0.m6381(r0)
            java.util.Iterator r0 = r0.iterator()
        L75:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto Lb3
            java.lang.Object r10 = r0.next()
            r11 = r10
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            java.lang.String r12 = r11.getName()
            java.lang.String r13 = "getConversation"
            boolean r12 = p000.ln0.m3626(r12, r13)
            if (r12 == 0) goto L75
            java.lang.Class[] r12 = r11.getParameterTypes()
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            java.lang.Class[] r13 = new java.lang.Class[]{r13}
            boolean r12 = java.util.Arrays.equals(r12, r13)
            if (r12 == 0) goto L75
            java.lang.Class r11 = r11.getReturnType()
            java.lang.String r11 = r11.getName()
            java.lang.String r12 = "~7934B87CF08E6E0B8EF20E7F7EAFB0B14A20D8F45CA801574E4ACC71C619528447ABA15E9CCFA094"
            java.lang.String r12 = p000.jf0.m2957(r12)
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L75
            goto Lb4
        Lb3:
            r10 = r9
        Lb4:
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            if (r10 != 0) goto Lb9
            goto L4f
        Lb9:
            r10.setAccessible(r3)     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object[] r0 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r0 = r10.invoke(r7, r0)     // Catch: java.lang.Throwable -> Lc5
            goto Lcc
        Lc5:
            r0 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r0)
            r0 = r7
        Lcc:
            boolean r7 = r0 instanceof p000.eo1
            if (r7 == 0) goto Ld2
            goto L4f
        Ld2:
            wi0 r7 = p000.wi0.f11726
            int r7 = r1.f10374
            java.lang.String r10 = "isSingleChat"
            java.lang.Object r10 = p000.wi0.m6387(r0, r10)
            boolean r11 = r10 instanceof java.lang.Boolean
            if (r11 == 0) goto Le3
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            goto Le4
        Le3:
            r10 = r9
        Le4:
            if (r10 == 0) goto Leb
            boolean r7 = r10.booleanValue()
            goto Lf0
        Leb:
            if (r7 != r3) goto Lef
            r7 = r3
            goto Lf0
        Lef:
            r7 = r2
        Lf0:
            if (r7 != 0) goto Lf4
            goto L19b
        Lf4:
            boolean r4 = r4.contains(r8)
            if (r4 != 0) goto L113
            java.lang.String r4 = "isStranger"
            java.lang.Object r0 = p000.wi0.m6387(r0, r4)
            boolean r4 = r0 instanceof java.lang.Boolean
            if (r4 == 0) goto L107
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L108
        L107:
            r0 = r9
        L108:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r0 = p000.ln0.m3626(r0, r4)
            if (r0 == 0) goto L111
            goto L113
        L111:
            r13 = r2
            goto L114
        L113:
            r13 = r3
        L114:
            st r0 = p000.C0810st.f10010
            pt r0 = r0.m5568(r5, r8)
            java.lang.String r4 = ""
            if (r0 == 0) goto L122
            java.lang.String r7 = r0.f8694
        L120:
            r11 = r7
            goto L129
        L122:
            java.lang.String r7 = p000.C0810st.m5555(r5)
            if (r7 != 0) goto L120
            r11 = r4
        L129:
            java.lang.String r7 = r1.f10376
            java.lang.CharSequence r7 = p000.q02.m4660(r7)
            java.lang.String r7 = r7.toString()
            java.lang.CharSequence r10 = p000.q02.m4660(r7)
            java.lang.String r10 = r10.toString()
            boolean r12 = p000.q02.m4671(r10)
            if (r12 != 0) goto L175
            boolean r12 = r10.equals(r8)
            if (r12 != 0) goto L175
            r14 = 0
            int r12 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r12 <= 0) goto L157
            java.lang.String r14 = java.lang.String.valueOf(r5)
            boolean r14 = r10.equals(r14)
            if (r14 != 0) goto L175
        L157:
            if (r12 <= 0) goto L16d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r14 = "UID: "
            r12.<init>(r14)
            r12.append(r5)
            java.lang.String r5 = r12.toString()
            boolean r5 = r10.equals(r5)
            if (r5 != 0) goto L175
        L16d:
            java.lang.String r5 = "CID:"
            boolean r5 = p000.x02.m6485(r10, r5, r2)
            if (r5 == 0) goto L176
        L175:
            r2 = r3
        L176:
            if (r2 != 0) goto L179
            goto L17a
        L179:
            r7 = r9
        L17a:
            if (r7 != 0) goto L17f
            r12 = r4
        L17d:
            r2 = r9
            goto L181
        L17f:
            r12 = r7
            goto L17d
        L181:
            long r9 = r1.f10375
            long r14 = r1.f10380
            if (r0 == 0) goto L18c
            java.lang.Integer r1 = r0.f8695
            r16 = r1
            goto L18e
        L18c:
            r16 = r2
        L18e:
            if (r0 == 0) goto L195
            java.lang.Integer r0 = r0.f8696
            r17 = r0
            goto L197
        L195:
            r17 = r2
        L197:
            xi0 r9 = p000.pd2.m4491(r8, r9, r11, r12, r13, r14, r16, r17)
        L19b:
            return r9
    }
}
