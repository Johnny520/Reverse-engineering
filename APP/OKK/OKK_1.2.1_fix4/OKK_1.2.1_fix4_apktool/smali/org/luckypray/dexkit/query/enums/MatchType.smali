.class public final enum Lorg/luckypray/dexkit/query/enums/MatchType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/luckypray/dexkit/query/enums/MatchType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/luckypray/dexkit/query/enums/MatchType;

.field public static final enum Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

.field public static final enum Equals:Lorg/luckypray/dexkit/query/enums/MatchType;


# instance fields
.field private final value:B


# direct methods
.method private static final synthetic $values()[Lorg/luckypray/dexkit/query/enums/MatchType;
    .locals 2

    sget-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    sget-object v1, Lorg/luckypray/dexkit/query/enums/MatchType;->Equals:Lorg/luckypray/dexkit/query/enums/MatchType;

    filled-new-array {v0, v1}, [Lorg/luckypray/dexkit/query/enums/MatchType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lorg/luckypray/dexkit/query/enums/MatchType;

    const-string v1, "Contains"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/MatchType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/MatchType;

    const-string v1, "Equals"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/MatchType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->Equals:Lorg/luckypray/dexkit/query/enums/MatchType;

    invoke-static {}, Lorg/luckypray/dexkit/query/enums/MatchType;->$values()[Lorg/luckypray/dexkit/query/enums/MatchType;

    move-result-object v0

    sput-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/MatchType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IB)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-byte p3, p0, Lorg/luckypray/dexkit/query/enums/MatchType;->value:B

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/luckypray/dexkit/query/enums/MatchType;
    .locals 1

    const-class v0, Lorg/luckypray/dexkit/query/enums/MatchType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/luckypray/dexkit/query/enums/MatchType;

    return-object p0
.end method

.method public static values()[Lorg/luckypray/dexkit/query/enums/MatchType;
    .locals 1

    sget-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/MatchType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/luckypray/dexkit/query/enums/MatchType;

    return-object v0
.end method


# virtual methods
.method public final getValue()B
    .locals 1

    iget-byte v0, p0, Lorg/luckypray/dexkit/query/enums/MatchType;->value:B

    return v0
.end method
