package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: renamed from: dr */
/* JADX INFO: loaded from: classes.dex */
public final class C1336dr implements InterfaceC2541tc {

    /* JADX INFO: renamed from: d */
    public static final String[] f4817d = null;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4818a;

    /* JADX INFO: renamed from: b */
    public final Object f4819b;

    /* JADX INFO: renamed from: c */
    public final Object f4820c;

    static {
        f4817d = new String[]{"_data"};
    }

    public /* synthetic */ C1336dr(int r1, Object r2, Object r3) {
        this.f4818a = r1;
        this.f4819b = r2;
        this.f4820c = r3;
    }

    /* JADX INFO: renamed from: b */
    private final void m2587b() {
    }

    /* JADX INFO: renamed from: e */
    private final void m2588e() {
    }

    /* JADX INFO: renamed from: g */
    private final void m2589g() {
    }

    /* JADX INFO: renamed from: h */
    private final void m2590h() {
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: a */
    public final Class mo912a() {
        switch(this.f4818a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        return File.class;
    L5:
        return ((InterfaceC1440g6) this.f4820c).mo2751a();
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: c */
    public final void mo914c() {
        int r0 = this.f4818a;
    }

    @Override // p000.InterfaceC2541tc
    public final void cancel() {
        int r0 = this.f4818a;
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: d */
    public final void mo915d(EnumC2688wu r7, InterfaceC2498sc r8) {
        switch(this.f4818a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r8.mo638e(((InterfaceC1440g6) this.f4820c).mo2752j((byte[]) this.f4819b));
        return;
    L6:
        Cursor r72 = ((Context) this.f4819b).getContentResolver().query((Uri) this.f4820c, f4817d, null, null, null);
        String r0 = null;
        if (r72 == null) goto L18;
    L12:
        th = move-exception;
        r72.close();
        throw th;
    L9:
        if (r72.moveToFirst() == false) goto L14;
        r0 = r72.getString(r72.getColumnIndexOrThrow("_data"));     // Catch: Throwable -> L12
    L14:
        r72.close();
    L18:
        if (TextUtils.isEmpty(r0) == false) goto L20;
        r8.mo635b(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f4820c)));
        return;
    L20:
        r8.mo638e(new File(r0));
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: f */
    public final int mo916f() {
        switch(this.f4818a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return 1;
    L6:
        return 1;
    }
}
