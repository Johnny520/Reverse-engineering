package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.github.megatronking.stringfog.Base64;
import java.util.Comparator;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: de */
/* JADX INFO: loaded from: classes.dex */
public final class C0148de implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1388a;

    public /* synthetic */ C0148de(int i) {
        this.f1388a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int top;
        int top2;
        switch (this.f1388a) {
            case Base64.DEFAULT /* 0 */:
                WeakHashMap weakHashMap = oa0.f3426a;
                float fM895m = da0.m895m((View) obj);
                float fM895m2 = da0.m895m((View) obj2);
                if (fM895m > fM895m2) {
                    return -1;
                }
                return fM895m < fM895m2 ? 1 : 0;
            case Base64.NO_PADDING /* 1 */:
                C0193en c0193en = (C0193en) obj;
                C0193en c0193en2 = (C0193en) obj2;
                RecyclerView recyclerView = c0193en.f1608d;
                if ((recyclerView == null) == (c0193en2.f1608d == null)) {
                    boolean z = c0193en.f1605a;
                    if (z == c0193en2.f1605a) {
                        int i = c0193en2.f1606b - c0193en.f1606b;
                        if (i != 0) {
                            return i;
                        }
                        int i2 = c0193en.f1607c - c0193en2.f1607c;
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
                top = ((h40) obj).f2101b;
                top2 = ((h40) obj2).f2101b;
                break;
            case 3:
                top = ((View) obj).getTop();
                top2 = ((View) obj2).getTop();
                break;
            default:
                Integer numValueOf = Integer.valueOf(((rb0) obj).f4113b);
                Integer numValueOf2 = Integer.valueOf(((rb0) obj2).f4113b);
                if (numValueOf == numValueOf2) {
                    return 0;
                }
                return numValueOf.compareTo(numValueOf2);
        }
        return top - top2;
    }
}
