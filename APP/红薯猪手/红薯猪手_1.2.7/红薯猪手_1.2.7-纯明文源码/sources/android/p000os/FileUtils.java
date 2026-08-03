package android.p000os;

import android.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class FileUtils {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.lang.NoClassDefFoundError:0x0002: CONSTRUCTOR  A[MD:():void (c), WRAPPED] call: java.lang.NoClassDefFoundError.<init>():void type: CONSTRUCTOR)
 */
    static {
        throw new NoClassDefFoundError();
    }

    public static native /* synthetic */ long copy(@NonNull InputStream inputStream, @NonNull OutputStream outputStream) throws IOException;
}
