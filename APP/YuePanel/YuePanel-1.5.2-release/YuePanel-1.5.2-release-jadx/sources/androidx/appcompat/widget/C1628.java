package androidx.appcompat.widget;

import Yue.AbstractC3087;
import Yue.AbstractViewOnTouchListenerC5066;
import Yue.C3084;
import Yue.C3314;
import Yue.C4520;
import Yue.C6898;
import Yue.C7939;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7462;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.AbstractC1600;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C8694;
import androidx.appcompat.view.menu.C8697;
import androidx.appcompat.view.menu.C8698;
import androidx.appcompat.view.menu.InterfaceC8699;
import androidx.appcompat.view.menu.InterfaceC8700;
import androidx.appcompat.view.menu.SubMenuC8702;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.widget.ۥ */
/* JADX INFO: loaded from: classes.dex */
public class C1628 extends AbstractC1600 implements AbstractC3087.InterfaceC0045 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final String f26327 = "ActionMenuPresenter";

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public C8740 f26328;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public Drawable f26329;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public boolean f26330;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public boolean f26331;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public boolean f26332;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public int f26333;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public int f26334;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public int f26335;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public boolean f26336;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public boolean f26337;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public boolean f26338;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public boolean f26339;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public int f26340;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final SparseBooleanArray f26341;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public C8742 f26342;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public C8737 f26343;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public RunnableC8739 f26344;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public C8738 f26345;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final C8743 f26346;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f26347;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ$ۥ, reason: contains not printable characters */
    public class C8737 extends C8698 {
        public C8737(Context context, SubMenuC8702 subMenuC8702, View view) {
            super(context, subMenuC8702, view, false, C6898.C1110.f18382);
            if (!((C8697) subMenuC8702.getItem()).m29036()) {
                View view2 = C1628.this.f26328;
                m29058(view2 == null ? (View) C1628.this.f25969 : view2);
            }
            mo4652(C1628.this.f26346);
        }

        @Override // androidx.appcompat.view.menu.C8698
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo29057() {
            C1628 c1628 = C1628.this;
            c1628.f26343 = null;
            c1628.f26347 = 0;
            super.mo29057();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ$ۥ۟, reason: contains not printable characters */
    public class C8738 extends ActionMenuItemView.AbstractC1599 {
        public C8738() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC1599
        /* JADX INFO: renamed from: ۥ */
        public InterfaceC7462 mo4637() {
            C8737 c8737 = C1628.this.f26343;
            if (c8737 != null) {
                return c8737.m29055();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ$ۥ۟۟, reason: contains not printable characters */
    public class RunnableC8739 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public C8742 f26349;

        public RunnableC8739(C8742 c8742) {
            this.f26349 = c8742;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1628.this.f25963 != null) {
                C1628.this.f25963.changeMenuMode();
            }
            View view = (View) C1628.this.f25969;
            if (view != null && view.getWindowToken() != null && this.f26349.m29065()) {
                C1628.this.f26342 = this.f26349;
            }
            C1628.this.f26344 = null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ$ۥ۟۟۟, reason: contains not printable characters */
    public class C8740 extends C3314 implements ActionMenuView.InterfaceC1615 {

        /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ$ۥ۟۟۟$ۥ, reason: contains not printable characters */
        public class C8741 extends AbstractViewOnTouchListenerC5066 {

            /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
            public final /* synthetic */ C1628 f26352;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8741(View view, C1628 c1628) {
                super(view);
                this.f26352 = c1628;
            }

            @Override // Yue.AbstractViewOnTouchListenerC5066
            /* JADX INFO: renamed from: ۥ۟ */
            public InterfaceC7462 mo399() {
                C8742 c8742 = C1628.this.f26342;
                if (c8742 == null) {
                    return null;
                }
                return c8742.m29055();
            }

            @Override // Yue.AbstractViewOnTouchListenerC5066
            /* JADX INFO: renamed from: ۥ۟۟ */
            public boolean mo6795() {
                C1628.this.m29207();
                return true;
            }

            @Override // Yue.AbstractViewOnTouchListenerC5066
            /* JADX INFO: renamed from: ۥ۟۟۟ */
            public boolean mo15609() {
                C1628 c1628 = C1628.this;
                if (c1628.f26344 != null) {
                    return false;
                }
                c1628.m29195();
                return true;
            }
        }

        public C8740(Context context) {
            super(context, null, C6898.C1110.f18381);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C7939.m3953(this, getContentDescription());
            setOnTouchListener(new C8741(this, C1628.this));
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C1628.this.m29207();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C4520.m13233(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC1615
        /* JADX INFO: renamed from: ۥ */
        public boolean mo4635() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC1615
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo4636() {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C8742 extends C8698 {
        public C8742(Context context, C8694 c8694, View view, boolean z) {
            super(context, c8694, view, z, C6898.C1110.f18382);
            m29060(8388613);
            mo4652(C1628.this.f26346);
        }

        @Override // androidx.appcompat.view.menu.C8698
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo29057() {
            if (C1628.this.f25963 != null) {
                C1628.this.f25963.close();
            }
            C1628.this.f26342 = null;
            super.mo29057();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ$ۥ۟۟۟۠, reason: contains not printable characters */
    public class C8743 implements InterfaceC8699.InterfaceC1607 {
        public C8743() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC8699.InterfaceC1607
        public void onCloseMenu(@InterfaceC6391 C8694 c8694, boolean z) {
            if (c8694 instanceof SubMenuC8702) {
                c8694.getRootMenu().close(false);
            }
            InterfaceC8699.InterfaceC1607 interfaceC1607M28998 = C1628.this.m28998();
            if (interfaceC1607M28998 != null) {
                interfaceC1607M28998.onCloseMenu(c8694, z);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC8699.InterfaceC1607
        /* JADX INFO: renamed from: ۥ */
        public boolean mo4617(@InterfaceC6391 C8694 c8694) {
            if (c8694 == C1628.this.f25963) {
                return false;
            }
            C1628.this.f26347 = ((SubMenuC8702) c8694).getItem().getItemId();
            InterfaceC8699.InterfaceC1607 interfaceC1607M28998 = C1628.this.m28998();
            if (interfaceC1607M28998 != null) {
                return interfaceC1607M28998.mo4617(c8694);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @SuppressLint({"BanParcelableUsage"})
    public static class C8744 implements Parcelable {
        public static final Parcelable.Creator<C8744> CREATOR = new C8745();

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f26356;

        /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ$ۥ۟۟۟ۡ$ۥ, reason: contains not printable characters */
        public class C8745 implements Parcelable.Creator<C8744> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
            public C8744 createFromParcel(Parcel parcel) {
                return new C8744(parcel);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
            public C8744[] newArray(int i) {
                return new C8744[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8744() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f26356);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C8744(Parcel parcel) {
            this.f26356 = parcel.readInt();
        }
    }

    public C1628(Context context) {
        super(context, C6898.C6906.f18971, C6898.C6906.f18970);
        this.f26341 = new SparseBooleanArray();
        this.f26346 = new C8743();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:103:0x013b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.ۥ] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.ۥ۟۟۟ۢ] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.AbstractC1600, androidx.appcompat.view.menu.InterfaceC8699
    public boolean flagActionItems() {
        ArrayList<C8697> visibleItems;
        int size;
        int i;
        int iM29088;
        ?? r0;
        int i2;
        C1628 c1628 = this;
        C8694 c8694 = c1628.f25963;
        View view = null;
        ?? r3 = 0;
        if (c8694 != null) {
            visibleItems = c8694.getVisibleItems();
            size = visibleItems.size();
        } else {
            visibleItems = null;
            size = 0;
        }
        int i3 = c1628.f26335;
        int i4 = c1628.f26334;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c1628.f25969;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            C8697 c8697 = visibleItems.get(i7);
            if (c8697.mo6264()) {
                i5++;
            } else if (c8697.m29038()) {
                i6++;
            } else {
                z = true;
            }
            if (c1628.f26339 && c8697.isActionViewExpanded()) {
                i3 = 0;
            }
        }
        if (c1628.f26331 && (z || i6 + i5 > i3)) {
            i3--;
        }
        int i8 = i3 - i5;
        SparseBooleanArray sparseBooleanArray = c1628.f26341;
        sparseBooleanArray.clear();
        if (c1628.f26337) {
            int i9 = c1628.f26340;
            iM29088 = i4 / i9;
            i = i9 + ((i4 % i9) / iM29088);
        } else {
            i = 0;
            iM29088 = 0;
        }
        int i10 = 0;
        int i11 = 0;
        ?? r02 = c1628;
        while (i10 < size) {
            C8697 c86972 = visibleItems.get(i10);
            if (c86972.mo6264()) {
                View viewMo28999 = r02.mo28999(c86972, view, viewGroup);
                if (r02.f26337) {
                    iM29088 -= ActionMenuView.m29088(viewMo28999, i, iM29088, iMakeMeasureSpec, r3);
                } else {
                    viewMo28999.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewMo28999.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                int groupId = c86972.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                c86972.m29045(true);
                r0 = r3;
                i2 = size;
            } else if (c86972.m29038()) {
                int groupId2 = c86972.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i8 > 0 || z2) && i4 > 0 && (!r02.f26337 || iM29088 > 0);
                boolean z4 = z3;
                i2 = size;
                if (z3) {
                    View viewMo289992 = r02.mo28999(c86972, null, viewGroup);
                    if (r02.f26337) {
                        int iM290882 = ActionMenuView.m29088(viewMo289992, i, iM29088, iMakeMeasureSpec, 0);
                        iM29088 -= iM290882;
                        if (iM290882 == 0) {
                            z4 = false;
                        }
                    } else {
                        viewMo289992.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = viewMo289992.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z3 = z5 & (!r02.f26337 ? i4 + i11 <= 0 : i4 < 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i12 = 0; i12 < i10; i12++) {
                        C8697 c86973 = visibleItems.get(i12);
                        if (c86973.getGroupId() == groupId2) {
                            if (c86973.m29036()) {
                                i8++;
                            }
                            c86973.m29045(false);
                        }
                    }
                }
                if (z3) {
                    i8--;
                }
                c86972.m29045(z3);
                r0 = 0;
            } else {
                r0 = r3;
                i2 = size;
                c86972.m29045(r0);
            }
            i10++;
            r3 = r0;
            size = i2;
            view = null;
            r02 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1600, androidx.appcompat.view.menu.InterfaceC8699
    public InterfaceC8700 getMenuView(ViewGroup viewGroup) {
        InterfaceC8700 interfaceC8700 = this.f25969;
        InterfaceC8700 menuView = super.getMenuView(viewGroup);
        if (interfaceC8700 != menuView) {
            ((ActionMenuView) menuView).setPresenter(this);
        }
        return menuView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1600, androidx.appcompat.view.menu.InterfaceC8699
    public void initForMenu(@InterfaceC6391 Context context, @InterfaceC6490 C8694 c8694) {
        super.initForMenu(context, c8694);
        Resources resources = context.getResources();
        C3084 c3084M170 = C3084.m170(context);
        if (!this.f26332) {
            this.f26331 = c3084M170.m6262();
        }
        if (!this.f26338) {
            this.f26333 = c3084M170.m6257();
        }
        if (!this.f26336) {
            this.f26335 = c3084M170.m6258();
        }
        int measuredWidth = this.f26333;
        if (this.f26331) {
            if (this.f26328 == null) {
                C8740 c8740 = new C8740(this.f25961);
                this.f26328 = c8740;
                if (this.f26330) {
                    c8740.setImageDrawable(this.f26329);
                    this.f26329 = null;
                    this.f26330 = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f26328.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f26328.getMeasuredWidth();
        } else {
            this.f26328 = null;
        }
        this.f26334 = measuredWidth;
        this.f26340 = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.AbstractC1600, androidx.appcompat.view.menu.InterfaceC8699
    public void onCloseMenu(C8694 c8694, boolean z) {
        m29192();
        super.onCloseMenu(c8694, z);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof C8744) && (i = ((C8744) parcelable).f26356) > 0 && (menuItemFindItem = this.f25963.findItem(i)) != null) {
            onSubMenuSelected((SubMenuC8702) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public Parcelable onSaveInstanceState() {
        C8744 c8744 = new C8744();
        c8744.f26356 = this.f26347;
        return c8744;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1600, androidx.appcompat.view.menu.InterfaceC8699
    public boolean onSubMenuSelected(SubMenuC8702 subMenuC8702) {
        boolean z = false;
        if (!subMenuC8702.hasVisibleItems()) {
            return false;
        }
        SubMenuC8702 subMenuC87022 = subMenuC8702;
        while (subMenuC87022.getParentMenu() != this.f25963) {
            subMenuC87022 = (SubMenuC8702) subMenuC87022.getParentMenu();
        }
        View viewM29193 = m29193(subMenuC87022.getItem());
        if (viewM29193 == null) {
            return false;
        }
        this.f26347 = subMenuC8702.getItem().getItemId();
        int size = subMenuC8702.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = subMenuC8702.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C8737 c8737 = new C8737(this.f25962, subMenuC8702, viewM29193);
        this.f26343 = c8737;
        c8737.m29059(z);
        this.f26343.m29062();
        super.onSubMenuSelected(subMenuC8702);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1600, androidx.appcompat.view.menu.InterfaceC8699
    public void updateMenuView(boolean z) {
        super.updateMenuView(z);
        ((View) this.f25969).requestLayout();
        C8694 c8694 = this.f25963;
        boolean z2 = false;
        if (c8694 != null) {
            ArrayList<C8697> actionItems = c8694.getActionItems();
            int size = actionItems.size();
            for (int i = 0; i < size; i++) {
                AbstractC3087 abstractC3087Mo172 = actionItems.get(i).mo172();
                if (abstractC3087Mo172 != null) {
                    abstractC3087Mo172.m6297(this);
                }
            }
        }
        C8694 c86942 = this.f25963;
        ArrayList<C8697> nonActionItems = c86942 != null ? c86942.getNonActionItems() : null;
        if (this.f26331 && nonActionItems != null) {
            int size2 = nonActionItems.size();
            if (size2 == 1) {
                z2 = !nonActionItems.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f26328 == null) {
                this.f26328 = new C8740(this.f25961);
            }
            ViewGroup viewGroup = (ViewGroup) this.f26328.getParent();
            if (viewGroup != this.f25969) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f26328);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f25969;
                actionMenuView.addView(this.f26328, actionMenuView.m29093());
            }
        } else {
            C8740 c8740 = this.f26328;
            if (c8740 != null) {
                Object parent = c8740.getParent();
                Object obj = this.f25969;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f26328);
                }
            }
        }
        ((ActionMenuView) this.f25969).setOverflowReserved(this.f26331);
    }

    @Override // Yue.AbstractC3087.InterfaceC0045
    /* JADX INFO: renamed from: ۥ */
    public void mo180(boolean z) {
        if (z) {
            super.onSubMenuSelected(null);
            return;
        }
        C8694 c8694 = this.f25963;
        if (c8694 != null) {
            c8694.close(false);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1600
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo28995(C8697 c8697, InterfaceC8700.InterfaceC1608 interfaceC1608) {
        interfaceC1608.initialize(c8697, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC1608;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f25969);
        if (this.f26345 == null) {
            this.f26345 = new C8738();
        }
        actionMenuItemView.setPopupCallback(this.f26345);
    }

    @Override // androidx.appcompat.view.menu.AbstractC1600
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public boolean mo28997(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f26328) {
            return false;
        }
        return super.mo28997(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC1600
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public View mo28999(C8697 c8697, View view, ViewGroup viewGroup) {
        View actionView = c8697.getActionView();
        if (actionView == null || c8697.m29034()) {
            actionView = super.mo28999(c8697, view, viewGroup);
        }
        actionView.setVisibility(c8697.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1600
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public boolean mo29001(int i, C8697 c8697) {
        return c8697.m29036();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public boolean m29192() {
        return m29195() | m29196();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final View m29193(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f25969;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof InterfaceC8700.InterfaceC1608) && ((InterfaceC8700.InterfaceC1608) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public Drawable m29194() {
        C8740 c8740 = this.f26328;
        if (c8740 != null) {
            return c8740.getDrawable();
        }
        if (this.f26330) {
            return this.f26329;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean m29195() {
        Object obj;
        RunnableC8739 runnableC8739 = this.f26344;
        if (runnableC8739 != null && (obj = this.f25969) != null) {
            ((View) obj).removeCallbacks(runnableC8739);
            this.f26344 = null;
            return true;
        }
        C8742 c8742 = this.f26342;
        if (c8742 == null) {
            return false;
        }
        c8742.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean m29196() {
        C8737 c8737 = this.f26343;
        if (c8737 == null) {
            return false;
        }
        c8737.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean m29197() {
        return this.f26344 != null || m29198();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean m29198() {
        C8742 c8742 = this.f26342;
        return c8742 != null && c8742.m29056();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean m29199() {
        return this.f26331;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m29200(Configuration configuration) {
        if (!this.f26336) {
            this.f26335 = C3084.m170(this.f25962).m6258();
        }
        C8694 c8694 = this.f25963;
        if (c8694 != null) {
            c8694.onItemsChanged(true);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public void m29201(boolean z) {
        this.f26339 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public void m29202(int i) {
        this.f26335 = i;
        this.f26336 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public void m29203(ActionMenuView actionMenuView) {
        this.f25969 = actionMenuView;
        actionMenuView.initialize(this.f25963);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public void m29204(Drawable drawable) {
        C8740 c8740 = this.f26328;
        if (c8740 != null) {
            c8740.setImageDrawable(drawable);
        } else {
            this.f26330 = true;
            this.f26329 = drawable;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public void m29205(boolean z) {
        this.f26331 = z;
        this.f26332 = true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m29206(int i, boolean z) {
        this.f26333 = i;
        this.f26337 = z;
        this.f26338 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public boolean m29207() {
        C8694 c8694;
        if (!this.f26331 || m29198() || (c8694 = this.f25963) == null || this.f25969 == null || this.f26344 != null || c8694.getNonActionItems().isEmpty()) {
            return false;
        }
        RunnableC8739 runnableC8739 = new RunnableC8739(new C8742(this.f25962, this.f25963, this.f26328, true));
        this.f26344 = runnableC8739;
        ((View) this.f25969).post(runnableC8739);
        return true;
    }
}
