package com.google.protobuf;

import java.util.Comparator;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4369 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11526;

    public /* synthetic */ C4369(int i) {
        this.f11526 = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.飘花落叶言子世楪哲苏兰, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.protobuf.飘花落叶言子世楪哲苏兰, java.util.Iterator] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f11526) {
            case 0:
                ByteString byteString = (ByteString) obj;
                ByteString byteString2 = (ByteString) obj2;
                ?? Iterator2 = byteString.iterator2();
                ?? Iterator22 = byteString2.iterator2();
                while (Iterator2.hasNext() && Iterator22.hasNext()) {
                    int iCompare = Integer.compare(ByteString.toInt(Iterator2.mo8036()), ByteString.toInt(Iterator22.mo8036()));
                    if (iCompare != 0) {
                        return iCompare;
                    }
                }
                return Integer.compare(byteString.size(), byteString2.size());
            default:
                return Integer.compare(((C4496) obj).f11731.getNumber(), ((C4496) obj2).f11731.getNumber());
        }
    }
}
