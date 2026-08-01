package p095;

import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7841 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C7842 f19179;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f19180;

    public /* synthetic */ C7841(C7842 c7842, int i) {
        this.f19180 = i;
        this.f19179 = c7842;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f19180;
        C7842 c7842 = this.f19179;
        switch (i) {
            case 0:
                C5523 c5523 = (C5523) obj;
                if (c5523 != null) {
                    return c7842.m12912(c5523, c7842.m12911().mo9724(c5523, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
                }
                C7842.m12910(8);
                throw null;
            default:
                C5523 c55232 = (C5523) obj;
                if (c55232 != null) {
                    return c7842.m12912(c55232, c7842.m12911().mo9726(c55232, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
                }
                C7842.m12910(4);
                throw null;
        }
    }
}
