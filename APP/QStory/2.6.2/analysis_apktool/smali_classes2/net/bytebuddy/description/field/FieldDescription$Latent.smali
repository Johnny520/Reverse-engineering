.class public Lnet/bytebuddy/description/field/FieldDescription$Latent;
.super Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape$AbstractBase;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/field/FieldDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Latent"
.end annotation


# instance fields
.field private final declaredAnnotations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;"
        }
    .end annotation
.end field

.field private final declaringType:Lnet/bytebuddy/description/type/TypeDescription;

.field private final fieldType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

.field private final modifiers:I

.field private final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/lang/String;",
            "I",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;)V"
        }
    .end annotation

    .line 23
    invoke-direct {p0}, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape$AbstractBase;-><init>()V

    .line 24
    iput-object p1, p0, Lnet/bytebuddy/description/field/FieldDescription$Latent;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 25
    iput-object p2, p0, Lnet/bytebuddy/description/field/FieldDescription$Latent;->name:Ljava/lang/String;

    .line 26
    iput p3, p0, Lnet/bytebuddy/description/field/FieldDescription$Latent;->modifiers:I

    .line 27
    iput-object p4, p0, Lnet/bytebuddy/description/field/FieldDescription$Latent;->fieldType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 28
    iput-object p5, p0, Lnet/bytebuddy/description/field/FieldDescription$Latent;->declaredAnnotations:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/field/FieldDescription$Token;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Lnet/bytebuddy/description/field/FieldDescription$Token;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    invoke-virtual {p2}, Lnet/bytebuddy/description/field/FieldDescription$Token;->getModifiers()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    invoke-virtual {p2}, Lnet/bytebuddy/description/field/FieldDescription$Token;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-virtual {p2}, Lnet/bytebuddy/description/field/FieldDescription$Token;->getAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    move-object v0, p0

    .line 18
    move-object v1, p1

    .line 19
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/description/field/FieldDescription$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationList$Explicit;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/field/FieldDescription$Latent;->declaredAnnotations:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/annotation/AnnotationList$Explicit;-><init>(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public bridge synthetic getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;
    .locals 0
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/field/FieldDescription$Latent;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 6
    iget-object p0, p0, Lnet/bytebuddy/description/field/FieldDescription$Latent;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    return-object p0
.end method

.method public getModifiers()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/description/field/FieldDescription$Latent;->modifiers:I

    .line 2
    .line 3
    return p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/field/FieldDescription$Latent;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/field/FieldDescription$Latent;->fieldType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Substitutor$ForAttachment;->of(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Substitutor$ForAttachment;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 12
    .line 13
    return-object p0
.end method
