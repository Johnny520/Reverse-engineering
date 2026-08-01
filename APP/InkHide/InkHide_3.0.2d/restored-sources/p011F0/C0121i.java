package p011F0;

import java.util.Iterator;
import p021K0.C0169h;
import p027N0.AbstractC0231o;
import p029O0.InterfaceC0233a;
import p040U0.C0292b;

/* JADX INFO: renamed from: F0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0121i implements Iterable, InterfaceC0233a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f421a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f422b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0121i(int i2, Object obj) {
        this.f421a = i2;
        this.f422b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f421a) {
            case 0:
                return AbstractC0231o.m428d((Object[]) this.f422b);
            default:
                return new C0292b((C0169h) this.f422b);
        }
    }
}
