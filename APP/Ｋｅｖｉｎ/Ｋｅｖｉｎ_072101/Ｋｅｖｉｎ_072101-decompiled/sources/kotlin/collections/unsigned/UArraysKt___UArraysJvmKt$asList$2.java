package kotlin.collections.unsigned;

/* JADX INFO: compiled from: _UArraysJvm.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u001b\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0096\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\nH\u0016J\u001a\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, m115d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$2", "Lkotlin/collections/AbstractList;", "Lkotlin/ULong;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "contains", "", "element", "contains-VKZWuLQ", "(J)Z", "get", "index", "get-s-VKNKU", "(I)J", "indexOf", "indexOf-VKZWuLQ", "(J)I", "isEmpty", "lastIndexOf", "lastIndexOf-VKZWuLQ", "kotlin-stdlib"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public final class UArraysKt___UArraysJvmKt$asList$2 extends kotlin.collections.AbstractList<kotlin.ULong> implements java.util.RandomAccess {
    final /* synthetic */ long[] $this_asList;

    UArraysKt___UArraysJvmKt$asList$2(long[] r1) {
            r0 = this;
            r0.$this_asList = r1
            r0.<init>()
            return
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.ULong
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r3
            kotlin.ULong r0 = (kotlin.ULong) r0
            long r0 = r0.m8895unboximpl()
            boolean r0 = r2.m9180containsVKZWuLQ(r0)
            return r0
    }

    /* JADX INFO: renamed from: contains-VKZWuLQ, reason: not valid java name */
    public boolean m9180containsVKZWuLQ(long r2) {
            r1 = this;
            long[] r0 = r1.$this_asList
            boolean r0 = kotlin.ULongArray.m8899containsVKZWuLQ(r0, r2)
            return r0
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r3) {
            r2 = this;
            long r0 = r2.m9181getsVKNKU(r3)
            kotlin.ULong r0 = kotlin.ULong.m8837boximpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: get-s-VKNKU, reason: not valid java name */
    public long m9181getsVKNKU(int r3) {
            r2 = this;
            long[] r0 = r2.$this_asList
            long r0 = kotlin.ULongArray.m8903getsVKNKU(r0, r3)
            return r0
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
            r1 = this;
            long[] r0 = r1.$this_asList
            int r0 = kotlin.ULongArray.m8904getSizeimpl(r0)
            return r0
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.ULong
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            r0 = r3
            kotlin.ULong r0 = (kotlin.ULong) r0
            long r0 = r0.m8895unboximpl()
            int r0 = r2.m9182indexOfVKZWuLQ(r0)
            return r0
    }

    /* JADX INFO: renamed from: indexOf-VKZWuLQ, reason: not valid java name */
    public int m9182indexOfVKZWuLQ(long r2) {
            r1 = this;
            long[] r0 = r1.$this_asList
            int r0 = kotlin.collections.ArraysKt.indexOf(r0, r2)
            return r0
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            long[] r0 = r1.$this_asList
            boolean r0 = kotlin.ULongArray.m8906isEmptyimpl(r0)
            return r0
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.ULong
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            r0 = r3
            kotlin.ULong r0 = (kotlin.ULong) r0
            long r0 = r0.m8895unboximpl()
            int r0 = r2.m9183lastIndexOfVKZWuLQ(r0)
            return r0
    }

    /* JADX INFO: renamed from: lastIndexOf-VKZWuLQ, reason: not valid java name */
    public int m9183lastIndexOfVKZWuLQ(long r2) {
            r1 = this;
            long[] r0 = r1.$this_asList
            int r0 = kotlin.collections.ArraysKt.lastIndexOf(r0, r2)
            return r0
    }
}
