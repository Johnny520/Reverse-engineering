package android.view;

import Yue.AbstractC5673;
import Yue.C4335;
import Yue.C5499;
import Yue.C5564;
import Yue.InterfaceC5122;
import Yue.InterfaceC5573;
import Yue.InterfaceC5585;
import Yue.InterfaceC5684;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import android.view.ViewModel;
import android.view.ViewModelProvider;
import android.view.viewmodel.CreationExtras;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/ViewModelLazy;", "Landroidx/lifecycle/ViewModel;", "VM", "LYue/ۥ۠ۦۨۨ;", "LYue/ۥ۠ۦۢۢ;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStore;", "storeProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(LYue/ۥ۠ۦۢۢ;LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;)V", "", "isInitialized", "()Z", "LYue/ۥ۠ۦۢۢ;", "LYue/ۥۣ۠۠ۨ;", "cached", "Landroidx/lifecycle/ViewModel;", "getValue", "()Landroidx/lifecycle/ViewModel;", "value", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
public final class ViewModelLazy<VM extends ViewModel> implements InterfaceC5684<VM> {

    @InterfaceC6489
    private VM cached;

    @InterfaceC6399
    private final InterfaceC5122<CreationExtras> extrasProducer;

    @InterfaceC6399
    private final InterfaceC5122<ViewModelProvider.Factory> factoryProducer;

    @InterfaceC6399
    private final InterfaceC5122<ViewModelStore> storeProducer;

    @InterfaceC6399
    private final InterfaceC5585<VM> viewModelClass;

    /* JADX INFO: renamed from: androidx.lifecycle.ViewModelLazy$1 */
    @InterfaceC6211(m2698d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m2699d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras$Empty;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m2700k = 3, m2701mv = {1, 8, 0}, m2703xi = 48)
    public static final class C17211 extends AbstractC5673 implements InterfaceC5122<CreationExtras.Empty> {
        public static final C17211 INSTANCE = new C17211();

        public C17211() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // Yue.InterfaceC5122
        @InterfaceC6399
        public final CreationExtras.Empty invoke() {
            return CreationExtras.Empty.INSTANCE;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5573
    public ViewModelLazy(@InterfaceC6399 InterfaceC5585<VM> interfaceC5585, @InterfaceC6399 InterfaceC5122<? extends ViewModelStore> interfaceC5122, @InterfaceC6399 InterfaceC5122<? extends ViewModelProvider.Factory> interfaceC51222) {
        this(interfaceC5585, interfaceC5122, interfaceC51222, null, 8, null);
        C5499.m17103(interfaceC5585, "viewModelClass");
        C5499.m17103(interfaceC5122, "storeProducer");
        C5499.m17103(interfaceC51222, "factoryProducer");
    }

    @Override // Yue.InterfaceC5684
    public boolean isInitialized() {
        return this.cached != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠۠ۨ<? extends androidx.lifecycle.ViewModelStore> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Yue.ۥۣ۠۠ۨ<? extends androidx.lifecycle.ViewModelProvider$Factory> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: Yue.ۥۣ۠۠ۨ<? extends androidx.lifecycle.viewmodel.CreationExtras> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5573
    public ViewModelLazy(@InterfaceC6399 InterfaceC5585<VM> interfaceC5585, @InterfaceC6399 InterfaceC5122<? extends ViewModelStore> interfaceC5122, @InterfaceC6399 InterfaceC5122<? extends ViewModelProvider.Factory> interfaceC51222, @InterfaceC6399 InterfaceC5122<? extends CreationExtras> interfaceC51223) {
        C5499.m17103(interfaceC5585, "viewModelClass");
        C5499.m17103(interfaceC5122, "storeProducer");
        C5499.m17103(interfaceC51222, "factoryProducer");
        C5499.m17103(interfaceC51223, "extrasProducer");
        this.viewModelClass = interfaceC5585;
        this.storeProducer = interfaceC5122;
        this.factoryProducer = interfaceC51222;
        this.extrasProducer = interfaceC51223;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getValue()Ljava/lang/Object; */
    @Override // Yue.InterfaceC5684
    @InterfaceC6399
    public VM getValue() {
        VM vm = this.cached;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) new ViewModelProvider(this.storeProducer.invoke(), this.factoryProducer.invoke(), this.extrasProducer.invoke()).get(C5564.m17346(this.viewModelClass));
        this.cached = vm2;
        return vm2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 Yue.ۥ۠ۦۢۢ)
  (r2v0 Yue.ۥۣ۠۠ۨ)
  (r3v0 Yue.ۥۣ۠۠ۨ)
  (wrap:Yue.ۥۣ۠۠ۨ:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:Yue.ۥۣ۠۠ۨ:0x0004: SGET  A[WRAPPED] (LINE:7) androidx.lifecycle.ViewModelLazy.1.INSTANCE androidx.lifecycle.ViewModelLazy$1) : (r4v0 Yue.ۥۣ۠۠ۨ))
 A[MD:(Yue.ۥ۠ۦۢۢ<VM extends androidx.lifecycle.ViewModel>, Yue.ۥۣ۠۠ۨ<? extends androidx.lifecycle.ViewModelStore>, Yue.ۥۣ۠۠ۨ<? extends androidx.lifecycle.ViewModelProvider$Factory>, Yue.ۥۣ۠۠ۨ<? extends androidx.lifecycle.viewmodel.CreationExtras>):void (m)] (LINE:8) call: androidx.lifecycle.ViewModelLazy.<init>(Yue.ۥ۠ۦۢۢ, Yue.ۥۣ۠۠ۨ, Yue.ۥۣ۠۠ۨ, Yue.ۥۣ۠۠ۨ):void type: THIS */
    public /* synthetic */ ViewModelLazy(InterfaceC5585 interfaceC5585, InterfaceC5122 interfaceC5122, InterfaceC5122 interfaceC51222, InterfaceC5122 interfaceC51223, int i, C4335 c4335) {
        this(interfaceC5585, interfaceC5122, interfaceC51222, (i & 8) != 0 ? C17211.INSTANCE : interfaceC51223);
    }
}
