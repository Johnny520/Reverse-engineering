package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class u00 {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f6089e = 0;

    /* JADX INFO: renamed from: a */
    public final boolean f6090a;

    /* JADX INFO: renamed from: b */
    public final int f6091b;

    /* JADX INFO: renamed from: c */
    public final int f6092c;

    /* JADX INFO: renamed from: d */
    public final fb0 f6093d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new u00();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u00() {
        fb0 fb0Var = fb0.f1650f;
        this.f6090a = true;
        this.f6091b = 1;
        this.f6092c = 1;
        this.f6093d = fb0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u00)) {
            return false;
        }
        u00 u00Var = (u00) obj;
        return this.f6090a == u00Var.f6090a && this.f6091b == u00Var.f6091b && this.f6092c == u00Var.f6092c && p30.m3002l(this.f6093d, u00Var.f6093d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f6093d.f1651d.hashCode() + AbstractC0748t1.m4144b(this.f6092c, AbstractC0748t1.m4144b(this.f6091b, AbstractC0748t1.m4145c(AbstractC0748t1.m4144b(0, Boolean.hashCode(false) * 31, 31), 31, this.f6090a), 31), 961);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=false, capitalization=");
        String str = "None";
        sb.append((Object) "None");
        sb.append(", autoCorrect=");
        sb.append(this.f6090a);
        sb.append(", keyboardType=");
        int i = this.f6091b;
        sb.append((Object) (i == 0 ? "Unspecified" : i == 1 ? "Text" : i == 2 ? "Ascii" : i == 3 ? "Number" : i == 4 ? "Phone" : i == 5 ? "Uri" : i == 6 ? "Email" : i == 7 ? "Password" : i == 8 ? "NumberPassword" : i == 9 ? "Decimal" : "Invalid"));
        sb.append(", imeAction=");
        int i2 = this.f6092c;
        if (i2 == -1) {
            str = "Unspecified";
        } else if (i2 != 0) {
            str = i2 == 1 ? "Default" : i2 == 2 ? "Go" : i2 == 3 ? "Search" : i2 == 4 ? "Send" : i2 == 5 ? "Previous" : i2 == 6 ? "Next" : i2 == 7 ? "Done" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f6093d);
        sb.append(')');
        return sb.toString();
    }
}
