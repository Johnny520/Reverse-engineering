package p000;

import android.app.Activity;
import android.widget.EditText;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: f2 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0209f2 {

    /* JADX INFO: renamed from: a */
    public final Object f245a;

    /* JADX INFO: renamed from: b */
    public final Object f246b;

    /* JADX INFO: renamed from: c */
    public Serializable f247c;

    /* JADX INFO: renamed from: d */
    public Object f248d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0209f2(Activity activity, C0193e2 c0193e2, String str, String str2) {
        this.f245a = new WeakReference(activity);
        this.f246b = new WeakReference(c0193e2);
        this.f247c = str;
        this.f248d = AbstractC0260i5.m532G1(str2);
    }

    public C0209f2(String str, String str2, String str3, String str4) {
        this.f247c = str;
        this.f248d = str2;
        this.f245a = str3;
        this.f246b = str4;
    }

    public C0209f2() {
        this.f245a = new ArrayList();
        this.f246b = new ArrayList();
        this.f247c = "";
    }

    public C0209f2(EditText editText, C0265ia c0265ia) {
        this.f247c = new ArrayList();
        this.f245a = new WeakReference(editText);
        this.f246b = c0265ia;
    }
}
