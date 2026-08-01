.class public final Lb7;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lba;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lb7;->b:Ljava/lang/Object;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    move-object p1, v0

    .line 11
    :cond_0
    iput-object p1, p0, Lb7;->c:Ljava/lang/Object;

    .line 12
    .line 13
    iput p2, p0, Lb7;->a:I

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Lz9;Lo4;I)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7;->c:Ljava/lang/Object;

    iput-object p2, p0, Lb7;->b:Ljava/lang/Object;

    iput p3, p0, Lb7;->a:I

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 7

    .line 1
    iget-object v0, p0, Lb7;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo4;

    .line 4
    .line 5
    iget-object v1, v0, Lo4;->c:Ljava/io/Serializable;

    .line 6
    .line 7
    check-cast v1, Ljava/util/HashSet;

    .line 8
    .line 9
    iget-object v2, p0, Lb7;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lz9;

    .line 12
    .line 13
    invoke-static {v2, p1}, Lz9;->b(Lz9;I)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    const-string v3, "V"

    .line 20
    .line 21
    invoke-static {v2, p1}, Lz9;->c(Lz9;I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    sget-object v3, Li5;->l:[Ljava/lang/String;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    :goto_0
    const/4 v5, 0x3

    .line 35
    if-ge v4, v5, :cond_1

    .line 36
    .line 37
    aget-object v5, v3, v4

    .line 38
    .line 39
    invoke-virtual {v2, v5, p2}, Lz9;->d(Ljava/lang/String;I)Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-eqz v5, :cond_0

    .line 44
    .line 45
    invoke-static {v2, p1}, Lz9;->a(Lz9;I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    :goto_1
    iget p0, p0, Lb7;->a:I

    .line 57
    .line 58
    if-ltz p0, :cond_8

    .line 59
    .line 60
    iget-object v3, v2, Lz9;->a:[B

    .line 61
    .line 62
    if-lez p2, :cond_2

    .line 63
    .line 64
    add-int/lit8 v4, p2, 0x10

    .line 65
    .line 66
    array-length v5, v3

    .line 67
    if-le v4, v5, :cond_3

    .line 68
    .line 69
    :cond_2
    const/4 v4, -0x1

    .line 70
    :cond_3
    if-gtz v4, :cond_4

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_4
    add-int/lit8 p2, p2, 0xc

    .line 74
    .line 75
    invoke-virtual {v2, p2}, Lz9;->o(I)I

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    array-length v5, v3

    .line 80
    mul-int/lit8 p2, p2, 0x2

    .line 81
    .line 82
    add-int/2addr p2, v4

    .line 83
    invoke-static {v5, p2}, Ljava/lang/Math;->min(II)I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    :goto_2
    add-int/lit8 v5, v4, 0x3

    .line 88
    .line 89
    if-ge v5, p2, :cond_8

    .line 90
    .line 91
    aget-byte v5, v3, v4

    .line 92
    .line 93
    and-int/lit16 v5, v5, 0xff

    .line 94
    .line 95
    const/16 v6, 0x6e

    .line 96
    .line 97
    if-lt v5, v6, :cond_5

    .line 98
    .line 99
    const/16 v6, 0x72

    .line 100
    .line 101
    if-le v5, v6, :cond_6

    .line 102
    .line 103
    :cond_5
    const/16 v6, 0x74

    .line 104
    .line 105
    if-lt v5, v6, :cond_7

    .line 106
    .line 107
    const/16 v6, 0x78

    .line 108
    .line 109
    if-gt v5, v6, :cond_7

    .line 110
    .line 111
    :cond_6
    add-int/lit8 v5, v4, 0x2

    .line 112
    .line 113
    invoke-virtual {v2, v5}, Lz9;->n(I)I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-ne v5, p0, :cond_7

    .line 118
    .line 119
    invoke-static {v2, p1}, Lz9;->a(Lz9;I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-virtual {v1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    const/4 p0, 0x1

    .line 127
    iput-boolean p0, v0, Lo4;->b:Z

    .line 128
    .line 129
    return-void

    .line 130
    :cond_7
    add-int/lit8 v4, v4, 0x2

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_8
    :goto_3
    return-void
.end method
