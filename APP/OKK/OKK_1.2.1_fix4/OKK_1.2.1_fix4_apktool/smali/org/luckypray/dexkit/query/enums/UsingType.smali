.class public final enum Lorg/luckypray/dexkit/query/enums/UsingType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/luckypray/dexkit/query/enums/UsingType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/luckypray/dexkit/query/enums/UsingType;

.field public static final enum Any:Lorg/luckypray/dexkit/query/enums/UsingType;

.field public static final enum Read:Lorg/luckypray/dexkit/query/enums/UsingType;

.field public static final enum Write:Lorg/luckypray/dexkit/query/enums/UsingType;


# instance fields
.field private final value:B


# direct methods
.method private static final synthetic $values()[Lorg/luckypray/dexkit/query/enums/UsingType;
    .locals 3

    sget-object v0, Lorg/luckypray/dexkit/query/enums/UsingType;->Any:Lorg/luckypray/dexkit/query/enums/UsingType;

    sget-object v1, Lorg/luckypray/dexkit/query/enums/UsingType;->Read:Lorg/luckypray/dexkit/query/enums/UsingType;

    sget-object v2, Lorg/luckypray/dexkit/query/enums/UsingType;->Write:Lorg/luckypray/dexkit/query/enums/UsingType;

    filled-new-array {v0, v1, v2}, [Lorg/luckypray/dexkit/query/enums/UsingType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lorg/luckypray/dexkit/query/enums/UsingType;

    const-string v1, "Any"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/UsingType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/UsingType;->Any:Lorg/luckypray/dexkit/query/enums/UsingType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/UsingType;

    const-string v1, "Read"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/UsingType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/UsingType;->Read:Lorg/luckypray/dexkit/query/enums/UsingType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/UsingType;

    const-string v1, "Write"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/UsingType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/UsingType;->Write:Lorg/luckypray/dexkit/query/enums/UsingType;

    invoke-static {}, Lorg/luckypray/dexkit/query/enums/UsingType;->$values()[Lorg/luckypray/dexkit/query/enums/UsingType;

    move-result-object v0

    sput-object v0, Lorg/luckypray/dexkit/query/enums/UsingType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/UsingType;

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

    iput-byte p3, p0, Lorg/luckypray/dexkit/query/enums/UsingType;->value:B

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/luckypray/dexkit/query/enums/UsingType;
    .locals 1

    const-class v0, Lorg/luckypray/dexkit/query/enums/UsingType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/luckypray/dexkit/query/enums/UsingType;

    return-object p0
.end method

.method public static values()[Lorg/luckypray/dexkit/query/enums/UsingType;
    .locals 1

    sget-object v0, Lorg/luckypray/dexkit/query/enums/UsingType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/UsingType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/luckypray/dexkit/query/enums/UsingType;

    return-object v0
.end method


# virtual methods
.method public final getValue()B
    .locals 1

    iget-byte v0, p0, Lorg/luckypray/dexkit/query/enums/UsingType;->value:B

    return v0
.end method
