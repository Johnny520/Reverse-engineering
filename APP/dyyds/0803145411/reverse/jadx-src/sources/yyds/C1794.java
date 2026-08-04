package yyds;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᛸᛶᛵᲀ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1794 implements TextWatcher {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final /* synthetic */ C1417 f9040;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f9041;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final /* synthetic */ C1417 f9042;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ TextView f9043;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ TextView f9044;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f9045;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f9046;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final /* synthetic */ View f9047;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final /* synthetic */ C1213 f9048;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1417 f9049;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final /* synthetic */ TextView f9050;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final /* synthetic */ TextView f9051;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f9052;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f9053;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Context f9054;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ TextView f9055;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f9056;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f9057;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ TextView f9058;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f9059;

    static {
        NativeUtil.classesInit0(189);
    }

    public C1794(C0172 c0172, C0172 c01722, TextView textView, TextView textView2, C1417 c1417, C0172 c01723, TextView textView3, Context context, C0172 c01724, C0172 c01725, C1417 c14172, C1417 c14173, C0172 c01726, C0172 c01727, C1213 c1213, View view, TextView textView4, C0172 c01728, TextView textView5, TextView textView6) {
        this.f9056 = c0172;
        this.f9059 = c01722;
        this.f9044 = textView;
        this.f9058 = textView2;
        this.f9049 = c1417;
        this.f9041 = c01723;
        this.f9043 = textView3;
        this.f9054 = context;
        this.f9052 = c01724;
        this.f9053 = c01725;
        this.f9042 = c14172;
        this.f9040 = c14173;
        this.f9046 = c01726;
        this.f9057 = c01727;
        this.f9048 = c1213;
        this.f9047 = view;
        this.f9055 = textView4;
        this.f9045 = c01728;
        this.f9051 = textView5;
        this.f9050 = textView6;
    }

    @Override // android.text.TextWatcher
    public final native void afterTextChanged(Editable editable);

    @Override // android.text.TextWatcher
    public final native void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3);

    @Override // android.text.TextWatcher
    public final native void onTextChanged(CharSequence charSequence, int i, int i2, int i3);
}
