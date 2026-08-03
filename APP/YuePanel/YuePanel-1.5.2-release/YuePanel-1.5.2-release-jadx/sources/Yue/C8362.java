package Yue;

import android.view.ViewStructure;

/* JADX INFO: renamed from: Yue.ۥۢۤۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8362 {

    /* JADX INFO: renamed from: ۥ */
    public final Object f3438;

    /* JADX INFO: renamed from: Yue.ۥۢۤۧ۠$ۥ */
    @InterfaceC7113(23)
    public static class C1499 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m4332(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m4333(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m27906(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
            viewStructure.setDimens(i, i2, i3, i4, i5, i6);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m27907(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }
    }

    public C8362(@InterfaceC6391 ViewStructure viewStructure) {
        this.f3438 = viewStructure;
    }

    @InterfaceC6391
    @InterfaceC7113(23)
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static C8362 m27902(@InterfaceC6391 ViewStructure viewStructure) {
        return new C8362(viewStructure);
    }

    /* JADX INFO: renamed from: ۥ */
    public void m4330(@InterfaceC6391 String str) {
        C1499.m4332((ViewStructure) this.f3438, str);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m4331(@InterfaceC6391 CharSequence charSequence) {
        C1499.m4333((ViewStructure) this.f3438, charSequence);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m27903(int i, int i2, int i3, int i4, int i5, int i6) {
        C1499.m27906((ViewStructure) this.f3438, i, i2, i3, i4, i5, i6);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m27904(@InterfaceC6391 CharSequence charSequence) {
        C1499.m27907((ViewStructure) this.f3438, charSequence);
    }

    @InterfaceC6391
    @InterfaceC7113(23)
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public ViewStructure m27905() {
        return (ViewStructure) this.f3438;
    }
}
