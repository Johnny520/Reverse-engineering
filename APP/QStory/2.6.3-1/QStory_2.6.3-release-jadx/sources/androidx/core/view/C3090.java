package androidx.core.view;

import androidx.activity.compose.C0847;
import androidx.lifecycle.InterfaceC3213;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.compose.AbstractC3197;
import androidx.lifecycle.compose.C3196;
import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Ref$ObjectRef;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3090 implements InterfaceC3213 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f6907;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f6908;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Serializable f6909;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6910;

    public /* synthetic */ C3090(int i, Serializable serializable, Object obj, Object obj2) {
        this.f6910 = i;
        this.f6908 = obj;
        this.f6909 = serializable;
        this.f6907 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, java.lang.Object] */
    @Override // androidx.lifecycle.InterfaceC3213
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo578(InterfaceC3221 interfaceC3221, Lifecycle$Event lifecycle$Event) {
        int i = this.f6910;
        Object obj = this.f6907;
        Serializable serializable = this.f6909;
        Object obj2 = this.f6908;
        switch (i) {
            case 0:
                C3085 c3085 = (C3085) obj2;
                Lifecycle$State lifecycle$State = (Lifecycle$State) serializable;
                InterfaceC3086 interfaceC3086 = (InterfaceC3086) obj;
                c3085.getClass();
                Runnable runnable = c3085.f6905;
                CopyOnWriteArrayList copyOnWriteArrayList = c3085.f6904;
                if (lifecycle$Event == Lifecycle$Event.upTo(lifecycle$State)) {
                    copyOnWriteArrayList.add(interfaceC3086);
                    runnable.run();
                } else if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
                    c3085.m4770(interfaceC3086);
                } else if (lifecycle$Event == Lifecycle$Event.downFrom(lifecycle$State)) {
                    copyOnWriteArrayList.remove(interfaceC3086);
                    runnable.run();
                }
                break;
            default:
                C3196 c3196 = (C3196) obj2;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) serializable;
                InterfaceC7387 interfaceC7387 = (InterfaceC7387) obj;
                int i2 = AbstractC3197.f7340[lifecycle$Event.ordinal()];
                if (i2 == 1) {
                    ref$ObjectRef.element = interfaceC7387.invoke(c3196);
                    break;
                } else if (i2 == 2) {
                    C0847 c0847 = (C0847) ref$ObjectRef.element;
                    if (c0847 != null) {
                        c0847.m576();
                    }
                    ref$ObjectRef.element = null;
                    break;
                }
                break;
        }
    }
}
