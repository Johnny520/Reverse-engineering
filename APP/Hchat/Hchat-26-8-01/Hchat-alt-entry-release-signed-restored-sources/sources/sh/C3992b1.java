package sh;

import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p117i0.InterfaceC1854l2;
import p172lg.C2561a;
import p267s1.C3904k0;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6043h;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: sh.b1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3992b1 extends AbstractC6043h implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public int f13059g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f13060h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1854l2 f13061i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C2561a f13062j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f13063k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f13064l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f13065m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f13066n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3992b1(InterfaceC1854l2 interfaceC1854l2, C2561a c2561a, boolean z9, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f13061i = interfaceC1854l2;
        this.f13062j = c2561a;
        this.f13063k = z9;
        this.f13064l = interfaceC1809a1;
        this.f13065m = interfaceC1809a12;
        this.f13066n = interfaceC1809a13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        C3992b1 c3992b1 = new C3992b1(this.f13061i, this.f13062j, this.f13063k, this.f13064l, this.f13065m, this.f13066n, interfaceC5557c);
        c3992b1.f13060h = obj;
        return c3992b1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        ((C3992b1) create((C3904k0) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
        return EnumC5799a.f23547g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Path cross not found for [B:33:0x00bd, B:15:0x003f], limit reached: 32 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:12:0x002c). Please report as a decompilation issue!!! */
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
            lg.a r0 = r11.f13062j
            float r1 = r0.f8310a
            java.lang.Object r2 = r11.f13060h
            s1.k0 r2 = (p267s1.C3904k0) r2
            int r3 = r11.f13059g
            r4 = 1
            if (r3 == 0) goto L1a
            if (r3 != r4) goto L13
            p077f8.AbstractC1089i.m2732I0(r12)
            goto L2c
        L13:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r12)
            r12 = 0
            return r12
        L1a:
            p077f8.AbstractC1089i.m2732I0(r12)
        L1d:
            r11.f13060h = r2
            r11.f13059g = r4
            s1.l r12 = p267s1.EnumC3905l.f12813h
            java.lang.Object r12 = r2.m8102e(r12, r11)
            xf.a r3 = p352xf.EnumC5799a.f23547g
            if (r12 != r3) goto L2c
            return r3
        L2c:
            s1.k r12 = (p267s1.C3903k) r12
            java.lang.Object r3 = r12.f12800a
            java.lang.Object r3 = tf.AbstractC4166m.m8393B1(r3)
            s1.t r3 = (p267s1.C3914t) r3
            int r12 = r12.f12805f
            r5 = 5
            i0.a1 r6 = r11.f13064l
            if (r12 != r5) goto L3f
            goto Lbd
        L3f:
            r5 = 2
            if (r12 != r5) goto L44
            goto Lbd
        L44:
            int r12 = r3.f12842i
            if (r12 != r5) goto Lbd
            i.r0 r12 = sh.AbstractC4008f1.f13123a
            i0.a1 r12 = r11.f13065m
            java.lang.Object r12 = r12.getValue()
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            float r12 = (float) r12
            r5 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 / r5
            i0.a1 r7 = r11.f13066n
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            float r7 = (float) r7
            float r5 = r5 * r12
            float r7 = r7 - r5
            r5 = 0
            int r8 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r8 >= 0) goto L6f
            r7 = r5
        L6f:
            r5 = 1060655596(0x3f3851ec, float:0.72)
            float r5 = r5 * r12
            r8 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r12
            float r8 = r8 + r5
            long r9 = r3.f12836c
            i0.l2 r3 = r11.f13061i
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r3 = r3 - r1
            float r5 = r0.f8311b
            float r5 = r5 - r1
            float r3 = r3 / r5
            boolean r5 = r11.f13063k
            if (r5 == 0) goto L92
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = r5 - r3
        L92:
            float r3 = r3 * r7
            float r3 = r3 + r12
            r12 = 32
            long r9 = r9 >> r12
            int r12 = (int) r9
            float r12 = java.lang.Float.intBitsToFloat(r12)
            float r12 = r12 - r3
            float r12 = java.lang.Math.abs(r12)
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 > 0) goto La7
            r12 = r4
            goto La8
        La7:
            r12 = 0
        La8:
            java.lang.Object r3 = r6.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == r12) goto L1d
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r6.setValue(r12)
            goto L1d
        Lbd:
            i.r0 r12 = sh.AbstractC4008f1.f13123a
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r6.setValue(r12)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.C3992b1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
