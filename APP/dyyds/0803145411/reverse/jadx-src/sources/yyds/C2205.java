package yyds;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᲁᛳᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2205 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f10898;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Interpolator f10901;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public InterfaceC1824 f10903;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public long f10900 = -1;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C1609 f10902 = new C1609(this);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final ArrayList f10899 = new ArrayList();

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4190() {
        if (this.f10898) {
            Iterator it = this.f10899.iterator();
            while (it.hasNext()) {
                ((C0140) it.next()).m627();
            }
            this.f10898 = false;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m4191() {
        View view;
        if (this.f10898) {
            return;
        }
        for (C0140 c0140 : this.f10899) {
            long j = this.f10900;
            if (j >= 0) {
                c0140.m628(j);
            }
            Interpolator interpolator = this.f10901;
            if (interpolator != null && (view = (View) c0140.f849.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f10903 != null) {
                c0140.m629(this.f10902);
            }
            View view2 = (View) c0140.f849.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f10898 = true;
    }
}
