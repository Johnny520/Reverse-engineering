package Yue;

import android.annotation.SuppressLint;
import android.util.Pair;

/* JADX INFO: renamed from: Yue.ۥۣۡۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6601 {
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: ۥ */
    public static final <F, S> F m3065(@InterfaceC6399 C6600<F, S> c6600) {
        return c6600.f2165;
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <F, S> F m3066(@InterfaceC6399 Pair<F, S> pair) {
        return (F) pair.first;
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <F, S> S m20940(@InterfaceC6399 C6600<F, S> c6600) {
        return c6600.f2166;
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <F, S> S m20941(@InterfaceC6399 Pair<F, S> pair) {
        return (S) pair.second;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <F, S> Pair<F, S> m20942(@InterfaceC6399 C6599<? extends F, ? extends S> c6599) {
        return new Pair<>(c6599.m20938(), c6599.m20939());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <F, S> C6600<F, S> m20943(@InterfaceC6399 C6599<? extends F, ? extends S> c6599) {
        return new C6600<>(c6599.m20938(), c6599.m20939());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <F, S> C6599<F, S> m20944(@InterfaceC6399 C6600<F, S> c6600) {
        return new C6599<>(c6600.f2165, c6600.f2166);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <F, S> C6599<F, S> m20945(@InterfaceC6399 Pair<F, S> pair) {
        return new C6599<>(pair.first, pair.second);
    }
}
