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

    public /* synthetic */ C2799zc(Comparable comparable, Object obj, int i) {
        this.f9468a = i;
        this.f9469b = comparable;
        this.f9470c = obj;
    }

    /* JADX INFO: renamed from: b */
    public static C2799zc m5368b(Context context, Uri uri, InterfaceC1357eB interfaceC1357eB) {
        C2812zp c2812zp = ComponentCallbacks2C1273a.m2412a(context).f4340d;
        ArrayList arrayListM1377e = ComponentCallbacks2C1273a.m2412a(context).f4339c.m1544a().m1377e();
        ContentResolver contentResolver = context.getContentResolver();
        C2428qs c2428qs = new C2428qs();
        c2428qs.f8521b = interfaceC1357eB;
        c2428qs.f8522c = c2812zp;
        c2428qs.f8523d = contentResolver;
        c2428qs.f8520a = arrayListM1377e;
        return new C2799zc(uri, c2428qs, 2);
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

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: a */
    public final java.lang.Class mo912a() {
        /*
            r1 = this;
            int r0 = r1.f9468a
            switch(r0) {
                case 0: goto L17;
                case 1: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            return r0
        L8:
            java.lang.Object r0 = r1.f9470c
            Pg r0 = (p000.C0668Pg) r0
            int r0 = r0.f2132a
            switch(r0) {
                case 5: goto L14;
                default: goto L11;
            }
        L11:
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            goto L16
        L14:
            java.lang.Class<android.os.ParcelFileDescriptor> r0 = android.os.ParcelFileDescriptor.class
        L16:
            return r0
        L17:
            java.lang.Object r0 = r1.f9470c
            m6 r0 = (p000.C2220m6) r0
            r0.getClass()
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2799zc.mo912a():java.lang.Class");
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: c */
    public final void mo914c() {
        switch (this.f9468a) {
            case 0:
                try {
                    ((ByteArrayInputStream) this.f9471d).close();
                } catch (IOException unused) {
                    return;
                }
                break;
            case 1:
                Object obj = this.f9471d;
                if (obj != null) {
                    try {
                        switch (((C0668Pg) this.f9470c).f2132a) {
                            case 5:
                                ((ParcelFileDescriptor) obj).close();
                                break;
                            default:
                                ((InputStream) obj).close();
                                break;
                        }
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.f9471d;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // p000.InterfaceC2541tc
    public final void cancel() {
        int i = this.f9468a;
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: d */
    public final void mo915d(EnumC2688wu enumC2688wu, InterfaceC2498sc interfaceC2498sc) throws Throwable {
        Object objOpen;
        switch (this.f9468a) {
            case 0:
                try {
                    ByteArrayInputStream byteArrayInputStreamM4464g = C2220m6.m4464g((String) this.f9469b);
                    this.f9471d = byteArrayInputStreamM4464g;
                    interfaceC2498sc.mo638e(byteArrayInputStreamM4464g);
                } catch (IllegalArgumentException e) {
                    interfaceC2498sc.mo635b(e);
                    return;
                }
                break;
            case 1:
                try {
                    C0668Pg c0668Pg = (C0668Pg) this.f9470c;
                    File file = (File) this.f9469b;
                    switch (c0668Pg.f2132a) {
                        case 5:
                            objOpen = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            objOpen = new FileInputStream(file);
                            break;
                    }
                    this.f9471d = objOpen;
                    interfaceC2498sc.mo638e(objOpen);
                } catch (FileNotFoundException e2) {
                    interfaceC2498sc.mo635b(e2);
                    return;
                }
                break;
            default:
                try {
                    InputStream inputStreamM5372i = m5372i();
                    this.f9471d = inputStreamM5372i;
                    interfaceC2498sc.mo638e(inputStreamM5372i);
                } catch (FileNotFoundException e3) {
                    interfaceC2498sc.mo635b(e3);
                }
                break;
        }
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: f */
    public final int mo916f() {
        switch (this.f9468a) {
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputStream m5372i() throws Throwable {
        Cursor cursorMo2569a;
        String string;
        InputStream inputStreamOpenInputStream;
        int iM2696V;
        C2428qs c2428qs = (C2428qs) this.f9470c;
        ContentResolver contentResolver = (ContentResolver) c2428qs.f8523d;
        Uri uri = (Uri) this.f9469b;
        Cursor cursor = null;
        inputStreamOpenInputStream = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            cursorMo2569a = ((InterfaceC1357eB) c2428qs.f8521b).mo2569a(uri);
        } catch (SecurityException unused) {
            cursorMo2569a = null;
        } catch (Throwable th) {
            th = th;
            if (cursor != null) {
            }
            throw th;
        }
        try {
            if (cursorMo2569a != null) {
                try {
                    try {
                    } catch (SecurityException unused2) {
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Objects.toString(uri);
                        }
                        if (cursorMo2569a != null) {
                        }
                        string = null;
                        if (TextUtils.isEmpty(string)) {
                        }
                        if (inputStreamOpenInputStream != null) {
                        }
                        if (iM2696V != -1) {
                        }
                    }
                    if (cursorMo2569a.moveToFirst()) {
                        string = cursorMo2569a.getString(0);
                        cursorMo2569a.close();
                        if (TextUtils.isEmpty(string)) {
                            inputStreamOpenInputStream = null;
                        } else {
                            File file = new File(string);
                            if (file.exists() && 0 < file.length()) {
                                Uri uriFromFile = Uri.fromFile(file);
                                try {
                                    inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                                } catch (NullPointerException e) {
                                    throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e));
                                }
                            }
                        }
                        if (inputStreamOpenInputStream != null) {
                            try {
                                inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                iM2696V = AbstractC1406fG.m2696V((ArrayList) c2428qs.f8520a, inputStreamOpenInputStream2, (C2812zp) c2428qs.f8522c);
                                if (inputStreamOpenInputStream2 != null) {
                                    try {
                                        inputStreamOpenInputStream2.close();
                                    } catch (IOException unused3) {
                                    }
                                }
                            } catch (IOException | NullPointerException unused4) {
                                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                    Objects.toString(uri);
                                }
                                if (inputStreamOpenInputStream2 != null) {
                                    try {
                                        inputStreamOpenInputStream2.close();
                                    } catch (IOException unused5) {
                                    }
                                }
                                iM2696V = -1;
                            }
                        } else {
                            iM2696V = -1;
                        }
                        return iM2696V != -1 ? new C0410Jg(inputStreamOpenInputStream, iM2696V) : inputStreamOpenInputStream;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorMo2569a;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (inputStreamOpenInputStream != null) {
            }
            if (iM2696V != -1) {
            }
        } catch (Throwable th3) {
            if (inputStreamOpenInputStream2 != null) {
                try {
                    inputStreamOpenInputStream2.close();
                } catch (IOException unused6) {
                }
            }
            throw th3;
        }
        if (cursorMo2569a != null) {
            cursorMo2569a.close();
        }
        string = null;
        if (TextUtils.isEmpty(string)) {
        }
    }
}
