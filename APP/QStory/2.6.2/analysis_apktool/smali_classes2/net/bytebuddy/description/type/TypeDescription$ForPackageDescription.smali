.class public Lnet/bytebuddy/description/type/TypeDescription$ForPackageDescription;
.super Lnet/bytebuddy/description/type/TypeDescription$AbstractBase$OfSimpleType;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/type/TypeDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForPackageDescription"
.end annotation


# instance fields
.field private final packageDescription:Lnet/bytebuddy/description/type/PackageDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/PackageDescription;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase$OfSimpleType;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/type/TypeDescription$ForPackageDescription;->packageDescription:Lnet/bytebuddy/description/type/PackageDescription;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForPackageDescription;->packageDescription:Lnet/bytebuddy/description/type/PackageDescription;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/field/FieldList<",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, Lnet/bytebuddy/description/field/FieldList$Empty;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/description/field/FieldList$Empty;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/method/MethodList<",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, Lnet/bytebuddy/description/method/MethodList$Empty;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/description/method/MethodList$Empty;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public getDeclaredTypes()Lnet/bytebuddy/description/type/TypeList;
    .locals 0

    .line 1
    new-instance p0, Lnet/bytebuddy/description/type/TypeList$Empty;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeList$Empty;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public bridge synthetic getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForPackageDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 6
    sget-object p0, Lnet/bytebuddy/description/type/TypeDescription;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription;

    return-object p0
.end method

.method public getEnclosingMethod()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    sget-object p0, Lnet/bytebuddy/description/method/MethodDescription;->UNDEFINED:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    return-object p0
.end method

.method public getEnclosingType()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    sget-object p0, Lnet/bytebuddy/description/type/TypeDescription;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    return-object p0
.end method

.method public getInterfaces()Lnet/bytebuddy/description/type/TypeList$Generic;
    .locals 0

    .line 1
    new-instance p0, Lnet/bytebuddy/description/type/TypeList$Generic$Empty;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeList$Generic$Empty;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public getModifiers()I
    .locals 0

    .line 1
    const/16 p0, 0x1600

    .line 2
    .line 3
    return p0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForPackageDescription;->packageDescription:Lnet/bytebuddy/description/type/PackageDescription;

    .line 7
    .line 8
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p0, ".package-info"

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public getNestHost()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    return-object p0
.end method

.method public getNestMembers()Lnet/bytebuddy/description/type/TypeList;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$Explicit;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-array v1, v1, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object p0, v1, v2

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lnet/bytebuddy/description/type/TypeList$Explicit;-><init>([Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public getPackage()Lnet/bytebuddy/description/type/PackageDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForPackageDescription;->packageDescription:Lnet/bytebuddy/description/type/PackageDescription;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPermittedSubtypes()Lnet/bytebuddy/description/type/TypeList;
    .locals 0

    .line 1
    new-instance p0, Lnet/bytebuddy/description/type/TypeList$Empty;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeList$Empty;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public getRecordComponents()Lnet/bytebuddy/description/type/RecordComponentList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/type/RecordComponentList<",
            "Lnet/bytebuddy/description/type/RecordComponentDescription$InDefinedShape;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, Lnet/bytebuddy/description/type/RecordComponentList$Empty;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/description/type/RecordComponentList$Empty;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    const-class p0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getTypeVariables()Lnet/bytebuddy/description/type/TypeList$Generic;
    .locals 0

    .line 1
    new-instance p0, Lnet/bytebuddy/description/type/TypeList$Generic$Empty;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeList$Generic$Empty;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public isAnonymousType()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public isLocalType()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public isRecord()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public toModuleDescription()Lnet/bytebuddy/description/module/ModuleDescription;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    sget-object p0, Lnet/bytebuddy/description/module/ModuleDescription;->UNDEFINED:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 2
    .line 3
    return-object p0
.end method
