package p000;

import android.widget.TextView;
import java.util.List;

/* JADX INFO: renamed from: QA */
/* JADX INFO: loaded from: classes.dex */
public final class C0699QA implements InterfaceC0144DE {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextView f2249a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f2250b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0230FE f2251c;

    public C0699QA(TextView r1, List r2, C0230FE r3) {
        this.f2249a = r1;
        this.f2250b = r2;
        this.f2251c = r3;
    }

    /* JADX INFO: renamed from: a */
    public final void m1429a(int r8) {
        StringBuilder r0 = new StringBuilder();
        int r1 = r8 + 1;
        AbstractC0213Ey.m418p(r0, r1, -492254791727157L);
        List r2 = this.f2250b;
        r0.append(r2.size());
        this.f2249a.setText(r0.toString());
        int r82 = r8 - 1;
        C0230FE r3 = this.f2251c;
        if (r82 < 0) goto L11;
        C0613OA r83 = (C0613OA) r3.findViewWithTag(AbstractC0295Gu.m625r(-492271971596341L) + r82);
        if (r83 == null) goto L11;
        float r4 = r83.f1964e;
        float r5 = r83.f1965f;
        if (r4 == r5) goto L11;
        r83.m1189a(r5, r83.f1970k / 2.0f, r83.f1971l / 2.0f);
    L11:
        if (r1 >= r2.size()) goto L19;
        C0613OA r84 = (C0613OA) r3.findViewWithTag(AbstractC0295Gu.m625r(-492302036367413L) + r1);
        if (r84 == null) goto L20;
        float r12 = r84.f1964e;
        float r22 = r84.f1965f;
        if (r12 == r22) goto L21;
        r84.m1189a(r22, r84.f1970k / 2.0f, r84.f1971l / 2.0f);
        return;
    L21:
        return;
    L20:
        return;
    }
}
