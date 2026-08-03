.class public L۟/da;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    const/16 v0, 0x8

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    nop

    :array_0
    .array-data 1
        0x4ft
        0x26t
        0x7et
        -0x5ct
        -0x45t
        0x79t
        0x5at
        0x3ct
    .end array-data

    :array_1
    .array-data 1
        0x2et
        0x45t
        0xat
        -0x33t
        -0x33t
        0x10t
    .end array-data
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 4

    const/16 v0, 0x8

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    const/4 v2, 0x6

    new-array v3, v2, [B

    fill-array-data v3, :array_1

    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    new-array p1, v0, [B

    fill-array-data p1, :array_2

    new-array v0, v2, [B

    fill-array-data v0, :array_3

    invoke-static {p1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :array_0
    .array-data 1
        -0x8t
        -0x1bt
        0x37t
        -0x32t
        -0x1bt
        -0x46t
        -0x13t
        -0x1t
    .end array-data

    :array_1
    .array-data 1
        -0x67t
        -0x7at
        0x43t
        -0x59t
        -0x6dt
        -0x2dt
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x5ft
        -0x45t
        0x71t
        -0x7et
        0x46t
        -0x6t
        -0x46t
        -0x55t
    .end array-data

    :array_3
    .array-data 1
        -0x32t
        -0x32t
        0x5t
        -0x2ft
        0x32t
        -0x65t
    .end array-data
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 2

    const/16 v0, 0x8

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    nop

    :array_0
    .array-data 1
        0x58t
        -0x1t
        -0x25t
        0x33t
        0x19t
        -0x6bt
        0x4dt
        -0x1bt
    .end array-data

    :array_1
    .array-data 1
        0x39t
        -0x64t
        -0x51t
        0x5at
        0x6ft
        -0x4t
    .end array-data
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    const/16 v0, 0x8

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    nop

    :array_0
    .array-data 1
        -0x7ft
        -0x3ct
        0x1ft
        -0x69t
        -0x16t
        -0x59t
        -0x6ct
        -0x22t
    .end array-data

    :array_1
    .array-data 1
        -0x20t
        -0x59t
        0x6bt
        -0x2t
        -0x64t
        -0x32t
    .end array-data
.end method
