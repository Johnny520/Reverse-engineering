package com.bumptech.glide.load.data;

import Yue.InterfaceC6391;
import Yue.InterfaceC7113;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.DataRewinder;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements DataRewinder<ParcelFileDescriptor> {
    private final InternalRewinder rewinder;

    @InterfaceC7113(21)
    public static final class Factory implements DataRewinder.Factory<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @InterfaceC6391
        public Class<ParcelFileDescriptor> getDataClass() {
            return ParcelFileDescriptor.class;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: build(Ljava/lang/Object;)Lcom/bumptech/glide/load/data/DataRewinder; */
        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @InterfaceC6391
        public DataRewinder<ParcelFileDescriptor> build(@InterfaceC6391 ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    @InterfaceC7113(21)
    public static final class InternalRewinder {
        private final ParcelFileDescriptor parcelFileDescriptor;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.parcelFileDescriptor = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.parcelFileDescriptor;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    @InterfaceC7113(21)
    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.rewinder = new InternalRewinder(parcelFileDescriptor);
    }

    public static boolean isSupported() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public void cleanup() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: rewindAndGet()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.load.data.DataRewinder
    @InterfaceC6391
    @InterfaceC7113(21)
    public ParcelFileDescriptor rewindAndGet() throws IOException {
        return this.rewinder.rewind();
    }
}
