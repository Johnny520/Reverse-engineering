.class public final L飘花落叶言子兰苏世哲楪/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言子兰苏世哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/ClassLoader;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰()Landroidx/window/extensions/WindowExtensions;
    .locals 5

    .line 1
    const-string v0, "androidx.window.extensions.WindowExtensionsProvider"

    .line 2
    .line 3
    iget-object v1, p0, L飘花落叶言子兰苏世哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    :try_start_0
    invoke-virtual {v1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 12
    .line 13
    .line 14
    move v4, v2

    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move v4, v3

    .line 17
    :goto_0
    if-eqz v4, :cond_1

    .line 18
    .line 19
    :try_start_1
    invoke-virtual {v1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 24
    .line 25
    .line 26
    :try_start_2
    const-string v0, "WindowExtensionsProvider#getWindowExtensions is not valid"

    .line 27
    .line 28
    new-instance v1, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世苏兰哲;

    .line 29
    .line 30
    const/4 v4, 0x5

    .line 31
    invoke-direct {v1, p0, v4}, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪兰哲(Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catch_1
    :cond_0
    move v2, v3

    .line 42
    :goto_1
    if-eqz v2, :cond_1

    .line 43
    .line 44
    invoke-static {}, Landroidx/window/extensions/WindowExtensionsProvider;->getWindowExtensions()Landroidx/window/extensions/WindowExtensions;

    .line 45
    .line 46
    .line 47
    move-result-object p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 48
    return-object p0

    .line 49
    :catch_2
    :cond_1
    const/4 p0, 0x0

    .line 50
    return-object p0
.end method
