package android.view;

import Yue.AbstractC7690;
import Yue.C3617;
import Yue.C5499;
import Yue.C5508;
import Yue.C7149;
import Yue.C8107;
import Yue.InterfaceC4199;
import Yue.InterfaceC4243;
import Yue.InterfaceC4313;
import Yue.InterfaceC4372;
import Yue.InterfaceC5138;
import Yue.InterfaceC5542;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000b\u001a\u00020\n2'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\r\u001a\u00020\n2'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fJ;\u0010\u000e\u001a\u00020\n2'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0012\u001a\u00020\u000f8 X \u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScope;", "LYue/ۥ۟ۧۧۥ;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Lkotlin/Function2;", "LYue/ۥ۟ۧۤۢ;", "LYue/ۥۣۢ۠ۤ;", "", "LYue/ۥ۠ۡۥۧ;", "block", "LYue/ۥ۠ۦ۟ۡ;", "launchWhenCreated", "(LYue/ۥۣ۠ۢۢ;)LYue/ۥ۠ۦ۟ۡ;", "launchWhenStarted", "launchWhenResumed", "Landroidx/lifecycle/Lifecycle;", "getLifecycle$lifecycle_common", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
public abstract class LifecycleCoroutineScope implements InterfaceC4243 {

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1 */
    @InterfaceC4313(m1272c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", m1273f = "Lifecycle.kt", m1274i = {}, m1275l = {337}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LYue/ۥ۟ۧۧۥ;", "LYue/ۥۣۢ۠ۤ;", "<anonymous>", "(LYue/ۥ۟ۧۧۥ;)V"}, k = 3, mv = {1, 8, 0})
    public static final class C17101 extends AbstractC7690 implements InterfaceC5138<InterfaceC4243, InterfaceC4199<? super C8107>, Object> {
        final /* synthetic */ InterfaceC5138<InterfaceC4243, InterfaceC4199<? super C8107>, Object> $block;
        int label;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۢ<? super Yue.ۥ۟ۧۧۥ, ? super Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C17101(InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138, InterfaceC4199<? super C17101> interfaceC4199) {
            super(2, interfaceC4199);
            this.$block = interfaceC5138;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            return LifecycleCoroutineScope.this.new C17101(this.$block, interfaceC4199);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        public final Object invoke(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C17101) create(interfaceC4243, interfaceC4199)).invokeSuspend(C8107.f3222);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            Object objM17142 = C5508.m17142();
            int i = this.label;
            if (i == 0) {
                C7149.m22422(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle();
                InterfaceC5138<InterfaceC4243, InterfaceC4199<? super C8107>, Object> interfaceC5138 = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenCreated(lifecycle$lifecycle_common, interfaceC5138, this) == objM17142) {
                    return objM17142;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7149.m22422(obj);
            }
            return C8107.f3222;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1 */
    @InterfaceC4313(m1272c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", m1273f = "Lifecycle.kt", m1274i = {}, m1275l = {375}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LYue/ۥ۟ۧۧۥ;", "LYue/ۥۣۢ۠ۤ;", "<anonymous>", "(LYue/ۥ۟ۧۧۥ;)V"}, k = 3, mv = {1, 8, 0})
    public static final class C17111 extends AbstractC7690 implements InterfaceC5138<InterfaceC4243, InterfaceC4199<? super C8107>, Object> {
        final /* synthetic */ InterfaceC5138<InterfaceC4243, InterfaceC4199<? super C8107>, Object> $block;
        int label;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۢ<? super Yue.ۥ۟ۧۧۥ, ? super Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C17111(InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138, InterfaceC4199<? super C17111> interfaceC4199) {
            super(2, interfaceC4199);
            this.$block = interfaceC5138;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            return LifecycleCoroutineScope.this.new C17111(this.$block, interfaceC4199);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        public final Object invoke(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C17111) create(interfaceC4243, interfaceC4199)).invokeSuspend(C8107.f3222);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            Object objM17142 = C5508.m17142();
            int i = this.label;
            if (i == 0) {
                C7149.m22422(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle();
                InterfaceC5138<InterfaceC4243, InterfaceC4199<? super C8107>, Object> interfaceC5138 = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenResumed(lifecycle$lifecycle_common, interfaceC5138, this) == objM17142) {
                    return objM17142;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7149.m22422(obj);
            }
            return C8107.f3222;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1 */
    @InterfaceC4313(m1272c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", m1273f = "Lifecycle.kt", m1274i = {}, m1275l = {356}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LYue/ۥ۟ۧۧۥ;", "LYue/ۥۣۢ۠ۤ;", "<anonymous>", "(LYue/ۥ۟ۧۧۥ;)V"}, k = 3, mv = {1, 8, 0})
    public static final class C17121 extends AbstractC7690 implements InterfaceC5138<InterfaceC4243, InterfaceC4199<? super C8107>, Object> {
        final /* synthetic */ InterfaceC5138<InterfaceC4243, InterfaceC4199<? super C8107>, Object> $block;
        int label;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۢ<? super Yue.ۥ۟ۧۧۥ, ? super Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C17121(InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138, InterfaceC4199<? super C17121> interfaceC4199) {
            super(2, interfaceC4199);
            this.$block = interfaceC5138;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            return LifecycleCoroutineScope.this.new C17121(this.$block, interfaceC4199);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        public final Object invoke(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C17121) create(interfaceC4243, interfaceC4199)).invokeSuspend(C8107.f3222);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            Object objM17142 = C5508.m17142();
            int i = this.label;
            if (i == 0) {
                C7149.m22422(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle();
                InterfaceC5138<InterfaceC4243, InterfaceC4199<? super C8107>, Object> interfaceC5138 = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenStarted(lifecycle$lifecycle_common, interfaceC5138, this) == objM17142) {
                    return objM17142;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7149.m22422(obj);
            }
            return C8107.f3222;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: getLifecycle$lifecycle_common */
    public abstract Lifecycle getLifecycle();

    @InterfaceC6399
    @InterfaceC4372(message = "launchWhenCreated is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.CREATED.")
    public final InterfaceC5542 launchWhenCreated(@InterfaceC6399 InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super C8107>, ? extends Object> block) {
        C5499.m17103(block, "block");
        return C3617.m9760(this, null, null, new C17101(block, null), 3, null);
    }

    @InterfaceC6399
    @InterfaceC4372(message = "launchWhenResumed is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.RESUMED.")
    public final InterfaceC5542 launchWhenResumed(@InterfaceC6399 InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super C8107>, ? extends Object> block) {
        C5499.m17103(block, "block");
        return C3617.m9760(this, null, null, new C17111(block, null), 3, null);
    }

    @InterfaceC6399
    @InterfaceC4372(message = "launchWhenStarted is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.STARTED.")
    public final InterfaceC5542 launchWhenStarted(@InterfaceC6399 InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super C8107>, ? extends Object> block) {
        C5499.m17103(block, "block");
        return C3617.m9760(this, null, null, new C17121(block, null), 3, null);
    }
}
