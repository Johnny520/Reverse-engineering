.class public Lnet/bytebuddy/utility/StreamDrainer;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field public static final DEFAULT:Lnet/bytebuddy/utility/StreamDrainer;

.field public static final DEFAULT_BUFFER_SIZE:I = 0x400

.field private static final END_OF_STREAM:I = -0x1

.field private static final FROM_BEGINNING:I


# instance fields
.field private final bufferSize:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/utility/StreamDrainer;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/utility/StreamDrainer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lnet/bytebuddy/utility/StreamDrainer;->DEFAULT:Lnet/bytebuddy/utility/StreamDrainer;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/16 v0, 0x400

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/utility/StreamDrainer;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput p1, p0, Lnet/bytebuddy/utility/StreamDrainer;->bufferSize:I

    return-void
.end method


# virtual methods
.method public drain(Ljava/io/InputStream;)[B
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lnet/bytebuddy/utility/StreamDrainer;->bufferSize:I

    .line 7
    .line 8
    new-array v1, v1, [B

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :cond_0
    iget v4, p0, Lnet/bytebuddy/utility/StreamDrainer;->bufferSize:I

    .line 13
    .line 14
    sub-int/2addr v4, v3

    .line 15
    invoke-virtual {p1, v1, v3, v4}, Ljava/io/InputStream;->read([BII)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    add-int/2addr v5, v3

    .line 24
    iget v3, p0, Lnet/bytebuddy/utility/StreamDrainer;->bufferSize:I

    .line 25
    .line 26
    if-ne v5, v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    iget v1, p0, Lnet/bytebuddy/utility/StreamDrainer;->bufferSize:I

    .line 32
    .line 33
    new-array v1, v1, [B

    .line 34
    .line 35
    move v3, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v3, v5

    .line 38
    :goto_0
    const/4 v5, -0x1

    .line 39
    if-ne v4, v5, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    iget v4, p0, Lnet/bytebuddy/utility/StreamDrainer;->bufferSize:I

    .line 46
    .line 47
    mul-int/2addr p1, v4

    .line 48
    add-int/2addr p1, v3

    .line 49
    new-array p1, p1, [B

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    move v4, v2

    .line 56
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_2

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    check-cast v5, [B

    .line 67
    .line 68
    add-int/lit8 v6, v4, 0x1

    .line 69
    .line 70
    iget v7, p0, Lnet/bytebuddy/utility/StreamDrainer;->bufferSize:I

    .line 71
    .line 72
    mul-int/2addr v4, v7

    .line 73
    invoke-static {v5, v2, p1, v4, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 74
    .line 75
    .line 76
    move v4, v6

    .line 77
    goto :goto_1

    .line 78
    :cond_2
    iget p0, p0, Lnet/bytebuddy/utility/StreamDrainer;->bufferSize:I

    .line 79
    .line 80
    mul-int/2addr v4, p0

    .line 81
    invoke-static {v1, v2, p1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 82
    .line 83
    .line 84
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget p0, p0, Lnet/bytebuddy/utility/StreamDrainer;->bufferSize:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/utility/StreamDrainer;

    .line 23
    .line 24
    iget p1, p1, Lnet/bytebuddy/utility/StreamDrainer;->bufferSize:I

    .line 25
    .line 26
    if-eq p0, p1, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget p0, p0, Lnet/bytebuddy/utility/StreamDrainer;->bufferSize:I

    .line 12
    .line 13
    add-int/2addr v0, p0

    .line 14
    return v0
.end method
