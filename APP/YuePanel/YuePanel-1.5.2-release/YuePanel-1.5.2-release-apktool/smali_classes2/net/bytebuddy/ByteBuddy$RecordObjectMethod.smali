.class public final enum Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/implementation/Implementation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/ByteBuddy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RecordObjectMethod"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;",
        ">;",
        "Lnet/bytebuddy/implementation/Implementation;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

.field public static final enum EQUALS:Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

.field public static final enum HASH_CODE:Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

.field public static final enum TO_STRING:Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;


# instance fields
.field private final arguments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end field

.field private final name:Ljava/lang/String;

.field private final returnType:Lnet/bytebuddy/description/type/TypeDescription;

.field private final stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    new-instance v7, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    sget-object v8, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v9, 0x0

    new-array v6, v9, [Ljava/lang/Class;

    const-string v1, "HASH_CODE"

    const/4 v2, 0x0

    const-string v3, "hashCode"

    move-object v0, v7

    move-object v4, v8

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;-><init>(Ljava/lang/String;ILjava/lang/String;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Ljava/lang/Class;[Ljava/lang/Class;)V

    sput-object v7, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->HASH_CODE:Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    new-instance v6, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    sget-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v14

    sget-object v15, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-class v0, Ljava/lang/Object;

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v16

    const-string v11, "EQUALS"

    const/4 v12, 0x1

    const-string v13, "equals"

    move-object v10, v6

    invoke-direct/range {v10 .. v16}, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;-><init>(Ljava/lang/String;ILjava/lang/String;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Ljava/lang/Class;[Ljava/lang/Class;)V

    sput-object v6, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->EQUALS:Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    new-instance v10, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    const-class v5, Ljava/lang/String;

    new-array v9, v9, [Ljava/lang/Class;

    const-string v1, "TO_STRING"

    const/4 v2, 0x2

    const-string v3, "toString"

    move-object v0, v10

    move-object v8, v6

    move-object v6, v9

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;-><init>(Ljava/lang/String;ILjava/lang/String;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Ljava/lang/Class;[Ljava/lang/Class;)V

    sput-object v10, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->TO_STRING:Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    filled-new-array {v7, v8, v10}, [Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    move-result-object v0

    sput-object v0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->$VALUES:[Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    return-void
.end method

.method private varargs constructor <init>(Ljava/lang/String;ILjava/lang/String;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Ljava/lang/Class;[Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->name:Ljava/lang/String;

    iput-object p4, p0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    invoke-static {p5}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p1

    iput-object p1, p0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->returnType:Lnet/bytebuddy/description/type/TypeDescription;

    new-instance p1, Lnet/bytebuddy/description/type/TypeList$ForLoadedTypes;

    invoke-direct {p1, p6}, Lnet/bytebuddy/description/type/TypeList$ForLoadedTypes;-><init>([Ljava/lang/Class;)V

    iput-object p1, p0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->arguments:Ljava/util/List;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;
    .locals 1

    const-class v0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;
    .locals 1

    sget-object v0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->$VALUES:[Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    invoke-virtual {v0}, [Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    return-object v0
.end method


# virtual methods
.method public appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;
    .locals 21

    move-object/from16 v0, p0

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v8

    invoke-interface {v8}, Lnet/bytebuddy/description/type/TypeDescription;->getRecordComponents()Lnet/bytebuddy/description/type/RecordComponentList;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v8

    invoke-interface {v8}, Lnet/bytebuddy/description/type/TypeDescription;->getRecordComponents()Lnet/bytebuddy/description/type/RecordComponentList;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lnet/bytebuddy/description/type/RecordComponentDescription$InDefinedShape;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    move-result v10

    if-lez v10, :cond_0

    const-string v10, ";"

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-interface {v9}, Lnet/bytebuddy/description/NamedElement;->getActualName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v10

    invoke-interface {v10}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    move-result-object v10

    invoke-interface {v9}, Lnet/bytebuddy/description/NamedElement;->getActualName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v9

    invoke-interface {v10, v9}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v9

    check-cast v9, Lnet/bytebuddy/description/field/FieldList;

    invoke-interface {v9}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    invoke-static {v9}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->ofGetter(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    move-result-object v9

    invoke-interface {v7, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v8, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Simple;

    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v9

    iget-object v10, v0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    new-instance v11, Lnet/bytebuddy/description/method/MethodDescription$Latent;

    sget-object v12, Lnet/bytebuddy/utility/JavaType;->OBJECT_METHODS:Lnet/bytebuddy/utility/JavaType;

    invoke-virtual {v12}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v12

    new-instance v13, Lnet/bytebuddy/description/method/MethodDescription$Token;

    const-class v14, Ljava/lang/Object;

    invoke-static {v14}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v14

    sget-object v15, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLES_LOOKUP:Lnet/bytebuddy/utility/JavaType;

    invoke-virtual {v15}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v15

    invoke-interface {v15}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v15

    const-class v16, Ljava/lang/String;

    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v17

    invoke-interface/range {v17 .. v17}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v17

    sget-object v18, Lnet/bytebuddy/utility/JavaType;->TYPE_DESCRIPTOR:Lnet/bytebuddy/utility/JavaType;

    invoke-virtual/range {v18 .. v18}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v18

    invoke-interface/range {v18 .. v18}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v18

    const-class v19, Ljava/lang/Class;

    invoke-static/range {v19 .. v19}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v19

    invoke-interface/range {v19 .. v19}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v19

    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v16

    invoke-interface/range {v16 .. v16}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v16

    sget-object v20, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLE:Lnet/bytebuddy/utility/JavaType;

    invoke-virtual/range {v20 .. v20}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Lnet/bytebuddy/description/type/TypeDescription$ArrayProjection;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v20

    invoke-interface/range {v20 .. v20}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v20

    const/4 v1, 0x6

    new-array v1, v1, [Lnet/bytebuddy/description/type/TypeDescription$Generic;

    aput-object v15, v1, v5

    aput-object v17, v1, v4

    aput-object v18, v1, v3

    aput-object v19, v1, v2

    const/4 v15, 0x4

    aput-object v16, v1, v15

    const/4 v15, 0x5

    aput-object v20, v1, v15

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v15, "bootstrap"

    const/16 v2, 0x9

    invoke-direct {v13, v15, v2, v14, v1}, Lnet/bytebuddy/description/method/MethodDescription$Token;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V

    invoke-direct {v11, v12, v13}, Lnet/bytebuddy/description/method/MethodDescription$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$Token;)V

    invoke-static {v11}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object v1

    iget-object v2, v0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->name:Ljava/lang/String;

    iget-object v11, v0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->returnType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v12

    iget-object v13, v0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->arguments:Ljava/util/List;

    invoke-static {v12, v13}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;

    move-result-object v12

    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v13

    invoke-static {v13}, Lnet/bytebuddy/utility/JavaConstant$Simple;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object v13

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object v6

    new-array v14, v3, [Lnet/bytebuddy/utility/JavaConstant;

    aput-object v13, v14, v5

    aput-object v6, v14, v4

    invoke-static {v14}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-static {v6, v7}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v1, v2, v11, v12, v6}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;->dynamic(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v1

    iget-object v2, v0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->returnType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-static {v2}, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v2

    const/4 v6, 0x4

    new-array v6, v6, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    aput-object v9, v6, v5

    aput-object v10, v6, v4

    aput-object v1, v6, v3

    const/4 v1, 0x3

    aput-object v2, v6, v1

    invoke-direct {v8, v6}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    return-object v8
.end method

.method public prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    return-object p1
.end method
