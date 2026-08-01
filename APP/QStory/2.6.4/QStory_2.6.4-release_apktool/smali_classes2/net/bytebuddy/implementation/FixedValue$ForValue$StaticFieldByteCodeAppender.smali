.class Lnet/bytebuddy/implementation/FixedValue$ForValue$StaticFieldByteCodeAppender;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/FixedValue$ForValue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "StaticFieldByteCodeAppender"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final fieldGetAccess:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

.field final synthetic this$0:Lnet/bytebuddy/implementation/FixedValue$ForValue;


# direct methods
.method private constructor <init>(Lnet/bytebuddy/implementation/FixedValue$ForValue;Lnet/bytebuddy/description/type/TypeDescription;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/implementation/FixedValue$ForValue$StaticFieldByteCodeAppender;->this$0:Lnet/bytebuddy/implementation/FixedValue$ForValue;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p2}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-static {p1}, Lnet/bytebuddy/implementation/FixedValue$ForValue;->access$100(Lnet/bytebuddy/implementation/FixedValue$ForValue;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p2, p1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lnet/bytebuddy/description/field/FieldList;

    .line 23
    .line 24
    invoke-interface {p1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 29
    .line 30
    invoke-static {p1}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-interface {p1}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->read()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lnet/bytebuddy/implementation/FixedValue$ForValue$StaticFieldByteCodeAppender;->fieldGetAccess:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 39
    .line 40
    return-void
.end method

.method public synthetic constructor <init>(Lnet/bytebuddy/implementation/FixedValue$ForValue;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/FixedValue$1;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/implementation/FixedValue$ForValue$StaticFieldByteCodeAppender;-><init>(Lnet/bytebuddy/implementation/FixedValue$ForValue;Lnet/bytebuddy/description/type/TypeDescription;)V

    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 6

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/FixedValue$ForValue$StaticFieldByteCodeAppender;->this$0:Lnet/bytebuddy/implementation/FixedValue$ForValue;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/implementation/FixedValue$ForValue;->access$200(Lnet/bytebuddy/implementation/FixedValue$ForValue;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    iget-object v5, p0, Lnet/bytebuddy/implementation/FixedValue$ForValue$StaticFieldByteCodeAppender;->fieldGetAccess:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 16
    .line 17
    move-object v1, p1

    .line 18
    move-object v2, p2

    .line 19
    move-object v3, p3

    .line 20
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/implementation/FixedValue;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
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
    iget-object p0, p0, Lnet/bytebuddy/implementation/FixedValue$ForValue$StaticFieldByteCodeAppender;->fieldGetAccess:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/FixedValue$ForValue$StaticFieldByteCodeAppender;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/implementation/FixedValue$ForValue$StaticFieldByteCodeAppender;->fieldGetAccess:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/FixedValue$ForValue$StaticFieldByteCodeAppender;->fieldGetAccess:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

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
