package p243q9;

import gb.AbstractC2706r0;
import java.util.Map;
import p129ib.C3381l;
import p213oa.C5692c;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6003g1;
import p327wa.AbstractC9211e;

/* JADX INFO: renamed from: q9.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6328c {

    /* JADX INFO: renamed from: q9.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C5692c m24994a(InterfaceC6328c interfaceC6328c) {
            InterfaceC5995e interfaceC5995eM35857l = AbstractC9211e.m35857l(interfaceC6328c);
            if (interfaceC5995eM35857l != null) {
                if (C3381l.m12704m(interfaceC5995eM35857l)) {
                    interfaceC5995eM35857l = null;
                }
                if (interfaceC5995eM35857l != null) {
                    return AbstractC9211e.m35856k(interfaceC5995eM35857l);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    Map mo5548a();

    /* JADX INFO: renamed from: d */
    C5692c mo5549d();

    InterfaceC6003g1 getSource();

    AbstractC2706r0 getType();
}
