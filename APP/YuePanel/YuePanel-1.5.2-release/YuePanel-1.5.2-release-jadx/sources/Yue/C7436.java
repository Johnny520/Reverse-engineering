package Yue;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: Yue.ۥۡۨۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C7436 {

    /* JADX INFO: renamed from: Yue.ۥۡۨۨۤ$ۥ */
    @Deprecated
    public static final class C1261 {

        /* JADX INFO: renamed from: ۥ۟ */
        public static C1261 f2884;

        /* JADX INFO: renamed from: ۥ */
        public final C7437 f2885 = new C7437();

        /* JADX INFO: renamed from: Yue.ۥۡۨۨۤ$ۥ$ۥ, reason: contains not printable characters */
        public static class C7437 {
            /* JADX INFO: renamed from: ۥ */
            public void m3629(@InterfaceC6391 SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        @Deprecated
        /* JADX INFO: renamed from: ۥ۟ */
        public static C1261 m3627() {
            if (f2884 == null) {
                f2884 = new C1261();
            }
            return f2884;
        }

        @Deprecated
        /* JADX INFO: renamed from: ۥ */
        public void m3628(@InterfaceC6391 SharedPreferences.Editor editor) {
            this.f2885.m3629(editor);
        }
    }
}
