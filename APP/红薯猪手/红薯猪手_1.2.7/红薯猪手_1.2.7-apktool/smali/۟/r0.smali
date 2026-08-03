.class public L۟/r0;
.super L۟/y8;


# instance fields
.field public final ۥ:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, L۟/y8;-><init>()V

    iput-object p1, p0, L۟/r0;->ۥ:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public ۥ۟(L۟/w8;)Z
    .locals 4

    const-string v0, "\u06d7\u06e6\u06d6\u06e4\u06db\u06df\u06d7\u06e8\u06e1\u06d8\u06e6\u06da\u06d6\u06d8\u06ec\u06e4\u06e1\u06d8\u06d8\u06d9\u06e1\u06eb\u06da\u06d9\u06e8\u06e6\u06e4\u06da\u06e6\u06e1\u06e4\u06dc\u06d8\u06e8\u06d7\u06d7\u06e0\u06e0\u06d8\u06e0\u06db\u06dc\u06d8\u06e7\u06d6\u06ec\u06ec\u06e4\u06d8"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x376

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x3d

    const/16 v2, 0x147

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0xd

    const/16 v2, 0x163

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1cf

    const/16 v2, 0xc9

    const v3, 0x48557a30    # 218600.75f

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06d6\u06db\u06da\u06e2\u06e7\u06e8\u06e7\u06da\u06d8\u06d8\u06e2\u06d9\u06eb\u06e2\u06e5\u06d6\u06d8\u06e4\u06e5\u06e2\u06d8\u06d7\u06e6\u06d8\u06da\u06db\u06e6\u06d8\u06e2\u06d8\u06da\u06e0\u06d8\u06eb\u06da\u06e6\u06d7\u06d6\u06d8\u06dc\u06d8\u06eb\u06dc\u06ec\u06db\u06df\u06eb\u06eb\u06e5\u06e8\u06e1\u06df\u06e2\u06d6\u06e5\u06d9\u06db\u06d6\u06dc\u06dc\u06d6\u06e2\u06ec\u06e4\u06e1\u06dc\u06df\u06e0\u06e1\u06dc\u06e8\u06e5\u06d8\u06e5\u06d8\u06d6\u06e2\u06d8\u06e2\u06e0\u06e0\u06d8\u06d8\u06da\u06e8\u06eb"

    goto :goto_0

    :sswitch_1
    const-string v0, "\u06db\u06d7\u06dc\u06d8\u06e1\u06ec\u06e6\u06db\u06e4\u06e6\u06d8\u06e8\u06e6\u06ec\u06d6\u06e0\u06ec\u06db\u06e5\u06e1\u06e1\u06d8\u06e1\u06d8\u06e5\u06ec\u06d8\u06d8\u06da\u06ec\u06e1\u06e0\u06e5\u06d8\u06db\u06ec\u06e6\u06d8\u06db\u06e4\u06dc\u06dc\u06eb\u06e0\u06ec\u06df\u06d9\u06e2\u06e1\u06e7\u06d8\u06e0\u06ec\u06e8\u06da\u06e2\u06e2\u06e1\u06d9"

    goto :goto_0

    :sswitch_2
    const-string v0, "content"

    iget-object v1, p1, L۟/w8;->ۥ۟۠:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c608c69 -> :sswitch_0
        -0x53752987 -> :sswitch_2
        -0xdb504a2 -> :sswitch_1
    .end sparse-switch
.end method

