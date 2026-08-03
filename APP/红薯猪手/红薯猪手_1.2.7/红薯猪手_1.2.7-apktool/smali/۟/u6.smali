.class public final L۟/u6;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static ۥ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Ljava/lang/String;L۟/g3;I)Ljava/lang/String;
    .locals 11

    and-int/lit8 v0, p2, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v0, L۟/e2;->ۥ:L۟/e2;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const/4 v2, 0x4

    and-int/2addr p2, v2

    if-eqz p2, :cond_1

    move-object p1, v1

    :cond_1
    const/4 p2, 0x3

    new-array v1, p2, [B

    fill-array-data v1, :array_0

    const/4 v3, 0x6

    new-array v4, v3, [B

    fill-array-data v4, :array_1

    invoke-static {v1, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v1, v3, [B

    fill-array-data v1, :array_2

    new-array v4, v3, [B

    fill-array-data v4, :array_3

    invoke-static {v1, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    const/16 v1, 0x1f40

    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    const/4 v1, 0x7

    new-array v4, v1, [B

    const/16 v5, -0x45

    const/4 v6, 0x0

    aput-byte v5, v4, v6

    const/16 v5, 0x15

    const/4 v7, 0x1

    aput-byte v5, v4, v7

    const/16 v5, -0x54

    const/4 v8, 0x2

    aput-byte v5, v4, v8

    const/16 v5, -0x1e

    aput-byte v5, v4, p2

    const/16 v5, -0x7b

    aput-byte v5, v4, v2

    const/16 v5, 0x62

    const/4 v9, 0x5

    aput-byte v5, v4, v9

    const/16 v5, -0x65

    aput-byte v5, v4, v3

    new-array v5, v3, [B

    const/16 v10, -0x17

    aput-byte v10, v5, v6

    const/16 v10, 0x70

    aput-byte v10, v5, v7

    const/16 v10, -0x36

    aput-byte v10, v5, v8

    const/16 v10, -0x79

    aput-byte v10, v5, p2

    const/16 v10, -0x9

    aput-byte v10, v5, v2

    aput-byte v1, v5, v9

    invoke-static {v4, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4, p0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V

    new-instance v4, Ljava/io/InputStreamReader;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    :goto_1
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    if-eqz p1, :cond_3

    invoke-interface {p1, p0}, L۟/g3;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/16 p1, 0xd

    new-array p1, p1, [B

    const/16 v0, -0x27

    aput-byte v0, p1, v6

    const/16 v0, -0x35

    aput-byte v0, p1, v7

    const/16 v0, -0x2b

    aput-byte v0, p1, v8

    const/4 v0, -0x3

    aput-byte v0, p1, p2

    const/16 v0, -0x29

    aput-byte v0, p1, v2

    const/16 v0, 0x1f

    aput-byte v0, p1, v9

    const/16 v0, -0x3d

    aput-byte v0, p1, v3

    aput-byte v0, p1, v1

    const/16 v0, 0x8

    const/16 v1, -0x52

    aput-byte v1, p1, v0

    const/16 v0, 0x9

    const/16 v1, -0x59

    aput-byte v1, p1, v0

    const/16 v0, 0xa

    const/16 v1, -0x75

    aput-byte v1, p1, v0

    const/16 v0, 0xb

    const/16 v1, 0x58

    aput-byte v1, p1, v0

    const/16 v0, 0xc

    const/16 v1, -0x7c

    aput-byte v1, p1, v0

    new-array v0, v3, [B

    const/16 v1, -0x53

    aput-byte v1, v0, v6

    const/16 v1, -0x5c

    aput-byte v1, v0, v7

    const/16 v1, -0x7a

    aput-byte v1, v0, v8

    const/16 v1, -0x77

    aput-byte v1, v0, p2

    const/16 p2, -0x5b

    aput-byte p2, v0, v2

    const/16 p2, 0x76

    aput-byte p2, v0, v9

    invoke-static {p1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const-string p0, ""

    :goto_2
    return-object p0

    nop

    :array_0
    .array-data 1
        0x7ft
        -0x17t
        -0x2ct
    .end array-data

    :array_1
    .array-data 1
        0xat
        -0x65t
        -0x48t
        -0x7at
        0x22t
        -0x8t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x7ct
        0x42t
        0x53t
        -0x65t
        -0x1ft
        -0x7t
    .end array-data

    nop

    :array_3
    .array-data 1
        -0x14t
        0x27t
        0x32t
        -0x1t
        -0x7ct
        -0x75t
    .end array-data
.end method
