package p000;

/* JADX INFO: renamed from: DC */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0142DC extends Enum {

    /* JADX INFO: renamed from: b */
    public static final EnumC0142DC f370b = null;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumC0142DC[] f371c = null;

    /* JADX INFO: renamed from: a */
    public final String f372a;

    static {
        EnumC0142DC r0 = new EnumC0142DC(AbstractC0295Gu.m625r(-807445261711413L), 0, AbstractC0295Gu.m625r(-807488211384373L));
        f370b = r0;
        f371c = new EnumC0142DC[]{r0, new EnumC0142DC(AbstractC0295Gu.m625r(-807501096286261L), 1, AbstractC0295Gu.m625r(-807526866090037L))};
    }

    EnumC0142DC(String r1, int r2, String r3) {
        this.f372a = r3;
    }

    public static EnumC0142DC valueOf(String r1) {
        return (EnumC0142DC) Enum.valueOf(EnumC0142DC.class, r1);
    }

    public static EnumC0142DC[] values() {
        return (EnumC0142DC[]) f371c.clone();
    }
}
