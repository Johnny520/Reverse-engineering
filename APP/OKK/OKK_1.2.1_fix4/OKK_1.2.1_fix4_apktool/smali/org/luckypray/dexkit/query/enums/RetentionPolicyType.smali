.class public final enum Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

.field public static final enum Class:Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

.field public static final enum Runtime:Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

.field public static final enum Source:Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;


# instance fields
.field private final value:B


# direct methods
.method private static final synthetic $values()[Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;
    .locals 3

    sget-object v0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;->Source:Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    sget-object v1, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;->Class:Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    sget-object v2, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;->Runtime:Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    filled-new-array {v0, v1, v2}, [Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    const-string v1, "Source"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;->Source:Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    const-string v1, "Class"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;->Class:Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    const-string v1, "Runtime"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;->Runtime:Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    invoke-static {}, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;->$values()[Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    move-result-object v0

    sput-object v0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

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

    iput-byte p3, p0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;->value:B

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;
    .locals 1

    const-class v0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    return-object p0
.end method

.method public static values()[Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;
    .locals 1

    sget-object v0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    return-object v0
.end method


# virtual methods
.method public final getValue()B
    .locals 1

    iget-byte v0, p0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;->value:B

    return v0
.end method
