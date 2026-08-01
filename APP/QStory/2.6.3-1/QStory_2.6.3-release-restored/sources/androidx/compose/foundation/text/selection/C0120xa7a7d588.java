package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassifier;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.sync.C6212;
import kotlinx.coroutines.sync.InterfaceC6215;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2", m556f = "PlatformSelectionBehaviors.android.kt", m557l = {369, 273, 282}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m151d2 = {"T", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class C0120xa7a7d588 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $block;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C1760 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m151d2 = {"T", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1", m556f = "PlatformSelectionBehaviors.android.kt", m557l = {283}, m558m = "invokeSuspend", m559v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC7383 $block;
        final /* synthetic */ TextClassifier $textClassificationSession;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextClassifier textClassifier, InterfaceC7383 interfaceC7383, InterfaceC5189<? super AnonymousClass1> interfaceC5189) {
            super(2, interfaceC5189);
            this.$textClassificationSession = textClassifier;
            this.$block = interfaceC7383;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new AnonymousClass1(this.$textClassificationSession, this.$block, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<Object> interfaceC5189) {
            return ((AnonymousClass1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    AbstractC6017.m10769(obj);
                    return obj;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            TextClassifier textClassifier = this.$textClassificationSession;
            if (textClassifier == null) {
                return null;
            }
            InterfaceC7383 interfaceC7383 = this.$block;
            this.label = 1;
            Object objInvoke = interfaceC7383.invoke(textClassifier, this);
            return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120xa7a7d588(C1760 c1760, InterfaceC7383 interfaceC7383, InterfaceC5189<? super C0120xa7a7d588> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1760;
        this.$block = interfaceC7383;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new C0120xa7a7d588(this.this$0, this.$block, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<Object> interfaceC5189) {
        return ((C0120xa7a7d588) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1760 c1760;
        InterfaceC6215 interfaceC6215;
        InterfaceC6215 interfaceC62152;
        TextClassifier textClassifier;
        InterfaceC6215 interfaceC62153;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                c1760 = this.this$0;
                C6212 c6212 = c1760.f2961;
                this.L$0 = c6212;
                this.L$1 = c1760;
                this.label = 1;
                Object objM10986 = c6212.m10986(this);
                interfaceC6215 = c6212;
                if (objM10986 != coroutineSingletons) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        AbstractC6017.m10769(obj);
                        return obj;
                    }
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC62152 = (InterfaceC6215) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    interfaceC62152 = interfaceC62152;
                    textClassifier = (TextClassifier) obj;
                    interfaceC62153 = interfaceC62152;
                    ((C6212) interfaceC62153).m10991(null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(textClassifier, this.$block, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    Object objM11032 = AbstractC6231.m11032(200L, anonymousClass1, this);
                    return objM11032 == coroutineSingletons ? coroutineSingletons : objM11032;
                } catch (Throwable th) {
                    th = th;
                    ((C6212) interfaceC62152).m10991(null);
                    throw th;
                }
            }
            c1760 = (C1760) this.L$1;
            InterfaceC6215 interfaceC62154 = (InterfaceC6215) this.L$0;
            AbstractC6017.m10769(obj);
            interfaceC6215 = interfaceC62154;
            textClassifier = c1760.f2960;
            if (textClassifier != null) {
                interfaceC62153 = interfaceC6215;
                if (textClassifier.isDestroyed()) {
                }
                ((C6212) interfaceC62153).m10991(null);
                AnonymousClass1 anonymousClass12 = new AnonymousClass1(textClassifier, this.$block, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                Object objM110322 = AbstractC6231.m11032(200L, anonymousClass12, this);
                if (objM110322 == coroutineSingletons) {
                }
            }
            C0121x2b917ae1 c0121x2b917ae1 = new C0121x2b917ae1(c1760, null);
            this.L$0 = interfaceC6215;
            this.L$1 = null;
            this.label = 2;
            Object objM110323 = AbstractC6231.m11032(300L, c0121x2b917ae1, this);
            if (objM110323 != coroutineSingletons) {
                interfaceC62152 = interfaceC6215;
                obj = objM110323;
                textClassifier = (TextClassifier) obj;
                interfaceC62153 = interfaceC62152;
                ((C6212) interfaceC62153).m10991(null);
                AnonymousClass1 anonymousClass122 = new AnonymousClass1(textClassifier, this.$block, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                Object objM1103222 = AbstractC6231.m11032(200L, anonymousClass122, this);
                if (objM1103222 == coroutineSingletons) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            interfaceC62152 = interfaceC6215;
            ((C6212) interfaceC62152).m10991(null);
            throw th;
        }
    }
}
