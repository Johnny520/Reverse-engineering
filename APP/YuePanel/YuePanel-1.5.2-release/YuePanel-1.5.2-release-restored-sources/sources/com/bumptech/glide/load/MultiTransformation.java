package com.bumptech.glide.load;

import Yue.InterfaceC6391;
import android.content.Context;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class MultiTransformation<T> implements Transformation<T> {
    private final Collection<? extends Transformation<T>> transformations;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @SafeVarargs
    public MultiTransformation(@InterfaceC6391 Transformation<T>... transformationArr) {
        if (transformationArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.transformations = Arrays.asList(transformationArr);
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof MultiTransformation) {
            return this.transformations.equals(((MultiTransformation) obj).transformations);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.transformations.hashCode();
    }

    @Override // com.bumptech.glide.load.Transformation
    @InterfaceC6391
    public Resource<T> transform(@InterfaceC6391 Context context, @InterfaceC6391 Resource<T> resource, int i, int i2) {
        Iterator<? extends Transformation<T>> it = this.transformations.iterator();
        Resource<T> resource2 = resource;
        while (it.hasNext()) {
            Resource<T> resourceTransform = it.next().transform(context, resource2, i, i2);
            if (resource2 != null && !resource2.equals(resource) && !resource2.equals(resourceTransform)) {
                resource2.recycle();
            }
            resource2 = resourceTransform;
        }
        return resource2;
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@InterfaceC6391 MessageDigest messageDigest) {
        Iterator<? extends Transformation<T>> it = this.transformations.iterator();
        while (it.hasNext()) {
            it.next().updateDiskCacheKey(messageDigest);
        }
    }

    public MultiTransformation(@InterfaceC6391 Collection<? extends Transformation<T>> collection) {
        if (!collection.isEmpty()) {
            this.transformations = collection;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }
}
