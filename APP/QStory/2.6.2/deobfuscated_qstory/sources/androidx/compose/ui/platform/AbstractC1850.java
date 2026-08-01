package androidx.compose.ui.platform;

import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1850 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ViewGroup.LayoutParams f5354 = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.platform.C1851 m3468(androidx.compose.ui.platform.AbstractC1881 r7, androidx.compose.ui.platform.C1903 r8, androidx.compose.runtime.internal.C1242 r9) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = androidx.compose.ui.platform.AbstractC1915.f5659
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L3d
            r0 = 6
            kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲 r0 = kotlinx.coroutines.channels.AbstractC5204.m10278(r2, r0, r3)
            kotlin.飘花落叶言子楪苏世哲兰 r4 = androidx.compose.ui.platform.C1822.f5301
            java.lang.Object r4 = r4.getValue()
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r4 = (kotlin.coroutines.InterfaceC4359) r4
            kotlinx.coroutines.internal.飘花落叶言子楪世哲苏兰 r4 = kotlinx.coroutines.AbstractC5398.m10485(r4)
            androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1 r5 = new androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1
            r5.<init>(r0, r3)
            r6 = 3
            kotlinx.coroutines.AbstractC5398.m10473(r4, r3, r3, r5, r6)
            androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2 r4 = new androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2
            r4.<init>()
            java.lang.Object r0 = androidx.compose.runtime.snapshots.AbstractC1280.f3744
            monitor-enter(r0)
            java.util.List r5 = androidx.compose.runtime.snapshots.AbstractC1280.f3750     // Catch: java.lang.Throwable -> L3a
            java.util.ArrayList r4 = kotlin.collections.AbstractC4343.m8821(r5, r4)     // Catch: java.lang.Throwable -> L3a
            androidx.compose.runtime.snapshots.AbstractC1280.f3750 = r4     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)
            androidx.compose.runtime.snapshots.AbstractC1280.m2253()
            goto L3d
        L3a:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L3d:
            int r0 = r7.getChildCount()
            if (r0 <= 0) goto L57
            android.view.View r0 = r7.getChildAt(r1)
            boolean r1 = r0 instanceof androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884
            if (r1 == 0) goto L4e
            androidx.compose.ui.platform.飘花落叶言子楪兰世苏哲 r0 = (androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884) r0
            goto L4f
        L4e:
            r0 = r3
        L4f:
            if (r0 == 0) goto L55
            r0.setComposeViewContext(r8)
            goto L5b
        L55:
            r0 = r3
            goto L5b
        L57:
            r7.removeAllViews()
            goto L55
        L5b:
            if (r0 != 0) goto L6f
            androidx.compose.ui.platform.飘花落叶言子楪兰世苏哲 r0 = new androidx.compose.ui.platform.飘花落叶言子楪兰世苏哲
            android.content.Context r1 = r7.getContext()
            r0.<init>(r1, r8)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r4 = androidx.compose.ui.platform.AbstractC1850.f5354
            r7.addView(r1, r4)
        L6f:
            r0.setComposeViewContext(r8)
            androidx.compose.ui.platform.飘花落叶言子苏世哲兰楪 r7 = r7.getComposeViewContext$ui()
            if (r7 == 0) goto L7e
            r8.m3590()
            r0.setComposeViewContextIncrementedDuringInit$ui(r2)
        L7e:
            int r7 = androidx.compose.ui.platform.AbstractC1909.f5627
            r7 = 604570589(0x240903dd, float:2.9710412E-17)
            java.lang.Object r1 = r0.getTag(r7)
            boolean r2 = r1 instanceof androidx.compose.ui.platform.C1851
            if (r2 == 0) goto L8e
            r3 = r1
            androidx.compose.ui.platform.飘花落叶言子兰苏楪世哲 r3 = (androidx.compose.ui.platform.C1851) r3
        L8e:
            if (r3 != 0) goto La8
            androidx.compose.ui.platform.飘花落叶言子兰苏楪世哲 r3 = new androidx.compose.ui.platform.飘花落叶言子兰苏楪世哲
            androidx.compose.ui.node.飘花落叶言子楪哲世苏兰 r1 = new androidx.compose.ui.node.飘花落叶言子楪哲世苏兰
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r2 = r0.getRoot()
            r1.<init>(r2)
            androidx.compose.runtime.飘花落叶言子楪苏兰哲世 r2 = r8.f5597
            androidx.compose.runtime.飘花落叶言子楪哲世兰苏 r4 = new androidx.compose.runtime.飘花落叶言子楪哲世兰苏
            r4.<init>(r2, r1)
            r3.<init>(r0, r4)
            r0.setTag(r7, r3)
        La8:
            r3.m3469(r9)
            androidx.compose.runtime.飘花落叶言子楪苏兰哲世 r7 = r8.f5597
            androidx.compose.ui.platform.飘花落叶言子兰苏楪哲世 r8 = new androidx.compose.ui.platform.飘花落叶言子兰苏楪哲世
            r8.<init>(r7)
            r0.setFrameEndScheduler$ui(r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AbstractC1850.m3468(androidx.compose.ui.platform.飘花落叶言子楪世苏兰哲, androidx.compose.ui.platform.飘花落叶言子苏世哲兰楪, androidx.compose.runtime.internal.飘花落叶言子楪世兰苏哲):androidx.compose.ui.platform.飘花落叶言子兰苏楪世哲");
    }
}
