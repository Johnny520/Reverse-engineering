.class public L飘花落叶言世哲苏子楪兰/飘花落叶言子楪哲兰世苏;
.super L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世苏哲兰;


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
    .locals 3

    .line 1
    new-instance p1, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-direct {p1}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0xa4

    .line 7
    .line 8
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    filled-new-array {v0}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, v0}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世兰哲楪([Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    iput-object v0, p1, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/Class;

    .line 22
    .line 23
    invoke-virtual {p1}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世楪哲兰()Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ljava/lang/reflect/Method;

    .line 42
    .line 43
    new-instance v1, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪苏哲世兰;

    .line 44
    .line 45
    const/4 v2, 0x5

    .line 46
    invoke-direct {v1, v2}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪苏哲世兰;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 0

    .line 1
    const/16 p0, 0xa3

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
    .locals 0

    .line 1
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;)V
    .locals 0

    .line 1
    new-instance p0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-direct {p0}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 p1, 0xa4

    .line 7
    .line 8
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    filled-new-array {p1}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世兰哲楪([Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sget-object p1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    iput-object p1, p0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/Class;

    .line 22
    .line 23
    invoke-virtual {p0}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世楪哲兰()Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    return-void
.end method
