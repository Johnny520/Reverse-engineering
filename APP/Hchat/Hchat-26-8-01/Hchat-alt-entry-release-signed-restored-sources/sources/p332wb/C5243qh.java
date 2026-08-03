package p332wb;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import ca.C0524k;
import java.util.List;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p051db.C0765c;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p144k.C2209s1;
import p276sf.C3958e;
import p276sf.C3967n;
import p304uf.C4329c;

/* JADX INFO: renamed from: wb.qh */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5243qh implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20222g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f20223h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ List f20224i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1231l f20225j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0765c f20226k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f20227l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Context f20228m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5243qh(Activity activity, long j3, List list, InterfaceC1231l interfaceC1231l, C0765c c0765c, int i9) {
        this.f20228m = activity;
        this.f20223h = j3;
        this.f20224i = list;
        this.f20225j = interfaceC1231l;
        this.f20226k = c0765c;
        this.f20227l = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f20222g) {
            case 0:
                Context context = this.f20228m;
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity == null) {
                    Toast.makeText(context, "当前页面无法打开时间选择器", 0).show();
                } else {
                    List list = this.f20224i;
                    boolean z9 = list.size() > 1;
                    long j3 = this.f20223h;
                    InterfaceC1231l interfaceC1231l = this.f20225j;
                    C0765c c0765c = this.f20226k;
                    int i9 = this.f20227l;
                    C5243qh c5243qh = new C5243qh(activity, j3, list, interfaceC1231l, c0765c, i9);
                    C4915gh c4915gh = new C4915gh(interfaceC1231l, c0765c, list, i9);
                    C4329c c4329cM7E = AbstractC0000a.m7E();
                    c4329cM7E.add(new C3958e("修改时间", "重新选择该计划时间"));
                    if (z9) {
                        c4329cM7E.add(new C3958e("删除时间", "从当前任务移除该计划时间"));
                    }
                    C5491y2.m9799Q1(activity, "计划时间", HttpUrl.FRAGMENT_ENCODE_SET, AbstractC0000a.m90t(c4329cM7E), new C5068l7(c5243qh, 14, c4915gh), new C2209s1(25), EnumC5092lv.f18824j);
                }
                break;
            default:
                AbstractC4955ho.m9556g7((Activity) this.f20228m, this.f20223h, new C0524k(this.f20224i, this.f20225j, this.f20226k, this.f20227l, 9));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5243qh(Context context, List list, long j3, InterfaceC1231l interfaceC1231l, C0765c c0765c, int i9) {
        this.f20228m = context;
        this.f20224i = list;
        this.f20223h = j3;
        this.f20225j = interfaceC1231l;
        this.f20226k = c0765c;
        this.f20227l = i9;
    }
}
