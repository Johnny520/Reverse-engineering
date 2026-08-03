package Yue;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3787 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final char f6973 = 65535;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f6974 = 12;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f6975 = 32768;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f6976 = 24576;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f6977 = 1024;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f6978 = 512;

    /* JADX INFO: renamed from: ۥ */
    public char[] f500;

    /* JADX INFO: renamed from: ۥ۟ */
    public Reader f501;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f6979;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f6980;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f6981;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f6982;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f6983;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public String[] f6984;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public ArrayList<Integer> f6985;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int f6986;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean f6987;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public String f6988;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int f6989;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3787(Reader reader, int i) {
        this.f6983 = -1;
        this.f6984 = new String[512];
        this.f6985 = null;
        this.f6986 = 1;
        C8159.m26910(reader);
        C8159.m26903(reader.markSupported());
        this.f501 = reader;
        this.f500 = new char[Math.min(i, 32768)];
        m835();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static String m10392(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 31) + cArr[i + i4];
        }
        int i5 = i3 & C5111.f12118;
        String str = strArr[i5];
        if (str != null && m10393(cArr, i, i2, str)) {
            return str;
        }
        String str2 = new String(cArr, i, i2);
        strArr[i5] = str2;
        return str2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static boolean m10393(char[] cArr, int i, int i2, String str) {
        if (i2 != str.length()) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 == 0) {
                return true;
            }
            int i5 = i + 1;
            int i6 = i3 + 1;
            if (cArr[i] != str.charAt(i3)) {
                return false;
            }
            i = i5;
            i2 = i4;
            i3 = i6;
        }
    }

    public String toString() {
        int i = this.f6979;
        int i2 = this.f6981;
        return i - i2 < 0 ? "" : new String(this.f500, i2, i - i2);
    }

    /* JADX INFO: renamed from: ۥ */
    public void m834() {
        this.f6981++;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m835() {
        int i;
        int i2;
        boolean z;
        if (this.f6987 || (i = this.f6981) < this.f6980) {
            return;
        }
        int i3 = this.f6983;
        if (i3 != -1) {
            i2 = i - i3;
            i = i3;
        } else {
            i2 = 0;
        }
        try {
            long j = i;
            long jSkip = this.f501.skip(j);
            this.f501.mark(32768);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 > 1024) {
                    break;
                }
                Reader reader = this.f501;
                char[] cArr = this.f500;
                int i5 = reader.read(cArr, i4, cArr.length - i4);
                if (i5 == -1) {
                    this.f6987 = true;
                }
                if (i5 <= 0) {
                    break;
                } else {
                    i4 += i5;
                }
            }
            this.f501.reset();
            if (i4 > 0) {
                if (jSkip != j) {
                    z = false;
                }
                C8159.m26903(z);
                this.f6979 = i4;
                this.f6982 += i;
                this.f6981 = i2;
                if (this.f6983 != -1) {
                    this.f6983 = 0;
                }
                this.f6980 = Math.min(i4, f6976);
            }
            m10437();
            this.f6988 = null;
        } catch (IOException e) {
            throw new C8098(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m10394() {
        Reader reader = this.f501;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.f501 = null;
            this.f500 = null;
            this.f6984 = null;
            throw th;
        }
        this.f501 = null;
        this.f500 = null;
        this.f6984 = null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m10395() {
        return m10396(m10432());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m10396(int i) {
        int iM10416;
        if (m10415() && (iM10416 = m10416(i)) != -1) {
            return (i - this.f6985.get(iM10416).intValue()) + 1;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public char m10397() {
        m835();
        char c = m10414() ? (char) 65535 : this.f500[this.f6981];
        this.f6981++;
        return c;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public String m10398(boolean z) {
        int i = this.f6981;
        int i2 = this.f6979;
        char[] cArr = this.f500;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0) {
                break;
            }
            if (c != '\"') {
                if (c == '&' || (c == '\'' && z)) {
                    break;
                }
                i3++;
            } else {
                if (!z) {
                    break;
                }
                i3++;
            }
        }
        this.f6981 = i3;
        return i3 > i ? m10392(this.f500, this.f6984, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public String m10399() {
        int i = this.f6981;
        int i2 = this.f6979;
        char[] cArr = this.f500;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.f6981 = i3;
        return i3 > i ? m10392(this.f500, this.f6984, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public String m10400() {
        int i;
        char c;
        m835();
        int i2 = this.f6981;
        while (true) {
            i = this.f6981;
            if (i >= this.f6979 || (c = this.f500[i]) < '0' || c > '9') {
                break;
            }
            this.f6981 = i + 1;
        }
        return m10392(this.f500, this.f6984, i2, i - i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public String m10401() {
        int i;
        char c;
        m835();
        int i2 = this.f6981;
        while (true) {
            i = this.f6981;
            if (i >= this.f6979 || (((c = this.f500[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.f6981 = i + 1;
        }
        return m10392(this.f500, this.f6984, i2, i - i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public String m10402() {
        char c;
        m835();
        int i = this.f6981;
        while (true) {
            int i2 = this.f6981;
            if (i2 >= this.f6979 || (((c = this.f500[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f6981++;
        }
        return m10392(this.f500, this.f6984, i, this.f6981 - i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public String m10403() {
        char c;
        m835();
        int i = this.f6981;
        while (true) {
            int i2 = this.f6981;
            if (i2 >= this.f6979 || (((c = this.f500[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f6981++;
        }
        while (!m10414()) {
            char[] cArr = this.f500;
            int i3 = this.f6981;
            char c2 = cArr[i3];
            if (c2 < '0' || c2 > '9') {
                break;
            }
            this.f6981 = i3 + 1;
        }
        return m10392(this.f500, this.f6984, i, this.f6981 - i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public String m10404() {
        int i = this.f6981;
        int i2 = this.f6979;
        char[] cArr = this.f500;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '<') {
                break;
            }
            i3++;
        }
        this.f6981 = i3;
        return i3 > i ? m10392(this.f500, this.f6984, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public String m10405() {
        m835();
        int i = this.f6981;
        int i2 = this.f6979;
        char[] cArr = this.f500;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ' || c == '/' || c == '<' || c == '>') {
                break;
            }
            i3++;
        }
        this.f6981 = i3;
        return i3 > i ? m10392(this.f500, this.f6984, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public String m10406(char c) {
        int iM10430 = m10430(c);
        if (iM10430 == -1) {
            return m10410();
        }
        String strM10392 = m10392(this.f500, this.f6984, this.f6981, iM10430);
        this.f6981 += iM10430;
        return strM10392;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public String m10407(String str) {
        int iM10431 = m10431(str);
        if (iM10431 != -1) {
            String strM10392 = m10392(this.f500, this.f6984, this.f6981, iM10431);
            this.f6981 += iM10431;
            return strM10392;
        }
        if (this.f6979 - this.f6981 < str.length()) {
            return m10410();
        }
        int length = (this.f6979 - str.length()) + 1;
        char[] cArr = this.f500;
        String[] strArr = this.f6984;
        int i = this.f6981;
        String strM103922 = m10392(cArr, strArr, i, length - i);
        this.f6981 = length;
        return strM103922;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public String m10408(char... cArr) {
        m835();
        int i = this.f6981;
        int i2 = this.f6979;
        char[] cArr2 = this.f500;
        int i3 = i;
        loop0: while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.f6981 = i3;
        return i3 > i ? m10392(this.f500, this.f6984, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public String m10409(char... cArr) {
        m835();
        int i = this.f6981;
        int i2 = this.f6979;
        char[] cArr2 = this.f500;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.f6981 = i3;
        return i3 > i ? m10392(this.f500, this.f6984, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public String m10410() {
        m835();
        char[] cArr = this.f500;
        String[] strArr = this.f6984;
        int i = this.f6981;
        String strM10392 = m10392(cArr, strArr, i, this.f6979 - i);
        this.f6981 = this.f6979;
        return strM10392;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean m10411(String str) {
        if (str.equals(this.f6988)) {
            int i = this.f6989;
            if (i == -1) {
                return false;
            }
            if (i >= this.f6981) {
                return true;
            }
        }
        this.f6988 = str;
        Locale locale = Locale.ENGLISH;
        int iM10431 = m10431(str.toLowerCase(locale));
        if (iM10431 > -1) {
            this.f6989 = this.f6981 + iM10431;
            return true;
        }
        int iM104312 = m10431(str.toUpperCase(locale));
        boolean z = iM104312 > -1;
        this.f6989 = z ? this.f6981 + iM104312 : -1;
        return z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public char m10412() {
        m835();
        if (m10414()) {
            return (char) 65535;
        }
        return this.f500[this.f6981];
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean m10413() {
        m835();
        return this.f6981 >= this.f6979;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final boolean m10414() {
        return this.f6981 >= this.f6979;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean m10415() {
        return this.f6985 != null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final int m10416(int i) {
        if (!m10415()) {
            return 0;
        }
        int iBinarySearch = Collections.binarySearch(this.f6985, Integer.valueOf(i));
        return iBinarySearch < -1 ? Math.abs(iBinarySearch) - 2 : iBinarySearch;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int m10417() {
        return m10418(m10432());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public int m10418(int i) {
        if (!m10415()) {
            return 1;
        }
        int iM10416 = m10416(i);
        return iM10416 == -1 ? this.f6986 : iM10416 + this.f6986 + 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public void m10419() {
        if (this.f6979 - this.f6981 < 1024) {
            this.f6980 = 0;
        }
        m835();
        this.f6983 = this.f6981;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean m10420(String str) {
        m835();
        if (!m10423(str)) {
            return false;
        }
        this.f6981 += str.length();
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public boolean m10421(String str) {
        if (!m10428(str)) {
            return false;
        }
        this.f6981 += str.length();
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public boolean m10422(char c) {
        return !m10413() && this.f500[this.f6981] == c;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public boolean m10423(String str) {
        m835();
        int length = str.length();
        if (length > this.f6979 - this.f6981) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != this.f500[this.f6981 + i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public boolean m10424(char... cArr) {
        if (m10413()) {
            return false;
        }
        m835();
        char c = this.f500[this.f6981];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public boolean m10425(char[] cArr) {
        m835();
        return !m10413() && Arrays.binarySearch(cArr, this.f500[this.f6981]) >= 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public boolean m10426() {
        if (m10413()) {
            return false;
        }
        char c = this.f500[this.f6981];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public boolean m10427() {
        char c;
        return !m10413() && (c = this.f500[this.f6981]) >= '0' && c <= '9';
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public boolean m10428(String str) {
        m835();
        int length = str.length();
        if (length > this.f6979 - this.f6981) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(this.f500[this.f6981 + i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public boolean m10429() {
        if (m10413()) {
            return false;
        }
        char c = this.f500[this.f6981];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public int m10430(char c) {
        m835();
        for (int i = this.f6981; i < this.f6979; i++) {
            if (c == this.f500[i]) {
                return i - this.f6981;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public int m10431(CharSequence charSequence) {
        m835();
        char cCharAt = charSequence.charAt(0);
        int i = this.f6981;
        while (i < this.f6979) {
            if (cCharAt != this.f500[i]) {
                do {
                    i++;
                    if (i >= this.f6979) {
                        break;
                    }
                } while (cCharAt != this.f500[i]);
            }
            int i2 = i + 1;
            int length = (charSequence.length() + i2) - 1;
            int i3 = this.f6979;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && charSequence.charAt(i5) == this.f500[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.f6981;
                }
            }
            i = i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public int m10432() {
        return this.f6982 + this.f6981;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public String m10433() {
        return m10417() + ":" + m10395();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public boolean m10434(int i, int i2, String str) {
        return m10393(this.f500, i, i2, str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public boolean m10435() {
        return this.f6987;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public void m10436() {
        int i = this.f6983;
        if (i == -1) {
            throw new C8098(new IOException("Mark invalid"));
        }
        this.f6981 = i;
        m10440();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final void m10437() {
        if (m10415()) {
            if (this.f6985.size() > 0) {
                int iM10416 = m10416(this.f6982);
                if (iM10416 == -1) {
                    iM10416 = 0;
                }
                Integer num = this.f6985.get(iM10416);
                num.intValue();
                this.f6986 += iM10416;
                this.f6985.clear();
                this.f6985.add(num);
            }
            for (int i = this.f6981; i < this.f6979; i++) {
                if (this.f500[i] == '\n') {
                    this.f6985.add(Integer.valueOf(this.f6982 + 1 + i));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m10438(boolean z) {
        if (z && this.f6985 == null) {
            this.f6985 = new ArrayList<>(409);
            m10437();
        } else {
            if (z) {
                return;
            }
            this.f6985 = null;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m10439() {
        int i = this.f6981;
        if (i < 1) {
            throw new C8098(new IOException("WTF: No buffer left to unconsume."));
        }
        this.f6981 = i - 1;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m10440() {
        this.f6983 = -1;
    }

    public C3787(Reader reader) {
        this(reader, 32768);
    }

    public C3787(String str) {
        this(new StringReader(str), str.length());
    }
}
