.class public Lnet/bytebuddy/description/annotation/AnnotationValue$ForMissingType$Loaded;
.super Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded$AbstractBase$ForUnresolvedProperty;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/annotation/AnnotationValue$ForMissingType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Loaded"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<U:",
        "Ljava/lang/Object;",
        ">",
        "Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded$AbstractBase$ForUnresolvedProperty<",
        "TU;>;"
    }
.end annotation


# instance fields
.field private final exception:Ljava/lang/ClassNotFoundException;

.field private final typeName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/ClassNotFoundException;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded$AbstractBase$ForUnresolvedProperty;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMissingType$Loaded;->typeName:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMissingType$Loaded;->exception:Ljava/lang/ClassNotFoundException;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public resolve()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TU;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/TypeNotPresentException;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMissingType$Loaded;->typeName:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMissingType$Loaded;->exception:Ljava/lang/ClassNotFoundException;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Ljava/lang/TypeNotPresentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMissingType$Loaded;->typeName:Ljava/lang/String;

    .line 7
    .line 8
    const-string v1, ".class /* Warning: type not present! */"

    .line 9
    .line 10
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method
