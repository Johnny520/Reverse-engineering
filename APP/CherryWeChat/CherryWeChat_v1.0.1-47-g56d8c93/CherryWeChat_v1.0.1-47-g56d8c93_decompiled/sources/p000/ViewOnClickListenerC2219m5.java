package p000;

import android.content.SharedPreferences;
import android.view.View;
import com.youth.banner.adapter.BannerAdapter;
import java.util.ArrayList;

/* JADX INFO: renamed from: m5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2219m5 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7712a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f7713b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f7714c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f7715d;

    public /* synthetic */ ViewOnClickListenerC2219m5(ViewOnClickListenerC0996X7 viewOnClickListenerC0996X7, int i, C0953W7 c0953w7) {
        this.f7714c = viewOnClickListenerC0996X7;
        this.f7713b = i;
        this.f7715d = c0953w7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f7712a;
        Object obj = this.f7715d;
        int i2 = this.f7713b;
        Object obj2 = this.f7714c;
        switch (i) {
            case 0:
                ((BannerAdapter) obj2).lambda$onBindViewHolder$0(obj, i2, view);
                break;
            default:
                ArrayList arrayList = ((ViewOnClickListenerC0996X7) obj2).f3181c;
                arrayList.remove(i2);
                SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
                String strM4901k0 = AbstractC2453ra.m4901k0(arrayList, AbstractC0295Gu.m625r(-501136784095285L), null, null, null, 62);
                AbstractC0295Gu.m625r(-839137825388597L);
                SharedPreferences.Editor editorEdit = AbstractC0599Nx.f1939a.edit();
                editorEdit.putString(AbstractC0295Gu.m625r(-839159300225077L), strM4901k0);
                editorEdit.apply();
                ((C0953W7) obj).notifyDataSetChanged();
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC2219m5(BannerAdapter bannerAdapter, Object obj, int i) {
        this.f7714c = bannerAdapter;
        this.f7715d = obj;
        this.f7713b = i;
    }
}
