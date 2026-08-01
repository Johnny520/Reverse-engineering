package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class a31 extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f43h = 1;

    /* JADX INFO: renamed from: i */
    public int f44i;

    /* JADX INFO: renamed from: j */
    public Object f45j;

    /* JADX INFO: renamed from: k */
    public Object f46k;

    /* JADX INFO: renamed from: l */
    public Object f47l;

    /* JADX INFO: renamed from: m */
    public Object f48m;

    /* JADX INFO: renamed from: n */
    public Object f49n;

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f50o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f51p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a31(ContentResolver contentResolver, Uri uri, ne1 ne1Var, C0834vb c0834vb, Context context, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f47l = contentResolver;
        this.f48m = uri;
        this.f49n = ne1Var;
        this.f50o = c0834vb;
        this.f51p = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f43h;
        Object obj2 = this.f51p;
        switch (i) {
            case 0:
                a31 a31Var = new a31((C0310i7) obj2, interfaceC0322ik);
                a31Var.f50o = obj;
                return a31Var;
            default:
                a31 a31Var2 = new a31((ContentResolver) this.f47l, (Uri) this.f48m, (ne1) this.f49n, (C0834vb) this.f50o, (Context) obj2, interfaceC0322ik);
                a31Var2.f45j = obj;
                return a31Var2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.f43h;
        na1 na1Var = na1.f4229a;
        InterfaceC0331iu interfaceC0331iu = (InterfaceC0331iu) obj;
        InterfaceC0322ik interfaceC0322ik = (InterfaceC0322ik) obj2;
        switch (i) {
            case 0:
                ((a31) mo15g(interfaceC0331iu, interfaceC0322ik)).mo16m(na1Var);
                return EnumC1007zk.f7916d;
            default:
                return ((a31) mo15g(interfaceC0331iu, interfaceC0322ik)).mo16m(na1Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[MOVE, MOVE] complete}, expected: {[MOVE] complete} */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x024a, code lost:
    
        if (r13.mo827f(r3, r21) == r1) goto L112;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0279 A[LOOP:0: B:66:0x018d->B:129:0x0279, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x020e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #7 {all -> 0x002a, blocks: (B:9:0x0025, B:19:0x0059, B:22:0x0066, B:24:0x006e, B:15:0x003b, B:18:0x0050), top: B:155:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0208  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x024a -> B:114:0x024e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x0270 -> B:61:0x0174). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0090 -> B:19:0x0059). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo16m(Object obj) throws Throwable {
        yk0 yk0Var;
        InterfaceC0331iu interfaceC0331iu;
        kh0 kh0Var;
        InterfaceC0742sw c0532o;
        InterfaceC0470md interfaceC0470mdM2765e;
        l21 l21VarMo821u;
        l21 l21VarM1969j;
        Object obj2;
        Object objMo2493m;
        Set set;
        boolean z;
        yk0 yk0Var2;
        Object obj3;
        int i;
        int i2;
        Object objMo2494q;
        Object obj4;
        Object objInvoke;
        char c;
        InterfaceC0331iu interfaceC0331iu2;
        C0797ub c0797ub;
        Object objM4292b;
        boolean z2 = false;
        int i3 = 2;
        switch (this.f43h) {
            case 0:
                EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
                int i4 = this.f44i;
                int i5 = 8;
                try {
                    if (i4 != 0) {
                        if (i4 == 1) {
                            obj2 = this.f45j;
                            yk0Var = (yk0) this.f49n;
                            interfaceC0470mdM2765e = (InterfaceC0470md) this.f48m;
                            c0532o = (InterfaceC0742sw) this.f47l;
                            kh0Var = (kh0) this.f46k;
                            interfaceC0331iu = (InterfaceC0331iu) this.f50o;
                            w60.m4891M(obj);
                        } else if (i4 == 2) {
                            obj2 = this.f45j;
                            yk0Var = (yk0) this.f49n;
                            interfaceC0470mdM2765e = (InterfaceC0470md) this.f48m;
                            c0532o = (InterfaceC0742sw) this.f47l;
                            kh0Var = (kh0) this.f46k;
                            interfaceC0331iu = (InterfaceC0331iu) this.f50o;
                            w60.m4891M(obj);
                            objMo2493m = obj;
                            set = (Set) objMo2493m;
                            z = z2;
                            while (true) {
                                if (z) {
                                    try {
                                        Object[] objArr = kh0Var.f3151b;
                                        long[] jArr = kh0Var.f3150a;
                                        int length = jArr.length - i3;
                                        if (length >= 0) {
                                            yk0Var2 = yk0Var;
                                            int i6 = 0;
                                            while (true) {
                                                try {
                                                    long j = jArr[i6];
                                                    obj3 = obj2;
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                                                        int i8 = 0;
                                                        while (i8 < i7) {
                                                            if ((j & 255) < 128) {
                                                                i2 = i5;
                                                                if (set.contains(objArr[(i6 << 3) + i8])) {
                                                                    i = i2;
                                                                }
                                                            } else {
                                                                i2 = i5;
                                                            }
                                                            j >>= i2;
                                                            i8++;
                                                            i5 = i2;
                                                        }
                                                        i = i5;
                                                        if (i7 == i) {
                                                        }
                                                    } else {
                                                        i = i5;
                                                    }
                                                    if (i6 != length) {
                                                        i6++;
                                                        i5 = i;
                                                        obj2 = obj3;
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    yk0Var = yk0Var2;
                                                    yk0Var.m5286a();
                                                    throw th;
                                                }
                                            }
                                        } else {
                                            obj3 = obj2;
                                            i = i5;
                                            yk0Var2 = yk0Var;
                                        }
                                        z = false;
                                        objMo2494q = interfaceC0470mdM2765e.mo2494q();
                                        if (objMo2494q instanceof C0836vd) {
                                            objMo2494q = null;
                                        }
                                        set = (Set) objMo2494q;
                                        if (set != null) {
                                            yk0Var = yk0Var2;
                                            i5 = i;
                                            obj2 = obj3;
                                            i3 = 2;
                                        } else {
                                            if (z) {
                                                kh0Var.m1891b();
                                                l21VarMo821u = t21.m4172j().mo821u(c0532o);
                                                C0310i7 c0310i7 = (C0310i7) this.f51p;
                                                try {
                                                    try {
                                                        objInvoke = c0310i7.invoke();
                                                        l21VarMo821u.mo807c();
                                                        obj4 = obj3;
                                                        if (!objInvoke.equals(obj4)) {
                                                            this.f50o = interfaceC0331iu;
                                                            this.f46k = kh0Var;
                                                            this.f47l = c0532o;
                                                            this.f48m = interfaceC0470mdM2765e;
                                                            yk0Var = yk0Var2;
                                                            this.f49n = yk0Var;
                                                            this.f45j = objInvoke;
                                                            c = 3;
                                                            this.f44i = 3;
                                                        }
                                                        break;
                                                    } catch (Throwable th2) {
                                                        try {
                                                            throw th2;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            throw th;
                                                        }
                                                    }
                                                    l21VarM1969j = l21VarMo821u.m1969j();
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                }
                                            } else {
                                                obj4 = obj3;
                                            }
                                            yk0Var = yk0Var2;
                                            i5 = i;
                                            i3 = 2;
                                            obj2 = obj4;
                                            z2 = false;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        yk0Var2 = yk0Var;
                                    }
                                } else {
                                    obj3 = obj2;
                                    i = i5;
                                    yk0Var2 = yk0Var;
                                }
                                z = true;
                                objMo2494q = interfaceC0470mdM2765e.mo2494q();
                                if (objMo2494q instanceof C0836vd) {
                                }
                                set = (Set) objMo2494q;
                                if (set != null) {
                                }
                            }
                        } else {
                            if (i4 != 3) {
                                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj5 = this.f45j;
                            yk0Var = (yk0) this.f49n;
                            interfaceC0470mdM2765e = (InterfaceC0470md) this.f48m;
                            c0532o = (InterfaceC0742sw) this.f47l;
                            kh0Var = (kh0) this.f46k;
                            interfaceC0331iu = (InterfaceC0331iu) this.f50o;
                            w60.m4891M(obj);
                            objInvoke = obj5;
                            i = 8;
                            c = 3;
                            i5 = i;
                            z2 = false;
                            i3 = 2;
                            obj2 = objInvoke;
                        }
                        break;
                    } else {
                        w60.m4891M(obj);
                        interfaceC0331iu = (InterfaceC0331iu) this.f50o;
                        kh0Var = new kh0();
                        c0532o = new C0532o(21, kh0Var);
                        interfaceC0470mdM2765e = o30.m2765e(Integer.MAX_VALUE, 6, null);
                        C0956ya c0956ya = new C0956ya(8, interfaceC0470mdM2765e);
                        t21.m4167e(t21.f5891a);
                        synchronized (t21.f5893c) {
                            t21.f5898h = AbstractC0960ye.m5248R(t21.f5898h, c0956ya);
                        }
                        yk0Var = new yk0(c0956ya);
                        l21VarMo821u = t21.m4172j().mo821u(c0532o);
                        C0310i7 c0310i72 = (C0310i7) this.f51p;
                        try {
                            l21VarM1969j = l21VarMo821u.m1969j();
                            try {
                                Object objInvoke2 = c0310i72.invoke();
                                l21VarMo821u.mo807c();
                                this.f50o = interfaceC0331iu;
                                this.f46k = kh0Var;
                                this.f47l = c0532o;
                                this.f48m = interfaceC0470mdM2765e;
                                this.f49n = yk0Var;
                                this.f45j = objInvoke2;
                                this.f44i = 1;
                                if (interfaceC0331iu.mo827f(objInvoke2, this) == enumC1007zk) {
                                    return enumC1007zk;
                                }
                                obj2 = objInvoke2;
                            } finally {
                                l21.m1966q(l21VarM1969j);
                            }
                        } finally {
                            l21VarMo821u.mo807c();
                        }
                    }
                    this.f50o = interfaceC0331iu;
                    this.f46k = kh0Var;
                    this.f47l = c0532o;
                    this.f48m = interfaceC0470mdM2765e;
                    this.f49n = yk0Var;
                    this.f45j = obj2;
                    this.f44i = i3;
                    objMo2493m = interfaceC0470mdM2765e.mo2493m(this);
                    if (objMo2493m != enumC1007zk) {
                        set = (Set) objMo2493m;
                        z = z2;
                        while (true) {
                            if (z) {
                            }
                            z = true;
                            objMo2494q = interfaceC0470mdM2765e.mo2494q();
                            if (objMo2494q instanceof C0836vd) {
                            }
                            set = (Set) objMo2494q;
                            if (set != null) {
                            }
                            yk0Var = yk0Var2;
                            i5 = i;
                            obj2 = obj3;
                            i3 = 2;
                        }
                    }
                    return enumC1007zk;
                } catch (Throwable th6) {
                    th = th6;
                    yk0Var.m5286a();
                    throw th;
                }
            default:
                ne1 ne1Var = (ne1) this.f49n;
                ContentResolver contentResolver = (ContentResolver) this.f47l;
                EnumC1007zk enumC1007zk2 = EnumC1007zk.f7916d;
                int i9 = this.f44i;
                try {
                    if (i9 == 0) {
                        w60.m4891M(obj);
                        interfaceC0331iu2 = (InterfaceC0331iu) this.f45j;
                        contentResolver.registerContentObserver((Uri) this.f48m, false, ne1Var);
                        c0797ub = new C0797ub((C0834vb) this.f50o);
                    } else {
                        if (i9 == 1) {
                            C0797ub c0797ub2 = (C0797ub) this.f46k;
                            interfaceC0331iu2 = (InterfaceC0331iu) this.f45j;
                            w60.m4891M(obj);
                            c0797ub = c0797ub2;
                            objM4292b = obj;
                            if (((Boolean) objM4292b).booleanValue()) {
                                contentResolver.unregisterContentObserver(ne1Var);
                                return na1.f4229a;
                            }
                            c0797ub.m4293c();
                            Float f = new Float(Settings.Global.getFloat(((Context) this.f51p).getContentResolver(), "animator_duration_scale", 1.0f));
                            this.f45j = interfaceC0331iu2;
                            this.f46k = c0797ub;
                            this.f44i = 2;
                            if (interfaceC0331iu2.mo827f(f, this) != enumC1007zk2) {
                            }
                            return enumC1007zk2;
                        }
                        if (i9 != 2) {
                            C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        C0797ub c0797ub3 = (C0797ub) this.f46k;
                        interfaceC0331iu2 = (InterfaceC0331iu) this.f45j;
                        w60.m4891M(obj);
                        c0797ub = c0797ub3;
                    }
                    this.f45j = interfaceC0331iu2;
                    this.f46k = c0797ub;
                    this.f44i = 1;
                    objM4292b = c0797ub.m4292b(this);
                    if (objM4292b != enumC1007zk2) {
                        if (((Boolean) objM4292b).booleanValue()) {
                        }
                    }
                    return enumC1007zk2;
                } catch (Throwable th7) {
                    contentResolver.unregisterContentObserver(ne1Var);
                    throw th7;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a31(C0310i7 c0310i7, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f51p = c0310i7;
    }
}
