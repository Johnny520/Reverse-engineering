.class public final Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
.super Lorg/luckypray/dexkit/query/base/BaseQuery;
.source "StringMatchersGroup.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStringMatchersGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringMatchersGroup.kt\norg/luckypray/dexkit/query/matchers/StringMatchersGroup\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n1547#2:185\n1618#2,3:186\n1547#2:193\n1618#2,3:194\n11328#3:189\n11663#3,3:190\n1#4:197\n*S KotlinDebug\n*F\n+ 1 StringMatchersGroup.kt\norg/luckypray/dexkit/query/matchers/StringMatchersGroup\n*L\n103#1:185\n103#1:186,3\n178#1:193\n178#1:194,3\n119#1:189\n119#1:190,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010!\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0002B\u001d\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\u0008J$\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u001a2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001cH\u0007J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0007J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0014J\u001f\u0010\u0012\u001a\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00040\"\"\u00020\u0004\u00a2\u0006\u0002\u0010#J*\u0010\u0012\u001a\u00020\u00002\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00062\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u001a2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001cH\u0007J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020$J%\u0010\u0012\u001a\u00020\u00002\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\'0&\u00a2\u0006\u0002\u0008(H\u0087\u0008\u00f8\u0001\u0000R(\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR*\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000e2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000e@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R0\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00062\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00068G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006*"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;",
        "Lorg/luckypray/dexkit/query/base/BaseQuery;",
        "()V",
        "groupName",
        "",
        "stringMatchers",
        "",
        "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
        "(Ljava/lang/String;Ljava/util/Collection;)V",
        "<set-?>",
        "getGroupName",
        "()Ljava/lang/String;",
        "setGroupName",
        "(Ljava/lang/String;)V",
        "",
        "getStringMatchers",
        "()Ljava/util/List;",
        "value",
        "usingStrings",
        "getUsingStrings",
        "()Ljava/util/Collection;",
        "setUsingStrings",
        "(Ljava/util/Collection;)V",
        "add",
        "usingString",
        "matchType",
        "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
        "ignoreCase",
        "",
        "matcher",
        "innerBuild",
        "",
        "fbb",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "",
        "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;",
        "Lorg/luckypray/dexkit/query/StringMatcherList;",
        "init",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ExtensionFunctionType;",
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
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup$Companion;


# instance fields
.field private groupName:Ljava/lang/String;

.field private stringMatchers:Ljava/util/List;
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

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->Companion:Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->stringMatchers:Ljava/util/List;

    .line 40
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Collection;)V
    .locals 1
    .param p1, "groupName"    # Ljava/lang/String;
    .param p2, "stringMatchers"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
            ">;)V"
        }
    .end annotation

    const-string v0, "groupName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stringMatchers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->stringMatchers:Ljava/util/List;

    .line 42
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->groupName:Ljava/lang/String;

    .line 43
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->stringMatchers:Ljava/util/List;

    .line 44
    return-void
.end method

