package androidx.appcompat.widget;

import Yue.AbstractC3087;
import Yue.AbstractViewOnTouchListenerC5066;
import Yue.C3055;
import Yue.C5726;
import Yue.C6898;
import Yue.C7837;
import Yue.C8273;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import Yue.InterfaceC7462;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.C1629;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class ActivityChooserView extends ViewGroup implements C1629.InterfaceC8746 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final C8713 f26191;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final ViewOnClickListenerC8714 f26192;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final View f26193;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final Drawable f26194;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final FrameLayout f26195;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final ImageView f26196;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final FrameLayout f26197;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final ImageView f26198;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final int f26199;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public AbstractC3087 f26200;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final DataSetObserver f26201;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final ViewTreeObserver.OnGlobalLayoutListener f26202;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public C5726 f26203;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f26204;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public boolean f26205;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public int f26206;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public boolean f26207;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public int f26208;

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public static class InnerLayout extends LinearLayout {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final int[] f26209 = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C7837 c7837M24868 = C7837.m24868(context, attributeSet, f26209);
            setBackgroundDrawable(c7837M24868.m24875(0));
            c7837M24868.m24899();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$ۥ */
    public class C1617 extends DataSetObserver {
        public C1617() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f26191.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f26191.notifyDataSetInvalidated();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$ۥ۟ */
    public class ViewTreeObserverOnGlobalLayoutListenerC1618 implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC1618() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.m4658()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().show();
                AbstractC3087 abstractC3087 = ActivityChooserView.this.f26200;
                if (abstractC3087 != null) {
                    abstractC3087.m6299(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$ۥ۟۟, reason: contains not printable characters */
    public class C8710 extends View.AccessibilityDelegate {
        public C8710() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            C3055.m5950(accessibilityNodeInfo).m6054(true);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟, reason: contains not printable characters */
    public class C8711 extends AbstractViewOnTouchListenerC5066 {
        public C8711(View view) {
            super(view);
        }

        @Override // Yue.AbstractViewOnTouchListenerC5066
        /* JADX INFO: renamed from: ۥ۟ */
        public InterfaceC7462 mo399() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // Yue.AbstractViewOnTouchListenerC5066
        /* JADX INFO: renamed from: ۥ۟۟ */
        public boolean mo6795() {
            ActivityChooserView.this.m29103();
            return true;
        }

        @Override // Yue.AbstractViewOnTouchListenerC5066
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public boolean mo15609() {
            ActivityChooserView.this.m4657();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C8712 extends DataSetObserver {
        public C8712() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.m29105();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠, reason: contains not printable characters */
    public class C8713 extends BaseAdapter {

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static final int f26212 = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static final int f26213 = 4;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static final int f26214 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public static final int f26215 = 1;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public static final int f26216 = 3;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public C1629 f26217;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f26218 = 4;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f26219;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public boolean f26220;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public boolean f26221;

        public C8713() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int iM29211 = this.f26217.m29211();
            if (!this.f26219 && this.f26217.m29213() != null) {
                iM29211--;
            }
            int iMin = Math.min(iM29211, this.f26218);
            return this.f26221 ? iMin + 1 : iMin;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.f26219 && this.f26217.m29213() != null) {
                i++;
            }
            return this.f26217.m29210(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return (this.f26221 && i == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                if (view != null && view.getId() == 1) {
                    return view;
                }
                View viewInflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C6898.C6906.f18975, viewGroup, false);
                viewInflate.setId(1);
                ((TextView) viewInflate.findViewById(C6898.C6903.f18955)).setText(ActivityChooserView.this.getContext().getString(C6898.C6907.f19002));
                return viewInflate;
            }
            if (view == null || view.getId() != C6898.C6903.f18918) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C6898.C6906.f18975, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(C6898.C6903.f18915);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(C6898.C6903.f18955)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f26219 && i == 0 && this.f26220) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        /* JADX INFO: renamed from: ۥ */
        public int m4659() {
            return this.f26217.m29211();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public C1629 m4660() {
            return this.f26217;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public ResolveInfo m29106() {
            return this.f26217.m29213();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m29107() {
            return this.f26217.m29215();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean m29108() {
            return this.f26219;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int m29109() {
            int i = this.f26218;
            this.f26218 = Integer.MAX_VALUE;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int iMax = 0;
            View view = null;
            for (int i2 = 0; i2 < count; i2++) {
                view = getView(i2, view, null);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                iMax = Math.max(iMax, view.getMeasuredWidth());
            }
            this.f26218 = i;
            return iMax;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m29110(C1629 c1629) {
            C1629 c1629M4660 = ActivityChooserView.this.f26191.m4660();
            if (c1629M4660 != null && ActivityChooserView.this.isShown()) {
                c1629M4660.unregisterObserver(ActivityChooserView.this.f26201);
            }
            this.f26217 = c1629;
            if (c1629 != null && ActivityChooserView.this.isShown()) {
                c1629.registerObserver(ActivityChooserView.this.f26201);
            }
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m29111(int i) {
            if (this.f26218 != i) {
                this.f26218 = i;
                notifyDataSetChanged();
            }
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void m29112(boolean z, boolean z2) {
            if (this.f26219 == z && this.f26220 == z2) {
                return;
            }
            this.f26219 = z;
            this.f26220 = z2;
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m29113(boolean z) {
            if (this.f26221 != z) {
                this.f26221 = z;
                notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public class ViewOnClickListenerC8714 implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public ViewOnClickListenerC8714() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f26197) {
                if (view != activityChooserView.f26195) {
                    throw new IllegalArgumentException();
                }
                activityChooserView.f26205 = false;
                activityChooserView.m29104(activityChooserView.f26206);
                return;
            }
            activityChooserView.m4657();
            Intent intentM4692 = ActivityChooserView.this.f26191.m4660().m4692(ActivityChooserView.this.f26191.m4660().m29212(ActivityChooserView.this.f26191.m29106()));
            if (intentM4692 != null) {
                intentM4692.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(intentM4692);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            m4661();
            AbstractC3087 abstractC3087 = ActivityChooserView.this.f26200;
            if (abstractC3087 != null) {
                abstractC3087.m6299(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int itemViewType = ((C8713) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                ActivityChooserView.this.m29104(Integer.MAX_VALUE);
                return;
            }
            ActivityChooserView.this.m4657();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.f26205) {
                if (i > 0) {
                    activityChooserView.f26191.m4660().m29223(i);
                    return;
                }
                return;
            }
            if (!activityChooserView.f26191.m29108()) {
                i++;
            }
            Intent intentM4692 = ActivityChooserView.this.f26191.m4660().m4692(i);
            if (intentM4692 != null) {
                intentM4692.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(intentM4692);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f26197) {
                throw new IllegalArgumentException();
            }
            if (activityChooserView.f26191.getCount() > 0) {
                ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                activityChooserView2.f26205 = true;
                activityChooserView2.m29104(activityChooserView2.f26206);
            }
            return true;
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m4661() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f26204;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActivityChooserView(@InterfaceC6391 Context context) {
        this(context, null);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public C1629 getDataModel() {
        return this.f26191.m4660();
    }

    public C5726 getListPopupWindow() {
        if (this.f26203 == null) {
            C5726 c5726 = new C5726(getContext());
            this.f26203 = c5726;
            c5726.mo6805(this.f26191);
            this.f26203.m17769(this);
            this.f26203.m17780(true);
            this.f26203.m17782(this.f26192);
            this.f26203.m17781(this.f26192);
        }
        return this.f26203;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1629 c1629M4660 = this.f26191.m4660();
        if (c1629M4660 != null) {
            c1629M4660.registerObserver(this.f26201);
        }
        this.f26207 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1629 c1629M4660 = this.f26191.m4660();
        if (c1629M4660 != null) {
            c1629M4660.unregisterObserver(this.f26201);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f26202);
        }
        if (m4658()) {
            m4657();
        }
        this.f26207 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f26193.layout(0, 0, i3 - i, i4 - i2);
        if (m4658()) {
            return;
        }
        m4657();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        View view = this.f26193;
        if (this.f26197.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.C1629.InterfaceC8746
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public void setActivityChooserModel(C1629 c1629) {
        this.f26191.m29110(c1629);
        if (m4658()) {
            m4657();
            m29103();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f26208 = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f26196.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f26196.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.f26206 = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f26204 = onDismissListener;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setProvider(AbstractC3087 abstractC3087) {
        this.f26200 = abstractC3087;
    }

    /* JADX INFO: renamed from: ۥ */
    public boolean m4657() {
        if (!m4658()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f26202);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean m4658() {
        return getListPopupWindow().mo2407();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m29103() {
        if (m4658() || !this.f26207) {
            return false;
        }
        this.f26205 = false;
        m29104(this.f26206);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
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
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m29104(int i) {
        if (this.f26191.m4660() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f26202);
        ?? r0 = this.f26197.getVisibility() == 0 ? 1 : 0;
        int iM4659 = this.f26191.m4659();
        if (i == Integer.MAX_VALUE || iM4659 <= i + r0) {
            this.f26191.m29113(false);
            this.f26191.m29111(i);
        } else {
            this.f26191.m29113(true);
            this.f26191.m29111(i - 1);
        }
        C5726 listPopupWindow = getListPopupWindow();
        if (listPopupWindow.mo2407()) {
            return;
        }
        if (this.f26205 || r0 == 0) {
            this.f26191.m29112(true, r0);
        } else {
            this.f26191.m29112(false, false);
        }
        listPopupWindow.m17771(Math.min(this.f26191.m29109(), this.f26199));
        listPopupWindow.show();
        AbstractC3087 abstractC3087 = this.f26200;
        if (abstractC3087 != null) {
            abstractC3087.m6299(true);
        }
        listPopupWindow.mo17740().setContentDescription(getContext().getString(C6898.C6907.f19003));
        listPopupWindow.mo17740().setSelector(new ColorDrawable(0));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m29105() {
        if (this.f26191.getCount() > 0) {
            this.f26195.setEnabled(true);
        } else {
            this.f26195.setEnabled(false);
        }
        int iM4659 = this.f26191.m4659();
        int iM29107 = this.f26191.m29107();
        if (iM4659 == 1 || (iM4659 > 1 && iM29107 > 0)) {
            this.f26197.setVisibility(0);
            ResolveInfo resolveInfoM29106 = this.f26191.m29106();
            PackageManager packageManager = getContext().getPackageManager();
            this.f26198.setImageDrawable(resolveInfoM29106.loadIcon(packageManager));
            if (this.f26208 != 0) {
                this.f26197.setContentDescription(getContext().getString(this.f26208, resolveInfoM29106.loadLabel(packageManager)));
            }
        } else {
            this.f26197.setVisibility(8);
        }
        if (this.f26197.getVisibility() == 0) {
            this.f26193.setBackgroundDrawable(this.f26194);
        } else {
            this.f26193.setBackgroundDrawable(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ActivityChooserView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26201 = new C1617();
        this.f26202 = new ViewTreeObserverOnGlobalLayoutListenerC1618();
        this.f26206 = 4;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6898.C6909.f19407, i, 0);
        C8273.m27437(this, context, C6898.C6909.f19407, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        this.f26206 = typedArrayObtainStyledAttributes.getInt(C6898.C6909.f19409, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C6898.C6909.f19408);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(C6898.C6906.f18974, (ViewGroup) this, true);
        ViewOnClickListenerC8714 viewOnClickListenerC8714 = new ViewOnClickListenerC8714();
        this.f26192 = viewOnClickListenerC8714;
        View viewFindViewById = findViewById(C6898.C6903.f18898);
        this.f26193 = viewFindViewById;
        this.f26194 = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(C6898.C6903.f18909);
        this.f26197 = frameLayout;
        frameLayout.setOnClickListener(viewOnClickListenerC8714);
        frameLayout.setOnLongClickListener(viewOnClickListenerC8714);
        this.f26198 = (ImageView) frameLayout.findViewById(C6898.C6903.f18916);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(C6898.C6903.f18911);
        frameLayout2.setOnClickListener(viewOnClickListenerC8714);
        frameLayout2.setAccessibilityDelegate(new C8710());
        frameLayout2.setOnTouchListener(new C8711(frameLayout2));
        this.f26195 = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(C6898.C6903.f18916);
        this.f26196 = imageView;
        imageView.setImageDrawable(drawable);
        C8713 c8713 = new C8713();
        this.f26191 = c8713;
        c8713.registerDataSetObserver(new C8712());
        Resources resources = context.getResources();
        this.f26199 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C6898.C6901.f18725));
    }
}
