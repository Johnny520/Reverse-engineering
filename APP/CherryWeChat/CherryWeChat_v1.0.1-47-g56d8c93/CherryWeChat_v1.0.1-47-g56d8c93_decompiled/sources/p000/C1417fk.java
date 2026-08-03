package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import io.github.cherrywechat.R;
import io.github.cherrywechat.network.model.ApiResponse;
import io.github.cherrywechat.network.model.DownloadTokenData;
import io.github.cherrywechat.network.model.ThemeDetailData;
import io.github.cherrywechat.theme.ThemeProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: fk */
/* JADX INFO: loaded from: classes.dex */
public final class C1417fk extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f5008e;

    /* JADX INFO: renamed from: f */
    public int f5009f;

    /* JADX INFO: renamed from: g */
    public Object f5010g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f5011h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f5012i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1417fk(C0701QC c0701qc, Object obj, InterfaceC0190Eb interfaceC0190Eb, int i) {
        super(interfaceC0190Eb);
        this.f5008e = i;
        this.f5011h = c0701qc;
        this.f5012i = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) {
        InterfaceC1409fc interfaceC1409fc = (InterfaceC1409fc) obj;
        InterfaceC0190Eb interfaceC0190Eb = (InterfaceC0190Eb) obj2;
        switch (this.f5008e) {
        }
        return ((C1417fk) mo447h(interfaceC0190Eb, interfaceC1409fc)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        switch (this.f5008e) {
            case 0:
                return new C1417fk((C1505hk) this.f5010g, (C0140DA) this.f5011h, (C0185EC) this.f5012i, interfaceC0190Eb, 0);
            case 1:
                return new C1417fk((C2288np) this.f5010g, (String) this.f5011h, (String) this.f5012i, interfaceC0190Eb, 1);
            case 2:
                return new C1417fk((String) this.f5010g, (Bundle) this.f5011h, (String) this.f5012i, interfaceC0190Eb, 2);
            case 3:
                return new C1417fk((String) this.f5010g, (C0784SA) this.f5011h, (Activity) this.f5012i, interfaceC0190Eb, 3);
            case 4:
                return new C1417fk((C0701QC) this.f5011h, (Activity) this.f5012i, interfaceC0190Eb, 4);
            default:
                return new C1417fk((C0701QC) this.f5011h, (String) this.f5012i, interfaceC0190Eb, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:247|(1:(1:(2:117|272)(2:121|122))(2:123|124))(5:125|126|(1:128)|156|271)|129|245|130|135|(1:137)(1:138)|(2:146|(2:148|(2:150|268)(2:151|(1:153)(1:269)))(2:154|(1:270)))(4:142|(1:144)|(0)|(0)(0))|156|271) */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02ed, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02f3, code lost:
    
        p000.AbstractC0295Gu.m625r(-80771154966581L);
        p000.AbstractC0425Jv.m881a(io.github.cherrywechat.network.model.ApiResponse.class).m445b();
        p000.AbstractC0295Gu.m625r(-80337363269685L);
        r0.getMessage();
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0324 A[Catch: Exception -> 0x029d, TryCatch #2 {Exception -> 0x029d, blocks: (B:117:0x0298, B:123:0x02af, B:129:0x02d7, B:135:0x0309, B:137:0x030d, B:140:0x0315, B:142:0x031b, B:150:0x0333, B:151:0x0347, B:154:0x035f, B:146:0x0324, B:134:0x02f3, B:126:0x02bd, B:130:0x02d9), top: B:247:0x0290, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x035f A[Catch: Exception -> 0x029d, TRY_LEAVE, TryCatch #2 {Exception -> 0x029d, blocks: (B:117:0x0298, B:123:0x02af, B:129:0x02d7, B:135:0x0309, B:137:0x030d, B:140:0x0315, B:142:0x031b, B:150:0x0333, B:151:0x0347, B:154:0x035f, B:146:0x0324, B:134:0x02f3, B:126:0x02bd, B:130:0x02d9), top: B:247:0x0290, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0502 A[Catch: Exception -> 0x03c9, TryCatch #5 {Exception -> 0x03c9, blocks: (B:169:0x03c4, B:185:0x043d, B:187:0x0441, B:190:0x0449, B:192:0x0451, B:196:0x045a, B:220:0x04f0, B:222:0x04f6, B:224:0x04fc, B:227:0x050b, B:226:0x0502, B:184:0x0427, B:180:0x0409), top: B:251:0x039a, outer: #8, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0, types: [Eb] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo448i(Object obj) throws Throwable {
        Exception exc;
        C0185EC c0185ec;
        C1505hk c1505hk;
        InterfaceC0190Eb interfaceC0190Eb;
        C2283nk c2283nk;
        C1373ek c1373ek;
        Object objM1165d;
        Object objM4550a;
        ApiResponse apiResponse;
        String strM625r;
        C2283nk c2283nk2;
        C1084Z9 c1084z9;
        String strM625r2;
        Object objM1169b;
        File file;
        C2283nk c2283nk3;
        C0993X4 c0993x4;
        Object objM1133N;
        String message;
        Object objM1326d;
        Object objM1166e;
        Object objM792d;
        C0701QC c0701qc;
        String strM625r3;
        Editable text;
        Object objM792d2;
        C0701QC c0701qc2;
        String strM625r4;
        Editable text2;
        int i = this.f5008e;
        Object objM4550a2 = null;
        int i2 = 3;
        int i3 = 0;
        C0829TC c0829tc = C0829TC.f2620a;
        Object obj2 = this.f5012i;
        EnumC1453gc enumC1453gc = EnumC1453gc.f5148a;
        Object obj3 = this.f5011h;
        switch (i) {
            case 0:
                C0185EC c0185ec2 = (C0185EC) obj2;
                C0140DA c0140da = (C0140DA) obj3;
                C1505hk c1505hk2 = (C1505hk) this.f5010g;
                InterfaceC0190Eb interfaceC0190Eb2 = null;
                try {
                    try {
                        try {
                        } catch (Exception e) {
                            C1498hd c1498hd = AbstractC1499he.f5282a;
                            C2283nk c2283nk4 = AbstractC1106Zp.f3500a;
                            c0185ec = c0185ec2;
                            c1505hk = c1505hk2;
                            interfaceC0190Eb = null;
                            try {
                                C1373ek c1373ek2 = new C1373ek(c1505hk, e, c0185ec, interfaceC0190Eb, 1);
                                this.f5009f = 3;
                                if (AbstractC0585Nj.m1133N(c2283nk4, c1373ek2, this) != enumC1453gc) {
                                    return c0829tc;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                exc = e;
                                C1498hd c1498hd2 = AbstractC1499he.f5282a;
                                c2283nk = AbstractC1106Zp.f3500a;
                                c1373ek = new C1373ek(c1505hk, exc, c0185ec, interfaceC0190Eb, 0);
                                this.f5009f = 6;
                                if (AbstractC0585Nj.m1133N(c2283nk, c1373ek, this) != enumC1453gc) {
                                }
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        c0185ec = c0185ec2;
                        c1505hk = c1505hk2;
                        interfaceC0190Eb = null;
                        exc = e;
                        C1498hd c1498hd22 = AbstractC1499he.f5282a;
                        c2283nk = AbstractC1106Zp.f3500a;
                        c1373ek = new C1373ek(c1505hk, exc, c0185ec, interfaceC0190Eb, 0);
                        this.f5009f = 6;
                        if (AbstractC0585Nj.m1133N(c2283nk, c1373ek, this) != enumC1453gc) {
                            return c0829tc;
                        }
                        return enumC1453gc;
                    }
                } catch (Exception e4) {
                    exc = e4;
                    c0185ec = c0185ec2;
                    c1505hk = c1505hk2;
                    interfaceC0190Eb = null;
                    C1498hd c1498hd222 = AbstractC1499he.f5282a;
                    c2283nk = AbstractC1106Zp.f3500a;
                    c1373ek = new C1373ek(c1505hk, exc, c0185ec, interfaceC0190Eb, 0);
                    this.f5009f = 6;
                    if (AbstractC0585Nj.m1133N(c2283nk, c1373ek, this) != enumC1453gc) {
                    }
                }
                switch (this.f5009f) {
                    case 0:
                        AbstractC0628Oj.m1232T(obj);
                        C2214m0 c2214m0 = C2214m0.f7706a;
                        Context context = c1505hk2.getContext();
                        AbstractC0295Gu.m625r(-72666551679029L);
                        C0183EA.f539a.getClass();
                        String str = C0183EA.f540b;
                        c2214m0.getClass();
                        C2171l0 c2171l0M4456c = C2214m0.m4456c(context, str);
                        C0594Ns c0594Ns = C0594Ns.f1925a;
                        String str2 = c0140da.f364a;
                        String str3 = c2171l0M4456c.f7562a;
                        String str4 = c2171l0M4456c.f7564c;
                        this.f5009f = 1;
                        c0594Ns.getClass();
                        objM1165d = C0594Ns.m1165d(str2, str3, str4, this);
                        if (objM1165d != enumC1453gc) {
                            String str5 = (String) objM1165d;
                            try {
                                C0029Am c0029Am = AbstractC2809zm.f9524a;
                                c0029Am.getClass();
                                objM4550a = c0029Am.m4550a(ApiResponse.Companion.serializer(DownloadTokenData.Companion.serializer()), str5);
                            } catch (Exception e5) {
                                AbstractC0295Gu.m625r(-72735271155765L);
                                AbstractC0425Jv.m881a(ApiResponse.class).m445b();
                                AbstractC0295Gu.m625r(-73400991086645L);
                                e5.getMessage();
                                objM4550a = null;
                            }
                            apiResponse = (ApiResponse) objM4550a;
                            if (apiResponse == null && apiResponse.getCode() == 0) {
                                DownloadTokenData downloadTokenData = (DownloadTokenData) apiResponse.getData();
                                if (downloadTokenData == null || (strM625r2 = downloadTokenData.getToken()) == null) {
                                    strM625r2 = AbstractC0295Gu.m625r(-73439645792309L);
                                }
                                String str6 = strM625r2;
                                C0594Ns c0594Ns2 = C0594Ns.f1925a;
                                C0183EA.f539a.getClass();
                                String str7 = C0183EA.f541c;
                                long j = c0140da.f368e;
                                C2479s c2479s = new C2479s(i2, c1505hk2);
                                this.f5009f = 4;
                                objM1169b = c0594Ns2.m1169b(str7, str6, j, c2479s, this);
                                if (objM1169b != enumC1453gc) {
                                    byte[] bArr = (byte[]) objM1169b;
                                    C0183EA c0183ea = C0183EA.f539a;
                                    String str8 = c0140da.f364a;
                                    c0183ea.getClass();
                                    file = new File(C0183EA.m377e(str8));
                                    if (!file.exists() && !file.mkdirs()) {
                                        throw new Exception(AbstractC0295Gu.m625r(-73443940759605L));
                                    }
                                    File file2 = new File(C0183EA.m378f(c0140da.f364a));
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    try {
                                        fileOutputStream.write(bArr);
                                        fileOutputStream.close();
                                        String absolutePath = file2.getAbsolutePath();
                                        AbstractC0295Gu.m625r(-73482595465269L);
                                        ThemeProvider.extractThemeFiles(absolutePath);
                                        C1498hd c1498hd3 = AbstractC1499he.f5282a;
                                        c2283nk3 = AbstractC1106Zp.f3500a;
                                        c0993x4 = new C0993X4(c1505hk2, c0185ec2, interfaceC0190Eb2, i2);
                                        this.f5009f = 5;
                                        if (AbstractC0585Nj.m1133N(c2283nk3, c0993x4, this) != enumC1453gc) {
                                            return c0829tc;
                                        }
                                    } finally {
                                    }
                                }
                            } else if (apiResponse != null || (strM625r = apiResponse.getMessage()) == null) {
                                strM625r = AbstractC0295Gu.m625r(-73418170955829L);
                                C1498hd c1498hd4 = AbstractC1499he.f5282a;
                                c2283nk2 = AbstractC1106Zp.f3500a;
                                c1084z9 = new C1084Z9(c1505hk2, strM625r, c0185ec2, null);
                                this.f5009f = 2;
                                if (AbstractC0585Nj.m1133N(c2283nk2, c1084z9, this) != enumC1453gc) {
                                    return c0829tc;
                                }
                            } else {
                                if (strM625r.length() == 0) {
                                    strM625r = apiResponse.getMsg();
                                }
                                if (strM625r == null) {
                                }
                                C1498hd c1498hd42 = AbstractC1499he.f5282a;
                                c2283nk2 = AbstractC1106Zp.f3500a;
                                c1084z9 = new C1084Z9(c1505hk2, strM625r, c0185ec2, null);
                                this.f5009f = 2;
                                if (AbstractC0585Nj.m1133N(c2283nk2, c1084z9, this) != enumC1453gc) {
                                }
                            }
                            break;
                        }
                        return enumC1453gc;
                    case 1:
                        AbstractC0628Oj.m1232T(obj);
                        objM1165d = obj;
                        String str52 = (String) objM1165d;
                        C0029Am c0029Am2 = AbstractC2809zm.f9524a;
                        c0029Am2.getClass();
                        objM4550a = c0029Am2.m4550a(ApiResponse.Companion.serializer(DownloadTokenData.Companion.serializer()), str52);
                        apiResponse = (ApiResponse) objM4550a;
                        if (apiResponse == null) {
                            if (apiResponse != null) {
                                strM625r = AbstractC0295Gu.m625r(-73418170955829L);
                                C1498hd c1498hd422 = AbstractC1499he.f5282a;
                                c2283nk2 = AbstractC1106Zp.f3500a;
                                c1084z9 = new C1084Z9(c1505hk2, strM625r, c0185ec2, null);
                                this.f5009f = 2;
                                if (AbstractC0585Nj.m1133N(c2283nk2, c1084z9, this) != enumC1453gc) {
                                }
                            }
                        }
                        return enumC1453gc;
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
                        byte[] bArr2 = (byte[]) objM1169b;
                        C0183EA c0183ea2 = C0183EA.f539a;
                        String str82 = c0140da.f364a;
                        c0183ea2.getClass();
                        file = new File(C0183EA.m377e(str82));
                        if (!file.exists()) {
                            throw new Exception(AbstractC0295Gu.m625r(-73443940759605L));
                        }
                        File file22 = new File(C0183EA.m378f(c0140da.f364a));
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file22);
                        fileOutputStream2.write(bArr2);
                        fileOutputStream2.close();
                        String absolutePath2 = file22.getAbsolutePath();
                        AbstractC0295Gu.m625r(-73482595465269L);
                        ThemeProvider.extractThemeFiles(absolutePath2);
                        C1498hd c1498hd32 = AbstractC1499he.f5282a;
                        c2283nk3 = AbstractC1106Zp.f3500a;
                        c0993x4 = new C0993X4(c1505hk2, c0185ec2, interfaceC0190Eb2, i2);
                        this.f5009f = 5;
                        if (AbstractC0585Nj.m1133N(c2283nk3, c0993x4, this) != enumC1453gc) {
                        }
                        return enumC1453gc;
                    case 6:
                        AbstractC0628Oj.m1232T(obj);
                        return c0829tc;
                    default:
                        throw new IllegalStateException(AbstractC0295Gu.m625r(-73572789778485L));
                }
            case 1:
                String str9 = (String) obj2;
                String str10 = (String) obj3;
                C2288np c2288np = (C2288np) this.f5010g;
                int i4 = this.f5009f;
                try {
                    if (i4 == 0) {
                        AbstractC0628Oj.m1232T(obj);
                        c2288np.m4623g(AbstractC0295Gu.m625r(-80728205293621L), false);
                        C1498hd c1498hd5 = AbstractC1499he.f5282a;
                        ExecutorC0921Vc executorC0921Vc = ExecutorC0921Vc.f2876b;
                        C2202lp c2202lp = new C2202lp(str10, str9, M625r, i3);
                        this.f5009f = 1;
                        objM1133N = AbstractC0585Nj.m1133N(executorC0921Vc, c2202lp, this);
                        if (objM1133N == enumC1453gc) {
                        }
                        return enumC1453gc;
                    }
                    if (i4 != 1) {
                        if (i4 != 2 && i4 != 3) {
                            throw new IllegalStateException(AbstractC0295Gu.m625r(-81101867448373L));
                        }
                        AbstractC0628Oj.m1232T(obj);
                        return c0829tc;
                    }
                    AbstractC0628Oj.m1232T(obj);
                    objM1133N = obj;
                    String str11 = (String) objM1133N;
                    C0029Am c0029Am3 = AbstractC2809zm.f9524a;
                    c0029Am3.getClass();
                    Object objM4550a3 = c0029Am3.m4550a(ApiResponse.Companion.serializer(C0915VC.f2855b), str11);
                    ApiResponse apiResponse2 = (ApiResponse) objM4550a3;
                    int code = apiResponse2 != null ? apiResponse2.getCode() : -1;
                    if (apiResponse2 == null || (message = apiResponse2.getMessage()) == null) {
                        M625r = AbstractC0295Gu.m625r(-80354543138869L);
                        if (code != 0) {
                            c2288np.m4623g(AbstractC0295Gu.m625r(-80376017975349L), false);
                            C2288np.m4621e(c2288np, str10, str9);
                            this.f5009f = 2;
                            if (C2288np.m4620a(c2288np, str9, this) != enumC1453gc) {
                                return c0829tc;
                            }
                        } else {
                            if (code != 400) {
                                c2288np.m4623g(AbstractC0295Gu.m625r(-80491982092341L).concat(M625r), true);
                                c2288np.m4622f(false);
                                return c0829tc;
                            }
                            c2288np.m4623g(AbstractC0295Gu.m625r(-80431852550197L), false);
                            C2288np.m4621e(c2288np, str10, str9);
                            this.f5009f = 3;
                            if (C2288np.m4620a(c2288np, str9, this) != enumC1453gc) {
                                return c0829tc;
                            }
                        }
                    } else {
                        M625r = message.length() > 0 ? message : 0;
                        if (M625r == 0) {
                        }
                        if (code != 0) {
                        }
                    }
                    return enumC1453gc;
                } catch (Exception e6) {
                    c2288np.m4623g(AbstractC0213Ey.m405c(-80517751896117L, new StringBuilder(), e6), true);
                    c2288np.m4622f(false);
                    return c0829tc;
                }
            case 2:
                Bundle bundle = (Bundle) obj3;
                int i5 = this.f5009f;
                if (i5 == 0) {
                    AbstractC0628Oj.m1232T(obj);
                    C0668Pg c0668Pg = AbstractC2248ms.f7951a;
                    String str12 = (String) this.f5010g;
                    this.f5009f = 1;
                    objM1326d = C0668Pg.m1326d(c0668Pg, str12, this);
                    if (objM1326d == enumC1453gc) {
                        return enumC1453gc;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException(AbstractC0295Gu.m625r(-174422916855861L));
                    }
                    AbstractC0628Oj.m1232T(obj);
                    objM1326d = obj;
                }
                String str13 = (String) objM1326d;
                if (str13 == null) {
                    return c0829tc;
                }
                bundle.putByteArray(AbstractC0295Gu.m625r(-174337017509941L), AbstractC2675wh.m5242e0(new File(str13)));
                AbstractC2248ms.f7951a.getClass();
                C0668Pg.m1332m(bundle, (String) obj2);
                return c0829tc;
            case 3:
                final C0784SA c0784sa = (C0784SA) obj3;
                int i6 = this.f5009f;
                try {
                    if (i6 == 0) {
                        AbstractC0628Oj.m1232T(obj);
                        C0594Ns c0594Ns3 = C0594Ns.f1925a;
                        String str14 = (String) this.f5010g;
                        this.f5009f = 1;
                        c0594Ns3.getClass();
                        objM1166e = C0594Ns.m1166e(AbstractC0295Gu.m625r(-399749786105909L) + str14, this);
                        if (objM1166e == enumC1453gc) {
                            return enumC1453gc;
                        }
                    } else {
                        if (i6 != 1) {
                            throw new IllegalStateException(AbstractC0295Gu.m625r(-492323511203893L));
                        }
                        AbstractC0628Oj.m1232T(obj);
                        objM1166e = obj;
                    }
                    String str15 = (String) objM1166e;
                    try {
                        C0029Am c0029Am4 = AbstractC2809zm.f9524a;
                        c0029Am4.getClass();
                        objM4550a2 = c0029Am4.m4550a(ApiResponse.Companion.serializer(ThemeDetailData.Companion.serializer()), str15);
                        break;
                    } catch (Exception e7) {
                        AbstractC0295Gu.m625r(-491563301992501L);
                        AbstractC0425Jv.m881a(ApiResponse.class).m445b();
                        AbstractC0295Gu.m625r(-491679266109493L);
                        e7.getMessage();
                    }
                    ApiResponse apiResponse3 = (ApiResponse) objM4550a2;
                    if (apiResponse3 != null && apiResponse3.getCode() == 0) {
                        ThemeDetailData themeDetailData = (ThemeDetailData) apiResponse3.getData();
                        String name = themeDetailData.getName();
                        String author = themeDetailData.getAuthor();
                        final double price = themeDetailData.getPrice();
                        TextView textView = c0784sa.f2478e;
                        if (textView != null) {
                            textView.setText(name);
                        }
                        TextView textView2 = c0784sa.f2479f;
                        if (textView2 != null) {
                            textView2.setText(AbstractC0295Gu.m625r(-491696445978677L) + author);
                        }
                        String strM625r5 = price > 0.0d ? AbstractC0295Gu.m625r(-491713625847861L) + price : AbstractC0295Gu.m625r(-491752280553525L);
                        TextView textView3 = c0784sa.f2480g;
                        if (textView3 != null) {
                            textView3.setText(strM625r5);
                        }
                        List<String> screenshots = themeDetailData.getScreenshots();
                        RecyclerView recyclerView = c0784sa.f2476c;
                        if (recyclerView != null) {
                            recyclerView.setAdapter(new C0398JA(c0784sa, screenshots));
                        }
                        TextView textView4 = c0784sa.f2480g;
                        if (textView4 != null) {
                            final Activity activity = (Activity) obj2;
                            textView4.setOnClickListener(new View.OnClickListener() { // from class: PA
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    final C0784SA c0784sa2 = c0784sa;
                                    final String str16 = c0784sa2.f2475b;
                                    final Activity activity2 = activity;
                                    final Dialog dialog = new Dialog(activity2);
                                    dialog.requestWindowFeature(1);
                                    dialog.setCancelable(false);
                                    dialog.setCanceledOnTouchOutside(false);
                                    Window window = dialog.getWindow();
                                    if (window != null) {
                                        window.setBackgroundDrawable(new ColorDrawable(0));
                                    }
                                    LinearLayout linearLayout = new LinearLayout(activity2);
                                    linearLayout.setOrientation(1);
                                    linearLayout.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(300), -2));
                                    linearLayout.setPadding(0, 0, 0, 0);
                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                    gradientDrawable.setColor(activity2.getColor(R.color.cardBackground));
                                    gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(20));
                                    linearLayout.setBackground(gradientDrawable);
                                    LinearLayout linearLayout2 = new LinearLayout(activity2);
                                    linearLayout2.setOrientation(1);
                                    linearLayout2.setGravity(17);
                                    linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                    linearLayout2.setPadding(0, AbstractC0295Gu.m616i(24), 0, 0);
                                    TextView textView5 = new TextView(activity2);
                                    AbstractC0213Ey.m414l(-491395798267957L, textView5, 20.0f);
                                    Typeface typeface = Typeface.DEFAULT_BOLD;
                                    textView5.setTypeface(typeface);
                                    textView5.setGravity(17);
                                    textView5.setTextColor(activity2.getColor(R.color.buttonPrimary));
                                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                                    layoutParams.topMargin = AbstractC0295Gu.m616i(8);
                                    textView5.setLayoutParams(layoutParams);
                                    linearLayout2.addView(textView5);
                                    linearLayout.addView(linearLayout2);
                                    TextView textView6 = new TextView(activity2);
                                    AbstractC0213Ey.m414l(-491417273104437L, textView6, 14.0f);
                                    textView6.setTextColor(activity2.getColor(R.color.textSummary));
                                    textView6.setLineSpacing(AbstractC0295Gu.m616i(3), 1.0f);
                                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                                    layoutParams2.setMargins(AbstractC0295Gu.m616i(28), AbstractC0295Gu.m616i(28), AbstractC0295Gu.m616i(28), 0);
                                    textView6.setLayoutParams(layoutParams2);
                                    linearLayout.addView(textView6);
                                    LinearLayout linearLayout3 = new LinearLayout(activity2);
                                    linearLayout3.setOrientation(0);
                                    linearLayout3.setGravity(17);
                                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                                    layoutParams3.setMargins(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24));
                                    linearLayout3.setLayoutParams(layoutParams3);
                                    TextView textView7 = new TextView(activity2);
                                    textView7.setText(AbstractC0295Gu.m625r(-491116625393717L));
                                    textView7.setTextSize(15.0f);
                                    textView7.setGravity(17);
                                    textView7.setTextColor(activity2.getColor(R.color.textSummary));
                                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                                    gradientDrawable2.setColor(activity2.getColor(R.color.colorBackground));
                                    gradientDrawable2.setCornerRadius(AbstractC0295Gu.m616i(12));
                                    textView7.setBackground(gradientDrawable2);
                                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, AbstractC0295Gu.m616i(50), 1.0f);
                                    layoutParams4.rightMargin = AbstractC0295Gu.m616i(12);
                                    textView7.setLayoutParams(layoutParams4);
                                    textView7.setOnClickListener(new ViewOnClickListenerC0226FA(dialog, 0));
                                    linearLayout3.addView(textView7);
                                    TextView textView8 = new TextView(activity2);
                                    textView8.setText(AbstractC0295Gu.m625r(-491129510295605L) + 5L + AbstractC0295Gu.m625r(-491159575066677L));
                                    textView8.setTextSize(15.0f);
                                    textView8.setTypeface(typeface);
                                    textView8.setGravity(17);
                                    textView8.setTextColor(activity2.getColor(R.color.textSummary));
                                    textView8.setEnabled(false);
                                    GradientDrawable gradientDrawable3 = new GradientDrawable();
                                    gradientDrawable3.setColor(activity2.getColor(R.color.colorBackground));
                                    gradientDrawable3.setCornerRadius(AbstractC0295Gu.m616i(12));
                                    textView8.setBackground(gradientDrawable3);
                                    textView8.setLayoutParams(new LinearLayout.LayoutParams(0, AbstractC0295Gu.m616i(50), 1.0f));
                                    textView8.setTag(Boolean.FALSE);
                                    final double d = price;
                                    textView8.setOnClickListener(new View.OnClickListener() { // from class: GA
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            if (view2.isEnabled()) {
                                                dialog.dismiss();
                                                C0784SA c0784sa3 = c0784sa2;
                                                final TextView textView9 = c0784sa3.f2480g;
                                                if (textView9 == null) {
                                                    return;
                                                }
                                                textView9.animate().scaleX(0.95f).scaleY(0.95f).setDuration(100L).withEndAction(new RunnableC1311d8(textView9, 1)).start();
                                                textView9.setEnabled(false);
                                                textView9.setText(AbstractC0295Gu.m625r(-491172459968565L));
                                                final Drawable background = textView9.getBackground();
                                                GradientDrawable gradientDrawable4 = new GradientDrawable();
                                                Activity activity3 = activity2;
                                                gradientDrawable4.setColor(activity3.getColor(R.color.buttonSecondary));
                                                gradientDrawable4.setCornerRadius(AbstractC0295Gu.m616i(16));
                                                textView9.setBackground(gradientDrawable4);
                                                AlertDialog.Builder items = new AlertDialog.Builder(activity3).setTitle(AbstractC0295Gu.m625r(-489566142199861L)).setItems(new String[]{AbstractC0295Gu.m625r(-489596206970933L), AbstractC0295Gu.m625r(-489621976774709L)}, new DialogInterfaceOnClickListenerC0534Mb(c0784sa3, activity3, str16, 3));
                                                final double d2 = d;
                                                AlertDialog alertDialogCreate = items.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: HA
                                                    @Override // android.content.DialogInterface.OnDismissListener
                                                    public final void onDismiss(DialogInterface dialogInterface) {
                                                        String strM625r6;
                                                        TextView textView10 = textView9;
                                                        textView10.setEnabled(true);
                                                        double d3 = d2;
                                                        if (d3 > 0.0d) {
                                                            strM625r6 = AbstractC0295Gu.m625r(-489862494943285L) + d3;
                                                        } else {
                                                            strM625r6 = AbstractC0295Gu.m625r(-489896854681653L);
                                                        }
                                                        textView10.setText(strM625r6);
                                                        textView10.setBackground(background);
                                                    }
                                                }).create();
                                                alertDialogCreate.show();
                                                C1456gf.m2802T(alertDialogCreate, false);
                                            }
                                        }
                                    });
                                    new CountDownTimerC0741RA(textView8, activity2).start();
                                    linearLayout3.addView(textView8);
                                    linearLayout.addView(linearLayout3);
                                    dialog.setContentView(linearLayout);
                                    Window window2 = dialog.getWindow();
                                    if (window2 != null) {
                                        window2.setLayout(AbstractC0295Gu.m616i(340), -2);
                                        window2.setBackgroundDrawable(new ColorDrawable(0));
                                        WindowManager.LayoutParams attributes = window2.getAttributes();
                                        attributes.gravity = 17;
                                        window2.setAttributes(attributes);
                                    }
                                    dialog.show();
                                    linearLayout.setAlpha(0.0f);
                                    linearLayout.setScaleY(0.9f);
                                    linearLayout.animate().alpha(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(new DecelerateInterpolator()).start();
                                }
                            });
                        }
                        C0784SA.m1603a(c0784sa);
                        return c0829tc;
                    }
                    C0784SA.m1604e(c0784sa);
                    return c0829tc;
                } catch (Exception unused) {
                    C0784SA.m1604e(c0784sa);
                    return c0829tc;
                }
            case 4:
                C0701QC c0701qc3 = (C0701QC) obj3;
                int i7 = this.f5009f;
                try {
                    if (i7 == 0) {
                        AbstractC0628Oj.m1232T(obj);
                        C0357IC c0357ic = C0357IC.f1218a;
                        this.f5010g = c0701qc3;
                        this.f5009f = 1;
                        c0357ic.getClass();
                        objM792d = C0357IC.m792d(false, this);
                        if (objM792d == enumC1453gc) {
                            return enumC1453gc;
                        }
                        c0701qc = c0701qc3;
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException(AbstractC0295Gu.m625r(-486439406008373L));
                        }
                        C0701QC c0701qc4 = (C0701QC) this.f5010g;
                        AbstractC0628Oj.m1232T(obj);
                        c0701qc = c0701qc4;
                        objM792d = obj;
                    }
                    c0701qc.f2266m = (List) objM792d;
                    EditText editText = c0701qc3.f2258e;
                    if (editText == null || (text = editText.getText()) == null || (strM625r3 = text.toString()) == null) {
                        strM625r3 = AbstractC0295Gu.m625r(-486396456335413L);
                    }
                    c0701qc3.m1431e(strM625r3);
                    C0701QC.m1430a(c0701qc3);
                    return c0829tc;
                } catch (Exception e8) {
                    Toast.makeText((Activity) obj2, AbstractC0213Ey.m405c(-486400751302709L, new StringBuilder(), e8), 0).show();
                    return c0829tc;
                }
            default:
                C0701QC c0701qc5 = (C0701QC) obj3;
                int i8 = this.f5009f;
                if (i8 == 0) {
                    AbstractC0628Oj.m1232T(obj);
                    C0357IC c0357ic2 = C0357IC.f1218a;
                    this.f5010g = c0701qc5;
                    this.f5009f = 1;
                    c0357ic2.getClass();
                    objM792d2 = C0357IC.m792d(true, this);
                    if (objM792d2 == enumC1453gc) {
                        return enumC1453gc;
                    }
                    c0701qc2 = c0701qc5;
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException(AbstractC0295Gu.m625r(-486765823522869L));
                    }
                    C0701QC c0701qc6 = (C0701QC) this.f5010g;
                    AbstractC0628Oj.m1232T(obj);
                    c0701qc2 = c0701qc6;
                    objM792d2 = obj;
                }
                c0701qc2.f2266m = (List) objM792d2;
                EditText editText2 = c0701qc5.f2258e;
                if (editText2 == null || (text2 = editText2.getText()) == null || (strM625r4 = text2.toString()) == null) {
                    strM625r4 = AbstractC0295Gu.m625r(-486722873849909L);
                }
                c0701qc5.m1431e(strM625r4);
                C0701QC.m1430a(c0701qc5);
                C0987Wz c0987Wz = c0701qc5.f2255b;
                if (c0987Wz != null) {
                    c0987Wz.setRefreshing(false);
                }
                Toast.makeText(c0701qc5.m1432f(), AbstractC0295Gu.m625r(-486727168817205L) + ((String) obj2), 0).show();
                return c0829tc;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1417fk(Object obj, Object obj2, Object obj3, InterfaceC0190Eb interfaceC0190Eb, int i) {
        super(interfaceC0190Eb);
        this.f5008e = i;
        this.f5010g = obj;
        this.f5011h = obj2;
        this.f5012i = obj3;
    }
}
