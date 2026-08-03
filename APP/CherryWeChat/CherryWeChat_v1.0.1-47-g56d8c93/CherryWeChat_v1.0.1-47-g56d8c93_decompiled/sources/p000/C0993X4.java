package p000;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import io.github.cherrywechat.network.NetworkNativeBridge;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0993X4(Object obj, Object obj2, InterfaceC0190Eb interfaceC0190Eb, int i) {
        super(interfaceC0190Eb);
        this.f3163e = i;
        this.f3164f = obj;
        this.f3165g = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) throws Throwable {
        InterfaceC1409fc interfaceC1409fc = (InterfaceC1409fc) obj;
        InterfaceC0190Eb interfaceC0190Eb = (InterfaceC0190Eb) obj2;
        switch (this.f3163e) {
            case 0:
                return ((C0993X4) mo447h(interfaceC0190Eb, interfaceC1409fc)).mo448i(C0829TC.f2620a);
            case 1:
                C0993X4 c0993x4 = (C0993X4) mo447h(interfaceC0190Eb, interfaceC1409fc);
                C0829TC c0829tc = C0829TC.f2620a;
                c0993x4.mo448i(c0829tc);
                return c0829tc;
            case 2:
                C0993X4 c0993x42 = (C0993X4) mo447h(interfaceC0190Eb, interfaceC1409fc);
                C0829TC c0829tc2 = C0829TC.f2620a;
                c0993x42.mo448i(c0829tc2);
                return c0829tc2;
            case 3:
                C0993X4 c0993x43 = (C0993X4) mo447h(interfaceC0190Eb, interfaceC1409fc);
                C0829TC c0829tc3 = C0829TC.f2620a;
                c0993x43.mo448i(c0829tc3);
                return c0829tc3;
            case 4:
                C0993X4 c0993x44 = (C0993X4) mo447h(interfaceC0190Eb, interfaceC1409fc);
                C0829TC c0829tc4 = C0829TC.f2620a;
                c0993x44.mo448i(c0829tc4);
                return c0829tc4;
            case 5:
                return ((C0993X4) mo447h(interfaceC0190Eb, interfaceC1409fc)).mo448i(C0829TC.f2620a);
            default:
                C0993X4 c0993x45 = (C0993X4) mo447h(interfaceC0190Eb, interfaceC1409fc);
                C0829TC c0829tc5 = C0829TC.f2620a;
                c0993x45.mo448i(c0829tc5);
                return c0829tc5;
        }
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        switch (this.f3163e) {
            case 0:
                return new C0993X4((InterfaceC1416fj) this.f3164f, (Exception) this.f3165g, interfaceC0190Eb, 0);
            case 1:
                return new C0993X4((C2414qe) this.f3164f, (View) this.f3165g, interfaceC0190Eb, 1);
            case 2:
                return new C0993X4((Activity) this.f3164f, (Exception) this.f3165g, interfaceC0190Eb, 2);
            case 3:
                return new C0993X4((C1505hk) this.f3164f, (C0185EC) this.f3165g, interfaceC0190Eb, 3);
            case 4:
                return new C0993X4((C0762Rp) this.f3164f, (Exception) this.f3165g, interfaceC0190Eb, 4);
            case 5:
                return new C0993X4((String) this.f3164f, (String) this.f3165g, interfaceC0190Eb, 5);
            default:
                return new C0993X4((C0701QC) this.f3164f, (Exception) this.f3165g, interfaceC0190Eb, 6);
        }
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) throws Throwable {
        String string;
        switch (this.f3163e) {
            case 0:
                AbstractC0628Oj.m1232T(obj);
                C1036Y4.f3309b = false;
                InterfaceC1416fj interfaceC1416fj = (InterfaceC1416fj) this.f3164f;
                if (interfaceC1416fj == null) {
                    return null;
                }
                interfaceC1416fj.mo90g(AbstractC0295Gu.m625r(-391168441448501L) + ((Exception) this.f3165g).getMessage());
                return C0829TC.f2620a;
            case 1:
                AbstractC0628Oj.m1232T(obj);
                ((C2414qe) this.f3164f).m4856a();
                AbstractC0213Ey.m413k(-103753524967477L, ((View) this.f3165g).getContext(), 0);
                return C0829TC.f2620a;
            case 2:
                AbstractC0628Oj.m1232T(obj);
                Activity activity = (Activity) this.f3164f;
                String strM625r = AbstractC0295Gu.m625r(-88154203748405L);
                String message = ((Exception) this.f3165g).getMessage();
                if (message == null) {
                    message = AbstractC0295Gu.m625r(-88184268519477L);
                }
                Toast.makeText(activity, strM625r.concat(message), 1).show();
                return C0829TC.f2620a;
            case 3:
                AbstractC0628Oj.m1232T(obj);
                C1505hk c1505hk = (C1505hk) this.f3164f;
                AbstractC0213Ey.m413k(-74066711017525L, c1505hk.getContext(), 0);
                C0357IC c0357ic = C0357IC.f1218a;
                C0185EC c0185ec = (C0185EC) this.f3165g;
                String str = c0185ec.f549a;
                EnumC0099CC enumC0099CC = EnumC0099CC.f236d;
                c0357ic.getClass();
                C0357IC.m794f(str, enumC0099CC);
                Context context = c1505hk.getContext();
                AbstractC0295Gu.m625r(-74096775788597L);
                C1456gf.m2801S(context, AbstractC0295Gu.m625r(-74165495265333L), AbstractC0295Gu.m625r(-74186970101813L) + c0185ec.f551c + AbstractC0295Gu.m625r(-74204149970997L), new DialogInterfaceOnClickListenerC1330dk(c1505hk, c0185ec), false);
                return C0829TC.f2620a;
            case 4:
                AbstractC0628Oj.m1232T(obj);
                ((C0762Rp) this.f3164f).m1559a(AbstractC0295Gu.m625r(-130798934030389L) + ((Exception) this.f3165g).getMessage() + '\n');
                return C0829TC.f2620a;
            case 5:
                String str2 = (String) this.f3165g;
                AbstractC0628Oj.m1232T(obj);
                StringBuilder sb = new StringBuilder();
                sb.append(AbstractC0295Gu.m625r(-402996781381685L));
                String str3 = (String) this.f3164f;
                sb.append(str3);
                sb.append(AbstractC0295Gu.m625r(-403121335433269L));
                sb.append(C1456gf.m2791I());
                URLConnection uRLConnectionOpenConnection = new URL(sb.toString()).openConnection();
                AbstractC0295Gu.m625r(-403151400204341L);
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                try {
                    httpURLConnection.setRequestMethod(AbstractC0295Gu.m625r(-401777010669621L));
                    httpURLConnection.setDoOutput(true);
                    for (Map.Entry<String, String> entry : NetworkNativeBridge.getHeaders(str3, str2).entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    httpURLConnection.setRequestProperty(AbstractC0295Gu.m625r(-401798485506101L), AbstractC0295Gu.m625r(-401854320080949L));
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        Charset charset = StandardCharsets.UTF_8;
                        AbstractC0295Gu.m625r(-401377578711093L);
                        byte[] bytes = str2.getBytes(charset);
                        AbstractC0295Gu.m625r(-401403348514869L);
                        outputStream.write(bytes);
                        outputStream.flush();
                        outputStream.close();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream(), charset));
                        try {
                            String strM2708h0 = AbstractC1406fG.m2708h0(bufferedReader);
                            bufferedReader.close();
                            string = AbstractC2564tz.m5051L(strM2708h0, AbstractC0295Gu.m625r(-401463478057013L), false) ? AbstractC0295Gu.m625r(-401515017664565L) : NetworkNativeBridge.decryptData(strM2708h0);
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                    } finally {
                    }
                    break;
                }
                return string;
            default:
                AbstractC0628Oj.m1232T(obj);
                Activity activityM1432f = ((C0701QC) this.f3164f).m1432f();
                String strM625r2 = AbstractC0295Gu.m625r(-484068584060981L);
                String message2 = ((Exception) this.f3165g).getMessage();
                if (message2 == null) {
                    message2 = AbstractC0295Gu.m625r(-484098648832053L);
                }
                Toast.makeText(activityM1432f, strM625r2.concat(message2), 1).show();
                return C0829TC.f2620a;
        }
    }
}
