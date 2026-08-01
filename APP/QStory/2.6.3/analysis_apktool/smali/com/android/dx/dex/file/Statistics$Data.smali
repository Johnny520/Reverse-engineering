.class Lcom/android/dx/dex/file/Statistics$Data;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/dex/file/Statistics;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Data"
.end annotation


# instance fields
.field private count:I

.field private largestSize:I

.field private final name:Ljava/lang/String;

.field private smallestSize:I

.field private totalSize:I


# direct methods
.method public constructor <init>(Lcom/android/dx/dex/file/Item;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/android/dx/dex/file/Item;->writeSize()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iput-object p2, p0, Lcom/android/dx/dex/file/Statistics$Data;->name:Ljava/lang/String;

    .line 9
    .line 10
    const/4 p2, 0x1

    .line 11
    iput p2, p0, Lcom/android/dx/dex/file/Statistics$Data;->count:I

    .line 12
    .line 13
    iput p1, p0, Lcom/android/dx/dex/file/Statistics$Data;->totalSize:I

    .line 14
    .line 15
    iput p1, p0, Lcom/android/dx/dex/file/Statistics$Data;->largestSize:I

    .line 16
    .line 17
    iput p1, p0, Lcom/android/dx/dex/file/Statistics$Data;->smallestSize:I

    .line 18
    .line 19
    return-void
.end method

.method public static synthetic access$000(Lcom/android/dx/dex/file/Statistics$Data;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/Statistics$Data;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public add(Lcom/android/dx/dex/file/Item;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/file/Item;->writeSize()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget v0, p0, Lcom/android/dx/dex/file/Statistics$Data;->count:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    iput v0, p0, Lcom/android/dx/dex/file/Statistics$Data;->count:I

    .line 10
    .line 11
    iget v0, p0, Lcom/android/dx/dex/file/Statistics$Data;->totalSize:I

    .line 12
    .line 13
    add-int/2addr v0, p1

    .line 14
    iput v0, p0, Lcom/android/dx/dex/file/Statistics$Data;->totalSize:I

    .line 15
    .line 16
    iget v0, p0, Lcom/android/dx/dex/file/Statistics$Data;->largestSize:I

    .line 17
    .line 18
    if-le p1, v0, :cond_0

    .line 19
    .line 20
    iput p1, p0, Lcom/android/dx/dex/file/Statistics$Data;->largestSize:I

    .line 21
    .line 22
    :cond_0
    iget v0, p0, Lcom/android/dx/dex/file/Statistics$Data;->smallestSize:I

    .line 23
    .line 24
    if-ge p1, v0, :cond_1

    .line 25
    .line 26
    iput p1, p0, Lcom/android/dx/dex/file/Statistics$Data;->smallestSize:I

    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public toHuman()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v2, "  "

    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/android/dx/dex/file/Statistics$Data;->name:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v2, ": "

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget v2, p0, Lcom/android/dx/dex/file/Statistics$Data;->count:I

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v2, " item"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget v2, p0, Lcom/android/dx/dex/file/Statistics$Data;->count:I

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    if-ne v2, v3, :cond_0

    .line 37
    .line 38
    const-string v2, ""

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const-string v2, "s"

    .line 42
    .line 43
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v2, "; "

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget v2, p0, Lcom/android/dx/dex/file/Statistics$Data;->totalSize:I

    .line 52
    .line 53
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v2, " bytes total\n"

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget v1, p0, Lcom/android/dx/dex/file/Statistics$Data;->smallestSize:I

    .line 69
    .line 70
    iget v2, p0, Lcom/android/dx/dex/file/Statistics$Data;->largestSize:I

    .line 71
    .line 72
    const-string v3, "    "

    .line 73
    .line 74
    if-ne v1, v2, :cond_1

    .line 75
    .line 76
    new-instance v1, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget p0, p0, Lcom/android/dx/dex/file/Statistics$Data;->smallestSize:I

    .line 82
    .line 83
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string p0, " bytes/item\n"

    .line 87
    .line 88
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    iget v1, p0, Lcom/android/dx/dex/file/Statistics$Data;->totalSize:I

    .line 100
    .line 101
    iget v2, p0, Lcom/android/dx/dex/file/Statistics$Data;->count:I

    .line 102
    .line 103
    div-int/2addr v1, v2

    .line 104
    new-instance v2, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iget v3, p0, Lcom/android/dx/dex/file/Statistics$Data;->smallestSize:I

    .line 110
    .line 111
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v3, ".."

    .line 115
    .line 116
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    iget p0, p0, Lcom/android/dx/dex/file/Statistics$Data;->largestSize:I

    .line 120
    .line 121
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string p0, " bytes/item; average "

    .line 125
    .line 126
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string p0, "\n"

    .line 133
    .line 134
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0
.end method

.method public writeAnnotation(Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Statistics$Data;->toHuman()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p1, p0}, Lcom/android/dx/util/AnnotatedOutput;->annotate(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
