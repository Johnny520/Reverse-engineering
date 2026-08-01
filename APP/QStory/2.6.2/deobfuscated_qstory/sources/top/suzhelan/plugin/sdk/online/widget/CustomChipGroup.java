package top.suzhelan.plugin.sdk.online.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p301.AbstractC8615;
import p389.AbstractC9106;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R*\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ltop/suzhelan/plugin/sdk/online/widget/CustomChipGroup;", "L飘花落叶言楪苏世哲子兰/飘花落叶言子楪苏世兰哲;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "value", "飘花落叶言子世楪苏兰哲", "I", "getMaxRows", "()I", "setMaxRows", "(I)V", "maxRows", "online-plugin-sdk_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CustomChipGroup extends AbstractC8615 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters and from kotlin metadata */
    public int maxRows;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomChipGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.maxRows = Integer.MAX_VALUE;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC9106.f25474);
        typedArrayObtainStyledAttributes.getClass();
        setMaxRows(typedArrayObtainStyledAttributes.getInt(0, Integer.MAX_VALUE));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int getMaxRows() {
        return this.maxRows;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.material.internal.AbstractC3161, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.plugin.sdk.online.widget.CustomChipGroup.onMeasure(int, int):void");
    }

    public final void setMaxRows(int i) {
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        this.maxRows = i;
        requestLayout();
    }
}
