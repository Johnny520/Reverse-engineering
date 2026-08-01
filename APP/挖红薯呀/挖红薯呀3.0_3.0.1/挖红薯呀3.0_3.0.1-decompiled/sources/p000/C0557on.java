package p000;

import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.query.matchers.MethodMatcher;
import org.luckypray.dexkit.result.ClassData;

/* JADX INFO: renamed from: on */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0557on implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4595d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ClassData f4596e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0557on(ClassData classData, int i) {
        this.f4595d = i;
        this.f4596e = classData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f4595d;
        ClassData classData = this.f4596e;
        switch (i) {
            case 0:
                return C0695rn.m3693X3(classData, (FindMethod) obj);
            default:
                return C0695rn.m3699Y3(classData, (MethodMatcher) obj);
        }
    }
}
