package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3383 extends AbstractC3547 implements InterfaceC3424, RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C3383 f11032 = new C3383();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f11033;

    public C3383(InterfaceC3424 interfaceC3424) {
        super(true);
        this.f11033 = new ArrayList(interfaceC3424.size());
        addAll(interfaceC3424);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m7801();
        this.f11033.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC3547, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m7801();
        if (collection instanceof InterfaceC3424) {
            collection = ((InterfaceC3424) collection).mo7507();
        }
        boolean zAddAll = this.f11033.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.protobuf.AbstractC3547, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m7801();
        this.f11033.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC3547, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m7801();
        Object objRemove = this.f11033.remove(i);
        ((AbstractList) this).modCount++;
        return objRemove instanceof String ? (String) objRemove : objRemove instanceof ByteString ? ((ByteString) objRemove).toStringUtf8() : new String((byte[]) objRemove, AbstractC3401.f11054);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11033.size();
    }

    @Override // com.google.protobuf.InterfaceC3424
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final Object mo7503(int i) {
        return this.f11033.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3424
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC3424 mo7504() {
        return this.f11194 ? new C3734(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final String get(int i) {
        List list = this.f11033;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                list.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, AbstractC3401.f11054);
        if (AbstractC3723.f11538.mo7545(0, bArr, bArr.length)) {
            list.set(i, str);
        }
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7506(String str) {
        m7801();
        this.f11033.add(str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.InterfaceC3424
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List mo7507() {
        return Collections.unmodifiableList(this.f11033);
    }

    @Override // com.google.protobuf.InterfaceC3424
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo7508(ByteString byteString) {
        m7801();
        this.f11033.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final String set(int i, String str) {
        m7801();
        Object obj = this.f11033.set(i, str);
        return obj instanceof String ? (String) obj : obj instanceof ByteString ? ((ByteString) obj).toStringUtf8() : new String((byte[]) obj, AbstractC3401.f11054);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ByteString m7510(int i) {
        List list = this.f11033;
        Object obj = list.get(i);
        ByteString byteStringCopyFromUtf8 = obj instanceof ByteString ? (ByteString) obj : obj instanceof String ? ByteString.copyFromUtf8((String) obj) : ByteString.copyFrom((byte[]) obj);
        if (byteStringCopyFromUtf8 != obj) {
            list.set(i, byteStringCopyFromUtf8);
        }
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3402
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC3402 mo7499(int i) {
        List list = this.f11033;
        if (i < list.size()) {
            C5919.m11245();
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new C3383(arrayList);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m7506((String) obj);
        return true;
    }

    public C3383(ArrayList arrayList) {
        super(true);
        this.f11033 = arrayList;
    }

    public C3383() {
        super(false);
        this.f11033 = Collections.EMPTY_LIST;
    }

    public C3383(int i) {
        this(new ArrayList(i));
    }

    @Override // com.google.protobuf.AbstractC3547, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f11033.size(), collection);
    }
}
