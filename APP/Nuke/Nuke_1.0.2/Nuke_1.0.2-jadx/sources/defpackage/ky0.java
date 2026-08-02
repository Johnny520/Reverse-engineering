package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ky0 implements Iterable, q41 {
    public final /* synthetic */ int h;
    public final Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ky0(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                return new vc0(tl.J((Object[]) ((ta) obj).i));
            case 1:
                return new b70((c70) obj);
            default:
                return new t2((wf0) obj);
        }
    }
}
