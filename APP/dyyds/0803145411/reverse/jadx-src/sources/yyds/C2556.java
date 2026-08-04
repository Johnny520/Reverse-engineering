package yyds;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: yyds.ᲇᲇᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2556 implements InterfaceC0652 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C0629 f12624;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2133 f12625;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final ConcurrentHashMap f12626 = new ConcurrentHashMap();

    static {
        int i = 0;
        f12624 = new C0629(i);
        new C0629(i);
    }

    public C2556(C2133 c2133) {
        this.f12625 = c2133;
    }

    @Override // yyds.InterfaceC0652
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final AbstractC2720 mo976(C0114 c0114, C2805 c2805) {
        InterfaceC0048 interfaceC0048 = (InterfaceC0048) c2805.f13682.getAnnotation(InterfaceC0048.class);
        if (interfaceC0048 == null) {
            return null;
        }
        return m4641(this.f12625, c0114, c2805, interfaceC0048, true);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final AbstractC2720 m4641(C2133 c2133, C0114 c0114, C2805 c2805, InterfaceC0048 interfaceC0048, boolean z) {
        AbstractC2720 abstractC2720Mo976;
        Object objMo807 = c2133.m4051(new C2805(interfaceC0048.value()), true).mo807();
        boolean zNullSafe = interfaceC0048.nullSafe();
        if (objMo807 instanceof AbstractC2720) {
            abstractC2720Mo976 = (AbstractC2720) objMo807;
        } else {
            if (!(objMo807 instanceof InterfaceC0652)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objMo807.getClass().getName() + " as a @JsonAdapter for " + AbstractC1917.m3703(c2805.f13683) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            InterfaceC0652 interfaceC0652 = (InterfaceC0652) objMo807;
            if (z) {
                InterfaceC0652 interfaceC06522 = (InterfaceC0652) this.f12626.putIfAbsent(c2805.f13682, interfaceC0652);
                if (interfaceC06522 != null) {
                    interfaceC0652 = interfaceC06522;
                }
            }
            abstractC2720Mo976 = interfaceC0652.mo976(c0114, c2805);
        }
        return (abstractC2720Mo976 == null || !zNullSafe) ? abstractC2720Mo976 : abstractC2720Mo976.m4828();
    }
}
