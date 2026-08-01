package p111W1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.AbstractC1925g;
import com.bumptech.glide.EnumC1928j;
import com.bumptech.glide.load.data.InterfaceC1933c;
import com.bumptech.glide.load.data.InterfaceC1934d;
import java.io.File;
import java.io.FileNotFoundException;
import p078P1.C1147i;
import p107V1.C1517p;
import p107V1.InterfaceC1518q;

/* JADX INFO: renamed from: W1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1597c implements InterfaceC1934d {

    /* JADX INFO: renamed from: n */
    public static final String[] f5524n = {"_data"};

    /* JADX INFO: renamed from: d */
    public final Context f5525d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1518q f5526e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1518q f5527f;

    /* JADX INFO: renamed from: g */
    public final Uri f5528g;

    /* JADX INFO: renamed from: h */
    public final int f5529h;

    /* JADX INFO: renamed from: i */
    public final int f5530i;

    /* JADX INFO: renamed from: j */
    public final C1147i f5531j;

    /* JADX INFO: renamed from: k */
    public final Class f5532k;

    /* JADX INFO: renamed from: l */
    public volatile boolean f5533l;

    /* JADX INFO: renamed from: m */
    public volatile InterfaceC1934d f5534m;

    public C1597c(Context context, InterfaceC1518q interfaceC1518q, InterfaceC1518q interfaceC1518q2, Uri uri, int i5, int i6, C1147i c1147i, Class cls) {
        this.f5525d = context.getApplicationContext();
        this.f5526e = interfaceC1518q;
        this.f5527f = interfaceC1518q2;
        this.f5528g = uri;
        this.f5529h = i5;
        this.f5530i = i6;
        this.f5531j = c1147i;
        this.f5532k = cls;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: a */
    public final Class mo2222a() {
        return this.f5532k;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: b */
    public final void mo2223b() {
        InterfaceC1934d interfaceC1934d = this.f5534m;
        if (interfaceC1934d != null) {
            interfaceC1934d.mo2223b();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: c */
    public final int mo2224c() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    public final void cancel() {
        this.f5533l = true;
        InterfaceC1934d interfaceC1934d = this.f5534m;
        if (interfaceC1934d != null) {
            interfaceC1934d.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: d */
    public final void mo2225d(EnumC1928j enumC1928j, InterfaceC1933c interfaceC1933c) throws Throwable {
        try {
            InterfaceC1934d interfaceC1934dM2856e = m2856e();
            if (interfaceC1934dM2856e == null) {
                interfaceC1933c.mo36e(new IllegalArgumentException("Failed to build fetcher for: " + this.f5528g));
            } else {
                this.f5534m = interfaceC1934dM2856e;
                if (this.f5533l) {
                    cancel();
                } else {
                    interfaceC1934dM2856e.mo2225d(enumC1928j, interfaceC1933c);
                }
            }
        } catch (FileNotFoundException e5) {
            interfaceC1933c.mo36e(e5);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: e */
    public final InterfaceC1934d m2856e() throws Throwable {
        C1517p c1517pMo2774b;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f5525d;
        C1147i c1147i = this.f5531j;
        int i5 = this.f5530i;
        int i6 = this.f5529h;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f5528g;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, f5524n, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            c1517pMo2774b = this.f5526e.mo2774b(file, i6, i5, c1147i);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            int i7 = Build.VERSION.SDK_INT;
            InterfaceC1518q interfaceC1518q = this.f5527f;
            Uri requireOriginal = this.f5528g;
            if (i7 >= 30) {
                c1517pMo2774b = interfaceC1518q.mo2774b(requireOriginal, i6, i5, c1147i);
                break;
            }
            if (AbstractC1925g.m3546w(requireOriginal)) {
                for (String str : requireOriginal.getPathSegments()) {
                    if (str != null && str.startsWith("picker")) {
                        c1517pMo2774b = interfaceC1518q.mo2774b(requireOriginal, i6, i5, c1147i);
                        break;
                    }
                }
            }
            if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
            }
            c1517pMo2774b = interfaceC1518q.mo2774b(requireOriginal, i6, i5, c1147i);
        }
        if (c1517pMo2774b != null) {
            return c1517pMo2774b.f5271c;
        }
        return null;
    }
}
