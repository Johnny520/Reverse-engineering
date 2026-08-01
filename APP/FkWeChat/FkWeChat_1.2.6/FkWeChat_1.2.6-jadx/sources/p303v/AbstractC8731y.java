package p303v;

import java.util.List;

/* JADX INFO: renamed from: v.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8731y {
    /* JADX INFO: renamed from: a */
    public static final int m33514a(InterfaceC8729x interfaceC8729x) {
        List listMo33395k = interfaceC8729x.mo33395k();
        int size = listMo33395k.size();
        int iMo33408a = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iMo33408a += ((InterfaceC8709n) listMo33395k.get(i10)).mo33408a();
        }
        return (iMo33408a / listMo33395k.size()) + interfaceC8729x.mo33394j();
    }
}
