.class public final L۟/k8;
.super L۟/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L۟/k8$a;
    }
.end annotation


# static fields
.field public static ۥۣ۟:L۟/k;

.field public static ۥ۟ۤ:Ljava/lang/String;


# instance fields
.field public ۥ۟ۢ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v4, 0x6

    const-string v0, "\u06e7\u06e7\u06e1\u06d7\u06df\u06eb\u06db\u06ec\u06d9\u06d6\u06da\u06e7\u06eb\u06e8\u06e8\u06d8\u06df\u06eb\u06e4\u06e1\u06e8\u06d6\u06d8\u06e7\u06d7\u06e8\u06d8\u06e4\u06e1\u06ec\u06d6\u06e4\u06d9\u06d6\u06da\u06e5\u06d8\u06d8\u06e0\u06e6\u06eb\u06e6\u06d6\u06d8\u06e0\u06e6\u06ec\u06e0\u06e0\u06e1\u06d8\u06da\u06df\u06da\u06db\u06e7\u06d6\u06d8\u06d6\u06e4\u06e5\u06d8\u06da\u06df\u06d6\u06d8\u06e5\u06e7\u06db\u06dc\u06e5\u06e7\u06da\u06ec\u06ec\u06e0\u06e7\u06e1\u06d8\u06e7\u06db\u06e5\u06d8\u06dc\u06db\u06e5\u06d8\u06e6\u06e1\u06e1\u06d8\u06df\u06e6\u06dc"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x11f

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x27

    const/16 v2, 0x204

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2a5

    const/16 v2, 0x134

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x3d

    const/16 v2, 0x1e0

    const v3, 0x2e78b35a

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const/16 v0, 0x31

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    new-array v1, v4, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    const-string v0, "\u06d9\u06e8\u06ec\u06d7\u06df\u06e5\u06e6\u06e4\u06df\u06e1\u06e0\u06e5\u06d8\u06e7\u06d8\u06e1\u06e0\u06d9\u06d8\u06d9\u06e6\u06ec\u06e2\u06e6\u06d8\u06db\u06e4\u06da\u06e7\u06d8\u06d6\u06e6\u06d8\u06df\u06dc\u06dc\u06ec\u06e6\u06df\u06e2\u06da\u06d9\u06ec\u06d9\u06e6\u06e7\u06e8\u06d6\u06db\u06e1\u06e1\u06e1\u06d8\u06e0\u06df\u06d8"

    goto :goto_0

    :sswitch_1
    const/16 v0, 0x2e

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    new-array v1, v4, [B

    fill-array-data v1, :array_3

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    const-string v0, "\u06d8\u06e8\u06e5\u06d8\u06e6\u06db\u06d7\u06e7\u06da\u06d7\u06ec\u06e6\u06d6\u06dc\u06e8\u06d8\u06d7\u06db\u06dc\u06e2\u06d8\u06e5\u06d8\u06e5\u06eb\u06e6\u06d8\u06e7\u06d7\u06df\u06d8\u06da\u06eb\u06eb\u06dc\u06e7\u06d8\u06e8\u06e1\u06d6\u06d8\u06d6\u06db\u06e6\u06d8\u06db\u06dc\u06e5\u06ec\u06d8\u06e1\u06d8\u06e7\u06e5\u06e6\u06d8\u06e2\u06e8\u06e6\u06d8\u06e6\u06da\u06dc\u06d7\u06d9\u06df\u06da\u06d6\u06e6\u06d8\u06d6\u06da\u06d7\u06df\u06e5\u06e6\u06d8\u06e8\u06d9\u06d7\u06e2\u06db\u06e1\u06d8\u06e5\u06db\u06eb\u06ec\u06db\u06d6\u06df\u06d8\u06dc\u06d8"

    goto :goto_0

    :sswitch_2
    new-instance v0, L۟/k;

    invoke-direct {v0}, L۟/k;-><init>()V

    sput-object v0, L۟/k8;->ۥۣ۟:L۟/k;

    const-string v0, "\u06e1\u06e8\u06d8\u06d8\u06dc\u06ec\u06d6\u06e0\u06df\u06dc\u06d8\u06d7\u06db\u06e1\u06e4\u06df\u06df\u06d7\u06e7\u06dc\u06e5\u06e8\u06d8\u06d6\u06da\u06e1\u06d8\u06e5\u06d8\u06e6\u06d8\u06d6\u06d6\u06dc\u06d9\u06db\u06d8\u06e0\u06d7\u06e1\u06e2\u06d8\u06e5\u06d8\u06e5\u06e6\u06e4\u06e1\u06da\u06dc\u06d6\u06eb\u06e1\u06d8\u06e7\u06d6\u06e7\u06d8\u06e2\u06d6\u06e8\u06dc\u06e0\u06df\u06df\u06e6\u06eb\u06d8\u06e1"

    goto :goto_0

    :sswitch_3
    const-string v0, ""

    sput-object v0, L۟/k8;->ۥ۟ۤ:Ljava/lang/String;

    const-string v0, "\u06e8\u06d9\u06dc\u06e7\u06e5\u06da\u06ec\u06e1\u06e1\u06db\u06e1\u06d6\u06d7\u06df\u06e7\u06d7\u06d9\u06da\u06e5\u06e6\u06e5\u06d8\u06e1\u06e5\u06da\u06e0\u06ec\u06e1\u06d6\u06db\u06e5\u06d8\u06d8\u06e8\u06d8\u06d8\u06eb\u06e5\u06da\u06ec\u06da\u06db\u06e8\u06e0\u06e1\u06e0\u06e7\u06e8\u06d8\u06e5\u06e6\u06e8\u06e7\u06e4\u06e5\u06d8\u06e6\u06ec\u06d9\u06ec\u06d8\u06e5\u06d8\u06e7\u06e8\u06e5\u06d6\u06e5\u06e1\u06d8\u06ec\u06e2\u06e1\u06d8\u06ec\u06df\u06e6\u06d8\u06e5\u06d9\u06e5\u06d8\u06e1\u06db\u06db\u06e4\u06eb\u06e8\u06d8\u06e7\u06e8\u06e6\u06d8"

    goto :goto_0

    :sswitch_4
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x21599e9f -> :sswitch_3
        0x27312e7 -> :sswitch_4
        0x128fb9dc -> :sswitch_0
        0x328e2cab -> :sswitch_1
        0x60f9e338 -> :sswitch_2
    .end sparse-switch

    :array_0
    .array-data 1
        0xbt
        0x60t
        0x33t
        0x6bt
        0x22t
        -0x32t
        0xet
        0x76t
        0x79t
        0x7at
        0x22t
        -0x37t
        0x19t
        0x7at
        0x25t
        0x78t
        0x24t
        -0x37t
        0x1et
        0x62t
        0x36t
        0x60t
        0x22t
        -0x2et
        0x1et
        0x20t
        0x20t
        0x70t
        0x29t
        -0x40t
        0xft
        0x7at
        0x79t
        0x5at
        0x22t
        -0x37t
        0x19t
        0x7at
        0x25t
        0x78t
        0x24t
        -0x37t
        0x1et
        0x42t
        0x36t
        0x60t
        0x22t
        -0x2et
        0x1et
    .end array-data

    nop

    :array_1
    .array-data 1
        0x6at
        0xet
        0x57t
        0x19t
        0x4dt
        -0x59t
    .end array-data

    nop

    :array_2
    .array-data 1
        0x7et
        0x6ft
        -0x15t
        -0x1et
        0x4ct
        -0x31t
        0x7bt
        0x79t
        -0x5ft
        -0xdt
        0x4ct
        -0x38t
        0x6ct
        0x75t
        -0x3t
        -0xft
        0x4at
        -0x38t
        0x6bt
        0x6dt
        -0x12t
        -0x17t
        0x4ct
        -0x2dt
        0x6bt
        0x2ft
        -0x8t
        -0x7t
        0x47t
        -0x3ft
        0x7at
        0x75t
        -0x5ft
        -0x2dt
        0x4ct
        -0x38t
        0x6ct
        0x75t
        -0x3t
        -0xft
        0x4at
        -0x38t
        0x6bt
        0x52t
        -0x16t
        -0x1ct
    .end array-data

    nop

    :array_3
    .array-data 1
        0x1ft
        0x1t
        -0x71t
        -0x70t
        0x23t
        -0x5at
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v2, 0x6

    invoke-direct {p0}, L۟/q;-><init>()V

    const/16 v0, 0xe

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    new-array v1, v2, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, L۟/k8;->ۥ۟ۢ:Ljava/lang/String;

    const/16 v0, 0x19

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    new-array v1, v2, [B

    fill-array-data v1, :array_3

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    return-void

    :array_0
    .array-data 1
        0x39t
        -0x7at
        -0x79t
        -0x2ft
        -0x68t
        -0x16t
        0x34t
        -0x72t
        -0x7dt
        -0x6ft
        -0x32t
        -0x5t
        0x32t
        -0x66t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x5at
        -0x17t
        -0x16t
        -0x1t
        -0x20t
        -0x7dt
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x24t
        -0x37t
        0x28t
        0x46t
        0xat
        0x45t
        -0x3at
        -0x32t
        0x24t
        0x6t
        0x1dt
        0x0t
        -0x33t
        -0x3dt
        0x21t
        0xat
        0x16t
        0x41t
        -0x2ct
        -0x32t
        0x20t
        0x4t
        0x9t
        0x4bt
        -0x33t
    .end array-data

    nop

    :array_3
    .array-data 1
        -0x41t
        -0x5at
        0x45t
        0x68t
        0x79t
        0x2et
    .end array-data
.end method

.method public static final synthetic ۥ۟ۢ(L۟/k8;)V
    .locals 4

    const-string v0, "\u06e5\u06dc\u06d6\u06dc\u06e0\u06db\u06dc\u06d6\u06d6\u06e5\u06df\u06d6\u06e8\u06dc\u06e4\u06dc\u06da\u06e1\u06d8\u06e1\u06d8\u06e5\u06d8\u06e1\u06dc\u06eb\u06df\u06e4\u06e6\u06d8\u06d6\u06e7\u06d6\u06d8\u06e8\u06e8\u06e5\u06e0\u06d6\u06d8\u06d8\u06e6\u06d6\u06e0\u06db\u06db\u06eb\u06e5\u06d7\u06e2\u06db\u06d8\u06d8\u06df\u06e7\u06da\u06e2\u06e7\u06e0\u06d8\u06d7\u06e0\u06e6\u06da\u06d6\u06d8\u06da\u06e4\u06dc"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x2ff

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x18

    const/16 v2, 0x12d

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x26b

    const/16 v2, 0x105

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2c9

    const/16 v2, 0x1e2

    const v3, -0x630b505d

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06d6\u06e5\u06e7\u06e7\u06e7\u06df\u06e2\u06e2\u06dc\u06eb\u06e5\u06db\u06d9\u06ec\u06e1\u06d8\u06d7\u06eb\u06e8\u06d8\u06eb\u06db\u06dc\u06d8\u06d8\u06d9\u06e6\u06d8\u06df\u06dc\u06dc\u06e4\u06e4\u06d8\u06e1\u06d8\u06da\u06dc\u06df\u06e8\u06d9\u06ec\u06e4\u06e1\u06df\u06dc\u06d8\u06db\u06eb\u06e5\u06db\u06e8\u06e0\u06d9\u06e0\u06eb\u06e4\u06d9\u06e8\u06e7\u06da\u06db\u06e0\u06ec\u06e5\u06db\u06e7\u06e2\u06e1\u06e2\u06e6\u06e4\u06d6\u06d8\u06da\u06ec\u06e2"

    goto :goto_0

    :sswitch_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "\u06dc\u06df\u06e6\u06d7\u06d8\u06da\u06e5\u06d9\u06dc\u06d8\u06d8\u06e6\u06d8\u06e2\u06e5\u06d6\u06d8\u06dc\u06df\u06d7\u06d9\u06dc\u06e7\u06d8\u06ec\u06e2\u06da\u06d8\u06e6\u06d8\u06d8\u06db\u06ec\u06e8\u06db\u06d9\u06e7\u06eb\u06e4\u06d6\u06d8\u06d9\u06ec\u06dc\u06e0\u06e8\u06e1\u06d8\u06e0\u06db\u06d9\u06e4\u06eb\u06da\u06d8\u06d8\u06e1\u06d8\u06df\u06d9\u06e5"

    goto :goto_0

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x25bbdf32 -> :sswitch_0
        0x47297c7b -> :sswitch_2
        0x4a2f7ac2 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final ۥ۟()Ljava/lang/String;
    .locals 4

    const-string v0, "\u06e7\u06e4\u06e0\u06e5\u06e2\u06ec\u06e0\u06ec\u06d8\u06d8\u06eb\u06df\u06e8\u06e6\u06e5\u06d8\u06db\u06df\u06dc\u06df\u06e4\u06da\u06d8\u06e1\u06e8\u06d8\u06d8\u06e4\u06db\u06da\u06e7\u06ec\u06e6\u06eb\u06e4\u06e1\u06d9\u06e7\u06d8\u06d7\u06ec\u06ec\u06e2\u06dc\u06e0\u06e0\u06e8\u06d9\u06dc\u06e2\u06db\u06d6\u06e1\u06d8\u06e8\u06e7\u06e2"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x29a

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x38b

    const/16 v2, 0x2fb

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x8

    const/16 v2, 0x24e

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x88

    const/16 v2, 0x36c

    const v3, 0x129d1b8

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06d8\u06d9\u06e8\u06d8\u06e6\u06ec\u06da\u06d6\u06d9\u06d9\u06e0\u06e8\u06dc\u06db\u06e7\u06e5\u06d8\u06e6\u06e4\u06e8\u06d8\u06df\u06df\u06df\u06e0\u06d6\u06e7\u06e4\u06d9\u06d8\u06db\u06d9\u06e6\u06db\u06eb\u06db\u06e5\u06d9\u06e1\u06d8\u06df\u06e2\u06d9\u06e7\u06db\u06e7\u06e0\u06e8\u06dc\u06d8\u06e1\u06eb\u06e5\u06d8\u06d9\u06e5\u06e6\u06eb\u06d6\u06e7\u06d6\u06dc\u06d7\u06e4\u06ec\u06d7\u06db\u06ec\u06e1\u06d8"

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, L۟/k8;->ۥ۟ۢ:Ljava/lang/String;

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x57d321fe -> :sswitch_0
        0x5eb0cc27 -> :sswitch_1
    .end sparse-switch
.end method

.method public final ۥ۟ۡ(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 7

    const/4 v6, 0x6

    const-string v0, "\u06d9\u06db\u06dc\u06d8\u06e2\u06e7\u06e2\u06e7\u06e6\u06e7\u06da\u06e0\u06e8\u06d8\u06e8\u06da\u06e1\u06d8\u06e8\u06e0\u06e1\u06d9\u06e1\u06e5\u06d8\u06d6\u06e6\u06e6\u06d8\u06e8\u06e6\u06e6\u06d8\u06eb\u06dc\u06e2\u06e6\u06d7\u06d9\u06ec\u06df\u06e6\u06e1\u06dc\u06e5\u06d8\u06e4\u06d6\u06d8\u06d8\u06e5\u06e0\u06e5\u06e5\u06db\u06ec\u06e1\u06e0\u06da\u06e7\u06e8\u06dc\u06d8\u06df\u06d6\u06d8\u06dc\u06ec\u06df\u06eb\u06eb"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x279

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xcb

    const/16 v2, 0x301

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3a4

    const/16 v2, 0x396

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x18

    const/16 v2, 0x325

    const v3, 0xb708b83

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06da\u06e4\u06e1\u06d8\u06da\u06d6\u06eb\u06e0\u06da\u06e5\u06d8\u06d6\u06e2\u06e6\u06d8\u06e0\u06e7\u06e0\u06e4\u06e0\u06e5\u06d8\u06ec\u06d7\u06e1\u06e2\u06d8\u06e8\u06d8\u06d7\u06eb\u06eb\u06e4\u06e8\u06d8\u06d8\u06e0\u06d7\u06da\u06e7\u06db\u06ec\u06e7\u06d7\u06e5\u06e6\u06e2\u06e6\u06d8\u06db\u06e0\u06e6\u06d8\u06df\u06e1\u06e5\u06e2\u06e1\u06e7\u06d8\u06e1\u06e1\u06e5"

    goto :goto_0

    :sswitch_1
    const-string v0, "\u06e4\u06da\u06e5\u06e6\u06eb\u06d9\u06d6\u06e7\u06dc\u06e4\u06d8\u06dc\u06d8\u06d8\u06d8\u06dc\u06e0\u06db\u06e7\u06db\u06dc\u06d6\u06d8\u06e5\u06d7\u06e5\u06e4\u06e1\u06d8\u06e2\u06d9\u06ec\u06eb\u06ec\u06d6\u06d7\u06e2\u06e7\u06e8\u06d9\u06df\u06d8\u06e8\u06d8\u06eb\u06dc\u06df\u06e8\u06e2\u06dc\u06dc\u06db\u06eb\u06dc\u06d6\u06da\u06e7\u06e8\u06e7\u06e4\u06d8\u06d8\u06e1\u06e2\u06da"

    goto :goto_0

    :sswitch_2
    const/4 v0, 0x7

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    new-array v1, v6, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "\u06eb\u06e8\u06d7\u06df\u06e0\u06d9\u06e5\u06da\u06e6\u06d8\u06e4\u06e5\u06e7\u06e8\u06ec\u06df\u06df\u06e2\u06e0\u06da\u06eb\u06eb\u06eb\u06eb\u06e6\u06e8\u06df\u06eb\u06df\u06eb\u06da\u06db\u06d7\u06e2\u06df\u06d8\u06d8\u06d8\u06e5\u06db\u06e8\u06eb\u06e6\u06da\u06e4\u06e5\u06d8"

    goto :goto_0

    :sswitch_3
    const/16 v0, 0x21

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    new-array v1, v6, [B

    fill-array-data v1, :array_3

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    const/16 v2, 0x8

    new-array v2, v2, [B

    fill-array-data v2, :array_4

    new-array v3, v6, [B

    fill-array-data v3, :array_5

    invoke-static {v2, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    new-instance v5, L۟/k8$b;

    invoke-direct {v5, p0}, L۟/k8$b;-><init>(L۟/k8;)V

    aput-object v5, v3, v4

    invoke-static {v0, v1, v2, v3}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    const-string v0, "\u06eb\u06d9\u06e6\u06d9\u06eb\u06e2\u06e1\u06db\u06e8\u06dc\u06e7\u06e5\u06d7\u06db\u06da\u06d6\u06e7\u06e0\u06df\u06e7\u06d6\u06d8\u06e1\u06db\u06ec\u06e4\u06db\u06d6\u06ec\u06e0\u06df\u06db\u06e6\u06da\u06e1\u06d6\u06dc\u06d8\u06e5\u06df\u06d7\u06e7\u06e0\u06e7\u06d6\u06df\u06df\u06ec\u06e6\u06e1\u06d8\u06d6\u06e8\u06e8\u06df\u06ec\u06ec"

    goto :goto_0

    :sswitch_4
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x3bc7c1aa -> :sswitch_1
        -0xad370f5 -> :sswitch_3
        -0x811f98d -> :sswitch_0
        0x71ff8c69 -> :sswitch_4
        0x7ca8e771 -> :sswitch_2
    .end sparse-switch

    :array_0
    .array-data 1
        0x10t
        0x33t
        0x5ct
        -0x23t
        -0x45t
        0x34t
        0x11t
    .end array-data

    :array_1
    .array-data 1
        0x7ct
        0x43t
        0x2ct
        -0x44t
        -0x37t
        0x55t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x52t
        0x4et
        -0x79t
        -0x13t
        -0x3t
        0x38t
        -0x5dt
        0x46t
        -0x7dt
        -0x53t
        -0x55t
        0x29t
        -0x5bt
        0x52t
        -0x3ct
        -0x5et
        -0xbt
        0x21t
        -0x1dt
        0x79t
        -0x7et
        -0x50t
        -0x3ct
        0x21t
        -0x43t
        0x4dt
        -0x7dt
        -0x60t
        -0x1ct
        0x25t
        -0x5ct
        0x4et
        -0x7ct
    .end array-data

    nop

    :array_3
    .array-data 1
        -0x33t
        0x21t
        -0x16t
        -0x3dt
        -0x7bt
        0x51t
    .end array-data

    nop

    :array_4
    .array-data 1
        -0x2t
        0x68t
        0x34t
        -0x28t
        -0x22t
        -0x30t
        -0x1bt
        0x63t
    .end array-data

    :array_5
    .array-data 1
        -0x6ft
        0x6t
        0x77t
        -0x56t
        -0x45t
        -0x4ft
    .end array-data
.end method
