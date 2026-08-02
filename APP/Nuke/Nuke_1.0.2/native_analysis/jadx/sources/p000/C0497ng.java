package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ng */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0497ng implements uo2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7146a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7147b;

    public /* synthetic */ C0497ng(int i, Object obj) {
        this.f7146a = i;
        this.f7147b = obj;
    }

    @Override // p000.uo2
    public final Iterator iterator() {
        int i = this.f7146a;
        Object obj = this.f7147b;
        switch (i) {
            case 0:
                return new C0717t2((Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return (Iterator) obj;
            default:
                return new cb1((CharSequence) obj);
        }
    }
}
