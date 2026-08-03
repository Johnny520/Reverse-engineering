package p001a0;

import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p144k.C2177i;
import p267s1.C3904k0;
import p267s1.C3914t;
import p276sf.C3967n;
import p321w.C4642w;
import p370yf.AbstractC6043h;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: a0.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0002b extends AbstractC6043h implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6g;

    /* JADX INFO: renamed from: h */
    public int f7h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f8i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f9j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0002b(Object obj, InterfaceC5557c interfaceC5557c, int i9) {
        super(interfaceC5557c);
        this.f6g = i9;
        this.f9j = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f6g) {
            case 0:
                C0002b c0002b = new C0002b((InterfaceC1231l) this.f9j, interfaceC5557c, 0);
                c0002b.f8i = obj;
                return c0002b;
            case 1:
                C0002b c0002b2 = new C0002b((C4642w) this.f9j, interfaceC5557c, 1);
                c0002b2.f8i = obj;
                return c0002b2;
            case 2:
                C0002b c0002b3 = new C0002b((C2177i) this.f9j, interfaceC5557c, 2);
                c0002b3.f8i = obj;
                return c0002b3;
            default:
                C0002b c0002b4 = new C0002b((C3914t) this.f9j, interfaceC5557c, 3);
                c0002b4.f8i = obj;
                return c0002b4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        C3904k0 c3904k0 = (C3904k0) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f6g) {
            case 1:
                ((C0002b) create(c3904k0, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
                break;
        }
        return ((C0002b) create(c3904k0, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fd  */
    /* JADX WARN: Type inference failed for: r12v32, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v42, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002f -> B:13:0x0034). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00fe -> B:46:0x0101). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x018f -> B:78:0x0193). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.f6g
            switch(r0) {
                case 0: goto L1a6;
                case 1: goto L165;
                case 2: goto Lae;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r11.f9j
            s1.t r0 = (p267s1.C3914t) r0
            java.lang.Object r1 = r11.f8i
            s1.k0 r1 = (p267s1.C3904k0) r1
            int r2 = r11.f7h
            r3 = 1
            if (r2 == 0) goto L20
            if (r2 != r3) goto L18
            p077f8.AbstractC1089i.m2732I0(r12)
            goto L34
        L18:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r12)
            r12 = 0
            goto Lad
        L20:
            p077f8.AbstractC1089i.m2732I0(r12)
        L23:
            r11.f8i = r1
            r11.f7h = r3
            s1.l r12 = p267s1.EnumC3905l.f12812g
            java.lang.Object r12 = r1.m8102e(r12, r11)
            xf.a r2 = p352xf.EnumC5799a.f23547g
            if (r12 != r2) goto L34
            r12 = r2
            goto Lad
        L34:
            s1.k r12 = (p267s1.C3903k) r12
            java.lang.Object r12 = r12.f12800a
            java.util.Iterator r12 = r12.iterator()
        L3c:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L54
            java.lang.Object r2 = r12.next()
            r4 = r2
            s1.t r4 = (p267s1.C3914t) r4
            long r4 = r4.f12834a
            long r6 = r0.f12834a
            boolean r4 = p267s1.AbstractC3913s.m8112e(r4, r6)
            if (r4 == 0) goto L3c
            goto L55
        L54:
            r2 = 0
        L55:
            s1.t r2 = (p267s1.C3914t) r2
            if (r2 == 0) goto Lab
            long r4 = r2.f12836c
            boolean r12 = r2.f12837d
            if (r12 != 0) goto L62
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            goto Lad
        L62:
            r12 = 32
            long r6 = r4 >> r12
            int r2 = (int) r6
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r6 = r0.f12836c
            long r6 = r6 >> r12
            int r12 = (int) r6
            float r12 = java.lang.Float.intBitsToFloat(r12)
            float r2 = r2 - r12
            float r12 = java.lang.Math.abs(r2)
            y1.l2 r2 = r1.m8099B()
            float r2 = r2.mo10228f()
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 > 0) goto La8
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r12 = (int) r4
            float r12 = java.lang.Float.intBitsToFloat(r12)
            long r4 = r0.f12836c
            long r4 = r4 & r6
            int r2 = (int) r4
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r12 = r12 - r2
            float r12 = java.lang.Math.abs(r12)
            y1.l2 r2 = r1.m8099B()
            float r2 = r2.mo10228f()
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 <= 0) goto L23
        La8:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            goto Lad
        Lab:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
        Lad:
            return r12
        Lae:
            java.lang.Object r0 = r11.f9j
            k.i r0 = (p144k.C2177i) r0
            int r1 = r11.f7h
            r2 = 2
            r3 = 1
            xf.a r4 = p352xf.EnumC5799a.f23547g
            if (r1 == 0) goto Ld6
            if (r1 == r3) goto Lce
            if (r1 != r2) goto Lc6
            java.lang.Object r1 = r11.f8i
            s1.k0 r1 = (p267s1.C3904k0) r1
            p077f8.AbstractC1089i.m2732I0(r12)
            goto L101
        Lc6:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r12)
            r4 = 0
            goto L164
        Lce:
            java.lang.Object r1 = r11.f8i
            s1.k0 r1 = (p267s1.C3904k0) r1
            p077f8.AbstractC1089i.m2732I0(r12)
            goto Lea
        Ld6:
            p077f8.AbstractC1089i.m2732I0(r12)
            java.lang.Object r12 = r11.f8i
            r1 = r12
            s1.k0 r1 = (p267s1.C3904k0) r1
            r11.f8i = r1
            r11.f7h = r3
            java.lang.Object r12 = p174m.AbstractC2677y2.m6117b(r1, r11, r2)
            if (r12 != r4) goto Lea
            goto L164
        Lea:
            s1.t r12 = (p267s1.C3914t) r12
            long r5 = r12.f12834a
            r0.f7244h = r5
            long r5 = r12.f12836c
            r0.f7238b = r5
        Lf4:
            r11.f8i = r1
            r11.f7h = r2
            s1.l r12 = p267s1.EnumC3905l.f12813h
            java.lang.Object r12 = r1.m8102e(r12, r11)
            if (r12 != r4) goto L101
            goto L164
        L101:
            s1.k r12 = (p267s1.C3903k) r12
            java.lang.Object r12 = r12.f12800a
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = r12.size()
            r3.<init>(r5)
            int r5 = r12.size()
            r6 = 0
            r7 = r6
        L114:
            if (r7 >= r5) goto L127
            java.lang.Object r8 = r12.get(r7)
            r9 = r8
            s1.t r9 = (p267s1.C3914t) r9
            boolean r9 = r9.f12837d
            if (r9 == 0) goto L124
            r3.add(r8)
        L124:
            int r7 = r7 + 1
            goto L114
        L127:
            int r12 = r3.size()
        L12b:
            if (r6 >= r12) goto L142
            java.lang.Object r5 = r3.get(r6)
            r7 = r5
            s1.t r7 = (p267s1.C3914t) r7
            long r7 = r7.f12834a
            long r9 = r0.f7244h
            boolean r7 = p267s1.AbstractC3913s.m8112e(r7, r9)
            if (r7 == 0) goto L13f
            goto L143
        L13f:
            int r6 = r6 + 1
            goto L12b
        L142:
            r5 = 0
        L143:
            s1.t r5 = (p267s1.C3914t) r5
            if (r5 != 0) goto L14e
            java.lang.Object r12 = tf.AbstractC4166m.m8424v1(r3)
            r5 = r12
            s1.t r5 = (p267s1.C3914t) r5
        L14e:
            if (r5 == 0) goto L158
            long r6 = r5.f12834a
            r0.f7244h = r6
            long r5 = r5.f12836c
            r0.f7238b = r5
        L158:
            boolean r12 = r3.isEmpty()
            if (r12 == 0) goto Lf4
            r1 = -1
            r0.f7244h = r1
            sf.n r4 = p276sf.C3967n.f12976a
        L164:
            return r4
        L165:
            int r0 = r11.f7h
            r1 = 1
            if (r0 == 0) goto L17b
            if (r0 != r1) goto L174
            java.lang.Object r0 = r11.f8i
            s1.k0 r0 = (p267s1.C3904k0) r0
            p077f8.AbstractC1089i.m2732I0(r12)
            goto L193
        L174:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r12)
            r12 = 0
            goto L192
        L17b:
            p077f8.AbstractC1089i.m2732I0(r12)
            java.lang.Object r12 = r11.f8i
            s1.k0 r12 = (p267s1.C3904k0) r12
            r0 = r12
        L183:
            r11.f8i = r0
            r11.f7h = r1
            s1.l r12 = p267s1.EnumC3905l.f12812g
            java.lang.Object r12 = r0.m8102e(r12, r11)
            xf.a r2 = p352xf.EnumC5799a.f23547g
            if (r12 != r2) goto L193
            r12 = r2
        L192:
            return r12
        L193:
            s1.k r12 = (p267s1.C3903k) r12
            java.lang.Object r2 = r11.f9j
            w.w r2 = (p321w.C4642w) r2
            boolean r12 = p100h0.AbstractC1513e0.m4035a(r12)
            r12 = r12 ^ r1
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r2.invoke(r12)
            goto L183
        L1a6:
            int r0 = r11.f7h
            r1 = 2
            r2 = 1
            xf.a r3 = p352xf.EnumC5799a.f23547g
            if (r0 == 0) goto L1c5
            if (r0 == r2) goto L1bd
            if (r0 != r1) goto L1b6
            p077f8.AbstractC1089i.m2732I0(r12)
            goto L1f9
        L1b6:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r12)
            r3 = 0
            goto L202
        L1bd:
            java.lang.Object r0 = r11.f8i
            s1.k0 r0 = (p267s1.C3904k0) r0
            p077f8.AbstractC1089i.m2732I0(r12)
            goto L1d8
        L1c5:
            p077f8.AbstractC1089i.m2732I0(r12)
            java.lang.Object r12 = r11.f8i
            r0 = r12
            s1.k0 r0 = (p267s1.C3904k0) r0
            r11.f8i = r0
            r11.f7h = r2
            java.lang.Object r12 = p000a.AbstractC0000a.m65g(r0, r11)
            if (r12 != r3) goto L1d8
            goto L202
        L1d8:
            s1.t r12 = (p267s1.C3914t) r12
            r12.m8118a()
            java.lang.Object r2 = r11.f9j
            fg.l r2 = (p085fg.InterfaceC1231l) r2
            long r4 = r12.f12836c
            e1.b r12 = new e1.b
            r12.<init>(r4)
            r2.invoke(r12)
            r12 = 0
            r11.f8i = r12
            r11.f7h = r1
            s1.l r12 = p267s1.EnumC3905l.f12813h
            java.lang.Object r12 = p174m.AbstractC2677y2.m6124i(r0, r12, r11)
            if (r12 != r3) goto L1f9
            goto L202
        L1f9:
            s1.t r12 = (p267s1.C3914t) r12
            if (r12 == 0) goto L200
            r12.m8118a()
        L200:
            sf.n r3 = p276sf.C3967n.f12976a
        L202:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p001a0.C0002b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
