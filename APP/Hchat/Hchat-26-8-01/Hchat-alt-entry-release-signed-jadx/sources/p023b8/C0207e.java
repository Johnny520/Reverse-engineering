package p023b8;

import java.io.IOException;
import java.io.StringWriter;
import p003a2.C0014a;
import p379z7.C6116l;

/* JADX INFO: renamed from: b8.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0207e extends AbstractC0213k implements Comparable {

    /* JADX INFO: renamed from: k */
    public final C0014a f508k = new C0014a(4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0207e c0207e = (C0207e) obj;
        if (c0207e == null) {
            return 0;
        }
        return m880p().compareTo(c0207e.m880p());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0207e) {
            return m890i(true).equals(((C0207e) obj).m890i(true));
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return m890i(true).hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.AbstractC0212j
    /* JADX INFO: renamed from: k */
    public final void mo874k(StringWriter stringWriter, boolean z9) {
        C6116l c6116l = new C6116l(this);
        while (c6116l.hasNext()) {
            ((AbstractC0212j) c6116l.next()).mo874k(stringWriter, z9);
        }
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
    public final String m880p() {
        StringWriter stringWriter = new StringWriter();
        try {
            C6116l c6116l = new C6116l(this);
            while (c6116l.hasNext()) {
                AbstractC0212j abstractC0212j = (AbstractC0212j) c6116l.next();
                if (abstractC0212j instanceof C0210h) {
                    stringWriter.append((CharSequence) ((C0210h) abstractC0212j).f517h);
                } else if (abstractC0212j instanceof C0208f) {
                    ((C0208f) abstractC0212j).m887u(stringWriter);
                }
            }
            stringWriter.flush();
            stringWriter.close();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }
}
