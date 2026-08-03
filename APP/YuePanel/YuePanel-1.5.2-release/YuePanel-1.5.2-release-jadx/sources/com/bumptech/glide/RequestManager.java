package com.bumptech.glide;

import Yue.InterfaceC3809;
import Yue.InterfaceC4525;
import Yue.InterfaceC5225;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7009;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.manager.ConnectivityMonitor;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.manager.RequestTracker;
import com.bumptech.glide.manager.TargetTracker;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomViewTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class RequestManager implements ComponentCallbacks2, LifecycleListener, ModelTypes<RequestBuilder<Drawable>> {
    private static final RequestOptions DECODE_TYPE_BITMAP = RequestOptions.decodeTypeOf(Bitmap.class).lock();
    private static final RequestOptions DECODE_TYPE_GIF = RequestOptions.decodeTypeOf(GifDrawable.class).lock();
    private static final RequestOptions DOWNLOAD_ONLY_OPTIONS = RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.DATA).priority(Priority.LOW).skipMemoryCache(true);
    private final Runnable addSelfToLifecycle;
    private boolean clearOnStop;
    private final ConnectivityMonitor connectivityMonitor;
    protected final Context context;
    private final CopyOnWriteArrayList<RequestListener<Object>> defaultRequestListeners;
    protected final Glide glide;
    final Lifecycle lifecycle;
    private boolean pauseAllRequestsOnTrimMemoryModerate;

    @InterfaceC5225("this")
    private RequestOptions requestOptions;

    @InterfaceC5225("this")
    private final RequestTracker requestTracker;

    @InterfaceC5225("this")
    private final TargetTracker targetTracker;

    @InterfaceC5225("this")
    private final RequestManagerTreeNode treeNode;

    public static class ClearTarget extends CustomViewTarget<View, Object> {
        public ClearTarget(@InterfaceC6391 View view) {
            super(view);
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadFailed(@InterfaceC6490 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.CustomViewTarget
        public void onResourceCleared(@InterfaceC6490 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onResourceReady(@InterfaceC6391 Object obj, @InterfaceC6490 Transition<? super Object> transition) {
        }
    }

    public class RequestManagerConnectivityListener implements ConnectivityMonitor.ConnectivityListener {

        @InterfaceC5225("RequestManager.this")
        private final RequestTracker requestTracker;

        public RequestManagerConnectivityListener(@InterfaceC6391 RequestTracker requestTracker) {
            this.requestTracker = requestTracker;
        }

        @Override // com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
        public void onConnectivityChanged(boolean z) {
            if (z) {
                synchronized (RequestManager.this) {
                    this.requestTracker.restartRequests();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RequestManager(@InterfaceC6391 Glide glide, @InterfaceC6391 Lifecycle lifecycle, @InterfaceC6391 RequestManagerTreeNode requestManagerTreeNode, @InterfaceC6391 Context context) {
        this(glide, lifecycle, requestManagerTreeNode, new RequestTracker(), glide.getConnectivityMonitorFactory(), context);
    }

    private synchronized void clearRequests() {
        try {
            Iterator<Target<?>> it = this.targetTracker.getAll().iterator();
            while (it.hasNext()) {
                clear(it.next());
            }
            this.targetTracker.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    private void untrackOrDelegate(@InterfaceC6391 Target<?> target) {
        boolean zUntrack = untrack(target);
        Request request = target.getRequest();
        if (zUntrack || this.glide.removeFromManagers(target) || request == null) {
            return;
        }
        target.setRequest(null);
        request.clear();
    }

    private synchronized void updateRequestOptions(@InterfaceC6391 RequestOptions requestOptions) {
        this.requestOptions = this.requestOptions.apply(requestOptions);
    }

    public RequestManager addDefaultRequestListener(RequestListener<Object> requestListener) {
        this.defaultRequestListeners.add(requestListener);
        return this;
    }

    @InterfaceC6391
    public synchronized RequestManager applyDefaultRequestOptions(@InterfaceC6391 RequestOptions requestOptions) {
        updateRequestOptions(requestOptions);
        return this;
    }

    @InterfaceC3809
    @InterfaceC6391
    /* JADX INFO: renamed from: as */
    public <ResourceType> RequestBuilder<ResourceType> m5039as(@InterfaceC6391 Class<ResourceType> cls) {
        return new RequestBuilder<>(this.glide, this, cls, this.context);
    }

    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<Bitmap> asBitmap() {
        return m5039as(Bitmap.class).apply((BaseRequestOptions<?>) DECODE_TYPE_BITMAP);
    }

    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<Drawable> asDrawable() {
        return m5039as(Drawable.class);
    }

    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<File> asFile() {
        return m5039as(File.class).apply((BaseRequestOptions<?>) RequestOptions.skipMemoryCacheOf(true));
    }

    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<GifDrawable> asGif() {
        return m5039as(GifDrawable.class).apply((BaseRequestOptions<?>) DECODE_TYPE_GIF);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void clear(@InterfaceC6391 View view) {
        clear(new ClearTarget(view));
    }

    @InterfaceC6391
    public synchronized RequestManager clearOnStop() {
        this.clearOnStop = true;
        return this;
    }

    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<File> download(@InterfaceC6490 Object obj) {
        return downloadOnly().load(obj);
    }

    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<File> downloadOnly() {
        return m5039as(File.class).apply((BaseRequestOptions<?>) DOWNLOAD_ONLY_OPTIONS);
    }

    public List<RequestListener<Object>> getDefaultRequestListeners() {
        return this.defaultRequestListeners;
    }

    public synchronized RequestOptions getDefaultRequestOptions() {
        return this.requestOptions;
    }

    @InterfaceC6391
    public <T> TransitionOptions<?, T> getDefaultTransitionOptions(Class<T> cls) {
        return this.glide.getGlideContext().getDefaultTransitionOptions(cls);
    }

    public synchronized boolean isPaused() {
        return this.requestTracker.isPaused();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public synchronized void onDestroy() {
        this.targetTracker.onDestroy();
        clearRequests();
        this.requestTracker.clearRequests();
        this.lifecycle.removeListener(this);
        this.lifecycle.removeListener(this.connectivityMonitor);
        Util.removeCallbacksOnUiThread(this.addSelfToLifecycle);
        this.glide.unregisterRequestManager(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public synchronized void onStart() {
        resumeRequests();
        this.targetTracker.onStart();
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public synchronized void onStop() {
        try {
            this.targetTracker.onStop();
            if (this.clearOnStop) {
                clearRequests();
            } else {
                pauseRequests();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 60 && this.pauseAllRequestsOnTrimMemoryModerate) {
            pauseAllRequestsRecursive();
        }
    }

    public synchronized void pauseAllRequests() {
        this.requestTracker.pauseAllRequests();
    }

    public synchronized void pauseAllRequestsRecursive() {
        pauseAllRequests();
        Iterator<RequestManager> it = this.treeNode.getDescendants().iterator();
        while (it.hasNext()) {
            it.next().pauseAllRequests();
        }
    }

    public synchronized void pauseRequests() {
        this.requestTracker.pauseRequests();
    }

    public synchronized void pauseRequestsRecursive() {
        pauseRequests();
        Iterator<RequestManager> it = this.treeNode.getDescendants().iterator();
        while (it.hasNext()) {
            it.next().pauseRequests();
        }
    }

    public synchronized void resumeRequests() {
        this.requestTracker.resumeRequests();
    }

    public synchronized void resumeRequestsRecursive() {
        Util.assertMainThread();
        resumeRequests();
        Iterator<RequestManager> it = this.treeNode.getDescendants().iterator();
        while (it.hasNext()) {
            it.next().resumeRequests();
        }
    }

    @InterfaceC6391
    public synchronized RequestManager setDefaultRequestOptions(@InterfaceC6391 RequestOptions requestOptions) {
        setRequestOptions(requestOptions);
        return this;
    }

    public void setPauseAllRequestsOnTrimMemoryModerate(boolean z) {
        this.pauseAllRequestsOnTrimMemoryModerate = z;
    }

    public synchronized void setRequestOptions(@InterfaceC6391 RequestOptions requestOptions) {
        this.requestOptions = requestOptions.mo30832clone().autoClone();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.requestTracker + ", treeNode=" + this.treeNode + "}";
    }

    public synchronized void track(@InterfaceC6391 Target<?> target, @InterfaceC6391 Request request) {
        this.targetTracker.track(target);
        this.requestTracker.runRequest(request);
    }

    public synchronized boolean untrack(@InterfaceC6391 Target<?> target) {
        Request request = target.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.requestTracker.clearAndRemove(request)) {
            return false;
        }
        this.targetTracker.untrack(target);
        target.setRequest(null);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void clear(@InterfaceC6490 Target<?> target) {
        if (target == null) {
            return;
        }
        untrackOrDelegate(target);
    }

    public RequestManager(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, RequestTracker requestTracker, ConnectivityMonitorFactory connectivityMonitorFactory, Context context) {
        this.targetTracker = new TargetTracker();
        Runnable runnable = new Runnable() { // from class: com.bumptech.glide.RequestManager.1
            @Override // java.lang.Runnable
            public void run() {
                RequestManager requestManager = RequestManager.this;
                requestManager.lifecycle.addListener(requestManager);
            }
        };
        this.addSelfToLifecycle = runnable;
        this.glide = glide;
        this.lifecycle = lifecycle;
        this.treeNode = requestManagerTreeNode;
        this.requestTracker = requestTracker;
        this.context = context;
        ConnectivityMonitor connectivityMonitorBuild = connectivityMonitorFactory.build(context.getApplicationContext(), new RequestManagerConnectivityListener(requestTracker));
        this.connectivityMonitor = connectivityMonitorBuild;
        glide.registerRequestManager(this);
        if (Util.isOnBackgroundThread()) {
            Util.postOnUiThread(runnable);
        } else {
            lifecycle.addListener(this);
        }
        lifecycle.addListener(connectivityMonitorBuild);
        this.defaultRequestListeners = new CopyOnWriteArrayList<>(glide.getGlideContext().getDefaultRequestListeners());
        setRequestOptions(glide.getGlideContext().getDefaultRequestOptions());
    }

    /* JADX DEBUG: Method merged with bridge method: load(Landroid/graphics/Bitmap;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<Drawable> load(@InterfaceC6490 Bitmap bitmap) {
        return asDrawable().load(bitmap);
    }

    /* JADX DEBUG: Method merged with bridge method: load(Landroid/graphics/drawable/Drawable;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<Drawable> load(@InterfaceC6490 Drawable drawable) {
        return asDrawable().load(drawable);
    }

    /* JADX DEBUG: Method merged with bridge method: load(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<Drawable> load(@InterfaceC6490 String str) {
        return asDrawable().load(str);
    }

    /* JADX DEBUG: Method merged with bridge method: load(Landroid/net/Uri;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<Drawable> load(@InterfaceC6490 Uri uri) {
        return asDrawable().load(uri);
    }

    /* JADX DEBUG: Method merged with bridge method: load(Ljava/io/File;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<Drawable> load(@InterfaceC6490 File file) {
        return asDrawable().load(file);
    }

    /* JADX DEBUG: Method merged with bridge method: load(Ljava/lang/Integer;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<Drawable> load(@InterfaceC7009 @InterfaceC4525 @InterfaceC6490 Integer num) {
        return asDrawable().load(num);
    }

    /* JADX DEBUG: Method merged with bridge method: load(Ljava/net/URL;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @InterfaceC3809
    @Deprecated
    public RequestBuilder<Drawable> load(@InterfaceC6490 URL url) {
        return asDrawable().load(url);
    }

    /* JADX DEBUG: Method merged with bridge method: load([B)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<Drawable> load(@InterfaceC6490 byte[] bArr) {
        return asDrawable().load(bArr);
    }

    /* JADX DEBUG: Method merged with bridge method: load(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<Drawable> load(@InterfaceC6490 Object obj) {
        return asDrawable().load(obj);
    }
}
