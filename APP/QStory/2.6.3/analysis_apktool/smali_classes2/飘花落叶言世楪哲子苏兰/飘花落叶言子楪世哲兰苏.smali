.class public final L飘花落叶言世楪哲子苏兰/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子兰哲苏楪/飘花落叶言子楪世苏兰哲;


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言世楪哲子苏兰/飘花落叶言子楪世哲兰苏;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言世楪哲子苏兰/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世楪哲子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世楪哲子苏兰/飘花落叶言子楪世哲兰苏;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getType()Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪苏兰哲;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "No methods should be called on this descriptor. Only its presence matters"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "[EnhancedType]"

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰()Ljava/util/Map;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "No methods should be called on this descriptor. Only its presence matters"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子世哲楪苏兰;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "No methods should be called on this descriptor. Only its presence matters"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;
    .locals 2

    .line 1
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/resolve/descriptorUtil/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏(L飘花落叶言世子兰哲苏楪/飘花落叶言子楪世苏兰哲;)L飘花落叶言世楪子苏兰哲/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    invoke-static {p0}, L飘花落叶言世苏子哲兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏(Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪苏哲世兰;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object p0, v0

    .line 16
    :goto_0
    if-eqz p0, :cond_1

    .line 17
    .line 18
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/resolve/descriptorUtil/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪苏哲兰世;)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    return-object v0
.end method
