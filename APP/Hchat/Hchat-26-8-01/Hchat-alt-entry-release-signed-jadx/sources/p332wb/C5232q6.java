package p332wb;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import gg.C1421q;
import gg.C1425u;
import java.util.ArrayList;
import p007a7.AbstractC0018a;
import p036c9.C0416a1;
import p117i0.C1845j1;

/* JADX INFO: renamed from: wb.q6 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5232q6 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20121a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1425u f20122b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1421q f20123c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1845j1 f20124d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1425u f20125e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1421q f20126f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C5166o6 f20127g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ArrayList f20128h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ViewGroup f20129i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0416a1 f20130j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5232q6(C1425u c1425u, C1421q c1421q, C1845j1 c1845j1, C1425u c1425u2, C1421q c1421q2, C5166o6 c5166o6, ArrayList arrayList, ViewGroup viewGroup, C0416a1 c0416a1, int i9) {
        this.f20121a = i9;
        this.f20122b = c1425u;
        this.f20123c = c1421q;
        this.f20124d = c1845j1;
        this.f20125e = c1425u2;
        this.f20126f = c1421q2;
        this.f20127g = c5166o6;
        this.f20128h = arrayList;
        this.f20129i = viewGroup;
        this.f20130j = c0416a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        int i9 = this.f20121a;
        methodHookParam.getClass();
        switch (i9) {
            case 0:
                Object[] objArr = methodHookParam.args;
                objArr.getClass();
                int length = objArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        obj = objArr[i10];
                        if (!(obj instanceof KeyEvent)) {
                            i10++;
                        }
                    } else {
                        obj = null;
                    }
                }
                KeyEvent keyEvent = obj instanceof KeyEvent ? (KeyEvent) obj : null;
                if (keyEvent == null || keyEvent.getKeyCode() != 4) {
                    return;
                }
                C1425u c1425u = this.f20122b;
                Object obj2 = c1425u.f4738g;
                if (obj2 == null) {
                    AbstractC1416l.m3831g("page");
                    throw null;
                }
                if (((FrameLayout) obj2).getParent() == null) {
                    return;
                }
                if (keyEvent.getAction() == 1) {
                    AbstractC0018a.m239c(this.f20123c, this.f20124d, this.f20125e, c1425u, this.f20126f, this.f20127g, this.f20128h, this.f20129i, this.f20130j);
                }
                methodHookParam.setResult(Boolean.TRUE);
                return;
            default:
                C1425u c1425u2 = this.f20122b;
                Object obj3 = c1425u2.f4738g;
                if (obj3 == null) {
                    AbstractC1416l.m3831g("page");
                    throw null;
                }
                if (((FrameLayout) obj3).getParent() == null) {
                    return;
                }
                AbstractC0018a.m239c(this.f20123c, this.f20124d, this.f20125e, c1425u2, this.f20126f, this.f20127g, this.f20128h, this.f20129i, this.f20130j);
                methodHookParam.setResult((Object) null);
                return;
        }
    }
}
