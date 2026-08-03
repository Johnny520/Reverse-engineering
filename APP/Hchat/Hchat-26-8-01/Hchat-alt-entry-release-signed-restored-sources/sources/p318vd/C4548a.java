package p318vd;

import af.C0084g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mh.AbstractC2846d;
import okhttp3.HttpUrl;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p199nd.AbstractC2963b0;
import p214oc.C3126c;
import p232pc.C3388j;
import p246qd.AbstractC3506j;
import p246qd.C3497a;
import p246qd.C3498b;
import p246qd.C3499c;
import p246qd.C3501e;
import p246qd.C3502f;
import p246qd.C3503g;
import p246qd.C3505i;
import p332wb.AbstractC4855en;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: vd.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4548a {

    /* JADX INFO: renamed from: a */
    public final String f15004a;

    /* JADX INFO: renamed from: b */
    public final int f15005b;

    /* JADX INFO: renamed from: c */
    public int f15006c = -1;

    /* JADX INFO: renamed from: d */
    public int f15007d = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2846d.m6274b(C4548a.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4548a(String str) {
        this.f15004a = str;
        this.f15005b = str.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static C4548a m8972g(AbstractC2963b0 abstractC2963b0) {
        C3388j c3388j = (C3388j) abstractC2963b0.f9217g.mo6237c(C3126c.f10129b);
        String str = c3388j == null ? null : c3388j.f10925g;
        if (str == null) {
            return null;
        }
        return new C4548a(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m8973a(char c10) {
        char cM8981j = m8981j();
        if (c10 == cM8981j) {
            return;
        }
        throw new C0084g("Consume wrong char: '" + cM8981j + "' != '" + c10 + "', sign: " + m8978f());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final List m8974b() {
        String strM8979h;
        boolean zM8980i;
        if (!m8980i('<')) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        m8973a('<');
        while (!m8980i('>') && m8981j() != 0) {
            int i9 = this.f15006c;
            this.f15007d = i9;
            while (true) {
                if (m8980i(':')) {
                    strM8979h = m8979h();
                    break;
                }
                if (m8981j() == 0) {
                    this.f15006c = i9;
                    strM8979h = null;
                    break;
                }
            }
            if (strM8979h == null) {
                C0086a.m452k("Failed to parse generic types map");
                return null;
            }
            m8973a(':');
            if (m8980i(':')) {
                m8981j();
            }
            List arrayList2 = Collections.EMPTY_LIST;
            do {
                AbstractC3506j abstractC3506jM8977e = m8977e();
                if (abstractC3506jM8977e == null) {
                    C0086a.m452k("Unexpected end of signature");
                    return null;
                }
                if (!abstractC3506jM8977e.equals(AbstractC3506j.f11394k)) {
                    if (arrayList2.isEmpty()) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(abstractC3506jM8977e);
                }
                zM8980i = m8980i(':');
                if (zM8980i) {
                    m8973a(':');
                }
            } while (zM8980i);
            arrayList.add(new C3499c(strM8979h, arrayList2));
        }
        m8973a('>');
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final List m8975c(int i9) {
        m8973a('(');
        if (m8980i(')')) {
            m8973a(')');
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(i9);
        int i10 = i9 + 10;
        do {
            AbstractC3506j abstractC3506jM8977e = m8977e();
            if (abstractC3506jM8977e == null) {
                C0086a.m452k("Unexpected end of signature");
                return null;
            }
            arrayList.add(abstractC3506jM8977e);
            if (arrayList.size() > i10) {
                C0086a.m452k(AbstractC0921a.m2249l(arrayList.size(), "Arguments count limit reached: "));
                return null;
            }
        } while (!m8980i(')'));
        m8973a(')');
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final AbstractC3506j m8976d(boolean z9) {
        char cM8981j;
        int i9;
        AbstractC3506j abstractC3506jM8977e;
        C3505i c3505i;
        String strM8979h;
        this.f15007d = this.f15006c;
        do {
            if (!z9 || !m8980i('.')) {
                cM8981j = m8981j();
                if (cM8981j != 0) {
                    if (cM8981j == '<') {
                        break;
                    }
                } else {
                    return null;
                }
            } else {
                return AbstractC3506j.m7360x(m8979h());
            }
        } while (cM8981j != ';');
        String str = this.f15004a;
        String strSubstring = HttpUrl.FRAGMENT_ENCODE_SET;
        if (cM8981j == ';') {
            if (z9) {
                int i10 = this.f15007d;
                i9 = i10 != -1 ? i10 : 0;
                int i11 = this.f15006c;
                if (i9 < i11) {
                    strSubstring = str.substring(i9, i11);
                }
                strM8979h = strSubstring.replace('/', '.');
            } else {
                strM8979h = m8979h();
            }
            return AbstractC3506j.m7360x(strM8979h);
        }
        int i12 = this.f15007d;
        i9 = i12 != -1 ? i12 : 0;
        int i13 = this.f15006c;
        if (i9 < i13) {
            strSubstring = str.substring(i9, i13);
        }
        String strConcat = !z9 ? strSubstring.concat(";") : strSubstring.replace('/', '.');
        ArrayList arrayList = new ArrayList();
        do {
            if (m8980i('*')) {
                m8981j();
                C3503g c3503g = AbstractC3506j.f11385b;
                abstractC3506jM8977e = new C3505i(2, AbstractC3506j.f11394k);
            } else {
                if (m8980i('+')) {
                    m8981j();
                    AbstractC3506j abstractC3506jM8977e2 = m8977e();
                    C3503g c3503g2 = AbstractC3506j.f11385b;
                    c3505i = new C3505i(1, abstractC3506jM8977e2);
                } else if (m8980i('-')) {
                    m8981j();
                    AbstractC3506j abstractC3506jM8977e3 = m8977e();
                    C3503g c3503g3 = AbstractC3506j.f11385b;
                    c3505i = new C3505i(3, abstractC3506jM8977e3);
                } else {
                    abstractC3506jM8977e = m8977e();
                }
                abstractC3506jM8977e = c3505i;
            }
            if (abstractC3506jM8977e != null) {
                arrayList.add(abstractC3506jM8977e);
            }
            if (abstractC3506jM8977e == null) {
                break;
            }
        } while (!m8980i('>'));
        m8973a('>');
        C3503g c3503g4 = AbstractC3506j.f11385b;
        C3501e c3498b = new C3498b(AbstractC5798s.m10508b(strConcat), arrayList);
        if (!m8980i('.')) {
            m8973a(';');
            return c3498b;
        }
        m8973a('.');
        m8981j();
        AbstractC3506j abstractC3506jM8976d = m8976d(true);
        if (abstractC3506jM8976d == null) {
            C0086a.m452k(AbstractC4855en.m9263g("No inner type found: ", m8978f()));
            return null;
        }
        while (m8980i('.')) {
            C3502f c3502f = new C3502f(c3498b, (C3501e) abstractC3506jM8976d);
            m8973a('.');
            m8981j();
            abstractC3506jM8976d = m8976d(true);
            if (abstractC3506jM8976d == null) {
                C0086a.m452k(AbstractC4855en.m9263g("Unexpected inner type found: ", m8978f()));
                return null;
            }
            c3498b = c3502f;
        }
        return new C3502f(c3498b, (C3501e) abstractC3506jM8976d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final AbstractC3506j m8977e() {
        String strM8979h;
        char cM8981j = m8981j();
        if (cM8981j == 0) {
            return null;
        }
        if (cM8981j == 'L') {
            AbstractC3506j abstractC3506jM8976d = m8976d(false);
            if (abstractC3506jM8976d != null) {
                return abstractC3506jM8976d;
            }
        } else if (cM8981j == 'T') {
            m8981j();
            int i9 = this.f15006c;
            this.f15007d = i9;
            while (true) {
                if (m8980i(';')) {
                    strM8979h = m8979h();
                    break;
                }
                if (m8981j() == 0) {
                    this.f15006c = i9;
                    strM8979h = null;
                    break;
                }
            }
            if (strM8979h != null) {
                m8973a(';');
                if (strM8979h.contains(")")) {
                    C0086a.m452k("Bad name for type variable: ".concat(strM8979h));
                    return null;
                }
                C3503g c3503g = AbstractC3506j.f11385b;
                return new C3499c(strM8979h, Collections.EMPTY_LIST);
            }
        } else {
            if (cM8981j == '[') {
                AbstractC3506j abstractC3506jM8977e = m8977e();
                C3503g c3503g2 = AbstractC3506j.f11385b;
                return new C3497a(abstractC3506jM8977e);
            }
            C3503g c3503gM7361y = AbstractC3506j.m7361y(cM8981j);
            if (c3503gM7361y != null) {
                return c3503gM7361y;
            }
        }
        throw new C0084g("Can't parse type: " + m8978f() + ", unexpected: " + cM8981j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final String m8978f() {
        int i9 = this.f15006c;
        String str = this.f15004a;
        if (i9 >= str.length()) {
            return str;
        }
        int i10 = this.f15006c;
        return str + " at position " + i10 + " ('" + str.charAt(i10) + "')";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final String m8979h() {
        int i9 = this.f15007d;
        if (i9 == -1) {
            i9 = 0;
        }
        int i10 = this.f15006c + 1;
        return i9 >= i10 ? HttpUrl.FRAGMENT_ENCODE_SET : this.f15004a.substring(i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m8980i(char c10) {
        int i9 = this.f15006c + 1;
        return i9 < this.f15005b && this.f15004a.charAt(i9) == c10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final char m8981j() {
        int i9 = this.f15006c + 1;
        this.f15006c = i9;
        if (i9 >= this.f15005b) {
            return (char) 0;
        }
        return this.f15004a.charAt(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i9 = this.f15006c;
        String str = this.f15004a;
        return i9 == -1 ? str : AbstractC0255e.m1033v(str.substring(0, this.f15007d), "{", str.substring(this.f15007d, this.f15006c), "}", str.substring(this.f15006c));
    }
}
