package yyds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛵᲈᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1255 implements InterfaceC0724, InterfaceC0306 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public List f5776;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public boolean f5777;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f5778;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public InterfaceC0306 f5779;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ArrayList f5780;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public EnumC0296 f5781;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0644 f5782;

    public C1255(ArrayList arrayList, C0644 c0644) {
        this.f5782 = c0644;
        if (arrayList.isEmpty()) {
            C0188.m798("Must not be empty.");
            throw null;
        }
        this.f5780 = arrayList;
        this.f5778 = 0;
    }

    @Override // yyds.InterfaceC0724
    public final void cancel() {
        this.f5777 = true;
        Iterator it = this.f5780.iterator();
        while (it.hasNext()) {
            ((InterfaceC0724) it.next()).cancel();
        }
    }

    @Override // yyds.InterfaceC0306
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo546(Object obj) {
        if (obj != null) {
            this.f5779.mo546(obj);
        } else {
            m2533();
        }
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Class mo417() {
        return ((InterfaceC0724) this.f5780.get(0)).mo417();
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo512() {
        List list = this.f5776;
        if (list != null) {
            this.f5782.mo1557(list);
        }
        this.f5776 = null;
        Iterator it = this.f5780.iterator();
        while (it.hasNext()) {
            ((InterfaceC0724) it.next()).mo512();
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m2533() {
        if (this.f5777) {
            return;
        }
        if (this.f5778 < this.f5780.size() - 1) {
            this.f5778++;
            mo514(this.f5781, this.f5779);
        } else {
            AbstractC0319.m990(this.f5776);
            this.f5779.mo567(new C0975("Fetch failed", new ArrayList(this.f5776)));
        }
    }

    @Override // yyds.InterfaceC0306
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo567(Exception exc) {
        List list = this.f5776;
        AbstractC0319.m992(list, "Argument must not be null");
        list.add(exc);
        m2533();
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final int mo513() {
        return ((InterfaceC0724) this.f5780.get(0)).mo513();
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo514(EnumC0296 enumC0296, InterfaceC0306 interfaceC0306) {
        this.f5781 = enumC0296;
        this.f5779 = interfaceC0306;
        this.f5776 = (List) this.f5782.mo1548();
        ((InterfaceC0724) this.f5780.get(this.f5778)).mo514(enumC0296, this);
        if (this.f5777) {
            cancel();
        }
    }
}
