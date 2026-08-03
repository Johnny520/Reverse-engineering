package p154k9;

import android.content.SharedPreferences;
import p144k.C2209s1;

/* JADX INFO: renamed from: k9.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SharedPreferencesOnSharedPreferenceChangeListenerC2367k implements SharedPreferences.OnSharedPreferenceChangeListener {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C2374r c2374r = C2374r.f7799a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1298848381:
                    if (str.equals("enable")) {
                        SharedPreferences sharedPreferences2 = C2374r.f7801c;
                        int i9 = 0;
                        boolean z9 = sharedPreferences2 != null ? sharedPreferences2.getBoolean("enable", false) : false;
                        C2374r.f7802d = z9;
                        C2374r.m5687p(new C2373q(i9, z9));
                        return;
                    }
                    break;
                case 1381039842:
                    if (str.equals("position_x")) {
                        return;
                    }
                    break;
                case 1381039843:
                    if (str.equals("position_y")) {
                        return;
                    }
                    break;
            }
        }
        C2374r.m5687p(new C2209s1(1));
    }
}
