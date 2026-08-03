package p000;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import io.github.cherrywechat.network.model.ApiResponse;
import io.github.cherrywechat.network.model.DownloadTokenData;
import io.github.cherrywechat.theme.ThemeProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.functions.Function2;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: aa */
/* JADX INFO: loaded from: classes.dex */
public final class C1135aa extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public byte[] f3585e;

    /* JADX INFO: renamed from: f */
    public File f3586f;

    /* JADX INFO: renamed from: g */
    public int f3587g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2414qe f3588h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0140DA f3589i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ View f3590j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0054BA f3591k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C1258ca f3592l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1135aa(C1258ca c1258ca, InterfaceC0190Eb interfaceC0190Eb, C2414qe c2414qe, C0054BA c0054ba, C0140DA c0140da, View view) {
        super(interfaceC0190Eb);
        this.f3588h = c2414qe;
        this.f3589i = c0140da;
        this.f3590j = view;
        this.f3591k = c0054ba;
        this.f3592l = c1258ca;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) {
        return ((C1135aa) mo447h((InterfaceC0190Eb) obj2, (InterfaceC1409fc) obj)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        return new C1135aa(this.f3592l, interfaceC0190Eb, this.f3588h, this.f3591k, this.f3589i, this.f3590j);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:33|(4:166|34|39|172)|(3:170|41|(7:44|(2:46|47)(1:48)|(2:50|(0)(7:158|53|175|54|55|56|(9:177|59|183|60|61|(3:182|63|(1:65)(2:66|67))|70|71|(1:73)(9:74|75|76|160|77|78|79|80|(1:82)(8:83|84|(1:86)|87|88|89|90|(0)(1:154))))))|52|112|(1:114)|154))|43|(11:120|(1:122)|(0)|125|162|129|130|131|155|132|(0)(0))|126|173|127|125|162|129|130|131|155|132|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x024f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0252, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0253, code lost:
    
        r2 = r13;
        r3 = r12;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0257, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0258, code lost:
    
        r2 = r13;
        r3 = r12;
        r10 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0223 A[Catch: Exception -> 0x0213, TRY_LEAVE, TryCatch #9 {Exception -> 0x0213, blocks: (B:112:0x01fc, B:118:0x0217, B:120:0x021d, B:122:0x0223), top: B:172:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x029a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x029b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015f A[Catch: Exception -> 0x01e0, PHI: r0 r10
  0x015f: PHI (r0v55 byte[]) = (r0v51 byte[]), (r0v63 byte[]) binds: [B:72:0x015b, B:17:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x015f: PHI (r10v24 aa) = (r10v37 aa), (r10v25 aa) binds: [B:72:0x015b, B:17:0x0041] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #12 {Exception -> 0x01e0, blocks: (B:84:0x0192, B:88:0x01bc, B:74:0x015f, B:76:0x016a, B:78:0x0175, B:80:0x017c, B:59:0x0119, B:61:0x0126, B:71:0x014d), top: B:177:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a4 A[Catch: Exception -> 0x0145, TRY_ENTER, TRY_LEAVE, TryCatch #17 {Exception -> 0x0145, blocks: (B:86:0x01a4, B:63:0x012f, B:66:0x0136, B:67:0x0144), top: B:182:0x012f }] */
    /* JADX WARN: Type inference failed for: r0v48, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v5, types: [Eb, aa] */
    /* JADX WARN: Type inference failed for: r10v7, types: [Eb, aa] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [qe] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v5, types: [qe] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [Eb, byte[]] */
    /* JADX WARN: Type inference failed for: r5v3, types: [Eb, byte[], java.io.File] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo448i(Object obj) throws Throwable {
        Exception exc;
        ?? r10;
        View view;
        Object obj2;
        Exception exc2;
        C1135aa c1135aa;
        ?? r5;
        ?? r102;
        ?? r2;
        Exception e;
        C2283nk c2283nk;
        C1041Y9 c1041y9;
        ?? r22;
        ?? r103;
        ?? r52;
        ?? r23;
        C2283nk c2283nk2;
        C1041Y9 c1041y92;
        C1135aa c1135aa2;
        Object objM1165d;
        C1135aa c1135aa3;
        C2414qe c2414qe;
        Object objM4550a;
        Object obj3;
        ApiResponse apiResponse;
        Object obj4;
        C1135aa c1135aa4;
        C0594Ns c0594Ns;
        Object objM1169b;
        String strM625r;
        C2283nk c2283nk3;
        C1084Z9 c1084z9;
        InterfaceC0717Qm interfaceC0717QmSerializer;
        byte[] bArr;
        File file;
        ?? r3;
        Object objM1133N;
        File file2;
        C2283nk c2283nk4;
        C0955W9 c0955w9;
        File file3;
        String absolutePath;
        C2283nk c2283nk5;
        C0998X9 c0998x9;
        C0140DA c0140da = this.f3589i;
        String str = c0140da.f364a;
        int i = this.f3587g;
        ?? r104 = 1;
        C0829TC c0829tc = C0829TC.f2620a;
        View view2 = this.f3590j;
        C2414qe c2414qe2 = this.f3588h;
        EnumC1453gc enumC1453gc = EnumC1453gc.f5148a;
        try {
            try {
            } catch (Exception e2) {
                exc2 = e2;
                c1135aa = this;
            }
        } catch (Exception e3) {
            exc = e3;
            r10 = this;
            view = view2;
            obj2 = c2414qe2;
        }
        switch (i) {
            case 0:
                AbstractC0628Oj.m1232T(obj);
                try {
                    C2214m0 c2214m0 = C2214m0.f7706a;
                    Context context = c2414qe2.getContext();
                    AbstractC0295Gu.m625r(-104234561304629L);
                    C0183EA.f539a.getClass();
                    String str2 = C0183EA.f540b;
                    c2214m0.getClass();
                    C2171l0 c2171l0M4456c = C2214m0.m4456c(context, str2);
                    C0594Ns c0594Ns2 = C0594Ns.f1925a;
                    String str3 = c2171l0M4456c.f7562a;
                    String str4 = c2171l0M4456c.f7564c;
                    this.f3587g = 1;
                    c0594Ns2.getClass();
                    objM1165d = C0594Ns.m1165d(str, str3, str4, this);
                } catch (Exception e4) {
                    e = e4;
                    r102 = this;
                    view = view2;
                    r2 = c2414qe2;
                    r5 = 0;
                    exc2 = e;
                    r23 = r2;
                    r52 = r5;
                    r103 = r102;
                    exc2.printStackTrace();
                    C1498hd c1498hd = AbstractC1499he.f5282a;
                    c2283nk2 = AbstractC1106Zp.f3500a;
                    c1041y92 = new C1041Y9(r23, view, exc2, r52, 0);
                    r103.f3585e = r52;
                    r103.f3586f = r52;
                    r103.f3587g = 9;
                    if (AbstractC0585Nj.m1133N(c2283nk2, c1041y92, r103) == enumC1453gc) {
                    }
                }
                if (objM1165d != enumC1453gc) {
                    String str5 = (String) objM1165d;
                    try {
                        try {
                            C0029Am c0029Am = AbstractC2809zm.f9524a;
                            c0029Am.getClass();
                            ApiResponse.Companion companion = ApiResponse.Companion;
                            interfaceC0717QmSerializer = DownloadTokenData.Companion.serializer();
                            objM4550a = c0029Am.m4550a(companion.serializer(interfaceC0717QmSerializer), str5);
                        } catch (Exception e5) {
                            AbstractC0295Gu.m625r(-104303280781365L);
                            AbstractC0425Jv.m881a(ApiResponse.class).m445b();
                            AbstractC0295Gu.m625r(-104419244898357L);
                            e5.getMessage();
                            objM4550a = null;
                        }
                        apiResponse = (ApiResponse) objM4550a;
                        try {
                        } catch (Exception e6) {
                            e = e6;
                            obj4 = interfaceC0717QmSerializer;
                        }
                        break;
                    } catch (Exception e7) {
                        e = e7;
                        c1135aa3 = this;
                        view = view2;
                        c2414qe = c2414qe2;
                        obj3 = null;
                        exc = e;
                        r2 = c2414qe;
                        r5 = obj3;
                        r102 = c1135aa3;
                        try {
                            C1498hd c1498hd2 = AbstractC1499he.f5282a;
                            c2283nk = AbstractC1106Zp.f3500a;
                            c1041y9 = new C1041Y9(r2, view, exc, r5, 1);
                            r102.f3585e = r5;
                            r102.f3587g = 4;
                            if (AbstractC0585Nj.m1133N(c2283nk, c1041y9, r102) == enumC1453gc) {
                            }
                        } catch (Exception e8) {
                            e = e8;
                            exc2 = e;
                            r23 = r2;
                            r52 = r5;
                            r103 = r102;
                            exc2.printStackTrace();
                            C1498hd c1498hd3 = AbstractC1499he.f5282a;
                            c2283nk2 = AbstractC1106Zp.f3500a;
                            c1041y92 = new C1041Y9(r23, view, exc2, r52, 0);
                            r103.f3585e = r52;
                            r103.f3586f = r52;
                            r103.f3587g = 9;
                            if (AbstractC0585Nj.m1133N(c2283nk2, c1041y92, r103) == enumC1453gc) {
                            }
                        }
                    }
                    if (apiResponse != null) {
                        try {
                        } catch (Exception e9) {
                            e = e9;
                            r104 = this;
                            obj4 = c2414qe2;
                            exc = e;
                            obj2 = obj4;
                            view = view2;
                            r10 = r104;
                            r5 = 0;
                            r2 = obj2;
                            r102 = r10;
                            C1498hd c1498hd22 = AbstractC1499he.f5282a;
                            c2283nk = AbstractC1106Zp.f3500a;
                            c1041y9 = new C1041Y9(r2, view, exc, r5, 1);
                            r102.f3585e = r5;
                            r102.f3587g = 4;
                            if (AbstractC0585Nj.m1133N(c2283nk, c1041y9, r102) == enumC1453gc) {
                            }
                        }
                        if (apiResponse.getCode() == 0) {
                            DownloadTokenData downloadTokenData = (DownloadTokenData) apiResponse.getData();
                            String token = downloadTokenData != null ? downloadTokenData.getToken() : null;
                            if (token != null) {
                                if (token.length() != 0) {
                                    try {
                                        c0594Ns = C0594Ns.f1925a;
                                    } catch (Exception e10) {
                                        e = e10;
                                        c1135aa4 = this;
                                    }
                                    try {
                                        C0183EA.f539a.getClass();
                                        String str6 = C0183EA.f541c;
                                        long j = c0140da.f368e;
                                        C0912V9 c0912v9 = new C0912V9(c2414qe2, 0);
                                        this.f3587g = 5;
                                        objM1169b = c0594Ns.m1169b(str6, token, j, c0912v9, this);
                                        c1135aa4 = this;
                                    } catch (Exception e11) {
                                        e = e11;
                                        c1135aa4 = this;
                                        r3 = c2414qe2;
                                        exc2 = e;
                                        r22 = r3;
                                        view = view2;
                                        c1135aa2 = c1135aa4;
                                        r52 = 0;
                                        r23 = r22;
                                        r103 = c1135aa2;
                                        exc2.printStackTrace();
                                        C1498hd c1498hd32 = AbstractC1499he.f5282a;
                                        c2283nk2 = AbstractC1106Zp.f3500a;
                                        c1041y92 = new C1041Y9(r23, view, exc2, r52, 0);
                                        r103.f3585e = r52;
                                        r103.f3586f = r52;
                                        r103.f3587g = 9;
                                        if (AbstractC0585Nj.m1133N(c2283nk2, c1041y92, r103) == enumC1453gc) {
                                        }
                                    }
                                    if (objM1169b != enumC1453gc) {
                                        try {
                                            bArr = (byte[]) objM1169b;
                                        } catch (Exception e12) {
                                            e = e12;
                                            r3 = c2414qe2;
                                            exc2 = e;
                                            r22 = r3;
                                            view = view2;
                                            c1135aa2 = c1135aa4;
                                            r52 = 0;
                                            r23 = r22;
                                            r103 = c1135aa2;
                                            exc2.printStackTrace();
                                            C1498hd c1498hd322 = AbstractC1499he.f5282a;
                                            c2283nk2 = AbstractC1106Zp.f3500a;
                                            c1041y92 = new C1041Y9(r23, view, exc2, r52, 0);
                                            r103.f3585e = r52;
                                            r103.f3586f = r52;
                                            r103.f3587g = 9;
                                            if (AbstractC0585Nj.m1133N(c2283nk2, c1041y92, r103) == enumC1453gc) {
                                            }
                                        }
                                        try {
                                            C0183EA.f539a.getClass();
                                            file = new File(C0183EA.m377e(str));
                                            if (!file.exists()) {
                                                try {
                                                    if (!file.mkdirs()) {
                                                        throw new IOException(AbstractC0295Gu.m625r(-103908143790133L));
                                                    }
                                                } catch (Exception e13) {
                                                    exc2 = e13;
                                                    c1135aa = c1135aa4;
                                                    view = view2;
                                                    r22 = c2414qe2;
                                                    c1135aa2 = c1135aa;
                                                    r52 = 0;
                                                    r23 = r22;
                                                    r103 = c1135aa2;
                                                    exc2.printStackTrace();
                                                    C1498hd c1498hd3222 = AbstractC1499he.f5282a;
                                                    c2283nk2 = AbstractC1106Zp.f3500a;
                                                    c1041y92 = new C1041Y9(r23, view, exc2, r52, 0);
                                                    r103.f3585e = r52;
                                                    r103.f3586f = r52;
                                                    r103.f3587g = 9;
                                                    if (AbstractC0585Nj.m1133N(c2283nk2, c1041y92, r103) == enumC1453gc) {
                                                    }
                                                }
                                            }
                                            C1498hd c1498hd4 = AbstractC1499he.f5282a;
                                            C2283nk c2283nk6 = AbstractC1106Zp.f3500a;
                                            C0955W9 c0955w92 = new C0955W9(c2414qe2, null, 0);
                                            c1135aa4.f3585e = bArr;
                                            r3 = 6;
                                            r3 = 6;
                                            c1135aa4.f3587g = 6;
                                            objM1133N = AbstractC0585Nj.m1133N(c2283nk6, c0955w92, c1135aa4);
                                            c1135aa4 = c1135aa4;
                                        } catch (Exception e14) {
                                            e = e14;
                                            r3 = c2414qe2;
                                            exc2 = e;
                                            r22 = r3;
                                            view = view2;
                                            c1135aa2 = c1135aa4;
                                            r52 = 0;
                                            r23 = r22;
                                            r103 = c1135aa2;
                                            exc2.printStackTrace();
                                            C1498hd c1498hd32222 = AbstractC1499he.f5282a;
                                            c2283nk2 = AbstractC1106Zp.f3500a;
                                            c1041y92 = new C1041Y9(r23, view, exc2, r52, 0);
                                            r103.f3585e = r52;
                                            r103.f3586f = r52;
                                            r103.f3587g = 9;
                                            if (AbstractC0585Nj.m1133N(c2283nk2, c1041y92, r103) == enumC1453gc) {
                                            }
                                        }
                                        if (objM1133N == enumC1453gc) {
                                            C0183EA.f539a.getClass();
                                            file2 = new File(C0183EA.m378f(str));
                                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                            try {
                                                try {
                                                    fileOutputStream.write(bArr);
                                                    fileOutputStream.close();
                                                    C1498hd c1498hd5 = AbstractC1499he.f5282a;
                                                    c2283nk4 = AbstractC1106Zp.f3500a;
                                                    c0955w9 = new C0955W9(c2414qe2, null, 1);
                                                    c1135aa4.f3585e = null;
                                                    c1135aa4.f3586f = file2;
                                                    c1135aa4.f3587g = 7;
                                                } finally {
                                                }
                                            } catch (Exception e15) {
                                                e = e15;
                                                exc2 = e;
                                                r22 = r3;
                                                view = view2;
                                                c1135aa2 = c1135aa4;
                                                r52 = 0;
                                                r23 = r22;
                                                r103 = c1135aa2;
                                                exc2.printStackTrace();
                                                C1498hd c1498hd322222 = AbstractC1499he.f5282a;
                                                c2283nk2 = AbstractC1106Zp.f3500a;
                                                c1041y92 = new C1041Y9(r23, view, exc2, r52, 0);
                                                r103.f3585e = r52;
                                                r103.f3586f = r52;
                                                r103.f3587g = 9;
                                                if (AbstractC0585Nj.m1133N(c2283nk2, c1041y92, r103) == enumC1453gc) {
                                                }
                                            }
                                            if (AbstractC0585Nj.m1133N(c2283nk4, c0955w9, c1135aa4) == enumC1453gc) {
                                                file3 = file2;
                                                c1135aa4 = c1135aa4;
                                                absolutePath = file3.getAbsolutePath();
                                                AbstractC0295Gu.m625r(-103946798495797L);
                                                if (!ThemeProvider.extractThemeFiles(absolutePath)) {
                                                    Toast.makeText(view2.getContext(), AbstractC0295Gu.m625r(-104036992809013L), 0).show();
                                                }
                                                C1498hd c1498hd6 = AbstractC1499he.f5282a;
                                                c2283nk5 = AbstractC1106Zp.f3500a;
                                                c0998x9 = new C0998X9(c1135aa4.f3592l, null, c2414qe2, c1135aa4.f3591k, c0140da, c1135aa4.f3590j);
                                                c1135aa4.f3585e = null;
                                                c1135aa4.f3586f = null;
                                                c1135aa4.f3587g = 8;
                                                if (AbstractC0585Nj.m1133N(c2283nk5, c0998x9, c1135aa4) == enumC1453gc) {
                                                    return c0829tc;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            C1498hd c1498hd7 = AbstractC1499he.f5282a;
                            C2283nk c2283nk7 = AbstractC1106Zp.f3500a;
                            C0993X4 c0993x4 = new C0993X4(c2414qe2, view2, null, 1);
                            this.f3585e = null;
                            this.f3587g = 3;
                            if (AbstractC0585Nj.m1133N(c2283nk7, c0993x4, this) == enumC1453gc) {
                            }
                            return c0829tc;
                        }
                    }
                    c1135aa3 = this;
                    if (apiResponse != null && (strM625r = apiResponse.getMessage()) != null) {
                        if (strM625r.length() == 0) {
                            strM625r = apiResponse.getMsg();
                        }
                        if (strM625r == null) {
                        }
                        String str7 = strM625r;
                        C1498hd c1498hd8 = AbstractC1499he.f5282a;
                        c2283nk3 = AbstractC1106Zp.f3500a;
                        c2414qe = c2414qe2;
                        view = view2;
                        obj3 = null;
                        c1084z9 = new C1084Z9(c2414qe, view, str7, null, 0);
                        c1135aa3.f3585e = null;
                        c1135aa3.f3587g = 2;
                        if (AbstractC0585Nj.m1133N(c2283nk3, c1084z9, c1135aa3) != enumC1453gc) {
                        }
                    }
                    strM625r = AbstractC0295Gu.m625r(-104436424767541L);
                    String str72 = strM625r;
                    C1498hd c1498hd82 = AbstractC1499he.f5282a;
                    c2283nk3 = AbstractC1106Zp.f3500a;
                    c2414qe = c2414qe2;
                    view = view2;
                    obj3 = null;
                    c1084z9 = new C1084Z9(c2414qe, view, str72, null, 0);
                    c1135aa3.f3585e = null;
                    c1135aa3.f3587g = 2;
                    if (AbstractC0585Nj.m1133N(c2283nk3, c1084z9, c1135aa3) != enumC1453gc) {
                    }
                }
                return enumC1453gc;
            case 1:
                AbstractC0628Oj.m1232T(obj);
                objM1165d = obj;
                String str52 = (String) objM1165d;
                C0029Am c0029Am2 = AbstractC2809zm.f9524a;
                c0029Am2.getClass();
                ApiResponse.Companion companion2 = ApiResponse.Companion;
                interfaceC0717QmSerializer = DownloadTokenData.Companion.serializer();
                objM4550a = c0029Am2.m4550a(companion2.serializer(interfaceC0717QmSerializer), str52);
                apiResponse = (ApiResponse) objM4550a;
                if (apiResponse != null) {
                }
                c1135aa3 = this;
                if (apiResponse != null) {
                    if (strM625r.length() == 0) {
                    }
                    if (strM625r == null) {
                    }
                    String str722 = strM625r;
                    C1498hd c1498hd822 = AbstractC1499he.f5282a;
                    c2283nk3 = AbstractC1106Zp.f3500a;
                    c2414qe = c2414qe2;
                    view = view2;
                    obj3 = null;
                    c1084z9 = new C1084Z9(c2414qe, view, str722, null, 0);
                    c1135aa3.f3585e = null;
                    c1135aa3.f3587g = 2;
                    if (AbstractC0585Nj.m1133N(c2283nk3, c1084z9, c1135aa3) != enumC1453gc) {
                        return enumC1453gc;
                    }
                }
                strM625r = AbstractC0295Gu.m625r(-104436424767541L);
                String str7222 = strM625r;
                C1498hd c1498hd8222 = AbstractC1499he.f5282a;
                c2283nk3 = AbstractC1106Zp.f3500a;
                c2414qe = c2414qe2;
                view = view2;
                obj3 = null;
                c1084z9 = new C1084Z9(c2414qe, view, str7222, null, 0);
                c1135aa3.f3585e = null;
                c1135aa3.f3587g = 2;
                if (AbstractC0585Nj.m1133N(c2283nk3, c1084z9, c1135aa3) != enumC1453gc) {
                }
                break;
            case 2:
            case 3:
                AbstractC0628Oj.m1232T(obj);
                return c0829tc;
            case 4:
                AbstractC0628Oj.m1232T(obj);
                return c0829tc;
            case 5:
                AbstractC0628Oj.m1232T(obj);
                objM1169b = obj;
                c1135aa4 = this;
                bArr = (byte[]) objM1169b;
                C0183EA.f539a.getClass();
                file = new File(C0183EA.m377e(str));
                if (!file.exists()) {
                }
                C1498hd c1498hd42 = AbstractC1499he.f5282a;
                C2283nk c2283nk62 = AbstractC1106Zp.f3500a;
                C0955W9 c0955w922 = new C0955W9(c2414qe2, null, 0);
                c1135aa4.f3585e = bArr;
                r3 = 6;
                r3 = 6;
                c1135aa4.f3587g = 6;
                objM1133N = AbstractC0585Nj.m1133N(c2283nk62, c0955w922, c1135aa4);
                c1135aa4 = c1135aa4;
                if (objM1133N == enumC1453gc) {
                }
                return enumC1453gc;
            case 6:
                bArr = this.f3585e;
                AbstractC0628Oj.m1232T(obj);
                c1135aa4 = this;
                C0183EA.f539a.getClass();
                file2 = new File(C0183EA.m378f(str));
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                C1498hd c1498hd52 = AbstractC1499he.f5282a;
                c2283nk4 = AbstractC1106Zp.f3500a;
                c0955w9 = new C0955W9(c2414qe2, null, 1);
                c1135aa4.f3585e = null;
                c1135aa4.f3586f = file2;
                c1135aa4.f3587g = 7;
                if (AbstractC0585Nj.m1133N(c2283nk4, c0955w9, c1135aa4) == enumC1453gc) {
                }
                break;
            case 7:
                file3 = this.f3586f;
                AbstractC0628Oj.m1232T(obj);
                c1135aa4 = this;
                absolutePath = file3.getAbsolutePath();
                AbstractC0295Gu.m625r(-103946798495797L);
                if (!ThemeProvider.extractThemeFiles(absolutePath)) {
                }
                C1498hd c1498hd62 = AbstractC1499he.f5282a;
                c2283nk5 = AbstractC1106Zp.f3500a;
                c0998x9 = new C0998X9(c1135aa4.f3592l, null, c2414qe2, c1135aa4.f3591k, c0140da, c1135aa4.f3590j);
                c1135aa4.f3585e = null;
                c1135aa4.f3586f = null;
                c1135aa4.f3587g = 8;
                if (AbstractC0585Nj.m1133N(c2283nk5, c0998x9, c1135aa4) == enumC1453gc) {
                }
                break;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                AbstractC0628Oj.m1232T(obj);
                return c0829tc;
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                AbstractC0628Oj.m1232T(obj);
                return c0829tc;
            default:
                throw new IllegalStateException(AbstractC0295Gu.m625r(-104058467645493L));
        }
    }
}
