package p264x3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x3.c */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3451c {

    /* JADX INFO: renamed from: d */
    public static final EnumC3451c f10767d;

    /* JADX INFO: renamed from: e */
    public static final EnumC3451c f10768e;

    /* JADX INFO: renamed from: f */
    public static final EnumC3451c f10769f;

    /* JADX INFO: renamed from: g */
    public static final EnumC3451c f10770g;

    /* JADX INFO: renamed from: h */
    public static final EnumC3451c f10771h;

    /* JADX INFO: renamed from: i */
    public static final EnumC3451c f10772i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC3451c[] f10773j;

    static {
        EnumC3451c enumC3451c = new EnumC3451c("GitHubDiscussion", 0);
        f10767d = enumC3451c;
        EnumC3451c enumC3451c2 = new EnumC3451c("QqGroup1", 1);
        f10768e = enumC3451c2;
        EnumC3451c enumC3451c3 = new EnumC3451c("QqGroup2", 2);
        f10769f = enumC3451c3;
        EnumC3451c enumC3451c4 = new EnumC3451c("QqGroup3", 3);
        f10770g = enumC3451c4;
        EnumC3451c enumC3451c5 = new EnumC3451c("TelegramChat", 4);
        f10771h = enumC3451c5;
        EnumC3451c enumC3451c6 = new EnumC3451c("TelegramChannel", 5);
        f10772i = enumC3451c6;
        f10773j = new EnumC3451c[]{enumC3451c, enumC3451c2, enumC3451c3, enumC3451c4, enumC3451c5, enumC3451c6};
    }

    public static EnumC3451c valueOf(String str) {
        return (EnumC3451c) Enum.valueOf(EnumC3451c.class, str);
    }

    public static EnumC3451c[] values() {
        return (EnumC3451c[]) f10773j.clone();
    }
}
