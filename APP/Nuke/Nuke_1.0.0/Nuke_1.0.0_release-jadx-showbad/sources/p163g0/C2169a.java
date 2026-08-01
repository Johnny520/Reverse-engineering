package p163g0;

import java.util.List;

/* JADX INFO: renamed from: g0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2169a {

    /* JADX INFO: renamed from: a */
    public final List f7128a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2169a(List list) {
        this.f7128a = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m4006a() {
        List list = this.f7128a;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((C2170b) list.get(i5)).getClass();
        }
        return false;
    }
}
