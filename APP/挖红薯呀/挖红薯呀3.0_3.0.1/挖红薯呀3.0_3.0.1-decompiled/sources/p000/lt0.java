package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class lt0 extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public yk0 f3587h;

    /* JADX INFO: renamed from: i */
    public int f3588i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f3589j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ot0 f3590k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ nt0 f3591l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C0715s6 f3592m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt0(ot0 ot0Var, nt0 nt0Var, C0715s6 c0715s6, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f3590k = ot0Var;
        this.f3591l = nt0Var;
        this.f3592m = c0715s6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        lt0 lt0Var = new lt0(this.f3590k, this.f3591l, this.f3592m, interfaceC0322ik);
        lt0Var.f3589j = obj;
        return lt0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        return ((lt0) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo16m(Object obj) throws Throwable {
        c40 c40VarM3065y;
        z31 z31Var;
        oq0 oq0Var;
        oq0 oq0Var2;
        yk0 yk0Var;
        Throwable th;
        List listM2947D;
        ot0 ot0Var;
        ot0 ot0Var2;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        int i = this.f3588i;
        InterfaceC0322ik interfaceC0322ik = null;
        if (i != 0) {
            if (i != 1) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yk0Var = this.f3587h;
            c40VarM3065y = (c40) this.f3589j;
            try {
                w60.m4891M(obj);
                yk0Var.m5286a();
                ot0Var2 = this.f3590k;
                synchronized (ot0Var2.f4633c) {
                    try {
                        if (ot0Var2.f4634d == c40VarM3065y) {
                            ot0Var2.f4634d = null;
                        }
                        ot0Var2.m2956y();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                z31 z31Var2 = ot0.f4630z;
                jo0.m1726j(this.f3590k.f4655y);
                return na1.f4229a;
            } catch (Throwable th3) {
                th = th3;
                yk0Var.m5286a();
                ot0Var = this.f3590k;
                synchronized (ot0Var.f4633c) {
                    try {
                        if (ot0Var.f4634d == c40VarM3065y) {
                            ot0Var.f4634d = null;
                        }
                        ot0Var.m2956y();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                z31 z31Var3 = ot0.f4630z;
                jo0.m1726j(this.f3590k.f4655y);
                throw th;
            }
        }
        w60.m4891M(obj);
        c40VarM3065y = pf1.m3065y(((InterfaceC0966yk) this.f3589j).mo1328f());
        ot0 ot0Var3 = this.f3590k;
        synchronized (ot0Var3.f4633c) {
            Throwable th5 = ot0Var3.f4635e;
            if (th5 != null) {
                throw th5;
            }
            if (((jt0) ot0Var3.f4651u.getValue()).compareTo(jt0.f2942e) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (ot0Var3.f4634d != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            ot0Var3.f4634d = c40VarM3065y;
            ot0Var3.m2956y();
        }
        C0956ya c0956ya = new C0956ya(5, this.f3590k);
        t21.m4167e(t21.f5891a);
        synchronized (t21.f5893c) {
            t21.f5898h = AbstractC0960ye.m5248R(t21.f5898h, c0956ya);
        }
        yk0 yk0Var2 = new yk0(c0956ya);
        z31 z31Var4 = ot0.f4630z;
        jo0 jo0Var = this.f3590k.f4655y;
        try {
            do {
                z31Var = ot0.f4630z;
                oq0Var = (oq0) z31Var.getValue();
                C0496n2 c0496n2 = C0496n2.f4124D;
                gq0 gq0Var = oq0Var.f4608f;
                if (gq0Var.containsKey(jo0Var)) {
                    oq0Var2 = oq0Var;
                } else if (oq0Var.isEmpty()) {
                    oq0Var2 = new oq0(jo0Var, jo0Var, gq0Var.m1254a(jo0Var, new ua0(c0496n2, c0496n2)));
                } else {
                    Object obj2 = oq0Var.f4607e;
                    Object obj3 = gq0Var.get(obj2);
                    obj3.getClass();
                    oq0Var2 = new oq0(oq0Var.f4606d, jo0Var, gq0Var.m1254a(obj2, new ua0(((ua0) obj3).f6174a, jo0Var)).m1254a(jo0Var, new ua0(obj2, c0496n2)));
                }
                if (oq0Var != oq0Var2) {
                }
                break;
            } while (!z31Var.m5413j(oq0Var, oq0Var2));
            break;
            ot0 ot0Var4 = this.f3590k;
            synchronized (ot0Var4.f4633c) {
                listM2947D = ot0Var4.m2947D();
            }
            int size = listM2947D.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C0964yi) listM2947D.get(i2)).m5279t();
            }
            C0302i c0302i = new C0302i(this.f3591l, this.f3592m, interfaceC0322ik, 8);
            this.f3589j = c40VarM3065y;
            this.f3587h = yk0Var2;
            this.f3588i = 1;
            if (p30.m3013w(c0302i, this) == enumC1007zk) {
                return enumC1007zk;
            }
            yk0Var = yk0Var2;
            yk0Var.m5286a();
            ot0Var2 = this.f3590k;
            synchronized (ot0Var2.f4633c) {
            }
        } catch (Throwable th6) {
            yk0Var = yk0Var2;
            th = th6;
            yk0Var.m5286a();
            ot0Var = this.f3590k;
            synchronized (ot0Var.f4633c) {
            }
        }
    }
}
