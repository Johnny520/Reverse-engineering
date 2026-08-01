package kotlin.collections;

import androidx.compose.runtime.snapshots.C1264;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.text.C5147;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4327 extends AbstractC4329 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f12906;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12907 = 0;

    public C4327(List list) {
        list.getClass();
        this.f12906 = list;
    }

    @Override // kotlin.collections.AbstractC4334, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f12907) {
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
        int i2 = this.f12907;
        Object obj = this.f12906;
        switch (i2) {
            case 0:
                return ((List) obj).get(AbstractC4343.m8795(i, this));
            default:
                String strGroup = ((C5147) obj).f14699.group(i);
                return strGroup == null ? "" : strGroup;
        }
    }

    @Override // kotlin.collections.AbstractC4334
    public final int getSize() {
        int i = this.f12907;
        Object obj = this.f12906;
        switch (i) {
            case 0:
                return ((List) obj).size();
            default:
                return ((C5147) obj).f14699.groupCount() + 1;
        }
    }

    @Override // kotlin.collections.AbstractC4329, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f12907) {
            case 1:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // kotlin.collections.AbstractC4329, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f12907) {
            case 0:
                return new C1264(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // kotlin.collections.AbstractC4329, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f12907) {
            case 1:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // kotlin.collections.AbstractC4329, java.util.List
    public ListIterator listIterator() {
        switch (this.f12907) {
            case 0:
                return new C1264(this, 0);
            default:
                return super.listIterator();
        }
    }

    public C4327(C5147 c5147) {
        this.f12906 = c5147;
    }

    @Override // kotlin.collections.AbstractC4329, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.f12907) {
            case 0:
                return new C1264(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
