.class public final Lcom/davemorrissey/labs/subscaleview/ImageSource;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field static final ASSET_SCHEME:Ljava/lang/String; = "file:///android_asset/"

.field static final FILE_SCHEME:Ljava/lang/String; = "file:///"


# instance fields
.field private final bitmap:Landroid/graphics/Bitmap;

.field private cached:Z

.field private final resource:Ljava/lang/Integer;

.field private sHeight:I

.field private sRegion:Landroid/graphics/Rect;

.field private sWidth:I

.field private tile:Z

.field private final uri:Landroid/net/Uri;


# direct methods
.method private constructor <init>(I)V
    .locals 1

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 62
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->bitmap:Landroid/graphics/Bitmap;

    .line 63
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->uri:Landroid/net/Uri;

    .line 64
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->resource:Ljava/lang/Integer;

    const/4 p1, 0x1

    .line 65
    iput-boolean p1, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->tile:Z

    return-void
.end method

.method private constructor <init>(Landroid/graphics/Bitmap;Z)V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->bitmap:Landroid/graphics/Bitmap;

    const/4 v0, 0x0

    .line 55
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->uri:Landroid/net/Uri;

    .line 56
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->resource:Ljava/lang/Integer;

    const/4 v0, 0x0

    .line 57
    iput-boolean v0, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->tile:Z

    .line 58
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->sWidth:I

    .line 59
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    iput p1, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->sHeight:I

    .line 60
    iput-boolean p2, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->cached:Z

    return-void
.end method

.method private constructor <init>(Landroid/net/Uri;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "file:///"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    new-instance v1, Ljava/io/File;

    .line 17
    .line 18
    const/4 v2, 0x7

    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    :try_start_0
    const-string v1, "UTF-8"

    .line 33
    .line 34
    invoke-static {v0, v1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 39
    .line 40
    .line 41
    move-result-object p1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    :catch_0
    :cond_0
    const/4 v0, 0x0

    .line 43
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->bitmap:Landroid/graphics/Bitmap;

    .line 44
    .line 45
    iput-object p1, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->uri:Landroid/net/Uri;

    .line 46
    .line 47
    iput-object v0, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->resource:Ljava/lang/Integer;

    .line 48
    .line 49
    const/4 p1, 0x1

    .line 50
    iput-boolean p1, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->tile:Z

    .line 51
    .line 52
    return-void
.end method

.method public static asset(Ljava/lang/String;)Lcom/davemorrissey/labs/subscaleview/ImageSource;
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const-string v0, "file:///android_asset/"

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->uri(Ljava/lang/String;)Lcom/davemorrissey/labs/subscaleview/ImageSource;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "Asset name must not be null"

    .line 15
    .line 16
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public static bitmap(Landroid/graphics/Bitmap;)Lcom/davemorrissey/labs/subscaleview/ImageSource;
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    new-instance v0, Lcom/davemorrissey/labs/subscaleview/ImageSource;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, p0, v1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;-><init>(Landroid/graphics/Bitmap;Z)V

    .line 7
    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const-string p0, "Bitmap must not be null"

    .line 11
    .line 12
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public static cachedBitmap(Landroid/graphics/Bitmap;)Lcom/davemorrissey/labs/subscaleview/ImageSource;
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    new-instance v0, Lcom/davemorrissey/labs/subscaleview/ImageSource;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-direct {v0, p0, v1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;-><init>(Landroid/graphics/Bitmap;Z)V

    .line 7
    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const-string p0, "Bitmap must not be null"

    .line 11
    .line 12
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public static resource(I)Lcom/davemorrissey/labs/subscaleview/ImageSource;
    .locals 1

    .line 1
    new-instance v0, Lcom/davemorrissey/labs/subscaleview/ImageSource;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/davemorrissey/labs/subscaleview/ImageSource;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private setInvariants()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->sRegion:Landroid/graphics/Rect;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    iput-boolean v1, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->tile:Z

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iput v0, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->sWidth:I

    .line 13
    .line 14
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->sRegion:Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iput v0, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->sHeight:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public static uri(Landroid/net/Uri;)Lcom/davemorrissey/labs/subscaleview/ImageSource;
    .locals 1

    if-eqz p0, :cond_0

    .line 47
    new-instance v0, Lcom/davemorrissey/labs/subscaleview/ImageSource;

    invoke-direct {v0, p0}, Lcom/davemorrissey/labs/subscaleview/ImageSource;-><init>(Landroid/net/Uri;)V

    return-object v0

    .line 48
    :cond_0
    const-string p0, "Uri must not be null"

    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static uri(Ljava/lang/String;)Lcom/davemorrissey/labs/subscaleview/ImageSource;
    .locals 1

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    const-string v0, "://"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    const-string v0, "/"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :cond_0
    const-string v0, "file:///"

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_1
    new-instance v0, Lcom/davemorrissey/labs/subscaleview/ImageSource;

    .line 31
    .line 32
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-direct {v0, p0}, Lcom/davemorrissey/labs/subscaleview/ImageSource;-><init>(Landroid/net/Uri;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_2
    const-string p0, "Uri must not be null"

    .line 41
    .line 42
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0
.end method


# virtual methods
.method public dimensions(II)Lcom/davemorrissey/labs/subscaleview/ImageSource;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->bitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->sWidth:I

    .line 6
    .line 7
    iput p2, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->sHeight:I

    .line 8
    .line 9
    :cond_0
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->setInvariants()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final getBitmap()Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->bitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getResource()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->resource:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSHeight()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->sHeight:I

    .line 2
    .line 3
    return p0
.end method

.method public final getSRegion()Landroid/graphics/Rect;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->sRegion:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSWidth()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->sWidth:I

    .line 2
    .line 3
    return p0
.end method

.method public final getTile()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->tile:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getUri()Landroid/net/Uri;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->uri:Landroid/net/Uri;

    .line 2
    .line 3
    return-object p0
.end method

.method public final isCached()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->cached:Z

    .line 2
    .line 3
    return p0
.end method

.method public region(Landroid/graphics/Rect;)Lcom/davemorrissey/labs/subscaleview/ImageSource;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->sRegion:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->setInvariants()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public tiling(Z)Lcom/davemorrissey/labs/subscaleview/ImageSource;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/davemorrissey/labs/subscaleview/ImageSource;->tile:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public tilingDisabled()Lcom/davemorrissey/labs/subscaleview/ImageSource;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->tiling(Z)Lcom/davemorrissey/labs/subscaleview/ImageSource;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public tilingEnabled()Lcom/davemorrissey/labs/subscaleview/ImageSource;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->tiling(Z)Lcom/davemorrissey/labs/subscaleview/ImageSource;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method
