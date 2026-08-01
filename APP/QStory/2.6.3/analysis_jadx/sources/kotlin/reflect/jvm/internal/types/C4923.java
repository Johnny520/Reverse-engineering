package kotlin.reflect.jvm.internal.types;

import com.bumptech.glide.AbstractC3057;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5093;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4923 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4923 f14255 = new C4923(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C4923 f14256 = new C4923(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14257;

    public /* synthetic */ C4923(int i) {
        this.f14257 = i;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        Class<?> declaringClass;
        InterfaceC5093 interfaceC5093 = (InterfaceC5093) obj;
        switch (this.f14257) {
            case 0:
                interfaceC5093.getClass();
                if (!interfaceC5093.mo8882() || (declaringClass = AbstractC3057.m6756(interfaceC5093).getDeclaringClass()) == null) {
                    return null;
                }
                return AbstractC4396.f12975.mo8917(declaringClass);
            default:
                interfaceC5093.getClass();
                return interfaceC5093.getTypeParameters();
        }
    }
}
