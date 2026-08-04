package yyds;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᛳᲀᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0672 extends AbstractC0185 {

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public final TextView f3207;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final ImageView f3208;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public final TextView f3209;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final TextView f3210;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final TextView f3211;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final TextView f3212;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public final ProgressBar f3213;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0672(View view) {
        super(view);
        AbstractC2328.m4341(-1230043846706030L);
        View viewFindViewById = view.findViewById(R.id.ivUserAvatar);
        AbstractC2328.m4341(-1230082501411694L);
        this.f3208 = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tvUserName);
        AbstractC2328.m4341(-1230159810823022L);
        this.f3212 = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tvUserId);
        AbstractC2328.m4341(-1230237120234350L);
        this.f3211 = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.tvUserCount);
        AbstractC2328.m4341(-1230314429645678L);
        this.f3210 = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.tvUserPercent);
        AbstractC2328.m4341(-1230391739057006L);
        this.f3207 = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.progressUserPercent);
        AbstractC2328.m4341(-1230469048468334L);
        this.f3213 = (ProgressBar) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.btnExportUserStats);
        AbstractC2328.m4341(-1230546357879662L);
        this.f3209 = (TextView) viewFindViewById7;
    }
}
