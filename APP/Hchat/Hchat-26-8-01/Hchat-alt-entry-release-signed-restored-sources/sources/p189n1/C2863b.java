package p189n1;

/* JADX INFO: renamed from: n1.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2863b {

    /* JADX INFO: renamed from: a */
    public final int f9257a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C2863b) {
            return this.f9257a == ((C2863b) obj).f9257a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f9257a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i9 = this.f9257a;
        return i9 == 16 ? "Confirm" : i9 == 6 ? "ContextClick" : i9 == 13 ? "GestureEnd" : i9 == 23 ? "GestureThresholdActivate" : i9 == 3 ? "KeyboardTap" : i9 == 0 ? "LongPress" : i9 == 17 ? "Reject" : i9 == 27 ? "SegmentFrequentTick" : i9 == 26 ? "SegmentTick" : i9 == 9 ? "TextHandleMove" : i9 == 22 ? "ToggleOff" : i9 == 21 ? "ToggleOn" : i9 == 1 ? "VirtualKey" : "Invalid";
    }
}
