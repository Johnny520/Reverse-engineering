package p029F0;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p095T.InterfaceC1359f;
import p195l2.InterfaceC2504h;
import p203n.InterfaceC2675t;
import p217p0.C2873d;
import p217p0.InterfaceC2878i;
import p224q2.C2923n;
import p224q2.InterfaceC2924o;

/* JADX INFO: renamed from: F0.A */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0363A implements InterfaceC1359f, InterfaceC2504h, InterfaceC2675t, InterfaceC2878i, InterfaceC2924o {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1136d;

    public /* synthetic */ C0363A(int i5) {
        this.f1136d = i5;
    }

    @Override // p217p0.InterfaceC2878i
    /* JADX INFO: renamed from: b */
    public double mo601b(double d5) {
        switch (this.f1136d) {
            case 14:
                double d6 = d5 < 0.0d ? -d5 : d5;
                return Math.copySign(d6 >= 0.0031308049535603718d ? (Math.pow(d6, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d6 / 0.07739938080495357d, d5);
            case 15:
                double d7 = d5 < 0.0d ? -d5 : d5;
                return Math.copySign(d7 >= 0.04045d ? Math.pow((0.9478672985781991d * d7) + 0.05213270142180095d, 2.4d) : d7 * 0.07739938080495357d, d5);
            case 16:
                float[] fArr = C2873d.f9071a;
                return C2873d.m5077b(C2873d.f9073c, d5);
            case 17:
                float[] fArr2 = C2873d.f9071a;
                return C2873d.m5076a(C2873d.f9073c, d5);
            case 18:
                float[] fArr3 = C2873d.f9071a;
                return C2873d.m5079d(C2873d.f9074d, d5);
            case 19:
                float[] fArr4 = C2873d.f9071a;
                return C2873d.m5078c(C2873d.f9074d, d5);
            default:
                return d5;
        }
    }

    @Override // p224q2.InterfaceC2924o
    /* JADX INFO: renamed from: c */
    public Object mo602c() {
        switch (this.f1136d) {
            case 21:
                return new C2923n(true);
            case 22:
                return new LinkedHashMap();
            case 23:
                return new TreeMap();
            case 24:
                return new ConcurrentHashMap();
            case 25:
                return new ConcurrentSkipListMap();
            case 26:
                return new ArrayList();
            case 27:
                return new LinkedHashSet();
            case 28:
                return new TreeSet();
            default:
                return new ArrayDeque();
        }
    }

    @Override // p195l2.InterfaceC2504h
    public Object get() {
        if (Build.VERSION.SDK_INT == 34) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
            Bitmap bitmapCopy = bitmapCreateBitmap.copy(Bitmap.Config.HARDWARE, false);
            bitmapCreateBitmap.recycle();
            z = bitmapCopy == null;
            if (Log.isLoggable("GainmapWorkaroundCalc", 2)) {
                Log.v("GainmapWorkaroundCalc", "calculateNeedsGainmapDecodeWorkaround=" + z);
            }
            if (bitmapCopy != null) {
                bitmapCopy.recycle();
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // p095T.InterfaceC1359f
    public void cancel() {
    }

    @Override // p203n.InterfaceC2675t
    /* JADX INFO: renamed from: a */
    public float mo600a(float f2) {
        return f2;
    }
}
