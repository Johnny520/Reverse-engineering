.class final enum Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher$1;
.super Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;ICCZ)V
    .locals 7

    .line 1
    const/4 v6, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move v2, p2

    .line 5
    move v3, p3

    .line 6
    move v4, p4

    .line 7
    move v5, p5

    .line 8
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;-><init>(Ljava/lang/String;ICCZLnet/bytebuddy/description/annotation/AnnotationValue$1;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public toSourceString(C)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public toSourceString(D)Ljava/lang/String;
    .locals 0

    .line 9
    invoke-static {p1, p2}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public toSourceString(F)Ljava/lang/String;
    .locals 0

    .line 8
    invoke-static {p1}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public toSourceString(J)Ljava/lang/String;
    .locals 0

    .line 7
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public toSourceString(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 6
    return-object p1
.end method

.method public toSourceString(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;
    .locals 0

    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
