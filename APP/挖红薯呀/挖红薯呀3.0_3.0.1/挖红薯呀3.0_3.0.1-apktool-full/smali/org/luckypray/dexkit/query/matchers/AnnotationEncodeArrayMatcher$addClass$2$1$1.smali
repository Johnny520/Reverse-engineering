.class final Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$addClass$2$1$1;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


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
        "Lc50;",
        "Lsw;"
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
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$addClass$2$1$1;->invoke(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)V

    sget-object p0, Lna1;->a:Lna1;

    return-object p0
.end method

.method public final invoke(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)V
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
    invoke-virtual {p1, v0, v1, p0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 11
    .line 12
    .line 13
    return-void
.end method
