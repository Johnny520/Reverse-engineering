package p265s1;

import android.graphics.ColorSpace;
import p024b9.AbstractC1061t;
import p276t1.AbstractC8027c;
import p276t1.C8043k;

/* JADX INFO: renamed from: s1.z1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7169z1 {

    /* JADX INFO: renamed from: a */
    public static final C7169z1 f23726a = new C7169z1();

    /* JADX INFO: renamed from: a */
    public static final ColorSpace m28334a(AbstractC8027c abstractC8027c) {
        C8043k c8043k = C8043k.f26795a;
        if (AbstractC1061t.m3842c(abstractC8027c, c8043k.m30950k())) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (AbstractC1061t.m3842c(abstractC8027c, c8043k.m30951l())) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }
}
