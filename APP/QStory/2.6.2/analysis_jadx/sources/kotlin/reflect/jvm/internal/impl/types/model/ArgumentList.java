package kotlin.reflect.jvm.internal.impl.types.model;

import java.util.ArrayList;
import p097.InterfaceC7225;
import p097.InterfaceC7229;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ArgumentList extends ArrayList<InterfaceC7229> implements InterfaceC7225 {
    public ArgumentList(int i) {
        super(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof InterfaceC7229) {
            return contains((InterfaceC7229) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof InterfaceC7229) {
            return indexOf((InterfaceC7229) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof InterfaceC7229) {
            return lastIndexOf((InterfaceC7229) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof InterfaceC7229) {
            return remove((InterfaceC7229) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public /* bridge */ boolean contains(InterfaceC7229 interfaceC7229) {
        return super.contains((Object) interfaceC7229);
    }

    public /* bridge */ int indexOf(InterfaceC7229 interfaceC7229) {
        return super.indexOf((Object) interfaceC7229);
    }

    public /* bridge */ int lastIndexOf(InterfaceC7229 interfaceC7229) {
        return super.lastIndexOf((Object) interfaceC7229);
    }

    public /* bridge */ boolean remove(InterfaceC7229 interfaceC7229) {
        return super.remove((Object) interfaceC7229);
    }
}
