package p091g3;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p014b.C0126e;
import p018b3.C0171a;

/* JADX INFO: renamed from: g3.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1339y extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a */
    public final AbstractC1333s f4419a;

    /* JADX INFO: renamed from: b */
    public List f4420b;

    /* JADX INFO: renamed from: c */
    public ArrayList f4421c;

    /* JADX INFO: renamed from: d */
    public final HashMap f4422d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1339y(AbstractC1333s abstractC1333s) {
        super(abstractC1333s.f4400h);
        this.f4422d = new HashMap();
        this.f4419a = abstractC1333s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C1300b0 m3569a(WindowInsetsAnimation windowInsetsAnimation) {
        C1300b0 c1300b0 = (C1300b0) this.f4422d.get(windowInsetsAnimation);
        if (c1300b0 == null) {
            c1300b0 = new C1300b0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                c1300b0.f4355a = new C1340z(windowInsetsAnimation);
            }
            this.f4422d.put(windowInsetsAnimation, c1300b0);
        }
        return c1300b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f4419a.mo3560a(m3569a(windowInsetsAnimation));
        this.f4422d.remove(windowInsetsAnimation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        m3569a(windowInsetsAnimation);
        this.f4419a.mo3561b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f4421c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f4421c = arrayList2;
            this.f4420b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM3476j = AbstractC1311h.m3476j(list.get(size));
            C1300b0 c1300b0M3569a = m3569a(windowInsetsAnimationM3476j);
            c1300b0M3569a.f4355a.mo3448e(windowInsetsAnimationM3476j.getFraction());
            this.f4421c.add(c1300b0M3569a);
        }
        return this.f4419a.mo3562d(C1332r0.m3558c(windowInsets, null), this.f4420b).m3559b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C0126e c0126eMo3563e = this.f4419a.mo3563e(m3569a(windowInsetsAnimation), new C0126e(bounds));
        c0126eMo3563e.getClass();
        AbstractC1311h.m3478l();
        return AbstractC1311h.m3474h(((C0171a) c0126eMo3563e.f332h).m768d(), ((C0171a) c0126eMo3563e.f333i).m768d());
    }
}
