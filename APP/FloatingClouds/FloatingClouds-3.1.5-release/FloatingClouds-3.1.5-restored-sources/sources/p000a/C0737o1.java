package p000a;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.C0983R;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.DialogInterfaceC0989b;
import java.util.Objects;

/* JADX INFO: renamed from: a.o1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0737o1 extends Spinner {

    /* JADX INFO: renamed from: i */
    @SuppressLint({"ResourceType"})
    public static final int[] f2888i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a */
    public final C0111G0 f2889a;

    /* JADX INFO: renamed from: b */
    public final Context f2890b;

    /* JADX INFO: renamed from: c */
    public final C0718n1 f2891c;

    /* JADX INFO: renamed from: d */
    public SpinnerAdapter f2892d;

    /* JADX INFO: renamed from: e */
    public final boolean f2893e;

    /* JADX INFO: renamed from: f */
    public final g f2894f;

    /* JADX INFO: renamed from: g */
    public int f2895g;

    /* JADX INFO: renamed from: h */
    public final Rect f2896h;

    /* JADX INFO: renamed from: a.o1$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            C0737o1 c0737o1 = C0737o1.this;
            if (!c0737o1.getInternalPopup().mo1732b()) {
                c0737o1.f2894f.mo1735e(c0737o1.getTextDirection(), c0737o1.getTextAlignment());
            }
            ViewTreeObserver viewTreeObserver = c0737o1.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* JADX INFO: renamed from: a.o1$b */
    public static final class b {
        /* JADX INFO: renamed from: a */
        public static void m1731a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* JADX INFO: renamed from: a.o1$c */
    public class c implements g, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        public DialogInterfaceC0989b f2898a;

        /* JADX INFO: renamed from: b */
        public d f2899b;

        /* JADX INFO: renamed from: c */
        public CharSequence f2900c;

        public c() {
        }

        @Override // p000a.C0737o1.g
        /* JADX INFO: renamed from: b */
        public final boolean mo1732b() {
            DialogInterfaceC0989b dialogInterfaceC0989b = this.f2898a;
            if (dialogInterfaceC0989b != null) {
                return dialogInterfaceC0989b.isShowing();
            }
            return false;
        }

        @Override // p000a.C0737o1.g
        /* JADX INFO: renamed from: c */
        public final void mo1733c(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // p000a.C0737o1.g
        /* JADX INFO: renamed from: d */
        public final int mo1734d() {
            return 0;
        }

        @Override // p000a.C0737o1.g
        public final void dismiss() {
            DialogInterfaceC0989b dialogInterfaceC0989b = this.f2898a;
            if (dialogInterfaceC0989b != null) {
                dialogInterfaceC0989b.dismiss();
                this.f2898a = null;
            }
        }

        @Override // p000a.C0737o1.g
        /* JADX INFO: renamed from: e */
        public final void mo1735e(int i, int i2) {
            if (this.f2899b == null) {
                return;
            }
            C0737o1 c0737o1 = C0737o1.this;
            DialogInterfaceC0989b.a aVar = new DialogInterfaceC0989b.a(c0737o1.getPopupContext());
            CharSequence charSequence = this.f2900c;
            AlertController.C0985b c0985b = aVar.f3691a;
            if (charSequence != null) {
                c0985b.f3680d = charSequence;
            }
            d dVar = this.f2899b;
            int selectedItemPosition = c0737o1.getSelectedItemPosition();
            c0985b.f3683g = dVar;
            c0985b.f3684h = this;
            c0985b.f3686j = selectedItemPosition;
            c0985b.f3685i = true;
            DialogInterfaceC0989b dialogInterfaceC0989bM2298a = aVar.m2298a();
            this.f2898a = dialogInterfaceC0989bM2298a;
            AlertController.RecycleListView recycleListView = dialogInterfaceC0989bM2298a.f3690f.f3655e;
            recycleListView.setTextDirection(i);
            recycleListView.setTextAlignment(i2);
            this.f2898a.show();
        }

        @Override // p000a.C0737o1.g
        /* JADX INFO: renamed from: g */
        public final int mo1736g() {
            return 0;
        }

        @Override // p000a.C0737o1.g
        /* JADX INFO: renamed from: i */
        public final Drawable mo1737i() {
            return null;
        }

        @Override // p000a.C0737o1.g
        /* JADX INFO: renamed from: j */
        public final CharSequence mo1738j() {
            return this.f2900c;
        }

        @Override // p000a.C0737o1.g
        /* JADX INFO: renamed from: l */
        public final void mo1739l(CharSequence charSequence) {
            this.f2900c = charSequence;
        }

        @Override // p000a.C0737o1.g
        /* JADX INFO: renamed from: m */
        public final void mo1740m(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // p000a.C0737o1.g
        /* JADX INFO: renamed from: n */
        public final void mo1741n(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // p000a.C0737o1.g
        /* JADX INFO: renamed from: o */
        public final void mo285o(ListAdapter listAdapter) {
            this.f2899b = (d) listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            C0737o1 c0737o1 = C0737o1.this;
            c0737o1.setSelection(i);
            if (c0737o1.getOnItemClickListener() != null) {
                c0737o1.performItemClick(null, i, this.f2899b.getItemId(i));
            }
            dismiss();
        }

        @Override // p000a.C0737o1.g
        /* JADX INFO: renamed from: p */
        public final void mo1742p(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }
    }

    /* JADX INFO: renamed from: a.o1$d */
    public static class d implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: a */
        public SpinnerAdapter f2902a;

        /* JADX INFO: renamed from: b */
        public ListAdapter f2903b;

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f2903b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f2902a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f2902a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f2902a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f2902a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f2902a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f2903b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2902a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2902a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: renamed from: a.o1$e */
    public class e extends C0102F9 implements g {

        /* JADX INFO: renamed from: C */
        public CharSequence f2904C;

        /* JADX INFO: renamed from: D */
        public d f2905D;

        /* JADX INFO: renamed from: E */
        public final Rect f2906E;

        /* JADX INFO: renamed from: F */
        public int f2907F;

        /* JADX INFO: renamed from: a.o1$e$a */
        public class a implements AdapterView.OnItemClickListener {
            public a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                e eVar = e.this;
                C0737o1.this.setSelection(i);
                C0737o1 c0737o1 = C0737o1.this;
                if (c0737o1.getOnItemClickListener() != null) {
                    c0737o1.performItemClick(view, i, eVar.f2905D.getItemId(i));
                }
                eVar.dismiss();
            }
        }

        /* JADX INFO: renamed from: a.o1$e$b */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                e eVar = e.this;
                C0737o1 c0737o1 = C0737o1.this;
                eVar.getClass();
                if (!c0737o1.isAttachedToWindow() || !c0737o1.getGlobalVisibleRect(eVar.f2906E)) {
                    eVar.dismiss();
                } else {
                    eVar.m1743s();
                    eVar.mo279f();
                }
            }
        }

        /* JADX INFO: renamed from: a.o1$e$c */
        public class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ b f2911a;

            public c(b bVar) {
                this.f2911a = bVar;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0737o1.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f2911a);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f2906E = new Rect();
            this.f342o = C0737o1.this;
            this.f352y = true;
            this.f353z.setFocusable(true);
            this.f343p = new a();
        }

        @Override // p000a.C0737o1.g
        /* JADX INFO: renamed from: e */
        public final void mo1735e(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            C0585g1 c0585g1 = this.f353z;
            boolean zIsShowing = c0585g1.isShowing();
            m1743s();
            this.f353z.setInputMethodMode(2);
            mo279f();
            C0006A5 c0006a5 = this.f330c;
            c0006a5.setChoiceMode(1);
            c0006a5.setTextDirection(i);
            c0006a5.setTextAlignment(i2);
            C0737o1 c0737o1 = C0737o1.this;
            int selectedItemPosition = c0737o1.getSelectedItemPosition();
            C0006A5 c0006a52 = this.f330c;
            if (c0585g1.isShowing() && c0006a52 != null) {
                c0006a52.setListSelectionHidden(false);
                c0006a52.setSelection(selectedItemPosition);
                if (c0006a52.getChoiceMode() != 0) {
                    c0006a52.setItemChecked(selectedItemPosition, true);
                }
            }
            if (zIsShowing || (viewTreeObserver = c0737o1.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            this.f353z.setOnDismissListener(new c(bVar));
        }

        @Override // p000a.C0737o1.g
        /* JADX INFO: renamed from: j */
        public final CharSequence mo1738j() {
            return this.f2904C;
        }

        @Override // p000a.C0737o1.g
        /* JADX INFO: renamed from: l */
        public final void mo1739l(CharSequence charSequence) {
            this.f2904C = charSequence;
        }

        @Override // p000a.C0102F9, p000a.C0737o1.g
        /* JADX INFO: renamed from: o */
        public final void mo285o(ListAdapter listAdapter) {
            super.mo285o(listAdapter);
            this.f2905D = (d) listAdapter;
        }

        @Override // p000a.C0737o1.g
        /* JADX INFO: renamed from: p */
        public final void mo1742p(int i) {
            this.f2907F = i;
        }

        /* JADX INFO: renamed from: s */
        public final void m1743s() {
            int i;
            C0585g1 c0585g1 = this.f353z;
            Drawable background = c0585g1.getBackground();
            C0737o1 c0737o1 = C0737o1.this;
            if (background != null) {
                background.getPadding(c0737o1.f2896h);
                int layoutDirection = c0737o1.getLayoutDirection();
                Rect rect = c0737o1.f2896h;
                i = layoutDirection == 1 ? rect.right : -rect.left;
            } else {
                Rect rect2 = c0737o1.f2896h;
                rect2.right = 0;
                rect2.left = 0;
                i = 0;
            }
            int paddingLeft = c0737o1.getPaddingLeft();
            int paddingRight = c0737o1.getPaddingRight();
            int width = c0737o1.getWidth();
            int i2 = c0737o1.f2895g;
            if (i2 == -2) {
                int iM1730a = c0737o1.m1730a(this.f2905D, c0585g1.getBackground());
                int i3 = c0737o1.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = c0737o1.f2896h;
                int i4 = (i3 - rect3.left) - rect3.right;
                if (iM1730a > i4) {
                    iM1730a = i4;
                }
                m287r(Math.max(iM1730a, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                m287r((width - paddingLeft) - paddingRight);
            } else {
                m287r(i2);
            }
            this.f333f = c0737o1.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f332e) - this.f2907F) + i : paddingLeft + this.f2907F + i;
        }
    }

    /* JADX INFO: renamed from: a.o1$f */
    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        public boolean f2913a;

        /* JADX INFO: renamed from: a.o1$f$a */
        public class a implements Parcelable.Creator<f> {
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final f createFromParcel(Parcel parcel) {
                f fVar = new f(parcel);
                fVar.f2913a = parcel.readByte() != 0;
                return fVar;
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final f[] newArray(int i) {
                return new f[i];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f2913a ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX INFO: renamed from: a.o1$g */
    public interface g {
        /* JADX INFO: renamed from: b */
        boolean mo1732b();

        /* JADX INFO: renamed from: c */
        void mo1733c(int i);

        /* JADX INFO: renamed from: d */
        int mo1734d();

        void dismiss();

        /* JADX INFO: renamed from: e */
        void mo1735e(int i, int i2);

        /* JADX INFO: renamed from: g */
        int mo1736g();

        /* JADX INFO: renamed from: i */
        Drawable mo1737i();

        /* JADX INFO: renamed from: j */
        CharSequence mo1738j();

        /* JADX INFO: renamed from: l */
        void mo1739l(CharSequence charSequence);

        /* JADX INFO: renamed from: m */
        void mo1740m(Drawable drawable);

        /* JADX INFO: renamed from: n */
        void mo1741n(int i);

        /* JADX INFO: renamed from: o */
        void mo285o(ListAdapter listAdapter);

        /* JADX INFO: renamed from: p */
        void mo1742p(int i);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0737o1(Context context, AttributeSet attributeSet, int i) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i);
        this.f2896h = new Rect();
        C0542df.m1311a(this, getContext());
        C0751of c0751ofM1768e = C0751of.m1768e(context, attributeSet, C0983R.styleable.Spinner, i);
        this.f2889a = new C0111G0(this);
        int i2 = C0983R.styleable.Spinner_popupTheme;
        TypedArray typedArray = c0751ofM1768e.f2960b;
        int resourceId = typedArray.getResourceId(i2, 0);
        if (resourceId != 0) {
            this.f2890b = new C0455Z3(context, resourceId);
        } else {
            this.f2890b = context;
        }
        int i3 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2888i, i, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e2) {
                    e = e2;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i3 != 0) {
                    }
                    textArray = typedArray.getTextArray(C0983R.styleable.Spinner_android_entries);
                    if (textArray != null) {
                    }
                    c0751ofM1768e.m1773f();
                    this.f2893e = true;
                    spinnerAdapter = this.f2892d;
                    if (spinnerAdapter != null) {
                    }
                    this.f2889a.m299d(attributeSet, i);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i3 != 0) {
            c cVar = new c();
            this.f2894f = cVar;
            cVar.f2900c = typedArray.getString(C0983R.styleable.Spinner_android_prompt);
        } else if (i3 == 1) {
            e eVar = new e(this.f2890b, attributeSet, i);
            C0751of c0751ofM1768e2 = C0751of.m1768e(this.f2890b, attributeSet, C0983R.styleable.Spinner, i);
            this.f2895g = c0751ofM1768e2.f2960b.getLayoutDimension(C0983R.styleable.Spinner_android_dropDownWidth, -2);
            eVar.m283m(c0751ofM1768e2.m1770b(C0983R.styleable.Spinner_android_popupBackground));
            eVar.f2904C = typedArray.getString(C0983R.styleable.Spinner_android_prompt);
            c0751ofM1768e2.m1773f();
            this.f2894f = eVar;
            this.f2891c = new C0718n1(this, this, eVar);
        }
        textArray = typedArray.getTextArray(C0983R.styleable.Spinner_android_entries);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(C0983R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        c0751ofM1768e.m1773f();
        this.f2893e = true;
        spinnerAdapter = this.f2892d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f2892d = null;
        }
        this.f2889a.m299d(attributeSet, i);
    }

    /* JADX INFO: renamed from: a */
    public final int m1730a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f2896h;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0111G0 c0111g0 = this.f2889a;
        if (c0111g0 != null) {
            c0111g0.m296a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.f2894f;
        return gVar != null ? gVar.mo1734d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.f2894f;
        return gVar != null ? gVar.mo1736g() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2894f != null ? this.f2895g : super.getDropDownWidth();
    }

    public final g getInternalPopup() {
        return this.f2894f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.f2894f;
        return gVar != null ? gVar.mo1737i() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2890b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.f2894f;
        return gVar != null ? gVar.mo1738j() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0111G0 c0111g0 = this.f2889a;
        if (c0111g0 != null) {
            return c0111g0.m297b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0111G0 c0111g0 = this.f2889a;
        if (c0111g0 != null) {
            return c0111g0.m298c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f2894f;
        if (gVar == null || !gVar.mo1732b()) {
            return;
        }
        gVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2894f == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m1730a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (!fVar.f2913a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f2894f;
        fVar.f2913a = gVar != null && gVar.mo1732b();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0718n1 c0718n1 = this.f2891c;
        if (c0718n1 == null || !c0718n1.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        g gVar = this.f2894f;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.mo1732b()) {
            return true;
        }
        this.f2894f.mo1735e(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0111G0 c0111g0 = this.f2889a;
        if (c0111g0 != null) {
            c0111g0.m300e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0111G0 c0111g0 = this.f2889a;
        if (c0111g0 != null) {
            c0111g0.m301f(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        g gVar = this.f2894f;
        if (gVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            gVar.mo1742p(i);
            gVar.mo1733c(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        g gVar = this.f2894f;
        if (gVar != null) {
            gVar.mo1741n(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f2894f != null) {
            this.f2895g = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f2894f;
        if (gVar != null) {
            gVar.mo1740m(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0889w1.m2115A(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f2894f;
        if (gVar != null) {
            gVar.mo1739l(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0111G0 c0111g0 = this.f2889a;
        if (c0111g0 != null) {
            c0111g0.m303h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0111G0 c0111g0 = this.f2889a;
        if (c0111g0 != null) {
            c0111g0.m304i(mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setAdapter(Landroid/widget/Adapter;)V */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2893e) {
            this.f2892d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        g gVar = this.f2894f;
        if (gVar != null) {
            Context context = this.f2890b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            d dVar = new d();
            dVar.f2902a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                dVar.f2903b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    b.m1731a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof InterfaceC0561ef) {
                    InterfaceC0561ef interfaceC0561ef = (InterfaceC0561ef) spinnerAdapter;
                    if (interfaceC0561ef.getDropDownViewTheme() == null) {
                        interfaceC0561ef.m1407a();
                    }
                }
            }
            gVar.mo285o(dVar);
        }
    }
}
