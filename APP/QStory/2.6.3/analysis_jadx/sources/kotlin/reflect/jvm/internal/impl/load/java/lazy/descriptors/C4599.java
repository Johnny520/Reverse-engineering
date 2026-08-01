package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.lang.reflect.Modifier;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4471;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4444;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import p052.InterfaceC6558;
import p079.AbstractC6989;
import p101.InterfaceC7254;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4599 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13418;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4599 f13416 = new C4599(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C4599 f13417 = new C4599(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C4599 f13414 = new C4599(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C4599 f13413 = new C4599(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C4599 f13415 = new C4599(4);

    public /* synthetic */ C4599(int i) {
        this.f13418 = i;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        switch (this.f13418) {
            case 0:
                int i = C4590.f13382;
                ((AbstractC4444) obj).getClass();
                return Boolean.valueOf(!Modifier.isStatic(r1.mo8979().getModifiers()));
            case 1:
                InterfaceC4471 interfaceC4471 = (InterfaceC4471) obj;
                InterfaceC5088[] interfaceC5088Arr = AbstractC4575.f13331;
                interfaceC4471.getClass();
                return interfaceC4471;
            case 2:
                AbstractC4444 abstractC4444 = (AbstractC4444) obj;
                int i2 = C4572.f13324;
                abstractC4444.getClass();
                return Boolean.valueOf(Modifier.isStatic(abstractC4444.mo8979().getModifiers()));
            case 3:
                InterfaceC7254 interfaceC7254 = (InterfaceC7254) obj;
                int i3 = C4572.f13324;
                interfaceC7254.getClass();
                return interfaceC7254.mo9172();
            default:
                int i4 = C4572.f13324;
                InterfaceC4477 interfaceC4477Mo9211 = ((AbstractC4882) obj).mo9722().mo9211();
                if (interfaceC4477Mo9211 instanceof AbstractC6989) {
                    return (AbstractC6989) interfaceC4477Mo9211;
                }
                return null;
        }
    }
}
