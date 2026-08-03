package p000;

import android.content.SharedPreferences;
import android.view.View;
import com.youth.banner.adapter.BannerAdapter;
import java.util.ArrayList;

/* JADX INFO: renamed from: m5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2219m5 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7712a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f7713b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f7714c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f7715d;

    public /* synthetic */ ViewOnClickListenerC2219m5(ViewOnClickListenerC0996X7 r2, int r3, C0953W7 r4) {
        this.f7712a = 1;
        this.f7714c = r2;
        this.f7713b = r3;
        this.f7715d = r4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r11) {
        int r0 = this.f7712a;
        Object r1 = this.f7715d;
        int r2 = this.f7713b;
        Object r3 = this.f7714c;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ArrayList r4 = ((ViewOnClickListenerC0996X7) r3).f3181c;
        r4.remove(r2);
        SharedPreferences r112 = AbstractC0599Nx.f1939a;
        String r113 = AbstractC2453ra.m4901k0(r4, AbstractC0295Gu.m625r(-501136784095285L), null, null, null, 62);
        AbstractC0295Gu.m625r(-839137825388597L);
        SharedPreferences.Editor r02 = AbstractC0599Nx.f1939a.edit();
        r02.putString(AbstractC0295Gu.m625r(-839159300225077L), r113);
        r02.apply();
        ((C0953W7) r1).notifyDataSetChanged();
        return;
    L6:
        BannerAdapter.m2519a((BannerAdapter) r3, r1, r2, r11);
    }

    public /* synthetic */ ViewOnClickListenerC2219m5(BannerAdapter r2, Object r3, int r4) {
        this.f7712a = 0;
        this.f7714c = r2;
        this.f7715d = r3;
        this.f7713b = r4;
    }
}
