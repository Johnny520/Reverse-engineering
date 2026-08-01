package androidx.compose.ui.text.font;

import androidx.collection.AbstractC0290;
import androidx.collection.C0236;
import androidx.collection.C0268;
import p075.C6961;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1973 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6961 f5858;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0236 f5859;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0268 f5860 = new C0268(16);

    public C1973() {
        long[] jArr = AbstractC0290.f1007;
        this.f5859 = new C0236();
        this.f5858 = new C6961(9);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3698(androidx.compose.ui.text.font.InterfaceC1984 r7, boolean r8, p052.InterfaceC6558 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = (androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2e
            boolean r8 = r0.Z$0
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.text.font.飘花落叶言子楪世兰苏哲 r7 = (androidx.compose.ui.text.font.C1974) r7
            kotlin.AbstractC5185.m10210(r10)
            goto L6e
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            return r3
        L34:
            kotlin.AbstractC5185.m10210(r10)
            androidx.compose.ui.text.font.飘花落叶言子楪世兰苏哲 r10 = new androidx.compose.ui.text.font.飘花落叶言子楪世兰苏哲
            r7.getClass()
            r10.<init>()
            飘花落叶言世楪哲苏子兰.飘花落叶言子楪苏兰哲世 r7 = r6.f5858
            monitor-enter(r7)
            androidx.collection.飘花落叶言子楪兰苏哲世 r2 = r6.f5860     // Catch: java.lang.Throwable -> L55
            java.lang.Object r2 = r2.m832(r10)     // Catch: java.lang.Throwable -> L55
            androidx.compose.ui.text.font.飘花落叶言子楪世哲兰苏 r2 = (androidx.compose.ui.text.font.C1975) r2     // Catch: java.lang.Throwable -> L55
            if (r2 != 0) goto L57
            androidx.collection.飘花落叶言子世兰楪苏哲 r2 = r6.f5859     // Catch: java.lang.Throwable -> L55
            java.lang.Object r2 = r2.m757(r10)     // Catch: java.lang.Throwable -> L55
            androidx.compose.ui.text.font.飘花落叶言子楪世哲兰苏 r2 = (androidx.compose.ui.text.font.C1975) r2     // Catch: java.lang.Throwable -> L55
            goto L57
        L55:
            r6 = move-exception
            goto L9b
        L57:
            if (r2 == 0) goto L5d
            java.lang.Object r6 = r2.f5861     // Catch: java.lang.Throwable -> L55
            monitor-exit(r7)
            return r6
        L5d:
            monitor-exit(r7)
            r0.L$0 = r10
            r0.Z$0 = r8
            r0.label = r4
            java.lang.Object r7 = r9.invoke(r0)
            if (r7 != r1) goto L6b
            return r1
        L6b:
            r5 = r10
            r10 = r7
            r7 = r5
        L6e:
            飘花落叶言世楪哲苏子兰.飘花落叶言子楪苏兰哲世 r9 = r6.f5858
            monitor-enter(r9)
            if (r10 != 0) goto L80
            androidx.collection.飘花落叶言子世兰楪苏哲 r6 = r6.f5859     // Catch: java.lang.Throwable -> L7e
            androidx.compose.ui.text.font.飘花落叶言子楪世哲兰苏 r8 = new androidx.compose.ui.text.font.飘花落叶言子楪世哲兰苏     // Catch: java.lang.Throwable -> L7e
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L7e
            r6.m755(r7, r8)     // Catch: java.lang.Throwable -> L7e
            goto L97
        L7e:
            r6 = move-exception
            goto L99
        L80:
            if (r8 == 0) goto L8d
            androidx.collection.飘花落叶言子世兰楪苏哲 r6 = r6.f5859     // Catch: java.lang.Throwable -> L7e
            androidx.compose.ui.text.font.飘花落叶言子楪世哲兰苏 r8 = new androidx.compose.ui.text.font.飘花落叶言子楪世哲兰苏     // Catch: java.lang.Throwable -> L7e
            r8.<init>(r10)     // Catch: java.lang.Throwable -> L7e
            r6.m755(r7, r8)     // Catch: java.lang.Throwable -> L7e
            goto L97
        L8d:
            androidx.collection.飘花落叶言子楪兰苏哲世 r6 = r6.f5860     // Catch: java.lang.Throwable -> L7e
            androidx.compose.ui.text.font.飘花落叶言子楪世哲兰苏 r8 = new androidx.compose.ui.text.font.飘花落叶言子楪世哲兰苏     // Catch: java.lang.Throwable -> L7e
            r8.<init>(r10)     // Catch: java.lang.Throwable -> L7e
            r6.m831(r7, r8)     // Catch: java.lang.Throwable -> L7e
        L97:
            monitor-exit(r9)
            return r10
        L99:
            monitor-exit(r9)
            throw r6
        L9b:
            monitor-exit(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.C1973.m3698(androidx.compose.ui.text.font.飘花落叶言子楪兰苏哲世, boolean, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
