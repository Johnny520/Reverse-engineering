package p000;

import android.app.Dialog;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0206f implements InterfaceC0713sm {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1866a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1867b;

    public /* synthetic */ C0206f(int i, Object obj) {
        this.f1866a = i;
        this.f1867b = obj;
    }

    @Override // p000.InterfaceC0713sm
    /* JADX INFO: renamed from: f */
    public final Object mo96f(Object obj) {
        switch (this.f1866a) {
            case Base64.DEFAULT /* 0 */:
                return obj == ((AbstractC0430l) this.f1867b) ? "(this Collection)" : String.valueOf(obj);
            case Base64.NO_PADDING /* 1 */:
                AbstractC0143d9.f1406b.post(new RunnableC0733t5((C0551o9) this.f1867b, 1, (String) obj));
                break;
            case Base64.NO_WRAP /* 2 */:
                TextView textView = (TextView) this.f1867b;
                String str = (String) obj;
                AbstractC0346ip.m1503o("newValue", str);
                textView.setText(str);
                break;
            default:
                Dialog dialog = (Dialog) this.f1867b;
                int iIntValue = ((Integer) obj).intValue();
                try {
                    Window window = dialog.getWindow();
                    if (window != null) {
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        int i = (int) ((iIntValue / 100.0f) * 150);
                        if (i < 1) {
                            i = 1;
                        }
                        attributes.setBlurBehindRadius(i);
                        if (iIntValue == 0) {
                            window.clearFlags(4);
                        } else {
                            window.addFlags(4);
                        }
                        window.setAttributes(attributes);
                    }
                    break;
                } catch (Throwable unused) {
                    z30.m2770o("Nwje\n", "Q2m5jaPP2Zc=\n", "Settings_BlurPrg", "Fg==\n", "c8HJlSTQVfc=\n");
                }
                return C0819vh.f4855n;
        }
        return C0819vh.f4855n;
    }
}
