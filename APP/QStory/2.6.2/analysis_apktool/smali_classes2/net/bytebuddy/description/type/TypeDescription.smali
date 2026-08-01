.class public interface abstract Lnet/bytebuddy/description/type/TypeDescription;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/description/type/TypeDefinition;
.implements Lnet/bytebuddy/description/ByteCodeElement;
.implements Lnet/bytebuddy/description/TypeVariableSource;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/type/TypeDescription$SuperTypeLoading;,
        Lnet/bytebuddy/description/type/TypeDescription$ForPackageDescription;,
        Lnet/bytebuddy/description/type/TypeDescription$Latent;,
        Lnet/bytebuddy/description/type/TypeDescription$ArrayProjection;,
        Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;,
        Lnet/bytebuddy/description/type/TypeDescription$LazyProxy;,
        Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;,
        Lnet/bytebuddy/description/type/TypeDescription$Generic;
    }
.end annotation


# static fields
.field public static final ARRAY_INTERFACES:Lnet/bytebuddy/description/type/TypeList$Generic;

.field public static final CLASS:Lnet/bytebuddy/description/type/TypeDescription;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final OBJECT:Lnet/bytebuddy/description/type/TypeDescription;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final STRING:Lnet/bytebuddy/description/type/TypeDescription;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final THROWABLE:Lnet/bytebuddy/description/type/TypeDescription;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription;
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field

.field public static final VOID:Lnet/bytebuddy/description/type/TypeDescription;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$LazyProxy;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lnet/bytebuddy/description/type/TypeDescription;->OBJECT:Lnet/bytebuddy/description/type/TypeDescription;

    .line 8
    .line 9
    const-class v0, Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$LazyProxy;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/description/type/TypeDescription;->STRING:Lnet/bytebuddy/description/type/TypeDescription;

    .line 16
    .line 17
    const-class v0, Ljava/lang/Class;

    .line 18
    .line 19
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$LazyProxy;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lnet/bytebuddy/description/type/TypeDescription;->CLASS:Lnet/bytebuddy/description/type/TypeDescription;

    .line 24
    .line 25
    const-class v0, Ljava/lang/Throwable;

    .line 26
    .line 27
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$LazyProxy;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lnet/bytebuddy/description/type/TypeDescription;->THROWABLE:Lnet/bytebuddy/description/type/TypeDescription;

    .line 32
    .line 33
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$LazyProxy;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lnet/bytebuddy/description/type/TypeDescription;->VOID:Lnet/bytebuddy/description/type/TypeDescription;

    .line 40
    .line 41
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$Generic$ForLoadedTypes;

    .line 42
    .line 43
    const/4 v1, 0x2

    .line 44
    new-array v1, v1, [Ljava/lang/reflect/Type;

    .line 45
    .line 46
    const-class v2, Ljava/lang/Cloneable;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    aput-object v2, v1, v3

    .line 50
    .line 51
    const-class v2, Ljava/io/Serializable;

    .line 52
    .line 53
    const/4 v3, 0x1

    .line 54
    aput-object v2, v1, v3

    .line 55
    .line 56
    invoke-direct {v0, v1}, Lnet/bytebuddy/description/type/TypeList$Generic$ForLoadedTypes;-><init>([Ljava/lang/reflect/Type;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lnet/bytebuddy/description/type/TypeDescription;->ARRAY_INTERFACES:Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    sput-object v0, Lnet/bytebuddy/description/type/TypeDescription;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription;

    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public abstract asBoxed()Lnet/bytebuddy/description/type/TypeDescription;
.end method

.method public abstract asUnboxed()Lnet/bytebuddy/description/type/TypeDescription;
.end method

.method public abstract getActualModifiers(Z)I
.end method

.method public abstract getCanonicalName()Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method

.method public abstract getClassFileVersion()Lnet/bytebuddy/ClassFileVersion;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method

.method public abstract getComponentType()Lnet/bytebuddy/description/type/TypeDescription;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method

.method public abstract getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/field/FieldList<",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/method/MethodList<",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getDeclaredTypes()Lnet/bytebuddy/description/type/TypeList;
.end method

.method public abstract getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method

.method public abstract getDefaultValue()Ljava/lang/Object;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method

.method public abstract getEnclosingMethod()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method

.method public abstract getEnclosingType()Lnet/bytebuddy/description/type/TypeDescription;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method

.method public abstract getInheritedAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
.end method

.method public abstract getInnerClassCount()I
.end method

.method public abstract getLongSimpleName()Ljava/lang/String;
.end method

.method public abstract getNestHost()Lnet/bytebuddy/description/type/TypeDescription;
.end method

.method public abstract getNestMembers()Lnet/bytebuddy/description/type/TypeList;
.end method

.method public abstract getPackage()Lnet/bytebuddy/description/type/PackageDescription;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method

.method public abstract getPermittedSubtypes()Lnet/bytebuddy/description/type/TypeList;
.end method

.method public abstract getRecordComponents()Lnet/bytebuddy/description/type/RecordComponentList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/type/RecordComponentList<",
            "Lnet/bytebuddy/description/type/RecordComponentDescription$InDefinedShape;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getSimpleName()Ljava/lang/String;
.end method

.method public abstract isAnnotationReturnType()Z
.end method

.method public abstract isAnnotationValue()Z
.end method

.method public abstract isAnnotationValue(Ljava/lang/Object;)Z
.end method

.method public abstract isAnonymousType()Z
.end method

.method public abstract isAssignableFrom(Ljava/lang/Class;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation
.end method

.method public abstract isAssignableFrom(Lnet/bytebuddy/description/type/TypeDescription;)Z
.end method

.method public abstract isAssignableTo(Ljava/lang/Class;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation
.end method

.method public abstract isAssignableTo(Lnet/bytebuddy/description/type/TypeDescription;)Z
.end method

.method public abstract isCompileTimeConstant()Z
.end method

.method public abstract isInHierarchyWith(Ljava/lang/Class;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation
.end method

.method public abstract isInHierarchyWith(Lnet/bytebuddy/description/type/TypeDescription;)Z
.end method

.method public abstract isInnerClass()Z
.end method

.method public abstract isInstance(Ljava/lang/Object;)Z
.end method

.method public abstract isLocalType()Z
.end method

.method public abstract isMemberType()Z
.end method

.method public abstract isModuleType()Z
.end method

.method public abstract isNestHost()Z
.end method

.method public abstract isNestMateOf(Ljava/lang/Class;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation
.end method

.method public abstract isNestMateOf(Lnet/bytebuddy/description/type/TypeDescription;)Z
.end method

.method public abstract isNestedClass()Z
.end method

.method public abstract isPackageType()Z
.end method

.method public abstract isPrimitiveWrapper()Z
.end method

.method public abstract isSamePackage(Lnet/bytebuddy/description/type/TypeDescription;)Z
.end method

.method public abstract isSealed()Z
.end method

.method public abstract toModuleDescription()Lnet/bytebuddy/description/module/ModuleDescription;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method
