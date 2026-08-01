.class public final Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseQuery;
.source "AnnotationMatcher.kt"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAnnotationMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationMatcher.kt\norg/luckypray/dexkit/query/matchers/AnnotationMatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,488:1\n1547#2:489\n1618#2,3:490\n1547#2:497\n1618#2,3:498\n1547#2:505\n1618#2,3:506\n11328#3:493\n11663#3,3:494\n11328#3:501\n11663#3,3:502\n1#4:509\n*S KotlinDebug\n*F\n+ 1 AnnotationMatcher.kt\norg/luckypray/dexkit/query/matchers/AnnotationMatcher\n*L\n341#1:489\n341#1:490,3\n369#1:497\n369#1:498,3\n482#1:505\n482#1:506,3\n357#1:493\n357#1:494,3\n381#1:501\n381#1:502,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u001e\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0001NB\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+J%\u0010)\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020.0-\u00a2\u0006\u0002\u0008/H\u0087\u0008\u00f8\u0001\u0000J\u000e\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0014J$\u00102\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u00142\u0008\u0008\u0002\u00103\u001a\u0002042\u0008\u0008\u0002\u00105\u001a\u000206H\u0007J\u000e\u00102\u001a\u00020\u00002\u0006\u00101\u001a\u00020%J\u000e\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u000209J\u001a\u00107\u001a\u00020\u00002\u0008\u0008\u0002\u0010:\u001a\u0002092\u0008\u0008\u0002\u0010;\u001a\u000209J\u000e\u00107\u001a\u00020\u00002\u0006\u0010<\u001a\u00020=J\u000e\u00107\u001a\u00020\u00002\u0006\u0010<\u001a\u00020>J\u000e\u0010?\u001a\u00020\u00002\u0006\u00103\u001a\u00020@J\u000e\u0010A\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u0005J%\u0010A\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020.0-\u00a2\u0006\u0002\u0008/H\u0087\u0008\u00f8\u0001\u0000J\u0010\u0010B\u001a\u0002092\u0006\u0010C\u001a\u00020DH\u0014J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010E\u001a\u00020\u00002\u000c\u0010E\u001a\u0008\u0012\u0004\u0012\u00020F0\u001e2\u0008\u0008\u0002\u00103\u001a\u00020@J\u000e\u0010E\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u000fJ%\u0010E\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020.0-\u00a2\u0006\u0002\u0008/H\u0087\u0008\u00f8\u0001\u0000J\u0012\u0010\u0015\u001a\u00020\u00002\n\u0010G\u001a\u0006\u0012\u0002\u0008\u00030HJ$\u0010\u0015\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u00142\u0008\u0008\u0002\u00103\u001a\u0002042\u0008\u0008\u0002\u00105\u001a\u000206H\u0007J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u001aJ%\u0010\u0015\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020.0-\u00a2\u0006\u0002\u0008/H\u0087\u0008\u00f8\u0001\u0000J\u001f\u0010J\u001a\u00020\u00002\u0012\u0010\u001f\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00140K\"\u00020\u0014\u00a2\u0006\u0002\u0010LJ\u0014\u0010J\u001a\u00020\u00002\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u001eJ\u001f\u0010\u001f\u001a\u00020\u00002\u0012\u0010\u001f\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00140K\"\u00020\u0014\u00a2\u0006\u0002\u0010LJ*\u0010\u001f\u001a\u00020\u00002\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u001e2\u0008\u0008\u0002\u00103\u001a\u0002042\u0008\u0008\u0002\u00105\u001a\u000206H\u0007J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020MR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R(\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0010\u0004\u001a\u0004\u0018\u00010\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u001a@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR0\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u001e2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u001e8G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R.\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006O"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;",
        "Lorg/luckypray/dexkit/query/base/BaseQuery;",
        "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;",
        "()V",
        "<set-?>",
        "Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;",
        "elementsMatcher",
        "getElementsMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;",
        "Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;",
        "policy",
        "getPolicy",
        "()Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;",
        "setPolicy",
        "(Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;)V",
        "Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;",
        "targetElementTypesMatcher",
        "getTargetElementTypesMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;",
        "value",
        "",
        "type",
        "getType",
        "()Ljava/lang/String;",
        "setType",
        "(Ljava/lang/String;)V",
        "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
        "typeMatcher",
        "getTypeMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
        "",
        "usingStrings",
        "getUsingStrings",
        "()Ljava/util/Collection;",
        "setUsingStrings",
        "(Ljava/util/Collection;)V",
        "",
        "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
        "usingStringsMatcher",
        "getUsingStringsMatcher",
        "()Ljava/util/List;",
        "addElement",
        "element",
        "Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;",
        "init",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "addEqString",
        "usingString",
        "addUsingString",
        "matchType",
        "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
        "ignoreCase",
        "",
        "elementCount",
        "count",
        "",
        "min",
        "max",
        "range",
        "Lkotlin/ranges/IntRange;",
        "Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
        "elementMatchType",
        "Lorg/luckypray/dexkit/query/enums/MatchType;",
        "elements",
        "innerBuild",
        "fbb",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "targetElementTypes",
        "Lorg/luckypray/dexkit/query/enums/TargetElementType;",
        "clazz",
        "Ljava/lang/Class;",
        "typeName",
        "usingEqStrings",
        "",
        "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;",
        "Lorg/luckypray/dexkit/query/StringMatcherList;",
        "Companion",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher$Companion;


