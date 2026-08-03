package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C1273a;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: zc */
/* JADX INFO: loaded from: classes.dex */
public final class C2799zc implements InterfaceC2541tc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9468a;

    /* JADX INFO: renamed from: b */
    public final Comparable f9469b;

    /* JADX INFO: renamed from: c */
    public final Object f9470c;

    /* JADX INFO: renamed from: d */
    public Object f9471d;

    public /* synthetic */ C2799zc(Comparable r1, Object r2, int r3) {
        this.f9468a = r3;
        this.f9469b = r1;
        this.f9470c = r2;
    }

    /* JADX INFO: renamed from: b */
    public static C2799zc m5368b(Context r3, Uri r4, InterfaceC1357eB r5) {
        C2812zp r0 = ComponentCallbacks2C1273a.m2412a(r3).f4340d;
        ArrayList r2 = ComponentCallbacks2C1273a.m2412a(r3).f4339c.m1544a().m1377e();
        ContentResolver r32 = r3.getContentResolver();
        C2428qs r1 = new C2428qs();
        r1.f8521b = r5;
        r1.f8522c = r0;
        r1.f8523d = r32;
        r1.f8520a = r2;
        return new C2799zc(r4, r1, 2);
    }

    /* JADX INFO: renamed from: e */
    private final void m5369e() {
    }

    /* JADX INFO: renamed from: g */
    private final void m5370g() {
    }

    /* JADX INFO: renamed from: h */
    private final void m5371h() {
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: a */
    public final Class mo912a() {
        switch(this.f9468a) {
            case 0: goto L11;
            case 1: goto L7;
            default: goto L4;
        };
    L4:
        return InputStream.class;
    L11:
        ((C2220m6) this.f9470c).getClass();
        return InputStream.class;
    L7:
        switch(((C0668Pg) this.f9470c).f2132a) {
            case 5: goto L9;
            default: goto L8;
        };
    L8:
        return InputStream.class;
    L9:
        return ParcelFileDescriptor.class;
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: c */
    public final void mo914c() {
        switch(this.f9468a) {
            case 0: goto L23;
            case 1: goto L8;
            default: goto L4;
        };
    L4:
        InputStream r0 = (InputStream) this.f9471d;
        if (r0 == null) goto L27;
        r0.close();     // Catch: IOException -> L17
        return;
    L28:
        return;
    L27:
        return;
    L8:
        Object r02 = this.f9471d;
        if (r02 == null) goto L29;
        switch(((C0668Pg) this.f9470c).f2132a) {
            case 5: goto L13;
            default: goto L12;
        };     // Catch: IOException -> L18
    L12:
        ((InputStream) r02).close();     // Catch: IOException -> L18
    L20:
        return;
    L13:
        ((ParcelFileDescriptor) r02).close();     // Catch: IOException -> L18
    L30:
        return;
    L29:
        return;
    L23:
        ((ByteArrayInputStream) this.f9471d).close();     // Catch: IOException -> L19
        return;
    }

    @Override // p000.InterfaceC2541tc
    public final void cancel() {
        int r0 = this.f9468a;
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: d */
    public final void mo915d(EnumC2688wu r2, InterfaceC2498sc r3) {
        switch(this.f9468a) {
            case 0: goto L27;
            case 1: goto L25;
            default: goto L23;
        };
    L23:
        InputStream r22 = m5372i();     // Catch: FileNotFoundException -> L6
        this.f9471d = r22;     // Catch: FileNotFoundException -> L6
        r3.mo638e(r22);     // Catch: FileNotFoundException -> L6
        return;
    L6:
        e = move-exception;
        r3.mo635b(e);
        return;
    L25:
        C0668Pg r23 = (C0668Pg) this.f9470c;     // Catch: FileNotFoundException -> L15
        File r0 = (File) this.f9469b;     // Catch: FileNotFoundException -> L15
        switch(r23.f2132a) {
            case 5: goto L12;
            default: goto L11;
        };     // Catch: FileNotFoundException -> L15
    L11:
        Object r24 = new FileInputStream(r0);     // Catch: FileNotFoundException -> L15
    L13:
        this.f9471d = r24;     // Catch: FileNotFoundException -> L15
        r3.mo638e(r24);     // Catch: FileNotFoundException -> L15
        return;
    L12:
        r24 = ParcelFileDescriptor.open(r0, 268435456);     // Catch: FileNotFoundException -> L15
    L15:
        e = move-exception;
        r3.mo635b(e);
        return;
    L27:
        ByteArrayInputStream r25 = C2220m6.m4464g((String) this.f9469b);     // Catch: IllegalArgumentException -> L20
        this.f9471d = r25;     // Catch: IllegalArgumentException -> L20
        r3.mo638e(r25);     // Catch: IllegalArgumentException -> L20
        return;
    L20:
        e = move-exception;
        r3.mo635b(e);
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: f */
    public final int mo916f() {
        switch(this.f9468a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        return 1;
    L6:
        return 1;
    L8:
        return 1;
    }

    /* JADX INFO: renamed from: i */
    public InputStream m5372i() {
        C2428qs r1 = (C2428qs) this.f9470c;
        ContentResolver r2 = (ContentResolver) r1.f8523d;
        Uri r3 = (Uri) this.f9469b;
        Cursor r5 = null;
        InputStream r52 = null;
        r52 = null;
        r52 = null;
        Cursor r6 = ((InterfaceC1357eB) r1.f8521b).mo2569a(r3);     // Catch: Throwable -> L14 SecurityException -> L16
        if (r6 != null) goto L64;
    L11:
        if (r6 == null) goto L13;
    L12:
        r6.close();
    L13:
        String r7 = null;
    L23:
        if (TextUtils.isEmpty(r7) == false) goto L25;
    L24:
        InputStream r62 = null;
    L63:
        if (r62 != null) goto L75;
    L52:
        int r0 = -1;
    L53:
        if (r0 != (-1)) goto L55;
        return r62;
    L55:
        return new C0410Jg(r62, r0);
    L75:
        r52 = r2.openInputStream(r3);     // Catch: Throwable -> L41 Throwable -> L43
        r0 = AbstractC1406fG.m2696V((ArrayList) r1.f8520a, r52, (C2812zp) r1.f8522c);     // Catch: Throwable -> L41 Throwable -> L43
        if (r52 == null) goto L53;
        r52.close();     // Catch: IOException -> L59
        goto L53
    L44:
        if (Log.isLoggable("ThumbStreamOpener", 3) == false) goto L46;
        Objects.toString(r3);     // Catch: Throwable -> L41
    L46:
        if (r52 == null) goto L52;
        r52.close();     // Catch: IOException -> L60
    L41:
        th = move-exception;
        if (r52 != null) goto L73;
    L51:
        throw th;
    L73:
        r52.close();     // Catch: IOException -> L61
        goto L51
    L25:
        File r63 = new File(r7);
        if (r63.exists() == false) goto L24;
        if (0 >= r63.length()) goto L24;
        Uri r64 = Uri.fromFile(r63);
        r62 = r2.openInputStream(r64);     // Catch: NullPointerException -> L32
    L32:
        e = move-exception;
        throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + r3 + " -> " + r64).initCause(e));
    L64:
    L9:
        th = th;
        r5 = r6;
    L56:
        if (r5 == null) goto L58;
        r5.close();
    L58:
        throw th;
    L6:
        if (r6.moveToFirst() == false) goto L11;
        r7 = r6.getString(0);     // Catch: Throwable -> L9 SecurityException -> L62
        r6.close();
    L18:
        if (Log.isLoggable("ThumbStreamOpener", 3) == false) goto L20;
        Objects.toString(r3);     // Catch: Throwable -> L9
    L20:
        if (r6 == null) goto L13;
    L16:
        r6 = null;
    L14:
        th = th;
        goto L56
    }
}
