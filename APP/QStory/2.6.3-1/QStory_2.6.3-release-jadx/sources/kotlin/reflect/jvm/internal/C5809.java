package kotlin.reflect.jvm.internal;

import androidx.window.area.AbstractC3400;
import io.ktor.client.plugins.AbstractC4765;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.p009km.C5366;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5809 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5808 f14710;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC5835 f14711;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14712 = 1;

    public C5809(AbstractC5835 abstractC5835, C5808 c5808) {
        this.f14711 = abstractC5835;
        this.f14710 = c5808;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f14712;
        AbstractC5835 abstractC5835 = this.f14711;
        C5808 c5808 = this.f14710;
        switch (i) {
            case 0:
                C5836 c5836 = abstractC5835 instanceof C5836 ? (C5836) abstractC5835 : null;
                C5902 c5902M10556 = c5836 != null ? ((C5877) c5836.f14770.getValue()).m10556() : null;
                C5902 c5902 = C5902.f14955;
                ArrayList arrayList = c5808.f14709.f13580;
                ClassLoader classLoader = abstractC5835.mo9438().getClassLoader();
                classLoader.getClass();
                return AbstractC3400.m5654(arrayList, c5902M10556, c5808, classLoader);
            default:
                C5366 c5366 = c5808.f14709.f13583;
                if (c5366 == null) {
                    AbstractC5227.m9467("returnType");
                    throw null;
                }
                ClassLoader classLoader2 = abstractC5835.mo9438().getClassLoader();
                classLoader2.getClass();
                return AbstractC4765.m8849(c5366, classLoader2, c5808.mo10524(), new C5844(c5808, 12));
        }
    }

    public C5809(C5808 c5808, AbstractC5835 abstractC5835) {
        this.f14710 = c5808;
        this.f14711 = abstractC5835;
    }
}
