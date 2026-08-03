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
            C0237h4.m1090(C0341oa.m915(new byte[]{12, 122}, new byte[]{101, 14, 124, 116, -25, 120}), activity);
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
            C0237h4.m1090(C0341oa.m915(new byte[]{122, 70, -32, -98, 32, -69, 114}, new byte[]{30, 41, -105, -16, 117, -55}), str2);
            C0237h4.m1090(C0341oa.m915(new byte[]{32, 108, -20, -127, 5, 87, 39, 101}, new byte[]{83, 13, -102, -28, 85, 54}), str3);
            C0341oa.m915(new byte[]{111, -31, -98, -18, -30, 77, 114, -22, -67, -17}, new byte[]{0, -113, -50, -100, -115, 42});
            C0341oa.m915(new byte[]{-17, 8, -83, 60, 97, 24}, new byte[]{-128, 102, -23, 83, 15, 125});
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
                    C0237h4.m1090(C0341oa.m915(new byte[]{-8, 0, 65, 122, 35, 49, -82, 8}, new byte[]{-36, 100, 46, 13, 77, 100}), str4);
                    C0237h4.m1090(C0341oa.m915(new byte[]{-120, -93, -66, 79, -46, -7, -51, -92, -73}, new byte[]{-84, -48, -33, 57, -73, -87}), str6);
                    C0237h4.m1090(C0341oa.m915(new byte[]{69, 119, 90, -52, 22, 116, 6, 106, 81, -17, 23}, new byte[]{97, 24, 52, -100, 100, 27}), interfaceC0236h3);
                    C0237h4.m1090(C0341oa.m915(new byte[]{30, -111, -27, -111, -58, -54, 95}, new byte[]{58, -2, -117, -43, -87, -92}), interfaceC0222g3);
                    try {
                        URLConnection uRLConnectionOpenConnection = new URL(str4).openConnection();
                        C0237h4.m1088(C0341oa.m915(new byte[]{-116, 69, -2, 105, -121, 29, -125, 94, -4, 106, -45, 94, -128, 85, -78, 102, -58, 13, -106, 16, -26, 106, -121, 16, -115, 94, -65, 107, -46, 18, -114, 16, -26, 124, -41, 27, -62, 90, -13, 115, -58, 80, -116, 85, -26, 43, -17, 10, -106, 64, -57, 87, -21, 61, -115, 94, -4, 96, -60, 10, -117, 95, -4}, new byte[]{-30, 48, -110, 5, -89, 126}), uRLConnectionOpenConnection);
                        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                        httpURLConnection.setConnectTimeout(4000);
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.setRequestMethod(C0341oa.m915(new byte[]{-5, -52, 55}, new byte[]{-68, -119, 99, 108, -14, -121}));
                        httpURLConnection.setRequestProperty(C0341oa.m915(new byte[]{-98, 18, 126, -19, 77, -19, -87}, new byte[]{-35, 122, 31, -97, 62, -120}), C0341oa.m915(new byte[]{-54, -37, 126, -25, -125}, new byte[]{-65, -81, 24, -54, -69, -6}));
                        if (str5 != null) {
                            String strM9152 = C0341oa.m915(new byte[]{114, 21, -107, -61, 60, -108, 82}, new byte[]{32, 112, -13, -90, 78, -15});
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
                string = C0372r2.m924(C0341oa.m915(new byte[]{90, 37, 61, -22, -7, -12, 91, 51, 58, -28, -21, -36, 81, 33, 58, -22, -13, -26, 91, 35, 50, 56, 100}, new byte[]{-66, -99, -74, 2, 68, 73}), C0436w1.m952(str)).toString();
                strM915 = C0341oa.m915(new byte[]{87, 68, 68, 12, -112, -24, 77, 76, 63, 86, -52, -81, 10}, new byte[]{35, 43, 23, 120, -30, -127});
            } else {
                int i2 = C0330o.f1000;
                string = C0372r2.m924(C0341oa.m915(new byte[]{66, -43, 113, -40, 108, 67, 67, -24, 82, -39, 82, 86, 66, -2, 85, -41, 64, 126, 72, -20, 85, -39, 88, 68, 66, -18, 93, 11, -49}, new byte[]{-89, 80, -39, 49, -17, -21}), C0436w1.m952(str)).toString();
                strM915 = C0341oa.m915(new byte[]{30, -123, -55, 87, -30, -6, 4, -115, -78, 13, -66, -67, 67}, new byte[]{106, -22, -102, 35, -112, -109});
            }
        } else if (list.size() == 1) {
            int i3 = C0330o.f1000;
            StringBuilder sbM924 = C0372r2.m924(C0341oa.m915(new byte[]{102, -4, 121, 77, -75, 91, 103, -32, 67, 77, -68, 67, -72}, new byte[]{-126, 68, -14, -91, 8, -26}), c0365q8.f1047);
            sbM924.append(list.get(0));
            string = sbM924.toString();
            strM915 = C0341oa.m915(new byte[]{60, -51, -44, 103, -75, 89, 38, -59, -81, 61, -23, 30, 97}, new byte[]{72, -94, -121, 19, -57, 48});
        } else {
            int i4 = C0330o.f1000;
            StringBuilder sbM9242 = C0372r2.m924(C0341oa.m915(new byte[]{-52, 83, -44, -98, -24, -33, -51, 69, -45, -112, -6, -9, 4, 13, -41, -26, -80, -24, -73}, new byte[]{40, -21, 95, 118, 85, 98}), Integer.valueOf(list.size() - c0352p82.f1028));
            sbM9242.append(C0341oa.m915(new byte[]{-6, 42, -120, -3, 126, -105, -3, 34, -95}, new byte[]{21, -106, 4, 24, -38, 38}));
            sbM9242.append(c0352p82.f1028);
            string = sbM9242.toString();
            strM915 = C0341oa.m915(new byte[]{-2, -30, 58, 81, 67, 38, -28, -22, 65, 11, 31, 97, -93}, new byte[]{-118, -115, 105, 37, 49, 79});
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
        C0237h4.m1090(C0341oa.m915(new byte[]{56, -65, 75, 3, 111, -70, 59}, new byte[]{76, -42, 59, 85, 6, -33}), textView2);
        C0237h4.m1090(C0341oa.m915(new byte[]{8, -66, -48, 76, 94, 35, 0, -77, -39, 81, 77}, new byte[]{105, -46, -75, 62, 42, 103}), alertDialog2);
        C0352p8 c0352p8 = new C0352p8();
        C0352p8 c0352p82 = new C0352p8();
        C0365q8 c0365q8 = new C0365q8();
        c0365q8.f1047 = "";
        m1235(c0352p8, this.f1098, c0352p82, this.f1099, c0365q8, alertDialog2, textView2);
        return C0433vb.f1163;
    }
}
