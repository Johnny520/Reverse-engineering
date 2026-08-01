package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4216 extends AbstractC4380 implements InterfaceC4257, RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C4216 f11382 = new C4216();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f11383;

    public C4216(InterfaceC4257 interfaceC4257) {
        super(true);
        this.f11383 = new ArrayList(interfaceC4257.size());
        addAll(interfaceC4257);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m8347();
        this.f11383.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC4380, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m8347();
        if (collection instanceof InterfaceC4257) {
            collection = ((InterfaceC4257) collection).mo8053();
        }
        boolean zAddAll = this.f11383.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.protobuf.AbstractC4380, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m8347();
        this.f11383.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC4380, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m8347();
        Object objRemove = this.f11383.remove(i);
        ((AbstractList) this).modCount++;
        return objRemove instanceof String ? (String) objRemove : objRemove instanceof ByteString ? ((ByteString) objRemove).toStringUtf8() : new String((byte[]) objRemove, AbstractC4234.f11404);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11383.size();
    }

    @Override // com.google.protobuf.InterfaceC4257
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final Object mo8049(int i) {
        return this.f11383.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4257
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC4257 mo8050() {
        return this.f11544 ? new C4567(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final String get(int i) {
        List list = this.f11383;
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
        String str = new String(bArr, AbstractC4234.f11404);
        if (AbstractC4556.f11888.mo8091(0, bArr, bArr.length)) {
            list.set(i, str);
        }
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m8052(String str) {
        m8347();
        this.f11383.add(str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.InterfaceC4257
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List mo8053() {
        return Collections.unmodifiableList(this.f11383);
    }

    @Override // com.google.protobuf.InterfaceC4257
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo8054(ByteString byteString) {
        m8347();
        this.f11383.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final String set(int i, String str) {
        m8347();
        Object obj = this.f11383.set(i, str);
        return obj instanceof String ? (String) obj : obj instanceof ByteString ? ((ByteString) obj).toStringUtf8() : new String((byte[]) obj, AbstractC4234.f11404);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ByteString m8056(int i) {
        List list = this.f11383;
        Object obj = list.get(i);
        ByteString byteStringCopyFromUtf8 = obj instanceof ByteString ? (ByteString) obj : obj instanceof String ? ByteString.copyFromUtf8((String) obj) : ByteString.copyFrom((byte[]) obj);
        if (byteStringCopyFromUtf8 != obj) {
            list.set(i, byteStringCopyFromUtf8);
        }
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4235
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC4235 mo8045(int i) {
        List list = this.f11383;
        if (i < list.size()) {
            C6755.m11865();
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new C4216(arrayList);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m8052((String) obj);
        return true;
    }

    public C4216(ArrayList arrayList) {
        super(true);
        this.f11383 = arrayList;
    }

    public C4216() {
        super(false);
        this.f11383 = Collections.EMPTY_LIST;
    }

    public C4216(int i) {
        this(new ArrayList(i));
    }

    @Override // com.google.protobuf.AbstractC4380, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f11383.size(), collection);
    }
}
