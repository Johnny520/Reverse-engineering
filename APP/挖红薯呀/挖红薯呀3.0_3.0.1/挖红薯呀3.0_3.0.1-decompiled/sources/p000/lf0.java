package p000;

import android.content.Context;
import android.view.View;
import p000.cf1;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lf0 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3478a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f3479b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3480c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ lf0(cf1.C0090a c0090a, Context context) {
        this.f3480c = c0090a;
        this.f3479b = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.f3478a;
        Context context = this.f3479b;
        Object obj = this.f3480c;
        switch (i) {
            case 0:
                return vf0.m4490D1(context, (String) obj, view);
            default:
                return vf0.m4522K1((cf1.C0090a) obj, context, view);
        }
    }

    public /* synthetic */ lf0(Context context, String str) {
        this.f3479b = context;
        this.f3480c = str;
    }
}
