package p000;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: Ns */
/* JADX INFO: loaded from: classes.dex */
public final class C0594Ns {

    /* JADX INFO: renamed from: a */
    public static final C0594Ns f1925a = null;

    static {
        AbstractC0295Gu.m625r(-396988122134581L);
        AbstractC0295Gu.m625r(-397043956709429L);
        f1925a = new C0594Ns();
    }

    /* JADX INFO: renamed from: a */
    public static Object m1163a(String r3, String r4, AbstractC0644Oz r5) {
        JSONObject r0 = new JSONObject();
        r0.put(AbstractC0295Gu.m625r(-401016801458229L), r3);
        r0.put(AbstractC0295Gu.m625r(-399431958526005L), r4);
        String r32 = AbstractC0295Gu.m625r(-399470613231669L);
        int r42 = AbstractC1450gG.f5067a;
        if (AbstractC1406fG.m2699Y(C1456gf.f5172p) == false) goto L6;
        long r1 = -399517857871925L;
    L7:
        r0.put(r32, AbstractC0295Gu.m625r(r1));
        String r33 = r0.toString();
        AbstractC0295Gu.m625r(-399586577348661L);
        return m1167f(AbstractC0295Gu.m625r(-399646706890805L), r33, r5);
    L6:
        r1 = -399547922642997L;
        goto L7
    }

    /* JADX INFO: renamed from: c */
    public static String m1164c(String r4, String r5) {
        JSONObject r0 = new JSONObject();
        r0.put(AbstractC0295Gu.m625r(-398564375132213L), r4);
        r0.put(AbstractC0295Gu.m625r(-398036094154805L), r5);
        String r42 = r0.toString();
        AbstractC0295Gu.m625r(-398066158925877L);
        URLConnection r52 = new URL(AbstractC0295Gu.m625r(-398126288468021L).concat(C1456gf.m2791I())).openConnection();
        AbstractC0295Gu.m625r(-398946627221557L);
        HttpURLConnection r53 = (HttpURLConnection) r52;
        r53.setRequestMethod(AbstractC0295Gu.m625r(-398671749314613L));     // Catch: Throwable -> L8
        r53.setDoOutput(true);     // Catch: Throwable -> L8
        r53.setRequestProperty(AbstractC0295Gu.m625r(-398693224151093L), AbstractC0295Gu.m625r(-398749058725941L));     // Catch: Throwable -> L8
        OutputStream r02 = r53.getOutputStream();     // Catch: Throwable -> L8
        Charset r1 = StandardCharsets.UTF_8;     // Catch: Throwable -> L21
        AbstractC0295Gu.m625r(-398822073169973L);     // Catch: Throwable -> L21
        byte[] r43 = r42.getBytes(r1);     // Catch: Throwable -> L21
        AbstractC0295Gu.m625r(-398847842973749L);     // Catch: Throwable -> L21
        r02.write(r43);     // Catch: Throwable -> L21
        r02.flush();     // Catch: Throwable -> L21
        r02.close();     // Catch: Throwable -> L8
        if (r53.getResponseCode() != 200) goto L10;
        InputStream r44 = r53.getInputStream();     // Catch: Throwable -> L8
    L11:
        BufferedReader r03 = new BufferedReader(new InputStreamReader(r44, r1));     // Catch: Throwable -> L8
        String r45 = AbstractC1406fG.m2708h0(r03);     // Catch: Throwable -> L16
        r03.close();     // Catch: Throwable -> L8
        r53.disconnect();
        return r45;
    L16:
        th = move-exception;
        throw th;     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        AbstractC0585Nj.m1138f(r03, th);     // Catch: Throwable -> L8
        throw th;     // Catch: Throwable -> L8
    L10:
        r44 = r53.getErrorStream();     // Catch: Throwable -> L8
        goto L11
    L21:
        th = move-exception;
        throw th;     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        AbstractC0585Nj.m1138f(r02, th);     // Catch: Throwable -> L8
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        r53.disconnect();
        throw th;
    }

    /* JADX INFO: renamed from: d */
    public static Object m1165d(String r3, String r4, String r5, AbstractC0644Oz r6) {
        JSONObject r0 = new JSONObject();
        r0.put(AbstractC0295Gu.m625r(-399230095063093L), r4);
        r0.put(AbstractC0295Gu.m625r(-399294519572533L), r5);
        String r42 = r0.toString();
        AbstractC0295Gu.m625r(-399333174278197L);
        return m1167f(AbstractC0295Gu.m625r(-399393303820341L) + r3 + AbstractC0295Gu.m625r(-400076203620405L), r42, r6);
    }

    /* JADX INFO: renamed from: e */
    public static Object m1166e(String r4, InterfaceC0190Eb r5) {
        C1498hd r0 = AbstractC1499he.f5282a;
        int r3 = 2;
        return AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C0948W2(r3, null, r4), r5);
    }

    /* JADX INFO: renamed from: f */
    public static Object m1167f(String r4, String r5, AbstractC0644Oz r6) {
        C1498hd r0 = AbstractC1499he.f5282a;
        return AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C0993X4(r4, r5, null, 5), r6);
    }

    /* JADX INFO: renamed from: g */
    public static Object m1168g(String r3, String r4, String r5, C0950W4 r6) {
        JSONObject r0 = new JSONObject();
        r0.put(AbstractC0295Gu.m625r(-399870045190197L), r4);
        r0.put(AbstractC0295Gu.m625r(-399930174732341L), r5);
        String r42 = r0.toString();
        AbstractC0295Gu.m625r(-398310972061749L);
        return m1167f(AbstractC0295Gu.m625r(-398371101603893L) + r3 + AbstractC0295Gu.m625r(-398491360688181L), r42, r6);
    }

    /* JADX INFO: renamed from: b */
    public final Object m1169b(String r12, String r13, long r14, InterfaceC1416fj r16, AbstractC0233Fb r17) {
        if ((r17 instanceof C0508Ls) == false) goto L7;
        C0508Ls r1 = (C0508Ls) r17;
        int r2 = r1.f1664f;
        if ((r2 & Integer.MIN_VALUE) == 0) goto L7;
        r1.f1664f = r2 - Integer.MIN_VALUE;
    L8:
        Object r0 = r1.f1662d;
        int r22 = r1.f1664f;
        if (r22 == 0) goto L14;
        if (r22 != 1) goto L13;
        AbstractC0628Oj.m1232T(r0);
    L17:
        AbstractC0295Gu.m625r(-397258705074229L);
        return r0;
    L13:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-397331719518261L));
    L14:
        AbstractC0628Oj.m1232T(r0);
        C1498hd r02 = AbstractC1499he.f5282a;
        ExecutorC0921Vc r03 = ExecutorC0921Vc.f2876b;
        C0551Ms r4 = new C0551Ms(r12, r14, r13, r16, null);
        r1.f1664f = 1;
        r0 = AbstractC0585Nj.m1133N(r03, r4, r1);
        EnumC1453gc r122 = EnumC1453gc.f5148a;
        if (r0 != r122) goto L17;
        return r122;
    L7:
        r1 = new C0508Ls(this, r17);
        goto L8
    }
}
