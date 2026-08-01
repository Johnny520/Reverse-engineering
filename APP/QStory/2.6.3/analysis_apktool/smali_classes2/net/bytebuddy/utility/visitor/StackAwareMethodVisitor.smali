.class public Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;
.super Lnet/bytebuddy/jar/asm/MethodVisitor;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field private static final SIZE_CHANGE:[I

.field public static final UNADJUSTED:Z

.field public static final UNADJUSTED_PROPERTY:Ljava/lang/String; = "net.bytebuddy.unadjusted"


# instance fields
.field private current:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/bytecode/StackSize;",
            ">;"
        }
    .end annotation
.end field

.field private freeIndex:I

.field private final sizes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lnet/bytebuddy/jar/asm/Label;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/bytecode/StackSize;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "java.security.AccessController"

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v1, v0, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "net.bytebuddy.securitymanager"

    .line 9
    .line 10
    const-string v2, "true"

    .line 11
    .line 12
    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sput-boolean v1, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->ACCESS_CONTROLLER:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    const/4 v1, 0x1

    .line 24
    sput-boolean v1, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_1
    sput-boolean v0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->ACCESS_CONTROLLER:Z

    .line 28
    .line 29
    :goto_0
    :try_start_1
    new-instance v1, Lnet/bytebuddy/utility/privilege/GetSystemPropertyAction;

    .line 30
    .line 31
    const-string v2, "net.bytebuddy.unadjusted"

    .line 32
    .line 33
    invoke-direct {v1, v2}, Lnet/bytebuddy/utility/privilege/GetSystemPropertyAction;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v1}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 46
    goto :goto_1

    .line 47
    :catch_2
    move v1, v0

    .line 48
    :goto_1
    sput-boolean v1, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->UNADJUSTED:Z

    .line 49
    .line 50
    const/16 v1, 0xca

    .line 51
    .line 52
    new-array v1, v1, [I

    .line 53
    .line 54
    sput-object v1, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->SIZE_CHANGE:[I

    .line 55
    .line 56
    :goto_2
    sget-object v1, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->SIZE_CHANGE:[I

    .line 57
    .line 58
    array-length v2, v1

    .line 59
    if-ge v0, v2, :cond_0

    .line 60
    .line 61
    const-string v2, "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEEEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE"

    .line 62
    .line 63
    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    add-int/lit8 v2, v2, -0x45

    .line 68
    .line 69
    aput v2, v1, v0

    .line 70
    .line 71
    add-int/lit8 v0, v0, 0x1

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_0
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/description/method/MethodDescription;)V
    .locals 1

    .line 1
    sget v0, Lnet/bytebuddy/utility/OpenedClassReader;->ASM_API:I

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;-><init>(ILnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 12
    .line 13
    new-instance p1, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->sizes:Ljava/util/Map;

    .line 19
    .line 20
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iput p1, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->freeIndex:I

    .line 25
    .line 26
    return-void
.end method

.method private adjustStack(I)V
    .locals 1

    const/4 v0, 0x0

    .line 132
    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(II)V

    return-void
.end method

.method private adjustStack(II)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    if-gt p1, v0, :cond_8

    .line 3
    .line 4
    if-lez p1, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    if-lez p2, :cond_0

    .line 13
    .line 14
    if-lez v0, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 17
    .line 18
    add-int/lit8 v0, v0, -0x1

    .line 19
    .line 20
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 25
    .line 26
    invoke-virtual {v1}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    sub-int/2addr p2, v1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    if-ltz p2, :cond_1

    .line 33
    .line 34
    iget-object p0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 35
    .line 36
    invoke-static {p1}, Lnet/bytebuddy/implementation/bytecode/StackSize;->of(I)Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {p0, v0, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    const-string p0, "Unexpected offset underflow: "

    .line 45
    .line 46
    invoke-static {p2, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    if-nez p2, :cond_7

    .line 55
    .line 56
    :goto_1
    const/4 p2, 0x1

    .line 57
    if-gez p1, :cond_4

    .line 58
    .line 59
    iget-object v0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    iget-object v0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    sub-int/2addr v1, p2

    .line 75
    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    check-cast p2, Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 80
    .line 81
    invoke-virtual {p2}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    add-int/2addr p1, p2

    .line 86
    goto :goto_1

    .line 87
    :cond_4
    if-ne p1, p2, :cond_5

    .line 88
    .line 89
    iget-object p0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 90
    .line 91
    sget-object p1, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 92
    .line 93
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_5
    if-nez p1, :cond_6

    .line 98
    .line 99
    :goto_2
    return-void

    .line 100
    :cond_6
    const-string p0, "Unexpected remainder on the operand stack: "

    .line 101
    .line 102
    invoke-static {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_7
    const-string p0, "Cannot specify non-zero offset "

    .line 111
    .line 112
    const-string v0, " for non-incrementing value: "

    .line 113
    .line 114
    invoke-static {p2, p1, p0, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲兰世(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_8
    const-string p0, "Cannot push multiple values onto the operand stack: "

    .line 123
    .line 124
    invoke-static {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method private doDrain(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/bytecode/StackSize;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p1, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 20
    .line 21
    sget-object v1, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor$1;->$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize:[I

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    aget v1, v1, v2

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eq v1, v2, :cond_1

    .line 31
    .line 32
    const/4 v2, 0x2

    .line 33
    if-ne v1, v2, :cond_0

    .line 34
    .line 35
    const/16 v0, 0x58

    .line 36
    .line 37
    invoke-super {p0, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const-string p0, "Unexpected stack size: "

    .line 42
    .line 43
    invoke-static {v0, p0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    const/16 v0, 0x57

    .line 48
    .line 49
    invoke-super {p0, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    return-void
.end method

.method private static doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/security/PrivilegedAction<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/AccessControllerPlugin$Enhance;
    .end annotation

    .line 1
    sget-boolean v0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->ACCESS_CONTROLLER:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/security/PrivilegedAction;->run()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static of(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/jar/asm/MethodVisitor;
    .locals 1

    .line 1
    sget-boolean v0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->UNADJUSTED:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;-><init>(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/description/method/MethodDescription;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method


# virtual methods
.method public drainStack(IILnet/bytebuddy/implementation/bytecode/StackSize;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x1

    .line 18
    sub-int/2addr v2, v3

    .line 19
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 24
    .line 25
    invoke-virtual {v0}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {p3}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    sub-int/2addr v0, v2

    .line 34
    iget-object v2, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    return v1

    .line 45
    :cond_1
    iget v2, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->freeIndex:I

    .line 46
    .line 47
    invoke-super {p0, p1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 48
    .line 49
    .line 50
    if-ne v0, v3, :cond_2

    .line 51
    .line 52
    const/16 p1, 0x57

    .line 53
    .line 54
    invoke-super {p0, p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    if-nez v0, :cond_3

    .line 59
    .line 60
    :goto_0
    iget-object p1, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    sub-int/2addr v0, v3

    .line 67
    invoke-interface {p1, v1, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-direct {p0, p1}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->doDrain(Ljava/util/List;)V

    .line 72
    .line 73
    .line 74
    iget p1, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->freeIndex:I

    .line 75
    .line 76
    invoke-super {p0, p2, p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 77
    .line 78
    .line 79
    iget p0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->freeIndex:I

    .line 80
    .line 81
    invoke-virtual {p3}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    add-int/2addr p1, p0

    .line 86
    return p1

    .line 87
    :cond_3
    const-string p0, "Unexpected remainder on the operand stack: "

    .line 88
    .line 89
    invoke-static {v0, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return v1
.end method

.method public drainStack()V
    .locals 1

    .line 97
    iget-object v0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    invoke-direct {p0, v0}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->doDrain(Ljava/util/List;)V

    return-void
.end method

.method public register(Lnet/bytebuddy/jar/asm/Label;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/jar/asm/Label;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/bytecode/StackSize;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->sizes:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p4}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Type;->getSize()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    const-string p0, "Unexpected opcode: "

    .line 13
    .line 14
    invoke-static {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    neg-int v0, v0

    .line 23
    add-int/lit8 v0, v0, -0x1

    .line 24
    .line 25
    invoke-direct {p0, v0}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(I)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :pswitch_1
    const/4 v1, -0x1

    .line 30
    invoke-direct {p0, v1}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(I)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0, v0}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(I)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :pswitch_2
    neg-int v0, v0

    .line 38
    invoke-direct {p0, v0}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(I)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :pswitch_3
    invoke-direct {p0, v0}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(I)V

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-super {p0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0xb2
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V
    .locals 3
    .param p3    # [Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # [Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eq p1, v0, :cond_4

    .line 4
    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p1, v0, :cond_3

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq p1, v0, :cond_3

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    if-eq p1, v0, :cond_3

    .line 15
    .line 16
    const/4 v0, 0x4

    .line 17
    if-ne p1, v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 22
    .line 23
    .line 24
    aget-object v0, p5, v1

    .line 25
    .line 26
    sget-object v1, Lnet/bytebuddy/jar/asm/Opcodes;->LONG:Ljava/lang/Integer;

    .line 27
    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    .line 30
    sget-object v1, Lnet/bytebuddy/jar/asm/Opcodes;->DOUBLE:Ljava/lang/Integer;

    .line 31
    .line 32
    if-ne v0, v1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 36
    .line 37
    sget-object v1, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 38
    .line 39
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_4

    .line 43
    :cond_1
    :goto_0
    iget-object v0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 44
    .line 45
    sget-object v1, Lnet/bytebuddy/implementation/bytecode/StackSize;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 46
    .line 47
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_4

    .line 51
    :cond_2
    const-string p0, "Unknown frame type: "

    .line 52
    .line 53
    invoke-static {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_3
    iget-object v0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 64
    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_4
    iget-object v0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 70
    .line 71
    .line 72
    :goto_1
    if-ge v1, p4, :cond_7

    .line 73
    .line 74
    aget-object v0, p5, v1

    .line 75
    .line 76
    sget-object v2, Lnet/bytebuddy/jar/asm/Opcodes;->LONG:Ljava/lang/Integer;

    .line 77
    .line 78
    if-eq v0, v2, :cond_6

    .line 79
    .line 80
    sget-object v2, Lnet/bytebuddy/jar/asm/Opcodes;->DOUBLE:Ljava/lang/Integer;

    .line 81
    .line 82
    if-ne v0, v2, :cond_5

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_5
    iget-object v0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 86
    .line 87
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 88
    .line 89
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_6
    :goto_2
    iget-object v0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 94
    .line 95
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/StackSize;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 96
    .line 97
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_7
    :goto_4
    invoke-super/range {p0 .. p5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public visitInsn(I)V
    .locals 3

    .line 1
    const/16 v0, 0x2f

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    const/4 v2, 0x2

    .line 5
    if-eq p1, v0, :cond_5

    .line 6
    .line 7
    const/16 v0, 0x31

    .line 8
    .line 9
    if-eq p1, v0, :cond_5

    .line 10
    .line 11
    const/16 v0, 0x85

    .line 12
    .line 13
    if-eq p1, v0, :cond_4

    .line 14
    .line 15
    const/16 v0, 0x90

    .line 16
    .line 17
    if-eq p1, v0, :cond_3

    .line 18
    .line 19
    const/16 v0, 0xbf

    .line 20
    .line 21
    if-eq p1, v0, :cond_2

    .line 22
    .line 23
    const/16 v0, 0x5a

    .line 24
    .line 25
    if-eq p1, v0, :cond_1

    .line 26
    .line 27
    const/16 v0, 0x5b

    .line 28
    .line 29
    if-eq p1, v0, :cond_0

    .line 30
    .line 31
    const/16 v0, 0x5d

    .line 32
    .line 33
    if-eq p1, v0, :cond_1

    .line 34
    .line 35
    const/16 v0, 0x5e

    .line 36
    .line 37
    if-eq p1, v0, :cond_0

    .line 38
    .line 39
    packed-switch p1, :pswitch_data_0

    .line 40
    .line 41
    .line 42
    packed-switch p1, :pswitch_data_1

    .line 43
    .line 44
    .line 45
    packed-switch p1, :pswitch_data_2

    .line 46
    .line 47
    .line 48
    sget-object v0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->SIZE_CHANGE:[I

    .line 49
    .line 50
    aget v0, v0, p1

    .line 51
    .line 52
    invoke-direct {p0, v0}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(I)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    sget-object v0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->SIZE_CHANGE:[I

    .line 57
    .line 58
    aget v0, v0, p1

    .line 59
    .line 60
    add-int/lit8 v1, v0, 0x2

    .line 61
    .line 62
    invoke-direct {p0, v0, v1}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(II)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    sget-object v0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->SIZE_CHANGE:[I

    .line 67
    .line 68
    aget v0, v0, p1

    .line 69
    .line 70
    add-int/lit8 v1, v0, 0x1

    .line 71
    .line 72
    invoke-direct {p0, v0, v1}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(II)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    :pswitch_0
    iget-object v0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 77
    .line 78
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    :pswitch_1
    invoke-direct {p0, v1}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(I)V

    .line 83
    .line 84
    .line 85
    const/4 v0, 0x1

    .line 86
    invoke-direct {p0, v0}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(I)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    :pswitch_2
    const/4 v0, -0x1

    .line 91
    invoke-direct {p0, v0}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(I)V

    .line 92
    .line 93
    .line 94
    invoke-direct {p0, v2}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(I)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_5
    invoke-direct {p0, v1}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(I)V

    .line 99
    .line 100
    .line 101
    invoke-direct {p0, v2}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(I)V

    .line 102
    .line 103
    .line 104
    :goto_0
    invoke-super {p0, p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x87
        :pswitch_2
        :pswitch_1
        :pswitch_1
    .end packed-switch

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    :pswitch_data_1
    .packed-switch 0x8c
        :pswitch_2
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    :pswitch_data_2
    .packed-switch 0xac
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public visitIntInsn(II)V
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->SIZE_CHANGE:[I

    .line 2
    .line 3
    aget v0, v0, p1

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(I)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIntInsn(II)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public varargs visitInvokeDynamicInsn(Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Handle;[Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p2}, Lnet/bytebuddy/jar/asm/Type;->getArgumentsAndReturnSizes(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    shr-int/lit8 v1, v0, 0x2

    .line 6
    .line 7
    neg-int v1, v1

    .line 8
    add-int/lit8 v1, v1, 0x1

    .line 9
    .line 10
    invoke-direct {p0, v1}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(I)V

    .line 11
    .line 12
    .line 13
    and-int/lit8 v0, v0, 0x3

    .line 14
    .line 15
    invoke-direct {p0, v0}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(I)V

    .line 16
    .line 17
    .line 18
    invoke-super {p0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInvokeDynamicInsn(Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Handle;[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V
    .locals 4

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->SIZE_CHANGE:[I

    .line 2
    .line 3
    aget v0, v0, p1

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->sizes:Ljava/util/Map;

    .line 9
    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    iget-object v2, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 13
    .line 14
    const/16 v3, 0xa8

    .line 15
    .line 16
    if-ne p1, v3, :cond_0

    .line 17
    .line 18
    sget-object v3, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 19
    .line 20
    invoke-static {v2, v3}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    :cond_0
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    const/16 v0, 0xa7

    .line 31
    .line 32
    if-ne p1, v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-super {p0, p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public visitLabel(Lnet/bytebuddy/jar/asm/Label;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->sizes:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 17
    .line 18
    :cond_0
    invoke-super {p0, p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public visitLdcInsn(Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/lang/Long;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p1, Ljava/lang/Double;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x2

    .line 13
    :goto_1
    invoke-direct {p0, v0}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(I)V

    .line 14
    .line 15
    .line 16
    invoke-super {p0, p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public visitLookupSwitchInsn(Lnet/bytebuddy/jar/asm/Label;[I[Lnet/bytebuddy/jar/asm/Label;)V
    .locals 5

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-direct {p0, v0}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(I)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v1, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->sizes:Ljava/util/Map;

    .line 13
    .line 14
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    array-length v1, p3

    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    if-ge v2, v1, :cond_0

    .line 20
    .line 21
    aget-object v3, p3, v2

    .line 22
    .line 23
    iget-object v4, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->sizes:Ljava/util/Map;

    .line 24
    .line 25
    invoke-interface {v4, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLookupSwitchInsn(Lnet/bytebuddy/jar/asm/Label;[I[Lnet/bytebuddy/jar/asm/Label;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 3

    .line 1
    invoke-static {p4}, Lnet/bytebuddy/jar/asm/Type;->getArgumentsAndReturnSizes(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    shr-int/lit8 v1, v0, 0x2

    .line 6
    .line 7
    neg-int v1, v1

    .line 8
    const/16 v2, 0xb8

    .line 9
    .line 10
    if-ne p1, v2, :cond_0

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    :goto_0
    add-int/2addr v1, v2

    .line 16
    invoke-direct {p0, v1}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(I)V

    .line 17
    .line 18
    .line 19
    and-int/lit8 v0, v0, 0x3

    .line 20
    .line 21
    invoke-direct {p0, v0}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(I)V

    .line 22
    .line 23
    .line 24
    invoke-super/range {p0 .. p5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public visitMultiANewArrayInsn(Ljava/lang/String;I)V
    .locals 1

    .line 1
    rsub-int/lit8 v0, p2, 0x1

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(I)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMultiANewArrayInsn(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public varargs visitTableSwitchInsn(IILnet/bytebuddy/jar/asm/Label;[Lnet/bytebuddy/jar/asm/Label;)V
    .locals 5

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-direct {p0, v0}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(I)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v1, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->sizes:Ljava/util/Map;

    .line 13
    .line 14
    invoke-interface {v1, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    array-length v1, p4

    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    if-ge v2, v1, :cond_0

    .line 20
    .line 21
    aget-object v3, p4, v2

    .line 22
    .line 23
    iget-object v4, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->sizes:Ljava/util/Map;

    .line 24
    .line 25
    invoke-interface {v4, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTableSwitchInsn(IILnet/bytebuddy/jar/asm/Label;[Lnet/bytebuddy/jar/asm/Label;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public visitTryCatchBlock(Lnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Label;Ljava/lang/String;)V
    .locals 2
    .param p4    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->sizes:Ljava/util/Map;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 4
    .line 5
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, p3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-super {p0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTryCatchBlock(Lnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Label;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public visitTypeInsn(ILjava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->SIZE_CHANGE:[I

    .line 2
    .line 3
    aget v0, v0, p1

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(I)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public visitVarInsn(II)V
    .locals 2

    .line 1
    const/16 v0, 0xa9

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :pswitch_0
    iget v0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->freeIndex:I

    .line 10
    .line 11
    add-int/lit8 v1, p2, 0x2

    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->freeIndex:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :pswitch_1
    iget v0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->freeIndex:I

    .line 21
    .line 22
    add-int/lit8 v1, p2, 0x1

    .line 23
    .line 24
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iput v0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->freeIndex:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->current:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 34
    .line 35
    .line 36
    :goto_0
    sget-object v0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->SIZE_CHANGE:[I

    .line 37
    .line 38
    aget v0, v0, p1

    .line 39
    .line 40
    invoke-direct {p0, v0}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->adjustStack(I)V

    .line 41
    .line 42
    .line 43
    invoke-super {p0, p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_data_0
    .packed-switch 0x36
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
