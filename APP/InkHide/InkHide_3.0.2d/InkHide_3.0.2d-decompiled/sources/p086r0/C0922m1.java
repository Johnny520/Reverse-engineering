package p086r0;

import java.lang.reflect.Method;
import p025M0.InterfaceC0193a;

/* JADX INFO: renamed from: r0.m1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0922m1 implements InterfaceC0193a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3287a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0943t1 f3288b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Method f3289c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0922m1(C0943t1 c0943t1, Method method, int i2) {
        this.f3287a = i2;
        this.f3288b = c0943t1;
        this.f3289c = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0193a
    /* JADX INFO: renamed from: b */
    public final Object mo7b() {
        switch (this.f3287a) {
            case 0:
                return new C0940s1(this.f3288b, this.f3289c, 2);
            case 1:
                return new C0940s1(this.f3288b, this.f3289c, 5);
            case 2:
                return new C0940s1(this.f3288b, this.f3289c, 0);
            case 3:
                return new C0940s1(this.f3288b, this.f3289c, 3);
            case 4:
                return new C0940s1(this.f3288b, this.f3289c, 4);
            default:
                return new C0940s1(this.f3288b, this.f3289c, 1);
        }
    }
}
