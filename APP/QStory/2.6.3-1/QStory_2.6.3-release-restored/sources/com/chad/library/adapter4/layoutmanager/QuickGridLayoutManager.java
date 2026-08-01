package com.chad.library.adapter4.layoutmanager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.AbstractC3283;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p235.C8803;
import p289.C9167;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000bB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, m151d2 = {"Lcom/chad/library/adapter4/layoutmanager/QuickGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "飘花落叶言楪世兰苏哲子/飘花落叶言子楪世苏哲兰", "com.github.CymChad.brvah"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public class QuickGridLayoutManager extends GridLayoutManager {

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public AbstractC3283 f10172;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final C8803 f10173;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        C8803 c8803 = new C8803(this);
        this.f10173 = c8803;
        c8803.f22393 = this.f7497;
        this.f7497 = c8803;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final void mo5238(RecyclerView recyclerView) {
        this.f10172 = null;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final void mo5576(RecyclerView recyclerView) {
        this.f10172 = recyclerView.getAdapter();
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final void mo5344(AbstractC3283 abstractC3283) {
        this.f10172 = abstractC3283;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager
    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲 */
    public final void mo5192(C9167 c9167) {
        this.f10173.f22393 = c9167;
    }
}
