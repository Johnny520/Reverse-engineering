package p332wb;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: wb.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4767c0 {

    /* JADX INFO: renamed from: a */
    public final float f16176a;

    /* JADX INFO: renamed from: b */
    public final float f16177b;

    /* JADX INFO: renamed from: c */
    public final float f16178c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4767c0(float f3, float f10, float f11) {
        this.f16176a = f3;
        this.f16177b = f10;
        this.f16178c = f11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4767c0)) {
            return false;
        }
        C4767c0 c4767c0 = (C4767c0) obj;
        return Float.compare(this.f16176a, c4767c0.f16176a) == 0 && Float.compare(this.f16177b, c4767c0.f16177b) == 0 && Float.compare(this.f16178c, c4767c0.f16178c) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f16178c) + AbstractC0921a.m2241d(this.f16177b, Float.hashCode(this.f16176a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ColorPickerSelection(hue=" + this.f16176a + ", saturation=" + this.f16177b + ", value=" + this.f16178c + ")";
    }
}
