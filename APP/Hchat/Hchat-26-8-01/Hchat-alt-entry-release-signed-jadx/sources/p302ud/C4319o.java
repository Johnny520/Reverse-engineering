package p302ud;

import java.util.ArrayList;
import java.util.List;
import md.AbstractC2828e;

/* JADX INFO: renamed from: ud.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4319o extends AbstractC2828e implements InterfaceC4312h {

    /* JADX INFO: renamed from: i */
    public final List f14395i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4319o(C4320p c4320p) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c4320p);
        this.f14395i = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4312h
    /* JADX INFO: renamed from: g */
    public final List mo8643g() {
        return this.f14395i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4314j
    /* JADX INFO: renamed from: k */
    public final String mo8644k() {
        return "IC";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "InsnContainer";
    }

    public C4319o(List list) {
        this.f14395i = list;
    }
}
