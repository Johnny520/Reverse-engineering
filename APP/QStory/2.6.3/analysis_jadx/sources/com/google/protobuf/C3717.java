package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3717 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC3453 f11537;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C3657 f11538;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f11539;

    public C3717(C3657 c3657, Object obj) {
        if (obj instanceof InterfaceC3453) {
            this.f11537 = (InterfaceC3453) obj;
        } else {
            this.f11539 = obj;
        }
        this.f11538 = c3657.m7858().m7877("key");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3657 c3657;
        C3717 c3717 = (C3717) obj;
        Object field = null;
        C3657 c36572 = this.f11538;
        InterfaceC3453 interfaceC3453 = this.f11537;
        Object field2 = (interfaceC3453 == null || c36572 == null) ? null : interfaceC3453.getField(c36572);
        InterfaceC3453 interfaceC34532 = c3717.f11537;
        if (interfaceC34532 != null && (c3657 = c3717.f11538) != null) {
            field = interfaceC34532.getField(c3657);
        }
        if (field2 == null && field == null) {
            return 0;
        }
        if (field2 == null) {
            return -1;
        }
        if (field == null) {
            return 1;
        }
        int i = AbstractC3339.f10964[c36572.m7863().ordinal()];
        if (i == 1) {
            return ((Boolean) field2).compareTo((Boolean) field);
        }
        if (i == 2) {
            return ((Long) field2).compareTo((Long) field);
        }
        if (i == 3) {
            return ((Integer) field2).compareTo((Integer) field);
        }
        if (i != 4) {
            return 0;
        }
        return ((String) field2).compareTo((String) field);
    }
}
