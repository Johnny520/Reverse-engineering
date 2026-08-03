package p372z;

import android.view.textclassifier.TextClassification;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: z.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6060h extends AbstractC6054b {

    /* JADX INFO: renamed from: b */
    public final TextClassification f24530b;

    /* JADX INFO: renamed from: c */
    public final int f24531c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6060h(Object obj, TextClassification textClassification, int i9) {
        super(obj);
        this.f24530b = textClassification;
        this.f24531c = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb2.append(this.f24518a);
        sb2.append(", textClassification=");
        sb2.append(this.f24530b);
        sb2.append(", index=");
        return AbstractC3199a.m6841n(sb2, this.f24531c, ')');
    }
}
