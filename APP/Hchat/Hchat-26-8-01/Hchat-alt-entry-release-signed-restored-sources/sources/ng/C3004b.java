package ng;

import java.util.HashSet;
import java.util.Iterator;
import p085fg.InterfaceC1231l;
import tf.AbstractC4151b;

/* JADX INFO: renamed from: ng.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3004b extends AbstractC4151b {

    /* JADX INFO: renamed from: i */
    public final Iterator f9787i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC1231l f9788j;

    /* JADX INFO: renamed from: k */
    public final HashSet f9789k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3004b(Iterator it, InterfaceC1231l interfaceC1231l) {
        it.getClass();
        interfaceC1231l.getClass();
        this.f9787i = it;
        this.f9788j = interfaceC1231l;
        this.f9789k = new HashSet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4151b
    /* JADX INFO: renamed from: a */
    public final void mo2018a() {
        Object next;
        do {
            Iterator it = this.f9787i;
            if (!it.hasNext()) {
                this.f13681g = 2;
                return;
            } else {
                next = it.next();
            }
        } while (!this.f9789k.add(this.f9788j.invoke(next)));
        this.f13682h = next;
        this.f13681g = 1;
    }
}
