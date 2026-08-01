package kotlin.reflect.jvm.internal.impl.descriptors;

import androidx.compose.animation.core.C1171;
import io.ktor.util.C5043;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5247;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.storage.C5669;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5301 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1171 f13444;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13445;

    public /* synthetic */ C5301(C1171 c1171, int i) {
        this.f13445 = i;
        this.f13444 = c1171;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f13445;
        C1171 c1171 = this.f13444;
        switch (i) {
            case 0:
                C5519 c5519 = (C5519) obj;
                c5519.getClass();
                return new C5247((InterfaceC5318) c1171.f1441, c5519, 1);
            default:
                C5300 c5300 = (C5300) obj;
                c5300.getClass();
                C5520 c5520 = c5300.f13443;
                List list = c5300.f13442;
                if (c5520.f14042) {
                    C5043.m9155(c5520, "Unresolved local class: ");
                    return null;
                }
                C5520 c5520M9883 = c5520.m9883();
                InterfaceC5310 interfaceC5310M1527 = c5520M9883 != null ? c1171.m1527(c5520M9883, AbstractC5176.m9364(1, list)) : (InterfaceC5310) ((C5669) c1171.f1439).invoke(c5520.f14044);
                boolean zM9887 = c5520.m9887();
                C5677 c5677 = (C5677) c1171.f1440;
                C5523 c5523M9882 = c5520.m9882();
                Integer num = (Integer) AbstractC5176.m9374(list);
                return new C5299(c5677, interfaceC5310M1527, c5523M9882, zM9887, num != null ? num.intValue() : 0);
        }
    }
}
