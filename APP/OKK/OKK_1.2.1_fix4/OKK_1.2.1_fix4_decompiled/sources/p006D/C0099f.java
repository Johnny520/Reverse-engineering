package p006D;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p060h0.AbstractC0945a;

/* JADX INFO: renamed from: D.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0099f implements InterfaceC0097e, InterfaceC0101g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f257a;

    /* JADX INFO: renamed from: b */
    public Object f258b;

    /* JADX INFO: renamed from: c */
    public int f259c;

    /* JADX INFO: renamed from: d */
    public int f260d;

    /* JADX INFO: renamed from: e */
    public Object f261e;

    /* JADX INFO: renamed from: f */
    public Cloneable f262f;

    /* JADX INFO: renamed from: a */
    public void m360a(C0122q0 c0122q0, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((C0096d0) it.next()).f252a.mo322c() & 8) != 0) {
                ((View) this.f261e).setTranslationY(AbstractC0945a.m2277c(this.f260d, 0, r3.f252a.mo321b()));
                return;
            }
        }
    }

    @Override // p006D.InterfaceC0097e
    /* JADX INFO: renamed from: b */
    public void mo340b(Bundle bundle) {
        this.f262f = bundle;
    }

    @Override // p006D.InterfaceC0097e
    /* JADX INFO: renamed from: e */
    public void mo342e(Uri uri) {
        this.f261e = uri;
    }

    @Override // p006D.InterfaceC0101g
    /* JADX INFO: renamed from: f */
    public int mo343f() {
        return this.f259c;
    }

    @Override // p006D.InterfaceC0101g
    /* JADX INFO: renamed from: h */
    public ClipData mo344h() {
        return (ClipData) this.f258b;
    }

    @Override // p006D.InterfaceC0097e
    /* JADX INFO: renamed from: m */
    public C0103h mo347m() {
        return new C0103h(new C0099f(this));
    }

    @Override // p006D.InterfaceC0101g
    /* JADX INFO: renamed from: q */
    public int mo351q() {
        return this.f260d;
    }

    @Override // p006D.InterfaceC0101g
    /* JADX INFO: renamed from: t */
    public ContentInfo mo354t() {
        return null;
    }

    public String toString() {
        String str;
        switch (this.f257a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f258b).getDescription());
                sb.append(", source=");
                int i2 = this.f259c;
                sb.append(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? String.valueOf(i2) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i3 = this.f260d;
                sb.append((i3 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i3));
                Uri uri = (Uri) this.f261e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(((Bundle) this.f262f) != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // p006D.InterfaceC0097e
    /* JADX INFO: renamed from: w */
    public void mo357w(int i2) {
        this.f260d = i2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C0099f(View view) {
        this.f257a = 2;
        this.f262f = new int[2];
        this.f261e = view;
    }

    public C0099f(C0099f c0099f) {
        this.f257a = 1;
        ClipData clipData = (ClipData) c0099f.f258b;
        clipData.getClass();
        this.f258b = clipData;
        int i2 = c0099f.f259c;
        if (i2 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i2 <= 5) {
            this.f259c = i2;
            int i3 = c0099f.f260d;
            if ((i3 & 1) == i3) {
                this.f260d = i3;
                this.f261e = (Uri) c0099f.f261e;
                this.f262f = (Bundle) c0099f.f262f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i3) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
