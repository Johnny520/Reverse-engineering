.class public final Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;
.super Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/RandomAccess;


# static fields
.field public static final 飘花落叶言子楪兰世哲苏:Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;

.field public static final 飘花落叶言子楪兰世苏哲:[Ljava/lang/Object;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:[Ljava/lang/Object;

.field public 飘花落叶言子楪哲兰苏世:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    sput-object v1, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪兰世苏哲:[Ljava/lang/Object;

    .line 5
    .line 6
    new-instance v2, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;

    .line 7
    .line 8
    invoke-direct {v2, v1, v0, v0}, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;-><init>([Ljava/lang/Object;IZ)V

    .line 9
    .line 10
    .line 11
    sput-object v2, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪兰世哲苏:Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    sget-object v2, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪兰世苏哲:[Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0, v2, v0, v1}, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;-><init>([Ljava/lang/Object;IZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;IZ)V
    .locals 0

    .line 9
    invoke-direct {p0, p3}, Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;-><init>(Z)V

    .line 10
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/Object;

    .line 11
    iput p2, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰苏世:I

    return-void
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰()V

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_1

    .line 5
    .line 6
    iget v0, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰苏世:I

    .line 7
    .line 8
    if-gt p1, v0, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/Object;

    .line 11
    .line 12
    array-length v2, v1

    .line 13
    const/4 v3, 0x1

    .line 14
    if-ge v0, v2, :cond_0

    .line 15
    .line 16
    add-int/lit8 v2, p1, 0x1

    .line 17
    .line 18
    sub-int/2addr v0, p1

    .line 19
    invoke-static {v1, p1, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    array-length v0, v1

    .line 24
    const/4 v1, 0x2

    .line 25
    const/16 v2, 0xa

    .line 26
    .line 27
    const/4 v4, 0x3

    .line 28
    invoke-static {v0, v4, v1, v3, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(IIIII)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    new-array v0, v0, [Ljava/lang/Object;

    .line 33
    .line 34
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/Object;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-static {v1, v2, v0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/Object;

    .line 41
    .line 42
    add-int/lit8 v2, p1, 0x1

    .line 43
    .line 44
    iget v4, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰苏世:I

    .line 45
    .line 46
    sub-int/2addr v4, p1

    .line 47
    invoke-static {v1, p1, v0, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/Object;

    .line 51
    .line 52
    :goto_0
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/Object;

    .line 53
    .line 54
    aput-object p2, v0, p1

    .line 55
    .line 56
    iget p1, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰苏世:I

    .line 57
    .line 58
    add-int/2addr p1, v3

    .line 59
    iput p1, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰苏世:I

    .line 60
    .line 61
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    .line 62
    .line 63
    add-int/2addr p1, v3

    .line 64
    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    .line 65
    .line 66
    return-void

    .line 67
    :cond_1
    const-string p2, "Index:"

    .line 68
    .line 69
    const-string v0, ", Size:"

    .line 70
    .line 71
    invoke-static {p1, p2, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iget p0, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰苏世:I

    .line 76
    .line 77
    invoke-static {p1, p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏世兰(Ljava/lang/StringBuilder;I)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 5

    .line 81
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰()V

    .line 82
    iget v0, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰苏世:I

    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/Object;

    array-length v2, v1

    const/4 v3, 0x1

    if-ne v0, v2, :cond_0

    .line 83
    array-length v0, v1

    const/4 v1, 0x2

    const/16 v2, 0xa

    const/4 v4, 0x3

    .line 84
    invoke-static {v0, v4, v1, v3, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(IIIII)I

    move-result v0

    .line 85
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/Object;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    .line 86
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/Object;

    .line 87
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰苏世:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰苏世:I

    aput-object p1, v0, v1

    .line 88
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/2addr p1, v3

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return v3
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Ljava/util/List;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    instance-of v1, p1, Ljava/util/RandomAccess;

    .line 12
    .line 13
    if-nez v1, :cond_2

    .line 14
    .line 15
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_2
    move-object v1, p1

    .line 21
    check-cast v1, Ljava/util/List;

    .line 22
    .line 23
    iget v3, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰苏世:I

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eq v3, v4, :cond_3

    .line 30
    .line 31
    return v2

    .line 32
    :cond_3
    instance-of v4, p1, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;

    .line 33
    .line 34
    if-eqz v4, :cond_6

    .line 35
    .line 36
    check-cast p1, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;

    .line 37
    .line 38
    move v1, v2

    .line 39
    :goto_0
    if-ge v1, v3, :cond_5

    .line 40
    .line 41
    iget-object v4, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/Object;

    .line 42
    .line 43
    aget-object v4, v4, v1

    .line 44
    .line 45
    iget-object v5, p1, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/Object;

    .line 46
    .line 47
    aget-object v5, v5, v1

    .line 48
    .line 49
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_4

    .line 54
    .line 55
    return v2

    .line 56
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_5
    return v0

    .line 60
    :cond_6
    move p1, v2

    .line 61
    :goto_1
    if-ge p1, v3, :cond_8

    .line 62
    .line 63
    iget-object v4, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/Object;

    .line 64
    .line 65
    aget-object v4, v4, p1

    .line 66
    .line 67
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-nez v4, :cond_7

    .line 76
    .line 77
    return v2

    .line 78
    :cond_7
    add-int/lit8 p1, p1, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_8
    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪世兰苏哲(I)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/Object;

    .line 5
    .line 6
    aget-object p0, p0, p1

    .line 7
    .line 8
    return-object p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰苏世:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v0, :cond_0

    .line 6
    .line 7
    mul-int/lit8 v1, v1, 0x1f

    .line 8
    .line 9
    iget-object v3, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/Object;

    .line 10
    .line 11
    aget-object v3, v3, v2

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    add-int/2addr v1, v3

    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return v1
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪世兰苏哲(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/Object;

    .line 8
    .line 9
    aget-object v1, v0, p1

    .line 10
    .line 11
    iget v2, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰苏世:I

    .line 12
    .line 13
    add-int/lit8 v3, v2, -0x1

    .line 14
    .line 15
    if-ge p1, v3, :cond_0

    .line 16
    .line 17
    add-int/lit8 v3, p1, 0x1

    .line 18
    .line 19
    sub-int/2addr v2, p1

    .line 20
    add-int/lit8 v2, v2, -0x1

    .line 21
    .line 22
    invoke-static {v0, v3, v0, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget p1, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰苏世:I

    .line 26
    .line 27
    add-int/lit8 p1, p1, -0x1

    .line 28
    .line 29
    iput p1, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰苏世:I

    .line 30
    .line 31
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    .line 32
    .line 33
    add-int/lit8 p1, p1, 0x1

    .line 34
    .line 35
    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    .line 36
    .line 37
    return-object v1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪世兰苏哲(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/Object;

    .line 8
    .line 9
    aget-object v1, v0, p1

    .line 10
    .line 11
    aput-object p2, v0, p1

    .line 12
    .line 13
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    .line 14
    .line 15
    add-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    .line 18
    .line 19
    return-object v1
.end method

.method public final size()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰苏世:I

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子楪世兰哲苏(I)Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰苏世:I

    .line 2
    .line 3
    if-lt p1, v0, :cond_1

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    sget-object p1, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪兰世苏哲:[Ljava/lang/Object;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_0
    new-instance v0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;

    .line 17
    .line 18
    iget p0, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰苏世:I

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-direct {v0, p1, p0, v1}, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;-><init>([Ljava/lang/Object;IZ)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    invoke-static {}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲()V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲(I)V
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰苏世:I

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string v0, "Index:"

    .line 9
    .line 10
    const-string v1, ", Size:"

    .line 11
    .line 12
    invoke-static {p1, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget p0, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰苏世:I

    .line 17
    .line 18
    invoke-static {p1, p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏世兰(Ljava/lang/StringBuilder;I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-gt p1, v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    array-length v1, v0

    .line 8
    const/16 v2, 0xa

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-static {p1, v2}, Ljava/lang/Math;->max(II)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    new-array p1, p1, [Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/Object;

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    array-length v0, v0

    .line 22
    :goto_0
    if-ge v0, p1, :cond_2

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    const/4 v3, 0x1

    .line 26
    const/4 v4, 0x3

    .line 27
    invoke-static {v0, v4, v1, v3, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(IIIII)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    goto :goto_0

    .line 32
    :cond_2
    iget-object p1, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/Object;

    .line 33
    .line 34
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/Object;

    .line 39
    .line 40
    return-void
.end method

.method public final bridge synthetic 飘花落叶言子楪哲苏兰世(I)Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪世兰哲苏(I)Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
