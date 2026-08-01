package p140;

import androidx.compose.runtime.snapshots.C2119;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.AbstractC5179;
import p332.C9496;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8248 extends AbstractC8244 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8248 f20455 = new C8248(new Object[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object[] f20456;

    public C8248(Object[] objArr) {
        this.f20456 = objArr;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C9496.m14932(i, size());
        return this.f20456[i];
    }

    @Override // kotlin.collections.AbstractC5167
    public final int getSize() {
        return this.f20456.length;
    }

    @Override // kotlin.collections.AbstractC5162, java.util.List
    public final int indexOf(Object obj) {
        return AbstractC5179.m9411(obj, this.f20456);
    }

    @Override // kotlin.collections.AbstractC5162, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f20456;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC5162, java.util.List
    public final ListIterator listIterator(int i) {
        C9496.m14931(i, size());
        return new C8243(this.f20456, i, size());
    }

    @Override // p140.AbstractC8244
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C8240 mo13189() {
        return new C8240(this, null, this.f20456, 0);
    }

    @Override // p140.AbstractC8244
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final AbstractC8244 mo13203(Collection collection) {
        if (collection.size() + size() > 32) {
            C8240 c8240Mo13189 = mo13189();
            c8240Mo13189.addAll(collection);
            return c8240Mo13189.m13169();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f20456, collection.size() + size());
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new C8248(objArrCopyOf);
    }

    @Override // p140.AbstractC8244
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC8244 mo13190(Object obj) {
        int size = size();
        Object[] objArr = this.f20456;
        if (size < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
            objArrCopyOf[size()] = obj;
            return new C8248(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new C8241(objArr, objArr2, size() + 1, 0);
    }

    @Override // p140.AbstractC8244
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC8244 mo13191(int i, Object obj) {
        C9496.m14931(i, size());
        if (i == size()) {
            return mo13190(obj);
        }
        int size = size();
        Object[] objArr = this.f20456;
        if (size < 32) {
            Object[] objArr2 = new Object[size() + 1];
            AbstractC5179.m9399(0, i, objArr, 6, objArr2);
            AbstractC5179.m9394(i + 1, i, objArr, size(), objArr2);
            objArr2[i] = obj;
            return new C8248(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC5179.m9394(i + 1, i, objArr, size() - 1, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new C8241(objArrCopyOf, objArr3, size() + 1, 0);
    }

    @Override // p140.AbstractC8244
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final AbstractC8244 mo13197(int i) {
        C9496.m14932(i, size());
        if (size() == 1) {
            return f20455;
        }
        int size = size() - 1;
        Object[] objArr = this.f20456;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, size);
        AbstractC5179.m9394(i, i + 1, objArr, size(), objArrCopyOf);
        return new C8248(objArrCopyOf);
    }

    @Override // p140.AbstractC8244
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC8244 mo13198(C2119 c2119) {
        int size = size();
        int size2 = size();
        Object[] objArr = this.f20456;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = objArr[i];
            if (((Boolean) c2119.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? f20455 : new C8248(AbstractC5179.m9390(objArrCopyOf, 0, size));
    }

    @Override // p140.AbstractC8244
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final AbstractC8244 mo13200(int i, Object obj) {
        C9496.m14932(i, size());
        Object[] objArr = this.f20456;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new C8248(objArrCopyOf);
    }
}
