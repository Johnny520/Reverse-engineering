.class public final enum Lnet/bytebuddy/utility/JavaType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/utility/JavaType$LatentTypeWithSimpleName;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/utility/JavaType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/utility/JavaType;

.field public static final enum ACCESS_CONTROL_CONTEXT:Lnet/bytebuddy/utility/JavaType;

.field public static final enum CALL_SITE:Lnet/bytebuddy/utility/JavaType;

.field public static final enum CLASS_DESCRIPTION:Lnet/bytebuddy/utility/JavaType;

.field public static final enum CONSTABLE:Lnet/bytebuddy/utility/JavaType;

.field public static final enum CONSTANT_BOOTSTRAPS:Lnet/bytebuddy/utility/JavaType;

.field public static final enum CONSTANT_DESCRIPTION:Lnet/bytebuddy/utility/JavaType;

.field public static final enum DIRECT_METHOD_HANDLE_DESCRIPTION:Lnet/bytebuddy/utility/JavaType;

.field public static final enum DYNAMIC_CONSTANT_DESCRIPTION:Lnet/bytebuddy/utility/JavaType;

.field public static final enum EXECUTABLE:Lnet/bytebuddy/utility/JavaType;

.field public static final enum METHOD_HANDLE:Lnet/bytebuddy/utility/JavaType;

.field public static final enum METHOD_HANDLES:Lnet/bytebuddy/utility/JavaType;

.field public static final enum METHOD_HANDLES_LOOKUP:Lnet/bytebuddy/utility/JavaType;

.field public static final enum METHOD_HANDLE_DESCRIPTION:Lnet/bytebuddy/utility/JavaType;

.field public static final enum METHOD_TYPE:Lnet/bytebuddy/utility/JavaType;

.field public static final enum METHOD_TYPE_DESCRIPTION:Lnet/bytebuddy/utility/JavaType;

.field public static final enum MODULE:Lnet/bytebuddy/utility/JavaType;

.field public static final enum OBJECT_METHODS:Lnet/bytebuddy/utility/JavaType;

.field public static final enum PARAMETER:Lnet/bytebuddy/utility/JavaType;

.field public static final enum RECORD:Lnet/bytebuddy/utility/JavaType;

.field public static final enum TYPE_DESCRIPTOR:Lnet/bytebuddy/utility/JavaType;

.field public static final enum TYPE_DESCRIPTOR_OF_FIELD:Lnet/bytebuddy/utility/JavaType;

.field public static final enum TYPE_DESCRIPTOR_OF_METHOD:Lnet/bytebuddy/utility/JavaType;

.field public static final enum VAR_HANDLE:Lnet/bytebuddy/utility/JavaType;


# instance fields
.field private transient synthetic available:Ljava/lang/Boolean;

.field private transient synthetic loaded:Ljava/lang/Class;

