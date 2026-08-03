package com.bumptech.glide.provider;

import Yue.InterfaceC6391;
import com.bumptech.glide.load.ResourceDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ResourceDecoderRegistry {
    private final List<String> bucketPriorityList = new ArrayList();
    private final Map<String, List<Entry<?, ?>>> decoders = new HashMap();

    public static class Entry<T, R> {
        private final Class<T> dataClass;
        final ResourceDecoder<T, R> decoder;
        final Class<R> resourceClass;

        public Entry(@InterfaceC6391 Class<T> cls, @InterfaceC6391 Class<R> cls2, ResourceDecoder<T, R> resourceDecoder) {
            this.dataClass = cls;
            this.resourceClass = cls2;
            this.decoder = resourceDecoder;
        }

        public boolean handles(@InterfaceC6391 Class<?> cls, @InterfaceC6391 Class<?> cls2) {
            return this.dataClass.isAssignableFrom(cls) && cls2.isAssignableFrom(this.resourceClass);
        }
    }

    @InterfaceC6391
    private synchronized List<Entry<?, ?>> getOrAddEntryList(@InterfaceC6391 String str) {
        List<Entry<?, ?>> arrayList;
        try {
            if (!this.bucketPriorityList.contains(str)) {
                this.bucketPriorityList.add(str);
            }
            arrayList = this.decoders.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.decoders.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized <T, R> void append(@InterfaceC6391 String str, @InterfaceC6391 ResourceDecoder<T, R> resourceDecoder, @InterfaceC6391 Class<T> cls, @InterfaceC6391 Class<R> cls2) {
        getOrAddEntryList(str).add(new Entry<>(cls, cls2, resourceDecoder));
    }

    @InterfaceC6391
    public synchronized <T, R> List<ResourceDecoder<T, R>> getDecoders(@InterfaceC6391 Class<T> cls, @InterfaceC6391 Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.bucketPriorityList.iterator();
        while (it.hasNext()) {
            List<Entry<?, ?>> list = this.decoders.get(it.next());
            if (list != null) {
                for (Entry<?, ?> entry : list) {
                    if (entry.handles(cls, cls2)) {
                        arrayList.add(entry.decoder);
                    }
                }
            }
        }
        return arrayList;
    }

    @InterfaceC6391
    public synchronized <T, R> List<Class<R>> getResourceClasses(@InterfaceC6391 Class<T> cls, @InterfaceC6391 Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.bucketPriorityList.iterator();
        while (it.hasNext()) {
            List<Entry<?, ?>> list = this.decoders.get(it.next());
            if (list != null) {
                for (Entry<?, ?> entry : list) {
                    if (entry.handles(cls, cls2) && !arrayList.contains(entry.resourceClass)) {
                        arrayList.add(entry.resourceClass);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void prepend(@InterfaceC6391 String str, @InterfaceC6391 ResourceDecoder<T, R> resourceDecoder, @InterfaceC6391 Class<T> cls, @InterfaceC6391 Class<R> cls2) {
        getOrAddEntryList(str).add(0, new Entry<>(cls, cls2, resourceDecoder));
    }

    public synchronized void setBucketPriorityList(@InterfaceC6391 List<String> list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.bucketPriorityList);
            this.bucketPriorityList.clear();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.bucketPriorityList.add(it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.bucketPriorityList.add(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
