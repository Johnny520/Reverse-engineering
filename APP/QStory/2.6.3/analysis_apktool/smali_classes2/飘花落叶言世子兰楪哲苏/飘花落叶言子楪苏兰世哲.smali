.class public abstract L飘花落叶言世子兰楪哲苏/飘花落叶言子楪苏兰世哲;
.super L飘花落叶言世子兰楪哲苏/飘花落叶言子楪兰世哲苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p2, 0x0

    .line 16
    :goto_0
    const/4 v1, 0x0

    .line 17
    new-array v1, v1, [Ljava/lang/reflect/Type;

    .line 18
    .line 19
    invoke-direct {p0, p1, v0, p2, v1}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰([Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/reflect/Member;

    .line 8
    .line 9
    check-cast v0, Ljava/lang/reflect/Field;

    .line 10
    .line 11
    iget-object p0, p0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子世兰楪哲苏([Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method
