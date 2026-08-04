package yyds;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᛵᲁᛳᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1196 implements InterfaceC1886 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5467;

    public /* synthetic */ C1196(int i) {
        this.f5467 = i;
    }

    @Override // yyds.InterfaceC1886
    public final void accept(Object obj) {
        switch (this.f5467) {
            case 0:
                if (obj != null) {
                    throw new ClassCastException();
                }
                throw null;
            case 1:
                if (obj != null) {
                    throw new ClassCastException();
                }
                throw null;
            case 2:
                TextView textView = (TextView) obj;
                Resources resources = textView.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.afs_popup_min_size);
                textView.setMinimumWidth(dimensionPixelSize);
                textView.setMinimumHeight(dimensionPixelSize);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                layoutParams.gravity = 21;
                layoutParams.setMarginEnd(resources.getDimensionPixelOffset(R.dimen.afs_popup_margin_end));
                textView.setLayoutParams(layoutParams);
                Context context = textView.getContext();
                textView.setBackground(new C0662(AbstractC1367.m2767(context, R.drawable.afs_popup_background)));
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setGravity(17);
                textView.setIncludeFontPadding(false);
                textView.setSingleLine(true);
                textView.setTextColor(AbstractC0395.m1132(context, android.R.attr.textColorPrimaryInverse));
                textView.setTextSize(0, resources.getDimensionPixelSize(R.dimen.afs_popup_text_size));
                return;
            default:
                TextView textView2 = (TextView) obj;
                Resources resources2 = textView2.getResources();
                textView2.setMinimumWidth(resources2.getDimensionPixelSize(R.dimen.afs_md2_popup_min_width));
                textView2.setMinimumHeight(resources2.getDimensionPixelSize(R.dimen.afs_md2_popup_min_height));
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
                layoutParams2.gravity = 49;
                layoutParams2.setMarginEnd(resources2.getDimensionPixelOffset(R.dimen.afs_md2_popup_margin_end));
                textView2.setLayoutParams(layoutParams2);
                Context context2 = textView2.getContext();
                textView2.setBackground(new C2317(context2));
                textView2.setElevation(resources2.getDimensionPixelOffset(R.dimen.afs_md2_popup_elevation));
                textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView2.setGravity(17);
                textView2.setIncludeFontPadding(false);
                textView2.setSingleLine(true);
                textView2.setTextColor(AbstractC0395.m1132(context2, android.R.attr.textColorPrimaryInverse));
                textView2.setTextSize(0, resources2.getDimensionPixelSize(R.dimen.afs_md2_popup_text_size));
                return;
        }
    }

    public /* synthetic */ C1196(C2791 c2791, int i) {
        this.f5467 = i;
    }
}
