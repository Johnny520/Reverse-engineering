package yyds;

import android.content.Context;
import com.android.NativeUtil;
import java.net.URL;

/* JADX INFO: renamed from: yyds.ᛳᲀᲈᲀ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0693 extends ClassLoader {

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final /* synthetic */ int f3279 = 0;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final ClassLoader f3280;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ClassLoader f3281;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ClassLoader f3282;

    static {
        NativeUtil.classesInit0(194);
    }

    public C0693(ClassLoader classLoader, ClassLoader classLoader2) {
        AbstractC2328.m4341(-1131869484254062L);
        AbstractC2328.m4341(-1131890959090542L);
        this.f3280 = classLoader;
        this.f3281 = classLoader2;
        this.f3282 = Context.class.getClassLoader();
    }

    @Override // java.lang.ClassLoader
    public final native URL getResource(String str);

    @Override // java.lang.ClassLoader
    public final native Class loadClass(String str, boolean z);
}
