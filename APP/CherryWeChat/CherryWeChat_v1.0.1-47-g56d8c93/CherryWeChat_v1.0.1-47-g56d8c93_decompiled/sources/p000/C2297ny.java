package p000;

import android.app.AndroidAppHelper;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;
import io.github.cherrywechat.application.MainApplication;
import io.github.cherrywechat.lua.LuaEngine;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: ny */
/* JADX INFO: loaded from: classes.dex */
public final class C2297ny extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f8051e;

    /* JADX INFO: renamed from: f */
    public Object f8052f;

    /* JADX INFO: renamed from: g */
    public int f8053g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC0972Wk f8054h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2297ny(C2340oy c2340oy, InterfaceC0190Eb interfaceC0190Eb, int i) {
        super(interfaceC0190Eb);
        this.f8051e = i;
        this.f8054h = c2340oy;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) {
        InterfaceC1409fc interfaceC1409fc = (InterfaceC1409fc) obj;
        InterfaceC0190Eb interfaceC0190Eb = (InterfaceC0190Eb) obj2;
        switch (this.f8051e) {
        }
        return ((C2297ny) mo447h(interfaceC0190Eb, interfaceC1409fc)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        switch (this.f8051e) {
            case 0:
                return new C2297ny((C2340oy) this.f8054h, interfaceC0190Eb, 0);
            case 1:
                return new C2297ny((C2340oy) this.f8054h, interfaceC0190Eb, 1);
            default:
                return new C2297ny((String) this.f8052f, (C0762Rp) this.f8054h, interfaceC0190Eb);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0338, code lost:
    
        if (r2 == r4) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e4, code lost:
    
        if (r0 != r4) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0102 A[Catch: Exception -> 0x008f, PHI: r0 r9
  0x0102: PHI (r0v46 U2) = (r0v42 U2), (r0v48 U2) binds: [B:54:0x00fe, B:41:0x00b3] A[DONT_GENERATE, DONT_INLINE]
  0x0102: PHI (r9v30 java.lang.Object) = (r9v29 java.lang.Object), (r9v37 java.lang.Object) binds: [B:54:0x00fe, B:41:0x00b3] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x008f, blocks: (B:27:0x0088, B:83:0x01e9, B:85:0x01ef, B:86:0x01f8, B:88:0x022b, B:89:0x0237, B:32:0x0096, B:80:0x01c9, B:35:0x009f, B:75:0x0199, B:77:0x01a1, B:90:0x0243, B:38:0x00aa, B:72:0x017a, B:41:0x00b3, B:56:0x0102, B:58:0x010c, B:61:0x0111, B:62:0x011b, B:69:0x0136, B:65:0x0125, B:68:0x012a, B:42:0x00b9, B:48:0x00da, B:50:0x00e0, B:53:0x00e6, B:91:0x0258, B:45:0x00c2), top: B:180:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017a A[Catch: Exception -> 0x008f, PHI: r0
  0x017a: PHI (r0v49 U2) = (r0v46 U2), (r0v51 U2) binds: [B:70:0x0177, B:38:0x00aa] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x008f, blocks: (B:27:0x0088, B:83:0x01e9, B:85:0x01ef, B:86:0x01f8, B:88:0x022b, B:89:0x0237, B:32:0x0096, B:80:0x01c9, B:35:0x009f, B:75:0x0199, B:77:0x01a1, B:90:0x0243, B:38:0x00aa, B:72:0x017a, B:41:0x00b3, B:56:0x0102, B:58:0x010c, B:61:0x0111, B:62:0x011b, B:69:0x0136, B:65:0x0125, B:68:0x012a, B:42:0x00b9, B:48:0x00da, B:50:0x00e0, B:53:0x00e6, B:91:0x0258, B:45:0x00c2), top: B:180:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0199 A[Catch: Exception -> 0x008f, PHI: r0 r2
  0x0199: PHI (r0v52 U2) = (r0v49 U2), (r0v56 U2) binds: [B:73:0x0196, B:36:0x00a2] A[DONT_GENERATE, DONT_INLINE]
  0x0199: PHI (r2v26 java.lang.Object) = (r2v25 java.lang.Object), (r2v33 java.lang.Object) binds: [B:73:0x0196, B:36:0x00a2] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x008f, blocks: (B:27:0x0088, B:83:0x01e9, B:85:0x01ef, B:86:0x01f8, B:88:0x022b, B:89:0x0237, B:32:0x0096, B:80:0x01c9, B:35:0x009f, B:75:0x0199, B:77:0x01a1, B:90:0x0243, B:38:0x00aa, B:72:0x017a, B:41:0x00b3, B:56:0x0102, B:58:0x010c, B:61:0x0111, B:62:0x011b, B:69:0x0136, B:65:0x0125, B:68:0x012a, B:42:0x00b9, B:48:0x00da, B:50:0x00e0, B:53:0x00e6, B:91:0x0258, B:45:0x00c2), top: B:180:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1 A[Catch: Exception -> 0x008f, TryCatch #0 {Exception -> 0x008f, blocks: (B:27:0x0088, B:83:0x01e9, B:85:0x01ef, B:86:0x01f8, B:88:0x022b, B:89:0x0237, B:32:0x0096, B:80:0x01c9, B:35:0x009f, B:75:0x0199, B:77:0x01a1, B:90:0x0243, B:38:0x00aa, B:72:0x017a, B:41:0x00b3, B:56:0x0102, B:58:0x010c, B:61:0x0111, B:62:0x011b, B:69:0x0136, B:65:0x0125, B:68:0x012a, B:42:0x00b9, B:48:0x00da, B:50:0x00e0, B:53:0x00e6, B:91:0x0258, B:45:0x00c2), top: B:180:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0243 A[Catch: Exception -> 0x008f, TryCatch #0 {Exception -> 0x008f, blocks: (B:27:0x0088, B:83:0x01e9, B:85:0x01ef, B:86:0x01f8, B:88:0x022b, B:89:0x0237, B:32:0x0096, B:80:0x01c9, B:35:0x009f, B:75:0x0199, B:77:0x01a1, B:90:0x0243, B:38:0x00aa, B:72:0x017a, B:41:0x00b3, B:56:0x0102, B:58:0x010c, B:61:0x0111, B:62:0x011b, B:69:0x0136, B:65:0x0125, B:68:0x012a, B:42:0x00b9, B:48:0x00da, B:50:0x00e0, B:53:0x00e6, B:91:0x0258, B:45:0x00c2), top: B:180:0x0076 }] */
    /* JADX WARN: Type inference failed for: r5v0, types: [Eb] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.widget.TextView] */
    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo448i(Object obj) throws Throwable {
        Object objM1133N;
        C0862U2 c0862u2;
        C0819T2 c0819t2;
        Object objM1133N2;
        Object objM1133N3;
        C0862U2 c0862u22;
        C0819T2 c0819t22;
        Object objM1133N4;
        C0905V2 c0905v2;
        Context contextCurrentApplication;
        Object objM1133N5;
        C0862U2 c0862u23;
        Object objM1133N6;
        int i = this.f8051e;
        int i2 = 4;
        Object obj2 = C0829TC.f2620a;
        EnumC1453gc enumC1453gc = EnumC1453gc.f5148a;
        ?? r5 = 0;
        TextView textView = null;
        InterfaceC0972Wk interfaceC0972Wk = this.f8054h;
        int i3 = 0;
        int i4 = 2;
        switch (i) {
            case 0:
                C2340oy c2340oy = (C2340oy) interfaceC0972Wk;
                int i5 = this.f8053g;
                try {
                    if (i5 == 0) {
                        AbstractC0628Oj.m1232T(obj);
                        C1456gf c1456gf = AbstractC1077Z2.f3440a;
                        this.f8053g = 1;
                        c1456gf.getClass();
                        C1498hd c1498hd = AbstractC1499he.f5282a;
                        objM1133N = AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C1034Y2(i4, r5), this);
                        if (objM1133N == enumC1453gc) {
                        }
                        return enumC1453gc;
                    }
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException(AbstractC0295Gu.m625r(-478291853047861L));
                        }
                        c0862u2 = (C0862U2) this.f8052f;
                        AbstractC0628Oj.m1232T(obj);
                        objM1133N2 = obj;
                        C0905V2 c0905v22 = (C0905V2) objM1133N2;
                        String str = c0905v22.f2823f;
                        int i6 = c0905v22.f2822e;
                        boolean z = c0905v22.f2818a;
                        if (str != null && AbstractC2564tz.m5051L(str, AbstractC0295Gu.m625r(-480409271924789L), false)) {
                            C2340oy.m4746a(c2340oy);
                            TextView textView2 = c2340oy.f8213b;
                            if (textView2 == null) {
                                AbstractC0295Gu.m625r(-480422156826677L);
                                textView2 = null;
                            }
                            textView2.setText(AbstractC0295Gu.m625r(-479945415456821L));
                            C2340oy.m4749g(c2340oy, false);
                            return obj2;
                        }
                        TextView textView3 = c2340oy.f8213b;
                        if (textView3 == null) {
                            AbstractC0295Gu.m625r(-479975480227893L);
                            textView3 = null;
                        }
                        StringBuilder sb = new StringBuilder();
                        if (z) {
                            sb.append(AbstractC0295Gu.m625r(-480048494671925L));
                            if (i6 > 0) {
                                sb.append(AbstractC0295Gu.m625r(-480091444344885L) + i6 + AbstractC0295Gu.m625r(-480121509115957L));
                            }
                        } else {
                            sb.append(AbstractC0295Gu.m625r(-480134394017845L));
                        }
                        textView3.setText(sb.toString());
                        if (c0905v22.f2821d >= c0862u2.f2725e.f2588c && z) {
                            C2340oy.m4748f(c2340oy);
                            C2340oy.m4749g(c2340oy, true);
                            return obj2;
                        }
                        TextView textView4 = c2340oy.f8212a;
                        if (textView4 == null) {
                            AbstractC0295Gu.m625r(-480181638658101L);
                            textView4 = null;
                        }
                        textView4.setText(AbstractC0295Gu.m625r(-478588205791285L));
                        C2340oy.m4747e(c2340oy);
                        C2340oy.m4749g(c2340oy, false);
                        return obj2;
                    }
                    AbstractC0628Oj.m1232T(obj);
                    objM1133N = obj;
                    c0862u2 = (C0862U2) objM1133N;
                    if (c0862u2.f2721a && (c0819t2 = c0862u2.f2725e) != null) {
                        C1456gf c1456gf2 = AbstractC1077Z2.f3440a;
                        String str2 = c0819t2.f2586a;
                        this.f8052f = c0862u2;
                        this.f8053g = 2;
                        c1456gf2.getClass();
                        C1498hd c1498hd2 = AbstractC1499he.f5282a;
                        objM1133N2 = AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C0948W2(i3, r5, str2), this);
                        break;
                    }
                    String str3 = c0862u2.f2722b;
                    if (str3 == null || !AbstractC2564tz.m5051L(str3, AbstractC0295Gu.m625r(-480293307807797L), false)) {
                        C2340oy.m4747e(c2340oy);
                        return obj2;
                    }
                    C2340oy.m4746a(c2340oy);
                    TextView textView5 = c2340oy.f8213b;
                    if (textView5 == null) {
                        AbstractC0295Gu.m625r(-480306192709685L);
                        textView5 = null;
                    }
                    textView5.setText(AbstractC0295Gu.m625r(-480379207153717L));
                    return obj2;
                } catch (Exception e) {
                    AbstractC0295Gu.m625r(-478618270562357L);
                    AbstractC0295Gu.m625r(-478639745398837L);
                    Toast.makeText(c2340oy.getContext(), AbstractC0213Ey.m405c(-478678400104501L, new StringBuilder(), e), 0).show();
                    String message = e.getMessage();
                    if (message == null || !AbstractC2564tz.m5051L(message, AbstractC0295Gu.m625r(-478725644744757L), false)) {
                        C2340oy.m4747e(c2340oy);
                    } else {
                        C2340oy.m4746a(c2340oy);
                        TextView textView6 = c2340oy.f8213b;
                        if (textView6 == null) {
                            AbstractC0295Gu.m625r(-478738529646645L);
                        } else {
                            r5 = textView6;
                        }
                        r5.setText(AbstractC0295Gu.m625r(-478811544090677L));
                    }
                    C2340oy.m4749g(c2340oy, false);
                    return obj2;
                }
            case 1:
                C2340oy c2340oy2 = (C2340oy) interfaceC0972Wk;
                try {
                    switch (this.f8053g) {
                        case 0:
                            AbstractC0628Oj.m1232T(obj);
                            C1456gf c1456gf3 = AbstractC1077Z2.f3440a;
                            this.f8053g = 1;
                            c1456gf3.getClass();
                            C1498hd c1498hd3 = AbstractC1499he.f5282a;
                            objM1133N3 = AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C1034Y2(i4, r5), this);
                            if (objM1133N3 != enumC1453gc) {
                                c0862u22 = (C0862U2) objM1133N3;
                                if (c0862u22.f2721a && (c0819t22 = c0862u22.f2725e) != null) {
                                    C1456gf c1456gf4 = AbstractC1077Z2.f3440a;
                                    String str4 = c0819t22.f2586a;
                                    this.f8052f = c0862u22;
                                    this.f8053g = 2;
                                    c1456gf4.getClass();
                                    C1498hd c1498hd4 = AbstractC1499he.f5282a;
                                    objM1133N4 = AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C0948W2(i3, r5, str4), this);
                                    if (objM1133N4 == enumC1453gc) {
                                        c0905v2 = (C0905V2) objM1133N4;
                                        if (c0905v2.f2821d >= c0862u22.f2725e.f2588c && c0905v2.f2818a) {
                                            C2340oy.f8211e = false;
                                            C2340oy.m4748f(c2340oy2);
                                            C2340oy.m4749g(c2340oy2, true);
                                            return obj2;
                                        }
                                        Intent intent = new Intent();
                                        contextCurrentApplication = MainApplication.f5549a;
                                        if (contextCurrentApplication == null && (contextCurrentApplication = C1456gf.f5172p) == null) {
                                            contextCurrentApplication = AndroidAppHelper.currentApplication();
                                            AbstractC0295Gu.m625r(-836852902787125L);
                                        }
                                        String str5 = contextCurrentApplication.getApplicationInfo().packageName;
                                        AbstractC0295Gu.m625r(-837656061671477L);
                                        intent.setClassName(str5, AbstractC0295Gu.m625r(-478498011478069L));
                                        intent.putExtra(AbstractC0295Gu.m625r(-479258220689461L), c0862u22.f2725e.f2587b);
                                        intent.addFlags(268435456);
                                        c2340oy2.getContext().startActivity(intent);
                                        this.f8052f = c0862u22;
                                        this.f8053g = 3;
                                        if (AbstractC1293cr.m2557v(3000L, this) == enumC1453gc) {
                                            C1456gf c1456gf5 = AbstractC1077Z2.f3440a;
                                            C0819T2 c0819t23 = c0862u22.f2725e;
                                            String str6 = c0819t23.f2586a;
                                            int i7 = c0819t23.f2588c;
                                            this.f8052f = c0862u22;
                                            this.f8053g = 4;
                                            c1456gf5.getClass();
                                            C1498hd c1498hd5 = AbstractC1499he.f5282a;
                                            objM1133N5 = AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C0991X2(i7, null, str6), this);
                                            if (objM1133N5 == enumC1453gc) {
                                                c0862u23 = (C0862U2) objM1133N5;
                                                C2340oy.f8211e = false;
                                                if (!c0862u23.f2721a) {
                                                    C2340oy.m4748f(c2340oy2);
                                                    C2340oy.m4749g(c2340oy2, true);
                                                    Toast.makeText(c2340oy2.getContext(), AbstractC0295Gu.m625r(-479288285460533L), 0).show();
                                                    this.f8052f = c0862u22;
                                                    this.f8053g = 5;
                                                    if (AbstractC1293cr.m2557v(1000L, this) != enumC1453gc) {
                                                        C1456gf c1456gf6 = AbstractC1077Z2.f3440a;
                                                        String str7 = c0862u22.f2725e.f2586a;
                                                        this.f8052f = null;
                                                        this.f8053g = 6;
                                                        c1456gf6.getClass();
                                                        C1498hd c1498hd6 = AbstractC1499he.f5282a;
                                                        objM1133N6 = AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C0948W2(i3, r5, str7), this);
                                                        break;
                                                    }
                                                } else {
                                                    C2340oy.m4747e(c2340oy2);
                                                    C2340oy.m4749g(c2340oy2, false);
                                                    Toast.makeText(c2340oy2.getContext(), c0862u23.f2722b, 0).show();
                                                    return obj2;
                                                }
                                            }
                                        }
                                    }
                                }
                                Toast.makeText(c2340oy2.getContext(), c0862u22.f2722b, 0).show();
                                C2340oy.m4747e(c2340oy2);
                                C2340oy.m4749g(c2340oy2, false);
                                C2340oy.f8211e = false;
                                return obj2;
                            }
                            return enumC1453gc;
                        case 1:
                            AbstractC0628Oj.m1232T(obj);
                            objM1133N3 = obj;
                            c0862u22 = (C0862U2) objM1133N3;
                            if (c0862u22.f2721a) {
                                C1456gf c1456gf42 = AbstractC1077Z2.f3440a;
                                String str42 = c0819t22.f2586a;
                                this.f8052f = c0862u22;
                                this.f8053g = 2;
                                c1456gf42.getClass();
                                C1498hd c1498hd42 = AbstractC1499he.f5282a;
                                objM1133N4 = AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C0948W2(i3, r5, str42), this);
                                if (objM1133N4 == enumC1453gc) {
                                }
                                return enumC1453gc;
                            }
                            Toast.makeText(c2340oy2.getContext(), c0862u22.f2722b, 0).show();
                            C2340oy.m4747e(c2340oy2);
                            C2340oy.m4749g(c2340oy2, false);
                            C2340oy.f8211e = false;
                            return obj2;
                        case 2:
                            c0862u22 = (C0862U2) this.f8052f;
                            AbstractC0628Oj.m1232T(obj);
                            objM1133N4 = obj;
                            c0905v2 = (C0905V2) objM1133N4;
                            if (c0905v2.f2821d >= c0862u22.f2725e.f2588c) {
                                C2340oy.f8211e = false;
                                C2340oy.m4748f(c2340oy2);
                                C2340oy.m4749g(c2340oy2, true);
                                return obj2;
                            }
                            Intent intent2 = new Intent();
                            contextCurrentApplication = MainApplication.f5549a;
                            if (contextCurrentApplication == null) {
                                contextCurrentApplication = AndroidAppHelper.currentApplication();
                                AbstractC0295Gu.m625r(-836852902787125L);
                            }
                            String str52 = contextCurrentApplication.getApplicationInfo().packageName;
                            AbstractC0295Gu.m625r(-837656061671477L);
                            intent2.setClassName(str52, AbstractC0295Gu.m625r(-478498011478069L));
                            intent2.putExtra(AbstractC0295Gu.m625r(-479258220689461L), c0862u22.f2725e.f2587b);
                            intent2.addFlags(268435456);
                            c2340oy2.getContext().startActivity(intent2);
                            this.f8052f = c0862u22;
                            this.f8053g = 3;
                            if (AbstractC1293cr.m2557v(3000L, this) == enumC1453gc) {
                            }
                            return enumC1453gc;
                        case 3:
                            c0862u22 = (C0862U2) this.f8052f;
                            AbstractC0628Oj.m1232T(obj);
                            C1456gf c1456gf52 = AbstractC1077Z2.f3440a;
                            C0819T2 c0819t232 = c0862u22.f2725e;
                            String str62 = c0819t232.f2586a;
                            int i72 = c0819t232.f2588c;
                            this.f8052f = c0862u22;
                            this.f8053g = 4;
                            c1456gf52.getClass();
                            C1498hd c1498hd52 = AbstractC1499he.f5282a;
                            objM1133N5 = AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C0991X2(i72, null, str62), this);
                            if (objM1133N5 == enumC1453gc) {
                            }
                            return enumC1453gc;
                        case 4:
                            c0862u22 = (C0862U2) this.f8052f;
                            AbstractC0628Oj.m1232T(obj);
                            objM1133N5 = obj;
                            c0862u23 = (C0862U2) objM1133N5;
                            C2340oy.f8211e = false;
                            if (!c0862u23.f2721a) {
                            }
                            break;
                        case 5:
                            c0862u22 = (C0862U2) this.f8052f;
                            AbstractC0628Oj.m1232T(obj);
                            C1456gf c1456gf62 = AbstractC1077Z2.f3440a;
                            String str72 = c0862u22.f2725e.f2586a;
                            this.f8052f = null;
                            this.f8053g = 6;
                            c1456gf62.getClass();
                            C1498hd c1498hd62 = AbstractC1499he.f5282a;
                            objM1133N6 = AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C0948W2(i3, r5, str72), this);
                            break;
                        case 6:
                            AbstractC0628Oj.m1232T(obj);
                            objM1133N6 = obj;
                            C0905V2 c0905v23 = (C0905V2) objM1133N6;
                            TextView textView7 = c2340oy2.f8213b;
                            if (textView7 == null) {
                                AbstractC0295Gu.m625r(-479309760297013L);
                                textView7 = null;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(AbstractC0295Gu.m625r(-479382774741045L) + c0905v23.f2822e + AbstractC0295Gu.m625r(-478863083698229L));
                            if (c0905v23.f2822e >= 7) {
                                sb2.append(AbstractC0295Gu.m625r(-478875968600117L));
                            }
                            textView7.setText(sb2.toString());
                            C2340oy.m4749g(c2340oy2, true);
                            return obj2;
                        default:
                            throw new IllegalStateException(AbstractC0295Gu.m625r(-477505874032693L));
                    }
                } catch (Exception e2) {
                    AbstractC0295Gu.m625r(-478931803174965L);
                    AbstractC0295Gu.m625r(-478953278011445L);
                    C2340oy.f8211e = false;
                    Toast.makeText(c2340oy2.getContext(), AbstractC0295Gu.m625r(-478991932717109L), 0).show();
                    String message2 = e2.getMessage();
                    if (message2 == null || !AbstractC2564tz.m5051L(message2, AbstractC0295Gu.m625r(-479039177357365L), false)) {
                        C2340oy.m4747e(c2340oy2);
                    } else {
                        TextView textView8 = c2340oy2.f8213b;
                        if (textView8 == null) {
                            AbstractC0295Gu.m625r(-479052062259253L);
                        } else {
                            textView = textView8;
                        }
                        textView.setText(AbstractC0295Gu.m625r(-477475809261621L));
                        C2340oy.m4746a(c2340oy2);
                    }
                    C2340oy.m4749g(c2340oy2, false);
                    return obj2;
                }
                break;
            default:
                C0762Rp c0762Rp = (C0762Rp) interfaceC0972Wk;
                int i8 = this.f8053g;
                try {
                } catch (Exception e3) {
                    C1498hd c1498hd7 = AbstractC1499he.f5282a;
                    C2283nk c2283nk = AbstractC1106Zp.f3500a;
                    C0993X4 c0993x4 = new C0993X4(c0762Rp, e3, r5, i2);
                    this.f8053g = 2;
                    if (AbstractC0585Nj.m1133N(c2283nk, c0993x4, this) == enumC1453gc) {
                    }
                }
                if (i8 == 0) {
                    AbstractC0628Oj.m1232T(obj);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Object objM5465executeIoAF18A = LuaEngine.INSTANCE.m5465executeIoAF18A((String) this.f8052f);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    C1498hd c1498hd8 = AbstractC1499he.f5282a;
                    C2283nk c2283nk2 = AbstractC1106Zp.f3500a;
                    C0720Qp c0720Qp = new C0720Qp(objM5465executeIoAF18A, c0762Rp, jCurrentTimeMillis2, null);
                    this.f8053g = 1;
                    obj2 = AbstractC0585Nj.m1133N(c2283nk2, c0720Qp, this) == enumC1453gc ? enumC1453gc : enumC1453gc;
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException(AbstractC0295Gu.m625r(-130506876254261L));
                        }
                        AbstractC0628Oj.m1232T(obj);
                        return obj2;
                    }
                    AbstractC0628Oj.m1232T(obj);
                }
                return obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2297ny(String str, C0762Rp c0762Rp, InterfaceC0190Eb interfaceC0190Eb) {
        super(interfaceC0190Eb);
        this.f8051e = 2;
        this.f8052f = str;
        this.f8054h = c0762Rp;
    }
}
