.class public final Lokio/Path;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokio/Path$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lokio/Path;",
        ">;"
    }
.end annotation


# static fields
.field public static final Companion:Lokio/Path$Companion;

.field public static final DIRECTORY_SEPARATOR:Ljava/lang/String;


# instance fields
.field private final bytes:Lokio/ByteString;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lokio/Path$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lokio/Path$Companion;-><init>(Lgg/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lokio/Path;->Companion:Lokio/Path$Companion;

    .line 8
    .line 9
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sput-object v0, Lokio/Path;->DIRECTORY_SEPARATOR:Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Lokio/ByteString;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lokio/Path;->bytes:Lokio/ByteString;

    .line 8
    .line 9
    return-void
.end method

.method public static final get(Ljava/io/File;)Lokio/Path;
    .locals 1

    .line 1
    sget-object v0, Lokio/Path;->Companion:Lokio/Path$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lokio/Path$Companion;->get(Ljava/io/File;)Lokio/Path;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final get(Ljava/io/File;Z)Lokio/Path;
    .locals 1

    .line 8
    sget-object v0, Lokio/Path;->Companion:Lokio/Path$Companion;

    invoke-virtual {v0, p0, p1}, Lokio/Path$Companion;->get(Ljava/io/File;Z)Lokio/Path;

    move-result-object p0

    return-object p0
.end method

.method public static final get(Ljava/lang/String;)Lokio/Path;
    .locals 1

    .line 9
    sget-object v0, Lokio/Path;->Companion:Lokio/Path$Companion;

    invoke-virtual {v0, p0}, Lokio/Path$Companion;->get(Ljava/lang/String;)Lokio/Path;

    move-result-object p0

    return-object p0
.end method

.method public static final get(Ljava/lang/String;Z)Lokio/Path;
    .locals 1

    .line 10
    sget-object v0, Lokio/Path;->Companion:Lokio/Path$Companion;

    invoke-virtual {v0, p0, p1}, Lokio/Path$Companion;->get(Ljava/lang/String;Z)Lokio/Path;

    move-result-object p0

    return-object p0
.end method

.method public static final get(Ljava/nio/file/Path;)Lokio/Path;
    .locals 1

    .line 11
    sget-object v0, Lokio/Path;->Companion:Lokio/Path$Companion;

    invoke-virtual {v0, p0}, Lokio/Path$Companion;->get(Ljava/nio/file/Path;)Lokio/Path;

    move-result-object p0

    return-object p0
.end method

.method public static final get(Ljava/nio/file/Path;Z)Lokio/Path;
    .locals 1

    .line 12
    sget-object v0, Lokio/Path;->Companion:Lokio/Path$Companion;

    invoke-virtual {v0, p0, p1}, Lokio/Path$Companion;->get(Ljava/nio/file/Path;Z)Lokio/Path;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic resolve$default(Lokio/Path;Ljava/lang/String;ZILjava/lang/Object;)Lokio/Path;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lokio/Path;->resolve(Ljava/lang/String;Z)Lokio/Path;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic resolve$default(Lokio/Path;Lokio/ByteString;ZILjava/lang/Object;)Lokio/Path;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 11
    :cond_0
    invoke-virtual {p0, p1, p2}, Lokio/Path;->resolve(Lokio/ByteString;Z)Lokio/Path;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic resolve$default(Lokio/Path;Lokio/Path;ZILjava/lang/Object;)Lokio/Path;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 12
    :cond_0
    invoke-virtual {p0, p1, p2}, Lokio/Path;->resolve(Lokio/Path;Z)Lokio/Path;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 17
    check-cast p1, Lokio/Path;

    invoke-virtual {p0, p1}, Lokio/Path;->compareTo(Lokio/Path;)I

    move-result p1

    return p1
.end method

.method public compareTo(Lokio/Path;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p1}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p1}, Lokio/ByteString;->compareTo(Lokio/ByteString;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lokio/Path;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lokio/Path;

    .line 6
    .line 7
    invoke-virtual {p1}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    return p1
.end method

.method public final getBytes$okio()Lokio/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lokio/Path;->bytes:Lokio/ByteString;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRoot()Lokio/Path;
    .locals 4

    .line 1
    invoke-static {p0}, Lokio/internal/-Path;->access$rootLength(Lokio/Path;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v1, Lokio/Path;

    .line 11
    .line 12
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v2, v3, v0}, Lokio/ByteString;->substring(II)Lokio/ByteString;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-direct {v1, v0}, Lokio/Path;-><init>(Lokio/ByteString;)V

    .line 22
    .line 23
    .line 24
    return-object v1
.end method

.method public final getSegments()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lokio/internal/-Path;->access$rootLength(Lokio/Path;)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, -0x1

    .line 11
    const/16 v3, 0x5c

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Lokio/ByteString;->size()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-ge v1, v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2, v1}, Lokio/ByteString;->getByte(I)B

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2}, Lokio/ByteString;->size()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    move v4, v1

    .line 48
    :goto_1
    if-ge v1, v2, :cond_4

    .line 49
    .line 50
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v5, v1}, Lokio/ByteString;->getByte(I)B

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    const/16 v6, 0x2f

    .line 59
    .line 60
    if-eq v5, v6, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {v5, v1}, Lokio/ByteString;->getByte(I)B

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-ne v5, v3, :cond_3

    .line 71
    .line 72
    :cond_2
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-virtual {v5, v4, v1}, Lokio/ByteString;->substring(II)Lokio/ByteString;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    add-int/lit8 v4, v1, 0x1

    .line 84
    .line 85
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v1}, Lokio/ByteString;->size()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-ge v4, v1, :cond_5

    .line 97
    .line 98
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v2}, Lokio/ByteString;->size()I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    invoke-virtual {v1, v4, v2}, Lokio/ByteString;->substring(II)Lokio/ByteString;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_6

    .line 135
    .line 136
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    check-cast v2, Lokio/ByteString;

    .line 141
    .line 142
    invoke-virtual {v2}, Lokio/ByteString;->utf8()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_6
    return-object v1
