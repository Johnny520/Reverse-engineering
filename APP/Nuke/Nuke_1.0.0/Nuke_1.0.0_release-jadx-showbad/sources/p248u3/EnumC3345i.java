package p248u3;

import p089R2.C1227b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: u3.i */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3345i {

    /* JADX INFO: renamed from: f */
    public static final EnumC3345i f10398f;

    /* JADX INFO: renamed from: g */
    public static final EnumC3345i f10399g;

    /* JADX INFO: renamed from: h */
    public static final EnumC3345i f10400h;

    /* JADX INFO: renamed from: i */
    public static final EnumC3345i f10401i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC3345i[] f10402j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ C1227b f10403k;

    /* JADX INFO: renamed from: d */
    public final char f10404d;

    /* JADX INFO: renamed from: e */
    public final char f10405e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3345i enumC3345i = new EnumC3345i("OBJ", 0, '{', '}');
        f10398f = enumC3345i;
        EnumC3345i enumC3345i2 = new EnumC3345i("LIST", 1, '[', ']');
        f10399g = enumC3345i2;
        EnumC3345i enumC3345i3 = new EnumC3345i("MAP", 2, '{', '}');
        f10400h = enumC3345i3;
        EnumC3345i enumC3345i4 = new EnumC3345i("POLY_OBJ", 3, '[', ']');
        f10401i = enumC3345i4;
        EnumC3345i[] enumC3345iArr = {enumC3345i, enumC3345i2, enumC3345i3, enumC3345i4};
        f10402j = enumC3345iArr;
        f10403k = new C1227b(enumC3345iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EnumC3345i(String str, int i5, char c5, char c6) {
        this.f10404d = c5;
        this.f10405e = c6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3345i valueOf(String str) {
        return (EnumC3345i) Enum.valueOf(EnumC3345i.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3345i[] values() {
        return (EnumC3345i[]) f10402j.clone();
    }
}
