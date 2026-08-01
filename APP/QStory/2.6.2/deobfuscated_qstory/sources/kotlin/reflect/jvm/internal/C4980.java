package kotlin.reflect.jvm.internal;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.km.C4533;
import kotlin.reflect.jvm.internal.impl.km.C4535;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4517;
import lin.xposed.hook.javaplugin.C5553;
import p033.AbstractC6325;
import p052.InterfaceC6542;
import p251.AbstractC8174;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4980 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4981 f14373;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14374;

    public /* synthetic */ C4980(AbstractC4981 abstractC4981, int i) {
        this.f14374 = i;
        this.f14373 = abstractC4981;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f14374;
        AbstractC4981 abstractC4981 = this.f14373;
        switch (i) {
            case 0:
                AbstractC4981 abstractC49812 = this.f14373;
                C4535 c4535 = abstractC49812.f14376;
                return AbstractC0455.m1167(abstractC49812, c4535.f13218, c4535.f13209, EmptyList.INSTANCE, (C5069) abstractC49812.f14379.getValue(), true);
            case 1:
                AbstractC4981 abstractC49813 = this.f14373;
                if (!AbstractC5061.m10028(abstractC49813)) {
                    return abstractC49813.mo9964();
                }
                C4535 c45352 = abstractC49813.f14376;
                return AbstractC0455.m1167(abstractC49813, c45352.f13218, c45352.f13209, EmptyList.INSTANCE, (C5069) abstractC49813.f14379.getValue(), false);
            case 2:
                C4533 c4533 = abstractC4981.f14376.f13223;
                if (c4533 == null) {
                    AbstractC4394.m8918("returnType");
                    throw null;
                }
                ClassLoader classLoader = abstractC4981.f14382.mo8889().getClassLoader();
                classLoader.getClass();
                return AbstractC6325.m11846(c4533, classLoader, (C5069) abstractC4981.f14379.getValue(), AbstractC3056.m6675(abstractC4981) ? null : new C4980(abstractC4981, 5));
            case 3:
                AbstractC5002 abstractC5002 = abstractC4981.f14382;
                C5003 c5003 = abstractC5002 instanceof C5003 ? (C5003) abstractC5002 : null;
                C5069 c5069M10000 = c5003 != null ? ((C5044) c5003.f14423.getValue()).m10000() : null;
                C5069 c5069 = C5069.f14610;
                ArrayList arrayList = abstractC4981.f14376.f13210;
                ClassLoader classLoader2 = abstractC5002.mo8889().getClassLoader();
                classLoader2.getClass();
                return AbstractC3065.m6836(arrayList, c5069M10000, abstractC4981, classLoader2);
            case 4:
                if (AbstractC3056.m6675(abstractC4981)) {
                    return null;
                }
                C4535 c45353 = abstractC4981.f14376;
                c45353.getClass();
                C4517 c4517 = AbstractC8174.m13610(c45353).f18948;
                if (c4517 == null) {
                    return null;
                }
                AbstractC5002 abstractC50022 = abstractC4981.f14382;
                if (abstractC50022 instanceof C4991) {
                    try {
                        return ((C4991) abstractC50022).f14402.getDeclaredField(c4517.f13162);
                    } catch (NoSuchFieldException unused) {
                        return null;
                    }
                }
                C5553.m10815(abstractC4981, "javaField is only supported for top-level properties for now: ");
                return null;
            default:
                return abstractC4981.mo9944().getReturnType();
        }
    }
}
