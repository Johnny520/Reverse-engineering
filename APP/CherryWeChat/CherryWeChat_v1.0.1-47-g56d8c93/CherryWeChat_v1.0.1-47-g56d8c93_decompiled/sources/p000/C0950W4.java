package p000;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import io.github.cherrywechat.network.model.ApiResponse;
import io.github.cherrywechat.network.model.DownloadTokenData;
import io.github.cherrywechat.network.model.ThemePurchaseData;
import io.github.cherrywechat.theme.ThemeProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: W4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0950W4 extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2975e;

    /* JADX INFO: renamed from: f */
    public int f2976f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f2977g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f2978h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2979i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f2980j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0950W4(int i, InterfaceC1416fj interfaceC1416fj, String str, String str2, InterfaceC1416fj interfaceC1416fj2, InterfaceC0190Eb interfaceC0190Eb) {
        super(interfaceC0190Eb);
        this.f2975e = 0;
        this.f2976f = i;
        this.f2978h = interfaceC1416fj;
        this.f2977g = str;
        this.f2980j = str2;
        this.f2979i = interfaceC1416fj2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) {
        InterfaceC1409fc interfaceC1409fc = (InterfaceC1409fc) obj;
        InterfaceC0190Eb interfaceC0190Eb = (InterfaceC0190Eb) obj2;
        switch (this.f2975e) {
        }
        return ((C0950W4) mo447h(interfaceC0190Eb, interfaceC1409fc)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        switch (this.f2975e) {
            case 0:
                return new C0950W4(this.f2976f, (InterfaceC1416fj) this.f2978h, (String) this.f2977g, (String) this.f2980j, (InterfaceC1416fj) this.f2979i, interfaceC0190Eb);
            case 1:
                return new C0950W4((String) this.f2977g, (C2171l0) this.f2980j, (InterfaceC1416fj) this.f2978h, (InterfaceC1416fj) this.f2979i, interfaceC0190Eb, 1);
            case 2:
                return new C0950W4(interfaceC0190Eb, (C2414qe) this.f2977g, (C0625Og) this.f2978h, (C0140DA) this.f2979i, (C0185EC) this.f2980j);
            default:
                return new C0950W4((String) this.f2977g, (String) this.f2980j, (Activity) this.f2978h, (C0784SA) this.f2979i, interfaceC0190Eb, 3);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:163|(1:243)|(1:(1:(1:(4:168|210|211|212)(2:169|170))(4:171|205|211|212))(2:174|175))(3:176|177|(2:179|256))|180|236|181|186|(1:188)(1:190)|189|(5:201|200|202|(2:204|257)|205)(7:194|(1:196)(1:197)|(2:199|201)|200|202|(0)|205)|211|212) */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x043b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0441, code lost:
    
        p000.AbstractC0295Gu.m625r(-391413254584373L);
        p000.AbstractC0425Jv.m881a(io.github.cherrywechat.network.model.ApiResponse.class).m445b();
        p000.AbstractC0295Gu.m625r(-390979462887477L);
        r0.getMessage();
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d2 A[Catch: Exception -> 0x0242, TRY_LEAVE, TryCatch #14 {Exception -> 0x0242, blocks: (B:77:0x023e, B:95:0x02b9, B:98:0x02c1, B:100:0x02c9, B:104:0x02d2, B:134:0x0370, B:136:0x0376, B:138:0x037c), top: B:223:0x0215 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x030d A[Catch: Exception -> 0x022f, TryCatch #0 {Exception -> 0x022f, blocks: (B:71:0x022b, B:74:0x0234, B:109:0x02f7, B:111:0x030d, B:114:0x0314, B:115:0x0322, B:116:0x0323, B:118:0x0334, B:122:0x0357, B:131:0x036a, B:132:0x036d, B:81:0x0247, B:106:0x02dc, B:117:0x0331, B:129:0x0368), top: B:223:0x0215, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:252:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo448i(Object obj) throws Throwable {
        Object objM1133N;
        Object objM1163a;
        String strM625r;
        Object objM1133N2;
        Exception exc;
        InterfaceC0190Eb interfaceC0190Eb;
        C2283nk c2283nk;
        C0582Ng c0582Ng;
        Exception exc2;
        C2283nk c2283nk2;
        C0582Ng c0582Ng2;
        Object objM1165d;
        Object objM4550a;
        ApiResponse apiResponse;
        String strM625r2;
        C2283nk c2283nk3;
        C1084Z9 c1084z9;
        DownloadTokenData downloadTokenData;
        Object objM1169b;
        File file;
        C2283nk c2283nk4;
        C0539Mg c0539Mg;
        Object objM1168g;
        Object objM4550a2;
        String strM625r3;
        int i = this.f2975e;
        Object obj2 = this.f2979i;
        EnumC1453gc enumC1453gc = EnumC1453gc.f5148a;
        InterfaceC0190Eb interfaceC0190Eb2 = null;
        int i2 = 0;
        C0829TC c0829tc = C0829TC.f2620a;
        Object obj3 = this.f2980j;
        Object obj4 = this.f2977g;
        Object obj5 = this.f2978h;
        int i3 = 1;
        switch (i) {
            case 0:
                AbstractC0628Oj.m1232T(obj);
                if (this.f2976f == 0) {
                    AbstractC0295Gu.m625r(-390747534653493L);
                    AbstractC0295Gu.m625r(-390820549097525L);
                    C1036Y4.f3309b = false;
                    InterfaceC1416fj interfaceC1416fj = (InterfaceC1416fj) obj5;
                    if (interfaceC1416fj == null) {
                        return null;
                    }
                    interfaceC1416fj.mo90g((String) obj4);
                } else {
                    AbstractC0295Gu.m625r(-390850613868597L);
                    AbstractC0295Gu.m625r(-390373872498741L);
                    String str = (String) obj3;
                    C1036Y4.f3309b = false;
                    InterfaceC1416fj interfaceC1416fj2 = (InterfaceC1416fj) obj2;
                    if (interfaceC1416fj2 == null) {
                        return null;
                    }
                    interfaceC1416fj2.mo90g(str);
                }
                return c0829tc;
            case 1:
                InterfaceC1416fj interfaceC1416fj3 = (InterfaceC1416fj) obj2;
                int i4 = this.f2976f;
                try {
                } catch (Exception e) {
                    AbstractC0213Ey.m411i(-391018117593141L, -391091132037173L, e);
                    C1498hd c1498hd = AbstractC1499he.f5282a;
                    C2283nk c2283nk5 = AbstractC1106Zp.f3500a;
                    C0993X4 c0993x4 = new C0993X4(interfaceC1416fj3, e, interfaceC0190Eb2, i2);
                    this.f2976f = 3;
                    objM1133N = AbstractC0585Nj.m1133N(c2283nk5, c0993x4, this);
                    if (objM1133N == enumC1453gc) {
                        return enumC1453gc;
                    }
                }
                if (i4 == 0) {
                    AbstractC0628Oj.m1232T(obj);
                    C0594Ns c0594Ns = C0594Ns.f1925a;
                    String str2 = ((C2171l0) obj3).f7564c;
                    this.f2976f = 1;
                    c0594Ns.getClass();
                    objM1163a = C0594Ns.m1163a((String) obj4, str2, this);
                    if (objM1163a == enumC1453gc) {
                        return enumC1453gc;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            AbstractC0628Oj.m1232T(obj);
                            objM1133N2 = obj;
                            return c0829tc;
                        }
                        if (i4 != 3) {
                            throw new IllegalStateException(AbstractC0295Gu.m625r(-391129786742837L));
                        }
                        AbstractC0628Oj.m1232T(obj);
                        objM1133N = obj;
                        return c0829tc;
                    }
                    AbstractC0628Oj.m1232T(obj);
                    objM1163a = obj;
                }
                String str3 = (String) objM1163a;
                C0029Am c0029Am = AbstractC2809zm.f9524a;
                c0029Am.getClass();
                Object objM4550a3 = c0029Am.m4550a(ApiResponse.Companion.serializer(C0915VC.f2855b), str3);
                ApiResponse apiResponse2 = (ApiResponse) objM4550a3;
                int code = apiResponse2 != null ? apiResponse2.getCode() : -1;
                if (apiResponse2 != null && (strM625r = apiResponse2.getMessage()) != null) {
                    if (strM625r.length() <= 0) {
                        strM625r = null;
                    }
                    if (strM625r == null) {
                        strM625r = AbstractC0295Gu.m625r(-390996642756661L);
                    }
                    String str4 = strM625r;
                    C1498hd c1498hd2 = AbstractC1499he.f5282a;
                    C2283nk c2283nk6 = AbstractC1106Zp.f3500a;
                    C0950W4 c0950w4 = new C0950W4(code, (InterfaceC1416fj) obj5, str3, str4, interfaceC1416fj3, (InterfaceC0190Eb) null);
                    this.f2976f = 2;
                    objM1133N2 = AbstractC0585Nj.m1133N(c2283nk6, c0950w4, this);
                    if (objM1133N2 == enumC1453gc) {
                    }
                    break;
                } else {
                    strM625r = AbstractC0295Gu.m625r(-390996642756661L);
                    String str42 = strM625r;
                    C1498hd c1498hd22 = AbstractC1499he.f5282a;
                    C2283nk c2283nk62 = AbstractC1106Zp.f3500a;
                    C0950W4 c0950w42 = new C0950W4(code, (InterfaceC1416fj) obj5, str3, str42, interfaceC1416fj3, (InterfaceC0190Eb) null);
                    this.f2976f = 2;
                    objM1133N2 = AbstractC0585Nj.m1133N(c2283nk62, c0950w42, this);
                    if (objM1133N2 == enumC1453gc) {
                        return enumC1453gc;
                    }
                    break;
                }
                return c0829tc;
            case 2:
                C2414qe c2414qe = (C2414qe) obj4;
                C0140DA c0140da = (C0140DA) obj2;
                String str5 = c0140da.f364a;
                C0625Og c0625Og = (C0625Og) obj5;
                try {
                    try {
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Exception e3) {
                    exc = e3;
                    interfaceC0190Eb = null;
                }
                switch (this.f2976f) {
                    case 0:
                        AbstractC0628Oj.m1232T(obj);
                        try {
                            C2214m0 c2214m0 = C2214m0.f7706a;
                            Context context = c0625Og.getContext();
                            AbstractC0295Gu.m625r(-99132140156981L);
                            C0183EA.f539a.getClass();
                            String str6 = C0183EA.f540b;
                            c2214m0.getClass();
                            C2171l0 c2171l0M4456c = C2214m0.m4456c(context, str6);
                            C0594Ns c0594Ns2 = C0594Ns.f1925a;
                            String str7 = c2171l0M4456c.f7562a;
                            String str8 = c2171l0M4456c.f7564c;
                            this.f2976f = 1;
                            c0594Ns2.getClass();
                            objM1165d = C0594Ns.m1165d(str5, str7, str8, this);
                            if (objM1165d == enumC1453gc) {
                                return enumC1453gc;
                            }
                            String str9 = (String) objM1165d;
                            break;
                        } catch (Exception e4) {
                            e = e4;
                            interfaceC0190Eb = null;
                            exc2 = e;
                            C1498hd c1498hd3 = AbstractC1499he.f5282a;
                            c2283nk2 = AbstractC1106Zp.f3500a;
                            c0582Ng2 = new C0582Ng(c2414qe, c0625Og, exc2, interfaceC0190Eb, 0);
                            this.f2976f = 6;
                            if (AbstractC0585Nj.m1133N(c2283nk2, c0582Ng2, this) == enumC1453gc) {
                                return enumC1453gc;
                            }
                        }
                        try {
                            try {
                                C0029Am c0029Am2 = AbstractC2809zm.f9524a;
                                c0029Am2.getClass();
                                objM4550a = c0029Am2.m4550a(ApiResponse.Companion.serializer(DownloadTokenData.Companion.serializer()), str9);
                            } catch (Exception e5) {
                                AbstractC0295Gu.m625r(-99200859633717L);
                                AbstractC0425Jv.m881a(ApiResponse.class).m445b();
                                AbstractC0295Gu.m625r(-99866579564597L);
                                e5.getMessage();
                                objM4550a = null;
                            }
                            apiResponse = (ApiResponse) objM4550a;
                            break;
                        } catch (Exception e6) {
                            e = e6;
                            interfaceC0190Eb = null;
                            exc = e;
                            try {
                                C1498hd c1498hd4 = AbstractC1499he.f5282a;
                                c2283nk = AbstractC1106Zp.f3500a;
                                c0582Ng = new C0582Ng(c2414qe, c0625Og, exc, interfaceC0190Eb, 1);
                                this.f2976f = 3;
                                if (AbstractC0585Nj.m1133N(c2283nk, c0582Ng, this) == enumC1453gc) {
                                    return enumC1453gc;
                                }
                            } catch (Exception e7) {
                                e = e7;
                                exc2 = e;
                                C1498hd c1498hd32 = AbstractC1499he.f5282a;
                                c2283nk2 = AbstractC1106Zp.f3500a;
                                c0582Ng2 = new C0582Ng(c2414qe, c0625Og, exc2, interfaceC0190Eb, 0);
                                this.f2976f = 6;
                                if (AbstractC0585Nj.m1133N(c2283nk2, c0582Ng2, this) == enumC1453gc) {
                                }
                            }
                            return c0829tc;
                        }
                        if (apiResponse != null && apiResponse.getCode() == 0) {
                            downloadTokenData = (DownloadTokenData) apiResponse.getData();
                            if (downloadTokenData != null || (strM625r = downloadTokenData.getToken()) == null) {
                                String strM625r4 = AbstractC0295Gu.m625r(-99905234270261L);
                            }
                            String str10 = strM625r4;
                            C0594Ns c0594Ns3 = C0594Ns.f1925a;
                            C0183EA.f539a.getClass();
                            String str11 = C0183EA.f541c;
                            long j = c0140da.f368e;
                            C0912V9 c0912v9 = new C0912V9(c2414qe, i3);
                            this.f2976f = 4;
                            objM1169b = c0594Ns3.m1169b(str11, str10, j, c0912v9, this);
                            if (objM1169b == enumC1453gc) {
                                return enumC1453gc;
                            }
                            byte[] bArr = (byte[]) objM1169b;
                            C0183EA.f539a.getClass();
                            file = new File(C0183EA.m377e(str5));
                            if (!file.exists() && !file.mkdirs()) {
                                throw new Exception(AbstractC0295Gu.m625r(-99909529237557L));
                            }
                            File file2 = new File(C0183EA.m378f(str5));
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            try {
                                fileOutputStream.write(bArr);
                                fileOutputStream.close();
                                String absolutePath = file2.getAbsolutePath();
                                AbstractC0295Gu.m625r(-99948183943221L);
                                ThemeProvider.extractThemeFiles(absolutePath);
                                C1498hd c1498hd5 = AbstractC1499he.f5282a;
                                c2283nk4 = AbstractC1106Zp.f3500a;
                                try {
                                    c0539Mg = new C0539Mg(null, c2414qe, c0625Og, c0140da, (C0185EC) obj3);
                                    this.f2976f = 5;
                                    if (AbstractC0585Nj.m1133N(c2283nk4, c0539Mg, this) == enumC1453gc) {
                                        return enumC1453gc;
                                    }
                                } catch (Exception e8) {
                                    e = e8;
                                    c2414qe = c2414qe;
                                    c0625Og = c0625Og;
                                    exc2 = e;
                                    interfaceC0190Eb = null;
                                    C1498hd c1498hd322 = AbstractC1499he.f5282a;
                                    c2283nk2 = AbstractC1106Zp.f3500a;
                                    c0582Ng2 = new C0582Ng(c2414qe, c0625Og, exc2, interfaceC0190Eb, 0);
                                    this.f2976f = 6;
                                    if (AbstractC0585Nj.m1133N(c2283nk2, c0582Ng2, this) == enumC1453gc) {
                                    }
                                }
                                return c0829tc;
                            } finally {
                            }
                        }
                        if (apiResponse != null || (strM625r2 = apiResponse.getMessage()) == null) {
                            strM625r2 = AbstractC0295Gu.m625r(-99883759433781L);
                            String str12 = strM625r2;
                            C1498hd c1498hd6 = AbstractC1499he.f5282a;
                            c2283nk3 = AbstractC1106Zp.f3500a;
                            interfaceC0190Eb = null;
                            try {
                                c1084z9 = new C1084Z9(c2414qe, c0625Og, str12, interfaceC0190Eb, 1);
                                this.f2976f = 2;
                                if (AbstractC0585Nj.m1133N(c2283nk3, c1084z9, this) == enumC1453gc) {
                                    return enumC1453gc;
                                }
                            } catch (Exception e9) {
                                e = e9;
                                exc = e;
                                C1498hd c1498hd42 = AbstractC1499he.f5282a;
                                c2283nk = AbstractC1106Zp.f3500a;
                                c0582Ng = new C0582Ng(c2414qe, c0625Og, exc, interfaceC0190Eb, 1);
                                this.f2976f = 3;
                                if (AbstractC0585Nj.m1133N(c2283nk, c0582Ng, this) == enumC1453gc) {
                                }
                            }
                        } else {
                            if (strM625r2.length() == 0) {
                                strM625r2 = apiResponse.getMsg();
                            }
                            if (strM625r2 == null) {
                            }
                            String str122 = strM625r2;
                            C1498hd c1498hd62 = AbstractC1499he.f5282a;
                            c2283nk3 = AbstractC1106Zp.f3500a;
                            interfaceC0190Eb = null;
                            c1084z9 = new C1084Z9(c2414qe, c0625Og, str122, interfaceC0190Eb, 1);
                            this.f2976f = 2;
                            if (AbstractC0585Nj.m1133N(c2283nk3, c1084z9, this) == enumC1453gc) {
                            }
                        }
                        return c0829tc;
                    case 1:
                        AbstractC0628Oj.m1232T(obj);
                        objM1165d = obj;
                        String str92 = (String) objM1165d;
                        C0029Am c0029Am22 = AbstractC2809zm.f9524a;
                        c0029Am22.getClass();
                        objM4550a = c0029Am22.m4550a(ApiResponse.Companion.serializer(DownloadTokenData.Companion.serializer()), str92);
                        apiResponse = (ApiResponse) objM4550a;
                        if (apiResponse != null) {
                            downloadTokenData = (DownloadTokenData) apiResponse.getData();
                            if (downloadTokenData != null) {
                                String strM625r42 = AbstractC0295Gu.m625r(-99905234270261L);
                                String str102 = strM625r42;
                                C0594Ns c0594Ns32 = C0594Ns.f1925a;
                                C0183EA.f539a.getClass();
                                String str112 = C0183EA.f541c;
                                long j2 = c0140da.f368e;
                                C0912V9 c0912v92 = new C0912V9(c2414qe, i3);
                                this.f2976f = 4;
                                objM1169b = c0594Ns32.m1169b(str112, str102, j2, c0912v92, this);
                                if (objM1169b == enumC1453gc) {
                                }
                                byte[] bArr2 = (byte[]) objM1169b;
                                C0183EA.f539a.getClass();
                                file = new File(C0183EA.m377e(str5));
                                if (!file.exists()) {
                                    throw new Exception(AbstractC0295Gu.m625r(-99909529237557L));
                                }
                                File file22 = new File(C0183EA.m378f(str5));
                                FileOutputStream fileOutputStream2 = new FileOutputStream(file22);
                                fileOutputStream2.write(bArr2);
                                fileOutputStream2.close();
                                String absolutePath2 = file22.getAbsolutePath();
                                AbstractC0295Gu.m625r(-99948183943221L);
                                ThemeProvider.extractThemeFiles(absolutePath2);
                                C1498hd c1498hd52 = AbstractC1499he.f5282a;
                                c2283nk4 = AbstractC1106Zp.f3500a;
                                c0539Mg = new C0539Mg(null, c2414qe, c0625Og, c0140da, (C0185EC) obj3);
                                this.f2976f = 5;
                                if (AbstractC0585Nj.m1133N(c2283nk4, c0539Mg, this) == enumC1453gc) {
                                }
                            }
                            return c0829tc;
                        }
                        if (apiResponse != null) {
                            strM625r2 = AbstractC0295Gu.m625r(-99883759433781L);
                            String str1222 = strM625r2;
                            C1498hd c1498hd622 = AbstractC1499he.f5282a;
                            c2283nk3 = AbstractC1106Zp.f3500a;
                            interfaceC0190Eb = null;
                            c1084z9 = new C1084Z9(c2414qe, c0625Og, str1222, interfaceC0190Eb, 1);
                            this.f2976f = 2;
                            if (AbstractC0585Nj.m1133N(c2283nk3, c1084z9, this) == enumC1453gc) {
                            }
                        }
                        return c0829tc;
                    case 2:
                        AbstractC0628Oj.m1232T(obj);
                        return c0829tc;
                    case 3:
                    case 5:
                        AbstractC0628Oj.m1232T(obj);
                        return c0829tc;
                    case 4:
                        AbstractC0628Oj.m1232T(obj);
                        objM1169b = obj;
                        byte[] bArr22 = (byte[]) objM1169b;
                        C0183EA.f539a.getClass();
                        file = new File(C0183EA.m377e(str5));
                        if (!file.exists()) {
                        }
                        File file222 = new File(C0183EA.m378f(str5));
                        FileOutputStream fileOutputStream22 = new FileOutputStream(file222);
                        fileOutputStream22.write(bArr22);
                        fileOutputStream22.close();
                        String absolutePath22 = file222.getAbsolutePath();
                        AbstractC0295Gu.m625r(-99948183943221L);
                        ThemeProvider.extractThemeFiles(absolutePath22);
                        C1498hd c1498hd522 = AbstractC1499he.f5282a;
                        c2283nk4 = AbstractC1106Zp.f3500a;
                        c0539Mg = new C0539Mg(null, c2414qe, c0625Og, c0140da, (C0185EC) obj3);
                        this.f2976f = 5;
                        if (AbstractC0585Nj.m1133N(c2283nk4, c0539Mg, this) == enumC1453gc) {
                        }
                        return c0829tc;
                    case 6:
                        AbstractC0628Oj.m1232T(obj);
                        return c0829tc;
                    default:
                        throw new IllegalStateException(AbstractC0295Gu.m625r(-100038378256437L));
                }
            default:
                Activity activity = (Activity) obj5;
                int i5 = this.f2976f;
                try {
                    if (i5 == 0) {
                        AbstractC0628Oj.m1232T(obj);
                        String strM2791I = C1456gf.m2791I();
                        if (strM2791I.length() == 0) {
                            strM2791I = C1456gf.m2794L();
                        }
                        C0594Ns c0594Ns4 = C0594Ns.f1925a;
                        this.f2976f = 1;
                        c0594Ns4.getClass();
                        objM1168g = C0594Ns.m1168g((String) obj4, (String) obj3, strM2791I, this);
                        if (objM1168g == enumC1453gc) {
                            return enumC1453gc;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException(AbstractC0295Gu.m625r(-475736347506741L));
                        }
                        AbstractC0628Oj.m1232T(obj);
                        objM1168g = obj;
                    }
                    String str13 = (String) objM1168g;
                    try {
                        C0029Am c0029Am3 = AbstractC2809zm.f9524a;
                        c0029Am3.getClass();
                        objM4550a2 = c0029Am3.m4550a(ApiResponse.Companion.serializer(ThemePurchaseData.Companion.serializer()), str13);
                    } catch (Exception e10) {
                        AbstractC0295Gu.m625r(-477140801812533L);
                        AbstractC0425Jv.m881a(ApiResponse.class).m445b();
                        AbstractC0295Gu.m625r(-476707010115637L);
                        e10.getMessage();
                        objM4550a2 = null;
                    }
                    ApiResponse apiResponse3 = (ApiResponse) objM4550a2;
                    if (apiResponse3 == null || apiResponse3.getCode() != 0) {
                        if (apiResponse3 == null || (strM625r3 = apiResponse3.getMessage()) == null) {
                            strM625r3 = AbstractC0295Gu.m625r(-475684807899189L);
                        } else if (strM625r3.length() == 0) {
                            strM625r3 = AbstractC0295Gu.m625r(-475663333062709L);
                        }
                        Toast.makeText(activity, strM625r3, 0).show();
                    } else {
                        ThemePurchaseData themePurchaseData = (ThemePurchaseData) apiResponse3.getData();
                        String qrCode = themePurchaseData != null ? themePurchaseData.getQrCode() : null;
                        AbstractC0295Gu.m625r(-476724189984821L);
                        if (qrCode == null || qrCode.length() == 0) {
                            String message = apiResponse3.getMessage();
                            if (message.length() == 0) {
                                message = AbstractC0295Gu.m625r(-475641858226229L);
                            }
                            Toast.makeText(activity, message, 0).show();
                        } else {
                            try {
                                if (qrCode.startsWith(AbstractC0295Gu.m625r(-476810089330741L))) {
                                    String strM625r5 = AbstractC0295Gu.m625r(-476853039003701L);
                                    AbstractC0295Gu.m625r(-578300166535221L);
                                    int i6 = AbstractC1450gG.f5067a;
                                    C1538iG c1538iG = new C1538iG(AbstractC1406fG.m2718r0(strM625r5));
                                    C0556Mx c0556Mx = new C0556Mx(11);
                                    AbstractC0295Gu.m625r(-576599359486005L);
                                    c1538iG.f5425g = c0556Mx;
                                    Method methodM2920e = c1538iG.m2920e();
                                    Class<?> cls = methodM2920e.getParameterTypes()[1];
                                    AbstractC0295Gu.m625r(-475470059534389L);
                                    AbstractC0295Gu.m625r(-579988088682549L);
                                    C2428qs c2428qs = new C2428qs(11, cls);
                                    c2428qs.m4886x(String.class, Integer.TYPE, Object.class);
                                    Object objM4885w = c2428qs.m4885w(qrCode, new Integer(28), null);
                                    String strM625r6 = AbstractC0295Gu.m625r(-475508714240053L);
                                    AbstractC0295Gu.m625r(-579464102672437L);
                                    C2428qs c2428qs2 = new C2428qs(11, AbstractC1406fG.m2718r0(strM625r6));
                                    c2428qs2.m4886x(Context.class);
                                    Object objM4885w2 = c2428qs2.m4885w(activity);
                                    String strM625r7 = AbstractC0295Gu.m625r(-475147936987189L);
                                    AbstractC0295Gu.m625r(-579464102672437L);
                                    C2428qs c2428qs3 = new C2428qs(11, AbstractC1406fG.m2718r0(strM625r7));
                                    c2428qs3.m4886x(AbstractC0295Gu.m625r(-475963980773429L));
                                    methodM2920e.invoke(c2428qs3.m4885w(objM4885w2), null, objM4885w, null);
                                } else {
                                    C1456gf.m2803U(activity, qrCode);
                                }
                            } catch (Exception unused) {
                                Toast.makeText(activity, AbstractC0295Gu.m625r(-475603203520565L), 0).show();
                            }
                        }
                    }
                    break;
                } catch (Exception e11) {
                    Toast.makeText(activity, AbstractC0213Ey.m405c(-475706282735669L, new StringBuilder(), e11), 0).show();
                }
                return c0829tc;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0950W4(InterfaceC0190Eb interfaceC0190Eb, C2414qe c2414qe, C0625Og c0625Og, C0140DA c0140da, C0185EC c0185ec) {
        super(interfaceC0190Eb);
        this.f2975e = 2;
        this.f2978h = c0625Og;
        this.f2979i = c0140da;
        this.f2977g = c2414qe;
        this.f2980j = c0185ec;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0950W4(String str, Object obj, Object obj2, Object obj3, InterfaceC0190Eb interfaceC0190Eb, int i) {
        super(interfaceC0190Eb);
        this.f2975e = i;
        this.f2977g = str;
        this.f2980j = obj;
        this.f2978h = obj2;
        this.f2979i = obj3;
    }
}
