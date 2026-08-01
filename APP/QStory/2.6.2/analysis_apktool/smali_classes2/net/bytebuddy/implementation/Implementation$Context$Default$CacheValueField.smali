.class public Lnet/bytebuddy/implementation/Implementation$Context$Default$CacheValueField;
.super Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape$AbstractBase;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/Implementation$Context$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CacheValueField"
.end annotation


# instance fields
.field private final fieldType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

.field private final instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

.field private final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default$CacheValueField;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default$CacheValueField;->fieldType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 7
    .line 8
    const-string p1, "cachedValue$"

    .line 9
    .line 10
    const-string p2, "$"

    .line 11
    .line 12
    invoke-static {p1, p3, p2}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p4}, Lnet/bytebuddy/utility/RandomString;->hashOf(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default$CacheValueField;->name:Ljava/lang/String;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
    .locals 0

    .line 1
    new-instance p0, Lnet/bytebuddy/description/annotation/AnnotationList$Empty;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/description/annotation/AnnotationList$Empty;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public bridge synthetic getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;
    .locals 0
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/Implementation$Context$Default$CacheValueField;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default$CacheValueField;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    return-object p0
.end method

.method public getModifiers()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default$CacheValueField;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isInterface()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x2

    .line 12
    :goto_0
    or-int/lit16 p0, p0, 0x1018

    .line 13
    .line 14
    return p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default$CacheValueField;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default$CacheValueField;->fieldType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    return-object p0
.end method
