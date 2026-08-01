.class public final enum Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;",
        "",
        "value",
        "",
        "(Ljava/lang/String;IB)V",
        "getValue",
        "()B",
        "Source",
        "Class",
        "Runtime",
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
.field private static final synthetic $VALUES:[Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

.field public static final enum Class:Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

.field public static final enum Runtime:Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

.field public static final enum Source:Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;


# instance fields
.field private final value:B


# direct methods
.method private static final synthetic $values()[Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;
    .locals 3

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;->Source:Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    .line 2
    .line 3
    sget-object v1, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;->Class:Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    .line 4
    .line 5
    sget-object v2, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;->Runtime:Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    .line 2
    .line 3
    const-string v1, "Source"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;-><init>(Ljava/lang/String;IB)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;->Source:Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    .line 11
    .line 12
    new-instance v0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    .line 13
    .line 14
    const-string v1, "Class"

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    invoke-direct {v0, v1, v3, v2}, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;-><init>(Ljava/lang/String;IB)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;->Class:Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    .line 21
    .line 22
    new-instance v0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    .line 23
    .line 24
    const-string v1, "Runtime"

    .line 25
    .line 26
    const/4 v3, 0x3

    .line 27
    invoke-direct {v0, v1, v2, v3}, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;-><init>(Ljava/lang/String;IB)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;->Runtime:Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    .line 31
    .line 32
    invoke-static {}, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;->$values()[Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    .line 37
    .line 38
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IB)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-byte p3, p0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;->value:B

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;
    .locals 1

    .line 1
    const-class v0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getValue()B
    .locals 0

    .line 1
    iget-byte p0, p0, Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;->value:B

    .line 2
    .line 3
    return p0
.end method
