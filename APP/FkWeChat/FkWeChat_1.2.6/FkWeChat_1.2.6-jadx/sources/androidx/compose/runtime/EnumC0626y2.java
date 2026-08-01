package androidx.compose.runtime;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.compose.runtime.y2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0626y2 {

    /* JADX INFO: renamed from: q */
    public static final EnumC0626y2 f1800q = new EnumC0626y2("Invalid", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC0626y2 f1801r = new EnumC0626y2("Cancelled", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC0626y2 f1802s = new EnumC0626y2("InitialPending", 2);

    /* JADX INFO: renamed from: t */
    public static final EnumC0626y2 f1803t = new EnumC0626y2("RecomposePending", 3);

    /* JADX INFO: renamed from: u */
    public static final EnumC0626y2 f1804u = new EnumC0626y2("Recomposing", 4);

    /* JADX INFO: renamed from: v */
    public static final EnumC0626y2 f1805v = new EnumC0626y2("ApplyPending", 5);

    /* JADX INFO: renamed from: w */
    public static final EnumC0626y2 f1806w = new EnumC0626y2("Applied", 6);

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC0626y2[] f1807x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ InterfaceC7197a f1808y;

    static {
        EnumC0626y2[] enumC0626y2ArrM2458a = m2458a();
        f1807x = enumC0626y2ArrM2458a;
        f1808y = AbstractC7198b.m28437a(enumC0626y2ArrM2458a);
    }

    public EnumC0626y2(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC0626y2[] m2458a() {
        return new EnumC0626y2[]{f1800q, f1801r, f1802s, f1803t, f1804u, f1805v, f1806w};
    }

    public static EnumC0626y2 valueOf(String str) {
        return (EnumC0626y2) Enum.valueOf(EnumC0626y2.class, str);
    }

    public static EnumC0626y2[] values() {
        return (EnumC0626y2[]) f1807x.clone();
    }
}
