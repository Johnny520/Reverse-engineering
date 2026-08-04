package yyds;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᲈᲀᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2750 extends AbstractC0185 {

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public final TextView f13463;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final TextView f13464;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final ProgressBar f13465;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final TextView f13466;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final TextView f13467;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2750(View view) {
        super(view);
        AbstractC2328.m4341(-1288060264940398L);
        View viewFindViewById = view.findViewById(R.id.tvStatsCategory);
        AbstractC2328.m4341(-1288098919646062L);
        this.f13464 = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tvStatsCount);
        AbstractC2328.m4341(-1288176229057390L);
        this.f13467 = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tvStatsPercent);
        AbstractC2328.m4341(-1288253538468718L);
        this.f13466 = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.progressStatsPercent);
        AbstractC2328.m4341(-1288330847880046L);
        this.f13465 = (ProgressBar) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.btnExportCategoryStats);
        AbstractC2328.m4341(-1288408157291374L);
        this.f13463 = (TextView) viewFindViewById5;
    }
}
