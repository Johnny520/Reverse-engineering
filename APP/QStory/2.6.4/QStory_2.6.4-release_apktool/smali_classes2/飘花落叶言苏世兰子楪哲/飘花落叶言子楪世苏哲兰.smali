.class public L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世苏哲兰;
.super L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世苏哲兰;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Method;

.field public 飘花落叶言子楪哲兰苏世:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 5

    .line 1
    sget v0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 2
    .line 3
    const/16 v1, 0x18e0

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v0, 0x443

    .line 8
    .line 9
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    array-length v0, p1

    .line 22
    const/4 v1, 0x0

    .line 23
    :goto_0
    if-ge v1, v0, :cond_0

    .line 24
    .line 25
    aget-object v2, p1, v1

    .line 26
    .line 27
    new-instance v3, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;

    .line 28
    .line 29
    const/4 v4, 0x7

    .line 30
    invoke-direct {v3, v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v2, v3}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;)V

    .line 34
    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/16 p1, 0x444

    .line 40
    .line 41
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 52
    .line 53
    const-class v2, Ljava/lang/String;

    .line 54
    .line 55
    filled-new-array {v2, v0, v1, v0}, [Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {p1, v0}, L飘花落叶言楪兰哲世苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪兰苏哲(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    new-instance v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;

    .line 64
    .line 65
    const/16 v1, 0x8

    .line 66
    .line 67
    invoke-direct {v0, v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p1, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_1
    new-instance p1, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;

    .line 75
    .line 76
    const/16 v0, 0x9

    .line 77
    .line 78
    invoke-direct {p1, v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Method;

    .line 82
    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    invoke-virtual {p0, v0, p1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    iget-object v0, p0, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/reflect/Method;

    .line 89
    .line 90
    if-eqz v0, :cond_3

    .line 91
    .line 92
    invoke-virtual {p0, v0, p1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 0

    .line 1
    const/16 p0, 0x442

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;)V
    .locals 1

    .line 1
    const/16 v0, 0x447

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Method;

    .line 12
    .line 13
    const/16 v0, 0x449

    .line 14
    .line 15
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/reflect/Method;

    .line 24
    .line 25
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;)V
    .locals 5

    .line 1
    const/16 p0, 0x445

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)[Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    array-length v0, p0

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_2

    .line 14
    .line 15
    aget-object v2, p0, v1

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const/16 v4, 0x446

    .line 26
    .line 27
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    const/16 v4, 0x447

    .line 38
    .line 39
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {p1, v2, v4}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏(Ljava/lang/reflect/Method;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    const/16 v4, 0x448

    .line 47
    .line 48
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    const/16 v3, 0x449

    .line 59
    .line 60
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {p1, v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏(Ljava/lang/reflect/Method;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    return-void
.end method
