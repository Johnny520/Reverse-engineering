package p000;

import android.view.View;
import android.widget.Button;
import java.util.List;
import p000.vf0;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qf0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5138a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5139b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5140c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ qf0(int i, Object obj, Object obj2) {
        this.f5138a = i;
        this.f5139b = obj;
        this.f5140c = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f5138a;
        Object obj = this.f5140c;
        Object obj2 = this.f5139b;
        switch (i) {
            case 0:
                vf0.m4666q1((vf0.C0839a) obj2, (List) obj, view);
                break;
            case 1:
                DialogC0076c2.m419t((Button) obj2, (DialogC0076c2) obj, view);
                break;
            default:
                m90.m2465j((Button) obj2, (m90) obj, view);
                break;
        }
    }
}
