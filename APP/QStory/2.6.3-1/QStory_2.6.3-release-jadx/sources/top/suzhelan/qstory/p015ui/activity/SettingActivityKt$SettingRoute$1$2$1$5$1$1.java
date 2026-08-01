package top.suzhelan.qstory.p015ui.activity;

import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C6099;
import p068.InterfaceC7372;
import p303.AbstractC9234;
import p366.C9682;
import p366.C9688;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 50)
final /* synthetic */ class SettingActivityKt$SettingRoute$1$2$1$5$1$1 extends FunctionReferenceImpl implements InterfaceC7372 {
    public SettingActivityKt$SettingRoute$1$2$1$5$1$1(Object obj) {
        super(0, obj, C9688.class, AbstractC9234.m14531(2877), AbstractC9234.m14531(2878), 0);
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m11893invoke() {
        Object value;
        C9682 c9682M15079;
        C6099 c6099 = ((C9688) this.receiver).f25324;
        do {
            value = c6099.getValue();
            c9682M15079 = (C9682) value;
            if (c9682M15079.f25309 != -1) {
                c9682M15079 = C9682.m15079(c9682M15079, null, -1, 0, false, null, null, null, null, 507);
            }
        } while (!c6099.m10871(value, c9682M15079));
    }

    @Override // p068.InterfaceC7372
    public /* bridge */ /* synthetic */ Object invoke() {
        m11893invoke();
        return C6008.f15084;
    }
}
