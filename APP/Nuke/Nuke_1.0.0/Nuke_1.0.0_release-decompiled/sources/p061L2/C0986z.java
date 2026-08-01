package p061L2;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import me.dartcv.nuke.BuildConfig;
import p007B0.C0173F;
import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p132a3.C1804d;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: L2.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0986z extends AbstractC0965e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3053d = 1;

    /* JADX INFO: renamed from: e */
    public final Object f3054e;

    public C0986z(C0173F c0173f) {
        this.f3054e = c0173f;
    }

    @Override // p061L2.AbstractC0961a
    /* JADX INFO: renamed from: a */
    public final int mo1974a() {
        switch (this.f3053d) {
            case 0:
                return ((List) this.f3054e).size();
            default:
                return ((Matcher) ((C0173F) this.f3054e).f612e).groupCount() + 1;
        }
    }

    @Override // p061L2.AbstractC0961a, java.util.Collection
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f3053d) {
            case BuildConfig.VERSION_CODE /* 1 */:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i5) {
        switch (this.f3053d) {
            case 0:
                List list = (List) this.f3054e;
                if (i5 >= 0 && i5 <= AbstractC2352g.m4208u(this)) {
                    return list.get(AbstractC2352g.m4208u(this) - i5);
                }
                StringBuilder sbM404o = AbstractC0231b.m404o(i5, "Element index ", " must be in range [");
                sbM404o.append(new C1804d(0, AbstractC2352g.m4208u(this), 1));
                sbM404o.append("].");
                throw new IndexOutOfBoundsException(sbM404o.toString());
            default:
                String strGroup = ((Matcher) ((C0173F) this.f3054e).f612e).group(i5);
                return strGroup == null ? "" : strGroup;
        }
    }

    @Override // p061L2.AbstractC0965e, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f3053d) {
            case BuildConfig.VERSION_CODE /* 1 */:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // p061L2.AbstractC0965e, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f3053d) {
            case 0:
                return new C0985y(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // p061L2.AbstractC0965e, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f3053d) {
            case BuildConfig.VERSION_CODE /* 1 */:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // p061L2.AbstractC0965e, java.util.List
    public ListIterator listIterator() {
        switch (this.f3053d) {
            case 0:
                return new C0985y(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // p061L2.AbstractC0965e, java.util.List
    public ListIterator listIterator(int i5) {
        switch (this.f3053d) {
            case 0:
                return new C0985y(this, i5);
            default:
                return super.listIterator(i5);
        }
    }

    public C0986z(List list) {
        AbstractC1665j.m2985e(list, "delegate");
        this.f3054e = list;
    }
}
