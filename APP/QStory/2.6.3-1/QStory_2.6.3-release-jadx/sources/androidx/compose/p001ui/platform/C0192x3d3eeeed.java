package androidx.compose.p001ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", m556f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", m557l = {2374, 2410}, m558m = "boundsUpdatesEventLoop$ui", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class C0192x3d3eeeed extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ViewOnAttachStateChangeListenerC2720 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0192x3d3eeeed(ViewOnAttachStateChangeListenerC2720 viewOnAttachStateChangeListenerC2720, InterfaceC5189<? super C0192x3d3eeeed> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = viewOnAttachStateChangeListenerC2720;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m4148(this);
    }
}
