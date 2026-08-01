package p027E4;

import p118X3.C1684F;

/* JADX INFO: renamed from: E4.q */
/* JADX INFO: loaded from: classes.dex */
public class C0330q extends RuntimeException {
    public C0330q(C0306U c0306u) {
        StringBuilder sb = new StringBuilder("HTTP ");
        C1684F c1684f = c0306u.f1017a;
        sb.append(c1684f.f5741g);
        sb.append(" ");
        sb.append(c1684f.f5740f);
        super(sb.toString());
    }
}
