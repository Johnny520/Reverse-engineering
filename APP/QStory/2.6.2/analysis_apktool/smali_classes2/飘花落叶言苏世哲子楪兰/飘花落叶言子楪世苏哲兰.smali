.class public L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世苏哲兰;
.super L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Method;

.field public 飘花落叶言子楪哲兰苏世:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 5

    .line 1
    sget v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I

    .line 2
    .line 3
    const/16 v1, 0x18e0

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    const-wide v0, -0x36a56e23051405a7L    # -2.3701034090995616E45

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    array-length v0, p1

    .line 25
    const/4 v1, 0x0

    .line 26
    :goto_0
    if-ge v1, v0, :cond_0

    .line 27
    .line 28
    aget-object v2, p1, v1

    .line 29
    .line 30
    new-instance v3, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;

    .line 31
    .line 32
    const/16 v4, 0x16

    .line 33
    .line 34
    invoke-direct {v3, v4}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v2, v3}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const-wide v0, -0x36a56de4051405a7L    # -2.3701891602560257E45

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 57
    .line 58
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    const-class v2, Ljava/lang/String;

    .line 61
    .line 62
    filled-new-array {v2, v0, v1, v0}, [Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {p1, v0}, L飘花落叶言世兰哲子楪苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    new-instance v0, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;

    .line 71
    .line 72
    const/16 v1, 0x17

    .line 73
    .line 74
    invoke-direct {v0, v1}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p1, v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_1
    new-instance p1, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;

    .line 82
    .line 83
    const/16 v0, 0x18

    .line 84
    .line 85
    invoke-direct {p1, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Method;

    .line 89
    .line 90
    if-eqz v0, :cond_2

    .line 91
    .line 92
    invoke-virtual {p0, v0, p1}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;)V

    .line 93
    .line 94
    .line 95
    :cond_2
    iget-object v0, p0, L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/reflect/Method;

    .line 96
    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    invoke-virtual {p0, v0, p1}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;)V

    .line 100
    .line 101
    .line 102
    :cond_3
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 2

    .line 1
    const-wide v0, -0x36a56e43051405a7L    # -2.3700598529565957E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;)V
    .locals 2

    .line 1
    const-wide v0, -0x36a56d89051405a7L    # -2.370313023037585E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Method;

    .line 15
    .line 16
    const-wide v0, -0x36a56d4c051405a7L    # -2.3703960519351136E45

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/reflect/Method;

    .line 30
    .line 31
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;)V
    .locals 6

    .line 1
    const-wide v0, -0x36a56dce051405a7L    # -2.3702191051043147E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)[Ljava/lang/reflect/Method;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    array-length v0, p0

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, v0, :cond_2

    .line 17
    .line 18
    aget-object v2, p0, v1

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const-wide v4, -0x36a56db8051405a7L    # -2.3702490499526038E45

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    const-wide v4, -0x36a56d89051405a7L    # -2.370313023037585E45

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {p1, v2, v4}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏(Ljava/lang/reflect/Method;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    const-wide v4, -0x36a56d7d051405a7L    # -2.370329356591197E45

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_1

    .line 69
    .line 70
    const-wide v3, -0x36a56d4c051405a7L    # -2.3703960519351136E45

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {p1, v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏(Ljava/lang/reflect/Method;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    return-void
.end method
