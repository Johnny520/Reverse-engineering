package p000;

import android.app.Activity;
import android.widget.Toast;
import io.github.cherrywechat.network.model.ApiResponse;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: PC */
/* JADX INFO: loaded from: classes.dex */
public final class C0658PC extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2102e = 0;

    /* JADX INFO: renamed from: f */
    public int f2103f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f2104g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0701QC f2105h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0658PC(int i, C0701QC c0701qc, String str, InterfaceC0190Eb interfaceC0190Eb) {
        super(interfaceC0190Eb);
        this.f2103f = i;
        this.f2105h = c0701qc;
        this.f2104g = str;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) throws Throwable {
        InterfaceC1409fc interfaceC1409fc = (InterfaceC1409fc) obj;
        InterfaceC0190Eb interfaceC0190Eb = (InterfaceC0190Eb) obj2;
        switch (this.f2102e) {
            case 0:
                C0658PC c0658pc = (C0658PC) mo447h(interfaceC0190Eb, interfaceC1409fc);
                C0829TC c0829tc = C0829TC.f2620a;
                c0658pc.mo448i(c0829tc);
                return c0829tc;
            default:
                return ((C0658PC) mo447h(interfaceC0190Eb, interfaceC1409fc)).mo448i(C0829TC.f2620a);
        }
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        switch (this.f2102e) {
            case 0:
                return new C0658PC(this.f2103f, this.f2105h, this.f2104g, interfaceC0190Eb);
            default:
                return new C0658PC(this.f2104g, this.f2105h, interfaceC0190Eb);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:4|(1:53)|(1:(1:(1:(2:9|54)(2:10|11))(2:12|55))(1:15))(5:17|18|(1:20)|44|45)|21|51|22|27|(1:29)(1:30)|(3:38|39|(1:56))(5:34|(1:36)|(0)|39|(0))|44|45) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        p000.AbstractC0295Gu.m625r(-484334872033333L);
        p000.AbstractC0425Jv.m881a(io.github.cherrywechat.network.model.ApiResponse.class).m445b();
        p000.AbstractC0295Gu.m625r(-483901080336437L);
        r10.getMessage();
        r10 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3 A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:12:0x002f, B:15:0x0037, B:21:0x0051, B:27:0x0085, B:29:0x0089, B:32:0x0091, B:34:0x0097, B:36:0x009d, B:39:0x00ac, B:38:0x00a3, B:26:0x006d, B:18:0x003e, B:22:0x0053), top: B:53:0x0013, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo448i(Object obj) throws Throwable {
        String strM625r;
        C2283nk c2283nk;
        C0658PC c0658pc;
        int i = this.f2102e;
        C0829TC c0829tc = C0829TC.f2620a;
        String str = this.f2104g;
        int i2 = 2;
        int i3 = 3;
        C0701QC c0701qc = this.f2105h;
        switch (i) {
            case 0:
                AbstractC0628Oj.m1232T(obj);
                if (this.f2103f == 0) {
                    Toast.makeText(c0701qc.m1432f(), AbstractC0295Gu.m625r(-485949779736629L), 1).show();
                    C1036Y4 c1036y4 = C1036Y4.f3308a;
                    Activity activityM1432f = c0701qc.m1432f();
                    C0572NC c0572nc = new C0572NC(c0701qc, i2);
                    C0572NC c0572nc2 = new C0572NC(c0701qc, i3);
                    c1036y4.getClass();
                    C1036Y4.m1982a(activityM1432f, c0572nc, c0572nc2, true);
                } else {
                    Toast.makeText(c0701qc.m1432f(), AbstractC0295Gu.m625r(-485984139474997L).concat(str), 1).show();
                }
                return c0829tc;
            default:
                int i4 = this.f2103f;
                InterfaceC0190Eb interfaceC0190Eb = null;
                EnumC1453gc enumC1453gc = EnumC1453gc.f5148a;
                try {
                } catch (Exception e) {
                    C1498hd c1498hd = AbstractC1499he.f5282a;
                    C2283nk c2283nk2 = AbstractC1106Zp.f3500a;
                    C0993X4 c0993x4 = new C0993X4(c0701qc, e, interfaceC0190Eb, 6);
                    this.f2103f = 3;
                    if (AbstractC0585Nj.m1133N(c2283nk2, c0993x4, this) != enumC1453gc) {
                        return c0829tc;
                    }
                }
                if (i4 == 0) {
                    AbstractC0628Oj.m1232T(obj);
                    C0594Ns c0594Ns = C0594Ns.f1925a;
                    String strM2791I = C1456gf.m2791I();
                    this.f2103f = 1;
                    c0594Ns.getClass();
                    obj = C0594Ns.m1164c(str, strM2791I);
                    if (obj == enumC1453gc) {
                    }
                    return enumC1453gc;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        AbstractC0628Oj.m1232T(obj);
                        return c0829tc;
                    }
                    if (i4 != 3) {
                        throw new IllegalStateException(AbstractC0295Gu.m625r(-483939735042101L));
                    }
                    AbstractC0628Oj.m1232T(obj);
                    return c0829tc;
                }
                AbstractC0628Oj.m1232T(obj);
                String str2 = (String) obj;
                C0029Am c0029Am = AbstractC2809zm.f9524a;
                c0029Am.getClass();
                Object objM4550a = c0029Am.m4550a(ApiResponse.Companion.serializer(C0915VC.f2855b), str2);
                ApiResponse apiResponse = (ApiResponse) objM4550a;
                int code = apiResponse != null ? apiResponse.getCode() : -1;
                if (apiResponse == null || (strM625r = apiResponse.getMessage()) == null) {
                    strM625r = AbstractC0295Gu.m625r(-483918260205621L);
                    C1498hd c1498hd2 = AbstractC1499he.f5282a;
                    c2283nk = AbstractC1106Zp.f3500a;
                    c0658pc = new C0658PC(code, c0701qc, strM625r, null);
                    this.f2103f = 2;
                    if (AbstractC0585Nj.m1133N(c2283nk, c0658pc, this) != enumC1453gc) {
                        return c0829tc;
                    }
                } else {
                    if (strM625r.length() == 0) {
                        strM625r = apiResponse.getMsg();
                    }
                    if (strM625r == null) {
                    }
                    C1498hd c1498hd22 = AbstractC1499he.f5282a;
                    c2283nk = AbstractC1106Zp.f3500a;
                    c0658pc = new C0658PC(code, c0701qc, strM625r, null);
                    this.f2103f = 2;
                    if (AbstractC0585Nj.m1133N(c2283nk, c0658pc, this) != enumC1453gc) {
                    }
                }
                return enumC1453gc;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0658PC(String str, C0701QC c0701qc, InterfaceC0190Eb interfaceC0190Eb) {
        super(interfaceC0190Eb);
        this.f2104g = str;
        this.f2105h = c0701qc;
    }
}
