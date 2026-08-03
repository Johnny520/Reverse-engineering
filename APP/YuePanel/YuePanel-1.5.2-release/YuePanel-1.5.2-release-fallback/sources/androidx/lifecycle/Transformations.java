package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aI\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001c\u0010\u0005\u001a\u0018\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a?\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0007¢\u0006\u0004\b\u0006\u0010\n\u001aQ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022$\u0010\u0005\u001a \u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0002¢\u0006\u0002\b\u00040\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\u0007\u001aE\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\n\u001a%\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"X", "Y", "Landroidx/lifecycle/LiveData;", "Lkotlin/Function1;", "LYue/ۥ۠ۦۡۧ;", "transform", "map", "(Landroidx/lifecycle/LiveData;LYue/ۥۣ۠ۡ۟;)Landroidx/lifecycle/LiveData;", "LYue/ۥۣۣ۠۠;", "mapFunction", "(Landroidx/lifecycle/LiveData;LYue/ۥۣۣ۠۠;)Landroidx/lifecycle/LiveData;", "switchMap", "switchMapFunction", "distinctUntilChanged", "(Landroidx/lifecycle/LiveData;)Landroidx/lifecycle/LiveData;", "lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0})
@Yue.InterfaceC3421(name = "Transformations")
public final class Transformations {

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* JADX INFO: renamed from: androidx.lifecycle.Transformations$distinctUntilChanged$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"X", "kotlin.jvm.PlatformType", "value", "LYue/ۥۣۢ۠ۤ;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1<X> extends Yue.AbstractC3560 implements Yue.InterfaceC2825<X, Yue.C6593> {
        final /* synthetic */ Yue.C5264.C5265 $firstTime;
        final /* synthetic */ androidx.lifecycle.MediatorLiveData<X> $outputLiveData;

