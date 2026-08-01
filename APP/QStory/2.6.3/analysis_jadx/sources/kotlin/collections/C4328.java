package kotlin.collections;

import androidx.compose.runtime.snapshots.C1264;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.text.C5148;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4328 extends AbstractC4330 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f12910;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12911 = 0;

    public C4328(List list) {
        list.getClass();
        this.f12910 = list;
    }

    @Override // kotlin.collections.AbstractC4335, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f12911) {
            case 1:
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
        int i2 = this.f12911;
        Object obj = this.f12910;
        switch (i2) {
            case 0:
                return ((List) obj).get(AbstractC4344.m8813(i, this));
            default:
                String strGroup = ((C5148) obj).f14699.group(i);
                return strGroup == null ? "" : strGroup;
        }
    }

    @Override // kotlin.collections.AbstractC4335
    public final int getSize() {
        int i = this.f12911;
        Object obj = this.f12910;
        switch (i) {
            case 0:
                return ((List) obj).size();
            default:
                return ((C5148) obj).f14699.groupCount() + 1;
        }
    }

    @Override // kotlin.collections.AbstractC4330, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f12911) {
            case 1:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // kotlin.collections.AbstractC4330, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f12911) {
            case 0:
                return new C1264(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // kotlin.collections.AbstractC4330, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f12911) {
            case 1:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // kotlin.collections.AbstractC4330, java.util.List
    public ListIterator listIterator() {
        switch (this.f12911) {
            case 0:
                return new C1264(this, 0);
            default:
                return super.listIterator();
        }
    }

    public C4328(C5148 c5148) {
        this.f12910 = c5148;
    }

    @Override // kotlin.collections.AbstractC4330, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.f12911) {
            case 0:
                return new C1264(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
