.class public abstract Lyyds/ᛴᛲᛲᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public ᛱᛳᲇ:Lyyds/ᛲᛷᲈᛴ;

.field public ᛱᲈᲁ:Z

.field public ᛲᛲᲈᲈ:Lyyds/ᛴᛳᲀᲈ;

.field public ᛲᛳᛶᲁ:I

.field public ᛲᛴᛳᛲ:Lyyds/ᛲᛲᲀᲈ;

.field public ᛳᲁᲁᲇ:Ljava/lang/Class;

.field public ᛵᛶᛲᲀ:Z

.field public ᛶᛳᛶᛵ:Z

.field public ᛶᛷᛲᲁ:I

.field public ᛷᛲᲈᛱ:Lyyds/ᛶᲀᛶᲀ;

.field public ᛷᛵᲇᲀ:Z

.field public ᛷᲈᲈᲁ:I

.field public ᲀᛲᛲᲇ:Z

.field public ᲀᛲᛳᲀ:I

.field public ᲇᛱᛲ:Z

.field public ᲇᲇᲇᛱ:I

.field public ᲇᲈᛵᛷ:Lyyds/ᲁᲁᲇᛷ;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lyyds/ᲁᲁᲇᛷ;->ᛲᛴᛳᛲ:Lyyds/ᲁᲁᲇᛷ;

    .line 5
    .line 6
    iput-object v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᲁᲇᛷ;

    .line 7
    .line 8
    sget-object v0, Lyyds/ᛲᛲᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛲᲀᲈ;

    .line 9
    .line 10
    iput-object v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛲᲀᲈ;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ:Z

    .line 14
    .line 15
    const/4 v1, -0x1

    .line 16
    iput v1, p0, Lyyds/ᛴᛲᛲᛷ;->ᛲᛳᛶᲁ:I

    .line 17
    .line 18
    iput v1, p0, Lyyds/ᛴᛲᛲᛷ;->ᛷᲈᲈᲁ:I

    .line 19
    .line 20
    sget-object v1, Lyyds/ᛴᛶᛸᛳ;->ᛵᛸᛸᛷ:Lyyds/ᛴᛶᛸᛳ;

    .line 21
    .line 22
    iput-object v1, p0, Lyyds/ᛴᛲᛲᛷ;->ᛷᛲᲈᛱ:Lyyds/ᛶᲀᛶᲀ;

    .line 23
    .line 24
    new-instance v1, Lyyds/ᛴᛳᲀᲈ;

    .line 25
    .line 26
    invoke-direct {v1}, Lyyds/ᛴᛳᲀᲈ;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ:Lyyds/ᛴᛳᲀᲈ;

    .line 30
    .line 31
    new-instance v1, Lyyds/ᛲᛷᲈᛴ;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-direct {v1, v2}, Lyyds/ᛴᲈᛲᛷ;-><init>(I)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lyyds/ᛴᛲᛲᛷ;->ᛱᛳᲇ:Lyyds/ᛲᛷᲈᛴ;

    .line 38
    .line 39
    const-class v1, Ljava/lang/Object;

    .line 40
    .line 41
    iput-object v1, p0, Lyyds/ᛴᛲᛲᛷ;->ᛳᲁᲁᲇ:Ljava/lang/Class;

    .line 42
    .line 43
    iput-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛵᛶᛲᲀ:Z

    .line 44
    .line 45
    return-void
.end method

