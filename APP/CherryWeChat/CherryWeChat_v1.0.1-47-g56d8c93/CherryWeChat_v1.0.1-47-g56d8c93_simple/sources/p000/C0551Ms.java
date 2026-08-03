package p000;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: Ms */
/* JADX INFO: loaded from: classes.dex */
public final class C0551Ms extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public HttpURLConnection f1803e;

    /* JADX INFO: renamed from: f */
    public Closeable f1804f;

    /* JADX INFO: renamed from: g */
    public InterfaceC1416fj f1805g;

    /* JADX INFO: renamed from: h */
    public InputStream f1806h;

    /* JADX INFO: renamed from: i */
    public byte[] f1807i;

    /* JADX INFO: renamed from: j */
    public ByteArrayOutputStream f1808j;

    /* JADX INFO: renamed from: k */
    public int f1809k;

    /* JADX INFO: renamed from: l */
    public int f1810l;

    /* JADX INFO: renamed from: m */
    public int f1811m;

    /* JADX INFO: renamed from: n */
    public long f1812n;

    /* JADX INFO: renamed from: o */
    public long f1813o;

    /* JADX INFO: renamed from: p */
    public long f1814p;

    /* JADX INFO: renamed from: q */
    public int f1815q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ String f1816r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ long f1817s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ String f1818t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC1416fj f1819u;

    public C0551Ms(String r1, long r2, String r4, InterfaceC1416fj r5, InterfaceC0190Eb r6) {
        this.f1816r = r1;
        this.f1817s = r2;
        this.f1818t = r4;
        this.f1819u = r5;
        super(r6);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r1, Object r2) {
        InterfaceC0190Eb r22 = (InterfaceC0190Eb) r2;
        return ((C0551Ms) mo447h(r22, (InterfaceC1409fc) r1)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r8, Object r9) {
        String r4 = this.f1818t;
        InterfaceC1416fj r5 = this.f1819u;
        return new C0551Ms(this.f1816r, this.f1817s, r4, r5, r8);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r24) {
        int r0 = this.f1815q;
        if (r0 == 0) goto L12;
        if (r0 != 1) goto L11;
        int r02 = this.f1811m;
        long r6 = this.f1814p;
        int r8 = this.f1810l;
        long r9 = this.f1813o;
        long r11 = this.f1812n;
        int r13 = this.f1809k;
        ByteArrayOutputStream r14 = this.f1808j;
        byte[] r15 = this.f1807i;
        long r16 = 0;
        InputStream r2 = this.f1806h;
        InterfaceC1416fj r3 = this.f1805g;
        Closeable r5 = this.f1804f;
        HttpURLConnection r4 = this.f1803e;
        AbstractC0628Oj.m1232T(r24);     // Catch: Throwable -> L8
        long r20 = r6;
    L25:
        int r62 = r2.read(r15);     // Catch: Throwable -> L8
        int r242 = r8;
        if (r62 == (-1)) goto L39;
        r14.write(r15, 0, r62);     // Catch: Throwable -> L8
        long r63 = r20 + ((long) r62);     // Catch: Throwable -> L8
        if (r9 <= r16) goto L30;
        r20 = r63;
        int r64 = AbstractC0828TB.m1639f((int) ((((long) 100) * r20) / r9), 100);     // Catch: Throwable -> L8
    L31:
        if (r64 <= r02) goto L37;
        C1498hd r03 = AbstractC1499he.f5282a;     // Catch: Throwable -> L8
        C2283nk r04 = AbstractC1106Zp.f3500a;     // Catch: Throwable -> L8
        C2170l r7 = new C2170l(r3, r64, null, 5);     // Catch: Throwable -> L8
        this.f1803e = r4;     // Catch: Throwable -> L8
        this.f1804f = r5;     // Catch: Throwable -> L8
        this.f1805g = r3;     // Catch: Throwable -> L8
        this.f1806h = r2;     // Catch: Throwable -> L8
        this.f1807i = r15;     // Catch: Throwable -> L8
        this.f1808j = r14;     // Catch: Throwable -> L8
        this.f1809k = r13;     // Catch: Throwable -> L8
        this.f1812n = r11;     // Catch: Throwable -> L8
        this.f1813o = r9;     // Catch: Throwable -> L8
        r8 = r242;
        this.f1810l = r8;     // Catch: Throwable -> L8
        InputStream r18 = r2;
        InterfaceC1416fj r243 = r3;
        long r22 = r20;
        this.f1814p = r22;     // Catch: Throwable -> L8
        this.f1811m = r64;     // Catch: Throwable -> L8
        this.f1815q = 1;     // Catch: Throwable -> L8
        Object r05 = AbstractC0585Nj.m1133N(r04, r7, this);     // Catch: Throwable -> L8
        EnumC1453gc r72 = EnumC1453gc.f5148a;
        if (r05 == r72) goto L35;
        r20 = r22;
        r02 = r64;
    L38:
        r2 = r18;
        r3 = r243;
        goto L25
    L35:
        return r72;
    L37:
        r8 = r242;
        r18 = r2;
        r243 = r3;
        goto L38
    L30:
        r20 = r63;
        r64 = AbstractC0828TB.m1639f((int) (r20 / ((long) 1024)), 100);     // Catch: Throwable -> L8
        goto L31
    L39:
        byte[] r06 = r14.toByteArray();     // Catch: Throwable -> L8
        AbstractC0585Nj.m1138f(r5, null);     // Catch: Throwable -> L44
        r4.disconnect();
        return r06;
    L8:
        th = move-exception;
        Throwable r23 = th;
    L64:
        throw r23;     // Catch: Throwable -> L49
    L49:
        th = move-exception;
        AbstractC0585Nj.m1138f(r5, r23);     // Catch: Throwable -> L44
        throw th;     // Catch: Throwable -> L44
    L44:
        th = move-exception;
        r4.disconnect();
        throw th;
    L11:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-403735515756597L));
    L12:
        r16 = 0;
        AbstractC0628Oj.m1232T(r24);
        URLConnection r07 = new URL(AbstractC0295Gu.m625r(-387242841339957L).concat(C1456gf.m2791I())).openConnection();
        AbstractC0295Gu.m625r(-387603618592821L);
        r4 = (HttpURLConnection) r07;
        r4.setRequestMethod(AbstractC0295Gu.m625r(-403821415102517L));     // Catch: Throwable -> L44
        r4.setDoOutput(true);     // Catch: Throwable -> L44
        r4.setRequestProperty(AbstractC0295Gu.m625r(-403842889938997L), AbstractC0295Gu.m625r(-403903019481141L) + this.f1816r);     // Catch: Throwable -> L44
        r4.setRequestProperty(AbstractC0295Gu.m625r(-403937379219509L), AbstractC0295Gu.m625r(-403993213794357L));     // Catch: Throwable -> L44
        JSONObject r08 = new JSONObject();     // Catch: Throwable -> L44
        r08.put(AbstractC0295Gu.m625r(-404066228238389L), this.f1818t);     // Catch: Throwable -> L44
        String r09 = r08.toString();     // Catch: Throwable -> L44
        AbstractC0295Gu.m625r(-403542242228277L);     // Catch: Throwable -> L44
        OutputStream r25 = r4.getOutputStream();     // Catch: Throwable -> L44
        Charset r32 = StandardCharsets.UTF_8;     // Catch: Throwable -> L54
        AbstractC0295Gu.m625r(-403602371770421L);     // Catch: Throwable -> L54
        byte[] r010 = r09.getBytes(r32);     // Catch: Throwable -> L54
        AbstractC0295Gu.m625r(-403628141574197L);     // Catch: Throwable -> L54
        r25.write(r010);     // Catch: Throwable -> L54
        r25.flush();     // Catch: Throwable -> L54
        r25.close();     // Catch: Throwable -> L44
        int r011 = r4.getResponseCode();     // Catch: Throwable -> L44
        if (r011 != 200) goto L53;
        long r26 = r4.getContentLengthLong();     // Catch: Throwable -> L44
        if (r26 <= 0) goto L20;
        long r52 = r26;
    L21:
        InputStream r73 = r4.getInputStream();     // Catch: Throwable -> L44
        byte[] r92 = new byte[8192];     // Catch: Throwable -> L46
        r13 = r011;
        r11 = r26;
        r2 = r73;
        r3 = this.f1819u;     // Catch: Throwable -> L44
        r15 = r92;
        r14 = new ByteArrayOutputStream();     // Catch: Throwable -> L46
        r20 = 0;
        r02 = 0;
        r8 = 0;
        r9 = r52;
        r5 = r2;
    L46:
        th = move-exception;
        r23 = th;
        r5 = r73;
        goto L64
    L20:
        r52 = this.f1817s;     // Catch: Throwable -> L44
        goto L21
    L53:
        throw new Exception(AbstractC0295Gu.m625r(-403688271116341L) + r011);     // Catch: Throwable -> L44
    L54:
        th = move-exception;
        throw th;     // Catch: Throwable -> L57
    L57:
        th = move-exception;
        AbstractC0585Nj.m1138f(r25, th);     // Catch: Throwable -> L44
        throw th;     // Catch: Throwable -> L44
    }
}
