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

    public C0699QA(TextView textView, List list, C0230FE c0230fe) {
        this.f2249a = textView;
        this.f2250b = list;
        this.f2251c = c0230fe;
    }

    /* JADX INFO: renamed from: a */
    public final void m1429a(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = i + 1;
        AbstractC0213Ey.m418p(sb, i2, -492254791727157L);
        List list = this.f2250b;
        sb.append(list.size());
        this.f2249a.setText(sb.toString());
        int i3 = i - 1;
        C0230FE c0230fe = this.f2251c;
        if (i3 >= 0) {
            C0613OA c0613oa = (C0613OA) c0230fe.findViewWithTag(AbstractC0295Gu.m625r(-492271971596341L) + i3);
            if (c0613oa != null) {
                float f = c0613oa.f1964e;
                float f2 = c0613oa.f1965f;
                if (f != f2) {
                    c0613oa.m1189a(f2, c0613oa.f1970k / 2.0f, c0613oa.f1971l / 2.0f);
                }
            }
        }
        if (i2 < list.size()) {
            C0613OA c0613oa2 = (C0613OA) c0230fe.findViewWithTag(AbstractC0295Gu.m625r(-492302036367413L) + i2);
            if (c0613oa2 != null) {
                float f3 = c0613oa2.f1964e;
                float f4 = c0613oa2.f1965f;
                if (f3 == f4) {
                    return;
                }
                c0613oa2.m1189a(f4, c0613oa2.f1970k / 2.0f, c0613oa2.f1971l / 2.0f);
            }
        }
    }
}
