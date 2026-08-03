package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: No */
/* JADX INFO: loaded from: classes.dex */
public final class C0590No {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1024Xt f1914a;

    /* JADX INFO: renamed from: b */
    public final List f1915b;

    /* JADX INFO: renamed from: c */
    public final String f1916c;

    public C0590No(Class cls, Class cls2, Class cls3, List list, InterfaceC1024Xt interfaceC1024Xt) {
        this.f1914a = interfaceC1024Xt;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f1915b = list;
        this.f1916c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC2389pw m1162a(int i, int i2, C0307H5 c0307h5, InterfaceC2713xc interfaceC2713xc, C2644vt c2644vt) {
        InterfaceC1024Xt interfaceC1024Xt = this.f1914a;
        List list = (List) interfaceC1024Xt.mo1935c();
        AbstractC0714Qj.m1488j("Argument must not be null", list);
        try {
            List list2 = this.f1915b;
            int size = list2.size();
            InterfaceC2389pw interfaceC2389pwM804a = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    interfaceC2389pwM804a = ((C0363Ic) list2.get(i3)).m804a(i, i2, c0307h5, interfaceC2713xc, c2644vt);
                } catch (C0842Tj e) {
                    list.add(e);
                }
                if (interfaceC2389pwM804a != null) {
                    break;
                }
            }
            if (interfaceC2389pwM804a != null) {
                return interfaceC2389pwM804a;
            }
            throw new C0842Tj(this.f1916c, new ArrayList(list));
        } finally {
            interfaceC1024Xt.mo1934a(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f1915b.toArray()) + '}';
    }
}
