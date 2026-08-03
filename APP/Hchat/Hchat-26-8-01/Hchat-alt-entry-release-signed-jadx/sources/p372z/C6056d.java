package p372z;

import p085fg.InterfaceC1231l;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: z.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6056d extends AbstractC6054b {

    /* JADX INFO: renamed from: b */
    public final String f24521b;

    /* JADX INFO: renamed from: c */
    public final int f24522c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1231l f24523d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6056d(Object obj, String str, int i9, InterfaceC1231l interfaceC1231l) {
        super(obj);
        this.f24521b = str;
        this.f24522c = i9;
        this.f24523d = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextContextMenuItem(key=");
        sb2.append(this.f24518a);
        sb2.append(", label=\"");
        sb2.append(this.f24521b);
        sb2.append("\", leadingIcon=");
        return AbstractC3199a.m6841n(sb2, this.f24522c, ')');
    }
}
