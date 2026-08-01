package p160kb;

import java.util.ArrayList;

/* JADX INFO: renamed from: kb.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4221a extends ArrayList implements InterfaceC4232l {
    public C4221a(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: a */
    public /* bridge */ boolean m16711a(InterfaceC4233m interfaceC4233m) {
        return super.contains(interfaceC4233m);
    }

    /* JADX INFO: renamed from: c */
    public /* bridge */ int m16712c() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof InterfaceC4233m) {
            return m16711a((InterfaceC4233m) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public /* bridge */ int m16713d(InterfaceC4233m interfaceC4233m) {
        return super.indexOf(interfaceC4233m);
    }

    /* JADX INFO: renamed from: h */
    public /* bridge */ int m16714h(InterfaceC4233m interfaceC4233m) {
        return super.lastIndexOf(interfaceC4233m);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof InterfaceC4233m) {
            return m16713d((InterfaceC4233m) obj);
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public /* bridge */ boolean m16715l(InterfaceC4233m interfaceC4233m) {
        return super.remove(interfaceC4233m);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof InterfaceC4233m) {
            return m16714h((InterfaceC4233m) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof InterfaceC4233m) {
            return m16715l((InterfaceC4233m) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return m16712c();
    }
}