        public AnonymousClass1(androidx.lifecycle.MediatorLiveData<X> r1, Yue.C5264.C5265 r2) {
                r0 = this;
                r0.$outputLiveData = r1
                r0.$firstTime = r2
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Object r1) {
                r0 = this;
                r0.invoke2(r1)
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
                return r1
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(X r3) {
                r2 = this;
                androidx.lifecycle.MediatorLiveData<X> r0 = r2.$outputLiveData
                java.lang.Object r0 = r0.getValue()
                Yue.ۥۡۦۢۥ$ۥ r1 = r2.$firstTime
                boolean r1 = r1.f19769
                if (r1 != 0) goto L18
                if (r0 != 0) goto L10
                if (r3 != 0) goto L18
            L10:
                if (r0 == 0) goto L22
                boolean r0 = Yue.C3329.m13897(r0, r3)
                if (r0 != 0) goto L22
            L18:
                Yue.ۥۡۦۢۥ$ۥ r0 = r2.$firstTime
                r1 = 0
                r0.f19769 = r1
                androidx.lifecycle.MediatorLiveData<X> r0 = r2.$outputLiveData
                r0.setValue(r3)
            L22:
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* JADX INFO: renamed from: androidx.lifecycle.Transformations$map$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"X", "Y", "kotlin.jvm.PlatformType", "x", "LYue/ۥۣۢ۠ۤ;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C78991<X> extends Yue.AbstractC3560 implements Yue.InterfaceC2825<X, Yue.C6593> {
        final /* synthetic */ androidx.lifecycle.MediatorLiveData<Y> $result;
        final /* synthetic */ Yue.InterfaceC2825<X, Y> $transform;

        public C78991(androidx.lifecycle.MediatorLiveData<Y> r1, Yue.InterfaceC2825<X, Y> r2) {
                r0 = this;
                r0.$result = r1
                r0.$transform = r2
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Object r1) {
                r0 = this;
                r0.invoke2(r1)
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
                return r1
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(X r3) {
                r2 = this;
                androidx.lifecycle.MediatorLiveData<Y> r0 = r2.$result
                Yue.ۥۣ۠ۡ۟<X, Y> r1 = r2.$transform
                java.lang.Object r3 = r1.invoke(r3)
                r0.setValue(r3)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.Transformations$map$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"X", "Y", "kotlin.jvm.PlatformType", "x", "LYue/ۥۣۢ۠ۤ;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Object, Yue.C6593> {
        final /* synthetic */ Yue.InterfaceC2848<java.lang.Object, java.lang.Object> $mapFunction;
        final /* synthetic */ androidx.lifecycle.MediatorLiveData<java.lang.Object> $result;

        public AnonymousClass2(androidx.lifecycle.MediatorLiveData<java.lang.Object> r1, Yue.InterfaceC2848<java.lang.Object, java.lang.Object> r2) {
                r0 = this;
                r0.$result = r1
                r0.$mapFunction = r2
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Object r1) {
                r0 = this;
                r0.invoke2(r1)
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
                return r1
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(java.lang.Object r3) {
                r2 = this;
                androidx.lifecycle.MediatorLiveData<java.lang.Object> r0 = r2.$result
                Yue.ۥۣۣ۠۠<java.lang.Object, java.lang.Object> r1 = r2.$mapFunction
                java.lang.Object r3 = r1.apply(r3)
                r0.setValue(r3)
                return
        }
    }



    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "distinctUntilChanged")
    @Yue.InterfaceC3875
    @Yue.InterfaceC1120
    public static final <X> androidx.lifecycle.LiveData<X> distinctUntilChanged(@Yue.InterfaceC4418 androidx.lifecycle.LiveData<X> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            androidx.lifecycle.MediatorLiveData r0 = new androidx.lifecycle.MediatorLiveData
            r0.<init>()
            Yue.ۥۡۦۢۥ$ۥ r1 = new Yue.ۥۡۦۢۥ$ۥ
            r1.<init>()
            r2 = 1
            r1.f19769 = r2
            boolean r2 = r3.isInitialized()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r3.getValue()
            r0.setValue(r2)
            r2 = 0
            r1.f19769 = r2
        L22:
            androidx.lifecycle.Transformations$distinctUntilChanged$1 r2 = new androidx.lifecycle.Transformations$distinctUntilChanged$1
            r2.<init>(r0, r1)
            androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0 r1 = new androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0
            r1.<init>(r2)
            r0.addSource(r3, r1)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "map")
    @Yue.InterfaceC3875
    @Yue.InterfaceC1120
    public static final <X, Y> androidx.lifecycle.LiveData<Y> map(@Yue.InterfaceC4418 androidx.lifecycle.LiveData<X> r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<X, Y> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "transform"
            Yue.C3329.m13906(r3, r0)
            androidx.lifecycle.MediatorLiveData r0 = new androidx.lifecycle.MediatorLiveData
            r0.<init>()
            androidx.lifecycle.Transformations$map$1 r1 = new androidx.lifecycle.Transformations$map$1
            r1.<init>(r0, r3)
            androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0 r3 = new androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0
            r3.<init>(r1)
            r0.addSource(r2, r3)
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5582, message = "Use kotlin functions, instead of outdated arch core Functions")
    @Yue.InterfaceC3421(name = "map")
    @Yue.InterfaceC3875
    @Yue.InterfaceC1120
    public static final /* synthetic */ androidx.lifecycle.LiveData map(androidx.lifecycle.LiveData r2, Yue.InterfaceC2848 r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "mapFunction"
            Yue.C3329.m13906(r3, r0)
            androidx.lifecycle.MediatorLiveData r0 = new androidx.lifecycle.MediatorLiveData
            r0.<init>()
            androidx.lifecycle.Transformations$map$2 r1 = new androidx.lifecycle.Transformations$map$2
            r1.<init>(r0, r3)
            androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0 r3 = new androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0
            r3.<init>(r1)
            r0.addSource(r2, r3)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "switchMap")
    @Yue.InterfaceC3875
    @Yue.InterfaceC1120
    public static final <X, Y> androidx.lifecycle.LiveData<Y> switchMap(@Yue.InterfaceC4418 androidx.lifecycle.LiveData<X> r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<X, androidx.lifecycle.LiveData<Y>> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "transform"
            Yue.C3329.m13906(r3, r0)
            androidx.lifecycle.MediatorLiveData r0 = new androidx.lifecycle.MediatorLiveData
            r0.<init>()
            androidx.lifecycle.Transformations$switchMap$1 r1 = new androidx.lifecycle.Transformations$switchMap$1
            r1.<init>(r3, r0)
            r0.addSource(r2, r1)
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5582, message = "Use kotlin functions, instead of outdated arch core Functions")
    @Yue.InterfaceC3421(name = "switchMap")
    @Yue.InterfaceC3875
    @Yue.InterfaceC1120
    public static final /* synthetic */ androidx.lifecycle.LiveData switchMap(androidx.lifecycle.LiveData r2, Yue.InterfaceC2848 r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "switchMapFunction"
            Yue.C3329.m13906(r3, r0)
            androidx.lifecycle.MediatorLiveData r0 = new androidx.lifecycle.MediatorLiveData
            r0.<init>()
            androidx.lifecycle.Transformations$switchMap$2 r1 = new androidx.lifecycle.Transformations$switchMap$2
            r1.<init>(r3, r0)
            r0.addSource(r2, r1)
            return r0
    }
}
