package kotlin.reflect.jvm.internal.types;

import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5092;
import p052.InterfaceC6557;
import p053.AbstractC6560;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4922 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4922 f14253 = new C4922(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C4922 f14254 = new C4922(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14255;

    public /* synthetic */ C4922(int i) {
        this.f14255 = i;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        Class<?> declaringClass;
        InterfaceC5092 interfaceC5092 = (InterfaceC5092) obj;
        switch (this.f14255) {
            case 0:
                interfaceC5092.getClass();
                if (!interfaceC5092.mo8892() || (declaringClass = AbstractC6560.m12029(interfaceC5092).getDeclaringClass()) == null) {
                    return null;
                }
                return AbstractC4395.f12971.mo8927(declaringClass);
            default:
                interfaceC5092.getClass();
                return interfaceC5092.getTypeParameters();
        }
    }
}
