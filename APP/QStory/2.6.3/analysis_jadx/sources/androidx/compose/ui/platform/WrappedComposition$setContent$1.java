package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.View;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1363;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.C2386;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.Lifecycle$State;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6554;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/飘花落叶言子苏世哲兰楪;", "composeViewContext", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/platform/飘花落叶言子苏世哲兰楪;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class WrappedComposition$setContent$1 extends Lambda implements InterfaceC6558 {
    final /* synthetic */ InterfaceC6554 $content;
    final /* synthetic */ C1851 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrappedComposition$setContent$1(C1851 c1851, InterfaceC6554 interfaceC6554) {
        super(1);
        this.this$0 = c1851;
        this.$content = interfaceC6554;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(C1851 c1851, AbstractC2402 abstractC2402) {
        if (c1851.f5359) {
            return;
        }
        c1851.f5357 = abstractC2402;
        abstractC2402.mo4503(c1851);
    }

    public final void invoke(final C1903 c1903) {
        if (this.this$0.f5359) {
            return;
        }
        InterfaceC2388 interfaceC2388 = c1903.f5597;
        View view = c1903.f5599;
        final AbstractC2402 lifecycle = interfaceC2388.getLifecycle();
        C1851 c1851 = this.this$0;
        c1851.f5356 = this.$content;
        if (c1851.f5357 != null) {
            if (((C2386) lifecycle).f7019.isAtLeast(Lifecycle$State.CREATED)) {
                final C1851 c18512 = this.this$0;
                C1363 c1363 = c18512.f5358;
                final InterfaceC6554 interfaceC6554 = this.$content;
                c1363.m2443(new C1242(-1723985096, true, new InterfaceC6554() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1.2
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
                    public final void invoke(InterfaceC1373 interfaceC1373, int i) {
                        C1324 c1324 = (C1324) interfaceC1373;
                        if (!c1324.m2343(i & 1, (i & 3) != 2)) {
                            c1324.m2339();
                            return;
                        }
                        C1851 c18513 = c18512;
                        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = c18513.f5360;
                        boolean zM2378 = c1324.m2378(c18513);
                        C1851 c18514 = c18512;
                        Object objM2345 = c1324.m2345();
                        C1353 c1353 = C1369.f3974;
                        if (zM2378 || objM2345 == c1353) {
                            objM2345 = new WrappedComposition$setContent$1$2$1$1(c18514, null);
                            c1324.m2386(objM2345);
                        }
                        AbstractC1367.m2500(c1324, viewTreeObserverOnGlobalLayoutListenerC1884, (InterfaceC6554) objM2345);
                        C1851 c18515 = c18512;
                        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC18842 = c18515.f5360;
                        boolean zM23782 = c1324.m2378(c18515);
                        C1851 c18516 = c18512;
                        Object objM23452 = c1324.m2345();
                        if (zM23782 || objM23452 == c1353) {
                            objM23452 = new WrappedComposition$setContent$1$2$2$1(c18516, null);
                            c1324.m2386(objM23452);
                        }
                        AbstractC1367.m2500(c1324, viewTreeObserverOnGlobalLayoutListenerC18842, (InterfaceC6554) objM23452);
                        c1903.m3602(c18512.f5360, interfaceC6554, c1324, 0);
                    }

                    @Override // p052.InterfaceC6554
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                        return C5176.f14739;
                    }
                }));
                return;
            }
            return;
        }
        boolean zM8907 = AbstractC4395.m8907(Looper.myLooper(), view.getHandler().getLooper());
        final C1851 c18513 = this.this$0;
        if (!zM8907) {
            view.post(new Runnable() { // from class: androidx.compose.ui.platform.飘花落叶言子兰世哲苏楪
                @Override // java.lang.Runnable
                public final void run() {
                    WrappedComposition$setContent$1.invoke$lambda$0(c18513, lifecycle);
                }
            });
        } else {
            c18513.f5357 = lifecycle;
            lifecycle.mo4503(c18513);
        }
    }

    @Override // p052.InterfaceC6558
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1903) obj);
        return C5176.f14739;
    }
}
