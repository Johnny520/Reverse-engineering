package p332wb;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: wb.e5 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4837e5 {

    /* JADX INFO: renamed from: a */
    public final float f16753a;

    /* JADX INFO: renamed from: b */
    public final float f16754b;

    /* JADX INFO: renamed from: c */
    public final float f16755c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4837e5(float f3, float f10, float f11) {
        this.f16753a = f3;
        this.f16754b = f10;
        this.f16755c = f11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4837e5)) {
            return false;
        }
        C4837e5 c4837e5 = (C4837e5) obj;
        return Float.compare(this.f16753a, c4837e5.f16753a) == 0 && Float.compare(this.f16754b, c4837e5.f16754b) == 0 && Float.compare(this.f16755c, c4837e5.f16755c) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f16755c) + AbstractC0921a.m2241d(this.f16754b, Float.hashCode(this.f16753a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ColorPickerSelection(hue=" + this.f16753a + ", saturation=" + this.f16754b + ", value=" + this.f16755c + ")";
    }
}
