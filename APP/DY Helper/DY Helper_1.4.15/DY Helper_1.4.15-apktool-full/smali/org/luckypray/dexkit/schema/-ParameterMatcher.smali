.class public final Lorg/luckypray/dexkit/schema/-ParameterMatcher;
.super Lp22;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/schema/-ParameterMatcher$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/schema/-ParameterMatcher$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-ParameterMatcher$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-ParameterMatcher$Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/schema/-ParameterMatcher;->Companion:Lorg/luckypray/dexkit/schema/-ParameterMatcher$Companion;

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
.method public final __assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ParameterMatcher;
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-ParameterMatcher;->__init(ILjava/nio/ByteBuffer;)V

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

.method public final annotations(Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;
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
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget v1, p0, Lp22;->bb_pos:I

    .line 12
    .line 13
    add-int/2addr v0, v1

    .line 14
    invoke-virtual {p0, v0}, Lp22;->__indirect(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object p0, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0, p0}, Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method

.method public final getAnnotations()Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ParameterMatcher;->annotations(Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final getParameterType()Lorg/luckypray/dexkit/schema/-ClassMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-ClassMatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-ClassMatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ParameterMatcher;->parameterType(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final parameterType(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x6

    .line 5
    invoke-virtual {p0, v0}, Lp22;->__offset(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget v1, p0, Lp22;->bb_pos:I

    .line 12
    .line 13
    add-int/2addr v0, v1

    .line 14
    invoke-virtual {p0, v0}, Lp22;->__indirect(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object p0, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0, p0}, Lorg/luckypray/dexkit/schema/-ClassMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMatcher;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method
