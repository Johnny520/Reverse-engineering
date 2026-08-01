package androidx.compose.material3;

import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.TimePickerKt", m556f = "TimePicker.kt", m557l = {920, 923}, m558m = "onTap-uYHVD98")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class TimePickerKt$onTap$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public TimePickerKt$onTap$1(InterfaceC5189<? super TimePickerKt$onTap$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        AbstractC2005.m2587(0.0f, 0.0f, 0L, this);
        return C6008.f15084;
    }
}
