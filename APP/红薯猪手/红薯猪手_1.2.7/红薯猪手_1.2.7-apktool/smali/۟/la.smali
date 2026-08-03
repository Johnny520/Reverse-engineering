.class public final L۟/la;
.super L۟/o4;

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3",
        "<",
        "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;",
        "L\u06df/vb;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥ:L۟/la;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "\u06e2\u06e5\u06e2\u06e0\u06e7\u06d8\u06d8\u06d6\u06e6\u06e6\u06d8\u06d8\u06d6\u06eb\u06d8\u06eb\u06e8\u06d8\u06d9\u06e6\u06ec\u06dc\u06e6\u06d6\u06e8\u06db\u06e2\u06d8\u06df\u06e7\u06e6\u06e5\u06d8\u06e8\u06da\u06ec\u06db\u06df\u06e6\u06d8\u06e8\u06d6\u06ec\u06e8\u06d9\u06d8\u06d8\u06d8\u06e8\u06df\u06df\u06d7\u06e7\u06d6\u06d9\u06d9\u06ec\u06d6\u06db\u06e8\u06e2\u06e1\u06e1\u06e1\u06eb\u06e2\u06dc\u06d8\u06e4\u06e1\u06d8\u06d8\u06e2\u06d8\u06dc\u06d8\u06d7\u06d6\u06e8\u06e4\u06e6\u06d8\u06e8\u06e1\u06db\u06db\u06e5\u06d9"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x47

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x22c

    const/16 v2, 0x11

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x20b

    const/16 v2, 0x35c

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2e7

    const/16 v2, 0x393

    const v3, -0x291a52f3

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v0, L۟/la;

    invoke-direct {v0}, L۟/la;-><init>()V

    sput-object v0, L۟/la;->ۥ:L۟/la;

    const-string v0, "\u06db\u06e7\u06da\u06e4\u06d9\u06eb\u06e7\u06e4\u06e7\u06e4\u06e1\u06e6\u06dc\u06d6\u06e1\u06e1\u06e5\u06df\u06e0\u06e1\u06e6\u06d8\u06e1\u06dc\u06dc\u06d8\u06df\u06e6\u06df\u06eb\u06e4\u06dc\u06e2\u06eb\u06dc\u06e1\u06e8\u06e6\u06e2\u06e8\u06e2\u06d7\u06ec\u06d6\u06e0\u06dc\u06d7\u06e4\u06d6\u06e4\u06e4\u06e8\u06df\u06db\u06d9\u06dc\u06d8\u06e7\u06e1\u06da\u06d7\u06e6\u06e8\u06d8"

    goto :goto_0

    :sswitch_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x51979362 -> :sswitch_0
        0x75435b96 -> :sswitch_1
    .end sparse-switch
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    const/4 v2, 0x0

    const-string v0, "\u06dc\u06d9\u06df\u06d8\u06da\u06df\u06e1\u06df\u06db\u06d8\u06d7\u06e8\u06e8\u06e1\u06da\u06e6\u06d8\u06d9\u06e7\u06dc\u06db\u06d6\u06ec\u06ec\u06d8\u06eb\u06e5\u06d7\u06ec\u06d7\u06e5\u06d9\u06e1\u06ec\u06e6\u06d8\u06e6\u06e5\u06e4\u06e8\u06e4\u06d7\u06e4\u06e4\u06e1\u06d8\u06e7\u06eb\u06d7\u06e5\u06e4\u06e7\u06e7\u06da\u06d6\u06e5\u06e2\u06ec\u06e5\u06e0\u06d8\u06d6\u06eb\u06e7\u06df\u06e1\u06df\u06e4\u06e2\u06eb\u06db\u06e6\u06e4\u06e0\u06e2\u06e8\u06d8\u06e6\u06df\u06d6\u06d8\u06d9\u06e7"

    move-object v1, v0

    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v3, 0x343

    xor-int/2addr v0, v3

    xor-int/lit16 v0, v0, 0xd0

    const/16 v3, 0x38b

    xor-int/2addr v0, v3

    xor-int/lit16 v0, v0, 0x2cb

    const/16 v3, 0xc6

    xor-int/2addr v0, v3

    xor-int/lit16 v0, v0, 0x3ed

    const/16 v3, 0x3d9

    const v4, -0x1e4c2547

    xor-int/2addr v0, v3

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06d9\u06ec\u06db\u06db\u06e8\u06d7\u06e6\u06da\u06e8\u06e0\u06e0\u06df\u06d7\u06dc\u06d8\u06d8\u06e7\u06e0\u06e4\u06e4\u06e5\u06e7\u06df\u06d8\u06e2\u06d6\u06e6\u06db\u06d6\u06eb\u06e7\u06d9\u06e6\u06e1\u06d8\u06e4\u06d9\u06e1\u06e8\u06e7\u06d8\u06d8\u06e2\u06d6\u06d8\u06d8\u06d6\u06d6\u06da\u06e2\u06d6\u06e4\u06df\u06e7\u06e2\u06e2\u06e4\u06e5\u06d8"

    move-object v1, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "\u06e5\u06e4\u06e5\u06db\u06d6\u06e7\u06e2\u06ec\u06dc\u06e1\u06eb\u06d6\u06d8\u06e8\u06dc\u06d7\u06e4\u06d9\u06eb\u06df\u06e0\u06dc\u06e7\u06da\u06ec\u06df\u06df\u06d8\u06d8\u06dc\u06d6\u06e5\u06d8\u06e0\u06d9\u06e5\u06d7\u06ec\u06d6\u06e2\u06ec\u06d7\u06db\u06e1\u06d7\u06e4\u06e0\u06d8"

    move-object v1, v0

    goto :goto_0

    :sswitch_2
    move-object v0, p1

    check-cast v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    const-string v1, "\u06d8\u06d6\u06e5\u06d8\u06eb\u06e8\u06e5\u06e1\u06e0\u06d6\u06e8\u06d8\u06d7\u06df\u06e7\u06e5\u06eb\u06e8\u06d8\u06ec\u06eb\u06e5\u06d8\u06e5\u06e2\u06db\u06eb\u06e1\u06e6\u06d8\u06e5\u06e4\u06e7\u06da\u06e8\u06e1\u06e8\u06e5\u06e6\u06d8\u06d6\u06e1\u06e2\u06e4\u06d9\u06e1\u06e6\u06e4\u06e8\u06e7\u06e0\u06e6\u06e8\u06e8\u06dc\u06df\u06e7\u06ec\u06d7\u06dc\u06ec\u06dc\u06e0\u06d8\u06e1\u06da\u06d7\u06e1\u06e4\u06e1\u06d8\u06e0\u06e8\u06da\u06df\u06e4\u06e8\u06d8"

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

    const-string v0, "\u06db\u06e8\u06e0\u06db\u06e4\u06d8\u06d6\u06db\u06e6\u06d8\u06e7\u06df\u06d7\u06e8\u06e8\u06ec\u06ec\u06e5\u06e1\u06d8\u06d6\u06eb\u06db\u06e5\u06e7\u06d9\u06e7\u06db\u06e8\u06e4\u06df\u06e5\u06db\u06e4\u06e0\u06d6\u06df\u06d8\u06d6\u06e7\u06d8\u06e0\u06d6\u06d8\u06d8\u06da\u06dc\u06e4\u06d9\u06da\u06d6\u06e0\u06e4\u06d7\u06e6\u06eb\u06e6\u06d6\u06eb\u06d6\u06d8\u06d6\u06e4\u06d7\u06d9\u06df\u06e8\u06d8\u06e4\u06d9\u06ec\u06e4\u06e2\u06e5\u06d8\u06ec\u06d8\u06e4"

    move-object v1, v0

    goto :goto_0

    :sswitch_4
    invoke-static {v2}, L۟/na;->ۥ۟۠(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    const-string v0, "\u06d8\u06e5\u06e7\u06d8\u06eb\u06dc\u06d6\u06db\u06e2\u06d8\u06d8\u06d6\u06df\u06e7\u06ec\u06d7\u06d9\u06e7\u06d7\u06e8\u06da\u06d6\u06e8\u06d8\u06ec\u06e8\u06d9\u06e8\u06e0\u06d8\u06d8\u06db\u06d8\u06e4\u06df\u06d7\u06ec\u06e4\u06d8\u06eb\u06da\u06e0\u06e4\u06e8\u06dc\u06d8\u06d8\u06eb\u06eb\u06db\u06e0\u06eb\u06e0\u06e2\u06e1\u06e8\u06db\u06e6\u06e2"

    move-object v1, v0

    goto :goto_0

    :sswitch_5
    sget-object v0, L۟/vb;->ۥ:L۟/vb;

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x3bd81365 -> :sswitch_0
        -0x1de78879 -> :sswitch_5
        0x51fa9c3d -> :sswitch_3
        0x563bfab9 -> :sswitch_1
        0x5df27e95 -> :sswitch_2
        0x71172591 -> :sswitch_4
    .end sparse-switch

    :array_0
    .array-data 1
        -0x42t
        -0x30t
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x29t
        -0x5ct
        0x44t
        -0x1et
        0x46t
        0x1bt
    .end array-data
.end method
