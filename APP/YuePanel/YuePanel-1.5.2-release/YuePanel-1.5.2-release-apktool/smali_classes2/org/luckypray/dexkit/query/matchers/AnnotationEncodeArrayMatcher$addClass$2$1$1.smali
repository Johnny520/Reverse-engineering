.class final Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$addClass$2$1$1;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->addClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
        "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        "invoke",
        "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)V",
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

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$addClass$2$1$1;->$className:Ljava/lang/String;

    iput-object p2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$addClass$2$1$1;->$matchType:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    iput-boolean p3, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$addClass$2$1$1;->$ignoreCase:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$addClass$2$1$1;->invoke(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public final invoke(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)V
    .locals 3
    .param p1    # Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "$this$classValue"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$addClass$2$1$1;->$className:Ljava/lang/String;

    iget-object v1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$addClass$2$1$1;->$matchType:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    iget-boolean v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$addClass$2$1$1;->$ignoreCase:Z

    invoke-virtual {p1, v0, v1, v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    return-void
.end method
