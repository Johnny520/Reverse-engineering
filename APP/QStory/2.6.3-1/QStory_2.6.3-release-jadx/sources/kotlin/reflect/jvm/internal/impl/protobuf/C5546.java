package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.collection.C1123;
import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5546 extends AbstractList implements RandomAccess, InterfaceC5550 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5527 f14126 = new C5527(new C5546());

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f14127;

    public C5546(InterfaceC5550 interfaceC5550) {
        this.f14127 = new ArrayList(interfaceC5550.size());
        addAll(interfaceC5550);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f14127.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC5550) {
            collection = ((InterfaceC5550) collection).mo9898();
        }
        boolean zAddAll = this.f14127.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f14127.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.f14127;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC5542) {
            AbstractC5542 abstractC5542 = (AbstractC5542) obj;
            String strM9961 = abstractC5542.m9961();
            if (abstractC5542.mo9913()) {
                arrayList.set(i, strM9961);
            }
            return strM9961;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = AbstractC5547.f14128;
        try {
            String str = new String(bArr, "UTF-8");
            if (AbstractC5537.m9914(0, bArr, bArr.length) == 0) {
                arrayList.set(i, str);
            }
            return str;
        } catch (UnsupportedEncodingException e) {
            C1123.m1408("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object objRemove = this.f14127.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof AbstractC5542) {
            return ((AbstractC5542) objRemove).m9961();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = AbstractC5547.f14128;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C1123.m1408("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = this.f14127.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC5542) {
            return ((AbstractC5542) obj2).m9961();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = AbstractC5547.f14128;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C1123.m1408("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14127.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5550
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final void mo9895(C5548 c5548) {
        this.f14127.add(c5548);
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5550
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final AbstractC5542 mo9896(int i) {
        AbstractC5542 c5548;
        ArrayList arrayList = this.f14127;
        Object obj = arrayList.get(i);
        if (obj instanceof AbstractC5542) {
            c5548 = (AbstractC5542) obj;
        } else if (obj instanceof String) {
            try {
                c5548 = new C5548(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                C1123.m1408("UTF-8 not supported?", e);
                return null;
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            c5548 = new C5548(bArr2);
        }
        if (c5548 != obj) {
            arrayList.set(i, c5548);
        }
        return c5548;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5550
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C5527 mo9897() {
        return new C5527(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5550
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final List mo9898() {
        return Collections.unmodifiableList(this.f14127);
    }

    public C5546() {
        this.f14127 = new ArrayList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f14127.size(), collection);
    }
}
