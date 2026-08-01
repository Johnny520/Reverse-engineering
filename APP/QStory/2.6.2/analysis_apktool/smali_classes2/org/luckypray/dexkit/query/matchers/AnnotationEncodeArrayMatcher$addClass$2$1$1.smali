.class final Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$addClass$2$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "invoke",
        "(Lorg/luckypray/dexkit/query/matchers/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $className:Ljava/lang/String;

.field final synthetic $ignoreCase:Z

.field final synthetic $matchType:Lorg/luckypray/dexkit/query/enums/StringMatchType;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$addClass$2$1$1;->$className:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$addClass$2$1$1;->$matchType:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 4
    .line 5
    iput-boolean p3, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$addClass$2$1$1;->$ignoreCase:Z

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$addClass$2$1$1;->invoke(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$addClass$2$1$1;->$className:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$addClass$2$1$1;->$matchType:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 7
    .line 8
    iget-boolean p0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$addClass$2$1$1;->$ignoreCase:Z

    .line 9
    .line 10
    invoke-virtual {p1, v0, v1, p0}, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏哲兰楪(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
