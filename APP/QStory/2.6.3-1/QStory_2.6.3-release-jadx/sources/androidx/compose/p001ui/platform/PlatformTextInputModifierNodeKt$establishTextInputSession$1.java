package androidx.compose.p001ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", m556f = "PlatformTextInputModifierNode.kt", m557l = {136}, m558m = "establishTextInputSession", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class PlatformTextInputModifierNodeKt$establishTextInputSession$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public PlatformTextInputModifierNodeKt$establishTextInputSession$1(InterfaceC5189<? super PlatformTextInputModifierNodeKt$establishTextInputSession$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC2688.m4042(null, null, this);
    }
}
