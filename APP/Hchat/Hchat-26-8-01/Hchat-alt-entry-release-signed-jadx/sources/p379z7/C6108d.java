package p379z7;

import bsh.C0353j;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: z7.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6108d implements Iterator, InterfaceC6122r {

    /* JADX INFO: renamed from: g */
    public final Object[] f24649g;

    /* JADX INFO: renamed from: h */
    public final int f24650h;

    /* JADX INFO: renamed from: i */
    public final Predicate f24651i;

    /* JADX INFO: renamed from: j */
    public int f24652j;

    /* JADX INFO: renamed from: k */
    public Object f24653k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6108d(Object[] objArr, int i9, Predicate predicate) {
        this.f24649g = objArr;
        this.f24650h = i9;
        this.f24651i = predicate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m10874a() {
        Object[] objArr;
        Object obj;
        Predicate predicate;
        if (this.f24653k == null && (objArr = this.f24649g) != null) {
            while (true) {
                int i9 = this.f24652j;
                if (i9 >= this.f24650h) {
                    break;
                }
                obj = objArr[i9];
                this.f24652j = i9 + 1;
                if (obj != null && ((predicate = this.f24651i) == null || predicate.test(obj))) {
                    break;
                }
            }
            this.f24653k = obj;
        }
        return this.f24653k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return m10874a() != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        Object objM10874a = m10874a();
        if (objM10874a != null) {
            this.f24653k = null;
            return objM10874a;
        }
        C0353j.m1307e();
        return null;
    }
}
