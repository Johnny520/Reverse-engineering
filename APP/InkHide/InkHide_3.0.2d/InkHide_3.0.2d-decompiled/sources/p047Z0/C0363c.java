package p047Z0;

import java.util.ArrayList;
import java.util.List;
import p006D.AbstractC0079h;

/* JADX INFO: renamed from: Z0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0363c extends AbstractC0079h {

    /* JADX INFO: renamed from: d */
    public List f856d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public final void m627Y(C0362b c0362b) {
        List arrayList = this.f856d;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f856d = arrayList;
        arrayList.add(c0362b);
    }
}
