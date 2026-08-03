package android.view;

import Yue.AbstractC5673;
import Yue.C5499;
import Yue.C7060;
import Yue.C8107;
import Yue.EnumC0393;
import Yue.InterfaceC3809;
import Yue.InterfaceC4372;
import Yue.InterfaceC5124;
import Yue.InterfaceC5147;
import Yue.InterfaceC5572;
import Yue.InterfaceC5922;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aI\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001c\u0010\u0005\u001a\u0018\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a?\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0007¢\u0006\u0004\b\u0006\u0010\n\u001aQ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022$\u0010\u0005\u001a \u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0002¢\u0006\u0002\b\u00040\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\u0007\u001aE\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\n\u001a%\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"X", "Y", "Landroidx/lifecycle/LiveData;", "Lkotlin/Function1;", "LYue/ۥ۠ۦۡۧ;", "transform", "map", "(Landroidx/lifecycle/LiveData;LYue/ۥۣ۠ۡ۟;)Landroidx/lifecycle/LiveData;", "LYue/ۥۣۣ۠۠;", "mapFunction", "(Landroidx/lifecycle/LiveData;LYue/ۥۣۣ۠۠;)Landroidx/lifecycle/LiveData;", "switchMap", "switchMapFunction", "distinctUntilChanged", "(Landroidx/lifecycle/LiveData;)Landroidx/lifecycle/LiveData;", "lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0})
@InterfaceC5572(name = "Transformations")
public final class Transformations {

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* JADX INFO: renamed from: androidx.lifecycle.Transformations$distinctUntilChanged$1 */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"X", "kotlin.jvm.PlatformType", "value", "LYue/ۥۣۢ۠ۤ;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C17161<X> extends AbstractC5673 implements InterfaceC5124<X, C8107> {
        final /* synthetic */ C7060.C1153 $firstTime;
        final /* synthetic */ MediatorLiveData<X> $outputLiveData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17161(MediatorLiveData<X> mediatorLiveData, C7060.C1153 c1153) {
            super(1);
            this.$outputLiveData = mediatorLiveData;
            this.$firstTime = c1153;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(Object obj) {
            invoke2(obj);
            return C8107.f3222;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method Yue.ۥۣ۠ۡ۟.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(X x) {
            X value = this.$outputLiveData.getValue();
            if (this.$firstTime.f21346 || ((value == null && x != null) || !(value == null || C5499.m17094(value, x)))) {
                this.$firstTime.f21346 = false;
                this.$outputLiveData.setValue(x);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* JADX INFO: renamed from: androidx.lifecycle.Transformations$map$1 */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"X", "Y", "kotlin.jvm.PlatformType", "x", "LYue/ۥۣۢ۠ۤ;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C17171<X> extends AbstractC5673 implements InterfaceC5124<X, C8107> {
        final /* synthetic */ MediatorLiveData<Y> $result;
        final /* synthetic */ InterfaceC5124<X, Y> $transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17171(MediatorLiveData<Y> mediatorLiveData, InterfaceC5124<X, Y> interfaceC5124) {
            super(1);
            this.$result = mediatorLiveData;
            this.$transform = interfaceC5124;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(Object obj) {
            invoke2(obj);
            return C8107.f3222;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method Yue.ۥۣ۠ۡ۟.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(X x) {
            this.$result.setValue((Y) this.$transform.invoke(x));
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.Transformations$map$2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"X", "Y", "kotlin.jvm.PlatformType", "x", "LYue/ۥۣۢ۠ۤ;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C17182 extends AbstractC5673 implements InterfaceC5124<Object, C8107> {
        final /* synthetic */ InterfaceC5147<Object, Object> $mapFunction;
        final /* synthetic */ MediatorLiveData<Object> $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17182(MediatorLiveData<Object> mediatorLiveData, InterfaceC5147<Object, Object> interfaceC5147) {
            super(1);
            this.$result = mediatorLiveData;
            this.$mapFunction = interfaceC5147;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(Object obj) {
            invoke2(obj);
            return C8107.f3222;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method Yue.ۥۣ۠ۡ۟.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
            this.$result.setValue(this.$mapFunction.apply(obj));
        }
    }

    @InterfaceC6399
    @InterfaceC5572(name = "distinctUntilChanged")
    @InterfaceC5922
    @InterfaceC3809
    public static final <X> LiveData<X> distinctUntilChanged(@InterfaceC6399 LiveData<X> liveData) {
        C5499.m17103(liveData, "<this>");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        C7060.C1153 c1153 = new C7060.C1153();
        c1153.f21346 = true;
        if (liveData.isInitialized()) {
            mediatorLiveData.setValue(liveData.getValue());
            c1153.f21346 = false;
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new C17161(mediatorLiveData, c1153)));
        return mediatorLiveData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5572(name = "map")
    @InterfaceC5922
    @InterfaceC3809
    public static final <X, Y> LiveData<Y> map(@InterfaceC6399 LiveData<X> liveData, @InterfaceC6399 InterfaceC5124<X, Y> interfaceC5124) {
        C5499.m17103(liveData, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new C17171(mediatorLiveData, interfaceC5124)));
        return mediatorLiveData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5572(name = "switchMap")
    @InterfaceC5922
    @InterfaceC3809
    public static final <X, Y> LiveData<Y> switchMap(@InterfaceC6399 LiveData<X> liveData, @InterfaceC6399 final InterfaceC5124<X, LiveData<Y>> interfaceC5124) {
        C5499.m17103(liveData, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer<X>() { // from class: androidx.lifecycle.Transformations.switchMap.1

            @InterfaceC6489
            private LiveData<Y> liveData;

            @InterfaceC6489
            public final LiveData<Y> getLiveData() {
                return this.liveData;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: androidx.lifecycle.LiveData<Y> */
            /* JADX WARN: Multi-variable type inference failed */
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
            @Override // android.view.Observer
            public void onChanged(X value) {
                LiveData<Y> liveData2 = (LiveData) interfaceC5124.invoke(value);
                Object obj = this.liveData;
                if (obj == liveData2) {
                    return;
                }
                if (obj != null) {
                    MediatorLiveData<Y> mediatorLiveData2 = mediatorLiveData;
                    C5499.m17100(obj);
                    mediatorLiveData2.removeSource(obj);
                }
                this.liveData = liveData2;
                if (liveData2 != 0) {
                    MediatorLiveData<Y> mediatorLiveData3 = mediatorLiveData;
                    C5499.m17100(liveData2);
                    mediatorLiveData3.addSource(liveData2, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$switchMap$1$onChanged$1(mediatorLiveData)));
                }
            }

            public final void setLiveData(@InterfaceC6489 LiveData<Y> liveData2) {
                this.liveData = liveData2;
            }
        });
        return mediatorLiveData;
    }

    @InterfaceC4372(level = EnumC0393.f8972, message = "Use kotlin functions, instead of outdated arch core Functions")
    @InterfaceC5572(name = "map")
    @InterfaceC5922
    @InterfaceC3809
    public static final /* synthetic */ LiveData map(LiveData liveData, InterfaceC5147 interfaceC5147) {
        C5499.m17103(liveData, "<this>");
        C5499.m17103(interfaceC5147, "mapFunction");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new C17182(mediatorLiveData, interfaceC5147)));
        return mediatorLiveData;
    }

    @InterfaceC4372(level = EnumC0393.f8972, message = "Use kotlin functions, instead of outdated arch core Functions")
    @InterfaceC5572(name = "switchMap")
    @InterfaceC5922
    @InterfaceC3809
    public static final /* synthetic */ LiveData switchMap(LiveData liveData, final InterfaceC5147 interfaceC5147) {
        C5499.m17103(liveData, "<this>");
        C5499.m17103(interfaceC5147, "switchMapFunction");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer<Object>() { // from class: androidx.lifecycle.Transformations.switchMap.2

            @InterfaceC6489
            private LiveData<Object> liveData;

            @InterfaceC6489
            public final LiveData<Object> getLiveData() {
                return this.liveData;
            }

            @Override // android.view.Observer
            public void onChanged(Object value) {
                LiveData<Object> liveDataApply = interfaceC5147.apply(value);
                LiveData<Object> liveData2 = this.liveData;
                if (liveData2 == liveDataApply) {
                    return;
                }
                if (liveData2 != null) {
                    MediatorLiveData<Object> mediatorLiveData2 = mediatorLiveData;
                    C5499.m17100(liveData2);
                    mediatorLiveData2.removeSource(liveData2);
                }
                this.liveData = liveDataApply;
                if (liveDataApply != null) {
                    MediatorLiveData<Object> mediatorLiveData3 = mediatorLiveData;
                    C5499.m17100(liveDataApply);
                    mediatorLiveData3.addSource(liveDataApply, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$switchMap$2$onChanged$1(mediatorLiveData)));
                }
            }

            public final void setLiveData(@InterfaceC6489 LiveData<Object> liveData2) {
                this.liveData = liveData2;
            }
        });
        return mediatorLiveData;
    }
}
