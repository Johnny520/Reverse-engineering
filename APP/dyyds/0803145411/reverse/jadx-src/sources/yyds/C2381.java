package yyds;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: renamed from: yyds.ᲇᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2381 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C2381 f11735;

    static {
        AbstractC2328.m4341(-147755037786990L);
        AbstractC2328.m4341(-147785102558062L);
        AbstractC2328.m4341(-147802282427246L);
        f11735 = new C2381();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C0570 m4425(final Context context, EditText editText, TextView textView, TextView textView2, TextView textView3, TextView textView4, C0243 c0243) {
        String strM4341 = c0243.f1344;
        if (!AbstractC1544.m3188(strM4341, AbstractC2328.m4341(-147621893800814L)) && !AbstractC1544.m3188(strM4341, AbstractC2328.m4341(-147639073669998L))) {
            strM4341 = AbstractC2328.m4341(-147677728375662L);
        }
        final C0570 c0570 = new C0570(editText, textView, textView2, textView3, textView4, strM4341);
        String strM43412 = c0243.f1345;
        if (AbstractC0473.m1313(strM43412)) {
            strM43412 = AbstractC2328.m4341(-147175217202030L);
        }
        editText.setText(strM43412);
        m4427(context, c0570);
        final int i = 0;
        textView.setOnClickListener(new View.OnClickListener(c0570, context, i) { // from class: yyds.ᛱᛴᛲᛲ

            /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
            public final /* synthetic */ Context f734;

            /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
            public final /* synthetic */ int f735;

            /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
            public final /* synthetic */ C0570 f736;

            @Override // android.view.View.OnClickListener
            public final native void onClick(View view);
        });
        final int i2 = 1;
        textView2.setOnClickListener(new View.OnClickListener(c0570, context, i2) { // from class: yyds.ᛱᛴᛲᛲ

            /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
            public final /* synthetic */ Context f734;

            /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
            public final /* synthetic */ int f735;

            /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
            public final /* synthetic */ C0570 f736;

            @Override // android.view.View.OnClickListener
            public final native void onClick(View view);
        });
        textView3.setOnClickListener(new ViewOnClickListenerC0895(editText, 4));
        textView4.setOnClickListener(new ViewOnClickListenerC0895(editText, 5));
        return c0570;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static native long m4426(String str);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static native void m4427(Context context, C0570 c0570);
}
