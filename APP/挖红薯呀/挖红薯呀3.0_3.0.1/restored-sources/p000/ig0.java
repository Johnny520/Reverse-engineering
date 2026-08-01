package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ig0 extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public vt0 f2554h;

    /* JADX INFO: renamed from: i */
    public vt0 f2555i;

    /* JADX INFO: renamed from: j */
    public int f2556j;

    /* JADX INFO: renamed from: k */
    public int f2557k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f2558l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ wt0 f2559m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ zt0 f2560n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ zt0 f2561o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ float f2562p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C0215fn f2563q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ float f2564r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ lz0 f2565s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig0(wt0 wt0Var, zt0 zt0Var, zt0 zt0Var2, float f, C0215fn c0215fn, float f2, lz0 lz0Var, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f2559m = wt0Var;
        this.f2560n = zt0Var;
        this.f2561o = zt0Var2;
        this.f2562p = f;
        this.f2563q = c0215fn;
        this.f2564r = f2;
        this.f2565s = lz0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        ig0 ig0Var = new ig0(this.f2559m, this.f2560n, this.f2561o, this.f2562p, this.f2563q, this.f2564r, this.f2565s, interfaceC0322ik);
        ig0Var.f2558l = obj;
        return ig0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        return ((ig0) mo15g((jz0) obj, (InterfaceC0322ik) obj2)).mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:44:0x0196) to fix multi-entry loop: BACK_EDGE: B:44:0x0196 -> B:13:0x0066 */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009a, code lost:
    
        r3 = java.lang.Math.signum(r3) * r14;
        r5.m1166c(r0, r3);
        r4 = (p000.C0879w7) r12.f7995d;
        r3 = p000.pf1.m3057q(r4, ((java.lang.Number) r4.f7016e.getValue()).floatValue() + r3, 0.0f, 30);
        r12.f7995d = r3;
        r3 = p000.rd0.m3458Q(java.lang.Math.abs(r2.f7189d - ((java.lang.Number) r3.f7016e.getValue()).floatValue()) / r7.f2564r);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d8, code lost:
    
        if (r3 <= 100) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00da, code lost:
    
        r14 = 100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00dc, code lost:
    
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00dd, code lost:
    
        r15 = (p000.C0879w7) r12.f7995d;
        r3 = r2.f7189d;
        r4 = r2;
        r2 = r7.f2563q;
        r3 = r1;
        r18 = new p000.hg0(r2, r3, r4, r7.f2565s, r6);
        r21 = r3;
        r22 = r4;
        r7.f2558l = r0;
        r7.f2554h = r6;
        r7.f2555i = null;
        r7.f2556j = r14;
        r7.f2557k = 2;
        r2.getClass();
        r2 = new p000.wt0();
        r2.f7189d = ((java.lang.Number) r15.f7016e.getValue()).floatValue();
        r1 = new java.lang.Float(r3);
        r2 = new p000.p91(r14, p000.AbstractC0102cr.f882b);
        r3 = r14;
        r17 = r0;
        r14 = r17;
        r0 = p000.z60.m5438h(r15, r1, r2, true, new p000.C0952y6(r2, r2, r17, r18, 2), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x013b, code lost:
    
        if (r0 != r13) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x013e, code lost:
    
        r0 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0140, code lost:
    
        if (r0 != r13) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0143, code lost:
    
        r0 = r3;
        r11 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0166 -> B:37:0x0167). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0174 -> B:38:0x0171). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo16m(Object obj) throws Throwable {
        jz0 jz0Var;
        vt0 vt0Var;
        jz0 jz0Var2;
        vt0 vt0Var2;
        zt0 zt0Var;
        Object objM1164b;
        ig0 ig0Var = this;
        int i = ig0Var.f2557k;
        zt0 zt0Var2 = ig0Var.f2561o;
        wt0 wt0Var = ig0Var.f2559m;
        zt0 zt0Var3 = ig0Var.f2560n;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        if (i == 0) {
            w60.m4891M(obj);
            jz0Var = (jz0) ig0Var.f2558l;
            vt0 vt0Var3 = new vt0();
            vt0Var3.f6825d = true;
            vt0Var = vt0Var3;
        } else if (i == 1) {
            vt0 vt0Var4 = ig0Var.f2555i;
            vt0 vt0Var5 = ig0Var.f2554h;
            jz0 jz0Var3 = (jz0) ig0Var.f2558l;
            w60.m4891M(obj);
            vt0Var = vt0Var5;
            vt0Var4.f6825d = ((Boolean) obj).booleanValue();
            ig0Var = this;
            zt0Var3 = zt0Var3;
            jz0Var = jz0Var3;
        } else if (i == 2) {
            int i2 = ig0Var.f2556j;
            vt0 vt0Var6 = ig0Var.f2554h;
            jz0 jz0Var4 = (jz0) ig0Var.f2558l;
            w60.m4891M(obj);
            zt0 zt0Var4 = zt0Var2;
            wt0 wt0Var2 = wt0Var;
            vt0Var2 = vt0Var6;
            jz0Var2 = jz0Var4;
            if (!vt0Var2.f6825d) {
                ig0Var.f2558l = jz0Var2;
                ig0Var.f2554h = vt0Var2;
                ig0Var.f2555i = vt0Var2;
                ig0Var.f2557k = 3;
                zt0Var = zt0Var3;
                zt0Var2 = zt0Var4;
                wt0Var = wt0Var2;
                objM1164b = C0215fn.m1164b(ig0Var.f2563q, zt0Var2, wt0Var, ig0Var.f2565s, zt0Var, 50 - ((long) i2), ig0Var);
                if (objM1164b != enumC1007zk) {
                    vt0Var = vt0Var2;
                    vt0Var2.f6825d = ((Boolean) objM1164b).booleanValue();
                    zt0Var3 = zt0Var;
                    jz0Var = jz0Var2;
                }
                return enumC1007zk;
            }
            vt0Var = vt0Var2;
            jz0Var = jz0Var2;
            zt0Var2 = zt0Var4;
            wt0Var = wt0Var2;
        } else {
            if (i != 3) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt0 vt0Var7 = ig0Var.f2555i;
            vt0 vt0Var8 = ig0Var.f2554h;
            jz0 jz0Var5 = (jz0) ig0Var.f2558l;
            w60.m4891M(obj);
            vt0Var2 = vt0Var7;
            vt0Var = vt0Var8;
            jz0Var2 = jz0Var5;
            zt0Var = zt0Var3;
            objM1164b = obj;
            vt0Var2.f6825d = ((Boolean) objM1164b).booleanValue();
            zt0Var3 = zt0Var;
            jz0Var = jz0Var2;
        }
        while (true) {
            boolean z = vt0Var.f6825d;
            na1 na1Var = na1.f4229a;
            if (!z) {
                return na1Var;
            }
            vt0Var.f6825d = false;
            float fFloatValue = wt0Var.f7189d - ((Number) ((C0879w7) zt0Var3.f7995d).f7016e.getValue()).floatValue();
            boolean z2 = ((fg0) zt0Var2.f7995d).f1724c;
            C0215fn c0215fn = ig0Var.f2563q;
            if (!z2) {
                float fAbs = Math.abs(fFloatValue);
                float f = ig0Var.f2562p;
                if (fAbs >= f) {
                    break;
                }
                jz0 jz0Var6 = jz0Var;
                zt0 zt0Var5 = zt0Var3;
                c0215fn.m1166c(jz0Var6, fFloatValue);
                ig0Var.f2558l = jz0Var6;
                ig0Var.f2554h = vt0Var;
                ig0Var.f2555i = vt0Var;
                ig0Var.f2557k = 1;
                vt0 vt0Var9 = vt0Var;
                Object objM1164b2 = C0215fn.m1164b(ig0Var.f2563q, zt0Var2, wt0Var, ig0Var.f2565s, zt0Var5, 50L, ig0Var);
                if (objM1164b2 == enumC1007zk) {
                    break;
                }
                vt0Var = vt0Var9;
                vt0Var9.f6825d = ((Boolean) objM1164b2).booleanValue();
                ig0Var = this;
                zt0Var3 = zt0Var5;
                jz0Var = jz0Var6;
            }
        }
    }
}
