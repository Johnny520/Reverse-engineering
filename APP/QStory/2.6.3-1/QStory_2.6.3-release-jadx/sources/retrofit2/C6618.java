package retrofit2;

import com.bumptech.glide.AbstractC3889;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5925;
import kotlinx.coroutines.C6276;
import net.bytebuddy.pool.TypePool;
import p023.C6954;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6618 implements InterfaceC6625 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C6276 f16229;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16230;

    public /* synthetic */ C6618(C6276 c6276, int i) {
        this.f16230 = i;
        this.f16229 = c6276;
    }

    @Override // retrofit2.InterfaceC6625
    public final void onFailure(InterfaceC6608 interfaceC6608, Throwable th) {
        int i = this.f16230;
        C6276 c6276 = this.f16229;
        switch (i) {
            case 0:
                c6276.resumeWith(Result.m9304constructorimpl(new Result.Failure(th)));
                break;
            case 1:
                c6276.resumeWith(Result.m9304constructorimpl(new Result.Failure(th)));
                break;
            default:
                c6276.resumeWith(Result.m9304constructorimpl(new Result.Failure(th)));
                break;
        }
    }

    @Override // retrofit2.InterfaceC6625
    public final void onResponse(InterfaceC6608 interfaceC6608, C6585 c6585) {
        int i = this.f16230;
        C6276 c6276 = this.f16229;
        switch (i) {
            case 0:
                if (!c6585.f16102.f17109) {
                    c6276.resumeWith(Result.m9304constructorimpl(new Result.Failure(new HttpException(c6585))));
                } else {
                    Object obj = c6585.f16101;
                    if (obj != null) {
                        c6276.resumeWith(Result.m9304constructorimpl(obj));
                    } else {
                        C6954 c6954Mo11720 = interfaceC6608.mo11720();
                        c6954Mo11720.getClass();
                        InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C6613.class);
                        Object objCast = AbstractC3889.m7316(interfaceC5925Mo9476).cast(c6954Mo11720.f17057.mo12250(interfaceC5925Mo9476));
                        objCast.getClass();
                        C6613 c6613 = (C6613) objCast;
                        c6276.resumeWith(Result.m9304constructorimpl(new Result.Failure(new KotlinNullPointerException("Response from " + c6613.f16219.getName() + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + c6613.f16217.getName() + " was null but response body type was declared as non-null"))));
                    }
                }
                break;
            case 1:
                if (!c6585.f16102.f17109) {
                    c6276.resumeWith(Result.m9304constructorimpl(new Result.Failure(new HttpException(c6585))));
                } else {
                    c6276.resumeWith(Result.m9304constructorimpl(c6585.f16101));
                }
                break;
            default:
                c6276.resumeWith(Result.m9304constructorimpl(c6585));
                break;
        }
    }
}
