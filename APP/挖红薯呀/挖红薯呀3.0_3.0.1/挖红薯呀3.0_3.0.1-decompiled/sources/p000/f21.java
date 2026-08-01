package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class f21 implements InterfaceC0975yt {

    /* JADX INFO: renamed from: a */
    public final j21 f1571a;

    /* JADX INFO: renamed from: b */
    public final C0478ml f1572b;

    /* JADX INFO: renamed from: c */
    public final o31 f1573c;

    /* JADX INFO: renamed from: d */
    public final C0099co f1574d = wy0.f7221c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f21(j21 j21Var, C0478ml c0478ml, o31 o31Var) {
        this.f1571a = j21Var;
        this.f1572b = c0478ml;
        this.f1573c = o31Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m997b(f21 f21Var, ny0 ny0Var, float f, float f2, c21 c21Var, AbstractC0358jk abstractC0358jk) {
        e21 e21Var;
        Object objM1654d;
        if (abstractC0358jk instanceof e21) {
            e21Var = (e21) abstractC0358jk;
            int i = e21Var.f1280i;
            if ((i & Integer.MIN_VALUE) != 0) {
                e21Var.f1280i = i - Integer.MIN_VALUE;
            } else {
                e21Var = new e21(f21Var, abstractC0358jk);
            }
        }
        e21 e21Var2 = e21Var;
        Object obj = e21Var2.f1278g;
        int i2 = e21Var2.f1280i;
        if (i2 == 0) {
            w60.m4891M(obj);
            if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                return pf1.m3045a(f, f2, 28);
            }
            e21Var2.f1280i = 1;
            C0478ml c0478ml = f21Var.f1572b;
            C0910x1 c0910x1 = Math.abs(((C0916x7) new C0948y2(c0478ml.f4003a).m5206j(new C0916x7(0.0f), new C0916x7(f2))).f7277a) >= Math.abs(f) ? new C0910x1(5, c0478ml) : new C0910x1(27, f21Var.f1573c);
            Float f3 = new Float(f);
            Float f4 = new Float(f2);
            int i3 = c0910x1.f7231d;
            EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
            switch (i3) {
                case 5:
                    objM1654d = j50.m1654d(ny0Var, f3.floatValue(), pf1.m3045a(0.0f, f4.floatValue(), 28), (C0478ml) c0910x1.f7232e, c21Var, e21Var2);
                    if (objM1654d != enumC1007zk) {
                        objM1654d = (C0716s7) objM1654d;
                    }
                    break;
                default:
                    float fFloatValue = f3.floatValue();
                    float fFloatValue2 = f4.floatValue();
                    objM1654d = j50.m1655e(ny0Var, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, pf1.m3045a(0.0f, fFloatValue2, 28), (o31) c0910x1.f7232e, c21Var, e21Var2);
                    if (objM1654d != enumC1007zk) {
                        objM1654d = (C0716s7) objM1654d;
                    }
                    break;
            }
            obj = objM1654d;
            if (obj == enumC1007zk) {
                return enumC1007zk;
            }
        } else {
            if (i2 != 1) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w60.m4891M(obj);
        }
        return ((C0716s7) obj).f5663b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0975yt
    /* JADX INFO: renamed from: a */
    public Object mo998a(hz0 hz0Var, float f, InterfaceC0322ik interfaceC0322ik) {
        return m1000d(hz0Var, f, p30.f4746m, (AbstractC0358jk) interfaceC0322ik);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m999c(ny0 ny0Var, float f, InterfaceC0742sw interfaceC0742sw, AbstractC0358jk abstractC0358jk) throws Throwable {
        b21 b21Var;
        InterfaceC0742sw interfaceC0742sw2;
        if (abstractC0358jk instanceof b21) {
            b21Var = (b21) abstractC0358jk;
            int i = b21Var.f361j;
            if ((i & Integer.MIN_VALUE) != 0) {
                b21Var.f361j = i - Integer.MIN_VALUE;
            } else {
                b21Var = new b21(this, abstractC0358jk);
            }
        }
        Object objM1522H = b21Var.f359h;
        int i2 = b21Var.f361j;
        if (i2 == 0) {
            w60.m4891M(objM1522H);
            C0807ul c0807ul = new C0807ul(this, f, interfaceC0742sw, ny0Var, null);
            b21Var.f358g = interfaceC0742sw;
            b21Var.f361j = 1;
            objM1522H = AbstractC0307i4.m1522H(this.f1574d, c0807ul, b21Var);
            EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
            if (objM1522H == enumC1007zk) {
                return enumC1007zk;
            }
            interfaceC0742sw2 = interfaceC0742sw;
        } else {
            if (i2 != 1) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC0742sw2 = b21Var.f358g;
            w60.m4891M(objM1522H);
        }
        C0716s7 c0716s7 = (C0716s7) objM1522H;
        interfaceC0742sw2.invoke(new Float(0.0f));
        return c0716s7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1000d(ny0 ny0Var, float f, InterfaceC0742sw interfaceC0742sw, AbstractC0358jk abstractC0358jk) throws Throwable {
        d21 d21Var;
        if (abstractC0358jk instanceof d21) {
            d21Var = (d21) abstractC0358jk;
            int i = d21Var.f952i;
            if ((i & Integer.MIN_VALUE) != 0) {
                d21Var.f952i = i - Integer.MIN_VALUE;
            } else {
                d21Var = new d21(this, abstractC0358jk);
            }
        }
        Object objM999c = d21Var.f950g;
        int i2 = d21Var.f952i;
        if (i2 == 0) {
            w60.m4891M(objM999c);
            d21Var.f952i = 1;
            objM999c = m999c(ny0Var, f, interfaceC0742sw, d21Var);
            Object obj = EnumC1007zk.f7916d;
            if (objM999c == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w60.m4891M(objM999c);
        }
        C0716s7 c0716s7 = (C0716s7) objM999c;
        return new Float(c0716s7.f5662a.floatValue() != 0.0f ? ((Number) c0716s7.f5663b.m4921a()).floatValue() : 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof f21)) {
            return false;
        }
        f21 f21Var = (f21) obj;
        return f21Var.f1573c.equals(this.f1573c) && p30.m3002l(f21Var.f1572b, this.f1572b) && p30.m3002l(f21Var.f1571a, this.f1571a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1571a.hashCode() + ((this.f1572b.hashCode() + (this.f1573c.hashCode() * 31)) * 31);
    }
}
