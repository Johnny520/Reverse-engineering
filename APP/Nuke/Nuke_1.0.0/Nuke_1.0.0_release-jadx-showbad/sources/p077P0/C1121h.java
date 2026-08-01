package p077P0;

/* JADX INFO: renamed from: P0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1121h {

    /* JADX INFO: renamed from: a */
    public final int f3648a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1121h) {
            return this.f3648a == ((C1121h) obj).f3648a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f3648a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i5 = this.f3648a;
        return i5 == 0 ? "Button" : i5 == 1 ? "Checkbox" : i5 == 2 ? "Switch" : i5 == 3 ? "RadioButton" : i5 == 4 ? "Tab" : i5 == 5 ? "Image" : i5 == 6 ? "DropdownList" : i5 == 7 ? "Picker" : i5 == 8 ? "Carousel" : "Unknown";
    }
}
