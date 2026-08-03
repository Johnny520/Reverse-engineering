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
    public void m5285b(C0489LF r2, List r3) {
        Iterator r22 = r3.iterator();
    L4:
        if (r22.hasNext() == false) goto L12;
        C2538tF r32 = (C2538tF) r22.next();
        if ((r32.f8846a.mo4895c() & 8) == 0) goto L4;
        ((View) this.f9289e).setTranslationY(AbstractC0776S2.m1598c(this.f9288d, 0, r32.f8846a.mo4894b()));
        return;
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
    public void mo242o(Uri r1) {
        this.f9289e = r1;
    }

    @Override // p000.InterfaceC2755yb
    /* JADX INFO: renamed from: q */
    public int mo243q() {
        return this.f9287c;
    }

    @Override // p000.InterfaceC2669wb
    public void setExtras(Bundle r1) {
        this.f9290f = r1;
    }

    @Override // p000.InterfaceC2669wb
    /* JADX INFO: renamed from: t */
    public void mo245t(int r1) {
        this.f9288d = r1;
    }

    public String toString() {
        switch(this.f9285a) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        Uri r0 = (Uri) this.f9289e;
        StringBuilder r1 = new StringBuilder("ContentInfoCompat{clip=");
        r1.append(((ClipData) this.f9286b).getDescription());
        r1.append(", source=");
        int r2 = this.f9287c;
        if (r2 != 0) goto L9;
        String r22 = "SOURCE_APP";
    L25:
        r1.append(r22);
        r1.append(", flags=");
        int r23 = this.f9288d;
        if ((r23 & 1) == 0) goto L28;
        String r24 = "FLAG_CONVERT_TO_PLAIN_TEXT";
    L29:
        r1.append(r24);
        String r25 = "";
        if (r0 != null) goto L32;
        String r02 = "";
    L33:
        r1.append(r02);
        if (((Bundle) this.f9290f) == null) goto L38;
        r25 = ", hasExtras";
    L38:
        return AbstractC0213Ey.m410h(r1, r25, "}");
    L32:
        r02 = ", hasLinkUri(" + r0.toString().length() + ")";
        goto L33
    L28:
        r24 = String.valueOf(r23);
        goto L29
    L9:
        if (r2 != 1) goto L11;
        r22 = "SOURCE_CLIPBOARD";
        goto L25
    L11:
        if (r2 != 2) goto L13;
        r22 = "SOURCE_INPUT_METHOD";
        goto L25
    L13:
        if (r2 != 3) goto L15;
        r22 = "SOURCE_DRAG_AND_DROP";
        goto L25
    L15:
        if (r2 != 4) goto L17;
        r22 = "SOURCE_AUTOFILL";
        goto L25
    L17:
        if (r2 == 5) goto L19;
        r22 = String.valueOf(r2);
        goto L25
    L19:
        r22 = "SOURCE_PROCESS_TEXT";
        goto L25
    L5:
        return super.toString();
    }

    public C2712xb(C2712xb r4) {
        this.f9285a = 1;
        ClipData r0 = (ClipData) r4.f9286b;
        r0.getClass();
        this.f9286b = r0;
        int r02 = r4.f9287c;
        if (r02 >= 0) goto L5;
        Locale r03 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
    L5:
        if (r02 > 5) goto L12;
        this.f9287c = r02;
        int r04 = r4.f9288d;
        if ((r04 & 1) != r04) goto L11;
        this.f9288d = r04;
        this.f9289e = (Uri) r4.f9289e;
        this.f9290f = (Bundle) r4.f9290f;
        return;
    L11:
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(r04) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    L12:
        Locale r05 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int[], java.lang.Cloneable] */
    public C2712xb(View r2) {
        this.f9285a = 2;
        this.f9290f = new int[2];
        this.f9289e = r2;
    }
}