# instance fields
.field private elementsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

.field private policy:Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

.field private targetElementTypesMatcher:Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;

.field private typeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

.field private usingStringsMatcher:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    return-void
.end method

.method private final addElement(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 464
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v1, 0x0

    .line 465
    .local v1, "$i$a$-also-AnnotationMatcher$addElement$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->addElement(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 466
    nop

    .line 464
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v1    # "$i$a$-also-AnnotationMatcher$addElement$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 466
    return-object v0
.end method

.method public static synthetic addUsingString$default(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 0

    .line 412
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 414
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 412
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 415
    const/4 p3, 0x0

    .line 412
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->addUsingString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final create()Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher$Companion;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic elementCount$default(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 0

    .line 304
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const p2, 0x7fffffff

    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->elementCount(II)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object p0

    return-object p0
.end method

.method private final elements(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 456
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v1, 0x0

    .line 457
    .local v1, "$i$a$-also-AnnotationMatcher$elements$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->elements(Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 458
    nop

    .line 456
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v1    # "$i$a$-also-AnnotationMatcher$elements$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 458
    return-object v0
.end method

.method private final targetElementTypes(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 448
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v1, 0x0

    .line 449
    .local v1, "$i$a$-also-AnnotationMatcher$targetElementTypes$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->targetElementTypes(Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 450
    nop

    .line 448
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v1    # "$i$a$-also-AnnotationMatcher$targetElementTypes$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 450
    return-object v0
.end method

.method public static synthetic targetElementTypes$default(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 0

    .line 169
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 171
    sget-object p2, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 169
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->targetElementTypes(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object p0

    return-object p0
.end method

.method private final type(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 440
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v1, 0x0

    .line 441
    .local v1, "$i$a$-also-AnnotationMatcher$type$4":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->type(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 442
    nop

    .line 440
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v1    # "$i$a$-also-AnnotationMatcher$type$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 442
    return-object v0
.end method

.method public static synthetic type$default(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 0

    .line 128
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 130
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 128
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 131
    const/4 p3, 0x0

    .line 128
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic usingStrings$default(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 0

    .line 336
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 338
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 336
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 339
    const/4 p3, 0x0

    .line 336
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->usingStrings(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final addElement(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 4
    .param p1, "element"    # Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v1, 0x0

    .line 231
    .local v1, "$i$a$-also-AnnotationMatcher$addElement$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->elementsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->elementsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 232
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->elementsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    const-string v3, "null cannot be cast to non-null type org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 233
    nop

    .line 230
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v1    # "$i$a$-also-AnnotationMatcher$addElement$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 233
    return-object v0
.end method

.method public final addEqString(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 6
    .param p1, "usingString"    # Ljava/lang/String;

    const-string v0, "usingString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 429
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v1, 0x0

    .line 430
    .local v1, "$i$a$-also-AnnotationMatcher$addEqString$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->usingStringsMatcher:Ljava/util/List;

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 431
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->usingStringsMatcher:Ljava/util/List;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v3, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    sget-object v4, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    const/4 v5, 0x0

    invoke-direct {v3, p1, v4, v5}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 432
    nop

    .line 429
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v1    # "$i$a$-also-AnnotationMatcher$addEqString$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 432
    return-object v0
.end method

.method public final addUsingString(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 7

    const-string v0, "usingString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->addUsingString$default(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final addUsingString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 7

    const-string v0, "usingString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->addUsingString$default(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final addUsingString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 4
    .param p1, "usingString"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "usingString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 416
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v1, 0x0

    .line 417
    .local v1, "$i$a$-also-AnnotationMatcher$addUsingString$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->usingStringsMatcher:Ljava/util/List;

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 418
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->usingStringsMatcher:Ljava/util/List;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v3, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v3, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 419
    nop

    .line 416
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v1    # "$i$a$-also-AnnotationMatcher$addUsingString$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 419
    return-object v0
.end method

.method public final addUsingString(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 3
    .param p1, "usingString"    # Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    const-string v0, "usingString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 394
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v1, 0x0

    .line 395
    .local v1, "$i$a$-also-AnnotationMatcher$addUsingString$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->usingStringsMatcher:Ljava/util/List;

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 396
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->usingStringsMatcher:Ljava/util/List;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 397
    nop

    .line 394
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v1    # "$i$a$-also-AnnotationMatcher$addUsingString$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 397
    return-object v0
.end method

.method public final elementCount(I)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 4
    .param p1, "count"    # I

    .line 258
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v1, 0x0

    .line 259
    .local v1, "$i$a$-also-AnnotationMatcher$elementCount$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->elementsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->elementsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 260
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->elementsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    const-string v3, "null cannot be cast to non-null type org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->count(I)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 261
    nop

    .line 258
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v1    # "$i$a$-also-AnnotationMatcher$elementCount$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 261
    return-object v0
.end method

.method public final elementCount(II)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 4
    .param p1, "min"    # I
    .param p2, "max"    # I

    .line 304
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v1, 0x0

    .line 305
    .local v1, "$i$a$-also-AnnotationMatcher$elementCount$4":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->elementsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->elementsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 306
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->elementsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    const-string v3, "null cannot be cast to non-null type org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->count(II)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 307
    nop

    .line 304
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v1    # "$i$a$-also-AnnotationMatcher$elementCount$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 307
    return-object v0
.end method

.method public final elementCount(Lkotlin/ranges/IntRange;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 4
    .param p1, "range"    # Lkotlin/ranges/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v1, 0x0

    .line 289
    .local v1, "$i$a$-also-AnnotationMatcher$elementCount$3":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->elementsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->elementsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 290
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->elementsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    const-string v3, "null cannot be cast to non-null type org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->count(Lkotlin/ranges/IntRange;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 291
    nop

    .line 288
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v1    # "$i$a$-also-AnnotationMatcher$elementCount$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 291
    return-object v0
.end method

.method public final elementCount(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 4
    .param p1, "range"    # Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 273
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v1, 0x0

    .line 274
    .local v1, "$i$a$-also-AnnotationMatcher$elementCount$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->elementsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->elementsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 275
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->elementsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    const-string v3, "null cannot be cast to non-null type org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->count(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 276
    nop

    .line 273
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v1    # "$i$a$-also-AnnotationMatcher$elementCount$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 276
    return-object v0
.end method

.method public final elementMatchType(Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 4
    .param p1, "matchType"    # Lorg/luckypray/dexkit/query/enums/MatchType;

    const-string v0, "matchType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v1, 0x0

    .line 246
    .local v1, "$i$a$-also-AnnotationMatcher$elementMatchType$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->elementsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->elementsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 247
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->elementsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    const-string v3, "null cannot be cast to non-null type org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->matchType(Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 248
    nop

    .line 245
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v1    # "$i$a$-also-AnnotationMatcher$elementMatchType$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 248
    return-object v0
.end method

.method public final elements(Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 2
    .param p1, "elements"    # Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v1, 0x0

    .line 213
    .local v1, "$i$a$-also-AnnotationMatcher$elements$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->elementsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 214
    nop

    .line 212
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v1    # "$i$a$-also-AnnotationMatcher$elements$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 214
    return-object v0
.end method

.method public final getElementsMatcher()Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .locals 1

    .line 54
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->elementsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    return-object v0
.end method

.method public final getPolicy()Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;
    .locals 1

    .line 53
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->policy:Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    return-object v0
.end method

.method public final getTargetElementTypesMatcher()Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;
    .locals 1

    .line 42
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->targetElementTypesMatcher:Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;

    return-object v0
.end method

.method public final synthetic getType()Ljava/lang/String;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 67
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getTypeMatcher()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 1

    .line 40
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->typeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    return-object v0
.end method

.method public final synthetic getUsingStrings()Ljava/util/Collection;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 83
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getUsingStringsMatcher()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
            ">;"
        }
    .end annotation

    .line 44
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->usingStringsMatcher:Ljava/util/List;

    return-object v0
.end method

.method protected innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 18
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    const-string v1, "fbb"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 476
    sget-object v1, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationMatcher$Companion;

    .line 477
    nop

    .line 478
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->typeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    if-eqz v2, :cond_0

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, v8}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    move v4, v2

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 479
    :goto_0
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->targetElementTypesMatcher:Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;

    if-eqz v2, :cond_1

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, v8}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    move v5, v2

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 480
    :goto_1
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->policy:Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;->getValue()B

    move-result v2

    move v6, v2

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    .line 481
    :goto_2
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->elementsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    if-eqz v2, :cond_3

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, v8}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    move v7, v2

    goto :goto_3

    :cond_3
    const/4 v7, 0x0

    .line 482
    :goto_3
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->usingStringsMatcher:Ljava/util/List;

    if-eqz v2, :cond_5

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 505
    .local v9, "$i$f$map":I
    new-instance v10, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-static {v2, v11}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v10, Ljava/util/Collection;

    .local v10, "destination$iv$iv":Ljava/util/Collection;
    move-object v11, v2

    .local v11, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 506
    .local v12, "$i$f$mapTo":I
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_4

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 507
    .local v14, "item$iv$iv":Ljava/lang/Object;
    move-object v15, v14

    check-cast v15, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .local v15, "it":Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    const/16 v16, 0x0

    .line 482
    .local v16, "$i$a$-map-AnnotationMatcher$innerBuild$root$1":I
    move-object v3, v15

    check-cast v3, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v3, v8}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v3

    .end local v15    # "it":Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .end local v16    # "$i$a$-map-AnnotationMatcher$innerBuild$root$1":I
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 507
    invoke-interface {v10, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 506
    .end local v14    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_4

    .line 508
    :cond_4
    nop

    .end local v10    # "destination$iv$iv":Ljava/util/Collection;
    .end local v11    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v12    # "$i$f$mapTo":I
    move-object v3, v10

    check-cast v3, Ljava/util/List;

    .line 505
    nop

    .line 482
    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v9    # "$i$f$map":I
    check-cast v3, Ljava/util/Collection;

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object v2

    .line 483
    if-eqz v2, :cond_5

    .line 482
    nop

    .line 483
    nop

    .line 509
    nop

    .local v2, "it":[I
    const/4 v3, 0x0

    .line 483
    .local v3, "$i$a$-let-AnnotationMatcher$innerBuild$root$2":I
    invoke-virtual {v8, v2}, Lcom/google/flatbuffers/FlatBufferBuilder;->createVectorOfTables([I)I

    move-result v2

    .line 482
    .end local v2    # "it":[I
    .end local v3    # "$i$a$-let-AnnotationMatcher$innerBuild$root$2":I
    move/from16 v17, v2

    goto :goto_5

    .line 483
    :cond_5
    const/16 v17, 0x0

    .line 476
    :goto_5
    move-object/from16 v2, p1

    move v3, v4

    move v4, v5

    move v5, v6

    move v6, v7

    move/from16 v7, v17

    invoke-virtual/range {v1 .. v7}, Lorg/luckypray/dexkit/schema/-AnnotationMatcher$Companion;->createAnnotationMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;IIBII)I

    move-result v1

    .line 485
    .local v1, "root":I
    invoke-virtual {v8, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    .line 486
    return v1
.end method

.method public final policy(Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 2
    .param p1, "policy"    # Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    const-string v0, "policy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 193
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v1, 0x0

    .line 194
    .local v1, "$i$a$-also-AnnotationMatcher$policy$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->policy:Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    .line 195
    nop

    .line 193
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v1    # "$i$a$-also-AnnotationMatcher$policy$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 195
    return-object v0
.end method

.method public final synthetic setPolicy(Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;)V
    .locals 0
    .param p1, "<set-?>"    # Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    .line 53
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->policy:Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    return-void
.end method

.method public final synthetic setType(Ljava/lang/String;)V
    .locals 7
    .param p1, "value"    # Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 71
    return-void
.end method

.method public final synthetic setUsingStrings(Ljava/util/Collection;)V
    .locals 7
    .param p1, "value"    # Ljava/util/Collection;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->usingStrings$default(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 87
    return-void
.end method

.method public final targetElementTypes(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 5
    .param p1, "targetElementTypes"    # Ljava/util/Collection;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/MatchType;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lorg/luckypray/dexkit/query/enums/TargetElementType;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/MatchType;",
            ")",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;"
        }
    .end annotation

    const-string v0, "targetElementTypes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v1, 0x0

    .line 173
    .local v1, "$i$a$-also-AnnotationMatcher$targetElementTypes$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;-><init>()V

    move-object v3, v2

    .local v3, "$this$targetElementTypes_u24lambda_u245_u24lambda_u244":Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;
    const/4 v4, 0x0

    .line 174
    .local v4, "$i$a$-apply-AnnotationMatcher$targetElementTypes$2$1":I
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->types(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;

    .line 175
    invoke-virtual {v3, p2}, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->matchType(Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;

    .line 176
    nop

    .line 173
    .end local v3    # "$this$targetElementTypes_u24lambda_u245_u24lambda_u244":Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;
    .end local v4    # "$i$a$-apply-AnnotationMatcher$targetElementTypes$2$1":I
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->targetElementTypesMatcher:Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;

    .line 177
    nop

    .line 172
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v1    # "$i$a$-also-AnnotationMatcher$targetElementTypes$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 177
    return-object v0
.end method

.method public final targetElementTypes(Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 2
    .param p1, "targetElementTypes"    # Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;

    const-string v0, "targetElementTypes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v1, 0x0

    .line 151
    .local v1, "$i$a$-also-AnnotationMatcher$targetElementTypes$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->targetElementTypesMatcher:Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;

    .line 152
    nop

    .line 150
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v1    # "$i$a$-also-AnnotationMatcher$targetElementTypes$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 152
    return-object v0
.end method

.method public final type(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 8
    .param p1, "clazz"    # Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v1, 0x0

    .line 112
    .local v1, "$i$a$-also-AnnotationMatcher$type$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "clazz.name"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->typeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 113
    nop

    .line 111
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v1    # "$i$a$-also-AnnotationMatcher$type$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 113
    return-object v0
.end method

.method public final type(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 7

    const-string v0, "typeName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 7

    const-string v0, "typeName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 3
    .param p1, "typeName"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "typeName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v1, 0x0

    .line 133
    .local v1, "$i$a$-also-AnnotationMatcher$type$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-virtual {v2, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->typeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 134
    nop

    .line 132
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v1    # "$i$a$-also-AnnotationMatcher$type$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 134
    return-object v0
.end method

.method public final type(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 2
    .param p1, "type"    # Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v1, 0x0

    .line 100
    .local v1, "$i$a$-also-AnnotationMatcher$type$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->typeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 101
    nop

    .line 99
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v1    # "$i$a$-also-AnnotationMatcher$type$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 101
    return-object v0
.end method

.method public final usingEqStrings(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 14
    .param p1, "usingStrings"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;"
        }
    .end annotation

    const-string v0, "usingStrings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 368
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v1, 0x0

    .line 369
    .local v1, "$i$a$-also-AnnotationMatcher$usingEqStrings$1":I
    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 497
    .local v3, "$i$f$map":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v2

    .local v5, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 498
    .local v6, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 499
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    .local v9, "it":Ljava/lang/String;
    const/4 v10, 0x0

    .line 369
    .local v10, "$i$a$-map-AnnotationMatcher$usingEqStrings$1$1":I
    new-instance v11, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    sget-object v12, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    const/4 v13, 0x0

    invoke-direct {v11, v9, v12, v13}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 499
    .end local v9    # "it":Ljava/lang/String;
    .end local v10    # "$i$a$-map-AnnotationMatcher$usingEqStrings$1$1":I
    invoke-interface {v4, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 498
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 500
    :cond_0
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo":I
    check-cast v4, Ljava/util/List;

    .line 497
    nop

    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map":I
    check-cast v4, Ljava/util/Collection;

    .line 369
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 370
    nop

    .line 368
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v1    # "$i$a$-also-AnnotationMatcher$usingEqStrings$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 370
    return-object v0
.end method

.method public final varargs usingEqStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 17
    .param p1, "usingStrings"    # [Ljava/lang/String;

    move-object/from16 v0, p0

    const-string v1, "usingStrings"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 380
    move-object v1, v0

    check-cast v1, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v1, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v3, 0x0

    .line 381
    .local v3, "$i$a$-also-AnnotationMatcher$usingEqStrings$2":I
    move-object/from16 v4, p1

    .local v4, "$this$map$iv":[Ljava/lang/Object;
    const/4 v5, 0x0

    .line 501
    .local v5, "$i$f$map":I
    new-instance v6, Ljava/util/ArrayList;

    array-length v7, v4

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v4

    .local v7, "$this$mapTo$iv$iv":[Ljava/lang/Object;
    const/4 v8, 0x0

    .line 502
    .local v8, "$i$f$mapTo":I
    array-length v9, v7

    const/4 v10, 0x0

    move v11, v10

    :goto_0
    if-ge v11, v9, :cond_0

    aget-object v12, v7, v11

    .line 503
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "it":Ljava/lang/String;
    const/4 v14, 0x0

    .line 381
    .local v14, "$i$a$-map-AnnotationMatcher$usingEqStrings$2$1":I
    new-instance v15, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    move-object/from16 v16, v1

    .end local v1    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .local v16, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    sget-object v1, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    invoke-direct {v15, v13, v1, v10}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 503
    .end local v13    # "it":Ljava/lang/String;
    .end local v14    # "$i$a$-map-AnnotationMatcher$usingEqStrings$2$1":I
    invoke-interface {v6, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 502
    nop

    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v1, v16

    goto :goto_0

    .line 504
    .end local v16    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .restart local v1    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    :cond_0
    move-object/from16 v16, v1

    .end local v1    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$mapTo$iv$iv":[Ljava/lang/Object;
    .end local v8    # "$i$f$mapTo":I
    .restart local v16    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    move-object v1, v6

    check-cast v1, Ljava/util/List;

    .line 501
    nop

    .end local v4    # "$this$map$iv":[Ljava/lang/Object;
    .end local v5    # "$i$f$map":I
    check-cast v1, Ljava/util/Collection;

    .line 381
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 382
    nop

    .line 380
    .end local v3    # "$i$a$-also-AnnotationMatcher$usingEqStrings$2":I
    .end local v16    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    move-object v1, v0

    check-cast v1, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 382
    return-object v1
.end method

.method public final usingStrings(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;"
        }
    .end annotation

    const-string v0, "usingStrings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->usingStrings$default(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final usingStrings(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
            ")",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;"
        }
    .end annotation

    const-string v0, "usingStrings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->usingStrings$default(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final usingStrings(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 12
    .param p1, "usingStrings"    # Ljava/util/Collection;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
            "Z)",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;"
        }
    .end annotation

    const-string v0, "usingStrings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 340
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v1, 0x0

    .line 341
    .local v1, "$i$a$-also-AnnotationMatcher$usingStrings$2":I
    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 489
    .local v3, "$i$f$map":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v2

    .local v5, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 490
    .local v6, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 491
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    .local v9, "it":Ljava/lang/String;
    const/4 v10, 0x0

    .line 341
    .local v10, "$i$a$-map-AnnotationMatcher$usingStrings$2$1":I
    new-instance v11, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v11, v9, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 491
    .end local v9    # "it":Ljava/lang/String;
    .end local v10    # "$i$a$-map-AnnotationMatcher$usingStrings$2$1":I
    invoke-interface {v4, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 490
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 492
    :cond_0
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo":I
    check-cast v4, Ljava/util/List;

    .line 489
    nop

    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map":I
    check-cast v4, Ljava/util/Collection;

    .line 341
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 342
    nop

    .line 340
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v1    # "$i$a$-also-AnnotationMatcher$usingStrings$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 342
    return-object v0
.end method

.method public final usingStrings(Lorg/luckypray/dexkit/query/StringMatcherList;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 3
    .param p1, "usingStrings"    # Lorg/luckypray/dexkit/query/StringMatcherList;

    const-string v0, "usingStrings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 319
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v1, 0x0

    .line 320
    .local v1, "$i$a$-also-AnnotationMatcher$usingStrings$1":I
    move-object v2, p1

    check-cast v2, Ljava/util/List;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 321
    nop

    .line 319
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v1    # "$i$a$-also-AnnotationMatcher$usingStrings$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 321
    return-object v0
.end method

.method public final varargs usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 21
    .param p1, "usingStrings"    # [Ljava/lang/String;

    move-object/from16 v0, p0

    const-string v1, "usingStrings"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 356
    move-object v1, v0

    check-cast v1, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .local v1, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    const/4 v3, 0x0

    .line 357
    .local v3, "$i$a$-also-AnnotationMatcher$usingStrings$3":I
    move-object/from16 v4, p1

    .local v4, "$this$map$iv":[Ljava/lang/Object;
    const/4 v5, 0x0

    .line 493
    .local v5, "$i$f$map":I
    new-instance v6, Ljava/util/ArrayList;

    array-length v7, v4

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v4

    .local v7, "$this$mapTo$iv$iv":[Ljava/lang/Object;
    const/4 v8, 0x0

    .line 494
    .local v8, "$i$f$mapTo":I
    array-length v9, v7

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_0

    aget-object v17, v7, v10

    .line 495
    .local v17, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v12, v17

    .local v12, "it":Ljava/lang/String;
    const/16 v18, 0x0

    .line 357
    .local v18, "$i$a$-map-AnnotationMatcher$usingStrings$3$1":I
    new-instance v15, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    const/16 v16, 0x6

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v11, v15

    move-object/from16 v20, v15

    move/from16 v15, v16

    move-object/from16 v16, v19

    invoke-direct/range {v11 .. v16}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 495
    .end local v12    # "it":Ljava/lang/String;
    .end local v18    # "$i$a$-map-AnnotationMatcher$usingStrings$3$1":I
    move-object/from16 v11, v20

    invoke-interface {v6, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 494
    nop

    .end local v17    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 496
    :cond_0
    nop

    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$mapTo$iv$iv":[Ljava/lang/Object;
    .end local v8    # "$i$f$mapTo":I
    check-cast v6, Ljava/util/List;

    .line 493
    nop

    .end local v4    # "$this$map$iv":[Ljava/lang/Object;
    .end local v5    # "$i$f$map":I
    check-cast v6, Ljava/util/Collection;

    .line 357
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v4

    iput-object v4, v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 358
    nop

    .line 356
    .end local v1    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .end local v3    # "$i$a$-also-AnnotationMatcher$usingStrings$3":I
    move-object v1, v0

    check-cast v1, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 358
    return-object v1
.end method
