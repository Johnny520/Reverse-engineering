.class public Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory$ArrayStackManipulation;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ArrayStackManipulation"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field private final stackManipulations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory$ArrayStackManipulation;->this$0:Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory$ArrayStackManipulation;->stackManipulations:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 5

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory$ArrayStackManipulation;->stackManipulations:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory$ArrayStackManipulation;->this$0:Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;

    .line 16
    .line 17
    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->access$000(Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;)Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory$ArrayCreator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v1, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->aggregate(Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory$ArrayStackManipulation;->stackManipulations:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const/4 v2, 0x0

    .line 36
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 47
    .line 48
    const/16 v4, 0x59

    .line 49
    .line 50
    invoke-virtual {p1, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 51
    .line 52
    .line 53
    sget-object v4, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 54
    .line 55
    invoke-virtual {v4}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toIncreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v0, v4}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->aggregate(Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    add-int/lit8 v4, v2, 0x1

    .line 64
    .line 65
    invoke-static {v2}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-interface {v2, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v0, v2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->aggregate(Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-interface {v3, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v0, v2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->aggregate(Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget-object v2, p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory$ArrayStackManipulation;->this$0:Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;

    .line 86
    .line 87
    invoke-static {v2}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->access$000(Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;)Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory$ArrayCreator;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-interface {v2}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory$ArrayCreator;->getStorageOpcode()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    invoke-virtual {p1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 96
    .line 97
    .line 98
    iget-object v2, p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory$ArrayStackManipulation;->this$0:Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;

    .line 99
    .line 100
    invoke-static {v2}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->access$100(Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v0, v2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->aggregate(Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    move v2, v4

    .line 109
    goto :goto_0

    .line 110
    :cond_0
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory$ArrayStackManipulation;->stackManipulations:Ljava/util/List;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory$ArrayStackManipulation;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory$ArrayStackManipulation;->stackManipulations:Ljava/util/List;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory$ArrayStackManipulation;->this$0:Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory$ArrayStackManipulation;->this$0:Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    return v0
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory$ArrayStackManipulation;->stackManipulations:Ljava/util/List;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/util/List;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory$ArrayStackManipulation;->this$0:Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;

    .line 19
    .line 20
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v0

    .line 25
    return p0
.end method

.method public isValid()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory$ArrayStackManipulation;->stackManipulations:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 18
    .line 19
    invoke-interface {v1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return p0

    .line 27
    :cond_1
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory$ArrayStackManipulation;->this$0:Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;

    .line 28
    .line 29
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->access$000(Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;)Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory$ArrayCreator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0
.end method
