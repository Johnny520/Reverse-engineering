package Yue;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: Yue.ۥۡۨۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7438 {
    @SuppressLint({"ApplySharedPref"})
    /* JADX INFO: renamed from: ۥ */
    public static final void m3630(@InterfaceC6399 SharedPreferences sharedPreferences, boolean z, @InterfaceC6399 InterfaceC5124<? super SharedPreferences.Editor, C8107> interfaceC5124) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        interfaceC5124.invoke(editorEdit);
        if (z) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ void m3631(SharedPreferences sharedPreferences, boolean z, InterfaceC5124 interfaceC5124, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        interfaceC5124.invoke(editorEdit);
        if (z) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }
}
