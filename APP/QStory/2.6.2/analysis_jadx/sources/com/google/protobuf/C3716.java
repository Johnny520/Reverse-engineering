package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3716 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC3452 f11532;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C3656 f11533;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f11534;

    public C3716(C3656 c3656, Object obj) {
        if (obj instanceof InterfaceC3452) {
            this.f11532 = (InterfaceC3452) obj;
        } else {
            this.f11534 = obj;
        }
        this.f11533 = c3656.m7871().m7890("key");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3656 c3656;
        C3716 c3716 = (C3716) obj;
        Object field = null;
        C3656 c36562 = this.f11533;
        InterfaceC3452 interfaceC3452 = this.f11532;
        Object field2 = (interfaceC3452 == null || c36562 == null) ? null : interfaceC3452.getField(c36562);
        InterfaceC3452 interfaceC34522 = c3716.f11532;
        if (interfaceC34522 != null && (c3656 = c3716.f11533) != null) {
            field = interfaceC34522.getField(c3656);
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
        int i = AbstractC3338.f10959[c36562.m7876().ordinal()];
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
