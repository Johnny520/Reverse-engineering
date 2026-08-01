package p119;

import androidx.activity.AbstractC0900;
import io.ktor.util.C5043;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: renamed from: 飘花落叶言世苏楪兰子哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8103 extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f19718;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f19719;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m13046(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        if (i < 0 || i > (i2 = this.f19719)) {
            C5043.m9173(AbstractC0900.m710(i, "Index: ", ", Size: "), this.f19719);
            return;
        }
        if (i2 == 0) {
            this.f19718 = obj;
        } else if (i2 == 1 && i == 0) {
            this.f19718 = new Object[]{obj, this.f19718};
        } else {
            Object[] objArr = new Object[i2 + 1];
            Object obj2 = this.f19718;
            if (i2 == 1) {
                objArr[0] = obj2;
            } else {
                Object[] objArr2 = (Object[]) obj2;
                System.arraycopy(objArr2, 0, objArr, 0, i);
                System.arraycopy(objArr2, i, objArr, i + 1, this.f19719 - i);
            }
            objArr[i] = obj;
            this.f19718 = objArr;
        }
        this.f19719++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f19718 = null;
        this.f19719 = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f19719)) {
            C5043.m9173(AbstractC0900.m710(i, "Index: ", ", Size: "), this.f19719);
            return null;
        }
        Object obj = this.f19718;
        return i2 == 1 ? obj : ((Object[]) obj)[i];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        int i = this.f19719;
        if (i == 0) {
            return C8097.f19711;
        }
        if (i == 1) {
            return new C8096(this);
        }
        Iterator it = super.iterator();
        if (it != null) {
            return it;
        }
        m13046(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f19719)) {
            C5043.m9173(AbstractC0900.m710(i, "Index: ", ", Size: "), this.f19719);
            return null;
        }
        Object obj = this.f19718;
        if (i2 == 1) {
            this.f19718 = null;
        } else {
            Object[] objArr = (Object[]) obj;
            Object obj2 = objArr[i];
            if (i2 == 2) {
                this.f19718 = objArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    System.arraycopy(objArr, i + 1, objArr, i, i3);
                }
                objArr[this.f19719 - 1] = null;
            }
            obj = obj2;
        }
        this.f19719--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        if (i < 0 || i >= (i2 = this.f19719)) {
            C5043.m9173(AbstractC0900.m710(i, "Index: ", ", Size: "), this.f19719);
            return null;
        }
        Object obj2 = this.f19718;
        if (i2 == 1) {
            this.f19718 = obj;
            return obj2;
        }
        Object[] objArr = (Object[]) obj2;
        Object obj3 = objArr[i];
        objArr[i] = obj;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19719;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        int i = this.f19719;
        if (i >= 2) {
            Arrays.sort((Object[]) this.f19718, 0, i, comparator);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            m13046(4);
            throw null;
        }
        int length = objArr.length;
        int i = this.f19719;
        if (i == 1) {
            if (length == 0) {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.f19718;
                return objArr2;
            }
            objArr[0] = this.f19718;
        } else {
            if (length < i) {
                Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.f19718, i, objArr.getClass());
                if (objArrCopyOf != null) {
                    return objArrCopyOf;
                }
                m13046(6);
                throw null;
            }
            if (i != 0) {
                System.arraycopy(this.f19718, 0, objArr, 0, i);
            }
        }
        int i2 = this.f19719;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i = this.f19719;
        if (i == 0) {
            this.f19718 = obj;
        } else {
            Object obj2 = this.f19718;
            if (i == 1) {
                this.f19718 = new Object[]{obj2, obj};
            } else {
                Object[] objArr = (Object[]) obj2;
                int length = objArr.length;
                if (i >= length) {
                    int i2 = ((length * 3) / 2) + 1;
                    int i3 = i + 1;
                    if (i2 < i3) {
                        i2 = i3;
                    }
                    Object[] objArr2 = new Object[i2];
                    this.f19718 = objArr2;
                    System.arraycopy(objArr, 0, objArr2, 0, length);
                    objArr = objArr2;
                }
                objArr[this.f19719] = obj;
            }
        }
        this.f19719++;
        ((AbstractList) this).modCount++;
        return true;
    }
}
