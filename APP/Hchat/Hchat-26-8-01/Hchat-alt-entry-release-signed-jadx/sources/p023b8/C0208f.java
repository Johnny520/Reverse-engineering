package p023b8;

import ae.C0073d;
import androidx.lifecycle.C0119x;
import java.io.StringWriter;
import p025bc.AbstractC0255e;
import p136j8.C2095f;
import p136j8.C2104o;
import p379z7.C6106b;
import p379z7.C6107c;
import p379z7.C6116l;
import p379z7.C6120p;

/* JADX INFO: renamed from: b8.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0208f extends AbstractC0213k implements InterfaceC0204b {

    /* JADX INFO: renamed from: n */
    public static final C6106b f509n;

    /* JADX INFO: renamed from: o */
    public static final C6106b f510o;

    /* JADX INFO: renamed from: l */
    public String f512l;

    /* JADX INFO: renamed from: k */
    public C6107c f511k = f509n;

    /* JADX INFO: renamed from: m */
    public C6107c f513m = f510o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C6106b c6106b = C6107c.f24641o;
        f509n = c6106b;
        f510o = c6106b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.AbstractC0212j
    /* JADX INFO: renamed from: a */
    public final int mo881a() {
        C6116l c6116l = new C6116l(this);
        int iMo881a = 0;
        while (c6116l.hasNext()) {
            iMo881a += ((AbstractC0212j) c6116l.next()).mo881a();
        }
        return iMo881a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.InterfaceC0204b
    /* JADX INFO: renamed from: b */
    public final int mo868b() {
        AbstractC0212j abstractC0212j;
        AbstractC0213k abstractC0213k = (AbstractC0213k) m889d();
        abstractC0213k.getClass();
        C6120p c6120p = new C6120p(abstractC0213k, new C0073d(2));
        int i9 = 0;
        while (c6120p.hasNext() && (abstractC0212j = (AbstractC0212j) c6120p.next()) != this) {
            if (abstractC0212j instanceof C0208f) {
                i9++;
            }
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.InterfaceC0204b
    /* JADX INFO: renamed from: e */
    public final int mo869e() {
        int iMo881a = mo881a() + mo870f();
        return iMo881a != 0 ? iMo881a - 1 : iMo881a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.InterfaceC0204b
    /* JADX INFO: renamed from: f */
    public final int mo870f() {
        AbstractC0212j abstractC0212j;
        AbstractC0213k abstractC0213k = (AbstractC0213k) m889d();
        abstractC0213k.getClass();
        C6120p c6120p = new C6120p(abstractC0213k, new C0073d(2));
        int iMo888g = 0;
        while (c6120p.hasNext() && (abstractC0212j = (AbstractC0212j) c6120p.next()) != this) {
            iMo888g += abstractC0212j.mo888g();
        }
        return iMo888g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.InterfaceC0204b
    public final String getTagName() {
        return this.f512l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.InterfaceC0204b
    /* JADX INFO: renamed from: j */
    public final String mo871j() {
        C0206d[] c0206dArr;
        int size = this.f511k.size();
        if (size == 0) {
            c0206dArr = null;
        } else {
            c0206dArr = new C0206d[size];
            for (int i9 = 0; i9 < size; i9++) {
                c0206dArr[i9] = (C0206d) this.f511k.f24642g[i9];
            }
            if (size != 1) {
                C2095f c2095f = new C2095f(c0206dArr, size, new C0205c(0));
                c2095f.f7000a = false;
                c2095f.m5218u(0, size - 1);
            }
        }
        if (c0206dArr == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (C0206d c0206d : c0206dArr) {
            if (!"raw_style_tag_attribute".equals(c0206d.f506h)) {
                sb2.append(';');
                sb2.append(c0206d.f506h);
                sb2.append('=');
            }
            sb2.append(c0206d.m876n());
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.AbstractC0212j
    /* JADX INFO: renamed from: k */
    public final void mo874k(StringWriter stringWriter, boolean z9) {
        stringWriter.append('<');
        stringWriter.append((CharSequence) this.f512l);
        char c10 = z9 ? ' ' : ';';
        C6116l c6116l = new C6116l(new C0119x(this, 3));
        while (c6116l.hasNext()) {
            stringWriter.append(c10);
            ((C0206d) c6116l.next()).mo874k(stringWriter, z9);
        }
        C6116l c6116l2 = new C6116l(this);
        boolean z10 = false;
        while (c6116l2.hasNext()) {
            if (!z10) {
                stringWriter.append(">");
            }
            ((AbstractC0212j) c6116l2.next()).mo874k(stringWriter, z9);
            z10 = true;
        }
        if (!z10) {
            stringWriter.append(" />");
            return;
        }
        stringWriter.append("</");
        stringWriter.append((CharSequence) this.f512l);
        stringWriter.append('>');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.AbstractC0213k
    /* JADX INFO: renamed from: n */
    public final C0208f mo878n() {
        C0208f c0208f = new C0208f();
        m891m(c0208f);
        return c0208f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.AbstractC0213k
    /* JADX INFO: renamed from: o */
    public final C0210h mo879o() {
        C0210h c0210h = new C0210h();
        m891m(c0210h);
        return c0210h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m882p(C0206d c0206d) {
        if (this.f511k == f509n) {
            this.f511k = new C6107c(0);
        }
        this.f511k.add(c0206d);
        if (this != c0206d) {
            c0206d.f518g = this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m883q() {
        if (this.f511k.size() == 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            int size = this.f511k.size();
            C6107c c6107c = this.f511k;
            if (i9 >= size) {
                c6107c.clear();
                this.f511k.mo10863m();
                return;
            } else {
                C0206d c0206d = (C0206d) c6107c.f24642g[i9];
                if (c0206d != null) {
                    c0206d.f518g = null;
                } else {
                    c0206d.getClass();
                }
                i9++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final C0208f m884r() {
        AbstractC0212j abstractC0212j = this.f518g;
        if (abstractC0212j instanceof C0208f) {
            return (C0208f) abstractC0212j;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final AbstractC0211i m885s(String str) {
        if (str != null) {
            int size = this.f513m.size();
            for (int i9 = 0; i9 < size; i9++) {
                AbstractC0211i abstractC0211i = (AbstractC0211i) this.f513m.f24642g[i9];
                abstractC0211i.getClass();
                if (str.equals(null)) {
                    return abstractC0211i;
                }
            }
            C0208f c0208fM884r = m884r();
            if (c0208fM884r != null) {
                return c0208fM884r.m885s(str);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m886t(String str) {
        int iIndexOf;
        this.f512l = AbstractC0214l.m892a(str);
        String strSubstring = null;
        if (str != null && (iIndexOf = str.indexOf(58)) > 0) {
            strSubstring = str.substring(0, iIndexOf);
        }
        if (strSubstring == null) {
            return;
        }
        m885s(strSubstring);
        C2104o.m5294t("Namespace not found for prefix: ".concat(strSubstring));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.AbstractC0212j
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(mo870f());
        sb2.append(", ");
        sb2.append(mo869e());
        sb2.append("] ");
        String strM1020i = this.f512l;
        String strMo871j = mo871j();
        if (strMo871j != null) {
            strM1020i = AbstractC0255e.m1020i(strM1020i, strMo871j);
        }
        sb2.append(strM1020i);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final void m887u(Appendable appendable) {
        C6116l c6116l = new C6116l(this);
        while (c6116l.hasNext()) {
            AbstractC0212j abstractC0212j = (AbstractC0212j) c6116l.next();
            if (abstractC0212j instanceof C0210h) {
                ((StringWriter) appendable).append((CharSequence) ((C0210h) abstractC0212j).f517h);
            } else if (abstractC0212j instanceof C0208f) {
                ((C0208f) abstractC0212j).m887u(appendable);
            }
        }
    }

    @Override // p023b8.InterfaceC0204b
    /* JADX INFO: renamed from: l */
    public final C0208f mo872l() {
        return this;
    }
}
