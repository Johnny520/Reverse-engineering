.class public final L۟/k6;
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


# instance fields
.field public final synthetic ۥ:L۟/f6;

.field public final synthetic ۥ۟:Ljava/lang/String;


# direct methods
.method public constructor <init>(L۟/f6;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, L۟/k6;->ۥ:L۟/f6;

    iput-object p2, p0, L۟/k6;->ۥ۟:Ljava/lang/String;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lorg/json/JSONObject;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    new-array v0, v0, [B

    .line 5
    .line 6
    fill-array-data v0, :array_0

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x6

    .line 10
    new-array v1, v1, [B

    .line 11
    .line 12
    fill-array-data v1, :array_1

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, L۟/k6;->ۥ:L۟/f6;

    .line 23
    .line 24
    iget-object v1, p0, L۟/k6;->ۥ۟:Ljava/lang/String;

    .line 25
    .line 26
    sget-object v2, L۟/f6;->ۥ۟ۨ:Ljava/util/ArrayList;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-virtual {v0, v1, p1, v2}, L۟/f6;->ۥ۟ۦ(Ljava/lang/String;Lorg/json/JSONObject;Z)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :array_0
    .array-data 1
        0x4ft
        -0x4bt
    .end array-data

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    nop

    .line 39
    :array_1
    .array-data 1
        0x26t
        -0x3ft
        -0xet
        0x29t
        0x57t
        0x7bt
    .end array-data
.end method
