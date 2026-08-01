.class public Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UsingJump"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump$AfterInstruction;,
        Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump$BeforeInstruction;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final endOfBlock:Lnet/bytebuddy/jar/asm/Label;

.field private final firstValueNull:Lnet/bytebuddy/jar/asm/Label;

.field private final instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

.field private final secondValueNull:Lnet/bytebuddy/jar/asm/Label;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/method/MethodDescription;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 5
    .line 6
    new-instance p1, Lnet/bytebuddy/jar/asm/Label;

    .line 7
    .line 8
    invoke-direct {p1}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->firstValueNull:Lnet/bytebuddy/jar/asm/Label;

    .line 12
    .line 13
    new-instance p1, Lnet/bytebuddy/jar/asm/Label;

    .line 14
    .line 15
    invoke-direct {p1}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->secondValueNull:Lnet/bytebuddy/jar/asm/Label;

    .line 19
    .line 20
    new-instance p1, Lnet/bytebuddy/jar/asm/Label;

    .line 21
    .line 22
    invoke-direct {p1}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->endOfBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 26
    .line 27
    return-void
.end method

.method public static synthetic access$300(Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;)Lnet/bytebuddy/description/method/MethodDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$400(Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;)Lnet/bytebuddy/jar/asm/Label;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->secondValueNull:Lnet/bytebuddy/jar/asm/Label;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$500(Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;)Lnet/bytebuddy/jar/asm/Label;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->firstValueNull:Lnet/bytebuddy/jar/asm/Label;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$600(Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;)Lnet/bytebuddy/jar/asm/Label;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->endOfBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public after()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump$AfterInstruction;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump$AfterInstruction;-><init>(Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public before()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump$BeforeInstruction;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump$BeforeInstruction;-><init>(Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->firstValueNull:Lnet/bytebuddy/jar/asm/Label;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->firstValueNull:Lnet/bytebuddy/jar/asm/Label;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->secondValueNull:Lnet/bytebuddy/jar/asm/Label;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->secondValueNull:Lnet/bytebuddy/jar/asm/Label;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    iget-object p0, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->endOfBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 56
    .line 57
    iget-object p1, p1, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->endOfBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_6

    .line 64
    .line 65
    return v1

    .line 66
    :cond_6
    return v0
.end method

.method public getRequiredVariablePadding()I
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    return p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Lnet/bytebuddy/description/method/MethodDescription;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->firstValueNull:Lnet/bytebuddy/jar/asm/Label;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    add-int/2addr v2, v0

    .line 25
    mul-int/2addr v2, v1

    .line 26
    iget-object v0, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->secondValueNull:Lnet/bytebuddy/jar/asm/Label;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    add-int/2addr v0, v2

    .line 33
    mul-int/2addr v0, v1

    .line 34
    iget-object p0, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->endOfBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v0

    .line 41
    return p0
.end method
