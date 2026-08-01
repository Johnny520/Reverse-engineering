.class public abstract Lkotlin/jvm/internal/MutablePropertyReference2;
.super Lkotlin/jvm/internal/MutablePropertyReference;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lkotlin/reflect/飘花落叶言子楪哲世兰苏;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Lkotlin/jvm/internal/MutablePropertyReference;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6

    .line 1
    sget-object v1, Lkotlin/jvm/internal/CallableReference;->NO_RECEIVER:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v2, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move v5, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/MutablePropertyReference;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public computeReflected()Lkotlin/reflect/飘花落叶言子楪世哲苏兰;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世哲兰(Lkotlin/jvm/internal/MutablePropertyReference2;)Lkotlin/reflect/飘花落叶言子楪哲世兰苏;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public abstract synthetic get(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public getDelegate(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/PropertyReference;->getReflected()Lkotlin/reflect/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lkotlin/reflect/飘花落叶言子楪哲世兰苏;

    .line 6
    .line 7
    invoke-interface {p0, p1, p2}, Lkotlin/reflect/飘花落叶言子楪兰哲苏世;->getDelegate(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getGetter()Lkotlin/reflect/飘花落叶言子楪兰哲世苏;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/PropertyReference;->getReflected()Lkotlin/reflect/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lkotlin/reflect/飘花落叶言子楪哲世兰苏;

    .line 6
    .line 7
    invoke-interface {p0}, Lkotlin/reflect/飘花落叶言子楪兰哲苏世;->getGetter()Lkotlin/reflect/飘花落叶言子楪兰哲世苏;

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
    invoke-virtual {p0}, Lkotlin/jvm/internal/MutablePropertyReference2;->getGetter()Lkotlin/reflect/飘花落叶言子楪兰哲世苏;

    move-result-object p0

    return-object p0
.end method

.method public getSetter()Lkotlin/reflect/飘花落叶言子楪哲世苏兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/PropertyReference;->getReflected()Lkotlin/reflect/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lkotlin/reflect/飘花落叶言子楪哲世兰苏;

    .line 6
    .line 7
    invoke-interface {p0}, Lkotlin/reflect/飘花落叶言子楪哲世兰苏;->getSetter()Lkotlin/reflect/飘花落叶言子楪哲世苏兰;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public bridge synthetic getSetter()Lkotlin/reflect/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 12
    invoke-virtual {p0}, Lkotlin/jvm/internal/MutablePropertyReference2;->getSetter()Lkotlin/reflect/飘花落叶言子楪哲世苏兰;

    move-result-object p0

    return-object p0
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lkotlin/jvm/internal/MutablePropertyReference2;->get(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public abstract synthetic set(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
.end method
