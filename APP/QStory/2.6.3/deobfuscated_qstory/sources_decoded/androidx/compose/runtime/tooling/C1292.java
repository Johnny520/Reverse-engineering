package androidx.compose.runtime.tooling;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.runtime.C1324;
import java.util.List;
import kotlin.coroutines.InterfaceC4354;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.InterfaceC4361;
import p052.InterfaceC6554;
import p126.InterfaceC7430;
import p305.C8623;

/* JADX INFO: renamed from: androidx.compose.runtime.tooling.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1292 implements InterfaceC7430, InterfaceC4354 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8623 f3779 = new C8623(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1324 f3780;

    public C1292(C1324 c1324) {
        this.f3780 = c1324;
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final /* bridge */ Object fold(Object obj, InterfaceC6554 interfaceC6554) {
        return AbstractC0455.m1167(this, obj, interfaceC6554);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final /* bridge */ InterfaceC4354 get(InterfaceC4361 interfaceC4361) {
        return AbstractC0455.m1171(this, interfaceC4361);
    }

    @Override // kotlin.coroutines.InterfaceC4354
    public final InterfaceC4361 getKey() {
        return f3779;
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final /* bridge */ InterfaceC4360 minusKey(InterfaceC4361 interfaceC4361) {
        return AbstractC0455.m1146(this, interfaceC4361);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final /* bridge */ InterfaceC4360 plus(InterfaceC4360 interfaceC4360) {
        return AbstractC0455.m1154(interfaceC4360, this);
    }

    @Override // p126.InterfaceC7430
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final boolean mo2299() {
        return this.f3780.f3846;
    }

    @Override // p126.InterfaceC7430
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final List mo2300(Integer num) {
        return this.f3780.m2359();
    }
}
