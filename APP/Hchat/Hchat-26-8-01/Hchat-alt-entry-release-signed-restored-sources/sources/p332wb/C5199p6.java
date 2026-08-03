package p332wb;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import gg.C1421q;
import gg.C1425u;
import java.util.ArrayList;
import p007a7.AbstractC0018a;
import p036c9.C0416a1;
import p117i0.C1845j1;

/* JADX INFO: renamed from: wb.p6 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5199p6 extends FrameLayout {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1421q f19930g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1845j1 f19931h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1425u f19932i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1425u f19933j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C1421q f19934k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C5166o6 f19935l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ ArrayList f19936m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ ViewGroup f19937n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C0416a1 f19938o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5199p6(Activity activity, C1421q c1421q, C1845j1 c1845j1, C1425u c1425u, C1425u c1425u2, C1421q c1421q2, C5166o6 c5166o6, ArrayList arrayList, ViewGroup viewGroup, C0416a1 c0416a1) {
        super(activity);
        this.f19930g = c1421q;
        this.f19931h = c1845j1;
        this.f19932i = c1425u;
        this.f19933j = c1425u2;
        this.f19934k = c1421q2;
        this.f19935l = c5166o6;
        this.f19936m = arrayList;
        this.f19937n = viewGroup;
        this.f19938o = c0416a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        if (keyEvent.getKeyCode() != 4) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 1) {
            AbstractC0018a.m239c(this.f19930g, this.f19931h, this.f19932i, this.f19933j, this.f19934k, this.f19935l, this.f19936m, this.f19937n, this.f19938o);
        }
        return true;
    }
}
