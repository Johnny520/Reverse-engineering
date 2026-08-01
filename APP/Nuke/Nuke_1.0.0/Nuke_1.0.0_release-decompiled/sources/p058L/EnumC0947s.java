package p058L;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: L.s */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0947s {

    /* JADX INFO: renamed from: d */
    public static final EnumC0947s f2979d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ EnumC0947s[] f2980e;

    static {
        EnumC0947s enumC0947s = new EnumC0947s("EditableText", 0);
        f2979d = enumC0947s;
        f2980e = new EnumC0947s[]{enumC0947s, new EnumC0947s("StaticText", 1)};
    }

    public static EnumC0947s valueOf(String str) {
        return (EnumC0947s) Enum.valueOf(EnumC0947s.class, str);
    }

    public static EnumC0947s[] values() {
        return (EnumC0947s[]) f2980e.clone();
    }
}
