package kotlin.reflect.jvm.internal;

import androidx.window.area.AbstractC2567;
import com.bumptech.glide.AbstractC3056;
import io.ktor.client.plugins.AbstractC3933;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.km.C4534;
import kotlin.reflect.jvm.internal.impl.km.C4536;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4518;
import lin.xposed.hook.javaplugin.C5554;
import p052.InterfaceC6543;
import p053.AbstractC6561;
import p253.AbstractC8190;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4981 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4982 f14375;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14376;

    public /* synthetic */ C4981(AbstractC4982 abstractC4982, int i) {
        this.f14376 = i;
        this.f14375 = abstractC4982;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f14376;
        AbstractC4982 abstractC4982 = this.f14375;
        switch (i) {
            case 0:
                AbstractC4982 abstractC49822 = this.f14375;
                C4536 c4536 = abstractC49822.f14378;
                return AbstractC6561.m12055(abstractC49822, c4536.f13222, c4536.f13213, EmptyList.INSTANCE, (C5070) abstractC49822.f14381.getValue(), true);
            case 1:
                AbstractC4982 abstractC49823 = this.f14375;
                if (!AbstractC5062.m10042(abstractC49823)) {
                    return abstractC49823.mo9961();
                }
                C4536 c45362 = abstractC49823.f14378;
                return AbstractC6561.m12055(abstractC49823, c45362.f13222, c45362.f13213, EmptyList.INSTANCE, (C5070) abstractC49823.f14381.getValue(), false);
            case 2:
                C4534 c4534 = abstractC4982.f14378.f13227;
                if (c4534 == null) {
                    AbstractC4395.m8908("returnType");
                    throw null;
                }
                ClassLoader classLoader = abstractC4982.f14384.mo8879().getClassLoader();
                classLoader.getClass();
                return AbstractC3933.m8290(c4534, classLoader, (C5070) abstractC4982.f14381.getValue(), AbstractC8190.m13698(abstractC4982) ? null : new C4981(abstractC4982, 5));
            case 3:
                AbstractC5003 abstractC5003 = abstractC4982.f14384;
                C5004 c5004 = abstractC5003 instanceof C5004 ? (C5004) abstractC5003 : null;
                C5070 c5070M9997 = c5004 != null ? ((C5045) c5004.f14425.getValue()).m9997() : null;
                C5070 c5070 = C5070.f14610;
                ArrayList arrayList = abstractC4982.f14378.f13214;
                ClassLoader classLoader2 = abstractC5003.mo8879().getClassLoader();
                classLoader2.getClass();
                return AbstractC2567.m5094(arrayList, c5070M9997, abstractC4982, classLoader2);
            case 4:
                if (AbstractC8190.m13698(abstractC4982)) {
                    return null;
                }
                C4536 c45363 = abstractC4982.f14378;
                c45363.getClass();
                C4518 c4518 = AbstractC3056.m6706(c45363).f18943;
                if (c4518 == null) {
                    return null;
                }
                AbstractC5003 abstractC50032 = abstractC4982.f14384;
                if (abstractC50032 instanceof C4992) {
                    try {
                        return ((C4992) abstractC50032).f14404.getDeclaredField(c4518.f13166);
                    } catch (NoSuchFieldException unused) {
                        return null;
                    }
                }
                C5554.m10872(abstractC4982, "javaField is only supported for top-level properties for now: ");
                return null;
            default:
                return abstractC4982.mo9941().getReturnType();
        }
    }
}
