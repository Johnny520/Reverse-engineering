package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4549 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4285 f11882;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4489 f11883;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f11884;

    public C4549(C4489 c4489, Object obj) {
        if (obj instanceof InterfaceC4285) {
            this.f11882 = (InterfaceC4285) obj;
        } else {
            this.f11884 = obj;
        }
        this.f11883 = c4489.m8417().m8436("key");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C4489 c4489;
        C4549 c4549 = (C4549) obj;
        Object field = null;
        C4489 c44892 = this.f11883;
        InterfaceC4285 interfaceC4285 = this.f11882;
        Object field2 = (interfaceC4285 == null || c44892 == null) ? null : interfaceC4285.getField(c44892);
        InterfaceC4285 interfaceC42852 = c4549.f11882;
        if (interfaceC42852 != null && (c4489 = c4549.f11883) != null) {
            field = interfaceC42852.getField(c4489);
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
        int i = AbstractC4171.f11309[c44892.m8422().ordinal()];
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
