package yyds;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.app.CustomRecyclerView;

/* JADX INFO: renamed from: yyds.ᲈᛶᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2692 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2133 f13231;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ TextView f13232;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ TextView f13233;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ TextView f13234;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final /* synthetic */ CustomRecyclerView f13235;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ LinearLayout f13236;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ CustomRecyclerView f13237;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f13238;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Context f13239;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0947 f13240;

    public /* synthetic */ ViewOnClickListenerC2692(C0947 c0947, TextView textView, Context context, TextView textView2, C2133 c2133, TextView textView3, CustomRecyclerView customRecyclerView, CustomRecyclerView customRecyclerView2, LinearLayout linearLayout, int i) {
        this.f13238 = i;
        this.f13240 = c0947;
        this.f13233 = textView;
        this.f13239 = context;
        this.f13234 = textView2;
        this.f13231 = c2133;
        this.f13232 = textView3;
        this.f13237 = customRecyclerView;
        this.f13235 = customRecyclerView2;
        this.f13236 = linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
