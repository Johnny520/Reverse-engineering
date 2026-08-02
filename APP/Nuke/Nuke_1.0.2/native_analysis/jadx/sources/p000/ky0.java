package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ky0 implements Iterable, q41 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5847h;

    /* JADX INFO: renamed from: i */
    public final Object f5848i;

    public /* synthetic */ ky0(int i, Object obj) {
        this.f5847h = i;
        this.f5848i = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f5847h;
        Object obj = this.f5848i;
        switch (i) {
            case 0:
                return new vc0(AbstractC0738tl.m5282J((Object[]) ((C0727ta) obj).f10652i));
            case 1:
                return new b70((c70) obj);
            default:
                return new C0717t2((wf0) obj);
        }
    }
}
