.class public final Lyyds/ᲈᛳᛷᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛱᛳᲇ:Ljava/util/regex/Pattern;

.field public static final ᛲᛲᲈᲈ:Ljava/util/regex/Pattern;

.field public static final ᛷᛲᲈᛱ:Ljava/util/regex/Pattern;

.field public static final ᛷᛵᲇᲀ:Ljava/util/regex/Pattern;


# instance fields
.field public final ᛱᲈᲁ:Z

.field public final ᛲᛳᛶᲁ:Z

.field public final ᛲᛴᛳᛲ:Ljava/lang/String;

.field public final ᛲᲈᲁ:Ljava/lang/String;

.field public final ᛵᛸᛸᛷ:Ljava/lang/String;

.field public final ᛶᛷᛲᲁ:Z

.field public final ᛷᲈᲈᲁ:Ljava/lang/String;

.field public final ᲀᛲᛳᲀ:J

.field public final ᲇᲇᲇᛱ:Z

.field public final ᲇᲈᛵᛷ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "(\\d{2,4})[^\\d]*"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lyyds/ᲈᛳᛷᛷ;->ᛷᛲᲈᛱ:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lyyds/ᲈᛳᛷᛷ;->ᛷᛵᲇᲀ:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    const-string v0, "(\\d{1,2})[^\\d]*"

    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lyyds/ᲈᛳᛷᛷ;->ᛲᛲᲈᲈ:Ljava/util/regex/Pattern;

    .line 24
    .line 25
    const-string v0, "(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*"

    .line 26
    .line 27
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lyyds/ᲈᛳᛷᛷ;->ᛱᛳᲇ:Ljava/util/regex/Pattern;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲈᛳᛷᛷ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲈᛳᛷᛷ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p3, p0, Lyyds/ᲈᛳᛷᛷ;->ᲀᛲᛳᲀ:J

    .line 9
    .line 10
    iput-object p5, p0, Lyyds/ᲈᛳᛷᛷ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p6, p0, Lyyds/ᲈᛳᛷᛷ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 13
    .line 14
    iput-boolean p7, p0, Lyyds/ᲈᛳᛷᛷ;->ᲇᲇᲇᛱ:Z

    .line 15
    .line 16
    iput-boolean p8, p0, Lyyds/ᲈᛳᛷᛷ;->ᛶᛷᛲᲁ:Z

    .line 17
    .line 18
    iput-boolean p9, p0, Lyyds/ᲈᛳᛷᛷ;->ᛱᲈᲁ:Z

    .line 19
    .line 20
    iput-boolean p10, p0, Lyyds/ᲈᛳᛷᛷ;->ᛲᛳᛶᲁ:Z

    .line 21
    .line 22
    iput-object p11, p0, Lyyds/ᲈᛳᛷᛷ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p1, Lyyds/ᲈᛳᛷᛷ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lyyds/ᲈᛳᛷᛷ;

    .line 6
    .line 7
    iget-object v0, p1, Lyyds/ᲈᛳᛷᛷ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v1, p0, Lyyds/ᲈᛳᛷᛷ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p1, Lyyds/ᲈᛳᛷᛷ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p0, Lyyds/ᲈᛳᛷᛷ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-wide v0, p1, Lyyds/ᲈᛳᛷᛷ;->ᲀᛲᛳᲀ:J

    .line 28
    .line 29
    iget-wide v2, p0, Lyyds/ᲈᛳᛷᛷ;->ᲀᛲᛳᲀ:J

    .line 30
    .line 31
    cmp-long v0, v0, v2

    .line 32
    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    iget-object v0, p1, Lyyds/ᲈᛳᛷᛷ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v1, p0, Lyyds/ᲈᛳᛷᛷ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    iget-object v0, p1, Lyyds/ᲈᛳᛷᛷ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v1, p0, Lyyds/ᲈᛳᛷᛷ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    iget-boolean v0, p1, Lyyds/ᲈᛳᛷᛷ;->ᲇᲇᲇᛱ:Z

    .line 56
    .line 57
    iget-boolean v1, p0, Lyyds/ᲈᛳᛷᛷ;->ᲇᲇᲇᛱ:Z

    .line 58
    .line 59
    if-ne v0, v1, :cond_0

    .line 60
    .line 61
    iget-boolean v0, p1, Lyyds/ᲈᛳᛷᛷ;->ᛶᛷᛲᲁ:Z

    .line 62
    .line 63
    iget-boolean v1, p0, Lyyds/ᲈᛳᛷᛷ;->ᛶᛷᛲᲁ:Z

    .line 64
    .line 65
    if-ne v0, v1, :cond_0

    .line 66
    .line 67
    iget-boolean v0, p1, Lyyds/ᲈᛳᛷᛷ;->ᛱᲈᲁ:Z

    .line 68
    .line 69
    iget-boolean v1, p0, Lyyds/ᲈᛳᛷᛷ;->ᛱᲈᲁ:Z

    .line 70
    .line 71
    if-ne v0, v1, :cond_0

    .line 72
    .line 73
    iget-boolean v0, p1, Lyyds/ᲈᛳᛷᛷ;->ᛲᛳᛶᲁ:Z

    .line 74
    .line 75
    iget-boolean v1, p0, Lyyds/ᲈᛳᛷᛷ;->ᛲᛳᛶᲁ:Z

    .line 76
    .line 77
    if-ne v0, v1, :cond_0

    .line 78
    .line 79
    iget-object p1, p1, Lyyds/ᲈᛳᛷᛷ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 80
    .line 81
    iget-object p0, p0, Lyyds/ᲈᛳᛷᛷ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {p1, p0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    if-eqz p0, :cond_0

    .line 88
    .line 89
    const/4 p0, 0x1

    .line 90
    return p0

    .line 91
    :cond_0
    const/4 p0, 0x0

    .line 92
    return p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᲈᛳᛷᛷ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 2
    .line 3
    const/16 v1, 0x20f

    .line 4
    .line 5
    const/16 v2, 0x1f

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lyyds/ᛴᛷᛷᲇ;->ᛶᛷᛲᲁ(Ljava/lang/String;II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Lyyds/ᲈᛳᛷᛷ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v1, v0, v2}, Lyyds/ᛴᛷᛷᲇ;->ᛶᛷᛲᲁ(Ljava/lang/String;II)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-wide v3, p0, Lyyds/ᲈᛳᛷᛷ;->ᲀᛲᛳᲀ:J

    .line 18
    .line 19
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    add-int/2addr v1, v0

    .line 24
    mul-int/2addr v1, v2

    .line 25
    iget-object v0, p0, Lyyds/ᲈᛳᛷᛷ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v0, v1, v2}, Lyyds/ᛴᛷᛷᲇ;->ᛶᛷᛲᲁ(Ljava/lang/String;II)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-object v1, p0, Lyyds/ᲈᛳᛷᛷ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v1, v0, v2}, Lyyds/ᛴᛷᛷᲇ;->ᛶᛷᛲᲁ(Ljava/lang/String;II)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-boolean v1, p0, Lyyds/ᲈᛳᛷᛷ;->ᲇᲇᲇᛱ:Z

    .line 38
    .line 39
    invoke-static {v0, v2, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲇᲈᛵᛷ(IIZ)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget-boolean v1, p0, Lyyds/ᲈᛳᛷᛷ;->ᛶᛷᛲᲁ:Z

    .line 44
    .line 45
    invoke-static {v0, v2, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲇᲈᛵᛷ(IIZ)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget-boolean v1, p0, Lyyds/ᲈᛳᛷᛷ;->ᛱᲈᲁ:Z

    .line 50
    .line 51
    invoke-static {v0, v2, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲇᲈᛵᛷ(IIZ)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iget-boolean v1, p0, Lyyds/ᲈᛳᛷᛷ;->ᛲᛳᛶᲁ:Z

    .line 56
    .line 57
    invoke-static {v0, v2, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲇᲈᛵᛷ(IIZ)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget-object p0, p0, Lyyds/ᲈᛳᛷᛷ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 62
    .line 63
    if-eqz p0, :cond_0

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    const/4 p0, 0x0

    .line 71
    :goto_0
    add-int/2addr v0, p0

    .line 72
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᲈᛳᛷᛷ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/16 v1, 0x3d

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lyyds/ᲈᛳᛷᛷ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, Lyyds/ᲈᛳᛷᛷ;->ᛱᲈᲁ:Z

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    const-wide/high16 v1, -0x8000000000000000L

    .line 23
    .line 24
    iget-wide v3, p0, Lyyds/ᲈᛳᛷᛷ;->ᲀᛲᛳᲀ:J

    .line 25
    .line 26
    cmp-long v1, v3, v1

    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    const-string v1, "; max-age=0"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const-string v1, "; expires="

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    new-instance v1, Ljava/util/Date;

    .line 42
    .line 43
    invoke-direct {v1, v3, v4}, Ljava/util/Date;-><init>(J)V

    .line 44
    .line 45
    .line 46
    sget-object v2, Lyyds/ᛴᛵᲀᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲇᛷᲇ;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Ljava/text/DateFormat;

    .line 53
    .line 54
    invoke-virtual {v2, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    :cond_1
    :goto_0
    iget-boolean v1, p0, Lyyds/ᲈᛳᛷᛷ;->ᛲᛳᛶᲁ:Z

    .line 62
    .line 63
    if-nez v1, :cond_2

    .line 64
    .line 65
    const-string v1, "; domain="

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, Lyyds/ᲈᛳᛷᛷ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    :cond_2
    const-string v1, "; path="

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, Lyyds/ᲈᛳᛷᛷ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    iget-boolean v1, p0, Lyyds/ᲈᛳᛷᛷ;->ᲇᲇᲇᛱ:Z

    .line 86
    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    const-string v1, "; secure"

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    :cond_3
    iget-boolean v1, p0, Lyyds/ᲈᛳᛷᛷ;->ᛶᛷᛲᲁ:Z

    .line 95
    .line 96
    if-eqz v1, :cond_4

    .line 97
    .line 98
    const-string v1, "; httponly"

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    :cond_4
    iget-object p0, p0, Lyyds/ᲈᛳᛷᛷ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 104
    .line 105
    if-eqz p0, :cond_5

    .line 106
    .line 107
    const-string v1, "; samesite="

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    return-object p0
.end method
