package top.suzhelan.qstory.ui.activity;

import com.bumptech.glide.AbstractC3056;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C5266;
import p007.C6132;
import p052.InterfaceC6542;
import p354.C8885;
import p354.C8891;
import p391.C9114;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 50)
final /* synthetic */ class SettingActivityKt$SettingRoute$1$2$6$1 extends FunctionReferenceImpl implements InterfaceC6542 {
    public SettingActivityKt$SettingRoute$1$2$6$1(Object obj) {
        super(0, obj, C8891.class, "onSearchHistoryCleared", "onSearchHistoryCleared()V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m11276invoke() {
        Object value;
        C8891 c8891 = (C8891) this.receiver;
        c8891.getClass();
        C6132.f16715.getClass();
        C9114 c9114 = C6132.f16714;
        String strM6668 = "history";
        c9114.getClass();
        c9114.f25485.remove(strM6668);
        C5266 c5266 = c8891.f25055;
        do {
            value = c5266.getValue();
        } while (!c5266.m10308(value, C8885.m14524((C8885) value, null, 0, 0, false, null, null, EmptyList.INSTANCE, null, 383)));
    }

    @Override // p052.InterfaceC6542
    public /* bridge */ /* synthetic */ Object invoke() {
        m11276invoke();
        return C5175.f14739;
    }
}
