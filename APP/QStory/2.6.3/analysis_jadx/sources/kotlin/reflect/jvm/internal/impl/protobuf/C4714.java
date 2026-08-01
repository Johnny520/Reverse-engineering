package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.collection.C0276;
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
public final class C4714 extends AbstractList implements RandomAccess, InterfaceC4718 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4695 f13781 = new C4695(new C4714());

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f13782;

    public C4714(InterfaceC4718 interfaceC4718) {
        this.f13782 = new ArrayList(interfaceC4718.size());
        addAll(interfaceC4718);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f13782.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC4718) {
            collection = ((InterfaceC4718) collection).mo9339();
        }
        boolean zAddAll = this.f13782.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f13782.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.f13782;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC4710) {
            AbstractC4710 abstractC4710 = (AbstractC4710) obj;
            String strM9402 = abstractC4710.m9402();
            if (abstractC4710.mo9354()) {
                arrayList.set(i, strM9402);
            }
            return strM9402;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = AbstractC4715.f13783;
        try {
            String str = new String(bArr, "UTF-8");
            if (AbstractC4705.m9355(0, bArr, bArr.length) == 0) {
                arrayList.set(i, str);
            }
            return str;
        } catch (UnsupportedEncodingException e) {
            C0276.m848("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object objRemove = this.f13782.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof AbstractC4710) {
            return ((AbstractC4710) objRemove).m9402();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = AbstractC4715.f13783;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C0276.m848("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = this.f13782.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC4710) {
            return ((AbstractC4710) obj2).m9402();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = AbstractC4715.f13783;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C0276.m848("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13782.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4718
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final void mo9336(C4716 c4716) {
        this.f13782.add(c4716);
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4718
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final AbstractC4710 mo9337(int i) {
        AbstractC4710 c4716;
        ArrayList arrayList = this.f13782;
        Object obj = arrayList.get(i);
        if (obj instanceof AbstractC4710) {
            c4716 = (AbstractC4710) obj;
        } else if (obj instanceof String) {
            try {
                c4716 = new C4716(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                C0276.m848("UTF-8 not supported?", e);
                return null;
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            c4716 = new C4716(bArr2);
        }
        if (c4716 != obj) {
            arrayList.set(i, c4716);
        }
        return c4716;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4718
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C4695 mo9338() {
        return new C4695(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4718
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final List mo9339() {
        return Collections.unmodifiableList(this.f13782);
    }

    public C4714() {
        this.f13782 = new ArrayList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f13782.size(), collection);
    }
}
