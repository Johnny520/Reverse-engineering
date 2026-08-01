.class public Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$ArrayLookup;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ArrayLookup"
.end annotation


# instance fields
.field private final componentTypeReference:Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;

.field private final name:Ljava/lang/String;

.field final synthetic this$2:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;

.field private final values:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;Ljava/lang/String;Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$ArrayLookup;->this$2:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$ArrayLookup;->name:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$ArrayLookup;->componentTypeReference:Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;

    .line 9
    .line 10
    new-instance p1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$ArrayLookup;->values:Ljava/util/List;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;Ljava/lang/String;Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;Lnet/bytebuddy/pool/TypePool$1;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1, p2, p3}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$ArrayLookup;-><init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;Ljava/lang/String;Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;)V

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 6

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$ArrayLookup;->this$2:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;->access$4600(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;)Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$ArrayLookup;->name:Ljava/lang/String;

    .line 8
    .line 9
    new-instance v2, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;

    .line 10
    .line 11
    iget-object v3, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$ArrayLookup;->this$2:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;

    .line 12
    .line 13
    iget-object v3, v3, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;->this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

    .line 14
    .line 15
    iget-object v3, v3, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->this$0:Lnet/bytebuddy/pool/TypePool$Default;

    .line 16
    .line 17
    iget-object v4, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$ArrayLookup;->componentTypeReference:Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;

    .line 18
    .line 19
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$ArrayLookup;->values:Ljava/util/List;

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    invoke-direct {v2, v3, v4, p0, v5}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;-><init>(Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;Ljava/util/List;Lnet/bytebuddy/pool/TypePool$1;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1, v2}, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;->register(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public register(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;)V"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$ArrayLookup;->values:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
