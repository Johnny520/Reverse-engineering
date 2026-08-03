package p054dg;

import gg.C1406b;
import java.io.File;
import java.util.Iterator;
import ng.C3017o;
import ng.InterfaceC3012j;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1235p;
import p218og.C3140d;
import p370yf.AbstractC6043h;

/* JADX INFO: renamed from: dg.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0795n implements InterfaceC3012j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2381a;

    /* JADX INFO: renamed from: b */
    public final Object f2382b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: fg.p */
    /* JADX WARN: Multi-variable type inference failed */
    public C0795n(InterfaceC1235p interfaceC1235p) {
        this.f2381a = 1;
        this.f2382b = (AbstractC6043h) interfaceC1235p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [fg.p, yf.h] */
    @Override // ng.InterfaceC3012j
    public final Iterator iterator() {
        switch (this.f2381a) {
            case 0:
                return new C0794m(this);
            case 1:
                return AbstractC1184v0.m3175B((AbstractC6043h) this.f2382b);
            case 2:
                return (Iterator) this.f2382b;
            case 3:
                return new C3017o((File) this.f2382b);
            case 4:
                return new C3140d((CharSequence) this.f2382b);
            case 5:
                return new C1406b((Object[]) this.f2382b);
            default:
                return ((Iterable) this.f2382b).iterator();
        }
    }

    public /* synthetic */ C0795n(Object obj, int i9) {
        this.f2381a = i9;
        this.f2382b = obj;
    }
}
