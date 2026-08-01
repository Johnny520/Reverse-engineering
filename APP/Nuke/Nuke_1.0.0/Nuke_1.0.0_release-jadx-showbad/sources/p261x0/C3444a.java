package p261x0;

/* JADX INFO: renamed from: x0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3444a {

    /* JADX INFO: renamed from: a */
    public final int f10761a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [I0.y.onAttachedToWindow():void, I0.y.onTouchModeChanged(boolean):void, x0.c.<init>(int):void] */
    public /* synthetic */ C3444a(int i5) {
        this.f10761a = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C3444a) {
            return this.f10761a == ((C3444a) obj).f10761a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f10761a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i5 = this.f10761a;
        return i5 == 1 ? "Touch" : i5 == 2 ? "Keyboard" : "Error";
    }
}
