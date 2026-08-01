package p068ed;

import android.view.View;
import android.view.ViewGroup;
import me.yun.fkwechat.core.config.ConfigRepo;
import p053dd.C1951c;
import p146jd.C3838c;
import p146jd.C3840e;
import p146jd.C3843h;
import p146jd.C3844i;
import p146jd.C3847l;
import p146jd.C3848m;
import p146jd.C3856u;
import p315vd.AbstractC8924d;

/* JADX INFO: renamed from: ed.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2214c {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2214c[] f6041a = {new C3838c(), new C3843h(), new C3848m(), new C3840e(), new C3847l(), new C3856u(), new C3844i()};

    /* JADX INFO: renamed from: a */
    static void m7976a(View view, C1951c c1951c) {
        for (InterfaceC2214c interfaceC2214c : f6041a) {
            interfaceC2214c.mo7977b(view, c1951c);
        }
    }

    /* JADX INFO: renamed from: b */
    void mo7977b(View view, C1951c c1951c);

    /* JADX INFO: renamed from: c */
    default View m7978c(String str, View view) {
        if (view == null) {
            return null;
        }
        try {
            if (view.getClass().getName().contains(str)) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View viewM7978c = m7978c(str, viewGroup.getChildAt(i10));
                    if (viewM7978c != null) {
                        return viewM7978c;
                    }
                }
            }
        } catch (Throwable th) {
            AbstractC8924d.m34265e("findView", th);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    default int m7979d(View view, float f10) {
        return (int) ((f10 * view.getResources().getDisplayMetrics().density) + 0.5f);
    }

    default boolean getBoolean(String str, boolean z10) {
        return ConfigRepo.getBoolean(str, z10);
    }

    default int getInt(String str, int i10) {
        return ConfigRepo.getInt(str, i10);
    }

    default String getString(String str, String str2) {
        return ConfigRepo.getString(str, str2);
    }

    default void remove(String str) {
        ConfigRepo.remove(str);
    }

    default void setString(String str, String str2) {
        ConfigRepo.setString(str, str2);
    }
}
