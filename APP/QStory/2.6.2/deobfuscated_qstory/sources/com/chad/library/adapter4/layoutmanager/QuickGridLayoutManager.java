package com.chad.library.adapter4.layoutmanager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.AbstractC2450;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p219.C7973;
import p273.C8337;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000bB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/chad/library/adapter4/layoutmanager/QuickGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "飘花落叶言楪世兰苏哲子/飘花落叶言子楪世苏哲兰", "com.github.CymChad.brvah"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class QuickGridLayoutManager extends GridLayoutManager {

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public AbstractC2450 f9822;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final C7973 f9823;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        C7973 c7973 = new C7973(this);
        this.f9823 = c7973;
        c7973.f22051 = this.f7151;
        this.f7151 = c7973;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final void mo4668(RecyclerView recyclerView) {
        this.f9822 = null;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final void mo5006(RecyclerView recyclerView) {
        this.f9822 = recyclerView.getAdapter();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final void mo4774(AbstractC2450 abstractC2450) {
        this.f9822 = abstractC2450;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager
    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲 */
    public final void mo4622(C8337 c8337) {
        this.f9823.f22051 = c8337;
    }
}
