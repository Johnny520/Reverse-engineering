package p056e0;

import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: e0.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1965d extends AbstractC1963b {

    /* JADX INFO: renamed from: b */
    public final String f5471b;

    /* JADX INFO: renamed from: c */
    public final int f5472c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0184l f5473d;

    public C1965d(Object obj, String str, int i10, InterfaceC0184l interfaceC0184l) {
        super(obj);
        this.f5471b = str;
        this.f5472c = i10;
        this.f5473d = interfaceC0184l;
    }

    /* JADX INFO: renamed from: b */
    public final String m7114b() {
        return this.f5471b;
    }

    /* JADX INFO: renamed from: c */
    public final int m7115c() {
        return this.f5472c;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC0184l m7116d() {
        return this.f5473d;
    }

    public String toString() {
        return "TextContextMenuItem(key=" + m7110a() + ", label=\"" + this.f5471b + "\", leadingIcon=" + this.f5472c + ')';
    }
}
