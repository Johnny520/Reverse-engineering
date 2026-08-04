package yyds;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: yyds.ᲈᲁᛶᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2763 implements InterfaceC1215 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f13490 = 0;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public View f13491;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public TextView f13492;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f13493;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C0922 f13494;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f13495;

    public C2763(Activity activity) {
        C0922 c0922 = new C0922(activity, this);
        c0922.f4226 = false;
        C1053 c1053 = new C1053();
        c1053.f4788 = activity;
        c0922.f4228 = c1053;
        this.f13494 = c0922;
    }

    @Override // yyds.InterfaceC1215
    public final void cancel() {
        switch (this.f13490) {
            case 0:
                this.f13494.m2039();
                break;
            default:
                this.f13494.m2039();
                break;
        }
    }

    @Override // yyds.InterfaceC1215
    public final void setDuration(int i) {
        this.f13495 = i;
    }

    @Override // yyds.InterfaceC1215
    public final void setGravity(int i, int i2, int i3) {
        this.f13493 = 17;
    }

    @Override // yyds.InterfaceC1215
    public final void setMargin(float f, float f2) {
    }

    @Override // yyds.InterfaceC1215
    public final void setText(CharSequence charSequence) {
        TextView textView = this.f13492;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    @Override // yyds.InterfaceC1215
    public final void setView(View view) {
        this.f13491 = view;
        if (view == null) {
            this.f13492 = null;
        } else {
            this.f13492 = InterfaceC1215.m2474(view);
        }
    }

    @Override // yyds.InterfaceC1215
    public final void show() {
        int i = this.f13490;
        C0922 c0922 = this.f13494;
        switch (i) {
            case 0:
                RunnableC0678 runnableC0678 = c0922.f4231;
                if (!c0922.f4232) {
                    if (Looper.myLooper() != Looper.getMainLooper()) {
                        Handler handler = C0922.f4225;
                        handler.removeCallbacks(runnableC0678);
                        handler.post(runnableC0678);
                    } else {
                        runnableC0678.run();
                    }
                    break;
                }
                break;
            default:
                RunnableC0678 runnableC06782 = c0922.f4231;
                if (!c0922.f4232) {
                    if (Looper.myLooper() != Looper.getMainLooper()) {
                        Handler handler2 = C0922.f4225;
                        handler2.removeCallbacks(runnableC06782);
                        handler2.post(runnableC06782);
                    } else {
                        runnableC06782.run();
                    }
                    break;
                }
                break;
        }
    }

    public C2763(Application application) {
        C0922 c0922 = new C0922(application, this);
        c0922.f4226 = true;
        C1053 c1053 = new C1053();
        c1053.f4789 = application;
        c0922.f4228 = c1053;
        this.f13494 = c0922;
    }
}
