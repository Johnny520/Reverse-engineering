package yyds;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import com.android.app.CustomRecyclerView;

/* JADX INFO: renamed from: yyds.ᲇᲁᛷᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2531 implements InterfaceC1749 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final View f12460;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final View f12461;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final View f12462;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final View f12463;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final ViewGroup f12464;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final View f12465;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final TextView f12466;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final View f12467;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final TextView f12468;

    public C2531(LinearLayout linearLayout, Button button, Button button2, TextView textView, TextView textView2, Button button3, LinearLayout linearLayout2, EditText editText, CustomRecyclerView customRecyclerView) {
        this.f12467 = linearLayout;
        this.f12463 = button;
        this.f12460 = button2;
        this.f12466 = textView;
        this.f12468 = textView2;
        this.f12461 = button3;
        this.f12465 = linearLayout2;
        this.f12462 = editText;
        this.f12464 = customRecyclerView;
    }

    public C2531(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, FrameLayout frameLayout, ImageView imageView, LinearLayout linearLayout2, LinearLayout linearLayout3, ScrollView scrollView) {
        this.f12463 = linearLayout;
        this.f12466 = textView;
        this.f12468 = textView2;
        this.f12467 = textView3;
        this.f12460 = frameLayout;
        this.f12461 = imageView;
        this.f12462 = linearLayout2;
        this.f12465 = linearLayout3;
        this.f12464 = scrollView;
    }

    public C2531(LinearLayout linearLayout, TextView textView, TextView textView2, Switch r4, TextView textView3, TextView textView4, EditText editText, TextView textView5, TextView textView6, Spinner spinner, EditText editText2) {
        this.f12466 = textView;
        this.f12461 = r4;
        this.f12468 = textView3;
        this.f12467 = textView4;
        this.f12462 = editText;
        this.f12463 = textView5;
        this.f12460 = textView6;
        this.f12464 = spinner;
        this.f12465 = editText2;
    }
}
