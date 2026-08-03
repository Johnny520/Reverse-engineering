package p072f2;

/* JADX INFO: renamed from: f2.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1046i {

    /* JADX INFO: renamed from: a */
    public final int f3287a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1046i) {
            return this.f3287a == ((C1046i) obj).f3287a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f3287a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i9 = this.f3287a;
        return i9 == 0 ? "Button" : i9 == 1 ? "Checkbox" : i9 == 2 ? "Switch" : i9 == 3 ? "RadioButton" : i9 == 4 ? "Tab" : i9 == 5 ? "Image" : i9 == 6 ? "DropdownList" : i9 == 7 ? "Picker" : i9 == 8 ? "Carousel" : "Unknown";
    }
}
