package yyds;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.p000ss.android.ugc.awemes.MainActivity;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲈᛴᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2645 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f13037;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ MainActivity f13038;

    public /* synthetic */ C2645(MainActivity mainActivity, int i) {
        this.f13037 = i;
        this.f13038 = mainActivity;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = this.f13037;
        MainActivity mainActivity = this.f13038;
        switch (i) {
            case 0:
                AbstractC2328.m4341(-1349319383483246L);
                AbstractC2328.m4341(-1349340858319726L);
                int width = view.getWidth();
                int height = view.getHeight();
                List list = MainActivity.f451;
                outline.setRoundRect(0, 0, width, height, mainActivity.m311(12));
                break;
            case 1:
                AbstractC2328.m4341(-282582651143022L);
                AbstractC2328.m4341(-282604125979502L);
                int width2 = view.getWidth();
                int height2 = view.getHeight();
                List list2 = MainActivity.f451;
                outline.setRoundRect(0, 0, width2, height2, mainActivity.m311(11));
                break;
            case 2:
                AbstractC2328.m4341(-1275763773571950L);
                AbstractC2328.m4341(-1275785248408430L);
                int width3 = view.getWidth();
                int height3 = view.getHeight();
                List list3 = MainActivity.f451;
                outline.setRoundRect(0, 0, width3, height3, mainActivity.m311(25));
                break;
            default:
                AbstractC2328.m4341(-1252613899846510L);
                AbstractC2328.m4341(-1252635374682990L);
                int width4 = view.getWidth();
                int height4 = view.getHeight();
                List list4 = MainActivity.f451;
                outline.setRoundRect(0, 0, width4, height4, mainActivity.m311(10));
                break;
        }
    }
}
