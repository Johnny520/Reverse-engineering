package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n42 implements f40 {

    /* JADX INFO: renamed from: r */
    public static final String[] f6993r = {"_data"};

    /* JADX INFO: renamed from: h */
    public final Context f6994h;

    /* JADX INFO: renamed from: i */
    public final jh1 f6995i;

    /* JADX INFO: renamed from: j */
    public final jh1 f6996j;

    /* JADX INFO: renamed from: k */
    public final Uri f6997k;

    /* JADX INFO: renamed from: l */
    public final int f6998l;

    /* JADX INFO: renamed from: m */
    public final int f6999m;

    /* JADX INFO: renamed from: n */
    public final ov1 f7000n;

    /* JADX INFO: renamed from: o */
    public final Class f7001o;

    /* JADX INFO: renamed from: p */
    public volatile boolean f7002p;

    /* JADX INFO: renamed from: q */
    public volatile f40 f7003q;

    public n42(Context context, jh1 jh1Var, jh1 jh1Var2, Uri uri, int i, int i2, ov1 ov1Var, Class cls) {
        this.f6994h = context.getApplicationContext();
        this.f6995i = jh1Var;
        this.f6996j = jh1Var2;
        this.f6997k = uri;
        this.f6998l = i;
        this.f6999m = i2;
        this.f7000n = ov1Var;
        this.f7001o = cls;
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: a */
    public final Class mo1371a() {
        return this.f7001o;
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: b */
    public final void mo1372b() {
        f40 f40Var = this.f7003q;
        if (f40Var != null) {
            f40Var.mo1372b();
        }
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: c */
    public final void mo1373c(i32 i32Var, e40 e40Var) throws Throwable {
        try {
            f40 f40VarM3248d = m3248d();
            if (f40VarM3248d == null) {
                e40Var.mo635d(new IllegalArgumentException("Failed to build fetcher for: " + this.f6997k));
            } else {
                this.f7003q = f40VarM3248d;
                if (this.f7002p) {
                    cancel();
                } else {
                    f40VarM3248d.mo1373c(i32Var, e40Var);
                }
            }
        } catch (FileNotFoundException e) {
            e40Var.mo635d(e);
        }
    }

    @Override // p000.f40
    public final void cancel() {
        this.f7002p = true;
        f40 f40Var = this.f7003q;
        if (f40Var != null) {
            f40Var.cancel();
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
    /* JADX INFO: renamed from: d */
    public final f40 m3248d() throws Throwable {
        ih1 ih1VarMo236b;
        Throwable th;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f6994h;
        ov1 ov1Var = this.f7000n;
        int i = this.f6999m;
        int i2 = this.f6998l;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f6997k;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, f6993r, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            ih1VarMo236b = this.f6995i.mo236b(file, i2, i, ov1Var);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor == null) {
                            throw th;
                        }
                        cursor.close();
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            int i3 = Build.VERSION.SDK_INT;
            jh1 jh1Var = this.f6996j;
            Uri requireOriginal = this.f6997k;
            if (i3 >= 30) {
                ih1VarMo236b = jh1Var.mo236b(requireOriginal, i2, i, ov1Var);
                break;
            }
            if (AbstractC0691se.m4825N(requireOriginal)) {
                for (String str : requireOriginal.getPathSegments()) {
                    if (str != null && str.startsWith("picker")) {
                        ih1VarMo236b = jh1Var.mo236b(requireOriginal, i2, i, ov1Var);
                        break;
                    }
                }
            }
            if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
            }
            ih1VarMo236b = jh1Var.mo236b(requireOriginal, i2, i, ov1Var);
        }
        if (ih1VarMo236b != null) {
            return ih1VarMo236b.f4618c;
        }
        return null;
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: e */
    public final int mo1374e() {
        return 1;
    }
}
