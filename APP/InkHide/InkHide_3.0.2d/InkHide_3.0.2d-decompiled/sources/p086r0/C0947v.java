package p086r0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0947v implements TextWatcher {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3397b = 1;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3398c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ EditText f3399d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f3400e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0947v(C0950w c0950w, EditText editText, Object obj) {
        this.f3400e = c0950w;
        this.f3399d = editText;
        this.f3398c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string;
        Object obj = this.f3400e;
        switch (this.f3397b) {
            case 0:
                if (editable != null) {
                    ((C0950w) obj).m2123h(this.f3399d, editable, this.f3398c);
                    break;
                }
                break;
            default:
                C0822A1 c0822a1 = (C0822A1) obj;
                c0822a1.getClass();
                Activity activity = null;
                String string2 = (editable == null || (string = editable.toString()) == null) ? null : AbstractC0299i.m507C0(string).toString();
                if (string2 == null) {
                    string2 = "";
                }
                String str = string2;
                boolean z2 = AbstractC1126i.f3786a;
                if (C1124g.m2443s() && C1124g.m2435k().getEnableSearchCommand()) {
                    String string3 = AbstractC0299i.m507C0(C1124g.m2435k().getSearchCommandText()).toString();
                    if (AbstractC0307q.m534d0(string3)) {
                        string3 = "#hide";
                    }
                    boolean zEquals = str.equals(string3);
                    String string4 = AbstractC0299i.m507C0(C1124g.m2435k().getSearchListCommandText()).toString();
                    if (AbstractC0307q.m534d0(string4)) {
                        string4 = "#list";
                    }
                    boolean zEquals2 = str.equals(string4);
                    if (zEquals || zEquals2) {
                        EditText editText = this.f3399d;
                        Context context = editText.getContext();
                        while (true) {
                            if (context instanceof ContextWrapper) {
                                if (context instanceof Activity) {
                                    activity = (Activity) context;
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            } else if (context instanceof Activity) {
                                activity = (Activity) context;
                            }
                        }
                        Activity activity2 = activity;
                        if (activity2 != null) {
                            editText.post(new RunnableC0936r0(c0822a1, activity2, editText, this.f3398c, zEquals2, str));
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        int i5 = this.f3397b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        int i5 = this.f3397b;
    }

    public C0947v(C0822A1 c0822a1, Object obj, EditText editText) {
        this.f3400e = c0822a1;
        this.f3398c = obj;
        this.f3399d = editText;
    }

    /* JADX INFO: renamed from: a */
    private final void m2108a(int i2, int i3, int i4, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: b */
    private final void m2109b(int i2, int i3, int i4, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: c */
    private final void m2110c(int i2, int i3, int i4, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: d */
    private final void m2111d(int i2, int i3, int i4, CharSequence charSequence) {
    }
}
