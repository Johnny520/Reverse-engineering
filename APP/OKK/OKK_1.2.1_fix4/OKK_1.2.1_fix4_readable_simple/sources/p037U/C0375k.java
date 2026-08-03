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

    public /* synthetic */ C0375k(int r1) {
        this.f823a = r1;
    }

    @Override // java.util.Comparator
    public final int compare(Object r7, Object r8) {
        int r1 = 1;
        switch(this.f823a) {
            case 0: goto L17;
            case 1: goto L16;
            case 2: goto L14;
            case 3: goto L6;
            default: goto L5;
        };
    L6:
        Field r3 = AbstractC0080Q.f219a;
        float r72 = AbstractC0070G.m223m((View) r7);
        float r82 = AbstractC0070G.m223m((View) r8);
        if (r72 <= r82) goto L10;
        return -1;
    L10:
        if (r72 < r82) goto L12;
        return 0;
    L12:
        return 1;
    L17:
        C0377m r73 = (C0377m) r7;
        C0377m r83 = (C0377m) r8;
        RecyclerView r32 = r73.f830d;
        if (r32 != null) goto L20;
        boolean r4 = true;
    L22:
        if (r83.f830d != null) goto L24;
        boolean r5 = true;
    L25:
        if (r4 == r5) goto L29;
        if (r32 == null) goto L43;
    L42:
        return -1;
    L43:
        return r1;
    L29:
        boolean r33 = r73.f827a;
        if (r33 == r83.f827a) goto L33;
        if (r33 == false) goto L43;
    L33:
        r1 = r83.f828b - r73.f828b;
        if (r1 != 0) goto L43;
        int r74 = r73.f829c - r83.f829c;
        if (r74 != 0) goto L39;
        return 0;
    L39:
        return r74;
    L24:
        r5 = false;
        goto L25
    L20:
        r4 = false;
        goto L22
    L5:
        return ((View) r7).getTop() - ((View) r8).getTop();
    L14:
        return ((C0989i) r7).f3507b - ((C0989i) r8).f3507b;
    L16:
        return AbstractC0040p.m112q(((FeatureInstallResult) r7).f2719a, ((FeatureInstallResult) r8).f2719a);
    }
}
