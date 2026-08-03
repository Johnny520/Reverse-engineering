package p000a;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: a.s1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0813s1 {

    /* JADX INFO: renamed from: a */
    public int f3205a = 0;

    /* JADX INFO: renamed from: b */
    public float f3206b = -1.0f;

    /* JADX INFO: renamed from: c */
    public float f3207c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f3208d = -1.0f;

    /* JADX INFO: renamed from: e */
    public int[] f3209e = new int[0];

    /* JADX INFO: renamed from: f */
    public boolean f3210f = false;

    /* JADX INFO: renamed from: g */
    public final TextView f3211g;

    /* JADX INFO: renamed from: h */
    public final Context f3212h;

    /* JADX INFO: renamed from: a.s1$a */
    public static class a extends c {
    }

    /* JADX INFO: renamed from: a.s1$b */
    public static class b extends a {
    }

    /* JADX INFO: renamed from: a.s1$c */
    public static class c {
    }

    static {
        new RectF();
        new ConcurrentHashMap();
    }

    public C0813s1(TextView textView) {
        this.f3211g = textView;
        this.f3212h = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            new b();
        } else {
            new a();
        }
    }

    /* JADX INFO: renamed from: a */
    public static int[] m1884a(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1885b() {
        return !(this.f3211g instanceof C0452Z0);
    }
}
