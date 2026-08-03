package p000;

import io.github.cherrywechat.network.model.ApiResponse;
import io.github.cherrywechat.network.model.FAQCategory;
import io.github.cherrywechat.network.model.SubmitWxAccountData;
import io.github.cherrywechat.network.model.UpdateItem;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: Y2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1034Y2 extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f3303e;

    public /* synthetic */ C1034Y2(int r1, InterfaceC0190Eb r2) {
        this.f3303e = r1;
        super(r2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r2, Object r3) {
        InterfaceC1409fc r22 = (InterfaceC1409fc) r2;
        InterfaceC0190Eb r32 = (InterfaceC0190Eb) r3;
        switch(this.f3303e) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return new C1034Y2(3, r32).mo448i(C0829TC.f2620a);
    L7:
        return new C1034Y2(2, r32).mo448i(C0829TC.f2620a);
    L9:
        return new C1034Y2(1, r32).mo448i(C0829TC.f2620a);
    L11:
        return new C1034Y2(0, r32).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r2, Object r3) {
        switch(this.f3303e) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return new C1034Y2(3, r2);
    L7:
        return new C1034Y2(2, r2);
    L9:
        return new C1034Y2(1, r2);
    L11:
        return new C1034Y2(0, r2);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r14) {
        switch(this.f3303e) {
            case 0: goto L84;
            case 1: goto L68;
            case 2: goto L27;
            default: goto L4;
        };
    L4:
        AbstractC0628Oj.m1232T(r14);
        URLConnection r142 = new URL(AbstractC0295Gu.m625r(-388625820809269L).concat(C1456gf.m2791I())).openConnection();
        AbstractC0295Gu.m625r(-389119742048309L);
        HttpURLConnection r143 = (HttpURLConnection) r142;
        r143.setRequestMethod(AbstractC0295Gu.m625r(-388844864141365L));     // Catch: Throwable -> L8
        if (r143.getResponseCode() != 200) goto L10;
        InputStream r0 = r143.getInputStream();     // Catch: Throwable -> L8
    L11:
        BufferedReader r1 = new BufferedReader(new InputStreamReader(r0, StandardCharsets.UTF_8));     // Catch: Throwable -> L8
        String r02 = AbstractC1406fG.m2708h0(r1);     // Catch: Throwable -> L15
        r1.close();     // Catch: Throwable -> L8
    L14:
        r143.disconnect();
        return r02;
    L15:
        th = move-exception;
        throw th;     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        AbstractC0585Nj.m1138f(r1, th);     // Catch: Throwable -> L8
        throw th;     // Catch: Throwable -> L8
    L10:
        r0 = r143.getErrorStream();     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        r02 = AbstractC0295Gu.m625r(-388862044010549L) + th.getMessage() + AbstractC0295Gu.m625r(-387315855783989L);     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        r143.disconnect();
        throw th;
    L27:
        AbstractC0628Oj.m1232T(r14);
        long r03 = System.currentTimeMillis() / ((long) 1000);     // Catch: Exception -> L50
        C1456gf r2 = AbstractC1077Z2.f3440a;     // Catch: Exception -> L50
        r2.getClass();     // Catch: Exception -> L50
        String r3 = C1456gf.m2794L();     // Catch: Exception -> L50
        Object r5 = null;
        if (r3.length() > 0) goto L32;
        r3 = null;
    L32:
        if (r3 != null) goto L34;
        r3 = C1456gf.m2791I();     // Catch: Exception -> L50
    L34:
        String r4 = C1456gf.m2793K();     // Catch: Exception -> L50
        C0208Et r7 = new C0208Et(AbstractC0295Gu.m625r(-394089019209781L), r3);     // Catch: Exception -> L50
        C0208Et r8 = new C0208Et(AbstractC0295Gu.m625r(-394110494046261L), r4);     // Catch: Exception -> L50
        C0208Et r10 = new C0208Et(AbstractC0295Gu.m625r(-394149148751925L), new Long(r03));     // Catch: Exception -> L50
        String r6 = AbstractC0295Gu.m625r(-393642342610997L);     // Catch: Exception -> L50
        String r9 = AbstractC1077Z2.f3441b;     // Catch: Exception -> L50
        String r22 = C1456gf.m2804n(r2, AbstractC2598uq.m5110L(new C0208Et[]{r7, r8, r10, new C0208Et(r6, r9)}), r03, AbstractC0295Gu.m625r(-393693882218549L));     // Catch: Exception -> L50
        JSONObject r62 = new JSONObject();     // Catch: Exception -> L50
        r62.put(AbstractC0295Gu.m625r(-393754011760693L), r3);     // Catch: Exception -> L50
        r62.put(AbstractC0295Gu.m625r(-393775486597173L), r4);     // Catch: Exception -> L50
        r62.put(AbstractC0295Gu.m625r(-393814141302837L), r03);     // Catch: Exception -> L50
        r62.put(AbstractC0295Gu.m625r(-393857090975797L), r9);     // Catch: Exception -> L50
        r62.put(AbstractC0295Gu.m625r(-394458386397237L), r22);     // Catch: Exception -> L50
        String r23 = r62.toString();     // Catch: Exception -> L50
        AbstractC0295Gu.m625r(-394479861233717L);     // Catch: Exception -> L50
        URLConnection r32 = new URL(AbstractC0295Gu.m625r(-394539990775861L)).openConnection();     // Catch: Exception -> L50
        r32.setDoOutput(true);     // Catch: Exception -> L50
        r32.setRequestProperty(AbstractC0295Gu.m625r(-394209278294069L), AbstractC0295Gu.m625r(-394265112868917L));     // Catch: Exception -> L50
        r32.setRequestProperty(AbstractC0295Gu.m625r(-394338127312949L), AbstractC0295Gu.m625r(-394381076985909L));     // Catch: Exception -> L50
        r32.setRequestProperty(AbstractC0295Gu.m625r(-392826298824757L), r9);     // Catch: Exception -> L50
        r32.setRequestProperty(AbstractC0295Gu.m625r(-392886428366901L), String.valueOf(r03));     // Catch: Exception -> L50
        r32.setRequestProperty(AbstractC0295Gu.m625r(-392937967974453L), C1456gf.m2786D());     // Catch: Exception -> L50
        OutputStream r12 = r32.getOutputStream();     // Catch: Exception -> L50
        Charset r04 = AbstractC2659w7.f9201a;     // Catch: Throwable -> L60
        byte[] r24 = r23.getBytes(r04);     // Catch: Throwable -> L60
        AbstractC0295Gu.m625r(-392985212614709L);     // Catch: Throwable -> L60
        r12.write(r24);     // Catch: Throwable -> L60
        r12.close();     // Catch: Exception -> L50
        InputStream r13 = r32.getInputStream();     // Catch: Exception -> L50
        AbstractC0295Gu.m625r(-393045342156853L);     // Catch: Exception -> L50
        BufferedReader r15 = new BufferedReader(new InputStreamReader(r13, r04), 8192);     // Catch: Exception -> L50
        String r05 = AbstractC1406fG.m2708h0(r15);     // Catch: Throwable -> L54
        r15.close();     // Catch: Exception -> L50
        C0029Am r16 = AbstractC2809zm.f9524a;     // Catch: Exception -> L41
        r16.getClass();     // Catch: Exception -> L41
        r5 = r16.m4550a(ApiResponse.Companion.serializer(SubmitWxAccountData.Companion.serializer()), r05);     // Catch: Exception -> L41
    L44:
        ApiResponse r52 = (ApiResponse) r5;     // Catch: Exception -> L50
        if (r52 == null) goto L129;
        SubmitWxAccountData r06 = (SubmitWxAccountData) r52.getData();     // Catch: Exception -> L50
        if (r06 == null) goto L129;
        String r33 = AbstractC0295Gu.m625r(-392744694446133L);     // Catch: Exception -> L50
        String r42 = r06.getWxId();     // Catch: Exception -> L50
        Integer r53 = new Integer(r06.getAdVersion());     // Catch: Exception -> L50
        String r102 = r06.getWxId();     // Catch: Exception -> L50
        String r11 = r06.getAdUrl();     // Catch: Exception -> L50
        return new C0862U2(true, r33, r42, r53, new C0819T2(r06.getAdVersion(), r06.getContinuousDays(), r06.getTotalCheckins(), r102, r11, r06.isUnlocked()));
    L129:
        return new C0862U2(AbstractC0295Gu.m625r(-392714629675061L), false);
    L41:
        e = move-exception;
        AbstractC0295Gu.m625r(-392581485688885L);     // Catch: Exception -> L50
        AbstractC0425Jv.m881a(ApiResponse.class).m445b();     // Catch: Exception -> L50
        AbstractC0295Gu.m625r(-392697449805877L);     // Catch: Exception -> L50
        e.getMessage();     // Catch: Exception -> L50
        goto L44
    L54:
        th = move-exception;
        throw th;     // Catch: Throwable -> L57
    L57:
        th = move-exception;
        AbstractC0585Nj.m1138f(r15, th);     // Catch: Exception -> L50
        throw th;     // Catch: Exception -> L50
    L60:
        th = move-exception;
        throw th;     // Catch: Throwable -> L63
    L63:
        th = move-exception;
        AbstractC0585Nj.m1138f(r12, th);     // Catch: Exception -> L50
        throw th;     // Catch: Exception -> L50
    L50:
        e = move-exception;
        e.printStackTrace();
        return new C0862U2(AbstractC0295Gu.m625r(-392766169282613L), false);
    L68:
        C0452Kf r17 = C0452Kf.f1484a;
        AbstractC0628Oj.m1232T(r14);
        String r144 = AbstractC1406fG.m2708h0(new BufferedReader(new InputStreamReader(new URL(AbstractC0295Gu.m625r(-414502998767669L)).openConnection().getInputStream())));     // Catch: Exception -> L100
        C0029Am r07 = AbstractC2809zm.f9524a;     // Catch: Exception -> L72
        r07.getClass();     // Catch: Exception -> L72
        Object r145 = r07.m4550a(ApiResponse.Companion.serializer(new C0263G4(UpdateItem.Companion.serializer())), r144);     // Catch: Exception -> L72
    L75:
        ApiResponse r146 = (ApiResponse) r145;     // Catch: Exception -> L100
        if (r146 != null) goto L78;
        return r17;
    L78:
        if (r146.getCode() != 200) goto L131;
        List r147 = (List) r146.getData();     // Catch: Exception -> L100
        if (r147 != null) goto L83;
        return r17;
    L83:
        return r147;
    L131:
        return r17;
    L72:
        e = move-exception;
        AbstractC0295Gu.m625r(-414155106416693L);     // Catch: Exception -> L100
        AbstractC0425Jv.m881a(ApiResponse.class).m445b();     // Catch: Exception -> L100
        AbstractC0295Gu.m625r(-395029617047605L);     // Catch: Exception -> L100
        e.getMessage();     // Catch: Exception -> L100
        r145 = null;
    L133:
        return r17;
    L84:
        C0452Kf r18 = C0452Kf.f1484a;
        AbstractC0628Oj.m1232T(r14);
        String r148 = AbstractC1406fG.m2708h0(new BufferedReader(new InputStreamReader(new URL(AbstractC0295Gu.m625r(-416482978691125L)).openConnection().getInputStream())));     // Catch: Exception -> L101
        C0029Am r08 = AbstractC2809zm.f9524a;     // Catch: Exception -> L88
        r08.getClass();     // Catch: Exception -> L88
        Object r149 = r08.m4550a(ApiResponse.Companion.serializer(new C0263G4(FAQCategory.Companion.serializer())), r148);     // Catch: Exception -> L88
    L91:
        ApiResponse r1410 = (ApiResponse) r149;     // Catch: Exception -> L101
        if (r1410 != null) goto L94;
        return r18;
    L94:
        if (r1410.getCode() != 200) goto L135;
        List r1411 = (List) r1410.getData();     // Catch: Exception -> L101
        if (r1411 != null) goto L99;
        return r18;
    L99:
        return r1411;
    L135:
        return r18;
    L88:
        e = move-exception;
        AbstractC0295Gu.m625r(-416671957252149L);     // Catch: Exception -> L101
        AbstractC0425Jv.m881a(ApiResponse.class).m445b();     // Catch: Exception -> L101
        AbstractC0295Gu.m625r(-416238165555253L);     // Catch: Exception -> L101
        e.getMessage();     // Catch: Exception -> L101
        r149 = null;
    L137:
        return r18;
    }
}