.method public ۥ۟ۡ(L۟/w8;)L۟/y8$a;
    .locals 4

    const-string v0, "\u06df\u06e6\u06e8\u06d8\u06e2\u06e0\u06e1\u06e0\u06e6\u06e2\u06e0\u06e0\u06e1\u06dc\u06dc\u06ec\u06e0\u06d6\u06e8\u06d7\u06e1\u06d9\u06eb\u06eb\u06d9\u06dc\u06e0\u06df\u06d6\u06db\u06da\u06da\u06e4\u06e0\u06df\u06ec\u06da\u06df\u06df\u06e6\u06eb\u06e7\u06d7\u06da\u06e1\u06d8"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x1a4

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2a6

    const/16 v2, 0x1f

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x4b

    const/16 v2, 0x36c

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x396

    const/16 v2, 0x2d6

    const v3, 0x19f24f30

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e6\u06eb\u06da\u06e6\u06eb\u06e8\u06d8\u06d7\u06e1\u06e6\u06d8\u06e7\u06e4\u06e5\u06d8\u06df\u06e4\u06ec\u06d9\u06e6\u06ec\u06e2\u06dc\u06e8\u06d8\u06e6\u06da\u06d8\u06d8\u06da\u06e8\u06d8\u06d8\u06e8\u06e6\u06df\u06ec\u06da\u06ec\u06d7\u06e8\u06d8\u06d8\u06eb\u06da\u06da\u06e2\u06d7\u06e8\u06d7\u06e8\u06e5\u06d8"

    goto :goto_0

    :sswitch_1
    const-string v0, "\u06e4\u06df\u06ec\u06dc\u06e6\u06e7\u06dc\u06eb\u06db\u06eb\u06d9\u06d8\u06ec\u06dc\u06d9\u06da\u06dc\u06d8\u06e0\u06df\u06e8\u06eb\u06e5\u06d8\u06d9\u06e0\u06dc\u06d9\u06d8\u06e6\u06e1\u06dc\u06e5\u06d8\u06dc\u06eb\u06dc\u06d8\u06e1\u06e6\u06db\u06e4\u06d6\u06dc\u06e0\u06e8\u06db"

    goto :goto_0

    :sswitch_2
    new-instance v0, L۟/y8$a;

    invoke-virtual {p0, p1}, L۟/r0;->ۥۣ۟(L۟/w8;)Ljava/io/InputStream;

    move-result-object v1

    sget-object v2, L۟/z7$e;->ۥ۟۟:L۟/z7$e;

    invoke-direct {v0, v1, v2}, L۟/y8$a;-><init>(Ljava/io/InputStream;L۟/z7$e;)V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x14a1e342 -> :sswitch_1
        0x12f63c02 -> :sswitch_2
        0x76748d40 -> :sswitch_0
    .end sparse-switch
.end method

.method public final ۥۣ۟(L۟/w8;)Ljava/io/InputStream;
    .locals 4

    const-string v0, "\u06e6\u06d9\u06e8\u06df\u06ec\u06e6\u06da\u06e7\u06e2\u06eb\u06dc\u06e7\u06d8\u06d7\u06e5\u06d6\u06d8\u06df\u06d8\u06e7\u06eb\u06eb\u06e1\u06e7\u06d9\u06dc\u06d8\u06df\u06dc\u06d6\u06e8\u06dc\u06e6\u06db\u06e6\u06e6\u06df\u06db\u06db\u06e8\u06eb\u06da\u06e1\u06d9\u06df\u06e6\u06dc\u06dc\u06e8\u06df\u06dc\u06da\u06d7\u06eb\u06e7\u06d9"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x33

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x14c

    const/16 v2, 0x2fc

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2f2

    const/16 v2, 0x2fe

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x6b

    const/4 v2, 0x3

    const v3, -0x5d1c1f3a

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e7\u06e4\u06d6\u06db\u06e6\u06e2\u06df\u06e5\u06e6\u06d7\u06e6\u06da\u06da\u06d8\u06e0\u06db\u06d8\u06e6\u06e7\u06df\u06e6\u06d8\u06e4\u06d9\u06d8\u06eb\u06e5\u06ec\u06e0\u06d7\u06d6\u06d9\u06df\u06db\u06e2\u06e2\u06e8\u06e5\u06e8\u06ec\u06e4\u06d6\u06e7\u06e6\u06eb\u06dc\u06dc\u06e1\u06e1\u06e0\u06ec\u06e1\u06d8\u06db\u06e6\u06e1\u06dc\u06e0\u06e6\u06eb\u06e8\u06e5\u06d8\u06dc\u06df\u06d8\u06d8\u06db\u06e5\u06e5\u06d8\u06db\u06e0"

    goto :goto_0

    :sswitch_1
    const-string v0, "\u06e8\u06e1\u06e7\u06e4\u06d8\u06db\u06db\u06d6\u06e7\u06d8\u06e6\u06e1\u06ec\u06e5\u06e4\u06dc\u06d8\u06e5\u06eb\u06d8\u06d8\u06d6\u06db\u06e8\u06d8\u06d8\u06d6\u06db\u06db\u06e7\u06e7\u06d7\u06df\u06eb\u06e4\u06eb\u06dc\u06d8\u06e0\u06d7\u06e8\u06e1\u06e5\u06d8\u06e1\u06df\u06e4\u06d9\u06df\u06e8\u06d8\u06df\u06d8\u06d7\u06da\u06d9\u06dc\u06d8\u06e5\u06da\u06eb\u06e5\u06d8\u06da\u06d7\u06db\u06da\u06e7\u06e0\u06e5\u06e2\u06db\u06e1\u06dc\u06dc\u06d8\u06e7\u06d6\u06e7\u06d8"

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, L۟/r0;->ۥ:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p1, L۟/w8;->ۥ۟۠:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x38ce0281 -> :sswitch_1
        0x3f7df4b1 -> :sswitch_0
        0x51e3e2dc -> :sswitch_2
    .end sparse-switch
.end method
