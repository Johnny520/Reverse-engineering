.class public Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$FieldExtractor;
.super Lnet/bytebuddy/jar/asm/FieldVisitor;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "FieldExtractor"
.end annotation


# instance fields
.field private final annotationTokens:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;"
        }
    .end annotation
.end field

.field private final descriptor:Ljava/lang/String;

.field private final genericSignature:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final internalName:Ljava/lang/String;

.field private final modifiers:I

.field final synthetic this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

.field private final typeAnnotationTokens:Ljava/util/Map;
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


# direct methods
.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p4    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$FieldExtractor;->this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

    .line 2
    .line 3
    sget p1, Lnet/bytebuddy/utility/OpenedClassReader;->ASM_API:I

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lnet/bytebuddy/jar/asm/FieldVisitor;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iput p2, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$FieldExtractor;->modifiers:I

    .line 9
    .line 10
    iput-object p3, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$FieldExtractor;->internalName:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p4, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$FieldExtractor;->descriptor:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p5, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$FieldExtractor;->genericSignature:Ljava/lang/String;

    .line 15
    .line 16
    new-instance p1, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$FieldExtractor;->typeAnnotationTokens:Ljava/util/Map;

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$FieldExtractor;->annotationTokens:Ljava/util/List;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 3

    .line 1
    new-instance p2, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;

    .line 2
    .line 3
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$FieldExtractor;->this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$FieldExtractor;->annotationTokens:Ljava/util/List;

    .line 6
    .line 7
    new-instance v1, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$ForAnnotationProperty;

    .line 8
    .line 9
    iget-object v2, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->this$0:Lnet/bytebuddy/pool/TypePool$Default;

    .line 10
    .line 11
    invoke-direct {v1, v2, p1}, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$ForAnnotationProperty;-><init>(Lnet/bytebuddy/pool/TypePool;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p2, v0, p1, p0, v1}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;-><init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;Ljava/lang/String;Ljava/util/List;Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;)V

    .line 15
    .line 16
    .line 17
    return-object p2
.end method

.method public visitEnd()V
    .locals 8

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$FieldExtractor;->this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->access$4900(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$FieldToken;

    .line 8
    .line 9
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$FieldExtractor;->internalName:Ljava/lang/String;

    .line 10
    .line 11
    iget v3, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$FieldExtractor;->modifiers:I

    .line 12
    .line 13
    iget-object v4, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$FieldExtractor;->descriptor:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v5, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$FieldExtractor;->genericSignature:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v6, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$FieldExtractor;->typeAnnotationTokens:Ljava/util/Map;

    .line 18
    .line 19
    iget-object v7, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$FieldExtractor;->annotationTokens:Ljava/util/List;

    .line 20
    .line 21
    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$FieldToken;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 1
    .param p2    # Lnet/bytebuddy/jar/asm/TypePath;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    new-instance p4, Lnet/bytebuddy/jar/asm/TypeReference;

    .line 2
    .line 3
    invoke-direct {p4, p1}, Lnet/bytebuddy/jar/asm/TypeReference;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p4}, Lnet/bytebuddy/jar/asm/TypeReference;->getSort()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/16 v0, 0x13

    .line 11
    .line 12
    if-ne p1, v0, :cond_0

    .line 13
    .line 14
    new-instance p1, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForTypeVariable;

    .line 15
    .line 16
    iget-object p4, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$FieldExtractor;->typeAnnotationTokens:Ljava/util/Map;

    .line 17
    .line 18
    invoke-direct {p1, p3, p2, p4}, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForTypeVariable;-><init>(Ljava/lang/String;Lnet/bytebuddy/jar/asm/TypePath;Ljava/util/Map;)V

    .line 19
    .line 20
    .line 21
    new-instance p2, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;

    .line 22
    .line 23
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$FieldExtractor;->this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

    .line 24
    .line 25
    new-instance p4, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$ForAnnotationProperty;

    .line 26
    .line 27
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->this$0:Lnet/bytebuddy/pool/TypePool$Default;

    .line 28
    .line 29
    invoke-direct {p4, v0, p3}, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$ForAnnotationProperty;-><init>(Lnet/bytebuddy/pool/TypePool;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p2, p0, p1, p4}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;-><init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;)V

    .line 33
    .line 34
    .line 35
    return-object p2

    .line 36
    :cond_0
    const-string p0, "Unexpected type reference on field: "

    .line 37
    .line 38
    invoke-virtual {p4}, Lnet/bytebuddy/jar/asm/TypeReference;->getSort()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-static {p1, p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏(ILjava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0
.end method
