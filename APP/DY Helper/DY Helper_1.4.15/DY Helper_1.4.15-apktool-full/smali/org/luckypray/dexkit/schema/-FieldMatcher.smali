.class public final Lorg/luckypray/dexkit/schema/-FieldMatcher;
.super Lp22;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/schema/-FieldMatcher;->Companion:Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;

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
.method public final __assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMatcher;
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->__init(ILjava/nio/ByteBuffer;)V

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

.method public final accessFlags(Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;)Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;
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
    invoke-virtual {p1, v0, p0}, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;

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

.method public final allOf(I)Lorg/luckypray/dexkit/schema/-FieldMatcher;
    .locals 1

    .line 35
    new-instance v0, Lorg/luckypray/dexkit/schema/-FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;-><init>()V

    invoke-virtual {p0, v0, p1}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->allOf(Lorg/luckypray/dexkit/schema/-FieldMatcher;I)Lorg/luckypray/dexkit/schema/-FieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final allOf(Lorg/luckypray/dexkit/schema/-FieldMatcher;I)Lorg/luckypray/dexkit/schema/-FieldMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x12

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lp22;->__offset(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lp22;->__vector(I)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    mul-int/lit8 p2, p2, 0x4

    .line 17
    .line 18
    add-int/2addr p2, v0

    .line 19
    invoke-virtual {p0, p2}, Lp22;->__indirect(I)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    iget-object p0, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p2, p0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMatcher;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_0
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public final annotations(Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xc

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lp22;->__offset(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget v1, p0, Lp22;->bb_pos:I

    .line 13
    .line 14
    add-int/2addr v0, v1

    .line 15
    invoke-virtual {p0, v0}, Lp22;->__indirect(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object p0, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0, p0}, Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method

.method public final anyOf(I)Lorg/luckypray/dexkit/schema/-FieldMatcher;
    .locals 1

    .line 35
    new-instance v0, Lorg/luckypray/dexkit/schema/-FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;-><init>()V

    invoke-virtual {p0, v0, p1}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->anyOf(Lorg/luckypray/dexkit/schema/-FieldMatcher;I)Lorg/luckypray/dexkit/schema/-FieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final anyOf(Lorg/luckypray/dexkit/schema/-FieldMatcher;I)Lorg/luckypray/dexkit/schema/-FieldMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x14

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lp22;->__offset(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lp22;->__vector(I)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    mul-int/lit8 p2, p2, 0x4

    .line 17
    .line 18
    add-int/2addr p2, v0

    .line 19
    invoke-virtual {p0, p2}, Lp22;->__indirect(I)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    iget-object p0, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p2, p0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMatcher;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_0
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public final declaringClass(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x8

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lp22;->__offset(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget v1, p0, Lp22;->bb_pos:I

    .line 13
    .line 14
    add-int/2addr v0, v1

    .line 15
    invoke-virtual {p0, v0}, Lp22;->__indirect(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object p0, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0, p0}, Lorg/luckypray/dexkit/schema/-ClassMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMatcher;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method

.method public final fieldName(Lorg/luckypray/dexkit/schema/-StringMatcher;)Lorg/luckypray/dexkit/schema/-StringMatcher;
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
    invoke-virtual {p1, v0, p0}, Lorg/luckypray/dexkit/schema/-StringMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-StringMatcher;

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

.method public final getAccessFlags()Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->accessFlags(Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;)Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final getAllOfLength()I
    .locals 1

    .line 1
    const/16 v0, 0x12

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lp22;->__offset(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lp22;->__vector_len(I)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
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
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->annotations(Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final getAnyOfLength()I
    .locals 1

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lp22;->__offset(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lp22;->__vector_len(I)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public final getDeclaringClass()Lorg/luckypray/dexkit/schema/-ClassMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-ClassMatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-ClassMatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->declaringClass(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final getFieldName()Lorg/luckypray/dexkit/schema/-StringMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-StringMatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-StringMatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->fieldName(Lorg/luckypray/dexkit/schema/-StringMatcher;)Lorg/luckypray/dexkit/schema/-StringMatcher;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final getGetMethods()Lorg/luckypray/dexkit/schema/-MethodsMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->getMethods(Lorg/luckypray/dexkit/schema/-MethodsMatcher;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final getMethods(Lorg/luckypray/dexkit/schema/-MethodsMatcher;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xe

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lp22;->__offset(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget v1, p0, Lp22;->bb_pos:I

    .line 13
    .line 14
    add-int/2addr v0, v1

    .line 15
    invoke-virtual {p0, v0}, Lp22;->__indirect(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object p0, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0, p0}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method

.method public final getNoneOfLength()I
    .locals 1

    .line 1
    const/16 v0, 0x16

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lp22;->__offset(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lp22;->__vector_len(I)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public final getPutMethods()Lorg/luckypray/dexkit/schema/-MethodsMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->putMethods(Lorg/luckypray/dexkit/schema/-MethodsMatcher;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final getTypeClass()Lorg/luckypray/dexkit/schema/-ClassMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-ClassMatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-ClassMatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->typeClass(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final noneOf(I)Lorg/luckypray/dexkit/schema/-FieldMatcher;
    .locals 1

    .line 35
    new-instance v0, Lorg/luckypray/dexkit/schema/-FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;-><init>()V

    invoke-virtual {p0, v0, p1}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->noneOf(Lorg/luckypray/dexkit/schema/-FieldMatcher;I)Lorg/luckypray/dexkit/schema/-FieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final noneOf(Lorg/luckypray/dexkit/schema/-FieldMatcher;I)Lorg/luckypray/dexkit/schema/-FieldMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x16

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lp22;->__offset(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lp22;->__vector(I)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    mul-int/lit8 p2, p2, 0x4

    .line 17
    .line 18
    add-int/2addr p2, v0

    .line 19
    invoke-virtual {p0, p2}, Lp22;->__indirect(I)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    iget-object p0, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p2, p0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMatcher;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_0
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public final putMethods(Lorg/luckypray/dexkit/schema/-MethodsMatcher;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x10

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lp22;->__offset(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget v1, p0, Lp22;->bb_pos:I

    .line 13
    .line 14
    add-int/2addr v0, v1

    .line 15
    invoke-virtual {p0, v0}, Lp22;->__indirect(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object p0, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0, p0}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method

.method public final typeClass(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xa

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lp22;->__offset(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget v1, p0, Lp22;->bb_pos:I

    .line 13
    .line 14
    add-int/2addr v0, v1

    .line 15
    invoke-virtual {p0, v0}, Lp22;->__indirect(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object p0, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0, p0}, Lorg/luckypray/dexkit/schema/-ClassMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMatcher;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method
