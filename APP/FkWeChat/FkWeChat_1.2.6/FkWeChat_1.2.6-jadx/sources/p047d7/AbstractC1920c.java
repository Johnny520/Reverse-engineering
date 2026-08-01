package p047d7;

import p010a9.InterfaceC0184l;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p340x7.AbstractC9461a;
import p356y7.C9606b;
import p356y7.C9607c;

/* JADX INFO: renamed from: d7.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1920c {
    /* JADX INFO: renamed from: a */
    public static C4700i0 m6963a(String str, String str2, C9607c c9607c) {
        c9607c.getClass();
        c9607c.m37576x().add(new C9606b(str, str2, C9606b.a.f32707r));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m6964b(String str, String str2, C9607c c9607c) {
        c9607c.getClass();
        c9607c.m37576x().add(new C9606b(str, str2, C9606b.a.f32706q));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m6965c(final String str, final String str2, InterfaceC5976f interfaceC5976f) {
        Object objM36878c = AbstractC9461a.m36878c(C9607c.f32710s, new InterfaceC0184l() { // from class: d7.b
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC1920c.m6963a(str, str2, (C9607c) obj);
            }
        }, interfaceC5976f);
        return objM36878c == AbstractC6325c.m24992g() ? objM36878c : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: d */
    public static final Object m6966d(final String str, final String str2, InterfaceC5976f interfaceC5976f) {
        Object objM36878c = AbstractC9461a.m36878c(C9607c.f32710s, new InterfaceC0184l() { // from class: d7.a
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC1920c.m6964b(str, str2, (C9607c) obj);
            }
        }, interfaceC5976f);
        return objM36878c == AbstractC6325c.m24992g() ? objM36878c : C4700i0.f13910a;
    }
}
