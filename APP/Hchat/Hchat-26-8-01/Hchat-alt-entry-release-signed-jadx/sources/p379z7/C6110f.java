package p379z7;

import bsh.C0353j;
import java.util.Iterator;
import java.util.function.Predicate;
import p025bc.C0259i;

/* JADX INFO: renamed from: z7.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6110f implements Iterator {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f24656g = 1;

    /* JADX INFO: renamed from: h */
    public Iterator f24657h;

    /* JADX INFO: renamed from: i */
    public Object f24658i;

    /* JADX INFO: renamed from: j */
    public Object f24659j;

    /* JADX INFO: renamed from: k */
    public Object f24660k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6110f(Iterator it, Class cls, C0259i c0259i) {
        this.f24657h = it;
        this.f24659j = cls;
        this.f24660k = c0259i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public Object m10875a() {
        Object obj = this.f24658i;
        if (obj != null) {
            return obj;
        }
        Iterator it = this.f24657h;
        Class cls = (Class) this.f24659j;
        Predicate predicate = (Predicate) this.f24660k;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null && cls.isInstance(next) && (predicate == null || predicate.test(next))) {
                this.f24658i = next;
                return next;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:29:0x0045) to fix multi-entry loop: BACK_EDGE: B:29:0x0045 -> B:22:0x0034 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001f A[LOOP:1: B:14:0x001f->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0034 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m10876b() {
        Iterator it;
        Iterator it2;
        Object next;
        Object obj = this.f24658i;
        if (obj != null) {
            return obj;
        }
        Iterator it3 = this.f24657h;
        Object obj2 = null;
        if (it3 != null) {
            while (it3.hasNext()) {
                next = it3.next();
                if (next != null) {
                    break;
                }
            }
            this.f24657h = null;
            it = (Iterator) this.f24659j;
            if (it == null) {
                while (it.hasNext()) {
                    next = it.next();
                    if (next != null) {
                        break;
                    }
                }
                this.f24659j = null;
                if (((Iterator) this.f24660k) != null) {
                    loop2: for (it2 = null; it2 != null; it2 = null) {
                        while (it2.hasNext()) {
                            next = it2.next();
                            if (next != null) {
                                obj2 = next;
                            }
                        }
                        this.f24660k = null;
                    }
                }
            } else {
                if (((Iterator) this.f24660k) != null) {
                }
            }
        } else {
            it = (Iterator) this.f24659j;
            if (it == null) {
            }
        }
        this.f24658i = obj2;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f24656g) {
            case 0:
                if (m10876b() != null) {
                }
                break;
            default:
                if (m10875a() != null) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f24656g) {
            case 0:
                Object objM10876b = m10876b();
                if (objM10876b == null) {
                    C0353j.m1307e();
                } else {
                    this.f24658i = null;
                }
                break;
            default:
                Object objM10875a = m10875a();
                if (objM10875a == null) {
                    C0353j.m1307e();
                } else {
                    this.f24658i = null;
                }
                break;
        }
        return null;
    }

    public C6110f(Iterator it, Iterator it2) {
        this.f24657h = it;
        this.f24659j = it2;
    }
}
