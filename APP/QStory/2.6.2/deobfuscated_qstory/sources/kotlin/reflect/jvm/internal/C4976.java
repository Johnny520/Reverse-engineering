package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3065;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.km.C4533;
import p033.AbstractC6325;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4976 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4975 f14363;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC5002 f14364;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14365 = 1;

    public C4976(AbstractC5002 abstractC5002, C4975 c4975) {
        this.f14364 = abstractC5002;
        this.f14363 = c4975;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f14365;
        AbstractC5002 abstractC5002 = this.f14364;
        C4975 c4975 = this.f14363;
        switch (i) {
            case 0:
                C5003 c5003 = abstractC5002 instanceof C5003 ? (C5003) abstractC5002 : null;
                C5069 c5069M10000 = c5003 != null ? ((C5044) c5003.f14423.getValue()).m10000() : null;
                C5069 c5069 = C5069.f14610;
                ArrayList arrayList = c4975.f14362.f13231;
                ClassLoader classLoader = abstractC5002.mo8889().getClassLoader();
                classLoader.getClass();
                return AbstractC3065.m6836(arrayList, c5069M10000, c4975, classLoader);
            default:
                C4533 c4533 = c4975.f14362.f13234;
                if (c4533 == null) {
                    AbstractC4394.m8918("returnType");
                    throw null;
                }
                ClassLoader classLoader2 = abstractC5002.mo8889().getClassLoader();
                classLoader2.getClass();
                return AbstractC6325.m11846(c4533, classLoader2, c4975.mo9968(), new C5011(c4975, 12));
        }
    }

    public C4976(C4975 c4975, AbstractC5002 abstractC5002) {
        this.f14363 = c4975;
        this.f14364 = abstractC5002;
    }
}
