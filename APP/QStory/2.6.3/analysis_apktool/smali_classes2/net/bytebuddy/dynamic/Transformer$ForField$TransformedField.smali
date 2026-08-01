.class public Lnet/bytebuddy/dynamic/Transformer$ForField$TransformedField;
.super Lnet/bytebuddy/description/field/FieldDescription$AbstractBase;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/Transformer$ForField;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TransformedField"
.end annotation


# instance fields
.field private final declaringType:Lnet/bytebuddy/description/type/TypeDefinition;

.field private final fieldDescription:Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

.field private final instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

.field private final token:Lnet/bytebuddy/description/field/FieldDescription$Token;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/description/field/FieldDescription$Token;Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/field/FieldDescription$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/dynamic/Transformer$ForField$TransformedField;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/dynamic/Transformer$ForField$TransformedField;->declaringType:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/dynamic/Transformer$ForField$TransformedField;->token:Lnet/bytebuddy/description/field/FieldDescription$Token;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/dynamic/Transformer$ForField$TransformedField;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public bridge synthetic asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/Transformer$ForField$TransformedField;->asDefined()Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public asDefined()Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;
    .locals 0

    .line 6
    iget-object p0, p0, Lnet/bytebuddy/dynamic/Transformer$ForField$TransformedField;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    return-object p0
.end method

.method public getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/Transformer$ForField$TransformedField;->token:Lnet/bytebuddy/description/field/FieldDescription$Token;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/description/field/FieldDescription$Token;->getAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;
    .locals 0
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/Transformer$ForField$TransformedField;->declaringType:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 2
    .line 3
    return-object p0
.end method

.method public getModifiers()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/Transformer$ForField$TransformedField;->token:Lnet/bytebuddy/description/field/FieldDescription$Token;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/description/field/FieldDescription$Token;->getModifiers()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/Transformer$ForField$TransformedField;->token:Lnet/bytebuddy/description/field/FieldDescription$Token;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/description/field/FieldDescription$Token;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/Transformer$ForField$TransformedField;->token:Lnet/bytebuddy/description/field/FieldDescription$Token;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/bytebuddy/description/field/FieldDescription$Token;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p0, p0, Lnet/bytebuddy/dynamic/Transformer$ForField$TransformedField;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 8
    .line 9
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Substitutor$ForAttachment;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Substitutor$ForAttachment;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 18
    .line 19
    return-object p0
.end method
