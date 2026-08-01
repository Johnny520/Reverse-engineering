package p086r0;

import java.lang.reflect.Method;
import p025M0.InterfaceC0193a;
import p077m0.C0767e;

/* JADX INFO: renamed from: r0.o1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0928o1 implements InterfaceC0193a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3305a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0943t1 f3306b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f3307c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Method f3308d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0928o1(C0943t1 c0943t1, String str, Method method) {
        this.f3306b = c0943t1;
        this.f3307c = str;
        this.f3308d = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0193a
    /* JADX INFO: renamed from: b */
    public final Object mo7b() {
        switch (this.f3305a) {
            case 0:
                return new C0937r1(this.f3306b, this.f3308d, this.f3307c);
            default:
                return new C0767e(this.f3306b, this.f3307c, this.f3308d);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0928o1(C0943t1 c0943t1, Method method, String str) {
        this.f3306b = c0943t1;
        this.f3308d = method;
        this.f3307c = str;
    }
}
