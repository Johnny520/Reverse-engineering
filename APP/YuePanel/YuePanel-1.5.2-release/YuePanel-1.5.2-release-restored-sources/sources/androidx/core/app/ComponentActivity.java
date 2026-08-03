package androidx.core.app;

import Yue.C4750;
import Yue.C5499;
import Yue.C5637;
import Yue.C6411;
import Yue.C7467;
import Yue.InterfaceC3647;
import Yue.InterfaceC4372;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7144;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.LifecycleRegistry;
import android.view.ReportFragment;
import android.view.View;
import androidx.fragment.app.C8882;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001&B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0015¢\u0006\u0004\b\u0010\u0010\u000eJ)\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0011*\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u001f\u0010 \u001a\u00020\u00182\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0004¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00182\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\"\u0010!R.\u0010$\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0012\u0012\u0004\u0012\u00020\u00060#8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010\u0005R\u001a\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b(\u0010)\u0012\u0004\b*\u0010\u0005R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Landroidx/core/app/ComponentActivity;", "Landroid/app/Activity;", "Landroidx/lifecycle/LifecycleOwner;", "LYue/ۥ۠ۦۥۤ$ۥ;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Landroidx/core/app/ComponentActivity$ۥ;", "extraData", "LYue/ۥۣۢ۠ۤ;", "putExtraData", "(Landroidx/core/app/ComponentActivity$ۥ;)V", "Landroid/os/Bundle;", C8882.f29747, "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", C4750.f10502, "Ljava/lang/Class;", "extraDataClass", "getExtraData", "(Ljava/lang/Class;)Landroidx/core/app/ComponentActivity$ۥ;", "Landroid/view/KeyEvent;", C6411.f16276, "", "superDispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "dispatchKeyShortcutEvent", "dispatchKeyEvent", "", "", "args", "shouldDumpInternalState", "([Ljava/lang/String;)Z", "ۥ۟۟", "LYue/ۥۢ۟ۡ;", "extraDataMap", "LYue/ۥۢ۟ۡ;", "ۥ", "Landroidx/lifecycle/LifecycleRegistry;", "lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "ۥ۟", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "core_release"}, k = 1, mv = {1, 8, 0})
public class ComponentActivity extends Activity implements LifecycleOwner, C5637.InterfaceC0820 {

    @InterfaceC6399
    private final C7467<Class<? extends C1656>, C1656> extraDataMap = new C7467<>();

    @InterfaceC6399
    private final LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);

    /* JADX INFO: renamed from: androidx.core.app.ComponentActivity$ۥ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC4372(message = "Store the object you want to save directly by using\n      {@link View#setTag(int, Object)} with the window's decor view.")
    public static class C1656 {
    }

    /* JADX INFO: renamed from: ۥ */
    public static /* synthetic */ void m4744() {
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ void m4745() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(@InterfaceC6399 KeyEvent event) {
        C5499.m17103(event, C6411.f16276);
        View decorView = getWindow().getDecorView();
        C5499.m17102(decorView, "window.decorView");
        if (C5637.m17497(decorView, event)) {
            return true;
        }
        return C5637.m17498(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(@InterfaceC6399 KeyEvent event) {
        C5499.m17103(event, C6411.f16276);
        View decorView = getWindow().getDecorView();
        C5499.m17102(decorView, "window.decorView");
        if (C5637.m17497(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC4372(message = "Use {@link View#getTag(int)} with the window's decor view.")
    @InterfaceC6489
    public <T extends C1656> T getExtraData(@InterfaceC6399 Class<T> extraDataClass) {
        C5499.m17103(extraDataClass, "extraDataClass");
        return (T) this.extraDataMap.get(extraDataClass);
    }

    @InterfaceC6399
    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(@InterfaceC6489 Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ReportFragment.INSTANCE.injectIfNeededIn(this);
    }

    @Override // android.app.Activity
    @InterfaceC3647
    public void onSaveInstanceState(@InterfaceC6399 Bundle outState) {
        C5499.m17103(outState, "outState");
        this.lifecycleRegistry.setCurrentState(Lifecycle.State.CREATED);
        super.onSaveInstanceState(outState);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC4372(message = "Use {@link View#setTag(int, Object)} with the window's decor view.")
    public void putExtraData(@InterfaceC6399 C1656 extraData) {
        C5499.m17103(extraData, "extraData");
        this.extraDataMap.put((Class<? extends C1656>) extraData.getClass(), extraData);
    }

    public final boolean shouldDumpInternalState(@InterfaceC6489 String[] args) {
        return !m29526(args);
    }

    @Override // Yue.C5637.InterfaceC0820
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public boolean superDispatchKeyEvent(@InterfaceC6399 KeyEvent event) {
        C5499.m17103(event, C6411.f16276);
        return super.dispatchKeyEvent(event);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m29526(String[] args) {
        if (args == null || args.length == 0) {
            return false;
        }
        String str = args[0];
        switch (str.hashCode()) {
            case -645125871:
                return str.equals("--translation") && Build.VERSION.SDK_INT >= 31;
            case 100470631:
                if (!str.equals("--dump-dumpable")) {
                    return false;
                }
                break;
            case 472614934:
                if (!str.equals("--list-dumpables")) {
                    return false;
                }
                break;
            case 1159329357:
                return str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29;
            case 1455016274:
                return str.equals("--autofill");
            default:
                return false;
        }
        return Build.VERSION.SDK_INT >= 33;
    }
}
