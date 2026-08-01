.class public Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;
.super Lnet/bytebuddy/description/type/TypeDescription$AbstractBase$OfSimpleType;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LazyTypeDescription"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyRecordComponentDescription;,
        Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyMethodDescription;,
        Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyFieldDescription;,
        Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyModuleDescription;,
        Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TokenizedGenericType;,
        Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyNestMemberList;,
        Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyTypeList;,
        Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyPackageDescription;,
        Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue;,
        Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationDescription;,
        Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;,
        Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;,
        Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$FieldToken;,
        Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;,
        Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;,
        Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken;,
        Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment;,
        Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentTokenList;,
        Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodTokenList;,
        Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$FieldTokenList;
    }
.end annotation


# static fields
.field private static final NO_TYPE:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field


# instance fields
.field private final actualModifiers:I

.field private final annotationTokens:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;"
        }
    .end annotation
.end field

.field private final anonymousType:Z

.field private final classFileVersion:Lnet/bytebuddy/ClassFileVersion;

.field private final declaredTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final declaringTypeName:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final fieldTokens:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$FieldToken;",
            ">;"
        }
    .end annotation
.end field

.field private final genericSignature:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final interfaceAnnotationTokens:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private final interfaceTypeDescriptors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final methodTokens:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;",
            ">;"
        }
    .end annotation
.end field

.field private final modifiers:I

.field private final moduleToken:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final name:Ljava/lang/String;

.field private final nestHost:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final nestMembers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final permittedSubclasses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final recordComponentTokens:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;",
            ">;"
        }
    .end annotation
.end field

.field private final signatureResolution:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForType;

.field private final superClassAnnotationTokens:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;>;"
        }
    .end annotation
.end field

.field private final superClassDescriptor:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final typeContainment:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment;

.field private final typePool:Lnet/bytebuddy/pool/TypePool;

