package androidx.compose.p001ui.platform;

import android.os.Looper;
import android.view.View;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2198;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2077;
import androidx.lifecycle.AbstractC3235;
import androidx.lifecycle.C3219;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.Lifecycle$State;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7383;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Landroidx/compose/ui/platform/飘花落叶言子苏世哲兰楪;", "composeViewContext", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/platform/飘花落叶言子苏世哲兰楪;)V", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class WrappedComposition$setContent$1 extends Lambda implements InterfaceC7387 {
    final /* synthetic */ InterfaceC7383 $content;
    final /* synthetic */ C2686 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrappedComposition$setContent$1(C2686 c2686, InterfaceC7383 interfaceC7383) {
        super(1);
        this.this$0 = c2686;
        this.$content = interfaceC7383;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(C2686 c2686, AbstractC3235 abstractC3235) {
        if (c2686.f5704) {
            return;
        }
        c2686.f5702 = abstractC3235;
        abstractC3235.mo5063(c2686);
    }

    public final void invoke(final C2738 c2738) {
        if (this.this$0.f5704) {
            return;
        }
        InterfaceC3221 interfaceC3221 = c2738.f5942;
        View view = c2738.f5944;
        final AbstractC3235 lifecycle = interfaceC3221.getLifecycle();
        C2686 c2686 = this.this$0;
        c2686.f5701 = this.$content;
        if (c2686.f5702 != null) {
            if (((C3219) lifecycle).f7364.isAtLeast(Lifecycle$State.CREATED)) {
                final C2686 c26862 = this.this$0;
                C2198 c2198 = c26862.f5703;
                final InterfaceC7383 interfaceC7383 = this.$content;
                c2198.m3003(new C2077(-1723985096, true, new InterfaceC7383() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    public final void invoke(InterfaceC2208 interfaceC2208, int i) {
                        C2159 c2159 = (C2159) interfaceC2208;
                        if (!c2159.m2903(i & 1, (i & 3) != 2)) {
                            c2159.m2899();
                            return;
                        }
                        C2686 c26863 = c26862;
                        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = c26863.f5705;
                        boolean zM2938 = c2159.m2938(c26863);
                        C2686 c26864 = c26862;
                        Object objM2905 = c2159.m2905();
                        C2188 c2188 = C2204.f4319;
                        if (zM2938 || objM2905 == c2188) {
                            objM2905 = new WrappedComposition$setContent$1$2$1$1(c26864, null);
                            c2159.m2946(objM2905);
                        }
                        AbstractC2202.m3060(c2159, viewTreeObserverOnGlobalLayoutListenerC2719, (InterfaceC7383) objM2905);
                        C2686 c26865 = c26862;
                        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC27192 = c26865.f5705;
                        boolean zM29382 = c2159.m2938(c26865);
                        C2686 c26866 = c26862;
                        Object objM29052 = c2159.m2905();
                        if (zM29382 || objM29052 == c2188) {
                            objM29052 = new WrappedComposition$setContent$1$2$2$1(c26866, null);
                            c2159.m2946(objM29052);
                        }
                        AbstractC2202.m3060(c2159, viewTreeObserverOnGlobalLayoutListenerC27192, (InterfaceC7383) objM29052);
                        c2738.m4162(c26862.f5705, interfaceC7383, c2159, 0);
                    }

                    @Override // p068.InterfaceC7383
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
                        return C6008.f15084;
                    }
                }));
                return;
            }
            return;
        }
        boolean zM9466 = AbstractC5227.m9466(Looper.myLooper(), view.getHandler().getLooper());
        final C2686 c26863 = this.this$0;
        if (!zM9466) {
            view.post(new Runnable() { // from class: androidx.compose.ui.platform.飘花落叶言子兰世哲苏楪
                @Override // java.lang.Runnable
                public final void run() {
                    WrappedComposition$setContent$1.invoke$lambda$0(c26863, lifecycle);
                }
            });
        } else {
            c26863.f5702 = lifecycle;
            lifecycle.mo5063(c26863);
        }
    }

    @Override // p068.InterfaceC7387
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C2738) obj);
        return C6008.f15084;
    }
}
