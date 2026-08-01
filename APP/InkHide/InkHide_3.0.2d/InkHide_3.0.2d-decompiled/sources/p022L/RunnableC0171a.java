package p022L;

import android.content.Context;
import android.os.Handler;
import java.io.Serializable;
import p102z0.AbstractC1134q;

/* JADX INFO: renamed from: L.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0171a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f493a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f494b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f495c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Serializable f496d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0171a(C0172b c0172b, int i2, Serializable serializable) {
        this.f495c = c0172b;
        this.f494b = i2;
        this.f496d = serializable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f494b;
        Serializable serializable = this.f496d;
        Object obj = this.f495c;
        switch (this.f493a) {
            case 0:
                ((C0172b) obj).f498b.mo141l(i2, serializable);
                break;
            default:
                Handler handler = AbstractC1134q.f3825a;
                AbstractC1134q.m2469j((Context) obj, (String) serializable, i2);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ RunnableC0171a(Context context, String str, int i2) {
        this.f495c = context;
        this.f496d = str;
        this.f494b = i2;
    }
}
