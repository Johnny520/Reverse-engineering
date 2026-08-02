package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c72 extends i51 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f1220i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c72(int i) {
        super(17);
        this.f1220i = i;
    }

    @Override // p000.i51
    /* JADX INFO: renamed from: l */
    public String mo659l(Method method, int i) {
        switch (this.f1220i) {
            case 1:
                Parameter parameter = method.getParameters()[i];
                if (!parameter.isNamePresent()) {
                }
                break;
        }
        return super.mo659l(method, i);
    }

    @Override // p000.i51
    /* JADX INFO: renamed from: r */
    public final Object mo660r(Object obj, Method method, Object[] objArr) {
        switch (this.f1220i) {
        }
        return rp0.m4546g0(obj, method, objArr);
    }

    @Override // p000.i51
    /* JADX INFO: renamed from: s */
    public final boolean mo661s(Method method) {
        switch (this.f1220i) {
        }
        return method.isDefault();
    }
}
