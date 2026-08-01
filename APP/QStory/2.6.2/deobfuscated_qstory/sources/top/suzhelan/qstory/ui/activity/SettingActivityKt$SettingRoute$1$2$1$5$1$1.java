package top.suzhelan.qstory.ui.activity;

import com.bumptech.glide.AbstractC3056;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C5266;
import p052.InterfaceC6542;
import p354.C8885;
import p354.C8891;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 50)
final /* synthetic */ class SettingActivityKt$SettingRoute$1$2$1$5$1$1 extends FunctionReferenceImpl implements InterfaceC6542 {
    public SettingActivityKt$SettingRoute$1$2$1$5$1$1(Object obj) {
        super(0, obj, C8891.class, "onHighlightConsumed", "onHighlightConsumed()V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m11274invoke() {
        Object value;
        C8885 c8885M14524;
        C5266 c5266 = ((C8891) this.receiver).f25055;
        do {
            value = c5266.getValue();
            c8885M14524 = (C8885) value;
            if (c8885M14524.f25040 != -1) {
                c8885M14524 = C8885.m14524(c8885M14524, null, -1, 0, false, null, null, null, null, 507);
            }
        } while (!c5266.m10308(value, c8885M14524));
    }

    @Override // p052.InterfaceC6542
    public /* bridge */ /* synthetic */ Object invoke() {
        m11274invoke();
        return C5175.f14739;
    }
}
