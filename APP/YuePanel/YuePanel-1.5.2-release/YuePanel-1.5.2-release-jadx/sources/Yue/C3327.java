package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
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
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.DialogInterfaceC8650;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3327 extends Spinner implements InterfaceC7838 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    @InterfaceC7662
    @SuppressLint({"ResourceType"})
    public static final int[] f5229 = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int f5230 = 15;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final String f5231 = "AppCompatSpinner";

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f5232 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f5233 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f5234 = -1;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final C3278 f5235;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final Context f5236;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public AbstractViewOnTouchListenerC5066 f5237;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public SpinnerAdapter f5238;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final boolean f5239;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public InterfaceC3334 f5240;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f5241;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final Rect f5242;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ$ۥ */
    public class C0105 extends AbstractViewOnTouchListenerC5066 {

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public final /* synthetic */ C3331 f5243;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0105(View view, C3331 c3331) {
            super(view);
            this.f5243 = c3331;
        }

        @Override // Yue.AbstractViewOnTouchListenerC5066
        /* JADX INFO: renamed from: ۥ۟ */
        public InterfaceC7462 mo399() {
            return this.f5243;
        }

        @Override // Yue.AbstractViewOnTouchListenerC5066
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean mo6795() {
            if (C3327.this.getInternalPopup().mo401()) {
                return true;
            }
            C3327.this.m398();
            return true;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ$ۥ۟ */
    public class ViewTreeObserverOnGlobalLayoutListenerC0106 implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC0106() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!C3327.this.getInternalPopup().mo401()) {
                C3327.this.m398();
            }
            ViewTreeObserver viewTreeObserver = C3327.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(23)
    public static final class C3328 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m400(@InterfaceC6391 ThemedSpinnerAdapter themedSpinnerAdapter, @InterfaceC6490 Resources.Theme theme) {
            if (C6499.m2995(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC8392
    public class DialogInterfaceOnClickListenerC3329 implements InterfaceC3334, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC8392
        public DialogInterfaceC8650 f5246;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public ListAdapter f5247;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public CharSequence f5248;

        public DialogInterfaceOnClickListenerC3329() {
        }

        @Override // Yue.C3327.InterfaceC3334
        public void dismiss() {
            DialogInterfaceC8650 dialogInterfaceC8650 = this.f5246;
            if (dialogInterfaceC8650 != null) {
                dialogInterfaceC8650.dismiss();
                this.f5246 = null;
            }
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C3327.this.setSelection(i);
            if (C3327.this.getOnItemClickListener() != null) {
                C3327.this.performItemClick(null, i, this.f5247.getItemId(i));
            }
            dismiss();
        }

        @Override // Yue.C3327.InterfaceC3334
        public void setBackgroundDrawable(Drawable drawable) {
            Log.e(C3327.f5231, "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // Yue.C3327.InterfaceC3334
        /* JADX INFO: renamed from: ۥ */
        public boolean mo401() {
            DialogInterfaceC8650 dialogInterfaceC8650 = this.f5246;
            if (dialogInterfaceC8650 != null) {
                return dialogInterfaceC8650.isShowing();
            }
            return false;
        }

        @Override // Yue.C3327.InterfaceC3334
        /* JADX INFO: renamed from: ۥ۟ */
        public int mo402() {
            return 0;
        }

        @Override // Yue.C3327.InterfaceC3334
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo6796(int i) {
            Log.e(C3327.f5231, "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // Yue.C3327.InterfaceC3334
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public CharSequence mo6797() {
            return this.f5248;
        }

        @Override // Yue.C3327.InterfaceC3334
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public Drawable mo6798() {
            return null;
        }

        @Override // Yue.C3327.InterfaceC3334
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void mo6799(CharSequence charSequence) {
            this.f5248 = charSequence;
        }

        @Override // Yue.C3327.InterfaceC3334
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void mo6800(int i) {
            Log.e(C3327.f5231, "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // Yue.C3327.InterfaceC3334
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void mo6801(int i) {
            Log.e(C3327.f5231, "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // Yue.C3327.InterfaceC3334
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public void mo6802(int i, int i2) {
            if (this.f5247 == null) {
                return;
            }
            DialogInterfaceC8650.C1585 c1585 = new DialogInterfaceC8650.C1585(C3327.this.getPopupContext());
            CharSequence charSequence = this.f5248;
            if (charSequence != null) {
                c1585.setTitle(charSequence);
            }
            DialogInterfaceC8650 dialogInterfaceC8650Create = c1585.setSingleChoiceItems(this.f5247, C3327.this.getSelectedItemPosition(), this).create();
            this.f5246 = dialogInterfaceC8650Create;
            ListView listViewM28801 = dialogInterfaceC8650Create.m28801();
            listViewM28801.setTextDirection(i);
            listViewM28801.setTextAlignment(i2);
            this.f5246.show();
        }

        @Override // Yue.C3327.InterfaceC3334
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public int mo6803() {
            return 0;
        }

        @Override // Yue.C3327.InterfaceC3334
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public int mo6804() {
            return 0;
        }

        @Override // Yue.C3327.InterfaceC3334
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public void mo6805(ListAdapter listAdapter) {
            this.f5247 = listAdapter;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C3330 implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public SpinnerAdapter f5250;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public ListAdapter f5251;

        public C3330(@InterfaceC6490 SpinnerAdapter spinnerAdapter, @InterfaceC6490 Resources.Theme theme) {
            this.f5250 = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f5251 = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    C3328.m400((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof InterfaceC7773) {
                    InterfaceC7773 interfaceC7773 = (InterfaceC7773) spinnerAdapter;
                    if (interfaceC7773.getDropDownViewTheme() == null) {
                        interfaceC7773.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f5251;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f5250;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f5250;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f5250;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f5250;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f5250;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f5251;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f5250;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f5250;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC8392
    public class C3331 extends C5726 implements InterfaceC3334 {

        /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
        public CharSequence f5252;

        /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
        public ListAdapter f5253;

        /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
        public final Rect f5254;

        /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
        public int f5255;

        /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠$ۥ */
        public class C0107 implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ C3327 f5257;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public C0107(C3327 c3327) {
                this.f5257 = c3327;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C3327.this.setSelection(i);
                if (C3327.this.getOnItemClickListener() != null) {
                    C3331 c3331 = C3331.this;
                    C3327.this.performItemClick(view, i, c3331.f5253.getItemId(i));
                }
                C3331.this.dismiss();
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠$ۥ۟ */
        public class ViewTreeObserverOnGlobalLayoutListenerC0108 implements ViewTreeObserver.OnGlobalLayoutListener {
            public ViewTreeObserverOnGlobalLayoutListenerC0108() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C3331 c3331 = C3331.this;
                if (!c3331.m6808(C3327.this)) {
                    C3331.this.dismiss();
                } else {
                    C3331.this.m6807();
                    C3331.super.show();
                }
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠$ۥ۟۟, reason: contains not printable characters */
        public class C3332 implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f5260;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public C3332(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f5260 = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C3327.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f5260);
                }
            }
        }

        public C3331(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f5254 = new Rect();
            m17769(C3327.this);
            m17780(true);
            m17786(0);
            m17782(new C0107(C3327.this));
        }

        @Override // Yue.C3327.InterfaceC3334
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public CharSequence mo6797() {
            return this.f5252;
        }

        @Override // Yue.C3327.InterfaceC3334
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public void mo6799(CharSequence charSequence) {
            this.f5252 = charSequence;
        }

        @Override // Yue.C3327.InterfaceC3334
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        public void mo6801(int i) {
            this.f5255 = i;
        }

        @Override // Yue.C3327.InterfaceC3334
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public void mo6802(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean zMo2407 = mo2407();
            m6807();
            m17777(2);
            super.show();
            ListView listViewMo17740 = mo17740();
            listViewMo17740.setChoiceMode(1);
            listViewMo17740.setTextDirection(i);
            listViewMo17740.setTextAlignment(i2);
            m17788(C3327.this.getSelectedItemPosition());
            if (zMo2407 || (viewTreeObserver = C3327.this.getViewTreeObserver()) == null) {
                return;
            }
            ViewTreeObserverOnGlobalLayoutListenerC0108 viewTreeObserverOnGlobalLayoutListenerC0108 = new ViewTreeObserverOnGlobalLayoutListenerC0108();
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0108);
            m17781(new C3332(viewTreeObserverOnGlobalLayoutListenerC0108));
        }

        @Override // Yue.C3327.InterfaceC3334
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public int mo6804() {
            return this.f5255;
        }

        @Override // Yue.C5726, Yue.C3327.InterfaceC3334
        /* JADX INFO: renamed from: ۥ۟۟۠ */
        public void mo6805(ListAdapter listAdapter) {
            super.mo6805(listAdapter);
            this.f5253 = listAdapter;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
        public void m6807() {
            int i;
            Drawable drawableM17739 = m17739();
            if (drawableM17739 != null) {
                drawableM17739.getPadding(C3327.this.f5242);
                i = C8370.m4344(C3327.this) ? C3327.this.f5242.right : -C3327.this.f5242.left;
            } else {
                Rect rect = C3327.this.f5242;
                rect.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = C3327.this.getPaddingLeft();
            int paddingRight = C3327.this.getPaddingRight();
            int width = C3327.this.getWidth();
            C3327 c3327 = C3327.this;
            int i2 = c3327.f5241;
            if (i2 == -2) {
                int iM397 = c3327.m397((SpinnerAdapter) this.f5253, m17739());
                int i3 = C3327.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = C3327.this.f5242;
                int i4 = (i3 - rect2.left) - rect2.right;
                if (iM397 > i4) {
                    iM397 = i4;
                }
                m17771(Math.max(iM397, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                m17771((width - paddingLeft) - paddingRight);
            } else {
                m17771(i2);
            }
            m17738(C8370.m4344(C3327.this) ? i + (((width - paddingRight) - m17759()) - mo6804()) : i + paddingLeft + mo6804());
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
        public boolean m6808(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.f5254);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C3333 extends View.BaseSavedState {
        public static final Parcelable.Creator<C3333> CREATOR = new C0109();

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public boolean f5262;

        /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۡ$ۥ */
        public class C0109 implements Parcelable.Creator<C3333> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
            public C3333 createFromParcel(Parcel parcel) {
                return new C3333(parcel);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
            public C3333[] newArray(int i) {
                return new C3333[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C3333(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f5262 ? (byte) 1 : (byte) 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C3333(Parcel parcel) {
            super(parcel);
            this.f5262 = parcel.readByte() != 0;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC8392
    public interface InterfaceC3334 {
        void dismiss();

        void setBackgroundDrawable(Drawable drawable);

        /* JADX INFO: renamed from: ۥ */
        boolean mo401();

        /* JADX INFO: renamed from: ۥ۟ */
        int mo402();

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        void mo6796(int i);

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        CharSequence mo6797();

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        Drawable mo6798();

        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        void mo6799(CharSequence charSequence);

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        void mo6800(int i);

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        void mo6801(int i);

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        void mo6802(int i, int i2);

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        int mo6803();

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        int mo6804();

        /* JADX INFO: renamed from: ۥ۟۟۠ */
        void mo6805(ListAdapter listAdapter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3327(@InterfaceC6391 Context context) {
        this(context, (AttributeSet) null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3278 c3278 = this.f5235;
        if (c3278 != null) {
            c3278.m349();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC3334 interfaceC3334 = this.f5240;
        return interfaceC3334 != null ? interfaceC3334.mo402() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC3334 interfaceC3334 = this.f5240;
        return interfaceC3334 != null ? interfaceC3334.mo6803() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f5240 != null ? this.f5241 : super.getDropDownWidth();
    }

    @InterfaceC8392
    public final InterfaceC3334 getInternalPopup() {
        return this.f5240;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC3334 interfaceC3334 = this.f5240;
        return interfaceC3334 != null ? interfaceC3334.mo6798() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f5236;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC3334 interfaceC3334 = this.f5240;
        return interfaceC3334 != null ? interfaceC3334.mo6797() : super.getPrompt();
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public ColorStateList getSupportBackgroundTintList() {
        C3278 c3278 = this.f5235;
        if (c3278 != null) {
            return c3278.m6723();
        }
        return null;
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3278 c3278 = this.f5235;
        if (c3278 != null) {
            return c3278.m6724();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC3334 interfaceC3334 = this.f5240;
        if (interfaceC3334 == null || !interfaceC3334.mo401()) {
            return;
        }
        this.f5240.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f5240 == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m397(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C3333 c3333 = (C3333) parcelable;
        super.onRestoreInstanceState(c3333.getSuperState());
        if (!c3333.f5262 || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0106());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        C3333 c3333 = new C3333(super.onSaveInstanceState());
        InterfaceC3334 interfaceC3334 = this.f5240;
        c3333.f5262 = interfaceC3334 != null && interfaceC3334.mo401();
        return c3333;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC5066 abstractViewOnTouchListenerC5066 = this.f5237;
        if (abstractViewOnTouchListenerC5066 == null || !abstractViewOnTouchListenerC5066.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC3334 interfaceC3334 = this.f5240;
        if (interfaceC3334 == null) {
            return super.performClick();
        }
        if (interfaceC3334.mo401()) {
            return true;
        }
        m398();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@InterfaceC6490 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3278 c3278 = this.f5235;
        if (c3278 != null) {
            c3278.m6726(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@InterfaceC4525 int i) {
        super.setBackgroundResource(i);
        C3278 c3278 = this.f5235;
        if (c3278 != null) {
            c3278.m6727(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC3334 interfaceC3334 = this.f5240;
        if (interfaceC3334 == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            interfaceC3334.mo6801(i);
            this.f5240.mo6796(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC3334 interfaceC3334 = this.f5240;
        if (interfaceC3334 != null) {
            interfaceC3334.mo6800(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f5240 != null) {
            this.f5241 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC3334 interfaceC3334 = this.f5240;
        if (interfaceC3334 != null) {
            interfaceC3334.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@InterfaceC4525 int i) {
        setPopupBackgroundDrawable(C3323.m396(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC3334 interfaceC3334 = this.f5240;
        if (interfaceC3334 != null) {
            interfaceC3334.mo6799(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@InterfaceC6490 ColorStateList colorStateList) {
        C3278 c3278 = this.f5235;
        if (c3278 != null) {
            c3278.m6729(colorStateList);
        }
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        C3278 c3278 = this.f5235;
        if (c3278 != null) {
            c3278.m6730(mode);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public int m397(SpinnerAdapter spinnerAdapter, Drawable drawable) {
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
        drawable.getPadding(this.f5242);
        Rect rect = this.f5242;
        return iMax2 + rect.left + rect.right;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m398() {
        this.f5240.mo6802(getTextDirection(), getTextAlignment());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3327(@InterfaceC6391 Context context, int i) {
        this(context, null, C6898.C1110.f18556, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setAdapter(Landroid/widget/Adapter;)V */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f5239) {
            this.f5238 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f5240 != null) {
            Context context = this.f5236;
            if (context == null) {
                context = getContext();
            }
            this.f5240.mo6805(new C3330(spinnerAdapter, context.getTheme()));
        }
    }

    public C3327(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C6898.C1110.f18556);
    }

    public C3327(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C3327(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:18:0x0053 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x0059 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:45:0x003d */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [Yue.ۥۣ۟ۡۤ, android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3327(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i, int i2, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrM24892;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i);
        this.f5242 = new Rect();
        C7772.m3866(this, getContext());
        C7837 c7837M24869 = C7837.m24869(context, attributeSet, C6898.C6909.f19708, i, 0);
        this.f5235 = new C3278(this);
        if (theme != null) {
            this.f5236 = new C4198(context, theme);
        } else {
            int iM24888 = c7837M24869.m24888(C6898.C6909.f19713, 0);
            if (iM24888 != 0) {
                this.f5236 = new C4198(context, iM24888);
            } else {
                this.f5236 = context;
            }
        }
        ?? r11 = -1;
        ?? r2 = 0;
        try {
            if (i2 == -1) {
                try {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5229, i, 0);
                    try {
                        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
                        r11 = typedArrayObtainStyledAttributes;
                        if (zHasValue) {
                            i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                            r11 = typedArrayObtainStyledAttributes;
                        }
                    } catch (Exception e) {
                        e = e;
                        Log.i(f5231, "Could not read android:spinnerMode", e);
                        r11 = typedArrayObtainStyledAttributes;
                        if (typedArrayObtainStyledAttributes != null) {
                        }
                        if (i2 != 0) {
                        }
                        charSequenceArrM24892 = c7837M24869.m24892(C6898.C6909.f19709);
                        if (charSequenceArrM24892 != null) {
                        }
                        c7837M24869.m24899();
                        this.f5239 = true;
                        spinnerAdapter = this.f5238;
                        if (spinnerAdapter != null) {
                        }
                        this.f5235.m6725(attributeSet, i);
                    }
                } catch (Exception e2) {
                    e = e2;
                    typedArrayObtainStyledAttributes = null;
                } catch (Throwable th) {
                    th = th;
                    if (r2 != 0) {
                        r2.recycle();
                    }
                    throw th;
                }
                r11.recycle();
            }
            if (i2 != 0) {
                DialogInterfaceOnClickListenerC3329 dialogInterfaceOnClickListenerC3329 = new DialogInterfaceOnClickListenerC3329();
                this.f5240 = dialogInterfaceOnClickListenerC3329;
                dialogInterfaceOnClickListenerC3329.mo6799(c7837M24869.m24890(C6898.C6909.f19711));
            } else if (i2 == 1) {
                C3331 c3331 = new C3331(this.f5236, attributeSet, i);
                C7837 c7837M248692 = C7837.m24869(this.f5236, attributeSet, C6898.C6909.f19708, i, 0);
                this.f5241 = c7837M248692.m24884(C6898.C6909.f19712, -2);
                c3331.setBackgroundDrawable(c7837M248692.m24875(C6898.C6909.f19710));
                c3331.mo6799(c7837M24869.m24890(C6898.C6909.f19711));
                c7837M248692.m24899();
                this.f5240 = c3331;
                this.f5237 = new C0105(this, c3331);
            }
            charSequenceArrM24892 = c7837M24869.m24892(C6898.C6909.f19709);
            if (charSequenceArrM24892 != null) {
                ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrM24892);
                arrayAdapter.setDropDownViewResource(C6898.C6906.f18999);
                setAdapter(arrayAdapter);
            }
            c7837M24869.m24899();
            this.f5239 = true;
            spinnerAdapter = this.f5238;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.f5238 = null;
            }
            this.f5235.m6725(attributeSet, i);
        } catch (Throwable th2) {
            th = th2;
            r2 = r11;
        }
    }
}
