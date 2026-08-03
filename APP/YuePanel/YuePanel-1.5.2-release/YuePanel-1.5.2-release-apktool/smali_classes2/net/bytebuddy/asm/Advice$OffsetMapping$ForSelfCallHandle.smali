.class public abstract enum Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$OffsetMapping;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$OffsetMapping;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "ForSelfCallHandle"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;",
        ">;",
        "Lnet/bytebuddy/asm/Advice$OffsetMapping;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;

.field public static final enum BOUND:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;

.field public static final enum UNBOUND:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle$1;

    const-string v1, "BOUND"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;->BOUND:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;

    new-instance v1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle$2;

    const-string v3, "UNBOUND"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle$2;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;->UNBOUND:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;

    const/4 v3, 0x2

    new-array v3, v3, [Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;->$VALUES:[Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;

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

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILnet/bytebuddy/asm/Advice$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;
    .locals 1

    const-class v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;
    .locals 1

    sget-object v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;->$VALUES:[Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;

    invoke-virtual {v0}, [Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;

    return-object v0
.end method


# virtual methods
.method public abstract decorate(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
.end method

.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler;Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;
    .locals 0

    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->isMethod()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    move-result-object p1

    check-cast p1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-static {p1}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->of(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    move-result-object p3

    check-cast p3, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-static {p3, p1}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->ofSpecial(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->toStackManipulation()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p1

    new-instance p3, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForStackManipulation;

    invoke-virtual {p0, p2, p1}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;->decorate(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p1

    invoke-direct {p3, p1}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForStackManipulation;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    return-object p3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method
