package yyds;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᛲᛷᲀᛸ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0401 extends AbstractC0185 {

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final TextView f2119;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final ImageView f2120;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final ImageView f2121;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0401(View view) {
        super(view);
        AbstractC2328.m4341(-1227819053646702L);
        View viewFindViewById = view.findViewById(R.id.tvCategoryName);
        AbstractC2328.m4341(-1227857708352366L);
        this.f2119 = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.btnEditCategory);
        AbstractC2328.m4341(-1227935017763694L);
        this.f2121 = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.btnDeleteCategory);
        AbstractC2328.m4341(-1228012327175022L);
        this.f2120 = (ImageView) viewFindViewById3;
    }
}
