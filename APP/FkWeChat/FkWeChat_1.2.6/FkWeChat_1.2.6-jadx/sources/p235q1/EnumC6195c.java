package p235q1;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: q1.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6195c {

    /* JADX INFO: renamed from: q */
    public static final EnumC6195c f19237q = new EnumC6195c("None", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC6195c f19238r = new EnumC6195c("Cancelled", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC6195c f19239s = new EnumC6195c("Redirected", 2);

    /* JADX INFO: renamed from: t */
    public static final EnumC6195c f19240t = new EnumC6195c("RedirectCancelled", 3);

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ EnumC6195c[] f19241u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ InterfaceC7197a f19242v;

    static {
        EnumC6195c[] enumC6195cArrM24350a = m24350a();
        f19241u = enumC6195cArrM24350a;
        f19242v = AbstractC7198b.m28437a(enumC6195cArrM24350a);
    }

    public EnumC6195c(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC6195c[] m24350a() {
        return new EnumC6195c[]{f19237q, f19238r, f19239s, f19240t};
    }

    public static EnumC6195c valueOf(String str) {
        return (EnumC6195c) Enum.valueOf(EnumC6195c.class, str);
    }

    public static EnumC6195c[] values() {
        return (EnumC6195c[]) f19241u.clone();
    }
}
