package p339x6;

import java.util.ArrayList;
import java.util.Iterator;
import p024b9.AbstractC1043k;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5116y;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x6.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC9454g {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ InterfaceC7197a f32133A;

    /* JADX INFO: renamed from: r */
    public static final a f32134r;

    /* JADX INFO: renamed from: s */
    public static final EnumC9454g[] f32135s;

    /* JADX INFO: renamed from: t */
    public static final int[] f32136t;

    /* JADX INFO: renamed from: u */
    public static final int f32137u;

    /* JADX INFO: renamed from: v */
    public static final EnumC9454g f32138v = new EnumC9454g("READ", 0, 1);

    /* JADX INFO: renamed from: w */
    public static final EnumC9454g f32139w = new EnumC9454g("WRITE", 1, 4);

    /* JADX INFO: renamed from: x */
    public static final EnumC9454g f32140x = new EnumC9454g("ACCEPT", 2, 16);

    /* JADX INFO: renamed from: y */
    public static final EnumC9454g f32141y = new EnumC9454g("CONNECT", 3, 8);

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC9454g[] f32142z;

    /* JADX INFO: renamed from: q */
    public final int f32143q;

    static {
        EnumC9454g[] enumC9454gArrM36849a = m36849a();
        f32142z = enumC9454gArrM36849a;
        f32133A = AbstractC7198b.m28437a(enumC9454gArrM36849a);
        f32134r = new a(null);
        f32135s = (EnumC9454g[]) m36852h().toArray(new EnumC9454g[0]);
        InterfaceC7197a interfaceC7197aM36852h = m36852h();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(interfaceC7197aM36852h, 10));
        Iterator<E> it = interfaceC7197aM36852h.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((EnumC9454g) it.next()).f32143q));
        }
        f32136t = AbstractC5081g0.m20552W0(arrayList);
        f32137u = m36852h().size();
    }

    public EnumC9454g(String str, int i10, int i11) {
        this.f32143q = i11;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC9454g[] m36849a() {
        return new EnumC9454g[]{f32138v, f32139w, f32140x, f32141y};
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC7197a m36852h() {
        return f32133A;
    }

    public static EnumC9454g valueOf(String str) {
        return (EnumC9454g) Enum.valueOf(EnumC9454g.class, str);
    }

    public static EnumC9454g[] values() {
        return (EnumC9454g[]) f32142z.clone();
    }

    /* JADX INFO: renamed from: i */
    public final int m36853i() {
        return this.f32143q;
    }

    /* JADX INFO: renamed from: x6.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC9454g[] m36854a() {
            return EnumC9454g.f32135s;
        }

        /* JADX INFO: renamed from: b */
        public final int[] m36855b() {
            return EnumC9454g.f32136t;
        }

        public a() {
        }
    }
}
