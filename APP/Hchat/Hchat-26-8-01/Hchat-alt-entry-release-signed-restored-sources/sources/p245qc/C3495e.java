package p245qc;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: qc.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3495e implements Consumer {

    /* JADX INFO: renamed from: a */
    public final Function f11359a;

    /* JADX INFO: renamed from: b */
    public List f11360b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3495e(Function function) {
        this.f11359a = function;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f11360b.add(this.f11359a.apply(obj));
    }
}
