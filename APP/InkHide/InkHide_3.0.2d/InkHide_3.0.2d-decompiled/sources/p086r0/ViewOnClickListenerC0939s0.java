package p086r0;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: r0.s0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0939s0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3344b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0842H0 f3345c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f3346d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f3347e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC0939s0(C0842H0 c0842h0, String str, String str2, Object obj, int i2) {
        this.f3344b = i2;
        this.f3345c = c0842h0;
        this.f3346d = str;
        this.f3347e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f3347e;
        C0842H0 c0842h0 = this.f3345c;
        String str = this.f3346d;
        switch (this.f3344b) {
            case 0:
                c0842h0.m1688m(str);
                c0842h0.m1706v(obj);
                break;
            case 1:
                List list = C0842H0.f2813g0;
                c0842h0.m1688m(str);
                c0842h0.m1706v(obj);
                break;
            default:
                List list2 = C0842H0.f2813g0;
                c0842h0.m1688m(str);
                c0842h0.m1706v(obj);
                break;
        }
    }
}
