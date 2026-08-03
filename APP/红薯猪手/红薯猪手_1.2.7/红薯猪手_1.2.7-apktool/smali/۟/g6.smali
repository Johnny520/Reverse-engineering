.class public final L۟/g6;
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
.field public static final ۥ:L۟/g6;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, L۟/g6;

    invoke-direct {v0}, L۟/g6;-><init>()V

    sput-object v0, L۟/g6;->ۥ:L۟/g6;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Lorg/json/JSONObject;

    const/4 v0, 0x2

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    const/4 v2, 0x6

    new-array v3, v2, [B

    fill-array-data v3, :array_1

    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance p1, Lorg/json/JSONObject;

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    new-array v1, v2, [B

    fill-array-data v1, :array_3

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    return-object p1

    nop

    :array_0
    .array-data 1
        0x40t
        -0x1bt
    .end array-data

    nop

    :array_1
    .array-data 1
        0x29t
        -0x6ft
        -0x62t
        -0x1t
        0x10t
        0x7bt
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x29t
        0x5ft
    .end array-data

    nop

    :array_3
    .array-data 1
        -0x54t
        0x22t
        -0x4bt
        0x18t
        -0x1ft
        -0x20t
    .end array-data
.end method
