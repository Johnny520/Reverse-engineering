package p103;

import androidx.compose.ui.graphics.vector.C1541;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4346;
import kotlin.collections.AbstractC4351;
import kotlin.jvm.internal.AbstractC4387;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.sequences.C5125;

/* JADX INFO: renamed from: 飘花落叶言世苏楪兰子哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7272 extends AbstractC4351 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ int f19375 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f19376;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Object f19377;

    public C7272(int i) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object obj2;
        if (size() == 0) {
            this.f19377 = obj;
        } else if (size() != 1) {
            int size = size();
            Object obj3 = this.f19377;
            if (size < 5) {
                obj3.getClass();
                Object[] objArr = (Object[]) obj3;
                if (AbstractC4346.m8843(obj, objArr)) {
                    return false;
                }
                if (size() == 4) {
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC4338.m8779(objArrCopyOf.length));
                    AbstractC4346.m8854(objArrCopyOf, linkedHashSet);
                    linkedHashSet.add(obj);
                    obj2 = linkedHashSet;
                } else {
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr, size() + 1);
                    objArrCopyOf2[objArrCopyOf2.length - 1] = obj;
                    obj2 = objArrCopyOf2;
                }
                this.f19377 = obj2;
            } else {
                obj3.getClass();
                if (!AbstractC4387.m8899(obj3).add(obj)) {
                    return false;
                }
            }
        } else {
            if (AbstractC4394.m8917(this.f19377, obj)) {
                return false;
            }
            this.f19377 = new Object[]{this.f19377, obj};
        }
        this.f19376 = size() + 1;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f19377 = null;
        this.f19376 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return AbstractC4394.m8917(this.f19377, obj);
        }
        int size = size();
        Object obj2 = this.f19377;
        if (size < 5) {
            obj2.getClass();
            return AbstractC4346.m8843(obj, (Object[]) obj2);
        }
        obj2.getClass();
        return ((Set) obj2).contains(obj);
    }

    @Override // kotlin.collections.AbstractC4351
    public final int getSize() {
        return this.f19376;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (size() == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (size() == 1) {
            return new C5125(this.f19377, 1);
        }
        int size = size();
        Object obj = this.f19377;
        if (size < 5) {
            obj.getClass();
            return new C1541((Object[]) obj);
        }
        obj.getClass();
        return AbstractC4387.m8899(obj).iterator();
    }
}
