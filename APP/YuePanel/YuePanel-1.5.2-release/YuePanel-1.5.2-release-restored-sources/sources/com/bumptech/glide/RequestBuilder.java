package com.bumptech.glide;

import Yue.InterfaceC3809;
import Yue.InterfaceC4525;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7009;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.ErrorRequestCoordinator;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.RequestFutureTarget;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.ThumbnailRequestCoordinator;
import com.bumptech.glide.request.target.PreloadTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.target.ViewTarget;
import com.bumptech.glide.signature.AndroidResourceSignature;
import com.bumptech.glide.util.Executors;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class RequestBuilder<TranscodeType> extends BaseRequestOptions<RequestBuilder<TranscodeType>> implements Cloneable, ModelTypes<RequestBuilder<TranscodeType>> {
    protected static final RequestOptions DOWNLOAD_ONLY_OPTIONS = new RequestOptions().diskCacheStrategy(DiskCacheStrategy.DATA).priority(Priority.LOW).skipMemoryCache(true);
    private final Context context;

    @InterfaceC6490
    private RequestBuilder<TranscodeType> errorBuilder;
    private final Glide glide;
    private final GlideContext glideContext;
    private boolean isDefaultTransitionOptionsSet;
    private boolean isModelSet;
    private boolean isThumbnailBuilt;

    @InterfaceC6490
    private Object model;

    @InterfaceC6490
    private List<RequestListener<TranscodeType>> requestListeners;
    private final RequestManager requestManager;

    @InterfaceC6490
    private Float thumbSizeMultiplier;

    @InterfaceC6490
    private RequestBuilder<TranscodeType> thumbnailBuilder;
    private final Class<TranscodeType> transcodeClass;

    @InterfaceC6391
    private TransitionOptions<?, ? super TranscodeType> transitionOptions;

    /* JADX INFO: renamed from: com.bumptech.glide.RequestBuilder$1 */
    public static /* synthetic */ class C19001 {
        static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType;
        static final /* synthetic */ int[] $SwitchMap$com$bumptech$glide$Priority;

        static {
            int[] iArr = new int[Priority.values().length];
            $SwitchMap$com$bumptech$glide$Priority = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bumptech$glide$Priority[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bumptech$glide$Priority[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bumptech$glide$Priority[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            $SwitchMap$android$widget$ImageView$ScaleType = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @SuppressLint({"CheckResult"})
    public RequestBuilder(@InterfaceC6391 Glide glide, RequestManager requestManager, Class<TranscodeType> cls, Context context) {
        this.isDefaultTransitionOptionsSet = true;
        this.glide = glide;
        this.requestManager = requestManager;
        this.transcodeClass = cls;
        this.context = context;
        this.transitionOptions = requestManager.getDefaultTransitionOptions(cls);
        this.glideContext = glide.getGlideContext();
        initRequestListeners(requestManager.getDefaultRequestListeners());
        apply((BaseRequestOptions<?>) requestManager.getDefaultRequestOptions());
    }

    private RequestBuilder<TranscodeType> applyResourceThemeAndSignature(RequestBuilder<TranscodeType> requestBuilder) {
        return requestBuilder.theme(this.context.getTheme()).signature(AndroidResourceSignature.obtain(this.context));
    }

    private Request buildRequest(Target<TranscodeType> target, @InterfaceC6490 RequestListener<TranscodeType> requestListener, BaseRequestOptions<?> baseRequestOptions, Executor executor) {
        return buildRequestRecursive(new Object(), target, requestListener, null, this.transitionOptions, baseRequestOptions.getPriority(), baseRequestOptions.getOverrideWidth(), baseRequestOptions.getOverrideHeight(), baseRequestOptions, executor);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: com.bumptech.glide.request.ErrorRequestCoordinator */
    /* JADX WARN: Multi-variable type inference failed */
    private Request buildRequestRecursive(Object obj, Target<TranscodeType> target, @InterfaceC6490 RequestListener<TranscodeType> requestListener, @InterfaceC6490 RequestCoordinator requestCoordinator, TransitionOptions<?, ? super TranscodeType> transitionOptions, Priority priority, int i, int i2, BaseRequestOptions<?> baseRequestOptions, Executor executor) {
        RequestCoordinator requestCoordinator2;
        RequestCoordinator errorRequestCoordinator;
        if (this.errorBuilder != null) {
            errorRequestCoordinator = new ErrorRequestCoordinator(obj, requestCoordinator);
            requestCoordinator2 = errorRequestCoordinator;
        } else {
            requestCoordinator2 = null;
            errorRequestCoordinator = requestCoordinator;
        }
        Request requestBuildThumbnailRequestRecursive = buildThumbnailRequestRecursive(obj, target, requestListener, errorRequestCoordinator, transitionOptions, priority, i, i2, baseRequestOptions, executor);
        if (requestCoordinator2 == null) {
            return requestBuildThumbnailRequestRecursive;
        }
        int overrideWidth = this.errorBuilder.getOverrideWidth();
        int overrideHeight = this.errorBuilder.getOverrideHeight();
        if (Util.isValidDimensions(i, i2) && !this.errorBuilder.isValidOverride()) {
            overrideWidth = baseRequestOptions.getOverrideWidth();
            overrideHeight = baseRequestOptions.getOverrideHeight();
        }
        RequestBuilder<TranscodeType> requestBuilder = this.errorBuilder;
        ErrorRequestCoordinator errorRequestCoordinator2 = requestCoordinator2;
        errorRequestCoordinator2.setRequests(requestBuildThumbnailRequestRecursive, requestBuilder.buildRequestRecursive(obj, target, requestListener, errorRequestCoordinator2, requestBuilder.transitionOptions, requestBuilder.getPriority(), overrideWidth, overrideHeight, this.errorBuilder, executor));
        return errorRequestCoordinator2;
    }

    private Request buildThumbnailRequestRecursive(Object obj, Target<TranscodeType> target, RequestListener<TranscodeType> requestListener, @InterfaceC6490 RequestCoordinator requestCoordinator, TransitionOptions<?, ? super TranscodeType> transitionOptions, Priority priority, int i, int i2, BaseRequestOptions<?> baseRequestOptions, Executor executor) {
        RequestBuilder<TranscodeType> requestBuilder = this.thumbnailBuilder;
        if (requestBuilder == null) {
            if (this.thumbSizeMultiplier == null) {
                return obtainRequest(obj, target, requestListener, baseRequestOptions, requestCoordinator, transitionOptions, priority, i, i2, executor);
            }
            ThumbnailRequestCoordinator thumbnailRequestCoordinator = new ThumbnailRequestCoordinator(obj, requestCoordinator);
            thumbnailRequestCoordinator.setRequests(obtainRequest(obj, target, requestListener, baseRequestOptions, thumbnailRequestCoordinator, transitionOptions, priority, i, i2, executor), obtainRequest(obj, target, requestListener, baseRequestOptions.mo30832clone().sizeMultiplier(this.thumbSizeMultiplier.floatValue()), thumbnailRequestCoordinator, transitionOptions, getThumbnailPriority(priority), i, i2, executor));
            return thumbnailRequestCoordinator;
        }
        if (this.isThumbnailBuilt) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        TransitionOptions<?, ? super TranscodeType> transitionOptions2 = requestBuilder.isDefaultTransitionOptionsSet ? transitionOptions : requestBuilder.transitionOptions;
        Priority priority2 = requestBuilder.isPrioritySet() ? this.thumbnailBuilder.getPriority() : getThumbnailPriority(priority);
        int overrideWidth = this.thumbnailBuilder.getOverrideWidth();
        int overrideHeight = this.thumbnailBuilder.getOverrideHeight();
        if (Util.isValidDimensions(i, i2) && !this.thumbnailBuilder.isValidOverride()) {
            overrideWidth = baseRequestOptions.getOverrideWidth();
            overrideHeight = baseRequestOptions.getOverrideHeight();
        }
        ThumbnailRequestCoordinator thumbnailRequestCoordinator2 = new ThumbnailRequestCoordinator(obj, requestCoordinator);
        Request requestObtainRequest = obtainRequest(obj, target, requestListener, baseRequestOptions, thumbnailRequestCoordinator2, transitionOptions, priority, i, i2, executor);
        this.isThumbnailBuilt = true;
        RequestBuilder<TranscodeType> requestBuilder2 = this.thumbnailBuilder;
        Request requestBuildRequestRecursive = requestBuilder2.buildRequestRecursive(obj, target, requestListener, thumbnailRequestCoordinator2, transitionOptions2, priority2, overrideWidth, overrideHeight, requestBuilder2, executor);
        this.isThumbnailBuilt = false;
        thumbnailRequestCoordinator2.setRequests(requestObtainRequest, requestBuildRequestRecursive);
        return thumbnailRequestCoordinator2;
    }

    private RequestBuilder<TranscodeType> cloneWithNullErrorAndThumbnail() {
        return mo30832clone().error((RequestBuilder) null).thumbnail((RequestBuilder) null);
    }

    @InterfaceC6391
    private Priority getThumbnailPriority(@InterfaceC6391 Priority priority) {
        int i = C19001.$SwitchMap$com$bumptech$glide$Priority[priority.ordinal()];
        if (i == 1) {
            return Priority.NORMAL;
        }
        if (i == 2) {
            return Priority.HIGH;
        }
        if (i == 3 || i == 4) {
            return Priority.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + getPriority());
    }

    @SuppressLint({"CheckResult"})
    private void initRequestListeners(List<RequestListener<Object>> list) {
        Iterator<RequestListener<Object>> it = list.iterator();
        while (it.hasNext()) {
            addListener((RequestListener) it.next());
        }
    }

    private boolean isSkipMemoryCacheWithCompletePreviousRequest(BaseRequestOptions<?> baseRequestOptions, Request request) {
        return !baseRequestOptions.isMemoryCacheable() && request.isComplete();
    }

    @InterfaceC6391
    private RequestBuilder<TranscodeType> loadGeneric(@InterfaceC6490 Object obj) {
        if (isAutoCloneEnabled()) {
            return mo30832clone().loadGeneric(obj);
        }
        this.model = obj;
        this.isModelSet = true;
        return selfOrThrowIfLocked();
    }

    private RequestBuilder<TranscodeType> maybeApplyOptionsResourceUri(@InterfaceC6490 Uri uri, RequestBuilder<TranscodeType> requestBuilder) {
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? requestBuilder : applyResourceThemeAndSignature(requestBuilder);
    }

    private Request obtainRequest(Object obj, Target<TranscodeType> target, RequestListener<TranscodeType> requestListener, BaseRequestOptions<?> baseRequestOptions, RequestCoordinator requestCoordinator, TransitionOptions<?, ? super TranscodeType> transitionOptions, Priority priority, int i, int i2, Executor executor) {
        Context context = this.context;
        GlideContext glideContext = this.glideContext;
        return SingleRequest.obtain(context, glideContext, obj, this.model, this.transcodeClass, baseRequestOptions, i, i2, priority, target, requestListener, this.requestListeners, requestCoordinator, glideContext.getEngine(), transitionOptions.getTransitionFactory(), executor);
    }

    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<TranscodeType> addListener(@InterfaceC6490 RequestListener<TranscodeType> requestListener) {
        if (isAutoCloneEnabled()) {
            return mo30832clone().addListener(requestListener);
        }
        if (requestListener != null) {
            if (this.requestListeners == null) {
                this.requestListeners = new ArrayList();
            }
            this.requestListeners.add(requestListener);
        }
        return selfOrThrowIfLocked();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.request.BaseRequestOptions
    @InterfaceC3809
    @InterfaceC6391
    public /* bridge */ /* synthetic */ BaseRequestOptions apply(@InterfaceC6391 BaseRequestOptions baseRequestOptions) {
        return apply((BaseRequestOptions<?>) baseRequestOptions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3809
    @Deprecated
    public <Y extends Target<File>> Y downloadOnly(@InterfaceC6391 Y y) {
        return (Y) getDownloadOnlyRequest().into(y);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public boolean equals(Object obj) {
        if (!(obj instanceof RequestBuilder)) {
            return false;
        }
        RequestBuilder requestBuilder = (RequestBuilder) obj;
        return super.equals(requestBuilder) && Objects.equals(this.transcodeClass, requestBuilder.transcodeClass) && this.transitionOptions.equals(requestBuilder.transitionOptions) && Objects.equals(this.model, requestBuilder.model) && Objects.equals(this.requestListeners, requestBuilder.requestListeners) && Objects.equals(this.thumbnailBuilder, requestBuilder.thumbnailBuilder) && Objects.equals(this.errorBuilder, requestBuilder.errorBuilder) && Objects.equals(this.thumbSizeMultiplier, requestBuilder.thumbSizeMultiplier) && this.isDefaultTransitionOptionsSet == requestBuilder.isDefaultTransitionOptionsSet && this.isModelSet == requestBuilder.isModelSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public RequestBuilder<TranscodeType> error(@InterfaceC6490 RequestBuilder<TranscodeType> requestBuilder) {
        if (isAutoCloneEnabled()) {
            return mo30832clone().error((RequestBuilder) requestBuilder);
        }
        this.errorBuilder = requestBuilder;
        return selfOrThrowIfLocked();
    }

    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<File> getDownloadOnlyRequest() {
        return new RequestBuilder(File.class, this).apply((BaseRequestOptions<?>) DOWNLOAD_ONLY_OPTIONS);
    }

    public Object getModel() {
        return this.model;
    }

    public RequestManager getRequestManager() {
        return this.requestManager;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public int hashCode() {
        return Util.hashCode(this.isModelSet, Util.hashCode(this.isDefaultTransitionOptionsSet, Util.hashCode(this.thumbSizeMultiplier, Util.hashCode(this.errorBuilder, Util.hashCode(this.thumbnailBuilder, Util.hashCode(this.requestListeners, Util.hashCode(this.model, Util.hashCode(this.transitionOptions, Util.hashCode(this.transcodeClass, super.hashCode())))))))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public <Y extends Target<TranscodeType>> Y into(@InterfaceC6391 Y y) {
        return (Y) into(y, null, Executors.mainThreadExecutor());
    }

    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<TranscodeType> listener(@InterfaceC6490 RequestListener<TranscodeType> requestListener) {
        if (isAutoCloneEnabled()) {
            return mo30832clone().listener(requestListener);
        }
        this.requestListeners = null;
        return addListener(requestListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public Target<TranscodeType> preload(int i, int i2) {
        return into(PreloadTarget.obtain(this.requestManager, i, i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public FutureTarget<TranscodeType> submit() {
        return submit(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<TranscodeType> thumbnail(@InterfaceC6490 RequestBuilder<TranscodeType> requestBuilder) {
        if (isAutoCloneEnabled()) {
            return mo30832clone().thumbnail(requestBuilder);
        }
        this.thumbnailBuilder = requestBuilder;
        return selfOrThrowIfLocked();
    }

    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<TranscodeType> transition(@InterfaceC6391 TransitionOptions<?, ? super TranscodeType> transitionOptions) {
        if (isAutoCloneEnabled()) {
            return mo30832clone().transition(transitionOptions);
        }
        this.transitionOptions = (TransitionOptions) Preconditions.checkNotNull(transitionOptions);
        this.isDefaultTransitionOptionsSet = false;
        return selfOrThrowIfLocked();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.bumptech.glide.request.BaseRequestOptions
    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<TranscodeType> apply(@InterfaceC6391 BaseRequestOptions<?> baseRequestOptions) {
        Preconditions.checkNotNull(baseRequestOptions);
        return (RequestBuilder) super.apply(baseRequestOptions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC3809
    @Deprecated
    public FutureTarget<File> downloadOnly(int i, int i2) {
        return getDownloadOnlyRequest().submit(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public <Y extends Target<TranscodeType>> Y into(@InterfaceC6391 Y y, @InterfaceC6490 RequestListener<TranscodeType> requestListener, Executor executor) {
        return (Y) into(y, requestListener, this, executor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public FutureTarget<TranscodeType> submit(int i, int i2) {
        RequestFutureTarget requestFutureTarget = new RequestFutureTarget(i, i2);
        return (FutureTarget) into(requestFutureTarget, requestFutureTarget, Executors.directExecutor());
    }

    private <Y extends Target<TranscodeType>> Y into(@InterfaceC6391 Y y, @InterfaceC6490 RequestListener<TranscodeType> requestListener, BaseRequestOptions<?> baseRequestOptions, Executor executor) {
        Preconditions.checkNotNull(y);
        if (this.isModelSet) {
            Request requestBuildRequest = buildRequest(y, requestListener, baseRequestOptions, executor);
            Request request = y.getRequest();
            if (requestBuildRequest.isEquivalentTo(request) && !isSkipMemoryCacheWithCompletePreviousRequest(baseRequestOptions, request)) {
                if (!((Request) Preconditions.checkNotNull(request)).isRunning()) {
                    request.begin();
                }
                return y;
            }
            this.requestManager.clear((Target<?>) y);
            y.setRequest(requestBuildRequest);
            this.requestManager.track(y, requestBuildRequest);
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/bumptech/glide/request/BaseRequestOptions; */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @Override // com.bumptech.glide.request.BaseRequestOptions
    @InterfaceC3809
    /* JADX INFO: renamed from: clone */
    public RequestBuilder<TranscodeType> mo30832clone() {
        RequestBuilder<TranscodeType> requestBuilder = (RequestBuilder) super.mo30832clone();
        requestBuilder.transitionOptions = requestBuilder.transitionOptions.m30833clone();
        if (requestBuilder.requestListeners != null) {
            requestBuilder.requestListeners = new ArrayList(requestBuilder.requestListeners);
        }
        RequestBuilder<TranscodeType> requestBuilder2 = requestBuilder.thumbnailBuilder;
        if (requestBuilder2 != null) {
            requestBuilder.thumbnailBuilder = requestBuilder2.mo30832clone();
        }
        RequestBuilder<TranscodeType> requestBuilder3 = requestBuilder.errorBuilder;
        if (requestBuilder3 != null) {
            requestBuilder.errorBuilder = requestBuilder3.mo30832clone();
        }
        return requestBuilder;
    }

    @InterfaceC6391
    public Target<TranscodeType> preload() {
        return preload(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<TranscodeType> error(Object obj) {
        if (obj == null) {
            return error((RequestBuilder) null);
        }
        return error((RequestBuilder) cloneWithNullErrorAndThumbnail().load(obj));
    }

    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<TranscodeType> thumbnail(@InterfaceC6490 RequestBuilder<TranscodeType>... requestBuilderArr) {
        if (requestBuilderArr != null && requestBuilderArr.length != 0) {
            return thumbnail(Arrays.asList(requestBuilderArr));
        }
        return thumbnail((RequestBuilder) null);
    }

    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<TranscodeType> thumbnail(@InterfaceC6490 List<RequestBuilder<TranscodeType>> list) {
        RequestBuilder<TranscodeType> requestBuilderThumbnail = null;
        if (list != null && !list.isEmpty()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                RequestBuilder<TranscodeType> requestBuilder = list.get(size);
                if (requestBuilder != null) {
                    requestBuilderThumbnail = requestBuilderThumbnail == null ? requestBuilder : requestBuilder.thumbnail(requestBuilderThumbnail);
                }
            }
            return thumbnail(requestBuilderThumbnail);
        }
        return thumbnail((RequestBuilder) null);
    }

    /* JADX DEBUG: Method merged with bridge method: load(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // com.bumptech.glide.ModelTypes
    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<TranscodeType> load(@InterfaceC6490 Object obj) {
        return loadGeneric(obj);
    }

    @SuppressLint({"CheckResult"})
    public RequestBuilder(Class<TranscodeType> cls, RequestBuilder<?> requestBuilder) {
        this(requestBuilder.glide, requestBuilder.requestManager, cls, requestBuilder.context);
        this.model = requestBuilder.model;
        this.isModelSet = requestBuilder.isModelSet;
        apply((BaseRequestOptions<?>) requestBuilder);
    }

    /* JADX DEBUG: Method merged with bridge method: load(Landroid/graphics/Bitmap;)Ljava/lang/Object; */
    @Override // com.bumptech.glide.ModelTypes
    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<TranscodeType> load(@InterfaceC6490 Bitmap bitmap) {
        return loadGeneric(bitmap).apply((BaseRequestOptions<?>) RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE));
    }

    /* JADX DEBUG: Method merged with bridge method: load(Landroid/graphics/drawable/Drawable;)Ljava/lang/Object; */
    @Override // com.bumptech.glide.ModelTypes
    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<TranscodeType> load(@InterfaceC6490 Drawable drawable) {
        return loadGeneric(drawable).apply((BaseRequestOptions<?>) RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE));
    }

    /* JADX DEBUG: Method merged with bridge method: load(Ljava/lang/String;)Ljava/lang/Object; */
    @Override // com.bumptech.glide.ModelTypes
    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<TranscodeType> load(@InterfaceC6490 String str) {
        return loadGeneric(str);
    }

    /* JADX DEBUG: Method merged with bridge method: load(Landroid/net/Uri;)Ljava/lang/Object; */
    @Override // com.bumptech.glide.ModelTypes
    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<TranscodeType> load(@InterfaceC6490 Uri uri) {
        return maybeApplyOptionsResourceUri(uri, loadGeneric(uri));
    }

    @InterfaceC3809
    @InterfaceC6391
    @Deprecated
    public RequestBuilder<TranscodeType> thumbnail(float f) {
        if (isAutoCloneEnabled()) {
            return mo30832clone().thumbnail(f);
        }
        if (f >= 0.0f && f <= 1.0f) {
            this.thumbSizeMultiplier = Float.valueOf(f);
            return selfOrThrowIfLocked();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:18:? */
    @InterfaceC6391
    public ViewTarget<ImageView, TranscodeType> into(@InterfaceC6391 ImageView imageView) {
        BaseRequestOptions baseRequestOptionsOptionalCenterCrop;
        Util.assertMainThread();
        Preconditions.checkNotNull(imageView);
        if (!isTransformationSet() && isTransformationAllowed() && imageView.getScaleType() != null) {
            switch (C19001.$SwitchMap$android$widget$ImageView$ScaleType[imageView.getScaleType().ordinal()]) {
                case 1:
                    baseRequestOptionsOptionalCenterCrop = mo30832clone().optionalCenterCrop();
                    break;
                case 2:
                    baseRequestOptionsOptionalCenterCrop = mo30832clone().optionalCenterInside();
                    break;
                case 3:
                case 4:
                case 5:
                    baseRequestOptionsOptionalCenterCrop = mo30832clone().optionalFitCenter();
                    break;
                case 6:
                    baseRequestOptionsOptionalCenterCrop = mo30832clone().optionalCenterInside();
                    break;
                default:
                    baseRequestOptionsOptionalCenterCrop = this;
                    break;
            }
        } else {
            baseRequestOptionsOptionalCenterCrop = this;
        }
        return (ViewTarget) into(this.glideContext.buildImageViewTarget(imageView, this.transcodeClass), null, baseRequestOptionsOptionalCenterCrop, Executors.mainThreadExecutor());
    }

    /* JADX DEBUG: Method merged with bridge method: load(Ljava/io/File;)Ljava/lang/Object; */
    @Override // com.bumptech.glide.ModelTypes
    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<TranscodeType> load(@InterfaceC6490 File file) {
        return loadGeneric(file);
    }

    /* JADX DEBUG: Method merged with bridge method: load(Ljava/lang/Integer;)Ljava/lang/Object; */
    @Override // com.bumptech.glide.ModelTypes
    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<TranscodeType> load(@InterfaceC7009 @InterfaceC4525 @InterfaceC6490 Integer num) {
        return applyResourceThemeAndSignature(loadGeneric(num));
    }

    /* JADX DEBUG: Method merged with bridge method: load(Ljava/net/URL;)Ljava/lang/Object; */
    @Override // com.bumptech.glide.ModelTypes
    @InterfaceC3809
    @Deprecated
    public RequestBuilder<TranscodeType> load(@InterfaceC6490 URL url) {
        return loadGeneric(url);
    }

    /* JADX DEBUG: Method merged with bridge method: load([B)Ljava/lang/Object; */
    @Override // com.bumptech.glide.ModelTypes
    @InterfaceC3809
    @InterfaceC6391
    public RequestBuilder<TranscodeType> load(@InterfaceC6490 byte[] bArr) {
        RequestBuilder<TranscodeType> requestBuilderLoadGeneric = loadGeneric(bArr);
        if (!requestBuilderLoadGeneric.isDiskCacheStrategySet()) {
            requestBuilderLoadGeneric = requestBuilderLoadGeneric.apply((BaseRequestOptions<?>) RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE));
        }
        return !requestBuilderLoadGeneric.isSkipMemoryCacheSet() ? requestBuilderLoadGeneric.apply((BaseRequestOptions<?>) RequestOptions.skipMemoryCacheOf(true)) : requestBuilderLoadGeneric;
    }

    @Deprecated
    public FutureTarget<TranscodeType> into(int i, int i2) {
        return submit(i, i2);
    }
}
