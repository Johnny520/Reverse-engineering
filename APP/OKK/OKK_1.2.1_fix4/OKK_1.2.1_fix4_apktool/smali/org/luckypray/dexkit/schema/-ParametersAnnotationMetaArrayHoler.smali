.class public final Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler;
.super Lcom/google/flatbuffers/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler$Companion;-><init>(LQ0/d;)V

    sput-object v0, Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler;->Companion:Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/flatbuffers/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final __assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler;
    .locals 1

    const-string v0, "_bb"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler;->__init(ILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public final __init(ILjava/nio/ByteBuffer;)V
    .locals 1

    const-string v0, "_bb"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/d;->__reset(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public final annotationsArray(I)Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;-><init>()V

    invoke-virtual {p0, v0, p1}, Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler;->annotationsArray(Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;I)Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;

    move-result-object p1

    return-object p1
.end method

.method public final annotationsArray(Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;I)Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;
    .locals 2

    const-string v0, "obj"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/d;->__offset(I)I

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/d;->__vector(I)I

    move-result v1

    mul-int/2addr p2, v0

    add-int/2addr p2, v1

    invoke-virtual {p0, p2}, Lcom/google/flatbuffers/d;->__indirect(I)I

    move-result p2

    iget-object v0, p0, Lcom/google/flatbuffers/d;->bb:Ljava/nio/ByteBuffer;

    const-string v1, "bb"

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, v0}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final getAnnotationsArrayLength()I
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/d;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/d;->__vector_len(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
