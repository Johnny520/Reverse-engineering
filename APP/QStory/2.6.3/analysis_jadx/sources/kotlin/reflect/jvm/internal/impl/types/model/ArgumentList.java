package kotlin.reflect.jvm.internal.impl.types.model;

import java.util.ArrayList;
import p097.InterfaceC7226;
import p097.InterfaceC7230;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ArgumentList extends ArrayList<InterfaceC7230> implements InterfaceC7226 {
    public ArgumentList(int i) {
        super(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof InterfaceC7230) {
            return contains((InterfaceC7230) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof InterfaceC7230) {
            return indexOf((InterfaceC7230) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof InterfaceC7230) {
            return lastIndexOf((InterfaceC7230) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof InterfaceC7230) {
            return remove((InterfaceC7230) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public /* bridge */ boolean contains(InterfaceC7230 interfaceC7230) {
        return super.contains((Object) interfaceC7230);
    }

    public /* bridge */ int indexOf(InterfaceC7230 interfaceC7230) {
        return super.indexOf((Object) interfaceC7230);
    }

    public /* bridge */ int lastIndexOf(InterfaceC7230 interfaceC7230) {
        return super.lastIndexOf((Object) interfaceC7230);
    }

    public /* bridge */ boolean remove(InterfaceC7230 interfaceC7230) {
        return super.remove((Object) interfaceC7230);
    }
}
