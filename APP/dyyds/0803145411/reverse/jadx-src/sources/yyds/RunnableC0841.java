package yyds;

import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛴᛴᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0841 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f3869;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C2457 f3870;

    public /* synthetic */ RunnableC0841(C2457 c2457, int i) {
        this.f3869 = i;
        this.f3870 = c2457;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3869;
        int i2 = 0;
        C2457 c2457 = this.f3870;
        switch (i) {
            case 0:
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c2457.f12135;
                if (dialogXBaseRelativeLayout != null) {
                    dialogXBaseRelativeLayout.setVisibility(8);
                }
                AbstractC0041.m260(c2457.f12138.m279());
                return;
            case 1:
                C0763 c0763 = c2457.f12138;
                C2207 c2207 = c0763.f3534;
                if (c2207 == null) {
                    c2207 = new C2207(i2, c2457);
                    c0763.f3534 = c2207;
                }
                c2207.m4196(c0763);
                c0763.f398.getClass();
                ArrayList arrayList = c2457.f12142;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        if (((View) it.next()) != null) {
                            C0188.m794();
                            return;
                        } else {
                            c0763.getClass();
                            throw null;
                        }
                    }
                    return;
                }
                return;
            default:
                C0763 c07632 = c2457.f12138;
                C0763 c07633 = c07632.f3523;
                C2457 c24572 = c07632.f3516;
                C0882 c0882 = new C0882();
                c0882.f4035 = false;
                c0882.m1972(c07633, c24572);
                c2457.f12131 = c0882;
                return;
        }
    }
}
