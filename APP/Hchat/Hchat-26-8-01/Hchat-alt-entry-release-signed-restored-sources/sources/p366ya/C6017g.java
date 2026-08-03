package p366ya;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import gg.AbstractC1416l;
import java.util.LinkedHashSet;
import java.util.Set;
import p085fg.InterfaceC1231l;
import p218og.AbstractC3149m;
import p218og.C3147k;
import p365y9.C6006b;
import tf.AbstractC4156d0;

/* JADX INFO: renamed from: ya.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6017g {

    /* JADX INFO: renamed from: e */
    public static final C3147k f24443e = new C3147k("\\d+\\+?|…|\\.{2,3}");

    /* JADX INFO: renamed from: f */
    public static final Set f24444f = AbstractC4156d0.m8355W("微信", "通讯录", "发现", "我");

    /* JADX INFO: renamed from: a */
    public final C6006b f24445a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f24446b;

    /* JADX INFO: renamed from: c */
    public C6013c f24447c;

    /* JADX INFO: renamed from: d */
    public C6011a f24448d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6017g(ClassLoader classLoader, C6006b c6006b) {
        classLoader.getClass();
        this.f24445a = c6006b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m10776b(View view, int i9, LinkedHashSet linkedHashSet) {
        String string;
        String string2;
        String string3;
        String string4;
        if (i9 > 4) {
            return;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            CharSequence text = textView.getText();
            if (text != null && (string3 = text.toString()) != null && (string4 = AbstractC3149m.m6703R0(string3).toString()) != null) {
                if (!(string4.length() > 0)) {
                    string4 = null;
                }
                if (string4 != null) {
                    linkedHashSet.add(string4);
                }
            }
            CharSequence contentDescription = textView.getContentDescription();
            if (contentDescription != null && (string = contentDescription.toString()) != null && (string2 = AbstractC3149m.m6703R0(string).toString()) != null) {
                if (!(string2.length() > 0)) {
                    string2 = null;
                }
                if (string2 != null) {
                    linkedHashSet.add(string2);
                }
            }
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                childAt.getClass();
                m10776b(childAt, i9 + 1, linkedHashSet);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static TextView m10777c(View view) {
        String string;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            CharSequence text = textView.getText();
            if (AbstractC1416l.m3825a((text == null || (string = text.toString()) == null) ? null : AbstractC3149m.m6703R0(string).toString(), "微信")) {
                return textView;
            }
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = viewGroup.getChildAt(i9);
                childAt.getClass();
                TextView textViewM10777c = m10777c(childAt);
                if (textViewM10777c != null) {
                    return textViewM10777c;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m10778d(View view, InterfaceC1231l interfaceC1231l) {
        interfaceC1231l.invoke(view);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = viewGroup.getChildAt(i9);
                childAt.getClass();
                m10778d(childAt, interfaceC1231l);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m10779a() {
        this.f24447c = null;
        C6011a c6011a = this.f24448d;
        if (c6011a != null) {
            c6011a.m10773c();
            this.f24448d = null;
        }
    }
}
