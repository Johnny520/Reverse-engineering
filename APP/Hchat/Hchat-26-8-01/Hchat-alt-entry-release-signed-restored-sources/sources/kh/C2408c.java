package kh;

import gg.AbstractC1417m;
import java.util.LinkedHashMap;
import p085fg.InterfaceC1220a;

/* JADX INFO: renamed from: kh.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2408c extends AbstractC1417m implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public static final C2408c f7883g = new C2408c(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] strArr = AbstractC2409d.f7884a;
        int i9 = 0;
        int i10 = 0;
        while (i9 < 256) {
            linkedHashMap.put(strArr[i9], Integer.valueOf(i10));
            i9++;
            i10++;
        }
        return linkedHashMap;
    }
}
