package p050c0;

import android.view.View;
import android.widget.EditText;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.util.Set;
import p006D.RunnableC0129u;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.G0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0589G0 extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1790b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0595I0 f1791c;

    public C0589G0(int i2) {
        this.f1790b = i2;
        switch (i2) {
            case 1:
                this.f1791c = C0595I0.f1818a;
                break;
            case 2:
                this.f1791c = C0595I0.f1818a;
                break;
            default:
                this.f1791c = C0595I0.f1818a;
                break;
        }
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public final void mo1385a(C0760b c0760b) {
        switch (this.f1790b) {
            case 0:
                Object obj = c0760b.f2669b;
                C0595I0.f1825h = obj instanceof View ? (View) obj : null;
                this.f1791c.getClass();
                View view = C0595I0.f1825h;
                if (view == null) {
                    return;
                }
                view.post(new RunnableC0129u(view, 3));
                return;
            case 1:
                Object obj2 = c0760b.f2669b;
                final EditText editText = obj2 instanceof EditText ? (EditText) obj2 : null;
                if (editText == null) {
                    return;
                }
                this.f1791c.getClass();
                Set set = C0595I0.f1823f;
                synchronized (set) {
                    set.add(editText);
                }
                final int i2 = 0;
                editText.post(new Runnable(editText, i2) { // from class: c0.H0

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ int f1807a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C0595I0 f1808b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ EditText f1809c;

                    {
                        this.f1807a = i2;
                        switch (i2) {
                            case 1:
                                this.f1808b = C0595I0.f1818a;
                                this.f1809c = editText;
                                break;
                            default:
                                this.f1808b = C0595I0.f1818a;
                                this.f1809c = editText;
                                break;
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (this.f1807a) {
                            case 0:
                                AbstractC0307g.m703e(this.f1808b, "$this_runCatching");
                                EditText editText2 = this.f1809c;
                                AbstractC0307g.m703e(editText2, "$input");
                                C0595I0.m1473a(editText2);
                                break;
                            default:
                                AbstractC0307g.m703e(this.f1808b, "$this_runCatching");
                                EditText editText3 = this.f1809c;
                                AbstractC0307g.m703e(editText3, "$input");
                                C0595I0.m1473a(editText3);
                                break;
                        }
                    }
                });
                return;
            default:
                Object obj3 = c0760b.f2669b;
                final EditText editText2 = obj3 instanceof EditText ? (EditText) obj3 : null;
                if (editText2 == null || C0595I0.f1821d.get()) {
                    return;
                }
                this.f1791c.getClass();
                if (C0595I0.m1478f(editText2)) {
                    final int i3 = 1;
                    editText2.post(new Runnable(editText2, i3) { // from class: c0.H0

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ int f1807a;

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C0595I0 f1808b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ EditText f1809c;

                        {
                            this.f1807a = i3;
                            switch (i3) {
                                case 1:
                                    this.f1808b = C0595I0.f1818a;
                                    this.f1809c = editText2;
                                    break;
                                default:
                                    this.f1808b = C0595I0.f1818a;
                                    this.f1809c = editText2;
                                    break;
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (this.f1807a) {
                                case 0:
                                    AbstractC0307g.m703e(this.f1808b, "$this_runCatching");
                                    EditText editText22 = this.f1809c;
                                    AbstractC0307g.m703e(editText22, "$input");
                                    C0595I0.m1473a(editText22);
                                    break;
                                default:
                                    AbstractC0307g.m703e(this.f1808b, "$this_runCatching");
                                    EditText editText3 = this.f1809c;
                                    AbstractC0307g.m703e(editText3, "$input");
                                    C0595I0.m1473a(editText3);
                                    break;
                            }
                        }
                    });
                    return;
                }
                return;
        }
    }
}
