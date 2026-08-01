package p227;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.AbstractC3064;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2961;
import com.bumptech.glide.load.data.InterfaceC2962;
import java.io.File;
import java.io.FileNotFoundException;
import p228.C8035;
import p228.InterfaceC8032;
import p286.C8396;

/* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8009 implements InterfaceC2961 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final String[] f22122 = {"_data"};

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public volatile InterfaceC2961 f22123;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f22124;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Uri f22125;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Class f22126;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public volatile boolean f22127;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f22128;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C8396 f22129;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC8032 f22130;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC8032 f22131;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f22132;

    public C8009(Context context, InterfaceC8032 interfaceC8032, InterfaceC8032 interfaceC80322, Uri uri, int i, int i2, C8396 c8396, Class cls) {
        this.f22132 = context.getApplicationContext();
        this.f22130 = interfaceC8032;
        this.f22131 = interfaceC80322;
        this.f22125 = uri;
        this.f22124 = i;
        this.f22128 = i2;
        this.f22129 = c8396;
        this.f22126 = cls;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    public final void cancel() {
        this.f22127 = true;
        InterfaceC2961 interfaceC2961 = this.f22123;
        if (interfaceC2961 != null) {
            interfaceC2961.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6372(Priority priority, InterfaceC2962 interfaceC2962) throws Throwable {
        try {
            InterfaceC2961 interfaceC2961M13475 = m13475();
            if (interfaceC2961M13475 == null) {
                interfaceC2962.mo6377(new IllegalArgumentException("Failed to build fetcher for: " + this.f22125));
            } else {
                this.f22123 = interfaceC2961M13475;
                if (this.f22127) {
                    cancel();
                } else {
                    interfaceC2961M13475.mo6372(priority, interfaceC2962);
                }
            }
        } catch (FileNotFoundException e) {
            interfaceC2962.mo6377(e);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final DataSource mo6373() {
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
    public final InterfaceC2961 m13475() throws Throwable {
        C8035 c8035Mo13474;
        Throwable th;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f22132;
        C8396 c8396 = this.f22129;
        int i = this.f22128;
        int i2 = this.f22124;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f22125;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, f22122, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            c8035Mo13474 = this.f22130.mo13474(file, i2, i, c8396);
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
            InterfaceC8032 interfaceC8032 = this.f22131;
            Uri requireOriginal = this.f22125;
            if (i3 >= 30) {
                c8035Mo13474 = interfaceC8032.mo13474(requireOriginal, i2, i, c8396);
                break;
            }
            if (AbstractC3064.m6779(requireOriginal)) {
                for (String str : requireOriginal.getPathSegments()) {
                    if (str != null && str.startsWith("picker")) {
                        c8035Mo13474 = interfaceC8032.mo13474(requireOriginal, i2, i, c8396);
                        break;
                    }
                }
            }
            if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
            }
            c8035Mo13474 = interfaceC8032.mo13474(requireOriginal, i2, i, c8396);
        }
        if (c8035Mo13474 != null) {
            return c8035Mo13474.f22189;
        }
        return null;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6374() {
        InterfaceC2961 interfaceC2961 = this.f22123;
        if (interfaceC2961 != null) {
            interfaceC2961.mo6374();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6375() {
        return this.f22126;
    }
}
