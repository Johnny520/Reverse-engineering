package p314vb;

import java.util.concurrent.TimeUnit;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: vb.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC8900g {

    /* JADX INFO: renamed from: r */
    public static final EnumC8900g f29493r = new EnumC8900g("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* JADX INFO: renamed from: s */
    public static final EnumC8900g f29494s = new EnumC8900g("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* JADX INFO: renamed from: t */
    public static final EnumC8900g f29495t = new EnumC8900g("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* JADX INFO: renamed from: u */
    public static final EnumC8900g f29496u = new EnumC8900g("SECONDS", 3, TimeUnit.SECONDS);

    /* JADX INFO: renamed from: v */
    public static final EnumC8900g f29497v = new EnumC8900g("MINUTES", 4, TimeUnit.MINUTES);

    /* JADX INFO: renamed from: w */
    public static final EnumC8900g f29498w = new EnumC8900g("HOURS", 5, TimeUnit.HOURS);

    /* JADX INFO: renamed from: x */
    public static final EnumC8900g f29499x = new EnumC8900g("DAYS", 6, TimeUnit.DAYS);

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC8900g[] f29500y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ InterfaceC7197a f29501z;

    /* JADX INFO: renamed from: q */
    public final TimeUnit f29502q;

    static {
        EnumC8900g[] enumC8900gArrM34165a = m34165a();
        f29500y = enumC8900gArrM34165a;
        f29501z = AbstractC7198b.m28437a(enumC8900gArrM34165a);
    }

    public EnumC8900g(String str, int i10, TimeUnit timeUnit) {
        this.f29502q = timeUnit;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC8900g[] m34165a() {
        return new EnumC8900g[]{f29493r, f29494s, f29495t, f29496u, f29497v, f29498w, f29499x};
    }

    public static EnumC8900g valueOf(String str) {
        return (EnumC8900g) Enum.valueOf(EnumC8900g.class, str);
    }

    public static EnumC8900g[] values() {
        return (EnumC8900g[]) f29500y.clone();
    }

    /* JADX INFO: renamed from: c */
    public final TimeUnit m34166c() {
        return this.f29502q;
    }
}
