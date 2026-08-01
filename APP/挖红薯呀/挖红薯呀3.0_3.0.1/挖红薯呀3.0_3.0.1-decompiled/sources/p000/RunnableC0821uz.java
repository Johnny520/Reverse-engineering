package p000;

import android.content.Context;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: uz */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0821uz implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6352d = 1;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Context f6353e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f6354f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f6355g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f6356h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC0188ex f6357i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0821uz(String str, Context context, int i, long j, InterfaceC0742sw interfaceC0742sw) {
        this.f6356h = str;
        this.f6353e = context;
        this.f6354f = i;
        this.f6355g = j;
        this.f6357i = interfaceC0742sw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int i = this.f6352d;
        InterfaceC0188ex interfaceC0188ex = this.f6357i;
        Object obj = this.f6356h;
        switch (i) {
            case 0:
                C0870vz.m4811k((List) obj, (InterfaceC0904ww) interfaceC0188ex, this.f6354f, this.f6353e, this.f6355g);
                break;
            default:
                C0870vz.m4813n((String) obj, this.f6353e, this.f6354f, this.f6355g, (InterfaceC0742sw) interfaceC0188ex);
                break;
        }
    }

    public /* synthetic */ RunnableC0821uz(List list, InterfaceC0904ww interfaceC0904ww, int i, Context context, long j) {
        this.f6356h = list;
        this.f6357i = interfaceC0904ww;
        this.f6354f = i;
        this.f6353e = context;
        this.f6355g = j;
    }
}
