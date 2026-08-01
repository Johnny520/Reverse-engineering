package androidx.compose.p001ui.text.font;

import androidx.collection.AbstractC1137;
import androidx.collection.C1083;
import androidx.collection.C1115;
import kotlin.AbstractC6017;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p068.InterfaceC7387;
import p091.C7790;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2807 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7790 f6203;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1083 f6204;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1115 f6205 = new C1115(16);

    public C2807() {
        long[] jArr = AbstractC1137.f1352;
        this.f6204 = new C1083();
        this.f6203 = new C7790(9);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4258(InterfaceC2818 interfaceC2818, boolean z, InterfaceC7387 interfaceC7387, ContinuationImpl continuationImpl) {
        AsyncTypefaceCache$runCached$1 asyncTypefaceCache$runCached$1;
        C2808 c2808;
        if (continuationImpl instanceof AsyncTypefaceCache$runCached$1) {
            asyncTypefaceCache$runCached$1 = (AsyncTypefaceCache$runCached$1) continuationImpl;
            int i = asyncTypefaceCache$runCached$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                asyncTypefaceCache$runCached$1.label = i - Integer.MIN_VALUE;
            } else {
                asyncTypefaceCache$runCached$1 = new AsyncTypefaceCache$runCached$1(this, continuationImpl);
            }
        }
        Object obj = asyncTypefaceCache$runCached$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = asyncTypefaceCache$runCached$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            interfaceC2818.getClass();
            C2808 c28082 = new C2808();
            synchronized (this.f6203) {
                try {
                    C2809 c2809 = (C2809) this.f6205.m1392(c28082);
                    if (c2809 == null) {
                        c2809 = (C2809) this.f6204.m1317(c28082);
                    }
                    if (c2809 != null) {
                        return c2809.f6206;
                    }
                    asyncTypefaceCache$runCached$1.L$0 = c28082;
                    asyncTypefaceCache$runCached$1.Z$0 = z;
                    asyncTypefaceCache$runCached$1.label = 1;
                    Object objInvoke = interfaceC7387.invoke(asyncTypefaceCache$runCached$1);
                    if (objInvoke == obj2) {
                        return obj2;
                    }
                    obj = objInvoke;
                    c2808 = c28082;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = asyncTypefaceCache$runCached$1.Z$0;
            c2808 = (C2808) asyncTypefaceCache$runCached$1.L$0;
            AbstractC6017.m10769(obj);
        }
        synchronized (this.f6203) {
            try {
                if (obj == null) {
                    this.f6204.m1315(c2808, new C2809(null));
                } else if (z) {
                    this.f6204.m1315(c2808, new C2809(obj));
                } else {
                    this.f6205.m1391(c2808, new C2809(obj));
                }
            } finally {
            }
        }
        return obj;
    }
}
