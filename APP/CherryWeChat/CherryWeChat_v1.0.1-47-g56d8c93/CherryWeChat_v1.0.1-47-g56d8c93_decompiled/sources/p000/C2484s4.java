package p000;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: s4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2484s4 {

    /* JADX INFO: renamed from: a */
    public int f8735a = 0;

    /* JADX INFO: renamed from: b */
    public float f8736b = -1.0f;

    /* JADX INFO: renamed from: c */
    public float f8737c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f8738d = -1.0f;

    /* JADX INFO: renamed from: e */
    public int[] f8739e = new int[0];

    /* JADX INFO: renamed from: f */
    public boolean f8740f = false;

    /* JADX INFO: renamed from: g */
    public final TextView f8741g;

    /* JADX INFO: renamed from: h */
    public final Context f8742h;

    static {
        new RectF();
        new ConcurrentHashMap();
    }

    public C2484s4(TextView textView) {
        this.f8741g = textView;
        this.f8742h = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            new C2398q4();
        } else {
            new C2347p4();
        }
    }

    /* JADX INFO: renamed from: a */
    public static int[] m4967a(int[] iArr) {
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
    public final boolean m4968b() {
        return !(this.f8741g instanceof C0348I3);
    }
}
