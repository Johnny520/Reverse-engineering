package androidx.recyclerview.widget;

import androidx.compose.foundation.text.C0966;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2536 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public long f7638;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f7639;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public long f7640;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public long f7641;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ArrayList f7642;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C2454 f7643;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m5044(AbstractC2484 abstractC2484) {
        int i = abstractC2484.mFlags;
        if (!abstractC2484.isInvalid() && (i & 4) == 0) {
            abstractC2484.getOldPosition();
            abstractC2484.getAbsoluteAdapterPosition();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract boolean mo4967();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract void mo4968();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract void mo4969(AbstractC2484 abstractC2484);

    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5045(androidx.recyclerview.widget.AbstractC2484 r10) {
        /*
            r9 = this;
            androidx.recyclerview.widget.飘花落叶言子世兰苏哲楪 r9 = r9.f7643
            if (r9 == 0) goto Lb0
            androidx.recyclerview.widget.RecyclerView r9 = r9.f7304
            r0 = 1
            r10.setIsRecyclable(r0)
            androidx.recyclerview.widget.飘花落叶言子哲楪苏世兰 r1 = r10.mShadowedHolder
            r2 = 0
            if (r1 == 0) goto L15
            androidx.recyclerview.widget.飘花落叶言子哲楪苏世兰 r1 = r10.mShadowingHolder
            if (r1 != 0) goto L15
            r10.mShadowedHolder = r2
        L15:
            r10.mShadowingHolder = r2
            boolean r1 = r10.shouldBeKeptAsChild()
            if (r1 != 0) goto Lb0
            android.view.View r1 = r10.itemView
            androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世 r2 = r9.f7231
            r9.m4745()
            androidx.recyclerview.widget.飘花落叶言子楪世哲苏兰 r3 = r9.f7228
            java.lang.Object r4 = r3.f7470
            androidx.recyclerview.widget.飘花落叶言子楪世苏兰哲 r4 = (androidx.recyclerview.widget.C2496) r4
            java.lang.Object r5 = r3.f7471
            androidx.recyclerview.widget.飘花落叶言子世兰苏哲楪 r5 = (androidx.recyclerview.widget.C2454) r5
            int r6 = r3.f7472
            r7 = 0
            if (r6 != r0) goto L41
            java.lang.Object r0 = r3.f7468
            android.view.View r0 = (android.view.View) r0
            if (r0 != r1) goto L3b
        L39:
            r0 = r7
            goto L6a
        L3b:
            java.lang.String r9 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            top.suzhelan.qstory.hook.item.C5925.m11311(r9)
            return
        L41:
            r8 = 2
            if (r6 == r8) goto Lab
            r3.f7472 = r8     // Catch: java.lang.Throwable -> L55
            androidx.recyclerview.widget.RecyclerView r6 = r5.f7304     // Catch: java.lang.Throwable -> L55
            int r6 = r6.indexOfChild(r1)     // Catch: java.lang.Throwable -> L55
            r8 = -1
            if (r6 != r8) goto L57
            r3.m4947(r1)     // Catch: java.lang.Throwable -> L55
        L52:
            r3.f7472 = r7
            goto L6a
        L55:
            r9 = move-exception
            goto La8
        L57:
            boolean r8 = r4.m4952(r6)     // Catch: java.lang.Throwable -> L55
            if (r8 == 0) goto L67
            r4.m4957(r6)     // Catch: java.lang.Throwable -> L55
            r3.m4947(r1)     // Catch: java.lang.Throwable -> L55
            r5.m4833(r6)     // Catch: java.lang.Throwable -> L55
            goto L52
        L67:
            r3.f7472 = r7
            goto L39
        L6a:
            if (r0 == 0) goto L95
            androidx.recyclerview.widget.飘花落叶言子哲楪苏世兰 r3 = androidx.recyclerview.widget.RecyclerView.m4689(r1)
            r2.m5036(r3)
            r2.m5042(r3)
            boolean r2 = androidx.recyclerview.widget.RecyclerView.f7177
            if (r2 == 0) goto L95
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "after removing animated view: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = ", "
            r2.append(r1)
            r2.append(r9)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "RecyclerView"
            android.util.Log.d(r2, r1)
        L95:
            r1 = r0 ^ 1
            r9.m4740(r1)
            if (r0 != 0) goto Lb0
            boolean r0 = r10.isTmpDetached()
            if (r0 == 0) goto Lb0
            android.view.View r10 = r10.itemView
            r9.removeDetachedView(r10, r7)
            return
        La8:
            r3.f7472 = r7
            throw r9
        Lab:
            java.lang.String r9 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            top.suzhelan.qstory.hook.item.C5925.m11311(r9)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.AbstractC2536.m5045(androidx.recyclerview.widget.飘花落叶言子哲楪苏世兰):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract boolean mo4970(AbstractC2484 abstractC2484, AbstractC2484 abstractC24842, C0966 c0966, C0966 c09662);
}
