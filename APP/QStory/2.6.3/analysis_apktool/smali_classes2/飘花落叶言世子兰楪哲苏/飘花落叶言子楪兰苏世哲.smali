.class public final L飘花落叶言世子兰楪哲苏/飘花落叶言子楪兰苏世哲;
.super L飘花落叶言世子兰楪哲苏/飘花落叶言子楪兰哲世苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世哲兰苏;


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪兰哲世苏;-><init>(Ljava/lang/reflect/Method;Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰([Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    array-length v0, p1

    .line 8
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/reflect/Method;

    .line 13
    .line 14
    iget-object p0, p0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method
