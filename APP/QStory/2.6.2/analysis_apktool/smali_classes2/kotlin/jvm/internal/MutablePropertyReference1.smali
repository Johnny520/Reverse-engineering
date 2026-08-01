.class public abstract Lkotlin/jvm/internal/MutablePropertyReference1;
.super Lkotlin/jvm/internal/MutablePropertyReference;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lkotlin/reflect/飘花落叶言子楪苏兰哲世;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlin/jvm/internal/MutablePropertyReference;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/MutablePropertyReference;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 6
    invoke-direct/range {p0 .. p5}, Lkotlin/jvm/internal/MutablePropertyReference;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public computeReflected()Lkotlin/reflect/飘花落叶言子楪世哲苏兰;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰哲苏(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/飘花落叶言子楪苏兰哲世;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public abstract synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public getDelegate(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/PropertyReference;->getReflected()Lkotlin/reflect/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lkotlin/reflect/飘花落叶言子楪苏兰哲世;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Lkotlin/reflect/飘花落叶言子楪兰苏哲世;->getDelegate(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getGetter()Lkotlin/reflect/飘花落叶言子楪兰苏世哲;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/PropertyReference;->getReflected()Lkotlin/reflect/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lkotlin/reflect/飘花落叶言子楪苏兰哲世;

    .line 6
    .line 7
    invoke-interface {p0}, Lkotlin/reflect/飘花落叶言子楪兰苏哲世;->getGetter()Lkotlin/reflect/飘花落叶言子楪兰苏世哲;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public bridge synthetic getGetter()Lkotlin/reflect/飘花落叶言子楪哲兰苏世;
    .locals 0

    .line 12
    invoke-virtual {p0}, Lkotlin/jvm/internal/MutablePropertyReference1;->getGetter()Lkotlin/reflect/飘花落叶言子楪兰苏世哲;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getSetter()Lkotlin/reflect/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 12
    invoke-virtual {p0}, Lkotlin/jvm/internal/MutablePropertyReference1;->getSetter()Lkotlin/reflect/飘花落叶言子楪苏兰世哲;

    move-result-object p0

    return-object p0
.end method

.method public getSetter()Lkotlin/reflect/飘花落叶言子楪苏兰世哲;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/PropertyReference;->getReflected()Lkotlin/reflect/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lkotlin/reflect/飘花落叶言子楪苏兰哲世;

    .line 6
    .line 7
    invoke-interface {p0}, Lkotlin/reflect/飘花落叶言子楪苏兰哲世;->getSetter()Lkotlin/reflect/飘花落叶言子楪苏兰世哲;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/MutablePropertyReference1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public abstract synthetic set(Ljava/lang/Object;Ljava/lang/Object;)V
.end method
