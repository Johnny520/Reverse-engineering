package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.node.InterfaceC1764;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import java.util.List;
import kotlin.C5176;
import kotlin.jvm.internal.Ref$ObjectRef;
import p034.AbstractC6347;
import p052.InterfaceC6558;
import p116.InterfaceC7345;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0723 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2032;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2033;

    public /* synthetic */ C0723(Object obj, int i) {
        this.f2033 = i;
        this.f2032 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        T tM11916;
        int i = this.f2033;
        int i2 = 0;
        Object obj2 = this.f2032;
        switch (i) {
            case 0:
                ((AbstractC1708) obj).m3135((AbstractC1724) obj2, 0, 0, 0.0f);
                return C5176.f14739;
            case 1:
                return new C0713((C0710) obj2, i2);
            case 2:
                return new C0713((C0701) obj2, 2);
            case 3:
                InterfaceC7345 interfaceC7345 = (InterfaceC7345) obj2;
                return Boolean.valueOf(interfaceC7345 != null ? interfaceC7345.mo1485(obj) : true);
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                InterfaceC1764 interfaceC1764 = (InterfaceC1764) obj;
                interfaceC1764.getClass();
                C0696 c0696 = ((C0726) interfaceC1764).f2039;
                List list = (List) ref$ObjectRef.element;
                if (list != null) {
                    list.add(c0696);
                    tM11916 = list;
                } else {
                    tM11916 = AbstractC6347.m11916(c0696);
                }
                ref$ObjectRef.element = tM11916;
                return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
        }
    }
}
