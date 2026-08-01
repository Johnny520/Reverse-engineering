package p000;

import android.app.Activity;
import android.content.Context;
import java.lang.reflect.Method;
import java.util.List;
import p000.n90;

/* JADX INFO: renamed from: qy */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0669qy implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5228d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Context f5229e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f5230f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f5231g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f5232h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0669qy(n90.C0504a c0504a, Context context, Activity activity, String str) {
        this.f5228d = 2;
        this.f5230f = c0504a;
        this.f5231g = context;
        this.f5229e = activity;
        this.f5232h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5228d;
        Object obj = this.f5232h;
        Context context = this.f5229e;
        Object obj2 = this.f5231g;
        Object obj3 = this.f5230f;
        switch (i) {
            case 0:
                C0906wy.m5055u((Activity) context, (Method) obj3, obj2, (List) obj);
                break;
            case 1:
                wb1.m4965u(context, (String) obj3, (String) obj2, (InterfaceC0742sw) obj);
                break;
            default:
                kf1.m1833Z((n90.C0504a) obj3, (Context) obj2, (Activity) context, (String) obj);
                break;
        }
    }

    public /* synthetic */ RunnableC0669qy(Context context, Object obj, Object obj2, Object obj3, int i) {
        this.f5228d = i;
        this.f5229e = context;
        this.f5230f = obj;
        this.f5231g = obj2;
        this.f5232h = obj3;
    }
}
