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
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4713 extends AbstractList implements RandomAccess, InterfaceC4717 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4694 f13777 = new C4694(new C4713());

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f13778;

    public C4713(InterfaceC4717 interfaceC4717) {
        this.f13778 = new ArrayList(interfaceC4717.size());
        addAll(interfaceC4717);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f13778.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC4717) {
            collection = ((InterfaceC4717) collection).mo9348();
        }
        boolean zAddAll = this.f13778.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f13778.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.f13778;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC4709) {
            AbstractC4709 abstractC4709 = (AbstractC4709) obj;
            String strM9412 = abstractC4709.m9412();
            if (abstractC4709.mo9364()) {
                arrayList.set(i, strM9412);
            }
            return strM9412;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = AbstractC4714.f13779;
        try {
            String str = new String(bArr, "UTF-8");
            if (AbstractC4704.m9365(0, bArr, bArr.length) == 0) {
                arrayList.set(i, str);
            }
            return str;
        } catch (UnsupportedEncodingException e) {
            C0276.m847("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object objRemove = this.f13778.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof AbstractC4709) {
            return ((AbstractC4709) objRemove).m9412();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = AbstractC4714.f13779;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C0276.m847("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = this.f13778.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC4709) {
            return ((AbstractC4709) obj2).m9412();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = AbstractC4714.f13779;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C0276.m847("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13778.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final AbstractC4709 mo9346(int i) {
        AbstractC4709 c4715;
        ArrayList arrayList = this.f13778;
        Object obj = arrayList.get(i);
        if (obj instanceof AbstractC4709) {
            c4715 = (AbstractC4709) obj;
        } else if (obj instanceof String) {
            try {
                c4715 = new C4715(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                C0276.m847("UTF-8 not supported?", e);
                return null;
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            c4715 = new C4715(bArr2);
        }
        if (c4715 != obj) {
            arrayList.set(i, c4715);
        }
        return c4715;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C4694 mo9347() {
        return new C4694(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final List mo9348() {
        return Collections.unmodifiableList(this.f13778);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo9349(C4715 c4715) {
        this.f13778.add(c4715);
        ((AbstractList) this).modCount++;
    }

    public C4713() {
        this.f13778 = new ArrayList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f13778.size(), collection);
    }
}
