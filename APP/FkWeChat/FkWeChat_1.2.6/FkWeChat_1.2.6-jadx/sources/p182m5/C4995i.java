package p182m5;

import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;
import okhttp3.internal.url._UrlKt;
import p154k5.C3966d;
import p154k5.C3968e;
import p154k5.C3975i;
import p215oc.C5725t;
import p309v5.AbstractC8826h;
import p309v5.C8823e;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: m5.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4995i {

    /* JADX INFO: renamed from: a */
    public final C3975i f15182a;

    /* JADX INFO: renamed from: b */
    public C3968e f15183b = null;

    /* JADX INFO: renamed from: c */
    public byte[] f15184c = null;

    /* JADX INFO: renamed from: d */
    public int f15185d = 0;

    /* JADX INFO: renamed from: e */
    public TreeMap f15186e = null;

    public C4995i(C3975i c3975i) {
        this.f15182a = c3975i;
    }

    /* JADX INFO: renamed from: a */
    public static void m20147a(C3966d c3966d, int i10, int i11, String str, PrintWriter printWriter, InterfaceC8819a interfaceC8819a) {
        String strM15727I = c3966d.m15727I(str, AbstractC8826h.m33898g(i10) + ": ");
        if (printWriter != null) {
            printWriter.println(strM15727I);
        }
        interfaceC8819a.mo33825d(i11, strM15727I);
    }

    /* JADX INFO: renamed from: b */
    public final void m20148b(String str, PrintWriter printWriter, InterfaceC8819a interfaceC8819a) {
        String str2;
        PrintWriter printWriter2 = printWriter;
        InterfaceC8819a interfaceC8819a2 = interfaceC8819a;
        m20150d();
        boolean z10 = interfaceC8819a2 != null;
        int i10 = z10 ? 6 : 0;
        int i11 = z10 ? 2 : 0;
        int size = this.f15183b.size();
        String str3 = str + "  ";
        if (z10) {
            interfaceC8819a2.mo33825d(0, str + "tries:");
        } else {
            printWriter2.println(str + "tries:");
        }
        for (int i12 = 0; i12 < size; i12++) {
            C3968e.a aVarM15736F = this.f15183b.m15736F(i12);
            C3966d c3966dM15740g = aVarM15736F.m15740g();
            String str4 = str3 + "try " + AbstractC8826h.m33899h(aVarM15736F.m15741h()) + ".." + AbstractC8826h.m33899h(aVarM15736F.m15739c());
            String strM15727I = c3966dM15740g.m15727I(str3, _UrlKt.FRAGMENT_ENCODE_SET);
            if (z10) {
                interfaceC8819a2.mo33825d(i10, str4);
                interfaceC8819a2.mo33825d(i11, strM15727I);
            } else {
                printWriter2.println(str4);
                printWriter2.println(strM15727I);
            }
        }
        if (z10) {
            interfaceC8819a2.mo33825d(0, str + "handlers:");
            interfaceC8819a2.mo33825d(this.f15185d, str3 + "size: " + AbstractC8826h.m33898g(this.f15186e.size()));
            int i13 = 0;
            C3966d c3966d = null;
            for (Map.Entry entry : this.f15186e.entrySet()) {
                C3966d c3966d2 = (C3966d) entry.getKey();
                int iIntValue = ((Integer) entry.getValue()).intValue();
                if (c3966d != null) {
                    str2 = str3;
                    m20147a(c3966d, i13, iIntValue - i13, str2, printWriter2, interfaceC8819a2);
                } else {
                    str2 = str3;
                }
                printWriter2 = printWriter;
                interfaceC8819a2 = interfaceC8819a;
                str3 = str2;
                c3966d = c3966d2;
                i13 = iIntValue;
            }
            m20147a(c3966d, i13, this.f15184c.length - i13, str3, printWriter, interfaceC8819a);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m20149c(C5009p c5009p) {
        TreeMap treeMap;
        m20150d();
        C5024w0 c5024w0M20260u = c5009p.m20260u();
        int size = this.f15183b.size();
        this.f15186e = new TreeMap();
        int i10 = 0;
        while (true) {
            treeMap = this.f15186e;
            if (i10 >= size) {
                break;
            }
            treeMap.put(this.f15183b.m15736F(i10).m15740g(), null);
            i10++;
        }
        if (treeMap.size() > 65535) {
            C5725t.m23179a("too many catch handlers");
            return;
        }
        C8823e c8823e = new C8823e();
        this.f15185d = c8823e.mo33868i(this.f15186e.size());
        for (Map.Entry entry : this.f15186e.entrySet()) {
            C3966d c3966d = (C3966d) entry.getKey();
            int size2 = c3966d.size();
            boolean zM15723E = c3966d.m15723E();
            entry.setValue(Integer.valueOf(c8823e.mo33864c()));
            if (zM15723E) {
                c8823e.m33877u(-(size2 - 1));
                size2--;
            } else {
                c8823e.m33877u(size2);
            }
            for (int i11 = 0; i11 < size2; i11++) {
                C3966d.a aVarM15725G = c3966d.m15725G(i11);
                c8823e.mo33868i(c5024w0M20260u.m20311s(aVarM15725G.m15729c()));
                c8823e.mo33868i(aVarM15725G.m15730g());
            }
            if (zM15723E) {
                c8823e.mo33868i(c3966d.m15725G(size2).m15730g());
            }
        }
        this.f15184c = c8823e.m33874r();
    }

    /* JADX INFO: renamed from: d */
    public final void m20150d() {
        if (this.f15183b == null) {
            this.f15183b = this.f15182a.m15760d();
        }
    }

    /* JADX INFO: renamed from: e */
    public int m20151e() {
        m20150d();
        return this.f15183b.size();
    }

    /* JADX INFO: renamed from: f */
    public int m20152f() {
        return (m20151e() * 8) + this.f15184c.length;
    }

    /* JADX INFO: renamed from: g */
    public void m20153g(C5009p c5009p, InterfaceC8819a interfaceC8819a) {
        m20150d();
        if (interfaceC8819a.mo33828k()) {
            m20148b("  ", null, interfaceC8819a);
        }
        int size = this.f15183b.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3968e.a aVarM15736F = this.f15183b.m15736F(i10);
            int iM15741h = aVarM15736F.m15741h();
            int iM15739c = aVarM15736F.m15739c();
            int i11 = iM15739c - iM15741h;
            if (i11 >= 65536) {
                throw new UnsupportedOperationException("bogus exception range: " + AbstractC8826h.m33901j(iM15741h) + ".." + AbstractC8826h.m33901j(iM15739c));
            }
            interfaceC8819a.writeInt(iM15741h);
            interfaceC8819a.writeShort(i11);
            interfaceC8819a.writeShort(((Integer) this.f15186e.get(aVarM15736F.m15740g())).intValue());
        }
        interfaceC8819a.write(this.f15184c);
    }
}
