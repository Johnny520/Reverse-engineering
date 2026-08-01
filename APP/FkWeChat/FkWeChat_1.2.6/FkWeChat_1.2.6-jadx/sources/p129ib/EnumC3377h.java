package p129ib;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ib.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC3377h {

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ EnumC3377h[] f9219B;

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ InterfaceC7197a f9220C;

    /* JADX INFO: renamed from: q */
    public final String f9230q;

    /* JADX INFO: renamed from: r */
    public static final EnumC3377h f9221r = new EnumC3377h("CAPTURED_TYPE_SCOPE", 0, "No member resolution should be done on captured type, it used only during constraint system resolution");

    /* JADX INFO: renamed from: s */
    public static final EnumC3377h f9222s = new EnumC3377h("INTEGER_LITERAL_TYPE_SCOPE", 1, "Scope for integer literal type (%s)");

    /* JADX INFO: renamed from: t */
    public static final EnumC3377h f9223t = new EnumC3377h("ERASED_RECEIVER_TYPE_SCOPE", 2, "Error scope for erased receiver type");

    /* JADX INFO: renamed from: u */
    public static final EnumC3377h f9224u = new EnumC3377h("SCOPE_FOR_ABBREVIATION_TYPE", 3, "Scope for abbreviation %s");

    /* JADX INFO: renamed from: v */
    public static final EnumC3377h f9225v = new EnumC3377h("STUB_TYPE_SCOPE", 4, "Scope for stub type %s");

    /* JADX INFO: renamed from: w */
    public static final EnumC3377h f9226w = new EnumC3377h("NON_CLASSIFIER_SUPER_TYPE_SCOPE", 5, "A scope for common supertype which is not a normal classifier");

    /* JADX INFO: renamed from: x */
    public static final EnumC3377h f9227x = new EnumC3377h("ERROR_TYPE_SCOPE", 6, "Scope for error type %s");

    /* JADX INFO: renamed from: y */
    public static final EnumC3377h f9228y = new EnumC3377h("UNSUPPORTED_TYPE_SCOPE", 7, "Scope for unsupported type %s");

    /* JADX INFO: renamed from: z */
    public static final EnumC3377h f9229z = new EnumC3377h("SCOPE_FOR_ERROR_CLASS", 8, "Error scope for class %s with arguments: %s");

    /* JADX INFO: renamed from: A */
    public static final EnumC3377h f9218A = new EnumC3377h("SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE", 9, "Error resolution candidate for call %s");

    static {
        EnumC3377h[] enumC3377hArrM12690a = m12690a();
        f9219B = enumC3377hArrM12690a;
        f9220C = AbstractC7198b.m28437a(enumC3377hArrM12690a);
    }

    public EnumC3377h(String str, int i10, String str2) {
        this.f9230q = str2;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC3377h[] m12690a() {
        return new EnumC3377h[]{f9221r, f9222s, f9223t, f9224u, f9225v, f9226w, f9227x, f9228y, f9229z, f9218A};
    }

    public static EnumC3377h valueOf(String str) {
        return (EnumC3377h) Enum.valueOf(EnumC3377h.class, str);
    }

    public static EnumC3377h[] values() {
        return (EnumC3377h[]) f9219B.clone();
    }

    /* JADX INFO: renamed from: c */
    public final String m12691c() {
        return this.f9230q;
    }
}
