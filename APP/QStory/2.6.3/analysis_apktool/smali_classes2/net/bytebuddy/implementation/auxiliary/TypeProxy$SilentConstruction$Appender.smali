.class public Lnet/bytebuddy/implementation/auxiliary/TypeProxy$SilentConstruction$Appender;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/auxiliary/TypeProxy$SilentConstruction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Appender"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field public static final GET_DECLARED_CONSTRUCTOR_METHOD_DESCRIPTOR:Ljava/lang/String; = "([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;"

.field public static final GET_DECLARED_CONSTRUCTOR_METHOD_NAME:Ljava/lang/String; = "getDeclaredConstructor"

.field public static final GET_REFLECTION_FACTORY_METHOD_DESCRIPTOR:Ljava/lang/String; = "()Lsun/reflect/ReflectionFactory;"

.field public static final GET_REFLECTION_FACTORY_METHOD_NAME:Ljava/lang/String; = "getReflectionFactory"

.field public static final JAVA_LANG_CLASS_INTERNAL_NAME:Ljava/lang/String; = "java/lang/Class"

.field public static final JAVA_LANG_CONSTRUCTOR_INTERNAL_NAME:Ljava/lang/String; = "java/lang/reflect/Constructor"

.field public static final JAVA_LANG_OBJECT_DESCRIPTOR:Ljava/lang/String; = "Ljava/lang/Object;"

.field public static final JAVA_LANG_OBJECT_INTERNAL_NAME:Ljava/lang/String; = "java/lang/Object"

.field public static final NEW_CONSTRUCTOR_FOR_SERIALIZATION_METHOD_DESCRIPTOR:Ljava/lang/String; = "(Ljava/lang/Class;Ljava/lang/reflect/Constructor;)Ljava/lang/reflect/Constructor;"

.field public static final NEW_CONSTRUCTOR_FOR_SERIALIZATION_METHOD_NAME:Ljava/lang/String; = "newConstructorForSerialization"

.field public static final NEW_INSTANCE_METHOD_DESCRIPTOR:Ljava/lang/String; = "([Ljava/lang/Object;)Ljava/lang/Object;"

.field public static final NEW_INSTANCE_METHOD_NAME:Ljava/lang/String; = "newInstance"

.field public static final REFLECTION_FACTORY_INTERNAL_NAME:Ljava/lang/String; = "sun/reflect/ReflectionFactory"


# instance fields
.field private final instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method private constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$SilentConstruction$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/auxiliary/TypeProxy$1;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$SilentConstruction$Appender;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 12

    .line 1
    const-string v4, "()Lsun/reflect/ReflectionFactory;"

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/16 v1, 0xb8

    .line 5
    .line 6
    const-string v2, "sun/reflect/ReflectionFactory"

    .line 7
    .line 8
    const-string v3, "getReflectionFactory"

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    move-object v6, v0

    .line 15
    iget-object p1, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$SilentConstruction$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 16
    .line 17
    invoke-interface {p1}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v6, p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const-string p1, "Ljava/lang/Object;"

    .line 29
    .line 30
    invoke-static {p1}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {v6, p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x3

    .line 38
    invoke-virtual {v6, p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 39
    .line 40
    .line 41
    const-string p2, "java/lang/Class"

    .line 42
    .line 43
    const/16 p3, 0xbd

    .line 44
    .line 45
    invoke-virtual {v6, p3, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v10, "([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;"

    .line 49
    .line 50
    const/4 v11, 0x0

    .line 51
    const/16 v7, 0xb6

    .line 52
    .line 53
    const-string v8, "java/lang/Class"

    .line 54
    .line 55
    const-string v9, "getDeclaredConstructor"

    .line 56
    .line 57
    invoke-virtual/range {v6 .. v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 58
    .line 59
    .line 60
    const-string v10, "(Ljava/lang/Class;Ljava/lang/reflect/Constructor;)Ljava/lang/reflect/Constructor;"

    .line 61
    .line 62
    const-string v8, "sun/reflect/ReflectionFactory"

    .line 63
    .line 64
    const-string v9, "newConstructorForSerialization"

    .line 65
    .line 66
    invoke-virtual/range {v6 .. v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v6, p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 70
    .line 71
    .line 72
    const-string p1, "java/lang/Object"

    .line 73
    .line 74
    invoke-virtual {v6, p3, p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const-string v10, "([Ljava/lang/Object;)Ljava/lang/Object;"

    .line 78
    .line 79
    const-string v8, "java/lang/reflect/Constructor"

    .line 80
    .line 81
    const-string v9, "newInstance"

    .line 82
    .line 83
    invoke-virtual/range {v6 .. v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$SilentConstruction$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 87
    .line 88
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    const/16 p1, 0xc0

    .line 93
    .line 94
    invoke-virtual {v6, p1, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const/16 p0, 0xb0

    .line 98
    .line 99
    invoke-virtual {v6, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 100
    .line 101
    .line 102
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 103
    .line 104
    const/4 p1, 0x4

    .line 105
    const/4 p2, 0x0

    .line 106
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 107
    .line 108
    .line 109
    return-object p0
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
    iget-object p0, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$SilentConstruction$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$SilentConstruction$Appender;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$SilentConstruction$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$SilentConstruction$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method
