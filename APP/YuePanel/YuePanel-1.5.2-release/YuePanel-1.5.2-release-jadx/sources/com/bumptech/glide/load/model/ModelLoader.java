package com.bumptech.glide.load.model;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.util.Preconditions;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ModelLoader<Model, Data> {

    public static class LoadData<Data> {
        public final List<Key> alternateKeys;
        public final DataFetcher<Data> fetcher;
        public final Key sourceKey;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public LoadData(@InterfaceC6391 Key key, @InterfaceC6391 DataFetcher<Data> dataFetcher) {
            this(key, Collections.emptyList(), dataFetcher);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public LoadData(@InterfaceC6391 Key key, @InterfaceC6391 List<Key> list, @InterfaceC6391 DataFetcher<Data> dataFetcher) {
            this.sourceKey = (Key) Preconditions.checkNotNull(key);
            this.alternateKeys = (List) Preconditions.checkNotNull(list);
            this.fetcher = (DataFetcher) Preconditions.checkNotNull(dataFetcher);
        }
    }

    @InterfaceC6490
    LoadData<Data> buildLoadData(@InterfaceC6391 Model model, int i, int i2, @InterfaceC6391 Options options);

    boolean handles(@InterfaceC6391 Model model);
}
