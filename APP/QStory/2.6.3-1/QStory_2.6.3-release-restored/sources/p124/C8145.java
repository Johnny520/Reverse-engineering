package p124;

/* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8145 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f19852;

    public final boolean equals(Object obj) {
        if (obj instanceof C8145) {
            return this.f19852 == ((C8145) obj).f19852;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19852);
    }

    public final String toString() {
        int i = this.f19852;
        return i == 16 ? "Confirm" : i == 6 ? "ContextClick" : i == 13 ? "GestureEnd" : i == 23 ? "GestureThresholdActivate" : i == 3 ? "KeyboardTap" : i == 0 ? "LongPress" : i == 17 ? "Reject" : i == 27 ? "SegmentFrequentTick" : i == 26 ? "SegmentTick" : i == 9 ? "TextHandleMove" : i == 22 ? "ToggleOff" : i == 21 ? "ToggleOn" : i == 1 ? "VirtualKey" : "Invalid";
    }
}
