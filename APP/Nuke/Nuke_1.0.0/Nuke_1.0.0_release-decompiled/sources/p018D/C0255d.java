package p018D;

import p112W2.InterfaceC1601c;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: D.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0255d extends AbstractC0253b {

    /* JADX INFO: renamed from: b */
    public final String f842b;

    /* JADX INFO: renamed from: c */
    public final int f843c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1601c f844d;

    public C0255d(Object obj, String str, int i5, InterfaceC1601c interfaceC1601c) {
        super(obj);
        this.f842b = str;
        this.f843c = i5;
        this.f844d = interfaceC1601c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.f839a);
        sb.append(", label=\"");
        sb.append(this.f842b);
        sb.append("\", leadingIcon=");
        return AbstractC3202a.m5466a(sb, this.f843c, ')');
    }
}
