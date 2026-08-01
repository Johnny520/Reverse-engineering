.class public Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$AnnotationLookup;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "AnnotationLookup"
.end annotation


# instance fields
.field private final descriptor:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field final synthetic this$2:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;

.field private final values:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$AnnotationLookup;->this$2:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$AnnotationLookup;->descriptor:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$AnnotationLookup;->name:Ljava/lang/String;

    .line 9
    .line 10
    new-instance p1, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$AnnotationLookup;->values:Ljava/util/Map;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 6

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$AnnotationLookup;->this$2:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;->access$4600(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;)Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$AnnotationLookup;->name:Ljava/lang/String;

    .line 8
    .line 9
    new-instance v2, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForAnnotationValue;

    .line 10
    .line 11
    iget-object v3, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$AnnotationLookup;->this$2:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;

    .line 12
    .line 13
    iget-object v3, v3, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;->this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

    .line 14
    .line 15
    iget-object v3, v3, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->this$0:Lnet/bytebuddy/pool/TypePool$Default;

    .line 16
    .line 17
    new-instance v4, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;

    .line 18
    .line 19
    iget-object v5, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$AnnotationLookup;->descriptor:Ljava/lang/String;

    .line 20
    .line 21
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$AnnotationLookup;->values:Ljava/util/Map;

    .line 22
    .line 23
    invoke-direct {v4, v5, p0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    invoke-direct {v2, v3, v4, p0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForAnnotationValue;-><init>(Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;Lnet/bytebuddy/pool/TypePool$1;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, v1, v2}, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;->register(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)V

    .line 31
    .line 32
    .line 33
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
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor$AnnotationLookup;->values:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method
