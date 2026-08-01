package androidx.compose.material3;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.TimePickerKt", f = "TimePicker.kt", l = {920, 923}, m = "onTap-uYHVD98")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TimePickerKt$onTap$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public TimePickerKt$onTap$1(InterfaceC4357<? super TimePickerKt$onTap$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        AbstractC1170.m2027(0.0f, 0.0f, 0L, this);
        return C5176.f14739;
    }
}
