package top.suzhelan.qstory.ui.activity;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C5267;
import p052.InterfaceC6543;
import p287.AbstractC8405;
import p350.C8853;
import p350.C8859;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 50)
final /* synthetic */ class SettingActivityKt$SettingRoute$1$2$1$5$1$1 extends FunctionReferenceImpl implements InterfaceC6543 {
    public SettingActivityKt$SettingRoute$1$2$1$5$1$1(Object obj) {
        super(0, obj, C8859.class, AbstractC8405.m13972(2877), AbstractC8405.m13972(2878), 0);
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m11334invoke() {
        Object value;
        C8853 c8853M14520;
        C5267 c5267 = ((C8859) this.receiver).f24979;
        do {
            value = c5267.getValue();
            c8853M14520 = (C8853) value;
            if (c8853M14520.f24964 != -1) {
                c8853M14520 = C8853.m14520(c8853M14520, null, -1, 0, false, null, null, null, null, 507);
            }
        } while (!c5267.m10312(value, c8853M14520));
    }

    @Override // p052.InterfaceC6543
    public /* bridge */ /* synthetic */ Object invoke() {
        m11334invoke();
        return C5176.f14739;
    }
}
