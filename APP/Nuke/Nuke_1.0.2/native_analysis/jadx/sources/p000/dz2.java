package p000;

import android.view.textclassifier.TextClassification;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dz2 extends py2 {

    /* JADX INFO: renamed from: b */
    public final TextClassification f2271b;

    /* JADX INFO: renamed from: c */
    public final int f2272c;

    public dz2(Object obj, TextClassification textClassification, int i) {
        super(obj);
        this.f2271b = textClassification;
        this.f2272c = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb.append(this.f8648a);
        sb.append(", textClassification=");
        sb.append(this.f2271b);
        sb.append(", index=");
        return vi0.m5694m(sb, this.f2272c, ')');
    }
}
