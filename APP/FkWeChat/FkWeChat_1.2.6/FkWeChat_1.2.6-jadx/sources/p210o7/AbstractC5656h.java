package p210o7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p281t6.AbstractC8136b;
import p281t6.AbstractC8149h0;
import p281t6.InterfaceC8141d0;
import p281t6.InterfaceC8143e0;

/* JADX INFO: renamed from: o7.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5656h {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC8141d0 m22863a(InterfaceC5652d interfaceC5652d, InterfaceC8141d0 interfaceC8141d0) {
        List listM20800o;
        interfaceC5652d.getClass();
        interfaceC8141d0.getClass();
        InterfaceC8143e0 interfaceC8143e0M31618b = AbstractC8149h0.m31618b(0, 1, null);
        for (String str : interfaceC5652d.mo7351i().names()) {
            List listMo7359d = interfaceC8141d0.mo7359d(str);
            if (listMo7359d != null) {
                listM20800o = new ArrayList(AbstractC5116y.m20814z(listMo7359d, 10));
                Iterator it = listMo7359d.iterator();
                while (it.hasNext()) {
                    listM20800o.add(AbstractC8136b.m31592g((String) it.next(), 0, 0, true, null, 11, null));
                }
            } else {
                listM20800o = null;
            }
            if (listM20800o == null) {
                listM20800o = AbstractC5114x.m20800o();
            }
            interfaceC8143e0M31618b.mo31878c(AbstractC8136b.m31592g(str, 0, 0, false, null, 15, null), listM20800o);
        }
        return interfaceC8143e0M31618b.build();
    }
}
