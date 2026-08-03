package com.bumptech.glide.load.model;

import Yue.C6702;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC8392;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class MultiModelLoaderFactory {
    private static final Factory DEFAULT_FACTORY = new Factory();
    private static final ModelLoader<Object, Object> EMPTY_MODEL_LOADER = new EmptyModelLoader();
    private final Set<Entry<?, ?>> alreadyUsedEntries;
    private final List<Entry<?, ?>> entries;
    private final Factory factory;
    private final C6702.InterfaceC1067<List<Throwable>> throwableListPool;

    public static class EmptyModelLoader implements ModelLoader<Object, Object> {
        @Override // com.bumptech.glide.load.model.ModelLoader
        @InterfaceC6490
        public ModelLoader.LoadData<Object> buildLoadData(@InterfaceC6391 Object obj, int i, int i2, @InterfaceC6391 Options options) {
            return null;
        }

        @Override // com.bumptech.glide.load.model.ModelLoader
        public boolean handles(@InterfaceC6391 Object obj) {
            return false;
        }
    }

    public static class Entry<Model, Data> {
        final Class<Data> dataClass;
        final ModelLoaderFactory<? extends Model, ? extends Data> factory;
        private final Class<Model> modelClass;

        public Entry(@InterfaceC6391 Class<Model> cls, @InterfaceC6391 Class<Data> cls2, @InterfaceC6391 ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
            this.modelClass = cls;
            this.dataClass = cls2;
            this.factory = modelLoaderFactory;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean handles(@InterfaceC6391 Class<?> cls, @InterfaceC6391 Class<?> cls2) {
            return handles(cls) && this.dataClass.isAssignableFrom(cls2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public boolean handles(@InterfaceC6391 Class<?> cls) {
            return this.modelClass.isAssignableFrom(cls);
        }
    }

    public static class Factory {
        @InterfaceC6391
        public <Model, Data> MultiModelLoader<Model, Data> build(@InterfaceC6391 List<ModelLoader<Model, Data>> list, @InterfaceC6391 C6702.InterfaceC1067<List<Throwable>> interfaceC1067) {
            return new MultiModelLoader<>(list, interfaceC1067);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MultiModelLoaderFactory(@InterfaceC6391 C6702.InterfaceC1067<List<Throwable>> interfaceC1067) {
        this(interfaceC1067, DEFAULT_FACTORY);
    }

    private <Model, Data> void add(@InterfaceC6391 Class<Model> cls, @InterfaceC6391 Class<Data> cls2, @InterfaceC6391 ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory, boolean z) {
        Entry<?, ?> entry = new Entry<>(cls, cls2, modelLoaderFactory);
        List<Entry<?, ?>> list = this.entries;
        list.add(z ? list.size() : 0, entry);
    }

    @InterfaceC6391
    private static <Model, Data> ModelLoader<Model, Data> emptyModelLoader() {
        return (ModelLoader<Model, Data>) EMPTY_MODEL_LOADER;
    }

    @InterfaceC6391
    private <Model, Data> ModelLoaderFactory<Model, Data> getFactory(@InterfaceC6391 Entry<?, ?> entry) {
        return (ModelLoaderFactory<Model, Data>) entry.factory;
    }

    public synchronized <Model, Data> void append(@InterfaceC6391 Class<Model> cls, @InterfaceC6391 Class<Data> cls2, @InterfaceC6391 ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        add(cls, cls2, modelLoaderFactory, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @InterfaceC6391
    public synchronized <Model> List<ModelLoader<Model, ?>> build(@InterfaceC6391 Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Entry<?, ?> entry : this.entries) {
                if (!this.alreadyUsedEntries.contains(entry) && entry.handles(cls)) {
                    this.alreadyUsedEntries.add(entry);
                    arrayList.add(build(entry));
                    this.alreadyUsedEntries.remove(entry);
                }
            }
        } finally {
        }
        return arrayList;
    }

    @InterfaceC6391
    public synchronized List<Class<?>> getDataClasses(@InterfaceC6391 Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Entry<?, ?> entry : this.entries) {
            if (!arrayList.contains(entry.dataClass) && entry.handles(cls)) {
                arrayList.add(entry.dataClass);
            }
        }
        return arrayList;
    }

    public synchronized <Model, Data> void prepend(@InterfaceC6391 Class<Model> cls, @InterfaceC6391 Class<Data> cls2, @InterfaceC6391 ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        add(cls, cls2, modelLoaderFactory, false);
    }

    @InterfaceC6391
    public synchronized <Model, Data> List<ModelLoaderFactory<? extends Model, ? extends Data>> remove(@InterfaceC6391 Class<Model> cls, @InterfaceC6391 Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<Entry<?, ?>> it = this.entries.iterator();
        while (it.hasNext()) {
            Entry<?, ?> next = it.next();
            if (next.handles(cls, cls2)) {
                it.remove();
                arrayList.add(getFactory(next));
            }
        }
        return arrayList;
    }

    @InterfaceC6391
    public synchronized <Model, Data> List<ModelLoaderFactory<? extends Model, ? extends Data>> replace(@InterfaceC6391 Class<Model> cls, @InterfaceC6391 Class<Data> cls2, @InterfaceC6391 ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        List<ModelLoaderFactory<? extends Model, ? extends Data>> listRemove;
        listRemove = remove(cls, cls2);
        append(cls, cls2, modelLoaderFactory);
        return listRemove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC8392
    public MultiModelLoaderFactory(@InterfaceC6391 C6702.InterfaceC1067<List<Throwable>> interfaceC1067, @InterfaceC6391 Factory factory) {
        this.entries = new ArrayList();
        this.alreadyUsedEntries = new HashSet();
        this.throwableListPool = interfaceC1067;
        this.factory = factory;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @InterfaceC6391
    public synchronized <Model, Data> ModelLoader<Model, Data> build(@InterfaceC6391 Class<Model> cls, @InterfaceC6391 Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (Entry<?, ?> entry : this.entries) {
                if (this.alreadyUsedEntries.contains(entry)) {
                    z = true;
                } else if (entry.handles(cls, cls2)) {
                    this.alreadyUsedEntries.add(entry);
                    arrayList.add(build(entry));
                    this.alreadyUsedEntries.remove(entry);
                }
            }
            if (arrayList.size() > 1) {
                return this.factory.build(arrayList, this.throwableListPool);
            }
            if (arrayList.size() == 1) {
                return (ModelLoader) arrayList.get(0);
            }
            if (z) {
                return emptyModelLoader();
            }
            throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
        } catch (Throwable th) {
            this.alreadyUsedEntries.clear();
            throw th;
        }
    }

    @InterfaceC6391
    private <Model, Data> ModelLoader<Model, Data> build(@InterfaceC6391 Entry<?, ?> entry) {
        return (ModelLoader) Preconditions.checkNotNull(entry.factory.build(this));
    }
}