.method public static synthetic add$default(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    .locals 0

    .line 147
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 149
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 147
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 150
    const/4 p3, 0x0

    .line 147
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->add(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    move-result-object p0

    return-object p0
.end method

.method public static final create()Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->Companion:Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup$Companion;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup$Companion;->create()Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    move-result-object v0

    return-object v0
.end method

.method private final usingStrings(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/StringMatcherList;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    const/4 v1, 0x0

    .line 162
    .local v1, "$i$a$-also-StringMatchersGroup$usingStrings$4":I
    new-instance v2, Lorg/luckypray/dexkit/query/StringMatcherList;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/StringMatcherList;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->usingStrings(Lorg/luckypray/dexkit/query/StringMatcherList;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .line 163
    nop

    .line 161
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    .end local v1    # "$i$a$-also-StringMatchersGroup$usingStrings$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .line 163
    return-object v0
.end method

.method public static synthetic usingStrings$default(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    .locals 0

    .line 98
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 100
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 98
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 101
    const/4 p3, 0x0

    .line 98
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->usingStrings(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final add(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    .locals 7

    const-string v0, "usingString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->add$default(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    move-result-object v0

    return-object v0
.end method

.method public final add(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
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

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->add$default(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    move-result-object v0

    return-object v0
.end method

.method public final add(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    .locals 3
    .param p1, "usingString"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "usingString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    const/4 v1, 0x0

    .line 152
    .local v1, "$i$a$-also-StringMatchersGroup$add$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v2, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->add(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .line 153
    nop

    .line 151
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    .end local v1    # "$i$a$-also-StringMatchersGroup$add$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .line 153
    return-object v0
.end method

.method public final add(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    .locals 3
    .param p1, "matcher"    # Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    const-string v0, "matcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    const/4 v1, 0x0

    .line 133
    .local v1, "$i$a$-also-StringMatchersGroup$add$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->stringMatchers:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 134
    nop

    .line 132
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    .end local v1    # "$i$a$-also-StringMatchersGroup$add$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .line 134
    return-object v0
.end method

.method public final getGroupName()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->groupName:Ljava/lang/String;

    return-object v0
.end method

.method public final getStringMatchers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
            ">;"
        }
    .end annotation

    .line 37
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->stringMatchers:Ljava/util/List;

    return-object v0
.end method

.method public final synthetic getUsingStrings()Ljava/util/Collection;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 56
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final groupName(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    .locals 2
    .param p1, "groupName"    # Ljava/lang/String;

    const-string v0, "groupName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    const/4 v1, 0x0

    .line 68
    .local v1, "$i$a$-also-StringMatchersGroup$groupName$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->groupName:Ljava/lang/String;

    .line 69
    nop

    .line 67
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    .end local v1    # "$i$a$-also-StringMatchersGroup$groupName$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .line 69
    return-object v0
.end method

.method protected innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 12
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "fbb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->groupName:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 174
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->stringMatchers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 175
    sget-object v0, Lorg/luckypray/dexkit/schema/-BatchUsingStringsMatcher;->Companion:Lorg/luckypray/dexkit/schema/-BatchUsingStringsMatcher$Companion;

    .line 176
    nop

    .line 177
    iget-object v1, p0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->groupName:Ljava/lang/String;

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->createString(Ljava/lang/CharSequence;)I

    move-result v1

    .line 178
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->stringMatchers:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 193
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

    .line 194
    .local v6, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 195
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .local v9, "it":Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    const/4 v10, 0x0

    .line 178
    .local v10, "$i$a$-map-StringMatchersGroup$innerBuild$root$1":I
    move-object v11, v9

    check-cast v11, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v11, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v11

    .end local v9    # "it":Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .end local v10    # "$i$a$-map-StringMatchersGroup$innerBuild$root$1":I
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 195
    invoke-interface {v4, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 194
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 196
    :cond_0
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo":I
    check-cast v4, Ljava/util/List;

    .line 193
    nop

    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map":I
    check-cast v4, Ljava/util/Collection;

    .line 178
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object v2

    .line 179
    nop

    .line 197
    nop

    .local v2, "it":[I
    const/4 v3, 0x0

    .line 179
    .local v3, "$i$a$-let-StringMatchersGroup$innerBuild$root$2":I
    invoke-virtual {p1, v2}, Lcom/google/flatbuffers/FlatBufferBuilder;->createVectorOfTables([I)I

    move-result v2

    .line 175
    .end local v2    # "it":[I
    .end local v3    # "$i$a$-let-StringMatchersGroup$innerBuild$root$2":I
    invoke-virtual {v0, p1, v1, v2}, Lorg/luckypray/dexkit/schema/-BatchUsingStringsMatcher$Companion;->createBatchUsingStringsMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;II)I

    move-result v0

    .line 181
    .local v0, "root":I
    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    .line 182
    return v0

    .line 174
    .end local v0    # "root":I
    :cond_1
    new-instance v0, Ljava/lang/IllegalAccessException;

    const-string v1, "matchers not be empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalAccessException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 173
    :cond_2
    new-instance v0, Ljava/lang/IllegalAccessException;

    const-string v1, "groupName not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalAccessException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final synthetic setGroupName(Ljava/lang/String;)V
    .locals 0
    .param p1, "<set-?>"    # Ljava/lang/String;

    .line 36
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->groupName:Ljava/lang/String;

    return-void
.end method

.method public final synthetic setUsingStrings(Ljava/util/Collection;)V
    .locals 7
    .param p1, "value"    # Ljava/util/Collection;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->usingStrings$default(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .line 60
    return-void
.end method

.method public final usingStrings(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;"
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

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->usingStrings$default(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    move-result-object v0

    return-object v0
.end method

.method public final usingStrings(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
            ")",
            "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;"
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

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->usingStrings$default(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    move-result-object v0

    return-object v0
.end method

.method public final usingStrings(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
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
            "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;"
        }
    .end annotation

    const-string v0, "usingStrings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    const/4 v1, 0x0

    .line 103
    .local v1, "$i$a$-also-StringMatchersGroup$usingStrings$2":I
    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 185
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

    .line 186
    .local v6, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 187
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    .local v9, "it":Ljava/lang/String;
    const/4 v10, 0x0

    .line 103
    .local v10, "$i$a$-map-StringMatchersGroup$usingStrings$2$1":I
    new-instance v11, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v11, v9, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 187
    .end local v9    # "it":Ljava/lang/String;
    .end local v10    # "$i$a$-map-StringMatchersGroup$usingStrings$2$1":I
    invoke-interface {v4, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 186
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 188
    :cond_0
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo":I
    check-cast v4, Ljava/util/List;

    .line 185
    nop

    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map":I
    check-cast v4, Ljava/util/Collection;

    .line 103
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->stringMatchers:Ljava/util/List;

    .line 104
    nop

    .line 102
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    .end local v1    # "$i$a$-also-StringMatchersGroup$usingStrings$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .line 104
    return-object v0
.end method

.method public final usingStrings(Lorg/luckypray/dexkit/query/StringMatcherList;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    .locals 3
    .param p1, "usingStrings"    # Lorg/luckypray/dexkit/query/StringMatcherList;

    const-string v0, "usingStrings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    const/4 v1, 0x0

    .line 82
    .local v1, "$i$a$-also-StringMatchersGroup$usingStrings$1":I
    move-object v2, p1

    check-cast v2, Ljava/util/List;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->stringMatchers:Ljava/util/List;

    .line 83
    nop

    .line 81
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    .end local v1    # "$i$a$-also-StringMatchersGroup$usingStrings$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .line 83
    return-object v0
.end method

.method public final varargs usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    .locals 21
    .param p1, "usingStrings"    # [Ljava/lang/String;

    move-object/from16 v0, p0

    const-string v1, "usingStrings"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    move-object v1, v0

    check-cast v1, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .local v1, "it":Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    const/4 v3, 0x0

    .line 119
    .local v3, "$i$a$-also-StringMatchersGroup$usingStrings$3":I
    move-object/from16 v4, p1

    .local v4, "$this$map$iv":[Ljava/lang/Object;
    const/4 v5, 0x0

    .line 189
    .local v5, "$i$f$map":I
    new-instance v6, Ljava/util/ArrayList;

    array-length v7, v4

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v4

    .local v7, "$this$mapTo$iv$iv":[Ljava/lang/Object;
    const/4 v8, 0x0

    .line 190
    .local v8, "$i$f$mapTo":I
    array-length v9, v7

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_0

    aget-object v17, v7, v10

    .line 191
    .local v17, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v12, v17

    .local v12, "it":Ljava/lang/String;
    const/16 v18, 0x0

    .line 119
    .local v18, "$i$a$-map-StringMatchersGroup$usingStrings$3$1":I
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

    .line 191
    .end local v12    # "it":Ljava/lang/String;
    .end local v18    # "$i$a$-map-StringMatchersGroup$usingStrings$3$1":I
    move-object/from16 v11, v20

    invoke-interface {v6, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 190
    nop

    .end local v17    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 192
    :cond_0
    nop

    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$mapTo$iv$iv":[Ljava/lang/Object;
    .end local v8    # "$i$f$mapTo":I
    check-cast v6, Ljava/util/List;

    .line 189
    nop

    .end local v4    # "$this$map$iv":[Ljava/lang/Object;
    .end local v5    # "$i$f$map":I
    check-cast v6, Ljava/util/Collection;

    .line 119
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v4

    iput-object v4, v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->stringMatchers:Ljava/util/List;

    .line 120
    nop

    .line 118
    .end local v1    # "it":Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    .end local v3    # "$i$a$-also-StringMatchersGroup$usingStrings$3":I
    move-object v1, v0

    check-cast v1, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .line 120
    return-object v1
.end method
