package android.view;

import Yue.C4335;
import Yue.C4750;
import Yue.C5499;
import Yue.C6659;
import Yue.InterfaceC5568;
import Yue.InterfaceC5573;
import Yue.InterfaceC5578;
import Yue.InterfaceC5922;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7144;
import Yue.InterfaceC7507;
import android.app.Application;
import android.view.viewmodel.CreationExtras;
import android.view.viewmodel.InitializerViewModelFactory;
import android.view.viewmodel.MutableCreationExtras;
import android.view.viewmodel.ViewModelInitializer;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6211(m2698d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0016\u0017\u0018\u0019B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B!\b\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ&\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011H\u0097\u0002¢\u0006\u0002\u0010\u0012J.\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011H\u0097\u0002¢\u0006\u0002\u0010\u0015R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m2699d2 = {"Landroidx/lifecycle/ViewModelProvider;", "", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "(Landroidx/lifecycle/ViewModelStoreOwner;)V", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V", "store", "Landroidx/lifecycle/ViewModelStore;", "defaultCreationExtras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Landroidx/lifecycle/ViewModelStore;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)V", "get", C4750.f10502, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", C6659.f17103, "", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "AndroidViewModelFactory", "Factory", "NewInstanceFactory", "OnRequeryFactory", "lifecycle-viewmodel_release"}, m2700k = 1, m2701mv = {1, 8, 0}, m2703xi = 48)
@InterfaceC7507({"SMAP\nViewModelProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProvider.kt\nandroidx/lifecycle/ViewModelProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,375:1\n1#2:376\n*E\n"})
public class ViewModelProvider {

    @InterfaceC6399
    private final CreationExtras defaultCreationExtras;

    @InterfaceC6399
    private final Factory factory;

    @InterfaceC6399
    private final ViewModelStore store;

