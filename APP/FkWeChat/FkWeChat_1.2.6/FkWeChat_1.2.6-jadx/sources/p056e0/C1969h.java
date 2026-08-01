package p056e0;

import android.view.textclassifier.TextClassification;

/* JADX INFO: renamed from: e0.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1969h extends AbstractC1963b {

    /* JADX INFO: renamed from: b */
    public final TextClassification f5483b;

    /* JADX INFO: renamed from: c */
    public final int f5484c;

    public C1969h(Object obj, TextClassification textClassification, int i10) {
        super(obj);
        this.f5483b = textClassification;
        this.f5484c = i10;
    }

    /* JADX INFO: renamed from: b */
    public final int m7122b() {
        return this.f5484c;
    }

    /* JADX INFO: renamed from: c */
    public final TextClassification m7123c() {
        return this.f5483b;
    }

    public String toString() {
        return "TextContextMenuRemoteActionItem(key=" + m7110a() + ", textClassification=" + this.f5483b + ", index=" + this.f5484c + ')';
    }
}
