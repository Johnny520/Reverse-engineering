package Yue;

import net.bytebuddy.utility.JavaConstant;

/* JADX INFO: renamed from: Yue.ۥۢۡۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7863 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final char f23514 = '\\';

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String[] f23515 = {"*|", "|", JavaConstant.Dynamic.DEFAULT_NAME, "-"};

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String[] f23516 = {"-", JavaConstant.Dynamic.DEFAULT_NAME};

    /* JADX INFO: renamed from: ۥ */
    public String f3119;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f3120 = 0;

    public C7863(String str) {
        C8159.m26910(str);
        this.f3119 = str;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static String m24975(String str) {
        StringBuilder sbM3765 = C7615.m3765();
        C7863 c7863 = new C7863(str);
        while (!c7863.m24990()) {
            if (c7863.m24995(f23515)) {
                sbM3765.append(c7863.m24980());
            } else {
                sbM3765.append('\\');
                sbM3765.append(c7863.m24980());
            }
        }
        return C7615.m23825(sbM3765);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static String m24976(String str) {
        StringBuilder sbM3765 = C7615.m3765();
        char c = 0;
        for (char c2 : str.toCharArray()) {
            if (c2 == '\\') {
                if (c == '\\') {
                    sbM3765.append(c2);
                    c = 0;
                }
            } else {
                sbM3765.append(c2);
            }
            c = c2;
        }
        return C7615.m23825(sbM3765);
    }

    public String toString() {
        return this.f3119.substring(this.f3120);
    }

    /* JADX INFO: renamed from: ۥ */
    public void m3943(String str) {
        this.f3119 = str + this.f3119.substring(this.f3120);
        this.f3120 = 0;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m3944() {
        if (m24990()) {
            return;
        }
        this.f3120++;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007c A[LOOP:0: B:3:0x0009->B:44:0x007c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0055 A[EDGE_INSN: B:46:0x0055->B:38:0x0055 BREAK  A[LOOP:0: B:3:0x0009->B:44:0x007c], SYNTHETIC] */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m24977(char c, char c2) {
        int i = -1;
        int i2 = -1;
        char c3 = 0;
        boolean z = false;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        while (!m24990()) {
            char cM24980 = m24980();
            if (c3 != '\\') {
                if (cM24980 == '\'' && cM24980 != c && !z) {
                    z2 = !z2;
                } else if (cM24980 == '\"' && cM24980 != c && !z2) {
                    z = !z;
                }
                if (!z2 && !z && !z3) {
                    if (cM24980 == c) {
                        i3++;
                        if (i == -1) {
                            i = this.f3120;
                        }
                    } else if (cM24980 == c2) {
                        i3--;
                    }
                }
                if (i3 > 0) {
                    break;
                }
                c3 = cM24980;
            } else if (cM24980 == 'Q') {
                z3 = true;
            } else if (cM24980 == 'E') {
                z3 = false;
            }
            if (i3 > 0 && c3 != 0) {
                i2 = this.f3120;
            }
            if (i3 > 0) {
            }
        }
        String strSubstring = i2 >= 0 ? this.f3119.substring(i, i2) : "";
        if (i3 > 0) {
            C8159.m26899("Did not find balanced marker at '" + strSubstring + "'");
        }
        return strSubstring;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String m24978(String str) {
        String strM24985 = m24985(str);
        m24991(str);
        return strM24985;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public String m24979(String str) {
        String strM24987 = m24987(str);
        m24991(str);
        return strM24987;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public char m24980() {
        String str = this.f3119;
        int i = this.f3120;
        this.f3120 = i + 1;
        return str.charAt(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m24981(String str) {
        if (!m24992(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        if (length > m24999()) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.f3120 += length;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public String m24982() {
        return m24984(f23516);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public String m24983() {
        return m24984(f23515);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final String m24984(String... strArr) {
        int i = this.f3120;
        boolean z = false;
        while (!m24990()) {
            if (this.f3119.charAt(this.f3120) == '\\' && m24999() > 1) {
                this.f3120 += 2;
                z = true;
            } else {
                if (!m24995(strArr)) {
                    break;
                }
                this.f3120++;
            }
        }
        String strSubstring = this.f3119.substring(i, this.f3120);
        return z ? m24976(strSubstring) : strSubstring;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public String m24985(String str) {
        int iIndexOf = this.f3119.indexOf(str, this.f3120);
        if (iIndexOf == -1) {
            return m24998();
        }
        String strSubstring = this.f3119.substring(this.f3120, iIndexOf);
        this.f3120 += strSubstring.length();
        return strSubstring;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public String m24986(String... strArr) {
        int i = this.f3120;
        while (!m24990() && !m24994(strArr)) {
            this.f3120++;
        }
        return this.f3119.substring(i, this.f3120);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public String m24987(String str) {
        int i = this.f3120;
        String strSubstring = str.substring(0, 1);
        boolean zEquals = strSubstring.toLowerCase().equals(strSubstring.toUpperCase());
        while (!m24990() && !m24992(str)) {
            if (zEquals) {
                int iIndexOf = this.f3119.indexOf(strSubstring, this.f3120);
                int i2 = this.f3120;
                int i3 = iIndexOf - i2;
                if (i3 == 0) {
                    this.f3120 = i2 + 1;
                } else if (i3 < 0) {
                    this.f3120 = this.f3119.length();
                } else {
                    this.f3120 = i2 + i3;
                }
            } else {
                this.f3120++;
            }
        }
        return this.f3119.substring(i, this.f3120);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m24988() {
        boolean z = false;
        while (m24996()) {
            this.f3120++;
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public String m24989() {
        int i = this.f3120;
        while (m24997()) {
            this.f3120++;
        }
        return this.f3119.substring(i, this.f3120);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public boolean m24990() {
        return m24999() == 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean m24991(String str) {
        if (!m24992(str)) {
            return false;
        }
        this.f3120 += str.length();
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public boolean m24992(String str) {
        return this.f3119.regionMatches(true, this.f3120, str, 0, str.length());
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean m24993(char... cArr) {
        if (m24990()) {
            return false;
        }
        for (char c : cArr) {
            if (this.f3119.charAt(this.f3120) == c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean m24994(String... strArr) {
        for (String str : strArr) {
            if (m24992(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean m24995(String... strArr) {
        return m24997() || m24994(strArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean m24996() {
        return !m24990() && C7615.m23818(this.f3119.charAt(this.f3120));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean m24997() {
        return !m24990() && Character.isLetterOrDigit(this.f3119.charAt(this.f3120));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public String m24998() {
        String strSubstring = this.f3119.substring(this.f3120);
        this.f3120 = this.f3119.length();
        return strSubstring;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final int m24999() {
        return this.f3119.length() - this.f3120;
    }
}
