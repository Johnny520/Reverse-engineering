package p227;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2962;
import com.bumptech.glide.load.data.InterfaceC2963;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.reflect.jvm.internal.AbstractC5062;
import p228.C8036;
import p228.InterfaceC8033;
import p286.C8397;

/* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8010 implements InterfaceC2962 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final String[] f22119 = {"_data"};

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public volatile InterfaceC2962 f22120;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f22121;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Uri f22122;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Class f22123;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public volatile boolean f22124;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f22125;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C8397 f22126;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC8033 f22127;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC8033 f22128;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f22129;

    public C8010(Context context, InterfaceC8033 interfaceC8033, InterfaceC8033 interfaceC80332, Uri uri, int i, int i2, C8397 c8397, Class cls) {
        this.f22129 = context.getApplicationContext();
        this.f22127 = interfaceC8033;
        this.f22128 = interfaceC80332;
        this.f22122 = uri;
        this.f22121 = i;
        this.f22125 = i2;
        this.f22126 = c8397;
        this.f22123 = cls;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    public final void cancel() {
        this.f22124 = true;
        InterfaceC2962 interfaceC2962 = this.f22120;
        if (interfaceC2962 != null) {
            interfaceC2962.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6430(Priority priority, InterfaceC2963 interfaceC2963) throws Throwable {
        try {
            InterfaceC2962 interfaceC2962M13503 = m13503();
            if (interfaceC2962M13503 == null) {
                interfaceC2963.mo6435(new IllegalArgumentException("Failed to build fetcher for: " + this.f22122));
            } else {
                this.f22120 = interfaceC2962M13503;
                if (this.f22124) {
                    cancel();
                } else {
                    interfaceC2962M13503.mo6430(priority, interfaceC2963);
                }
            }
        } catch (FileNotFoundException e) {
            interfaceC2963.mo6435(e);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final DataSource mo6431() {
        return DataSource.LOCAL;
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
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC2962 m13503() throws Throwable {
        C8036 c8036Mo13502;
        Throwable th;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f22129;
        C8397 c8397 = this.f22126;
        int i = this.f22125;
        int i2 = this.f22121;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f22122;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, f22119, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            c8036Mo13502 = this.f22127.mo13502(file, i2, i, c8397);
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
            InterfaceC8033 interfaceC8033 = this.f22128;
            Uri requireOriginal = this.f22122;
            if (i3 >= 30) {
                c8036Mo13502 = interfaceC8033.mo13502(requireOriginal, i2, i, c8397);
                break;
            }
            if (AbstractC5062.m10041(requireOriginal)) {
                for (String str : requireOriginal.getPathSegments()) {
                    if (str != null && str.startsWith("picker")) {
                        c8036Mo13502 = interfaceC8033.mo13502(requireOriginal, i2, i, c8397);
                        break;
                    }
                }
            }
            if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
            }
            c8036Mo13502 = interfaceC8033.mo13502(requireOriginal, i2, i, c8397);
        }
        if (c8036Mo13502 != null) {
            return c8036Mo13502.f22186;
        }
        return null;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6432() {
        InterfaceC2962 interfaceC2962 = this.f22120;
        if (interfaceC2962 != null) {
            interfaceC2962.mo6432();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6433() {
        return this.f22123;
    }
}
