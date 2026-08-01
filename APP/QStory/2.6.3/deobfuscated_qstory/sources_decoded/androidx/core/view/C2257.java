package androidx.core.view;

import androidx.activity.compose.C0000;
import androidx.lifecycle.InterfaceC2380;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.compose.AbstractC2364;
import androidx.lifecycle.compose.C2363;
import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2257 implements InterfaceC2380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f6562;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f6563;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Serializable f6564;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6565;

    public /* synthetic */ C2257(int i, Serializable serializable, Object obj, Object obj2) {
        this.f6565 = i;
        this.f6563 = obj;
        this.f6564 = serializable;
        this.f6562 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, java.lang.Object] */
    @Override // androidx.lifecycle.InterfaceC2380
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
        int i = this.f6565;
        Object obj = this.f6562;
        Serializable serializable = this.f6564;
        Object obj2 = this.f6563;
        switch (i) {
            case 0:
                C2252 c2252 = (C2252) obj2;
                Lifecycle$State lifecycle$State = (Lifecycle$State) serializable;
                InterfaceC2253 interfaceC2253 = (InterfaceC2253) obj;
                c2252.getClass();
                Runnable runnable = c2252.f6560;
                CopyOnWriteArrayList copyOnWriteArrayList = c2252.f6559;
                if (lifecycle$Event == Lifecycle$Event.upTo(lifecycle$State)) {
                    copyOnWriteArrayList.add(interfaceC2253);
                    runnable.run();
                } else if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
                    c2252.m4210(interfaceC2253);
                } else if (lifecycle$Event == Lifecycle$Event.downFrom(lifecycle$State)) {
                    copyOnWriteArrayList.remove(interfaceC2253);
                    runnable.run();
                }
                break;
            default:
                C2363 c2363 = (C2363) obj2;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) serializable;
                InterfaceC6558 interfaceC6558 = (InterfaceC6558) obj;
                int i2 = AbstractC2364.f6995[lifecycle$Event.ordinal()];
                if (i2 == 1) {
                    ref$ObjectRef.element = interfaceC6558.invoke(c2363);
                    break;
                } else if (i2 == 2) {
                    C0000 c0000 = (C0000) ref$ObjectRef.element;
                    if (c0000 != null) {
                        c0000.m16();
                    }
                    ref$ObjectRef.element = null;
                    break;
                }
                break;
        }
    }
}
