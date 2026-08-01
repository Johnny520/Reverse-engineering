package p000;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import com.github.megatronking.stringfog.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: kd */
/* JADX INFO: loaded from: classes.dex */
public final class C0407kd implements InterfaceC0370jd, InterfaceC0444ld {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2818a;

    /* JADX INFO: renamed from: b */
    public Object f2819b;

    /* JADX INFO: renamed from: c */
    public int f2820c;

    /* JADX INFO: renamed from: d */
    public int f2821d;

    /* JADX INFO: renamed from: e */
    public Object f2822e;

    /* JADX INFO: renamed from: f */
    public Cloneable f2823f;

    public /* synthetic */ C0407kd() {
        this.f2818a = 0;
    }

    /* JADX INFO: renamed from: a */
    public void m1676a(bd0 bd0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((lc0) it.next()).f2997a.mo1600c() & 8) != 0) {
                ((View) this.f2822e).setTranslationY(AbstractC0618q2.m2110c(r3.f2997a.mo1599b(), this.f2821d, 0));
                return;
            }
        }
    }

    @Override // p000.InterfaceC0370jd
    public C0481md build() {
        return new C0481md(new C0407kd(this));
    }

    @Override // p000.InterfaceC0444ld
    /* JADX INFO: renamed from: c */
    public ClipData mo1677c() {
        return (ClipData) this.f2819b;
    }

    @Override // p000.InterfaceC0444ld
    /* JADX INFO: renamed from: f */
    public int mo1678f() {
        return this.f2821d;
    }

    @Override // p000.InterfaceC0444ld
    /* JADX INFO: renamed from: h */
    public ContentInfo mo1679h() {
        return null;
    }

    @Override // p000.InterfaceC0370jd
    /* JADX INFO: renamed from: m */
    public void mo1602m(Uri uri) {
        this.f2822e = uri;
    }

    @Override // p000.InterfaceC0444ld
    /* JADX INFO: renamed from: o */
    public int mo1680o() {
        return this.f2820c;
    }

    @Override // p000.InterfaceC0370jd
    /* JADX INFO: renamed from: s */
    public void mo1603s(int i) {
        this.f2821d = i;
    }

    @Override // p000.InterfaceC0370jd
    public void setExtras(Bundle bundle) {
        this.f2823f = bundle;
    }

    public String toString() {
        String str;
        switch (this.f2818a) {
            case Base64.NO_PADDING /* 1 */:
                Uri uri = (Uri) this.f2822e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f2819b).getDescription());
                sb.append(", source=");
                int i = this.f2820c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.f2821d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return g40.m1149l(sb, ((Bundle) this.f2823f) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int[], java.lang.Cloneable] */
    public C0407kd(View view) {
        this.f2818a = 2;
        this.f2823f = new int[2];
        this.f2822e = view;
    }

    public C0407kd(C0407kd c0407kd) {
        this.f2818a = 1;
        ClipData clipData = (ClipData) c0407kd.f2819b;
        clipData.getClass();
        this.f2819b = clipData;
        int i = c0407kd.f2820c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i <= 5) {
            this.f2820c = i;
            int i2 = c0407kd.f2821d;
            if ((i2 & 1) == i2) {
                this.f2821d = i2;
                this.f2822e = (Uri) c0407kd.f2822e;
                this.f2823f = (Bundle) c0407kd.f2823f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
