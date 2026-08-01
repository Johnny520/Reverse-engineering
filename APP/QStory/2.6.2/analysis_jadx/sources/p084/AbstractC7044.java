package p084;

import androidx.compose.animation.core.C0325;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4430;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4429;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4614;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.InterfaceC4569;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4577;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import p049.AbstractC6526;
import p053.AbstractC6560;
import p081.InterfaceC7027;

/* JADX INFO: renamed from: 飘花落叶言世楪苏哲子兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7044 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4690 f18925 = C4690.m9340("message");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4690 f18924 = C4690.m9340("allowedTargets");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4690 f18923 = C4690.m9340("value");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Map f18922 = AbstractC4338.m8777(new Pair(AbstractC6526.f17890, AbstractC4614.f13479), new Pair(AbstractC6526.f17892, AbstractC4614.f13478), new Pair(AbstractC6526.f17893, AbstractC4614.f13476));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC4569 m12348(C0325 c0325, C4429 c4429, boolean z) {
        c4429.getClass();
        c0325.getClass();
        C4687 c4687M8987 = AbstractC4430.m8987(AbstractC6560.m12029(AbstractC6560.m12033(c4429.f13047)));
        C4686 c4686 = AbstractC4614.f13479;
        c4686.getClass();
        if (c4687M8987.equals(new C4687(c4686.m9330(), c4686.f13692.m9328()))) {
            return new C7050(c4429, c0325);
        }
        C4686 c46862 = AbstractC4614.f13478;
        c46862.getClass();
        if (c4687M8987.equals(new C4687(c46862.m9330(), c46862.f13692.m9328()))) {
            return new C7049(c4429, c0325);
        }
        C4686 c46863 = AbstractC4614.f13476;
        c46863.getClass();
        if (c4687M8987.equals(new C4687(c46863.m9330(), c46863.f13692.m9328()))) {
            return new C7045(c0325, c4429, AbstractC6526.f17893);
        }
        C4686 c46864 = AbstractC4614.f13477;
        c46864.getClass();
        if (c4687M8987.equals(new C4687(c46864.m9330(), c46864.f13692.m9328()))) {
            return null;
        }
        return new C4577(c0325, c4429, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static InterfaceC4569 m12349(C4686 c4686, InterfaceC7027 interfaceC7027, C0325 c0325) {
        C4429 c4429Mo8982;
        c4686.getClass();
        interfaceC7027.getClass();
        c0325.getClass();
        if (c4686.equals(AbstractC6526.f17897)) {
            C4686 c46862 = AbstractC4614.f13477;
            c46862.getClass();
            C4429 c4429Mo89822 = interfaceC7027.mo8982(c46862);
            if (c4429Mo89822 != null) {
                return new C7048(c4429Mo89822, c0325);
            }
        }
        C4686 c46863 = (C4686) f18922.get(c4686);
        if (c46863 == null || (c4429Mo8982 = interfaceC7027.mo8982(c46863)) == null) {
            return null;
        }
        return m12348(c0325, c4429Mo8982, false);
    }
}
