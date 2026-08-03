package Yue;

import java.io.FileReader;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۡۦ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7013 implements InterfaceC6349 {

    /* JADX INFO: renamed from: ۥ */
    public String[] f2630;

    /* JADX INFO: renamed from: ۥ۟ */
    public String[] f2631;

    public C7013(String[] strArr, String[] strArr2, int i) {
        String[] strArr3 = new String[i];
        this.f2630 = strArr3;
        this.f2631 = new String[i];
        System.arraycopy(strArr, 0, strArr3, 0, strArr3.length);
        String[] strArr4 = this.f2631;
        System.arraycopy(strArr2, 0, strArr4, 0, strArr4.length);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m21807(String[] strArr) throws Exception {
        C5901 c5901 = new C5901();
        c5901.m18425(new FileReader(strArr[0]));
        while (c5901.hasNext()) {
            if (c5901.mo18328()) {
                PrintStream printStream = System.out;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("context[");
                stringBuffer.append(c5901.mo2574());
                stringBuffer.append("]");
                printStream.println(stringBuffer.toString());
                Iterator itMo19844 = c5901.mo2574().mo19844(C6608.f2171);
                while (itMo19844.hasNext()) {
                    PrintStream printStream2 = System.out;
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Found prefix:");
                    stringBuffer2.append(itMo19844.next());
                    printStream2.println(stringBuffer2.toString());
                }
            }
            c5901.next();
        }
    }

    @Override // Yue.InterfaceC6349
    public String getPrefix(String str) {
        if (str == null) {
            throw new IllegalArgumentException("uri may not be null");
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("uri may not be empty string");
        }
        for (int length = this.f2631.length - 1; length >= 0; length--) {
            if (str.equals(this.f2631[length])) {
                String str2 = this.f2630[length];
                if (str2 == null) {
                    for (int length2 = this.f2631.length - 1; length2 > length; length2--) {
                        if (this.f2630[length2] == null) {
                            break;
                        }
                    }
                    return "";
                }
                for (int length3 = this.f2631.length - 1; length3 > length; length3--) {
                    if (str2.equals(this.f2630[length3])) {
                        break;
                    }
                }
                return str2;
            }
        }
        if ("http://www.w3.org/XML/1998/namespace".equals(str)) {
            return C8542.f3549;
        }
        if (C8542.f25376.equals(str)) {
            return "xmlns";
        }
        return null;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < this.f2631.length; i++) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("[");
            stringBuffer2.append(m3315(this.f2630[i]));
            stringBuffer2.append("<->");
            stringBuffer2.append(this.f2631[i]);
            stringBuffer2.append("]");
            stringBuffer.append(stringBuffer2.toString());
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: ۥ */
    public final String m3315(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public String m3316() {
        for (int length = this.f2631.length - 1; length >= 0; length--) {
            if (this.f2630[length] == null) {
                return this.f2631[length];
            }
        }
        return null;
    }

    @Override // Yue.InterfaceC6349
    /* JADX INFO: renamed from: ۥ۟۟ */
    public String mo19843(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Prefix may not be null.");
        }
        if (str.length() <= 0) {
            for (int length = this.f2631.length - 1; length >= 0; length--) {
                if (this.f2630[length] == null) {
                    return this.f2631[length];
                }
            }
            return null;
        }
        for (int length2 = this.f2631.length - 1; length2 >= 0; length2--) {
            if (str.equals(this.f2630[length2])) {
                return this.f2631[length2];
            }
        }
        if (C8542.f3549.equals(str)) {
            return "http://www.w3.org/XML/1998/namespace";
        }
        if ("xmlns".equals(str)) {
            return C8542.f25376;
        }
        return null;
    }

    @Override // Yue.InterfaceC6349
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public Iterator mo19844(String str) {
        if (str == null) {
            throw new IllegalArgumentException("uri may not be null");
        }
        if ("".equals(str)) {
            throw new IllegalArgumentException("uri may not be empty string");
        }
        HashSet hashSet = new HashSet();
        for (int length = this.f2631.length - 1; length >= 0; length--) {
            String strM3315 = m3315(this.f2630[length]);
            if (str.equals(this.f2631[length]) && !hashSet.contains(strM3315)) {
                if (strM3315.length() == 0) {
                    for (int length2 = this.f2631.length - 1; length2 > length; length2--) {
                        if (this.f2630[length2] == null) {
                            break;
                        }
                    }
                    hashSet.add(strM3315);
                } else {
                    for (int length3 = this.f2631.length - 1; length3 > length; length3--) {
                        if (strM3315.equals(this.f2630[length3])) {
                            break;
                        }
                    }
                    hashSet.add(strM3315);
                }
            }
        }
        return hashSet.iterator();
    }
}