.field private final typeVariableAnnotationTokens:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private final typeVariableBoundsAnnotationTokens:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;>;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/pool/TypePool;IILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/ClassFileVersion;)V
    .locals 0
    .param p5    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p6    # [Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p19    # Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/pool/TypePool;",
            "II",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;>;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;>;>;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;>;>;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;>;>;>;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$FieldToken;",
            ">;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;",
            ">;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lnet/bytebuddy/ClassFileVersion;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase$OfSimpleType;-><init>()V

    .line 2
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->typePool:Lnet/bytebuddy/pool/TypePool;

    and-int/lit8 p1, p2, -0x21

    .line 3
    iput p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->actualModifiers:I

    const p1, -0x20021

    and-int/2addr p1, p3

    .line 4
    iput p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->modifiers:I

    .line 5
    invoke-static {p4}, Lnet/bytebuddy/jar/asm/Type;->getObjectType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object p1

    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->name:Ljava/lang/String;

    if-nez p5, :cond_0

    .line 6
    sget-object p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->NO_TYPE:Ljava/lang/String;

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {p5}, Lnet/bytebuddy/jar/asm/Type;->getObjectType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object p1

    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Type;->getDescriptor()Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->superClassDescriptor:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->genericSignature:Ljava/lang/String;

    .line 9
    sget-boolean p1, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->RAW_TYPES:Z

    if-eqz p1, :cond_1

    sget-object p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw;->INSTANCE:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw;

    goto :goto_1

    .line 10
    :cond_1
    invoke-static {p7}, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$ForSignature$OfType;->extract(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForType;

    move-result-object p1

    :goto_1
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->signatureResolution:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForType;

    if-nez p6, :cond_2

    .line 11
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->interfaceTypeDescriptors:Ljava/util/List;

    goto :goto_3

    .line 12
    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    array-length p2, p6

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->interfaceTypeDescriptors:Ljava/util/List;

    .line 13
    array-length p1, p6

    const/4 p2, 0x0

    :goto_2
    if-ge p2, p1, :cond_3

    aget-object p3, p6, p2

    .line 14
    iget-object p4, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->interfaceTypeDescriptors:Ljava/util/List;

    invoke-static {p3}, Lnet/bytebuddy/jar/asm/Type;->getObjectType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object p3

    invoke-virtual {p3}, Lnet/bytebuddy/jar/asm/Type;->getDescriptor()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p4, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    .line 15
    :cond_3
    :goto_3
    iput-object p8, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->typeContainment:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment;

    if-nez p9, :cond_4

    .line 16
    sget-object p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->NO_TYPE:Ljava/lang/String;

    goto :goto_4

    :cond_4
    const/16 p1, 0x2f

    const/16 p2, 0x2e

    .line 17
    invoke-virtual {p9, p1, p2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    :goto_4
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->declaringTypeName:Ljava/lang/String;

    .line 18
    iput-object p10, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->declaredTypes:Ljava/util/List;

    .line 19
    iput-boolean p11, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->anonymousType:Z

    if-nez p12, :cond_5

    .line 20
    sget-object p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->NO_TYPE:Ljava/lang/String;

    goto :goto_5

    .line 21
    :cond_5
    invoke-static {p12}, Lnet/bytebuddy/jar/asm/Type;->getObjectType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object p1

    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    move-result-object p1

    :goto_5
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->nestHost:Ljava/lang/String;

    .line 22
    new-instance p1, Ljava/util/ArrayList;

    invoke-interface {p13}, Ljava/util/List;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->nestMembers:Ljava/util/List;

    .line 23
    invoke-interface {p13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 24
    iget-object p3, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->nestMembers:Ljava/util/List;

    invoke-static {p2}, Lnet/bytebuddy/jar/asm/Type;->getObjectType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object p2

    invoke-virtual {p2}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 25
    :cond_6
    iput-object p14, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->superClassAnnotationTokens:Ljava/util/Map;

    .line 26
    iput-object p15, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->interfaceAnnotationTokens:Ljava/util/Map;

    move-object/from16 p1, p16

    .line 27
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->typeVariableAnnotationTokens:Ljava/util/Map;

    move-object/from16 p1, p17

    .line 28
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->typeVariableBoundsAnnotationTokens:Ljava/util/Map;

    move-object/from16 p1, p18

    .line 29
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->annotationTokens:Ljava/util/List;

    move-object/from16 p1, p19

    .line 30
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->moduleToken:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;

    move-object/from16 p1, p20

    .line 31
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->fieldTokens:Ljava/util/List;

    move-object/from16 p1, p21

    .line 32
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->methodTokens:Ljava/util/List;

    move-object/from16 p1, p22

    .line 33
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->recordComponentTokens:Ljava/util/List;

    .line 34
    new-instance p1, Ljava/util/ArrayList;

    invoke-interface/range {p23 .. p23}, Ljava/util/List;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->permittedSubclasses:Ljava/util/List;

    .line 35
    invoke-interface/range {p23 .. p23}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 36
    iget-object p3, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->permittedSubclasses:Ljava/util/List;

    invoke-static {p2}, Lnet/bytebuddy/jar/asm/Type;->getObjectType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object p2

    invoke-virtual {p2}, Lnet/bytebuddy/jar/asm/Type;->getDescriptor()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_7
    move-object/from16 p2, p24

    .line 37
    iput-object p2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    return-void
.end method

.method public static synthetic access$1400(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->fieldTokens:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1600(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->methodTokens:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1800(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->recordComponentTokens:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$3000(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)Lnet/bytebuddy/pool/TypePool;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$3100(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->annotationTokens:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public getActualModifiers(Z)I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->actualModifiers:I

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    or-int/lit8 p0, p0, 0x20

    .line 6
    .line 7
    :cond_0
    return p0
.end method

.method public getClassFileVersion()Lnet/bytebuddy/ClassFileVersion;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->annotationTokens:Ljava/util/List;

    .line 4
    .line 5
    invoke-static {v0, p0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationDescription;->asList(Lnet/bytebuddy/pool/TypePool;Ljava/util/List;)Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/field/FieldList<",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$FieldTokenList;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$FieldTokenList;-><init>(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/method/MethodList<",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodTokenList;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodTokenList;-><init>(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public getDeclaredTypes()Lnet/bytebuddy/description/type/TypeList;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyTypeList;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->declaredTypes:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyTypeList;-><init>(Lnet/bytebuddy/pool/TypePool;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 19
    invoke-virtual {p0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p0

    return-object p0
.end method

.method public getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->declaringTypeName:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lnet/bytebuddy/description/type/TypeDescription;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 9
    .line 10
    invoke-interface {p0, v0}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public getEnclosingMethod()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->typeContainment:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment;->getEnclosingMethod(Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getEnclosingType()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->typeContainment:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment;->getEnclosingType(Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getGenericSignature()Ljava/lang/String;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->genericSignature:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getInterfaces()Lnet/bytebuddy/description/type/TypeList$Generic;
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->signatureResolution:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForType;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->interfaceTypeDescriptors:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->interfaceAnnotationTokens:Ljava/util/Map;

    .line 8
    .line 9
    invoke-interface {v0, v1, v2, v3, p0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForType;->resolveInterfaceTypes(Ljava/util/List;Lnet/bytebuddy/pool/TypePool;Ljava/util/Map;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public getModifiers()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->modifiers:I

    .line 2
    .line 3
    return p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getNestHost()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->nestHost:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 7
    .line 8
    invoke-interface {p0, v0}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public getNestMembers()Lnet/bytebuddy/description/type/TypeList;
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->nestHost:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyNestMemberList;

    .line 6
    .line 7
    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 8
    .line 9
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->nestMembers:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, p0, v1, v2}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyNestMemberList;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/pool/TypePool;Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 16
    .line 17
    invoke-interface {p0, v0}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p0}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getNestMembers()Lnet/bytebuddy/description/type/TypeList;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public getPackage()Lnet/bytebuddy/description/type/PackageDescription;
    .locals 4
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x2e

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    new-instance v2, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyPackageDescription;

    .line 12
    .line 13
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 14
    .line 15
    const/4 v3, -0x1

    .line 16
    if-ne v1, v3, :cond_0

    .line 17
    .line 18
    const-string v0, ""

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v3, 0x0

    .line 22
    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    const/4 v1, 0x0

    .line 27
    invoke-direct {v2, p0, v0, v1}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyPackageDescription;-><init>(Lnet/bytebuddy/pool/TypePool;Ljava/lang/String;Lnet/bytebuddy/pool/TypePool$1;)V

    .line 28
    .line 29
    .line 30
    return-object v2
.end method

.method public getPermittedSubtypes()Lnet/bytebuddy/description/type/TypeList;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyTypeList;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->permittedSubclasses:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyTypeList;-><init>(Lnet/bytebuddy/pool/TypePool;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public getRecordComponents()Lnet/bytebuddy/description/type/RecordComponentList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/type/RecordComponentList<",
            "Lnet/bytebuddy/description/type/RecordComponentDescription$InDefinedShape;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentTokenList;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentTokenList;-><init>(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 4
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->superClassDescriptor:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isInterface()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->signatureResolution:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForType;

    .line 13
    .line 14
    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->superClassDescriptor:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 17
    .line 18
    iget-object v3, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->superClassAnnotationTokens:Ljava/util/Map;

    .line 19
    .line 20
    invoke-interface {v0, v1, v2, v3, p0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForType;->resolveSuperClass(Ljava/lang/String;Lnet/bytebuddy/pool/TypePool;Ljava/util/Map;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_1
    :goto_0
    sget-object p0, Lnet/bytebuddy/description/type/TypeDescription$Generic;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 26
    .line 27
    return-object p0
.end method

.method public getTypeVariables()Lnet/bytebuddy/description/type/TypeList$Generic;
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->signatureResolution:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForType;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->typeVariableAnnotationTokens:Ljava/util/Map;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->typeVariableBoundsAnnotationTokens:Ljava/util/Map;

    .line 8
    .line 9
    invoke-interface {v0, v1, p0, v2, v3}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution;->resolveTypeVariables(Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/description/TypeVariableSource;Ljava/util/Map;Ljava/util/Map;)Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public isAnonymousType()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->anonymousType:Z

    .line 2
    .line 3
    return p0
.end method

.method public isLocalType()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->anonymousType:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->typeContainment:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment;

    .line 6
    .line 7
    invoke-interface {p0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment;->isLocalType()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public isRecord()Z
    .locals 2

    .line 1
    iget v0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->actualModifiers:I

    .line 2
    .line 3
    const/high16 v1, 0x10000

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lnet/bytebuddy/utility/JavaType;->RECORD:Lnet/bytebuddy/utility/JavaType;

    .line 9
    .line 10
    invoke-virtual {v0}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->superClassDescriptor:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public isSealed()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->permittedSubclasses:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    xor-int/lit8 p0, p0, 0x1

    .line 8
    .line 9
    return p0
.end method

.method public toModuleDescription()Lnet/bytebuddy/description/module/ModuleDescription;
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->moduleToken:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lnet/bytebuddy/description/module/ModuleDescription;->UNDEFINED:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-static {v0, p0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->access$1300(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyModuleDescription;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method
