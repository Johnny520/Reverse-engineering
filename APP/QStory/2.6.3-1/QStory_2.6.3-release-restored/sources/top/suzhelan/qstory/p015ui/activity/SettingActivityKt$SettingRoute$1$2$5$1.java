package top.suzhelan.qstory.p015ui.activity;

import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7387;
import p366.C9688;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 50)
final /* synthetic */ class SettingActivityKt$SettingRoute$1$2$5$1 extends FunctionReferenceImpl implements InterfaceC7387 {
    public SettingActivityKt$SettingRoute$1$2$5$1(Object obj) {
        super(1, obj, C9688.class, "onSearchHistorySelected", "onSearchHistorySelected(Ljava/lang/String;)V", 0);
    }

    public final void invoke(String str) {
        "p0";
        str.getClass();
        C9688 c9688 = (C9688) this.receiver;
        c9688.getClass();
        "keyword";
        c9688.m15080(str);
    }

    @Override // p068.InterfaceC7387
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C6008.f15084;
    }
}
