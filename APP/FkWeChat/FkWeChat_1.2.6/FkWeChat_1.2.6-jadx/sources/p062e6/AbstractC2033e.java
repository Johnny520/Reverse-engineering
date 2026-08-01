package p062e6;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0541m3;
import androidx.compose.runtime.InterfaceC0514i4;
import androidx.compose.runtime.InterfaceC0572r;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import p007a6.AbstractC0122n;
import p010a9.InterfaceC0188p;
import p038ce.InterfaceC1519a;
import p172l8.C4700i0;
import p319w2.C9147v3;

/* JADX INFO: renamed from: e6.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2033e {
    /* JADX INFO: renamed from: a */
    public static C4700i0 m7308a(String str, InterfaceC1519a interfaceC1519a, C9147v3 c9147v3, int i10, InterfaceC0572r interfaceC0572r, int i11) {
        m7309b(str, interfaceC1519a, c9147v3, interfaceC0572r, AbstractC0541m3.m1929a(i10 | 1));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m7309b(String str, InterfaceC1519a interfaceC1519a, C9147v3 c9147v3, InterfaceC0572r interfaceC0572r, final int i10) {
        int i11;
        final String str2;
        final InterfaceC1519a interfaceC1519a2;
        final C9147v3 c9147v32;
        str.getClass();
        interfaceC1519a.getClass();
        c9147v3.getClass();
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(-1466165339);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC0572rMo2181q.mo2162U(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC0572rMo2181q.mo2175k(interfaceC1519a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC0572rMo2181q.mo2162U(c9147v3) ? 256 : 128;
        }
        if (interfaceC0572rMo2181q.mo2144C((i11 & Opcodes.I2S) != 146, i11 & 1)) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(-1466165339, i11, -1, "com.mikepenz.markdown.m3.elements.MarkdownCheckBox (MarkdownCheckBox.kt:17)");
            }
            str2 = str;
            interfaceC1519a2 = interfaceC1519a;
            c9147v32 = c9147v3;
            AbstractC0122n.m287c(str2, interfaceC1519a2, c9147v32, C2031c.f5629a.m7307c(), interfaceC0572rMo2181q, (i11 & 14) | 3072 | (i11 & Opcodes.IREM) | (i11 & 896), 0);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            str2 = str;
            interfaceC1519a2 = interfaceC1519a;
            c9147v32 = c9147v3;
            interfaceC0572rMo2181q.mo2190z();
        }
        InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0514i4Mo2188x.mo1756a(new InterfaceC0188p() { // from class: e6.d
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC2033e.m7308a(str2, interfaceC1519a2, c9147v32, i10, (InterfaceC0572r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
