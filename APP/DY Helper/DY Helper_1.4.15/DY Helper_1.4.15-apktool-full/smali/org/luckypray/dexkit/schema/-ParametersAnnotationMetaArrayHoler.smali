.class public final Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler;
.super Lp22;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


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

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler$Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler;->Companion:Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lp22;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final __assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler;
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler;->__init(ILjava/nio/ByteBuffer;)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public final __init(ILjava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lp22;->__reset(ILjava/nio/ByteBuffer;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final annotationsArray(I)Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;
    .locals 1

    .line 33
    new-instance v0, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;-><init>()V

    invoke-virtual {p0, v0, p1}, Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler;->annotationsArray(Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;I)Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;

    move-result-object p0

    return-object p0
.end method

.method public final annotationsArray(Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;I)Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    invoke-virtual {p0, v0}, Lp22;->__offset(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lp22;->__vector(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    mul-int/2addr p2, v0

    .line 16
    add-int/2addr p2, v1

    .line 17
    invoke-virtual {p0, p2}, Lp22;->__indirect(I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iget-object p0, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2, p0}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final getAnnotationsArrayLength()I
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lp22;->__offset(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lp22;->__vector_len(I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method