.field private final typeDescription:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method static constructor <clinit>()V
    .locals 47

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    new-instance v26, Lnet/bytebuddy/utility/JavaType;

    move-object/from16 v10, v26

    sget-object v33, Lnet/bytebuddy/description/type/TypeDescription;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription;

    new-array v9, v2, [Lnet/bytebuddy/description/type/TypeDefinition;

    const/4 v5, 0x0

    const/16 v7, 0x601

    const-string v4, "CONSTABLE"

    const-string v6, "java.lang.constant.Constable"

    move-object/from16 v3, v26

    move-object/from16 v8, v33

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    sput-object v26, Lnet/bytebuddy/utility/JavaType;->CONSTABLE:Lnet/bytebuddy/utility/JavaType;

    new-instance v14, Lnet/bytebuddy/utility/JavaType;

    move-object v11, v14

    new-array v9, v2, [Lnet/bytebuddy/description/type/TypeDefinition;

    const/4 v5, 0x1

    const-string v4, "TYPE_DESCRIPTOR"

    const-string v6, "java.lang.invoke.TypeDescriptor"

    move-object v3, v14

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    sput-object v14, Lnet/bytebuddy/utility/JavaType;->TYPE_DESCRIPTOR:Lnet/bytebuddy/utility/JavaType;

    new-instance v17, Lnet/bytebuddy/utility/JavaType;

    move-object/from16 v12, v17

    invoke-virtual {v14}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    new-array v9, v1, [Lnet/bytebuddy/description/type/TypeDefinition;

    aput-object v3, v9, v2

    const/4 v5, 0x2

    const-string v4, "TYPE_DESCRIPTOR_OF_FIELD"

    const-string v6, "java.lang.invoke.TypeDescriptor$OfField"

    move-object/from16 v3, v17

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    sput-object v17, Lnet/bytebuddy/utility/JavaType;->TYPE_DESCRIPTOR_OF_FIELD:Lnet/bytebuddy/utility/JavaType;

    new-instance v23, Lnet/bytebuddy/utility/JavaType;

    move-object/from16 v13, v23

    invoke-virtual {v14}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    new-array v9, v1, [Lnet/bytebuddy/description/type/TypeDefinition;

    aput-object v3, v9, v2

    const/4 v5, 0x3

    const-string v4, "TYPE_DESCRIPTOR_OF_METHOD"

    const-string v6, "java.lang.invoke.TypeDescriptor$OfMethod"

    move-object/from16 v3, v23

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    sput-object v23, Lnet/bytebuddy/utility/JavaType;->TYPE_DESCRIPTOR_OF_METHOD:Lnet/bytebuddy/utility/JavaType;

    new-instance v19, Lnet/bytebuddy/utility/JavaType;

    move-object/from16 v14, v19

    new-array v9, v2, [Lnet/bytebuddy/description/type/TypeDefinition;

    const/4 v5, 0x4

    const-string v4, "CONSTANT_DESCRIPTION"

    const-string v6, "java.lang.constant.ConstantDesc"

    move-object/from16 v3, v19

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    sput-object v19, Lnet/bytebuddy/utility/JavaType;->CONSTANT_DESCRIPTION:Lnet/bytebuddy/utility/JavaType;

    new-instance v3, Lnet/bytebuddy/utility/JavaType;

    move-object v15, v3

    const-class v27, Ljava/lang/Object;

    invoke-static/range {v27 .. v27}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v39

    invoke-virtual/range {v19 .. v19}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v4

    new-array v5, v1, [Lnet/bytebuddy/description/type/TypeDefinition;

    aput-object v4, v5, v2

    const/16 v36, 0x5

    const/16 v38, 0x401

    const-string v35, "DYNAMIC_CONSTANT_DESCRIPTION"

    const-string v37, "java.lang.constant.DynamicConstantDesc"

    move-object/from16 v34, v3

    move-object/from16 v40, v5

    invoke-direct/range {v34 .. v40}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    sput-object v3, Lnet/bytebuddy/utility/JavaType;->DYNAMIC_CONSTANT_DESCRIPTION:Lnet/bytebuddy/utility/JavaType;

    new-instance v18, Lnet/bytebuddy/utility/JavaType;

    move-object/from16 v16, v18

    invoke-virtual/range {v19 .. v19}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    invoke-virtual/range {v17 .. v17}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v4

    new-array v9, v0, [Lnet/bytebuddy/description/type/TypeDefinition;

    aput-object v3, v9, v2

    aput-object v4, v9, v1

    const/4 v5, 0x6

    const-string v4, "CLASS_DESCRIPTION"

    const-string v6, "java.lang.constant.ClassDesc"

    move-object/from16 v3, v18

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    sput-object v18, Lnet/bytebuddy/utility/JavaType;->CLASS_DESCRIPTION:Lnet/bytebuddy/utility/JavaType;

    new-instance v18, Lnet/bytebuddy/utility/JavaType;

    move-object/from16 v17, v18

    invoke-virtual/range {v19 .. v19}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    invoke-virtual/range {v23 .. v23}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v4

    new-array v9, v0, [Lnet/bytebuddy/description/type/TypeDefinition;

    aput-object v3, v9, v2

    aput-object v4, v9, v1

    const/4 v5, 0x7

    const-string v4, "METHOD_TYPE_DESCRIPTION"

    const-string v6, "java.lang.constant.MethodTypeDesc"

    move-object/from16 v3, v18

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    sput-object v18, Lnet/bytebuddy/utility/JavaType;->METHOD_TYPE_DESCRIPTION:Lnet/bytebuddy/utility/JavaType;

    new-instance v20, Lnet/bytebuddy/utility/JavaType;

    move-object/from16 v18, v20

    invoke-virtual/range {v19 .. v19}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    new-array v9, v1, [Lnet/bytebuddy/description/type/TypeDefinition;

    aput-object v3, v9, v2

    const/16 v5, 0x8

    const-string v4, "METHOD_HANDLE_DESCRIPTION"

    const-string v6, "java.lang.constant.MethodHandleDesc"

    move-object/from16 v3, v20

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    sput-object v20, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLE_DESCRIPTION:Lnet/bytebuddy/utility/JavaType;

    new-instance v21, Lnet/bytebuddy/utility/JavaType;

    move-object/from16 v19, v21

    invoke-virtual/range {v20 .. v20}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    new-array v9, v1, [Lnet/bytebuddy/description/type/TypeDefinition;

    aput-object v3, v9, v2

    const/16 v5, 0x9

    const-string v4, "DIRECT_METHOD_HANDLE_DESCRIPTION"

    const-string v6, "java.lang.constant.DirectMethodHandleDesc"

    move-object/from16 v3, v21

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    sput-object v21, Lnet/bytebuddy/utility/JavaType;->DIRECT_METHOD_HANDLE_DESCRIPTION:Lnet/bytebuddy/utility/JavaType;

    new-instance v3, Lnet/bytebuddy/utility/JavaType;

    move-object/from16 v20, v3

    invoke-static/range {v27 .. v27}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v39

    invoke-virtual/range {v26 .. v26}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v4

    new-array v5, v1, [Lnet/bytebuddy/description/type/TypeDefinition;

    aput-object v4, v5, v2

    const/16 v36, 0xa

    const-string v35, "METHOD_HANDLE"

    const-string v37, "java.lang.invoke.MethodHandle"

    move-object/from16 v34, v3

    move-object/from16 v40, v5

    invoke-direct/range {v34 .. v40}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    sput-object v3, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLE:Lnet/bytebuddy/utility/JavaType;

    new-instance v3, Lnet/bytebuddy/utility/JavaType;

    move-object/from16 v21, v3

    const-class v45, Ljava/lang/Object;

    new-array v4, v2, [Ljava/lang/reflect/Type;

    const/16 v42, 0xb

    const/16 v44, 0x1

    const-string v41, "METHOD_HANDLES"

    const-string v43, "java.lang.invoke.MethodHandles"

    move-object/from16 v40, v3

    move-object/from16 v46, v4

    invoke-direct/range {v40 .. v46}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    sput-object v3, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLES:Lnet/bytebuddy/utility/JavaType;

    new-instance v3, Lnet/bytebuddy/utility/JavaType;

    move-object/from16 v22, v3

    invoke-static/range {v27 .. v27}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v39

    invoke-virtual/range {v26 .. v26}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v4

    invoke-virtual/range {v23 .. v23}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v5

    const-class v6, Ljava/io/Serializable;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    const/4 v7, 0x3

    new-array v7, v7, [Lnet/bytebuddy/description/type/TypeDefinition;

    aput-object v4, v7, v2

    aput-object v5, v7, v1

    aput-object v6, v7, v0

    const/16 v36, 0xc

    const/16 v38, 0x11

    const-string v35, "METHOD_TYPE"

    const-string v37, "java.lang.invoke.MethodType"

    move-object/from16 v34, v3

    move-object/from16 v40, v7

    invoke-direct/range {v34 .. v40}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    sput-object v3, Lnet/bytebuddy/utility/JavaType;->METHOD_TYPE:Lnet/bytebuddy/utility/JavaType;

    new-instance v3, Lnet/bytebuddy/utility/JavaType;

    move-object/from16 v23, v3

    const-class v45, Ljava/lang/Object;

    new-array v4, v2, [Ljava/lang/reflect/Type;

    const/16 v42, 0xd

    const/16 v44, 0x19

    const-string v41, "METHOD_HANDLES_LOOKUP"

    const-string v43, "java.lang.invoke.MethodHandles$Lookup"

    move-object/from16 v40, v3

    move-object/from16 v46, v4

    invoke-direct/range {v40 .. v46}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    sput-object v3, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLES_LOOKUP:Lnet/bytebuddy/utility/JavaType;

    new-instance v3, Lnet/bytebuddy/utility/JavaType;

    move-object/from16 v24, v3

    const-class v39, Ljava/lang/Object;

    new-array v4, v2, [Ljava/lang/reflect/Type;

    const/16 v36, 0xe

    const/16 v38, 0x401

    const-string v35, "CALL_SITE"

    const-string v37, "java.lang.invoke.CallSite"

    move-object/from16 v34, v3

    move-object/from16 v40, v4

    invoke-direct/range {v34 .. v40}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    sput-object v3, Lnet/bytebuddy/utility/JavaType;->CALL_SITE:Lnet/bytebuddy/utility/JavaType;

    new-instance v3, Lnet/bytebuddy/utility/JavaType;

    move-object/from16 v25, v3

    invoke-static/range {v27 .. v27}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v45

    invoke-virtual/range {v26 .. v26}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v4

    new-array v5, v1, [Lnet/bytebuddy/description/type/TypeDefinition;

    aput-object v4, v5, v2

    const/16 v42, 0xf

    const/16 v44, 0x401

    const-string v41, "VAR_HANDLE"

    const-string v43, "java.lang.invoke.VarHandle"

    move-object/from16 v40, v3

    move-object/from16 v46, v5

    invoke-direct/range {v40 .. v46}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    sput-object v3, Lnet/bytebuddy/utility/JavaType;->VAR_HANDLE:Lnet/bytebuddy/utility/JavaType;

    new-instance v3, Lnet/bytebuddy/utility/JavaType;

    move-object/from16 v26, v3

    const-class v39, Ljava/lang/Object;

    const-class v4, Ljava/lang/reflect/AnnotatedElement;

    new-array v5, v1, [Ljava/lang/reflect/Type;

    aput-object v4, v5, v2

    const/16 v36, 0x10

    const/16 v38, 0x11

    const-string v35, "PARAMETER"

    const-string v37, "java.lang.reflect.Parameter"

    move-object/from16 v34, v3

    move-object/from16 v40, v5

    invoke-direct/range {v34 .. v40}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    sput-object v3, Lnet/bytebuddy/utility/JavaType;->PARAMETER:Lnet/bytebuddy/utility/JavaType;

    new-instance v3, Lnet/bytebuddy/utility/JavaType;

    move-object/from16 v27, v3

    new-array v0, v0, [Ljava/lang/reflect/Type;

    const-class v5, Ljava/lang/reflect/Member;

    aput-object v5, v0, v2

    const-class v5, Ljava/lang/reflect/GenericDeclaration;

    aput-object v5, v0, v1

    const/16 v42, 0x11

    const-string v41, "EXECUTABLE"

    const-string v43, "java.lang.reflect.Executable"

    const-class v45, Ljava/lang/reflect/AccessibleObject;

    move-object/from16 v40, v3

    move-object/from16 v46, v0

    invoke-direct/range {v40 .. v46}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    sput-object v3, Lnet/bytebuddy/utility/JavaType;->EXECUTABLE:Lnet/bytebuddy/utility/JavaType;

    new-instance v0, Lnet/bytebuddy/utility/JavaType;

    move-object/from16 v28, v0

    const-class v39, Ljava/lang/Object;

    new-array v1, v1, [Ljava/lang/reflect/Type;

    aput-object v4, v1, v2

    const/16 v36, 0x12

    const-string v35, "MODULE"

    const-string v37, "java.lang.Module"

    move-object/from16 v34, v0

    move-object/from16 v40, v1

    invoke-direct/range {v34 .. v40}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    sput-object v0, Lnet/bytebuddy/utility/JavaType;->MODULE:Lnet/bytebuddy/utility/JavaType;

    new-instance v0, Lnet/bytebuddy/utility/JavaType;

    move-object/from16 v29, v0

    const-class v8, Ljava/lang/Object;

    new-array v9, v2, [Ljava/lang/reflect/Type;

    const/16 v5, 0x13

    const/16 v7, 0x11

    const-string v4, "CONSTANT_BOOTSTRAPS"

    const-string v6, "java.lang.invoke.ConstantBootstraps"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    sput-object v0, Lnet/bytebuddy/utility/JavaType;->CONSTANT_BOOTSTRAPS:Lnet/bytebuddy/utility/JavaType;

    new-instance v0, Lnet/bytebuddy/utility/JavaType;

    move-object/from16 v30, v0

    const-class v39, Ljava/lang/Object;

    new-array v1, v2, [Ljava/lang/reflect/Type;

    const/16 v36, 0x14

    const/16 v38, 0x401

    const-string v35, "RECORD"

    const-string v37, "java.lang.Record"

    move-object/from16 v34, v0

    move-object/from16 v40, v1

    invoke-direct/range {v34 .. v40}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    sput-object v0, Lnet/bytebuddy/utility/JavaType;->RECORD:Lnet/bytebuddy/utility/JavaType;

    new-instance v0, Lnet/bytebuddy/utility/JavaType;

    move-object/from16 v31, v0

    const-class v8, Ljava/lang/Object;

    new-array v9, v2, [Ljava/lang/reflect/Type;

    const/16 v5, 0x15

    const/4 v7, 0x1

    const-string v4, "OBJECT_METHODS"

    const-string v6, "java.lang.runtime.ObjectMethods"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    sput-object v0, Lnet/bytebuddy/utility/JavaType;->OBJECT_METHODS:Lnet/bytebuddy/utility/JavaType;

    new-instance v0, Lnet/bytebuddy/utility/JavaType;

    move-object/from16 v32, v0

    const/16 v7, 0x11

    new-array v9, v2, [Lnet/bytebuddy/description/type/TypeDefinition;

    const/16 v5, 0x16

    const-string v4, "ACCESS_CONTROL_CONTEXT"

    const-string v6, "java.security.AccessControlContext"

    move-object v3, v0

    move-object/from16 v8, v33

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    sput-object v0, Lnet/bytebuddy/utility/JavaType;->ACCESS_CONTROL_CONTEXT:Lnet/bytebuddy/utility/JavaType;

    filled-new-array/range {v10 .. v32}, [Lnet/bytebuddy/utility/JavaType;

    move-result-object v0

    sput-object v0, Lnet/bytebuddy/utility/JavaType;->$VALUES:[Lnet/bytebuddy/utility/JavaType;

    return-void
.end method

.method private varargs constructor <init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V
    .locals 7
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/reflect/Type;",
            ")V"
        }
    .end annotation

    if-nez p5, :cond_0

    .line 1
    sget-object p5, Lnet/bytebuddy/description/type/TypeDescription$Generic;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    :goto_0
    move-object v5, p5

    goto :goto_1

    .line 2
    :cond_0
    invoke-static {p5}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p5

    goto :goto_0

    :goto_1
    new-instance v6, Lnet/bytebuddy/description/type/TypeList$Generic$ForLoadedTypes;

    invoke-direct {v6, p6}, Lnet/bytebuddy/description/type/TypeList$Generic$ForLoadedTypes;-><init>([Ljava/lang/reflect/Type;)V

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    .line 3
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeList$Generic;)V

    return-void
.end method

.method private varargs constructor <init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V
    .locals 7
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            "[",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ")V"
        }
    .end annotation

    if-nez p5, :cond_0

    .line 4
    sget-object p5, Lnet/bytebuddy/description/type/TypeDescription$Generic;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    :goto_0
    move-object v5, p5

    goto :goto_1

    .line 5
    :cond_0
    invoke-interface {p5}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p5

    goto :goto_0

    :goto_1
    new-instance v6, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;

    invoke-direct {v6, p6}, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;-><init>([Lnet/bytebuddy/description/type/TypeDefinition;)V

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    .line 6
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeList$Generic;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeList$Generic;)V
    .locals 0
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Lnet/bytebuddy/description/type/TypeList$Generic;",
            ")V"
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 8
    new-instance p1, Lnet/bytebuddy/utility/JavaType$LatentTypeWithSimpleName;

    invoke-direct {p1, p3, p4, p5, p6}, Lnet/bytebuddy/utility/JavaType$LatentTypeWithSimpleName;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V

    iput-object p1, p0, Lnet/bytebuddy/utility/JavaType;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    return-void
.end method

.method private doIsAvailable()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;
        value = "available"
    .end annotation

    iget-object v0, p0, Lnet/bytebuddy/utility/JavaType;->available:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lnet/bytebuddy/utility/JavaType;->load()Ljava/lang/Class;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lnet/bytebuddy/utility/JavaType;->available:Ljava/lang/Boolean;

    goto :goto_1

    :cond_1
    iput-object v0, p0, Lnet/bytebuddy/utility/JavaType;->available:Ljava/lang/Boolean;

    :goto_1
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/utility/JavaType;
    .locals 1

    const-class v0, Lnet/bytebuddy/utility/JavaType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/utility/JavaType;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/utility/JavaType;
    .locals 1

    sget-object v0, Lnet/bytebuddy/utility/JavaType;->$VALUES:[Lnet/bytebuddy/utility/JavaType;

    invoke-virtual {v0}, [Lnet/bytebuddy/utility/JavaType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/utility/JavaType;

    return-object v0
.end method


# virtual methods
.method public getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 1

    iget-object v0, p0, Lnet/bytebuddy/utility/JavaType;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    return-object v0
.end method

.method public isAvailable()Z
    .locals 1

    invoke-direct {p0}, Lnet/bytebuddy/utility/JavaType;->doIsAvailable()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isInstance(Ljava/lang/Object;)Z
    .locals 2

    invoke-virtual {p0}, Lnet/bytebuddy/utility/JavaType;->isAvailable()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lnet/bytebuddy/utility/JavaType;->load()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    return v1
.end method

.method public load()Ljava/lang/Class;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;
        value = "loaded"
    .end annotation

    iget-object v0, p0, Lnet/bytebuddy/utility/JavaType;->loaded:Ljava/lang/Class;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/utility/JavaType;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-interface {v0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    sget-object v2, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;->BOOTSTRAP_LOADER:Ljava/lang/ClassLoader;

    invoke-static {v0, v1, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lnet/bytebuddy/utility/JavaType;->loaded:Ljava/lang/Class;

    goto :goto_1

    :cond_1
    iput-object v0, p0, Lnet/bytebuddy/utility/JavaType;->loaded:Ljava/lang/Class;

    :goto_1
    return-object v0
.end method

.method public loadAsDescription()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    invoke-virtual {p0}, Lnet/bytebuddy/utility/JavaType;->load()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    return-object v0
.end method
