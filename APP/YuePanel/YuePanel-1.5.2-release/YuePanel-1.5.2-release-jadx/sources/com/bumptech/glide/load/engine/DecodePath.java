package com.bumptech.glide.load.engine;

import Yue.C6193;
import Yue.C6702;
import Yue.InterfaceC6391;
import android.util.Log;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.util.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DecodePath<DataType, ResourceType, Transcode> {
    private static final String TAG = "DecodePath";
    private final Class<DataType> dataClass;
    private final List<? extends ResourceDecoder<DataType, ResourceType>> decoders;
    private final String failureMessage;
    private final C6702.InterfaceC1067<List<Throwable>> listPool;
    private final ResourceTranscoder<ResourceType, Transcode> transcoder;

    public interface DecodeCallback<ResourceType> {
        @InterfaceC6391
        Resource<ResourceType> onResourceDecoded(@InterfaceC6391 Resource<ResourceType> resource);
    }

    public DecodePath(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends ResourceDecoder<DataType, ResourceType>> list, ResourceTranscoder<ResourceType, Transcode> resourceTranscoder, C6702.InterfaceC1067<List<Throwable>> interfaceC1067) {
        this.dataClass = cls;
        this.decoders = list;
        this.transcoder = resourceTranscoder;
        this.listPool = interfaceC1067;
        this.failureMessage = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    @InterfaceC6391
    private Resource<ResourceType> decodeResource(DataRewinder<DataType> dataRewinder, int i, int i2, @InterfaceC6391 Options options) throws GlideException {
        List<Throwable> list = (List) Preconditions.checkNotNull(this.listPool.acquire());
        try {
            return decodeResourceWithList(dataRewinder, i, i2, options, list);
        } finally {
            this.listPool.release(list);
        }
    }

    @InterfaceC6391
    private Resource<ResourceType> decodeResourceWithList(DataRewinder<DataType> dataRewinder, int i, int i2, @InterfaceC6391 Options options, List<Throwable> list) throws GlideException {
        int size = this.decoders.size();
        Resource<ResourceType> resourceDecode = null;
        for (int i3 = 0; i3 < size; i3++) {
            ResourceDecoder<DataType, ResourceType> resourceDecoder = this.decoders.get(i3);
            try {
                if (resourceDecoder.handles(dataRewinder.rewindAndGet(), options)) {
                    resourceDecode = resourceDecoder.decode(dataRewinder.rewindAndGet(), i, i2, options);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable(TAG, 2)) {
                    Log.v(TAG, "Failed to decode data for " + resourceDecoder, e);
                }
                list.add(e);
            }
            if (resourceDecode != null) {
                break;
            }
        }
        if (resourceDecode != null) {
            return resourceDecode;
        }
        throw new GlideException(this.failureMessage, new ArrayList(list));
    }

    public Resource<Transcode> decode(DataRewinder<DataType> dataRewinder, int i, int i2, @InterfaceC6391 Options options, DecodeCallback<ResourceType> decodeCallback) throws GlideException {
        return this.transcoder.transcode(decodeCallback.onResourceDecoded(decodeResource(dataRewinder, i, i2, options)), options);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.dataClass + ", decoders=" + this.decoders + ", transcoder=" + this.transcoder + C6193.f1885;
    }
}
