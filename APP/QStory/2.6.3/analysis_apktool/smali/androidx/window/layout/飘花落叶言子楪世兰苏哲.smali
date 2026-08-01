.class public final Landroidx/window/layout/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:L飘花落叶言子兰苏世哲楪/飘花落叶言子楪世苏哲兰;

.field public final 飘花落叶言子楪世苏兰哲:L飘花落叶言世楪子哲兰苏/飘花落叶言子楪世苏兰哲;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;L飘花落叶言世楪子哲兰苏/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/window/layout/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/ClassLoader;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/window/layout/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世楪子哲兰苏/飘花落叶言子楪世苏兰哲;

    .line 7
    .line 8
    new-instance p2, L飘花落叶言子兰苏世哲楪/飘花落叶言子楪世苏哲兰;

    .line 9
    .line 10
    invoke-direct {p2, p1}, L飘花落叶言子兰苏世哲楪/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/ClassLoader;)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Landroidx/window/layout/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言子兰苏世哲楪/飘花落叶言子楪世苏哲兰;

    .line 14
    .line 15
    return-void
.end method

.method public static final 飘花落叶言子楪世哲兰苏(Landroidx/window/layout/飘花落叶言子楪世兰苏哲;)Z
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/window/layout/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    const-string v0, "androidx.window.extensions.layout.WindowLayoutComponent"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-class v0, Landroid/content/Context;

    .line 13
    .line 14
    const-class v1, Landroidx/window/extensions/core/util/function/Consumer;

    .line 15
    .line 16
    filled-new-array {v0, v1}, [Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "addWindowLayoutInfoListener"

    .line 21
    .line 22
    invoke-virtual {p0, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-class v1, Landroidx/window/extensions/core/util/function/Consumer;

    .line 27
    .line 28
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "removeWindowLayoutInfoListener"

    .line 33
    .line 34
    invoke-virtual {p0, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_0

    .line 63
    .line 64
    const/4 p0, 0x1

    .line 65
    return p0

    .line 66
    :cond_0
    const/4 p0, 0x0

    .line 67
    return p0
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/window/layout/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v1, "WindowLayoutComponent#addWindowLayoutInfoListener("

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-class v1, Landroid/content/Context;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", androidx.window.extensions.core.util.function.Consumer) is not valid"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, Landroidx/window/layout/飘花落叶言子楪世哲兰苏;

    .line 33
    .line 34
    const/4 v2, 0x6

    .line 35
    invoke-direct {v1, p0, v2}, Landroidx/window/layout/飘花落叶言子楪世哲兰苏;-><init>(Landroidx/window/layout/飘花落叶言子楪世兰苏哲;I)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪兰哲(Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    const/4 p0, 0x1

    .line 45
    return p0

    .line 46
    :cond_0
    const/4 p0, 0x0

    .line 47
    return p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()Z
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "WindowLayoutComponent#addWindowLayoutInfoListener("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-class v1, Landroid/app/Activity;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, ", java.util.function.Consumer) is not valid"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Landroidx/window/layout/飘花落叶言子楪世哲兰苏;

    .line 27
    .line 28
    const/4 v2, 0x5

    .line 29
    invoke-direct {v1, p0, v2}, Landroidx/window/layout/飘花落叶言子楪世哲兰苏;-><init>(Landroidx/window/layout/飘花落叶言子楪世兰苏哲;I)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪兰哲(Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()Landroidx/window/extensions/layout/WindowLayoutComponent;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/window/layout/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言子兰苏世哲楪/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :try_start_0
    iget-object v2, v0, L飘花落叶言子兰苏世哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    const-string v3, "androidx.window.extensions.WindowExtensionsProvider"

    .line 10
    .line 11
    invoke-virtual {v2, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    new-instance v2, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世苏兰哲;

    .line 19
    .line 20
    const/4 v3, 0x5

    .line 21
    invoke-direct {v2, v0, v3}, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    const-string v0, "WindowExtensionsProvider#getWindowExtensions is not valid"

    .line 25
    .line 26
    invoke-static {v0, v2}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪兰哲(Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    new-instance v0, Landroidx/window/layout/飘花落叶言子楪世哲兰苏;

    .line 33
    .line 34
    invoke-direct {v0, p0, v1}, Landroidx/window/layout/飘花落叶言子楪世哲兰苏;-><init>(Landroidx/window/layout/飘花落叶言子楪世兰苏哲;I)V

    .line 35
    .line 36
    .line 37
    const-string v2, "WindowExtensions#getWindowLayoutComponent is not valid"

    .line 38
    .line 39
    invoke-static {v2, v0}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪兰哲(Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    new-instance v0, Landroidx/window/layout/飘花落叶言子楪世哲兰苏;

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    invoke-direct {v0, p0, v2}, Landroidx/window/layout/飘花落叶言子楪世哲兰苏;-><init>(Landroidx/window/layout/飘花落叶言子楪世兰苏哲;I)V

    .line 49
    .line 50
    .line 51
    const-string v4, "FoldingFeature class is not valid"

    .line 52
    .line 53
    invoke-static {v4, v0}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪兰哲(Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    invoke-static {}, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-ge v0, v2, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    if-ne v0, v2, :cond_1

    .line 67
    .line 68
    invoke-virtual {p0}, Landroidx/window/layout/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    goto :goto_0

    .line 73
    :cond_1
    if-ge v0, v3, :cond_2

    .line 74
    .line 75
    invoke-virtual {p0}, Landroidx/window/layout/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    goto :goto_0

    .line 80
    :cond_2
    invoke-virtual {p0}, Landroidx/window/layout/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    new-instance v0, Landroidx/window/layout/飘花落叶言子楪世哲兰苏;

    .line 87
    .line 88
    const/4 v3, 0x3

    .line 89
    invoke-direct {v0, p0, v3}, Landroidx/window/layout/飘花落叶言子楪世哲兰苏;-><init>(Landroidx/window/layout/飘花落叶言子楪世兰苏哲;I)V

    .line 90
    .line 91
    .line 92
    const-string v3, "DisplayFoldFeature is not valid"

    .line 93
    .line 94
    invoke-static {v3, v0}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪兰哲(Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_3

    .line 99
    .line 100
    new-instance v0, Landroidx/window/layout/飘花落叶言子楪世哲兰苏;

    .line 101
    .line 102
    const/4 v3, 0x2

    .line 103
    invoke-direct {v0, p0, v3}, Landroidx/window/layout/飘花落叶言子楪世哲兰苏;-><init>(Landroidx/window/layout/飘花落叶言子楪世兰苏哲;I)V

    .line 104
    .line 105
    .line 106
    const-string v3, "SupportedWindowFeatures is not valid"

    .line 107
    .line 108
    invoke-static {v3, v0}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪兰哲(Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_3

    .line 113
    .line 114
    new-instance v0, Landroidx/window/layout/飘花落叶言子楪世哲兰苏;

    .line 115
    .line 116
    const/4 v3, 0x4

    .line 117
    invoke-direct {v0, p0, v3}, Landroidx/window/layout/飘花落叶言子楪世哲兰苏;-><init>(Landroidx/window/layout/飘花落叶言子楪世兰苏哲;I)V

    .line 118
    .line 119
    .line 120
    const-string p0, "WindowLayoutComponent#getSupportedWindowFeatures is not valid"

    .line 121
    .line 122
    invoke-static {p0, v0}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪兰哲(Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Z

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    if-eqz p0, :cond_3

    .line 127
    .line 128
    move v1, v2

    .line 129
    :catch_0
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 130
    if-eqz v1, :cond_4

    .line 131
    .line 132
    :try_start_1
    invoke-static {}, Landroidx/window/extensions/WindowExtensionsProvider;->getWindowExtensions()Landroidx/window/extensions/WindowExtensions;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-interface {v0}, Landroidx/window/extensions/WindowExtensions;->getWindowLayoutComponent()Landroidx/window/extensions/layout/WindowLayoutComponent;

    .line 137
    .line 138
    .line 139
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_1

    .line 140
    :catch_1
    :cond_4
    return-object p0
.end method
