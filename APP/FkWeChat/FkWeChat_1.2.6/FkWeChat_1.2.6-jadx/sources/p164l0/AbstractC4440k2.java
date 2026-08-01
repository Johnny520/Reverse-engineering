package p164l0;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.C0644c;
import p010a9.InterfaceC0184l;
import p024b9.C1055q;

/* JADX INFO: renamed from: l0.k2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4440k2 {

    /* JADX INFO: renamed from: a */
    public static InterfaceC0184l f12959a = a.f12960y;

    /* JADX INFO: renamed from: l0.k2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a extends C1055q implements InterfaceC0184l {

        /* JADX INFO: renamed from: y */
        public static final a f12960y = new a();

        public a() {
            super(1, C4412d2.class, "<init>", "<init>(Landroid/view/View;)V", 0);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final C4412d2 mo27m(View view) {
            return new C4412d2(view);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC4436j2 m17277b() {
        return new C4405c();
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0184l m17278c() {
        return f12959a;
    }

    /* JADX INFO: renamed from: d */
    public static final void m17279d(EditorInfo editorInfo) {
        if (C0644c.m2518i()) {
            C0644c.m2516c().m2531r(editorInfo);
        }
    }
}
