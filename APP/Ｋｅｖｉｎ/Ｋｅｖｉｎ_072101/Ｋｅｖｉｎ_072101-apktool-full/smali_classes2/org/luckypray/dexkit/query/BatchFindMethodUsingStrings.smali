.class public final Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
.super Lorg/luckypray/dexkit/query/base/BaseQuery;
.source "BatchFindMethodUsingStrings.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBatchFindMethodUsingStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BatchFindMethodUsingStrings.kt\norg/luckypray/dexkit/query/BatchFindMethodUsingStrings\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,291:1\n125#2:292\n152#2,2:293\n154#2:299\n1547#3:295\n1618#3,3:296\n1547#3:300\n1618#3,3:301\n1547#3:304\n1618#3,3:305\n1547#3:308\n1618#3,3:309\n1547#3:313\n1618#3,3:314\n1547#3:317\n1618#3,3:318\n1547#3:321\n1618#3,3:322\n1547#3:325\n1618#3,3:326\n1#4:312\n*S KotlinDebug\n*F\n+ 1 BatchFindMethodUsingStrings.kt\norg/luckypray/dexkit/query/BatchFindMethodUsingStrings\n*L\n204#1:292\n204#1:293,2\n204#1:299\n205#1:295\n205#1:296,3\n240#1:300\n240#1:301,3\n272#1:304\n272#1:305,3\n277#1:308\n277#1:309,3\n279#1:313\n279#1:314,3\n282#1:317\n282#1:318,3\n284#1:321\n284#1:322,3\n286#1:325\n286#1:326,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0005\u00a2\u0006\u0002\u0010\u0002J2\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00052\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010$\u001a\u00020%2\u0008\u0008\u0002\u0010&\u001a\u00020\u000bH\u0007J-\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00052\u0017\u0010\'\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(\u00a2\u0006\u0002\u0008+H\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0016J%\u0010!\u001a\u00020\u00002\u0017\u0010\'\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020*0(\u00a2\u0006\u0002\u0008+H\u0087\u0008\u00f8\u0001\u0000J\u001f\u0010\u0006\u001a\u00020\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00050-\"\u00020\u0005\u00a2\u0006\u0002\u0010.J\u0014\u0010\u0006\u001a\u00020\u00002\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004J\u0014\u0010/\u001a\u00020\u00002\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0004J6\u0010/\u001a\u00020\u00002\u0018\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004012\u0008\u0008\u0002\u0010$\u001a\u00020%2\u0008\u0008\u0002\u0010&\u001a\u00020\u000bH\u0007J%\u0010/\u001a\u00020\u00002\u0017\u0010\'\u001a\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020*0(\u00a2\u0006\u0002\u0008+H\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000bJ\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0014J\u0014\u00107\u001a\u00020\u00002\u000c\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0004J\u0014\u00109\u001a\u00020\u00002\u000c\u0010:\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0004J\u001f\u0010\u001e\u001a\u00020\u00002\u0012\u0010\u001e\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00050-\"\u00020\u0005\u00a2\u0006\u0002\u0010.J\u0014\u0010\u001e\u001a\u00020\u00002\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004R4\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR$\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R4\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u0008\"\u0004\u0008\u0014\u0010\nR.\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R4\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001c\u0010\u0008\"\u0004\u0008\u001d\u0010\nR4\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001f\u0010\u0008\"\u0004\u0008 \u0010\n\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006<"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;",
        "Lorg/luckypray/dexkit/query/base/BaseQuery;",
        "()V",
        "<set-?>",
        "",
        "",
        "excludePackages",
        "getExcludePackages",
        "()Ljava/util/Collection;",
        "setExcludePackages",
        "(Ljava/util/Collection;)V",
        "",
        "ignorePackagesCase",
        "getIgnorePackagesCase",
        "()Z",
        "setIgnorePackagesCase",
        "(Z)V",
        "Lorg/luckypray/dexkit/result/ClassData;",
        "searchClasses",
        "getSearchClasses",
        "setSearchClasses",
        "",
        "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;",
        "searchGroups",
        "getSearchGroups",
        "()Ljava/util/List;",
        "Lorg/luckypray/dexkit/result/MethodData;",
        "searchMethods",
        "getSearchMethods",
        "setSearchMethods",
        "searchPackages",
        "getSearchPackages",
        "setSearchPackages",
        "addSearchGroup",
        "groupName",
        "usingStrings",
        "matchType",
        "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
        "ignoreCase",
        "init",
        "Lkotlin/Function1;",
        "Lorg/luckypray/dexkit/query/StringMatcherList;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "matcher",
        "",
        "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;",
        "groups",
        "keywordsMap",
        "",
        "Lorg/luckypray/dexkit/query/StringMatchersGroupList;",
        "innerBuild",
        "",
        "fbb",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "searchInClasses",
        "classes",
        "searchInMethods",
        "methods",
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
.field public static final Companion:Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings$Companion;


