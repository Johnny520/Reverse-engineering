package top.suzhelan.qstory.p015ui.activity;

import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C6099;
import p025.C6999;
import p068.InterfaceC7372;
import p366.C9682;
import p366.C9688;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 50)
final /* synthetic */ class SettingActivityKt$SettingRoute$1$2$1$2$1 extends FunctionReferenceImpl implements InterfaceC7372 {
    public SettingActivityKt$SettingRoute$1$2$1$2$1(Object obj) {
        super(0, obj, C9688.class, "onSearchDialogShown", "onSearchDialogShown()V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m11892invoke() {
        Object value;
        C6099 c6099 = ((C9688) this.receiver).f25324;
        do {
            value = c6099.getValue();
            C6999.f17312.getClass();
        } while (!c6099.m10871(value, C9682.m15079((C9682) value, null, 0, 0, true, null, null, C6999.m12125(), null, 367)));
    }

    @Override // p068.InterfaceC7372
    public /* bridge */ /* synthetic */ Object invoke() {
        m11892invoke();
        return C6008.f15084;
    }
}
