package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.C0283;
import androidx.core.view.AbstractC2267;
import androidx.core.view.InterfaceC2256;
import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.AbstractC2436;
import androidx.lifecycle.C2386;
import androidx.lifecycle.FragmentC2433;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.Lifecycle$State;
import com.alibaba.fastjson2.C2942;
import kotlin.InterfaceC5169;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p162.AbstractC7651;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011H\u0015¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0017*\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b!\u0010\u001fJ\u001f\u0010\"\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0004¢\u0006\u0004\b\"\u0010\u000bR.\u0010$\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0018\u0012\u0004\u0012\u00020\f0#8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010\u0005R\u001a\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b(\u0010)\u0012\u0004\b*\u0010\u0005R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Landroidx/core/app/ComponentActivity;", "Landroid/app/Activity;", "Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;", "Landroidx/core/view/飘花落叶言子楪哲兰世苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "", "args", "", "shouldSkipDump", "([Ljava/lang/String;)Z", "L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世兰苏哲;", "extraData", "Lkotlin/飘花落叶言子楪兰苏哲世;", "putExtraData", "(L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世兰苏哲;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "T", "Ljava/lang/Class;", "extraDataClass", "getExtraData", "(Ljava/lang/Class;)L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世兰苏哲;", "Landroid/view/KeyEvent;", "event", "superDispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "dispatchKeyShortcutEvent", "dispatchKeyEvent", "shouldDumpInternalState", "Landroidx/collection/飘花落叶言子苏世哲兰楪;", "extraDataMap", "Landroidx/collection/飘花落叶言子苏世哲兰楪;", "getExtraDataMap$annotations", "Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;", "lifecycleRegistry", "Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;", "getLifecycleRegistry$annotations", "Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;", "getLifecycle", "()Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;", "lifecycle", "core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ComponentActivity extends Activity implements InterfaceC2388, InterfaceC2256 {
    private final C0283 extraDataMap = new C0283(0);
    private final C2386 lifecycleRegistry = new C2386(this, true);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        if (r3.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
    
        if (r3.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L30;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean shouldSkipDump(java.lang.String[] r3) {
        /*
            r2 = this;
            r2 = 0
            if (r3 == 0) goto L57
            int r0 = r3.length
            if (r0 != 0) goto L7
            goto L57
        L7:
            r3 = r3[r2]
            int r0 = r3.hashCode()
            r1 = 1
            switch(r0) {
                case -645125871: goto L47;
                case 100470631: goto L36;
                case 472614934: goto L2d;
                case 1159329357: goto L1c;
                case 1455016274: goto L12;
                default: goto L11;
            }
        L11:
            goto L57
        L12:
            java.lang.String r0 = "--autofill"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L1b
            goto L57
        L1b:
            return r1
        L1c:
            java.lang.String r0 = "--contentcapture"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L25
            goto L57
        L25:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r3 < r0) goto L2c
            return r1
        L2c:
            return r2
        L2d:
            java.lang.String r0 = "--list-dumpables"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L3f
            goto L57
        L36:
            java.lang.String r0 = "--dump-dumpable"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L3f
            goto L57
        L3f:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r3 < r0) goto L46
            return r1
        L46:
            return r2
        L47:
            java.lang.String r0 = "--translation"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L50
            goto L57
        L50:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r3 < r0) goto L57
            return r1
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.ComponentActivity.shouldSkipDump(java.lang.String[]):boolean");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        event.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (AbstractC2267.m4227(decorView, event)) {
            return true;
        }
        return AbstractC2267.m4226(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        event.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (AbstractC2267.m4227(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @InterfaceC5169
    public <T extends AbstractC7651> T getExtraData(Class<T> extraDataClass) {
        extraDataClass.getClass();
        if (this.extraDataMap.get(extraDataClass) == null) {
            return null;
        }
        C2942.m6394();
        return null;
    }

    public AbstractC2402 getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int i = FragmentC2433.f7096;
        AbstractC2436.m4536(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        outState.getClass();
        this.lifecycleRegistry.m4505(Lifecycle$State.CREATED);
        super.onSaveInstanceState(outState);
    }

    @InterfaceC5169
    public void putExtraData(AbstractC7651 extraData) {
        throw null;
    }

    public final boolean shouldDumpInternalState(String[] args) {
        return !shouldSkipDump(args);
    }

    @Override // androidx.core.view.InterfaceC2256
    public boolean superDispatchKeyEvent(KeyEvent event) {
        event.getClass();
        return super.dispatchKeyEvent(event);
    }

    private static /* synthetic */ void getExtraDataMap$annotations() {
    }

    private static /* synthetic */ void getLifecycleRegistry$annotations() {
    }
}
