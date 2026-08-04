package yyds;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛴᛵᲇᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0867 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f3970;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f3971 = 1;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f3972;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ int f3973;

    public /* synthetic */ ViewOnClickListenerC0867(int i, List list, C0947 c0947) {
        this.f3970 = c0947;
        this.f3973 = i;
        this.f3972 = list;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object c2658;
        int i = this.f3971;
        int i2 = this.f3973;
        Object obj = this.f3972;
        Object obj2 = this.f3970;
        switch (i) {
            case 0:
                C2355 c2355 = (C2355) obj;
                ArrayList arrayList = c2355.f11570;
                C2336.f11496.m4354(AbstractC2328.m4341(-196043355095918L) + i2);
                int iM784 = ((C0144) obj2).m784();
                if (iM784 == -1 || iM784 >= arrayList.size()) {
                    return;
                }
                c2355.f11575.mo511(Integer.valueOf(iM784), ((C2522) arrayList.get(iM784)).f12445);
                return;
            case 1:
                C0947 c0947 = (C0947) obj2;
                c0947.f4410 = i2;
                int i3 = 0;
                for (Object obj3 : (List) obj) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        AbstractC2725.m4853();
                        throw null;
                    }
                    LinearLayout linearLayout = (LinearLayout) obj3;
                    if (i3 == c0947.f4410) {
                        linearLayout.setAlpha(1.0f);
                        linearLayout.setBackgroundResource(R.drawable.bg_card_selected);
                        linearLayout.setElevation(8.0f);
                    } else {
                        linearLayout.setAlpha(0.5f);
                        linearLayout.setBackgroundResource(R.drawable.bg_card_unselected);
                        linearLayout.setElevation(0.0f);
                    }
                    i3 = i4;
                }
                return;
            case 2:
                Method method = (Method) obj;
                Object obj4 = ((WeakReference) obj2).get();
                if (obj4 == null) {
                    return;
                }
                try {
                    c2658 = method.invoke(obj4, Integer.valueOf(i2));
                    break;
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                Throwable thM4249 = C2248.m4249(c2658);
                if (thM4249 != null) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-842680746279790L) + i2, thM4249);
                    return;
                }
                return;
            default:
                C0172 c0172 = (C0172) obj2;
                C2531 c2531 = (C2531) obj;
                Object tag = view.getTag();
                C1467 c1467 = tag instanceof C1467 ? (C1467) tag : null;
                if (c1467 == null) {
                    return;
                }
                C0119.m532(c0172, c2531, i2, c1467);
                return;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0867(int i, C0144 c0144, C2355 c2355) {
        this.f3973 = i;
        this.f3970 = c0144;
        this.f3972 = c2355;
    }

    public /* synthetic */ ViewOnClickListenerC0867(WeakReference weakReference, Method method, int i) {
        this.f3970 = weakReference;
        this.f3972 = method;
        this.f3973 = i;
    }

    public /* synthetic */ ViewOnClickListenerC0867(C0172 c0172, C2531 c2531, Context context, int i) {
        this.f3970 = c0172;
        this.f3972 = c2531;
        this.f3973 = i;
    }
}
