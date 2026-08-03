.class public final Lcom/kongzue/dialogx/R$styleable;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kongzue/dialogx/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "styleable"
.end annotation


# static fields
.field public static DialogXBaseRelativeLayout:[I = null

.field public static DialogXBaseRelativeLayout_autoSafeArea:I = 0x0

.field public static DialogXBaseRelativeLayout_baseFocusable:I = 0x1

.field public static DialogXBaseRelativeLayout_interceptBack:I = 0x2

.field public static DialogXMaxLayout:[I = null

.field public static DialogXMaxLayout_dialogXSafetyMode:I = 0x0

.field public static DialogXMaxLayout_interceptTouch:I = 0x1

.field public static DialogXMaxLayout_lockWidth:I = 0x2

.field public static DialogXMaxLayout_maxLayoutHeight:I = 0x3

.field public static DialogXMaxLayout_maxLayoutWidth:I = 0x4

.field public static DialogXMaxLayout_minLayoutHeight:I = 0x5

.field public static DialogXMaxLayout_minLayoutWidth:I = 0x6

.field public static ProgressView:[I = null

.field public static ProgressView_progressStrokeColor:I = 0x0

.field public static ProgressView_progressStrokeWidth:I = 0x1

.field public static RealtimeBlurView:[I = null

.field public static RealtimeBlurView_dialogxDarkMode:I = 0x0

.field public static RealtimeBlurView_dialogxOverlayColorNoAlpha:I = 0x1

.field public static RealtimeBlurView_realtimeBlurRadius:I = 0x2

.field public static RealtimeBlurView_realtimeDownsampleFactor:I = 0x3

.field public static RealtimeBlurView_realtimeOverlayColor:I = 0x4

.field public static RealtimeBlurView_realtimeRadius:I = 0x5


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const v0, 0x40040064

    const v1, 0x40040224

    const v2, 0x4004003b

    filled-new-array {v2, v0, v1}, [I

    move-result-object v0

    sput-object v0, Lcom/kongzue/dialogx/R$styleable;->DialogXBaseRelativeLayout:[I

    const/4 v0, 0x7

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/kongzue/dialogx/R$styleable;->DialogXMaxLayout:[I

    const v0, 0x40040362

    const v1, 0x40040363

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sput-object v0, Lcom/kongzue/dialogx/R$styleable;->ProgressView:[I

    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/kongzue/dialogx/R$styleable;->RealtimeBlurView:[I

    return-void

    :array_0
    .array-data 4
        0x40040164
        0x40040225
        0x400402aa
        0x400402e8
        0x400402e9
        0x400402f4
        0x400402f5
    .end array-data

    :array_1
    .array-data 4
        0x40040165
        0x40040166
        0x4004036c
        0x4004036d
        0x4004036e
        0x4004036f
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
