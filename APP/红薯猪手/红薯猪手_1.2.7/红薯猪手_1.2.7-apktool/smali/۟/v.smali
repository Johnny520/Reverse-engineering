.class public final L۟/v;
.super L۟/y8;
.source "SourceFile"


# instance fields
.field public final ۥ:Landroid/content/res/AssetManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, L۟/y8;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    iput-object p1, p0, L۟/v;->ۥ:Landroid/content/res/AssetManager;

    return-void
.end method


# virtual methods
.method public final ۥ۟(L۟/w8;)Z
    .locals 2

    iget-object p1, p1, L۟/w8;->ۥ۟۠:Landroid/net/Uri;

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v1, "file"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "android_asset"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final ۥ۟ۡ(L۟/w8;)L۟/y8$a;
    .locals 2

    .line 1
    iget-object v0, p0, L۟/v;->ۥ:Landroid/content/res/AssetManager;

    .line 2
    .line 3
    iget-object p1, p1, L۟/w8;->ۥ۟۠:Landroid/net/Uri;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/16 v1, 0x16

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v0, L۟/y8$a;

    .line 20
    .line 21
    sget-object v1, L۟/z7$e;->ۥ۟۟:L۟/z7$e;

    .line 22
    .line 23
    invoke-direct {v0, p1, v1}, L۟/y8$a;-><init>(Ljava/io/InputStream;L۟/z7$e;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method
