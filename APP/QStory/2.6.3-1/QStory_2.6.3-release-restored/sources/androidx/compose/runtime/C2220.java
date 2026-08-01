package androidx.compose.runtime;

import androidx.activity.compose.C0849;
import androidx.collection.AbstractC1132;
import androidx.collection.C1082;
import java.util.concurrent.CancellationException;
import kotlin.C6008;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6276;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.channels.InterfaceC6032;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2220 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f4371;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f4372;

    public /* synthetic */ C2220(Object obj, int i) {
        this.f4372 = i;
        this.f4371 = obj;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        C6276 c6276;
        int i = this.f4372;
        C6276 c62762 = null;
        Object obj2 = this.f4371;
        switch (i) {
            case 0:
                ((C2198) obj2).m3014(obj);
                return C6008.f15084;
            case 1:
                C2218 c2218 = (C2218) obj2;
                Throwable th = (Throwable) obj;
                CancellationException cancellationExceptionM11050 = AbstractC6231.m11050("Recomposer effect job completed", th);
                synchronized (c2218.f4341) {
                    try {
                        InterfaceC6284 interfaceC6284 = c2218.f4340;
                        if (interfaceC6284 != null) {
                            c2218.f4349.m10872(Recomposer$State.ShuttingDown);
                            if (c2218.f4345) {
                                c6276 = c2218.f4353;
                                if (c6276 != null) {
                                }
                                c2218.f4353 = null;
                                interfaceC6284.mo11118(new C0849(c2218, 18, th));
                                c62762 = c6276;
                            } else {
                                interfaceC6284.mo10815(cancellationExceptionM11050);
                            }
                            c6276 = null;
                            c2218.f4353 = null;
                            interfaceC6284.mo11118(new C0849(c2218, 18, th));
                            c62762 = c6276;
                        } else {
                            c2218.f4339 = cancellationExceptionM11050;
                            c2218.f4349.m10872(Recomposer$State.ShutDown);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (c62762 != null) {
                    c62762.resumeWith(Result.m9304constructorimpl(C6008.f15084));
                }
                return C6008.f15084;
            default:
                C2165 c2165 = (C2165) obj2;
                InterfaceC6032 interfaceC6032 = c2165.f4235;
                interfaceC6032.getClass();
                if (!AbstractC5227.m9466(c2165.f4235, interfaceC6032)) {
                    AbstractC2227.m3097("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                C1082 c1082 = c2165.f4232;
                Object obj3 = c2165.f4238;
                if (c1082 != null) {
                    if (obj3 != null) {
                        AbstractC2227.m3097("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    c1082.m1301(obj);
                } else if (obj3 == null) {
                    c2165.f4238 = obj;
                } else {
                    C1082 c10822 = AbstractC1132.f1342;
                    C1082 c10823 = new C1082();
                    c10823.m1301(obj3);
                    c10823.m1301(obj);
                    c2165.f4232 = c10823;
                    c2165.f4238 = null;
                }
                return C6008.f15084;
        }
    }
}
