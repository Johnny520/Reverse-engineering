package io.ktor.util.internal;

/* JADX INFO: renamed from: io.ktor.util.internal.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3451c {

    /* JADX INFO: renamed from: a */
    public static final Object f9515a = new C3455g("CONDITION_FALSE");

    /* JADX INFO: renamed from: b */
    public static final Object f9516b = new C3455g("ALREADY_REMOVED");

    /* JADX INFO: renamed from: c */
    public static final Object f9517c = new C3455g("LIST_EMPTY");

    /* JADX INFO: renamed from: d */
    public static final Object f9518d = new C3455g("REMOVE_PREPARED");

    /* JADX INFO: renamed from: e */
    public static final Object f9519e = new C3455g("NO_DECISION");

    /* JADX INFO: renamed from: a */
    public static final C3452d m12863a(Object obj) {
        C3452d c3452d;
        obj.getClass();
        C3454f c3454f = obj instanceof C3454f ? (C3454f) obj : null;
        return (c3454f == null || (c3452d = c3454f.f9523a) == null) ? (C3452d) obj : c3452d;
    }
}
