package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zh0 implements java.lang.reflect.InvocationHandler {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f13095;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f13096;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f13097;

    public /* synthetic */ zh0(java.util.concurrent.atomic.AtomicReference r1, java.util.concurrent.CountDownLatch r2, int r3) {
            r0 = this;
            r0.f13095 = r3
            r0.f13096 = r1
            r0.f13097 = r2
            r0.<init>()
            return
    }

    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object r20, java.lang.reflect.Method r21, java.lang.Object[] r22) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            int r3 = r0.f13095
            java.lang.String r4 = "invoke"
            java.lang.String r5 = "toString"
            r6 = 1
            java.lang.String r7 = "equals"
            java.lang.String r8 = "hashCode"
            r9 = 0
            r10 = 0
            java.util.concurrent.CountDownLatch r11 = r0.f13097
            java.util.concurrent.atomic.AtomicReference r0 = r0.f13096
            switch(r3) {
                case 0: goto L13c;
                case 1: goto Lab;
                default: goto L1a;
            }
        L1a:
            java.lang.String r3 = r21.getName()
            if (r3 == 0) goto Laa
            int r12 = r3.hashCode()
            switch(r12) {
                case -1776922004: goto La1;
                case -1295482945: goto L8b;
                case -1183693704: goto L3b;
                case 147696667: goto L29;
                default: goto L27;
            }
        L27:
            goto Laa
        L29:
            boolean r0 = r3.equals(r8)
            if (r0 != 0) goto L31
            goto Laa
        L31:
            int r0 = java.lang.System.identityHashCode(r1)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            goto Laa
        L3b:
            boolean r1 = r3.equals(r4)
            if (r1 != 0) goto L43
            goto Laa
        L43:
            if (r2 == 0) goto L4a
            java.lang.Object r1 = p000.AbstractC0312g7.m2253(r10, r2)
            goto L4b
        L4a:
            r1 = r9
        L4b:
            boolean r2 = r1 instanceof java.util.Map
            if (r2 == 0) goto L52
            java.util.Map r1 = (java.util.Map) r1
            goto L53
        L52:
            r1 = r9
        L53:
            if (r1 == 0) goto L87
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L66:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L84
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            if (r4 == 0) goto L66
            java.lang.String r4 = r4.toString()
            r2.put(r4, r3)
            goto L66
        L84:
            r0.set(r2)
        L87:
            r11.countDown()
            goto Laa
        L8b:
            boolean r0 = r3.equals(r7)
            if (r0 != 0) goto L92
            goto Laa
        L92:
            if (r2 == 0) goto L98
            java.lang.Object r9 = p000.AbstractC0312g7.m2253(r10, r2)
        L98:
            if (r1 != r9) goto L9b
            goto L9c
        L9b:
            r6 = r10
        L9c:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            goto Laa
        La1:
            boolean r0 = r3.equals(r5)
            if (r0 != 0) goto La8
            goto Laa
        La8:
            java.lang.String r9 = "DYHelperPetElfImageCallback"
        Laa:
            return r9
        Lab:
            java.lang.String r3 = r21.getName()
            if (r3 == 0) goto L13b
            int r12 = r3.hashCode()
            switch(r12) {
                case -1776922004: goto L132;
                case -1295482945: goto L11c;
                case -1183693704: goto Lcc;
                case 147696667: goto Lba;
                default: goto Lb8;
            }
        Lb8:
            goto L13b
        Lba:
            boolean r0 = r3.equals(r8)
            if (r0 != 0) goto Lc2
            goto L13b
        Lc2:
            int r0 = java.lang.System.identityHashCode(r1)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            goto L13b
        Lcc:
            boolean r1 = r3.equals(r4)
            if (r1 != 0) goto Ld4
            goto L13b
        Ld4:
            if (r2 == 0) goto Ldb
            java.lang.Object r1 = p000.AbstractC0312g7.m2253(r10, r2)
            goto Ldc
        Ldb:
            r1 = r9
        Ldc:
            boolean r2 = r1 instanceof java.util.Map
            if (r2 == 0) goto Le3
            java.util.Map r1 = (java.util.Map) r1
            goto Le4
        Le3:
            r1 = r9
        Le4:
            if (r1 == 0) goto L118
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf7:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L115
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            if (r4 == 0) goto Lf7
            java.lang.String r4 = r4.toString()
            r2.put(r4, r3)
            goto Lf7
        L115:
            r0.set(r2)
        L118:
            r11.countDown()
            goto L13b
        L11c:
            boolean r0 = r3.equals(r7)
            if (r0 != 0) goto L123
            goto L13b
        L123:
            if (r2 == 0) goto L129
            java.lang.Object r9 = p000.AbstractC0312g7.m2253(r10, r2)
        L129:
            if (r1 != r9) goto L12c
            goto L12d
        L12c:
            r6 = r10
        L12d:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            goto L13b
        L132:
            boolean r0 = r3.equals(r5)
            if (r0 != 0) goto L139
            goto L13b
        L139:
            java.lang.String r9 = "DYHelperPetElfXRequestCallback"
        L13b:
            return r9
        L13c:
            java.lang.String r3 = r21.getName()
            if (r3 == 0) goto L20c
            int r4 = r3.hashCode()
            switch(r4) {
                case -1776922004: goto L203;
                case -1295482945: goto L1ed;
                case 147696667: goto L1dd;
                case 1723693563: goto L14b;
                default: goto L149;
            }
        L149:
            goto L20c
        L14b:
            java.lang.String r1 = "onQueryConversationPage"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L155
            goto L20c
        L155:
            if (r2 == 0) goto L15c
            java.lang.Object r1 = p000.AbstractC0312g7.m2253(r10, r2)
            goto L15d
        L15c:
            r1 = r9
        L15d:
            boolean r3 = r1 instanceof java.lang.Iterable
            if (r3 == 0) goto L164
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            goto L165
        L164:
            r1 = r9
        L165:
            if (r1 == 0) goto L18a
            java.util.ArrayList r1 = p000.AbstractC0984xh.m6637(r1)
            ci0 r3 = p000.ci0.f2128
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L176:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L18b
            java.lang.Object r4 = r1.next()
            boolean r5 = p000.ci0.m1207(r4)
            if (r5 == 0) goto L176
            r3.add(r4)
            goto L176
        L18a:
            r3 = r9
        L18b:
            if (r3 != 0) goto L18f
            jz r3 = p000.C0450jz.f5672
        L18f:
            r13 = r3
            ai0 r12 = new ai0
            if (r2 == 0) goto L199
            java.lang.Object r1 = p000.AbstractC0312g7.m2253(r6, r2)
            goto L19a
        L199:
            r1 = r9
        L19a:
            boolean r3 = r1 instanceof java.lang.Boolean
            if (r3 == 0) goto L1a1
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L1a2
        L1a1:
            r1 = r9
        L1a2:
            if (r1 == 0) goto L1a8
            boolean r10 = r1.booleanValue()
        L1a8:
            r14 = r10
            if (r2 == 0) goto L1b1
            r1 = 2
            java.lang.Object r1 = p000.AbstractC0312g7.m2253(r1, r2)
            goto L1b2
        L1b1:
            r1 = r9
        L1b2:
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto L1b9
            java.lang.Number r1 = (java.lang.Number) r1
            goto L1ba
        L1b9:
            r1 = r9
        L1ba:
            if (r1 == 0) goto L1c2
            long r1 = r1.longValue()
        L1c0:
            r15 = r1
            goto L1c5
        L1c2:
            r1 = 0
            goto L1c0
        L1c5:
            r17 = 1
            java.lang.String r18 = ""
            r12.<init>(r13, r14, r15, r17, r18)
        L1cc:
            boolean r1 = r0.compareAndSet(r9, r12)
            if (r1 == 0) goto L1d6
            r11.countDown()
            goto L20c
        L1d6:
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L1cc
            goto L20c
        L1dd:
            boolean r0 = r3.equals(r8)
            if (r0 != 0) goto L1e4
            goto L20c
        L1e4:
            int r0 = java.lang.System.identityHashCode(r1)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            goto L20c
        L1ed:
            boolean r0 = r3.equals(r7)
            if (r0 != 0) goto L1f4
            goto L20c
        L1f4:
            if (r2 == 0) goto L1fa
            java.lang.Object r9 = p000.AbstractC0312g7.m2253(r10, r2)
        L1fa:
            if (r1 != r9) goto L1fd
            goto L1fe
        L1fd:
            r6 = r10
        L1fe:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            goto L20c
        L203:
            boolean r0 = r3.equals(r5)
            if (r0 != 0) goto L20a
            goto L20c
        L20a:
            java.lang.String r9 = "DyHelperConversationPageCallback"
        L20c:
            return r9
    }
}
