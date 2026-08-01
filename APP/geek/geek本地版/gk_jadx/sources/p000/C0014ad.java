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

/* JADX INFO: renamed from: ad */
/* JADX INFO: loaded from: classes.dex */
public final class C0014ad implements InterfaceC0962zc, InterfaceC0064bd {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f130a;

    /* JADX INFO: renamed from: b */
    public Object f131b;

    /* JADX INFO: renamed from: c */
    public int f132c;

    /* JADX INFO: renamed from: d */
    public int f133d;

    /* JADX INFO: renamed from: e */
    public Object f134e;

    /* JADX INFO: renamed from: f */
    public Cloneable f135f;

    public /* synthetic */ C0014ad() {
        this.f130a = 0;
    }

    /* JADX INFO: renamed from: a */
    public void m87a(wc0 wc0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((gc0) it.next()).f2123a.mo1017c() & 8) != 0) {
                ((View) this.f134e).setTranslationY(AbstractC0619q2.m2141c(r3.f2123a.mo1016b(), this.f133d, 0));
                return;
            }
        }
    }

    @Override // p000.InterfaceC0064bd
    /* JADX INFO: renamed from: b */
    public ClipData mo88b() {
        return (ClipData) this.f131b;
    }

    @Override // p000.InterfaceC0962zc
    public C0100cd build() {
        return new C0100cd(new C0014ad(this));
    }

    @Override // p000.InterfaceC0064bd
    /* JADX INFO: renamed from: f */
    public int mo89f() {
        return this.f133d;
    }

    @Override // p000.InterfaceC0064bd
    /* JADX INFO: renamed from: h */
    public ContentInfo mo90h() {
        return null;
    }

    @Override // p000.InterfaceC0962zc
    /* JADX INFO: renamed from: m */
    public void mo91m(Uri uri) {
        this.f134e = uri;
    }

    @Override // p000.InterfaceC0064bd
    /* JADX INFO: renamed from: o */
    public int mo92o() {
        return this.f132c;
    }

    @Override // p000.InterfaceC0962zc
    /* JADX INFO: renamed from: s */
    public void mo93s(int i) {
        this.f133d = i;
    }

    @Override // p000.InterfaceC0962zc
    public void setExtras(Bundle bundle) {
        this.f135f = bundle;
    }

    public String toString() {
        String str;
        switch (this.f130a) {
            case Base64.NO_PADDING /* 1 */:
                Uri uri = (Uri) this.f134e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f131b).getDescription());
                sb.append(", source=");
                int i = this.f132c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.f133d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return z30.m2767l(sb, ((Bundle) this.f135f) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int[], java.lang.Cloneable] */
    public C0014ad(View view) {
        this.f130a = 2;
        this.f135f = new int[2];
        this.f134e = view;
    }

    public C0014ad(C0014ad c0014ad) {
        this.f130a = 1;
        ClipData clipData = (ClipData) c0014ad.f131b;
        clipData.getClass();
        this.f131b = clipData;
        int i = c0014ad.f132c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i <= 5) {
            this.f132c = i;
            int i2 = c0014ad.f133d;
            if ((i2 & 1) == i2) {
                this.f133d = i2;
                this.f134e = (Uri) c0014ad.f134e;
                this.f135f = (Bundle) c0014ad.f135f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
