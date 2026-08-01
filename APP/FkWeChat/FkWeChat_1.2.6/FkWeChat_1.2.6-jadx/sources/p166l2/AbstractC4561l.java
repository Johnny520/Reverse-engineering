package p166l2;

import android.view.View;
import p120i2.AbstractC3167a;

/* JADX INFO: renamed from: l2.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4561l {
    /* JADX INFO: renamed from: a */
    public static final View m18025a(InterfaceC4553j interfaceC4553j) {
        if (!interfaceC4553j.mo17471z().m17461m2()) {
            AbstractC3167a.m11956b("Cannot get View because the Modifier node is not currently attached.");
        }
        Object objM18068b = AbstractC4570n0.m18068b(AbstractC4557k.m18015q(interfaceC4553j));
        objM18068b.getClass();
        return (View) objM18068b;
    }
}
