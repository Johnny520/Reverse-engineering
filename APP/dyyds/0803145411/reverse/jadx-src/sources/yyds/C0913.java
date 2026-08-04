package yyds;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.app.CustomCardView;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛴᛸᛶᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0913 implements InterfaceC1749 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final Object f4159;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public Object f4160;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Object f4161;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final Object f4162;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Object f4163;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final Object f4164;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Object f4165;

    public C0913() {
        this.f4163 = "";
        this.f4165 = new ArrayList();
        this.f4161 = new ArrayList();
        this.f4164 = new ArrayList();
        this.f4162 = new ArrayList();
        this.f4159 = new ArrayList();
    }

    public C0913(CustomCardView customCardView, ImageView imageView, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f4163 = customCardView;
        this.f4165 = imageView;
        this.f4161 = view;
        this.f4164 = textView;
        this.f4162 = textView2;
        this.f4159 = textView3;
        this.f4160 = textView4;
    }

    public C0913(ExecutorServiceC1555 executorServiceC1555, ExecutorServiceC1555 executorServiceC15552, ExecutorServiceC1555 executorServiceC15553, ExecutorServiceC1555 executorServiceC15554, C2620 c2620, C2620 c26202) {
        this.f4160 = AbstractC2217.m4205(150, new C0052(22, this));
        this.f4163 = executorServiceC1555;
        this.f4165 = executorServiceC15552;
        this.f4161 = executorServiceC15553;
        this.f4164 = executorServiceC15554;
        this.f4162 = c2620;
        this.f4159 = c26202;
    }
}
