.class public final L۟/u2;
.super L۟/r0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, L۟/r0;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final ۥ۟(L۟/w8;)Z
    .locals 1

    iget-object p1, p1, L۟/w8;->ۥ۟۠:Landroid/net/Uri;

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    const-string v0, "file"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۥ۟ۡ(L۟/w8;)L۟/y8$a;
    .locals 5

    .line 1
    new-instance v0, L۟/y8$a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, L۟/r0;->ۥۣ۟(L۟/w8;)Ljava/io/InputStream;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, L۟/z7$e;->ۥ۟۟:L۟/z7$e;

    .line 8
    .line 9
    iget-object p1, p1, L۟/w8;->ۥ۟۠:Landroid/net/Uri;

    .line 10
    .line 11
    new-instance v3, Landroid/media/ExifInterface;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {v3, p1}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string p1, "Orientation"

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    invoke-virtual {v3, p1, v4}, Landroid/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    const/4 v3, 0x3

    .line 28
    if-eq p1, v3, :cond_2

    .line 29
    .line 30
    const/4 v3, 0x6

    .line 31
    if-eq p1, v3, :cond_1

    .line 32
    .line 33
    const/16 v3, 0x8

    .line 34
    .line 35
    if-eq p1, v3, :cond_0

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/16 p1, 0x10e

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/16 p1, 0x5a

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const/16 p1, 0xb4

    .line 46
    .line 47
    :goto_0
    const/4 v3, 0x0

    .line 48
    invoke-direct {v0, v3, v1, v2, p1}, L۟/y8$a;-><init>(Landroid/graphics/Bitmap;Ljava/io/InputStream;L۟/z7$e;I)V

    .line 49
    .line 50
    .line 51
    return-object v0
.end method
