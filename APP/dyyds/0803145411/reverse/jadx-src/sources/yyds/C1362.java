package yyds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛶᛶᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1362 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final InterfaceC0942 f6350;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final List f6351;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f6352;

    public C1362(Class cls, Class cls2, Class cls3, List list, InterfaceC0942 interfaceC0942) {
        this.f6350 = interfaceC0942;
        if (list.isEmpty()) {
            C0188.m798("Must not be empty.");
            throw null;
        }
        this.f6351 = list;
        this.f6352 = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f6351.toArray()) + '}';
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final InterfaceC2162 m2761(int i, int i2, C1760 c1760, InterfaceC0740 interfaceC0740, C0822 c0822) {
        InterfaceC0942 interfaceC0942 = this.f6350;
        List list = (List) interfaceC0942.mo1548();
        AbstractC0319.m992(list, "Argument must not be null");
        try {
            List list2 = this.f6351;
            int size = list2.size();
            InterfaceC2162 interfaceC2162M2097 = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    interfaceC2162M2097 = ((C0961) list2.get(i3)).m2097(i, i2, c1760, interfaceC0740, c0822);
                } catch (C0975 e) {
                    list.add(e);
                }
                if (interfaceC2162M2097 != null) {
                    break;
                }
            }
            if (interfaceC2162M2097 != null) {
                return interfaceC2162M2097;
            }
            throw new C0975(this.f6352, new ArrayList(list));
        } finally {
            interfaceC0942.mo1557(list);
        }
    }
}
