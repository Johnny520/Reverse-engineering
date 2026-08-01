package p103;

import androidx.compose.ui.graphics.vector.C1541;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4347;
import kotlin.collections.AbstractC4352;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.sequences.C5126;

/* JADX INFO: renamed from: 飘花落叶言世苏楪兰子哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7273 extends AbstractC4352 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ int f19370 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f19371;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Object f19372;

    public C7273(int i) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object obj2;
        if (size() == 0) {
            this.f19372 = obj;
        } else if (size() != 1) {
            int size = size();
            Object obj3 = this.f19372;
            if (size < 5) {
                obj3.getClass();
                Object[] objArr = (Object[]) obj3;
                if (AbstractC4347.m8837(obj, objArr)) {
                    return false;
                }
                if (size() == 4) {
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC4339.m8772(objArrCopyOf.length));
                    AbstractC4347.m8848(objArrCopyOf, linkedHashSet);
                    linkedHashSet.add(obj);
                    obj2 = linkedHashSet;
                } else {
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr, size() + 1);
                    objArrCopyOf2[objArrCopyOf2.length - 1] = obj;
                    obj2 = objArrCopyOf2;
                }
                this.f19372 = obj2;
            } else {
                obj3.getClass();
                if (!AbstractC4388.m8889(obj3).add(obj)) {
                    return false;
                }
            }
        } else {
            if (AbstractC4395.m8907(this.f19372, obj)) {
                return false;
            }
            this.f19372 = new Object[]{this.f19372, obj};
        }
        this.f19371 = size() + 1;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f19372 = null;
        this.f19371 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return AbstractC4395.m8907(this.f19372, obj);
        }
        int size = size();
        Object obj2 = this.f19372;
        if (size < 5) {
            obj2.getClass();
            return AbstractC4347.m8837(obj, (Object[]) obj2);
        }
        obj2.getClass();
        return ((Set) obj2).contains(obj);
    }

    @Override // kotlin.collections.AbstractC4352
    public final int getSize() {
        return this.f19371;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (size() == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (size() == 1) {
            return new C5126(this.f19372, 1);
        }
        int size = size();
        Object obj = this.f19372;
        if (size < 5) {
            obj.getClass();
            return new C1541((Object[]) obj);
        }
        obj.getClass();
        return AbstractC4388.m8889(obj).iterator();
    }
}
