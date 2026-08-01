.class public Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Size"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field public static final ZERO:Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;


# instance fields
.field private final localVariableSize:I

.field private final operandStackSize:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;->ZERO:Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;->operandStackSize:I

    .line 5
    .line 6
    iput p2, p0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;->localVariableSize:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
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
    iget v2, p0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;->operandStackSize:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 23
    .line 24
    iget v3, p1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;->operandStackSize:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget p0, p0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;->localVariableSize:I

    .line 30
    .line 31
    iget p1, p1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;->localVariableSize:I

    .line 32
    .line 33
    if-eq p0, p1, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    return v0
.end method

.method public getLocalVariableSize()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;->localVariableSize:I

    .line 2
    .line 3
    return p0
.end method

.method public getOperandStackSize()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;->operandStackSize:I

    .line 2
    .line 3
    return p0
.end method

.method public hashCode()I
    .locals 2

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
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget v1, p0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;->operandStackSize:I

    .line 12
    .line 13
    add-int/2addr v0, v1

    .line 14
    mul-int/lit8 v0, v0, 0x1f

    .line 15
    .line 16
    iget p0, p0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;->localVariableSize:I

    .line 17
    .line 18
    add-int/2addr v0, p0

    .line 19
    return v0
.end method

.method public merge(Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 2
    .line 3
    iget v1, p0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;->operandStackSize:I

    .line 4
    .line 5
    iget v2, p1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;->operandStackSize:I

    .line 6
    .line 7
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget p0, p0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;->localVariableSize:I

    .line 12
    .line 13
    iget p1, p1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;->localVariableSize:I

    .line 14
    .line 15
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method
