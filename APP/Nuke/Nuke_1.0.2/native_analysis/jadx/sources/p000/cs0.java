package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cs0 {

    /* JADX INFO: renamed from: a */
    public final int f1708a;

    public final boolean equals(Object obj) {
        if (obj instanceof cs0) {
            return this.f1708a == ((cs0) obj).f1708a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1708a);
    }

    public final String toString() {
        int i = this.f1708a;
        return i == 16 ? "Confirm" : i == 6 ? "ContextClick" : i == 13 ? "GestureEnd" : i == 23 ? "GestureThresholdActivate" : i == 3 ? "KeyboardTap" : i == 0 ? "LongPress" : i == 17 ? "Reject" : i == 27 ? "SegmentFrequentTick" : i == 26 ? "SegmentTick" : i == 9 ? "TextHandleMove" : i == 22 ? "ToggleOff" : i == 21 ? "ToggleOn" : i == 1 ? "VirtualKey" : "Invalid";
    }
}
