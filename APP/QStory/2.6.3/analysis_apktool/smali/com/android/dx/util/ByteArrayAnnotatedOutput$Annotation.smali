.class Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/util/ByteArrayAnnotatedOutput;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Annotation"
.end annotation


# instance fields
.field private end:I

.field private final start:I

.field private final text:Ljava/lang/String;


# direct methods
.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;->start:I

    .line 5
    .line 6
    iput p2, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;->end:I

    .line 7
    .line 8
    iput-object p3, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;->text:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    const v0, 0x7fffffff

    .line 11
    invoke-direct {p0, p1, v0, p2}, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;-><init>(IILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getEnd()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;->end:I

    .line 2
    .line 3
    return p0
.end method

.method public getStart()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;->start:I

    .line 2
    .line 3
    return p0
.end method

.method public getText()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;->text:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setEnd(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;->end:I

    .line 2
    .line 3
    return-void
.end method

.method public setEndIfUnset(I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;->end:I

    .line 2
    .line 3
    const v1, 0x7fffffff

    .line 4
    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iput p1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;->end:I

    .line 9
    .line 10
    :cond_0
    return-void
.end method
