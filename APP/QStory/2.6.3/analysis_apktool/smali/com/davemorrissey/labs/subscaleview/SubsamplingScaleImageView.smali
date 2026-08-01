.class public Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;
.super Landroid/view/View;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$DefaultOnStateChangedListener;,
        Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnStateChangedListener;,
        Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$DefaultOnImageEventListener;,
        Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnImageEventListener;,
        Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$DefaultOnAnimationEventListener;,
        Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnAnimationEventListener;,
        Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;,
        Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;,
        Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;,
        Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;,
        Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$BitmapLoadTask;,
        Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$TileLoadTask;,
        Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$TilesInitTask;
    }
.end annotation


# static fields
.field public static final EASE_IN_OUT_QUAD:I = 0x2

.field public static final EASE_OUT_QUAD:I = 0x1

.field private static final MESSAGE_LONG_CLICK:I = 0x1

.field public static final ORIENTATION_0:I = 0x0

.field public static final ORIENTATION_180:I = 0xb4

.field public static final ORIENTATION_270:I = 0x10e

.field public static final ORIENTATION_90:I = 0x5a

.field public static final ORIENTATION_USE_EXIF:I = -0x1

.field public static final ORIGIN_ANIM:I = 0x1

.field public static final ORIGIN_DOUBLE_TAP_ZOOM:I = 0x4

.field public static final ORIGIN_FLING:I = 0x3

.field public static final ORIGIN_TOUCH:I = 0x2

.field public static final PAN_LIMIT_CENTER:I = 0x3

.field public static final PAN_LIMIT_INSIDE:I = 0x1

.field public static final PAN_LIMIT_OUTSIDE:I = 0x2

.field public static final SCALE_TYPE_CENTER_CROP:I = 0x2

.field public static final SCALE_TYPE_CENTER_INSIDE:I = 0x1

.field public static final SCALE_TYPE_CUSTOM:I = 0x3

.field public static final SCALE_TYPE_START:I = 0x4

.field private static final TAG:Ljava/lang/String; = "SubsamplingScaleImageView"

.field public static final TILE_SIZE_AUTO:I = 0x7fffffff

.field private static final VALID_EASING_STYLES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final VALID_ORIENTATIONS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final VALID_PAN_LIMITS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final VALID_SCALE_TYPES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final VALID_ZOOM_STYLES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final ZOOM_FOCUS_CENTER:I = 0x2

.field public static final ZOOM_FOCUS_CENTER_IMMEDIATE:I = 0x3

.field public static final ZOOM_FOCUS_FIXED:I = 0x1

.field private static preferredBitmapConfig:Landroid/graphics/Bitmap$Config;


# instance fields
.field private anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

.field private bitmap:Landroid/graphics/Bitmap;

.field private bitmapDecoderFactory:Lcom/davemorrissey/labs/subscaleview/decoder/DecoderFactory;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/davemorrissey/labs/subscaleview/decoder/DecoderFactory<",
            "+",
            "Lcom/davemorrissey/labs/subscaleview/decoder/ImageDecoder;",
            ">;"
        }
    .end annotation
.end field

.field private bitmapIsCached:Z

.field private bitmapIsPreview:Z

.field private bitmapPaint:Landroid/graphics/Paint;

.field private debug:Z

.field private debugLinePaint:Landroid/graphics/Paint;

.field private debugTextPaint:Landroid/graphics/Paint;

.field private decoder:Lcom/davemorrissey/labs/subscaleview/decoder/ImageRegionDecoder;

.field private final decoderLock:Ljava/util/concurrent/locks/ReadWriteLock;

.field private final density:F

.field private detector:Landroid/view/GestureDetector;

.field private doubleTapZoomDuration:I

.field private doubleTapZoomScale:F

.field private doubleTapZoomStyle:I

.field private final dstArray:[F

.field private eagerLoadingEnabled:Z

.field private executor:Ljava/util/concurrent/Executor;

.field private fullImageSampleSize:I

.field private final handler:Landroid/os/Handler;

.field private imageLoadedSent:Z

.field private isPanning:Z

.field private isQuickScaling:Z

.field private isZooming:Z

.field private matrix:Landroid/graphics/Matrix;

.field private maxScale:F

.field private maxTileHeight:I

.field private maxTileWidth:I

.field private maxTouchCount:I

.field private minScale:F

.field private minimumScaleType:I

.field private minimumTileDpi:I

.field private onImageEventListener:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnImageEventListener;

.field private onLongClickListener:Landroid/view/View$OnLongClickListener;

.field private onStateChangedListener:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnStateChangedListener;

.field private orientation:I

.field private pRegion:Landroid/graphics/Rect;

.field private panEnabled:Z

.field private panLimit:I

.field private pendingScale:Ljava/lang/Float;

.field private quickScaleEnabled:Z

.field private quickScaleLastDistance:F

.field private quickScaleMoved:Z

.field private quickScaleSCenter:Landroid/graphics/PointF;

.field private final quickScaleThreshold:F

.field private quickScaleVLastPoint:Landroid/graphics/PointF;

.field private quickScaleVStart:Landroid/graphics/PointF;

.field private readySent:Z

.field private regionDecoderFactory:Lcom/davemorrissey/labs/subscaleview/decoder/DecoderFactory;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/davemorrissey/labs/subscaleview/decoder/DecoderFactory<",
            "+",
            "Lcom/davemorrissey/labs/subscaleview/decoder/ImageRegionDecoder;",
            ">;"
        }
    .end annotation
.end field

.field private sHeight:I

.field private sOrientation:I

.field private sPendingCenter:Landroid/graphics/PointF;

.field private sRect:Landroid/graphics/RectF;

.field private sRegion:Landroid/graphics/Rect;

.field private sRequestedCenter:Landroid/graphics/PointF;

.field private sWidth:I

.field private satTemp:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;

.field private scale:F

.field private scaleStart:F

.field private singleDetector:Landroid/view/GestureDetector;

.field private final srcArray:[F

.field private tileBgPaint:Landroid/graphics/Paint;

.field private tileMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;",
            ">;>;"
        }
    .end annotation
.end field

.field private uri:Landroid/net/Uri;

.field private vCenterStart:Landroid/graphics/PointF;

.field private vDistStart:F

.field private vTranslate:Landroid/graphics/PointF;

.field private vTranslateBefore:Landroid/graphics/PointF;

.field private vTranslateStart:Landroid/graphics/PointF;

