.class public Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;
.super Lnet/bytebuddy/jar/asm/AnnotationVisitor;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "AnnotationExtractor"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$AnnotationLookup;,
        Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$ArrayLookup;
    }
.end annotation


# instance fields
.field private final annotationRegistrant:Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;

.field private final componentTypeLocator:Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;

.field final synthetic this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;Ljava/lang/String;ILjava/util/Map;Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;>;",
            "Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;",
            ")V"
        }
    .end annotation

    .line 13
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForByteCodeElement$WithIndex;

    invoke-direct {v0, p2, p3, p4}, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForByteCodeElement$WithIndex;-><init>(Ljava/lang/String;ILjava/util/Map;)V

    invoke-direct {p0, p1, v0, p5}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;-><init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;Ljava/lang/String;Ljava/util/List;Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;",
            "Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;",
            ")V"
        }
    .end annotation

    .line 14
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForByteCodeElement;

    invoke-direct {v0, p2, p3}, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForByteCodeElement;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-direct {p0, p1, v0, p4}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;-><init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;->this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

    .line 2
    .line 3
    sget p1, Lnet/bytebuddy/utility/OpenedClassReader;->ASM_API:I

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;->annotationRegistrant:Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;

    .line 9
    .line 10
    iput-object p3, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;->componentTypeLocator:Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic access$4600(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;)Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;->annotationRegistrant:Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public visit(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 4

    .line 1
    instance-of v0, p2, Lnet/bytebuddy/jar/asm/Type;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;->annotationRegistrant:Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    check-cast p2, Lnet/bytebuddy/jar/asm/Type;

    .line 8
    .line 9
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForTypeValue;

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;->this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

    .line 12
    .line 13
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->this$0:Lnet/bytebuddy/pool/TypePool$Default;

    .line 14
    .line 15
    invoke-virtual {p2}, Lnet/bytebuddy/jar/asm/Type;->getSort()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/16 v3, 0x9

    .line 20
    .line 21
    if-ne v2, v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    const/16 v2, 0x2f

    .line 28
    .line 29
    const/16 v3, 0x2e

    .line 30
    .line 31
    invoke-virtual {p2, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {p2}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    :goto_0
    const/4 v2, 0x0

    .line 41
    invoke-direct {v0, p0, p2, v2}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForTypeValue;-><init>(Lnet/bytebuddy/pool/TypePool;Ljava/lang/String;Lnet/bytebuddy/pool/TypePool$1;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v1, p1, v0}, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;->register(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    invoke-static {p2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of(Ljava/lang/Object;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-interface {v1, p1, p0}, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;->register(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public visitAnnotation(Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;->this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

    .line 4
    .line 5
    new-instance v2, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$AnnotationLookup;

    .line 6
    .line 7
    invoke-direct {v2, p0, p2, p1}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$AnnotationLookup;-><init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$ForAnnotationProperty;

    .line 11
    .line 12
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;->this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

    .line 13
    .line 14
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->this$0:Lnet/bytebuddy/pool/TypePool$Default;

    .line 15
    .line 16
    invoke-direct {p1, p0, p2}, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$ForAnnotationProperty;-><init>(Lnet/bytebuddy/pool/TypePool;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1, v2, p1}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;-><init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public visitArray(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 5

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;->this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

    .line 4
    .line 5
    new-instance v2, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$ArrayLookup;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;->componentTypeLocator:Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;

    .line 8
    .line 9
    invoke-interface {v3, p1}, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;->bind(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    const/4 v4, 0x0

    .line 14
    invoke-direct {v2, p0, p1, v3, v4}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$ArrayLookup;-><init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;Ljava/lang/String;Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;Lnet/bytebuddy/pool/TypePool$1;)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$Illegal;->INSTANCE:Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$Illegal;

    .line 18
    .line 19
    invoke-direct {v0, v1, v2, p0}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;-><init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public visitEnd()V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;->annotationRegistrant:Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;->onComplete()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public visitEnum(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;->annotationRegistrant:Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForEnumerationValue;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;->this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->this$0:Lnet/bytebuddy/pool/TypePool$Default;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x1

    .line 14
    sub-int/2addr v2, v3

    .line 15
    invoke-virtual {p2, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    const/16 v2, 0x2f

    .line 20
    .line 21
    const/16 v3, 0x2e

    .line 22
    .line 23
    invoke-virtual {p2, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-direct {v1, p0, p2, p3, v2}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForEnumerationValue;-><init>(Lnet/bytebuddy/pool/TypePool;Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/pool/TypePool$1;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, p1, v1}, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;->register(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
