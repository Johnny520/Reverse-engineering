package yyds;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.android.app.CustomRecyclerView;
import java.util.Objects;

/* JADX INFO: renamed from: yyds.ᛶᛱᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1272 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f5856;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C1402 f5857;

    public /* synthetic */ RunnableC1272(C1402 c1402, int i) {
        this.f5856 = i;
        this.f5857 = c1402;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        float f;
        int paddingBottom;
        int i = this.f5856;
        C1402 c1402 = this.f5857;
        switch (i) {
            case 0:
                if (!c1402.f6634) {
                    C1809 c1809 = c1402.f6622;
                    View view = c1402.f6621;
                    View view2 = c1402.f6633;
                    CustomRecyclerView customRecyclerView = c1809.f9116;
                    if (c1809.f9117) {
                        c1809.f9117 = false;
                        boolean z = customRecyclerView.getLayoutDirection() == 1;
                        int iMax = Math.max(view.getWidth(), view2.getWidth());
                        if (!z) {
                            f = view.getRight() == customRecyclerView.getWidth() ? iMax : 0.0f;
                        } else if (view.getLeft() == 0) {
                            iMax = -iMax;
                        }
                        ViewPropertyAnimator duration = view.animate().alpha(0.0f).translationX(f).setDuration(200L);
                        InterpolatorC1945 interpolatorC1945 = C1809.f9114;
                        duration.setInterpolator(interpolatorC1945).start();
                        view2.animate().alpha(0.0f).translationX(f).setDuration(200L).setInterpolator(interpolatorC1945).start();
                        break;
                    }
                }
                break;
            case 1:
                C1402 c14022 = this.f5857;
                int i2 = c14022.f6637;
                int i3 = c14022.f6619;
                CustomRecyclerView customRecyclerView2 = c14022.f6635;
                int i4 = c14022.f6629;
                View view3 = c14022.f6633;
                C0580 c0580 = c14022.f6631;
                c14022.m2843();
                View view4 = c14022.f6621;
                view4.setVisibility(c14022.f6632 ? 0 : 4);
                view3.setVisibility(c14022.f6632 ? 0 : 4);
                if (!c14022.f6632) {
                    c0580.setVisibility(4);
                } else {
                    int layoutDirection = customRecyclerView2.getLayoutDirection();
                    view4.setLayoutDirection(layoutDirection);
                    view3.setLayoutDirection(layoutDirection);
                    c0580.setLayoutDirection(layoutDirection);
                    boolean z2 = layoutDirection == 1;
                    int width = customRecyclerView2.getWidth();
                    int height = customRecyclerView2.getHeight();
                    Rect rectM2845 = c14022.m2845();
                    int i5 = z2 ? rectM2845.left : (width - rectM2845.right) - i2;
                    int i6 = rectM2845.top;
                    c14022.m2844(view4, i5, i6, i2 + i5, Math.max(height - rectM2845.bottom, i6));
                    int i7 = z2 ? rectM2845.left : (width - rectM2845.right) - i4;
                    int i8 = c14022.f6620 + rectM2845.top;
                    c14022.m2844(view3, i7, i8, i7 + i4, i8 + i3);
                    ((C1213) c14022.f6638.f812).getAdapter();
                    boolean zIsEmpty = TextUtils.isEmpty(null);
                    c0580.setVisibility(!zIsEmpty ? 0 : 4);
                    if (!zIsEmpty) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c0580.getLayoutParams();
                        if (!Objects.equals(c0580.getText(), null)) {
                            c0580.setText((CharSequence) null);
                            c0580.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(width, 1073741824), rectM2845.left + rectM2845.right + i4 + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(height, 1073741824), rectM2845.top + rectM2845.bottom + layoutParams.topMargin + layoutParams.bottomMargin, layoutParams.height));
                        }
                        int measuredWidth = c0580.getMeasuredWidth();
                        int measuredHeight = c0580.getMeasuredHeight();
                        int i9 = z2 ? rectM2845.left + i4 + layoutParams.leftMargin : (((width - rectM2845.right) - i4) - layoutParams.rightMargin) - measuredWidth;
                        int i10 = layoutParams.gravity;
                        int i11 = i10 & 7;
                        int i12 = i11 != 1 ? i11 != 5 ? 0 : measuredHeight : measuredHeight / 2;
                        int i13 = i10 & 112;
                        if (i13 != 16) {
                            paddingBottom = i13 != 80 ? view3.getPaddingTop() : i3 - view3.getPaddingBottom();
                        } else {
                            int paddingTop = view3.getPaddingTop();
                            paddingBottom = (((i3 - paddingTop) - view3.getPaddingBottom()) / 2) + paddingTop;
                        }
                        int i14 = (i8 + paddingBottom) - i12;
                        int i15 = rectM2845.top + layoutParams.topMargin;
                        int i16 = ((height - rectM2845.bottom) - layoutParams.bottomMargin) - measuredHeight;
                        if (i14 < i15) {
                            i14 = i15;
                        } else if (i14 > i16) {
                            i14 = i16;
                        }
                        c14022.m2844(c0580, i9, i14, i9 + measuredWidth, i14 + measuredHeight);
                    }
                }
                break;
            default:
                c1402.m2843();
                if (c1402.f6632) {
                    c1402.f6622.m3585(c1402.f6621, c1402.f6633);
                    c1402.m2849();
                    break;
                }
                break;
        }
    }
}
