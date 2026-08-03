package p218og;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ng.C3005c;
import p007a7.AbstractC0018a;
import p010aa.C0035c;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p136j8.C2104o;
import p162l3.C2469w;

/* JADX INFO: renamed from: og.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3147k implements Serializable {

    /* JADX INFO: renamed from: g */
    public final Pattern f10206g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3147k(String str, Set set) {
        Iterator it = set.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            i9 |= ((EnumC3148l) it.next()).f10210g;
        }
        Pattern patternCompile = Pattern.compile(str, C2469w.m5864f(i9));
        patternCompile.getClass();
        this.f10206g = patternCompile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C3145i m6680b(C3147k c3147k, String str) {
        c3147k.getClass();
        str.getClass();
        Matcher matcher = c3147k.f10206g.matcher(str);
        matcher.getClass();
        return AbstractC0018a.m238b(matcher, 0, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static C3005c m6681c(C3147k c3147k, CharSequence charSequence) {
        c3147k.getClass();
        charSequence.getClass();
        if (charSequence.length() >= 0) {
            return new C3005c(new C0035c(c3147k, 24, charSequence), C3146j.f10205n);
        }
        C2104o.m5280e(charSequence.length(), AbstractC0921a.m2257t(0, "Start index out of bounds: ", ", input length: "));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m6682a(CharSequence charSequence) {
        charSequence.getClass();
        return this.f10206g.matcher(charSequence).find();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m6683d(String str) {
        str.getClass();
        return this.f10206g.matcher(str).matches();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final String m6684e(CharSequence charSequence, InterfaceC1231l interfaceC1231l) {
        charSequence.getClass();
        Matcher matcher = this.f10206g.matcher(charSequence);
        matcher.getClass();
        int i9 = 0;
        C3145i c3145iM238b = AbstractC0018a.m238b(matcher, 0, charSequence);
        if (c3145iM238b == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(charSequence, i9, c3145iM238b.m6677b().f8312g);
            sb2.append((CharSequence) interfaceC1231l.invoke(c3145iM238b));
            i9 = c3145iM238b.m6677b().f8313h + 1;
            c3145iM238b = c3145iM238b.m6679d();
            if (i9 >= length) {
                break;
            }
        } while (c3145iM238b != null);
        if (i9 < length) {
            sb2.append(charSequence, i9, length);
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final String m6685f(String str, String str2) {
        str.getClass();
        String strReplaceAll = this.f10206g.matcher(str).replaceAll(str2);
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String string = this.f10206g.toString();
        string.getClass();
        return string;
    }

    public C3147k(String str, int i9) {
        Pattern patternCompile = Pattern.compile(str, C2469w.m5864f(2));
        patternCompile.getClass();
        this.f10206g = patternCompile;
    }

    public C3147k(String str) {
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.f10206g = patternCompile;
    }
}
