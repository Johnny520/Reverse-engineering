package p124;

import androidx.compose.runtime.snapshots.C1284;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.AbstractC4347;
import p316.C8667;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7419 extends AbstractC7415 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C7419 f20110 = new C7419(new Object[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object[] f20111;

    public C7419(Object[] objArr) {
        this.f20111 = objArr;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C8667.m14373(i, size());
        return this.f20111[i];
    }

    @Override // kotlin.collections.AbstractC4335
    public final int getSize() {
        return this.f20111.length;
    }

    @Override // kotlin.collections.AbstractC4330, java.util.List
    public final int indexOf(Object obj) {
        return AbstractC4347.m8852(obj, this.f20111);
    }

    @Override // kotlin.collections.AbstractC4330, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f20111;
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

    @Override // kotlin.collections.AbstractC4330, java.util.List
    public final ListIterator listIterator(int i) {
        C8667.m14372(i, size());
        return new C7414(this.f20111, i, size());
    }

    @Override // p124.AbstractC7415
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C7411 mo12630() {
        return new C7411(this, null, this.f20111, 0);
    }

    @Override // p124.AbstractC7415
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final AbstractC7415 mo12644(Collection collection) {
        if (collection.size() + size() > 32) {
            C7411 c7411Mo12630 = mo12630();
            c7411Mo12630.addAll(collection);
            return c7411Mo12630.m12610();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f20111, collection.size() + size());
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new C7419(objArrCopyOf);
    }

    @Override // p124.AbstractC7415
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC7415 mo12631(Object obj) {
        int size = size();
        Object[] objArr = this.f20111;
        if (size < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
            objArrCopyOf[size()] = obj;
            return new C7419(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new C7412(objArr, objArr2, size() + 1, 0);
    }

    @Override // p124.AbstractC7415
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC7415 mo12632(int i, Object obj) {
        C8667.m14372(i, size());
        if (i == size()) {
            return mo12631(obj);
        }
        int size = size();
        Object[] objArr = this.f20111;
        if (size < 32) {
            Object[] objArr2 = new Object[size() + 1];
            AbstractC4347.m8840(0, i, objArr, 6, objArr2);
            AbstractC4347.m8835(i + 1, i, objArr, size(), objArr2);
            objArr2[i] = obj;
            return new C7419(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC4347.m8835(i + 1, i, objArr, size() - 1, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new C7412(objArrCopyOf, objArr3, size() + 1, 0);
    }

    @Override // p124.AbstractC7415
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final AbstractC7415 mo12638(int i) {
        C8667.m14373(i, size());
        if (size() == 1) {
            return f20110;
        }
        int size = size() - 1;
        Object[] objArr = this.f20111;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, size);
        AbstractC4347.m8835(i, i + 1, objArr, size(), objArrCopyOf);
        return new C7419(objArrCopyOf);
    }

    @Override // p124.AbstractC7415
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC7415 mo12639(C1284 c1284) {
        int size = size();
        int size2 = size();
        Object[] objArr = this.f20111;
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
        return size == size() ? this : size == 0 ? f20110 : new C7419(AbstractC4347.m8831(objArrCopyOf, 0, size));
    }

    @Override // p124.AbstractC7415
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final AbstractC7415 mo12641(int i, Object obj) {
        C8667.m14373(i, size());
        Object[] objArr = this.f20111;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new C7419(objArrCopyOf);
    }
}
