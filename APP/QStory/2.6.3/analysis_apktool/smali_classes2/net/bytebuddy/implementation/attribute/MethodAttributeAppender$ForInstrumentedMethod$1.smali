.class final enum Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$ForInstrumentedMethod$1;
.super Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$ForInstrumentedMethod;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$ForInstrumentedMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$ForInstrumentedMethod;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/attribute/MethodAttributeAppender$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public appendReceiver(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;
    .locals 0

    .line 1
    return-object p1
.end method
