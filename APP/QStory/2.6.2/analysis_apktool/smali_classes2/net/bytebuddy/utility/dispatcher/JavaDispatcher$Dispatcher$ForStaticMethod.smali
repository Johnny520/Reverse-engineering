.class public Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForStaticMethod;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForStaticMethod"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final method:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForStaticMethod;->method:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/lang/reflect/Method;)I
    .locals 10

    .line 1
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForStaticMethod;->method:Ljava/lang/reflect/Method;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v1

    .line 14
    :goto_0
    array-length v4, p2

    .line 15
    if-ge v2, v4, :cond_1

    .line 16
    .line 17
    aget-object v4, p2, v2

    .line 18
    .line 19
    invoke-static {v4}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const/16 v5, 0x15

    .line 24
    .line 25
    invoke-virtual {v4, v5}, Lnet/bytebuddy/jar/asm/Type;->getOpcode(I)I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    invoke-virtual {p1, v5, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 30
    .line 31
    .line 32
    aget-object v5, p2, v2

    .line 33
    .line 34
    aget-object v6, v0, v2

    .line 35
    .line 36
    if-eq v5, v6, :cond_0

    .line 37
    .line 38
    const/16 v5, 0xc0

    .line 39
    .line 40
    invoke-static {v6}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-virtual {p1, v5, v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-virtual {v4}, Lnet/bytebuddy/jar/asm/Type;->getSize()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    add-int/2addr v3, v4

    .line 52
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    iget-object p2, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForStaticMethod;->method:Ljava/lang/reflect/Method;

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-static {p2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    iget-object p2, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForStaticMethod;->method:Ljava/lang/reflect/Method;

    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    iget-object p2, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForStaticMethod;->method:Ljava/lang/reflect/Method;

    .line 72
    .line 73
    invoke-static {p2}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    iget-object p2, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForStaticMethod;->method:Ljava/lang/reflect/Method;

    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-virtual {p2}, Ljava/lang/Class;->isInterface()Z

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    const/16 v5, 0xb8

    .line 88
    .line 89
    move-object v4, p1

    .line 90
    invoke-virtual/range {v4 .. v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    iget-object p1, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForStaticMethod;->method:Ljava/lang/reflect/Method;

    .line 94
    .line 95
    invoke-static {p1}, Lnet/bytebuddy/jar/asm/Type;->getReturnType(Ljava/lang/reflect/Method;)Lnet/bytebuddy/jar/asm/Type;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    const/16 p2, 0xac

    .line 100
    .line 101
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/Type;->getOpcode(I)I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    invoke-virtual {v4, p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 106
    .line 107
    .line 108
    sub-int/2addr v3, v1

    .line 109
    iget-object p0, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForStaticMethod;->method:Ljava/lang/reflect/Method;

    .line 110
    .line 111
    invoke-static {p0}, Lnet/bytebuddy/jar/asm/Type;->getReturnType(Ljava/lang/reflect/Method;)Lnet/bytebuddy/jar/asm/Type;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-virtual {p0}, Lnet/bytebuddy/jar/asm/Type;->getSize()I

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    invoke-static {v3, p0}, Ljava/lang/Math;->max(II)I

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    return p0
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
    iget-object p0, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForStaticMethod;->method:Ljava/lang/reflect/Method;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForStaticMethod;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForStaticMethod;->method:Ljava/lang/reflect/Method;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Method;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 1

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
    iget-object p0, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForStaticMethod;->method:Ljava/lang/reflect/Method;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->access$100()Lnet/bytebuddy/utility/Invoker;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForStaticMethod;->method:Ljava/lang/reflect/Method;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-interface {v0, p0, v1, p1}, Lnet/bytebuddy/utility/Invoker;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method