.field private zoomEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/16 v1, 0x5a

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/16 v2, 0xb4

    .line 13
    .line 14
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const/16 v3, 0x10e

    .line 19
    .line 20
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const/4 v4, -0x1

    .line 25
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->VALID_ORIENTATIONS:Ljava/util/List;

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const/4 v1, 0x2

    .line 45
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const/4 v2, 0x3

    .line 50
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    filled-new-array {v0, v1, v2}, [Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    sput-object v3, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->VALID_ZOOM_STYLES:Ljava/util/List;

    .line 63
    .line 64
    filled-new-array {v1, v0}, [Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    sput-object v3, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->VALID_EASING_STYLES:Ljava/util/List;

    .line 73
    .line 74
    filled-new-array {v0, v1, v2}, [Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    sput-object v3, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->VALID_PAN_LIMITS:Ljava/util/List;

    .line 83
    .line 84
    const/4 v3, 0x4

    .line 85
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    filled-new-array {v1, v0, v2, v3}, [Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    sput-object v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->VALID_SCALE_TYPES:Ljava/util/List;

    .line 98
    .line 99
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 293
    invoke-direct {p0, p1, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->orientation:I

    .line 6
    .line 7
    const/high16 v1, 0x40000000    # 2.0f

    .line 8
    .line 9
    iput v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxScale:F

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->minScale()F

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iput v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->minScale:F

    .line 16
    .line 17
    const/4 v1, -0x1

    .line 18
    iput v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->minimumTileDpi:I

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    iput v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->panLimit:I

    .line 22
    .line 23
    iput v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->minimumScaleType:I

    .line 24
    .line 25
    const v2, 0x7fffffff

    .line 26
    .line 27
    .line 28
    iput v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxTileWidth:I

    .line 29
    .line 30
    iput v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxTileHeight:I

    .line 31
    .line 32
    sget-object v2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 33
    .line 34
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->executor:Ljava/util/concurrent/Executor;

    .line 35
    .line 36
    iput-boolean v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->eagerLoadingEnabled:Z

    .line 37
    .line 38
    iput-boolean v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->panEnabled:Z

    .line 39
    .line 40
    iput-boolean v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->zoomEnabled:Z

    .line 41
    .line 42
    iput-boolean v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleEnabled:Z

    .line 43
    .line 44
    const/high16 v2, 0x3f800000    # 1.0f

    .line 45
    .line 46
    iput v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->doubleTapZoomScale:F

    .line 47
    .line 48
    iput v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->doubleTapZoomStyle:I

    .line 49
    .line 50
    const/16 v2, 0x1f4

    .line 51
    .line 52
    iput v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->doubleTapZoomDuration:I

    .line 53
    .line 54
    new-instance v2, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 55
    .line 56
    invoke-direct {v2, v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>(Z)V

    .line 57
    .line 58
    .line 59
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->decoderLock:Ljava/util/concurrent/locks/ReadWriteLock;

    .line 60
    .line 61
    new-instance v2, Lcom/davemorrissey/labs/subscaleview/decoder/CompatDecoderFactory;

    .line 62
    .line 63
    const-class v3, Lcom/davemorrissey/labs/subscaleview/decoder/SkiaImageDecoder;

    .line 64
    .line 65
    invoke-direct {v2, v3}, Lcom/davemorrissey/labs/subscaleview/decoder/CompatDecoderFactory;-><init>(Ljava/lang/Class;)V

    .line 66
    .line 67
    .line 68
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapDecoderFactory:Lcom/davemorrissey/labs/subscaleview/decoder/DecoderFactory;

    .line 69
    .line 70
    new-instance v2, Lcom/davemorrissey/labs/subscaleview/decoder/CompatDecoderFactory;

    .line 71
    .line 72
    const-class v3, Lcom/davemorrissey/labs/subscaleview/decoder/SkiaImageRegionDecoder;

    .line 73
    .line 74
    invoke-direct {v2, v3}, Lcom/davemorrissey/labs/subscaleview/decoder/CompatDecoderFactory;-><init>(Ljava/lang/Class;)V

    .line 75
    .line 76
    .line 77
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->regionDecoderFactory:Lcom/davemorrissey/labs/subscaleview/decoder/DecoderFactory;

    .line 78
    .line 79
    const/16 v2, 0x8

    .line 80
    .line 81
    new-array v3, v2, [F

    .line 82
    .line 83
    iput-object v3, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->srcArray:[F

    .line 84
    .line 85
    new-array v2, v2, [F

    .line 86
    .line 87
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->dstArray:[F

    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 98
    .line 99
    iput v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->density:F

    .line 100
    .line 101
    const/16 v2, 0xa0

    .line 102
    .line 103
    invoke-virtual {p0, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setMinimumDpi(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setDoubleTapZoomDpi(I)V

    .line 107
    .line 108
    .line 109
    const/16 v2, 0x140

    .line 110
    .line 111
    invoke-virtual {p0, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setMinimumTileDpi(I)V

    .line 112
    .line 113
    .line 114
    invoke-direct {p0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setGestureDetector(Landroid/content/Context;)V

    .line 115
    .line 116
    .line 117
    new-instance v2, Landroid/os/Handler;

    .line 118
    .line 119
    new-instance v3, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$1;

    .line 120
    .line 121
    invoke-direct {v3, p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$1;-><init>(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;)V

    .line 122
    .line 123
    .line 124
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    .line 125
    .line 126
    .line 127
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->handler:Landroid/os/Handler;

    .line 128
    .line 129
    if-eqz p2, :cond_6

    .line 130
    .line 131
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    sget-object v3, Lcom/davemorrissey/labs/subscaleview/R$styleable;->SubsamplingScaleImageView:[I

    .line 136
    .line 137
    invoke-virtual {v2, p2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    sget v2, Lcom/davemorrissey/labs/subscaleview/R$styleable;->SubsamplingScaleImageView_assetName:I

    .line 142
    .line 143
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-eqz v2, :cond_0

    .line 148
    .line 149
    sget v2, Lcom/davemorrissey/labs/subscaleview/R$styleable;->SubsamplingScaleImageView_assetName:I

    .line 150
    .line 151
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    if-eqz v2, :cond_0

    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-lez v3, :cond_0

    .line 162
    .line 163
    invoke-static {v2}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->asset(Ljava/lang/String;)Lcom/davemorrissey/labs/subscaleview/ImageSource;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-virtual {v2}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->tilingEnabled()Lcom/davemorrissey/labs/subscaleview/ImageSource;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {p0, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setImage(Lcom/davemorrissey/labs/subscaleview/ImageSource;)V

    .line 172
    .line 173
    .line 174
    :cond_0
    sget v2, Lcom/davemorrissey/labs/subscaleview/R$styleable;->SubsamplingScaleImageView_src:I

    .line 175
    .line 176
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-eqz v2, :cond_1

    .line 181
    .line 182
    sget v2, Lcom/davemorrissey/labs/subscaleview/R$styleable;->SubsamplingScaleImageView_src:I

    .line 183
    .line 184
    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    if-lez v2, :cond_1

    .line 189
    .line 190
    invoke-static {v2}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->resource(I)Lcom/davemorrissey/labs/subscaleview/ImageSource;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-virtual {v2}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->tilingEnabled()Lcom/davemorrissey/labs/subscaleview/ImageSource;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-virtual {p0, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setImage(Lcom/davemorrissey/labs/subscaleview/ImageSource;)V

    .line 199
    .line 200
    .line 201
    :cond_1
    sget v2, Lcom/davemorrissey/labs/subscaleview/R$styleable;->SubsamplingScaleImageView_panEnabled:I

    .line 202
    .line 203
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    if-eqz v2, :cond_2

    .line 208
    .line 209
    sget v2, Lcom/davemorrissey/labs/subscaleview/R$styleable;->SubsamplingScaleImageView_panEnabled:I

    .line 210
    .line 211
    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    invoke-virtual {p0, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setPanEnabled(Z)V

    .line 216
    .line 217
    .line 218
    :cond_2
    sget v2, Lcom/davemorrissey/labs/subscaleview/R$styleable;->SubsamplingScaleImageView_zoomEnabled:I

    .line 219
    .line 220
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    if-eqz v2, :cond_3

    .line 225
    .line 226
    sget v2, Lcom/davemorrissey/labs/subscaleview/R$styleable;->SubsamplingScaleImageView_zoomEnabled:I

    .line 227
    .line 228
    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    invoke-virtual {p0, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setZoomEnabled(Z)V

    .line 233
    .line 234
    .line 235
    :cond_3
    sget v2, Lcom/davemorrissey/labs/subscaleview/R$styleable;->SubsamplingScaleImageView_quickScaleEnabled:I

    .line 236
    .line 237
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    if-eqz v2, :cond_4

    .line 242
    .line 243
    sget v2, Lcom/davemorrissey/labs/subscaleview/R$styleable;->SubsamplingScaleImageView_quickScaleEnabled:I

    .line 244
    .line 245
    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    invoke-virtual {p0, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setQuickScaleEnabled(Z)V

    .line 250
    .line 251
    .line 252
    :cond_4
    sget v2, Lcom/davemorrissey/labs/subscaleview/R$styleable;->SubsamplingScaleImageView_tileBackgroundColor:I

    .line 253
    .line 254
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    if-eqz v2, :cond_5

    .line 259
    .line 260
    sget v2, Lcom/davemorrissey/labs/subscaleview/R$styleable;->SubsamplingScaleImageView_tileBackgroundColor:I

    .line 261
    .line 262
    invoke-static {v0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    invoke-virtual {p0, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setTileBackgroundColor(I)V

    .line 271
    .line 272
    .line 273
    :cond_5
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 274
    .line 275
    .line 276
    :cond_6
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    const/high16 p2, 0x41a00000    # 20.0f

    .line 285
    .line 286
    invoke-static {v1, p2, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 287
    .line 288
    .line 289
    move-result p1

    .line 290
    iput p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleThreshold:F

    .line 291
    .line 292
    return-void
.end method

.method public static synthetic access$000(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;)Landroid/view/View$OnLongClickListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onLongClickListener:Landroid/view/View$OnLongClickListener;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1000(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$102(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxTouchCount:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1400(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->zoomEnabled:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$1500(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setGestureDetector(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$1600(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleEnabled:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$1700(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;)Landroid/graphics/PointF;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vCenterStart:Landroid/graphics/PointF;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1702(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Landroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vCenterStart:Landroid/graphics/PointF;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1802(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Landroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateStart:Landroid/graphics/PointF;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1902(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scaleStart:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$2002(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isQuickScaling:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$201(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Landroid/view/View$OnLongClickListener;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$2102(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleLastDistance:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$2200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;)Landroid/graphics/PointF;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleSCenter:Landroid/graphics/PointF;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2202(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Landroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleSCenter:Landroid/graphics/PointF;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$2302(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Landroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleVStart:Landroid/graphics/PointF;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$2402(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Landroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleVLastPoint:Landroid/graphics/PointF;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$2502(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleMoved:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$2600(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Landroid/graphics/PointF;Landroid/graphics/PointF;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->doubleTapZoom(Landroid/graphics/PointF;Landroid/graphics/PointF;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$301(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Landroid/view/View$OnLongClickListener;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$5100(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$5200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Landroid/content/Context;Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getExifOrientation(Landroid/content/Context;Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic access$5300(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;)Landroid/graphics/Rect;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sRegion:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$5400()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->TAG:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$5500(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Lcom/davemorrissey/labs/subscaleview/decoder/ImageRegionDecoder;III)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onTilesInited(Lcom/davemorrissey/labs/subscaleview/decoder/ImageRegionDecoder;III)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$5600(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;)Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnImageEventListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onImageEventListener:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnImageEventListener;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$5700(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;)Ljava/util/concurrent/locks/ReadWriteLock;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->decoderLock:Ljava/util/concurrent/locks/ReadWriteLock;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$5800(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Landroid/graphics/Rect;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fileSRect(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$5900(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onTileLoaded()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$600(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->panEnabled:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$6000(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onPreviewLoaded(Landroid/graphics/Bitmap;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$6100(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Landroid/graphics/Bitmap;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onImageLoaded(Landroid/graphics/Bitmap;IZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$6300()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->VALID_EASING_STYLES:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$6400(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;)Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$6402(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$6500(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;F)F
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->limitedScale(F)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic access$6600(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;FFFLandroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->limitedSCenter(FFFLandroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$6800(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;ZLcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fitToBounds(ZLcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$700(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->readySent:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$800(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;)Landroid/graphics/PointF;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$900(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isZooming:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$902(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isZooming:Z

    .line 2
    .line 3
    return p1
.end method

.method private calculateInSampleSize(F)I
    .locals 3

    .line 1
    iget v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->minimumTileDpi:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v1, v0, Landroid/util/DisplayMetrics;->xdpi:F

    .line 14
    .line 15
    iget v0, v0, Landroid/util/DisplayMetrics;->ydpi:F

    .line 16
    .line 17
    add-float/2addr v1, v0

    .line 18
    const/high16 v0, 0x40000000    # 2.0f

    .line 19
    .line 20
    div-float/2addr v1, v0

    .line 21
    iget v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->minimumTileDpi:I

    .line 22
    .line 23
    int-to-float v0, v0

    .line 24
    div-float/2addr v0, v1

    .line 25
    mul-float/2addr p1, v0

    .line 26
    :cond_0
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    int-to-float v0, v0

    .line 31
    mul-float/2addr v0, p1

    .line 32
    float-to-int v0, v0

    .line 33
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    int-to-float v1, v1

    .line 38
    mul-float/2addr v1, p1

    .line 39
    float-to-int p1, v1

    .line 40
    if-eqz v0, :cond_6

    .line 41
    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const/4 v2, 0x1

    .line 50
    if-gt v1, p1, :cond_3

    .line 51
    .line 52
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-le v1, v0, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    move p1, v2

    .line 60
    goto :goto_1

    .line 61
    :cond_3
    :goto_0
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    int-to-float v1, v1

    .line 66
    int-to-float p1, p1

    .line 67
    div-float/2addr v1, p1

    .line 68
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    int-to-float p0, p0

    .line 77
    int-to-float v0, v0

    .line 78
    div-float/2addr p0, v0

    .line 79
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-ge p1, p0, :cond_4

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_4
    move p1, p0

    .line 87
    :goto_1
    mul-int/lit8 p0, v2, 0x2

    .line 88
    .line 89
    if-ge p0, p1, :cond_5

    .line 90
    .line 91
    move v2, p0

    .line 92
    goto :goto_1

    .line 93
    :cond_5
    return v2

    .line 94
    :cond_6
    :goto_2
    const/16 p0, 0x20

    .line 95
    .line 96
    return p0
.end method

.method private checkImageLoaded()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isBaseLayerReady()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-boolean v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->imageLoadedSent:Z

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->preDraw()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iput-boolean v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->imageLoadedSent:Z

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onImageLoaded()V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onImageEventListener:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnImageEventListener;

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-interface {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnImageEventListener;->onImageLoaded()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return v0
.end method

.method private checkReady()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-lez v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-lez v0, :cond_1

    .line 13
    .line 14
    iget v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth:I

    .line 15
    .line 16
    if-lez v0, :cond_1

    .line 17
    .line 18
    iget v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight:I

    .line 19
    .line 20
    if-lez v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmap:Landroid/graphics/Bitmap;

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isBaseLayerReady()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    :cond_0
    move v0, v1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v0, 0x0

    .line 35
    :goto_0
    iget-boolean v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->readySent:Z

    .line 36
    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->preDraw()V

    .line 42
    .line 43
    .line 44
    iput-boolean v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->readySent:Z

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onReady()V

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onImageEventListener:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnImageEventListener;

    .line 50
    .line 51
    if-eqz p0, :cond_2

    .line 52
    .line 53
    invoke-interface {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnImageEventListener;->onReady()V

    .line 54
    .line 55
    .line 56
    :cond_2
    return v0
.end method

.method private createPaints()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapPaint:Landroid/graphics/Paint;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Paint;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapPaint:Landroid/graphics/Paint;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapPaint:Landroid/graphics/Paint;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapPaint:Landroid/graphics/Paint;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugTextPaint:Landroid/graphics/Paint;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugLinePaint:Landroid/graphics/Paint;

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    :cond_1
    iget-boolean v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debug:Z

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    new-instance v0, Landroid/graphics/Paint;

    .line 39
    .line 40
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugTextPaint:Landroid/graphics/Paint;

    .line 44
    .line 45
    const/16 v2, 0xc

    .line 46
    .line 47
    invoke-direct {p0, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->px(I)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    int-to-float v2, v2

    .line 52
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugTextPaint:Landroid/graphics/Paint;

    .line 56
    .line 57
    const v2, -0xff01

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugTextPaint:Landroid/graphics/Paint;

    .line 64
    .line 65
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 66
    .line 67
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 68
    .line 69
    .line 70
    new-instance v0, Landroid/graphics/Paint;

    .line 71
    .line 72
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugLinePaint:Landroid/graphics/Paint;

    .line 76
    .line 77
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugLinePaint:Landroid/graphics/Paint;

    .line 81
    .line 82
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 83
    .line 84
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugLinePaint:Landroid/graphics/Paint;

    .line 88
    .line 89
    invoke-direct {p0, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->px(I)I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    int-to-float p0, p0

    .line 94
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 95
    .line 96
    .line 97
    :cond_2
    return-void
.end method

.method private varargs debug(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debug:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->TAG:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method private distance(FFFF)F
    .locals 0

    .line 1
    sub-float/2addr p1, p2

    .line 2
    sub-float/2addr p3, p4

    .line 3
    mul-float/2addr p1, p1

    .line 4
    mul-float/2addr p3, p3

    .line 5
    add-float/2addr p3, p1

    .line 6
    float-to-double p0, p3

    .line 7
    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    double-to-float p0, p0

    .line 12
    return p0
.end method

.method private doubleTapZoom(Landroid/graphics/PointF;Landroid/graphics/PointF;)V
    .locals 12

    .line 1
    iget-boolean v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->panEnabled:Z

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sRequestedCenter:Landroid/graphics/PointF;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget v2, v0, Landroid/graphics/PointF;->x:F

    .line 11
    .line 12
    iput v2, p1, Landroid/graphics/PointF;->x:F

    .line 13
    .line 14
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 15
    .line 16
    iput v0, p1, Landroid/graphics/PointF;->y:F

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    div-int/2addr v0, v1

    .line 24
    int-to-float v0, v0

    .line 25
    iput v0, p1, Landroid/graphics/PointF;->x:F

    .line 26
    .line 27
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    div-int/2addr v0, v1

    .line 32
    int-to-float v0, v0

    .line 33
    iput v0, p1, Landroid/graphics/PointF;->y:F

    .line 34
    .line 35
    :cond_1
    :goto_0
    iget v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxScale:F

    .line 36
    .line 37
    iget v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->doubleTapZoomScale:F

    .line 38
    .line 39
    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 44
    .line 45
    float-to-double v3, v2

    .line 46
    float-to-double v5, v0

    .line 47
    const-wide v7, 0x3feccccccccccccdL    # 0.9

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    mul-double/2addr v5, v7

    .line 53
    cmpg-double v3, v3, v5

    .line 54
    .line 55
    const/4 v4, 0x1

    .line 56
    const/4 v5, 0x0

    .line 57
    if-lez v3, :cond_3

    .line 58
    .line 59
    iget v3, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->minScale:F

    .line 60
    .line 61
    cmpl-float v2, v2, v3

    .line 62
    .line 63
    if-nez v2, :cond_2

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    move v2, v5

    .line 67
    goto :goto_2

    .line 68
    :cond_3
    :goto_1
    move v2, v4

    .line 69
    :goto_2
    if-eqz v2, :cond_4

    .line 70
    .line 71
    :goto_3
    move v8, v0

    .line 72
    goto :goto_4

    .line 73
    :cond_4
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->minScale()F

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    goto :goto_3

    .line 78
    :goto_4
    iget v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->doubleTapZoomStyle:I

    .line 79
    .line 80
    const/4 v3, 0x3

    .line 81
    if-ne v0, v3, :cond_6

    .line 82
    .line 83
    invoke-virtual {p0, v8, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setScaleAndCenter(FLandroid/graphics/PointF;)V

    .line 84
    .line 85
    .line 86
    :cond_5
    move-object v7, p0

    .line 87
    goto :goto_6

    .line 88
    :cond_6
    const/4 v3, 0x4

    .line 89
    if-eq v0, v1, :cond_7

    .line 90
    .line 91
    if-eqz v2, :cond_7

    .line 92
    .line 93
    iget-boolean v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->panEnabled:Z

    .line 94
    .line 95
    if-nez v1, :cond_8

    .line 96
    .line 97
    :cond_7
    move-object v7, p0

    .line 98
    move-object v9, p1

    .line 99
    goto :goto_5

    .line 100
    :cond_8
    if-ne v0, v4, :cond_5

    .line 101
    .line 102
    new-instance v6, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;

    .line 103
    .line 104
    const/4 v11, 0x0

    .line 105
    move-object v7, p0

    .line 106
    move-object v9, p1

    .line 107
    move-object v10, p2

    .line 108
    invoke-direct/range {v6 .. v11}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;-><init>(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;FLandroid/graphics/PointF;Landroid/graphics/PointF;Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$1;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v6, v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;->withInterruptible(Z)Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    iget p1, v7, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->doubleTapZoomDuration:I

    .line 116
    .line 117
    int-to-long p1, p1

    .line 118
    invoke-virtual {p0, p1, p2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;->withDuration(J)Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {p0, v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;->access$1300(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;I)Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-virtual {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;->start()V

    .line 127
    .line 128
    .line 129
    goto :goto_6

    .line 130
    :goto_5
    new-instance p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;

    .line 131
    .line 132
    const/4 p1, 0x0

    .line 133
    invoke-direct {p0, v7, v8, v9, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;-><init>(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;FLandroid/graphics/PointF;Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$1;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;->withInterruptible(Z)Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    iget p1, v7, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->doubleTapZoomDuration:I

    .line 141
    .line 142
    int-to-long p1, p1

    .line 143
    invoke-virtual {p0, p1, p2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;->withDuration(J)Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-static {p0, v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;->access$1300(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;I)Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-virtual {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;->start()V

    .line 152
    .line 153
    .line 154
    :goto_6
    invoke-virtual {v7}, Landroid/view/View;->invalidate()V

    .line 155
    .line 156
    .line 157
    return-void
.end method

.method private ease(IJFFJ)F
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    move-object v1, p0

    .line 8
    move-wide v2, p2

    .line 9
    move v4, p4

    .line 10
    move v5, p5

    .line 11
    move-wide v6, p6

    .line 12
    invoke-direct/range {v1 .. v7}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->easeInOutQuad(JFFJ)F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    const-string p0, "Unexpected easing type: "

    .line 18
    .line 19
    invoke-static {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_1
    move-wide p1, p2

    .line 29
    move p3, p4

    .line 30
    move p4, p5

    .line 31
    move-wide p5, p6

    .line 32
    invoke-direct/range {p0 .. p6}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->easeOutQuad(JFFJ)F

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0
.end method

.method private easeInOutQuad(JFFJ)F
    .locals 0

    .line 1
    long-to-float p0, p1

    .line 2
    long-to-float p1, p5

    .line 3
    const/high16 p2, 0x40000000    # 2.0f

    .line 4
    .line 5
    div-float/2addr p1, p2

    .line 6
    div-float/2addr p0, p1

    .line 7
    const/high16 p1, 0x3f800000    # 1.0f

    .line 8
    .line 9
    cmpg-float p5, p0, p1

    .line 10
    .line 11
    if-gez p5, :cond_0

    .line 12
    .line 13
    div-float/2addr p4, p2

    .line 14
    mul-float/2addr p4, p0

    .line 15
    mul-float/2addr p4, p0

    .line 16
    add-float/2addr p4, p3

    .line 17
    return p4

    .line 18
    :cond_0
    sub-float/2addr p0, p1

    .line 19
    neg-float p4, p4

    .line 20
    div-float/2addr p4, p2

    .line 21
    sub-float p2, p0, p2

    .line 22
    .line 23
    mul-float/2addr p2, p0

    .line 24
    sub-float/2addr p2, p1

    .line 25
    mul-float/2addr p2, p4

    .line 26
    add-float/2addr p2, p3

    .line 27
    return p2
.end method

.method private easeOutQuad(JFFJ)F
    .locals 0

    .line 1
    long-to-float p0, p1

    .line 2
    long-to-float p1, p5

    .line 3
    div-float/2addr p0, p1

    .line 4
    neg-float p1, p4

    .line 5
    mul-float/2addr p1, p0

    .line 6
    const/high16 p2, 0x40000000    # 2.0f

    .line 7
    .line 8
    invoke-static {p0, p2, p1, p3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰(FFFF)F

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method private execute(Landroid/os/AsyncTask;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/AsyncTask<",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            "*>;)V"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->executor:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    new-array v0, v0, [Ljava/lang/Void;

    .line 5
    .line 6
    invoke-virtual {p1, p0, v0}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private fileSRect(Landroid/graphics/Rect;Landroid/graphics/Rect;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getRequiredRotation()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getRequiredRotation()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/16 v1, 0x5a

    .line 16
    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    iget v0, p1, Landroid/graphics/Rect;->top:I

    .line 20
    .line 21
    iget p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight:I

    .line 22
    .line 23
    iget v1, p1, Landroid/graphics/Rect;->right:I

    .line 24
    .line 25
    sub-int v1, p0, v1

    .line 26
    .line 27
    iget v2, p1, Landroid/graphics/Rect;->bottom:I

    .line 28
    .line 29
    iget p1, p1, Landroid/graphics/Rect;->left:I

    .line 30
    .line 31
    sub-int/2addr p0, p1

    .line 32
    invoke-virtual {p2, v0, v1, v2, p0}, Landroid/graphics/Rect;->set(IIII)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getRequiredRotation()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth:I

    .line 41
    .line 42
    const/16 v2, 0xb4

    .line 43
    .line 44
    if-ne v0, v2, :cond_2

    .line 45
    .line 46
    iget v0, p1, Landroid/graphics/Rect;->right:I

    .line 47
    .line 48
    sub-int v0, v1, v0

    .line 49
    .line 50
    iget p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight:I

    .line 51
    .line 52
    iget v2, p1, Landroid/graphics/Rect;->bottom:I

    .line 53
    .line 54
    sub-int v2, p0, v2

    .line 55
    .line 56
    iget v3, p1, Landroid/graphics/Rect;->left:I

    .line 57
    .line 58
    sub-int/2addr v1, v3

    .line 59
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 60
    .line 61
    sub-int/2addr p0, p1

    .line 62
    invoke-virtual {p2, v0, v2, v1, p0}, Landroid/graphics/Rect;->set(IIII)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_2
    iget p0, p1, Landroid/graphics/Rect;->bottom:I

    .line 67
    .line 68
    sub-int p0, v1, p0

    .line 69
    .line 70
    iget v0, p1, Landroid/graphics/Rect;->left:I

    .line 71
    .line 72
    iget v2, p1, Landroid/graphics/Rect;->top:I

    .line 73
    .line 74
    sub-int/2addr v1, v2

    .line 75
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 76
    .line 77
    invoke-virtual {p2, p0, v0, v1, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method private fitToBounds(Z)V
    .locals 5

    .line 285
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 286
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0, v1, v1}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 287
    :goto_0
    iget-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->satTemp:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;

    if-nez v2, :cond_1

    .line 288
    new-instance v2, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;

    new-instance v3, Landroid/graphics/PointF;

    invoke-direct {v3, v1, v1}, Landroid/graphics/PointF;-><init>(FF)V

    const/4 v4, 0x0

    invoke-direct {v2, v1, v3, v4}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;-><init>(FLandroid/graphics/PointF;Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$1;)V

    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->satTemp:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;

    .line 289
    :cond_1
    iget-object v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->satTemp:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;

    iget v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    invoke-static {v1, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;->access$4702(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;F)F

    .line 290
    iget-object v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->satTemp:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;

    invoke-static {v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;->access$4800(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;)Landroid/graphics/PointF;

    move-result-object v1

    iget-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    invoke-virtual {v1, v2}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 291
    iget-object v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->satTemp:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;

    invoke-direct {p0, p1, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fitToBounds(ZLcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;)V

    .line 292
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->satTemp:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;

    invoke-static {p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;->access$4700(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;)F

    move-result p1

    iput p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 293
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    iget-object v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->satTemp:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;

    invoke-static {v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;->access$4800(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;)Landroid/graphics/PointF;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    if-eqz v0, :cond_2

    .line 294
    iget p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->minimumScaleType:I

    const/4 v0, 0x4

    if-eq p1, v0, :cond_2

    .line 295
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    iget v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    invoke-direct {p0, v0, v1, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateForSCenter(FFF)Landroid/graphics/PointF;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    :cond_2
    return-void
.end method

.method private fitToBounds(ZLcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;)V
    .locals 11

    .line 1
    iget v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->panLimit:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    if-ne v0, v2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isReady()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move p1, v1

    .line 14
    :cond_0
    invoke-static {p2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;->access$4800(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;)Landroid/graphics/PointF;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {p2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;->access$4700(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;)F

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-direct {p0, v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->limitedScale(F)F

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    int-to-float v4, v4

    .line 31
    mul-float/2addr v4, v3

    .line 32
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    int-to-float v5, v5

    .line 37
    mul-float/2addr v5, v3

    .line 38
    iget v6, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->panLimit:I

    .line 39
    .line 40
    const/4 v7, 0x3

    .line 41
    if-ne v6, v7, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isReady()Z

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-eqz v6, :cond_1

    .line 48
    .line 49
    iget v6, v0, Landroid/graphics/PointF;->x:F

    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    div-int/2addr v8, v2

    .line 56
    int-to-float v8, v8

    .line 57
    sub-float/2addr v8, v4

    .line 58
    invoke-static {v6, v8}, Ljava/lang/Math;->max(FF)F

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    iput v6, v0, Landroid/graphics/PointF;->x:F

    .line 63
    .line 64
    iget v6, v0, Landroid/graphics/PointF;->y:F

    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    div-int/2addr v8, v2

    .line 71
    int-to-float v8, v8

    .line 72
    sub-float/2addr v8, v5

    .line 73
    invoke-static {v6, v8}, Ljava/lang/Math;->max(FF)F

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    iput v6, v0, Landroid/graphics/PointF;->y:F

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    if-eqz p1, :cond_2

    .line 81
    .line 82
    iget v6, v0, Landroid/graphics/PointF;->x:F

    .line 83
    .line 84
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    int-to-float v8, v8

    .line 89
    sub-float/2addr v8, v4

    .line 90
    invoke-static {v6, v8}, Ljava/lang/Math;->max(FF)F

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    iput v6, v0, Landroid/graphics/PointF;->x:F

    .line 95
    .line 96
    iget v6, v0, Landroid/graphics/PointF;->y:F

    .line 97
    .line 98
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    int-to-float v8, v8

    .line 103
    sub-float/2addr v8, v5

    .line 104
    invoke-static {v6, v8}, Ljava/lang/Math;->max(FF)F

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    iput v6, v0, Landroid/graphics/PointF;->y:F

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_2
    iget v6, v0, Landroid/graphics/PointF;->x:F

    .line 112
    .line 113
    neg-float v8, v4

    .line 114
    invoke-static {v6, v8}, Ljava/lang/Math;->max(FF)F

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    iput v6, v0, Landroid/graphics/PointF;->x:F

    .line 119
    .line 120
    iget v6, v0, Landroid/graphics/PointF;->y:F

    .line 121
    .line 122
    neg-float v8, v5

    .line 123
    invoke-static {v6, v8}, Ljava/lang/Math;->max(FF)F

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    iput v6, v0, Landroid/graphics/PointF;->y:F

    .line 128
    .line 129
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    const/high16 v8, 0x3f000000    # 0.5f

    .line 134
    .line 135
    if-gtz v6, :cond_4

    .line 136
    .line 137
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    if-lez v6, :cond_3

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_3
    move v6, v8

    .line 145
    goto :goto_2

    .line 146
    :cond_4
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    int-to-float v6, v6

    .line 151
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 152
    .line 153
    .line 154
    move-result v9

    .line 155
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 156
    .line 157
    .line 158
    move-result v10

    .line 159
    add-int/2addr v10, v9

    .line 160
    int-to-float v9, v10

    .line 161
    div-float/2addr v6, v9

    .line 162
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    if-gtz v9, :cond_5

    .line 167
    .line 168
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 169
    .line 170
    .line 171
    move-result v9

    .line 172
    if-lez v9, :cond_6

    .line 173
    .line 174
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    int-to-float v8, v8

    .line 179
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 180
    .line 181
    .line 182
    move-result v9

    .line 183
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 184
    .line 185
    .line 186
    move-result v10

    .line 187
    add-int/2addr v10, v9

    .line 188
    int-to-float v9, v10

    .line 189
    div-float/2addr v8, v9

    .line 190
    :cond_6
    iget v9, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->panLimit:I

    .line 191
    .line 192
    if-ne v9, v7, :cond_7

    .line 193
    .line 194
    invoke-virtual {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isReady()Z

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    if-eqz v7, :cond_7

    .line 199
    .line 200
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    div-int/2addr p1, v2

    .line 205
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    int-to-float p1, p1

    .line 210
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 211
    .line 212
    .line 213
    move-result p0

    .line 214
    div-int/2addr p0, v2

    .line 215
    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    :goto_3
    int-to-float p0, p0

    .line 220
    goto :goto_4

    .line 221
    :cond_7
    if-eqz p1, :cond_8

    .line 222
    .line 223
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    int-to-float p1, p1

    .line 228
    sub-float/2addr p1, v4

    .line 229
    mul-float/2addr p1, v6

    .line 230
    const/4 v1, 0x0

    .line 231
    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 236
    .line 237
    .line 238
    move-result p0

    .line 239
    int-to-float p0, p0

    .line 240
    sub-float/2addr p0, v5

    .line 241
    mul-float/2addr p0, v8

    .line 242
    invoke-static {v1, p0}, Ljava/lang/Math;->max(FF)F

    .line 243
    .line 244
    .line 245
    move-result p0

    .line 246
    goto :goto_4

    .line 247
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    int-to-float p1, p1

    .line 256
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 257
    .line 258
    .line 259
    move-result p0

    .line 260
    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    .line 261
    .line 262
    .line 263
    move-result p0

    .line 264
    goto :goto_3

    .line 265
    :goto_4
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 266
    .line 267
    invoke-static {v1, p1}, Ljava/lang/Math;->min(FF)F

    .line 268
    .line 269
    .line 270
    move-result p1

    .line 271
    iput p1, v0, Landroid/graphics/PointF;->x:F

    .line 272
    .line 273
    iget p1, v0, Landroid/graphics/PointF;->y:F

    .line 274
    .line 275
    invoke-static {p1, p0}, Ljava/lang/Math;->min(FF)F

    .line 276
    .line 277
    .line 278
    move-result p0

    .line 279
    iput p0, v0, Landroid/graphics/PointF;->y:F

    .line 280
    .line 281
    invoke-static {p2, v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;->access$4702(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;F)F

    .line 282
    .line 283
    .line 284
    return-void
.end method

.method private getExifOrientation(Landroid/content/Context;Ljava/lang/String;)I
    .locals 9

    .line 1
    const-string p0, "Unsupported EXIF orientation: "

    .line 2
    .line 3
    const-string v0, "Unsupported orientation: "

    .line 4
    .line 5
    const-string v1, "content"

    .line 6
    .line 7
    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    :try_start_0
    const-string v1, "orientation"

    .line 16
    .line 17
    filled-new-array {v1}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const/4 v7, 0x0

    .line 30
    const/4 v8, 0x0

    .line 31
    const/4 v6, 0x0

    .line 32
    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    invoke-interface {p0, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    sget-object p2, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->VALID_ORIENTATIONS:Ljava/util/List;

    .line 49
    .line 50
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-interface {p2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-eqz p2, :cond_0

    .line 59
    .line 60
    const/4 p2, -0x1

    .line 61
    if-eq p1, p2, :cond_0

    .line 62
    .line 63
    move v2, p1

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    sget-object p2, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->TAG:Ljava/lang/String;

    .line 66
    .line 67
    new-instance v1, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    move-exception v0

    .line 84
    move-object p1, v0

    .line 85
    goto :goto_2

    .line 86
    :cond_1
    :goto_0
    if-eqz p0, :cond_a

    .line 87
    .line 88
    :goto_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 89
    .line 90
    .line 91
    goto/16 :goto_6

    .line 92
    .line 93
    :catch_0
    :try_start_1
    sget-object p1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->TAG:Ljava/lang/String;

    .line 94
    .line 95
    const-string p2, "Could not get orientation of image from media store"

    .line 96
    .line 97
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    .line 99
    .line 100
    if-eqz p0, :cond_a

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :goto_2
    if-eqz p0, :cond_2

    .line 104
    .line 105
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 106
    .line 107
    .line 108
    :cond_2
    throw p1

    .line 109
    :cond_3
    const-string p1, "file:///"

    .line 110
    .line 111
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_a

    .line 116
    .line 117
    const-string p1, "file:///android_asset/"

    .line 118
    .line 119
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-nez p1, :cond_a

    .line 124
    .line 125
    :try_start_2
    new-instance p1, L飘花落叶言子哲兰楪世苏/飘花落叶言子楪苏世哲兰;

    .line 126
    .line 127
    const/4 v0, 0x7

    .line 128
    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-direct {p1, p2}, L飘花落叶言子哲兰楪世苏/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const-string p2, "Orientation"

    .line 136
    .line 137
    invoke-virtual {p1, p2}, L飘花落叶言子哲兰楪世苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)L飘花落叶言子哲兰楪世苏/飘花落叶言子楪世哲苏兰;

    .line 138
    .line 139
    .line 140
    move-result-object p2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 141
    const/4 v0, 0x1

    .line 142
    if-nez p2, :cond_4

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_4
    :try_start_3
    iget-object p1, p1, L飘花落叶言子哲兰楪世苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰:Ljava/nio/ByteOrder;

    .line 146
    .line 147
    invoke-virtual {p2, p1}, L飘花落叶言子哲兰楪世苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/nio/ByteOrder;)I

    .line 148
    .line 149
    .line 150
    move-result p1
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 151
    goto :goto_4

    .line 152
    :catch_1
    :goto_3
    move p1, v0

    .line 153
    :goto_4
    if-eq p1, v0, :cond_9

    .line 154
    .line 155
    if-nez p1, :cond_5

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_5
    const/4 p2, 0x6

    .line 159
    if-ne p1, p2, :cond_6

    .line 160
    .line 161
    const/16 p0, 0x5a

    .line 162
    .line 163
    return p0

    .line 164
    :cond_6
    const/4 p2, 0x3

    .line 165
    if-ne p1, p2, :cond_7

    .line 166
    .line 167
    const/16 p0, 0xb4

    .line 168
    .line 169
    return p0

    .line 170
    :cond_7
    const/16 p2, 0x8

    .line 171
    .line 172
    if-ne p1, p2, :cond_8

    .line 173
    .line 174
    const/16 p0, 0x10e

    .line 175
    .line 176
    return p0

    .line 177
    :cond_8
    :try_start_4
    sget-object p2, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->TAG:Ljava/lang/String;

    .line 178
    .line 179
    new-instance v0, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    invoke-static {p2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 192
    .line 193
    .line 194
    :cond_9
    :goto_5
    return v2

    .line 195
    :catch_2
    sget-object p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->TAG:Ljava/lang/String;

    .line 196
    .line 197
    const-string p1, "Could not get EXIF orientation of image"

    .line 198
    .line 199
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 200
    .line 201
    .line 202
    :cond_a
    :goto_6
    return v2
.end method

.method private getMaxBitmapDimensions(Landroid/graphics/Canvas;)Landroid/graphics/Point;
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Point;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getMaximumBitmapWidth()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxTileWidth:I

    .line 8
    .line 9
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getMaximumBitmapHeight()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iget p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxTileHeight:I

    .line 18
    .line 19
    invoke-static {p1, p0}, Ljava/lang/Math;->min(II)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-direct {v0, v1, p0}, Landroid/graphics/Point;-><init>(II)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public static getPreferredBitmapConfig()Landroid/graphics/Bitmap$Config;
    .locals 1

    .line 1
    sget-object v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->preferredBitmapConfig:Landroid/graphics/Bitmap$Config;

    .line 2
    .line 3
    return-object v0
.end method

.method private getRequiredRotation()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->orientation:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sOrientation:I

    .line 7
    .line 8
    return p0

    .line 9
    :cond_0
    return v0
.end method

.method private declared-synchronized initialiseBaseLayer(Landroid/graphics/Point;)V
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "initialiseBaseLayer maxTileDimensions=%dx%d"

    .line 3
    .line 4
    iget v1, p1, Landroid/graphics/Point;->x:I

    .line 5
    .line 6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget v2, p1, Landroid/graphics/Point;->y:I

    .line 11
    .line 12
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-direct {p0, v0, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;

    .line 24
    .line 25
    new-instance v1, Landroid/graphics/PointF;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-direct {v1, v2, v2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 29
    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-direct {v0, v2, v1, v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;-><init>(FLandroid/graphics/PointF;Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$1;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->satTemp:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {p0, v1, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fitToBounds(ZLcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->satTemp:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;->access$4700(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;)F

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-direct {p0, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->calculateInSampleSize(F)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    iput v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fullImageSampleSize:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 52
    .line 53
    if-le v0, v1, :cond_0

    .line 54
    .line 55
    :try_start_1
    div-int/lit8 v0, v0, 0x2

    .line 56
    .line 57
    iput v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fullImageSampleSize:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception v0

    .line 61
    move-object p1, v0

    .line 62
    move-object v5, p0

    .line 63
    goto/16 :goto_4

    .line 64
    .line 65
    :cond_0
    :goto_0
    :try_start_2
    iget v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fullImageSampleSize:I

    .line 66
    .line 67
    if-ne v0, v1, :cond_1

    .line 68
    .line 69
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sRegion:Landroid/graphics/Rect;

    .line 70
    .line 71
    if-nez v0, :cond_1

    .line 72
    .line 73
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iget v2, p1, Landroid/graphics/Point;->x:I

    .line 78
    .line 79
    if-ge v0, v2, :cond_1

    .line 80
    .line 81
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iget v2, p1, Landroid/graphics/Point;->y:I

    .line 86
    .line 87
    if-ge v0, v2, :cond_1

    .line 88
    .line 89
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->decoder:Lcom/davemorrissey/labs/subscaleview/decoder/ImageRegionDecoder;

    .line 90
    .line 91
    invoke-interface {p1}, Lcom/davemorrissey/labs/subscaleview/decoder/ImageRegionDecoder;->recycle()V

    .line 92
    .line 93
    .line 94
    iput-object v3, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->decoder:Lcom/davemorrissey/labs/subscaleview/decoder/ImageRegionDecoder;

    .line 95
    .line 96
    new-instance v4, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$BitmapLoadTask;

    .line 97
    .line 98
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    iget-object v7, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapDecoderFactory:Lcom/davemorrissey/labs/subscaleview/decoder/DecoderFactory;

    .line 103
    .line 104
    iget-object v8, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->uri:Landroid/net/Uri;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 105
    .line 106
    const/4 v9, 0x0

    .line 107
    move-object v5, p0

    .line 108
    :try_start_3
    invoke-direct/range {v4 .. v9}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$BitmapLoadTask;-><init>(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Landroid/content/Context;Lcom/davemorrissey/labs/subscaleview/decoder/DecoderFactory;Landroid/net/Uri;Z)V

    .line 109
    .line 110
    .line 111
    invoke-direct {v5, v4}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->execute(Landroid/os/AsyncTask;)V

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :catchall_1
    move-exception v0

    .line 116
    :goto_1
    move-object p1, v0

    .line 117
    goto :goto_4

    .line 118
    :catchall_2
    move-exception v0

    .line 119
    move-object v5, p0

    .line 120
    goto :goto_1

    .line 121
    :cond_1
    move-object v5, p0

    .line 122
    invoke-direct {v5, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->initialiseTileMap(Landroid/graphics/Point;)V

    .line 123
    .line 124
    .line 125
    iget-object p0, v5, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->tileMap:Ljava/util/Map;

    .line 126
    .line 127
    iget p1, v5, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fullImageSampleSize:I

    .line 128
    .line 129
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    check-cast p0, Ljava/util/List;

    .line 138
    .line 139
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-eqz p1, :cond_2

    .line 148
    .line 149
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    check-cast p1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;

    .line 154
    .line 155
    new-instance v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$TileLoadTask;

    .line 156
    .line 157
    iget-object v2, v5, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->decoder:Lcom/davemorrissey/labs/subscaleview/decoder/ImageRegionDecoder;

    .line 158
    .line 159
    invoke-direct {v0, v5, v2, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$TileLoadTask;-><init>(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Lcom/davemorrissey/labs/subscaleview/decoder/ImageRegionDecoder;Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)V

    .line 160
    .line 161
    .line 162
    invoke-direct {v5, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->execute(Landroid/os/AsyncTask;)V

    .line 163
    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_2
    invoke-direct {v5, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->refreshRequiredTiles(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 167
    .line 168
    .line 169
    :goto_3
    monitor-exit v5

    .line 170
    return-void

    .line 171
    :goto_4
    :try_start_4
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 172
    throw p1
.end method

.method private initialiseTileMap(Landroid/graphics/Point;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v1, Landroid/graphics/Point;->x:I

    .line 6
    .line 7
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget v3, v1, Landroid/graphics/Point;->y:I

    .line 12
    .line 13
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-string v3, "initialiseTileMap maxTileDimensions=%dx%d"

    .line 22
    .line 23
    invoke-direct {v0, v3, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v2, v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->tileMap:Ljava/util/Map;

    .line 32
    .line 33
    iget v2, v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fullImageSampleSize:I

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    move v4, v3

    .line 37
    move v5, v4

    .line 38
    :goto_0
    invoke-direct {v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth()I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    div-int/2addr v6, v4

    .line 43
    invoke-direct {v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight()I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    div-int/2addr v7, v5

    .line 48
    div-int v8, v6, v2

    .line 49
    .line 50
    div-int v9, v7, v2

    .line 51
    .line 52
    :goto_1
    add-int v10, v8, v4

    .line 53
    .line 54
    add-int/2addr v10, v3

    .line 55
    iget v11, v1, Landroid/graphics/Point;->x:I

    .line 56
    .line 57
    if-gt v10, v11, :cond_9

    .line 58
    .line 59
    int-to-double v10, v8

    .line 60
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    int-to-double v12, v8

    .line 65
    const-wide/high16 v14, 0x3ff4000000000000L    # 1.25

    .line 66
    .line 67
    mul-double/2addr v12, v14

    .line 68
    cmpl-double v8, v10, v12

    .line 69
    .line 70
    if-lez v8, :cond_0

    .line 71
    .line 72
    iget v8, v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fullImageSampleSize:I

    .line 73
    .line 74
    if-ge v2, v8, :cond_0

    .line 75
    .line 76
    goto/16 :goto_9

    .line 77
    .line 78
    :cond_0
    :goto_2
    add-int v8, v9, v5

    .line 79
    .line 80
    add-int/2addr v8, v3

    .line 81
    iget v10, v1, Landroid/graphics/Point;->y:I

    .line 82
    .line 83
    if-gt v8, v10, :cond_8

    .line 84
    .line 85
    int-to-double v8, v9

    .line 86
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    int-to-double v10, v10

    .line 91
    mul-double/2addr v10, v14

    .line 92
    cmpl-double v8, v8, v10

    .line 93
    .line 94
    if-lez v8, :cond_1

    .line 95
    .line 96
    iget v8, v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fullImageSampleSize:I

    .line 97
    .line 98
    if-ge v2, v8, :cond_1

    .line 99
    .line 100
    goto/16 :goto_8

    .line 101
    .line 102
    :cond_1
    new-instance v8, Ljava/util/ArrayList;

    .line 103
    .line 104
    mul-int v9, v4, v5

    .line 105
    .line 106
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 107
    .line 108
    .line 109
    const/4 v10, 0x0

    .line 110
    :goto_3
    if-ge v10, v4, :cond_6

    .line 111
    .line 112
    const/4 v11, 0x0

    .line 113
    :goto_4
    if-ge v11, v5, :cond_5

    .line 114
    .line 115
    new-instance v12, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;

    .line 116
    .line 117
    const/4 v13, 0x0

    .line 118
    invoke-direct {v12, v13}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;-><init>(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$1;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v12, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4302(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;I)I

    .line 122
    .line 123
    .line 124
    iget v13, v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fullImageSampleSize:I

    .line 125
    .line 126
    if-ne v2, v13, :cond_2

    .line 127
    .line 128
    move v13, v3

    .line 129
    goto :goto_5

    .line 130
    :cond_2
    const/4 v13, 0x0

    .line 131
    :goto_5
    invoke-static {v12, v13}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$402(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;Z)Z

    .line 132
    .line 133
    .line 134
    new-instance v13, Landroid/graphics/Rect;

    .line 135
    .line 136
    mul-int v14, v10, v6

    .line 137
    .line 138
    mul-int v15, v11, v7

    .line 139
    .line 140
    add-int/lit8 v3, v4, -0x1

    .line 141
    .line 142
    if-ne v10, v3, :cond_3

    .line 143
    .line 144
    invoke-direct {v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth()I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    goto :goto_6

    .line 149
    :cond_3
    add-int/lit8 v3, v10, 0x1

    .line 150
    .line 151
    mul-int/2addr v3, v6

    .line 152
    :goto_6
    add-int/lit8 v9, v5, -0x1

    .line 153
    .line 154
    if-ne v11, v9, :cond_4

    .line 155
    .line 156
    invoke-direct {v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight()I

    .line 157
    .line 158
    .line 159
    move-result v9

    .line 160
    goto :goto_7

    .line 161
    :cond_4
    add-int/lit8 v9, v11, 0x1

    .line 162
    .line 163
    mul-int/2addr v9, v7

    .line 164
    :goto_7
    invoke-direct {v13, v14, v15, v3, v9}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 165
    .line 166
    .line 167
    invoke-static {v12, v13}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4102(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;Landroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 168
    .line 169
    .line 170
    new-instance v3, Landroid/graphics/Rect;

    .line 171
    .line 172
    const/4 v9, 0x0

    .line 173
    invoke-direct {v3, v9, v9, v9, v9}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 174
    .line 175
    .line 176
    invoke-static {v12, v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4202(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;Landroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 177
    .line 178
    .line 179
    new-instance v3, Landroid/graphics/Rect;

    .line 180
    .line 181
    invoke-static {v12}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4100(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 182
    .line 183
    .line 184
    move-result-object v13

    .line 185
    invoke-direct {v3, v13}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 186
    .line 187
    .line 188
    invoke-static {v12, v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$5002(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;Landroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    add-int/lit8 v11, v11, 0x1

    .line 195
    .line 196
    const/4 v3, 0x1

    .line 197
    goto :goto_4

    .line 198
    :cond_5
    const/4 v9, 0x0

    .line 199
    add-int/lit8 v10, v10, 0x1

    .line 200
    .line 201
    const/4 v3, 0x1

    .line 202
    goto :goto_3

    .line 203
    :cond_6
    iget-object v3, v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->tileMap:Ljava/util/Map;

    .line 204
    .line 205
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    invoke-interface {v3, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    const/4 v3, 0x1

    .line 213
    if-ne v2, v3, :cond_7

    .line 214
    .line 215
    return-void

    .line 216
    :cond_7
    div-int/lit8 v2, v2, 0x2

    .line 217
    .line 218
    goto/16 :goto_0

    .line 219
    .line 220
    :cond_8
    :goto_8
    add-int/lit8 v5, v5, 0x1

    .line 221
    .line 222
    invoke-direct {v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight()I

    .line 223
    .line 224
    .line 225
    move-result v7

    .line 226
    div-int/2addr v7, v5

    .line 227
    div-int v9, v7, v2

    .line 228
    .line 229
    goto/16 :goto_2

    .line 230
    .line 231
    :cond_9
    :goto_9
    add-int/lit8 v4, v4, 0x1

    .line 232
    .line 233
    invoke-direct {v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth()I

    .line 234
    .line 235
    .line 236
    move-result v6

    .line 237
    div-int/2addr v6, v4

    .line 238
    div-int v8, v6, v2

    .line 239
    .line 240
    goto/16 :goto_1
.end method

.method private isBaseLayerReady()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapIsPreview:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->tileMap:Ljava/util/Map;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_5

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_4

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Ljava/util/Map$Entry;

    .line 35
    .line 36
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    iget v5, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fullImageSampleSize:I

    .line 47
    .line 48
    if-ne v4, v5, :cond_1

    .line 49
    .line 50
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-eqz v4, :cond_1

    .line 65
    .line 66
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;

    .line 71
    .line 72
    invoke-static {v4}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4000(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-nez v5, :cond_3

    .line 77
    .line 78
    invoke-static {v4}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$500(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Bitmap;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    if-nez v4, :cond_2

    .line 83
    .line 84
    :cond_3
    move v1, v2

    .line 85
    goto :goto_0

    .line 86
    :cond_4
    return v1

    .line 87
    :cond_5
    return v2
.end method

.method private limitedSCenter(FFFLandroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 3

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateForSCenter(FFF)Landroid/graphics/PointF;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    sub-int/2addr v0, v1

    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    sub-int/2addr v0, v1

    .line 23
    div-int/lit8 v0, v0, 0x2

    .line 24
    .line 25
    add-int/2addr v0, p2

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    sub-int/2addr v1, v2

    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    sub-int/2addr v1, p0

    .line 44
    div-int/lit8 v1, v1, 0x2

    .line 45
    .line 46
    add-int/2addr v1, p2

    .line 47
    int-to-float p0, v0

    .line 48
    iget p2, p1, Landroid/graphics/PointF;->x:F

    .line 49
    .line 50
    sub-float/2addr p0, p2

    .line 51
    div-float/2addr p0, p3

    .line 52
    int-to-float p2, v1

    .line 53
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 54
    .line 55
    sub-float/2addr p2, p1

    .line 56
    div-float/2addr p2, p3

    .line 57
    invoke-virtual {p4, p0, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 58
    .line 59
    .line 60
    return-object p4
.end method

.method private limitedScale(F)F
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->minScale()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxScale:F

    .line 10
    .line 11
    invoke-static {p0, p1}, Ljava/lang/Math;->min(FF)F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method private minScale()F
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v1, v0

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/2addr v2, v0

    .line 19
    iget v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->minimumScaleType:I

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    if-eq v0, v3, :cond_2

    .line 23
    .line 24
    const/4 v3, 0x4

    .line 25
    if-ne v0, v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v3, 0x3

    .line 29
    if-ne v0, v3, :cond_1

    .line 30
    .line 31
    iget v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->minScale:F

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    cmpl-float v3, v0, v3

    .line 35
    .line 36
    if-lez v3, :cond_1

    .line 37
    .line 38
    return v0

    .line 39
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    sub-int/2addr v0, v2

    .line 44
    int-to-float v0, v0

    .line 45
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    int-to-float v2, v2

    .line 50
    div-float/2addr v0, v2

    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    sub-int/2addr v2, v1

    .line 56
    int-to-float v1, v2

    .line 57
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight()I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    int-to-float p0, p0

    .line 62
    div-float/2addr v1, p0

    .line 63
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    return p0

    .line 68
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    sub-int/2addr v0, v2

    .line 73
    int-to-float v0, v0

    .line 74
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    int-to-float v2, v2

    .line 79
    div-float/2addr v0, v2

    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    sub-int/2addr v2, v1

    .line 85
    int-to-float v1, v2

    .line 86
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight()I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    int-to-float p0, p0

    .line 91
    div-float/2addr v1, p0

    .line 92
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    return p0
.end method

.method private declared-synchronized onImageLoaded(Landroid/graphics/Bitmap;IZ)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "onImageLoaded"

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    new-array v2, v1, [Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0, v0, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth:I

    .line 11
    .line 12
    if-lez v0, :cond_1

    .line 13
    .line 14
    iget v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight:I

    .line 15
    .line 16
    if-lez v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-ne v0, v2, :cond_0

    .line 23
    .line 24
    iget v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight:I

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eq v0, v2, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    :goto_0
    invoke-direct {p0, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->reset(Z)V

    .line 36
    .line 37
    .line 38
    :cond_1
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmap:Landroid/graphics/Bitmap;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    iget-boolean v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapIsCached:Z

    .line 43
    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 47
    .line 48
    .line 49
    :cond_2
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmap:Landroid/graphics/Bitmap;

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    iget-boolean v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapIsCached:Z

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onImageEventListener:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnImageEventListener;

    .line 58
    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    invoke-interface {v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnImageEventListener;->onPreviewReleased()V

    .line 62
    .line 63
    .line 64
    :cond_3
    iput-boolean v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapIsPreview:Z

    .line 65
    .line 66
    iput-boolean p3, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapIsCached:Z

    .line 67
    .line 68
    iput-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmap:Landroid/graphics/Bitmap;

    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    iput p3, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth:I

    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    iput p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight:I

    .line 81
    .line 82
    iput p2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sOrientation:I

    .line 83
    .line 84
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->checkReady()Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->checkImageLoaded()Z

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    if-nez p1, :cond_4

    .line 93
    .line 94
    if-eqz p2, :cond_5

    .line 95
    .line 96
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    .line 101
    .line 102
    :cond_5
    monitor-exit p0

    .line 103
    return-void

    .line 104
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    throw p1
.end method

.method private declared-synchronized onPreviewLoaded(Landroid/graphics/Bitmap;)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "onPreviewLoaded"

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    new-array v1, v1, [Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0, v0, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmap:Landroid/graphics/Bitmap;

    .line 11
    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    iget-boolean v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->imageLoadedSent:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->pRegion:Landroid/graphics/Rect;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 24
    .line 25
    iget v2, v0, Landroid/graphics/Rect;->top:I

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-object v3, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->pRegion:Landroid/graphics/Rect;

    .line 32
    .line 33
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-static {p1, v1, v2, v0, v3}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmap:Landroid/graphics/Bitmap;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    iput-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmap:Landroid/graphics/Bitmap;

    .line 47
    .line 48
    :goto_0
    const/4 p1, 0x1

    .line 49
    iput-boolean p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapIsPreview:Z

    .line 50
    .line 51
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->checkReady()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    .line 63
    :cond_2
    monitor-exit p0

    .line 64
    return-void

    .line 65
    :cond_3
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    .line 68
    monitor-exit p0

    .line 69
    return-void

    .line 70
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    throw p1
.end method

.method private declared-synchronized onTileLoaded()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "onTileLoaded"

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    new-array v2, v1, [Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0, v0, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->checkReady()Z

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->checkImageLoaded()Z

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isBaseLayerReady()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmap:Landroid/graphics/Bitmap;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-boolean v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapIsCached:Z

    .line 27
    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmap:Landroid/graphics/Bitmap;

    .line 38
    .line 39
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onImageEventListener:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnImageEventListener;

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    iget-boolean v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapIsCached:Z

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    invoke-interface {v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnImageEventListener;->onPreviewReleased()V

    .line 48
    .line 49
    .line 50
    :cond_1
    iput-boolean v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapIsPreview:Z

    .line 51
    .line 52
    iput-boolean v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapIsCached:Z

    .line 53
    .line 54
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    monitor-exit p0

    .line 58
    return-void

    .line 59
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    throw v0
.end method

.method private declared-synchronized onTilesInited(Lcom/davemorrissey/labs/subscaleview/decoder/ImageRegionDecoder;III)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "onTilesInited sWidth=%d, sHeight=%d, sOrientation=%d"

    .line 3
    .line 4
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iget v3, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->orientation:I

    .line 13
    .line 14
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-direct {p0, v0, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth:I

    .line 26
    .line 27
    if-lez v0, :cond_3

    .line 28
    .line 29
    iget v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight:I

    .line 30
    .line 31
    if-lez v1, :cond_3

    .line 32
    .line 33
    if-ne v0, p2, :cond_0

    .line 34
    .line 35
    if-eq v1, p3, :cond_3

    .line 36
    .line 37
    :cond_0
    const/4 v0, 0x0

    .line 38
    invoke-direct {p0, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->reset(Z)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmap:Landroid/graphics/Bitmap;

    .line 42
    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    iget-boolean v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapIsCached:Z

    .line 46
    .line 47
    if-nez v2, :cond_1

    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 56
    iput-object v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmap:Landroid/graphics/Bitmap;

    .line 57
    .line 58
    iget-object v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onImageEventListener:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnImageEventListener;

    .line 59
    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    iget-boolean v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapIsCached:Z

    .line 63
    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    invoke-interface {v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnImageEventListener;->onPreviewReleased()V

    .line 67
    .line 68
    .line 69
    :cond_2
    iput-boolean v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapIsPreview:Z

    .line 70
    .line 71
    iput-boolean v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapIsCached:Z

    .line 72
    .line 73
    :cond_3
    iput-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->decoder:Lcom/davemorrissey/labs/subscaleview/decoder/ImageRegionDecoder;

    .line 74
    .line 75
    iput p2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth:I

    .line 76
    .line 77
    iput p3, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight:I

    .line 78
    .line 79
    iput p4, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sOrientation:I

    .line 80
    .line 81
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->checkReady()Z

    .line 82
    .line 83
    .line 84
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->checkImageLoaded()Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-nez p1, :cond_4

    .line 89
    .line 90
    iget p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxTileWidth:I

    .line 91
    .line 92
    if-lez p1, :cond_4

    .line 93
    .line 94
    const p2, 0x7fffffff

    .line 95
    .line 96
    .line 97
    if-eq p1, p2, :cond_4

    .line 98
    .line 99
    iget p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxTileHeight:I

    .line 100
    .line 101
    if-lez p1, :cond_4

    .line 102
    .line 103
    if-eq p1, p2, :cond_4

    .line 104
    .line 105
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-lez p1, :cond_4

    .line 110
    .line 111
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-lez p1, :cond_4

    .line 116
    .line 117
    new-instance p1, Landroid/graphics/Point;

    .line 118
    .line 119
    iget p2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxTileWidth:I

    .line 120
    .line 121
    iget p3, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxTileHeight:I

    .line 122
    .line 123
    invoke-direct {p1, p2, p3}, Landroid/graphics/Point;-><init>(II)V

    .line 124
    .line 125
    .line 126
    invoke-direct {p0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->initialiseBaseLayer(Landroid/graphics/Point;)V

    .line 127
    .line 128
    .line 129
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    .line 134
    .line 135
    monitor-exit p0

    .line 136
    return-void

    .line 137
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 138
    throw p1
.end method

.method private onTouchEventInternal(Landroid/view/MotionEvent;)Z
    .locals 11

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/high16 v2, 0x40000000    # 2.0f

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x1

    .line 14
    if-eqz v1, :cond_29

    .line 15
    .line 16
    if-eq v1, v5, :cond_20

    .line 17
    .line 18
    if-eq v1, v3, :cond_0

    .line 19
    .line 20
    const/4 v6, 0x5

    .line 21
    if-eq v1, v6, :cond_29

    .line 22
    .line 23
    const/4 v6, 0x6

    .line 24
    if-eq v1, v6, :cond_20

    .line 25
    .line 26
    const/16 v6, 0x105

    .line 27
    .line 28
    if-eq v1, v6, :cond_29

    .line 29
    .line 30
    const/16 v2, 0x106

    .line 31
    .line 32
    if-eq v1, v2, :cond_20

    .line 33
    .line 34
    goto/16 :goto_a

    .line 35
    .line 36
    :cond_0
    iget v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxTouchCount:I

    .line 37
    .line 38
    if-lez v1, :cond_1f

    .line 39
    .line 40
    const/high16 v1, 0x40a00000    # 5.0f

    .line 41
    .line 42
    if-lt v0, v3, :cond_8

    .line 43
    .line 44
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getX(I)F

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getY(I)F

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    invoke-direct {p0, v0, v6, v7, v8}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->distance(FFFF)F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getX(I)F

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    add-float/2addr v7, v6

    .line 73
    div-float/2addr v7, v2

    .line 74
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getY(I)F

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    add-float/2addr p1, v6

    .line 83
    div-float/2addr p1, v2

    .line 84
    iget-boolean v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->zoomEnabled:Z

    .line 85
    .line 86
    if-eqz v2, :cond_1f

    .line 87
    .line 88
    iget-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vCenterStart:Landroid/graphics/PointF;

    .line 89
    .line 90
    iget v6, v2, Landroid/graphics/PointF;->x:F

    .line 91
    .line 92
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 93
    .line 94
    invoke-direct {p0, v6, v7, v2, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->distance(FFFF)F

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    cmpl-float v2, v2, v1

    .line 99
    .line 100
    if-gtz v2, :cond_1

    .line 101
    .line 102
    iget v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vDistStart:F

    .line 103
    .line 104
    sub-float v2, v0, v2

    .line 105
    .line 106
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    cmpl-float v1, v2, v1

    .line 111
    .line 112
    if-gtz v1, :cond_1

    .line 113
    .line 114
    iget-boolean v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isPanning:Z

    .line 115
    .line 116
    if-eqz v1, :cond_1f

    .line 117
    .line 118
    :cond_1
    iput-boolean v5, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isZooming:Z

    .line 119
    .line 120
    iput-boolean v5, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isPanning:Z

    .line 121
    .line 122
    iget v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 123
    .line 124
    float-to-double v1, v1

    .line 125
    iget v4, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxScale:F

    .line 126
    .line 127
    iget v6, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vDistStart:F

    .line 128
    .line 129
    div-float v6, v0, v6

    .line 130
    .line 131
    iget v8, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scaleStart:F

    .line 132
    .line 133
    mul-float/2addr v6, v8

    .line 134
    invoke-static {v4, v6}, Ljava/lang/Math;->min(FF)F

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    iput v4, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 139
    .line 140
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->minScale()F

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    cmpg-float v4, v4, v6

    .line 145
    .line 146
    if-gtz v4, :cond_2

    .line 147
    .line 148
    iput v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vDistStart:F

    .line 149
    .line 150
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->minScale()F

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    iput v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scaleStart:F

    .line 155
    .line 156
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vCenterStart:Landroid/graphics/PointF;

    .line 157
    .line 158
    invoke-virtual {v0, v7, p1}, Landroid/graphics/PointF;->set(FF)V

    .line 159
    .line 160
    .line 161
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateStart:Landroid/graphics/PointF;

    .line 162
    .line 163
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 164
    .line 165
    invoke-virtual {p1, v0}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :cond_2
    iget-boolean v4, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->panEnabled:Z

    .line 171
    .line 172
    if-eqz v4, :cond_5

    .line 173
    .line 174
    iget-object v3, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vCenterStart:Landroid/graphics/PointF;

    .line 175
    .line 176
    iget v4, v3, Landroid/graphics/PointF;->x:F

    .line 177
    .line 178
    iget-object v6, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateStart:Landroid/graphics/PointF;

    .line 179
    .line 180
    iget v8, v6, Landroid/graphics/PointF;->x:F

    .line 181
    .line 182
    sub-float/2addr v4, v8

    .line 183
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 184
    .line 185
    iget v6, v6, Landroid/graphics/PointF;->y:F

    .line 186
    .line 187
    sub-float/2addr v3, v6

    .line 188
    iget v6, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 189
    .line 190
    iget v8, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scaleStart:F

    .line 191
    .line 192
    div-float v9, v6, v8

    .line 193
    .line 194
    mul-float/2addr v9, v4

    .line 195
    div-float/2addr v6, v8

    .line 196
    mul-float/2addr v6, v3

    .line 197
    iget-object v3, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 198
    .line 199
    sub-float v4, v7, v9

    .line 200
    .line 201
    iput v4, v3, Landroid/graphics/PointF;->x:F

    .line 202
    .line 203
    sub-float v4, p1, v6

    .line 204
    .line 205
    iput v4, v3, Landroid/graphics/PointF;->y:F

    .line 206
    .line 207
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight()I

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    int-to-double v3, v3

    .line 212
    mul-double/2addr v3, v1

    .line 213
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 214
    .line 215
    .line 216
    move-result v6

    .line 217
    int-to-double v8, v6

    .line 218
    cmpg-double v3, v3, v8

    .line 219
    .line 220
    if-gez v3, :cond_3

    .line 221
    .line 222
    iget v3, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 223
    .line 224
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight()I

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    int-to-float v4, v4

    .line 229
    mul-float/2addr v3, v4

    .line 230
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    int-to-float v4, v4

    .line 235
    cmpl-float v3, v3, v4

    .line 236
    .line 237
    if-gez v3, :cond_4

    .line 238
    .line 239
    :cond_3
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth()I

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    int-to-double v3, v3

    .line 244
    mul-double/2addr v1, v3

    .line 245
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    int-to-double v3, v3

    .line 250
    cmpg-double v1, v1, v3

    .line 251
    .line 252
    if-gez v1, :cond_7

    .line 253
    .line 254
    iget v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 255
    .line 256
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth()I

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    int-to-float v2, v2

    .line 261
    mul-float/2addr v1, v2

    .line 262
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    int-to-float v2, v2

    .line 267
    cmpl-float v1, v1, v2

    .line 268
    .line 269
    if-ltz v1, :cond_7

    .line 270
    .line 271
    :cond_4
    invoke-direct {p0, v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fitToBounds(Z)V

    .line 272
    .line 273
    .line 274
    iget-object v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vCenterStart:Landroid/graphics/PointF;

    .line 275
    .line 276
    invoke-virtual {v1, v7, p1}, Landroid/graphics/PointF;->set(FF)V

    .line 277
    .line 278
    .line 279
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateStart:Landroid/graphics/PointF;

    .line 280
    .line 281
    iget-object v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 282
    .line 283
    invoke-virtual {p1, v1}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 284
    .line 285
    .line 286
    iget p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 287
    .line 288
    iput p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scaleStart:F

    .line 289
    .line 290
    iput v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vDistStart:F

    .line 291
    .line 292
    goto :goto_0

    .line 293
    :cond_5
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sRequestedCenter:Landroid/graphics/PointF;

    .line 294
    .line 295
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 296
    .line 297
    if-eqz p1, :cond_6

    .line 298
    .line 299
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 300
    .line 301
    .line 302
    move-result p1

    .line 303
    div-int/2addr p1, v3

    .line 304
    int-to-float p1, p1

    .line 305
    iget v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 306
    .line 307
    iget-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sRequestedCenter:Landroid/graphics/PointF;

    .line 308
    .line 309
    iget v2, v2, Landroid/graphics/PointF;->x:F

    .line 310
    .line 311
    mul-float/2addr v1, v2

    .line 312
    sub-float/2addr p1, v1

    .line 313
    iput p1, v0, Landroid/graphics/PointF;->x:F

    .line 314
    .line 315
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 316
    .line 317
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    div-int/2addr v0, v3

    .line 322
    int-to-float v0, v0

    .line 323
    iget v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 324
    .line 325
    iget-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sRequestedCenter:Landroid/graphics/PointF;

    .line 326
    .line 327
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 328
    .line 329
    mul-float/2addr v1, v2

    .line 330
    sub-float/2addr v0, v1

    .line 331
    iput v0, p1, Landroid/graphics/PointF;->y:F

    .line 332
    .line 333
    goto :goto_0

    .line 334
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 335
    .line 336
    .line 337
    move-result p1

    .line 338
    div-int/2addr p1, v3

    .line 339
    int-to-float p1, p1

    .line 340
    iget v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 341
    .line 342
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth()I

    .line 343
    .line 344
    .line 345
    move-result v2

    .line 346
    div-int/2addr v2, v3

    .line 347
    int-to-float v2, v2

    .line 348
    mul-float/2addr v1, v2

    .line 349
    sub-float/2addr p1, v1

    .line 350
    iput p1, v0, Landroid/graphics/PointF;->x:F

    .line 351
    .line 352
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 353
    .line 354
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    div-int/2addr v0, v3

    .line 359
    int-to-float v0, v0

    .line 360
    iget v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 361
    .line 362
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight()I

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    div-int/2addr v2, v3

    .line 367
    int-to-float v2, v2

    .line 368
    mul-float/2addr v1, v2

    .line 369
    sub-float/2addr v0, v1

    .line 370
    iput v0, p1, Landroid/graphics/PointF;->y:F

    .line 371
    .line 372
    :cond_7
    :goto_0
    invoke-direct {p0, v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fitToBounds(Z)V

    .line 373
    .line 374
    .line 375
    iget-boolean p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->eagerLoadingEnabled:Z

    .line 376
    .line 377
    invoke-direct {p0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->refreshRequiredTiles(Z)V

    .line 378
    .line 379
    .line 380
    goto/16 :goto_9

    .line 381
    .line 382
    :cond_8
    iget-boolean v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isQuickScaling:Z

    .line 383
    .line 384
    if-eqz v0, :cond_13

    .line 385
    .line 386
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleVStart:Landroid/graphics/PointF;

    .line 387
    .line 388
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 389
    .line 390
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 391
    .line 392
    .line 393
    move-result v1

    .line 394
    sub-float/2addr v0, v1

    .line 395
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    mul-float/2addr v0, v2

    .line 400
    iget v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleThreshold:F

    .line 401
    .line 402
    add-float/2addr v0, v1

    .line 403
    iget v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleLastDistance:F

    .line 404
    .line 405
    const/high16 v2, -0x40800000    # -1.0f

    .line 406
    .line 407
    cmpl-float v1, v1, v2

    .line 408
    .line 409
    if-nez v1, :cond_9

    .line 410
    .line 411
    iput v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleLastDistance:F

    .line 412
    .line 413
    :cond_9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 414
    .line 415
    .line 416
    move-result v1

    .line 417
    iget-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleVLastPoint:Landroid/graphics/PointF;

    .line 418
    .line 419
    iget v6, v2, Landroid/graphics/PointF;->y:F

    .line 420
    .line 421
    cmpl-float v1, v1, v6

    .line 422
    .line 423
    if-lez v1, :cond_a

    .line 424
    .line 425
    move v4, v5

    .line 426
    :cond_a
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 427
    .line 428
    .line 429
    move-result p1

    .line 430
    const/4 v1, 0x0

    .line 431
    invoke-virtual {v2, v1, p1}, Landroid/graphics/PointF;->set(FF)V

    .line 432
    .line 433
    .line 434
    iget p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleLastDistance:F

    .line 435
    .line 436
    div-float p1, v0, p1

    .line 437
    .line 438
    const/high16 v2, 0x3f800000    # 1.0f

    .line 439
    .line 440
    sub-float p1, v2, p1

    .line 441
    .line 442
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 443
    .line 444
    .line 445
    move-result p1

    .line 446
    const/high16 v6, 0x3f000000    # 0.5f

    .line 447
    .line 448
    mul-float/2addr p1, v6

    .line 449
    const v6, 0x3cf5c28f    # 0.03f

    .line 450
    .line 451
    .line 452
    cmpl-float v6, p1, v6

    .line 453
    .line 454
    if-gtz v6, :cond_b

    .line 455
    .line 456
    iget-boolean v6, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleMoved:Z

    .line 457
    .line 458
    if-eqz v6, :cond_12

    .line 459
    .line 460
    :cond_b
    iput-boolean v5, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleMoved:Z

    .line 461
    .line 462
    iget v6, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleLastDistance:F

    .line 463
    .line 464
    cmpl-float v6, v6, v1

    .line 465
    .line 466
    if-lez v6, :cond_d

    .line 467
    .line 468
    if-eqz v4, :cond_c

    .line 469
    .line 470
    add-float/2addr p1, v2

    .line 471
    move v2, p1

    .line 472
    goto :goto_1

    .line 473
    :cond_c
    sub-float/2addr v2, p1

    .line 474
    :cond_d
    :goto_1
    iget p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 475
    .line 476
    float-to-double v6, p1

    .line 477
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->minScale()F

    .line 478
    .line 479
    .line 480
    move-result p1

    .line 481
    iget v4, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxScale:F

    .line 482
    .line 483
    iget v8, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 484
    .line 485
    mul-float/2addr v8, v2

    .line 486
    invoke-static {v4, v8}, Ljava/lang/Math;->min(FF)F

    .line 487
    .line 488
    .line 489
    move-result v2

    .line 490
    invoke-static {p1, v2}, Ljava/lang/Math;->max(FF)F

    .line 491
    .line 492
    .line 493
    move-result p1

    .line 494
    iput p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 495
    .line 496
    iget-boolean v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->panEnabled:Z

    .line 497
    .line 498
    if-eqz v2, :cond_10

    .line 499
    .line 500
    iget-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vCenterStart:Landroid/graphics/PointF;

    .line 501
    .line 502
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 503
    .line 504
    iget-object v4, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateStart:Landroid/graphics/PointF;

    .line 505
    .line 506
    iget v8, v4, Landroid/graphics/PointF;->x:F

    .line 507
    .line 508
    sub-float v8, v3, v8

    .line 509
    .line 510
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 511
    .line 512
    iget v4, v4, Landroid/graphics/PointF;->y:F

    .line 513
    .line 514
    sub-float v4, v2, v4

    .line 515
    .line 516
    iget v9, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scaleStart:F

    .line 517
    .line 518
    div-float v10, p1, v9

    .line 519
    .line 520
    mul-float/2addr v10, v8

    .line 521
    div-float/2addr p1, v9

    .line 522
    mul-float/2addr p1, v4

    .line 523
    iget-object v4, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 524
    .line 525
    sub-float/2addr v3, v10

    .line 526
    iput v3, v4, Landroid/graphics/PointF;->x:F

    .line 527
    .line 528
    sub-float/2addr v2, p1

    .line 529
    iput v2, v4, Landroid/graphics/PointF;->y:F

    .line 530
    .line 531
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight()I

    .line 532
    .line 533
    .line 534
    move-result p1

    .line 535
    int-to-double v2, p1

    .line 536
    mul-double/2addr v2, v6

    .line 537
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 538
    .line 539
    .line 540
    move-result p1

    .line 541
    int-to-double v8, p1

    .line 542
    cmpg-double p1, v2, v8

    .line 543
    .line 544
    if-gez p1, :cond_e

    .line 545
    .line 546
    iget p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 547
    .line 548
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight()I

    .line 549
    .line 550
    .line 551
    move-result v2

    .line 552
    int-to-float v2, v2

    .line 553
    mul-float/2addr p1, v2

    .line 554
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 555
    .line 556
    .line 557
    move-result v2

    .line 558
    int-to-float v2, v2

    .line 559
    cmpl-float p1, p1, v2

    .line 560
    .line 561
    if-gez p1, :cond_f

    .line 562
    .line 563
    :cond_e
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth()I

    .line 564
    .line 565
    .line 566
    move-result p1

    .line 567
    int-to-double v2, p1

    .line 568
    mul-double/2addr v6, v2

    .line 569
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 570
    .line 571
    .line 572
    move-result p1

    .line 573
    int-to-double v2, p1

    .line 574
    cmpg-double p1, v6, v2

    .line 575
    .line 576
    if-gez p1, :cond_12

    .line 577
    .line 578
    iget p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 579
    .line 580
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth()I

    .line 581
    .line 582
    .line 583
    move-result v2

    .line 584
    int-to-float v2, v2

    .line 585
    mul-float/2addr p1, v2

    .line 586
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 587
    .line 588
    .line 589
    move-result v2

    .line 590
    int-to-float v2, v2

    .line 591
    cmpl-float p1, p1, v2

    .line 592
    .line 593
    if-ltz p1, :cond_12

    .line 594
    .line 595
    :cond_f
    invoke-direct {p0, v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fitToBounds(Z)V

    .line 596
    .line 597
    .line 598
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vCenterStart:Landroid/graphics/PointF;

    .line 599
    .line 600
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleSCenter:Landroid/graphics/PointF;

    .line 601
    .line 602
    invoke-virtual {p0, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sourceToViewCoord(Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    invoke-virtual {p1, v0}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 607
    .line 608
    .line 609
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateStart:Landroid/graphics/PointF;

    .line 610
    .line 611
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 612
    .line 613
    invoke-virtual {p1, v0}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 614
    .line 615
    .line 616
    iget p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 617
    .line 618
    iput p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scaleStart:F

    .line 619
    .line 620
    move v0, v1

    .line 621
    goto :goto_2

    .line 622
    :cond_10
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sRequestedCenter:Landroid/graphics/PointF;

    .line 623
    .line 624
    iget-object v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 625
    .line 626
    if-eqz p1, :cond_11

    .line 627
    .line 628
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 629
    .line 630
    .line 631
    move-result p1

    .line 632
    div-int/2addr p1, v3

    .line 633
    int-to-float p1, p1

    .line 634
    iget v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 635
    .line 636
    iget-object v4, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sRequestedCenter:Landroid/graphics/PointF;

    .line 637
    .line 638
    iget v4, v4, Landroid/graphics/PointF;->x:F

    .line 639
    .line 640
    mul-float/2addr v2, v4

    .line 641
    sub-float/2addr p1, v2

    .line 642
    iput p1, v1, Landroid/graphics/PointF;->x:F

    .line 643
    .line 644
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 645
    .line 646
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 647
    .line 648
    .line 649
    move-result v1

    .line 650
    div-int/2addr v1, v3

    .line 651
    int-to-float v1, v1

    .line 652
    iget v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 653
    .line 654
    iget-object v3, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sRequestedCenter:Landroid/graphics/PointF;

    .line 655
    .line 656
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 657
    .line 658
    mul-float/2addr v2, v3

    .line 659
    sub-float/2addr v1, v2

    .line 660
    iput v1, p1, Landroid/graphics/PointF;->y:F

    .line 661
    .line 662
    goto :goto_2

    .line 663
    :cond_11
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 664
    .line 665
    .line 666
    move-result p1

    .line 667
    div-int/2addr p1, v3

    .line 668
    int-to-float p1, p1

    .line 669
    iget v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 670
    .line 671
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth()I

    .line 672
    .line 673
    .line 674
    move-result v4

    .line 675
    div-int/2addr v4, v3

    .line 676
    int-to-float v4, v4

    .line 677
    mul-float/2addr v2, v4

    .line 678
    sub-float/2addr p1, v2

    .line 679
    iput p1, v1, Landroid/graphics/PointF;->x:F

    .line 680
    .line 681
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 682
    .line 683
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 684
    .line 685
    .line 686
    move-result v1

    .line 687
    div-int/2addr v1, v3

    .line 688
    int-to-float v1, v1

    .line 689
    iget v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 690
    .line 691
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight()I

    .line 692
    .line 693
    .line 694
    move-result v4

    .line 695
    div-int/2addr v4, v3

    .line 696
    int-to-float v3, v4

    .line 697
    mul-float/2addr v2, v3

    .line 698
    sub-float/2addr v1, v2

    .line 699
    iput v1, p1, Landroid/graphics/PointF;->y:F

    .line 700
    .line 701
    :cond_12
    :goto_2
    iput v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleLastDistance:F

    .line 702
    .line 703
    invoke-direct {p0, v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fitToBounds(Z)V

    .line 704
    .line 705
    .line 706
    iget-boolean p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->eagerLoadingEnabled:Z

    .line 707
    .line 708
    invoke-direct {p0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->refreshRequiredTiles(Z)V

    .line 709
    .line 710
    .line 711
    goto/16 :goto_9

    .line 712
    .line 713
    :cond_13
    iget-boolean v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isZooming:Z

    .line 714
    .line 715
    if-nez v0, :cond_1f

    .line 716
    .line 717
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 718
    .line 719
    .line 720
    move-result v0

    .line 721
    iget-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vCenterStart:Landroid/graphics/PointF;

    .line 722
    .line 723
    iget v2, v2, Landroid/graphics/PointF;->x:F

    .line 724
    .line 725
    sub-float/2addr v0, v2

    .line 726
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 727
    .line 728
    .line 729
    move-result v0

    .line 730
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 731
    .line 732
    .line 733
    move-result v2

    .line 734
    iget-object v3, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vCenterStart:Landroid/graphics/PointF;

    .line 735
    .line 736
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 737
    .line 738
    sub-float/2addr v2, v3

    .line 739
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 740
    .line 741
    .line 742
    move-result v2

    .line 743
    iget v3, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->density:F

    .line 744
    .line 745
    mul-float/2addr v3, v1

    .line 746
    cmpl-float v1, v0, v3

    .line 747
    .line 748
    if-gtz v1, :cond_14

    .line 749
    .line 750
    cmpl-float v6, v2, v3

    .line 751
    .line 752
    if-gtz v6, :cond_14

    .line 753
    .line 754
    iget-boolean v6, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isPanning:Z

    .line 755
    .line 756
    if-eqz v6, :cond_1f

    .line 757
    .line 758
    :cond_14
    iget-object v6, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 759
    .line 760
    iget-object v7, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateStart:Landroid/graphics/PointF;

    .line 761
    .line 762
    iget v7, v7, Landroid/graphics/PointF;->x:F

    .line 763
    .line 764
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 765
    .line 766
    .line 767
    move-result v8

    .line 768
    iget-object v9, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vCenterStart:Landroid/graphics/PointF;

    .line 769
    .line 770
    iget v9, v9, Landroid/graphics/PointF;->x:F

    .line 771
    .line 772
    sub-float/2addr v8, v9

    .line 773
    add-float/2addr v8, v7

    .line 774
    iput v8, v6, Landroid/graphics/PointF;->x:F

    .line 775
    .line 776
    iget-object v6, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 777
    .line 778
    iget-object v7, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateStart:Landroid/graphics/PointF;

    .line 779
    .line 780
    iget v7, v7, Landroid/graphics/PointF;->y:F

    .line 781
    .line 782
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 783
    .line 784
    .line 785
    move-result p1

    .line 786
    iget-object v8, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vCenterStart:Landroid/graphics/PointF;

    .line 787
    .line 788
    iget v8, v8, Landroid/graphics/PointF;->y:F

    .line 789
    .line 790
    sub-float/2addr p1, v8

    .line 791
    add-float/2addr p1, v7

    .line 792
    iput p1, v6, Landroid/graphics/PointF;->y:F

    .line 793
    .line 794
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 795
    .line 796
    iget v6, p1, Landroid/graphics/PointF;->x:F

    .line 797
    .line 798
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 799
    .line 800
    invoke-direct {p0, v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fitToBounds(Z)V

    .line 801
    .line 802
    .line 803
    iget-object v7, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 804
    .line 805
    iget v8, v7, Landroid/graphics/PointF;->x:F

    .line 806
    .line 807
    cmpl-float v6, v6, v8

    .line 808
    .line 809
    if-eqz v6, :cond_15

    .line 810
    .line 811
    move v6, v5

    .line 812
    goto :goto_3

    .line 813
    :cond_15
    move v6, v4

    .line 814
    :goto_3
    iget v7, v7, Landroid/graphics/PointF;->y:F

    .line 815
    .line 816
    cmpl-float v8, p1, v7

    .line 817
    .line 818
    if-eqz v8, :cond_16

    .line 819
    .line 820
    move v8, v5

    .line 821
    goto :goto_4

    .line 822
    :cond_16
    move v8, v4

    .line 823
    :goto_4
    if-eqz v6, :cond_17

    .line 824
    .line 825
    cmpl-float v9, v0, v2

    .line 826
    .line 827
    if-lez v9, :cond_17

    .line 828
    .line 829
    iget-boolean v9, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isPanning:Z

    .line 830
    .line 831
    if-nez v9, :cond_17

    .line 832
    .line 833
    move v9, v5

    .line 834
    goto :goto_5

    .line 835
    :cond_17
    move v9, v4

    .line 836
    :goto_5
    if-eqz v8, :cond_18

    .line 837
    .line 838
    cmpl-float v0, v2, v0

    .line 839
    .line 840
    if-lez v0, :cond_18

    .line 841
    .line 842
    iget-boolean v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isPanning:Z

    .line 843
    .line 844
    if-nez v0, :cond_18

    .line 845
    .line 846
    move v0, v5

    .line 847
    goto :goto_6

    .line 848
    :cond_18
    move v0, v4

    .line 849
    :goto_6
    cmpl-float p1, p1, v7

    .line 850
    .line 851
    if-nez p1, :cond_19

    .line 852
    .line 853
    const/high16 p1, 0x40400000    # 3.0f

    .line 854
    .line 855
    mul-float/2addr p1, v3

    .line 856
    cmpl-float p1, v2, p1

    .line 857
    .line 858
    if-lez p1, :cond_19

    .line 859
    .line 860
    move p1, v5

    .line 861
    goto :goto_7

    .line 862
    :cond_19
    move p1, v4

    .line 863
    :goto_7
    if-nez v9, :cond_1b

    .line 864
    .line 865
    if-nez v0, :cond_1b

    .line 866
    .line 867
    if-eqz v6, :cond_1a

    .line 868
    .line 869
    if-eqz v8, :cond_1a

    .line 870
    .line 871
    if-nez p1, :cond_1a

    .line 872
    .line 873
    iget-boolean p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isPanning:Z

    .line 874
    .line 875
    if-eqz p1, :cond_1b

    .line 876
    .line 877
    :cond_1a
    iput-boolean v5, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isPanning:Z

    .line 878
    .line 879
    goto :goto_8

    .line 880
    :cond_1b
    if-gtz v1, :cond_1c

    .line 881
    .line 882
    cmpl-float p1, v2, v3

    .line 883
    .line 884
    if-lez p1, :cond_1d

    .line 885
    .line 886
    :cond_1c
    iput v4, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxTouchCount:I

    .line 887
    .line 888
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->handler:Landroid/os/Handler;

    .line 889
    .line 890
    invoke-virtual {p1, v5}, Landroid/os/Handler;->removeMessages(I)V

    .line 891
    .line 892
    .line 893
    invoke-direct {p0, v4}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->requestDisallowInterceptTouchEvent(Z)V

    .line 894
    .line 895
    .line 896
    :cond_1d
    :goto_8
    iget-boolean p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->panEnabled:Z

    .line 897
    .line 898
    if-nez p1, :cond_1e

    .line 899
    .line 900
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 901
    .line 902
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateStart:Landroid/graphics/PointF;

    .line 903
    .line 904
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 905
    .line 906
    iput v1, p1, Landroid/graphics/PointF;->x:F

    .line 907
    .line 908
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 909
    .line 910
    iput v0, p1, Landroid/graphics/PointF;->y:F

    .line 911
    .line 912
    invoke-direct {p0, v4}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->requestDisallowInterceptTouchEvent(Z)V

    .line 913
    .line 914
    .line 915
    :cond_1e
    iget-boolean p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->eagerLoadingEnabled:Z

    .line 916
    .line 917
    invoke-direct {p0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->refreshRequiredTiles(Z)V

    .line 918
    .line 919
    .line 920
    :goto_9
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->handler:Landroid/os/Handler;

    .line 921
    .line 922
    invoke-virtual {p1, v5}, Landroid/os/Handler;->removeMessages(I)V

    .line 923
    .line 924
    .line 925
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 926
    .line 927
    .line 928
    return v5

    .line 929
    :cond_1f
    :goto_a
    return v4

    .line 930
    :cond_20
    iget-object v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->handler:Landroid/os/Handler;

    .line 931
    .line 932
    invoke-virtual {v1, v5}, Landroid/os/Handler;->removeMessages(I)V

    .line 933
    .line 934
    .line 935
    iget-boolean v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isQuickScaling:Z

    .line 936
    .line 937
    if-eqz v1, :cond_21

    .line 938
    .line 939
    iput-boolean v4, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isQuickScaling:Z

    .line 940
    .line 941
    iget-boolean v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleMoved:Z

    .line 942
    .line 943
    if-nez v1, :cond_21

    .line 944
    .line 945
    iget-object v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleSCenter:Landroid/graphics/PointF;

    .line 946
    .line 947
    iget-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vCenterStart:Landroid/graphics/PointF;

    .line 948
    .line 949
    invoke-direct {p0, v1, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->doubleTapZoom(Landroid/graphics/PointF;Landroid/graphics/PointF;)V

    .line 950
    .line 951
    .line 952
    :cond_21
    iget v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxTouchCount:I

    .line 953
    .line 954
    if-lez v1, :cond_27

    .line 955
    .line 956
    iget-boolean v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isZooming:Z

    .line 957
    .line 958
    if-nez v1, :cond_22

    .line 959
    .line 960
    iget-boolean v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isPanning:Z

    .line 961
    .line 962
    if-eqz v2, :cond_27

    .line 963
    .line 964
    :cond_22
    if-eqz v1, :cond_24

    .line 965
    .line 966
    if-ne v0, v3, :cond_24

    .line 967
    .line 968
    iput-boolean v5, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isPanning:Z

    .line 969
    .line 970
    iget-object v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateStart:Landroid/graphics/PointF;

    .line 971
    .line 972
    iget-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 973
    .line 974
    iget v6, v2, Landroid/graphics/PointF;->x:F

    .line 975
    .line 976
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 977
    .line 978
    invoke-virtual {v1, v6, v2}, Landroid/graphics/PointF;->set(FF)V

    .line 979
    .line 980
    .line 981
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 982
    .line 983
    .line 984
    move-result v1

    .line 985
    iget-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vCenterStart:Landroid/graphics/PointF;

    .line 986
    .line 987
    if-ne v1, v5, :cond_23

    .line 988
    .line 989
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    .line 990
    .line 991
    .line 992
    move-result v1

    .line 993
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    .line 994
    .line 995
    .line 996
    move-result p1

    .line 997
    invoke-virtual {v2, v1, p1}, Landroid/graphics/PointF;->set(FF)V

    .line 998
    .line 999
    .line 1000
    goto :goto_b

    .line 1001
    :cond_23
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getX(I)F

    .line 1002
    .line 1003
    .line 1004
    move-result v1

    .line 1005
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getY(I)F

    .line 1006
    .line 1007
    .line 1008
    move-result p1

    .line 1009
    invoke-virtual {v2, v1, p1}, Landroid/graphics/PointF;->set(FF)V

    .line 1010
    .line 1011
    .line 1012
    :cond_24
    :goto_b
    const/4 p1, 0x3

    .line 1013
    if-ge v0, p1, :cond_25

    .line 1014
    .line 1015
    iput-boolean v4, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isZooming:Z

    .line 1016
    .line 1017
    :cond_25
    if-ge v0, v3, :cond_26

    .line 1018
    .line 1019
    iput-boolean v4, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isPanning:Z

    .line 1020
    .line 1021
    iput v4, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxTouchCount:I

    .line 1022
    .line 1023
    :cond_26
    invoke-direct {p0, v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->refreshRequiredTiles(Z)V

    .line 1024
    .line 1025
    .line 1026
    return v5

    .line 1027
    :cond_27
    if-ne v0, v5, :cond_28

    .line 1028
    .line 1029
    iput-boolean v4, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isZooming:Z

    .line 1030
    .line 1031
    iput-boolean v4, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isPanning:Z

    .line 1032
    .line 1033
    iput v4, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxTouchCount:I

    .line 1034
    .line 1035
    :cond_28
    return v5

    .line 1036
    :cond_29
    const/4 v1, 0x0

    .line 1037
    iput-object v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 1038
    .line 1039
    invoke-direct {p0, v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->requestDisallowInterceptTouchEvent(Z)V

    .line 1040
    .line 1041
    .line 1042
    iget v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxTouchCount:I

    .line 1043
    .line 1044
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 1045
    .line 1046
    .line 1047
    move-result v1

    .line 1048
    iput v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxTouchCount:I

    .line 1049
    .line 1050
    if-lt v0, v3, :cond_2b

    .line 1051
    .line 1052
    iget-boolean v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->zoomEnabled:Z

    .line 1053
    .line 1054
    if-eqz v0, :cond_2a

    .line 1055
    .line 1056
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    .line 1057
    .line 1058
    .line 1059
    move-result v0

    .line 1060
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getX(I)F

    .line 1061
    .line 1062
    .line 1063
    move-result v1

    .line 1064
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    .line 1065
    .line 1066
    .line 1067
    move-result v3

    .line 1068
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getY(I)F

    .line 1069
    .line 1070
    .line 1071
    move-result v6

    .line 1072
    invoke-direct {p0, v0, v1, v3, v6}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->distance(FFFF)F

    .line 1073
    .line 1074
    .line 1075
    move-result v0

    .line 1076
    iget v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 1077
    .line 1078
    iput v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scaleStart:F

    .line 1079
    .line 1080
    iput v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vDistStart:F

    .line 1081
    .line 1082
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateStart:Landroid/graphics/PointF;

    .line 1083
    .line 1084
    iget-object v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 1085
    .line 1086
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 1087
    .line 1088
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 1089
    .line 1090
    invoke-virtual {v0, v3, v1}, Landroid/graphics/PointF;->set(FF)V

    .line 1091
    .line 1092
    .line 1093
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vCenterStart:Landroid/graphics/PointF;

    .line 1094
    .line 1095
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    .line 1096
    .line 1097
    .line 1098
    move-result v1

    .line 1099
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getX(I)F

    .line 1100
    .line 1101
    .line 1102
    move-result v3

    .line 1103
    add-float/2addr v3, v1

    .line 1104
    div-float/2addr v3, v2

    .line 1105
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    .line 1106
    .line 1107
    .line 1108
    move-result v1

    .line 1109
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getY(I)F

    .line 1110
    .line 1111
    .line 1112
    move-result p1

    .line 1113
    add-float/2addr p1, v1

    .line 1114
    div-float/2addr p1, v2

    .line 1115
    invoke-virtual {v0, v3, p1}, Landroid/graphics/PointF;->set(FF)V

    .line 1116
    .line 1117
    .line 1118
    goto :goto_c

    .line 1119
    :cond_2a
    iput v4, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxTouchCount:I

    .line 1120
    .line 1121
    :goto_c
    iget-object p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->handler:Landroid/os/Handler;

    .line 1122
    .line 1123
    invoke-virtual {p0, v5}, Landroid/os/Handler;->removeMessages(I)V

    .line 1124
    .line 1125
    .line 1126
    goto :goto_d

    .line 1127
    :cond_2b
    iget-boolean v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isQuickScaling:Z

    .line 1128
    .line 1129
    if-nez v0, :cond_2c

    .line 1130
    .line 1131
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateStart:Landroid/graphics/PointF;

    .line 1132
    .line 1133
    iget-object v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 1134
    .line 1135
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 1136
    .line 1137
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 1138
    .line 1139
    invoke-virtual {v0, v2, v1}, Landroid/graphics/PointF;->set(FF)V

    .line 1140
    .line 1141
    .line 1142
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vCenterStart:Landroid/graphics/PointF;

    .line 1143
    .line 1144
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 1145
    .line 1146
    .line 1147
    move-result v1

    .line 1148
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 1149
    .line 1150
    .line 1151
    move-result p1

    .line 1152
    invoke-virtual {v0, v1, p1}, Landroid/graphics/PointF;->set(FF)V

    .line 1153
    .line 1154
    .line 1155
    iget-object p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->handler:Landroid/os/Handler;

    .line 1156
    .line 1157
    const-wide/16 v0, 0x258

    .line 1158
    .line 1159
    invoke-virtual {p0, v5, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1160
    .line 1161
    .line 1162
    :cond_2c
    :goto_d
    return v5
.end method

.method private preDraw()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    iget v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth:I

    .line 14
    .line 15
    if-lez v0, :cond_3

    .line 16
    .line 17
    iget v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight:I

    .line 18
    .line 19
    if-gtz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sPendingCenter:Landroid/graphics/PointF;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->pendingScale:Ljava/lang/Float;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iput v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 35
    .line 36
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 37
    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    new-instance v0, Landroid/graphics/PointF;

    .line 41
    .line 42
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 46
    .line 47
    :cond_1
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    div-int/lit8 v1, v1, 0x2

    .line 54
    .line 55
    int-to-float v1, v1

    .line 56
    iget v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 57
    .line 58
    iget-object v3, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sPendingCenter:Landroid/graphics/PointF;

    .line 59
    .line 60
    iget v3, v3, Landroid/graphics/PointF;->x:F

    .line 61
    .line 62
    mul-float/2addr v2, v3

    .line 63
    sub-float/2addr v1, v2

    .line 64
    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 65
    .line 66
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    div-int/lit8 v1, v1, 0x2

    .line 73
    .line 74
    int-to-float v1, v1

    .line 75
    iget v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 76
    .line 77
    iget-object v3, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sPendingCenter:Landroid/graphics/PointF;

    .line 78
    .line 79
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 80
    .line 81
    mul-float/2addr v2, v3

    .line 82
    sub-float/2addr v1, v2

    .line 83
    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 84
    .line 85
    const/4 v0, 0x0

    .line 86
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sPendingCenter:Landroid/graphics/PointF;

    .line 87
    .line 88
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->pendingScale:Ljava/lang/Float;

    .line 89
    .line 90
    const/4 v0, 0x1

    .line 91
    invoke-direct {p0, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fitToBounds(Z)V

    .line 92
    .line 93
    .line 94
    invoke-direct {p0, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->refreshRequiredTiles(Z)V

    .line 95
    .line 96
    .line 97
    :cond_2
    const/4 v0, 0x0

    .line 98
    invoke-direct {p0, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fitToBounds(Z)V

    .line 99
    .line 100
    .line 101
    :cond_3
    :goto_0
    return-void
.end method

.method private px(I)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->density:F

    .line 2
    .line 3
    int-to-float p1, p1

    .line 4
    mul-float/2addr p0, p1

    .line 5
    float-to-int p0, p0

    .line 6
    return p0
.end method

.method private refreshRequiredTiles(Z)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->decoder:Lcom/davemorrissey/labs/subscaleview/decoder/ImageRegionDecoder;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->tileMap:Ljava/util/Map;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    iget v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fullImageSampleSize:I

    .line 12
    .line 13
    iget v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 14
    .line 15
    invoke-direct {p0, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->calculateInSampleSize(F)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->tileMap:Ljava/util/Map;

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_7

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Ljava/util/Map$Entry;

    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_1

    .line 60
    .line 61
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;

    .line 66
    .line 67
    invoke-static {v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4300(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    const/4 v5, 0x0

    .line 72
    const/4 v6, 0x0

    .line 73
    if-lt v4, v0, :cond_3

    .line 74
    .line 75
    invoke-static {v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4300(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-le v4, v0, :cond_4

    .line 80
    .line 81
    invoke-static {v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4300(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    iget v7, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fullImageSampleSize:I

    .line 86
    .line 87
    if-eq v4, v7, :cond_4

    .line 88
    .line 89
    :cond_3
    invoke-static {v3, v6}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$402(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;Z)Z

    .line 90
    .line 91
    .line 92
    invoke-static {v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$500(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Bitmap;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    if-eqz v4, :cond_4

    .line 97
    .line 98
    invoke-static {v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$500(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Bitmap;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 103
    .line 104
    .line 105
    invoke-static {v3, v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$502(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 106
    .line 107
    .line 108
    :cond_4
    invoke-static {v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4300(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)I

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    const/4 v7, 0x1

    .line 113
    if-ne v4, v0, :cond_6

    .line 114
    .line 115
    invoke-direct {p0, v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->tileVisible(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-eqz v4, :cond_5

    .line 120
    .line 121
    invoke-static {v3, v7}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$402(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;Z)Z

    .line 122
    .line 123
    .line 124
    invoke-static {v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4000(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-nez v4, :cond_2

    .line 129
    .line 130
    invoke-static {v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$500(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Bitmap;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    if-nez v4, :cond_2

    .line 135
    .line 136
    if-eqz p1, :cond_2

    .line 137
    .line 138
    new-instance v4, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$TileLoadTask;

    .line 139
    .line 140
    iget-object v5, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->decoder:Lcom/davemorrissey/labs/subscaleview/decoder/ImageRegionDecoder;

    .line 141
    .line 142
    invoke-direct {v4, p0, v5, v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$TileLoadTask;-><init>(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Lcom/davemorrissey/labs/subscaleview/decoder/ImageRegionDecoder;Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)V

    .line 143
    .line 144
    .line 145
    invoke-direct {p0, v4}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->execute(Landroid/os/AsyncTask;)V

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_5
    invoke-static {v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4300(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)I

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    iget v7, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fullImageSampleSize:I

    .line 154
    .line 155
    if-eq v4, v7, :cond_2

    .line 156
    .line 157
    invoke-static {v3, v6}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$402(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;Z)Z

    .line 158
    .line 159
    .line 160
    invoke-static {v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$500(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Bitmap;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    if-eqz v4, :cond_2

    .line 165
    .line 166
    invoke-static {v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$500(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Bitmap;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 171
    .line 172
    .line 173
    invoke-static {v3, v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$502(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 174
    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_6
    invoke-static {v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4300(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)I

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    iget v5, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fullImageSampleSize:I

    .line 182
    .line 183
    if-ne v4, v5, :cond_2

    .line 184
    .line 185
    invoke-static {v3, v7}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$402(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;Z)Z

    .line 186
    .line 187
    .line 188
    goto/16 :goto_0

    .line 189
    .line 190
    :cond_7
    :goto_1
    return-void
.end method

.method private requestDisallowInterceptTouchEvent(Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0, p1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method private reset(Z)V
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "reset newImage="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    new-array v2, v1, [Ljava/lang/Object;

    .line 17
    .line 18
    invoke-direct {p0, v0, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    iput v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 23
    .line 24
    iput v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scaleStart:F

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 28
    .line 29
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateStart:Landroid/graphics/PointF;

    .line 30
    .line 31
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateBefore:Landroid/graphics/PointF;

    .line 32
    .line 33
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iput-object v3, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->pendingScale:Ljava/lang/Float;

    .line 38
    .line 39
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sPendingCenter:Landroid/graphics/PointF;

    .line 40
    .line 41
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sRequestedCenter:Landroid/graphics/PointF;

    .line 42
    .line 43
    iput-boolean v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isZooming:Z

    .line 44
    .line 45
    iput-boolean v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isPanning:Z

    .line 46
    .line 47
    iput-boolean v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isQuickScaling:Z

    .line 48
    .line 49
    iput v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxTouchCount:I

    .line 50
    .line 51
    iput v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fullImageSampleSize:I

    .line 52
    .line 53
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vCenterStart:Landroid/graphics/PointF;

    .line 54
    .line 55
    iput v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vDistStart:F

    .line 56
    .line 57
    iput v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleLastDistance:F

    .line 58
    .line 59
    iput-boolean v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleMoved:Z

    .line 60
    .line 61
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleSCenter:Landroid/graphics/PointF;

    .line 62
    .line 63
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleVLastPoint:Landroid/graphics/PointF;

    .line 64
    .line 65
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleVStart:Landroid/graphics/PointF;

    .line 66
    .line 67
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 68
    .line 69
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->satTemp:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;

    .line 70
    .line 71
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->matrix:Landroid/graphics/Matrix;

    .line 72
    .line 73
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sRect:Landroid/graphics/RectF;

    .line 74
    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->uri:Landroid/net/Uri;

    .line 78
    .line 79
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->decoderLock:Ljava/util/concurrent/locks/ReadWriteLock;

    .line 80
    .line 81
    invoke-interface {p1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 86
    .line 87
    .line 88
    :try_start_0
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->decoder:Lcom/davemorrissey/labs/subscaleview/decoder/ImageRegionDecoder;

    .line 89
    .line 90
    if-eqz p1, :cond_0

    .line 91
    .line 92
    invoke-interface {p1}, Lcom/davemorrissey/labs/subscaleview/decoder/ImageRegionDecoder;->recycle()V

    .line 93
    .line 94
    .line 95
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->decoder:Lcom/davemorrissey/labs/subscaleview/decoder/ImageRegionDecoder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :catchall_0
    move-exception p1

    .line 99
    goto :goto_1

    .line 100
    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->decoderLock:Ljava/util/concurrent/locks/ReadWriteLock;

    .line 101
    .line 102
    invoke-interface {p1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 107
    .line 108
    .line 109
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmap:Landroid/graphics/Bitmap;

    .line 110
    .line 111
    if-eqz p1, :cond_1

    .line 112
    .line 113
    iget-boolean v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapIsCached:Z

    .line 114
    .line 115
    if-nez v0, :cond_1

    .line 116
    .line 117
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 118
    .line 119
    .line 120
    :cond_1
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmap:Landroid/graphics/Bitmap;

    .line 121
    .line 122
    if-eqz p1, :cond_2

    .line 123
    .line 124
    iget-boolean p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapIsCached:Z

    .line 125
    .line 126
    if-eqz p1, :cond_2

    .line 127
    .line 128
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onImageEventListener:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnImageEventListener;

    .line 129
    .line 130
    if-eqz p1, :cond_2

    .line 131
    .line 132
    invoke-interface {p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnImageEventListener;->onPreviewReleased()V

    .line 133
    .line 134
    .line 135
    :cond_2
    iput v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth:I

    .line 136
    .line 137
    iput v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight:I

    .line 138
    .line 139
    iput v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sOrientation:I

    .line 140
    .line 141
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sRegion:Landroid/graphics/Rect;

    .line 142
    .line 143
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->pRegion:Landroid/graphics/Rect;

    .line 144
    .line 145
    iput-boolean v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->readySent:Z

    .line 146
    .line 147
    iput-boolean v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->imageLoadedSent:Z

    .line 148
    .line 149
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmap:Landroid/graphics/Bitmap;

    .line 150
    .line 151
    iput-boolean v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapIsPreview:Z

    .line 152
    .line 153
    iput-boolean v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapIsCached:Z

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :goto_1
    iget-object p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->decoderLock:Ljava/util/concurrent/locks/ReadWriteLock;

    .line 157
    .line 158
    invoke-interface {p0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 163
    .line 164
    .line 165
    throw p1

    .line 166
    :cond_3
    :goto_2
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->tileMap:Ljava/util/Map;

    .line 167
    .line 168
    if-eqz p1, :cond_7

    .line 169
    .line 170
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-eqz v0, :cond_6

    .line 183
    .line 184
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    check-cast v0, Ljava/util/Map$Entry;

    .line 189
    .line 190
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    check-cast v0, Ljava/util/List;

    .line 195
    .line 196
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    :cond_5
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    if-eqz v3, :cond_4

    .line 205
    .line 206
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    check-cast v3, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;

    .line 211
    .line 212
    invoke-static {v3, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$402(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;Z)Z

    .line 213
    .line 214
    .line 215
    invoke-static {v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$500(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Bitmap;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    if-eqz v4, :cond_5

    .line 220
    .line 221
    invoke-static {v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$500(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Bitmap;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 226
    .line 227
    .line 228
    invoke-static {v3, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$502(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 229
    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_6
    iput-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->tileMap:Ljava/util/Map;

    .line 233
    .line 234
    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    invoke-direct {p0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setGestureDetector(Landroid/content/Context;)V

    .line 239
    .line 240
    .line 241
    return-void
.end method

.method private restoreState(Lcom/davemorrissey/labs/subscaleview/ImageViewState;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->VALID_ORIENTATIONS:Ljava/util/List;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/ImageViewState;->getOrientation()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/ImageViewState;->getOrientation()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iput v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->orientation:I

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/ImageViewState;->getScale()F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->pendingScale:Ljava/lang/Float;

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/ImageViewState;->getCenter()Landroid/graphics/PointF;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sPendingCenter:Landroid/graphics/PointF;

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
.end method

.method private sHeight()I
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getRequiredRotation()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x5a

    .line 6
    .line 7
    if-eq v0, v1, :cond_1

    .line 8
    .line 9
    const/16 v1, 0x10e

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight:I

    .line 15
    .line 16
    return p0

    .line 17
    :cond_1
    :goto_0
    iget p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth:I

    .line 18
    .line 19
    return p0
.end method

.method private sWidth()I
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getRequiredRotation()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x5a

    .line 6
    .line 7
    if-eq v0, v1, :cond_1

    .line 8
    .line 9
    const/16 v1, 0x10e

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth:I

    .line 15
    .line 16
    return p0

    .line 17
    :cond_1
    :goto_0
    iget p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight:I

    .line 18
    .line 19
    return p0
.end method

.method private sendStateChanged(FLandroid/graphics/PointF;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onStateChangedListener:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnStateChangedListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 6
    .line 7
    cmpl-float p1, v1, p1

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, v1, p3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnStateChangedListener;->onScaleChanged(FI)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onStateChangedListener:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnStateChangedListener;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Landroid/graphics/PointF;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onStateChangedListener:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnStateChangedListener;

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getCenter()Landroid/graphics/PointF;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-interface {p1, p0, p3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnStateChangedListener;->onCenterChanged(Landroid/graphics/PointF;I)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method

.method private setGestureDetector(Landroid/content/Context;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/view/GestureDetector;

    .line 2
    .line 3
    new-instance v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$2;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$2;-><init>(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->detector:Landroid/view/GestureDetector;

    .line 12
    .line 13
    new-instance v0, Landroid/view/GestureDetector;

    .line 14
    .line 15
    new-instance v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$3;

    .line 16
    .line 17
    invoke-direct {v1, p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$3;-><init>(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->singleDetector:Landroid/view/GestureDetector;

    .line 24
    .line 25
    return-void
.end method

.method private setMatrixArray([FFFFFFFFF)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    aput p2, p1, p0

    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    aput p3, p1, p0

    .line 6
    .line 7
    const/4 p0, 0x2

    .line 8
    aput p4, p1, p0

    .line 9
    .line 10
    const/4 p0, 0x3

    .line 11
    aput p5, p1, p0

    .line 12
    .line 13
    const/4 p0, 0x4

    .line 14
    aput p6, p1, p0

    .line 15
    .line 16
    const/4 p0, 0x5

    .line 17
    aput p7, p1, p0

    .line 18
    .line 19
    const/4 p0, 0x6

    .line 20
    aput p8, p1, p0

    .line 21
    .line 22
    const/4 p0, 0x7

    .line 23
    aput p9, p1, p0

    .line 24
    .line 25
    return-void
.end method

.method public static setPreferredBitmapConfig(Landroid/graphics/Bitmap$Config;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->preferredBitmapConfig:Landroid/graphics/Bitmap$Config;

    .line 2
    .line 3
    return-void
.end method

.method private sourceToViewRect(Landroid/graphics/Rect;Landroid/graphics/Rect;)V
    .locals 3

    .line 1
    iget v0, p1, Landroid/graphics/Rect;->left:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    invoke-direct {p0, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sourceToViewX(F)F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    float-to-int v0, v0

    .line 9
    iget v1, p1, Landroid/graphics/Rect;->top:I

    .line 10
    .line 11
    int-to-float v1, v1

    .line 12
    invoke-direct {p0, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sourceToViewY(F)F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    float-to-int v1, v1

    .line 17
    iget v2, p1, Landroid/graphics/Rect;->right:I

    .line 18
    .line 19
    int-to-float v2, v2

    .line 20
    invoke-direct {p0, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sourceToViewX(F)F

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    float-to-int v2, v2

    .line 25
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 26
    .line 27
    int-to-float p1, p1

    .line 28
    invoke-direct {p0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sourceToViewY(F)F

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    float-to-int p0, p0

    .line 33
    invoke-virtual {p2, v0, v1, v2, p0}, Landroid/graphics/Rect;->set(IIII)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method private sourceToViewX(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/high16 p0, 0x7fc00000    # Float.NaN

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    iget p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 9
    .line 10
    mul-float/2addr p1, p0

    .line 11
    iget p0, v0, Landroid/graphics/PointF;->x:F

    .line 12
    .line 13
    add-float/2addr p1, p0

    .line 14
    return p1
.end method

.method private sourceToViewY(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/high16 p0, 0x7fc00000    # Float.NaN

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    iget p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 9
    .line 10
    mul-float/2addr p1, p0

    .line 11
    iget p0, v0, Landroid/graphics/PointF;->y:F

    .line 12
    .line 13
    add-float/2addr p1, p0

    .line 14
    return p1
.end method

.method private tileVisible(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->viewToSourceX(F)F

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    int-to-float v2, v2

    .line 11
    invoke-direct {p0, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->viewToSourceX(F)F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {p0, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->viewToSourceY(F)F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    int-to-float v3, v3

    .line 24
    invoke-direct {p0, v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->viewToSourceY(F)F

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-static {p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4100(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    iget v3, v3, Landroid/graphics/Rect;->right:I

    .line 33
    .line 34
    int-to-float v3, v3

    .line 35
    cmpl-float v1, v1, v3

    .line 36
    .line 37
    if-gtz v1, :cond_0

    .line 38
    .line 39
    invoke-static {p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4100(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget v1, v1, Landroid/graphics/Rect;->left:I

    .line 44
    .line 45
    int-to-float v1, v1

    .line 46
    cmpl-float v1, v1, v2

    .line 47
    .line 48
    if-gtz v1, :cond_0

    .line 49
    .line 50
    invoke-static {p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4100(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 55
    .line 56
    int-to-float v1, v1

    .line 57
    cmpl-float v0, v0, v1

    .line 58
    .line 59
    if-gtz v0, :cond_0

    .line 60
    .line 61
    invoke-static {p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4100(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 66
    .line 67
    int-to-float p1, p1

    .line 68
    cmpl-float p0, p1, p0

    .line 69
    .line 70
    if-gtz p0, :cond_0

    .line 71
    .line 72
    const/4 p0, 0x1

    .line 73
    return p0

    .line 74
    :cond_0
    const/4 p0, 0x0

    .line 75
    return p0
.end method

.method private vTranslateForSCenter(FFF)Landroid/graphics/PointF;
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    sub-int/2addr v1, v2

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    sub-int/2addr v1, v2

    .line 19
    div-int/lit8 v1, v1, 0x2

    .line 20
    .line 21
    add-int/2addr v1, v0

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    sub-int/2addr v2, v3

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    sub-int/2addr v2, v3

    .line 40
    div-int/lit8 v2, v2, 0x2

    .line 41
    .line 42
    add-int/2addr v2, v0

    .line 43
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->satTemp:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;

    .line 44
    .line 45
    if-nez v0, :cond_0

    .line 46
    .line 47
    new-instance v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;

    .line 48
    .line 49
    new-instance v3, Landroid/graphics/PointF;

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-direct {v3, v4, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 53
    .line 54
    .line 55
    const/4 v5, 0x0

    .line 56
    invoke-direct {v0, v4, v3, v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;-><init>(FLandroid/graphics/PointF;Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$1;)V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->satTemp:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;

    .line 60
    .line 61
    :cond_0
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->satTemp:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;

    .line 62
    .line 63
    invoke-static {v0, p3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;->access$4702(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;F)F

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->satTemp:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;

    .line 67
    .line 68
    invoke-static {v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;->access$4800(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;)Landroid/graphics/PointF;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    int-to-float v1, v1

    .line 73
    mul-float/2addr p1, p3

    .line 74
    sub-float/2addr v1, p1

    .line 75
    int-to-float p1, v2

    .line 76
    mul-float/2addr p2, p3

    .line 77
    sub-float/2addr p1, p2

    .line 78
    invoke-virtual {v0, v1, p1}, Landroid/graphics/PointF;->set(FF)V

    .line 79
    .line 80
    .line 81
    const/4 p1, 0x1

    .line 82
    iget-object p2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->satTemp:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;

    .line 83
    .line 84
    invoke-direct {p0, p1, p2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fitToBounds(ZLcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;)V

    .line 85
    .line 86
    .line 87
    iget-object p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->satTemp:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;

    .line 88
    .line 89
    invoke-static {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;->access$4800(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$ScaleAndTranslate;)Landroid/graphics/PointF;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0
.end method

.method private viewToSourceX(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/high16 p0, 0x7fc00000    # Float.NaN

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    iget v0, v0, Landroid/graphics/PointF;->x:F

    .line 9
    .line 10
    sub-float/2addr p1, v0

    .line 11
    iget p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 12
    .line 13
    div-float/2addr p1, p0

    .line 14
    return p1
.end method

.method private viewToSourceY(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/high16 p0, 0x7fc00000    # Float.NaN

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 9
    .line 10
    sub-float/2addr p1, v0

    .line 11
    iget p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 12
    .line 13
    div-float/2addr p1, p0

    .line 14
    return p1
.end method


# virtual methods
.method public animateCenter(Landroid/graphics/PointF;)Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isReady()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    new-instance v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;-><init>(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Landroid/graphics/PointF;Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$1;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public animateScale(F)Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isReady()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    new-instance v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;-><init>(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;FLcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$1;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public animateScaleAndCenter(FLandroid/graphics/PointF;)Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isReady()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    new-instance v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, p2, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$AnimationBuilder;-><init>(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;FLandroid/graphics/PointF;Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$1;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final getAppliedOrientation()I
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getRequiredRotation()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final getCenter()Landroid/graphics/PointF;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    div-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    div-int/lit8 v1, v1, 0x2

    .line 12
    .line 13
    int-to-float v0, v0

    .line 14
    int-to-float v1, v1

    .line 15
    invoke-virtual {p0, v0, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->viewToSourceCoord(FF)Landroid/graphics/PointF;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public getMaxScale()F
    .locals 0

    .line 1
    iget p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxScale:F

    .line 2
    .line 3
    return p0
.end method

.method public final getMinScale()F
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->minScale()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final getOrientation()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->orientation:I

    .line 2
    .line 3
    return p0
.end method

.method public final getPanRemaining(Landroid/graphics/RectF;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isReady()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    int-to-float v1, v1

    .line 15
    mul-float/2addr v0, v1

    .line 16
    iget v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    int-to-float v2, v2

    .line 23
    mul-float/2addr v1, v2

    .line 24
    iget v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->panLimit:I

    .line 25
    .line 26
    const/4 v3, 0x3

    .line 27
    const/4 v4, 0x2

    .line 28
    const/4 v5, 0x0

    .line 29
    if-ne v2, v3, :cond_1

    .line 30
    .line 31
    iget-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 32
    .line 33
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    div-int/2addr v3, v4

    .line 40
    int-to-float v3, v3

    .line 41
    sub-float/2addr v2, v3

    .line 42
    neg-float v2, v2

    .line 43
    invoke-static {v5, v2}, Ljava/lang/Math;->max(FF)F

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    iput v2, p1, Landroid/graphics/RectF;->top:F

    .line 48
    .line 49
    iget-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 50
    .line 51
    iget v2, v2, Landroid/graphics/PointF;->x:F

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    div-int/2addr v3, v4

    .line 58
    int-to-float v3, v3

    .line 59
    sub-float/2addr v2, v3

    .line 60
    neg-float v2, v2

    .line 61
    invoke-static {v5, v2}, Ljava/lang/Math;->max(FF)F

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    iput v2, p1, Landroid/graphics/RectF;->left:F

    .line 66
    .line 67
    iget-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 68
    .line 69
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    div-int/2addr v3, v4

    .line 76
    int-to-float v3, v3

    .line 77
    sub-float/2addr v3, v1

    .line 78
    sub-float/2addr v2, v3

    .line 79
    invoke-static {v5, v2}, Ljava/lang/Math;->max(FF)F

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    iput v1, p1, Landroid/graphics/RectF;->bottom:F

    .line 84
    .line 85
    iget-object v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 86
    .line 87
    iget v1, v1, Landroid/graphics/PointF;->x:F

    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    div-int/2addr p0, v4

    .line 94
    int-to-float p0, p0

    .line 95
    sub-float/2addr p0, v0

    .line 96
    sub-float/2addr v1, p0

    .line 97
    invoke-static {v5, v1}, Ljava/lang/Math;->max(FF)F

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    iput p0, p1, Landroid/graphics/RectF;->right:F

    .line 102
    .line 103
    return-void

    .line 104
    :cond_1
    iget-object v3, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 105
    .line 106
    if-ne v2, v4, :cond_2

    .line 107
    .line 108
    iget v2, v3, Landroid/graphics/PointF;->y:F

    .line 109
    .line 110
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    int-to-float v3, v3

    .line 115
    sub-float/2addr v2, v3

    .line 116
    neg-float v2, v2

    .line 117
    invoke-static {v5, v2}, Ljava/lang/Math;->max(FF)F

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    iput v2, p1, Landroid/graphics/RectF;->top:F

    .line 122
    .line 123
    iget-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 124
    .line 125
    iget v2, v2, Landroid/graphics/PointF;->x:F

    .line 126
    .line 127
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    int-to-float v3, v3

    .line 132
    sub-float/2addr v2, v3

    .line 133
    neg-float v2, v2

    .line 134
    invoke-static {v5, v2}, Ljava/lang/Math;->max(FF)F

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    iput v2, p1, Landroid/graphics/RectF;->left:F

    .line 139
    .line 140
    iget-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 141
    .line 142
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 143
    .line 144
    add-float/2addr v2, v1

    .line 145
    invoke-static {v5, v2}, Ljava/lang/Math;->max(FF)F

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    iput v1, p1, Landroid/graphics/RectF;->bottom:F

    .line 150
    .line 151
    iget-object p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 152
    .line 153
    iget p0, p0, Landroid/graphics/PointF;->x:F

    .line 154
    .line 155
    add-float/2addr p0, v0

    .line 156
    invoke-static {v5, p0}, Ljava/lang/Math;->max(FF)F

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    iput p0, p1, Landroid/graphics/RectF;->right:F

    .line 161
    .line 162
    return-void

    .line 163
    :cond_2
    iget v2, v3, Landroid/graphics/PointF;->y:F

    .line 164
    .line 165
    neg-float v2, v2

    .line 166
    invoke-static {v5, v2}, Ljava/lang/Math;->max(FF)F

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    iput v2, p1, Landroid/graphics/RectF;->top:F

    .line 171
    .line 172
    iget-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 173
    .line 174
    iget v2, v2, Landroid/graphics/PointF;->x:F

    .line 175
    .line 176
    neg-float v2, v2

    .line 177
    invoke-static {v5, v2}, Ljava/lang/Math;->max(FF)F

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    iput v2, p1, Landroid/graphics/RectF;->left:F

    .line 182
    .line 183
    iget-object v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 184
    .line 185
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 186
    .line 187
    add-float/2addr v1, v2

    .line 188
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    int-to-float v2, v2

    .line 193
    sub-float/2addr v1, v2

    .line 194
    invoke-static {v5, v1}, Ljava/lang/Math;->max(FF)F

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    iput v1, p1, Landroid/graphics/RectF;->bottom:F

    .line 199
    .line 200
    iget-object v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 201
    .line 202
    iget v1, v1, Landroid/graphics/PointF;->x:F

    .line 203
    .line 204
    add-float/2addr v0, v1

    .line 205
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 206
    .line 207
    .line 208
    move-result p0

    .line 209
    int-to-float p0, p0

    .line 210
    sub-float/2addr v0, p0

    .line 211
    invoke-static {v5, v0}, Ljava/lang/Math;->max(FF)F

    .line 212
    .line 213
    .line 214
    move-result p0

    .line 215
    iput p0, p1, Landroid/graphics/RectF;->right:F

    .line 216
    .line 217
    return-void
.end method

.method public final getSHeight()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight:I

    .line 2
    .line 3
    return p0
.end method

.method public final getSWidth()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth:I

    .line 2
    .line 3
    return p0
.end method

.method public final getScale()F
    .locals 0

    .line 1
    iget p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 2
    .line 3
    return p0
.end method

.method public final getState()Lcom/davemorrissey/labs/subscaleview/ImageViewState;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth:I

    .line 6
    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight:I

    .line 10
    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lcom/davemorrissey/labs/subscaleview/ImageViewState;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getScale()F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getCenter()Landroid/graphics/PointF;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getOrientation()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-direct {v0, v1, v2, p0}, Lcom/davemorrissey/labs/subscaleview/ImageViewState;-><init>(FLandroid/graphics/PointF;I)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public hasImage()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->uri:Landroid/net/Uri;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmap:Landroid/graphics/Bitmap;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method

.method public final isImageLoaded()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->imageLoadedSent:Z

    .line 2
    .line 3
    return p0
.end method

.method public final isPanEnabled()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->panEnabled:Z

    .line 2
    .line 3
    return p0
.end method

.method public final isQuickScaleEnabled()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleEnabled:Z

    .line 2
    .line 3
    return p0
.end method

.method public final isReady()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->readySent:Z

    .line 2
    .line 3
    return p0
.end method

.method public final isZoomEnabled()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->zoomEnabled:Z

    .line 2
    .line 3
    return p0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v11, p1

    .line 4
    .line 5
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->createPaints()V

    .line 9
    .line 10
    .line 11
    iget v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth:I

    .line 12
    .line 13
    if-eqz v0, :cond_29

    .line 14
    .line 15
    iget v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight:I

    .line 16
    .line 17
    if-eqz v0, :cond_29

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_29

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    goto/16 :goto_12

    .line 32
    .line 33
    :cond_0
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->tileMap:Ljava/util/Map;

    .line 34
    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->decoder:Lcom/davemorrissey/labs/subscaleview/decoder/ImageRegionDecoder;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-direct/range {p0 .. p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getMaxBitmapDimensions(Landroid/graphics/Canvas;)Landroid/graphics/Point;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-direct {v1, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->initialiseBaseLayer(Landroid/graphics/Point;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-direct {v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->checkReady()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    goto/16 :goto_12

    .line 55
    .line 56
    :cond_2
    invoke-direct {v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->preDraw()V

    .line 57
    .line 58
    .line 59
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 60
    .line 61
    const/4 v9, 0x0

    .line 62
    const/4 v10, 0x1

    .line 63
    const/4 v12, 0x0

    .line 64
    if-eqz v0, :cond_9

    .line 65
    .line 66
    invoke-static {v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3100(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)Landroid/graphics/PointF;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eqz v0, :cond_9

    .line 71
    .line 72
    iget v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 73
    .line 74
    iget-object v2, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateBefore:Landroid/graphics/PointF;

    .line 75
    .line 76
    if-nez v2, :cond_3

    .line 77
    .line 78
    new-instance v2, Landroid/graphics/PointF;

    .line 79
    .line 80
    invoke-direct {v2, v12, v12}, Landroid/graphics/PointF;-><init>(FF)V

    .line 81
    .line 82
    .line 83
    iput-object v2, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateBefore:Landroid/graphics/PointF;

    .line 84
    .line 85
    :cond_3
    iget-object v2, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateBefore:Landroid/graphics/PointF;

    .line 86
    .line 87
    iget-object v3, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 88
    .line 89
    invoke-virtual {v2, v3}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 90
    .line 91
    .line 92
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 93
    .line 94
    .line 95
    move-result-wide v2

    .line 96
    iget-object v4, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 97
    .line 98
    invoke-static {v4}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)J

    .line 99
    .line 100
    .line 101
    move-result-wide v4

    .line 102
    sub-long/2addr v2, v4

    .line 103
    iget-object v4, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 104
    .line 105
    invoke-static {v4}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3300(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)J

    .line 106
    .line 107
    .line 108
    move-result-wide v4

    .line 109
    cmp-long v4, v2, v4

    .line 110
    .line 111
    if-lez v4, :cond_4

    .line 112
    .line 113
    move v13, v10

    .line 114
    goto :goto_0

    .line 115
    :cond_4
    move v13, v9

    .line 116
    :goto_0
    iget-object v4, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 117
    .line 118
    invoke-static {v4}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3300(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)J

    .line 119
    .line 120
    .line 121
    move-result-wide v4

    .line 122
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 123
    .line 124
    .line 125
    move-result-wide v3

    .line 126
    iget-object v2, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 127
    .line 128
    invoke-static {v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3400(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)I

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    iget-object v5, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 133
    .line 134
    invoke-static {v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3500(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)F

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    iget-object v6, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 139
    .line 140
    invoke-static {v6}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3600(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)F

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    iget-object v7, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 145
    .line 146
    invoke-static {v7}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3500(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)F

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    sub-float/2addr v6, v7

    .line 151
    iget-object v7, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 152
    .line 153
    invoke-static {v7}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3300(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)J

    .line 154
    .line 155
    .line 156
    move-result-wide v7

    .line 157
    invoke-direct/range {v1 .. v8}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->ease(IJFFJ)F

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    iput v2, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 162
    .line 163
    iget-object v2, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 164
    .line 165
    invoke-static {v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3400(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    iget-object v5, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 170
    .line 171
    invoke-static {v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3100(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)Landroid/graphics/PointF;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    iget v5, v5, Landroid/graphics/PointF;->x:F

    .line 176
    .line 177
    iget-object v6, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 178
    .line 179
    invoke-static {v6}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3700(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)Landroid/graphics/PointF;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    iget v6, v6, Landroid/graphics/PointF;->x:F

    .line 184
    .line 185
    iget-object v7, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 186
    .line 187
    invoke-static {v7}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3100(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)Landroid/graphics/PointF;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    iget v7, v7, Landroid/graphics/PointF;->x:F

    .line 192
    .line 193
    sub-float/2addr v6, v7

    .line 194
    iget-object v7, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 195
    .line 196
    invoke-static {v7}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3300(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)J

    .line 197
    .line 198
    .line 199
    move-result-wide v7

    .line 200
    invoke-direct/range {v1 .. v8}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->ease(IJFFJ)F

    .line 201
    .line 202
    .line 203
    move-result v14

    .line 204
    iget-object v2, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 205
    .line 206
    invoke-static {v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3400(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)I

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    iget-object v5, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 211
    .line 212
    invoke-static {v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3100(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)Landroid/graphics/PointF;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    iget v5, v5, Landroid/graphics/PointF;->y:F

    .line 217
    .line 218
    iget-object v6, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 219
    .line 220
    invoke-static {v6}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3700(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)Landroid/graphics/PointF;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    iget v6, v6, Landroid/graphics/PointF;->y:F

    .line 225
    .line 226
    iget-object v7, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 227
    .line 228
    invoke-static {v7}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3100(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)Landroid/graphics/PointF;

    .line 229
    .line 230
    .line 231
    move-result-object v7

    .line 232
    iget v7, v7, Landroid/graphics/PointF;->y:F

    .line 233
    .line 234
    sub-float/2addr v6, v7

    .line 235
    iget-object v7, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 236
    .line 237
    invoke-static {v7}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3300(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)J

    .line 238
    .line 239
    .line 240
    move-result-wide v7

    .line 241
    invoke-direct/range {v1 .. v8}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->ease(IJFFJ)F

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    iget-object v3, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 246
    .line 247
    iget v4, v3, Landroid/graphics/PointF;->x:F

    .line 248
    .line 249
    iget-object v5, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 250
    .line 251
    invoke-static {v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3800(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)Landroid/graphics/PointF;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    iget v5, v5, Landroid/graphics/PointF;->x:F

    .line 256
    .line 257
    invoke-direct {v1, v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sourceToViewX(F)F

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    sub-float/2addr v5, v14

    .line 262
    sub-float/2addr v4, v5

    .line 263
    iput v4, v3, Landroid/graphics/PointF;->x:F

    .line 264
    .line 265
    iget-object v3, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 266
    .line 267
    iget v4, v3, Landroid/graphics/PointF;->y:F

    .line 268
    .line 269
    iget-object v5, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 270
    .line 271
    invoke-static {v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3800(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)Landroid/graphics/PointF;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    iget v5, v5, Landroid/graphics/PointF;->y:F

    .line 276
    .line 277
    invoke-direct {v1, v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sourceToViewY(F)F

    .line 278
    .line 279
    .line 280
    move-result v5

    .line 281
    sub-float/2addr v5, v2

    .line 282
    sub-float/2addr v4, v5

    .line 283
    iput v4, v3, Landroid/graphics/PointF;->y:F

    .line 284
    .line 285
    if-nez v13, :cond_6

    .line 286
    .line 287
    iget-object v2, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 288
    .line 289
    invoke-static {v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3500(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)F

    .line 290
    .line 291
    .line 292
    move-result v2

    .line 293
    iget-object v3, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 294
    .line 295
    invoke-static {v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3600(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)F

    .line 296
    .line 297
    .line 298
    move-result v3

    .line 299
    cmpl-float v2, v2, v3

    .line 300
    .line 301
    if-nez v2, :cond_5

    .line 302
    .line 303
    goto :goto_1

    .line 304
    :cond_5
    move v2, v9

    .line 305
    goto :goto_2

    .line 306
    :cond_6
    :goto_1
    move v2, v10

    .line 307
    :goto_2
    invoke-direct {v1, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fitToBounds(Z)V

    .line 308
    .line 309
    .line 310
    iget-object v2, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateBefore:Landroid/graphics/PointF;

    .line 311
    .line 312
    iget-object v3, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 313
    .line 314
    invoke-static {v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3900(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)I

    .line 315
    .line 316
    .line 317
    move-result v3

    .line 318
    invoke-direct {v1, v0, v2, v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sendStateChanged(FLandroid/graphics/PointF;I)V

    .line 319
    .line 320
    .line 321
    invoke-direct {v1, v13}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->refreshRequiredTiles(Z)V

    .line 322
    .line 323
    .line 324
    if-eqz v13, :cond_8

    .line 325
    .line 326
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 327
    .line 328
    invoke-static {v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$2800(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnAnimationEventListener;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    if-eqz v0, :cond_7

    .line 333
    .line 334
    :try_start_0
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 335
    .line 336
    invoke-static {v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$2800(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnAnimationEventListener;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-interface {v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnAnimationEventListener;->onComplete()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 341
    .line 342
    .line 343
    goto :goto_3

    .line 344
    :catch_0
    move-exception v0

    .line 345
    sget-object v2, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->TAG:Ljava/lang/String;

    .line 346
    .line 347
    const-string v3, "Error thrown by animation listener"

    .line 348
    .line 349
    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 350
    .line 351
    .line 352
    :cond_7
    :goto_3
    const/4 v0, 0x0

    .line 353
    iput-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 354
    .line 355
    :cond_8
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 356
    .line 357
    .line 358
    :cond_9
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->tileMap:Ljava/util/Map;

    .line 359
    .line 360
    const/16 v15, 0x10e

    .line 361
    .line 362
    const/16 v2, 0xb4

    .line 363
    .line 364
    const/16 v3, 0x5a

    .line 365
    .line 366
    const/4 v4, 0x5

    .line 367
    if-eqz v0, :cond_1a

    .line 368
    .line 369
    invoke-direct {v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isBaseLayerReady()Z

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    if-eqz v0, :cond_1a

    .line 374
    .line 375
    iget v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fullImageSampleSize:I

    .line 376
    .line 377
    iget v5, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 378
    .line 379
    invoke-direct {v1, v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->calculateInSampleSize(F)I

    .line 380
    .line 381
    .line 382
    move-result v5

    .line 383
    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    .line 384
    .line 385
    .line 386
    move-result v0

    .line 387
    iget-object v5, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->tileMap:Ljava/util/Map;

    .line 388
    .line 389
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 390
    .line 391
    .line 392
    move-result-object v5

    .line 393
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 394
    .line 395
    .line 396
    move-result-object v5

    .line 397
    move v12, v9

    .line 398
    :cond_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 399
    .line 400
    .line 401
    move-result v6

    .line 402
    if-eqz v6, :cond_d

    .line 403
    .line 404
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v6

    .line 408
    check-cast v6, Ljava/util/Map$Entry;

    .line 409
    .line 410
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v7

    .line 414
    check-cast v7, Ljava/lang/Integer;

    .line 415
    .line 416
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 417
    .line 418
    .line 419
    move-result v7

    .line 420
    if-ne v7, v0, :cond_a

    .line 421
    .line 422
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v6

    .line 426
    check-cast v6, Ljava/util/List;

    .line 427
    .line 428
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 429
    .line 430
    .line 431
    move-result-object v6

    .line 432
    :cond_b
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 433
    .line 434
    .line 435
    move-result v7

    .line 436
    if-eqz v7, :cond_a

    .line 437
    .line 438
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v7

    .line 442
    check-cast v7, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;

    .line 443
    .line 444
    invoke-static {v7}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$400(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Z

    .line 445
    .line 446
    .line 447
    move-result v8

    .line 448
    if-eqz v8, :cond_b

    .line 449
    .line 450
    invoke-static {v7}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4000(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Z

    .line 451
    .line 452
    .line 453
    move-result v8

    .line 454
    if-nez v8, :cond_c

    .line 455
    .line 456
    invoke-static {v7}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$500(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Bitmap;

    .line 457
    .line 458
    .line 459
    move-result-object v7

    .line 460
    if-nez v7, :cond_b

    .line 461
    .line 462
    :cond_c
    move v12, v10

    .line 463
    goto :goto_4

    .line 464
    :cond_d
    iget-object v5, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->tileMap:Ljava/util/Map;

    .line 465
    .line 466
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 467
    .line 468
    .line 469
    move-result-object v5

    .line 470
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 471
    .line 472
    .line 473
    move-result-object v16

    .line 474
    :goto_5
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 475
    .line 476
    .line 477
    move-result v5

    .line 478
    if-eqz v5, :cond_19

    .line 479
    .line 480
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v5

    .line 484
    check-cast v5, Ljava/util/Map$Entry;

    .line 485
    .line 486
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v6

    .line 490
    check-cast v6, Ljava/lang/Integer;

    .line 491
    .line 492
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 493
    .line 494
    .line 495
    move-result v6

    .line 496
    if-eq v6, v0, :cond_f

    .line 497
    .line 498
    if-eqz v12, :cond_e

    .line 499
    .line 500
    goto :goto_6

    .line 501
    :cond_e
    move v13, v3

    .line 502
    move v14, v4

    .line 503
    move/from16 v22, v12

    .line 504
    .line 505
    move v12, v2

    .line 506
    goto/16 :goto_a

    .line 507
    .line 508
    :cond_f
    :goto_6
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v5

    .line 512
    check-cast v5, Ljava/util/List;

    .line 513
    .line 514
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 515
    .line 516
    .line 517
    move-result-object v17

    .line 518
    :goto_7
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 519
    .line 520
    .line 521
    move-result v5

    .line 522
    if-eqz v5, :cond_e

    .line 523
    .line 524
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v5

    .line 528
    move-object/from16 v18, v5

    .line 529
    .line 530
    check-cast v18, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;

    .line 531
    .line 532
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4100(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 533
    .line 534
    .line 535
    move-result-object v5

    .line 536
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 537
    .line 538
    .line 539
    move-result-object v6

    .line 540
    invoke-direct {v1, v5, v6}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sourceToViewRect(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 541
    .line 542
    .line 543
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4000(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Z

    .line 544
    .line 545
    .line 546
    move-result v5

    .line 547
    if-nez v5, :cond_16

    .line 548
    .line 549
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$500(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Bitmap;

    .line 550
    .line 551
    .line 552
    move-result-object v5

    .line 553
    if-eqz v5, :cond_16

    .line 554
    .line 555
    iget-object v5, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->tileBgPaint:Landroid/graphics/Paint;

    .line 556
    .line 557
    if-eqz v5, :cond_10

    .line 558
    .line 559
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 560
    .line 561
    .line 562
    move-result-object v5

    .line 563
    iget-object v6, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->tileBgPaint:Landroid/graphics/Paint;

    .line 564
    .line 565
    invoke-virtual {v11, v5, v6}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 566
    .line 567
    .line 568
    :cond_10
    iget-object v5, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->matrix:Landroid/graphics/Matrix;

    .line 569
    .line 570
    if-nez v5, :cond_11

    .line 571
    .line 572
    new-instance v5, Landroid/graphics/Matrix;

    .line 573
    .line 574
    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 575
    .line 576
    .line 577
    iput-object v5, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->matrix:Landroid/graphics/Matrix;

    .line 578
    .line 579
    :cond_11
    iget-object v5, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->matrix:Landroid/graphics/Matrix;

    .line 580
    .line 581
    invoke-virtual {v5}, Landroid/graphics/Matrix;->reset()V

    .line 582
    .line 583
    .line 584
    move v5, v2

    .line 585
    iget-object v2, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->srcArray:[F

    .line 586
    .line 587
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$500(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Bitmap;

    .line 588
    .line 589
    .line 590
    move-result-object v6

    .line 591
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 592
    .line 593
    .line 594
    move-result v6

    .line 595
    int-to-float v6, v6

    .line 596
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$500(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Bitmap;

    .line 597
    .line 598
    .line 599
    move-result-object v7

    .line 600
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    .line 601
    .line 602
    .line 603
    move-result v7

    .line 604
    int-to-float v7, v7

    .line 605
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$500(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Bitmap;

    .line 606
    .line 607
    .line 608
    move-result-object v8

    .line 609
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    .line 610
    .line 611
    .line 612
    move-result v8

    .line 613
    int-to-float v8, v8

    .line 614
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$500(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Bitmap;

    .line 615
    .line 616
    .line 617
    move-result-object v9

    .line 618
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getHeight()I

    .line 619
    .line 620
    .line 621
    move-result v9

    .line 622
    int-to-float v10, v9

    .line 623
    move v9, v3

    .line 624
    const/4 v3, 0x0

    .line 625
    move/from16 v19, v4

    .line 626
    .line 627
    const/4 v4, 0x0

    .line 628
    move/from16 v20, v5

    .line 629
    .line 630
    move v5, v6

    .line 631
    const/4 v6, 0x0

    .line 632
    move/from16 v21, v9

    .line 633
    .line 634
    const/4 v9, 0x0

    .line 635
    move/from16 v22, v12

    .line 636
    .line 637
    move/from16 v14, v19

    .line 638
    .line 639
    move/from16 v12, v20

    .line 640
    .line 641
    move/from16 v13, v21

    .line 642
    .line 643
    invoke-direct/range {v1 .. v10}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setMatrixArray([FFFFFFFFF)V

    .line 644
    .line 645
    .line 646
    invoke-direct {v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getRequiredRotation()I

    .line 647
    .line 648
    .line 649
    move-result v2

    .line 650
    if-nez v2, :cond_12

    .line 651
    .line 652
    iget-object v2, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->dstArray:[F

    .line 653
    .line 654
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 655
    .line 656
    .line 657
    move-result-object v3

    .line 658
    iget v3, v3, Landroid/graphics/Rect;->left:I

    .line 659
    .line 660
    int-to-float v3, v3

    .line 661
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 662
    .line 663
    .line 664
    move-result-object v4

    .line 665
    iget v4, v4, Landroid/graphics/Rect;->top:I

    .line 666
    .line 667
    int-to-float v4, v4

    .line 668
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 669
    .line 670
    .line 671
    move-result-object v5

    .line 672
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 673
    .line 674
    int-to-float v5, v5

    .line 675
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 676
    .line 677
    .line 678
    move-result-object v6

    .line 679
    iget v6, v6, Landroid/graphics/Rect;->top:I

    .line 680
    .line 681
    int-to-float v6, v6

    .line 682
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 683
    .line 684
    .line 685
    move-result-object v7

    .line 686
    iget v7, v7, Landroid/graphics/Rect;->right:I

    .line 687
    .line 688
    int-to-float v7, v7

    .line 689
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 690
    .line 691
    .line 692
    move-result-object v8

    .line 693
    iget v8, v8, Landroid/graphics/Rect;->bottom:I

    .line 694
    .line 695
    int-to-float v8, v8

    .line 696
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 697
    .line 698
    .line 699
    move-result-object v9

    .line 700
    iget v9, v9, Landroid/graphics/Rect;->left:I

    .line 701
    .line 702
    int-to-float v9, v9

    .line 703
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 704
    .line 705
    .line 706
    move-result-object v10

    .line 707
    iget v10, v10, Landroid/graphics/Rect;->bottom:I

    .line 708
    .line 709
    int-to-float v10, v10

    .line 710
    invoke-direct/range {v1 .. v10}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setMatrixArray([FFFFFFFFF)V

    .line 711
    .line 712
    .line 713
    goto/16 :goto_8

    .line 714
    .line 715
    :cond_12
    invoke-direct {v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getRequiredRotation()I

    .line 716
    .line 717
    .line 718
    move-result v2

    .line 719
    if-ne v2, v13, :cond_13

    .line 720
    .line 721
    iget-object v2, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->dstArray:[F

    .line 722
    .line 723
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 724
    .line 725
    .line 726
    move-result-object v3

    .line 727
    iget v3, v3, Landroid/graphics/Rect;->right:I

    .line 728
    .line 729
    int-to-float v3, v3

    .line 730
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 731
    .line 732
    .line 733
    move-result-object v4

    .line 734
    iget v4, v4, Landroid/graphics/Rect;->top:I

    .line 735
    .line 736
    int-to-float v4, v4

    .line 737
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 738
    .line 739
    .line 740
    move-result-object v5

    .line 741
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 742
    .line 743
    int-to-float v5, v5

    .line 744
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 745
    .line 746
    .line 747
    move-result-object v6

    .line 748
    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    .line 749
    .line 750
    int-to-float v6, v6

    .line 751
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 752
    .line 753
    .line 754
    move-result-object v7

    .line 755
    iget v7, v7, Landroid/graphics/Rect;->left:I

    .line 756
    .line 757
    int-to-float v7, v7

    .line 758
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 759
    .line 760
    .line 761
    move-result-object v8

    .line 762
    iget v8, v8, Landroid/graphics/Rect;->bottom:I

    .line 763
    .line 764
    int-to-float v8, v8

    .line 765
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 766
    .line 767
    .line 768
    move-result-object v9

    .line 769
    iget v9, v9, Landroid/graphics/Rect;->left:I

    .line 770
    .line 771
    int-to-float v9, v9

    .line 772
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 773
    .line 774
    .line 775
    move-result-object v10

    .line 776
    iget v10, v10, Landroid/graphics/Rect;->top:I

    .line 777
    .line 778
    int-to-float v10, v10

    .line 779
    invoke-direct/range {v1 .. v10}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setMatrixArray([FFFFFFFFF)V

    .line 780
    .line 781
    .line 782
    goto/16 :goto_8

    .line 783
    .line 784
    :cond_13
    invoke-direct {v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getRequiredRotation()I

    .line 785
    .line 786
    .line 787
    move-result v2

    .line 788
    if-ne v2, v12, :cond_14

    .line 789
    .line 790
    iget-object v2, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->dstArray:[F

    .line 791
    .line 792
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 793
    .line 794
    .line 795
    move-result-object v3

    .line 796
    iget v3, v3, Landroid/graphics/Rect;->right:I

    .line 797
    .line 798
    int-to-float v3, v3

    .line 799
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 800
    .line 801
    .line 802
    move-result-object v4

    .line 803
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 804
    .line 805
    int-to-float v4, v4

    .line 806
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 807
    .line 808
    .line 809
    move-result-object v5

    .line 810
    iget v5, v5, Landroid/graphics/Rect;->left:I

    .line 811
    .line 812
    int-to-float v5, v5

    .line 813
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 814
    .line 815
    .line 816
    move-result-object v6

    .line 817
    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    .line 818
    .line 819
    int-to-float v6, v6

    .line 820
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 821
    .line 822
    .line 823
    move-result-object v7

    .line 824
    iget v7, v7, Landroid/graphics/Rect;->left:I

    .line 825
    .line 826
    int-to-float v7, v7

    .line 827
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 828
    .line 829
    .line 830
    move-result-object v8

    .line 831
    iget v8, v8, Landroid/graphics/Rect;->top:I

    .line 832
    .line 833
    int-to-float v8, v8

    .line 834
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 835
    .line 836
    .line 837
    move-result-object v9

    .line 838
    iget v9, v9, Landroid/graphics/Rect;->right:I

    .line 839
    .line 840
    int-to-float v9, v9

    .line 841
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 842
    .line 843
    .line 844
    move-result-object v10

    .line 845
    iget v10, v10, Landroid/graphics/Rect;->top:I

    .line 846
    .line 847
    int-to-float v10, v10

    .line 848
    invoke-direct/range {v1 .. v10}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setMatrixArray([FFFFFFFFF)V

    .line 849
    .line 850
    .line 851
    goto :goto_8

    .line 852
    :cond_14
    invoke-direct {v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getRequiredRotation()I

    .line 853
    .line 854
    .line 855
    move-result v2

    .line 856
    if-ne v2, v15, :cond_15

    .line 857
    .line 858
    iget-object v2, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->dstArray:[F

    .line 859
    .line 860
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 861
    .line 862
    .line 863
    move-result-object v3

    .line 864
    iget v3, v3, Landroid/graphics/Rect;->left:I

    .line 865
    .line 866
    int-to-float v3, v3

    .line 867
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 868
    .line 869
    .line 870
    move-result-object v4

    .line 871
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 872
    .line 873
    int-to-float v4, v4

    .line 874
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 875
    .line 876
    .line 877
    move-result-object v5

    .line 878
    iget v5, v5, Landroid/graphics/Rect;->left:I

    .line 879
    .line 880
    int-to-float v5, v5

    .line 881
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 882
    .line 883
    .line 884
    move-result-object v6

    .line 885
    iget v6, v6, Landroid/graphics/Rect;->top:I

    .line 886
    .line 887
    int-to-float v6, v6

    .line 888
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 889
    .line 890
    .line 891
    move-result-object v7

    .line 892
    iget v7, v7, Landroid/graphics/Rect;->right:I

    .line 893
    .line 894
    int-to-float v7, v7

    .line 895
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 896
    .line 897
    .line 898
    move-result-object v8

    .line 899
    iget v8, v8, Landroid/graphics/Rect;->top:I

    .line 900
    .line 901
    int-to-float v8, v8

    .line 902
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 903
    .line 904
    .line 905
    move-result-object v9

    .line 906
    iget v9, v9, Landroid/graphics/Rect;->right:I

    .line 907
    .line 908
    int-to-float v9, v9

    .line 909
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 910
    .line 911
    .line 912
    move-result-object v10

    .line 913
    iget v10, v10, Landroid/graphics/Rect;->bottom:I

    .line 914
    .line 915
    int-to-float v10, v10

    .line 916
    invoke-direct/range {v1 .. v10}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setMatrixArray([FFFFFFFFF)V

    .line 917
    .line 918
    .line 919
    :cond_15
    :goto_8
    iget-object v2, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->matrix:Landroid/graphics/Matrix;

    .line 920
    .line 921
    iget-object v3, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->srcArray:[F

    .line 922
    .line 923
    iget-object v5, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->dstArray:[F

    .line 924
    .line 925
    const/4 v6, 0x0

    .line 926
    const/4 v7, 0x4

    .line 927
    const/4 v4, 0x0

    .line 928
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Matrix;->setPolyToPoly([FI[FII)Z

    .line 929
    .line 930
    .line 931
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$500(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Bitmap;

    .line 932
    .line 933
    .line 934
    move-result-object v2

    .line 935
    iget-object v3, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->matrix:Landroid/graphics/Matrix;

    .line 936
    .line 937
    iget-object v4, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapPaint:Landroid/graphics/Paint;

    .line 938
    .line 939
    invoke-virtual {v11, v2, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 940
    .line 941
    .line 942
    iget-boolean v2, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debug:Z

    .line 943
    .line 944
    if-eqz v2, :cond_17

    .line 945
    .line 946
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 947
    .line 948
    .line 949
    move-result-object v2

    .line 950
    iget-object v3, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugLinePaint:Landroid/graphics/Paint;

    .line 951
    .line 952
    invoke-virtual {v11, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 953
    .line 954
    .line 955
    goto :goto_9

    .line 956
    :cond_16
    move v13, v3

    .line 957
    move v14, v4

    .line 958
    move/from16 v22, v12

    .line 959
    .line 960
    move v12, v2

    .line 961
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4000(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Z

    .line 962
    .line 963
    .line 964
    move-result v2

    .line 965
    if-eqz v2, :cond_17

    .line 966
    .line 967
    iget-boolean v2, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debug:Z

    .line 968
    .line 969
    if-eqz v2, :cond_17

    .line 970
    .line 971
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 972
    .line 973
    .line 974
    move-result-object v2

    .line 975
    iget v2, v2, Landroid/graphics/Rect;->left:I

    .line 976
    .line 977
    invoke-direct {v1, v14}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->px(I)I

    .line 978
    .line 979
    .line 980
    move-result v3

    .line 981
    add-int/2addr v2, v3

    .line 982
    int-to-float v2, v2

    .line 983
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 984
    .line 985
    .line 986
    move-result-object v3

    .line 987
    iget v3, v3, Landroid/graphics/Rect;->top:I

    .line 988
    .line 989
    const/16 v4, 0x23

    .line 990
    .line 991
    invoke-direct {v1, v4}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->px(I)I

    .line 992
    .line 993
    .line 994
    move-result v5

    .line 995
    add-int/2addr v3, v5

    .line 996
    int-to-float v3, v3

    .line 997
    iget-object v4, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugTextPaint:Landroid/graphics/Paint;

    .line 998
    .line 999
    const-string v5, "LOADING"

    .line 1000
    .line 1001
    invoke-virtual {v11, v5, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 1002
    .line 1003
    .line 1004
    :cond_17
    :goto_9
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$400(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Z

    .line 1005
    .line 1006
    .line 1007
    move-result v2

    .line 1008
    if-eqz v2, :cond_18

    .line 1009
    .line 1010
    iget-boolean v2, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debug:Z

    .line 1011
    .line 1012
    if-eqz v2, :cond_18

    .line 1013
    .line 1014
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1015
    .line 1016
    const-string v3, "ISS "

    .line 1017
    .line 1018
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1019
    .line 1020
    .line 1021
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4300(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)I

    .line 1022
    .line 1023
    .line 1024
    move-result v3

    .line 1025
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1026
    .line 1027
    .line 1028
    const-string v3, " RECT "

    .line 1029
    .line 1030
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1031
    .line 1032
    .line 1033
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4100(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v3

    .line 1037
    iget v3, v3, Landroid/graphics/Rect;->top:I

    .line 1038
    .line 1039
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1040
    .line 1041
    .line 1042
    const-string v3, ","

    .line 1043
    .line 1044
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1045
    .line 1046
    .line 1047
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4100(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v4

    .line 1051
    iget v4, v4, Landroid/graphics/Rect;->left:I

    .line 1052
    .line 1053
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1057
    .line 1058
    .line 1059
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4100(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v4

    .line 1063
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 1064
    .line 1065
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1069
    .line 1070
    .line 1071
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4100(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v3

    .line 1075
    iget v3, v3, Landroid/graphics/Rect;->right:I

    .line 1076
    .line 1077
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v2

    .line 1084
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v3

    .line 1088
    iget v3, v3, Landroid/graphics/Rect;->left:I

    .line 1089
    .line 1090
    invoke-direct {v1, v14}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->px(I)I

    .line 1091
    .line 1092
    .line 1093
    move-result v4

    .line 1094
    add-int/2addr v3, v4

    .line 1095
    int-to-float v3, v3

    .line 1096
    invoke-static/range {v18 .. v18}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;->access$4200(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Tile;)Landroid/graphics/Rect;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v4

    .line 1100
    iget v4, v4, Landroid/graphics/Rect;->top:I

    .line 1101
    .line 1102
    const/16 v5, 0xf

    .line 1103
    .line 1104
    invoke-direct {v1, v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->px(I)I

    .line 1105
    .line 1106
    .line 1107
    move-result v6

    .line 1108
    add-int/2addr v4, v6

    .line 1109
    int-to-float v4, v4

    .line 1110
    iget-object v5, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugTextPaint:Landroid/graphics/Paint;

    .line 1111
    .line 1112
    invoke-virtual {v11, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 1113
    .line 1114
    .line 1115
    :cond_18
    move v2, v12

    .line 1116
    move v3, v13

    .line 1117
    move v4, v14

    .line 1118
    move/from16 v12, v22

    .line 1119
    .line 1120
    goto/16 :goto_7

    .line 1121
    .line 1122
    :goto_a
    move v2, v12

    .line 1123
    move v3, v13

    .line 1124
    move v4, v14

    .line 1125
    move/from16 v12, v22

    .line 1126
    .line 1127
    goto/16 :goto_5

    .line 1128
    .line 1129
    :cond_19
    move v14, v4

    .line 1130
    goto/16 :goto_11

    .line 1131
    .line 1132
    :cond_1a
    move v13, v12

    .line 1133
    move v12, v2

    .line 1134
    move v2, v13

    .line 1135
    move v13, v3

    .line 1136
    move v14, v4

    .line 1137
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmap:Landroid/graphics/Bitmap;

    .line 1138
    .line 1139
    if-eqz v0, :cond_24

    .line 1140
    .line 1141
    iget v3, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 1142
    .line 1143
    iget-boolean v4, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapIsPreview:Z

    .line 1144
    .line 1145
    if-eqz v4, :cond_1b

    .line 1146
    .line 1147
    iget v4, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth:I

    .line 1148
    .line 1149
    int-to-float v4, v4

    .line 1150
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1151
    .line 1152
    .line 1153
    move-result v0

    .line 1154
    int-to-float v0, v0

    .line 1155
    div-float/2addr v4, v0

    .line 1156
    mul-float/2addr v3, v4

    .line 1157
    iget v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 1158
    .line 1159
    iget v4, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight:I

    .line 1160
    .line 1161
    int-to-float v4, v4

    .line 1162
    iget-object v5, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmap:Landroid/graphics/Bitmap;

    .line 1163
    .line 1164
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1165
    .line 1166
    .line 1167
    move-result v5

    .line 1168
    int-to-float v5, v5

    .line 1169
    div-float/2addr v4, v5

    .line 1170
    mul-float/2addr v0, v4

    .line 1171
    goto :goto_b

    .line 1172
    :cond_1b
    move v0, v3

    .line 1173
    :goto_b
    iget-object v4, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->matrix:Landroid/graphics/Matrix;

    .line 1174
    .line 1175
    if-nez v4, :cond_1c

    .line 1176
    .line 1177
    new-instance v4, Landroid/graphics/Matrix;

    .line 1178
    .line 1179
    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 1180
    .line 1181
    .line 1182
    iput-object v4, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->matrix:Landroid/graphics/Matrix;

    .line 1183
    .line 1184
    :cond_1c
    iget-object v4, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->matrix:Landroid/graphics/Matrix;

    .line 1185
    .line 1186
    invoke-virtual {v4}, Landroid/graphics/Matrix;->reset()V

    .line 1187
    .line 1188
    .line 1189
    iget-object v4, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->matrix:Landroid/graphics/Matrix;

    .line 1190
    .line 1191
    invoke-virtual {v4, v3, v0}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 1192
    .line 1193
    .line 1194
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->matrix:Landroid/graphics/Matrix;

    .line 1195
    .line 1196
    invoke-direct {v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getRequiredRotation()I

    .line 1197
    .line 1198
    .line 1199
    move-result v3

    .line 1200
    int-to-float v3, v3

    .line 1201
    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 1202
    .line 1203
    .line 1204
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->matrix:Landroid/graphics/Matrix;

    .line 1205
    .line 1206
    iget-object v3, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 1207
    .line 1208
    iget v4, v3, Landroid/graphics/PointF;->x:F

    .line 1209
    .line 1210
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 1211
    .line 1212
    invoke-virtual {v0, v4, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1213
    .line 1214
    .line 1215
    invoke-direct {v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getRequiredRotation()I

    .line 1216
    .line 1217
    .line 1218
    move-result v0

    .line 1219
    if-ne v0, v12, :cond_1d

    .line 1220
    .line 1221
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->matrix:Landroid/graphics/Matrix;

    .line 1222
    .line 1223
    iget v3, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 1224
    .line 1225
    iget v4, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth:I

    .line 1226
    .line 1227
    int-to-float v4, v4

    .line 1228
    mul-float/2addr v4, v3

    .line 1229
    iget v5, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight:I

    .line 1230
    .line 1231
    int-to-float v5, v5

    .line 1232
    mul-float/2addr v3, v5

    .line 1233
    invoke-virtual {v0, v4, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1234
    .line 1235
    .line 1236
    goto :goto_c

    .line 1237
    :cond_1d
    invoke-direct {v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getRequiredRotation()I

    .line 1238
    .line 1239
    .line 1240
    move-result v0

    .line 1241
    if-ne v0, v13, :cond_1e

    .line 1242
    .line 1243
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->matrix:Landroid/graphics/Matrix;

    .line 1244
    .line 1245
    iget v3, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 1246
    .line 1247
    iget v4, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight:I

    .line 1248
    .line 1249
    int-to-float v4, v4

    .line 1250
    mul-float/2addr v3, v4

    .line 1251
    invoke-virtual {v0, v3, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1252
    .line 1253
    .line 1254
    goto :goto_c

    .line 1255
    :cond_1e
    invoke-direct {v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getRequiredRotation()I

    .line 1256
    .line 1257
    .line 1258
    move-result v0

    .line 1259
    if-ne v0, v15, :cond_1f

    .line 1260
    .line 1261
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->matrix:Landroid/graphics/Matrix;

    .line 1262
    .line 1263
    iget v3, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 1264
    .line 1265
    iget v4, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth:I

    .line 1266
    .line 1267
    int-to-float v4, v4

    .line 1268
    mul-float/2addr v3, v4

    .line 1269
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1270
    .line 1271
    .line 1272
    :cond_1f
    :goto_c
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->tileBgPaint:Landroid/graphics/Paint;

    .line 1273
    .line 1274
    if-eqz v0, :cond_23

    .line 1275
    .line 1276
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sRect:Landroid/graphics/RectF;

    .line 1277
    .line 1278
    if-nez v0, :cond_20

    .line 1279
    .line 1280
    new-instance v0, Landroid/graphics/RectF;

    .line 1281
    .line 1282
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 1283
    .line 1284
    .line 1285
    iput-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sRect:Landroid/graphics/RectF;

    .line 1286
    .line 1287
    :cond_20
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sRect:Landroid/graphics/RectF;

    .line 1288
    .line 1289
    iget-boolean v3, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapIsPreview:Z

    .line 1290
    .line 1291
    if-eqz v3, :cond_21

    .line 1292
    .line 1293
    iget-object v3, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmap:Landroid/graphics/Bitmap;

    .line 1294
    .line 1295
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1296
    .line 1297
    .line 1298
    move-result v3

    .line 1299
    :goto_d
    int-to-float v3, v3

    .line 1300
    goto :goto_e

    .line 1301
    :cond_21
    iget v3, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth:I

    .line 1302
    .line 1303
    goto :goto_d

    .line 1304
    :goto_e
    iget-boolean v4, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapIsPreview:Z

    .line 1305
    .line 1306
    if-eqz v4, :cond_22

    .line 1307
    .line 1308
    iget-object v4, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmap:Landroid/graphics/Bitmap;

    .line 1309
    .line 1310
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1311
    .line 1312
    .line 1313
    move-result v4

    .line 1314
    :goto_f
    int-to-float v4, v4

    .line 1315
    goto :goto_10

    .line 1316
    :cond_22
    iget v4, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight:I

    .line 1317
    .line 1318
    goto :goto_f

    .line 1319
    :goto_10
    invoke-virtual {v0, v2, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 1320
    .line 1321
    .line 1322
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->matrix:Landroid/graphics/Matrix;

    .line 1323
    .line 1324
    iget-object v2, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sRect:Landroid/graphics/RectF;

    .line 1325
    .line 1326
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 1327
    .line 1328
    .line 1329
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sRect:Landroid/graphics/RectF;

    .line 1330
    .line 1331
    iget-object v2, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->tileBgPaint:Landroid/graphics/Paint;

    .line 1332
    .line 1333
    invoke-virtual {v11, v0, v2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 1334
    .line 1335
    .line 1336
    :cond_23
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmap:Landroid/graphics/Bitmap;

    .line 1337
    .line 1338
    iget-object v2, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->matrix:Landroid/graphics/Matrix;

    .line 1339
    .line 1340
    iget-object v3, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapPaint:Landroid/graphics/Paint;

    .line 1341
    .line 1342
    invoke-virtual {v11, v0, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 1343
    .line 1344
    .line 1345
    :cond_24
    :goto_11
    iget-boolean v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debug:Z

    .line 1346
    .line 1347
    if-eqz v0, :cond_29

    .line 1348
    .line 1349
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1350
    .line 1351
    const-string v2, "Scale: "

    .line 1352
    .line 1353
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1354
    .line 1355
    .line 1356
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 1357
    .line 1358
    iget v3, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 1359
    .line 1360
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v3

    .line 1364
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v3

    .line 1368
    const-string v4, "%.2f"

    .line 1369
    .line 1370
    invoke-static {v2, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v3

    .line 1374
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1375
    .line 1376
    .line 1377
    const-string v3, " ("

    .line 1378
    .line 1379
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1380
    .line 1381
    .line 1382
    invoke-direct {v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->minScale()F

    .line 1383
    .line 1384
    .line 1385
    move-result v3

    .line 1386
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v3

    .line 1390
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v3

    .line 1394
    invoke-static {v2, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v3

    .line 1398
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1399
    .line 1400
    .line 1401
    const-string v3, " - "

    .line 1402
    .line 1403
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1404
    .line 1405
    .line 1406
    iget v3, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxScale:F

    .line 1407
    .line 1408
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v3

    .line 1412
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v3

    .line 1416
    invoke-static {v2, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v3

    .line 1420
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1421
    .line 1422
    .line 1423
    const-string v3, ")"

    .line 1424
    .line 1425
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1426
    .line 1427
    .line 1428
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1429
    .line 1430
    .line 1431
    move-result-object v0

    .line 1432
    invoke-direct {v1, v14}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->px(I)I

    .line 1433
    .line 1434
    .line 1435
    move-result v3

    .line 1436
    int-to-float v3, v3

    .line 1437
    const/16 v5, 0xf

    .line 1438
    .line 1439
    invoke-direct {v1, v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->px(I)I

    .line 1440
    .line 1441
    .line 1442
    move-result v5

    .line 1443
    int-to-float v5, v5

    .line 1444
    iget-object v6, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugTextPaint:Landroid/graphics/Paint;

    .line 1445
    .line 1446
    invoke-virtual {v11, v0, v3, v5, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 1447
    .line 1448
    .line 1449
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1450
    .line 1451
    const-string v3, "Translate: "

    .line 1452
    .line 1453
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1454
    .line 1455
    .line 1456
    iget-object v3, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 1457
    .line 1458
    iget v3, v3, Landroid/graphics/PointF;->x:F

    .line 1459
    .line 1460
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v3

    .line 1464
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v3

    .line 1468
    invoke-static {v2, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v3

    .line 1472
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1473
    .line 1474
    .line 1475
    const-string v3, ":"

    .line 1476
    .line 1477
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1478
    .line 1479
    .line 1480
    iget-object v5, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 1481
    .line 1482
    iget v5, v5, Landroid/graphics/PointF;->y:F

    .line 1483
    .line 1484
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v5

    .line 1488
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v5

    .line 1492
    invoke-static {v2, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v5

    .line 1496
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1497
    .line 1498
    .line 1499
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v0

    .line 1503
    invoke-direct {v1, v14}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->px(I)I

    .line 1504
    .line 1505
    .line 1506
    move-result v5

    .line 1507
    int-to-float v5, v5

    .line 1508
    const/16 v6, 0x1e

    .line 1509
    .line 1510
    invoke-direct {v1, v6}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->px(I)I

    .line 1511
    .line 1512
    .line 1513
    move-result v7

    .line 1514
    int-to-float v7, v7

    .line 1515
    iget-object v8, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugTextPaint:Landroid/graphics/Paint;

    .line 1516
    .line 1517
    invoke-virtual {v11, v0, v5, v7, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 1518
    .line 1519
    .line 1520
    invoke-virtual {v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getCenter()Landroid/graphics/PointF;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v0

    .line 1524
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1525
    .line 1526
    const-string v7, "Source center: "

    .line 1527
    .line 1528
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1529
    .line 1530
    .line 1531
    iget v7, v0, Landroid/graphics/PointF;->x:F

    .line 1532
    .line 1533
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v7

    .line 1537
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v7

    .line 1541
    invoke-static {v2, v4, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v7

    .line 1545
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1546
    .line 1547
    .line 1548
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1549
    .line 1550
    .line 1551
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 1552
    .line 1553
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v0

    .line 1557
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v0

    .line 1561
    invoke-static {v2, v4, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v0

    .line 1565
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1566
    .line 1567
    .line 1568
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v0

    .line 1572
    invoke-direct {v1, v14}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->px(I)I

    .line 1573
    .line 1574
    .line 1575
    move-result v2

    .line 1576
    int-to-float v2, v2

    .line 1577
    const/16 v3, 0x2d

    .line 1578
    .line 1579
    invoke-direct {v1, v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->px(I)I

    .line 1580
    .line 1581
    .line 1582
    move-result v3

    .line 1583
    int-to-float v3, v3

    .line 1584
    iget-object v4, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugTextPaint:Landroid/graphics/Paint;

    .line 1585
    .line 1586
    invoke-virtual {v11, v0, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 1587
    .line 1588
    .line 1589
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 1590
    .line 1591
    const v2, -0xff0001

    .line 1592
    .line 1593
    .line 1594
    const v3, -0xffff01

    .line 1595
    .line 1596
    .line 1597
    const/16 v4, 0x14

    .line 1598
    .line 1599
    const/high16 v5, -0x10000

    .line 1600
    .line 1601
    if-eqz v0, :cond_25

    .line 1602
    .line 1603
    invoke-static {v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$4400(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)Landroid/graphics/PointF;

    .line 1604
    .line 1605
    .line 1606
    move-result-object v0

    .line 1607
    invoke-virtual {v1, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sourceToViewCoord(Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v0

    .line 1611
    iget-object v7, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 1612
    .line 1613
    invoke-static {v7}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$4500(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)Landroid/graphics/PointF;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v7

    .line 1617
    invoke-virtual {v1, v7}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sourceToViewCoord(Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v7

    .line 1621
    iget-object v8, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 1622
    .line 1623
    invoke-static {v8}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$3800(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)Landroid/graphics/PointF;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v8

    .line 1627
    invoke-virtual {v1, v8}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sourceToViewCoord(Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v8

    .line 1631
    iget v9, v0, Landroid/graphics/PointF;->x:F

    .line 1632
    .line 1633
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 1634
    .line 1635
    const/16 v10, 0xa

    .line 1636
    .line 1637
    invoke-direct {v1, v10}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->px(I)I

    .line 1638
    .line 1639
    .line 1640
    move-result v10

    .line 1641
    int-to-float v10, v10

    .line 1642
    iget-object v12, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugLinePaint:Landroid/graphics/Paint;

    .line 1643
    .line 1644
    invoke-virtual {v11, v9, v0, v10, v12}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 1645
    .line 1646
    .line 1647
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugLinePaint:Landroid/graphics/Paint;

    .line 1648
    .line 1649
    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 1650
    .line 1651
    .line 1652
    iget v0, v7, Landroid/graphics/PointF;->x:F

    .line 1653
    .line 1654
    iget v7, v7, Landroid/graphics/PointF;->y:F

    .line 1655
    .line 1656
    invoke-direct {v1, v4}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->px(I)I

    .line 1657
    .line 1658
    .line 1659
    move-result v9

    .line 1660
    int-to-float v9, v9

    .line 1661
    iget-object v10, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugLinePaint:Landroid/graphics/Paint;

    .line 1662
    .line 1663
    invoke-virtual {v11, v0, v7, v9, v10}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 1664
    .line 1665
    .line 1666
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugLinePaint:Landroid/graphics/Paint;

    .line 1667
    .line 1668
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 1669
    .line 1670
    .line 1671
    iget v0, v8, Landroid/graphics/PointF;->x:F

    .line 1672
    .line 1673
    iget v7, v8, Landroid/graphics/PointF;->y:F

    .line 1674
    .line 1675
    const/16 v8, 0x19

    .line 1676
    .line 1677
    invoke-direct {v1, v8}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->px(I)I

    .line 1678
    .line 1679
    .line 1680
    move-result v8

    .line 1681
    int-to-float v8, v8

    .line 1682
    iget-object v9, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugLinePaint:Landroid/graphics/Paint;

    .line 1683
    .line 1684
    invoke-virtual {v11, v0, v7, v8, v9}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 1685
    .line 1686
    .line 1687
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugLinePaint:Landroid/graphics/Paint;

    .line 1688
    .line 1689
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 1690
    .line 1691
    .line 1692
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 1693
    .line 1694
    .line 1695
    move-result v0

    .line 1696
    div-int/lit8 v0, v0, 0x2

    .line 1697
    .line 1698
    int-to-float v0, v0

    .line 1699
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 1700
    .line 1701
    .line 1702
    move-result v7

    .line 1703
    div-int/lit8 v7, v7, 0x2

    .line 1704
    .line 1705
    int-to-float v7, v7

    .line 1706
    invoke-direct {v1, v6}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->px(I)I

    .line 1707
    .line 1708
    .line 1709
    move-result v8

    .line 1710
    int-to-float v8, v8

    .line 1711
    iget-object v9, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugLinePaint:Landroid/graphics/Paint;

    .line 1712
    .line 1713
    invoke-virtual {v11, v0, v7, v8, v9}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 1714
    .line 1715
    .line 1716
    :cond_25
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vCenterStart:Landroid/graphics/PointF;

    .line 1717
    .line 1718
    if-eqz v0, :cond_26

    .line 1719
    .line 1720
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugLinePaint:Landroid/graphics/Paint;

    .line 1721
    .line 1722
    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 1723
    .line 1724
    .line 1725
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vCenterStart:Landroid/graphics/PointF;

    .line 1726
    .line 1727
    iget v5, v0, Landroid/graphics/PointF;->x:F

    .line 1728
    .line 1729
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 1730
    .line 1731
    invoke-direct {v1, v4}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->px(I)I

    .line 1732
    .line 1733
    .line 1734
    move-result v4

    .line 1735
    int-to-float v4, v4

    .line 1736
    iget-object v7, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugLinePaint:Landroid/graphics/Paint;

    .line 1737
    .line 1738
    invoke-virtual {v11, v5, v0, v4, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 1739
    .line 1740
    .line 1741
    :cond_26
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleSCenter:Landroid/graphics/PointF;

    .line 1742
    .line 1743
    if-eqz v0, :cond_27

    .line 1744
    .line 1745
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugLinePaint:Landroid/graphics/Paint;

    .line 1746
    .line 1747
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 1748
    .line 1749
    .line 1750
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleSCenter:Landroid/graphics/PointF;

    .line 1751
    .line 1752
    iget v0, v0, Landroid/graphics/PointF;->x:F

    .line 1753
    .line 1754
    invoke-direct {v1, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sourceToViewX(F)F

    .line 1755
    .line 1756
    .line 1757
    move-result v0

    .line 1758
    iget-object v3, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleSCenter:Landroid/graphics/PointF;

    .line 1759
    .line 1760
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 1761
    .line 1762
    invoke-direct {v1, v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sourceToViewY(F)F

    .line 1763
    .line 1764
    .line 1765
    move-result v3

    .line 1766
    const/16 v4, 0x23

    .line 1767
    .line 1768
    invoke-direct {v1, v4}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->px(I)I

    .line 1769
    .line 1770
    .line 1771
    move-result v4

    .line 1772
    int-to-float v4, v4

    .line 1773
    iget-object v5, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugLinePaint:Landroid/graphics/Paint;

    .line 1774
    .line 1775
    invoke-virtual {v11, v0, v3, v4, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 1776
    .line 1777
    .line 1778
    :cond_27
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleVStart:Landroid/graphics/PointF;

    .line 1779
    .line 1780
    if-eqz v0, :cond_28

    .line 1781
    .line 1782
    iget-boolean v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isQuickScaling:Z

    .line 1783
    .line 1784
    if-eqz v0, :cond_28

    .line 1785
    .line 1786
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugLinePaint:Landroid/graphics/Paint;

    .line 1787
    .line 1788
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 1789
    .line 1790
    .line 1791
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleVStart:Landroid/graphics/PointF;

    .line 1792
    .line 1793
    iget v2, v0, Landroid/graphics/PointF;->x:F

    .line 1794
    .line 1795
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 1796
    .line 1797
    invoke-direct {v1, v6}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->px(I)I

    .line 1798
    .line 1799
    .line 1800
    move-result v3

    .line 1801
    int-to-float v3, v3

    .line 1802
    iget-object v4, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugLinePaint:Landroid/graphics/Paint;

    .line 1803
    .line 1804
    invoke-virtual {v11, v2, v0, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 1805
    .line 1806
    .line 1807
    :cond_28
    iget-object v0, v1, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugLinePaint:Landroid/graphics/Paint;

    .line 1808
    .line 1809
    const v1, -0xff01

    .line 1810
    .line 1811
    .line 1812
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 1813
    .line 1814
    .line 1815
    :cond_29
    :goto_12
    return-void
.end method

.method public onImageLoaded()V
    .locals 0

    .line 106
    return-void
.end method

.method public onMeasure(II)V
    .locals 5

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    const/high16 v4, 0x40000000    # 2.0f

    .line 20
    .line 21
    if-eq v0, v4, :cond_0

    .line 22
    .line 23
    move v0, v3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v0, v2

    .line 26
    :goto_0
    if-eq v1, v4, :cond_1

    .line 27
    .line 28
    move v2, v3

    .line 29
    :cond_1
    iget v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth:I

    .line 30
    .line 31
    if-lez v1, :cond_4

    .line 32
    .line 33
    iget v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight:I

    .line 34
    .line 35
    if-lez v1, :cond_4

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight()I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    if-eqz v2, :cond_3

    .line 51
    .line 52
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight()I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    int-to-double v0, p2

    .line 57
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth()I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    int-to-double v2, p2

    .line 62
    div-double/2addr v0, v2

    .line 63
    int-to-double v2, p1

    .line 64
    mul-double/2addr v0, v2

    .line 65
    double-to-int p2, v0

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    if-eqz v0, :cond_4

    .line 68
    .line 69
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    int-to-double v0, p1

    .line 74
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    int-to-double v2, p1

    .line 79
    div-double/2addr v0, v2

    .line 80
    int-to-double v2, p2

    .line 81
    mul-double/2addr v0, v2

    .line 82
    double-to-int p1, v0

    .line 83
    :cond_4
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public onReady()V
    .locals 0

    .line 1
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p4

    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    filled-new-array {p3, p4, p1, p2}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string p2, "onSizeChanged %dx%d -> %dx%d"

    .line 22
    .line 23
    invoke-direct {p0, p2, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getCenter()Landroid/graphics/PointF;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-boolean p2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->readySent:Z

    .line 31
    .line 32
    if-eqz p2, :cond_0

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    const/4 p2, 0x0

    .line 37
    iput-object p2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 38
    .line 39
    iget p2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 40
    .line 41
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    iput-object p2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->pendingScale:Ljava/lang/Float;

    .line 46
    .line 47
    iput-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sPendingCenter:Landroid/graphics/PointF;

    .line 48
    .line 49
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-static {v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$2700(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-direct {p0, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->requestDisallowInterceptTouchEvent(Z)V

    .line 13
    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-static {v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$2800(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnAnimationEventListener;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    :try_start_0
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;->access$2800(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;)Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnAnimationEventListener;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnAnimationEventListener;->onInterruptedByUser()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catch_0
    move-exception v0

    .line 37
    sget-object v2, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->TAG:Ljava/lang/String;

    .line 38
    .line 39
    const-string v3, "Error thrown by animation listener"

    .line 40
    .line 41
    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 42
    .line 43
    .line 44
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 45
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 46
    .line 47
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 48
    .line 49
    if-nez v0, :cond_3

    .line 50
    .line 51
    iget-object p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->singleDetector:Landroid/view/GestureDetector;

    .line 52
    .line 53
    if-eqz p0, :cond_2

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 56
    .line 57
    .line 58
    :cond_2
    return v1

    .line 59
    :cond_3
    iget-boolean v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isQuickScaling:Z

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    if-nez v0, :cond_5

    .line 63
    .line 64
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->detector:Landroid/view/GestureDetector;

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    :cond_4
    iput-boolean v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isZooming:Z

    .line 75
    .line 76
    iput-boolean v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isPanning:Z

    .line 77
    .line 78
    iput v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxTouchCount:I

    .line 79
    .line 80
    return v1

    .line 81
    :cond_5
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateStart:Landroid/graphics/PointF;

    .line 82
    .line 83
    const/4 v3, 0x0

    .line 84
    if-nez v0, :cond_6

    .line 85
    .line 86
    new-instance v0, Landroid/graphics/PointF;

    .line 87
    .line 88
    invoke-direct {v0, v3, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateStart:Landroid/graphics/PointF;

    .line 92
    .line 93
    :cond_6
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateBefore:Landroid/graphics/PointF;

    .line 94
    .line 95
    if-nez v0, :cond_7

    .line 96
    .line 97
    new-instance v0, Landroid/graphics/PointF;

    .line 98
    .line 99
    invoke-direct {v0, v3, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 100
    .line 101
    .line 102
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateBefore:Landroid/graphics/PointF;

    .line 103
    .line 104
    :cond_7
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vCenterStart:Landroid/graphics/PointF;

    .line 105
    .line 106
    if-nez v0, :cond_8

    .line 107
    .line 108
    new-instance v0, Landroid/graphics/PointF;

    .line 109
    .line 110
    invoke-direct {v0, v3, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 111
    .line 112
    .line 113
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vCenterStart:Landroid/graphics/PointF;

    .line 114
    .line 115
    :cond_8
    iget v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 116
    .line 117
    iget-object v3, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateBefore:Landroid/graphics/PointF;

    .line 118
    .line 119
    iget-object v4, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 120
    .line 121
    invoke-virtual {v3, v4}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 122
    .line 123
    .line 124
    invoke-direct {p0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onTouchEventInternal(Landroid/view/MotionEvent;)Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    iget-object v4, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslateBefore:Landroid/graphics/PointF;

    .line 129
    .line 130
    const/4 v5, 0x2

    .line 131
    invoke-direct {p0, v0, v4, v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sendStateChanged(FLandroid/graphics/PointF;I)V

    .line 132
    .line 133
    .line 134
    if-nez v3, :cond_a

    .line 135
    .line 136
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    if-eqz p0, :cond_9

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_9
    move v1, v2

    .line 144
    :cond_a
    :goto_1
    return v1
.end method

.method public recycle()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->reset(Z)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapPaint:Landroid/graphics/Paint;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugTextPaint:Landroid/graphics/Paint;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debugLinePaint:Landroid/graphics/Paint;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->tileBgPaint:Landroid/graphics/Paint;

    .line 13
    .line 14
    return-void
.end method

.method public final resetScaleAndCenter()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->limitedScale(F)F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->pendingScale:Ljava/lang/Float;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isReady()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    new-instance v0, Landroid/graphics/PointF;

    .line 22
    .line 23
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    div-int/lit8 v1, v1, 0x2

    .line 28
    .line 29
    int-to-float v1, v1

    .line 30
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    div-int/lit8 v2, v2, 0x2

    .line 35
    .line 36
    int-to-float v2, v2

    .line 37
    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sPendingCenter:Landroid/graphics/PointF;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    new-instance v1, Landroid/graphics/PointF;

    .line 44
    .line 45
    invoke-direct {v1, v0, v0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 46
    .line 47
    .line 48
    iput-object v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sPendingCenter:Landroid/graphics/PointF;

    .line 49
    .line 50
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final setBitmapDecoderClass(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/davemorrissey/labs/subscaleview/decoder/ImageDecoder;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lcom/davemorrissey/labs/subscaleview/decoder/CompatDecoderFactory;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lcom/davemorrissey/labs/subscaleview/decoder/CompatDecoderFactory;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapDecoderFactory:Lcom/davemorrissey/labs/subscaleview/decoder/DecoderFactory;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p0, "Decoder class cannot be set to null"

    .line 12
    .line 13
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setBitmapDecoderFactory(Lcom/davemorrissey/labs/subscaleview/decoder/DecoderFactory;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/davemorrissey/labs/subscaleview/decoder/DecoderFactory<",
            "+",
            "Lcom/davemorrissey/labs/subscaleview/decoder/ImageDecoder;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapDecoderFactory:Lcom/davemorrissey/labs/subscaleview/decoder/DecoderFactory;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "Decoder factory cannot be set to null"

    .line 7
    .line 8
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setDebug(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->debug:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setDoubleTapZoomDpi(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v1, v0, Landroid/util/DisplayMetrics;->xdpi:F

    .line 10
    .line 11
    iget v0, v0, Landroid/util/DisplayMetrics;->ydpi:F

    .line 12
    .line 13
    add-float/2addr v1, v0

    .line 14
    const/high16 v0, 0x40000000    # 2.0f

    .line 15
    .line 16
    div-float/2addr v1, v0

    .line 17
    int-to-float p1, p1

    .line 18
    div-float/2addr v1, p1

    .line 19
    invoke-virtual {p0, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setDoubleTapZoomScale(F)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final setDoubleTapZoomDuration(I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    iput p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->doubleTapZoomDuration:I

    .line 7
    .line 8
    return-void
.end method

.method public final setDoubleTapZoomScale(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->doubleTapZoomScale:F

    .line 2
    .line 3
    return-void
.end method

.method public final setDoubleTapZoomStyle(I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->VALID_ZOOM_STYLES:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iput p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->doubleTapZoomStyle:I

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const-string p0, "Invalid zoom style: "

    .line 17
    .line 18
    invoke-static {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public setEagerLoadingEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->eagerLoadingEnabled:Z

    .line 2
    .line 3
    return-void
.end method

.method public setExecutor(Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->executor:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "Executor must not be null"

    .line 7
    .line 8
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setImage(Lcom/davemorrissey/labs/subscaleview/ImageSource;)V
    .locals 1

    const/4 v0, 0x0

    .line 332
    invoke-virtual {p0, p1, v0, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setImage(Lcom/davemorrissey/labs/subscaleview/ImageSource;Lcom/davemorrissey/labs/subscaleview/ImageSource;Lcom/davemorrissey/labs/subscaleview/ImageViewState;)V

    return-void
.end method

.method public final setImage(Lcom/davemorrissey/labs/subscaleview/ImageSource;Lcom/davemorrissey/labs/subscaleview/ImageSource;)V
    .locals 1

    const/4 v0, 0x0

    .line 331
    invoke-virtual {p0, p1, p2, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setImage(Lcom/davemorrissey/labs/subscaleview/ImageSource;Lcom/davemorrissey/labs/subscaleview/ImageSource;Lcom/davemorrissey/labs/subscaleview/ImageViewState;)V

    return-void
.end method

.method public final setImage(Lcom/davemorrissey/labs/subscaleview/ImageSource;Lcom/davemorrissey/labs/subscaleview/ImageSource;Lcom/davemorrissey/labs/subscaleview/ImageViewState;)V
    .locals 8

    .line 1
    if-eqz p1, :cond_b

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    invoke-direct {p0, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->reset(Z)V

    .line 5
    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->restoreState(Lcom/davemorrissey/labs/subscaleview/ImageViewState;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    const-string v6, "/"

    .line 13
    .line 14
    const-string v7, "android.resource://"

    .line 15
    .line 16
    if-eqz p2, :cond_5

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getBitmap()Landroid/graphics/Bitmap;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-nez v0, :cond_4

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getSWidth()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-lez v0, :cond_3

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getSHeight()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-lez v0, :cond_3

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getSWidth()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iput v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth:I

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getSHeight()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iput v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight:I

    .line 47
    .line 48
    invoke-virtual {p2}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getSRegion()Landroid/graphics/Rect;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->pRegion:Landroid/graphics/Rect;

    .line 53
    .line 54
    invoke-virtual {p2}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getBitmap()Landroid/graphics/Bitmap;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    invoke-virtual {p2}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->isCached()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iput-boolean v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapIsCached:Z

    .line 65
    .line 66
    invoke-virtual {p2}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getBitmap()Landroid/graphics/Bitmap;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-direct {p0, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onPreviewLoaded(Landroid/graphics/Bitmap;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {p2}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getUri()Landroid/net/Uri;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-nez v0, :cond_2

    .line 79
    .line 80
    invoke-virtual {p2}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getResource()Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    if-eqz v2, :cond_2

    .line 85
    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getResource()Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    :cond_2
    move-object v4, v0

    .line 121
    new-instance v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$BitmapLoadTask;

    .line 122
    .line 123
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    iget-object v3, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapDecoderFactory:Lcom/davemorrissey/labs/subscaleview/decoder/DecoderFactory;

    .line 128
    .line 129
    const/4 v5, 0x1

    .line 130
    move-object v1, p0

    .line 131
    invoke-direct/range {v0 .. v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$BitmapLoadTask;-><init>(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Landroid/content/Context;Lcom/davemorrissey/labs/subscaleview/decoder/DecoderFactory;Landroid/net/Uri;Z)V

    .line 132
    .line 133
    .line 134
    invoke-direct {p0, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->execute(Landroid/os/AsyncTask;)V

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_3
    const-string v0, "Preview image cannot be used unless dimensions are provided for the main image"

    .line 139
    .line 140
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_4
    const-string v0, "Preview image cannot be used when a bitmap is provided for the main image"

    .line 145
    .line 146
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_5
    :goto_0
    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getBitmap()Landroid/graphics/Bitmap;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    const/4 v2, 0x0

    .line 155
    if-eqz v0, :cond_6

    .line 156
    .line 157
    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getSRegion()Landroid/graphics/Rect;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    if-eqz v0, :cond_6

    .line 162
    .line 163
    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getBitmap()Landroid/graphics/Bitmap;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getSRegion()Landroid/graphics/Rect;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    iget v3, v3, Landroid/graphics/Rect;->left:I

    .line 172
    .line 173
    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getSRegion()Landroid/graphics/Rect;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    iget v4, v4, Landroid/graphics/Rect;->top:I

    .line 178
    .line 179
    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getSRegion()Landroid/graphics/Rect;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getSRegion()Landroid/graphics/Rect;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    invoke-static {v0, v3, v4, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-direct {p0, v0, v2, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onImageLoaded(Landroid/graphics/Bitmap;IZ)V

    .line 200
    .line 201
    .line 202
    return-void

    .line 203
    :cond_6
    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getBitmap()Landroid/graphics/Bitmap;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    if-eqz v0, :cond_7

    .line 208
    .line 209
    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getBitmap()Landroid/graphics/Bitmap;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->isCached()Z

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    invoke-direct {p0, v0, v2, v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onImageLoaded(Landroid/graphics/Bitmap;IZ)V

    .line 218
    .line 219
    .line 220
    return-void

    .line 221
    :cond_7
    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getSRegion()Landroid/graphics/Rect;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sRegion:Landroid/graphics/Rect;

    .line 226
    .line 227
    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getUri()Landroid/net/Uri;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->uri:Landroid/net/Uri;

    .line 232
    .line 233
    if-nez v0, :cond_8

    .line 234
    .line 235
    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getResource()Ljava/lang/Integer;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    if-eqz v0, :cond_8

    .line 240
    .line 241
    new-instance v0, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getResource()Ljava/lang/Integer;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->uri:Landroid/net/Uri;

    .line 276
    .line 277
    :cond_8
    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->getTile()Z

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    if-nez v0, :cond_a

    .line 282
    .line 283
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sRegion:Landroid/graphics/Rect;

    .line 284
    .line 285
    if-eqz v0, :cond_9

    .line 286
    .line 287
    goto :goto_1

    .line 288
    :cond_9
    new-instance v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$BitmapLoadTask;

    .line 289
    .line 290
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    iget-object v3, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->bitmapDecoderFactory:Lcom/davemorrissey/labs/subscaleview/decoder/DecoderFactory;

    .line 295
    .line 296
    iget-object v4, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->uri:Landroid/net/Uri;

    .line 297
    .line 298
    const/4 v5, 0x0

    .line 299
    move-object v1, p0

    .line 300
    invoke-direct/range {v0 .. v5}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$BitmapLoadTask;-><init>(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Landroid/content/Context;Lcom/davemorrissey/labs/subscaleview/decoder/DecoderFactory;Landroid/net/Uri;Z)V

    .line 301
    .line 302
    .line 303
    invoke-direct {p0, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->execute(Landroid/os/AsyncTask;)V

    .line 304
    .line 305
    .line 306
    return-void

    .line 307
    :cond_a
    :goto_1
    new-instance v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$TilesInitTask;

    .line 308
    .line 309
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    iget-object v3, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->regionDecoderFactory:Lcom/davemorrissey/labs/subscaleview/decoder/DecoderFactory;

    .line 314
    .line 315
    iget-object v4, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->uri:Landroid/net/Uri;

    .line 316
    .line 317
    invoke-direct {v0, p0, v2, v3, v4}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$TilesInitTask;-><init>(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;Landroid/content/Context;Lcom/davemorrissey/labs/subscaleview/decoder/DecoderFactory;Landroid/net/Uri;)V

    .line 318
    .line 319
    .line 320
    invoke-direct {p0, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->execute(Landroid/os/AsyncTask;)V

    .line 321
    .line 322
    .line 323
    return-void

    .line 324
    :cond_b
    const-string v0, "imageSource must not be null"

    .line 325
    .line 326
    invoke-static {v0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    return-void
.end method

.method public final setImage(Lcom/davemorrissey/labs/subscaleview/ImageSource;Lcom/davemorrissey/labs/subscaleview/ImageViewState;)V
    .locals 1

    const/4 v0, 0x0

    .line 330
    invoke-virtual {p0, p1, v0, p2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setImage(Lcom/davemorrissey/labs/subscaleview/ImageSource;Lcom/davemorrissey/labs/subscaleview/ImageSource;Lcom/davemorrissey/labs/subscaleview/ImageViewState;)V

    return-void
.end method

.method public final setMaxScale(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxScale:F

    .line 2
    .line 3
    return-void
.end method

.method public setMaxTileSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxTileWidth:I

    .line 2
    .line 3
    iput p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxTileHeight:I

    .line 4
    .line 5
    return-void
.end method

.method public setMaxTileSize(II)V
    .locals 0

    .line 6
    iput p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxTileWidth:I

    .line 7
    iput p2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->maxTileHeight:I

    return-void
.end method

.method public final setMaximumDpi(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v1, v0, Landroid/util/DisplayMetrics;->xdpi:F

    .line 10
    .line 11
    iget v0, v0, Landroid/util/DisplayMetrics;->ydpi:F

    .line 12
    .line 13
    add-float/2addr v1, v0

    .line 14
    const/high16 v0, 0x40000000    # 2.0f

    .line 15
    .line 16
    div-float/2addr v1, v0

    .line 17
    int-to-float p1, p1

    .line 18
    div-float/2addr v1, p1

    .line 19
    invoke-virtual {p0, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setMinScale(F)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final setMinScale(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->minScale:F

    .line 2
    .line 3
    return-void
.end method

.method public final setMinimumDpi(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v1, v0, Landroid/util/DisplayMetrics;->xdpi:F

    .line 10
    .line 11
    iget v0, v0, Landroid/util/DisplayMetrics;->ydpi:F

    .line 12
    .line 13
    add-float/2addr v1, v0

    .line 14
    const/high16 v0, 0x40000000    # 2.0f

    .line 15
    .line 16
    div-float/2addr v1, v0

    .line 17
    int-to-float p1, p1

    .line 18
    div-float/2addr v1, p1

    .line 19
    invoke-virtual {p0, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setMaxScale(F)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final setMinimumScaleType(I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->VALID_SCALE_TYPES:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iput p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->minimumScaleType:I

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isReady()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    invoke-direct {p0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fitToBounds(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void

    .line 29
    :cond_1
    const-string p0, "Invalid scale type: "

    .line 30
    .line 31
    invoke-static {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public setMinimumTileDpi(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v1, v0, Landroid/util/DisplayMetrics;->xdpi:F

    .line 10
    .line 11
    iget v0, v0, Landroid/util/DisplayMetrics;->ydpi:F

    .line 12
    .line 13
    add-float/2addr v1, v0

    .line 14
    const/high16 v0, 0x40000000    # 2.0f

    .line 15
    .line 16
    div-float/2addr v1, v0

    .line 17
    int-to-float p1, p1

    .line 18
    invoke-static {v1, p1}, Ljava/lang/Math;->min(FF)F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    float-to-int p1, p1

    .line 23
    iput p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->minimumTileDpi:I

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isReady()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    invoke-direct {p0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->reset(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void
.end method

.method public setOnImageEventListener(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnImageEventListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onImageEventListener:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnImageEventListener;

    .line 2
    .line 3
    return-void
.end method

.method public setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onLongClickListener:Landroid/view/View$OnLongClickListener;

    .line 2
    .line 3
    return-void
.end method

.method public setOnStateChangedListener(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnStateChangedListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onStateChangedListener:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnStateChangedListener;

    .line 2
    .line 3
    return-void
.end method

.method public final setOrientation(I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->VALID_ORIENTATIONS:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iput p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->orientation:I

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-direct {p0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->reset(Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string p0, "Invalid orientation: "

    .line 27
    .line 28
    invoke-static {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final setPanEnabled(Z)V
    .locals 3

    .line 1
    iput-boolean p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->panEnabled:Z

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    div-int/lit8 v0, v0, 0x2

    .line 14
    .line 15
    int-to-float v0, v0

    .line 16
    iget v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    div-int/lit8 v2, v2, 0x2

    .line 23
    .line 24
    int-to-float v2, v2

    .line 25
    mul-float/2addr v1, v2

    .line 26
    sub-float/2addr v0, v1

    .line 27
    iput v0, p1, Landroid/graphics/PointF;->x:F

    .line 28
    .line 29
    iget-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    div-int/lit8 v0, v0, 0x2

    .line 36
    .line 37
    int-to-float v0, v0

    .line 38
    iget v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->scale:F

    .line 39
    .line 40
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    div-int/lit8 v2, v2, 0x2

    .line 45
    .line 46
    int-to-float v2, v2

    .line 47
    mul-float/2addr v1, v2

    .line 48
    sub-float/2addr v0, v1

    .line 49
    iput v0, p1, Landroid/graphics/PointF;->y:F

    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isReady()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_0

    .line 56
    .line 57
    const/4 p1, 0x1

    .line 58
    invoke-direct {p0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->refreshRequiredTiles(Z)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 62
    .line 63
    .line 64
    :cond_0
    return-void
.end method

.method public final setPanLimit(I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->VALID_PAN_LIMITS:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iput p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->panLimit:I

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isReady()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    invoke-direct {p0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fitToBounds(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void

    .line 29
    :cond_1
    const-string p0, "Invalid pan limit: "

    .line 30
    .line 31
    invoke-static {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final setQuickScaleEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->quickScaleEnabled:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setRegionDecoderClass(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/davemorrissey/labs/subscaleview/decoder/ImageRegionDecoder;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lcom/davemorrissey/labs/subscaleview/decoder/CompatDecoderFactory;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lcom/davemorrissey/labs/subscaleview/decoder/CompatDecoderFactory;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->regionDecoderFactory:Lcom/davemorrissey/labs/subscaleview/decoder/DecoderFactory;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p0, "Decoder class cannot be set to null"

    .line 12
    .line 13
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setRegionDecoderFactory(Lcom/davemorrissey/labs/subscaleview/decoder/DecoderFactory;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/davemorrissey/labs/subscaleview/decoder/DecoderFactory<",
            "+",
            "Lcom/davemorrissey/labs/subscaleview/decoder/ImageRegionDecoder;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->regionDecoderFactory:Lcom/davemorrissey/labs/subscaleview/decoder/DecoderFactory;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "Decoder factory cannot be set to null"

    .line 7
    .line 8
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setScaleAndCenter(FLandroid/graphics/PointF;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->anim:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$Anim;

    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->pendingScale:Ljava/lang/Float;

    .line 9
    .line 10
    iput-object p2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sPendingCenter:Landroid/graphics/PointF;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sRequestedCenter:Landroid/graphics/PointF;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final setTileBackgroundColor(I)V
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->tileBgPaint:Landroid/graphics/Paint;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance v0, Landroid/graphics/Paint;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->tileBgPaint:Landroid/graphics/Paint;

    .line 17
    .line 18
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->tileBgPaint:Landroid/graphics/Paint;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final setZoomEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->zoomEnabled:Z

    .line 2
    .line 3
    return-void
.end method

.method public final sourceToViewCoord(FF)Landroid/graphics/PointF;
    .locals 1

    .line 19
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    invoke-virtual {p0, p1, p2, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sourceToViewCoord(FFLandroid/graphics/PointF;)Landroid/graphics/PointF;

    move-result-object p0

    return-object p0
.end method

.method public final sourceToViewCoord(FFLandroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-direct {p0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sourceToViewX(F)F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-direct {p0, p2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sourceToViewY(F)F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-virtual {p3, p1, p0}, Landroid/graphics/PointF;->set(FF)V

    .line 16
    .line 17
    .line 18
    return-object p3
.end method

.method public final sourceToViewCoord(Landroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 2

    .line 21
    iget v0, p1, Landroid/graphics/PointF;->x:F

    iget p1, p1, Landroid/graphics/PointF;->y:F

    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    invoke-virtual {p0, v0, p1, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sourceToViewCoord(FFLandroid/graphics/PointF;)Landroid/graphics/PointF;

    move-result-object p0

    return-object p0
.end method

.method public final sourceToViewCoord(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 1

    .line 20
    iget v0, p1, Landroid/graphics/PointF;->x:F

    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-virtual {p0, v0, p1, p2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sourceToViewCoord(FFLandroid/graphics/PointF;)Landroid/graphics/PointF;

    move-result-object p0

    return-object p0
.end method

.method public viewToFileRect(Landroid/graphics/Rect;Landroid/graphics/Rect;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->readySent:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget v0, p1, Landroid/graphics/Rect;->left:I

    .line 11
    .line 12
    int-to-float v0, v0

    .line 13
    invoke-direct {p0, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->viewToSourceX(F)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    float-to-int v0, v0

    .line 18
    iget v1, p1, Landroid/graphics/Rect;->top:I

    .line 19
    .line 20
    int-to-float v1, v1

    .line 21
    invoke-direct {p0, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->viewToSourceY(F)F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    float-to-int v1, v1

    .line 26
    iget v2, p1, Landroid/graphics/Rect;->right:I

    .line 27
    .line 28
    int-to-float v2, v2

    .line 29
    invoke-direct {p0, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->viewToSourceX(F)F

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    float-to-int v2, v2

    .line 34
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 35
    .line 36
    int-to-float p1, p1

    .line 37
    invoke-direct {p0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->viewToSourceY(F)F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    float-to-int p1, p1

    .line 42
    invoke-virtual {p2, v0, v1, v2, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, p2, p2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->fileSRect(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 46
    .line 47
    .line 48
    iget p1, p2, Landroid/graphics/Rect;->left:I

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    iget v1, p2, Landroid/graphics/Rect;->top:I

    .line 56
    .line 57
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget v1, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sWidth:I

    .line 62
    .line 63
    iget v2, p2, Landroid/graphics/Rect;->right:I

    .line 64
    .line 65
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    iget v2, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sHeight:I

    .line 70
    .line 71
    iget v3, p2, Landroid/graphics/Rect;->bottom:I

    .line 72
    .line 73
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    invoke-virtual {p2, p1, v0, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 78
    .line 79
    .line 80
    iget-object p0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->sRegion:Landroid/graphics/Rect;

    .line 81
    .line 82
    if-eqz p0, :cond_1

    .line 83
    .line 84
    iget p1, p0, Landroid/graphics/Rect;->left:I

    .line 85
    .line 86
    iget p0, p0, Landroid/graphics/Rect;->top:I

    .line 87
    .line 88
    invoke-virtual {p2, p1, p0}, Landroid/graphics/Rect;->offset(II)V

    .line 89
    .line 90
    .line 91
    :cond_1
    :goto_0
    return-void
.end method

.method public final viewToSourceCoord(FF)Landroid/graphics/PointF;
    .locals 1

    .line 19
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    invoke-virtual {p0, p1, p2, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->viewToSourceCoord(FFLandroid/graphics/PointF;)Landroid/graphics/PointF;

    move-result-object p0

    return-object p0
.end method

.method public final viewToSourceCoord(FFLandroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-direct {p0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->viewToSourceX(F)F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-direct {p0, p2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->viewToSourceY(F)F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-virtual {p3, p1, p0}, Landroid/graphics/PointF;->set(FF)V

    .line 16
    .line 17
    .line 18
    return-object p3
.end method

.method public final viewToSourceCoord(Landroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 2

    .line 21
    iget v0, p1, Landroid/graphics/PointF;->x:F

    iget p1, p1, Landroid/graphics/PointF;->y:F

    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    invoke-virtual {p0, v0, p1, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->viewToSourceCoord(FFLandroid/graphics/PointF;)Landroid/graphics/PointF;

    move-result-object p0

    return-object p0
.end method

.method public final viewToSourceCoord(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 1

    .line 20
    iget v0, p1, Landroid/graphics/PointF;->x:F

    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-virtual {p0, v0, p1, p2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->viewToSourceCoord(FFLandroid/graphics/PointF;)Landroid/graphics/PointF;

    move-result-object p0

    return-object p0
.end method

.method public visibleFileRect(Landroid/graphics/Rect;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->vTranslate:Landroid/graphics/PointF;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->readySent:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->viewToFileRect(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    :goto_0
    return-void
.end method
