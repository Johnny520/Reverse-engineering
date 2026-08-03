.class public final L۟/ga;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final ۥ:I

.field public final ۥ۟:I

.field public final ۥ۟۟:J

.field public final ۥ۟۠:J

.field public final ۥ۟ۡ:J

.field public final ۥ۟ۢ:J

.field public final ۥۣ۟:J

.field public final ۥ۟ۤ:J

.field public final ۥ۟ۥ:J

.field public final ۥ۟ۦ:J

.field public final ۥ۟ۧ:I

.field public final ۥ۟ۨ:I

.field public final ۥ۠:I

.field public final ۥ۠۟:J


# direct methods
.method public constructor <init>(IIJJJJJJJJIIIJ)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v1, p1

    iput v1, v0, L۟/ga;->ۥ:I

    move v1, p2

    iput v1, v0, L۟/ga;->ۥ۟:I

    move-wide v1, p3

    iput-wide v1, v0, L۟/ga;->ۥ۟۟:J

    move-wide v1, p5

    iput-wide v1, v0, L۟/ga;->ۥ۟۠:J

    move-wide v1, p7

    iput-wide v1, v0, L۟/ga;->ۥ۟ۡ:J

    move-wide v1, p9

    iput-wide v1, v0, L۟/ga;->ۥ۟ۢ:J

    move-wide v1, p11

    iput-wide v1, v0, L۟/ga;->ۥۣ۟:J

    move-wide/from16 v1, p13

    iput-wide v1, v0, L۟/ga;->ۥ۟ۤ:J

    move-wide/from16 v1, p15

    iput-wide v1, v0, L۟/ga;->ۥ۟ۥ:J

    move-wide/from16 v1, p17

    iput-wide v1, v0, L۟/ga;->ۥ۟ۦ:J

    move/from16 v1, p19

    iput v1, v0, L۟/ga;->ۥ۟ۧ:I

    move/from16 v1, p20

    iput v1, v0, L۟/ga;->ۥ۟ۨ:I

    move/from16 v1, p21

    iput v1, v0, L۟/ga;->ۥ۠:I

    move-wide/from16 v1, p22

    iput-wide v1, v0, L۟/ga;->ۥ۠۟:J

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "StatsSnapshot{maxSize="

    .line 2
    .line 3
    invoke-static {v0}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, L۟/ga;->ۥ:I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v1, ", size="

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget v1, p0, L۟/ga;->ۥ۟:I

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, ", cacheHits="

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-wide v1, p0, L۟/ga;->ۥ۟۟:J

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, ", cacheMisses="

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget-wide v1, p0, L۟/ga;->ۥ۟۠:J

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", downloadCount="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget v1, p0, L۟/ga;->ۥ۟ۧ:I

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, ", totalDownloadSize="

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-wide v1, p0, L۟/ga;->ۥ۟ۡ:J

    .line 58
    .line 59
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, ", averageDownloadSize="

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-wide v1, p0, L۟/ga;->ۥ۟ۤ:J

    .line 68
    .line 69
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v1, ", totalOriginalBitmapSize="

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    iget-wide v1, p0, L۟/ga;->ۥ۟ۢ:J

    .line 78
    .line 79
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v1, ", totalTransformedBitmapSize="

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget-wide v1, p0, L۟/ga;->ۥۣ۟:J

    .line 88
    .line 89
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, ", averageOriginalBitmapSize="

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    iget-wide v1, p0, L۟/ga;->ۥ۟ۥ:J

    .line 98
    .line 99
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v1, ", averageTransformedBitmapSize="

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    iget-wide v1, p0, L۟/ga;->ۥ۟ۦ:J

    .line 108
    .line 109
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v1, ", originalBitmapCount="

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    iget v1, p0, L۟/ga;->ۥ۟ۨ:I

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string v1, ", transformedBitmapCount="

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    iget v1, p0, L۟/ga;->ۥ۠:I

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v1, ", timeStamp="

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    iget-wide v1, p0, L۟/ga;->ۥ۠۟:J

    .line 138
    .line 139
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const/16 v1, 0x7d

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    return-object v0
.end method

.method public final ۥ(Ljava/io/PrintWriter;)V
    .locals 2

    const-string v0, "===============BEGIN PICASSO STATS ==============="

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const-string v0, "Memory Cache Stats"

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const-string v0, "  Max Cache Size: "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, L۟/ga;->ۥ:I

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(I)V

    const-string v0, "  Cache Size: "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, L۟/ga;->ۥ۟:I

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(I)V

    const-string v0, "  Cache % Full: "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, L۟/ga;->ۥ۟:I

    int-to-float v0, v0

    iget v1, p0, L۟/ga;->ۥ:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(I)V

    const-string v0, "  Cache Hits: "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-wide v0, p0, L۟/ga;->ۥ۟۟:J

    invoke-virtual {p1, v0, v1}, Ljava/io/PrintWriter;->println(J)V

    const-string v0, "  Cache Misses: "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-wide v0, p0, L۟/ga;->ۥ۟۠:J

    invoke-virtual {p1, v0, v1}, Ljava/io/PrintWriter;->println(J)V

    const-string v0, "Network Stats"

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const-string v0, "  Download Count: "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, L۟/ga;->ۥ۟ۧ:I

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(I)V

    const-string v0, "  Total Download Size: "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-wide v0, p0, L۟/ga;->ۥ۟ۡ:J

    invoke-virtual {p1, v0, v1}, Ljava/io/PrintWriter;->println(J)V

    const-string v0, "  Average Download Size: "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-wide v0, p0, L۟/ga;->ۥ۟ۤ:J

    invoke-virtual {p1, v0, v1}, Ljava/io/PrintWriter;->println(J)V

    const-string v0, "Bitmap Stats"

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const-string v0, "  Total Bitmaps Decoded: "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, L۟/ga;->ۥ۟ۨ:I

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(I)V

    const-string v0, "  Total Bitmap Size: "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-wide v0, p0, L۟/ga;->ۥ۟ۢ:J

    invoke-virtual {p1, v0, v1}, Ljava/io/PrintWriter;->println(J)V

    const-string v0, "  Total Transformed Bitmaps: "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, L۟/ga;->ۥ۠:I

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(I)V

    const-string v0, "  Total Transformed Bitmap Size: "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-wide v0, p0, L۟/ga;->ۥۣ۟:J

    invoke-virtual {p1, v0, v1}, Ljava/io/PrintWriter;->println(J)V

    const-string v0, "  Average Bitmap Size: "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-wide v0, p0, L۟/ga;->ۥ۟ۥ:J

    invoke-virtual {p1, v0, v1}, Ljava/io/PrintWriter;->println(J)V

    const-string v0, "  Average Transformed Bitmap Size: "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-wide v0, p0, L۟/ga;->ۥ۟ۦ:J

    invoke-virtual {p1, v0, v1}, Ljava/io/PrintWriter;->println(J)V

    const-string v0, "===============END PICASSO STATS ==============="

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/PrintWriter;->flush()V

    return-void
.end method
