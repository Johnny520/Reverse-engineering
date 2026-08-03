.class public final L۟/l6;
.super L۟/o4;

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3",
        "<",
        "Lorg/json/JSONObject;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final ۥ:L۟/f6;

.field public final ۥ۟:Ljava/lang/String;


# direct methods
.method public constructor <init>(L۟/f6;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, L۟/l6;->ۥ:L۟/f6;

    iput-object p2, p0, L۟/l6;->ۥ۟:Ljava/lang/String;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    const/4 v2, 0x0

    const-string v0, "\u06e8\u06e2\u06df\u06e2\u06e8\u06d9\u06e1\u06e1\u06d6\u06d8\u06db\u06d7\u06e0\u06e0\u06df\u06d9\u06d9\u06e4\u06e6\u06d8\u06e2\u06dc\u06d9\u06dc\u06e0\u06d6\u06d9\u06ec\u06d6\u06d8\u06eb\u06d6\u06e7\u06d8\u06e8\u06d8\u06d6\u06d8\u06e8\u06d7\u06e1\u06d8\u06dc\u06df\u06e5\u06d8\u06dc\u06e1\u06eb\u06e5\u06e4\u06d8\u06ec\u06d9\u06e6\u06df\u06e6\u06e5\u06e0\u06e0"

    move-object v1, v0

    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v3, 0x31b

    xor-int/2addr v0, v3

    xor-int/lit16 v0, v0, 0x2b3

    const/16 v3, 0xc9

    xor-int/2addr v0, v3

    xor-int/lit16 v0, v0, 0x33e

    const/16 v3, 0x1d0

    xor-int/2addr v0, v3

    xor-int/lit16 v0, v0, 0x298

    const/16 v3, 0x2a3

    const v4, -0x54a687a8

    xor-int/2addr v0, v3

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06df\u06e4\u06d9\u06d7\u06d8\u06df\u06e6\u06e1\u06d8\u06df\u06e4\u06e5\u06dc\u06e6\u06e4\u06ec\u06d9\u06d7\u06e2\u06d6\u06db\u06dc\u06e8\u06eb\u06df\u06ec\u06d7\u06e1\u06e5\u06dc\u06d6\u06e4\u06d9\u06e0\u06eb\u06d7\u06d8\u06d8\u06dc\u06eb\u06e7\u06eb\u06e2\u06df"

    move-object v1, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "\u06e5\u06dc\u06ec\u06d9\u06eb\u06db\u06ec\u06d9\u06d8\u06d8\u06e7\u06da\u06d8\u06d8\u06e7\u06e7\u06ec\u06df\u06e6\u06d7\u06e1\u06ec\u06e1\u06d8\u06ec\u06ec\u06d8\u06d8\u06d7\u06dc\u06e1\u06d7\u06dc\u06db\u06e5\u06eb\u06e7\u06e8\u06d6\u06df\u06e8\u06ec\u06d6\u06e7\u06d7\u06da\u06ec\u06e5\u06e1\u06d8\u06e2\u06e7\u06e8\u06ec\u06e6\u06e6\u06d8\u06d8\u06dc\u06e1\u06d8\u06da\u06e4\u06d9\u06e2\u06e1\u06eb\u06e2\u06e7\u06df\u06e6\u06eb\u06e8\u06db\u06e1\u06e0\u06e6\u06e2\u06e4\u06e5\u06d7\u06e4\u06dc\u06eb\u06df\u06d8\u06da\u06da"

    move-object v1, v0

    goto :goto_0

    :sswitch_2
    move-object v0, p1

    check-cast v0, Lorg/json/JSONObject;

    const-string v1, "\u06da\u06e0\u06e1\u06eb\u06e0\u06e8\u06d8\u06e2\u06db\u06d8\u06db\u06d9\u06e6\u06db\u06e4\u06df\u06ec\u06e6\u06e4\u06da\u06df\u06e6\u06da\u06ec\u06e4\u06d8\u06d7\u06e0\u06d6\u06e4\u06d6\u06d6\u06ec\u06e4\u06d8\u06e7\u06df\u06e5\u06e4\u06e8\u06db\u06dc\u06d8\u06db\u06d8\u06e8\u06d8\u06eb\u06e0\u06e8\u06e6\u06dc\u06e5\u06d8\u06dc\u06d9\u06e2\u06e6\u06e7\u06e2\u06e0\u06e7\u06e1\u06e8\u06e1\u06d8"

    move-object v2, v0

    goto :goto_0

    :sswitch_3
    const/4 v0, 0x2

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "\u06e2\u06e5\u06e5\u06e6\u06da\u06dc\u06d8\u06e5\u06d6\u06e1\u06e1\u06e8\u06e8\u06d8\u06e7\u06e4\u06d6\u06d8\u06d9\u06e4\u06e1\u06d8\u06e0\u06e6\u06d8\u06d8\u06e6\u06e0\u06d6\u06e7\u06e6\u06ec\u06e0\u06d6\u06db\u06d9\u06e4\u06e2\u06ec\u06e6\u06e0\u06d6\u06e5\u06e8\u06d8\u06e4\u06e2\u06e5\u06d8\u06dc\u06df\u06eb\u06e6\u06e5\u06e7\u06d8\u06e8\u06e5\u06e7\u06d8\u06e6\u06e6\u06d8\u06e0\u06d8\u06e5\u06d8\u06e2\u06d6\u06e8\u06eb\u06e2\u06e5"

    move-object v1, v0

    goto :goto_0

    :sswitch_4
    iget-object v0, p0, L۟/l6;->ۥ:L۟/f6;

    iget-object v1, p0, L۟/l6;->ۥ۟:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, L۟/f6;->ۥ۟ۦ(Ljava/lang/String;Lorg/json/JSONObject;Z)V

    const-string v0, "\u06df\u06e0\u06e5\u06e1\u06d9\u06e5\u06d8\u06e5\u06e1\u06e2\u06d7\u06e8\u06d8\u06eb\u06d8\u06d6\u06e7\u06e7\u06e8\u06d8\u06e1\u06e2\u06e4\u06d8\u06d9\u06e2\u06db\u06e6\u06d7\u06e2\u06e0\u06e2\u06eb\u06d8\u06d9\u06e1\u06d6\u06e6\u06db\u06e6\u06e0\u06e1\u06d7\u06e5\u06df\u06e8\u06d9\u06db\u06e0\u06e1\u06d8\u06e1\u06e8\u06e6\u06e2\u06dc\u06e8\u06dc\u06eb\u06e8\u06d8\u06ec\u06e0\u06ec\u06df\u06e4\u06e4\u06d9\u06e0\u06e6\u06d9\u06db\u06dc\u06e4\u06e1\u06e6\u06e2\u06da\u06e8\u06e0\u06e5\u06d8\u06e6\u06e7\u06d9"

    move-object v1, v0

    goto :goto_0

    :sswitch_5
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        -0x1550f47a -> :sswitch_5
        -0xcc820ff -> :sswitch_0
        -0x852123e -> :sswitch_4
        0x42011fe4 -> :sswitch_2
        0x5704c6c7 -> :sswitch_3
        0x69622d58 -> :sswitch_1
    .end sparse-switch

    :array_0
    .array-data 1
        -0x64t
        -0x29t
    .end array-data

    nop

    :array_1
    .array-data 1
        -0xbt
        -0x5dt
        -0x36t
        0x3ft
        -0x2dt
        -0x48t
    .end array-data
.end method
