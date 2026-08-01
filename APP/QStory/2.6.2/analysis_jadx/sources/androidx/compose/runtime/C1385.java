package androidx.compose.runtime;

import androidx.activity.compose.C0002;
import androidx.collection.AbstractC0285;
import androidx.collection.C0235;
import java.util.concurrent.CancellationException;
import kotlin.C5175;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC4394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5443;
import kotlinx.coroutines.InterfaceC5451;
import kotlinx.coroutines.channels.InterfaceC5199;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1385 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f4025;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f4026;

    public /* synthetic */ C1385(Object obj, int i) {
        this.f4026 = i;
        this.f4025 = obj;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        C5443 c5443;
        int i = this.f4026;
        C5443 c54432 = null;
        Object obj2 = this.f4025;
        switch (i) {
            case 0:
                ((C1363) obj2).m2444(obj);
                return C5175.f14739;
            case 1:
                C1383 c1383 = (C1383) obj2;
                Throwable th = (Throwable) obj;
                CancellationException cancellationExceptionM10487 = AbstractC5398.m10487("Recomposer effect job completed", th);
                synchronized (c1383.f3995) {
                    try {
                        InterfaceC5451 interfaceC5451 = c1383.f3994;
                        if (interfaceC5451 != null) {
                            c1383.f4003.m10309(Recomposer$State.ShuttingDown);
                            if (c1383.f3999) {
                                c5443 = c1383.f4007;
                                if (c5443 != null) {
                                }
                                c1383.f4007 = null;
                                interfaceC5451.mo10554(new C0002(c1383, 18, th));
                                c54432 = c5443;
                            } else {
                                interfaceC5451.mo10252(cancellationExceptionM10487);
                            }
                            c5443 = null;
                            c1383.f4007 = null;
                            interfaceC5451.mo10554(new C0002(c1383, 18, th));
                            c54432 = c5443;
                        } else {
                            c1383.f3993 = cancellationExceptionM10487;
                            c1383.f4003.m10309(Recomposer$State.ShutDown);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (c54432 != null) {
                    c54432.resumeWith(Result.m8755constructorimpl(C5175.f14739));
                }
                return C5175.f14739;
            default:
                C1330 c1330 = (C1330) obj2;
                InterfaceC5199 interfaceC5199 = c1330.f3889;
                interfaceC5199.getClass();
                if (!AbstractC4394.m8917(c1330.f3889, interfaceC5199)) {
                    AbstractC1392.m2527("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                C0235 c0235 = c1330.f3886;
                Object obj3 = c1330.f3892;
                if (c0235 != null) {
                    if (obj3 != null) {
                        AbstractC1392.m2527("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    c0235.m740(obj);
                } else if (obj3 == null) {
                    c1330.f3892 = obj;
                } else {
                    C0235 c02352 = AbstractC0285.f997;
                    C0235 c02353 = new C0235();
                    c02353.m740(obj3);
                    c02353.m740(obj);
                    c1330.f3886 = c02353;
                    c1330.f3892 = null;
                }
                return C5175.f14739;
        }
    }
}
