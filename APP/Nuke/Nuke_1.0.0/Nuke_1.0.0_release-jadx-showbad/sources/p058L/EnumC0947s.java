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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0947s enumC0947s = new EnumC0947s("EditableText", 0);
        f2979d = enumC0947s;
        f2980e = new EnumC0947s[]{enumC0947s, new EnumC0947s("StaticText", 1)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0947s valueOf(String str) {
        return (EnumC0947s) Enum.valueOf(EnumC0947s.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0947s[] values() {
        return (EnumC0947s[]) f2980e.clone();
    }
}
