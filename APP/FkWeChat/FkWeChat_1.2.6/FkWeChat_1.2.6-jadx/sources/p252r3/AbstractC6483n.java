package p252r3;

import android.content.Context;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p292u3.AbstractC8503f;

/* JADX INFO: renamed from: r3.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6483n {
    /* JADX INFO: renamed from: a */
    public static ByteBuffer m25684a(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Map m25685b(Context context, AbstractC8503f.b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap map = new HashMap();
        for (AbstractC8503f.b bVar : bVarArr) {
            if (bVar.m32747b() == 0) {
                Uri uriM32749d = bVar.m32749d();
                if (!map.containsKey(uriM32749d)) {
                    map.put(uriM32749d, m25684a(context, cancellationSignal, uriM32749d));
                }
            }
        }
        return Collections.unmodifiableMap(map);
    }
}
