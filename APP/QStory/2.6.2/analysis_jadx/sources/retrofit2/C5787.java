package retrofit2;

import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5092;
import kotlinx.coroutines.C5443;
import net.bytebuddy.pool.TypePool;
import p015.C6198;
import p053.AbstractC6560;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5787 implements InterfaceC5794 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C5443 f15884;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15885;

    public /* synthetic */ C5787(C5443 c5443, int i) {
        this.f15885 = i;
        this.f15884 = c5443;
    }

    @Override // retrofit2.InterfaceC5794
    public final void onFailure(InterfaceC5777 interfaceC5777, Throwable th) {
        int i = this.f15885;
        C5443 c5443 = this.f15884;
        switch (i) {
            case 0:
                c5443.resumeWith(Result.m8755constructorimpl(new Result.Failure(th)));
                break;
            case 1:
                c5443.resumeWith(Result.m8755constructorimpl(new Result.Failure(th)));
                break;
            default:
                c5443.resumeWith(Result.m8755constructorimpl(new Result.Failure(th)));
                break;
        }
    }

    @Override // retrofit2.InterfaceC5794
    public final void onResponse(InterfaceC5777 interfaceC5777, C5754 c5754) {
        int i = this.f15885;
        C5443 c5443 = this.f15884;
        switch (i) {
            case 0:
                if (!c5754.f15757.f17003) {
                    c5443.resumeWith(Result.m8755constructorimpl(new Result.Failure(new HttpException(c5754))));
                } else {
                    Object obj = c5754.f15756;
                    if (obj != null) {
                        c5443.resumeWith(Result.m8755constructorimpl(obj));
                    } else {
                        C6198 c6198Mo11104 = interfaceC5777.mo11104();
                        c6198Mo11104.getClass();
                        InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(C5782.class);
                        Object objCast = AbstractC6560.m12029(interfaceC5092Mo8927).cast(c6198Mo11104.f16951.mo6651(interfaceC5092Mo8927));
                        objCast.getClass();
                        C5782 c5782 = (C5782) objCast;
                        c5443.resumeWith(Result.m8755constructorimpl(new Result.Failure(new KotlinNullPointerException("Response from " + c5782.f15874.getName() + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + c5782.f15872.getName() + " was null but response body type was declared as non-null"))));
                    }
                }
                break;
            case 1:
                if (!c5754.f15757.f17003) {
                    c5443.resumeWith(Result.m8755constructorimpl(new Result.Failure(new HttpException(c5754))));
                } else {
                    c5443.resumeWith(Result.m8755constructorimpl(c5754.f15756));
                }
                break;
            default:
                c5443.resumeWith(Result.m8755constructorimpl(c5754));
                break;
        }
    }
}
