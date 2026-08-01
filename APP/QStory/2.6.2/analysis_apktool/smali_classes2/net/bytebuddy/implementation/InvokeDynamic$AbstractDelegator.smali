.class public abstract Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;
.super Lnet/bytebuddy/implementation/InvokeDynamic;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/InvokeDynamic;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AbstractDelegator"
.end annotation


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;",
            "Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;",
            "Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;",
            "Lnet/bytebuddy/implementation/bytecode/assign/Assigner;",
            "Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct/range {p0 .. p6}, Lnet/bytebuddy/implementation/InvokeDynamic;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public andThen(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/implementation/Implementation;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->andThen(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/implementation/Implementation;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public abstract materialize()Lnet/bytebuddy/implementation/InvokeDynamic;
.end method

.method public prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public withArgument(I)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitType;
    .locals 0

    .line 10
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    move-result-object p0

    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withArgument(I)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitType;

    move-result-object p0

    return-object p0
.end method

.method public varargs withArgument([I)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withArgument([I)Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/Implementation$Composable;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/implementation/InvokeDynamic;->withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public varargs withBooleanValue([Z)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withBooleanValue([Z)Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public varargs withByteValue([B)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withByteValue([B)Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public varargs withCharacterValue([C)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withCharacterValue([C)Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public varargs withDoubleValue([D)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withDoubleValue([D)Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public varargs withEnumeration([Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withEnumeration([Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public withField(Ljava/lang/String;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitType;
    .locals 0

    .line 11
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    move-result-object p0

    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withField(Ljava/lang/String;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitType;

    move-result-object p0

    return-object p0
.end method

.method public withField(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitType;
    .locals 0

    .line 12
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/implementation/InvokeDynamic;->withField(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitType;

    move-result-object p0

    return-object p0
.end method

.method public varargs withField(Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;[Ljava/lang/String;)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 0

    .line 10
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/implementation/InvokeDynamic;->withField(Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;[Ljava/lang/String;)Lnet/bytebuddy/implementation/InvokeDynamic;

    move-result-object p0

    return-object p0
.end method

.method public varargs withField([Ljava/lang/String;)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withField([Ljava/lang/String;)Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public varargs withFloatValue([F)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withFloatValue([F)Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public withImplicitAndMethodArguments()Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic;->withImplicitAndMethodArguments()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public varargs withInstance([Lnet/bytebuddy/utility/JavaConstant;)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withInstance([Lnet/bytebuddy/utility/JavaConstant;)Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public varargs withIntegerValue([I)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withIntegerValue([I)Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public varargs withLongValue([J)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withLongValue([J)Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public withMethodArguments()Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic;->withMethodArguments()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public varargs withNullValue([Ljava/lang/Class;)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/implementation/InvokeDynamic;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withNullValue([Ljava/lang/Class;)Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public varargs withNullValue([Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 0

    .line 10
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    move-result-object p0

    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withNullValue([Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/InvokeDynamic;

    move-result-object p0

    return-object p0
.end method

.method public withReference(Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitType;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withReference(Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitType;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public varargs withReference([Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 0

    .line 10
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    move-result-object p0

    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withReference([Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic;

    move-result-object p0

    return-object p0
.end method

.method public varargs withShortValue([S)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withShortValue([S)Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public varargs withThis([Ljava/lang/Class;)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/implementation/InvokeDynamic;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withThis([Ljava/lang/Class;)Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public varargs withThis([Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 0

    .line 10
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    move-result-object p0

    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withThis([Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/InvokeDynamic;

    move-result-object p0

    return-object p0
.end method

.method public varargs withType([Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withType([Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public varargs withValue([Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;->materialize()Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withValue([Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
