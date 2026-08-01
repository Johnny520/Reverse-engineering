package kotlin.reflect.jvm.internal.types;

import com.bumptech.glide.AbstractC3889;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5925;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5755 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5755 f14600 = new C5755(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C5755 f14601 = new C5755(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14602;

    public /* synthetic */ C5755(int i) {
        this.f14602 = i;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        Class<?> declaringClass;
        InterfaceC5925 interfaceC5925 = (InterfaceC5925) obj;
        switch (this.f14602) {
            case 0:
                interfaceC5925.getClass();
                if (!interfaceC5925.mo9441() || (declaringClass = AbstractC3889.m7316(interfaceC5925).getDeclaringClass()) == null) {
                    return null;
                }
                return AbstractC5228.f13320.mo9476(declaringClass);
            default:
                interfaceC5925.getClass();
                return interfaceC5925.getTypeParameters();
        }
    }
}
