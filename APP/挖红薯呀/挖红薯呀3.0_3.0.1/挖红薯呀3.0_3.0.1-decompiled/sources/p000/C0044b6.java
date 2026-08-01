package p000;

import android.graphics.Typeface;
import java.util.List;

/* JADX INFO: renamed from: b6 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0044b6 implements InterfaceC0978yw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f382d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f383e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0044b6(int i, Object obj) {
        this.f382d = i;
        this.f383e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0978yw
    /* JADX INFO: renamed from: b */
    public final Object mo259b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f382d;
        Object obj5 = this.f383e;
        switch (i) {
            case 0:
                C0080c6 c0080c6 = (C0080c6) obj5;
                ba1 ba1VarM1958b = ((C0408kv) c0080c6.f699e).m1958b((z51) obj, (C1018zv) obj2, ((C0940xv) obj3).f7426a, ((C0977yv) obj4).f7696a);
                if (ba1VarM1958b instanceof ba1) {
                    Object obj6 = ba1VarM1958b.f482d;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                C0541o8 c0541o8 = new C0541o8(ba1VarM1958b, c0080c6.f704j);
                c0080c6.f704j = c0541o8;
                Object obj7 = c0541o8.f4482c;
                obj7.getClass();
                return (Typeface) obj7;
            default:
                return zc0.m5537e0((List) obj5, (x60) obj, ((Integer) obj2).intValue(), (InterfaceC0356ji) obj3, ((Integer) obj4).intValue());
        }
    }
}
