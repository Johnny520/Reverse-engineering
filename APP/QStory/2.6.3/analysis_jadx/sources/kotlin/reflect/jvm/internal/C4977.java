package kotlin.reflect.jvm.internal;

import androidx.window.area.AbstractC2567;
import io.ktor.client.plugins.AbstractC3933;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.km.C4534;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4977 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4976 f14365;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC5003 f14366;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14367 = 1;

    public C4977(AbstractC5003 abstractC5003, C4976 c4976) {
        this.f14366 = abstractC5003;
        this.f14365 = c4976;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f14367;
        AbstractC5003 abstractC5003 = this.f14366;
        C4976 c4976 = this.f14365;
        switch (i) {
            case 0:
                C5004 c5004 = abstractC5003 instanceof C5004 ? (C5004) abstractC5003 : null;
                C5070 c5070M9997 = c5004 != null ? ((C5045) c5004.f14425.getValue()).m9997() : null;
                C5070 c5070 = C5070.f14610;
                ArrayList arrayList = c4976.f14364.f13235;
                ClassLoader classLoader = abstractC5003.mo8879().getClassLoader();
                classLoader.getClass();
                return AbstractC2567.m5094(arrayList, c5070M9997, c4976, classLoader);
            default:
                C4534 c4534 = c4976.f14364.f13238;
                if (c4534 == null) {
                    AbstractC4395.m8908("returnType");
                    throw null;
                }
                ClassLoader classLoader2 = abstractC5003.mo8879().getClassLoader();
                classLoader2.getClass();
                return AbstractC3933.m8290(c4534, classLoader2, c4976.mo9965(), new C5012(c4976, 12));
        }
    }

    public C4977(C4976 c4976, AbstractC5003 abstractC5003) {
        this.f14365 = c4976;
        this.f14366 = abstractC5003;
    }
}
