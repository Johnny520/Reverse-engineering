package Yue;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: Yue.ۥۡۢۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6370 {

    /* JADX INFO: renamed from: ۥ */
    public int f2043;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f2044;

    public C6370(@InterfaceC6391 ViewGroup viewGroup) {
    }

    /* JADX INFO: renamed from: ۥ */
    public int m2825() {
        return this.f2043 | this.f2044;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m2826(@InterfaceC6391 View view, @InterfaceC6391 View view2, int i) {
        m19889(view, view2, i, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m19889(@InterfaceC6391 View view, @InterfaceC6391 View view2, int i, int i2) {
        if (i2 == 1) {
            this.f2044 = i;
        } else {
            this.f2043 = i;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m19890(@InterfaceC6391 View view) {
        m19891(view, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m19891(@InterfaceC6391 View view, int i) {
        if (i == 1) {
            this.f2044 = 0;
        } else {
            this.f2043 = 0;
        }
    }
}
