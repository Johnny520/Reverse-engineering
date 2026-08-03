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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0551Ms(String str, long j, String str2, InterfaceC1416fj interfaceC1416fj, InterfaceC0190Eb interfaceC0190Eb) {
        super(interfaceC0190Eb);
        this.f1816r = str;
        this.f1817s = j;
        this.f1818t = str2;
        this.f1819u = interfaceC1416fj;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) {
        return ((C0551Ms) mo447h((InterfaceC0190Eb) obj2, (InterfaceC1409fc) obj)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        return new C0551Ms(this.f1816r, this.f1817s, this.f1818t, this.f1819u, interfaceC0190Eb);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) throws Throwable {
        long j;
        HttpURLConnection httpURLConnection;
        Throwable th;
        Closeable closeable;
        int i;
        long j2;
        InputStream inputStream;
        InterfaceC1416fj interfaceC1416fj;
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        long j3;
        int i2;
        int i3;
        long j4;
        int iM1639f;
        InputStream inputStream2;
        InterfaceC1416fj interfaceC1416fj2;
        int i4 = this.f1815q;
        if (i4 == 0) {
            j = 0;
            AbstractC0628Oj.m1232T(obj);
            URLConnection uRLConnectionOpenConnection = new URL(AbstractC0295Gu.m625r(-387242841339957L).concat(C1456gf.m2791I())).openConnection();
            AbstractC0295Gu.m625r(-387603618592821L);
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                httpURLConnection.setRequestMethod(AbstractC0295Gu.m625r(-403821415102517L));
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty(AbstractC0295Gu.m625r(-403842889938997L), AbstractC0295Gu.m625r(-403903019481141L) + this.f1816r);
                httpURLConnection.setRequestProperty(AbstractC0295Gu.m625r(-403937379219509L), AbstractC0295Gu.m625r(-403993213794357L));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AbstractC0295Gu.m625r(-404066228238389L), this.f1818t);
                String string = jSONObject.toString();
                AbstractC0295Gu.m625r(-403542242228277L);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    Charset charset = StandardCharsets.UTF_8;
                    AbstractC0295Gu.m625r(-403602371770421L);
                    byte[] bytes = string.getBytes(charset);
                    AbstractC0295Gu.m625r(-403628141574197L);
                    outputStream.write(bytes);
                    outputStream.flush();
                    outputStream.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new Exception(AbstractC0295Gu.m625r(-403688271116341L) + responseCode);
                    }
                    long contentLengthLong = httpURLConnection.getContentLengthLong();
                    long j5 = contentLengthLong > 0 ? contentLengthLong : this.f1817s;
                    InputStream inputStream3 = httpURLConnection.getInputStream();
                    try {
                        byte[] bArr2 = new byte[8192];
                        i = responseCode;
                        j2 = contentLengthLong;
                        inputStream = inputStream3;
                        interfaceC1416fj = this.f1819u;
                        bArr = bArr2;
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        j3 = 0;
                        i2 = 0;
                        i3 = 0;
                        j4 = j5;
                        closeable = inputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = inputStream3;
                        throw th;
                    }
                } finally {
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException(AbstractC0295Gu.m625r(-403735515756597L));
            }
            i2 = this.f1811m;
            long j6 = this.f1814p;
            i3 = this.f1810l;
            j4 = this.f1813o;
            j2 = this.f1812n;
            i = this.f1809k;
            byteArrayOutputStream = this.f1808j;
            bArr = this.f1807i;
            j = 0;
            inputStream = this.f1806h;
            interfaceC1416fj = this.f1805g;
            closeable = this.f1804f;
            httpURLConnection = this.f1803e;
            try {
                AbstractC0628Oj.m1232T(obj);
                j3 = j6;
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    AbstractC0585Nj.m1138f(closeable, th);
                    throw th4;
                }
            }
        }
        while (true) {
            int i5 = inputStream.read(bArr);
            int i6 = i3;
            if (i5 == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                AbstractC0585Nj.m1138f(closeable, null);
                return byteArray;
            }
            byteArrayOutputStream.write(bArr, 0, i5);
            long j7 = j3 + ((long) i5);
            if (j4 > j) {
                j3 = j7;
                iM1639f = AbstractC0828TB.m1639f((int) ((((long) 100) * j3) / j4), 100);
            } else {
                j3 = j7;
                iM1639f = AbstractC0828TB.m1639f((int) (j3 / ((long) 1024)), 100);
            }
            if (iM1639f > i2) {
                C1498hd c1498hd = AbstractC1499he.f5282a;
                C2283nk c2283nk = AbstractC1106Zp.f3500a;
                C2170l c2170l = new C2170l(interfaceC1416fj, iM1639f, null, 5);
                this.f1803e = httpURLConnection;
                this.f1804f = closeable;
                this.f1805g = interfaceC1416fj;
                this.f1806h = inputStream;
                this.f1807i = bArr;
                this.f1808j = byteArrayOutputStream;
                this.f1809k = i;
                this.f1812n = j2;
                this.f1813o = j4;
                i3 = i6;
                this.f1810l = i3;
                inputStream2 = inputStream;
                interfaceC1416fj2 = interfaceC1416fj;
                long j8 = j3;
                this.f1814p = j8;
                this.f1811m = iM1639f;
                this.f1815q = 1;
                Object objM1133N = AbstractC0585Nj.m1133N(c2283nk, c2170l, this);
                EnumC1453gc enumC1453gc = EnumC1453gc.f5148a;
                if (objM1133N == enumC1453gc) {
                    return enumC1453gc;
                }
                j3 = j8;
                i2 = iM1639f;
            } else {
                i3 = i6;
                inputStream2 = inputStream;
                interfaceC1416fj2 = interfaceC1416fj;
            }
            inputStream = inputStream2;
            interfaceC1416fj = interfaceC1416fj2;
        }
    }
}
