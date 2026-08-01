package bd;

import java.util.List;
import p024b9.AbstractC1043k;
import p098g9.InterfaceC2549c;
import p185m8.AbstractC5114x;
import p215oc.C5725t;
import p300uc.InterfaceC8645a;
import p300uc.InterfaceC8647b;
import p300uc.InterfaceC8662p;

/* JADX INFO: renamed from: bd.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1109b {
    public /* synthetic */ AbstractC1109b(AbstractC1043k abstractC1043k) {
        this();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC8647b m4012c(AbstractC1109b abstractC1109b, InterfaceC2549c interfaceC2549c, List list, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: getContextual");
            return null;
        }
        if ((i10 & 2) != 0) {
            list = AbstractC5114x.m20800o();
        }
        return abstractC1109b.mo4008b(interfaceC2549c, list);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo4007a(InterfaceC1111d interfaceC1111d);

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC8647b mo4008b(InterfaceC2549c interfaceC2549c, List list);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo4009d();

    /* JADX INFO: renamed from: e */
    public abstract InterfaceC8645a mo4010e(InterfaceC2549c interfaceC2549c, String str);

    /* JADX INFO: renamed from: f */
    public abstract InterfaceC8662p mo4011f(InterfaceC2549c interfaceC2549c, Object obj);

    public AbstractC1109b() {
    }
}
