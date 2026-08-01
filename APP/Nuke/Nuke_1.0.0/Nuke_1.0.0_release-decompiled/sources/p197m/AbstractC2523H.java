package p197m;

import java.util.LinkedHashMap;
import p153e1.C2014j;
import p153e1.C2016l;
import p203n.AbstractC2649d;
import p203n.C2626I;
import p203n.C2650d0;
import p203n.C2652e0;
import p203n.InterfaceC2677v;

/* JADX INFO: renamed from: m.H */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2523H {

    /* JADX INFO: renamed from: a */
    public static final C2652e0 f8063a = new C2652e0(C2543c.f8118i, C2543c.f8119j);

    /* JADX INFO: renamed from: b */
    public static final C2626I f8064b = AbstractC2649d.m4617j(0.0f, 400.0f, null, 5);

    /* JADX INFO: renamed from: c */
    public static final C2626I f8065c;

    /* JADX INFO: renamed from: d */
    public static final C2626I f8066d;

    static {
        AbstractC2649d.m4617j(0.0f, 400.0f, null, 5);
        long j5 = 1;
        long j6 = (j5 & 4294967295L) | (j5 << 32);
        f8065c = AbstractC2649d.m4617j(0.0f, 400.0f, new C2014j(j6), 1);
        f8066d = AbstractC2649d.m4617j(0.0f, 400.0f, new C2016l(j6), 1);
    }

    /* JADX INFO: renamed from: a */
    public static C2528M m4465a(C2650d0 c2650d0, int i5) {
        InterfaceC2677v interfaceC2677vM4617j = c2650d0;
        if ((i5 & 1) != 0) {
            interfaceC2677vM4617j = AbstractC2649d.m4617j(0.0f, 400.0f, null, 5);
        }
        return new C2528M(new C2540Z(new C2530O(interfaceC2677vM4617j), (C2538X) null, (AbstractC2563w) null, (C2535U) null, (LinkedHashMap) null, 126));
    }

    /* JADX INFO: renamed from: b */
    public static C2529N m4466b(C2650d0 c2650d0, int i5) {
        InterfaceC2677v interfaceC2677vM4617j = c2650d0;
        if ((i5 & 1) != 0) {
            interfaceC2677vM4617j = AbstractC2649d.m4617j(0.0f, 400.0f, null, 5);
        }
        return new C2529N(new C2540Z(new C2530O(interfaceC2677vM4617j), (C2538X) null, (AbstractC2563w) null, (C2535U) null, (LinkedHashMap) null, 126));
    }
}