    @InterfaceC6211(m2698d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0016¢\u0006\u0002\u0010\b¨\u0006\n"}, m2699d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "create", C4750.f10502, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Companion", "lifecycle-viewmodel_release"}, m2700k = 1, m2701mv = {1, 8, 0}, m2703xi = 48)
    public static class NewInstanceFactory implements Factory {

        @InterfaceC6399
        public static final Companion Companion = new Companion(null);

        @InterfaceC6399
        @InterfaceC5568
        public static final CreationExtras.Key<String> VIEW_MODEL_KEY = Companion.ViewModelKeyImpl.INSTANCE;

        @InterfaceC6489
        private static NewInstanceFactory sInstance;

        @InterfaceC6211(m2698d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u00078GX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, m2699d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory$Companion;", "", "()V", "VIEW_MODEL_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "instance", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "getInstance$annotations", "getInstance", "()Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "sInstance", "ViewModelKeyImpl", "lifecycle-viewmodel_release"}, m2700k = 1, m2701mv = {1, 8, 0}, m2703xi = 48)
        public static final class Companion {

            @InterfaceC6211(m2698d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m2699d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory$Companion$ViewModelKeyImpl;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "()V", "lifecycle-viewmodel_release"}, m2700k = 1, m2701mv = {1, 8, 0}, m2703xi = 48)
            public static final class ViewModelKeyImpl implements CreationExtras.Key<String> {

                @InterfaceC6399
                public static final ViewModelKeyImpl INSTANCE = new ViewModelKeyImpl();

                private ViewModelKeyImpl() {
                }
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(C4335 c4335) {
                this();
            }

            @InterfaceC5578
            public static /* synthetic */ void getInstance$annotations() {
            }

            @InterfaceC6399
            @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
            public final NewInstanceFactory getInstance() {
                if (NewInstanceFactory.sInstance == null) {
                    NewInstanceFactory.sInstance = new NewInstanceFactory();
                }
                NewInstanceFactory newInstanceFactory = NewInstanceFactory.sInstance;
                C5499.m17100(newInstanceFactory);
                return newInstanceFactory;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            private Companion() {
            }
        }

        @InterfaceC6399
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
        public static final NewInstanceFactory getInstance() {
            return Companion.getInstance();
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @InterfaceC6399
        public <T extends ViewModel> T create(@InterfaceC6399 Class<T> cls) throws InvocationTargetException {
            C5499.m17103(cls, "modelClass");
            try {
                T tNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                C5499.m17102(tNewInstance, "{\n                modelC…wInstance()\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            }
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Landroidx/lifecycle/ViewModel;", "viewModel", "LYue/ۥۣۢ۠ۤ;", "onRequery", "(Landroidx/lifecycle/ViewModel;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
    public static class OnRequeryFactory {
        public void onRequery(@InterfaceC6399 ViewModel viewModel) {
            C5499.m17103(viewModel, "viewModel");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5573
    public ViewModelProvider(@InterfaceC6399 ViewModelStore viewModelStore, @InterfaceC6399 Factory factory) {
        this(viewModelStore, factory, null, 4, null);
        C5499.m17103(viewModelStore, "store");
        C5499.m17103(factory, "factory");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5922
    public <T extends ViewModel> T get(@InterfaceC6399 Class<T> cls) {
        C5499.m17103(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) get("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    @InterfaceC6211(m2698d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ%\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u000eJ-\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0010J-\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0002\u0010\u0013R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m2699d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "()V", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "unused", "", "(Landroid/app/Application;I)V", "create", C4750.f10502, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app", "(Ljava/lang/Class;Landroid/app/Application;)Landroidx/lifecycle/ViewModel;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Companion", "lifecycle-viewmodel_release"}, m2700k = 1, m2701mv = {1, 8, 0}, m2703xi = 48)
    public static class AndroidViewModelFactory extends NewInstanceFactory {

        @InterfaceC6399
        public static final String DEFAULT_KEY = "androidx.lifecycle.ViewModelProvider.DefaultKey";

        @InterfaceC6489
        private static AndroidViewModelFactory sInstance;

        @InterfaceC6489
        private final Application application;

        @InterfaceC6399
        public static final Companion Companion = new Companion(null);

        @InterfaceC6399
        @InterfaceC5568
        public static final CreationExtras.Key<Application> APPLICATION_KEY = Companion.ApplicationKeyImpl.INSTANCE;

        @InterfaceC6211(m2698d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0005H\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m2699d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory$Companion;", "", "()V", "APPLICATION_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroid/app/Application;", "DEFAULT_KEY", "", "sInstance", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "defaultFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "defaultFactory$lifecycle_viewmodel_release", "getInstance", "application", "ApplicationKeyImpl", "lifecycle-viewmodel_release"}, m2700k = 1, m2701mv = {1, 8, 0}, m2703xi = 48)
        public static final class Companion {

            @InterfaceC6211(m2698d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m2699d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory$Companion$ApplicationKeyImpl;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroid/app/Application;", "()V", "lifecycle-viewmodel_release"}, m2700k = 1, m2701mv = {1, 8, 0}, m2703xi = 48)
            public static final class ApplicationKeyImpl implements CreationExtras.Key<Application> {

                @InterfaceC6399
                public static final ApplicationKeyImpl INSTANCE = new ApplicationKeyImpl();

                private ApplicationKeyImpl() {
                }
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(C4335 c4335) {
                this();
            }

            @InterfaceC6399
            public final Factory defaultFactory$lifecycle_viewmodel_release(@InterfaceC6399 ViewModelStoreOwner viewModelStoreOwner) {
                C5499.m17103(viewModelStoreOwner, "owner");
                return viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelProviderFactory() : NewInstanceFactory.Companion.getInstance();
            }

            @InterfaceC6399
            @InterfaceC5578
            public final AndroidViewModelFactory getInstance(@InterfaceC6399 Application application) {
                C5499.m17103(application, "application");
                if (AndroidViewModelFactory.sInstance == null) {
                    AndroidViewModelFactory.sInstance = new AndroidViewModelFactory(application);
                }
                AndroidViewModelFactory androidViewModelFactory = AndroidViewModelFactory.sInstance;
                C5499.m17100(androidViewModelFactory);
                return androidViewModelFactory;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            private Companion() {
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private AndroidViewModelFactory(Application application, int i) {
            this.application = application;
        }

        @InterfaceC6399
        @InterfaceC5578
        public static final AndroidViewModelFactory getInstance(@InterfaceC6399 Application application) {
            return Companion.getInstance(application);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @InterfaceC6399
        public <T extends ViewModel> T create(@InterfaceC6399 Class<T> cls, @InterfaceC6399 CreationExtras creationExtras) {
            C5499.m17103(cls, "modelClass");
            C5499.m17103(creationExtras, "extras");
            if (this.application != null) {
                return (T) create(cls);
            }
            Application application = (Application) creationExtras.get(APPLICATION_KEY);
            if (application != null) {
                return (T) create(cls, application);
            }
            if (AndroidViewModel.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.create(cls);
        }

        public AndroidViewModelFactory() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AndroidViewModelFactory(@InterfaceC6399 Application application) {
            this(application, 0);
            C5499.m17103(application, "application");
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        @InterfaceC6399
        public <T extends ViewModel> T create(@InterfaceC6399 Class<T> cls) {
            C5499.m17103(cls, "modelClass");
            Application application = this.application;
            if (application != null) {
                return (T) create(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        private final <T extends ViewModel> T create(Class<T> cls, Application application) {
            if (AndroidViewModel.class.isAssignableFrom(cls)) {
                try {
                    T tNewInstance = cls.getConstructor(Application.class).newInstance(application);
                    C5499.m17102(tNewInstance, "{\n                try {\n…          }\n            }");
                    return tNewInstance;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e4);
                }
            }
            return (T) super.create(cls);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC5573
    public ViewModelProvider(@InterfaceC6399 ViewModelStore viewModelStore, @InterfaceC6399 Factory factory, @InterfaceC6399 CreationExtras creationExtras) {
        C5499.m17103(viewModelStore, "store");
        C5499.m17103(factory, "factory");
        C5499.m17103(creationExtras, "defaultCreationExtras");
        this.store = viewModelStore;
        this.factory = factory;
        this.defaultCreationExtras = creationExtras;
    }

    @InterfaceC6211(m2698d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ%\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007J-\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m2699d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "", "create", C4750.f10502, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Companion", "lifecycle-viewmodel_release"}, m2700k = 1, m2701mv = {1, 8, 0}, m2703xi = 48)
    public interface Factory {

        @InterfaceC6399
        public static final Companion Companion = Companion.$$INSTANCE;

        @InterfaceC6211(m2698d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006\"\u0006\u0012\u0002\b\u00030\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m2699d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory$Companion;", "", "()V", "from", "Landroidx/lifecycle/ViewModelProvider$Factory;", "initializers", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "([Landroidx/lifecycle/viewmodel/ViewModelInitializer;)Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel_release"}, m2700k = 1, m2701mv = {1, 8, 0}, m2703xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            @InterfaceC6399
            @InterfaceC5578
            public final Factory from(@InterfaceC6399 ViewModelInitializer<?>... viewModelInitializerArr) {
                C5499.m17103(viewModelInitializerArr, "initializers");
                return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
            }
        }

        @InterfaceC6399
        @InterfaceC5578
        static Factory from(@InterfaceC6399 ViewModelInitializer<?>... viewModelInitializerArr) {
            return Companion.from(viewModelInitializerArr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        default <T extends ViewModel> T create(@InterfaceC6399 Class<T> cls) {
            C5499.m17103(cls, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        @InterfaceC6399
        default <T extends ViewModel> T create(@InterfaceC6399 Class<T> cls, @InterfaceC6399 CreationExtras creationExtras) {
            C5499.m17103(cls, "modelClass");
            C5499.m17103(creationExtras, "extras");
            return (T) create(cls);
        }
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
    @InterfaceC6399
    @InterfaceC5922
    public <T extends ViewModel> T get(@InterfaceC6399 String str, @InterfaceC6399 Class<T> cls) {
        T t;
        C5499.m17103(str, C6659.f17103);
        C5499.m17103(cls, "modelClass");
        T t2 = (T) this.store.get(str);
        if (cls.isInstance(t2)) {
            Object obj = this.factory;
            OnRequeryFactory onRequeryFactory = obj instanceof OnRequeryFactory ? (OnRequeryFactory) obj : null;
            if (onRequeryFactory != null) {
                C5499.m17100(t2);
                onRequeryFactory.onRequery(t2);
            }
            C5499.m17101(t2, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return t2;
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(this.defaultCreationExtras);
        mutableCreationExtras.set(NewInstanceFactory.VIEW_MODEL_KEY, str);
        try {
            t = (T) this.factory.create(cls, mutableCreationExtras);
        } catch (AbstractMethodError unused) {
            t = (T) this.factory.create(cls);
        }
        this.store.put(str, t);
        return t;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 androidx.lifecycle.ViewModelStore)
  (r2v0 androidx.lifecycle.ViewModelProvider$Factory)
  (wrap:androidx.lifecycle.viewmodel.CreationExtras:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:androidx.lifecycle.viewmodel.CreationExtras:0x0004: SGET  A[WRAPPED] (LINE:6) androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE androidx.lifecycle.viewmodel.CreationExtras$Empty) : (r3v0 androidx.lifecycle.viewmodel.CreationExtras))
 A[MD:(androidx.lifecycle.ViewModelStore, androidx.lifecycle.ViewModelProvider$Factory, androidx.lifecycle.viewmodel.CreationExtras):void (m)] (LINE:7) call: androidx.lifecycle.ViewModelProvider.<init>(androidx.lifecycle.ViewModelStore, androidx.lifecycle.ViewModelProvider$Factory, androidx.lifecycle.viewmodel.CreationExtras):void type: THIS */
    public /* synthetic */ ViewModelProvider(ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras, int i, C4335 c4335) {
        this(viewModelStore, factory, (i & 4) != 0 ? CreationExtras.Empty.INSTANCE : creationExtras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(@InterfaceC6399 ViewModelStoreOwner viewModelStoreOwner) {
        this(viewModelStoreOwner.getViewModelStore(), AndroidViewModelFactory.Companion.defaultFactory$lifecycle_viewmodel_release(viewModelStoreOwner), ViewModelProviderGetKt.defaultCreationExtras(viewModelStoreOwner));
        C5499.m17103(viewModelStoreOwner, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(@InterfaceC6399 ViewModelStoreOwner viewModelStoreOwner, @InterfaceC6399 Factory factory) {
        this(viewModelStoreOwner.getViewModelStore(), factory, ViewModelProviderGetKt.defaultCreationExtras(viewModelStoreOwner));
        C5499.m17103(viewModelStoreOwner, "owner");
        C5499.m17103(factory, "factory");
    }
}
