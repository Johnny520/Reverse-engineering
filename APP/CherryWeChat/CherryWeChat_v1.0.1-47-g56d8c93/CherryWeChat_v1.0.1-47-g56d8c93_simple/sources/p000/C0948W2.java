package p000;

import io.github.cherrywechat.network.NetworkNativeBridge;
import io.github.cherrywechat.network.model.ApiResponse;
import io.github.cherrywechat.network.model.UnlockStatusData;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: W2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0948W2 extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2971e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f2972f;

    public /* synthetic */ C0948W2(int r1, InterfaceC0190Eb r2, String r3) {
        this.f2971e = r1;
        this.f2972f = r3;
        super(r2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r2, Object r3) {
        InterfaceC1409fc r22 = (InterfaceC1409fc) r2;
        InterfaceC0190Eb r32 = (InterfaceC0190Eb) r3;
        switch(this.f2971e) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return ((C0948W2) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    L7:
        return ((C0948W2) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    L9:
        return ((C0948W2) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r3, Object r4) {
        switch(this.f2971e) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        int r1 = 2;
        return new C0948W2(r1, r3, this.f2972f);
    L6:
        int r12 = 1;
        return new C0948W2(r12, r3, this.f2972f);
    L8:
        int r13 = 0;
        return new C0948W2(r13, r3, this.f2972f);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r9) {
        switch(this.f2971e) {
            case 0: goto L81;
            case 1: goto L40;
            default: goto L4;
        };
    L4:
        AbstractC0628Oj.m1232T(r9);
        String r92 = AbstractC0295Gu.m625r(-404491430000693L);
        String r0 = this.f2972f;
        if (AbstractC2564tz.m5051L(r0, r92, false) == false) goto L8;
        long r2 = -404500019935285L;
    L9:
        URLConnection r93 = new URL(AbstractC0295Gu.m625r(-404517199804469L) + r0 + AbstractC0295Gu.m625r(r2) + AbstractC0295Gu.m625r(-404091998042165L) + C1456gf.m2791I()).openConnection();
        AbstractC0295Gu.m625r(-404117767845941L);
        HttpURLConnection r94 = (HttpURLConnection) r93;
        r94.setRequestMethod(AbstractC0295Gu.m625r(-402743378311221L));     // Catch: Throwable -> L14
        Map<String, String> r02 = NetworkNativeBridge.getHeaders(r0, AbstractC0295Gu.m625r(-388621525841973L));     // Catch: Throwable -> L14
        Iterator<Map.Entry<String, String>> r22 = r02.entrySet().iterator();     // Catch: Throwable -> L14
    L12:
        if (r22.hasNext() == false) goto L16;
        Map.Entry<String, String> r3 = r22.next();     // Catch: Throwable -> L14
        r94.setRequestProperty(r3.getKey(), r3.getValue());     // Catch: Throwable -> L14
        goto L12
    L16:
        String r23 = r02.get(AbstractC0295Gu.m625r(-402760558180405L));     // Catch: Throwable -> L14
        String r24 = r02.get(AbstractC0295Gu.m625r(-402812097787957L));     // Catch: Throwable -> L14
        String r03 = r02.get(AbstractC0295Gu.m625r(-402846457526325L));     // Catch: Throwable -> L14
        if (r94.getResponseCode() != 200) goto L19;
        InputStream r04 = r94.getInputStream();     // Catch: Throwable -> L14
    L20:
        BufferedReader r25 = new BufferedReader(new InputStreamReader(r04, StandardCharsets.UTF_8));     // Catch: Throwable -> L14
        String r05 = AbstractC1406fG.m2708h0(r25);     // Catch: Throwable -> L28
        r25.close();     // Catch: Throwable -> L14
        if (AbstractC2564tz.m5051L(r05, AbstractC0295Gu.m625r(-402897997133877L), false) == false) goto L26;
        String r06 = AbstractC0295Gu.m625r(-402949536741429L);     // Catch: Throwable -> L14
    L25:
        r94.disconnect();
        return r06;
    L26:
        r06 = NetworkNativeBridge.decryptData(r05);     // Catch: Throwable -> L14
        goto L25
    L28:
        th = move-exception;
        throw th;     // Catch: Throwable -> L31
    L31:
        th = move-exception;
        AbstractC0585Nj.m1138f(r25, th);     // Catch: Throwable -> L14
        throw th;     // Catch: Throwable -> L14
    L19:
        r04 = r94.getErrorStream();     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        r06 = AbstractC0295Gu.m625r(-402623119226933L) + th.getMessage() + AbstractC0295Gu.m625r(-403275954255925L);     // Catch: Throwable -> L37
    L37:
        th = move-exception;
        r94.disconnect();
        throw th;
    L8:
        r2 = -404508609869877L;
        goto L9
    L40:
        String r07 = this.f2972f;
        AbstractC0628Oj.m1232T(r9);
        URLConnection r1 = new URL(r07).openConnection();     // Catch: Exception -> L79
        AbstractC0295Gu.m625r(-160335424124981L);     // Catch: Exception -> L79
        HttpURLConnection r12 = (HttpURLConnection) r1;     // Catch: Exception -> L79
        r12.setRequestMethod(AbstractC0295Gu.m625r(-160060546218037L));     // Catch: Exception -> L79
        r12.setConnectTimeout(5000);     // Catch: Exception -> L79
        r12.setReadTimeout(10000);     // Catch: Exception -> L79
        r12.setInstanceFollowRedirects(true);     // Catch: Exception -> L79
        r12.setRequestProperty(AbstractC0295Gu.m625r(-160077726087221L), AbstractC0295Gu.m625r(-160124970727477L));     // Catch: Exception -> L79
        String r26 = C0668Pg.m1327e(AbstractC2248ms.f7951a, r12.getHeaderField(AbstractC0295Gu.m625r(-160176510335029L)));     // Catch: Exception -> L79
        if (r26 != null) goto L44;
    L45:
        String r08 = AbstractC2564tz.m5068c0(new URL(r07).getPath(), '/');     // Catch: Exception -> L79
        if (AbstractC2564tz.m5059T(r08) == false) goto L49;
        r08 = null;
    L49:
        if (r08 != null) goto L144;
        r26 = null;
    L54:
        if (r26 != null) goto L56;
    L57:
        r26 = String.valueOf(System.currentTimeMillis());     // Catch: Exception -> L79
    L58:
        Pattern r09 = Pattern.compile(AbstractC0295Gu.m625r(-158638912043061L));     // Catch: Exception -> L79
        String r010 = r09.matcher(r26).replaceAll(AbstractC0295Gu.m625r(-158711926487093L));     // Catch: Exception -> L79
        File r27 = AbstractC2248ms.f7952b;     // Catch: Exception -> L79
        r27.mkdirs();     // Catch: Exception -> L79
        File r32 = new File(r27, r010);     // Catch: Exception -> L79
        if (r32.exists() == false) goto L61;
        r32.delete();     // Catch: Exception -> L79
    L61:
        r32.createNewFile();     // Catch: Exception -> L79
        InputStream r28 = r12.getInputStream();     // Catch: Exception -> L79
        FileOutputStream r4 = new FileOutputStream(r32);     // Catch: Throwable -> L67
        AbstractC1293cr.m2555p(r28, r4);     // Catch: Throwable -> L69
        r4.close();     // Catch: Throwable -> L67
        r28.close();     // Catch: Exception -> L79
        r12.disconnect();     // Catch: Exception -> L79
        return r32.getAbsolutePath();
    L69:
        th = move-exception;
        throw th;     // Catch: Throwable -> L72
    L72:
        th = move-exception;
        AbstractC0585Nj.m1138f(r4, th);     // Catch: Throwable -> L67
        throw th;     // Catch: Throwable -> L67
    L67:
        th = move-exception;
        throw th;     // Catch: Throwable -> L76
    L76:
        th = move-exception;
        AbstractC0585Nj.m1138f(r28, th);     // Catch: Exception -> L79
        throw th;     // Catch: Exception -> L79
    L56:
        if (AbstractC2564tz.m5059T(r26) == false) goto L58;
    L144:
        r08 = URLDecoder.decode(r08, AbstractC0295Gu.m625r(-158613142239285L));     // Catch: Exception -> L122
    L52:
        r26 = r08;
        goto L54
    L44:
        if (AbstractC2564tz.m5059T(r26) == false) goto L54;
    L79:
        AbstractC0295Gu.m625r(-158720516421685L);
        return null;
    L81:
        String r011 = this.f2972f;
        AbstractC0628Oj.m1232T(r9);
        long r13 = System.currentTimeMillis() / ((long) 1000);     // Catch: Exception -> L97
        C0208Et r33 = new C0208Et(AbstractC0295Gu.m625r(-408928131217461L), r011);     // Catch: Exception -> L97
        C0208Et r5 = new C0208Et(AbstractC0295Gu.m625r(-408953901021237L), new Long(r13));     // Catch: Exception -> L97
        String r95 = AbstractC0295Gu.m625r(-408996850694197L);     // Catch: Exception -> L97
        String r42 = AbstractC1077Z2.f3441b;     // Catch: Exception -> L97
        String r96 = C1456gf.m2804n(AbstractC1077Z2.f3440a, AbstractC2598uq.m5110L(new C0208Et[]{r33, r5, new C0208Et(r95, r42)}), r13, AbstractC0295Gu.m625r(-408498634487861L));     // Catch: Exception -> L97
        JSONObject r34 = new JSONObject();     // Catch: Exception -> L97
        r34.put(AbstractC0295Gu.m625r(-408558764030005L), r011);     // Catch: Exception -> L97
        r34.put(AbstractC0295Gu.m625r(-408584533833781L), r13);     // Catch: Exception -> L97
        r34.put(AbstractC0295Gu.m625r(-408627483506741L), r42);     // Catch: Exception -> L97
        r34.put(AbstractC0295Gu.m625r(-408679023114293L), r96);     // Catch: Exception -> L97
        String r97 = r34.toString();     // Catch: Exception -> L97
        AbstractC0295Gu.m625r(-408700497950773L);     // Catch: Exception -> L97
        URLConnection r012 = new URL(AbstractC0295Gu.m625r(-407111360051253L)).openConnection();     // Catch: Exception -> L97
        r012.setDoOutput(true);     // Catch: Exception -> L97
        r012.setRequestProperty(AbstractC0295Gu.m625r(-407338993317941L), AbstractC0295Gu.m625r(-406845072078901L));     // Catch: Exception -> L97
        r012.setRequestProperty(AbstractC0295Gu.m625r(-406918086522933L), AbstractC0295Gu.m625r(-406961036195893L));     // Catch: Exception -> L97
        r012.setRequestProperty(AbstractC0295Gu.m625r(-407055525476405L), r42);     // Catch: Exception -> L97
        r012.setRequestProperty(AbstractC0295Gu.m625r(-407665410832437L), String.valueOf(r13));     // Catch: Exception -> L97
        r012.setRequestProperty(AbstractC0295Gu.m625r(-407716950439989L), C1456gf.m2786D());     // Catch: Exception -> L97
        OutputStream r14 = r012.getOutputStream();     // Catch: Exception -> L97
        Charset r29 = AbstractC2659w7.f9201a;     // Catch: Throwable -> L114
        byte[] r98 = r97.getBytes(r29);     // Catch: Throwable -> L114
        AbstractC0295Gu.m625r(-407764195080245L);     // Catch: Throwable -> L114
        r14.write(r98);     // Catch: Throwable -> L114
        r14.close();     // Catch: Exception -> L97
        InputStream r99 = r012.getInputStream();     // Catch: Exception -> L97
        AbstractC0295Gu.m625r(-407824324622389L);     // Catch: Exception -> L97
        BufferedReader r910 = new BufferedReader(new InputStreamReader(r99, r29), 8192);     // Catch: Exception -> L97
        String r013 = AbstractC1406fG.m2708h0(r910);     // Catch: Throwable -> L108
        r910.close();     // Catch: Exception -> L97
        C0029Am r911 = AbstractC2809zm.f9524a;     // Catch: Exception -> L89
        r911.getClass();     // Catch: Exception -> L89
        Object r912 = r911.m4550a(ApiResponse.Companion.serializer(UnlockStatusData.Companion.serializer()), r013);     // Catch: Exception -> L89
    L92:
        ApiResponse r913 = (ApiResponse) r912;     // Catch: Exception -> L97
        if (r913 != null) goto L95;
    L99:
        String r43 = AbstractC0295Gu.m625r(-407493612140597L);     // Catch: Exception -> L97
        if (r913 == null) goto L105;
        String r914 = r913.getMsg();     // Catch: Exception -> L97
        if (r914 == null) goto L105;
    L154:
        return new C0905V2(0, 0, 0, r43, r914, false);
    L105:
        r914 = AbstractC0295Gu.m625r(-407497907107893L);     // Catch: Exception -> L97
        goto L154
    L95:
        if (r913.getCode() != 0) goto L99;
        UnlockStatusData r915 = (UnlockStatusData) r913.getData();     // Catch: Exception -> L97
        boolean r6 = r915.isUnlocked();     // Catch: Exception -> L97
        return new C0905V2(r915.getContinuousDays(), r915.getAdVersion(), r915.getTotalCheckins(), r915.getAdUrl(), null, r6);
    L89:
        e = move-exception;
        AbstractC0295Gu.m625r(-407910223968309L);     // Catch: Exception -> L97
        AbstractC0425Jv.m881a(ApiResponse.class).m445b();     // Catch: Exception -> L97
        AbstractC0295Gu.m625r(-407476432271413L);     // Catch: Exception -> L97
        e.getMessage();     // Catch: Exception -> L97
        r912 = null;
        goto L92
    L108:
        th = move-exception;
        throw th;     // Catch: Throwable -> L111
    L111:
        th = move-exception;
        AbstractC0585Nj.m1138f(r910, th);     // Catch: Exception -> L97
        throw th;     // Catch: Exception -> L97
    L114:
        th = move-exception;
        throw th;     // Catch: Throwable -> L117
    L117:
        th = move-exception;
        AbstractC0585Nj.m1138f(r14, th);     // Catch: Exception -> L97
        throw th;     // Catch: Exception -> L97
    L97:
        e = move-exception;
        e.printStackTrace();
        return new C0905V2(0, 0, 0, AbstractC0295Gu.m625r(-407519381944373L), AbstractC0295Gu.m625r(-407523676911669L), false);
    }
}
