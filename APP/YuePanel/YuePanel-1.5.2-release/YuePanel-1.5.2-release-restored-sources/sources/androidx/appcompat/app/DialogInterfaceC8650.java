package androidx.appcompat.app;

import Yue.C6898;
import Yue.DialogC3302;
import Yue.InterfaceC3397;
import Yue.InterfaceC3451;
import Yue.InterfaceC4525;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import Yue.InterfaceC7613;
import Yue.InterfaceC7651;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

/* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceC8650 extends DialogC3302 implements DialogInterface {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f25740 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f25741 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final AlertController f25742;

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟$ۥ */
    public static class C1585 {

        /* JADX INFO: renamed from: P */
        private final AlertController.C8632 f3625P;
        private final int mTheme;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1585(@InterfaceC6391 Context context) {
            this(context, DialogInterfaceC8650.m28799(context, 0));
        }

        @InterfaceC6391
        public DialogInterfaceC8650 create() {
            DialogInterfaceC8650 dialogInterfaceC8650 = new DialogInterfaceC8650(this.f3625P.f3610, this.mTheme);
            this.f3625P.m4593(dialogInterfaceC8650.f25742);
            dialogInterfaceC8650.setCancelable(this.f3625P.f25685);
            if (this.f3625P.f25685) {
                dialogInterfaceC8650.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC8650.setOnCancelListener(this.f3625P.f25686);
            dialogInterfaceC8650.setOnDismissListener(this.f3625P.f25687);
            DialogInterface.OnKeyListener onKeyListener = this.f3625P.f25688;
            if (onKeyListener != null) {
                dialogInterfaceC8650.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC8650;
        }

        @InterfaceC6391
        public Context getContext() {
            return this.f3625P.f3610;
        }

        public C1585 setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C8632 c8632 = this.f3625P;
            c8632.f25690 = listAdapter;
            c8632.f25691 = onClickListener;
            return this;
        }

        public C1585 setCancelable(boolean z) {
            this.f3625P.f25685 = z;
            return this;
        }

        public C1585 setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.C8632 c8632 = this.f3625P;
            c8632.f25704 = cursor;
            c8632.f25705 = str;
            c8632.f25691 = onClickListener;
            return this;
        }

        public C1585 setCustomTitle(@InterfaceC6490 View view) {
            this.f3625P.f25674 = view;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1585 setIcon(@InterfaceC4525 int i) {
            this.f3625P.f25670 = i;
            return this;
        }

        public C1585 setIconAttribute(@InterfaceC3451 int i) {
            TypedValue typedValue = new TypedValue();
            this.f3625P.f3610.getTheme().resolveAttribute(i, typedValue, true);
            this.f3625P.f25670 = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public C1585 setInverseBackgroundForced(boolean z) {
            this.f3625P.f25707 = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1585 setItems(@InterfaceC3397 int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C8632 c8632 = this.f3625P;
            c8632.f25689 = c8632.f3610.getResources().getTextArray(i);
            this.f3625P.f25691 = onClickListener;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1585 setMessage(@InterfaceC7613 int i) {
            AlertController.C8632 c8632 = this.f3625P;
            c8632.f25675 = c8632.f3610.getText(i);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1585 setMultiChoiceItems(@InterfaceC3397 int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C8632 c8632 = this.f3625P;
            c8632.f25689 = c8632.f3610.getResources().getTextArray(i);
            AlertController.C8632 c86322 = this.f3625P;
            c86322.f25703 = onMultiChoiceClickListener;
            c86322.f25699 = zArr;
            c86322.f25700 = true;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1585 setNegativeButton(@InterfaceC7613 int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C8632 c8632 = this.f3625P;
            c8632.f25679 = c8632.f3610.getText(i);
            this.f3625P.f25681 = onClickListener;
            return this;
        }

        public C1585 setNegativeButtonIcon(Drawable drawable) {
            this.f3625P.f25680 = drawable;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1585 setNeutralButton(@InterfaceC7613 int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C8632 c8632 = this.f3625P;
            c8632.f25682 = c8632.f3610.getText(i);
            this.f3625P.f25684 = onClickListener;
            return this;
        }

        public C1585 setNeutralButtonIcon(Drawable drawable) {
            this.f3625P.f25683 = drawable;
            return this;
        }

        public C1585 setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.f3625P.f25686 = onCancelListener;
            return this;
        }

        public C1585 setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.f3625P.f25687 = onDismissListener;
            return this;
        }

        public C1585 setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f3625P.f25708 = onItemSelectedListener;
            return this;
        }

        public C1585 setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.f3625P.f25688 = onKeyListener;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1585 setPositiveButton(@InterfaceC7613 int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C8632 c8632 = this.f3625P;
            c8632.f25676 = c8632.f3610.getText(i);
            this.f3625P.f25678 = onClickListener;
            return this;
        }

        public C1585 setPositiveButtonIcon(Drawable drawable) {
            this.f3625P.f25677 = drawable;
            return this;
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        public C1585 setRecycleOnMeasureEnabled(boolean z) {
            this.f3625P.f25710 = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1585 setSingleChoiceItems(@InterfaceC3397 int i, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.C8632 c8632 = this.f3625P;
            c8632.f25689 = c8632.f3610.getResources().getTextArray(i);
            AlertController.C8632 c86322 = this.f3625P;
            c86322.f25691 = onClickListener;
            c86322.f25702 = i2;
            c86322.f25701 = true;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1585 setTitle(@InterfaceC7613 int i) {
            AlertController.C8632 c8632 = this.f3625P;
            c8632.f25673 = c8632.f3610.getText(i);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1585 setView(int i) {
            AlertController.C8632 c8632 = this.f3625P;
            c8632.f25693 = null;
            c8632.f25692 = i;
            c8632.f25698 = false;
            return this;
        }

        public DialogInterfaceC8650 show() {
            DialogInterfaceC8650 dialogInterfaceC8650Create = create();
            dialogInterfaceC8650Create.show();
            return dialogInterfaceC8650Create;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1585(@InterfaceC6391 Context context, @InterfaceC7651 int i) {
            this.f3625P = new AlertController.C8632(new ContextThemeWrapper(context, DialogInterfaceC8650.m28799(context, i)));
            this.mTheme = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1585 setIcon(@InterfaceC6490 Drawable drawable) {
            this.f3625P.f25671 = drawable;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1585 setMessage(@InterfaceC6490 CharSequence charSequence) {
            this.f3625P.f25675 = charSequence;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1585 setTitle(@InterfaceC6490 CharSequence charSequence) {
            this.f3625P.f25673 = charSequence;
            return this;
        }

        public C1585 setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.C8632 c8632 = this.f3625P;
            c8632.f25689 = charSequenceArr;
            c8632.f25691 = onClickListener;
            return this;
        }

        public C1585 setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C8632 c8632 = this.f3625P;
            c8632.f25679 = charSequence;
            c8632.f25681 = onClickListener;
            return this;
        }

        public C1585 setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C8632 c8632 = this.f3625P;
            c8632.f25682 = charSequence;
            c8632.f25684 = onClickListener;
            return this;
        }

        public C1585 setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C8632 c8632 = this.f3625P;
            c8632.f25676 = charSequence;
            c8632.f25678 = onClickListener;
            return this;
        }

        public C1585 setView(View view) {
            AlertController.C8632 c8632 = this.f3625P;
            c8632.f25693 = view;
            c8632.f25692 = 0;
            c8632.f25698 = false;
            return this;
        }

        public C1585 setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C8632 c8632 = this.f3625P;
            c8632.f25689 = charSequenceArr;
            c8632.f25703 = onMultiChoiceClickListener;
            c8632.f25699 = zArr;
            c8632.f25700 = true;
            return this;
        }

        public C1585 setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.C8632 c8632 = this.f3625P;
            c8632.f25704 = cursor;
            c8632.f25691 = onClickListener;
            c8632.f25702 = i;
            c8632.f25705 = str;
            c8632.f25701 = true;
            return this;
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public C1585 setView(View view, int i, int i2, int i3, int i4) {
            AlertController.C8632 c8632 = this.f3625P;
            c8632.f25693 = view;
            c8632.f25692 = 0;
            c8632.f25698 = true;
            c8632.f25694 = i;
            c8632.f25695 = i2;
            c8632.f25696 = i3;
            c8632.f25697 = i4;
            return this;
        }

        public C1585 setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C8632 c8632 = this.f3625P;
            c8632.f25704 = cursor;
            c8632.f25703 = onMultiChoiceClickListener;
            c8632.f25706 = str;
            c8632.f25705 = str2;
            c8632.f25700 = true;
            return this;
        }

        public C1585 setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C8632 c8632 = this.f3625P;
            c8632.f25689 = charSequenceArr;
            c8632.f25691 = onClickListener;
            c8632.f25702 = i;
            c8632.f25701 = true;
            return this;
        }

        public C1585 setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C8632 c8632 = this.f3625P;
            c8632.f25690 = listAdapter;
            c8632.f25691 = onClickListener;
            c8632.f25702 = i;
            c8632.f25701 = true;
            return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DialogInterfaceC8650(@InterfaceC6391 Context context) {
        this(context, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int m28799(@InterfaceC6391 Context context, @InterfaceC7651 int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C6898.C1110.f18389, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // Yue.DialogC3302, Yue.DialogC4065, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f25742.m28665();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f25742.m28666(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f25742.m28667(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // Yue.DialogC3302, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f25742.m28677(charSequence);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Button m28800(int i) {
        return this.f25742.m28662(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public ListView m28801() {
        return this.f25742.m28664();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m28802(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f25742.m28670(i, charSequence, onClickListener, null, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m28803(int i, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.f25742.m28670(i, charSequence, onClickListener, null, drawable);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m28804(int i, CharSequence charSequence, Message message) {
        this.f25742.m28670(i, charSequence, null, message, null);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m28805(int i) {
        this.f25742.m28671(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m28806(View view) {
        this.f25742.m28672(view);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m28807(int i) {
        this.f25742.m28673(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m28808(Drawable drawable) {
        this.f25742.m28674(drawable);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m28809(int i) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        this.f25742.m28673(typedValue.resourceId);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m28810(CharSequence charSequence) {
        this.f25742.m28675(charSequence);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m28811(View view) {
        this.f25742.m28679(view);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m28812(View view, int i, int i2, int i3, int i4) {
        this.f25742.m28680(view, i, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public DialogInterfaceC8650(@InterfaceC6391 Context context, @InterfaceC7651 int i) {
        super(context, m28799(context, i));
        this.f25742 = new AlertController(getContext(), this, getWindow());
    }

    public DialogInterfaceC8650(@InterfaceC6391 Context context, boolean z, @InterfaceC6490 DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }
}
