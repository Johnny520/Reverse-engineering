package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: p6 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0403p6 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Dialog f699a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f700b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Activity f701c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f702d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f703e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f704f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f705g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f706h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f707i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnClickListenerC0403p6(Dialog dialog, Context context, Activity activity, View view, String str, String str2, String str3, String str4, String str5) {
        this.f699a = dialog;
        this.f700b = context;
        this.f701c = activity;
        this.f702d = view;
        this.f703e = str;
        this.f704f = str2;
        this.f705g = str3;
        this.f706h = str4;
        this.f707i = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f699a.dismiss();
        } catch (Throwable unused) {
        }
        AbstractC0451s6.m942a(this.f700b, this.f701c, this.f702d, this.f703e, this.f704f, this.f705g, this.f706h, this.f707i, 0L);
    }
}
