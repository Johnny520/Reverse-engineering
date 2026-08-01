package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kf0 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3091d = 1;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ SharedPreferences f3092e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Context f3093f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3094g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3095h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f3096i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3097j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f3098k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ View f3099l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ kf0(SharedPreferences sharedPreferences, Context context, int i, int i2, int i3, int i4, int i5, TextView textView) {
        this.f3092e = sharedPreferences;
        this.f3093f = context;
        this.f3094g = i;
        this.f3095h = i2;
        this.f3096i = i3;
        this.f3097j = i4;
        this.f3098k = i5;
        this.f3099l = textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f3091d;
        View view = this.f3099l;
        switch (i) {
            case 0:
                return vf0.m4570W1(this.f3092e, this.f3093f, this.f3094g, this.f3095h, (LinearLayout) view, this.f3096i, this.f3097j, this.f3098k, (LinearLayout) obj);
            default:
                return vf0.m4538O1(this.f3092e, this.f3093f, this.f3094g, this.f3095h, this.f3096i, this.f3097j, this.f3098k, (TextView) view, (LinearLayout) obj);
        }
    }

    public /* synthetic */ kf0(SharedPreferences sharedPreferences, Context context, int i, int i2, LinearLayout linearLayout, int i3, int i4, int i5) {
        this.f3092e = sharedPreferences;
        this.f3093f = context;
        this.f3094g = i;
        this.f3095h = i2;
        this.f3099l = linearLayout;
        this.f3096i = i3;
        this.f3097j = i4;
        this.f3098k = i5;
    }
}
