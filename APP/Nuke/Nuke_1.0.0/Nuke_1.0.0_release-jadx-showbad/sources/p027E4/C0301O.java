package p027E4;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import me.dartcv.nuke.BuildConfig;

/* JADX INFO: renamed from: E4.O */
/* JADX INFO: loaded from: classes.dex */
public final class C0301O extends C0314b {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f963k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0301O(int i5) {
        super(7);
        this.f963k = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p027E4.C0314b
    /* JADX INFO: renamed from: d */
    public String mo516d(Method method, int i5) {
        switch (this.f963k) {
            case BuildConfig.VERSION_CODE /* 1 */:
                Parameter parameter = method.getParameters()[i5];
                if (!parameter.isNamePresent()) {
                }
                break;
        }
        return super.mo516d(method, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p027E4.C0314b
    /* JADX INFO: renamed from: e */
    public final Object mo517e(Method method, Class cls, Object obj, Object[] objArr) {
        switch (this.f963k) {
        }
        return AbstractC0315b0.m540k(method, cls, obj, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p027E4.C0314b
    /* JADX INFO: renamed from: f */
    public final boolean mo518f(Method method) {
        switch (this.f963k) {
        }
        return method.isDefault();
    }
}
