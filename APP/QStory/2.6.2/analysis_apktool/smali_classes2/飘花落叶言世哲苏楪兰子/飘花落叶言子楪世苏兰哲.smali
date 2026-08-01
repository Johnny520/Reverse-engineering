.class public L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;
.super L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪兰世苏哲:Ljava/util/Set;

.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ExecutorService;

.field public 飘花落叶言子楪哲兰苏世:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    const-wide v0, -0x36a53416051405a7L    # -2.39033115411881E45

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    const-wide v0, -0x36a53419051405a7L    # -2.3903270707304068E45

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    new-instance v0, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/HashMap;

    .line 32
    .line 33
    new-instance v0, Ljava/util/HashSet;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/util/Set;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 2

    .line 1
    const-wide v0, -0x36a53416051405a7L    # -2.39033115411881E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子世楪兰苏哲(Ljava/lang/String;)Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/util/Set;

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Set;->size()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/util/Set;

    .line 23
    .line 24
    const-wide v0, -0x36a532c4051405a7L    # -2.390791215878887E45

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/util/Set;

    .line 37
    .line 38
    const-wide v0, -0x36a532cf051405a7L    # -2.3907762434547425E45

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :cond_0
    const-wide v0, -0x36a53419051405a7L    # -2.3903270707304068E45

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p1}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子世楪苏兰哲(Ljava/lang/String;)Ljava/util/HashMap;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/HashMap;

    .line 64
    .line 65
    invoke-virtual {p0}, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰哲世()V

    .line 66
    .line 67
    .line 68
    new-instance p1, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世哲苏兰;

    .line 69
    .line 70
    const/4 v0, 0x2

    .line 71
    invoke-direct {p1, p0, v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;I)V

    .line 72
    .line 73
    .line 74
    sget-object v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪苏兰哲世;

    .line 75
    .line 76
    const-wide v0, -0x36a59105051405a7L    # -2.3579485229531457E45

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    const-wide v0, -0x36a590c6051405a7L    # -2.3580342741096098E45

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    new-instance v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲世苏兰;

    .line 93
    .line 94
    invoke-direct {v0, p0, p1}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲世苏兰;-><init>(L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲世兰苏;)V

    .line 95
    .line 96
    .line 97
    sget-object p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide v0, -0x36a53402051405a7L    # -2.3903583767081636E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子世楪哲兰苏()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-wide v0, -0x36a53416051405a7L    # -2.39033115411881E45

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-wide v0, -0x36a533fb051405a7L    # -2.3903679046144373E45

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰()Landroid/view/View$OnClickListener;
    .locals 1

    .line 1
    new-instance v0, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final 飘花落叶言子楪苏兰世哲(L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final 飘花落叶言子楪苏兰哲世()V
    .locals 2

    .line 1
    const-wide v0, -0x36a53419051405a7L    # -2.3903270707304068E45

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
    iget-object v1, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子世兰楪苏哲(Ljava/lang/String;Ljava/util/HashMap;)V

    .line 13
    .line 14
    .line 15
    const-wide v0, -0x36a53416051405a7L    # -2.39033115411881E45

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object p0, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/util/Set;

    .line 25
    .line 26
    invoke-static {v0, p0}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子世兰楪哲苏(Ljava/lang/String;Ljava/util/Set;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final 飘花落叶言子楪苏哲兰世(L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
