package yyds;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᛷᲈᲁ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1690 extends AbstractC0185 {

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public final ImageView f8612;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public final FrameLayout f8613;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final TextView f8614;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public final TextView f8615;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final TextView f8616;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final TextView f8617;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final TextView f8618;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public final ImageView f8619;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1690(View view) {
        super(view);
        AbstractC2328.m4341(-116745373909870L);
        View viewFindViewById = view.findViewById(R.id.tv_voice_name);
        AbstractC2328.m4341(-116784028615534L);
        this.f8614 = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_text_content);
        AbstractC2328.m4341(-116861338026862L);
        this.f8618 = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tv_duration);
        AbstractC2328.m4341(-116938647438190L);
        this.f8617 = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.tv_create_time);
        AbstractC2328.m4341(-117015956849518L);
        this.f8616 = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.fl_play_button);
        AbstractC2328.m4341(-117093266260846L);
        this.f8613 = (FrameLayout) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.iv_play);
        AbstractC2328.m4341(-117170575672174L);
        this.f8619 = (ImageView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.btn_select);
        AbstractC2328.m4341(-117247885083502L);
        this.f8615 = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.iv_delete);
        AbstractC2328.m4341(-117325194494830L);
        this.f8612 = (ImageView) viewFindViewById8;
    }
}
