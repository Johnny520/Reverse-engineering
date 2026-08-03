package p001;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.widget.TextView;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import p001.AbstractC0356q;

/* JADX INFO: renamed from: ۟.t1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0397t1 extends AbstractC0335o4 implements InterfaceC0236h3<TextView, AlertDialog, C0433vb> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ List<String> f1098;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ String f1099;

    /* JADX INFO: renamed from: ۟.t1$a */
    public static final class a extends AbstractC0335o4 implements InterfaceC0222g3<Activity, C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ AlertDialog f1100;

        public a(AlertDialog alertDialog) {
            this.f1100 = alertDialog;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(Activity activity) {
            C0237h4.m1090("it", activity);
            this.f1100.dismiss();
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.t1$b */
    public static final class b extends AbstractC0335o4 implements InterfaceC0236h3<Long, Long, C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ List<String> f1101;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ TextView f1102;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ C0352p8 f1807;

        public b(List<String> list, TextView textView, C0352p8 c0352p8) {
            this.f1101 = list;
            this.f1102 = textView;
            this.f1807 = c0352p8;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0236h3
        /* JADX INFO: renamed from: ۥ۟ */
        public final C0433vb mo863(Long l, Long l2) {
            C0292l3.m1141(new C0410u1(this.f1101, this.f1102, (int) (((l.longValue() * 1.0f) / l2.longValue()) * 100), this.f1807));
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.t1$c */
    public static final class c extends AbstractC0335o4 implements InterfaceC0222g3<Exception, C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ C0352p8 f1103;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ C0365q8<String> f1104;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ C0352p8 f1808;

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public final /* synthetic */ String f1809;

        /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ List<String> f1810;

        /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
        public final /* synthetic */ String f1811;

        /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
        public final /* synthetic */ AlertDialog f1812;

        /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
        public final /* synthetic */ TextView f1813;

        public c(C0352p8 c0352p8, C0365q8<String> c0365q8, C0352p8 c0352p82, String str, List<String> list, String str2, AlertDialog alertDialog, TextView textView) {
            this.f1103 = c0352p8;
            this.f1104 = c0365q8;
            this.f1808 = c0352p82;
            this.f1809 = str;
            this.f1810 = list;
            this.f1811 = str2;
            this.f1812 = alertDialog;
            this.f1813 = textView;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r9v13, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r9v14, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: T */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(Exception exc) {
            Exception exc2 = exc;
            if (exc2 == null) {
                int i = C0224g5.f810;
                int i2 = this.f1103.f1028;
                C0292l3.m1141(new C0423v1(this.f1809));
            } else {
                C0365q8<String> c0365q8 = this.f1104;
                String message = exc2.getMessage();
                T t = message;
                if (message == null) {
                    t = "";
                }
                c0365q8.f1047 = t;
                this.f1808.f1028++;
            }
            C0352p8 c0352p8 = this.f1103;
            c0352p8.f1028++;
            C0397t1.m1235(c0352p8, this.f1810, this.f1808, this.f1811, this.f1104, this.f1812, this.f1813);
            return C0433vb.f1163;
        }
    }

    public C0397t1(String str, List list) {
        this.f1098 = list;
        this.f1099 = str;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final void m1235(C0352p8 c0352p8, List<String> list, C0352p8 c0352p82, String str, C0365q8<String> c0365q8, AlertDialog alertDialog, TextView textView) {
        String string;
        String strM915;
        if (c0352p8.f1028 < list.size()) {
            final String str2 = list.get(c0352p8.f1028);
            final String str3 = C0436w1.m952(str) + "h_" + System.currentTimeMillis() + "." + str;
            final b bVar = new b(list, textView, c0352p8);
            final c cVar = new c(c0352p8, c0365q8, c0352p82, str3, list, str, alertDialog, textView);
            C0237h4.m1090("downUrl", str2);
            C0237h4.m1090("savePath", str3);
            "onProgress";
            "onDone";
            C0415u6.f1138 = false;
            C0286kb c0286kb = AbstractC0356q.f1031;
            AbstractC0356q.c.m1191().execute(new Runnable() { // from class: ۟.t6

                /* JADX INFO: renamed from: ۥ۟ */
                public final /* synthetic */ String f1110 = null;

                @Override // java.lang.Runnable
                public final void run() {
                    String str4 = str2;
                    String str5 = this.f1110;
                    String str6 = str3;
                    InterfaceC0236h3 interfaceC0236h3 = bVar;
                    InterfaceC0222g3 interfaceC0222g3 = cVar;
                    C0237h4.m1090("$downUrl", str4);
                    C0237h4.m1090("$savePath", str6);
                    C0237h4.m1090("$onProgress", interfaceC0236h3);
                    C0237h4.m1090("$onDone", interfaceC0222g3);
                    try {
                        URLConnection uRLConnectionOpenConnection = new URL(str4).openConnection();
                        C0237h4.m1088("null cannot be cast to non-null type java.net.HttpURLConnection", uRLConnectionOpenConnection);
                        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                        httpURLConnection.setConnectTimeout(4000);
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.setRequestMethod("GET");
                        httpURLConnection.setRequestProperty("Charset", "utf-8");
                        if (str5 != null) {
                            String strM9152 = "Referer";
                            if (!(str5.length() == 0)) {
                                str4 = str5;
                            }
                            httpURLConnection.setRequestProperty(strM9152, str4);
                        }
                        httpURLConnection.connect();
                        C0450x2.m962(str6);
                        File file = new File(str6);
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode != 200) {
                            throw new Exception("responseCode is:" + responseCode);
                        }
                        InputStream inputStream = httpURLConnection.getInputStream();
                        long contentLength = httpURLConnection.getContentLength();
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                        long j = 0;
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = bufferedInputStream.read(bArr);
                            if (i == -1 || C0415u6.f1138) {
                                break;
                            }
                            j += (long) i;
                            interfaceC0236h3.mo863(Long.valueOf(j), Long.valueOf(contentLength));
                            fileOutputStream.write(bArr, 0, i);
                        }
                        fileOutputStream.close();
                        inputStream.close();
                        bufferedInputStream.close();
                        if (C0415u6.f1138) {
                            file.delete();
                        } else {
                            interfaceC0222g3.mo984(null);
                        }
                    } catch (Exception e) {
                        interfaceC0222g3.mo984(e);
                    }
                }
            });
            return;
        }
        if (c0352p82.f1028 <= 0) {
            if (list.size() == 1) {
                int i = C0330o.f1000;
                string = C0372r2.m924("下载完毕，路径: ", C0436w1.m952(str)).toString();
                strM915 = "toString(...)";
            } else {
                int i2 = C0330o.f1000;
                string = C0372r2.m924("全部下载完毕，路径: ", C0436w1.m952(str)).toString();
                strM915 = "toString(...)";
            }
        } else if (list.size() == 1) {
            int i3 = C0330o.f1000;
            StringBuilder sbM924 = C0372r2.m924("下载失败:", c0365q8.f1047);
            sbM924.append(list.get(0));
            string = sbM924.toString();
            strM915 = "toString(...)";
        } else {
            int i4 = C0330o.f1000;
            StringBuilder sbM9242 = C0372r2.m924("下载完毕,成功", Integer.valueOf(list.size() - c0352p82.f1028));
            sbM9242.append("，失败");
            sbM9242.append(c0352p82.f1028);
            string = sbM9242.toString();
            strM915 = "toString(...)";
        }
        C0237h4.m1089(strM915, string);
        C0330o.m1173(1, string);
        C0292l3.m1141(new a(alertDialog));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0236h3
    /* JADX INFO: renamed from: ۥ۟ */
    public final C0433vb mo863(TextView textView, AlertDialog alertDialog) {
        TextView textView2 = textView;
        AlertDialog alertDialog2 = alertDialog;
        C0237h4.m1090("tipView", textView2);
        C0237h4.m1090("alertDialog", alertDialog2);
        C0352p8 c0352p8 = new C0352p8();
        C0352p8 c0352p82 = new C0352p8();
        C0365q8 c0365q8 = new C0365q8();
        c0365q8.f1047 = "";
        m1235(c0352p8, this.f1098, c0352p82, this.f1099, c0365q8, alertDialog2, textView2);
        return C0433vb.f1163;
    }
}
