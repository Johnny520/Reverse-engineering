package p001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: renamed from: ۟.u6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0415u6 {

    /* JADX INFO: renamed from: ۥ */
    public static boolean f1138;

    /* JADX INFO: renamed from: ۥ */
    public static String m949(String str, InterfaceC0222g3 interfaceC0222g3, int i) {
        C0193e2 c0193e2 = (i & 2) != 0 ? C0193e2.f760 : null;
        if ((i & 4) != 0) {
            interfaceC0222g3 = null;
        }
        C0237h4.m1090("url", str);
        C0237h4.m1090("header", c0193e2);
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(8000);
            uRLConnectionOpenConnection.setRequestProperty("Referer", str);
            uRLConnectionOpenConnection.connect();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnectionOpenConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
            if (interfaceC0222g3 != null) {
                interfaceC0222g3.mo984(str);
            }
            String string = sb.toString();
            C0237h4.m1089("toString(...)", string);
            return string;
        } catch (MalformedURLException | IOException | Exception unused) {
            return "";
        }
    }
}
