package yyds;

import android.view.View;
import android.widget.ImageView;
import com.p000ss.android.ugc.awemes.MainActivity;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛳᛴᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0573 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ ImageView f2759;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f2760;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ MainActivity f2761;

    public /* synthetic */ ViewOnClickListenerC0573(MainActivity mainActivity, ImageView imageView, int i) {
        this.f2760 = i;
        this.f2761 = mainActivity;
        this.f2759 = imageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f2760;
        ImageView imageView = this.f2759;
        MainActivity mainActivity = this.f2761;
        switch (i) {
            case 0:
                List list = MainActivity.f451;
                mainActivity.m326(imageView);
                break;
            case 1:
                List list2 = MainActivity.f451;
                mainActivity.m326(imageView);
                break;
            default:
                List list3 = MainActivity.f451;
                mainActivity.m326(imageView);
                break;
        }
    }
}
