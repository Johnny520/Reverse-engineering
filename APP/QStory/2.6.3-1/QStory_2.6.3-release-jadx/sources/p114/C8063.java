package p114;

import java.util.Collection;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import p062.C7311;
import p062.InterfaceC7310;
import p065.AbstractC7359;
import p068.InterfaceC7387;
import p095.C7833;

/* JADX INFO: renamed from: 飘花落叶言世苏子哲兰楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8063 implements InterfaceC5318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final InterfaceC6016 f19616;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C8063 f19619 = new C8063();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5523 f19617 = C5523.m9892(ErrorEntity.ERROR_MODULE.getDebugText());

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final EmptyList f19618 = EmptyList.INSTANCE;

    static {
        EmptySet emptySet = EmptySet.INSTANCE;
        f19616 = AbstractC6019.m10773(C8064.f19620);
    }

    @Override // p062.InterfaceC7308
    public final InterfaceC7310 getAnnotations() {
        return C7311.f18113;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    public final C5523 getName() {
        return f19617;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final boolean mo9619(InterfaceC5318 interfaceC5318) {
        interfaceC5318.getClass();
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC7359 mo9620() {
        return (AbstractC7359) f19616.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9586(InterfaceC5329 interfaceC5329, Object obj) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final C7833 mo9621(C5519 c5519) {
        c5519.getClass();
        throw new IllegalStateException("Should not be called!");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC5331 mo9587() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Collection mo9622(C5519 c5519, InterfaceC7387 interfaceC7387) {
        c5519.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final List mo9623() {
        return f19618;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final Object mo9624(C5317 c5317) {
        c5317.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5331 mo9561() {
        return this;
    }
}
