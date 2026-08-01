.class public Lnet/bytebuddy/description/type/RecordComponentDescription$Latent;
.super Lnet/bytebuddy/description/type/RecordComponentDescription$InDefinedShape$AbstractBase;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/type/RecordComponentDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Latent"
.end annotation


# instance fields
.field private final annotations:Ljava/util/List;
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

.field private final name:Ljava/lang/String;

.field private final type:Lnet/bytebuddy/description/type/TypeDescription$Generic;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Lnet/bytebuddy/description/type/RecordComponentDescription$InDefinedShape$AbstractBase;-><init>()V

    .line 18
    iput-object p1, p0, Lnet/bytebuddy/description/type/RecordComponentDescription$Latent;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 19
    iput-object p2, p0, Lnet/bytebuddy/description/type/RecordComponentDescription$Latent;->name:Ljava/lang/String;

    .line 20
    iput-object p3, p0, Lnet/bytebuddy/description/type/RecordComponentDescription$Latent;->type:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 21
    iput-object p4, p0, Lnet/bytebuddy/description/type/RecordComponentDescription$Latent;->annotations:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/RecordComponentDescription$Token;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lnet/bytebuddy/description/type/RecordComponentDescription$Token;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p2}, Lnet/bytebuddy/description/type/RecordComponentDescription$Token;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p2}, Lnet/bytebuddy/description/type/RecordComponentDescription$Token;->getAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-direct {p0, p1, v0, v1, p2}, Lnet/bytebuddy/description/type/RecordComponentDescription$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public getActualName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/RecordComponentDescription$Latent;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationList$Explicit;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/type/RecordComponentDescription$Latent;->annotations:Ljava/util/List;

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
    invoke-virtual {p0}, Lnet/bytebuddy/description/type/RecordComponentDescription$Latent;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

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
    iget-object p0, p0, Lnet/bytebuddy/description/type/RecordComponentDescription$Latent;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    return-object p0
.end method

.method public getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/type/RecordComponentDescription$Latent;->type:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Substitutor$ForAttachment;->of(Lnet/bytebuddy/description/type/RecordComponentDescription;)Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Substitutor$ForAttachment;

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
