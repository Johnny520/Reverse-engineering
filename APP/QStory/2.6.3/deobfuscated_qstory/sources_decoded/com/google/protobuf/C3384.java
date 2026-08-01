package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3384 extends AbstractC3548 implements InterfaceC3425, RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C3384 f11037 = new C3384();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f11038;

    public C3384(InterfaceC3425 interfaceC3425) {
        super(true);
        this.f11038 = new ArrayList(interfaceC3425.size());
        addAll(interfaceC3425);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m7788();
        this.f11038.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC3548, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m7788();
        if (collection instanceof InterfaceC3425) {
            collection = ((InterfaceC3425) collection).mo7494();
        }
        boolean zAddAll = this.f11038.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.protobuf.AbstractC3548, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m7788();
        this.f11038.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC3548, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m7788();
        Object objRemove = this.f11038.remove(i);
        ((AbstractList) this).modCount++;
        return objRemove instanceof String ? (String) objRemove : objRemove instanceof ByteString ? ((ByteString) objRemove).toStringUtf8() : new String((byte[]) objRemove, AbstractC3402.f11059);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11038.size();
    }

    @Override // com.google.protobuf.InterfaceC3425
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final Object mo7490(int i) {
        return this.f11038.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3425
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC3425 mo7491() {
        return this.f11199 ? new C3735(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final String get(int i) {
        List list = this.f11038;
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
        String str = new String(bArr, AbstractC3402.f11059);
        if (AbstractC3724.f11543.mo7532(0, bArr, bArr.length)) {
            list.set(i, str);
        }
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7493(String str) {
        m7788();
        this.f11038.add(str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.InterfaceC3425
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List mo7494() {
        return Collections.unmodifiableList(this.f11038);
    }

    @Override // com.google.protobuf.InterfaceC3425
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo7495(ByteString byteString) {
        m7788();
        this.f11038.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final String set(int i, String str) {
        m7788();
        Object obj = this.f11038.set(i, str);
        return obj instanceof String ? (String) obj : obj instanceof ByteString ? ((ByteString) obj).toStringUtf8() : new String((byte[]) obj, AbstractC3402.f11059);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ByteString m7497(int i) {
        List list = this.f11038;
        Object obj = list.get(i);
        ByteString byteStringCopyFromUtf8 = obj instanceof ByteString ? (ByteString) obj : obj instanceof String ? ByteString.copyFromUtf8((String) obj) : ByteString.copyFrom((byte[]) obj);
        if (byteStringCopyFromUtf8 != obj) {
            list.set(i, byteStringCopyFromUtf8);
        }
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3403
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC3403 mo7486(int i) {
        List list = this.f11038;
        if (i < list.size()) {
            C5925.m11306();
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new C3384(arrayList);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m7493((String) obj);
        return true;
    }

    public C3384(ArrayList arrayList) {
        super(true);
        this.f11038 = arrayList;
    }

    public C3384() {
        super(false);
        this.f11038 = Collections.EMPTY_LIST;
    }

    public C3384(int i) {
        this(new ArrayList(i));
    }

    @Override // com.google.protobuf.AbstractC3548, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f11038.size(), collection);
    }
}
