package p273z0;

import android.view.KeyEvent;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: z0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3509b {

    /* JADX INFO: renamed from: a */
    public final KeyEvent f10951a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C3509b) {
            return AbstractC1665j.m2981a(this.f10951a, ((C3509b) obj).f10951a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10951a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f10951a + ')';
    }
}
