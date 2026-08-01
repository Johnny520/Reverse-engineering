package p243;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC3794;
import com.bumptech.glide.load.data.InterfaceC3795;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.reflect.jvm.internal.AbstractC5894;
import p244.C8865;
import p244.InterfaceC8862;
import p302.C9226;

/* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8839 implements InterfaceC3794 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final String[] f22464 = {"_data"};

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public volatile InterfaceC3794 f22465;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f22466;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Uri f22467;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Class f22468;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public volatile boolean f22469;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f22470;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C9226 f22471;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC8862 f22472;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC8862 f22473;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f22474;

    public C8839(Context context, InterfaceC8862 interfaceC8862, InterfaceC8862 interfaceC88622, Uri uri, int i, int i2, C9226 c9226, Class cls) {
        this.f22474 = context.getApplicationContext();
        this.f22472 = interfaceC8862;
        this.f22473 = interfaceC88622;
        this.f22467 = uri;
        this.f22466 = i;
        this.f22470 = i2;
        this.f22471 = c9226;
        this.f22468 = cls;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    public final void cancel() {
        this.f22469 = true;
        InterfaceC3794 interfaceC3794 = this.f22465;
        if (interfaceC3794 != null) {
            interfaceC3794.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6990(Priority priority, InterfaceC3795 interfaceC3795) throws Throwable {
        try {
            InterfaceC3794 interfaceC3794M14062 = m14062();
            if (interfaceC3794M14062 == null) {
                interfaceC3795.mo6995(new IllegalArgumentException("Failed to build fetcher for: " + this.f22467));
            } else {
                this.f22465 = interfaceC3794M14062;
                if (this.f22469) {
                    cancel();
                } else {
                    interfaceC3794M14062.mo6990(priority, interfaceC3795);
                }
            }
        } catch (FileNotFoundException e) {
            interfaceC3795.mo6995(e);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final DataSource mo6991() {
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
    public final InterfaceC3794 m14062() throws Throwable {
        C8865 c8865Mo14061;
        Throwable th;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f22474;
        C9226 c9226 = this.f22471;
        int i = this.f22470;
        int i2 = this.f22466;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f22467;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, f22464, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            c8865Mo14061 = this.f22472.mo14061(file, i2, i, c9226);
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
            InterfaceC8862 interfaceC8862 = this.f22473;
            Uri requireOriginal = this.f22467;
            if (i3 >= 30) {
                c8865Mo14061 = interfaceC8862.mo14061(requireOriginal, i2, i, c9226);
                break;
            }
            if (AbstractC5894.m10600(requireOriginal)) {
                for (String str : requireOriginal.getPathSegments()) {
                    if (str != null && str.startsWith("picker")) {
                        c8865Mo14061 = interfaceC8862.mo14061(requireOriginal, i2, i, c9226);
                        break;
                    }
                }
            }
            if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
            }
            c8865Mo14061 = interfaceC8862.mo14061(requireOriginal, i2, i, c9226);
        }
        if (c8865Mo14061 != null) {
            return c8865Mo14061.f22531;
        }
        return null;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6992() {
        InterfaceC3794 interfaceC3794 = this.f22465;
        if (interfaceC3794 != null) {
            interfaceC3794.mo6992();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6993() {
        return this.f22468;
    }
}
