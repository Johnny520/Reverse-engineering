package p000;

import java.util.List;

/* JADX INFO: renamed from: ci */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0093ci {

    /* JADX INFO: renamed from: a */
    public final List f816a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0093ci(List list) {
        this.f816a = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m538a() {
        List list = this.f816a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C0130di) list.get(i)).getClass();
        }
        return false;
    }
}
