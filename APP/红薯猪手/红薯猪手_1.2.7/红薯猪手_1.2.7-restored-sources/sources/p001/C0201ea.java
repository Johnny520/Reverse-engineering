package p001;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.Set;

/* JADX INFO: renamed from: ۟.ea */
/* JADX INFO: loaded from: classes.dex */
public final class C0201ea implements InterfaceC0451x3 {

    /* JADX INFO: renamed from: ۥ */
    public final C0286kb f768 = new C0286kb(a.f770);

    /* JADX INFO: renamed from: ۥ۟ */
    public final SharedPreferences.Editor f769;

    /* JADX INFO: renamed from: ۟.ea$a */
    public static final class a extends AbstractC0335o4 implements InterfaceC0208f3<SharedPreferences> {

        /* JADX INFO: renamed from: ۥ */
        public static final a f770 = new a();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final SharedPreferences mo7() {
            Context context = C0292l3.f937;
            if (context != null) {
                return context.getSharedPreferences("com.skyhand.basexphelper.conf", 0);
            }
            C0237h4.m1092("context");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0201ea() {
        SharedPreferences.Editor editorEdit = m1060().edit();
        C0237h4.m1089("edit(...)", editorEdit);
        this.f769 = editorEdit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.InterfaceC0451x3
    public final String getPath() {
        Context context = C0292l3.f937;
        if (context == null) {
            C0237h4.m1092("context");
            throw null;
        }
        String parent = context.getFilesDir().getParent();
        if (parent == null) {
            parent = "";
        }
        String str = File.separator;
        return parent + str + "shared_prefs" + str + "com.skyhand.basexphelper.conf.xml";
    }

    @Override // p001.InterfaceC0451x3
    /* JADX INFO: renamed from: ۥ */
    public final String mo849(String str, String str2) {
        C0237h4.m1090("key", str);
        C0237h4.m1090("def", str2);
        try {
            String string = m1060().getString(str, str2);
            return string == null ? str2 : string;
        } catch (ClassCastException unused) {
            return "";
        }
    }

    @Override // p001.InterfaceC0451x3
    /* JADX INFO: renamed from: ۥ۟ */
    public final void mo850(String str, Object obj) {
        C0237h4.m1090("key", str);
        C0237h4.m1090("value", obj);
        if (str.length() == 0) {
            return;
        }
        if (obj instanceof Integer) {
            this.f769.putInt(str, ((Number) obj).intValue());
        } else if (obj instanceof Float) {
            this.f769.putFloat(str, ((Number) obj).floatValue());
        } else if (obj instanceof String) {
            this.f769.putString(str, (String) obj);
        } else if (obj instanceof Boolean) {
            this.f769.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Long) {
            this.f769.putLong(str, ((Number) obj).longValue());
        } else if (obj instanceof Set) {
            this.f769.putStringSet(str, (Set) obj);
        }
        this.f769.apply();
    }

    @Override // p001.InterfaceC0451x3
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Set<String> mo1058(String str, Set<String> set) {
        C0237h4.m1090("key", str);
        C0237h4.m1090("def", set);
        Set<String> stringSet = m1060().getStringSet(str, set);
        if (stringSet != null) {
            set = stringSet;
        }
        if (!(set instanceof InterfaceC0321n4)) {
            return set;
        }
        C0394sb.m941("kotlin.collections.MutableSet", set);
        throw null;
    }

    @Override // p001.InterfaceC0451x3
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final boolean mo1059(String str, boolean z) {
        C0237h4.m1090("key", str);
        return m1060().getBoolean(str, z);
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final SharedPreferences m1060() {
        Object objM886 = this.f768.m886();
        C0237h4.m1089("getValue(...)", objM886);
        return (SharedPreferences) objM886;
    }
}
