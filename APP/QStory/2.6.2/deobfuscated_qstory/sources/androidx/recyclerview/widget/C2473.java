package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.activity.AbstractC0053;
import androidx.activity.compose.C0004;
import com.bumptech.glide.AbstractC3056;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.ArrayList;
import kotlin.collections.AbstractC4343;
import p217.AbstractC7968;
import p329.C8787;
import p356.C8909;
import top.suzhelan.qstory.hook.item.mcp.config.C5867;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2473 extends AbstractC2537 implements InterfaceC2517 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public long f7387;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public Rect f7388;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C2463 f7390;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f7391;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f7392;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f7393;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public VelocityTracker f7397;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public GestureDetector f7400;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ArrayList f7401;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ArrayList f7402;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C8787 f7404;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f7405;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public DialogXRecycleView f7406;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f7407;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f7409;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f7410;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public float f7411;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f7413;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public float f7414;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f7396 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float[] f7395 = new float[2];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC2484 f7394 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f7412 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f7403 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f7408 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final RunnableC2504 f7398 = new RunnableC2504(this, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public View f7399 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C2467 f7389 = new C2467(this);

    public C2473(C8787 c8787) {
        this.f7404 = c8787;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static boolean m4868(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // androidx.recyclerview.widget.AbstractC2537
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo4869(Rect rect, View view, RecyclerView recyclerView, C2525 c2525) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.InterfaceC2517
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo4871(View view) {
        if (view == this.f7399) {
            this.f7399 = null;
        }
        AbstractC2484 abstractC2484M4698 = this.f7406.m4698(view);
        if (abstractC2484M4698 == null) {
            return;
        }
        AbstractC2484 abstractC2484 = this.f7394;
        if (abstractC2484 != null && abstractC2484M4698 == abstractC2484) {
            m4874(null, 0);
            return;
        }
        m4880(abstractC2484M4698, false);
        if (this.f7396.remove(abstractC2484M4698.itemView)) {
            this.f7404.getClass();
            AbstractC2464.m4857(abstractC2484M4698);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m4872(float[] fArr) {
        if ((this.f7407 & 12) != 0) {
            fArr[0] = (this.f7414 + this.f7409) - this.f7394.itemView.getLeft();
        } else {
            fArr[0] = this.f7394.itemView.getTranslationX();
        }
        if ((this.f7407 & 3) != 0) {
            fArr[1] = (this.f7411 + this.f7413) - this.f7394.itemView.getTop();
        } else {
            fArr[1] = this.f7394.itemView.getTranslationY();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final View m4873(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        AbstractC2484 abstractC2484 = this.f7394;
        if (abstractC2484 != null) {
            View view = abstractC2484.itemView;
            if (m4868(view, x, y, this.f7414 + this.f7409, this.f7411 + this.f7413)) {
                return view;
            }
        }
        ArrayList arrayList = this.f7408;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C2466 c2466 = (C2466) arrayList.get(size);
            View view2 = c2466.f7341.itemView;
            if (m4868(view2, x, y, c2466.f7354, c2466.f7355)) {
                return view2;
            }
        }
        DialogXRecycleView dialogXRecycleView = this.f7406;
        for (int iM4928 = dialogXRecycleView.f7227.m4928() - 1; iM4928 >= 0; iM4928--) {
            View viewM4929 = dialogXRecycleView.f7227.m4929(iM4928);
            float translationX = viewM4929.getTranslationX();
            float translationY = viewM4929.getTranslationY();
            if (x >= viewM4929.getLeft() + translationX && x <= viewM4929.getRight() + translationX && y >= viewM4929.getTop() + translationY && y <= viewM4929.getBottom() + translationY) {
                return viewM4929;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.recyclerview.widget.飘花落叶言子哲楪苏世兰] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4874(androidx.recyclerview.widget.AbstractC2484 r22, int r23) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C2473.m4874(androidx.recyclerview.widget.飘花落叶言子哲楪苏世兰, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m4875(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f7393;
        this.f7409 = f;
        this.f7413 = y - this.f7392;
        if ((i & 4) == 0) {
            this.f7409 = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f7409 = Math.min(0.0f, this.f7409);
        }
        if ((i & 1) == 0) {
            this.f7413 = Math.max(0.0f, this.f7413);
        }
        if ((i & 2) == 0) {
            this.f7413 = Math.min(0.0f, this.f7413);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m4876(AbstractC2484 abstractC2484) {
        int bottom;
        int iAbs;
        int top2;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        int i;
        int i2;
        int i3;
        if (this.f7406.isLayoutRequested()) {
            return;
        }
        char c = 2;
        if (this.f7403 != 2) {
            return;
        }
        C8787 c8787 = this.f7404;
        c8787.getClass();
        int i4 = (int) (this.f7414 + this.f7409);
        int i5 = (int) (this.f7411 + this.f7413);
        if (Math.abs(i5 - abstractC2484.itemView.getTop()) >= abstractC2484.itemView.getHeight() * 0.5f || Math.abs(i4 - abstractC2484.itemView.getLeft()) >= abstractC2484.itemView.getWidth() * 0.5f) {
            ArrayList arrayList = this.f7401;
            if (arrayList == null) {
                this.f7401 = new ArrayList();
                this.f7402 = new ArrayList();
            } else {
                arrayList.clear();
                this.f7402.clear();
            }
            int iRound = Math.round(this.f7414 + this.f7409);
            int iRound2 = Math.round(this.f7411 + this.f7413);
            int width = abstractC2484.itemView.getWidth() + iRound;
            int height = abstractC2484.itemView.getHeight() + iRound2;
            int i6 = (iRound + width) / 2;
            int i7 = (iRound2 + height) / 2;
            AbstractC2519 layoutManager = this.f7406.getLayoutManager();
            int iM4987 = layoutManager.m4987();
            int i8 = 0;
            while (i8 < iM4987) {
                char c2 = c;
                View viewM4988 = layoutManager.m4988(i8);
                if (viewM4988 != abstractC2484.itemView && viewM4988.getBottom() >= iRound2 && viewM4988.getTop() <= height && viewM4988.getRight() >= iRound && viewM4988.getLeft() <= width) {
                    AbstractC2484 abstractC2484M4698 = this.f7406.m4698(viewM4988);
                    int iAbs5 = Math.abs(i6 - ((viewM4988.getRight() + viewM4988.getLeft()) / 2));
                    int iAbs6 = Math.abs(i7 - ((viewM4988.getBottom() + viewM4988.getTop()) / 2));
                    int i9 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                    i = i4;
                    int size = this.f7401.size();
                    i2 = i5;
                    i3 = iRound;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < size) {
                        int i12 = size;
                        if (i9 <= ((Integer) this.f7402.get(i10)).intValue()) {
                            break;
                        }
                        i11++;
                        i10++;
                        size = i12;
                    }
                    this.f7401.add(i11, abstractC2484M4698);
                    this.f7402.add(i11, Integer.valueOf(i9));
                } else {
                    i = i4;
                    i2 = i5;
                    i3 = iRound;
                }
                i8++;
                c = c2;
                i4 = i;
                i5 = i2;
                iRound = i3;
            }
            int i13 = i4;
            int i14 = i5;
            ArrayList arrayList2 = this.f7401;
            if (arrayList2.size() == 0) {
                return;
            }
            int width2 = abstractC2484.itemView.getWidth() + i13;
            int height2 = abstractC2484.itemView.getHeight() + i14;
            int left2 = i13 - abstractC2484.itemView.getLeft();
            int top3 = i14 - abstractC2484.itemView.getTop();
            int size2 = arrayList2.size();
            AbstractC2484 abstractC24842 = null;
            int i15 = -1;
            for (int i16 = 0; i16 < size2; i16++) {
                AbstractC2484 abstractC24843 = (AbstractC2484) arrayList2.get(i16);
                if (left2 > 0 && (right = abstractC24843.itemView.getRight() - width2) < 0 && abstractC24843.itemView.getRight() > abstractC2484.itemView.getRight() && (iAbs4 = Math.abs(right)) > i15) {
                    i15 = iAbs4;
                    abstractC24842 = abstractC24843;
                }
                if (left2 < 0 && (left = abstractC24843.itemView.getLeft() - i13) > 0 && abstractC24843.itemView.getLeft() < abstractC2484.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i15) {
                    i15 = iAbs3;
                    abstractC24842 = abstractC24843;
                }
                if (top3 < 0 && (top2 = abstractC24843.itemView.getTop() - i14) > 0 && abstractC24843.itemView.getTop() < abstractC2484.itemView.getTop() && (iAbs2 = Math.abs(top2)) > i15) {
                    i15 = iAbs2;
                    abstractC24842 = abstractC24843;
                }
                if (top3 > 0 && (bottom = abstractC24843.itemView.getBottom() - height2) < 0 && abstractC24843.itemView.getBottom() > abstractC2484.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i15) {
                    i15 = iAbs;
                    abstractC24842 = abstractC24843;
                }
            }
            if (abstractC24842 == null) {
                this.f7401.clear();
                this.f7402.clear();
                return;
            }
            int absoluteAdapterPosition = abstractC24842.getAbsoluteAdapterPosition();
            abstractC2484.getAbsoluteAdapterPosition();
            DialogXRecycleView dialogXRecycleView = this.f7406;
            "recyclerView";
            dialogXRecycleView.getClass();
            "viewHolder";
            "target";
            C8909 c8909 = c8787.f24738;
            int bindingAdapterPosition = abstractC2484.getBindingAdapterPosition();
            int bindingAdapterPosition2 = abstractC24842.getBindingAdapterPosition();
            ArrayList arrayList3 = c8909.f25095;
            if (bindingAdapterPosition != -1 && bindingAdapterPosition2 != -1 && bindingAdapterPosition >= 0 && bindingAdapterPosition < arrayList3.size() && bindingAdapterPosition2 >= 0 && bindingAdapterPosition2 < arrayList3.size()) {
                arrayList3.add(bindingAdapterPosition2, (C5867) arrayList3.remove(bindingAdapterPosition));
                AbstractC7968.m13430(c8909, AbstractC4343.m8804(arrayList3));
                c8909.m4793(bindingAdapterPosition, bindingAdapterPosition2);
                C0004 c0004 = c8909.f25094;
                if (c0004 != null) {
                    c0004.invoke();
                }
            }
            DialogXRecycleView dialogXRecycleView2 = this.f7406;
            AbstractC2519 layoutManager2 = dialogXRecycleView2.getLayoutManager();
            if (!(layoutManager2 instanceof InterfaceC2462)) {
                if (layoutManager2.mo4666()) {
                    if (AbstractC2519.m4978(abstractC24842.itemView) <= dialogXRecycleView2.getPaddingLeft()) {
                        dialogXRecycleView2.m4736(absoluteAdapterPosition);
                    }
                    if (AbstractC2519.m4975(abstractC24842.itemView) >= dialogXRecycleView2.getWidth() - dialogXRecycleView2.getPaddingRight()) {
                        dialogXRecycleView2.m4736(absoluteAdapterPosition);
                    }
                }
                if (layoutManager2.mo4665()) {
                    if (AbstractC2519.m4971(abstractC24842.itemView) <= dialogXRecycleView2.getPaddingTop()) {
                        dialogXRecycleView2.m4736(absoluteAdapterPosition);
                    }
                    if (AbstractC2519.m4976(abstractC24842.itemView) >= dialogXRecycleView2.getHeight() - dialogXRecycleView2.getPaddingBottom()) {
                        dialogXRecycleView2.m4736(absoluteAdapterPosition);
                        return;
                    }
                    return;
                }
                return;
            }
            View view = abstractC2484.itemView;
            View view2 = abstractC24842.itemView;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((InterfaceC2462) layoutManager2);
            linearLayoutManager.mo4664("Cannot drop a view during a scroll or layout calculation");
            linearLayoutManager.m4639();
            linearLayoutManager.m4676();
            int iM4973 = AbstractC2519.m4973(view);
            int iM49732 = AbstractC2519.m4973(view2);
            byte b = iM4973 < iM49732 ? (byte) 1 : (byte) -1;
            boolean z = linearLayoutManager.f7161;
            AbstractC2457 abstractC2457 = linearLayoutManager.f7164;
            if (z) {
                if (b == 1) {
                    linearLayoutManager.m4674(iM49732, abstractC2457.mo4834() - (linearLayoutManager.f7164.mo4828(view) + linearLayoutManager.f7164.mo4826(view2)));
                    return;
                } else {
                    linearLayoutManager.m4674(iM49732, abstractC2457.mo4834() - linearLayoutManager.f7164.mo4829(view2));
                    return;
                }
            }
            if (b == -1) {
                linearLayoutManager.m4674(iM49732, abstractC2457.mo4826(view2));
            } else {
                linearLayoutManager.m4674(iM49732, abstractC2457.mo4829(view2) - linearLayoutManager.f7164.mo4828(view));
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2537
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo4877(Canvas canvas, RecyclerView recyclerView) {
        boolean z = false;
        if (this.f7394 != null) {
            float[] fArr = this.f7395;
            m4872(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        AbstractC2484 abstractC2484 = this.f7394;
        this.f7404.getClass();
        ArrayList arrayList = this.f7408;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2466 c2466 = (C2466) arrayList.get(i);
            int iSave = canvas.save();
            View view = c2466.f7341.itemView;
            canvas.restoreToCount(iSave);
        }
        if (abstractC2484 != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            C2466 c24662 = (C2466) arrayList.get(i2);
            boolean z2 = c24662.f7353;
            if (z2 && !c24662.f7350) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2537
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo4878(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        if (this.f7394 != null) {
            float[] fArr = this.f7395;
            m4872(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        AbstractC2484 abstractC2484 = this.f7394;
        this.f7404.getClass();
        ArrayList arrayList = this.f7408;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2466 c2466 = (C2466) arrayList.get(i);
            AbstractC2484 abstractC24842 = c2466.f7341;
            float f3 = c2466.f7345;
            float f4 = c2466.f7343;
            if (f3 == f4) {
                c2466.f7354 = abstractC24842.itemView.getTranslationX();
            } else {
                c2466.f7354 = AbstractC0053.m145(f4, f3, c2466.f7347, f3);
            }
            float f5 = c2466.f7344;
            float f6 = c2466.f7342;
            if (f5 == f6) {
                c2466.f7355 = abstractC24842.itemView.getTranslationY();
            } else {
                c2466.f7355 = AbstractC0053.m145(f6, f5, c2466.f7347, f5);
            }
            int iSave = canvas.save();
            AbstractC2464.m4854(recyclerView, c2466.f7341, c2466.f7354, c2466.f7355, false);
            canvas.restoreToCount(iSave);
        }
        if (abstractC2484 != null) {
            int iSave2 = canvas.save();
            AbstractC2464.m4854(recyclerView, abstractC2484, f, f2, true);
            canvas.restoreToCount(iSave2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int m4879(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.f7413 > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f7397;
        C8787 c8787 = this.f7404;
        if (velocityTracker != null && this.f7412 > -1) {
            float f = this.f7410;
            c8787.getClass();
            velocityTracker.computeCurrentVelocity(DescriptorProtos$Edition.EDITION_2023_VALUE, f);
            float xVelocity = this.f7397.getXVelocity(this.f7412);
            float yVelocity = this.f7397.getYVelocity(this.f7412);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.f7391 && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.f7406.getHeight();
        c8787.getClass();
        float f2 = height * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f7413) <= f2) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m4880(AbstractC2484 abstractC2484, boolean z) {
        ArrayList arrayList = this.f7408;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C2466 c2466 = (C2466) arrayList.get(size);
            if (c2466.f7341 == abstractC2484) {
                c2466.f7352 |= z;
                if (!c2466.f7353) {
                    c2466.f7351.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m4881(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.f7409 > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f7397;
        C8787 c8787 = this.f7404;
        if (velocityTracker != null && this.f7412 > -1) {
            float f = this.f7410;
            c8787.getClass();
            velocityTracker.computeCurrentVelocity(DescriptorProtos$Edition.EDITION_2023_VALUE, f);
            float xVelocity = this.f7397.getXVelocity(this.f7412);
            float yVelocity = this.f7397.getYVelocity(this.f7412);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.f7391 && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.f7406.getWidth();
        c8787.getClass();
        float f2 = width * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f7409) <= f2) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m4882(int i, int i2, MotionEvent motionEvent) {
        int iM4856;
        View viewM4873;
        if (this.f7394 == null && i == 2 && this.f7403 != 2) {
            this.f7404.getClass();
            if (this.f7406.getScrollState() == 1) {
                return;
            }
            AbstractC2519 layoutManager = this.f7406.getLayoutManager();
            int i3 = this.f7412;
            AbstractC2484 abstractC2484M4698 = null;
            if (i3 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                float x = motionEvent.getX(iFindPointerIndex) - this.f7393;
                float y = motionEvent.getY(iFindPointerIndex) - this.f7392;
                float fAbs = Math.abs(x);
                float fAbs2 = Math.abs(y);
                float f = this.f7405;
                if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.mo4666()) && ((fAbs2 <= fAbs || !layoutManager.mo4665()) && (viewM4873 = m4873(motionEvent)) != null))) {
                    abstractC2484M4698 = this.f7406.m4698(viewM4873);
                }
            }
            if (abstractC2484M4698 == null || (iM4856 = (AbstractC2464.m4856(196611, this.f7406.getLayoutDirection()) & 65280) >> 8) == 0) {
                return;
            }
            float x2 = motionEvent.getX(i2);
            float y2 = motionEvent.getY(i2);
            float f2 = x2 - this.f7393;
            float f3 = y2 - this.f7392;
            float fAbs3 = Math.abs(f2);
            float fAbs4 = Math.abs(f3);
            float f4 = this.f7405;
            if (fAbs3 >= f4 || fAbs4 >= f4) {
                if (fAbs3 > fAbs4) {
                    if (f2 < 0.0f && (iM4856 & 4) == 0) {
                        return;
                    }
                    if (f2 > 0.0f && (iM4856 & 8) == 0) {
                        return;
                    }
                } else {
                    if (f3 < 0.0f && (iM4856 & 1) == 0) {
                        return;
                    }
                    if (f3 > 0.0f && (iM4856 & 2) == 0) {
                        return;
                    }
                }
                this.f7413 = 0.0f;
                this.f7409 = 0.0f;
                this.f7412 = motionEvent.getPointerId(0);
                m4874(abstractC2484M4698, 1);
            }
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC2517
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo4870(View view) {
    }
}
