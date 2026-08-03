package p000;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.C1277c;
import java.util.Calendar;

/* JADX INFO: renamed from: Hq */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0334Hq implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1139a;

    /* JADX INFO: renamed from: b */
    public final Object f1140b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1141c;

    public /* synthetic */ ViewOnClickListenerC0334Hq(C0549Mq c0549Mq, C1277c c1277c, int i) {
        this.f1139a = i;
        this.f1141c = c0549Mq;
        this.f1140b = c1277c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1139a) {
            case 0:
                C0549Mq c0549Mq = (C0549Mq) this.f1141c;
                int iFindLastVisibleItemPosition = ((LinearLayoutManager) c0549Mq.f1780a0.getLayoutManager()).findLastVisibleItemPosition();
                Calendar calendarM4843a = AbstractC2407qD.m4843a(((C1277c) this.f1140b).f4534a.f349a.f5207a);
                calendarM4843a.add(2, iFindLastVisibleItemPosition - 1);
                c0549Mq.m1040C(new C1469gs(calendarM4843a));
                break;
            case 1:
                C0549Mq c0549Mq2 = (C0549Mq) this.f1141c;
                int iFindFirstVisibleItemPosition = ((LinearLayoutManager) c0549Mq2.f1780a0.getLayoutManager()).findFirstVisibleItemPosition();
                Calendar calendarM4843a2 = AbstractC2407qD.m4843a(((C1277c) this.f1140b).f4534a.f349a.f5207a);
                calendarM4843a2.add(2, iFindFirstVisibleItemPosition + 1);
                c0549Mq2.m1040C(new C1469gs(calendarM4843a2));
                break;
            default:
                C2663wB c2663wB = (C2663wB) this.f1141c;
                Window.Callback callback = c2663wB.f9223k;
                if (callback != null && c2663wB.f9224l) {
                    callback.onMenuItemSelected(0, (C2652w0) this.f1140b);
                    break;
                }
                break;
        }
    }

    public ViewOnClickListenerC0334Hq(C2663wB c2663wB) {
        this.f1139a = 2;
        this.f1141c = c2663wB;
        Context context = c2663wB.f9213a.getContext();
        CharSequence charSequence = c2663wB.f9220h;
        C2652w0 c2652w0 = new C2652w0();
        c2652w0.f9173e = 4096;
        c2652w0.f9175g = 4096;
        c2652w0.f9180l = null;
        c2652w0.f9181m = null;
        c2652w0.f9182n = false;
        c2652w0.f9183o = false;
        c2652w0.f9184p = 16;
        c2652w0.f9177i = context;
        c2652w0.f9169a = charSequence;
        this.f1140b = c2652w0;
    }
}
