package p053;

import androidx.compose.runtime.internal.C2080;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.AbstractC3897;
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
import java.util.concurrent.TimeUnit;
import kotlin.text.Regex;
import p019.AbstractC6918;
import p023.AbstractC6962;
import p023.C6951;
import p023.C6954;
import p023.C6956;
import p023.C6960;
import p023.C6972;
import p023.C6973;
import p023.C6976;
import p026.AbstractC7017;
import p027.C7032;
import p029.AbstractC7059;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子苏兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7199 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f17871 = 0;

    static {
        AbstractC9234.m14531(26);
        AbstractC9234.m14531(29);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static String m12506(String str, String str2, HashMap map) {
        try {
            C6956 c6956 = new C6956(new C6972());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                str3.getClass();
                str4.getClass();
                arrayList.add(AbstractC6918.m12006(str3, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
                arrayList2.add(AbstractC6918.m12006(str4, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
            }
            C2080 c2080 = new C2080(6);
            c2080.m2711(str);
            c2080.m2726(AbstractC9234.m14532("喵喵呜呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵呜"), str2);
            c2080.m2726(AbstractC9234.m14531(25), AbstractC9234.m14531(29));
            c2080.m2726(AbstractC9234.m14532("喵喵呜呜喵喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), AbstractC9234.m14532("喵呜喵呜呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵喵喵喵"));
            c2080.m2726(AbstractC9234.m14531(27), AbstractC9234.m14531(28));
            c2080.m2718("POST", new C6976(arrayList, arrayList2));
            C6960 c6960M12193 = new C7032(c6956, new C6954(c2080)).m12193();
            String strM12078 = c6960M12193.f17115.m12078();
            c6960M12193.close();
            return strM12078;
        } catch (IOException e) {
            String strM14532 = AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵");
            String str5 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14532, e.toString(), e, true);
            return "";
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m12507(String str, String str2) throws Throwable {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        PrintWriter printWriter = null;
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            uRLConnectionOpenConnection.setRequestProperty(AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), AbstractC9234.m14532("喵呜喵呜呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵喵喵喵"));
            uRLConnectionOpenConnection.setRequestProperty(AbstractC9234.m14531(35), AbstractC9234.m14531(36));
            uRLConnectionOpenConnection.setRequestProperty(AbstractC9234.m14531(25), AbstractC9234.m14531(29));
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
                        sb.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
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
    public static String m12508(String str, String str2) {
        try {
            C6956 c6956 = new C6956(new C6972());
            C2080 c2080 = new C2080(6);
            c2080.m2711(str);
            c2080.m2726(AbstractC9234.m14532("喵喵呜呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵呜"), str2);
            c2080.m2726(AbstractC9234.m14531(25), AbstractC9234.m14531(29));
            c2080.m2726(AbstractC9234.m14532("喵喵呜呜喵喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), AbstractC9234.m14532("喵呜喵呜呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵喵喵喵"));
            c2080.m2726(AbstractC9234.m14531(27), AbstractC9234.m14531(28));
            c2080.m2718("GET", null);
            C6960 c6960M12193 = new C7032(c6956, new C6954(c2080)).m12193();
            String strM12078 = c6960M12193.f17115.m12078();
            c6960M12193.close();
            return strM12078;
        } catch (IOException e) {
            String strM14532 = AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵");
            String str3 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14532, e.toString(), e, true);
            return "";
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m12509(String str) {
        try {
            C6956 c6956 = new C6956(new C6972());
            C2080 c2080 = new C2080(6);
            c2080.m2711(str);
            c2080.m2718("GET", null);
            c2080.m2726(AbstractC9234.m14531(25), AbstractC9234.m14531(34));
            c2080.m2726(AbstractC9234.m14532("喵喵呜呜喵喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), AbstractC9234.m14532("喵呜喵呜呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵喵喵喵"));
            c2080.m2726(AbstractC9234.m14531(27), AbstractC9234.m14531(28));
            C6960 c6960M12193 = new C7032(c6956, new C6954(c2080)).m12193();
            String strM12078 = c6960M12193.f17115.m12078();
            c6960M12193.close();
            return strM12078;
        } catch (IOException e) {
            String strM14532 = AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵");
            String str2 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14532, e.toString(), e, true);
            return "";
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m12510(String str, String str2) {
        File file = new File(str2);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        C6956 c6956 = new C6956(new C6972());
        C2080 c2080 = new C2080(6);
        c2080.m2711(str);
        c2080.m2726(AbstractC9234.m14531(25), AbstractC9234.m14531(26));
        c2080.m2726(AbstractC9234.m14532("喵喵呜呜喵喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), AbstractC9234.m14532("喵呜喵呜呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵喵喵喵"));
        c2080.m2726(AbstractC9234.m14531(27), AbstractC9234.m14531(28));
        try {
            C6960 c6960M12193 = new C7032(c6956, new C6954(c2080)).m12193();
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(c6960M12193.f17115.m12077());
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = bufferedInputStream.read(bArr);
                            if (i == -1) {
                                bufferedInputStream.close();
                                bufferedOutputStream.close();
                                c6960M12193.close();
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
            String strM14532 = AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵");
            String str3 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14532, e.toString(), e, true);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12511(String str, String str2) {
        File file = new File(str2);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        C6956 c6956 = new C6956(new C6972());
        C2080 c2080 = new C2080(6);
        c2080.m2711(str);
        c2080.m2726(AbstractC9234.m14531(25), AbstractC9234.m14531(29));
        c2080.m2726(AbstractC9234.m14532("喵喵呜呜喵喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), AbstractC9234.m14532("喵呜喵呜呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵喵喵喵"));
        c2080.m2726(AbstractC9234.m14531(27), AbstractC9234.m14531(28));
        try {
            C6960 c6960M12193 = new C7032(c6956, new C6954(c2080)).m12193();
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(c6960M12193.f17115.m12077());
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = bufferedInputStream.read(bArr);
                            if (i == -1) {
                                bufferedInputStream.close();
                                bufferedOutputStream.close();
                                c6960M12193.close();
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
            throw new RuntimeException(AbstractC9234.m14531(30) + str + AbstractC9234.m14531(31) + str2, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m12512(String str, String str2, Map map) {
        int i;
        if (map != null) {
            try {
                i = map.containsKey(AbstractC9234.m14532("喵喵呜喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜喵~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜")) ? Integer.parseInt((String) map.getOrDefault(AbstractC9234.m14532("喵喵呜喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜喵~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜"), AbstractC9234.m14532("喵呜喵喵喵呜呜喵~喵呜喵喵喵呜喵呜~喵呜喵喵呜喵呜喵~喵呜喵呜呜喵喵喵"))) : 5000;
            } catch (IOException e) {
                String strM14532 = AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵");
                String str3 = AbstractC7017.f17361;
                AbstractC7017.m12164(strM14532, e.toString(), e, true);
                return "";
            }
        }
        if (map != null && map.containsKey(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜喵~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜"))) {
            i = Integer.parseInt((String) map.getOrDefault(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜喵~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜"), AbstractC9234.m14532("喵呜喵喵喵呜呜喵~喵呜喵喵喵呜喵呜~喵呜喵喵呜喵呜喵~喵呜喵呜呜喵喵喵")));
        }
        C6972 c6972 = new C6972();
        long j = i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        c6972.f17188 = AbstractC7059.m12256(j, timeUnit);
        c6972.f17178 = AbstractC7059.m12256(j, timeUnit);
        c6972.f17177 = AbstractC7059.m12256(j, timeUnit);
        C6956 c6956 = new C6956(c6972);
        String strM14531 = AbstractC9234.m14531(32);
        Regex regex = C6973.f17204;
        C6973 c6973M7271 = AbstractC3888.m7271(strM14531);
        int i2 = AbstractC6962.f17134;
        C6951 c6951M7401 = AbstractC3897.m7401(str2, c6973M7271);
        C2080 c2080 = new C2080(6);
        c2080.m2711(str);
        c2080.m2718("POST", c6951M7401);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                c2080.m2726((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!map.containsKey(AbstractC9234.m14531(25))) {
            c2080.m2726(AbstractC9234.m14531(25), AbstractC9234.m14531(29));
        }
        C6960 c6960M12193 = new C7032(c6956, new C6954(c2080)).m12193();
        try {
            if (c6960M12193.f17109) {
                String strM12078 = c6960M12193.f17115.m12078();
                c6960M12193.close();
                return strM12078;
            }
            String strM145322 = AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵");
            IOException iOException = new IOException(AbstractC9234.m14531(33) + c6960M12193);
            String str4 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM145322, iOException.toString(), iOException, true);
            c6960M12193.close();
            return "";
        } finally {
        }
    }
}
