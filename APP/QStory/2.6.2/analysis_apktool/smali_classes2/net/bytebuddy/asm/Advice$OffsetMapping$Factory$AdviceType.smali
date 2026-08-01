.class public final enum Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AdviceType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;

.field public static final enum DELEGATION:Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;

.field public static final enum INLINING:Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;


# instance fields
.field private final delegation:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;

    .line 2
    .line 3
    const-string v1, "DELEGATION"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;-><init>(Ljava/lang/String;IZ)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;->DELEGATION:Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;

    .line 11
    .line 12
    new-instance v1, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;

    .line 13
    .line 14
    const-string v4, "INLINING"

    .line 15
    .line 16
    invoke-direct {v1, v4, v3, v2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;-><init>(Ljava/lang/String;IZ)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;->INLINING:Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;

    .line 20
    .line 21
    filled-new-array {v0, v1}, [Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;->$VALUES:[Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;

    .line 26
    .line 27
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-boolean p3, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;->delegation:Z

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;->$VALUES:[Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public isDelegation()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;->delegation:Z

    .line 2
    .line 3
    return p0
.end method
