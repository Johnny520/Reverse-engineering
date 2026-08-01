package p088R1;

import com.bumptech.glide.load.data.InterfaceC1936f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p013C0.C0236c;
import p078P1.C1147i;
import p195l2.AbstractC2503g;
import p223q1.InterfaceC2909c;

/* JADX INFO: renamed from: R1.B */
/* JADX INFO: loaded from: classes.dex */
public final class C1192B {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2909c f3910a;

    /* JADX INFO: renamed from: b */
    public final List f3911b;

    /* JADX INFO: renamed from: c */
    public final String f3912c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1192B(Class cls, Class cls2, Class cls3, List list, InterfaceC2909c interfaceC2909c) {
        this.f3910a = interfaceC2909c;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f3911b = list;
        this.f3912c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final InterfaceC1194D m2251a(int i5, int i6, C0236c c0236c, C1147i c1147i, InterfaceC1936f interfaceC1936f) {
        InterfaceC2909c interfaceC2909c = this.f3910a;
        List list = (List) interfaceC2909c.mo99c();
        AbstractC2503g.m4445c(list, "Argument must not be null");
        try {
            List list2 = this.f3911b;
            int size = list2.size();
            InterfaceC1194D interfaceC1194DM2285a = null;
            for (int i7 = 0; i7 < size; i7++) {
                try {
                    interfaceC1194DM2285a = ((C1210k) list2.get(i7)).m2285a(i5, i6, c0236c, c1147i, interfaceC1936f);
                } catch (C1224y e5) {
                    list.add(e5);
                }
                if (interfaceC1194DM2285a != null) {
                    break;
                }
            }
            if (interfaceC1194DM2285a != null) {
                return interfaceC1194DM2285a;
            }
            throw new C1224y(this.f3912c, new ArrayList(list));
        } finally {
            interfaceC2909c.mo97a(list);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f3911b.toArray()) + '}';
    }
}
