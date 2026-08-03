package Yue;

import Yue.C4483;
import Yue.C7003;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: Yue.ۥ۟ۢ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3454 implements Map.Entry<String, String>, Cloneable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final String[] f5568 = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final Pattern f5569 = Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final Pattern f5570 = Pattern.compile("[^-a-zA-Z0-9_:.]");

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final Pattern f5571 = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"'/=]+");

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final Pattern f5572 = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]");

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public String f5573;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public String f5574;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public C3456 f5575;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3454(String str, String str2) {
        this(str, str2, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C3454 m9126(String str, String str2) {
        return new C3454(str, C4645.m13975(str2, true), null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static String m9127(String str, C4483.C0414.EnumC4484 enumC4484) {
        if (enumC4484 == C4483.C0414.EnumC4484.xml) {
            Pattern pattern = f5569;
            if (!pattern.matcher(str).matches()) {
                String strReplaceAll = f5570.matcher(str).replaceAll("");
                if (pattern.matcher(strReplaceAll).matches()) {
                    return strReplaceAll;
                }
                return null;
            }
        }
        if (enumC4484 == C4483.C0414.EnumC4484.html) {
            Pattern pattern2 = f5571;
            if (!pattern2.matcher(str).matches()) {
                String strReplaceAll2 = f5572.matcher(str).replaceAll("");
                if (pattern2.matcher(strReplaceAll2).matches()) {
                    return strReplaceAll2;
                }
                return null;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m9128(String str, String str2, Appendable appendable, C4483.C0414 c0414) throws IOException {
        String strM9127 = m9127(str, c0414.m13028());
        if (strM9127 == null) {
            return;
        }
        m9129(strM9127, str2, appendable, c0414);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m9129(String str, String str2, Appendable appendable, C4483.C0414 c0414) throws IOException {
        appendable.append(str);
        if (m9132(str, str2, c0414)) {
            return;
        }
        appendable.append("=\"");
        C4645.m13969(appendable, C3456.m9182(str2), c0414, true, false, false, false);
        appendable.append(C8039.f3212);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static boolean m9130(String str) {
        return Arrays.binarySearch(f5568, C6396.m2839(str)) >= 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static boolean m9131(String str) {
        return str.startsWith(C3456.f5585) && str.length() > 5;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static boolean m9132(String str, String str2, C4483.C0414 c0414) {
        return c0414.m13028() == C4483.C0414.EnumC4484.html && (str2 == null || ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && m9130(str)));
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3454 c3454 = (C3454) obj;
        String str = this.f5573;
        if (str == null ? c3454.f5573 != null : !str.equals(c3454.f5573)) {
            return false;
        }
        String str2 = this.f5574;
        String str3 = c3454.f5574;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        String str = this.f5573;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f5574;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return m9137();
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3454 clone() {
        try {
            return (C3454) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: getKey()Ljava/lang/Object; */
    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public String getKey() {
        return this.f5573;
    }

    /* JADX DEBUG: Method merged with bridge method: getValue()Ljava/lang/Object; */
    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public String getValue() {
        return C3456.m9182(this.f5574);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m9136() {
        return this.f5574 != null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public String m9137() {
        StringBuilder sbM3765 = C7615.m3765();
        try {
            m9138(sbM3765, new C4483("").m13001());
            return C7615.m23825(sbM3765);
        } catch (IOException e) {
            throw new C7370(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m9138(Appendable appendable, C4483.C0414 c0414) throws IOException {
        m9128(this.f5573, this.f5574, appendable, c0414);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m9139() {
        return m9131(this.f5573);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m9140(String str) {
        int iM9204;
        C8159.m26910(str);
        String strTrim = str.trim();
        C8159.m26907(strTrim);
        C3456 c3456 = this.f5575;
        if (c3456 != null && (iM9204 = c3456.m9204(this.f5573)) != -1) {
            C3456 c34562 = this.f5575;
            String[] strArr = c34562.f5591;
            String str2 = strArr[iM9204];
            strArr[iM9204] = strTrim;
            Map<String, C7003.C1135> mapM9197 = c34562.m9197();
            if (mapM9197 != null) {
                mapM9197.put(strTrim, mapM9197.remove(str2));
            }
        }
        this.f5573 = strTrim;
    }

    /* JADX DEBUG: Method merged with bridge method: setValue(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public String setValue(String str) {
        int iM9204;
        String strM9195 = this.f5574;
        C3456 c3456 = this.f5575;
        if (c3456 != null && (iM9204 = c3456.m9204(this.f5573)) != -1) {
            strM9195 = this.f5575.m9195(this.f5573);
            this.f5575.f5592[iM9204] = str;
        }
        this.f5574 = str;
        return C3456.m9182(strM9195);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean m9142(C4483.C0414 c0414) {
        return m9132(this.f5573, this.f5574, c0414);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public C7003.C1135 m9143() {
        C3456 c3456 = this.f5575;
        return c3456 == null ? C7003.C1135.f21147 : c3456.m9214(this.f5573);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3454(String str, String str2, C3456 c3456) {
        C8159.m26910(str);
        String strTrim = str.trim();
        C8159.m26907(strTrim);
        this.f5573 = strTrim;
        this.f5574 = str2;
        this.f5575 = c3456;
    }
}
