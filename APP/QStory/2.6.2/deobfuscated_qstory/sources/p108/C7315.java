package p108;

/* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7315 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f19512;

    public final boolean equals(Object obj) {
        if (obj instanceof C7315) {
            return this.f19512 == ((C7315) obj).f19512;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19512);
    }

    public final String toString() {
        int i = this.f19512;
        return i == 16 ? "Confirm" : i == 6 ? "ContextClick" : i == 13 ? "GestureEnd" : i == 23 ? "GestureThresholdActivate" : i == 3 ? "KeyboardTap" : i == 0 ? "LongPress" : i == 17 ? "Reject" : i == 27 ? "SegmentFrequentTick" : i == 26 ? "SegmentTick" : i == 9 ? "TextHandleMove" : i == 22 ? "ToggleOff" : i == 21 ? "ToggleOn" : i == 1 ? "VirtualKey" : "Invalid";
    }
}
