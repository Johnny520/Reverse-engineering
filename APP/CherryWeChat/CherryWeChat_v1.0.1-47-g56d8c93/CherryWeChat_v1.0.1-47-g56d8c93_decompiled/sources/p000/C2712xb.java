package p000;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: xb */
/* JADX INFO: loaded from: classes.dex */
public final class C2712xb implements InterfaceC2669wb, InterfaceC2755yb {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9285a;

    /* JADX INFO: renamed from: b */
    public Object f9286b;

    /* JADX INFO: renamed from: c */
    public int f9287c;

    /* JADX INFO: renamed from: d */
    public int f9288d;

    /* JADX INFO: renamed from: e */
    public Object f9289e;

    /* JADX INFO: renamed from: f */
    public Cloneable f9290f;

    public /* synthetic */ C2712xb() {
        this.f9285a = 0;
    }

    @Override // p000.InterfaceC2755yb
    /* JADX INFO: renamed from: a */
    public ClipData mo231a() {
        return (ClipData) this.f9286b;
    }

    /* JADX INFO: renamed from: b */
    public void m5285b(C0489LF c0489lf, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((C2538tF) it.next()).f8846a.mo4895c() & 8) != 0) {
                ((View) this.f9289e).setTranslationY(AbstractC0776S2.m1598c(this.f9288d, 0, r3.f8846a.mo4894b()));
                return;
            }
        }
    }

    @Override // p000.InterfaceC2669wb
    public C2798zb build() {
        return new C2798zb(new C2712xb(this));
    }

    @Override // p000.InterfaceC2755yb
    /* JADX INFO: renamed from: k */
    public int mo238k() {
        return this.f9288d;
    }

    @Override // p000.InterfaceC2755yb
    /* JADX INFO: renamed from: m */
    public ContentInfo mo240m() {
        return null;
    }

    @Override // p000.InterfaceC2669wb
    /* JADX INFO: renamed from: o */
    public void mo242o(Uri uri) {
        this.f9289e = uri;
    }

    @Override // p000.InterfaceC2755yb
    /* JADX INFO: renamed from: q */
    public int mo243q() {
        return this.f9287c;
    }

    @Override // p000.InterfaceC2669wb
    public void setExtras(Bundle bundle) {
        this.f9290f = bundle;
    }

    @Override // p000.InterfaceC2669wb
    /* JADX INFO: renamed from: t */
    public void mo245t(int i) {
        this.f9288d = i;
    }

    public String toString() {
        String str;
        switch (this.f9285a) {
            case 1:
                Uri uri = (Uri) this.f9289e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f9286b).getDescription());
                sb.append(", source=");
                int i = this.f9287c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.f9288d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return AbstractC0213Ey.m410h(sb, ((Bundle) this.f9290f) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public C2712xb(C2712xb c2712xb) {
        this.f9285a = 1;
        ClipData clipData = (ClipData) c2712xb.f9286b;
        clipData.getClass();
        this.f9286b = clipData;
        int i = c2712xb.f9287c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f9287c = i;
        int i2 = c2712xb.f9288d;
        if ((i2 & 1) == i2) {
            this.f9288d = i2;
            this.f9289e = (Uri) c2712xb.f9289e;
            this.f9290f = (Bundle) c2712xb.f9290f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int[], java.lang.Cloneable] */
    public C2712xb(View view) {
        this.f9285a = 2;
        this.f9290f = new int[2];
        this.f9289e = view;
    }
}
