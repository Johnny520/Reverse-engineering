package android.view;

import Yue.C4750;
import Yue.C5499;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u0003H\u0016¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m2699d2 = {"Landroidx/lifecycle/AndroidViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getApplication", C4750.f10502, "()Landroid/app/Application;", "lifecycle-viewmodel_release"}, m2700k = 1, m2701mv = {1, 8, 0}, m2703xi = 48)
public class AndroidViewModel extends ViewModel {

    @InterfaceC6399
    private final Application application;

    public AndroidViewModel(@InterfaceC6399 Application application) {
        C5499.m17103(application, "application");
        this.application = application;
    }

    @InterfaceC6399
    public <T extends Application> T getApplication() {
        T t = (T) this.application;
        C5499.m17101(t, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t;
    }
}
