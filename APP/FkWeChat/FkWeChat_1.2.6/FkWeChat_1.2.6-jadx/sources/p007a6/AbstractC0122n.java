package p007a6;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0541m3;
import androidx.compose.runtime.InterfaceC0572r;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import p004a3.AbstractC0042h;
import p010a9.InterfaceC0190r;
import p038ce.InterfaceC1519a;
import p165l1.InterfaceC4507m;
import p172l8.C4700i0;
import p319w2.C9147v3;

/* JADX INFO: renamed from: a6.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0122n {
    /* JADX INFO: renamed from: a */
    public static C4700i0 m285a(InterfaceC1519a interfaceC1519a, C9147v3 c9147v3, boolean z10, InterfaceC4507m interfaceC4507m, InterfaceC0572r interfaceC0572r, int i10) {
        int i11;
        InterfaceC4507m interfaceC4507m2;
        interfaceC4507m.getClass();
        if ((i10 & 6) == 0) {
            i11 = i10 | (interfaceC0572r.mo2167c(z10) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            interfaceC4507m2 = interfaceC4507m;
            i11 |= interfaceC0572r.mo2162U(interfaceC4507m2) ? 32 : 16;
        } else {
            interfaceC4507m2 = interfaceC4507m;
        }
        if (interfaceC0572r.mo2144C((i11 & Opcodes.I2S) != 146, i11 & 1)) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(-565052515, i11, -1, "com.mikepenz.markdown.compose.elements.MarkdownCheckBox.<anonymous> (MarkdownCheckBox.kt:18)");
            }
            AbstractC0137q2.m341u("[" + (z10 ? "x" : " ") + "] ", interfaceC1519a, interfaceC4507m2, C9147v3.m35538c(c9147v3, 0L, 0L, null, null, null, AbstractC0042h.f71b.m153b(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null), interfaceC0572r, (i11 << 3) & 896, 0);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0572r.mo2190z();
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m286b(String str, InterfaceC1519a interfaceC1519a, C9147v3 c9147v3, InterfaceC0190r interfaceC0190r, int i10, int i11, InterfaceC0572r interfaceC0572r, int i12) {
        m287c(str, interfaceC1519a, c9147v3, interfaceC0190r, interfaceC0572r, AbstractC0541m3.m1929a(i10 | 1), i11);
        return C4700i0.f13910a;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m287c(final java.lang.String r22, final p038ce.InterfaceC1519a r23, final p319w2.C9147v3 r24, p010a9.InterfaceC0190r r25, androidx.compose.runtime.InterfaceC0572r r26, final int r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p007a6.AbstractC0122n.m287c(java.lang.String, ce.a, w2.v3, a9.r, androidx.compose.runtime.r, int, int):void");
    }
}
