package p000a;

import android.widget.EditText;

/* JADX INFO: renamed from: a.K5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0188K5 {

    /* JADX INFO: renamed from: a */
    public final a f654a;

    /* JADX INFO: renamed from: a.K5$a */
    public static class a extends b {

        /* JADX INFO: renamed from: a */
        public final EditText f655a;

        /* JADX INFO: renamed from: b */
        public final C0349T5 f656b;

        public a(EditText editText) {
            this.f655a = editText;
            C0349T5 c0349t5 = new C0349T5(editText);
            this.f656b = c0349t5;
            editText.addTextChangedListener(c0349t5);
            if (C0206L5.f694b == null) {
                synchronized (C0206L5.f693a) {
                    try {
                        if (C0206L5.f694b == null) {
                            C0206L5 c0206l5 = new C0206L5();
                            try {
                                C0206L5.f695c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0206L5.class.getClassLoader());
                            } catch (Throwable unused) {
                            }
                            C0206L5.f694b = c0206l5;
                        }
                    } finally {
                    }
                }
            }
            editText.setEditableFactory(C0206L5.f694b);
        }
    }

    /* JADX INFO: renamed from: a.K5$b */
    public static class b {
    }

    public C0188K5(EditText editText) {
        this.f654a = new a(editText);
    }
}
