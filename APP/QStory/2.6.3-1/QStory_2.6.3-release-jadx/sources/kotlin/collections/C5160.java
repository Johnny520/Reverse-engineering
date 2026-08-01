package kotlin.collections;

import androidx.compose.runtime.snapshots.C2099;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.text.C5980;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C5160 extends AbstractC5162 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f13255;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13256 = 0;

    public C5160(List list) {
        list.getClass();
        this.f13255 = list;
    }

    @Override // kotlin.collections.AbstractC5167, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f13256) {
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
        int i2 = this.f13256;
        Object obj = this.f13255;
        switch (i2) {
            case 0:
                return ((List) obj).get(AbstractC5176.m9372(i, this));
            default:
                String strGroup = ((C5980) obj).f15044.group(i);
                return strGroup == null ? "" : strGroup;
        }
    }

    @Override // kotlin.collections.AbstractC5167
    public final int getSize() {
        int i = this.f13256;
        Object obj = this.f13255;
        switch (i) {
            case 0:
                return ((List) obj).size();
            default:
                return ((C5980) obj).f15044.groupCount() + 1;
        }
    }

    @Override // kotlin.collections.AbstractC5162, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f13256) {
            case 1:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // kotlin.collections.AbstractC5162, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f13256) {
            case 0:
                return new C2099(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // kotlin.collections.AbstractC5162, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f13256) {
            case 1:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // kotlin.collections.AbstractC5162, java.util.List
    public ListIterator listIterator() {
        switch (this.f13256) {
            case 0:
                return new C2099(this, 0);
            default:
                return super.listIterator();
        }
    }

    public C5160(C5980 c5980) {
        this.f13255 = c5980;
    }

    @Override // kotlin.collections.AbstractC5162, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.f13256) {
            case 0:
                return new C2099(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
