package p000;

import android.app.Activity;
import android.widget.Toast;
import io.github.cherrywechat.network.model.ApiResponse;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: ga */
/* JADX INFO: loaded from: classes.dex */
public final class C1451ga extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f5075e = 0;

    /* JADX INFO: renamed from: f */
    public int f5076f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f5077g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Activity f5078h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1495ha f5079i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1451ga(int i, Activity activity, String str, C1495ha c1495ha, InterfaceC0190Eb interfaceC0190Eb) {
        super(interfaceC0190Eb);
        this.f5076f = i;
        this.f5078h = activity;
        this.f5077g = str;
        this.f5079i = c1495ha;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) throws Throwable {
        InterfaceC1409fc interfaceC1409fc = (InterfaceC1409fc) obj;
        InterfaceC0190Eb interfaceC0190Eb = (InterfaceC0190Eb) obj2;
        switch (this.f5075e) {
            case 0:
                C1451ga c1451ga = (C1451ga) mo447h(interfaceC0190Eb, interfaceC1409fc);
                C0829TC c0829tc = C0829TC.f2620a;
                c1451ga.mo448i(c0829tc);
                return c0829tc;
            default:
                return ((C1451ga) mo447h(interfaceC0190Eb, interfaceC1409fc)).mo448i(C0829TC.f2620a);
        }
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        switch (this.f5075e) {
            case 0:
                return new C1451ga(this.f5076f, this.f5078h, this.f5077g, this.f5079i, interfaceC0190Eb);
            default:
                return new C1451ga(this.f5077g, this.f5078h, this.f5079i, interfaceC0190Eb);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:4|(1:56)|(1:(1:(1:(2:9|57)(2:10|11))(2:12|58))(2:15|16))(5:17|18|(1:20)|47|48)|21|54|22|27|(1:29)(1:31)|30|(4:41|40|42|(1:59))(6:35|(1:37)|(2:39|41)|40|42|(0))|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        p000.AbstractC0295Gu.m625r(-88970247534645L);
        p000.AbstractC0425Jv.m881a(io.github.cherrywechat.network.model.ApiResponse.class).m445b();
        p000.AbstractC0295Gu.m625r(-88536455837749L);
        r0.getMessage();
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo448i(Object obj) throws Throwable {
        Object objM1164c;
        String strM625r;
        C2283nk c2283nk;
        C1451ga c1451ga;
        int i = this.f5075e;
        C0829TC c0829tc = C0829TC.f2620a;
        Activity activity = this.f5078h;
        String str = this.f5077g;
        switch (i) {
            case 0:
                AbstractC0628Oj.m1232T(obj);
                if (this.f5076f == 0) {
                    Toast.makeText(activity, AbstractC0295Gu.m625r(-88386131982389L), 1).show();
                    C1036Y4 c1036y4 = C1036Y4.f3308a;
                    C2479s c2479s = new C2479s(1, this.f5079i);
                    C1407fa c1407fa = new C1407fa(activity, 0);
                    c1036y4.getClass();
                    C1036Y4.m1982a(activity, c2479s, c1407fa, true);
                } else {
                    Toast.makeText(activity, AbstractC0295Gu.m625r(-88420491720757L).concat(str), 1).show();
                }
                return c0829tc;
            default:
                int i2 = this.f5076f;
                int i3 = 2;
                InterfaceC0190Eb interfaceC0190Eb = null;
                EnumC1453gc enumC1453gc = EnumC1453gc.f5148a;
                try {
                } catch (Exception e) {
                    e.printStackTrace();
                    C1498hd c1498hd = AbstractC1499he.f5282a;
                    C2283nk c2283nk2 = AbstractC1106Zp.f3500a;
                    C0993X4 c0993x4 = new C0993X4(activity, e, interfaceC0190Eb, i3);
                    this.f5076f = 3;
                    if (AbstractC0585Nj.m1133N(c2283nk2, c0993x4, this) != enumC1453gc) {
                        return c0829tc;
                    }
                }
                if (i2 == 0) {
                    AbstractC0628Oj.m1232T(obj);
                    C0594Ns c0594Ns = C0594Ns.f1925a;
                    String strM2791I = C1456gf.m2791I();
                    this.f5076f = 1;
                    c0594Ns.getClass();
                    objM1164c = C0594Ns.m1164c(str, strM2791I);
                    if (objM1164c == enumC1453gc) {
                    }
                    return enumC1453gc;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        AbstractC0628Oj.m1232T(obj);
                        return c0829tc;
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException(AbstractC0295Gu.m625r(-88575110543413L));
                    }
                    AbstractC0628Oj.m1232T(obj);
                    return c0829tc;
                }
                AbstractC0628Oj.m1232T(obj);
                objM1164c = obj;
                String str2 = (String) objM1164c;
                C0029Am c0029Am = AbstractC2809zm.f9524a;
                c0029Am.getClass();
                Object objM4550a = c0029Am.m4550a(ApiResponse.Companion.serializer(C0915VC.f2855b), str2);
                ApiResponse apiResponse = (ApiResponse) objM4550a;
                int code = apiResponse != null ? apiResponse.getCode() : -1;
                if (apiResponse == null || (strM625r = apiResponse.getMessage()) == null) {
                    strM625r = AbstractC0295Gu.m625r(-88553635706933L);
                    String str3 = strM625r;
                    C1498hd c1498hd2 = AbstractC1499he.f5282a;
                    c2283nk = AbstractC1106Zp.f3500a;
                    c1451ga = new C1451ga(code, this.f5078h, str3, this.f5079i, null);
                    this.f5076f = 2;
                    if (AbstractC0585Nj.m1133N(c2283nk, c1451ga, this) != enumC1453gc) {
                        return c0829tc;
                    }
                } else {
                    if (strM625r.length() == 0) {
                        strM625r = apiResponse.getMsg();
                    }
                    if (strM625r == null) {
                        strM625r = AbstractC0295Gu.m625r(-88553635706933L);
                    }
                    String str32 = strM625r;
                    C1498hd c1498hd22 = AbstractC1499he.f5282a;
                    c2283nk = AbstractC1106Zp.f3500a;
                    c1451ga = new C1451ga(code, this.f5078h, str32, this.f5079i, null);
                    this.f5076f = 2;
                    if (AbstractC0585Nj.m1133N(c2283nk, c1451ga, this) != enumC1453gc) {
                    }
                }
                return enumC1453gc;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1451ga(String str, Activity activity, C1495ha c1495ha, InterfaceC0190Eb interfaceC0190Eb) {
        super(interfaceC0190Eb);
        this.f5077g = str;
        this.f5078h = activity;
        this.f5079i = c1495ha;
    }
}
