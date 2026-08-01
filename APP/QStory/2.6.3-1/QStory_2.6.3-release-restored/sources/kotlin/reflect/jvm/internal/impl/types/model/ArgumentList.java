package kotlin.reflect.jvm.internal.impl.types.model;

import java.util.ArrayList;
import p113.InterfaceC8055;
import p113.InterfaceC8059;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ArgumentList extends ArrayList<InterfaceC8059> implements InterfaceC8055 {
    public ArgumentList(int i) {
        super(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof InterfaceC8059) {
            return contains((InterfaceC8059) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof InterfaceC8059) {
            return indexOf((InterfaceC8059) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof InterfaceC8059) {
            return lastIndexOf((InterfaceC8059) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof InterfaceC8059) {
            return remove((InterfaceC8059) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public /* bridge */ boolean contains(InterfaceC8059 interfaceC8059) {
        return super.contains((Object) interfaceC8059);
    }

    public /* bridge */ int indexOf(InterfaceC8059 interfaceC8059) {
        return super.indexOf((Object) interfaceC8059);
    }

    public /* bridge */ int lastIndexOf(InterfaceC8059 interfaceC8059) {
        return super.lastIndexOf((Object) interfaceC8059);
    }

    public /* bridge */ boolean remove(InterfaceC8059 interfaceC8059) {
        return super.remove((Object) interfaceC8059);
    }
}
