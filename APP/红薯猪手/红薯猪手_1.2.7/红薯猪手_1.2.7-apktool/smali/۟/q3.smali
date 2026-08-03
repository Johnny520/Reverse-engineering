.class public final L۟/q3;
.super L۟/o4;

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3",
        "<",
        "L\u06df/mc;",
        "L\u06df/vb;",
        ">;"
    }
.end annotation


# instance fields
.field public final ۥ:L۟/g3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u06df/g3",
            "<",
            "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;",
            "L\u06df/vb;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(L۟/g3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u06df/g3",
            "<-",
            "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;",
            "L\u06df/vb;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, L۟/q3;->ۥ:L۟/g3;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v3, 0x0

    const/4 v6, 0x6

    const-string v0, "\u06da\u06e2\u06d8\u06d8\u06e4\u06e4\u06db\u06eb\u06e5\u06d8\u06e4\u06e6\u06dc\u06ec\u06ec\u06d9\u06eb\u06d6\u06e6\u06d8\u06eb\u06e7\u06ec\u06ec\u06e2\u06e8\u06e5\u06e2\u06e1\u06d9\u06d9\u06d8\u06d8\u06d8\u06e8\u06ec\u06e1\u06e5\u06d6\u06d8\u06da\u06da\u06d8\u06d8\u06e2\u06db\u06e8\u06ec\u06df\u06e6\u06d8\u06e5\u06d8\u06d9\u06e4\u06ec\u06db\u06db\u06e0\u06ec\u06d9\u06da\u06e5\u06d9\u06dc\u06df\u06d9\u06db\u06e8\u06d8\u06d8\u06db\u06d9\u06df\u06e5\u06ec\u06d7\u06e5"

    move-object v1, v0

    move-object v2, v3

    move-object v4, v3

    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v3, 0x1b5

    xor-int/2addr v0, v3

    xor-int/lit16 v0, v0, 0x10c

    const/16 v3, 0xf7

    xor-int/2addr v0, v3

    xor-int/lit16 v0, v0, 0x37d

    const/16 v3, 0x1ed

    xor-int/2addr v0, v3

    xor-int/lit16 v0, v0, 0x394

    const/16 v3, 0xd8

    const v5, 0x68045aa2    # 2.500097E24f

    xor-int/2addr v0, v3

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06eb\u06ec\u06dc\u06d8\u06e2\u06da\u06d8\u06db\u06df\u06d9\u06e6\u06e5\u06e8\u06da\u06e4\u06e2\u06e0\u06e7\u06e6\u06da\u06e8\u06d8\u06e1\u06e0\u06da\u06e0\u06df\u06eb\u06d7\u06e4\u06dc\u06d8\u06ec\u06d8\u06d6\u06d8\u06d8\u06db\u06e4\u06d6\u06e5\u06df\u06d9\u06e0\u06da\u06db\u06d8\u06d7\u06e4\u06ec\u06e7\u06dc\u06e5\u06dc\u06e7\u06d8\u06e0\u06d8\u06dc\u06d7\u06e6\u06e7\u06ec\u06e8\u06df\u06d9\u06db\u06eb\u06e2\u06d8\u06d8\u06d6\u06e0\u06e1"

    move-object v1, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "\u06d9\u06da\u06e6\u06d8\u06ec\u06e8\u06dc\u06d9\u06db\u06e8\u06d8\u06e8\u06e4\u06e5\u06e1\u06e2\u06e5\u06d8\u06ec\u06e4\u06e6\u06e7\u06dc\u06d8\u06e6\u06e6\u06d6\u06d8\u06e5\u06d9\u06dc\u06d8\u06dc\u06d7\u06e5\u06db\u06e1\u06db\u06e1\u06e7\u06e6\u06e4\u06dc\u06d8\u06e7\u06e4\u06e6\u06e5\u06e7\u06d6\u06d8\u06e0\u06e4\u06e5\u06d8\u06df\u06da\u06e5\u06d8\u06e5\u06d7\u06db\u06e5\u06d6\u06d8\u06e6\u06e7\u06da\u06e0\u06d9\u06db\u06e7\u06e7\u06d6\u06e8\u06df\u06db\u06e8\u06d8\u06e4"

    move-object v1, v0

    goto :goto_0

    :sswitch_2
    move-object v0, p1

    check-cast v0, L۟/mc;

    const-string v1, "\u06eb\u06eb\u06e6\u06d8\u06e1\u06d8\u06e8\u06e5\u06e0\u06e6\u06e4\u06df\u06e1\u06d8\u06d9\u06e8\u06d9\u06e2\u06e8\u06e8\u06d8\u06e0\u06e7\u06da\u06eb\u06e5\u06d7\u06d9\u06e6\u06e1\u06e4\u06d6\u06eb\u06e4\u06d8\u06e6\u06d7\u06dc\u06d8\u06da\u06e1\u06d6\u06d8\u06e6\u06d7\u06db\u06e1\u06d9\u06e2"

    move-object v4, v0

    goto :goto_0

    :sswitch_3
    const/16 v0, 0x10

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    new-array v1, v6, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "\u06e1\u06e7\u06eb\u06da\u06e6\u06d8\u06d8\u06dc\u06db\u06df\u06eb\u06e1\u06df\u06d9\u06d6\u06d8\u06e2\u06dc\u06e5\u06eb\u06e4\u06e1\u06df\u06dc\u06e5\u06df\u06e5\u06dc\u06d8\u06e7\u06e0\u06e8\u06e0\u06df\u06e7\u06da\u06e0\u06ec\u06d8\u06d6\u06d6\u06d9\u06e7\u06e4\u06e1\u06d9\u06da\u06e1\u06d7\u06dc\u06d8\u06e0\u06e0\u06d9\u06e0\u06ec\u06e1"

    move-object v1, v0

    goto :goto_0

    :sswitch_4
    iget-object v2, p0, L۟/q3;->ۥ:L۟/g3;

    const-string v0, "\u06ec\u06eb\u06e2\u06e7\u06e7\u06e4\u06d9\u06e8\u06df\u06e7\u06eb\u06e5\u06d8\u06da\u06d9\u06d6\u06e8\u06da\u06db\u06e2\u06e5\u06d9\u06e7\u06d6\u06db\u06d8\u06e4\u06e8\u06da\u06e0\u06e7\u06e8\u06e6\u06d8\u06e2\u06e5\u06ec\u06d6\u06dc\u06e8\u06dc\u06d6\u06dc\u06e5\u06ec\u06d6\u06e7\u06d8\u06d8\u06e2\u06e5\u06e8\u06d8\u06e6\u06ec\u06e8\u06da\u06d6\u06df\u06e4\u06e1\u06d7\u06df\u06dc\u06e6\u06d8\u06ec\u06e1\u06d6\u06d8\u06e5\u06e7\u06d6"

    move-object v1, v0

    goto :goto_0

    :sswitch_5
    new-array v0, v6, [B

    fill-array-data v0, :array_2

    new-array v1, v6, [B

    fill-array-data v1, :array_3

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "\u06ec\u06e5\u06db\u06d9\u06da\u06db\u06d9\u06df\u06e2\u06d8\u06d6\u06e6\u06dc\u06d8\u06d6\u06d8\u06df\u06dc\u06d8\u06db\u06e2\u06e0\u06db\u06d6\u06e7\u06d8\u06e1\u06df\u06eb\u06e7\u06e0\u06e8\u06d9\u06d8\u06d8\u06df\u06eb\u06e4\u06e8\u06e7\u06e1\u06eb\u06d6\u06db\u06e8\u06e0"

    move-object v1, v0

    goto :goto_0

    :sswitch_6
    iput-object v2, v4, L۟/mc;->ۥ:L۟/g3;

    const-string v0, "\u06d6\u06e1\u06d6\u06d8\u06eb\u06e0\u06d7\u06d7\u06eb\u06d6\u06d8\u06e4\u06dc\u06eb\u06d6\u06df\u06d7\u06e8\u06db\u06e0\u06dc\u06e6\u06d8\u06e5\u06e5\u06e1\u06e1\u06d6\u06ec\u06ec\u06d7\u06e5\u06d8\u06d8\u06d8\u06e8\u06d8\u06d9\u06e8\u06df\u06d9\u06ec\u06e6\u06d8\u06e6\u06d9\u06e6\u06eb\u06e7\u06e0\u06da\u06df\u06d8\u06e7\u06e8\u06e0\u06d9\u06df\u06df\u06e8\u06d6\u06e0\u06e1\u06e1\u06d8\u06d9\u06da\u06e2\u06e5\u06da\u06e5\u06db\u06dc\u06e6\u06d8\u06e5\u06e5\u06d8\u06d8"

    move-object v1, v0

    goto :goto_0

    :sswitch_7
    sget-object v0, L۟/vb;->ۥ:L۟/vb;

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x2a1e2f76 -> :sswitch_7
        -0xee76e93 -> :sswitch_2
        0xa2ad6ae -> :sswitch_1
        0x30d7b812 -> :sswitch_5
        0x3cecec21 -> :sswitch_4
        0x5e28c625 -> :sswitch_0
        0x640cf50b -> :sswitch_3
        0x72d35243 -> :sswitch_6
    .end sparse-switch

    :array_0
    .array-data 1
        0x1at
        0x72t
        -0x21t
        0x4bt
        -0x22t
        -0x26t
        0x56t
        0x69t
        -0x28t
        0x49t
        -0x20t
        -0x65t
        0x4at
        0x6et
        -0x28t
        0x46t
    .end array-data

    :array_1
    .array-data 1
        0x3et
        0x6t
        -0x49t
        0x22t
        -0x53t
        -0x2t
    .end array-data

    nop

    :array_2
    .array-data 1
        0x13t
        -0x25t
        0xet
        -0x6ct
        -0x10t
        -0x1t
    .end array-data

    nop

    :array_3
    .array-data 1
        0x71t
        -0x42t
        0x68t
        -0x5t
        -0x7et
        -0x66t
    .end array-data
.end method
