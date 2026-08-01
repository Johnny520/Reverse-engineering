package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.github.megatronking.stringfog.Base64;
import java.util.Comparator;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0101ce implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f955a;

    public /* synthetic */ C0101ce(int i) {
        this.f955a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int top;
        int top2;
        switch (this.f955a) {
            case Base64.DEFAULT /* 0 */:
                WeakHashMap weakHashMap = ja0.f2600a;
                float fM2667m = y90.m2667m((View) obj);
                float fM2667m2 = y90.m2667m((View) obj2);
                if (fM2667m > fM2667m2) {
                    return -1;
                }
                return fM2667m < fM2667m2 ? 1 : 0;
            case Base64.NO_PADDING /* 1 */:
                C0110cn c0110cn = (C0110cn) obj;
                C0110cn c0110cn2 = (C0110cn) obj2;
                RecyclerView recyclerView = c0110cn.f983d;
                if ((recyclerView == null) == (c0110cn2.f983d == null)) {
                    boolean z = c0110cn.f980a;
                    if (z == c0110cn2.f980a) {
                        int i = c0110cn2.f981b - c0110cn.f981b;
                        if (i != 0) {
                            return i;
                        }
                        int i2 = c0110cn.f982c - c0110cn2.f982c;
                        if (i2 != 0) {
                            return i2;
                        }
                        return 0;
                    }
                    if (!z) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case Base64.NO_WRAP /* 2 */:
                top = ((a40) obj).f29b;
                top2 = ((a40) obj2).f29b;
                break;
            case 3:
                top = ((View) obj).getTop();
                top2 = ((View) obj2).getTop();
                break;
            default:
                Integer numValueOf = Integer.valueOf(((mb0) obj).f3187b);
                Integer numValueOf2 = Integer.valueOf(((mb0) obj2).f3187b);
                if (numValueOf == numValueOf2) {
                    return 0;
                }
                return numValueOf.compareTo(numValueOf2);
        }
        return top - top2;
    }
}
