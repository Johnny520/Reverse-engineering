package p037U;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.abc.core.status.FeatureInstallResult;
import java.lang.reflect.Field;
import java.util.Comparator;
import p001A0.AbstractC0040p;
import p006D.AbstractC0070G;
import p006D.AbstractC0080Q;
import p069m.C0989i;

/* JADX INFO: renamed from: U.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0375k implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f823a;

    public /* synthetic */ C0375k(int i2) {
        this.f823a = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r3 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r3 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return -1;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i2 = 1;
        switch (this.f823a) {
            case 0:
                C0377m c0377m = (C0377m) obj;
                C0377m c0377m2 = (C0377m) obj2;
                RecyclerView recyclerView = c0377m.f830d;
                if ((recyclerView == null) == (c0377m2.f830d == null)) {
                    boolean z2 = c0377m.f827a;
                    if (z2 == c0377m2.f827a) {
                        i2 = c0377m2.f828b - c0377m.f828b;
                        if (i2 == 0) {
                            int i3 = c0377m.f829c - c0377m2.f829c;
                            if (i3 != 0) {
                                return i3;
                            }
                            return 0;
                        }
                    }
                    return i2;
                }
                break;
            case 1:
                return AbstractC0040p.m112q(((FeatureInstallResult) obj).f2719a, ((FeatureInstallResult) obj2).f2719a);
            case 2:
                return ((C0989i) obj).f3507b - ((C0989i) obj2).f3507b;
            case 3:
                Field field = AbstractC0080Q.f219a;
                float fM223m = AbstractC0070G.m223m((View) obj);
                float fM223m2 = AbstractC0070G.m223m((View) obj2);
                if (fM223m > fM223m2) {
                    return -1;
                }
                return fM223m < fM223m2 ? 1 : 0;
            default:
                return ((View) obj).getTop() - ((View) obj2).getTop();
        }
    }
}
