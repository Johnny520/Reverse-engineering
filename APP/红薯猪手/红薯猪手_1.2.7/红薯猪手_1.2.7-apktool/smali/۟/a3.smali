.class public final L۟/a3;
.super L۟/kc;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0, p1}, L۟/kc;-><init>(Landroid/content/Context;)V

    return-void

    nop

    :array_0
    .array-data 1
        -0x6ct
        -0x63t
        -0x27t
    .end array-data

    :array_1
    .array-data 1
        -0x9t
        -0x1bt
        -0x53t
        0x60t
        0x44t
        -0x5at
    .end array-data
.end method


# virtual methods
.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    :try_start_0
    invoke-super {p0, p1}, L۟/kc;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method
