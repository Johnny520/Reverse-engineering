package p000;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import io.github.cherrywechat.network.NetworkNativeBridge;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0993X4 extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f3163e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f3164f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f3165g;

    public /* synthetic */ C0993X4(Object r1, Object r2, InterfaceC0190Eb r3, int r4) {
        this.f3163e = r4;
        this.f3164f = r1;
        this.f3165g = r2;
        super(r3);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r2, Object r3) {
        InterfaceC1409fc r22 = (InterfaceC1409fc) r2;
        InterfaceC0190Eb r32 = (InterfaceC0190Eb) r3;
        switch(this.f3163e) {
            case 0: goto L17;
            case 1: goto L14;
            case 2: goto L12;
            case 3: goto L10;
            case 4: goto L8;
            case 5: goto L7;
            default: goto L4;
        };
    L4:
        C0993X4 r23 = (C0993X4) mo447h(r32, r22);
        C0829TC r33 = C0829TC.f2620a;
        r23.mo448i(r33);
        return r33;
    L8:
        C0993X4 r24 = (C0993X4) mo447h(r32, r22);
        C0829TC r34 = C0829TC.f2620a;
        r24.mo448i(r34);
        return r34;
    L10:
        C0993X4 r25 = (C0993X4) mo447h(r32, r22);
        C0829TC r35 = C0829TC.f2620a;
        r25.mo448i(r35);
        return r35;
    L12:
        C0993X4 r26 = (C0993X4) mo447h(r32, r22);
        C0829TC r36 = C0829TC.f2620a;
        r26.mo448i(r36);
        return r36;
    L14:
        C0993X4 r27 = (C0993X4) mo447h(r32, r22);
        C0829TC r37 = C0829TC.f2620a;
        r27.mo448i(r37);
        return r37;
    L7:
        return ((C0993X4) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    L17:
        return ((C0993X4) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r4, Object r5) {
        switch(this.f3163e) {
            case 0: goto L17;
            case 1: goto L15;
            case 2: goto L13;
            case 3: goto L11;
            case 4: goto L9;
            case 5: goto L7;
            default: goto L5;
        };
    L5:
        return new C0993X4((C0701QC) this.f3164f, (Exception) this.f3165g, r4, 6);
    L7:
        return new C0993X4((String) this.f3164f, (String) this.f3165g, r4, 5);
    L9:
        return new C0993X4((C0762Rp) this.f3164f, (Exception) this.f3165g, r4, 4);
    L11:
        return new C0993X4((C1505hk) this.f3164f, (C0185EC) this.f3165g, r4, 3);
    L13:
        return new C0993X4((Activity) this.f3164f, (Exception) this.f3165g, r4, 2);
    L15:
        return new C0993X4((C2414qe) this.f3164f, (View) this.f3165g, r4, 1);
    L17:
        return new C0993X4((InterfaceC1416fj) this.f3164f, (Exception) this.f3165g, r4, 0);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r8) {
        switch(this.f3163e) {
            case 0: goto L57;
            case 1: goto L55;
            case 2: goto L50;
            case 3: goto L48;
            case 4: goto L46;
            case 5: goto L9;
            default: goto L4;
        };
    L4:
        AbstractC0628Oj.m1232T(r8);
        Activity r82 = ((C0701QC) this.f3164f).m1432f();
        String r0 = AbstractC0295Gu.m625r(-484068584060981L);
        String r1 = ((Exception) this.f3165g).getMessage();
        if (r1 != null) goto L7;
        r1 = AbstractC0295Gu.m625r(-484098648832053L);
    L7:
        Toast.makeText(r82, r0.concat(r1), 1).show();
        return C0829TC.f2620a;
    L9:
        String r02 = (String) this.f3165g;
        AbstractC0628Oj.m1232T(r8);
        StringBuilder r12 = new StringBuilder();
        r12.append(AbstractC0295Gu.m625r(-402996781381685L));
        String r2 = (String) this.f3164f;
        r12.append(r2);
        r12.append(AbstractC0295Gu.m625r(-403121335433269L));
        r12.append(C1456gf.m2791I());
        URLConnection r83 = new URL(r12.toString()).openConnection();
        AbstractC0295Gu.m625r(-403151400204341L);
        HttpURLConnection r84 = (HttpURLConnection) r83;
        r84.setRequestMethod(AbstractC0295Gu.m625r(-401777010669621L));     // Catch: Throwable -> L14
        r84.setDoOutput(true);     // Catch: Throwable -> L14
        Iterator<Map.Entry<String, String>> r13 = NetworkNativeBridge.getHeaders(r2, r02).entrySet().iterator();     // Catch: Throwable -> L14
    L12:
        if (r13.hasNext() == false) goto L16;
        Map.Entry<String, String> r22 = r13.next();     // Catch: Throwable -> L14
        r84.setRequestProperty(r22.getKey(), r22.getValue());     // Catch: Throwable -> L14
        goto L12
    L16:
        r84.setRequestProperty(AbstractC0295Gu.m625r(-401798485506101L), AbstractC0295Gu.m625r(-401854320080949L));     // Catch: Throwable -> L14
        OutputStream r14 = r84.getOutputStream();     // Catch: Throwable -> L14
        Charset r23 = StandardCharsets.UTF_8;     // Catch: Throwable -> L35
        AbstractC0295Gu.m625r(-401377578711093L);     // Catch: Throwable -> L35
        byte[] r03 = r02.getBytes(r23);     // Catch: Throwable -> L35
        AbstractC0295Gu.m625r(-401403348514869L);     // Catch: Throwable -> L35
        r14.write(r03);     // Catch: Throwable -> L35
        r14.flush();     // Catch: Throwable -> L35
        r14.close();     // Catch: Throwable -> L14
        if (r84.getResponseCode() != 200) goto L21;
        InputStream r04 = r84.getInputStream();     // Catch: Throwable -> L14
    L22:
        BufferedReader r15 = new BufferedReader(new InputStreamReader(r04, r23));     // Catch: Throwable -> L14
        String r05 = AbstractC1406fG.m2708h0(r15);     // Catch: Throwable -> L30
        r15.close();     // Catch: Throwable -> L14
        if (AbstractC2564tz.m5051L(r05, AbstractC0295Gu.m625r(-401463478057013L), false) == false) goto L28;
        String r06 = AbstractC0295Gu.m625r(-401515017664565L);     // Catch: Throwable -> L14
    L27:
        r84.disconnect();
        return r06;
    L28:
        r06 = NetworkNativeBridge.decryptData(r05);     // Catch: Throwable -> L14
        goto L27
    L30:
        th = move-exception;
        throw th;     // Catch: Throwable -> L32
    L32:
        th = move-exception;
        AbstractC0585Nj.m1138f(r15, th);     // Catch: Throwable -> L14
        throw th;     // Catch: Throwable -> L14
    L21:
        r04 = r84.getErrorStream();     // Catch: Throwable -> L14
        goto L22
    L35:
        th = move-exception;
        throw th;     // Catch: Throwable -> L37
    L37:
        th = move-exception;
        AbstractC0585Nj.m1138f(r14, th);     // Catch: Throwable -> L14
        throw th;     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        r06 = AbstractC0295Gu.m625r(-402288111777845L) + th.getMessage() + AbstractC0295Gu.m625r(-402391190992949L);     // Catch: Throwable -> L43
    L43:
        th = move-exception;
        r84.disconnect();
        throw th;
    L46:
        AbstractC0628Oj.m1232T(r8);
        ((C0762Rp) this.f3164f).m1559a(AbstractC0295Gu.m625r(-130798934030389L) + ((Exception) this.f3165g).getMessage() + '\n');
        return C0829TC.f2620a;
    L48:
        AbstractC0628Oj.m1232T(r8);
        C1505hk r85 = (C1505hk) this.f3164f;
        AbstractC0213Ey.m413k(-74066711017525L, r85.getContext(), 0);
        C0357IC r07 = C0357IC.f1218a;
        C0185EC r16 = (C0185EC) this.f3165g;
        String r24 = r16.f549a;
        EnumC0099CC r4 = EnumC0099CC.f236d;
        r07.getClass();
        C0357IC.m794f(r24, r4);
        Context r08 = r85.getContext();
        AbstractC0295Gu.m625r(-74096775788597L);
        C1456gf.m2801S(r08, AbstractC0295Gu.m625r(-74165495265333L), AbstractC0295Gu.m625r(-74186970101813L) + r16.f551c + AbstractC0295Gu.m625r(-74204149970997L), new DialogInterfaceOnClickListenerC1330dk(r85, r16), false);
        return C0829TC.f2620a;
    L50:
        AbstractC0628Oj.m1232T(r8);
        Activity r86 = (Activity) this.f3164f;
        String r09 = AbstractC0295Gu.m625r(-88154203748405L);
        String r17 = ((Exception) this.f3165g).getMessage();
        if (r17 != null) goto L53;
        r17 = AbstractC0295Gu.m625r(-88184268519477L);
    L53:
        Toast.makeText(r86, r09.concat(r17), 1).show();
        return C0829TC.f2620a;
    L55:
        AbstractC0628Oj.m1232T(r8);
        ((C2414qe) this.f3164f).m4856a();
        AbstractC0213Ey.m413k(-103753524967477L, ((View) this.f3165g).getContext(), 0);
        return C0829TC.f2620a;
    L57:
        AbstractC0628Oj.m1232T(r8);
        C1036Y4.f3309b = false;
        InterfaceC1416fj r87 = (InterfaceC1416fj) this.f3164f;
        if (r87 == null) goto L60;
        r87.mo90g(AbstractC0295Gu.m625r(-391168441448501L) + ((Exception) this.f3165g).getMessage());
        return C0829TC.f2620a;
    L60:
        return null;
    }
}
