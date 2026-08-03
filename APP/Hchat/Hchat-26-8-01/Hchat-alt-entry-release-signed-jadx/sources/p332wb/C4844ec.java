package p332wb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import p085fg.InterfaceC1220a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p144k.C2209s1;
import p198nb.C2924a;
import p242q8.C3460o;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.ec */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4844ec implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16862g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f16863h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SharedPreferences f16864i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f16865j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4844ec(Context context, SharedPreferences sharedPreferences, boolean z9) {
        this.f16863h = context;
        this.f16864i = sharedPreferences;
        this.f16865j = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        Activity activity;
        switch (this.f16862g) {
            case 0:
                Context context = this.f16863h;
                SharedPreferences sharedPreferences = this.f16864i;
                boolean z9 = this.f16865j;
                C4844ec c4844ec = new C4844ec(context, sharedPreferences, z9);
                Activity activity2 = context instanceof Activity ? (Activity) context : null;
                if (activity2 == null) {
                    C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
                    Activity activityM7263a = c3460oCurrentActivity != null ? c3460oCurrentActivity.m7263a() : null;
                    Activity activity3 = activityM7263a != null ? activityM7263a : null;
                    if (activity3 != null) {
                        activity = activity3;
                    }
                } else {
                    activity = activity2;
                }
                C5491y2.m9803S1(activity, z9 ? "清除伪集赞" : "清除伪评论", z9 ? "清空全部朋友圈已保存的本地点赞？" : "清空全部朋友圈已保存的本地评论？", new C2924a(c4844ec, 24), new C2209s1(25), EnumC5092lv.f18824j);
                break;
            default:
                AbstractC4955ho.m9437S6(this.f16863h, this.f16864i, "已清除", this.f16865j);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4844ec(Context context, boolean z9, SharedPreferences sharedPreferences) {
        this.f16863h = context;
        this.f16865j = z9;
        this.f16864i = sharedPreferences;
    }
}
