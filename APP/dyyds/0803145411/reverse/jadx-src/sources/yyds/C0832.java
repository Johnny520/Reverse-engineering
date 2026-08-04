package yyds;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.p000ss.android.ugc.aweme.yyds.R;
import com.p000ss.android.ugc.awemes.p001ui.ProgressParticleView;
import com.ss.android.ugc.aweme.utils.ActivityStack;

/* JADX INFO: renamed from: yyds.ᛴᛴᛲᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0832 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f3807;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f3808;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C1524 f3809;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1508 f3810;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Dialog f3811;

    public C0832(Context context, int i, C1524 c1524) {
        this.f3808 = i;
        this.f3809 = c1524;
        Context topActivity = ActivityStack.getTopActivity();
        topActivity = topActivity == null ? context : topActivity;
        C2701.f13261.getClass();
        C2701.m4807(topActivity);
        View viewInflate = AbstractC1115.m2309(topActivity).inflate(R.layout.dialog_profile_batch_download_progress, (ViewGroup) null, false);
        int i2 = R.id.btn_cancel_batch_download;
        TextView textView = (TextView) AbstractC1741.m3479(viewInflate, R.id.btn_cancel_batch_download);
        if (textView != null) {
            i2 = R.id.progress_batch_item;
            ProgressBar progressBar = (ProgressBar) AbstractC1741.m3479(viewInflate, R.id.progress_batch_item);
            if (progressBar != null) {
                i2 = R.id.progress_batch_item_particle;
                ProgressParticleView progressParticleView = (ProgressParticleView) AbstractC1741.m3479(viewInflate, R.id.progress_batch_item_particle);
                if (progressParticleView != null) {
                    i2 = R.id.progress_batch_total;
                    ProgressBar progressBar2 = (ProgressBar) AbstractC1741.m3479(viewInflate, R.id.progress_batch_total);
                    if (progressBar2 != null) {
                        i2 = R.id.tv_batch_badge;
                        TextView textView2 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_batch_badge);
                        if (textView2 != null) {
                            i2 = R.id.tv_batch_current;
                            TextView textView3 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_batch_current);
                            if (textView3 != null) {
                                i2 = R.id.tv_batch_file_name;
                                TextView textView4 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_batch_file_name);
                                if (textView4 != null) {
                                    i2 = R.id.tv_batch_item_percent;
                                    TextView textView5 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_batch_item_percent);
                                    if (textView5 != null) {
                                        i2 = R.id.tv_batch_item_size;
                                        TextView textView6 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_batch_item_size);
                                        if (textView6 != null) {
                                            i2 = R.id.tv_batch_result;
                                            TextView textView7 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_batch_result);
                                            if (textView7 != null) {
                                                i2 = R.id.tv_batch_total_percent;
                                                TextView textView8 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_batch_total_percent);
                                                if (textView8 != null) {
                                                    i2 = R.id.tv_batch_total_summary;
                                                    TextView textView9 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_batch_total_summary);
                                                    if (textView9 != null) {
                                                        FrameLayout frameLayout = (FrameLayout) viewInflate;
                                                        C1508 c1508 = new C1508(frameLayout, textView, progressBar, progressParticleView, progressBar2, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
                                                        AbstractC2328.m4341(-112519126090606L);
                                                        this.f3810 = c1508;
                                                        C2701.m4793(frameLayout);
                                                        progressBar.setIndeterminateDrawable(new C1846(topActivity.getColor(R.color.divider_color), topActivity.getColor(R.color.douyin_primary), new C0216(2, progressParticleView, ProgressParticleView.class, AbstractC2328.m4341(-237704537867118L), AbstractC2328.m4341(-237829091918702L), 0, 3)));
                                                        progressParticleView.m361(0.0f, true);
                                                        Dialog dialog = new Dialog(topActivity, android.R.style.Theme.Translucent.NoTitleBar);
                                                        dialog.setContentView(frameLayout);
                                                        dialog.setCancelable(false);
                                                        dialog.setCanceledOnTouchOutside(false);
                                                        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: yyds.ᛲᛴᛸᛶ
                                                            @Override // android.content.DialogInterface.OnKeyListener
                                                            public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                                                                if (i3 != 4 || keyEvent.getAction() != 1) {
                                                                    return false;
                                                                }
                                                                this.f1755.m1892();
                                                                return true;
                                                            }
                                                        });
                                                        this.f3811 = dialog;
                                                        Window window = dialog.getWindow();
                                                        if (window != null) {
                                                            window.setBackgroundDrawableResource(android.R.color.transparent);
                                                            window.setGravity(17);
                                                            window.setLayout(-1, -1);
                                                            window.addFlags(2);
                                                            window.setDimAmount(0.38f);
                                                            window.setWindowAnimations(android.R.style.Animation.Translucent);
                                                        }
                                                        textView9.setText(AbstractC2328.m4341(-112574960665454L) + i + AbstractC2328.m4341(-112613615371118L));
                                                        textView.setOnClickListener(new ViewOnClickListenerC1462(13, this));
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C0188.m789(AbstractC2328.m4341(-1746101347189614L).concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m1892() {
        if (this.f3807) {
            return;
        }
        this.f3807 = true;
        C1508 c1508 = this.f3810;
        TextView textView = c1508.f7093;
        TextView textView2 = c1508.f7097;
        textView.setText(AbstractC2328.m4341(-113060291969902L));
        c1508.f7094.setText(AbstractC2328.m4341(-113077471839086L));
        textView2.setEnabled(false);
        textView2.setAlpha(0.72f);
        textView2.setText(AbstractC2328.m4341(-113120421512046L));
        this.f3809.mo731();
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m1893(int i, int i2) {
        int i3 = i - i2;
        if (i3 < 0) {
            i3 = 0;
        }
        C1508 c1508 = this.f3810;
        c1508.f7095.setText(AbstractC2328.m4341(-112952917787502L) + i2 + AbstractC2328.m4341(-112970097656686L) + i3);
        TextView textView = c1508.f7088;
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-113000162427758L));
        int i4 = this.f3808;
        if (i > i4) {
            i = i4;
        }
        sb.append(i);
        sb.append(AbstractC2328.m4341(-113021637264238L));
        sb.append(i4);
        sb.append(AbstractC2328.m4341(-113038817133422L));
        textView.setText(sb.toString());
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m1894(float f) {
        int i = this.f3808;
        float fM1483 = i > 0 ? AbstractC0598.m1483(f / i, 0.0f, 1.0f) : 1.0f;
        C1508 c1508 = this.f3810;
        c1508.f7098.setProgress(AbstractC0181.m748(1000.0f * fM1483), true);
        c1508.f7090.setText(AbstractC0090.m490(fM1483));
    }
}
