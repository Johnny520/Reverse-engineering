.class public final L۟/h6;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3<",
        "Lorg/json/JSONObject;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥ:L۟/h6;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, L۟/h6;

    invoke-direct {v0}, L۟/h6;-><init>()V

    sput-object v0, L۟/h6;->ۥ:L۟/h6;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Lorg/json/JSONObject;

    const/4 v0, 0x2

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v2, v1, [B

    fill-array-data v2, :array_1

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    new-array v1, v1, [B

    fill-array-data v1, :array_3

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    return-object p1

    :array_0
    .array-data 1
        -0x18t
        0x46t
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x7ft
        0x32t
        -0x58t
        -0x3bt
        -0x76t
        0x36t
    .end array-data

    nop

    :array_2
    .array-data 1
        0x26t
        0x31t
        -0x68t
        -0x21t
    .end array-data

    :array_3
    .array-data 1
        0x42t
        0x50t
        -0x14t
        -0x42t
        -0x45t
        0x6dt
    .end array-data
.end method
