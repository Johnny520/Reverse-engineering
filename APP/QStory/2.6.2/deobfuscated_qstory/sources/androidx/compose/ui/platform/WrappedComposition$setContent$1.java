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
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6553;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/飘花落叶言子苏世哲兰楪;", "composeViewContext", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/platform/飘花落叶言子苏世哲兰楪;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class WrappedComposition$setContent$1 extends Lambda implements InterfaceC6557 {
    final /* synthetic */ InterfaceC6553 $content;
    final /* synthetic */ C1851 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrappedComposition$setContent$1(C1851 c1851, InterfaceC6553 interfaceC6553) {
        super(1);
        this.this$0 = c1851;
        this.$content = interfaceC6553;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(C1851 c1851, AbstractC2402 abstractC2402) {
        if (c1851.f5358) {
            return;
        }
        c1851.f5356 = abstractC2402;
        abstractC2402.mo4493(c1851);
    }

    public final void invoke(final C1903 c1903) {
        if (this.this$0.f5358) {
            return;
        }
        InterfaceC2388 interfaceC2388 = c1903.f5596;
        View view = c1903.f5598;
        final AbstractC2402 lifecycle = interfaceC2388.getLifecycle();
        C1851 c1851 = this.this$0;
        c1851.f5355 = this.$content;
        if (c1851.f5356 != null) {
            if (((C2386) lifecycle).f7018.isAtLeast(Lifecycle$State.CREATED)) {
                final C1851 c18512 = this.this$0;
                C1363 c1363 = c18512.f5357;
                final InterfaceC6553 interfaceC6553 = this.$content;
                c1363.m2433(new C1242(-1723985096, true, new InterfaceC6553() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1.2
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
                        if (!c1324.m2333(i & 1, (i & 3) != 2)) {
                            c1324.m2329();
                            return;
                        }
                        C1851 c18513 = c18512;
                        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = c18513.f5359;
                        boolean zM2368 = c1324.m2368(c18513);
                        C1851 c18514 = c18512;
                        Object objM2335 = c1324.m2335();
                        C1353 c1353 = C1369.f3973;
                        if (zM2368 || objM2335 == c1353) {
                            objM2335 = new WrappedComposition$setContent$1$2$1$1(c18514, null);
                            c1324.m2376(objM2335);
                        }
                        AbstractC1367.m2490(c1324, viewTreeObserverOnGlobalLayoutListenerC1884, (InterfaceC6553) objM2335);
                        C1851 c18515 = c18512;
                        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC18842 = c18515.f5359;
                        boolean zM23682 = c1324.m2368(c18515);
                        C1851 c18516 = c18512;
                        Object objM23352 = c1324.m2335();
                        if (zM23682 || objM23352 == c1353) {
                            objM23352 = new WrappedComposition$setContent$1$2$2$1(c18516, null);
                            c1324.m2376(objM23352);
                        }
                        AbstractC1367.m2490(c1324, viewTreeObserverOnGlobalLayoutListenerC18842, (InterfaceC6553) objM23352);
                        c1903.m3592(c18512.f5359, interfaceC6553, c1324, 0);
                    }

                    @Override // p052.InterfaceC6553
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                        return C5175.f14739;
                    }
                }));
                return;
            }
            return;
        }
        boolean zM8917 = AbstractC4394.m8917(Looper.myLooper(), view.getHandler().getLooper());
        final C1851 c18513 = this.this$0;
        if (!zM8917) {
            view.post(new Runnable() { // from class: androidx.compose.ui.platform.飘花落叶言子兰世哲苏楪
                @Override // java.lang.Runnable
                public final void run() {
                    WrappedComposition$setContent$1.invoke$lambda$0(c18513, lifecycle);
                }
            });
        } else {
            c18513.f5356 = lifecycle;
            lifecycle.mo4493(c18513);
        }
    }

    @Override // p052.InterfaceC6557
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1903) obj);
        return C5175.f14739;
    }
}
