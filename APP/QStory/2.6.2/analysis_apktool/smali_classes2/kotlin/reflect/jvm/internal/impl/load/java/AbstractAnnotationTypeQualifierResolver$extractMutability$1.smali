.class final synthetic Lkotlin/reflect/jvm/internal/impl/load/java/AbstractAnnotationTypeQualifierResolver$extractMutability$1;
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
    const-string v5, "extractMutability(Ljava/lang/Object;)Lorg/jetbrains/kotlin/load/java/typeEnhancement/WithMigrationStatus;"

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    const-class v3, Lkotlin/reflect/jvm/internal/impl/load/java/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    const-string v4, "extractMutability"

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

    .line 76
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/load/java/AbstractAnnotationTypeQualifierResolver$extractMutability$1;->invoke(Ljava/lang/Object;)L飘花落叶言世楪哲子苏兰/飘花落叶言子楪兰世哲苏;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Ljava/lang/Object;)L飘花落叶言世楪哲子苏兰/飘花落叶言子楪兰世哲苏;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u696a\u54f2\u5b50\u82cf\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u4e16\u54f2\u82cf;"
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
    check-cast p0, Lkotlin/reflect/jvm/internal/impl/load/java/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/load/java/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/load/java/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/load/java/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世兰苏:Ljava/util/Set;

    .line 18
    .line 19
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/load/java/typeEnhancement/MutabilityQualifier;->READ_ONLY:Lkotlin/reflect/jvm/internal/impl/load/java/typeEnhancement/MutabilityQualifier;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/load/java/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲苏世兰:Ljava/util/Set;

    .line 29
    .line 30
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_4

    .line 35
    .line 36
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/load/java/typeEnhancement/MutabilityQualifier;->MUTABLE:Lkotlin/reflect/jvm/internal/impl/load/java/typeEnhancement/MutabilityQualifier;

    .line 37
    .line 38
    :goto_0
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/load/java/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;

    .line 39
    .line 40
    iget-object p0, p0, L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Landroidx/compose/foundation/text/飘花落叶言子苏楪兰哲世;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/飘花落叶言子苏楪兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Lkotlin/reflect/jvm/internal/impl/load/java/ReportLevel;

    .line 49
    .line 50
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/load/java/ReportLevel;->isIgnore()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/load/java/ReportLevel;->isWarning()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    new-instance p1, L飘花落叶言世楪哲子苏兰/飘花落叶言子楪兰世哲苏;

    .line 65
    .line 66
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/load/java/ReportLevel;->isWarning()Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    invoke-direct {p1, v0, p0}, L飘花落叶言世楪哲子苏兰/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/Object;Z)V

    .line 71
    .line 72
    .line 73
    return-object p1

    .line 74
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 75
    return-object p0
.end method
