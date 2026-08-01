.class public final enum Lorg/luckypray/dexkit/query/enums/StringMatchType;
.super Ljava/lang/Enum;
.source "StringMatchType.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\u0008\t\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
        "",
        "value",
        "",
        "(Ljava/lang/String;IB)V",
        "getValue",
        "()B",
        "Contains",
        "StartsWith",
        "EndsWith",
        "SimilarRegex",
        "Equals",
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
.field private static final synthetic $VALUES:[Lorg/luckypray/dexkit/query/enums/StringMatchType;

.field public static final enum Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

.field public static final enum EndsWith:Lorg/luckypray/dexkit/query/enums/StringMatchType;

.field public static final enum Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

.field public static final enum SimilarRegex:Lorg/luckypray/dexkit/query/enums/StringMatchType;

.field public static final enum StartsWith:Lorg/luckypray/dexkit/query/enums/StringMatchType;


# instance fields
.field private final value:B


# direct methods
.method private static final synthetic $values()[Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .locals 5

    sget-object v0, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    sget-object v1, Lorg/luckypray/dexkit/query/enums/StringMatchType;->StartsWith:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    sget-object v2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->EndsWith:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    sget-object v3, Lorg/luckypray/dexkit/query/enums/StringMatchType;->SimilarRegex:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    sget-object v4, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    filled-new-array {v0, v1, v2, v3, v4}, [Lorg/luckypray/dexkit/query/enums/StringMatchType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 28
    new-instance v0, Lorg/luckypray/dexkit/query/enums/StringMatchType;

    const-string v1, "Contains"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/StringMatchType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 29
    new-instance v0, Lorg/luckypray/dexkit/query/enums/StringMatchType;

    const-string v1, "StartsWith"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/StringMatchType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/StringMatchType;->StartsWith:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 30
    new-instance v0, Lorg/luckypray/dexkit/query/enums/StringMatchType;

    const-string v1, "EndsWith"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/StringMatchType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/StringMatchType;->EndsWith:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 31
    new-instance v0, Lorg/luckypray/dexkit/query/enums/StringMatchType;

    const-string v1, "SimilarRegex"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/StringMatchType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/StringMatchType;->SimilarRegex:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 32
    new-instance v0, Lorg/luckypray/dexkit/query/enums/StringMatchType;

    const-string v1, "Equals"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/StringMatchType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    invoke-static {}, Lorg/luckypray/dexkit/query/enums/StringMatchType;->$values()[Lorg/luckypray/dexkit/query/enums/StringMatchType;

    move-result-object v0

    sput-object v0, Lorg/luckypray/dexkit/query/enums/StringMatchType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/StringMatchType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IB)V
    .locals 0
    .param p1, "$enum$name"    # Ljava/lang/String;
    .param p2, "$enum$ordinal"    # I
    .param p3, "value"    # B
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B)V"
        }
    .end annotation

    .line 27
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-byte p3, p0, Lorg/luckypray/dexkit/query/enums/StringMatchType;->value:B

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .locals 1

    const-class v0, Lorg/luckypray/dexkit/query/enums/StringMatchType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/query/enums/StringMatchType;

    return-object v0
.end method

.method public static values()[Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .locals 1

    sget-object v0, Lorg/luckypray/dexkit/query/enums/StringMatchType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/StringMatchType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/luckypray/dexkit/query/enums/StringMatchType;

    return-object v0
.end method


# virtual methods
.method public final getValue()B
    .locals 1

    .line 27
    iget-byte v0, p0, Lorg/luckypray/dexkit/query/enums/StringMatchType;->value:B

    return v0
.end method
