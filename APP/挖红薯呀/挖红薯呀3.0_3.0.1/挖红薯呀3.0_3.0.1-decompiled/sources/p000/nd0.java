package p000;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class nd0 extends AbstractC0945y {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4244d = 1;

    /* JADX INFO: renamed from: e */
    public final Object f4245e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public nd0(List list) {
        list.getClass();
        this.f4245e = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0597p
    /* JADX INFO: renamed from: a */
    public final int mo6a() {
        int i = this.f4244d;
        Object obj = this.f4245e;
        switch (i) {
            case 0:
                return ((od0) obj).f4521a.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0597p, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f4244d) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f4244d;
        Object obj = this.f4245e;
        switch (i2) {
            case 0:
                String strGroup = ((od0) obj).f4521a.group(i);
                return strGroup == null ? "" : strGroup;
            default:
                List list = (List) obj;
                if (i >= 0 && i <= o30.m2778r(this)) {
                    return list.get(o30.m2778r(this) - i);
                }
                throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new z20(0, o30.m2778r(this), 1) + "].");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0945y, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f4244d) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0945y, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f4244d) {
            case 1:
                return new iv0(this, 0);
            default:
                return super.iterator();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0945y, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f4244d) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0945y, java.util.List
    public ListIterator listIterator() {
        switch (this.f4244d) {
            case 1:
                return new iv0(this, 0);
            default:
                return super.listIterator();
        }
    }

    public nd0(od0 od0Var) {
        this.f4245e = od0Var;
    }

    @Override // p000.AbstractC0945y, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.f4244d) {
            case 1:
                return new iv0(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
