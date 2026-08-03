package p000;

import io.github.cherrywechat.network.model.ApiResponse;
import io.github.cherrywechat.network.model.CheckInResponseData;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0991X2 extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f3160e;

    /* JADX INFO: renamed from: f */
    public int f3161f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f3162g;

    public C0991X2(int r2, InterfaceC0190Eb r3, String r4) {
        this.f3160e = 0;
        this.f3162g = r4;
        this.f3161f = r2;
        super(r3);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r2, Object r3) {
        InterfaceC1409fc r22 = (InterfaceC1409fc) r2;
        InterfaceC0190Eb r32 = (InterfaceC0190Eb) r3;
        switch(this.f3160e) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((C0991X2) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    L7:
        return ((C0991X2) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r3, Object r4) {
        switch(this.f3160e) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        String r0 = this.f3162g;
        return new C0991X2(this.f3161f, r3, r0);
    L5:
        return new C0991X2(this.f3162g, r3);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r12) {
        switch(this.f3160e) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        int r0 = this.f3161f;
        if (r0 == 0) goto L10;
        if (r0 != 1) goto L9;
        AbstractC0628Oj.m1232T(r12);
        return r12;
    L9:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-81308025878581L));
    L10:
        AbstractC0628Oj.m1232T(r12);
        C0594Ns r122 = C0594Ns.f1925a;
        String r02 = C1456gf.m2791I();
        this.f3161f = 1;
        r122.getClass();
        Object r123 = C0594Ns.m1163a(r02, this.f3162g, this);
        EnumC1453gc r03 = EnumC1453gc.f5148a;
        if (r123 == r03) goto L13;
        return r123;
    L13:
        return r03;
    L14:
        int r04 = this.f3161f;
        String r1 = this.f3162g;
        AbstractC0628Oj.m1232T(r12);
        boolean r124 = false;
        long r2 = System.currentTimeMillis() / ((long) 1000);     // Catch: Exception -> L47
        C0208Et r5 = new C0208Et(AbstractC0295Gu.m625r(-406110632671285L), r1);     // Catch: Exception -> L47
        C0208Et r7 = new C0208Et(AbstractC0295Gu.m625r(-406136402475061L), new Integer(r04));     // Catch: Exception -> L47
        C0208Et r8 = new C0208Et(AbstractC0295Gu.m625r(-406183647115317L), new Long(r2));     // Catch: Exception -> L47
        String r4 = AbstractC0295Gu.m625r(-406226596788277L);     // Catch: Exception -> L47
        String r6 = AbstractC1077Z2.f3441b;     // Catch: Exception -> L47
        String r42 = C1456gf.m2804n(AbstractC1077Z2.f3440a, AbstractC2598uq.m5110L(new C0208Et[]{r5, r7, r8, new C0208Et(r4, r6)}), r2, AbstractC0295Gu.m625r(-405728380581941L));     // Catch: Exception -> L47
        JSONObject r52 = new JSONObject();     // Catch: Exception -> L47
        r52.put(AbstractC0295Gu.m625r(-405788510124085L), r1);     // Catch: Exception -> L47
        r52.put(AbstractC0295Gu.m625r(-405814279927861L), r04);     // Catch: Exception -> L47
        r52.put(AbstractC0295Gu.m625r(-405861524568117L), r2);     // Catch: Exception -> L47
        r52.put(AbstractC0295Gu.m625r(-405904474241077L), r6);     // Catch: Exception -> L47
        r52.put(AbstractC0295Gu.m625r(-405956013848629L), r42);     // Catch: Exception -> L47
        String r05 = r52.toString();     // Catch: Exception -> L47
        AbstractC0295Gu.m625r(-405977488685109L);     // Catch: Exception -> L47
        URLConnection r13 = new URL(AbstractC0295Gu.m625r(-406587374041141L)).openConnection();     // Catch: Exception -> L47
        boolean r43 = true;
        r13.setDoOutput(true);     // Catch: Exception -> L47
        r13.setRequestProperty(AbstractC0295Gu.m625r(-406780647569461L), AbstractC0295Gu.m625r(-406286726330421L));     // Catch: Exception -> L47
        r13.setRequestProperty(AbstractC0295Gu.m625r(-406359740774453L), AbstractC0295Gu.m625r(-406402690447413L));     // Catch: Exception -> L47
        r13.setRequestProperty(AbstractC0295Gu.m625r(-406497179727925L), r6);     // Catch: Exception -> L47
        r13.setRequestProperty(AbstractC0295Gu.m625r(-404908041828405L), String.valueOf(r2));     // Catch: Exception -> L47
        r13.setRequestProperty(AbstractC0295Gu.m625r(-404959581435957L), C1456gf.m2786D());     // Catch: Exception -> L47
        OutputStream r22 = r13.getOutputStream();     // Catch: Exception -> L47
        Charset r3 = AbstractC2659w7.f9201a;     // Catch: Throwable -> L42
        byte[] r06 = r05.getBytes(r3);     // Catch: Throwable -> L42
        AbstractC0295Gu.m625r(-405006826076213L);     // Catch: Throwable -> L42
        r22.write(r06);     // Catch: Throwable -> L42
        r22.close();     // Catch: Exception -> L47
        InputStream r07 = r13.getInputStream();     // Catch: Exception -> L47
        AbstractC0295Gu.m625r(-405066955618357L);     // Catch: Exception -> L47
        BufferedReader r08 = new BufferedReader(new InputStreamReader(r07, r3), 8192);     // Catch: Exception -> L47
        String r14 = AbstractC1406fG.m2708h0(r08);     // Catch: Throwable -> L37
        r08.close();     // Catch: Exception -> L47
        C0029Am r09 = AbstractC2809zm.f9524a;     // Catch: Exception -> L22
        r09.getClass();     // Catch: Exception -> L22
        Object r010 = r09.m4550a(ApiResponse.Companion.serializer(CheckInResponseData.Companion.serializer()), r14);     // Catch: Exception -> L22
    L25:
        ApiResponse r011 = (ApiResponse) r010;     // Catch: Exception -> L47
        if (r011 != null) goto L28;
    L30:
        r43 = false;
    L31:
        if (r011 == null) goto L34;
        String r012 = r011.getMsg();     // Catch: Exception -> L47
        if (r012 == null) goto L34;
    L62:
        return new C0862U2(r012, r43);
    L34:
        r012 = AbstractC0295Gu.m625r(-404736243136565L);     // Catch: Exception -> L47
        goto L62
    L28:
        if (r011.getCode() != 0) goto L30;
    L22:
        e = move-exception;
        AbstractC0295Gu.m625r(-405152854964277L);     // Catch: Exception -> L47
        AbstractC0425Jv.m881a(ApiResponse.class).m445b();     // Catch: Exception -> L47
        AbstractC0295Gu.m625r(-404719063267381L);     // Catch: Exception -> L47
        e.getMessage();     // Catch: Exception -> L47
        r010 = null;
        goto L25
    L37:
        th = move-exception;
        throw th;     // Catch: Throwable -> L39
    L39:
        th = move-exception;
        AbstractC0585Nj.m1138f(r08, th);     // Catch: Exception -> L47
        throw th;     // Catch: Exception -> L47
    L42:
        th = move-exception;
        throw th;     // Catch: Throwable -> L44
    L44:
        th = move-exception;
        AbstractC0585Nj.m1138f(r22, th);     // Catch: Exception -> L47
        throw th;     // Catch: Exception -> L47
    L48:
        return new C0862U2(AbstractC0295Gu.m625r(-404757717973045L), r124);
    }

    public C0991X2(String r2, InterfaceC0190Eb r3) {
        this.f3160e = 1;
        this.f3162g = r2;
        super(r3);
    }
}