# instance fields
.field private excludePackages:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private ignorePackagesCase:Z

.field private searchClasses:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/ClassData;",
            ">;"
        }
    .end annotation
.end field

.field private searchGroups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;",
            ">;"
        }
    .end annotation
.end field

.field private searchMethods:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/MethodData;",
            ">;"
        }
    .end annotation
.end field

.field private searchPackages:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->Companion:Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    return-void
.end method

.method private final addSearchGroup(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 4
    .param p1, "groupName"    # Ljava/lang/String;
    .param p2, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/StringMatcherList;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
        }
    .end annotation

    const-string v0, "groupName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "init"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 259
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .local v0, "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    const/4 v1, 0x0

    .line 260
    .local v1, "$i$a$-also-BatchFindMethodUsingStrings$addSearchGroup$4":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    new-instance v3, Lorg/luckypray/dexkit/query/StringMatcherList;

    invoke-direct {v3}, Lorg/luckypray/dexkit/query/StringMatcherList;-><init>()V

    invoke-interface {p2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v3, Ljava/util/Collection;

    invoke-direct {v2, p1, v3}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;-><init>(Ljava/lang/String;Ljava/util/Collection;)V

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->addSearchGroup(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 261
    nop

    .line 259
    .end local v0    # "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .end local v1    # "$i$a$-also-BatchFindMethodUsingStrings$addSearchGroup$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 261
    return-object v0
.end method

.method private final addSearchGroup(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 251
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .local v0, "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    const/4 v1, 0x0

    .line 252
    .local v1, "$i$a$-also-BatchFindMethodUsingStrings$addSearchGroup$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->addSearchGroup(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 253
    nop

    .line 251
    .end local v0    # "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .end local v1    # "$i$a$-also-BatchFindMethodUsingStrings$addSearchGroup$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 253
    return-object v0
.end method

.method public static synthetic addSearchGroup$default(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 0

    .line 234
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 237
    sget-object p3, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 234
    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 238
    const/4 p4, 0x0

    .line 234
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->addSearchGroup(Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    move-result-object p0

    return-object p0
.end method

.method public static final create()Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->Companion:Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings$Companion;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings$Companion;->create()Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    move-result-object v0

    return-object v0
.end method

.method private final groups(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/StringMatchersGroupList;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .local v0, "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    const/4 v1, 0x0

    .line 247
    .local v1, "$i$a$-also-BatchFindMethodUsingStrings$groups$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/StringMatchersGroupList;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/StringMatchersGroupList;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->groups(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 248
    nop

    .line 246
    .end local v0    # "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .end local v1    # "$i$a$-also-BatchFindMethodUsingStrings$groups$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 248
    return-object v0
.end method

.method public static synthetic groups$default(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;Ljava/util/Map;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 0

    .line 199
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 201
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 199
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 202
    const/4 p3, 0x0

    .line 199
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->groups(Ljava/util/Map;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final addSearchGroup(Ljava/lang/String;Ljava/util/Collection;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
        }
    .end annotation

    const-string v0, "groupName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usingStrings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v7}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->addSearchGroup$default(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    move-result-object v0

    return-object v0
.end method

.method public final addSearchGroup(Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
            ")",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
        }
    .end annotation

    const-string v0, "groupName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usingStrings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v1 .. v7}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->addSearchGroup$default(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    move-result-object v0

    return-object v0
.end method

.method public final addSearchGroup(Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 16
    .param p1, "groupName"    # Ljava/lang/String;
    .param p2, "usingStrings"    # Ljava/util/Collection;
    .param p3, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p4, "ignoreCase"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
            "Z)",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "groupName"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "usingStrings"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "matchType"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 239
    move-object v4, v0

    check-cast v4, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .local v4, "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    const/4 v5, 0x0

    .line 240
    .local v5, "$i$a$-also-BatchFindMethodUsingStrings$addSearchGroup$2":I
    move-object v6, v2

    check-cast v6, Ljava/lang/Iterable;

    .local v6, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 300
    .local v7, "$i$f$map":I
    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v6, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v8, Ljava/util/Collection;

    .local v8, "destination$iv$iv":Ljava/util/Collection;
    move-object v9, v6

    .local v9, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 301
    .local v10, "$i$f$mapTo":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_0

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 302
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Ljava/lang/String;

    .local v13, "it":Ljava/lang/String;
    const/4 v14, 0x0

    .line 240
    .local v14, "$i$a$-map-BatchFindMethodUsingStrings$addSearchGroup$2$1":I
    new-instance v15, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    move/from16 v2, p4

    invoke-direct {v15, v13, v3, v2}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 302
    .end local v13    # "it":Ljava/lang/String;
    .end local v14    # "$i$a$-map-BatchFindMethodUsingStrings$addSearchGroup$2$1":I
    invoke-interface {v8, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 301
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v2, p2

    goto :goto_0

    .line 303
    :cond_0
    move/from16 v2, p4

    .end local v8    # "destination$iv$iv":Ljava/util/Collection;
    .end local v9    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v10    # "$i$f$mapTo":I
    check-cast v8, Ljava/util/List;

    .line 300
    nop

    .end local v6    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$map":I
    check-cast v8, Ljava/util/Collection;

    .line 240
    new-instance v6, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    invoke-direct {v6, v1, v8}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;-><init>(Ljava/lang/String;Ljava/util/Collection;)V

    invoke-virtual {v0, v6}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->addSearchGroup(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 241
    nop

    .line 239
    .end local v4    # "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .end local v5    # "$i$a$-also-BatchFindMethodUsingStrings$addSearchGroup$2":I
    move-object v4, v0

    check-cast v4, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 241
    return-object v4
.end method

.method public final addSearchGroup(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 3
    .param p1, "matcher"    # Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    const-string v0, "matcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .local v0, "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    const/4 v1, 0x0

    .line 218
    .local v1, "$i$a$-also-BatchFindMethodUsingStrings$addSearchGroup$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchGroups:Ljava/util/List;

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchGroups:Ljava/util/List;

    .line 219
    iget-object v2, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchGroups:Ljava/util/List;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 220
    nop

    .line 217
    .end local v0    # "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .end local v1    # "$i$a$-also-BatchFindMethodUsingStrings$addSearchGroup$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 220
    return-object v0
.end method

.method public final excludePackages(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 2
    .param p1, "excludePackages"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
        }
    .end annotation

    const-string v0, "excludePackages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .local v0, "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    const/4 v1, 0x0

    .line 131
    .local v1, "$i$a$-also-BatchFindMethodUsingStrings$excludePackages$2":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->excludePackages:Ljava/util/Collection;

    .line 132
    nop

    .line 130
    .end local v0    # "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .end local v1    # "$i$a$-also-BatchFindMethodUsingStrings$excludePackages$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 132
    return-object v0
.end method

.method public final varargs excludePackages([Ljava/lang/String;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 3
    .param p1, "excludePackages"    # [Ljava/lang/String;

    const-string v0, "excludePackages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .local v0, "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    const/4 v1, 0x0

    .line 117
    .local v1, "$i$a$-also-BatchFindMethodUsingStrings$excludePackages$1":I
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->excludePackages:Ljava/util/Collection;

    .line 118
    nop

    .line 116
    .end local v0    # "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .end local v1    # "$i$a$-also-BatchFindMethodUsingStrings$excludePackages$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 118
    return-object v0
.end method

.method public final getExcludePackages()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 50
    iget-object v0, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->excludePackages:Ljava/util/Collection;

    return-object v0
.end method

.method public final getIgnorePackagesCase()Z
    .locals 1

    .line 58
    iget-boolean v0, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->ignorePackagesCase:Z

    return v0
.end method

.method public final getSearchClasses()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/ClassData;",
            ">;"
        }
    .end annotation

    .line 66
    iget-object v0, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchClasses:Ljava/util/Collection;

    return-object v0
.end method

.method public final getSearchGroups()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;",
            ">;"
        }
    .end annotation

    .line 75
    iget-object v0, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchGroups:Ljava/util/List;

    return-object v0
.end method

.method public final getSearchMethods()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/MethodData;",
            ">;"
        }
    .end annotation

    .line 74
    iget-object v0, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchMethods:Ljava/util/Collection;

    return-object v0
.end method

.method public final getSearchPackages()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchPackages:Ljava/util/Collection;

    return-object v0
.end method

.method public final groups(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 3
    .param p1, "groups"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;",
            ">;)",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
        }
    .end annotation

    const-string v0, "groups"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .local v0, "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    const/4 v1, 0x0

    .line 179
    .local v1, "$i$a$-also-BatchFindMethodUsingStrings$groups$1":I
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchGroups:Ljava/util/List;

    .line 180
    nop

    .line 178
    .end local v0    # "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .end local v1    # "$i$a$-also-BatchFindMethodUsingStrings$groups$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 180
    return-object v0
.end method

.method public final groups(Ljava/util/Map;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;>;)",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
        }
    .end annotation

    const-string v0, "keywordsMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->groups$default(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;Ljava/util/Map;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    move-result-object v0

    return-object v0
.end method

.method public final groups(Ljava/util/Map;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;>;",
            "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
            ")",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
        }
    .end annotation

    const-string v0, "keywordsMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->groups$default(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;Ljava/util/Map;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    move-result-object v0

    return-object v0
.end method

.method public final groups(Ljava/util/Map;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 25
    .param p1, "keywordsMap"    # Ljava/util/Map;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;>;",
            "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
            "Z)",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "keywordsMap"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "matchType"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    move-object v2, v0

    check-cast v2, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .local v2, "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    const/4 v4, 0x0

    .line 204
    .local v4, "$i$a$-also-BatchFindMethodUsingStrings$groups$2":I
    move-object/from16 v5, p1

    .local v5, "$this$map$iv":Ljava/util/Map;
    const/4 v6, 0x0

    .line 292
    .local v6, "$i$f$map":I
    new-instance v7, Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v7, Ljava/util/Collection;

    .local v7, "destination$iv$iv":Ljava/util/Collection;
    move-object v8, v5

    .local v8, "$this$mapTo$iv$iv":Ljava/util/Map;
    const/4 v9, 0x0

    .line 293
    .local v9, "$i$f$mapTo":I
    invoke-interface {v8}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map$Entry;

    .line 294
    .local v11, "item$iv$iv":Ljava/util/Map$Entry;
    const/4 v12, 0x0

    .line 204
    .local v12, "$i$a$-map-BatchFindMethodUsingStrings$groups$2$1":I
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    .local v13, "key":Ljava/lang/String;
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/Collection;

    .line 205
    .local v14, "value":Ljava/util/Collection;
    move-object v15, v14

    check-cast v15, Ljava/lang/Iterable;

    .local v15, "$this$map$iv":Ljava/lang/Iterable;
    const/16 v16, 0x0

    .line 295
    .local v16, "$i$f$map":I
    move-object/from16 v17, v2

    .end local v2    # "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .local v17, "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v15, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v15

    .local v3, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/16 v18, 0x0

    .line 296
    .local v18, "$i$f$mapTo":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_1
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_0

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    .line 297
    .local v20, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v21, v3

    .end local v3    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .local v21, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    move-object/from16 v3, v20

    check-cast v3, Ljava/lang/String;

    .local v3, "it":Ljava/lang/String;
    const/16 v22, 0x0

    .line 205
    .local v22, "$i$a$-map-BatchFindMethodUsingStrings$groups$2$1$1":I
    move/from16 v23, v4

    .end local v4    # "$i$a$-also-BatchFindMethodUsingStrings$groups$2":I
    .local v23, "$i$a$-also-BatchFindMethodUsingStrings$groups$2":I
    new-instance v4, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    move-object/from16 v24, v5

    move/from16 v5, p3

    .end local v5    # "$this$map$iv":Ljava/util/Map;
    .local v24, "$this$map$iv":Ljava/util/Map;
    invoke-direct {v4, v3, v1, v5}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 297
    .end local v3    # "it":Ljava/lang/String;
    .end local v22    # "$i$a$-map-BatchFindMethodUsingStrings$groups$2$1$1":I
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 296
    .end local v20    # "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v3, v21

    move/from16 v4, v23

    move-object/from16 v5, v24

    goto :goto_1

    .line 298
    .end local v21    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v23    # "$i$a$-also-BatchFindMethodUsingStrings$groups$2":I
    .end local v24    # "$this$map$iv":Ljava/util/Map;
    .local v3, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .restart local v4    # "$i$a$-also-BatchFindMethodUsingStrings$groups$2":I
    .restart local v5    # "$this$map$iv":Ljava/util/Map;
    :cond_0
    move-object/from16 v21, v3

    move/from16 v23, v4

    move-object/from16 v24, v5

    move/from16 v5, p3

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$a$-also-BatchFindMethodUsingStrings$groups$2":I
    .end local v5    # "$this$map$iv":Ljava/util/Map;
    .end local v18    # "$i$f$mapTo":I
    .restart local v23    # "$i$a$-also-BatchFindMethodUsingStrings$groups$2":I
    .restart local v24    # "$this$map$iv":Ljava/util/Map;
    check-cast v2, Ljava/util/List;

    .line 295
    nop

    .end local v15    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v16    # "$i$f$map":I
    check-cast v2, Ljava/util/Collection;

    .line 205
    new-instance v3, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    invoke-direct {v3, v13, v2}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;-><init>(Ljava/lang/String;Ljava/util/Collection;)V

    .line 294
    .end local v12    # "$i$a$-map-BatchFindMethodUsingStrings$groups$2$1":I
    .end local v13    # "key":Ljava/lang/String;
    .end local v14    # "value":Ljava/util/Collection;
    invoke-interface {v7, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 293
    .end local v11    # "item$iv$iv":Ljava/util/Map$Entry;
    move-object/from16 v3, p1

    move-object/from16 v2, v17

    move-object/from16 v5, v24

    goto :goto_0

    .line 299
    .end local v17    # "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .end local v23    # "$i$a$-also-BatchFindMethodUsingStrings$groups$2":I
    .end local v24    # "$this$map$iv":Ljava/util/Map;
    .local v2, "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .restart local v4    # "$i$a$-also-BatchFindMethodUsingStrings$groups$2":I
    .restart local v5    # "$this$map$iv":Ljava/util/Map;
    :cond_1
    move-object/from16 v17, v2

    .end local v2    # "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .end local v7    # "destination$iv$iv":Ljava/util/Collection;
    .end local v8    # "$this$mapTo$iv$iv":Ljava/util/Map;
    .end local v9    # "$i$f$mapTo":I
    .restart local v17    # "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    move-object v2, v7

    check-cast v2, Ljava/util/List;

    .line 292
    nop

    .end local v5    # "$this$map$iv":Ljava/util/Map;
    .end local v6    # "$i$f$map":I
    check-cast v2, Ljava/util/Collection;

    .line 206
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    .line 204
    iput-object v2, v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchGroups:Ljava/util/List;

    .line 207
    nop

    .line 203
    .end local v4    # "$i$a$-also-BatchFindMethodUsingStrings$groups$2":I
    .end local v17    # "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    move-object v2, v0

    check-cast v2, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 207
    return-object v2
.end method

.method public final ignorePackagesCase(Z)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 2
    .param p1, "ignorePackagesCase"    # Z

    .line 142
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .local v0, "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    const/4 v1, 0x0

    .line 143
    .local v1, "$i$a$-also-BatchFindMethodUsingStrings$ignorePackagesCase$1":I
    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->ignorePackagesCase:Z

    .line 144
    nop

    .line 142
    .end local v0    # "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .end local v1    # "$i$a$-also-BatchFindMethodUsingStrings$ignorePackagesCase$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 144
    return-object v0
.end method

.method protected innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 19
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    const-string v1, "fbb"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 271
    iget-object v1, v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchGroups:Ljava/util/List;

    if-eqz v1, :cond_b

    .line 272
    iget-object v1, v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchGroups:Ljava/util/List;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 304
    .local v2, "$i$f$map":I
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v1

    .local v5, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 305
    .local v6, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 306
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v8

    check-cast v10, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .local v10, "it":Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    const/4 v11, 0x0

    .line 272
    .local v11, "$i$a$-map-BatchFindMethodUsingStrings$innerBuild$1":I
    invoke-virtual {v10}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->getGroupName()Ljava/lang/String;

    move-result-object v10

    .line 306
    .end local v10    # "it":Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    .end local v11    # "$i$a$-map-BatchFindMethodUsingStrings$innerBuild$1":I
    invoke-interface {v3, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 305
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 307
    :cond_0
    nop

    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo":I
    check-cast v3, Ljava/util/List;

    .line 304
    nop

    .line 272
    .end local v1    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$map":I
    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    iget-object v2, v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchGroups:Ljava/util/List;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v1, v2, :cond_a

    .line 275
    sget-object v1, Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings;->Companion:Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings$Companion;

    .line 276
    nop

    .line 277
    iget-object v2, v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchPackages:Ljava/util/Collection;

    if-eqz v2, :cond_2

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 308
    .local v5, "$i$f$map":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v2

    .local v7, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 309
    .local v8, "$i$f$mapTo":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 310
    .local v11, "item$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Ljava/lang/String;

    .local v12, "it":Ljava/lang/String;
    const/4 v13, 0x0

    .line 277
    .local v13, "$i$a$-map-BatchFindMethodUsingStrings$innerBuild$root$1":I
    move-object v14, v12

    check-cast v14, Ljava/lang/CharSequence;

    invoke-virtual {v9, v14}, Lcom/google/flatbuffers/FlatBufferBuilder;->createString(Ljava/lang/CharSequence;)I

    move-result v12

    .end local v12    # "it":Ljava/lang/String;
    .end local v13    # "$i$a$-map-BatchFindMethodUsingStrings$innerBuild$root$1":I
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    .line 310
    invoke-interface {v6, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 309
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_1

    .line 311
    :cond_1
    nop

    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$mapTo":I
    check-cast v6, Ljava/util/List;

    .line 308
    nop

    .line 277
    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$map":I
    check-cast v6, Ljava/util/Collection;

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object v2

    .line 278
    if-eqz v2, :cond_2

    .line 277
    nop

    .line 278
    nop

    .line 312
    nop

    .local v2, "it":[I
    const/4 v5, 0x0

    .line 278
    .local v5, "$i$a$-let-BatchFindMethodUsingStrings$innerBuild$root$2":I
    invoke-virtual {v9, v2}, Lcom/google/flatbuffers/FlatBufferBuilder;->createVectorOfTables([I)I

    move-result v2

    .line 277
    .end local v2    # "it":[I
    .end local v5    # "$i$a$-let-BatchFindMethodUsingStrings$innerBuild$root$2":I
    move v5, v2

    goto :goto_2

    .line 278
    :cond_2
    const/4 v5, 0x0

    .line 279
    :goto_2
    iget-object v2, v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->excludePackages:Ljava/util/Collection;

    if-eqz v2, :cond_4

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 313
    .local v6, "$i$f$map":I
    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v7, Ljava/util/Collection;

    .local v7, "destination$iv$iv":Ljava/util/Collection;
    move-object v8, v2

    .local v8, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 314
    .local v10, "$i$f$mapTo":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_3

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 315
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Ljava/lang/String;

    .local v13, "it":Ljava/lang/String;
    const/4 v14, 0x0

    .line 279
    .local v14, "$i$a$-map-BatchFindMethodUsingStrings$innerBuild$root$3":I
    move-object v15, v13

    check-cast v15, Ljava/lang/CharSequence;

    invoke-virtual {v9, v15}, Lcom/google/flatbuffers/FlatBufferBuilder;->createString(Ljava/lang/CharSequence;)I

    move-result v13

    .end local v13    # "it":Ljava/lang/String;
    .end local v14    # "$i$a$-map-BatchFindMethodUsingStrings$innerBuild$root$3":I
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    .line 315
    invoke-interface {v7, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 314
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_3

    .line 316
    :cond_3
    nop

    .end local v7    # "destination$iv$iv":Ljava/util/Collection;
    .end local v8    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v10    # "$i$f$mapTo":I
    check-cast v7, Ljava/util/List;

    .line 313
    nop

    .line 279
    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$map":I
    check-cast v7, Ljava/util/Collection;

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object v2

    .line 280
    if-eqz v2, :cond_4

    .line 279
    nop

    .line 280
    nop

    .line 312
    nop

    .local v2, "it":[I
    const/4 v6, 0x0

    .line 280
    .local v6, "$i$a$-let-BatchFindMethodUsingStrings$innerBuild$root$4":I
    invoke-virtual {v9, v2}, Lcom/google/flatbuffers/FlatBufferBuilder;->createVectorOfTables([I)I

    move-result v2

    .line 279
    .end local v2    # "it":[I
    .end local v6    # "$i$a$-let-BatchFindMethodUsingStrings$innerBuild$root$4":I
    move v6, v2

    goto :goto_4

    .line 280
    :cond_4
    const/4 v6, 0x0

    .line 281
    :goto_4
    iget-boolean v7, v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->ignorePackagesCase:Z

    .line 282
    iget-object v2, v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchClasses:Ljava/util/Collection;

    if-eqz v2, :cond_6

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 317
    .local v8, "$i$f$map":I
    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v10, Ljava/util/Collection;

    .local v10, "destination$iv$iv":Ljava/util/Collection;
    move-object v11, v2

    .local v11, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 318
    .local v12, "$i$f$mapTo":I
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_5
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_5

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 319
    .local v14, "item$iv$iv":Ljava/lang/Object;
    move-object v15, v14

    check-cast v15, Lorg/luckypray/dexkit/result/ClassData;

    .local v15, "it":Lorg/luckypray/dexkit/result/ClassData;
    const/16 v16, 0x0

    .line 282
    .local v16, "$i$a$-map-BatchFindMethodUsingStrings$innerBuild$root$5":I
    invoke-virtual {v15}, Lorg/luckypray/dexkit/result/ClassData;->getEncodeId()J

    move-result-wide v15

    .end local v15    # "it":Lorg/luckypray/dexkit/result/ClassData;
    .end local v16    # "$i$a$-map-BatchFindMethodUsingStrings$innerBuild$root$5":I
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    .line 319
    invoke-interface {v10, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 318
    .end local v14    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_5

    .line 320
    :cond_5
    nop

    .end local v10    # "destination$iv$iv":Ljava/util/Collection;
    .end local v11    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v12    # "$i$f$mapTo":I
    check-cast v10, Ljava/util/List;

    .line 317
    nop

    .line 282
    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$map":I
    check-cast v10, Ljava/util/Collection;

    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->toLongArray(Ljava/util/Collection;)[J

    move-result-object v2

    .line 283
    if-eqz v2, :cond_6

    .line 282
    nop

    .line 283
    nop

    .line 312
    nop

    .local v2, "it":[J
    const/4 v8, 0x0

    .line 283
    .local v8, "$i$a$-let-BatchFindMethodUsingStrings$innerBuild$root$6":I
    sget-object v10, Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings;->Companion:Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings$Companion;

    invoke-virtual {v10, v9, v2}, Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings$Companion;->createInClassesVector(Lcom/google/flatbuffers/FlatBufferBuilder;[J)I

    move-result v2

    .line 282
    .end local v2    # "it":[J
    .end local v8    # "$i$a$-let-BatchFindMethodUsingStrings$innerBuild$root$6":I
    move v8, v2

    goto :goto_6

    .line 283
    :cond_6
    const/4 v8, 0x0

    .line 284
    :goto_6
    iget-object v2, v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchMethods:Ljava/util/Collection;

    if-eqz v2, :cond_8

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 321
    .local v10, "$i$f$map":I
    new-instance v11, Ljava/util/ArrayList;

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v11, Ljava/util/Collection;

    .local v11, "destination$iv$iv":Ljava/util/Collection;
    move-object v12, v2

    .local v12, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v13, 0x0

    .line 322
    .local v13, "$i$f$mapTo":I
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_7
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_7

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .line 323
    .local v15, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v16, v15

    check-cast v16, Lorg/luckypray/dexkit/result/MethodData;

    .local v16, "it":Lorg/luckypray/dexkit/result/MethodData;
    const/16 v17, 0x0

    .line 284
    .local v17, "$i$a$-map-BatchFindMethodUsingStrings$innerBuild$root$7":I
    invoke-virtual/range {v16 .. v16}, Lorg/luckypray/dexkit/result/MethodData;->getEncodeId()J

    move-result-wide v16

    .end local v16    # "it":Lorg/luckypray/dexkit/result/MethodData;
    .end local v17    # "$i$a$-map-BatchFindMethodUsingStrings$innerBuild$root$7":I
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    .line 323
    invoke-interface {v11, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 322
    .end local v15    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_7

    .line 324
    :cond_7
    nop

    .end local v11    # "destination$iv$iv":Ljava/util/Collection;
    .end local v12    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v13    # "$i$f$mapTo":I
    move-object v3, v11

    check-cast v3, Ljava/util/List;

    .line 321
    nop

    .line 284
    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v10    # "$i$f$map":I
    check-cast v3, Ljava/util/Collection;

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toLongArray(Ljava/util/Collection;)[J

    move-result-object v2

    .line 285
    if-eqz v2, :cond_8

    .line 284
    nop

    .line 285
    nop

    .line 312
    nop

    .local v2, "it":[J
    const/4 v3, 0x0

    .line 285
    .local v3, "$i$a$-let-BatchFindMethodUsingStrings$innerBuild$root$8":I
    sget-object v10, Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings;->Companion:Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings$Companion;

    invoke-virtual {v10, v9, v2}, Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings$Companion;->createInMethodsVector(Lcom/google/flatbuffers/FlatBufferBuilder;[J)I

    move-result v2

    .line 284
    .end local v2    # "it":[J
    .end local v3    # "$i$a$-let-BatchFindMethodUsingStrings$innerBuild$root$8":I
    move/from16 v18, v2

    goto :goto_8

    .line 285
    :cond_8
    const/16 v18, 0x0

    .line 286
    :goto_8
    iget-object v2, v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchGroups:Ljava/util/List;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 325
    .local v3, "$i$f$map":I
    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v10, v4}, Ljava/util/ArrayList;-><init>(I)V

    move-object v4, v10

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v10, v2

    .local v10, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 326
    .local v11, "$i$f$mapTo":I
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_9
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 327
    .local v13, "item$iv$iv":Ljava/lang/Object;
    move-object v14, v13

    check-cast v14, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .local v14, "it":Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    const/4 v15, 0x0

    .line 286
    .local v15, "$i$a$-map-BatchFindMethodUsingStrings$innerBuild$root$9":I
    move-object v0, v14

    check-cast v0, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v0, v9}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v0

    .end local v14    # "it":Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    .end local v15    # "$i$a$-map-BatchFindMethodUsingStrings$innerBuild$root$9":I
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 327
    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 326
    .end local v13    # "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v0, p0

    goto :goto_9

    .line 328
    :cond_9
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v10    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v11    # "$i$f$mapTo":I
    move-object v0, v4

    check-cast v0, Ljava/util/List;

    .line 325
    nop

    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map":I
    check-cast v0, Ljava/util/Collection;

    .line 286
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->createVectorOfTables([I)I

    move-result v0

    .line 275
    move-object/from16 v2, p1

    move v3, v5

    move v4, v6

    move v5, v7

    move v6, v8

    move/from16 v7, v18

    move v8, v0

    invoke-virtual/range {v1 .. v8}, Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings$Companion;->createBatchFindMethodUsingStrings(Lcom/google/flatbuffers/FlatBufferBuilder;IIZIII)I

    move-result v0

    .line 288
    .local v0, "root":I
    invoke-virtual {v9, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    .line 289
    return v0

    .line 273
    .end local v0    # "root":I
    :cond_a
    new-instance v0, Ljava/lang/IllegalAccessException;

    const-string v1, "groupName must be unique"

    invoke-direct {v0, v1}, Ljava/lang/IllegalAccessException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 271
    :cond_b
    new-instance v0, Ljava/lang/IllegalAccessException;

    const-string v1, "searchGroups not be empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalAccessException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final searchInClasses(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 2
    .param p1, "classes"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/ClassData;",
            ">;)",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
        }
    .end annotation

    const-string v0, "classes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .local v0, "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    const/4 v1, 0x0

    .line 155
    .local v1, "$i$a$-also-BatchFindMethodUsingStrings$searchInClasses$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchClasses:Ljava/util/Collection;

    .line 156
    nop

    .line 154
    .end local v0    # "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .end local v1    # "$i$a$-also-BatchFindMethodUsingStrings$searchInClasses$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 156
    return-object v0
.end method

.method public final searchInMethods(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 2
    .param p1, "methods"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/MethodData;",
            ">;)",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
        }
    .end annotation

    const-string v0, "methods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .local v0, "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    const/4 v1, 0x0

    .line 167
    .local v1, "$i$a$-also-BatchFindMethodUsingStrings$searchInMethods$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchMethods:Ljava/util/Collection;

    .line 168
    nop

    .line 166
    .end local v0    # "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .end local v1    # "$i$a$-also-BatchFindMethodUsingStrings$searchInMethods$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 168
    return-object v0
.end method

.method public final searchPackages(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 2
    .param p1, "searchPackages"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
        }
    .end annotation

    const-string v0, "searchPackages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .local v0, "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    const/4 v1, 0x0

    .line 103
    .local v1, "$i$a$-also-BatchFindMethodUsingStrings$searchPackages$2":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchPackages:Ljava/util/Collection;

    .line 104
    nop

    .line 102
    .end local v0    # "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .end local v1    # "$i$a$-also-BatchFindMethodUsingStrings$searchPackages$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 104
    return-object v0
.end method

.method public final varargs searchPackages([Ljava/lang/String;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 3
    .param p1, "searchPackages"    # [Ljava/lang/String;

    const-string v0, "searchPackages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .local v0, "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    const/4 v1, 0x0

    .line 89
    .local v1, "$i$a$-also-BatchFindMethodUsingStrings$searchPackages$1":I
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchPackages:Ljava/util/Collection;

    .line 90
    nop

    .line 88
    .end local v0    # "it":Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .end local v1    # "$i$a$-also-BatchFindMethodUsingStrings$searchPackages$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 90
    return-object v0
.end method

.method public final synthetic setExcludePackages(Ljava/util/Collection;)V
    .locals 0
    .param p1, "<set-?>"    # Ljava/util/Collection;

    .line 50
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->excludePackages:Ljava/util/Collection;

    return-void
.end method

.method public final synthetic setIgnorePackagesCase(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 58
    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->ignorePackagesCase:Z

    return-void
.end method

.method public final synthetic setSearchClasses(Ljava/util/Collection;)V
    .locals 0
    .param p1, "<set-?>"    # Ljava/util/Collection;

    .line 66
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchClasses:Ljava/util/Collection;

    return-void
.end method

.method public final synthetic setSearchMethods(Ljava/util/Collection;)V
    .locals 0
    .param p1, "<set-?>"    # Ljava/util/Collection;

    .line 74
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchMethods:Ljava/util/Collection;

    return-void
.end method

.method public final synthetic setSearchPackages(Ljava/util/Collection;)V
    .locals 0
    .param p1, "<set-?>"    # Ljava/util/Collection;

    .line 42
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchPackages:Ljava/util/Collection;

    return-void
.end method
