package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.activity.AbstractC0900;
import androidx.activity.compose.C0851;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.ArrayList;
import kotlin.collections.AbstractC5176;
import p233.AbstractC8798;
import p346.C9607;
import p370.C9717;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.mcp.config.C6702;
import top.suzhelan.qstory.p015ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3306 extends AbstractC3370 implements InterfaceC3350 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public long f7733;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public Rect f7734;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C3296 f7736;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f7737;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f7738;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f7739;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public VelocityTracker f7743;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public GestureDetector f7746;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ArrayList f7747;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ArrayList f7748;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C9607 f7750;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f7751;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public DialogXRecycleView f7752;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f7753;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f7755;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f7756;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public float f7757;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f7759;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public float f7760;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f7742 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float[] f7741 = new float[2];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC3317 f7740 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f7758 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f7749 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f7754 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final RunnableC3337 f7744 = new RunnableC3337(this, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public View f7745 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C3300 f7735 = new C3300(this);

    public C3306(C9607 c9607) {
        this.f7750 = c9607;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static boolean m5438(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // androidx.recyclerview.widget.AbstractC3370
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo5439(Rect rect, View view, RecyclerView recyclerView, C3358 c3358) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.InterfaceC3350
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo5441(View view) {
        if (view == this.f7745) {
            this.f7745 = null;
        }
        AbstractC3317 abstractC3317M5268 = this.f7752.m5268(view);
        if (abstractC3317M5268 == null) {
            return;
        }
        AbstractC3317 abstractC3317 = this.f7740;
        if (abstractC3317 != null && abstractC3317M5268 == abstractC3317) {
            m5444(null, 0);
            return;
        }
        m5450(abstractC3317M5268, false);
        if (this.f7742.remove(abstractC3317M5268.itemView)) {
            this.f7750.getClass();
            AbstractC3297.m5427(abstractC3317M5268);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m5442(float[] fArr) {
        if ((this.f7753 & 12) != 0) {
            fArr[0] = (this.f7760 + this.f7755) - this.f7740.itemView.getLeft();
        } else {
            fArr[0] = this.f7740.itemView.getTranslationX();
        }
        if ((this.f7753 & 3) != 0) {
            fArr[1] = (this.f7757 + this.f7759) - this.f7740.itemView.getTop();
        } else {
            fArr[1] = this.f7740.itemView.getTranslationY();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final View m5443(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        AbstractC3317 abstractC3317 = this.f7740;
        if (abstractC3317 != null) {
            View view = abstractC3317.itemView;
            if (m5438(view, x, y, this.f7760 + this.f7755, this.f7757 + this.f7759)) {
                return view;
            }
        }
        ArrayList arrayList = this.f7754;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C3299 c3299 = (C3299) arrayList.get(size);
            View view2 = c3299.f7687.itemView;
            if (m5438(view2, x, y, c3299.f7700, c3299.f7701)) {
                return view2;
            }
        }
        DialogXRecycleView dialogXRecycleView = this.f7752;
        for (int iM5498 = dialogXRecycleView.f7573.m5498() - 1; iM5498 >= 0; iM5498--) {
            View viewM5499 = dialogXRecycleView.f7573.m5499(iM5498);
            float translationX = viewM5499.getTranslationX();
            float translationY = viewM5499.getTranslationY();
            if (x >= viewM5499.getLeft() + translationX && x <= viewM5499.getRight() + translationX && y >= viewM5499.getTop() + translationY && y <= viewM5499.getBottom() + translationY) {
                return viewM5499;
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
    */
    public final void m5444(AbstractC3317 abstractC3317, int i) {
        C9607 c9607;
        ?? r12;
        boolean z;
        ?? r122;
        AbstractC3317 abstractC33172;
        int iM5425;
        int i2;
        char c;
        float fSignum;
        Object obj;
        if (abstractC3317 == this.f7740 && i == this.f7749) {
            return;
        }
        this.f7733 = Long.MIN_VALUE;
        int i3 = this.f7749;
        m5450(abstractC3317, true);
        this.f7749 = i;
        if (i == 2) {
            if (abstractC3317 == null) {
                C6755.m11869("Must pass a ViewHolder when dragging");
                return;
            }
            this.f7745 = abstractC3317.itemView;
        }
        int i4 = (1 << ((i * 8) + 8)) - 1;
        ?? r2 = this.f7740;
        C9607 c96072 = this.f7750;
        if (r2 != 0) {
            if (r2.itemView.getParent() != null) {
                if (i3 == 2) {
                    i2 = 0;
                } else if (this.f7749 == 2) {
                    iM5425 = 0;
                    i2 = iM5425;
                } else {
                    c96072.getClass();
                    int iM5426 = (AbstractC3297.m5426(196611, this.f7752.getLayoutDirection()) & 65280) >> 8;
                    if (iM5426 != 0) {
                        if (Math.abs(this.f7755) > Math.abs(this.f7759)) {
                            int iM5451 = m5451(iM5426);
                            if (iM5451 > 0) {
                                iM5425 = AbstractC3297.m5425(iM5451, this.f7752.getLayoutDirection());
                            } else {
                                iM5425 = m5449(iM5426);
                                if (iM5425 <= 0) {
                                }
                            }
                            i2 = iM5425;
                        } else {
                            int iM5449 = m5449(iM5426);
                            if (iM5449 > 0) {
                                iM5425 = iM5449;
                            } else {
                                int iM54512 = m5451(iM5426);
                                if (iM54512 > 0) {
                                    iM5425 = AbstractC3297.m5425(iM54512, this.f7752.getLayoutDirection());
                                }
                            }
                            i2 = iM5425;
                        }
                    }
                }
                VelocityTracker velocityTracker = this.f7743;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f7743 = null;
                }
                char c2 = 4;
                float fSignum2 = 0.0f;
                if (i2 == 1 || i2 == 2) {
                    c = 0;
                    fSignum = Math.signum(this.f7759) * this.f7752.getHeight();
                    obj = null;
                } else if (i2 == 4 || i2 == 8 || i2 == 16 || i2 == 32) {
                    c = 0;
                    fSignum2 = Math.signum(this.f7755) * this.f7752.getWidth();
                    obj = null;
                    fSignum = 0.0f;
                } else {
                    obj = null;
                    fSignum = 0.0f;
                    c = 0;
                }
                if (i3 == 2) {
                    c2 = '\b';
                } else if (i2 > 0) {
                    c2 = 2;
                }
                float[] fArr = this.f7741;
                m5442(fArr);
                c9607 = c96072;
                char c3 = c2;
                ?? r123 = c;
                C3299 c3299 = new C3299(this, r2, i3, fArr[c], fArr[1], fSignum2, fSignum, i2, r2);
                DialogXRecycleView dialogXRecycleView = this.f7752;
                c9607.getClass();
                AbstractC3369 itemAnimator = dialogXRecycleView.getItemAnimator();
                long j = itemAnimator == null ? c3 == '\b' ? 200L : 250L : c3 == '\b' ? itemAnimator.f7984 : itemAnimator.f7985;
                ValueAnimator valueAnimator = c3299.f7697;
                valueAnimator.setDuration(j);
                this.f7754.add(c3299);
                r2.setIsRecyclable(r123);
                valueAnimator.start();
                abstractC33172 = null;
                z = true;
                r122 = r123;
            } else {
                c9607 = c96072;
                r122 = 0;
                if (r2.itemView == this.f7745) {
                    abstractC33172 = null;
                    this.f7745 = null;
                } else {
                    abstractC33172 = null;
                }
                c9607.getClass();
                AbstractC3297.m5427(r2);
                z = false;
            }
            this.f7740 = abstractC33172;
            r12 = r122;
        } else {
            c9607 = c96072;
            r12 = 0;
            z = false;
        }
        if (abstractC3317 != null) {
            DialogXRecycleView dialogXRecycleView2 = this.f7752;
            c9607.getClass();
            this.f7753 = (AbstractC3297.m5426(196611, dialogXRecycleView2.getLayoutDirection()) & i4) >> (this.f7749 * 8);
            this.f7760 = abstractC3317.itemView.getLeft();
            this.f7757 = abstractC3317.itemView.getTop();
            this.f7740 = abstractC3317;
            if (i == 2) {
                abstractC3317.itemView.performHapticFeedback(r12 == true ? 1 : 0);
            }
        }
        ?? parent = this.f7752.getParent();
        if (parent != 0) {
            ?? r124 = r12;
            if (this.f7740 != null) {
                r124 = 1;
            }
            parent.requestDisallowInterceptTouchEvent(r124);
        }
        if (!z) {
            this.f7752.getLayoutManager().f7935 = true;
        }
        c9607.getClass();
        this.f7752.invalidate();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m5445(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f7739;
        this.f7755 = f;
        this.f7759 = y - this.f7738;
        if ((i & 4) == 0) {
            this.f7755 = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f7755 = Math.min(0.0f, this.f7755);
        }
        if ((i & 1) == 0) {
            this.f7759 = Math.max(0.0f, this.f7759);
        }
        if ((i & 2) == 0) {
            this.f7759 = Math.min(0.0f, this.f7759);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m5446(AbstractC3317 abstractC3317) {
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
        if (this.f7752.isLayoutRequested()) {
            return;
        }
        char c = 2;
        if (this.f7749 != 2) {
            return;
        }
        C9607 c9607 = this.f7750;
        c9607.getClass();
        int i4 = (int) (this.f7760 + this.f7755);
        int i5 = (int) (this.f7757 + this.f7759);
        if (Math.abs(i5 - abstractC3317.itemView.getTop()) >= abstractC3317.itemView.getHeight() * 0.5f || Math.abs(i4 - abstractC3317.itemView.getLeft()) >= abstractC3317.itemView.getWidth() * 0.5f) {
            ArrayList arrayList = this.f7747;
            if (arrayList == null) {
                this.f7747 = new ArrayList();
                this.f7748 = new ArrayList();
            } else {
                arrayList.clear();
                this.f7748.clear();
            }
            int iRound = Math.round(this.f7760 + this.f7755);
            int iRound2 = Math.round(this.f7757 + this.f7759);
            int width = abstractC3317.itemView.getWidth() + iRound;
            int height = abstractC3317.itemView.getHeight() + iRound2;
            int i6 = (iRound + width) / 2;
            int i7 = (iRound2 + height) / 2;
            AbstractC3352 layoutManager = this.f7752.getLayoutManager();
            int iM5557 = layoutManager.m5557();
            int i8 = 0;
            while (i8 < iM5557) {
                char c2 = c;
                View viewM5558 = layoutManager.m5558(i8);
                if (viewM5558 != abstractC3317.itemView && viewM5558.getBottom() >= iRound2 && viewM5558.getTop() <= height && viewM5558.getRight() >= iRound && viewM5558.getLeft() <= width) {
                    AbstractC3317 abstractC3317M5268 = this.f7752.m5268(viewM5558);
                    int iAbs5 = Math.abs(i6 - ((viewM5558.getRight() + viewM5558.getLeft()) / 2));
                    int iAbs6 = Math.abs(i7 - ((viewM5558.getBottom() + viewM5558.getTop()) / 2));
                    int i9 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                    i = i4;
                    int size = this.f7747.size();
                    i2 = i5;
                    i3 = iRound;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < size) {
                        int i12 = size;
                        if (i9 <= ((Integer) this.f7748.get(i10)).intValue()) {
                            break;
                        }
                        i11++;
                        i10++;
                        size = i12;
                    }
                    this.f7747.add(i11, abstractC3317M5268);
                    this.f7748.add(i11, Integer.valueOf(i9));
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
            ArrayList arrayList2 = this.f7747;
            if (arrayList2.size() == 0) {
                return;
            }
            int width2 = abstractC3317.itemView.getWidth() + i13;
            int height2 = abstractC3317.itemView.getHeight() + i14;
            int left2 = i13 - abstractC3317.itemView.getLeft();
            int top3 = i14 - abstractC3317.itemView.getTop();
            int size2 = arrayList2.size();
            AbstractC3317 abstractC33172 = null;
            int i15 = -1;
            for (int i16 = 0; i16 < size2; i16++) {
                AbstractC3317 abstractC33173 = (AbstractC3317) arrayList2.get(i16);
                if (left2 > 0 && (right = abstractC33173.itemView.getRight() - width2) < 0 && abstractC33173.itemView.getRight() > abstractC3317.itemView.getRight() && (iAbs4 = Math.abs(right)) > i15) {
                    i15 = iAbs4;
                    abstractC33172 = abstractC33173;
                }
                if (left2 < 0 && (left = abstractC33173.itemView.getLeft() - i13) > 0 && abstractC33173.itemView.getLeft() < abstractC3317.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i15) {
                    i15 = iAbs3;
                    abstractC33172 = abstractC33173;
                }
                if (top3 < 0 && (top2 = abstractC33173.itemView.getTop() - i14) > 0 && abstractC33173.itemView.getTop() < abstractC3317.itemView.getTop() && (iAbs2 = Math.abs(top2)) > i15) {
                    i15 = iAbs2;
                    abstractC33172 = abstractC33173;
                }
                if (top3 > 0 && (bottom = abstractC33173.itemView.getBottom() - height2) < 0 && abstractC33173.itemView.getBottom() > abstractC3317.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i15) {
                    i15 = iAbs;
                    abstractC33172 = abstractC33173;
                }
            }
            if (abstractC33172 == null) {
                this.f7747.clear();
                this.f7748.clear();
                return;
            }
            int absoluteAdapterPosition = abstractC33172.getAbsoluteAdapterPosition();
            abstractC3317.getAbsoluteAdapterPosition();
            DialogXRecycleView dialogXRecycleView = this.f7752;
            "recyclerView";
            dialogXRecycleView.getClass();
            "viewHolder";
            "target";
            C9717 c9717 = c9607.f25077;
            int bindingAdapterPosition = abstractC3317.getBindingAdapterPosition();
            int bindingAdapterPosition2 = abstractC33172.getBindingAdapterPosition();
            ArrayList arrayList3 = c9717.f25401;
            if (bindingAdapterPosition != -1 && bindingAdapterPosition2 != -1 && bindingAdapterPosition >= 0 && bindingAdapterPosition < arrayList3.size() && bindingAdapterPosition2 >= 0 && bindingAdapterPosition2 < arrayList3.size()) {
                arrayList3.add(bindingAdapterPosition2, (C6702) arrayList3.remove(bindingAdapterPosition));
                AbstractC8798.m14017(c9717, AbstractC5176.m9356(arrayList3));
                c9717.m5363(bindingAdapterPosition, bindingAdapterPosition2);
                C0851 c0851 = c9717.f25400;
                if (c0851 != null) {
                    c0851.invoke();
                }
            }
            DialogXRecycleView dialogXRecycleView2 = this.f7752;
            AbstractC3352 layoutManager2 = dialogXRecycleView2.getLayoutManager();
            if (!(layoutManager2 instanceof InterfaceC3295)) {
                if (layoutManager2.mo5236()) {
                    if (AbstractC3352.m5548(abstractC33172.itemView) <= dialogXRecycleView2.getPaddingLeft()) {
                        dialogXRecycleView2.m5306(absoluteAdapterPosition);
                    }
                    if (AbstractC3352.m5545(abstractC33172.itemView) >= dialogXRecycleView2.getWidth() - dialogXRecycleView2.getPaddingRight()) {
                        dialogXRecycleView2.m5306(absoluteAdapterPosition);
                    }
                }
                if (layoutManager2.mo5235()) {
                    if (AbstractC3352.m5541(abstractC33172.itemView) <= dialogXRecycleView2.getPaddingTop()) {
                        dialogXRecycleView2.m5306(absoluteAdapterPosition);
                    }
                    if (AbstractC3352.m5546(abstractC33172.itemView) >= dialogXRecycleView2.getHeight() - dialogXRecycleView2.getPaddingBottom()) {
                        dialogXRecycleView2.m5306(absoluteAdapterPosition);
                        return;
                    }
                    return;
                }
                return;
            }
            View view = abstractC3317.itemView;
            View view2 = abstractC33172.itemView;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((InterfaceC3295) layoutManager2);
            linearLayoutManager.mo5234("Cannot drop a view during a scroll or layout calculation");
            linearLayoutManager.m5209();
            linearLayoutManager.m5246();
            int iM5543 = AbstractC3352.m5543(view);
            int iM55432 = AbstractC3352.m5543(view2);
            byte b = iM5543 < iM55432 ? (byte) 1 : (byte) -1;
            boolean z = linearLayoutManager.f7507;
            AbstractC3290 abstractC3290 = linearLayoutManager.f7510;
            if (z) {
                if (b == 1) {
                    linearLayoutManager.m5244(iM55432, abstractC3290.mo5404() - (linearLayoutManager.f7510.mo5398(view) + linearLayoutManager.f7510.mo5396(view2)));
                    return;
                } else {
                    linearLayoutManager.m5244(iM55432, abstractC3290.mo5404() - linearLayoutManager.f7510.mo5399(view2));
                    return;
                }
            }
            if (b == -1) {
                linearLayoutManager.m5244(iM55432, abstractC3290.mo5396(view2));
            } else {
                linearLayoutManager.m5244(iM55432, abstractC3290.mo5399(view2) - linearLayoutManager.f7510.mo5398(view));
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3370
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo5447(Canvas canvas, RecyclerView recyclerView) {
        boolean z = false;
        if (this.f7740 != null) {
            float[] fArr = this.f7741;
            m5442(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        AbstractC3317 abstractC3317 = this.f7740;
        this.f7750.getClass();
        ArrayList arrayList = this.f7754;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C3299 c3299 = (C3299) arrayList.get(i);
            int iSave = canvas.save();
            View view = c3299.f7687.itemView;
            canvas.restoreToCount(iSave);
        }
        if (abstractC3317 != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            C3299 c32992 = (C3299) arrayList.get(i2);
            boolean z2 = c32992.f7699;
            if (z2 && !c32992.f7696) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3370
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo5448(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        if (this.f7740 != null) {
            float[] fArr = this.f7741;
            m5442(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        AbstractC3317 abstractC3317 = this.f7740;
        this.f7750.getClass();
        ArrayList arrayList = this.f7754;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C3299 c3299 = (C3299) arrayList.get(i);
            AbstractC3317 abstractC33172 = c3299.f7687;
            float f3 = c3299.f7691;
            float f4 = c3299.f7689;
            if (f3 == f4) {
                c3299.f7700 = abstractC33172.itemView.getTranslationX();
            } else {
                c3299.f7700 = AbstractC0900.m706(f4, f3, c3299.f7693, f3);
            }
            float f5 = c3299.f7690;
            float f6 = c3299.f7688;
            if (f5 == f6) {
                c3299.f7701 = abstractC33172.itemView.getTranslationY();
            } else {
                c3299.f7701 = AbstractC0900.m706(f6, f5, c3299.f7693, f5);
            }
            int iSave = canvas.save();
            AbstractC3297.m5424(recyclerView, c3299.f7687, c3299.f7700, c3299.f7701, false);
            canvas.restoreToCount(iSave);
        }
        if (abstractC3317 != null) {
            int iSave2 = canvas.save();
            AbstractC3297.m5424(recyclerView, abstractC3317, f, f2, true);
            canvas.restoreToCount(iSave2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int m5449(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.f7759 > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f7743;
        C9607 c9607 = this.f7750;
        if (velocityTracker != null && this.f7758 > -1) {
            float f = this.f7756;
            c9607.getClass();
            velocityTracker.computeCurrentVelocity(DescriptorProtos$Edition.EDITION_2023_VALUE, f);
            float xVelocity = this.f7743.getXVelocity(this.f7758);
            float yVelocity = this.f7743.getYVelocity(this.f7758);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.f7737 && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.f7752.getHeight();
        c9607.getClass();
        float f2 = height * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f7759) <= f2) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m5450(AbstractC3317 abstractC3317, boolean z) {
        ArrayList arrayList = this.f7754;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C3299 c3299 = (C3299) arrayList.get(size);
            if (c3299.f7687 == abstractC3317) {
                c3299.f7698 |= z;
                if (!c3299.f7699) {
                    c3299.f7697.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m5451(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.f7755 > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f7743;
        C9607 c9607 = this.f7750;
        if (velocityTracker != null && this.f7758 > -1) {
            float f = this.f7756;
            c9607.getClass();
            velocityTracker.computeCurrentVelocity(DescriptorProtos$Edition.EDITION_2023_VALUE, f);
            float xVelocity = this.f7743.getXVelocity(this.f7758);
            float yVelocity = this.f7743.getYVelocity(this.f7758);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.f7737 && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.f7752.getWidth();
        c9607.getClass();
        float f2 = width * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f7755) <= f2) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m5452(int i, int i2, MotionEvent motionEvent) {
        int iM5426;
        View viewM5443;
        if (this.f7740 == null && i == 2 && this.f7749 != 2) {
            this.f7750.getClass();
            if (this.f7752.getScrollState() == 1) {
                return;
            }
            AbstractC3352 layoutManager = this.f7752.getLayoutManager();
            int i3 = this.f7758;
            AbstractC3317 abstractC3317M5268 = null;
            if (i3 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                float x = motionEvent.getX(iFindPointerIndex) - this.f7739;
                float y = motionEvent.getY(iFindPointerIndex) - this.f7738;
                float fAbs = Math.abs(x);
                float fAbs2 = Math.abs(y);
                float f = this.f7751;
                if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.mo5236()) && ((fAbs2 <= fAbs || !layoutManager.mo5235()) && (viewM5443 = m5443(motionEvent)) != null))) {
                    abstractC3317M5268 = this.f7752.m5268(viewM5443);
                }
            }
            if (abstractC3317M5268 == null || (iM5426 = (AbstractC3297.m5426(196611, this.f7752.getLayoutDirection()) & 65280) >> 8) == 0) {
                return;
            }
            float x2 = motionEvent.getX(i2);
            float y2 = motionEvent.getY(i2);
            float f2 = x2 - this.f7739;
            float f3 = y2 - this.f7738;
            float fAbs3 = Math.abs(f2);
            float fAbs4 = Math.abs(f3);
            float f4 = this.f7751;
            if (fAbs3 >= f4 || fAbs4 >= f4) {
                if (fAbs3 > fAbs4) {
                    if (f2 < 0.0f && (iM5426 & 4) == 0) {
                        return;
                    }
                    if (f2 > 0.0f && (iM5426 & 8) == 0) {
                        return;
                    }
                } else {
                    if (f3 < 0.0f && (iM5426 & 1) == 0) {
                        return;
                    }
                    if (f3 > 0.0f && (iM5426 & 2) == 0) {
                        return;
                    }
                }
                this.f7759 = 0.0f;
                this.f7755 = 0.0f;
                this.f7758 = motionEvent.getPointerId(0);
                m5444(abstractC3317M5268, 1);
            }
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC3350
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo5440(View view) {
    }
}
