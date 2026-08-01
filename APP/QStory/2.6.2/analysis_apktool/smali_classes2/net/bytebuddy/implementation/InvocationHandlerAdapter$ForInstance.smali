.class public Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;
.super Lnet/bytebuddy/implementation/InvocationHandlerAdapter;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/InvocationHandlerAdapter$WithoutPrivilegeConfiguration;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/InvocationHandlerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForInstance"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance$Appender;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final PREFIX:Ljava/lang/String; = "invocationHandler"


# instance fields
.field protected final invocationHandler:Ljava/lang/reflect/InvocationHandler;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZZLnet/bytebuddy/implementation/bytecode/assign/Assigner;Ljava/lang/reflect/InvocationHandler;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;-><init>(Ljava/lang/String;ZZZLnet/bytebuddy/implementation/bytecode/assign/Assigner;)V

    .line 2
    .line 3
    .line 4
    iput-object p6, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;->invocationHandler:Ljava/lang/reflect/InvocationHandler;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public andThen(Lnet/bytebuddy/implementation/Implementation$Composable;)Lnet/bytebuddy/implementation/Implementation$Composable;
    .locals 8

    .line 32
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;

    new-instance v1, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;

    iget-object v2, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->fieldName:Ljava/lang/String;

    iget-boolean v3, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->cached:Z

    iget-boolean v4, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->privileged:Z

    iget-object v6, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v7, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;->invocationHandler:Ljava/lang/reflect/InvocationHandler;

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;-><init>(Ljava/lang/String;ZZZLnet/bytebuddy/implementation/bytecode/assign/Assigner;Ljava/lang/reflect/InvocationHandler;)V

    invoke-direct {v0, v1, p1}, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;-><init>(Lnet/bytebuddy/implementation/Implementation;Lnet/bytebuddy/implementation/Implementation$Composable;)V

    return-object v0
.end method

.method public andThen(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/implementation/Implementation;
    .locals 8

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Compound;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->fieldName:Ljava/lang/String;

    .line 6
    .line 7
    iget-boolean v3, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->cached:Z

    .line 8
    .line 9
    iget-boolean v4, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->privileged:Z

    .line 10
    .line 11
    iget-object v6, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 12
    .line 13
    iget-object v7, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;->invocationHandler:Ljava/lang/reflect/InvocationHandler;

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;-><init>(Ljava/lang/String;ZZZLnet/bytebuddy/implementation/bytecode/assign/Assigner;Ljava/lang/reflect/InvocationHandler;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x2

    .line 20
    new-array p0, p0, [Lnet/bytebuddy/implementation/Implementation;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    aput-object v1, p0, v2

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    aput-object p1, p0, v1

    .line 27
    .line 28
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/Implementation$Compound;-><init>([Lnet/bytebuddy/implementation/Implementation;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance$Appender;

    .line 2
    .line 3
    invoke-interface {p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance$Appender;-><init>(Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    if-ne p0, p1, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    if-nez p1, :cond_2

    .line 14
    .line 15
    return v1

    .line 16
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-eq v2, v3, :cond_3

    .line 25
    .line 26
    return v1

    .line 27
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;->invocationHandler:Ljava/lang/reflect/InvocationHandler;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;

    .line 30
    .line 31
    iget-object p1, p1, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;->invocationHandler:Ljava/lang/reflect/InvocationHandler;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;->invocationHandler:Ljava/lang/reflect/InvocationHandler;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    add-int/2addr p0, v0

    .line 14
    return p0
.end method

.method public prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 4

    .line 1
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->fieldName:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {}, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->access$000()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v2}, Lnet/bytebuddy/matcher/ElementMatchers;->fieldType(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-interface {v1, v2}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lnet/bytebuddy/description/field/FieldList;

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object v1, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->fieldName:Ljava/lang/String;

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    new-instance v0, Lnet/bytebuddy/description/field/FieldDescription$Token;

    .line 42
    .line 43
    const/16 v2, 0x1049

    .line 44
    .line 45
    invoke-static {}, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->access$000()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-direct {v0, v1, v2, v3}, Lnet/bytebuddy/description/field/FieldDescription$Token;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p1, v0}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;->withField(Lnet/bytebuddy/description/field/FieldDescription$Token;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    new-instance v0, Lnet/bytebuddy/implementation/LoadedTypeInitializer$ForStaticField;

    .line 57
    .line 58
    iget-object v1, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->fieldName:Ljava/lang/String;

    .line 59
    .line 60
    iget-object p0, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;->invocationHandler:Ljava/lang/reflect/InvocationHandler;

    .line 61
    .line 62
    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/implementation/LoadedTypeInitializer$ForStaticField;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p1, v0}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;->withInitializer(Lnet/bytebuddy/implementation/LoadedTypeInitializer;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :cond_0
    const-string p0, "Field with name "

    .line 71
    .line 72
    const-string v0, " and type "

    .line 73
    .line 74
    invoke-static {p0, v1, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {}, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->access$000()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-string v1, " already declared by "

    .line 87
    .line 88
    invoke-static {p0, v0, v1, p1}, Landroidx/fragment/app/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    const/4 p0, 0x0

    .line 92
    return-object p0
.end method

.method public withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)Lnet/bytebuddy/implementation/Implementation$Composable;
    .locals 7

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->fieldName:Ljava/lang/String;

    .line 4
    .line 5
    iget-boolean v2, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->cached:Z

    .line 6
    .line 7
    iget-boolean v3, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->privileged:Z

    .line 8
    .line 9
    iget-boolean v4, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->returning:Z

    .line 10
    .line 11
    iget-object v6, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;->invocationHandler:Ljava/lang/reflect/InvocationHandler;

    .line 12
    .line 13
    move-object v5, p1

    .line 14
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;-><init>(Ljava/lang/String;ZZZLnet/bytebuddy/implementation/bytecode/assign/Assigner;Ljava/lang/reflect/InvocationHandler;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)Lnet/bytebuddy/implementation/Implementation;
    .locals 0

    .line 18
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;->withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)Lnet/bytebuddy/implementation/Implementation$Composable;

    move-result-object p0

    return-object p0
.end method

.method public withPrivilegedLookup()Lnet/bytebuddy/implementation/InvocationHandlerAdapter$AssignerConfigurable;
    .locals 7

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->fieldName:Ljava/lang/String;

    .line 4
    .line 5
    iget-boolean v2, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->cached:Z

    .line 6
    .line 7
    iget-boolean v4, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->returning:Z

    .line 8
    .line 9
    iget-object v5, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 10
    .line 11
    iget-object v6, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;->invocationHandler:Ljava/lang/reflect/InvocationHandler;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;-><init>(Ljava/lang/String;ZZZLnet/bytebuddy/implementation/bytecode/assign/Assigner;Ljava/lang/reflect/InvocationHandler;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public withoutMethodCache()Lnet/bytebuddy/implementation/InvocationHandlerAdapter$WithoutPrivilegeConfiguration;
    .locals 7

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->fieldName:Ljava/lang/String;

    .line 4
    .line 5
    iget-boolean v3, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->privileged:Z

    .line 6
    .line 7
    iget-boolean v4, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->returning:Z

    .line 8
    .line 9
    iget-object v5, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 10
    .line 11
    iget-object v6, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;->invocationHandler:Ljava/lang/reflect/InvocationHandler;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;-><init>(Ljava/lang/String;ZZZLnet/bytebuddy/implementation/bytecode/assign/Assigner;Ljava/lang/reflect/InvocationHandler;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method
