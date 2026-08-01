package androidx.compose.runtime.tooling;

import androidx.compose.runtime.C1324;
import com.bumptech.glide.AbstractC3055;
import java.util.List;
import kotlin.coroutines.InterfaceC4353;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.InterfaceC4360;
import p052.InterfaceC6553;
import p126.InterfaceC7429;
import p305.C8631;

/* JADX INFO: renamed from: androidx.compose.runtime.tooling.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1292 implements InterfaceC7429, InterfaceC4353 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8631 f3778 = new C8631(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1324 f3779;

    public C1292(C1324 c1324) {
        this.f3779 = c1324;
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final /* bridge */ Object fold(Object obj, InterfaceC6553 interfaceC6553) {
        return AbstractC3055.m6648(this, obj, interfaceC6553);
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final /* bridge */ InterfaceC4353 get(InterfaceC4360 interfaceC4360) {
        return AbstractC3055.m6640(this, interfaceC4360);
    }

    @Override // kotlin.coroutines.InterfaceC4353
    public final InterfaceC4360 getKey() {
        return f3778;
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final /* bridge */ InterfaceC4359 minusKey(InterfaceC4360 interfaceC4360) {
        return AbstractC3055.m6637(this, interfaceC4360);
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final /* bridge */ InterfaceC4359 plus(InterfaceC4359 interfaceC4359) {
        return AbstractC3055.m6636(interfaceC4359, this);
    }

    @Override // p126.InterfaceC7429
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final boolean mo2289() {
        return this.f3779.f3845;
    }

    @Override // p126.InterfaceC7429
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final List mo2290(Integer num) {
        return this.f3779.m2349();
    }
}
