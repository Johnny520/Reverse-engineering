package p186m9;

import java.util.Set;
import p024b9.AbstractC1043k;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5068b1;
import p213oa.C5692c;
import p213oa.C5695f;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m9.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC5132m {

    /* JADX INFO: renamed from: A */
    public static final EnumC5132m f15458A;

    /* JADX INFO: renamed from: B */
    public static final EnumC5132m f15459B;

    /* JADX INFO: renamed from: C */
    public static final EnumC5132m f15460C;

    /* JADX INFO: renamed from: D */
    public static final EnumC5132m f15461D;

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC5132m[] f15462E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ InterfaceC7197a f15463F;

    /* JADX INFO: renamed from: u */
    public static final a f15464u;

    /* JADX INFO: renamed from: v */
    public static final Set f15465v;

    /* JADX INFO: renamed from: w */
    public static final EnumC5132m f15466w = new EnumC5132m("BOOLEAN", 0, "Boolean");

    /* JADX INFO: renamed from: x */
    public static final EnumC5132m f15467x;

    /* JADX INFO: renamed from: y */
    public static final EnumC5132m f15468y;

    /* JADX INFO: renamed from: z */
    public static final EnumC5132m f15469z;

    /* JADX INFO: renamed from: q */
    public final C5695f f15470q;

    /* JADX INFO: renamed from: r */
    public final C5695f f15471r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC4705l f15472s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC4705l f15473t;

    static {
        EnumC5132m enumC5132m = new EnumC5132m("CHAR", 1, "Char");
        f15467x = enumC5132m;
        EnumC5132m enumC5132m2 = new EnumC5132m("BYTE", 2, "Byte");
        f15468y = enumC5132m2;
        EnumC5132m enumC5132m3 = new EnumC5132m("SHORT", 3, "Short");
        f15469z = enumC5132m3;
        EnumC5132m enumC5132m4 = new EnumC5132m("INT", 4, "Int");
        f15458A = enumC5132m4;
        EnumC5132m enumC5132m5 = new EnumC5132m("FLOAT", 5, "Float");
        f15459B = enumC5132m5;
        EnumC5132m enumC5132m6 = new EnumC5132m("LONG", 6, "Long");
        f15460C = enumC5132m6;
        EnumC5132m enumC5132m7 = new EnumC5132m("DOUBLE", 7, "Double");
        f15461D = enumC5132m7;
        EnumC5132m[] enumC5132mArrM20944a = m20944a();
        f15462E = enumC5132mArrM20944a;
        f15463F = AbstractC7198b.m28437a(enumC5132mArrM20944a);
        f15464u = new a(null);
        f15465v = AbstractC5068b1.m20487i(enumC5132m, enumC5132m2, enumC5132m3, enumC5132m4, enumC5132m5, enumC5132m6, enumC5132m7);
    }

    public EnumC5132m(String str, int i10, String str2) {
        C5695f c5695fM23027j = C5695f.m23027j(str2);
        c5695fM23027j.getClass();
        this.f15470q = c5695fM23027j;
        C5695f c5695fM23027j2 = C5695f.m23027j(str2 + "Array");
        c5695fM23027j2.getClass();
        this.f15471r = c5695fM23027j2;
        EnumC4708o enumC4708o = EnumC4708o.f13922r;
        this.f15472s = AbstractC4706m.m18788b(enumC4708o, new C5130k(this));
        this.f15473t = AbstractC4706m.m18788b(enumC4708o, new C5131l(this));
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC5132m[] m20944a() {
        return new EnumC5132m[]{f15466w, f15467x, f15468y, f15469z, f15458A, f15459B, f15460C, f15461D};
    }

    /* JADX INFO: renamed from: h */
    public static final C5692c m20947h(EnumC5132m enumC5132m) {
        return C5135p.f15488A.m22995b(enumC5132m.f15471r);
    }

    /* JADX INFO: renamed from: m */
    public static final C5692c m20948m(EnumC5132m enumC5132m) {
        return C5135p.f15488A.m22995b(enumC5132m.f15470q);
    }

    public static EnumC5132m valueOf(String str) {
        return (EnumC5132m) Enum.valueOf(EnumC5132m.class, str);
    }

    public static EnumC5132m[] values() {
        return (EnumC5132m[]) f15462E.clone();
    }

    /* JADX INFO: renamed from: i */
    public final C5692c m20949i() {
        return (C5692c) this.f15473t.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final C5695f m20950j() {
        return this.f15471r;
    }

    /* JADX INFO: renamed from: k */
    public final C5692c m20951k() {
        return (C5692c) this.f15472s.getValue();
    }

    /* JADX INFO: renamed from: l */
    public final C5695f m20952l() {
        return this.f15470q;
    }

    /* JADX INFO: renamed from: m9.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
