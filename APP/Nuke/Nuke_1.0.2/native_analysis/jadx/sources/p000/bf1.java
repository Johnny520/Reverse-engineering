package p000;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bf1 extends AbstractC0832w2 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f837h = 1;

    /* JADX INFO: renamed from: i */
    public final Object f838i;

    public bf1(List list) {
        list.getClass();
        this.f838i = list;
    }

    @Override // p000.AbstractC0372k2
    /* JADX INFO: renamed from: a */
    public final int mo529a() {
        int i = this.f837h;
        Object obj = this.f838i;
        switch (i) {
            case 0:
                return ((Matcher) ((kj1) obj).f5594i).groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // p000.AbstractC0372k2, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f837h) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f837h;
        Object obj = this.f838i;
        switch (i2) {
            case 0:
                String strGroup = ((Matcher) ((kj1) obj).f5594i).group(i);
                return strGroup == null ? "" : strGroup;
            default:
                return ((List) obj).get(AbstractC0142du.m1154j0(i, this));
        }
    }

    @Override // p000.AbstractC0832w2, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f837h) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // p000.AbstractC0832w2, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f837h) {
            case 1:
                return new ea2(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // p000.AbstractC0832w2, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f837h) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // p000.AbstractC0832w2, java.util.List
    public ListIterator listIterator() {
        switch (this.f837h) {
            case 1:
                return new ea2(this, 0);
            default:
                return super.listIterator();
        }
    }

    public bf1(kj1 kj1Var) {
        this.f838i = kj1Var;
    }

    @Override // p000.AbstractC0832w2, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.f837h) {
            case 1:
                return new ea2(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
