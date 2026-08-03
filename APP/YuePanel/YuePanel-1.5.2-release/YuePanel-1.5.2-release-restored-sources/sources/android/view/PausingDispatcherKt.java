package android.view;

import Yue.AbstractC7690;
import Yue.C3615;
import Yue.C4423;
import Yue.C4750;
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
import android.view.Lifecycle;
import com.android.p001dx.p004io.Opcodes;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aF\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aF\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000b\u001aF\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\t\u001aF\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000b\u001aF\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\t\u001aF\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000b\u001aN\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {C4750.f10502, "Landroidx/lifecycle/LifecycleOwner;", "Lkotlin/Function2;", "LYue/ۥ۟ۧۧۥ;", "LYue/ۥ۟ۧۤۢ;", "", "LYue/ۥ۠ۡۥۧ;", "block", "whenCreated", "(Landroidx/lifecycle/LifecycleOwner;LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;", "Landroidx/lifecycle/Lifecycle;", "(Landroidx/lifecycle/Lifecycle;LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;", "whenStarted", "whenResumed", "Landroidx/lifecycle/Lifecycle$State;", "minState", "whenStateAtLeast", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;", "lifecycle-common"}, k = 2, mv = {1, 8, 0})
public final class PausingDispatcherKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2 */
    @InterfaceC4313(m1272c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", m1273f = "PausingDispatcher.kt", m1274i = {0}, m1275l = {Opcodes.ADD_DOUBLE_2ADDR}, m1276m = "invokeSuspend", m1277n = {"controller"}, m1278s = {"L$0"})
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {C4750.f10502, "LYue/ۥ۟ۧۧۥ;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C17152<T> extends AbstractC7690 implements InterfaceC5138<InterfaceC4243, InterfaceC4199<? super T>, Object> {
        final /* synthetic */ InterfaceC5138<InterfaceC4243, InterfaceC4199<? super T>, Object> $block;
        final /* synthetic */ Lifecycle.State $minState;
        final /* synthetic */ Lifecycle $this_whenStateAtLeast;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۢۢ<? super Yue.ۥ۟ۧۧۥ, ? super Yue.ۥ۟ۧۤۢ<? super T>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C17152(Lifecycle lifecycle, Lifecycle.State state, InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138, InterfaceC4199<? super C17152> interfaceC4199) {
            super(2, interfaceC4199);
            this.$this_whenStateAtLeast = lifecycle;
            this.$minState = state;
            this.$block = interfaceC5138;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C17152 c17152 = new C17152(this.$this_whenStateAtLeast, this.$minState, this.$block, interfaceC4199);
            c17152.L$0 = obj;
            return c17152;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        public final Object invoke(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6489 InterfaceC4199<? super T> interfaceC4199) {
            return ((C17152) create(interfaceC4243, interfaceC4199)).invokeSuspend(C8107.f3222);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) throws Throwable {
            LifecycleController lifecycleController;
            Object objM17142 = C5508.m17142();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lifecycleController = (LifecycleController) this.L$0;
                try {
                    C7149.m22422(obj);
                    lifecycleController.finish();
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    lifecycleController.finish();
                    throw th;
                }
            }
            C7149.m22422(obj);
            InterfaceC5542 interfaceC5542 = (InterfaceC5542) ((InterfaceC4243) this.L$0).getCoroutineContext().get(InterfaceC5542.f13507);
            if (interfaceC5542 == null) {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
            PausingDispatcher pausingDispatcher = new PausingDispatcher();
            LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, interfaceC5542);
            try {
                InterfaceC5138<InterfaceC4243, InterfaceC4199<? super T>, Object> interfaceC5138 = this.$block;
                this.L$0 = lifecycleController2;
                this.label = 1;
                obj = C3615.m9756(pausingDispatcher, interfaceC5138, this);
                if (obj == objM17142) {
                    return objM17142;
                }
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC4372(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    @InterfaceC6489
    public static final <T> Object whenCreated(@InterfaceC6399 LifecycleOwner lifecycleOwner, @InterfaceC6399 InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        return whenCreated(lifecycleOwner.getLifecycle(), interfaceC5138, interfaceC4199);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC4372(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    @InterfaceC6489
    public static final <T> Object whenResumed(@InterfaceC6399 LifecycleOwner lifecycleOwner, @InterfaceC6399 InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        return whenResumed(lifecycleOwner.getLifecycle(), interfaceC5138, interfaceC4199);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC4372(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    @InterfaceC6489
    public static final <T> Object whenStarted(@InterfaceC6399 LifecycleOwner lifecycleOwner, @InterfaceC6399 InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        return whenStarted(lifecycleOwner.getLifecycle(), interfaceC5138, interfaceC4199);
    }

    @InterfaceC4372(message = "whenStateAtLeast has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStateAtLeast for non-suspending work that needs to run only once when the Lifecycle changes.")
    @InterfaceC6489
    public static final <T> Object whenStateAtLeast(@InterfaceC6399 Lifecycle lifecycle, @InterfaceC6399 Lifecycle.State state, @InterfaceC6399 InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        return C3615.m9756(C4423.m12872().mo16040(), new C17152(lifecycle, state, interfaceC5138, null), interfaceC4199);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC4372(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    @InterfaceC6489
    public static final <T> Object whenCreated(@InterfaceC6399 Lifecycle lifecycle, @InterfaceC6399 InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, interfaceC5138, interfaceC4199);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC4372(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    @InterfaceC6489
    public static final <T> Object whenResumed(@InterfaceC6399 Lifecycle lifecycle, @InterfaceC6399 InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, interfaceC5138, interfaceC4199);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC4372(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    @InterfaceC6489
    public static final <T> Object whenStarted(@InterfaceC6399 Lifecycle lifecycle, @InterfaceC6399 InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, interfaceC5138, interfaceC4199);
    }
}
