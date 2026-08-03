.class public final L۟/u3;
.super Ljava/lang/ClassLoader;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L۟/u3$a;
    }
.end annotation


# static fields
.field public static final synthetic ۥ۟۟:I


# instance fields
.field public final ۥ:Ljava/lang/ClassLoader;

.field public final ۥ۟:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;Ljava/lang/ClassLoader;)V
    .locals 2

    const/4 v0, 0x6

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    invoke-static {v1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/ClassLoader;-><init>()V

    iput-object p1, p0, L۟/u3;->ۥ:Ljava/lang/ClassLoader;

    iput-object p2, p0, L۟/u3;->ۥ۟:Ljava/lang/ClassLoader;

    return-void

    :array_0
    .array-data 1
        -0x18t
        0x4ft
        0x14t
        -0x17t
        -0x6ft
        0x2at
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x75t
        0x23t
        0x56t
        -0x78t
        -0x1et
        0x4ft
    .end array-data
.end method


# virtual methods
.method public final getResource(Ljava/lang/String;)Ljava/net/URL;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v2, v1, [B

    fill-array-data v2, :array_1

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, L۟/u3;->ۥ:Ljava/lang/ClassLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->getResource(Ljava/lang/String;)Ljava/net/URL;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, L۟/u3;->ۥ۟:Ljava/lang/ClassLoader;

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->getResource(Ljava/lang/String;)Ljava/net/URL;

    move-result-object v0

    const/16 p1, 0x10

    new-array p1, p1, [B

    fill-array-data p1, :array_2

    new-array v1, v1, [B

    fill-array-data v1, :array_3

    invoke-static {p1, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    return-object v0

    nop

    :array_0
    .array-data 1
        -0x50t
        -0x47t
        0x54t
        0x24t
    .end array-data

    :array_1
    .array-data 1
        -0x22t
        -0x28t
        0x39t
        0x41t
        0x47t
        0x59t
    .end array-data

    nop

    :array_2
    .array-data 1
        0x3dt
        0x29t
        0x61t
        -0x7ct
        0x72t
        0x15t
        0x35t
        0x39t
        0x67t
        -0x4bt
        0x72t
        0x4et
        0x74t
        0x62t
        0x3bt
        -0x1t
    .end array-data

    :array_3
    .array-data 1
        0x5at
        0x4ct
        0x15t
        -0x2at
        0x17t
        0x66t
    .end array-data
.end method

.method public final loadClass(Ljava/lang/String;Z)Ljava/lang/Class;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    const/4 p2, 0x4

    new-array v0, p2, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v2, v1, [B

    fill-array-data v2, :array_1

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const/16 v0, 0xe

    :try_start_0
    iget-object v2, p0, L۟/u3;->ۥ:Ljava/lang/ClassLoader;

    invoke-static {v2}, L۟/h4;->ۥ۟(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    new-array v3, v0, [B

    const/16 v4, -0x29

    const/4 v5, 0x0

    aput-byte v4, v3, v5

    const/16 v4, -0x7d

    const/4 v6, 0x1

    aput-byte v4, v3, v6

    const/16 v4, -0x65

    const/4 v7, 0x2

    aput-byte v4, v3, v7

    const/16 v4, 0x2a

    const/4 v8, 0x3

    aput-byte v4, v3, v8

    const/16 v4, -0x11

    aput-byte v4, v3, p2

    const/16 v4, 0x59

    const/4 v9, 0x5

    aput-byte v4, v3, v9

    const/16 v4, -0x26

    aput-byte v4, v3, v1

    const/4 v4, 0x7

    const/16 v10, -0x61

    aput-byte v10, v3, v4

    const/16 v4, 0x8

    const/16 v10, -0x77

    aput-byte v10, v3, v4

    const/16 v4, 0x9

    const/16 v10, 0x66

    aput-byte v10, v3, v4

    const/16 v4, 0xa

    const/16 v10, -0x7e

    aput-byte v10, v3, v4

    const/16 v4, 0xb

    const/16 v10, 0x1b

    aput-byte v10, v3, v4

    const/16 v4, 0xc

    const/16 v10, -0x6b

    aput-byte v10, v3, v4

    const/16 v4, 0xd

    const/16 v10, -0x3b

    aput-byte v10, v3, v4

    new-array v4, v1, [B

    const/16 v10, -0x45

    aput-byte v10, v4, v5

    const/16 v5, -0x14

    aput-byte v5, v4, v6

    const/4 v5, -0x6

    aput-byte v5, v4, v7

    const/16 v5, 0x4e

    aput-byte v5, v4, v8

    const/16 v5, -0x54

    aput-byte v5, v4, p2

    const/16 p2, 0x35

    aput-byte p2, v4, v9

    invoke-static {v3, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v2}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    iget-object p2, p0, L۟/u3;->ۥ۟:Ljava/lang/ClassLoader;

    invoke-virtual {p2, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    new-array p2, v0, [B

    fill-array-data p2, :array_2

    new-array v0, v1, [B

    fill-array-data v0, :array_3

    invoke-static {p2, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p1

    nop

    :array_0
    .array-data 1
        0x73t
        0x37t
        -0x34t
        -0x32t
    .end array-data

    :array_1
    .array-data 1
        0x1dt
        0x56t
        -0x5ft
        -0x55t
        -0x1at
        -0x5ct
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x12t
        -0x24t
        0x4dt
        0x40t
        -0x6t
        0x29t
        -0x1dt
        -0x40t
        0x5ft
        0xct
        -0x69t
        0x6bt
        -0x54t
        -0x66t
    .end array-data

    nop

    :array_3
    .array-data 1
        -0x7et
        -0x4dt
        0x2ct
        0x24t
        -0x47t
        0x45t
    .end array-data
.end method
