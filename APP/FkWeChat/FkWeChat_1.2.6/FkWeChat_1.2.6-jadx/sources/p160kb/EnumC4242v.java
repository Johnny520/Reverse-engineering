package p160kb;

import okhttp3.internal.url._UrlKt;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: kb.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC4242v {

    /* JADX INFO: renamed from: r */
    public static final EnumC4242v f12416r = new EnumC4242v("IN", 0, "in");

    /* JADX INFO: renamed from: s */
    public static final EnumC4242v f12417s = new EnumC4242v("OUT", 1, "out");

    /* JADX INFO: renamed from: t */
    public static final EnumC4242v f12418t = new EnumC4242v("INV", 2, _UrlKt.FRAGMENT_ENCODE_SET);

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ EnumC4242v[] f12419u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ InterfaceC7197a f12420v;

    /* JADX INFO: renamed from: q */
    public final String f12421q;

    static {
        EnumC4242v[] enumC4242vArrM16719a = m16719a();
        f12419u = enumC4242vArrM16719a;
        f12420v = AbstractC7198b.m28437a(enumC4242vArrM16719a);
    }

    public EnumC4242v(String str, int i10, String str2) {
        this.f12421q = str2;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC4242v[] m16719a() {
        return new EnumC4242v[]{f12416r, f12417s, f12418t};
    }

    public static EnumC4242v valueOf(String str) {
        return (EnumC4242v) Enum.valueOf(EnumC4242v.class, str);
    }

    public static EnumC4242v[] values() {
        return (EnumC4242v[]) f12419u.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f12421q;
    }
}
