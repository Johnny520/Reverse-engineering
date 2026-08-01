package p023;

import android.util.StateSet;
import androidx.window.area.AbstractC3400;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;
import p019.AbstractC6918;
import p025.AbstractC7012;
import p029.AbstractC7054;
import p029.AbstractC7055;
import p050.AbstractC7176;
import p064.C7341;
import p321.C9446;
import p321.C9469;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6977 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Object f17215;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Serializable f17216;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Serializable f17217;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f17218;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f17219;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17220;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Object f17221;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Object f17222;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public Object f17223;

    public C6977(int i) {
        this.f17220 = i;
        switch (i) {
            case 1:
                break;
            default:
                this.f17217 = "";
                this.f17216 = "";
                this.f17219 = -1;
                this.f17221 = AbstractC7176.m12475("");
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static ArrayList m12090(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iM10730 = AbstractC5976.m10730(str, '&', i, 4);
            if (iM10730 == -1) {
                iM10730 = str.length();
            }
            int iM107302 = AbstractC5976.m10730(str, SignatureVisitor.INSTANCEOF, i, 4);
            if (iM107302 == -1 || iM107302 > iM10730) {
                arrayList.add(str.substring(i, iM10730));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iM107302));
                arrayList.add(str.substring(iM107302 + 1, iM10730));
            }
            i = iM10730 + 1;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        switch (this.f17220) {
            case 0:
                StringBuilder sb = new StringBuilder();
                String str = (String) this.f17218;
                if (str != null) {
                    sb.append(str);
                    sb.append("://");
                } else {
                    sb.append("//");
                }
                if (((String) this.f17217).length() > 0 || ((String) this.f17216).length() > 0) {
                    sb.append((String) this.f17217);
                    if (((String) this.f17216).length() > 0) {
                        sb.append(':');
                        sb.append((String) this.f17216);
                    }
                    sb.append('@');
                }
                String str2 = (String) this.f17215;
                if (str2 != null) {
                    if (AbstractC5976.m10722(str2, ':')) {
                        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
                        sb.append((String) this.f17215);
                        sb.append(']');
                    } else {
                        sb.append((String) this.f17215);
                    }
                }
                int i = -1;
                if (this.f17219 != -1 || ((String) this.f17218) != null) {
                    int iM12092 = m12092();
                    String str3 = (String) this.f17218;
                    if (str3 == null) {
                        sb.append(':');
                        sb.append(iM12092);
                    } else {
                        if (str3.equals("http")) {
                            i = 80;
                        } else if (str3.equals("https")) {
                            i = 443;
                        }
                        if (iM12092 != i) {
                        }
                    }
                }
                ArrayList arrayList = (ArrayList) this.f17221;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append('/');
                    sb.append((String) arrayList.get(i2));
                }
                if (((ArrayList) this.f17223) != null) {
                    sb.append('?');
                    ArrayList arrayList2 = (ArrayList) this.f17223;
                    arrayList2.getClass();
                    C7341 c7341M5628 = AbstractC3400.m5628(AbstractC3400.m5627(0, arrayList2.size()), 2);
                    int i3 = c7341M5628.f18163;
                    int i4 = c7341M5628.f18161;
                    int i5 = c7341M5628.f18162;
                    if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                        while (true) {
                            String str4 = (String) arrayList2.get(i3);
                            String str5 = (String) arrayList2.get(i3 + 1);
                            if (i3 > 0) {
                                sb.append('&');
                            }
                            sb.append(str4);
                            if (str5 != null) {
                                sb.append(SignatureVisitor.INSTANCEOF);
                                sb.append(str5);
                            }
                            if (i3 != i4) {
                                i3 += i5;
                            }
                        }
                    }
                }
                if (((String) this.f17222) != null) {
                    sb.append('#');
                    sb.append((String) this.f17222);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, 飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲苏兰世[]] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m12091() {
        this.f17218 = new C9469();
        this.f17217 = new int[10][];
        this.f17216 = new C9469[10];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int m12092() {
        int i = this.f17219;
        if (i != -1) {
            return i;
        }
        String str = (String) this.f17218;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C9446 m12093() {
        if (this.f17219 == 0) {
            return null;
        }
        return new C9446(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C6978 m12094() {
        ArrayList arrayList;
        String str = (String) this.f17218;
        if (str == null) {
            C6755.m11870("scheme == null");
            return null;
        }
        String strM12004 = AbstractC6918.m12004(0, 0, (String) this.f17217, 7);
        String strM120042 = AbstractC6918.m12004(0, 0, (String) this.f17216, 7);
        String str2 = (String) this.f17215;
        if (str2 == null) {
            C6755.m11870("host == null");
            return null;
        }
        int iM12092 = m12092();
        ArrayList arrayList2 = (ArrayList) this.f17221;
        ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(AbstractC6918.m12004(0, 0, (String) it.next(), 7));
        }
        ArrayList<String> arrayList4 = (ArrayList) this.f17223;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(AbstractC5177.m9381(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList5.add(str3 != null ? AbstractC6918.m12004(0, 0, str3, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.f17222;
        return new C6978(str, strM12004, strM120042, str2, iM12092, arrayList3, arrayList, str4 != null ? AbstractC6918.m12004(0, 0, str4, 7) : null, toString());
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Serializable, java.lang.Object, 飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲苏兰世[]] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m12095(int[] iArr, C9469 c9469) {
        int i = this.f17219;
        if (i == 0 || iArr.length == 0) {
            this.f17218 = c9469;
        }
        int[][] iArr2 = (int[][]) this.f17217;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            ?? r3 = new int[i2][];
            System.arraycopy(iArr2, 0, r3, 0, i);
            this.f17217 = r3;
            ?? r1 = new C9469[i2];
            System.arraycopy((C9469[]) this.f17216, 0, r1, 0, i);
            this.f17216 = r1;
        }
        int[][] iArr3 = (int[][]) this.f17217;
        int i3 = this.f17219;
        iArr3[i3] = iArr;
        ((C9469[]) this.f17216)[i3] = c9469;
        this.f17219 = i3 + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m12096(String str, String str2) {
        str.getClass();
        if (((ArrayList) this.f17223) == null) {
            this.f17223 = new ArrayList();
        }
        ArrayList arrayList = (ArrayList) this.f17223;
        arrayList.getClass();
        arrayList.add(AbstractC6918.m12007(0, 0, str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91));
        ArrayList arrayList2 = (ArrayList) this.f17223;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? AbstractC6918.m12007(0, 0, str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m12097(C6978 c6978, String str) {
        int i;
        int iM12238;
        int i2;
        char cCharAt;
        ArrayList arrayList = (ArrayList) this.f17221;
        str.getClass();
        byte[] bArr = AbstractC7054.f17503;
        int iM12243 = AbstractC7054.m12243(0, str.length(), str);
        int iM12242 = AbstractC7054.m12242(iM12243, str.length(), str);
        byte b = -1;
        if (iM12242 - iM12243 < 2) {
            i = -1;
        } else {
            char cCharAt2 = str.charAt(iM12243);
            char c = 'a';
            if ((AbstractC5227.m9464(cCharAt2, 97) >= 0 && AbstractC5227.m9464(cCharAt2, 122) <= 0) || (AbstractC5227.m9464(cCharAt2, 65) >= 0 && AbstractC5227.m9464(cCharAt2, 90) <= 0)) {
                i = iM12243 + 1;
                while (true) {
                    if (i >= iM12242) {
                        break;
                    }
                    char cCharAt3 = str.charAt(i);
                    if ((c > cCharAt3 || cCharAt3 >= '{') && (('A' > cCharAt3 || cCharAt3 >= '[') && (('0' > cCharAt3 || cCharAt3 >= ':') && cCharAt3 != '+' && cCharAt3 != '-' && cCharAt3 != '.'))) {
                        if (cCharAt3 != ':') {
                            break;
                        }
                    } else {
                        i++;
                        c = 'a';
                    }
                }
                i = -1;
            }
        }
        if (i == -1) {
            if (c6978 == null) {
                C6755.m11869("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str.length() > 6 ? AbstractC5976.m10712(6, str).concat("...") : str));
                return;
            }
            this.f17218 = c6978.f17229;
        } else if (AbstractC5971.m10695(str, iM12243, "https:", true)) {
            this.f17218 = "https";
            iM12243 += 6;
        } else {
            if (!AbstractC5971.m10695(str, iM12243, "http:", true)) {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + '\'');
            }
            this.f17218 = "http";
            iM12243 += 5;
        }
        int i3 = 0;
        for (int i4 = iM12243; i4 < iM12242 && ((cCharAt = str.charAt(i4)) == '/' || cCharAt == '\\'); i4++) {
            i3++;
        }
        byte b2 = 35;
        if (i3 >= 2 || c6978 == null || !AbstractC5227.m9466(c6978.f17229, (String) this.f17218)) {
            int i5 = iM12243 + i3;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                iM12238 = AbstractC7054.m12238(i5, iM12242, str, "@/\\?#");
                byte bCharAt = iM12238 != iM12242 ? str.charAt(iM12238) : b;
                if (bCharAt == b || bCharAt == b2 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (z) {
                        this.f17216 = ((String) this.f17216) + "%40" + AbstractC6918.m12007(i5, iM12238, str, " \"':;<=>@[]^`{}|/\\?#", 112);
                    } else {
                        int iM12237 = AbstractC7054.m12237(str, ':', i5, iM12238);
                        String strM12007 = AbstractC6918.m12007(i5, iM12237, str, " \"':;<=>@[]^`{}|/\\?#", 112);
                        if (z2) {
                            strM12007 = ((String) this.f17217) + "%40" + strM12007;
                        }
                        this.f17217 = strM12007;
                        if (iM12237 != iM12238) {
                            this.f17216 = AbstractC6918.m12007(iM12237 + 1, iM12238, str, " \"':;<=>@[]^`{}|/\\?#", 112);
                            z = true;
                        }
                        z2 = true;
                    }
                    i5 = iM12238 + 1;
                    b = -1;
                    b2 = 35;
                }
            }
            int i6 = i5;
            while (true) {
                if (i6 >= iM12238) {
                    i6 = iM12238;
                    break;
                }
                char cCharAt4 = str.charAt(i6);
                if (cCharAt4 == ':') {
                    break;
                }
                if (cCharAt4 == '[') {
                    do {
                        i6++;
                        if (i6 < iM12238) {
                        }
                    } while (str.charAt(i6) != ']');
                }
                i6++;
            }
            int i7 = i6 + 1;
            if (i7 < iM12238) {
                this.f17215 = AbstractC7055.m12248(AbstractC6918.m12004(i5, i6, str, 4));
                try {
                    i2 = Integer.parseInt(AbstractC6918.m12007(i7, iM12238, str, "", 120));
                } catch (NumberFormatException unused) {
                }
                if (1 > i2 || i2 >= 65536) {
                    i2 = -1;
                }
                this.f17219 = i2;
                if (i2 == -1) {
                    throw new IllegalArgumentException(("Invalid URL port: \"" + str.substring(i7, iM12238) + '\"').toString());
                }
            } else {
                this.f17215 = AbstractC7055.m12248(AbstractC6918.m12004(i5, i6, str, 4));
                String str2 = (String) this.f17218;
                str2.getClass();
                this.f17219 = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
            }
            if (((String) this.f17215) == null) {
                throw new IllegalArgumentException(("Invalid URL host: \"" + str.substring(i5, i6) + '\"').toString());
            }
            iM12243 = iM12238;
        } else {
            this.f17217 = c6978.m12099();
            this.f17216 = c6978.m12103();
            this.f17215 = c6978.f17226;
            this.f17219 = c6978.f17225;
            arrayList.clear();
            arrayList.addAll(c6978.m12101());
            if (iM12243 == iM12242 || str.charAt(iM12243) == '#') {
                String strM12100 = c6978.m12100();
                this.f17223 = strM12100 != null ? m12090(AbstractC6918.m12007(0, 0, strM12100, " \"'<>#", 83)) : null;
            }
        }
        int iM122382 = AbstractC7054.m12238(iM12243, iM12242, str, "?#");
        if (iM12243 != iM122382) {
            char cCharAt5 = str.charAt(iM12243);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList.clear();
                arrayList.add("");
                iM12243++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (iM12243 < iM122382) {
                int iM122383 = AbstractC7054.m12238(iM12243, iM122382, str, "/\\");
                boolean z3 = iM122383 < iM122382;
                String strM120072 = AbstractC6918.m12007(iM12243, iM122383, str, " \"<>^`{}|/\\?#", 112);
                if (!strM120072.equals(".") && !strM120072.equalsIgnoreCase("%2e")) {
                    if (!strM120072.equals("..") && !strM120072.equalsIgnoreCase("%2e.") && !strM120072.equalsIgnoreCase(".%2e") && !strM120072.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) AbstractC7012.m12145(1, arrayList)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strM120072);
                        } else {
                            arrayList.add(strM120072);
                        }
                        if (z3) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                iM12243 = z3 ? iM122383 + 1 : iM122383;
            }
        }
        if (iM122382 < iM12242 && str.charAt(iM122382) == '?') {
            int iM122372 = AbstractC7054.m12237(str, '#', iM122382, iM12242);
            this.f17223 = m12090(AbstractC6918.m12007(iM122382 + 1, iM122372, str, " \"'<>#", 80));
            iM122382 = iM122372;
        }
        if (iM122382 >= iM12242 || str.charAt(iM122382) != '#') {
            return;
        }
        this.f17222 = AbstractC6918.m12007(iM122382 + 1, iM12242, str, "", 48);
    }

    public C6977(C9469 c9469) {
        this.f17220 = 1;
        m12091();
        m12095(StateSet.WILD_CARD, c9469);
    }
}
