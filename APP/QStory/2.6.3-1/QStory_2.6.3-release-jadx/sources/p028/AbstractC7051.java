package p028;

import androidx.window.area.AbstractC3400;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import kotlin.text.Regex;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;
import okio.ByteString;
import p017.C6913;
import p020.C6943;
import p023.C6960;
import p023.C6967;
import p023.C6978;
import p023.C6980;
import p023.C6985;
import p029.AbstractC7054;
import p029.AbstractC7055;
import p029.AbstractC7059;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲苏子.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7051 {
    static {
        ByteString.Companion.getClass();
        C6943.m12069("\"\\");
        C6943.m12069("\t ,=");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12233(C6967 c6967, C6978 c6978, C6980 c6980) {
        List listUnmodifiableList;
        List listUnmodifiableList2;
        C6985 c6985;
        C6978 c69782;
        String strSubstring;
        c6967.getClass();
        c6978.getClass();
        c6980.getClass();
        if (c6967 == C6967.f17152) {
            return;
        }
        Pattern pattern = C6985.f17270;
        int size = c6980.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if ("Set-Cookie".equalsIgnoreCase(c6980.m12109(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(c6980.m12111(i));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        } else {
            listUnmodifiableList = null;
        }
        if (listUnmodifiableList == null) {
            listUnmodifiableList = EmptyList.INSTANCE;
        }
        List list = listUnmodifiableList;
        int size2 = list.size();
        ArrayList arrayList2 = null;
        for (int i2 = 0; i2 < size2; i2++) {
            String str = (String) list.get(i2);
            str.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = AbstractC7054.f17503;
            int length = str.length();
            char c = TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER;
            int iM12237 = AbstractC7054.m12237(str, TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER, 0, length);
            char c2 = SignatureVisitor.INSTANCEOF;
            int iM122372 = AbstractC7054.m12237(str, SignatureVisitor.INSTANCEOF, 0, iM12237);
            if (iM122372 == iM12237) {
                c6985 = null;
            } else {
                int iM12243 = AbstractC7054.m12243(0, iM122372, str);
                String strSubstring2 = str.substring(iM12243, AbstractC7054.m12242(iM12243, iM122372, str));
                if (strSubstring2.length() != 0 && AbstractC7054.m12235(strSubstring2) == -1) {
                    int iM122432 = AbstractC7054.m12243(iM122372 + 1, iM12237, str);
                    String strSubstring3 = str.substring(iM122432, AbstractC7054.m12242(iM122432, iM12237, str));
                    if (AbstractC7054.m12235(strSubstring3) == -1) {
                        int i3 = iM12237 + 1;
                        int length2 = str.length();
                        long j = 253402300799999L;
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        long jM5621 = 253402300799999L;
                        String str2 = null;
                        String strSubstring4 = null;
                        long j2 = -1;
                        boolean z4 = true;
                        String str3 = null;
                        while (true) {
                            if (i3 < length2) {
                                int iM122373 = AbstractC7054.m12237(str, c, i3, length2);
                                int iM122374 = AbstractC7054.m12237(str, c2, i3, iM122373);
                                int iM122433 = AbstractC7054.m12243(i3, iM122374, str);
                                String strSubstring5 = str.substring(iM122433, AbstractC7054.m12242(iM122433, iM122374, str));
                                if (iM122374 < iM122373) {
                                    int iM122434 = AbstractC7054.m12243(iM122374 + 1, iM122373, str);
                                    strSubstring = str.substring(iM122434, AbstractC7054.m12242(iM122434, iM122373, str));
                                } else {
                                    strSubstring = "";
                                }
                                if (strSubstring5.equalsIgnoreCase("expires")) {
                                    try {
                                        jM5621 = AbstractC3400.m5621(strSubstring.length(), strSubstring);
                                        z3 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                } else if (strSubstring5.equalsIgnoreCase("max-age")) {
                                    try {
                                        j2 = Long.parseLong(strSubstring);
                                        if (j2 <= 0) {
                                            j2 = Long.MIN_VALUE;
                                        }
                                    } catch (NumberFormatException e) {
                                        if (!new Regex("-?\\d+").matches(strSubstring)) {
                                            throw e;
                                        }
                                        j2 = AbstractC5971.m10698(strSubstring, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    z3 = true;
                                } else if (strSubstring5.equalsIgnoreCase("domain")) {
                                    if (strSubstring.endsWith(".")) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    String strM12248 = AbstractC7055.m12248(AbstractC5976.m10706(strSubstring, "."));
                                    if (strM12248 == null) {
                                        throw new IllegalArgumentException();
                                    }
                                    str2 = strM12248;
                                    z4 = false;
                                } else if (strSubstring5.equalsIgnoreCase("path")) {
                                    strSubstring4 = strSubstring;
                                } else if (strSubstring5.equalsIgnoreCase("secure")) {
                                    z = true;
                                } else if (strSubstring5.equalsIgnoreCase("httponly")) {
                                    z2 = true;
                                } else if (strSubstring5.equalsIgnoreCase("samesite")) {
                                    str3 = strSubstring;
                                }
                                i3 = iM122373 + 1;
                                c = TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER;
                                c2 = SignatureVisitor.INSTANCEOF;
                            } else {
                                if (j2 == Long.MIN_VALUE) {
                                    c69782 = c6978;
                                    j = Long.MIN_VALUE;
                                } else if (j2 != -1) {
                                    long j3 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * 1000 : Long.MAX_VALUE);
                                    if (j3 < jCurrentTimeMillis || j3 > 253402300799999L) {
                                        c69782 = c6978;
                                    } else {
                                        c69782 = c6978;
                                        j = j3;
                                    }
                                } else {
                                    c69782 = c6978;
                                    j = jM5621;
                                }
                                String str4 = c69782.f17226;
                                if (str2 == null) {
                                    str2 = str4;
                                } else if (!AbstractC5227.m9466(str4, str2) && (!AbstractC5971.m10690(str4, str2) || str4.charAt((str4.length() - str2.length()) - 1) != '.' || AbstractC7055.f17504.matches(str4))) {
                                }
                                if (str4.length() == str2.length() || C6913.f16980.m11998(str2) != null) {
                                    if (strSubstring4 == null || !AbstractC5971.m10698(strSubstring4, "/", false)) {
                                        String strM12102 = c69782.m12102();
                                        int iM10724 = AbstractC5976.m10724(strM12102, '/', 0, 6);
                                        strSubstring4 = iM10724 != 0 ? strM12102.substring(0, iM10724) : "/";
                                    }
                                    c6985 = new C6985(strSubstring2, strSubstring3, j, str2, strSubstring4, z, z2, z3, z4, str3);
                                }
                            }
                        }
                    }
                    c6985 = null;
                }
            }
            if (c6985 != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(c6985);
            }
        }
        if (arrayList2 != null) {
            listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
            listUnmodifiableList2.getClass();
        } else {
            listUnmodifiableList2 = null;
        }
        if (listUnmodifiableList2 == null) {
            listUnmodifiableList2 = EmptyList.INSTANCE;
        }
        listUnmodifiableList2.isEmpty();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m12234(C6960 c6960) {
        if (AbstractC5227.m9466(c6960.f17118.f17060, "HEAD")) {
            return false;
        }
        int i = c6960.f17111;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || AbstractC7059.m12253(c6960) != -1) {
            return true;
        }
        String strM12110 = c6960.f17114.m12110("Transfer-Encoding");
        if (strM12110 == null) {
            strM12110 = null;
        }
        return "chunked".equalsIgnoreCase(strM12110);
    }
}
