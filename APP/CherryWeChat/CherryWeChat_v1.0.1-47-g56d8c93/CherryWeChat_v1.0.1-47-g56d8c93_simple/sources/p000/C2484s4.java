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
    public int f8735a;

    /* JADX INFO: renamed from: b */
    public float f8736b;

    /* JADX INFO: renamed from: c */
    public float f8737c;

    /* JADX INFO: renamed from: d */
    public float f8738d;

    /* JADX INFO: renamed from: e */
    public int[] f8739e;

    /* JADX INFO: renamed from: f */
    public boolean f8740f;

    /* JADX INFO: renamed from: g */
    public final TextView f8741g;

    /* JADX INFO: renamed from: h */
    public final Context f8742h;

    static {
        new RectF();
        new ConcurrentHashMap();
    }

    public C2484s4(TextView r3) {
        this.f8735a = 0;
        this.f8736b = -1.0f;
        this.f8737c = -1.0f;
        this.f8738d = -1.0f;
        this.f8739e = new int[0];
        this.f8740f = false;
        this.f8741g = r3;
        this.f8742h = r3.getContext();
        if (Build.VERSION.SDK_INT < 29) goto L6;
        new C2398q4();
        return;
    L6:
        new C2347p4();
    }

    /* JADX INFO: renamed from: a */
    public static int[] m4967a(int[] r6) {
        int r0 = r6.length;
        if (r0 == 0) goto L15;
        Arrays.sort(r6);
        ArrayList r1 = new ArrayList();
        int r2 = 0;
        int r3 = 0;
    L6:
        if (r3 >= r0) goto L14;
        int r4 = r6[r3];
        if (r4 <= 0) goto L12;
        if (Collections.binarySearch(r1, Integer.valueOf(r4)) >= 0) goto L12;
        r1.add(Integer.valueOf(r4));
    L12:
        r3 = r3 + 1;
        goto L6
    L14:
        if (r0 == r1.size()) goto L15;
        int r62 = r1.size();
        int[] r02 = new int[r62];
    L17:
        if (r2 >= r62) goto L19;
        r02[r2] = ((Integer) r1.get(r2)).intValue();
        r2 = r2 + 1;
        goto L17
    L19:
        return r02;
    L15:
        return r6;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4968b() {
        return !(this.f8741g instanceof C0348I3);
    }
}
