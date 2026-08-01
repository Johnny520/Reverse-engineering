package p036;

import androidx.collection.C0276;
import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p004.AbstractC6098;
import p007.AbstractC6136;
import p010.AbstractC6157;
import p013.C6177;
import p015.C6198;
import p015.C6200;
import p015.C6204;
import p015.C6216;
import p015.C6220;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子苏兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6353 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f17480 = 0;

    static {
        AbstractC3056.m6668(-3937559900331443623L);
        AbstractC3056.m6668(-3937559286151120295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static String m11899(String str, String str2, HashMap map) {
        try {
            C6200 c6200 = new C6200(new C6216());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                str3.getClass();
                str4.getClass();
                arrayList.add(AbstractC6098.m11454(str3, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
                arrayList2.add(AbstractC6098.m11454(str4, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
            }
            C1245 c1245 = new C1245(6);
            c1245.m2141(str);
            c1245.m2156(AbstractC3056.m6668(-3937558723510404519L), str2);
            c1245.m2156(AbstractC3056.m6668(-3937559956166018471L), AbstractC3056.m6668(-3937559286151120295L));
            c1245.m2156(AbstractC3056.m6668(-3937559419295106471L), AbstractC3056.m6668(-3937559311920924071L));
            c1245.m2156(AbstractC3056.m6668(-3937559294741054887L), AbstractC3056.m6668(-3937559238906480039L));
            c1245.m2148("POST", new C6220(arrayList, arrayList2));
            C6204 c6204M11615 = new C6177(c6200, new C6198(c1245)).m11615();
            String strM11648 = c6204M11615.f17009.m11648();
            c6204M11615.close();
            return strM11648;
        } catch (IOException e) {
            String strM6668 = AbstractC3056.m6668(-3937561291900847527L);
            String str5 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
            return AbstractC3056.m6668(-3937561979095614887L);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m11900(String str, String str2) throws Throwable {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        PrintWriter printWriter = null;
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            uRLConnectionOpenConnection.setRequestProperty(AbstractC3056.m6668(-3937557903171650983L), AbstractC3056.m6668(-3937559311920924071L));
            uRLConnectionOpenConnection.setRequestProperty(AbstractC3056.m6668(-3937557795797468583L), AbstractC3056.m6668(-3937557843042108839L));
            uRLConnectionOpenConnection.setRequestProperty(AbstractC3056.m6668(-3937559956166018471L), AbstractC3056.m6668(-3937559286151120295L));
            uRLConnectionOpenConnection.setDoOutput(true);
            uRLConnectionOpenConnection.setDoInput(true);
            PrintWriter printWriter2 = new PrintWriter(uRLConnectionOpenConnection.getOutputStream());
            try {
                printWriter2.print(str2);
                printWriter2.flush();
                bufferedReader = new BufferedReader(new InputStreamReader(uRLConnectionOpenConnection.getInputStream()));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                        sb.append(AbstractC3056.m6668(-3937560690605426087L));
                    } catch (Throwable th) {
                        th = th;
                        printWriter = printWriter2;
                        if (printWriter != null) {
                            try {
                                printWriter.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                                throw th;
                            }
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                }
                sb.delete(sb.length() - 1, sb.length());
                try {
                    printWriter2.close();
                    bufferedReader.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                return sb.toString();
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m11901(String str, String str2) {
        try {
            C6200 c6200 = new C6200(new C6216());
            C1245 c1245 = new C1245(6);
            c1245.m2141(str);
            c1245.m2156(AbstractC3056.m6668(-3937558723510404519L), str2);
            c1245.m2156(AbstractC3056.m6668(-3937559956166018471L), AbstractC3056.m6668(-3937559286151120295L));
            c1245.m2156(AbstractC3056.m6668(-3937559419295106471L), AbstractC3056.m6668(-3937559311920924071L));
            c1245.m2156(AbstractC3056.m6668(-3937559294741054887L), AbstractC3056.m6668(-3937559238906480039L));
            c1245.m2148("GET", null);
            C6204 c6204M11615 = new C6177(c6200, new C6198(c1245)).m11615();
            String strM11648 = c6204M11615.f17009.m11648();
            c6204M11615.close();
            return strM11648;
        } catch (IOException e) {
            String strM6668 = AbstractC3056.m6668(-3937561291900847527L);
            String str3 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
            return AbstractC3056.m6668(-3937561979095614887L);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m11902(String str) {
        try {
            C6200 c6200 = new C6200(new C6216());
            C1245 c1245 = new C1245(6);
            c1245.m2141(str);
            c1245.m2148("GET", null);
            c1245.m2156(AbstractC3056.m6668(-3937559956166018471L), AbstractC3056.m6668(-3937558332668380583L));
            c1245.m2156(AbstractC3056.m6668(-3937559419295106471L), AbstractC3056.m6668(-3937559311920924071L));
            c1245.m2156(AbstractC3056.m6668(-3937559294741054887L), AbstractC3056.m6668(-3937559238906480039L));
            C6204 c6204M11615 = new C6177(c6200, new C6198(c1245)).m11615();
            String strM11648 = c6204M11615.f17009.m11648();
            c6204M11615.close();
            return strM11648;
        } catch (IOException e) {
            String strM6668 = AbstractC3056.m6668(-3937561291900847527L);
            String str2 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
            return AbstractC3056.m6668(-3937561979095614887L);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m11903(String str, String str2) {
        File file = new File(str2);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        C6200 c6200 = new C6200(new C6216());
        C1245 c1245 = new C1245(6);
        c1245.m2141(str);
        c1245.m2156(AbstractC3056.m6668(-3937559956166018471L), AbstractC3056.m6668(-3937559900331443623L));
        c1245.m2156(AbstractC3056.m6668(-3937559419295106471L), AbstractC3056.m6668(-3937559311920924071L));
        c1245.m2156(AbstractC3056.m6668(-3937559294741054887L), AbstractC3056.m6668(-3937559238906480039L));
        try {
            C6204 c6204M11615 = new C6177(c6200, new C6198(c1245)).m11615();
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(c6204M11615.f17009.m11647());
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = bufferedInputStream.read(bArr);
                            if (i == -1) {
                                bufferedInputStream.close();
                                bufferedOutputStream.close();
                                c6204M11615.close();
                                return;
                            }
                            bufferedOutputStream.write(bArr, 0, i);
                            bufferedOutputStream.flush();
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            String strM6668 = AbstractC3056.m6668(-3937561291900847527L);
            String str3 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m11904(String str, String str2) {
        File file = new File(str2);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        C6200 c6200 = new C6200(new C6216());
        C1245 c1245 = new C1245(6);
        c1245.m2141(str);
        c1245.m2156(AbstractC3056.m6668(-3937559956166018471L), AbstractC3056.m6668(-3937559286151120295L));
        c1245.m2156(AbstractC3056.m6668(-3937559419295106471L), AbstractC3056.m6668(-3937559311920924071L));
        c1245.m2156(AbstractC3056.m6668(-3937559294741054887L), AbstractC3056.m6668(-3937559238906480039L));
        try {
            C6204 c6204M11615 = new C6177(c6200, new C6198(c1245)).m11615();
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(c6204M11615.f17009.m11647());
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = bufferedInputStream.read(bArr);
                            if (i == -1) {
                                bufferedInputStream.close();
                                bufferedOutputStream.close();
                                c6204M11615.close();
                                return;
                            }
                            bufferedOutputStream.write(bArr, 0, i);
                            bufferedOutputStream.flush();
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            AbstractC6136.m11544(-3937558805114783143L, sb, str);
            C0276.m847(AbstractC6136.m11557(-3937558697740600743L, sb, str2), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m11905(java.lang.String r11, java.lang.String r12, java.util.Map r13) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p036.AbstractC6353.m11905(java.lang.String, java.lang.String, java.util.Map):java.lang.String");
    }
}
