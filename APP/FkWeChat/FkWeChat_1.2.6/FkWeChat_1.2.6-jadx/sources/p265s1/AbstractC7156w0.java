package p265s1;

import android.graphics.Shader;
import android.os.Build;
import p265s1.AbstractC7115n3;

/* JADX INFO: renamed from: s1.w0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7156w0 {
    /* JADX INFO: renamed from: a */
    public static final Shader.TileMode m28245a(int i10) {
        AbstractC7115n3.a aVar = AbstractC7115n3.f23623a;
        return AbstractC7115n3.m28042f(i10, aVar.m28045a()) ? Shader.TileMode.CLAMP : AbstractC7115n3.m28042f(i10, aVar.m28048d()) ? Shader.TileMode.REPEAT : AbstractC7115n3.m28042f(i10, aVar.m28047c()) ? Shader.TileMode.MIRROR : AbstractC7115n3.m28042f(i10, aVar.m28046b()) ? Build.VERSION.SDK_INT >= 31 ? C7125p3.f23640a.m28091a() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }
}
