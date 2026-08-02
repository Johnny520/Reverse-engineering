package defpackage;

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
    public static final String[] r = {"_data"};
    public final Context h;
    public final jh1 i;
    public final jh1 j;
    public final Uri k;
    public final int l;
    public final int m;
    public final ov1 n;
    public final Class o;
    public volatile boolean p;
    public volatile f40 q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n42(Context context, jh1 jh1Var, jh1 jh1Var2, Uri uri, int i, int i2, ov1 ov1Var, Class cls) {
        this.h = context.getApplicationContext();
        this.i = jh1Var;
        this.j = jh1Var2;
        this.k = uri;
        this.l = i;
        this.m = i2;
        this.n = ov1Var;
        this.o = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final Class a() {
        return this.o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final void b() {
        f40 f40Var = this.q;
        if (f40Var != null) {
            f40Var.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final void c(i32 i32Var, e40 e40Var) throws Throwable {
        try {
            f40 f40VarD = d();
            if (f40VarD == null) {
                e40Var.d(new IllegalArgumentException("Failed to build fetcher for: " + this.k));
            } else {
                this.q = f40VarD;
                if (this.p) {
                    cancel();
                } else {
                    f40VarD.c(i32Var, e40Var);
                }
            }
        } catch (FileNotFoundException e) {
            e40Var.d(e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final void cancel() {
        this.p = true;
        f40 f40Var = this.q;
        if (f40Var != null) {
            f40Var.cancel();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    public final f40 d() throws Throwable {
        ih1 ih1VarB;
        Throwable th;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.h;
        ov1 ov1Var = this.n;
        int i = this.m;
        int i2 = this.l;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.k;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, r, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            ih1VarB = this.i.b(file, i2, i, ov1Var);
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
            jh1 jh1Var = this.j;
            Uri requireOriginal = this.k;
            if (i3 >= 30) {
                ih1VarB = jh1Var.b(requireOriginal, i2, i, ov1Var);
                break;
            }
            if (se.N(requireOriginal)) {
                for (String str : requireOriginal.getPathSegments()) {
                    if (str != null && str.startsWith("picker")) {
                        ih1VarB = jh1Var.b(requireOriginal, i2, i, ov1Var);
                        break;
                    }
                }
            }
            if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
            }
            ih1VarB = jh1Var.b(requireOriginal, i2, i, ov1Var);
        }
        if (ih1VarB != null) {
            return ih1VarB.c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final int e() {
        return 1;
    }
}
