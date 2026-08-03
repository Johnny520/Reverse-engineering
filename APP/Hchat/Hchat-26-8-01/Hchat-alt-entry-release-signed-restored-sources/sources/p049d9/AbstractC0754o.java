package p049d9;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p276sf.C3959f;
import p300ub.AbstractC4302b;
import tf.AbstractC4166m;
import tf.C4175v;

/* JADX INFO: renamed from: d9.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0754o {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f2253a = new ConcurrentHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static File m1944a(Context context, String str) throws NoSuchAlgorithmException {
        File file = new File(AbstractC4302b.m8641d(context), "custom_friend_avatars");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(AbstractC3137a.f10177a);
        bytes.getClass();
        byte[] bArrDigest = messageDigest.digest(bytes);
        bArrDigest.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
        int i9 = 0;
        for (byte b10 : bArrDigest) {
            i9++;
            if (i9 > 1) {
                sb2.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
            }
            sb2.append((CharSequence) String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1)));
        }
        sb2.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
        return new File(file, sb2.toString().concat(".png"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final LinkedHashSet m1945b(Context context) {
        context.getClass();
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_custom_friend_avatar_config");
        Set<String> set = C4175v.f13712g;
        Set<String> stringSet = sharedPreferencesM8640c.getStringSet("configured_friends", set);
        if (stringSet != null) {
            set = stringSet;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            String str = (String) obj;
            str.getClass();
            if (m1944a(context, str).isFile()) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: c */
    public static Bitmap m1946c(Context context, Uri uri) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i9 = 1;
        options.inJustDecodeBounds = true;
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream != null) {
            try {
                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                inputStreamOpenInputStream.close();
            } finally {
            }
        }
        if (options.outWidth > 0 && options.outHeight > 0) {
            while (true) {
                if (options.outWidth / i9 <= 1024 && options.outHeight / i9 <= 1024) {
                    break;
                }
                i9 *= 2;
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = i9;
            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options2);
                    inputStreamOpenInputStream.close();
                    return bitmapDecodeStream;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final boolean m1947d(Context context, String str) {
        context.getClass();
        String string = str != null ? AbstractC3149m.m6703R0(str).toString() : null;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return string.length() > 0 && m1944a(context, string).isFile();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final Bitmap m1948e(Context context, String str) {
        Object c3959f;
        context.getClass();
        String string = str != null ? AbstractC3149m.m6703R0(str).toString() : null;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (string.length() != 0) {
            File fileM1944a = m1944a(context, string);
            if (fileM1944a.isFile() && fileM1944a.length() > 0) {
                ConcurrentHashMap concurrentHashMap = f2253a;
                C0753n c0753n = (C0753n) concurrentHashMap.get(string);
                boolean z9 = false;
                if (c0753n != null) {
                    if (!(c0753n.f2250a == fileM1944a.lastModified() && c0753n.f2251b == fileM1944a.length() && !c0753n.f2252c.isRecycled())) {
                        c0753n = null;
                    }
                    if (c0753n != null) {
                        return c0753n.f2252c;
                    }
                }
                try {
                    c3959f = BitmapFactory.decodeFile(fileM1944a.getAbsolutePath());
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (c3959f instanceof C3959f) {
                    c3959f = null;
                }
                Bitmap bitmap = (Bitmap) c3959f;
                if (bitmap != null) {
                    if (!bitmap.isRecycled() && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                        z9 = true;
                    }
                    Bitmap bitmap2 = z9 ? bitmap : null;
                    if (bitmap2 != null) {
                        concurrentHashMap.put(string, new C0753n(fileM1944a.lastModified(), fileM1944a.length(), bitmap2));
                        return bitmap2;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final Bitmap m1949f(Context context, String str) {
        context.getClass();
        boolean z9 = false;
        if (AbstractC4302b.m8640c(context, "Hchat_custom_friend_avatar_config").getBoolean("enable", false) && AbstractC4302b.m8640c(context, "Hchat_custom_friend_avatar_config").getBoolean("scope_notifications", true)) {
            z9 = true;
        }
        if (z9) {
            return m1948e(context, str);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final synchronized boolean m1950g(Context context, String str) {
        try {
            str.getClass();
            String string = AbstractC3149m.m6703R0(str).toString();
            if (string.length() == 0) {
                return false;
            }
            File fileM1944a = m1944a(context, string);
            boolean z9 = !fileM1944a.exists() || fileM1944a.delete();
            Set<String> setM8411T1 = AbstractC4166m.m8411T1(m1945b(context));
            setM8411T1.remove(string);
            AbstractC4302b.m8640c(context, "Hchat_custom_friend_avatar_config").edit().putStringSet("configured_friends", setM8411T1).apply();
            f2253a.remove(string);
            return z9;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
