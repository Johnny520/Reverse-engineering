package ba;

import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: ba.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0221a {
    GENERAL("普通消息"),
    RED_PACKET("红包消息"),
    TRANSFER("转账消息"),
    SYSTEM("系统消息");


    /* JADX INFO: renamed from: g */
    public final String f550g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    EnumC0221a(String str) {
        this.f550g = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0221a valueOf(String str) {
        return (EnumC0221a) AbstractC2091b.m5160g(EnumC0221a.class, str);
    }
}
