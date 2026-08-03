.class public final Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase$a;
.super L۟/t5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, L۟/t5;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final ۥ(L۟/b3;)V
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v2, v1, [B

    fill-array-data v2, :array_1

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const/16 v0, 0x40

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    new-array v1, v1, [B

    fill-array-data v1, :array_3

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, L۟/b3;->ۥ۟۠(Ljava/lang/String;)V

    return-void

    :array_0
    .array-data 1
        -0x4t
        0x69t
        -0x39t
        0x2bt
        -0xet
        -0x3at
        -0x15t
        0x6dt
    .end array-data

    :array_1
    .array-data 1
        -0x68t
        0x8t
        -0x4dt
        0x4at
        -0x70t
        -0x59t
    .end array-data

    nop

    :array_2
    .array-data 1
        0x3dt
        -0x40t
        0x2dt
        -0x63t
        -0x34t
        0x4dt
        0x28t
        -0x33t
        0x3bt
        -0x6ct
        -0x25t
        0x4dt
        0x14t
        -0x7t
        0xat
        -0x43t
        -0x14t
        0x4dt
        0x3dt
        -0x38t
        0x3dt
        -0x8t
        -0x23t
        0x22t
        0x30t
        -0x27t
        0x34t
        -0x6at
        -0x42t
        0x4t
        0xct
        -0x40t
        0x16t
        -0x45t
        -0x1t
        0x19t
        0x15t
        -0x1dt
        0x17t
        -0x8t
        -0x36t
        0x28t
        0x24t
        -0x28t
        0x59t
        -0x6at
        -0x2ft
        0x39t
        0x5ct
        -0x3et
        0x2ct
        -0x6ct
        -0x2et
        0x4dt
        0x38t
        -0x37t
        0x3ft
        -0x67t
        -0x35t
        0x21t
        0x28t
        -0x54t
        0x5et
        -0x1t
    .end array-data

    :array_3
    .array-data 1
        0x7ct
        -0x74t
        0x79t
        -0x28t
        -0x62t
        0x6dt
    .end array-data
.end method
