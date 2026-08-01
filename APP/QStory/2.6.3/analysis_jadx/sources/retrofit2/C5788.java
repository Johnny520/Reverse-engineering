package retrofit2;

import com.bumptech.glide.AbstractC3057;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5093;
import kotlinx.coroutines.C5444;
import net.bytebuddy.pool.TypePool;
import p007.C6125;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5788 implements InterfaceC5795 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C5444 f15884;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15885;

    public /* synthetic */ C5788(C5444 c5444, int i) {
        this.f15885 = i;
        this.f15884 = c5444;
    }

    @Override // retrofit2.InterfaceC5795
    public final void onFailure(InterfaceC5778 interfaceC5778, Throwable th) {
        int i = this.f15885;
        C5444 c5444 = this.f15884;
        switch (i) {
            case 0:
                c5444.resumeWith(Result.m8745constructorimpl(new Result.Failure(th)));
                break;
            case 1:
                c5444.resumeWith(Result.m8745constructorimpl(new Result.Failure(th)));
                break;
            default:
                c5444.resumeWith(Result.m8745constructorimpl(new Result.Failure(th)));
                break;
        }
    }

    @Override // retrofit2.InterfaceC5795
    public final void onResponse(InterfaceC5778 interfaceC5778, C5755 c5755) {
        int i = this.f15885;
        C5444 c5444 = this.f15884;
        switch (i) {
            case 0:
                if (!c5755.f15757.f16764) {
                    c5444.resumeWith(Result.m8745constructorimpl(new Result.Failure(new HttpException(c5755))));
                } else {
                    Object obj = c5755.f15756;
                    if (obj != null) {
                        c5444.resumeWith(Result.m8745constructorimpl(obj));
                    } else {
                        C6125 c6125Mo11161 = interfaceC5778.mo11161();
                        c6125Mo11161.getClass();
                        InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(C5783.class);
                        Object objCast = AbstractC3057.m6756(interfaceC5093Mo8917).cast(c6125Mo11161.f16712.mo11691(interfaceC5093Mo8917));
                        objCast.getClass();
                        C5783 c5783 = (C5783) objCast;
                        c5444.resumeWith(Result.m8745constructorimpl(new Result.Failure(new KotlinNullPointerException("Response from " + c5783.f15874.getName() + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + c5783.f15872.getName() + " was null but response body type was declared as non-null"))));
                    }
                }
                break;
            case 1:
                if (!c5755.f15757.f16764) {
                    c5444.resumeWith(Result.m8745constructorimpl(new Result.Failure(new HttpException(c5755))));
                } else {
                    c5444.resumeWith(Result.m8745constructorimpl(c5755.f15756));
                }
                break;
            default:
                c5444.resumeWith(Result.m8745constructorimpl(c5755));
                break;
        }
    }
}
