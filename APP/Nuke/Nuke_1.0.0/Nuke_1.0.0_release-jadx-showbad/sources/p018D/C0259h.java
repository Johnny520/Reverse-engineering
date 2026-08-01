package p018D;

import android.view.textclassifier.TextClassification;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: D.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0259h extends AbstractC0253b {

    /* JADX INFO: renamed from: b */
    public final TextClassification f851b;

    /* JADX INFO: renamed from: c */
    public final int f852c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0259h(Object obj, TextClassification textClassification, int i5) {
        super(obj);
        this.f851b = textClassification;
        this.f852c = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb.append(this.f839a);
        sb.append(", textClassification=");
        sb.append(this.f851b);
        sb.append(", index=");
        return AbstractC3202a.m5466a(sb, this.f852c, ')');
    }
}
