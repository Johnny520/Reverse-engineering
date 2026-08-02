package p000;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: s */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0676s implements InterfaceC0508np, sa0, gs1 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9836h;

    public /* synthetic */ C0676s(int i) {
        this.f9836h = i;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m4644b() {
        throw new C0594pv();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m4645c(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m4646d(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m4647f(String str, long j) {
        throw new IllegalArgumentException((str + j).toString());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m4648g(String str, Object obj) {
        throw new IllegalArgumentException(str + obj);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m4649h(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m4650i(Object obj) {
        throw new AssertionError(obj);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m4651j(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m4652k(String str, Object obj) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m4653l(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m4654m(String str, Object obj) {
        throw new t31(str + ((Object) obj.toString()));
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m4655n(String str, Object obj) {
        throw new IllegalStateException(str + obj);
    }

    @Override // p000.gs1
    /* JADX INFO: renamed from: a */
    public Object mo2023a() {
        switch (this.f9836h) {
            case 19:
                return new mb1(true);
            case AIChatConfig.MaxContextRounds /* 20 */:
                return new LinkedHashMap();
            case 21:
                return new TreeMap();
            case 22:
                return new ConcurrentHashMap();
            case 23:
                return new ConcurrentSkipListMap();
            case 24:
                return new ArrayList();
            case 25:
                return new LinkedHashSet();
            case 26:
                return new TreeSet();
            default:
                return new ArrayDeque();
        }
    }

    @Override // p000.sa0
    /* JADX INFO: renamed from: e */
    public double mo687e(double d) {
        switch (this.f9836h) {
            case 11:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 12:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 13:
                float[] fArr = C0786uu.f11480a;
                return C0786uu.m5579b(C0786uu.f11482c, d);
            case 14:
                float[] fArr2 = C0786uu.f11480a;
                return C0786uu.m5578a(C0786uu.f11482c, d);
            case 15:
                float[] fArr3 = C0786uu.f11480a;
                return C0786uu.m5581d(C0786uu.f11483d, d);
            default:
                float[] fArr4 = C0786uu.f11480a;
                return C0786uu.m5580c(C0786uu.f11483d, d);
        }
    }

    @Override // p000.InterfaceC0508np
    public void cancel() {
    }
}
