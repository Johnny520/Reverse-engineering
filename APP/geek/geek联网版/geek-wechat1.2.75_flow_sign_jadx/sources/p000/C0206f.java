package p000;

import android.app.Dialog;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0206f implements InterfaceC0786um {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1703a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1704b;

    public /* synthetic */ C0206f(int i, Object obj) {
        this.f1703a = i;
        this.f1704b = obj;
    }

    @Override // p000.InterfaceC0786um
    /* JADX INFO: renamed from: f */
    public final Object mo26f(Object obj) {
        switch (this.f1703a) {
            case Base64.DEFAULT /* 0 */:
                return obj == ((AbstractC0430l) this.f1704b) ? "(this Collection)" : String.valueOf(obj);
            case Base64.NO_PADDING /* 1 */:
                AbstractC0551o9.f3421b.post(new RunnableC0732t5((e30) this.f1704b, 2, (String) obj));
                break;
            case Base64.NO_WRAP /* 2 */:
                TextView textView = (TextView) this.f1704b;
                String str = (String) obj;
                AbstractC0493mp.m1857g(b50.m492a("hOF7nHnENFg=\n", "6oQMyhioQT0=\n"), str);
                textView.setText(str);
                break;
            default:
                Dialog dialog = (Dialog) this.f1704b;
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
                    g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", b50.m492a("n0SPeCfEiwiTY5d5PPqeHA==\n", "zCH7DE6q7Hs=\n"), "tw==\n", "0vI8ySRxU5w=\n");
                }
                return C0893xh.f5258n;
        }
        return C0893xh.f5258n;
    }
}
