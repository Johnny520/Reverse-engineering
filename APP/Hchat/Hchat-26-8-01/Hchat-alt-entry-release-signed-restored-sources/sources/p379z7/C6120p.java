package p379z7;

import ae.C0073d;
import bsh.C0353j;
import java.util.Iterator;

/* JADX INFO: renamed from: z7.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6120p implements Iterator {

    /* JADX INFO: renamed from: g */
    public Object f24681g;

    /* JADX INFO: renamed from: h */
    public final C0073d f24682h;

    /* JADX INFO: renamed from: i */
    public boolean f24683i;

    /* JADX INFO: renamed from: j */
    public Object f24684j;

    /* JADX INFO: renamed from: k */
    public Iterator f24685k;

    /* JADX INFO: renamed from: l */
    public C6120p f24686l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6120p(Object obj, C0073d c0073d) {
        this.f24681g = obj;
        this.f24682h = c0073d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m10881a() {
        Object obj = this.f24684j;
        if (obj != null) {
            return obj;
        }
        Object next = null;
        if (this.f24683i) {
            Object obj2 = this.f24681g;
            if (obj2 != null) {
                this.f24681g = null;
                this.f24685k = (Iterator) this.f24682h.apply(obj2);
            }
            Iterator itM10882b = m10882b();
            if (itM10882b != null && itM10882b.hasNext()) {
                next = itM10882b.next();
            }
        } else {
            this.f24683i = true;
            Object obj3 = this.f24681g;
            if (obj3 == null) {
                this.f24681g = null;
            } else {
                next = obj3;
            }
        }
        this.f24684j = next;
        return next;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Iterator m10882b() {
        C6120p c6120p = this.f24686l;
        if (c6120p != null && c6120p.hasNext()) {
            return c6120p;
        }
        C6120p c6120p2 = null;
        this.f24686l = null;
        Iterator it = this.f24685k;
        if (it == null || !it.hasNext()) {
            this.f24685k = null;
        } else {
            c6120p2 = new C6120p(it.next(), this.f24682h);
            this.f24686l = c6120p2;
        }
        return (c6120p2 == null || c6120p2.hasNext()) ? c6120p2 : m10882b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return m10881a() != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        Object objM10881a = m10881a();
        if (objM10881a != null) {
            this.f24684j = null;
            return objM10881a;
        }
        C0353j.m1307e();
        return null;
    }
}
