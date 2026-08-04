package yyds;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᛳᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0696 extends AbstractC2019 {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final InterfaceC0732 f3287 = AbstractC1090.m2298(C0696.class);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final boolean f3288;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2623 f3289;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final boolean f3290;

    public C0696(C2623 c2623, boolean z, boolean z2) {
        this.f3289 = c2623;
        this.f3290 = z;
        this.f3288 = z2;
        f3287.mo1690(c2623, Boolean.valueOf(z));
    }

    public final String toString() {
        boolean z = this.f3290;
        C2623 c2623 = this.f3289;
        return (!z || this.f3288) ? c2623.f12909.toString() : AbstractC0902.m2013("!", c2623.f12909.toString());
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final AbstractC2019 m1614(C0864 c0864) {
        C0989 c0989 = c0864.f3966;
        boolean z = this.f3290;
        C2623 c2623 = this.f3289;
        if (z) {
            try {
                C0299 c0299M2175 = C0989.m2175();
                c0299M2175.f1577 = c0989.f4503;
                ((EnumSet) c0299M2175.f1576).addAll(Arrays.asList(EnumC0445.f2268));
                return c2623.m4740(c0864.f3964, c0864.f3965, c0299M2175.m954()).m3505(false) == C0052.f549 ? InterfaceC0540.f2596 : InterfaceC0540.f2595;
            } catch (C1553 unused) {
                return InterfaceC0540.f2596;
            }
        }
        try {
            Object objM1957 = c0864.m1957(c2623);
            c0989.f4503.getClass();
            if (objM1957 instanceof Number) {
                return new C1704(objM1957.toString());
            }
            if (objM1957 instanceof String) {
                return new C2114(objM1957.toString(), false);
            }
            if (objM1957 instanceof Boolean) {
                return Boolean.parseBoolean(objM1957.toString().toString()) ? InterfaceC0540.f2595 : InterfaceC0540.f2596;
            }
            if (objM1957 instanceof OffsetDateTime) {
                return new C2602(objM1957.toString());
            }
            if (objM1957 == null) {
                return InterfaceC0540.f2594;
            }
            C0052 c0052 = c0989.f4503;
            C1449 c1449 = c0989.f4504;
            c0052.getClass();
            if (objM1957 instanceof List) {
                return new C1314(c1449.m2948(objM1957, List.class, c0989));
            }
            c0989.f4503.getClass();
            if (objM1957 instanceof Map) {
                return new C1314(c1449.m2948(objM1957, Map.class, c0989));
            }
            throw new C1738("Could not convert " + objM1957.getClass().toString() + ":" + objM1957.toString() + " to a ValueNode");
        } catch (C1553 unused2) {
            return InterfaceC0540.f2597;
        }
    }

    @Override // yyds.AbstractC2019
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final Class mo1345(C0864 c0864) {
        return Void.class;
    }

    @Override // yyds.AbstractC2019
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C0696 mo1615() {
        return this;
    }

    public C0696(CharSequence charSequence, boolean z) {
        this(C0119.m534(charSequence.toString(), new InterfaceC0845[0]), false, z);
    }
}
