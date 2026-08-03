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

    public /* synthetic */ ViewOnClickListenerC0334Hq(C0549Mq r1, C1277c r2, int r3) {
        this.f1139a = r3;
        this.f1141c = r1;
        this.f1140b = r2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r4) {
        switch(this.f1139a) {
            case 0: goto L12;
            case 1: goto L10;
            default: goto L4;
        };
    L4:
        C2663wB r42 = (C2663wB) this.f1141c;
        Window.Callback r0 = r42.f9223k;
        if (r0 != null) goto L7;
        return;
    L7:
        if (r42.f9224l == false) goto L15;
        r0.onMenuItemSelected(0, (C2652w0) this.f1140b);
        return;
    L15:
        return;
    L10:
        C0549Mq r43 = (C0549Mq) this.f1141c;
        int r02 = ((LinearLayoutManager) r43.f1780a0.getLayoutManager()).findFirstVisibleItemPosition();
        Calendar r1 = AbstractC2407qD.m4843a(((C1277c) this.f1140b).f4534a.f349a.f5207a);
        r1.add(2, r02 + 1);
        r43.m1040C(new C1469gs(r1));
        return;
    L12:
        C0549Mq r44 = (C0549Mq) this.f1141c;
        int r03 = ((LinearLayoutManager) r44.f1780a0.getLayoutManager()).findLastVisibleItemPosition();
        Calendar r12 = AbstractC2407qD.m4843a(((C1277c) this.f1140b).f4534a.f349a.f5207a);
        r12.add(2, r03 - 1);
        r44.m1040C(new C1469gs(r12));
    }

    public ViewOnClickListenerC0334Hq(C2663wB r4) {
        this.f1139a = 2;
        this.f1141c = r4;
        Context r1 = r4.f9213a.getContext();
        CharSequence r42 = r4.f9220h;
        C2652w0 r0 = new C2652w0();
        r0.f9173e = 4096;
        r0.f9175g = 4096;
        r0.f9180l = null;
        r0.f9181m = null;
        r0.f9182n = false;
        r0.f9183o = false;
        r0.f9184p = 16;
        r0.f9177i = r1;
        r0.f9169a = r42;
        this.f1140b = r0;
    }
}