.method public static ᛱᲈᲁ(II)Z
    .locals 0

    .line 1
    and-int/2addr p0, p1

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0

    .line 6
    :cond_0
    const/4 p0, 0x0

    .line 7
    return p0
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ()Lyyds/ᛴᛲᛲᛷ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lyyds/ᛴᛲᛲᛷ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lyyds/ᛴᛲᛲᛷ;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lyyds/ᛴᛲᛲᛷ;->ᛶᛷᛲᲁ(Lyyds/ᛴᛲᛲᛷ;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1, v0}, Lyyds/ᛱᛷᲈᛲ;->ᛷᲈᲈᲁ(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, Lyyds/ᛴᛲᛲᛷ;->ᲇᲇᲇᛱ:I

    .line 14
    .line 15
    invoke-static {v1, v0}, Lyyds/ᛱᛷᲈᛲ;->ᛷᲈᲈᲁ(II)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-static {v0, v1}, Lyyds/ᛱᛷᲈᛲ;->ᛷᛲᲈᛱ(ILjava/lang/Object;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget v2, p0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛷᛲᲁ:I

    .line 25
    .line 26
    invoke-static {v2, v0}, Lyyds/ᛱᛷᲈᛲ;->ᛷᲈᲈᲁ(II)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-static {v0, v1}, Lyyds/ᛱᛷᲈᛲ;->ᛷᛲᲈᛱ(ILjava/lang/Object;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-static {v2, v0}, Lyyds/ᛱᛷᲈᛲ;->ᛷᲈᲈᲁ(II)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-static {v0, v1}, Lyyds/ᛱᛷᲈᛲ;->ᛷᛲᲈᛱ(ILjava/lang/Object;)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget-boolean v3, p0, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ:Z

    .line 44
    .line 45
    invoke-static {v3, v0}, Lyyds/ᛱᛷᲈᛲ;->ᛷᲈᲈᲁ(II)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget v3, p0, Lyyds/ᛴᛲᛲᛷ;->ᛲᛳᛶᲁ:I

    .line 50
    .line 51
    invoke-static {v3, v0}, Lyyds/ᛱᛷᲈᛲ;->ᛷᲈᲈᲁ(II)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iget v3, p0, Lyyds/ᛴᛲᛲᛷ;->ᛷᲈᲈᲁ:I

    .line 56
    .line 57
    invoke-static {v3, v0}, Lyyds/ᛱᛷᲈᛲ;->ᛷᲈᲈᲁ(II)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget-boolean v3, p0, Lyyds/ᛴᛲᛲᛷ;->ᛷᛵᲇᲀ:Z

    .line 62
    .line 63
    invoke-static {v3, v0}, Lyyds/ᛱᛷᲈᛲ;->ᛷᲈᲈᲁ(II)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    const/4 v3, 0x1

    .line 68
    invoke-static {v3, v0}, Lyyds/ᛱᛷᲈᛲ;->ᛷᲈᲈᲁ(II)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-static {v2, v0}, Lyyds/ᛱᛷᲈᛲ;->ᛷᲈᲈᲁ(II)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    invoke-static {v2, v0}, Lyyds/ᛱᛷᲈᛲ;->ᛷᲈᲈᲁ(II)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget-object v2, p0, Lyyds/ᛴᛲᛲᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᲁᲇᛷ;

    .line 81
    .line 82
    invoke-static {v0, v2}, Lyyds/ᛱᛷᲈᛲ;->ᛷᛲᲈᛱ(ILjava/lang/Object;)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget-object v2, p0, Lyyds/ᛴᛲᛲᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛲᲀᲈ;

    .line 87
    .line 88
    invoke-static {v0, v2}, Lyyds/ᛱᛷᲈᛲ;->ᛷᛲᲈᛱ(ILjava/lang/Object;)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iget-object v2, p0, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ:Lyyds/ᛴᛳᲀᲈ;

    .line 93
    .line 94
    invoke-static {v0, v2}, Lyyds/ᛱᛷᲈᛲ;->ᛷᛲᲈᛱ(ILjava/lang/Object;)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    iget-object v2, p0, Lyyds/ᛴᛲᛲᛷ;->ᛱᛳᲇ:Lyyds/ᛲᛷᲈᛴ;

    .line 99
    .line 100
    invoke-static {v0, v2}, Lyyds/ᛱᛷᲈᛲ;->ᛷᛲᲈᛱ(ILjava/lang/Object;)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    iget-object v2, p0, Lyyds/ᛴᛲᛲᛷ;->ᛳᲁᲁᲇ:Ljava/lang/Class;

    .line 105
    .line 106
    invoke-static {v0, v2}, Lyyds/ᛱᛷᲈᛲ;->ᛷᛲᲈᛱ(ILjava/lang/Object;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    iget-object p0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛷᛲᲈᛱ:Lyyds/ᛶᲀᛶᲀ;

    .line 111
    .line 112
    invoke-static {v0, p0}, Lyyds/ᛱᛷᲈᛲ;->ᛷᛲᲈᛱ(ILjava/lang/Object;)I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    invoke-static {p0, v1}, Lyyds/ᛱᛷᲈᛲ;->ᛷᛲᲈᛱ(ILjava/lang/Object;)I

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    return p0
.end method

.method public final ᛱᛳᲇ(Lyyds/ᲀᲇᲇᛲ;Ljava/lang/Object;)Lyyds/ᛴᛲᛲᛷ;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ()Lyyds/ᛴᛲᛲᛷ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1, p2}, Lyyds/ᛴᛲᛲᛷ;->ᛱᛳᲇ(Lyyds/ᲀᲇᲇᛲ;Ljava/lang/Object;)Lyyds/ᛴᛲᛲᛷ;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-static {p1}, Lyyds/ᛲᛳᲁ;->ᲀᛲᛳᲀ(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ:Lyyds/ᛴᛳᲀᲈ;

    .line 18
    .line 19
    iget-object v0, v0, Lyyds/ᛴᛳᲀᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛲᛷᲈᛴ;

    .line 20
    .line 21
    invoke-virtual {v0, p1, p2}, Lyyds/ᛲᛷᲈᛴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public final ᛲᛲᲈᲈ()V
    .locals 0

    .line 1
    iget-boolean p0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲇᛱᛲ:Z

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "You cannot modify locked T, consider clone()"

    .line 7
    .line 8
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final ᛲᛳᛶᲁ(Lyyds/ᛶᛱᛸᛳ;Lyyds/ᲀᲈᛷ;)Lyyds/ᛴᛲᛲᛷ;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ()Lyyds/ᛴᛲᛲᛷ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1, p2}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛳᛶᲁ(Lyyds/ᛶᛱᛸᛳ;Lyyds/ᲀᲈᛷ;)Lyyds/ᛴᛲᛲᛷ;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object v0, Lyyds/ᛶᛱᛸᛳ;->ᛶᛷᛲᲁ:Lyyds/ᲀᲇᲇᛲ;

    .line 15
    .line 16
    invoke-virtual {p0, v0, p1}, Lyyds/ᛴᛲᛲᛷ;->ᛱᛳᲇ(Lyyds/ᲀᲇᲇᛲ;Ljava/lang/Object;)Lyyds/ᛴᛲᛲᛷ;

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-virtual {p0, p2, p1}, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛲᲇ(Lyyds/ᛳᛳᛸᲁ;Z)Lyyds/ᛴᛲᛲᛷ;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final ᛲᛴᛳᛲ(Lyyds/ᲁᲁᲇᛷ;)Lyyds/ᛴᛲᛲᛷ;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ()Lyyds/ᛴᛲᛲᛷ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛴᛳᛲ(Lyyds/ᲁᲁᲇᛷ;)Lyyds/ᛴᛲᛲᛷ;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iput-object p1, p0, Lyyds/ᛴᛲᛲᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᲁᲇᛷ;

    .line 15
    .line 16
    iget p1, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 17
    .line 18
    or-int/lit8 p1, p1, 0x4

    .line 19
    .line 20
    iput p1, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 21
    .line 22
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ()V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public ᛲᲈᲁ(Lyyds/ᛴᛲᛲᛷ;)Lyyds/ᛴᛲᛲᛷ;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ()Lyyds/ᛴᛲᛲᛷ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Lyyds/ᛴᛲᛲᛷ;->ᛲᲈᲁ(Lyyds/ᛴᛲᛲᛷ;)Lyyds/ᛴᛲᛲᛷ;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iget v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 15
    .line 16
    iget v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 17
    .line 18
    const/high16 v1, 0x100000

    .line 19
    .line 20
    invoke-static {v0, v1}, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ(II)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-boolean v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛲᲇ:Z

    .line 27
    .line 28
    iput-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛲᲇ:Z

    .line 29
    .line 30
    :cond_1
    iget v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 31
    .line 32
    const/4 v1, 0x4

    .line 33
    invoke-static {v0, v1}, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ(II)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᲁᲇᛷ;

    .line 40
    .line 41
    iput-object v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᲁᲇᛷ;

    .line 42
    .line 43
    :cond_2
    iget v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 44
    .line 45
    const/16 v1, 0x8

    .line 46
    .line 47
    invoke-static {v0, v1}, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ(II)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    iget-object v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛲᲀᲈ;

    .line 54
    .line 55
    iput-object v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛲᲀᲈ;

    .line 56
    .line 57
    :cond_3
    iget v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 58
    .line 59
    const/16 v1, 0x10

    .line 60
    .line 61
    invoke-static {v0, v1}, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ(II)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const/4 v1, 0x0

    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    iput v1, p0, Lyyds/ᛴᛲᛲᛷ;->ᲇᲇᲇᛱ:I

    .line 69
    .line 70
    iget v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 71
    .line 72
    and-int/lit8 v0, v0, -0x21

    .line 73
    .line 74
    iput v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 75
    .line 76
    :cond_4
    iget v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 77
    .line 78
    const/16 v2, 0x20

    .line 79
    .line 80
    invoke-static {v0, v2}, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ(II)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    iget v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᲇᲇᲇᛱ:I

    .line 87
    .line 88
    iput v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲇᲇᲇᛱ:I

    .line 89
    .line 90
    iget v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 91
    .line 92
    and-int/lit8 v0, v0, -0x11

    .line 93
    .line 94
    iput v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 95
    .line 96
    :cond_5
    iget v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 97
    .line 98
    const/16 v2, 0x40

    .line 99
    .line 100
    invoke-static {v0, v2}, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ(II)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_6

    .line 105
    .line 106
    iput v1, p0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛷᛲᲁ:I

    .line 107
    .line 108
    iget v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 109
    .line 110
    and-int/lit16 v0, v0, -0x81

    .line 111
    .line 112
    iput v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 113
    .line 114
    :cond_6
    iget v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 115
    .line 116
    const/16 v1, 0x80

    .line 117
    .line 118
    invoke-static {v0, v1}, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ(II)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    iget v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᛶᛷᛲᲁ:I

    .line 125
    .line 126
    iput v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛷᛲᲁ:I

    .line 127
    .line 128
    iget v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 129
    .line 130
    and-int/lit8 v0, v0, -0x41

    .line 131
    .line 132
    iput v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 133
    .line 134
    :cond_7
    iget v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 135
    .line 136
    const/16 v1, 0x100

    .line 137
    .line 138
    invoke-static {v0, v1}, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ(II)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_8

    .line 143
    .line 144
    iget-boolean v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ:Z

    .line 145
    .line 146
    iput-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ:Z

    .line 147
    .line 148
    :cond_8
    iget v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 149
    .line 150
    const/16 v1, 0x200

    .line 151
    .line 152
    invoke-static {v0, v1}, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ(II)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_9

    .line 157
    .line 158
    iget v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᛷᲈᲈᲁ:I

    .line 159
    .line 160
    iput v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛷᲈᲈᲁ:I

    .line 161
    .line 162
    iget v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᛲᛳᛶᲁ:I

    .line 163
    .line 164
    iput v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛲᛳᛶᲁ:I

    .line 165
    .line 166
    :cond_9
    iget v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 167
    .line 168
    const/16 v1, 0x400

    .line 169
    .line 170
    invoke-static {v0, v1}, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ(II)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_a

    .line 175
    .line 176
    iget-object v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᛷᛲᲈᛱ:Lyyds/ᛶᲀᛶᲀ;

    .line 177
    .line 178
    iput-object v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛷᛲᲈᛱ:Lyyds/ᛶᲀᛶᲀ;

    .line 179
    .line 180
    :cond_a
    iget v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 181
    .line 182
    const/16 v1, 0x1000

    .line 183
    .line 184
    invoke-static {v0, v1}, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ(II)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-eqz v0, :cond_b

    .line 189
    .line 190
    iget-object v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᛳᲁᲁᲇ:Ljava/lang/Class;

    .line 191
    .line 192
    iput-object v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛳᲁᲁᲇ:Ljava/lang/Class;

    .line 193
    .line 194
    :cond_b
    iget v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 195
    .line 196
    const/16 v1, 0x2000

    .line 197
    .line 198
    invoke-static {v0, v1}, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ(II)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_c

    .line 203
    .line 204
    iget v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 205
    .line 206
    and-int/lit16 v0, v0, -0x4001

    .line 207
    .line 208
    iput v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 209
    .line 210
    :cond_c
    iget v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 211
    .line 212
    const/16 v1, 0x4000

    .line 213
    .line 214
    invoke-static {v0, v1}, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ(II)Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-eqz v0, :cond_d

    .line 219
    .line 220
    iget v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 221
    .line 222
    and-int/lit16 v0, v0, -0x2001

    .line 223
    .line 224
    iput v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 225
    .line 226
    :cond_d
    iget v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 227
    .line 228
    const/high16 v1, 0x20000

    .line 229
    .line 230
    invoke-static {v0, v1}, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ(II)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_e

    .line 235
    .line 236
    iget-boolean v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᛷᛵᲇᲀ:Z

    .line 237
    .line 238
    iput-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛷᛵᲇᲀ:Z

    .line 239
    .line 240
    :cond_e
    iget v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 241
    .line 242
    const/16 v1, 0x800

    .line 243
    .line 244
    invoke-static {v0, v1}, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ(II)Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-eqz v0, :cond_f

    .line 249
    .line 250
    iget-object v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛱᛳᲇ:Lyyds/ᛲᛷᲈᛴ;

    .line 251
    .line 252
    iget-object v1, p1, Lyyds/ᛴᛲᛲᛷ;->ᛱᛳᲇ:Lyyds/ᛲᛷᲈᛴ;

    .line 253
    .line 254
    invoke-virtual {v0, v1}, Lyyds/ᛷᛲᲇᲀ;->putAll(Ljava/util/Map;)V

    .line 255
    .line 256
    .line 257
    iget-boolean v0, p1, Lyyds/ᛴᛲᛲᛷ;->ᛵᛶᛲᲀ:Z

    .line 258
    .line 259
    iput-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛵᛶᛲᲀ:Z

    .line 260
    .line 261
    :cond_f
    iget v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 262
    .line 263
    iget v1, p1, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 264
    .line 265
    or-int/2addr v0, v1

    .line 266
    iput v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 267
    .line 268
    iget-object v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ:Lyyds/ᛴᛳᲀᲈ;

    .line 269
    .line 270
    iget-object p1, p1, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ:Lyyds/ᛴᛳᲀᲈ;

    .line 271
    .line 272
    iget-object v0, v0, Lyyds/ᛴᛳᲀᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛲᛷᲈᛴ;

    .line 273
    .line 274
    iget-object p1, p1, Lyyds/ᛴᛳᲀᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛲᛷᲈᛴ;

    .line 275
    .line 276
    invoke-virtual {v0, p1}, Lyyds/ᛲᛷᲈᛴ;->ᛶᛷᛲᲁ(Lyyds/ᛷᛲᲇᲀ;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ()V

    .line 280
    .line 281
    .line 282
    return-object p0
.end method

.method public final ᛳᛸᛴᛶ()Lyyds/ᛴᛲᛲᛷ;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ()Lyyds/ᛴᛲᛲᛷ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᛳᛸᛴᛶ()Lyyds/ᛴᛲᛲᛷ;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛲᲇ:Z

    .line 16
    .line 17
    iget v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 18
    .line 19
    const/high16 v1, 0x100000

    .line 20
    .line 21
    or-int/2addr v0, v1

    .line 22
    iput v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 23
    .line 24
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public final ᛳᲁᲁᲇ(Lyyds/ᛸᛷᛴᲁ;)Lyyds/ᛴᛲᛲᛷ;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ()Lyyds/ᛴᛲᛲᛷ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Lyyds/ᛴᛲᛲᛷ;->ᛳᲁᲁᲇ(Lyyds/ᛸᛷᛴᲁ;)Lyyds/ᛴᛲᛲᛷ;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iput-object p1, p0, Lyyds/ᛴᛲᛲᛷ;->ᛷᛲᲈᛱ:Lyyds/ᛶᲀᛶᲀ;

    .line 15
    .line 16
    iget p1, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 17
    .line 18
    or-int/lit16 p1, p1, 0x400

    .line 19
    .line 20
    iput p1, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 21
    .line 22
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ()V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public final ᛵᛶᛲᲀ(Lyyds/ᛶᛱᛸᛳ;Lyyds/ᲀᲈᛷ;)Lyyds/ᛴᛲᛲᛷ;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ()Lyyds/ᛴᛲᛲᛷ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1, p2}, Lyyds/ᛴᛲᛲᛷ;->ᛵᛶᛲᲀ(Lyyds/ᛶᛱᛸᛳ;Lyyds/ᲀᲈᛷ;)Lyyds/ᛴᛲᛲᛷ;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object v0, Lyyds/ᛶᛱᛸᛳ;->ᛶᛷᛲᲁ:Lyyds/ᲀᲇᲇᛲ;

    .line 15
    .line 16
    invoke-virtual {p0, v0, p1}, Lyyds/ᛴᛲᛲᛷ;->ᛱᛳᲇ(Lyyds/ᲀᲇᲇᛲ;Ljava/lang/Object;)Lyyds/ᛴᛲᛲᛷ;

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-virtual {p0, p2, p1}, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛲᲇ(Lyyds/ᛳᛳᛸᲁ;Z)Lyyds/ᛴᛲᛲᛷ;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final ᛵᛸᛸᛷ()Lyyds/ᛴᛲᛲᛷ;
    .locals 2

    .line 1
    sget-object v0, Lyyds/ᛶᛱᛸᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛱᛸᛳ;

    .line 2
    .line 3
    new-instance v1, Lyyds/ᛸᛳᛴᲁ;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0, v1}, Lyyds/ᛴᛲᛲᛷ;->ᛵᛶᛲᲀ(Lyyds/ᛶᛱᛸᛳ;Lyyds/ᲀᲈᛷ;)Lyyds/ᛴᛲᛲᛷ;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final ᛶᛳᛶᛵ(Ljava/lang/Class;Lyyds/ᛳᛳᛸᲁ;Z)Lyyds/ᛴᛲᛲᛷ;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ()Lyyds/ᛴᛲᛲᛷ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1, p2, p3}, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ(Ljava/lang/Class;Lyyds/ᛳᛳᛸᲁ;Z)Lyyds/ᛴᛲᛲᛷ;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-static {p2}, Lyyds/ᛲᛳᲁ;->ᲀᛲᛳᲀ(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛱᛳᲇ:Lyyds/ᛲᛷᲈᛴ;

    .line 18
    .line 19
    invoke-virtual {v0, p1, p2}, Lyyds/ᛲᛷᲈᛴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iget p1, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 23
    .line 24
    const p2, 0x10800

    .line 25
    .line 26
    .line 27
    or-int/2addr p2, p1

    .line 28
    iput p2, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 29
    .line 30
    const/4 p2, 0x0

    .line 31
    iput-boolean p2, p0, Lyyds/ᛴᛲᛲᛷ;->ᛵᛶᛲᲀ:Z

    .line 32
    .line 33
    if-eqz p3, :cond_1

    .line 34
    .line 35
    const p2, 0x30800

    .line 36
    .line 37
    .line 38
    or-int/2addr p1, p2

    .line 39
    iput p1, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    iput-boolean p1, p0, Lyyds/ᛴᛲᛲᛷ;->ᛷᛵᲇᲀ:Z

    .line 43
    .line 44
    :cond_1
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ()V

    .line 45
    .line 46
    .line 47
    return-object p0
.end method

.method public final ᛶᛷᛲᲁ(Lyyds/ᛴᛲᛲᛷ;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲇᲇᲇᛱ:I

    .line 13
    .line 14
    iget v1, p1, Lyyds/ᛴᛲᛲᛷ;->ᲇᲇᲇᛱ:I

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    iget v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛷᛲᲁ:I

    .line 19
    .line 20
    iget v1, p1, Lyyds/ᛴᛲᛲᛷ;->ᛶᛷᛲᲁ:I

    .line 21
    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    iget-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ:Z

    .line 25
    .line 26
    iget-boolean v1, p1, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ:Z

    .line 27
    .line 28
    if-ne v0, v1, :cond_0

    .line 29
    .line 30
    iget v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛲᛳᛶᲁ:I

    .line 31
    .line 32
    iget v1, p1, Lyyds/ᛴᛲᛲᛷ;->ᛲᛳᛶᲁ:I

    .line 33
    .line 34
    if-ne v0, v1, :cond_0

    .line 35
    .line 36
    iget v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛷᲈᲈᲁ:I

    .line 37
    .line 38
    iget v1, p1, Lyyds/ᛴᛲᛲᛷ;->ᛷᲈᲈᲁ:I

    .line 39
    .line 40
    if-ne v0, v1, :cond_0

    .line 41
    .line 42
    iget-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛷᛵᲇᲀ:Z

    .line 43
    .line 44
    iget-boolean v1, p1, Lyyds/ᛴᛲᛲᛷ;->ᛷᛵᲇᲀ:Z

    .line 45
    .line 46
    if-ne v0, v1, :cond_0

    .line 47
    .line 48
    iget-object v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᲁᲇᛷ;

    .line 49
    .line 50
    iget-object v1, p1, Lyyds/ᛴᛲᛲᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᲁᲇᛷ;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    iget-object v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛲᲀᲈ;

    .line 59
    .line 60
    iget-object v1, p1, Lyyds/ᛴᛲᛲᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛲᲀᲈ;

    .line 61
    .line 62
    if-ne v0, v1, :cond_0

    .line 63
    .line 64
    iget-object v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ:Lyyds/ᛴᛳᲀᲈ;

    .line 65
    .line 66
    iget-object v1, p1, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ:Lyyds/ᛴᛳᲀᲈ;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Lyyds/ᛴᛳᲀᲈ;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_0

    .line 73
    .line 74
    iget-object v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛱᛳᲇ:Lyyds/ᛲᛷᲈᛴ;

    .line 75
    .line 76
    iget-object v1, p1, Lyyds/ᛴᛲᛲᛷ;->ᛱᛳᲇ:Lyyds/ᛲᛷᲈᛴ;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Lyyds/ᛴᲈᛲᛷ;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_0

    .line 83
    .line 84
    iget-object v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛳᲁᲁᲇ:Ljava/lang/Class;

    .line 85
    .line 86
    iget-object v1, p1, Lyyds/ᛴᛲᛲᛷ;->ᛳᲁᲁᲇ:Ljava/lang/Class;

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_0

    .line 93
    .line 94
    iget-object p0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛷᛲᲈᛱ:Lyyds/ᛶᲀᛶᲀ;

    .line 95
    .line 96
    iget-object p1, p1, Lyyds/ᛴᛲᛲᛷ;->ᛷᛲᲈᛱ:Lyyds/ᛶᲀᛶᲀ;

    .line 97
    .line 98
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    if-eqz p0, :cond_0

    .line 103
    .line 104
    const/4 p0, 0x1

    .line 105
    return p0

    .line 106
    :cond_0
    const/4 p0, 0x0

    .line 107
    return p0
.end method

.method public final ᛷᛲᲈᛱ()Lyyds/ᛴᛲᛲᛷ;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ()Lyyds/ᛴᛲᛲᛷ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᛷᛲᲈᛱ()Lyyds/ᛴᛲᛲᛷ;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const v0, 0x660801be

    .line 15
    .line 16
    .line 17
    iput v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛷᛲᲁ:I

    .line 18
    .line 19
    iget v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 20
    .line 21
    or-int/lit16 v0, v0, 0x80

    .line 22
    .line 23
    and-int/lit8 v0, v0, -0x41

    .line 24
    .line 25
    iput v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 26
    .line 27
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ()V

    .line 28
    .line 29
    .line 30
    return-object p0
.end method

.method public final ᛷᛵᲇᲀ()Lyyds/ᛴᛲᛲᛷ;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ()Lyyds/ᛴᛲᛲᛷ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᛷᛵᲇᲀ()Lyyds/ᛴᛲᛲᛷ;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object v0, Lyyds/ᛲᛲᲀᲈ;->ᲇᲇᲇᛱ:Lyyds/ᛲᛲᲀᲈ;

    .line 15
    .line 16
    iput-object v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛲᲀᲈ;

    .line 17
    .line 18
    iget v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 19
    .line 20
    or-int/lit8 v0, v0, 0x8

    .line 21
    .line 22
    iput v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 23
    .line 24
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public final ᛷᲈᲈᲁ(II)Lyyds/ᛴᛲᛲᛷ;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ()Lyyds/ᛴᛲᛲᛷ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1, p2}, Lyyds/ᛴᛲᛲᛷ;->ᛷᲈᲈᲁ(II)Lyyds/ᛴᛲᛲᛷ;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iput p1, p0, Lyyds/ᛴᛲᛲᛷ;->ᛷᲈᲈᲁ:I

    .line 15
    .line 16
    iput p2, p0, Lyyds/ᛴᛲᛲᛷ;->ᛲᛳᛶᲁ:I

    .line 17
    .line 18
    iget p1, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 19
    .line 20
    or-int/lit16 p1, p1, 0x200

    .line 21
    .line 22
    iput p1, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 23
    .line 24
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public final ᲀᛲᛲᲇ(Lyyds/ᛳᛳᛸᲁ;Z)Lyyds/ᛴᛲᛲᛷ;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ()Lyyds/ᛴᛲᛲᛷ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1, p2}, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛲᲇ(Lyyds/ᛳᛳᛸᲁ;Z)Lyyds/ᛴᛲᛲᛷ;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance v0, Lyyds/ᛲᲁᛳᛴ;

    .line 15
    .line 16
    invoke-direct {v0, p1, p2}, Lyyds/ᛲᲁᛳᛴ;-><init>(Lyyds/ᛳᛳᛸᲁ;Z)V

    .line 17
    .line 18
    .line 19
    const-class v1, Landroid/graphics/Bitmap;

    .line 20
    .line 21
    invoke-virtual {p0, v1, p1, p2}, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ(Ljava/lang/Class;Lyyds/ᛳᛳᛸᲁ;Z)Lyyds/ᛴᛲᛲᛷ;

    .line 22
    .line 23
    .line 24
    const-class v1, Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    invoke-virtual {p0, v1, v0, p2}, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ(Ljava/lang/Class;Lyyds/ᛳᛳᛸᲁ;Z)Lyyds/ᛴᛲᛲᛷ;

    .line 27
    .line 28
    .line 29
    const-class v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 30
    .line 31
    invoke-virtual {p0, v1, v0, p2}, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ(Ljava/lang/Class;Lyyds/ᛳᛳᛸᲁ;Z)Lyyds/ᛴᛲᛲᛷ;

    .line 32
    .line 33
    .line 34
    new-instance v0, Lyyds/ᛳᲇᛷᲈ;

    .line 35
    .line 36
    invoke-direct {v0, p1}, Lyyds/ᛳᲇᛷᲈ;-><init>(Lyyds/ᛳᛳᛸᲁ;)V

    .line 37
    .line 38
    .line 39
    const-class p1, Lyyds/ᲇᛱᛴᛲ;

    .line 40
    .line 41
    invoke-virtual {p0, p1, v0, p2}, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ(Ljava/lang/Class;Lyyds/ᛳᛳᛸᲁ;Z)Lyyds/ᛴᛲᛲᛷ;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ()V

    .line 45
    .line 46
    .line 47
    return-object p0
.end method

.method public ᲀᛲᛳᲀ()Lyyds/ᛴᛲᛲᛷ;
    .locals 3

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lyyds/ᛴᛲᛲᛷ;

    .line 6
    .line 7
    new-instance v1, Lyyds/ᛴᛳᲀᲈ;

    .line 8
    .line 9
    invoke-direct {v1}, Lyyds/ᛴᛳᲀᲈ;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, v0, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ:Lyyds/ᛴᛳᲀᲈ;

    .line 13
    .line 14
    iget-object v2, p0, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ:Lyyds/ᛴᛳᲀᲈ;

    .line 15
    .line 16
    iget-object v1, v1, Lyyds/ᛴᛳᲀᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛲᛷᲈᛴ;

    .line 17
    .line 18
    iget-object v2, v2, Lyyds/ᛴᛳᲀᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛲᛷᲈᛴ;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Lyyds/ᛲᛷᲈᛴ;->ᛶᛷᛲᲁ(Lyyds/ᛷᛲᲇᲀ;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lyyds/ᛲᛷᲈᛴ;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v1, v2}, Lyyds/ᛴᲈᛲᛷ;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iput-object v1, v0, Lyyds/ᛴᛲᛲᛷ;->ᛱᛳᲇ:Lyyds/ᛲᛷᲈᛴ;

    .line 30
    .line 31
    iget-object p0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛱᛳᲇ:Lyyds/ᛲᛷᲈᛴ;

    .line 32
    .line 33
    invoke-virtual {v1, p0}, Lyyds/ᛷᛲᲇᲀ;->putAll(Ljava/util/Map;)V

    .line 34
    .line 35
    .line 36
    iput-boolean v2, v0, Lyyds/ᛴᛲᛲᛷ;->ᲇᛱᛲ:Z

    .line 37
    .line 38
    iput-boolean v2, v0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ:Z
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    return-object v0

    .line 41
    :catch_0
    move-exception p0

    .line 42
    new-instance v0, Ljava/lang/RuntimeException;

    .line 43
    .line 44
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    throw v0
.end method

.method public final ᲇᛱᛲ()Lyyds/ᛴᛲᛲᛷ;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ()Lyyds/ᛴᛲᛲᛷ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᲇᛱᛲ()Lyyds/ᛴᛲᛲᛷ;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ:Z

    .line 16
    .line 17
    iget v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 18
    .line 19
    or-int/lit16 v0, v0, 0x100

    .line 20
    .line 21
    iput v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 22
    .line 23
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ()V

    .line 24
    .line 25
    .line 26
    return-object p0
.end method

.method public final ᲇᲇᲇᛱ()Lyyds/ᛴᛲᛲᛷ;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ()Lyyds/ᛴᛲᛲᛷ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᲇᲇᲇᛱ()Lyyds/ᛴᛲᛲᛷ;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const v0, 0x660801be

    .line 15
    .line 16
    .line 17
    iput v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲇᲇᲇᛱ:I

    .line 18
    .line 19
    iget v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 20
    .line 21
    or-int/lit8 v0, v0, 0x20

    .line 22
    .line 23
    and-int/lit8 v0, v0, -0x11

    .line 24
    .line 25
    iput v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 26
    .line 27
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ()V

    .line 28
    .line 29
    .line 30
    return-object p0
.end method

.method public final ᲇᲈᛵᛷ(Ljava/lang/Class;)Lyyds/ᛴᛲᛲᛷ;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ()Lyyds/ᛴᛲᛲᛷ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Lyyds/ᛴᛲᛲᛷ;->ᲇᲈᛵᛷ(Ljava/lang/Class;)Lyyds/ᛴᛲᛲᛷ;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iput-object p1, p0, Lyyds/ᛴᛲᛲᛷ;->ᛳᲁᲁᲇ:Ljava/lang/Class;

    .line 15
    .line 16
    iget p1, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 17
    .line 18
    or-int/lit16 p1, p1, 0x1000

    .line 19
    .line 20
    iput p1, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 21
    .line 22
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ()V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method
