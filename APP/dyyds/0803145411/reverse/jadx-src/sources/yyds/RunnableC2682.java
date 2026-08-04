package yyds;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᲈᛶᛵᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2682 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f13144;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f13145;

    public /* synthetic */ RunnableC2682(ViewGroup viewGroup, int i) {
        this.f13144 = i;
        this.f13145 = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object c2658;
        int i = this.f13144;
        InterfaceC0274 interfaceC0274 = null;
        ViewGroup viewGroup = this.f13145;
        switch (i) {
            case 0:
                View viewInflate = AbstractC1115.m2309(viewGroup.getContext()).inflate(R.layout.chat_audio_layout, viewGroup, false);
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                ImageView imageView = (ImageView) AbstractC1741.m3479(viewInflate, R.id.replaceAudio);
                if (imageView == null) {
                    C0188.m789(AbstractC2328.m4341(-1744177201841006L).concat(viewInflate.getResources().getResourceName(R.id.replaceAudio)));
                } else {
                    AbstractC2328.m4341(-956690653152110L);
                    viewGroup.addView(linearLayout, 0);
                    imageView.setOnClickListener(new ViewOnClickListenerC2618(2));
                }
                break;
            case 1:
                C1509.f7142.getClass();
                if (!C1509.m3119()) {
                    C1435.f6790.getClass();
                    C1435.m2930(viewGroup);
                } else {
                    C1435.m2932(C1435.f6790);
                }
                break;
            case 2:
                viewGroup.setBackground(null);
                viewGroup.setBackgroundColor(0);
                break;
            case 3:
                try {
                    C0615.f2981.getClass();
                    C0615.m1509(viewGroup);
                    c2658 = C2746.f13459;
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                Throwable thM4249 = C2248.m4249(c2658);
                if (thM4249 != null) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-997810670044014L), thM4249);
                }
                break;
            default:
                AbstractC2071.m3959((InterfaceC0990) AbstractC2797.f13667.getValue(), null, new C0853(viewGroup, interfaceC0274, 4), 3);
                break;
        }
    }
}
