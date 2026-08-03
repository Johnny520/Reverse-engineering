package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.AbstractC0203e;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.code.C0191u;
import fun.box001.internal.dexformat.writer.data.C0195c;
import fun.box001.internal.dexformat.writer.data.InterfaceC0197e;
import fun.box001.internal.dexmaker.AbstractC0007d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: g.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0091b extends AbstractC0087J {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f332f;

    /* JADX INFO: renamed from: g */
    private final TreeMap f333g;

    /* JADX INFO: renamed from: h */
    private Object f334h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0091b(C0100k c0100k, int i2) {
        super("call_site_ids", c0100k, 4);
        this.f332f = i2;
        if (i2 != 1) {
            this.f333g = new TreeMap();
            this.f334h = new TreeMap();
        } else {
            super("class_defs", c0100k, 4);
            this.f333g = new TreeMap();
            this.f334h = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    private int m260q(C0195c c0195c, int i2, int i3) {
        C0094e c0094e = (C0094e) this.f333g.get(c0195c);
        if (c0094e == null || c0094e.m318f()) {
            return i2;
        }
        if (i3 < 0) {
            throw new RuntimeException("class circularity with " + c0195c);
        }
        int i4 = i3 - 1;
        C0191u c0191uM278l = c0094e.m278l();
        if (c0191uM278l != null) {
            i2 = m260q(c0191uM278l.m451g(), i2, i4);
        }
        InterfaceC0197e interfaceC0197eM277k = c0094e.m277k();
        int iM504B = ((AbstractC0203e) interfaceC0197eM277k).m504B();
        for (int i5 = 0; i5 < iM504B; i5++) {
            i2 = m260q(interfaceC0197eM277k.mo403b(i5), i2, i4);
        }
        c0094e.m320h(i2);
        ((ArrayList) this.f334h).add(c0094e);
        return i2 + 1;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0082E
    /* JADX INFO: renamed from: f */
    public final Collection mo225f() {
        TreeMap treeMap = this.f333g;
        switch (this.f332f) {
            case 0:
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f334h;
                if (arrayList == null) {
                    break;
                }
                break;
        }
        return treeMap.values();
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0087J
    /* JADX INFO: renamed from: o */
    protected final void mo255o() {
        TreeMap treeMap = this.f333g;
        switch (this.f332f) {
            case 0:
                Iterator it = treeMap.values().iterator();
                if (it.hasNext()) {
                    AbstractC0007d.m47a(it.next());
                    throw null;
                }
                return;
            default:
                int size = treeMap.size();
                this.f334h = new ArrayList(size);
                Iterator it2 = treeMap.keySet().iterator();
                int iM260q = 0;
                while (it2.hasNext()) {
                    iM260q = m260q((C0195c) it2.next(), iM260q, size - iM260q);
                }
                return;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m261p(C0094e c0094e) {
        try {
            C0195c c0195cM451g = c0094e.m279m().m451g();
            m251k();
            TreeMap treeMap = this.f333g;
            if (treeMap.get(c0195cM451g) == null) {
                treeMap.put(c0195cM451g, c0094e);
            } else {
                throw new IllegalArgumentException("already added: " + c0195cM451g);
            }
        } catch (NullPointerException unused) {
            throw new NullPointerException("clazz == null");
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m262r(C0202d c0202d) {
        m250j();
        int size = this.f333g.size();
        int iM247e = size == 0 ? 0 : m247e();
        if (c0202d.m486d()) {
            c0202d.m484b(4, "class_defs_size: ".concat(RuntimeDexGenerator.m13s(size)));
            c0202d.m484b(4, "class_defs_off:  ".concat(RuntimeDexGenerator.m13s(iM247e)));
        }
        c0202d.m497q(size);
        c0202d.m497q(iM247e);
    }
}