.end method

.method public final getSegmentsBytes()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lokio/ByteString;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lokio/internal/-Path;->access$rootLength(Lokio/Path;)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, -0x1

    .line 11
    const/16 v3, 0x5c

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Lokio/ByteString;->size()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-ge v1, v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2, v1}, Lokio/ByteString;->getByte(I)B

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2}, Lokio/ByteString;->size()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    move v4, v1

    .line 48
    :goto_1
    if-ge v1, v2, :cond_4

    .line 49
    .line 50
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v5, v1}, Lokio/ByteString;->getByte(I)B

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    const/16 v6, 0x2f

    .line 59
    .line 60
    if-eq v5, v6, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {v5, v1}, Lokio/ByteString;->getByte(I)B

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-ne v5, v3, :cond_3

    .line 71
    .line 72
    :cond_2
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-virtual {v5, v4, v1}, Lokio/ByteString;->substring(II)Lokio/ByteString;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    add-int/lit8 v4, v1, 0x1

    .line 84
    .line 85
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v1}, Lokio/ByteString;->size()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-ge v4, v1, :cond_5

    .line 97
    .line 98
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v2}, Lokio/ByteString;->size()I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    invoke-virtual {v1, v4, v2}, Lokio/ByteString;->substring(II)Lokio/ByteString;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    :cond_5
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lokio/ByteString;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final isAbsolute()Z
    .locals 2

    .line 1
    invoke-static {p0}, Lokio/internal/-Path;->access$rootLength(Lokio/Path;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public final isRelative()Z
    .locals 2

    .line 1
    invoke-static {p0}, Lokio/internal/-Path;->access$rootLength(Lokio/Path;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public final isRoot()Z
    .locals 2

    .line 1
    invoke-static {p0}, Lokio/internal/-Path;->access$rootLength(Lokio/Path;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lokio/ByteString;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokio/Path;->nameBytes()Lokio/ByteString;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lokio/ByteString;->utf8()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final nameBytes()Lokio/ByteString;
    .locals 5

    .line 1
    invoke-static {p0}, Lokio/internal/-Path;->access$getIndexOfLastSlash(Lokio/Path;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    const/4 v2, 0x2

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-static {v1, v0, v3, v2, v4}, Lokio/ByteString;->substring$default(Lokio/ByteString;IIILjava/lang/Object;)Lokio/ByteString;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :cond_0
    invoke-virtual {p0}, Lokio/Path;->volumeLetter()Ljava/lang/Character;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lokio/ByteString;->size()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-ne v0, v2, :cond_1

    .line 37
    .line 38
    sget-object v0, Lokio/ByteString;->EMPTY:Lokio/ByteString;

    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_1
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0
.end method

.method public final normalized()Lokio/Path;
    .locals 3

    .line 1
    sget-object v0, Lokio/Path;->Companion:Lokio/Path$Companion;

    .line 2
    .line 3
    invoke-virtual {p0}, Lokio/Path;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-virtual {v0, v1, v2}, Lokio/Path$Companion;->get(Ljava/lang/String;Z)Lokio/Path;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public final parent()Lokio/Path;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lokio/internal/-Path;->access$getDOT$p()Lokio/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_8

    .line 15
    .line 16
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {}, Lokio/internal/-Path;->access$getSLASH$p()Lokio/ByteString;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_8

    .line 29
    .line 30
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {}, Lokio/internal/-Path;->access$getBACKSLASH$p()Lokio/ByteString;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_8

    .line 43
    .line 44
    invoke-static {p0}, Lokio/internal/-Path;->access$lastSegmentIsDotDot(Lokio/Path;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    goto/16 :goto_0

    .line 51
    .line 52
    :cond_0
    invoke-static {p0}, Lokio/internal/-Path;->access$getIndexOfLastSlash(Lokio/Path;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    const/4 v2, 0x2

    .line 57
    const/4 v3, 0x0

    .line 58
    const/4 v4, 0x1

    .line 59
    if-ne v0, v2, :cond_2

    .line 60
    .line 61
    invoke-virtual {p0}, Lokio/Path;->volumeLetter()Ljava/lang/Character;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    if-eqz v5, :cond_2

    .line 66
    .line 67
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Lokio/ByteString;->size()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    const/4 v2, 0x3

    .line 76
    if-ne v0, v2, :cond_1

    .line 77
    .line 78
    return-object v1

    .line 79
    :cond_1
    new-instance v0, Lokio/Path;

    .line 80
    .line 81
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-static {v5, v3, v2, v4, v1}, Lokio/ByteString;->substring$default(Lokio/ByteString;IIILjava/lang/Object;)Lokio/ByteString;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-direct {v0, v1}, Lokio/Path;-><init>(Lokio/ByteString;)V

    .line 90
    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_2
    if-ne v0, v4, :cond_3

    .line 94
    .line 95
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-static {}, Lokio/internal/-Path;->access$getBACKSLASH$p()Lokio/ByteString;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-virtual {v5, v6}, Lokio/ByteString;->startsWith(Lokio/ByteString;)Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-eqz v5, :cond_3

    .line 108
    .line 109
    return-object v1

    .line 110
    :cond_3
    const/4 v5, -0x1

    .line 111
    if-ne v0, v5, :cond_5

    .line 112
    .line 113
    invoke-virtual {p0}, Lokio/Path;->volumeLetter()Ljava/lang/Character;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    if-eqz v6, :cond_5

    .line 118
    .line 119
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {v0}, Lokio/ByteString;->size()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-ne v0, v2, :cond_4

    .line 128
    .line 129
    return-object v1

    .line 130
    :cond_4
    new-instance v0, Lokio/Path;

    .line 131
    .line 132
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-static {v5, v3, v2, v4, v1}, Lokio/ByteString;->substring$default(Lokio/ByteString;IIILjava/lang/Object;)Lokio/ByteString;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-direct {v0, v1}, Lokio/Path;-><init>(Lokio/ByteString;)V

    .line 141
    .line 142
    .line 143
    return-object v0

    .line 144
    :cond_5
    if-ne v0, v5, :cond_6

    .line 145
    .line 146
    new-instance v0, Lokio/Path;

    .line 147
    .line 148
    invoke-static {}, Lokio/internal/-Path;->access$getDOT$p()Lokio/ByteString;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-direct {v0, v1}, Lokio/Path;-><init>(Lokio/ByteString;)V

    .line 153
    .line 154
    .line 155
    return-object v0

    .line 156
    :cond_6
    if-nez v0, :cond_7

    .line 157
    .line 158
    new-instance v0, Lokio/Path;

    .line 159
    .line 160
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-static {v2, v3, v4, v4, v1}, Lokio/ByteString;->substring$default(Lokio/ByteString;IIILjava/lang/Object;)Lokio/ByteString;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-direct {v0, v1}, Lokio/Path;-><init>(Lokio/ByteString;)V

    .line 169
    .line 170
    .line 171
    return-object v0

    .line 172
    :cond_7
    new-instance v2, Lokio/Path;

    .line 173
    .line 174
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    invoke-static {v5, v3, v0, v4, v1}, Lokio/ByteString;->substring$default(Lokio/ByteString;IIILjava/lang/Object;)Lokio/ByteString;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-direct {v2, v0}, Lokio/Path;-><init>(Lokio/ByteString;)V

    .line 183
    .line 184
    .line 185
    return-object v2

    .line 186
    :cond_8
    :goto_0
    return-object v1
.end method

.method public final relativeTo(Lokio/Path;)Lokio/Path;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lokio/Path;->getRoot()Lokio/Path;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p1}, Lokio/Path;->getRoot()Lokio/Path;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_6

    .line 17
    .line 18
    invoke-virtual {p0}, Lokio/Path;->getSegmentsBytes()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1}, Lokio/Path;->getSegmentsBytes()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    const/4 v3, 0x0

    .line 39
    move v4, v3

    .line 40
    :goto_0
    if-ge v4, v2, :cond_0

    .line 41
    .line 42
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_0

    .line 55
    .line 56
    add-int/lit8 v4, v4, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    if-ne v4, v2, :cond_1

    .line 60
    .line 61
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v2}, Lokio/ByteString;->size()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-virtual {p1}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v5}, Lokio/ByteString;->size()I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-ne v2, v5, :cond_1

    .line 78
    .line 79
    sget-object p1, Lokio/Path;->Companion:Lokio/Path$Companion;

    .line 80
    .line 81
    const-string v0, "."

    .line 82
    .line 83
    const/4 v1, 0x0

    .line 84
    const/4 v2, 0x1

    .line 85
    invoke-static {p1, v0, v3, v2, v1}, Lokio/Path$Companion;->get$default(Lokio/Path$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lokio/Path;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    return-object p1

    .line 90
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    invoke-interface {v1, v4, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-static {}, Lokio/internal/-Path;->access$getDOT_DOT$p()Lokio/ByteString;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-interface {v2, v5}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    const/4 v5, -0x1

    .line 107
    if-ne v2, v5, :cond_5

    .line 108
    .line 109
    new-instance v2, Lokio/Buffer;

    .line 110
    .line 111
    invoke-direct {v2}, Lokio/Buffer;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-static {p1}, Lokio/internal/-Path;->access$getSlash(Lokio/Path;)Lokio/ByteString;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    if-nez p1, :cond_2

    .line 119
    .line 120
    invoke-static {p0}, Lokio/internal/-Path;->access$getSlash(Lokio/Path;)Lokio/ByteString;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    if-nez p1, :cond_2

    .line 125
    .line 126
    sget-object p1, Lokio/Path;->DIRECTORY_SEPARATOR:Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {p1}, Lokio/internal/-Path;->access$toSlash(Ljava/lang/String;)Lokio/ByteString;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    move v5, v4

    .line 137
    :goto_1
    if-ge v5, v1, :cond_3

    .line 138
    .line 139
    invoke-static {}, Lokio/internal/-Path;->access$getDOT_DOT$p()Lokio/ByteString;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    invoke-virtual {v2, v6}, Lokio/Buffer;->write(Lokio/ByteString;)Lokio/Buffer;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, p1}, Lokio/Buffer;->write(Lokio/ByteString;)Lokio/Buffer;

    .line 147
    .line 148
    .line 149
    add-int/lit8 v5, v5, 0x1

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    :goto_2
    if-ge v4, v1, :cond_4

    .line 157
    .line 158
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    check-cast v5, Lokio/ByteString;

    .line 163
    .line 164
    invoke-virtual {v2, v5}, Lokio/Buffer;->write(Lokio/ByteString;)Lokio/Buffer;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, p1}, Lokio/Buffer;->write(Lokio/ByteString;)Lokio/Buffer;

    .line 168
    .line 169
    .line 170
    add-int/lit8 v4, v4, 0x1

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_4
    invoke-static {v2, v3}, Lokio/internal/-Path;->toPath(Lokio/Buffer;Z)Lokio/Path;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    return-object p1

    .line 178
    :cond_5
    const-string v0, "Impossible relative path to resolve: "

    .line 179
    .line 180
    invoke-static {p0, v0, p1}, Lj8/o;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    const/4 p1, 0x0

    .line 184
    return-object p1

    .line 185
    :cond_6
    const-string v0, "Paths of different roots cannot be relative to each other: "

    .line 186
    .line 187
    invoke-static {p0, v0, p1}, Lj8/o;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    const/4 p1, 0x0

    .line 191
    return-object p1
.end method

.method public final resolve(Ljava/lang/String;)Lokio/Path;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lokio/Buffer;

    .line 5
    .line 6
    invoke-direct {v0}, Lokio/Buffer;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lokio/Buffer;->writeUtf8(Ljava/lang/String;)Lokio/Buffer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-static {p1, v0}, Lokio/internal/-Path;->toPath(Lokio/Buffer;Z)Lokio/Path;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p0, p1, v0}, Lokio/internal/-Path;->commonResolve(Lokio/Path;Lokio/Path;Z)Lokio/Path;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method public final resolve(Ljava/lang/String;Z)Lokio/Path;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    new-instance v0, Lokio/Buffer;

    invoke-direct {v0}, Lokio/Buffer;-><init>()V

    invoke-virtual {v0, p1}, Lokio/Buffer;->writeUtf8(Ljava/lang/String;)Lokio/Buffer;

    move-result-object p1

    const/4 v0, 0x0

    .line 28
    invoke-static {p1, v0}, Lokio/internal/-Path;->toPath(Lokio/Buffer;Z)Lokio/Path;

    move-result-object p1

    invoke-static {p0, p1, p2}, Lokio/internal/-Path;->commonResolve(Lokio/Path;Lokio/Path;Z)Lokio/Path;

    move-result-object p1

    return-object p1
.end method

.method public final resolve(Lokio/ByteString;)Lokio/Path;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    new-instance v0, Lokio/Buffer;

    invoke-direct {v0}, Lokio/Buffer;-><init>()V

    invoke-virtual {v0, p1}, Lokio/Buffer;->write(Lokio/ByteString;)Lokio/Buffer;

    move-result-object p1

    const/4 v0, 0x0

    .line 26
    invoke-static {p1, v0}, Lokio/internal/-Path;->toPath(Lokio/Buffer;Z)Lokio/Path;

    move-result-object p1

    invoke-static {p0, p1, v0}, Lokio/internal/-Path;->commonResolve(Lokio/Path;Lokio/Path;Z)Lokio/Path;

    move-result-object p1

    return-object p1
.end method

.method public final resolve(Lokio/ByteString;Z)Lokio/Path;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    new-instance v0, Lokio/Buffer;

    invoke-direct {v0}, Lokio/Buffer;-><init>()V

    invoke-virtual {v0, p1}, Lokio/Buffer;->write(Lokio/ByteString;)Lokio/Buffer;

    move-result-object p1

    const/4 v0, 0x0

    .line 30
    invoke-static {p1, v0}, Lokio/internal/-Path;->toPath(Lokio/Buffer;Z)Lokio/Path;

    move-result-object p1

    invoke-static {p0, p1, p2}, Lokio/internal/-Path;->commonResolve(Lokio/Path;Lokio/Path;Z)Lokio/Path;

    move-result-object p1

    return-object p1
.end method

.method public final resolve(Lokio/Path;)Lokio/Path;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 24
    invoke-static {p0, p1, v0}, Lokio/internal/-Path;->commonResolve(Lokio/Path;Lokio/Path;Z)Lokio/Path;

    move-result-object p1

    return-object p1
.end method

.method public final resolve(Lokio/Path;Z)Lokio/Path;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    invoke-static {p0, p1, p2}, Lokio/internal/-Path;->commonResolve(Lokio/Path;Lokio/Path;Z)Lokio/Path;

    move-result-object p1

    return-object p1
.end method

.method public final toFile()Ljava/io/File;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Lokio/Path;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final toNioPath()Ljava/nio/file/Path;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lokio/Path;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v1, v1, [Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v0, v1}, Ljava/nio/file/Paths;->get(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lokio/ByteString;->utf8()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final volumeLetter()Ljava/lang/Character;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lokio/internal/-Path;->access$getSLASH$p()Lokio/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x2

    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-static {v0, v1, v2, v3, v4}, Lokio/ByteString;->indexOf$default(Lokio/ByteString;Lokio/ByteString;IILjava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, -0x1

    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    return-object v4

    .line 20
    :cond_0
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lokio/ByteString;->size()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-ge v0, v3, :cond_1

    .line 29
    .line 30
    return-object v4

    .line 31
    :cond_1
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-virtual {v0, v1}, Lokio/ByteString;->getByte(I)B

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/16 v1, 0x3a

    .line 41
    .line 42
    if-eq v0, v1, :cond_2

    .line 43
    .line 44
    return-object v4

    .line 45
    :cond_2
    invoke-virtual {p0}, Lokio/Path;->getBytes$okio()Lokio/ByteString;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0, v2}, Lokio/ByteString;->getByte(I)B

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    int-to-char v0, v0

    .line 54
    const/16 v1, 0x61

    .line 55
    .line 56
    if-gt v1, v0, :cond_3

    .line 57
    .line 58
    const/16 v1, 0x7b

    .line 59
    .line 60
    if-ge v0, v1, :cond_3

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    const/16 v1, 0x41

    .line 64
    .line 65
    if-gt v1, v0, :cond_4

    .line 66
    .line 67
    const/16 v1, 0x5b

    .line 68
    .line 69
    if-ge v0, v1, :cond_4

    .line 70
    .line 71
    :goto_0
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0

    .line 76
    :cond_4
    return-object v4
.end method
