package p157kd;

import java.util.Iterator;
import md.C2825b;
import okhttp3.HttpUrl;
import p246qd.AbstractC3506j;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4322r;
import p332wb.AbstractC4855en;
import p351xe.C5796q;

/* JADX INFO: renamed from: kd.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2387a {

    /* JADX INFO: renamed from: a */
    public int f7839a;

    /* JADX INFO: renamed from: b */
    public int f7840b;

    /* JADX INFO: renamed from: c */
    public int f7841c;

    /* JADX INFO: renamed from: d */
    public int f7842d;

    /* JADX INFO: renamed from: e */
    public int f7843e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m5704d(String str) {
        String strSubstring = str.substring(str.lastIndexOf(46) + 1);
        C5796q c5796q = C5796q.f23542b;
        int iIndexOf = strSubstring.indexOf(36);
        if (iIndexOf == -1) {
            return strSubstring;
        }
        StringBuilder sb2 = new StringBuilder(strSubstring.length());
        int i9 = 0;
        do {
            sb2.append((CharSequence) strSubstring, i9, iIndexOf);
            i9 = iIndexOf + 1;
            iIndexOf = strSubstring.indexOf(36, i9);
        } while (iIndexOf != -1);
        sb2.append((CharSequence) strSubstring, i9, strSubstring.length());
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b A[LOOP:0: B:12:0x002b->B:35:0x008b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092 A[EDGE_INSN: B:40:0x0092->B:36:0x0092 BREAK  A[LOOP:0: B:12:0x002b->B:35:0x008b], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m5705a(C4309e c4309e) {
        String strM5704d;
        String string;
        Iterator it;
        if (c4309e.m8658c0()) {
            string = "Enum";
        } else {
            StringBuilder sb2 = new StringBuilder();
            if (c4309e.f14375o.m852d()) {
                sb2.append("Interface");
            } else if ((c4309e.f14375o.f488b & 1024) != 0) {
                sb2.append("Abstract");
            }
            C4309e c4309eM8716g = c4309e;
            loop0: while (c4309eM8716g != null) {
                AbstractC3506j abstractC3506j = c4309eM8716g.f14376p;
                if (abstractC3506j != null) {
                    String strMo7350l = abstractC3506j.mo7350l();
                    if (strMo7350l.startsWith("android.app.") || strMo7350l.startsWith("android.os.")) {
                        strM5704d = m5704d(strMo7350l);
                        break;
                    }
                    it = c4309e.f14377q.iterator();
                    while (it.hasNext()) {
                        String strMo7350l2 = ((AbstractC3506j) it.next()).mo7350l();
                        if (strMo7350l2.equals("java.lang.Runnable")) {
                            strM5704d = "Runnable";
                            break loop0;
                        }
                        if (strMo7350l2.startsWith("java.util.concurrent.") || strMo7350l2.startsWith("android.view.") || strMo7350l2.startsWith("android.content.")) {
                            strM5704d = m5704d(strMo7350l2);
                            break loop0;
                        }
                    }
                    if (abstractC3506j != null) {
                        break;
                    }
                    c4309eM8716g = c4309e.f14371k.m8716g(abstractC3506j);
                } else {
                    it = c4309e.f14377q.iterator();
                    while (it.hasNext()) {
                    }
                    if (abstractC3506j != null) {
                    }
                }
            }
            strM5704d = HttpUrl.FRAGMENT_ENCODE_SET;
            sb2.append(strM5704d);
            string = sb2.toString();
        }
        int i9 = this.f7840b;
        this.f7840b = i9 + 1;
        return String.format("%sC%04d%s", string, Integer.valueOf(i9), m5708e(c4309e.f14373m.f10139h));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m5706b(C4311g c4311g) {
        int i9 = this.f7841c;
        this.f7841c = i9 + 1;
        return String.format("f%d%s", Integer.valueOf(i9), m5708e(c4311g.f14390l.f10147h));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m5707c(C4322r c4322r) {
        String str = c4322r.f9217g.mo6236b(C2825b.f9203r) ? "mo" : "m";
        int i9 = this.f7842d;
        this.f7842d = i9 + 1;
        return String.format("%s%d%s", str, Integer.valueOf(i9), m5708e(c4322r.f14410k.f10150g));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final String m5708e(String str) {
        return str.length() > this.f7843e ? AbstractC4855en.m9263g("x", Integer.toHexString(str.hashCode())) : AbstractC2390d.m5716e(str);
    }
}
