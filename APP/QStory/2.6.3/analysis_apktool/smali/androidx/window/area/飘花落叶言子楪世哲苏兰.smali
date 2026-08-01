.class public final Landroidx/window/area/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Landroidx/window/extensions/WindowExtensions;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/window/area/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/ClassLoader;

    .line 5
    .line 6
    new-instance v0, L飘花落叶言子兰苏世哲楪/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    invoke-direct {v0, p1}, L飘花落叶言子兰苏世哲楪/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/ClassLoader;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, L飘花落叶言子兰苏世哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()Landroidx/window/extensions/WindowExtensions;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Landroidx/window/area/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Landroidx/window/extensions/WindowExtensions;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰()Landroidx/window/extensions/area/WindowAreaComponent;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/window/area/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Landroidx/window/area/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Landroidx/window/extensions/WindowExtensions;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v2, "WindowExtensions#getWindowAreaComponent is not valid"

    .line 8
    .line 9
    new-instance v3, Landroidx/window/area/飘花落叶言子楪世苏兰哲;

    .line 10
    .line 11
    invoke-direct {v3, v1, p0}, Landroidx/window/area/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;Landroidx/window/area/飘花落叶言子楪世哲苏兰;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v3}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪兰哲(Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 21
    .line 22
    const/16 v2, 0x1d

    .line 23
    .line 24
    if-lt v1, v2, :cond_0

    .line 25
    .line 26
    const-string v1, "androidx.window.extensions.area.WindowAreaComponent"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {}, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-static {v2, v1}, L飘花落叶言子兰苏哲楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(ILjava/lang/Class;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    const-string v1, "androidx.window.extensions.area.ExtensionWindowAreaStatus"

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {}, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    invoke-static {v2, v1}, L飘花落叶言子兰苏哲楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/Class;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_0

    .line 63
    .line 64
    const-string v1, "androidx.window.extensions.area.ExtensionWindowAreaPresentation"

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {}, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    invoke-static {v1, v0}, L飘花落叶言子兰苏哲楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(ILjava/lang/Class;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_0

    .line 82
    .line 83
    iget-object p0, p0, Landroidx/window/area/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Landroidx/window/extensions/WindowExtensions;

    .line 84
    .line 85
    invoke-interface {p0}, Landroidx/window/extensions/WindowExtensions;->getWindowAreaComponent()Landroidx/window/extensions/area/WindowAreaComponent;

    .line 86
    .line 87
    .line 88
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    return-object p0

    .line 90
    :catchall_0
    :cond_0
    const/4 p0, 0x0

    .line 91
    return-object p0
.end method
