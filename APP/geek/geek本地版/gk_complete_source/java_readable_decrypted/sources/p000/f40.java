package p000;

import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f40 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1888a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g40 f1889b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0103cg f1890c;

    public /* synthetic */ f40(C0103cg c0103cg, g40 g40Var, int i) {
        this.f1888a = i;
        this.f1890c = c0103cg;
        this.f1889b = g40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1888a) {
            case Base64.DEFAULT /* 0 */:
                ArrayList arrayList = this.f1890c.f958b;
                g40 g40Var = this.f1889b;
                if (arrayList.contains(g40Var)) {
                    z30.m2756a(g40Var.f2016c.f3229E, g40Var.f2014a);
                }
                break;
            default:
                C0103cg c0103cg = this.f1890c;
                ArrayList arrayList2 = c0103cg.f958b;
                g40 g40Var2 = this.f1889b;
                arrayList2.remove(g40Var2);
                c0103cg.f959c.remove(g40Var2);
                break;
        }
    }
}
