package p357y1;

import gg.AbstractC1416l;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;

/* JADX INFO: renamed from: y1.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5862b {

    /* JADX INFO: renamed from: a */
    public String f23818a;

    /* JADX INFO: renamed from: b */
    public final int[] f23819b = new int[2];

    /* JADX INFO: renamed from: a */
    public abstract int[] mo10564a(int i9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int[] m10565b(int i9, int i10) {
        if (i9 < 0 || i10 < 0 || i9 == i10) {
            return null;
        }
        int[] iArr = this.f23819b;
        iArr[0] = i9;
        iArr[1] = i10;
        return iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m10566c() {
        String str = this.f23818a;
        if (str != null) {
            return str;
        }
        AbstractC1416l.m3831g(WeChatSnsPost.TYPE_TEXT);
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public abstract int[] mo10567d(int i9);
}
