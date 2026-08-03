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
    public static final String[] f4817d = {"_data"};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4818a;

    /* JADX INFO: renamed from: b */
    public final Object f4819b;

    /* JADX INFO: renamed from: c */
    public final Object f4820c;

    public /* synthetic */ C1336dr(int i, Object obj, Object obj2) {
        this.f4818a = i;
        this.f4819b = obj;
        this.f4820c = obj2;
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
        switch (this.f4818a) {
            case 0:
                return File.class;
            default:
                return ((InterfaceC1440g6) this.f4820c).mo2751a();
        }
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: c */
    public final void mo914c() {
        int i = this.f4818a;
    }

    @Override // p000.InterfaceC2541tc
    public final void cancel() {
        int i = this.f4818a;
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: d */
    public final void mo915d(EnumC2688wu enumC2688wu, InterfaceC2498sc interfaceC2498sc) {
        switch (this.f4818a) {
            case 0:
                Cursor cursorQuery = ((Context) this.f4819b).getContentResolver().query((Uri) this.f4820c, f4817d, null, null, null);
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                        cursorQuery.close();
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                    break;
                }
                if (!TextUtils.isEmpty(string)) {
                    interfaceC2498sc.mo638e(new File(string));
                    return;
                }
                interfaceC2498sc.mo635b(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f4820c)));
                return;
            default:
                interfaceC2498sc.mo638e(((InterfaceC1440g6) this.f4820c).mo2752j((byte[]) this.f4819b));
                return;
        }
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: f */
    public final int mo916f() {
        switch (this.f4818a) {
        }
        return 1;
    }
}
