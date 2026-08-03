package p011ab;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.ref.WeakReference;
import okhttp3.HttpUrl;
import p099h.Hchat.utils.KavaReflector;
import p300ub.AbstractC4302b;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: ab.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0044d extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f146a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0046f f147b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0044d(C0046f c0046f, int i9) {
        this.f146a = i9;
        this.f147b = c0046f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f146a) {
            case 0:
                methodHookParam.getClass();
                Object obj = methodHookParam.thisObject;
                if (obj instanceof View) {
                    this.f147b.f156e = new WeakReference(obj);
                }
                break;
            case 1:
                methodHookParam.getClass();
                if (this.f147b.f156e.get() == methodHookParam.thisObject) {
                    this.f147b.f156e = new WeakReference(null);
                }
                break;
            case 2:
                C0046f c0046f = this.f147b;
                methodHookParam.getClass();
                Object obj2 = methodHookParam.thisObject;
                TextView textView = obj2 instanceof TextView ? (TextView) obj2 : null;
                if (textView != null) {
                    Object objM316c = C0046f.m316c(textView);
                    if (objM316c == null) {
                        objM316c = c0046f.f156e.get();
                        if (objM316c == null || !(objM316c instanceof View) || !((View) objM316c).isAttachedToWindow() || !C0046f.m317g(objM316c)) {
                            objM316c = null;
                        }
                        if (objM316c == null || !(objM316c instanceof View) || ((View) objM316c).getRootView() != textView.getRootView()) {
                            objM316c = null;
                        }
                    }
                    if (objM316c != null) {
                        Object result = methodHookParam.getResult();
                        InputConnection inputConnection = result instanceof InputConnection ? (InputConnection) result : null;
                        if (inputConnection != null) {
                            methodHookParam.setResult(new C0047g(inputConnection, new C0045e(c0046f, textView, new WeakReference(objM316c), 0)));
                        }
                    }
                }
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c A[PHI: r1
  0x008c: PHI (r1v18 java.lang.Object) = (r1v17 java.lang.Object), (r1v22 java.lang.Object) binds: [B:36:0x006a, B:48:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object objM321b;
        String string;
        CharSequence text;
        switch (this.f146a) {
            case 3:
                methodHookParam.getClass();
                C0046f c0046f = this.f147b;
                boolean zM320a = false;
                if (AbstractC4302b.m8640c(c0046f.f152a.f12143a, "Hchat_quote_delete_clear_config").getBoolean("quote_delete_clear_enable", false)) {
                    Object[] objArr = methodHookParam.args;
                    Object objM8366C0 = objArr != null ? AbstractC4165l.m8366C0(2, objArr) : null;
                    KeyEvent keyEvent = objM8366C0 instanceof KeyEvent ? (KeyEvent) objM8366C0 : null;
                    if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
                        Object[] objArr2 = methodHookParam.args;
                        Object objM8366C02 = objArr2 != null ? AbstractC4165l.m8366C0(0, objArr2) : null;
                        View view = objM8366C02 instanceof View ? (View) objM8366C02 : null;
                        if (view == null || (objM321b = C0046f.m316c(view)) == null) {
                            objM321b = c0046f.m321b(0, methodHookParam.thisObject);
                        }
                        if (objM321b == null) {
                            objM321b = c0046f.f156e.get();
                            if (objM321b == null || !(objM321b instanceof View) || !((View) objM321b).isAttachedToWindow() || !C0046f.m317g(objM321b)) {
                                objM321b = null;
                            }
                            if (objM321b != null) {
                                Object[] objArr3 = methodHookParam.args;
                                Object objM8366C03 = objArr3 != null ? AbstractC4165l.m8366C0(0, objArr3) : null;
                                TextView textView = objM8366C03 instanceof TextView ? (TextView) objM8366C03 : null;
                                if (textView == null || (text = textView.getText()) == null || (string = text.toString()) == null) {
                                    Object objInvokeMethod = KavaReflector.invokeMethod(objM321b, "getLastText", new Object[0]);
                                    CharSequence charSequence = objInvokeMethod instanceof CharSequence ? (CharSequence) objInvokeMethod : null;
                                    String string2 = charSequence != null ? charSequence.toString() : null;
                                    string = string2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string2;
                                }
                                if (string.length() <= 0) {
                                    zM320a = c0046f.m320a(objM321b);
                                }
                            }
                        }
                    }
                }
                if (zM320a) {
                    methodHookParam.setResult(Boolean.TRUE);
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }
}
