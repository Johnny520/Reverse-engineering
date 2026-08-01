package p062e6;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0190r;
import p057e1.AbstractC1984l;
import p165l1.InterfaceC4507m;
import p172l8.C4700i0;
import p264s0.AbstractC7017y0;
import p277t2.AbstractC8070f0;
import p277t2.AbstractC8093v;
import p277t2.C8079k;
import p277t2.InterfaceC8074h0;

/* JADX INFO: renamed from: e6.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2031c {

    /* JADX INFO: renamed from: a */
    public static final C2031c f5629a = new C2031c();

    /* JADX INFO: renamed from: b */
    public static InterfaceC0190r f5630b = AbstractC1984l.m7162b(697710124, false, new InterfaceC0190r() { // from class: e6.a
        @Override // p010a9.InterfaceC0190r
        /* JADX INFO: renamed from: p */
        public final Object mo284p(Object obj, Object obj2, Object obj3, Object obj4) {
            return C2031c.m7305b(((Boolean) obj).booleanValue(), (InterfaceC4507m) obj2, (InterfaceC0572r) obj3, ((Integer) obj4).intValue());
        }
    });

    /* JADX INFO: renamed from: b */
    public static C4700i0 m7305b(final boolean z10, InterfaceC4507m interfaceC4507m, InterfaceC0572r interfaceC0572r, int i10) {
        int i11;
        interfaceC4507m.getClass();
        if ((i10 & 6) == 0) {
            i11 = (interfaceC0572r.mo2167c(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC0572r.mo2162U(interfaceC4507m) ? 32 : 16;
        }
        if (interfaceC0572r.mo2144C((i11 & Opcodes.I2S) != 146, i11 & 1)) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(697710124, i11, -1, "com.mikepenz.markdown.m3.elements.ComposableSingletons$MarkdownCheckBoxKt.lambda$697710124.<anonymous> (MarkdownCheckBox.kt:22)");
            }
            int i12 = i11 & 14;
            boolean z11 = i12 == 4;
            Object objMo2170f = interfaceC0572r.mo2170f();
            if (z11 || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
                objMo2170f = new InterfaceC0184l() { // from class: e6.b
                    @Override // p010a9.InterfaceC0184l
                    /* JADX INFO: renamed from: m */
                    public final Object mo27m(Object obj) {
                        return C2031c.m7306d(z10, (InterfaceC8074h0) obj);
                    }
                };
                interfaceC0572r.mo2153L(objMo2170f);
            }
            AbstractC7017y0.m27687f(z10, null, AbstractC8093v.m31267d(interfaceC4507m, false, (InterfaceC0184l) objMo2170f, 1, null), false, null, null, interfaceC0572r, i12 | 48, 56);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0572r.mo2190z();
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: d */
    public static final C4700i0 m7306d(boolean z10, InterfaceC8074h0 interfaceC8074h0) {
        interfaceC8074h0.getClass();
        AbstractC8070f0.m31117i0(interfaceC8074h0, C8079k.f26965b.m31197c());
        AbstractC8070f0.m31129o0(interfaceC8074h0, z10 ? "Checked" : "Unchecked");
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0190r m7307c() {
        return f5630b;
    }
}
