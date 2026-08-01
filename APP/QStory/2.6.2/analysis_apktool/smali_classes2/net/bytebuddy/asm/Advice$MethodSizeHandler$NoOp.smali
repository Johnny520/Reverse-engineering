.class public final enum Lnet/bytebuddy/asm/Advice$MethodSizeHandler$NoOp;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;
.implements Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$MethodSizeHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "NoOp"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/asm/Advice$MethodSizeHandler$NoOp;",
        ">;",
        "Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;",
        "Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/asm/Advice$MethodSizeHandler$NoOp;

.field public static final enum INSTANCE:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$NoOp;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$NoOp;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$NoOp;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$NoOp;->INSTANCE:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$NoOp;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/asm/Advice$MethodSizeHandler$NoOp;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$NoOp;->$VALUES:[Lnet/bytebuddy/asm/Advice$MethodSizeHandler$NoOp;

    .line 16
    .line 17
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/asm/Advice$MethodSizeHandler$NoOp;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$NoOp;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$NoOp;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/asm/Advice$MethodSizeHandler$NoOp;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$NoOp;->$VALUES:[Lnet/bytebuddy/asm/Advice$MethodSizeHandler$NoOp;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/asm/Advice$MethodSizeHandler$NoOp;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/asm/Advice$MethodSizeHandler$NoOp;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public bindEnter(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;)Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;
    .locals 0

    .line 1
    return-object p0
.end method

.method public bindExit(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;)Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;
    .locals 0

    .line 1
    return-object p0
.end method

.method public compoundLocalVariableLength(I)I
    .locals 0

    .line 1
    const/16 p0, 0x7fff

    .line 2
    .line 3
    return p0
.end method

.method public compoundStackSize(I)I
    .locals 0

    .line 1
    const/16 p0, 0x7fff

    .line 2
    .line 3
    return p0
.end method

.method public recordMaxima(II)V
    .locals 0

    .line 1
    return-void
.end method

.method public requireLocalVariableLength(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public requireLocalVariableLengthPadding(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public requireStackSize(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public requireStackSizePadding(I)V
    .locals 0

    .line 1
    return-void
.end method
