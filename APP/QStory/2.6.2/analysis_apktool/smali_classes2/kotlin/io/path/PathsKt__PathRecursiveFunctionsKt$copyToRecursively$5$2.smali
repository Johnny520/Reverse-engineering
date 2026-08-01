.class final synthetic Lkotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $copyAction:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;"
        }
    .end annotation
.end field

.field final synthetic $normalizedTarget:Ljava/nio/file/Path;

.field final synthetic $onError:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;"
        }
    .end annotation
.end field

.field final synthetic $stack:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/nio/file/Path;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $target:Ljava/nio/file/Path;

.field final synthetic $this_copyToRecursively:Ljava/nio/file/Path;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/nio/file/Path;",
            ">;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;",
            "Ljava/nio/file/Path;",
            "Ljava/nio/file/Path;",
            "Ljava/nio/file/Path;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lkotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2;->$stack:Ljava/util/ArrayList;

    .line 2
    .line 3
    iput-object p2, p0, Lkotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2;->$copyAction:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 4
    .line 5
    iput-object p3, p0, Lkotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2;->$this_copyToRecursively:Ljava/nio/file/Path;

    .line 6
    .line 7
    iput-object p4, p0, Lkotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2;->$target:Ljava/nio/file/Path;

    .line 8
    .line 9
    iput-object p5, p0, Lkotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2;->$normalizedTarget:Ljava/nio/file/Path;

    .line 10
    .line 11
    iput-object p6, p0, Lkotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2;->$onError:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 12
    .line 13
    const-string p4, "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;"

    .line 14
    .line 15
    const/4 p5, 0x0

    .line 16
    const/4 p1, 0x2

    .line 17
    const-class p2, Lkotlin/jvm/internal/飘花落叶言子楪世兰哲苏;

    .line 18
    .line 19
    const-string p3, "copy"

    .line 20
    .line 21
    invoke-direct/range {p0 .. p5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 115
    check-cast p1, Ljava/nio/file/Path;

    check-cast p2, Ljava/nio/file/attribute/BasicFileAttributes;

    invoke-virtual {p0, p1, p2}, Lkotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2;->invoke(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p2, p0, Lkotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2;->$stack:Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v0, p0, Lkotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2;->$copyAction:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 10
    .line 11
    iget-object v2, p0, Lkotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2;->$this_copyToRecursively:Ljava/nio/file/Path;

    .line 12
    .line 13
    iget-object v3, p0, Lkotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2;->$target:Ljava/nio/file/Path;

    .line 14
    .line 15
    iget-object v4, p0, Lkotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2;->$normalizedTarget:Ljava/nio/file/Path;

    .line 16
    .line 17
    iget-object v1, p0, Lkotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2;->$onError:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 18
    .line 19
    :try_start_0
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪苏哲兰世(Ljava/nio/file/Path;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p2}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏世哲楪兰(Ljava/util/List;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    check-cast p0, Ljava/nio/file/Path;

    .line 36
    .line 37
    invoke-static {p1}, Ljava/nio/file/Files;->isSymbolicLink(Ljava/nio/file/Path;)Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-nez p2, :cond_1

    .line 42
    .line 43
    invoke-static {p1, p0}, Ljava/nio/file/Files;->isSameFile(Ljava/nio/file/Path;Ljava/nio/file/Path;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-nez p0, :cond_0

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    new-instance p0, Ljava/nio/file/FileSystemLoopException;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-direct {p0, p2}, Ljava/nio/file/FileSystemLoopException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p0

    .line 60
    :goto_0
    move-object v6, p0

    .line 61
    move-object v5, p1

    .line 62
    goto :goto_2

    .line 63
    :catch_0
    move-exception v0

    .line 64
    move-object p0, v0

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    :goto_1
    sget-object p0, Lkotlin/io/path/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Lkotlin/io/path/飘花落叶言子楪世苏哲兰;

    .line 67
    .line 68
    invoke-static {v2, v3, v4, p1}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪苏兰哲世(Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;)Ljava/nio/file/Path;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-interface {v0, p0, p1, p2}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, Lkotlin/io/path/CopyActionResult;

    .line 77
    .line 78
    sget-object p2, Lkotlin/io/path/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:[I

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    aget p0, p2, p0

    .line 85
    .line 86
    const/4 p2, 0x1

    .line 87
    if-eq p0, p2, :cond_4

    .line 88
    .line 89
    const/4 p2, 0x2

    .line 90
    if-eq p0, p2, :cond_3

    .line 91
    .line 92
    const/4 p2, 0x3

    .line 93
    if-ne p0, p2, :cond_2

    .line 94
    .line 95
    sget-object p0, Ljava/nio/file/FileVisitResult;->SKIP_SUBTREE:Ljava/nio/file/FileVisitResult;

    .line 96
    .line 97
    return-object p0

    .line 98
    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 99
    .line 100
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 101
    .line 102
    .line 103
    throw p0

    .line 104
    :cond_3
    sget-object p0, Ljava/nio/file/FileVisitResult;->TERMINATE:Ljava/nio/file/FileVisitResult;

    .line 105
    .line 106
    return-object p0

    .line 107
    :cond_4
    sget-object p0, Ljava/nio/file/FileVisitResult;->CONTINUE:Ljava/nio/file/FileVisitResult;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .line 109
    return-object p0

    .line 110
    :goto_2
    invoke-static/range {v1 .. v6}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪哲世苏兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0
.end method
