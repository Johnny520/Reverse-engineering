package androidx.compose.runtime;

import androidx.activity.compose.C0002;
import androidx.collection.AbstractC0285;
import androidx.collection.C0235;
import java.util.concurrent.CancellationException;
import kotlin.C5176;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5444;
import kotlinx.coroutines.InterfaceC5452;
import kotlinx.coroutines.channels.InterfaceC5200;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1385 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f4026;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f4027;

    public /* synthetic */ C1385(Object obj, int i) {
        this.f4027 = i;
        this.f4026 = obj;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        C5444 c5444;
        int i = this.f4027;
        C5444 c54442 = null;
        Object obj2 = this.f4026;
        switch (i) {
            case 0:
                ((C1363) obj2).m2454(obj);
                return C5176.f14739;
            case 1:
                C1383 c1383 = (C1383) obj2;
                Throwable th = (Throwable) obj;
                CancellationException cancellationExceptionM10491 = AbstractC5399.m10491("Recomposer effect job completed", th);
                synchronized (c1383.f3996) {
                    try {
                        InterfaceC5452 interfaceC5452 = c1383.f3995;
                        if (interfaceC5452 != null) {
                            c1383.f4004.m10313(Recomposer$State.ShuttingDown);
                            if (c1383.f4000) {
                                c5444 = c1383.f4008;
                                if (c5444 != null) {
                                }
                                c1383.f4008 = null;
                                interfaceC5452.mo10559(new C0002(c1383, 18, th));
                                c54442 = c5444;
                            } else {
                                interfaceC5452.mo10256(cancellationExceptionM10491);
                            }
                            c5444 = null;
                            c1383.f4008 = null;
                            interfaceC5452.mo10559(new C0002(c1383, 18, th));
                            c54442 = c5444;
                        } else {
                            c1383.f3994 = cancellationExceptionM10491;
                            c1383.f4004.m10313(Recomposer$State.ShutDown);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (c54442 != null) {
                    c54442.resumeWith(Result.m8745constructorimpl(C5176.f14739));
                }
                return C5176.f14739;
            default:
                C1330 c1330 = (C1330) obj2;
                InterfaceC5200 interfaceC5200 = c1330.f3890;
                interfaceC5200.getClass();
                if (!AbstractC4395.m8907(c1330.f3890, interfaceC5200)) {
                    AbstractC1392.m2537("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                C0235 c0235 = c1330.f3887;
                Object obj3 = c1330.f3893;
                if (c0235 != null) {
                    if (obj3 != null) {
                        AbstractC1392.m2537("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    c0235.m741(obj);
                } else if (obj3 == null) {
                    c1330.f3893 = obj;
                } else {
                    C0235 c02352 = AbstractC0285.f997;
                    C0235 c02353 = new C0235();
                    c02353.m741(obj3);
                    c02353.m741(obj);
                    c1330.f3887 = c02353;
                    c1330.f3893 = null;
                }
                return C5176.f14739;
        }
    }
}
