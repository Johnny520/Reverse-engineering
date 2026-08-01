package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.collection.C1109;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import lin.xposed.hook.javaplugin.C6385;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5528 extends AbstractMap {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ int f14086 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public volatile C1109 f14087;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f14088;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public List f14089 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Map f14090 = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f14091;

    public C5528(int i) {
        this.f14091 = i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m9903();
        if (!this.f14089.isEmpty()) {
            this.f14089.clear();
        }
        if (this.f14090.isEmpty()) {
            return;
        }
        this.f14090.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m9904(comparable) >= 0 || this.f14090.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f14087 == null) {
            this.f14087 = new C1109(2, this);
        }
        return this.f14087;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM9904 = m9904(comparable);
        return iM9904 >= 0 ? ((C5536) this.f14089.get(iM9904)).f14101 : this.f14090.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m9903();
        Comparable comparable = (Comparable) obj;
        int iM9904 = m9904(comparable);
        if (iM9904 >= 0) {
            return m9899(iM9904);
        }
        if (this.f14090.isEmpty()) {
            return null;
        }
        return this.f14090.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f14090.size() + this.f14089.size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m9899(int i) {
        m9903();
        Object obj = ((C5536) this.f14089.remove(i)).f14101;
        if (!this.f14090.isEmpty()) {
            Iterator it = m9901().entrySet().iterator();
            List list = this.f14089;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C5536(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m9903();
        int iM9904 = m9904(comparable);
        if (iM9904 >= 0) {
            return ((C5536) this.f14089.get(iM9904)).setValue(obj);
        }
        m9903();
        boolean zIsEmpty = this.f14089.isEmpty();
        int i = this.f14091;
        if (zIsEmpty && !(this.f14089 instanceof ArrayList)) {
            this.f14089 = new ArrayList(i);
        }
        int i2 = -(iM9904 + 1);
        if (i2 >= i) {
            return m9901().put(comparable, obj);
        }
        if (this.f14089.size() == i) {
            C5536 c5536 = (C5536) this.f14089.remove(i - 1);
            m9901().put(c5536.f14103, c5536.f14101);
        }
        this.f14089.add(i2, new C5536(this, comparable, obj));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final SortedMap m9901() {
        m9903();
        if (this.f14090.isEmpty() && !(this.f14090 instanceof TreeMap)) {
            this.f14090 = new TreeMap();
        }
        return (SortedMap) this.f14090;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Iterable m9902() {
        return this.f14090.isEmpty() ? AbstractC5537.f14104 : this.f14090.entrySet();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m9903() {
        if (this.f14088) {
            C6385.m11441();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m9904(Comparable comparable) {
        int i;
        int i2;
        int size = this.f14089.size();
        int i3 = size - 1;
        if (i3 < 0) {
            i = 0;
            while (i <= i3) {
                int i4 = (i + i3) / 2;
                int iCompareTo = comparable.compareTo(((C5536) this.f14089.get(i4)).f14103);
                if (iCompareTo < 0) {
                    i3 = i4 - 1;
                } else {
                    if (iCompareTo <= 0) {
                        return i4;
                    }
                    i = i4 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((C5536) this.f14089.get(i3)).f14103);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i3;
                }
                i = 0;
                while (i <= i3) {
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }
}
