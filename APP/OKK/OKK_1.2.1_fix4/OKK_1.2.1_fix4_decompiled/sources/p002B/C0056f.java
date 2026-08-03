package p002B;

/* JADX INFO: renamed from: B.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0056f {

    /* JADX INFO: renamed from: a */
    public static final C0056f f196a = new C0056f();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m194a(int i2, CharSequence charSequence) {
        int i3 = 2;
        for (int i4 = 0; i4 < i2 && i3 == 2; i4++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i4));
            C0057g c0057g = AbstractC0058h.f199a;
            if (directionality == 0) {
                i3 = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                        i3 = 0;
                        break;
                    default:
                        i3 = 2;
                        continue;
                }
            } else {
                i3 = 0;
            }
        }
        return i3;
    }
}
