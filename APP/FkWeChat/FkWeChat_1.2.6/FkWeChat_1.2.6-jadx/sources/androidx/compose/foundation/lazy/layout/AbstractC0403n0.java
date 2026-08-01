package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.List;
import p117i.AbstractC3077p;
import p117i.C3058h0;
import p135j2.InterfaceC3552n0;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0403n0 {

    /* JADX INFO: renamed from: a */
    public final C3058h0 f1158a = AbstractC3077p.m11480c();

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC0391k0 mo1291a(int i10, int i11, int i12, long j10);

    /* JADX INFO: renamed from: b */
    public final List m1292b(InterfaceC0383i0 interfaceC0383i0, int i10, long j10) {
        List list = (List) this.f1158a.m11449b(i10);
        if (list != null) {
            return list;
        }
        List listMo1214u1 = interfaceC0383i0.mo1214u1(i10);
        int size = listMo1214u1.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(((InterfaceC3552n0) listMo1214u1.get(i11)).mo13148X(j10));
        }
        this.f1158a.m11326r(i10, arrayList);
        return arrayList;
    }
}
