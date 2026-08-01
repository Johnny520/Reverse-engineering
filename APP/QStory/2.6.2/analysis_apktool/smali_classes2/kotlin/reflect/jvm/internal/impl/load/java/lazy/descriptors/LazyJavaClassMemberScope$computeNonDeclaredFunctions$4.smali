.class final synthetic Lkotlin/reflect/jvm/internal/impl/load/java/lazy/descriptors/LazyJavaClassMemberScope$computeNonDeclaredFunctions$4;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    .line 1
    const-string v5, "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;"

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    const-class v3, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/descriptors/飘花落叶言子楪哲世兰苏;

    .line 6
    .line 7
    const-string v4, "searchMethodsInSupertypesWithoutBuiltinMagic"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    move-object v2, p1

    .line 11
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 15
    check-cast p1, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/descriptors/LazyJavaClassMemberScope$computeNonDeclaredFunctions$4;->invoke(Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/jvm/internal/impl/name/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u54f2\u5170;",
            ")",
            "Ljava/util/Collection<",
            "Lkotlin/reflect/jvm/internal/impl/descriptors/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u5170\u54f2\u696a;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/descriptors/飘花落叶言子楪哲世兰苏;

    .line 7
    .line 8
    sget v0, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰苏哲世:I

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子世哲兰楪苏(Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;)Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method
