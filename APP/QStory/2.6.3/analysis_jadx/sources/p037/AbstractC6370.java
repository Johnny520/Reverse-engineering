package p037;

import androidx.compose.runtime.internal.C1245;
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
import p003.AbstractC6089;
import p007.C6125;
import p007.C6127;
import p007.C6131;
import p007.C6143;
import p007.C6147;
import p010.AbstractC6188;
import p011.C6203;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子苏兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6370 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f17526 = 0;

    static {
        AbstractC8405.m13972(26);
        AbstractC8405.m13972(29);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static String m11947(String str, String str2, HashMap map) {
        try {
            C6127 c6127 = new C6127(new C6143());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                str3.getClass();
                str4.getClass();
                arrayList.add(AbstractC6089.m11447(str3, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
                arrayList2.add(AbstractC6089.m11447(str4, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
            }
            C1245 c1245 = new C1245(6);
            c1245.m2151(str);
            c1245.m2166(AbstractC8405.m13973("喵喵呜呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵呜"), str2);
            c1245.m2166(AbstractC8405.m13972(25), AbstractC8405.m13972(29));
            c1245.m2166(AbstractC8405.m13973("喵喵呜呜喵喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), AbstractC8405.m13973("喵呜喵呜呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵喵喵喵"));
            c1245.m2166(AbstractC8405.m13972(27), AbstractC8405.m13972(28));
            c1245.m2158("POST", new C6147(arrayList, arrayList2));
            C6131 c6131M11634 = new C6203(c6127, new C6125(c1245)).m11634();
            String strM11519 = c6131M11634.f16770.m11519();
            c6131M11634.close();
            return strM11519;
        } catch (IOException e) {
            String strM13973 = AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵");
            String str5 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13973, e.toString(), e, true);
            return "";
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m11948(String str, String str2) throws Throwable {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        PrintWriter printWriter = null;
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            uRLConnectionOpenConnection.setRequestProperty(AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), AbstractC8405.m13973("喵呜喵呜呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵喵喵喵"));
            uRLConnectionOpenConnection.setRequestProperty(AbstractC8405.m13972(35), AbstractC8405.m13972(36));
            uRLConnectionOpenConnection.setRequestProperty(AbstractC8405.m13972(25), AbstractC8405.m13972(29));
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
                        sb.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
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
    public static String m11949(String str, String str2) {
        try {
            C6127 c6127 = new C6127(new C6143());
            C1245 c1245 = new C1245(6);
            c1245.m2151(str);
            c1245.m2166(AbstractC8405.m13973("喵喵呜呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵呜"), str2);
            c1245.m2166(AbstractC8405.m13972(25), AbstractC8405.m13972(29));
            c1245.m2166(AbstractC8405.m13973("喵喵呜呜喵喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), AbstractC8405.m13973("喵呜喵呜呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵喵喵喵"));
            c1245.m2166(AbstractC8405.m13972(27), AbstractC8405.m13972(28));
            c1245.m2158("GET", null);
            C6131 c6131M11634 = new C6203(c6127, new C6125(c1245)).m11634();
            String strM11519 = c6131M11634.f16770.m11519();
            c6131M11634.close();
            return strM11519;
        } catch (IOException e) {
            String strM13973 = AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵");
            String str3 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13973, e.toString(), e, true);
            return "";
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m11950(String str) {
        try {
            C6127 c6127 = new C6127(new C6143());
            C1245 c1245 = new C1245(6);
            c1245.m2151(str);
            c1245.m2158("GET", null);
            c1245.m2166(AbstractC8405.m13972(25), AbstractC8405.m13972(34));
            c1245.m2166(AbstractC8405.m13973("喵喵呜呜喵喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), AbstractC8405.m13973("喵呜喵呜呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵喵喵喵"));
            c1245.m2166(AbstractC8405.m13972(27), AbstractC8405.m13972(28));
            C6131 c6131M11634 = new C6203(c6127, new C6125(c1245)).m11634();
            String strM11519 = c6131M11634.f16770.m11519();
            c6131M11634.close();
            return strM11519;
        } catch (IOException e) {
            String strM13973 = AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵");
            String str2 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13973, e.toString(), e, true);
            return "";
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m11951(String str, String str2) {
        File file = new File(str2);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        C6127 c6127 = new C6127(new C6143());
        C1245 c1245 = new C1245(6);
        c1245.m2151(str);
        c1245.m2166(AbstractC8405.m13972(25), AbstractC8405.m13972(26));
        c1245.m2166(AbstractC8405.m13973("喵喵呜呜喵喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), AbstractC8405.m13973("喵呜喵呜呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵喵喵喵"));
        c1245.m2166(AbstractC8405.m13972(27), AbstractC8405.m13972(28));
        try {
            C6131 c6131M11634 = new C6203(c6127, new C6125(c1245)).m11634();
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(c6131M11634.f16770.m11518());
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = bufferedInputStream.read(bArr);
                            if (i == -1) {
                                bufferedInputStream.close();
                                bufferedOutputStream.close();
                                c6131M11634.close();
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
            String strM13973 = AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵");
            String str3 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13973, e.toString(), e, true);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m11952(String str, String str2) {
        File file = new File(str2);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        C6127 c6127 = new C6127(new C6143());
        C1245 c1245 = new C1245(6);
        c1245.m2151(str);
        c1245.m2166(AbstractC8405.m13972(25), AbstractC8405.m13972(29));
        c1245.m2166(AbstractC8405.m13973("喵喵呜呜喵喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), AbstractC8405.m13973("喵呜喵呜呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵喵喵喵"));
        c1245.m2166(AbstractC8405.m13972(27), AbstractC8405.m13972(28));
        try {
            C6131 c6131M11634 = new C6203(c6127, new C6125(c1245)).m11634();
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(c6131M11634.f16770.m11518());
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = bufferedInputStream.read(bArr);
                            if (i == -1) {
                                bufferedInputStream.close();
                                bufferedOutputStream.close();
                                c6131M11634.close();
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
            throw new RuntimeException(AbstractC8405.m13972(30) + str + AbstractC8405.m13972(31) + str2, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m11953(java.lang.String r8, java.lang.String r9, java.util.Map r10) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p037.AbstractC6370.m11953(java.lang.String, java.lang.String, java.util.Map):java.lang.String");
    }
}
