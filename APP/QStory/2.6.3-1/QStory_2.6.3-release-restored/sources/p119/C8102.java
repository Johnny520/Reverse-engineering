package p119;

import androidx.compose.p001ui.graphics.vector.C2376;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5179;
import kotlin.collections.AbstractC5184;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.sequences.C5958;

/* JADX INFO: renamed from: 飘花落叶言世苏楪兰子哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8102 extends AbstractC5184 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ int f19715 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f19716;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Object f19717;

    public C8102(int i) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object obj2;
        if (size() == 0) {
            this.f19717 = obj;
        } else if (size() != 1) {
            int size = size();
            Object obj3 = this.f19717;
            if (size < 5) {
                obj3.getClass();
                Object[] objArr = (Object[]) obj3;
                if (AbstractC5179.m9396(obj, objArr)) {
                    return false;
                }
                if (size() == 4) {
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC5171.m9331(objArrCopyOf.length));
                    AbstractC5179.m9407(objArrCopyOf, linkedHashSet);
                    linkedHashSet.add(obj);
                    obj2 = linkedHashSet;
                } else {
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr, size() + 1);
                    objArrCopyOf2[objArrCopyOf2.length - 1] = obj;
                    obj2 = objArrCopyOf2;
                }
                this.f19717 = obj2;
            } else {
                obj3.getClass();
                if (!AbstractC5220.m9448(obj3).add(obj)) {
                    return false;
                }
            }
        } else {
            if (AbstractC5227.m9466(this.f19717, obj)) {
                return false;
            }
            this.f19717 = new Object[]{this.f19717, obj};
        }
        this.f19716 = size() + 1;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f19717 = null;
        this.f19716 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return AbstractC5227.m9466(this.f19717, obj);
        }
        int size = size();
        Object obj2 = this.f19717;
        if (size < 5) {
            obj2.getClass();
            return AbstractC5179.m9396(obj, (Object[]) obj2);
        }
        obj2.getClass();
        return ((Set) obj2).contains(obj);
    }

    @Override // kotlin.collections.AbstractC5184
    public final int getSize() {
        return this.f19716;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (size() == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (size() == 1) {
            return new C5958(this.f19717, 1);
        }
        int size = size();
        Object obj = this.f19717;
        if (size < 5) {
            obj.getClass();
            return new C2376((Object[]) obj);
        }
        obj.getClass();
        return AbstractC5220.m9448(obj).iterator();
    }
}
