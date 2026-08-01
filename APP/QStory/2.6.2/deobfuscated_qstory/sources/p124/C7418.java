package p124;

import androidx.compose.runtime.snapshots.C1284;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.AbstractC4346;
import p033.AbstractC6325;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7418 extends AbstractC7414 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C7418 f20115 = new C7418(new Object[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object[] f20116;

    public C7418(Object[] objArr) {
        this.f20116 = objArr;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC6325.m11857(i, size());
        return this.f20116[i];
    }

    @Override // kotlin.collections.AbstractC4334
    public final int getSize() {
        return this.f20116.length;
    }

    @Override // kotlin.collections.AbstractC4329, java.util.List
    public final int indexOf(Object obj) {
        return AbstractC4346.m8844(obj, this.f20116);
    }

    @Override // kotlin.collections.AbstractC4329, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f20116;
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

    @Override // kotlin.collections.AbstractC4329, java.util.List
    public final ListIterator listIterator(int i) {
        AbstractC6325.m11856(i, size());
        return new C7413(this.f20116, i, size());
    }

    @Override // p124.AbstractC7414
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C7410 mo12603() {
        return new C7410(this, null, this.f20116, 0);
    }

    @Override // p124.AbstractC7414
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final AbstractC7414 mo12617(Collection collection) {
        if (collection.size() + size() > 32) {
            C7410 c7410Mo12603 = mo12603();
            c7410Mo12603.addAll(collection);
            return c7410Mo12603.m12584();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f20116, collection.size() + size());
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new C7418(objArrCopyOf);
    }

    @Override // p124.AbstractC7414
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC7414 mo12604(Object obj) {
        int size = size();
        Object[] objArr = this.f20116;
        if (size < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
            objArrCopyOf[size()] = obj;
            return new C7418(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new C7411(objArr, objArr2, size() + 1, 0);
    }

    @Override // p124.AbstractC7414
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC7414 mo12605(int i, Object obj) {
        AbstractC6325.m11856(i, size());
        if (i == size()) {
            return mo12604(obj);
        }
        int size = size();
        Object[] objArr = this.f20116;
        if (size < 32) {
            Object[] objArr2 = new Object[size() + 1];
            AbstractC4346.m8837(0, i, objArr, 6, objArr2);
            AbstractC4346.m8839(i + 1, i, objArr, size(), objArr2);
            objArr2[i] = obj;
            return new C7418(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC4346.m8839(i + 1, i, objArr, size() - 1, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new C7411(objArrCopyOf, objArr3, size() + 1, 0);
    }

    @Override // p124.AbstractC7414
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final AbstractC7414 mo12611(int i) {
        AbstractC6325.m11857(i, size());
        if (size() == 1) {
            return f20115;
        }
        int size = size() - 1;
        Object[] objArr = this.f20116;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, size);
        AbstractC4346.m8839(i, i + 1, objArr, size(), objArrCopyOf);
        return new C7418(objArrCopyOf);
    }

    @Override // p124.AbstractC7414
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC7414 mo12612(C1284 c1284) {
        int size = size();
        int size2 = size();
        Object[] objArr = this.f20116;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = objArr[i];
            if (((Boolean) c1284.invoke(obj)).booleanValue()) {
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
        return size == size() ? this : size == 0 ? f20115 : new C7418(AbstractC4346.m8862(objArrCopyOf, 0, size));
    }

    @Override // p124.AbstractC7414
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final AbstractC7414 mo12614(int i, Object obj) {
        AbstractC6325.m11857(i, size());
        Object[] objArr = this.f20116;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new C7418(objArrCopyOf);
    }
}
