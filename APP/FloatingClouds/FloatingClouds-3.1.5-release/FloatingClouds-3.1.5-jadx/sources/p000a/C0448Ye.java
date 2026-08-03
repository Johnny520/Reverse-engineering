package p000a;

import android.graphics.Typeface;
import android.text.TextPaint;
import com.google.android.material.chip.C1281a;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: a.Ye */
/* JADX INFO: loaded from: classes.dex */
public final class C0448Ye {

    /* JADX INFO: renamed from: c */
    public float f1688c;

    /* JADX INFO: renamed from: e */
    public final WeakReference<b> f1690e;

    /* JADX INFO: renamed from: f */
    public C0394Ve f1691f;

    /* JADX INFO: renamed from: a */
    public final TextPaint f1686a = new TextPaint(1);

    /* JADX INFO: renamed from: b */
    public final a f1687b = new a();

    /* JADX INFO: renamed from: d */
    public boolean f1689d = true;

    /* JADX INFO: renamed from: a.Ye$a */
    public class a extends AbstractC0472a2 {
        public a() {
        }

        @Override // p000a.AbstractC0472a2
        /* JADX INFO: renamed from: d */
        public final void mo456d(int i) {
            C0448Ye c0448Ye = C0448Ye.this;
            c0448Ye.f1689d = true;
            b bVar = c0448Ye.f1690e.get();
            if (bVar != null) {
                bVar.mo1111a();
            }
        }

        @Override // p000a.AbstractC0472a2
        /* JADX INFO: renamed from: e */
        public final void mo457e(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            C0448Ye c0448Ye = C0448Ye.this;
            c0448Ye.f1689d = true;
            b bVar = c0448Ye.f1690e.get();
            if (bVar != null) {
                bVar.mo1111a();
            }
        }
    }

    /* JADX INFO: renamed from: a.Ye$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo1111a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C0448Ye(C1281a c1281a) {
        this.f1690e = new WeakReference<>(null);
        this.f1690e = new WeakReference<>(c1281a);
    }

    /* JADX INFO: renamed from: a */
    public final float m1110a(String str) {
        if (!this.f1689d) {
            return this.f1688c;
        }
        TextPaint textPaint = this.f1686a;
        this.f1688c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f1689d = false;
        return this.f1688c;
    }
}
