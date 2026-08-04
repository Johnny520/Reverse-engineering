package yyds;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᛱᛶᛵᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0144 extends AbstractC0185 {

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public final TextView f883;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final FrameLayout f884;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final TextView f885;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final TextView f886;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final ImageView f887;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public final ImageView f888;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0144(View view) {
        super(view);
        AbstractC2328.m4341(-175625080570734L);
        View viewFindViewById = view.findViewById(R.id.fl_play_button);
        AbstractC2328.m4341(-175663735276398L);
        this.f884 = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.iv_play);
        AbstractC2328.m4341(-175741044687726L);
        this.f887 = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tv_file_name);
        AbstractC2328.m4341(-175818354099054L);
        this.f886 = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.tv_duration);
        AbstractC2328.m4341(-175895663510382L);
        this.f885 = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.tv_file_size);
        AbstractC2328.m4341(-175972972921710L);
        this.f883 = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.iv_selected);
        AbstractC2328.m4341(-176050282333038L);
        this.f888 = (ImageView) viewFindViewById6;
    }
}
