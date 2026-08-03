package Yue;

import Yue.AbstractC3086;
import Yue.C5637;
import Yue.C6898;
import Yue.InterfaceC7144;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AbstractC1583;
import androidx.appcompat.app.AbstractC8651;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class DialogC3302 extends DialogC4065 implements InterfaceC3285 {
    private AbstractC8651 mDelegate;
    private final C5637.InterfaceC0820 mKeyDispatcher;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DialogC3302(@InterfaceC6391 Context context) {
        this(context, 0);
    }

    public static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C6898.C1110.f18453, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // Yue.DialogC4065, android.app.Dialog
    public void addContentView(@InterfaceC6391 View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().mo28838(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().mo28857();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C5637.m17498(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    @InterfaceC6490
    public <T extends View> T findViewById(@InterfaceC5411 int i) {
        return (T) getDelegate().mo28845(i);
    }

    @InterfaceC6391
    public AbstractC8651 getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AbstractC8651.m28817(this, this);
        }
        return this.mDelegate;
    }

    public AbstractC1583 getSupportActionBar() {
        return getDelegate().mo28850();
    }

    @Override // android.app.Dialog
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void invalidateOptionsMenu() {
        getDelegate().mo28853();
    }

    @Override // Yue.DialogC4065, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().mo28852();
        super.onCreate(bundle);
        getDelegate().mo28856(bundle);
    }

    @Override // Yue.DialogC4065, android.app.Dialog
    public void onStop() {
        super.onStop();
        getDelegate().mo28862();
    }

    @Override // Yue.InterfaceC3285
    public void onSupportActionModeFinished(AbstractC3086 abstractC3086) {
    }

    @Override // Yue.InterfaceC3285
    public void onSupportActionModeStarted(AbstractC3086 abstractC3086) {
    }

    @Override // Yue.InterfaceC3285
    @InterfaceC6490
    public AbstractC3086 onWindowStartingSupportActionMode(AbstractC3086.InterfaceC0044 interfaceC0044) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.DialogC4065, android.app.Dialog
    public void setContentView(@InterfaceC5683 int i) {
        initializeViewTreeOwners();
        getDelegate().mo28864(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().mo28872(charSequence);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo28863(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public DialogC3302(@InterfaceC6391 Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mKeyDispatcher = new C5637.InterfaceC0820() { // from class: Yue.ۥ۟ۡۡ۠
            @Override // Yue.C5637.InterfaceC0820
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f5188.superDispatchKeyEvent(keyEvent);
            }
        };
        AbstractC8651 delegate = getDelegate();
        delegate.mo28871(getThemeResId(context, i));
        delegate.mo28856(null);
    }

    @Override // Yue.DialogC4065, android.app.Dialog
    public void setContentView(@InterfaceC6391 View view) {
        initializeViewTreeOwners();
        getDelegate().mo28865(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().mo28872(getContext().getString(i));
    }

    @Override // Yue.DialogC4065, android.app.Dialog
    public void setContentView(@InterfaceC6391 View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().mo28866(view, layoutParams);
    }

    public DialogC3302(@InterfaceC6391 Context context, boolean z, @InterfaceC6490 DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.mKeyDispatcher = new C5637.InterfaceC0820() { // from class: Yue.ۥ۟ۡۡ۠
            @Override // Yue.C5637.InterfaceC0820
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f5188.superDispatchKeyEvent(keyEvent);
            }
        };
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }
}
