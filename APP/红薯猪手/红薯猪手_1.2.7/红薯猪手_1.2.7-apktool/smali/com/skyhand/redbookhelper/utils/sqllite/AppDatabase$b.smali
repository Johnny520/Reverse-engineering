.class public final Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase$b;
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

    const/4 v0, 0x2

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1}, L۟/t5;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final ۥ(L۟/b3;)V
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
        0x4bt
        -0x48t
        0x6t
        0x46t
        -0x67t
        0x43t
        0x5ct
        -0x44t
    .end array-data

    :array_1
    .array-data 1
        0x2ft
        -0x27t
        0x72t
        0x27t
        -0x5t
        0x22t
    .end array-data
.end method
