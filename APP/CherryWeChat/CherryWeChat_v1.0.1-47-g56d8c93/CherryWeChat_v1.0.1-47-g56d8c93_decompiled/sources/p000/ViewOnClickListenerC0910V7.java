package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.ArrayList;

/* JADX INFO: renamed from: V7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0910V7 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2832a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2833b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2834c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f2835d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f2836e;

    public /* synthetic */ ViewOnClickListenerC0910V7(int i, C0398JA c0398ja, C0441KA c0441ka, C0784SA c0784sa) {
        this.f2834c = c0398ja;
        this.f2835d = c0441ka;
        this.f2836e = c0784sa;
        this.f2833b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2832a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f2834c;
                ViewOnClickListenerC0996X7 viewOnClickListenerC0996X7 = (ViewOnClickListenerC0996X7) this.f2835d;
                C0382Iv c0382Iv = (C0382Iv) this.f2836e;
                Context context = frameLayout.getContext();
                StringBuilder sb = new StringBuilder();
                sb.append(AbstractC0295Gu.m625r(-501158258931765L));
                ArrayList arrayList = viewOnClickListenerC0996X7.f3181c;
                int i = this.f2833b;
                sb.append((String) arrayList.get(i));
                Toast.makeText(context, sb.toString(), 0).show();
                AlertDialog alertDialog = (AlertDialog) c0382Iv.f1315a;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                String currentWxId = viewOnClickListenerC0996X7.getCurrentWxId();
                if (currentWxId != null) {
                    C0668Pg c0668Pg = AbstractC2248ms.f7951a;
                    Object obj = arrayList.get(i);
                    AbstractC0295Gu.m625r(-501184028735541L);
                    c0668Pg.getClass();
                    C0668Pg.m1331l(currentWxId, (String) obj);
                }
                break;
            default:
                C0398JA c0398ja = (C0398JA) this.f2834c;
                C0441KA c0441ka = (C0441KA) this.f2835d;
                C0784SA c0784sa = (C0784SA) this.f2836e;
                FrameLayout frameLayout2 = c0441ka.f1442a;
                frameLayout2.animate().scaleX(0.95f).scaleY(0.95f).setDuration(100L).withEndAction(new RunnableC2260n3(16, frameLayout2, new C1127a9(this.f2833b, c0398ja, c0441ka, c0784sa))).start();
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0910V7(FrameLayout frameLayout, ViewOnClickListenerC0996X7 viewOnClickListenerC0996X7, int i, C0382Iv c0382Iv) {
        this.f2834c = frameLayout;
        this.f2835d = viewOnClickListenerC0996X7;
        this.f2833b = i;
        this.f2836e = c0382Iv;
    }
}
