.class public final L۟/j6;
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
.field public static final ۥ:L۟/j6;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, L۟/j6;

    invoke-direct {v0}, L۟/j6;-><init>()V

    sput-object v0, L۟/j6;->ۥ:L۟/j6;

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

    new-array v2, v1, [B

    fill-array-data v2, :array_3

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v2, 0x8

    new-array v2, v2, [B

    fill-array-data v2, :array_4

    new-array v1, v1, [B

    fill-array-data v1, :array_5

    invoke-static {v2, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-boolean v1, L۟/y2;->ۥ:Z

    invoke-static {v0}, L۟/y2$a;->ۥ(Lorg/json/JSONArray;)V

    return-object p1

    :array_0
    .array-data 1
        0x43t
        0x2ft
    .end array-data

    nop

    :array_1
    .array-data 1
        0x2at
        0x5bt
        -0x7bt
        0x48t
        0x29t
        -0x54t
    .end array-data

    nop

    :array_2
    .array-data 1
        0x1ct
        0x75t
        -0x34t
        -0x32t
    .end array-data

    :array_3
    .array-data 1
        0x78t
        0x14t
        -0x48t
        -0x51t
        0x36t
        0x1ct
    .end array-data

    nop

    :array_4
    .array-data 1
        0x6ct
        -0x2at
        0x5et
        0x35t
        0x27t
        0x19t
        0x7bt
        -0x36t
    .end array-data

    :array_5
    .array-data 1
        0xft
        -0x47t
        0x33t
        0x58t
        0x42t
        0x77t
    .end array-data
.end method
