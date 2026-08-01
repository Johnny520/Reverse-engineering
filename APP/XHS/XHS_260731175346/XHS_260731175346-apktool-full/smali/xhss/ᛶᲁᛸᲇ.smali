.class public final Lxhss/ᛶᲁᛸᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛷᲁᲁ:Ljava/util/regex/Pattern;

.field public static final ᛸᛶᲈᛶ:Ljava/util/regex/Pattern;

.field public static final ᲇᛸᛳᲁ:Ljava/util/regex/Pattern;

.field public static final ᲈᛳᲀ:Ljava/util/regex/Pattern;


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/lang/String;

.field public final ᛳᲁᲇᛸ:J

.field public final ᛷᛴᛷᛱ:Ljava/lang/String;

.field public final ᛷᛵᛵᲈ:Ljava/lang/String;

.field public final ᛸᛲᲀᛵ:Z

.field public final ᛸᛴᛶᛳ:Z

.field public final ᛸᛷᲈᲈ:Ljava/lang/String;

.field public final ᲀᲇᛳᲁ:Z

.field public final ᲇᛴᲇᛵ:Ljava/lang/String;

.field public final ᲇᛶᛴᲀ:Z


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
    sput-object v0, Lxhss/ᛶᲁᛸᲇ;->ᲈᛳᲀ:Ljava/util/regex/Pattern;

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
    sput-object v0, Lxhss/ᛶᲁᛸᲇ;->ᛷᲁᲁ:Ljava/util/regex/Pattern;

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
    sput-object v0, Lxhss/ᛶᲁᛸᲇ;->ᛸᛶᲈᛶ:Ljava/util/regex/Pattern;

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
    sput-object v0, Lxhss/ᛶᲁᛸᲇ;->ᲇᛸᛳᲁ:Ljava/util/regex/Pattern;

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
    iput-object p1, p0, Lxhss/ᛶᲁᛸᲇ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᛶᲁᛸᲇ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p3, p0, Lxhss/ᛶᲁᛸᲇ;->ᛳᲁᲇᛸ:J

    .line 9
    .line 10
    iput-object p5, p0, Lxhss/ᛶᲁᛸᲇ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p6, p0, Lxhss/ᛶᲁᛸᲇ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 13
    .line 14
    iput-boolean p7, p0, Lxhss/ᛶᲁᛸᲇ;->ᲇᛶᛴᲀ:Z

    .line 15
    .line 16
    iput-boolean p8, p0, Lxhss/ᛶᲁᛸᲇ;->ᲀᲇᛳᲁ:Z

    .line 17
    .line 18
    iput-boolean p9, p0, Lxhss/ᛶᲁᛸᲇ;->ᛸᛴᛶᛳ:Z

    .line 19
    .line 20
    iput-boolean p10, p0, Lxhss/ᛶᲁᛸᲇ;->ᛸᛲᲀᛵ:Z

    .line 21
    .line 22
    iput-object p11, p0, Lxhss/ᛶᲁᛸᲇ;->ᛸᛷᲈᲈ:Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p1, Lxhss/ᛶᲁᛸᲇ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lxhss/ᛶᲁᛸᲇ;

    .line 6
    .line 7
    iget-object v0, p1, Lxhss/ᛶᲁᛸᲇ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v1, p0, Lxhss/ᛶᲁᛸᲇ;->ᛷᛵᛵᲈ:Ljava/lang/String;

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
    iget-object v0, p1, Lxhss/ᛶᲁᛸᲇ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p0, Lxhss/ᛶᲁᛸᲇ;->ᛱᛱᛲᲇ:Ljava/lang/String;

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
    iget-wide v0, p1, Lxhss/ᛶᲁᛸᲇ;->ᛳᲁᲇᛸ:J

    .line 28
    .line 29
    iget-wide v2, p0, Lxhss/ᛶᲁᛸᲇ;->ᛳᲁᲇᛸ:J

    .line 30
    .line 31
    cmp-long v0, v0, v2

    .line 32
    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    iget-object v0, p1, Lxhss/ᛶᲁᛸᲇ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v1, p0, Lxhss/ᛶᲁᛸᲇ;->ᲇᛴᲇᛵ:Ljava/lang/String;

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
    iget-object v0, p1, Lxhss/ᛶᲁᛸᲇ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v1, p0, Lxhss/ᛶᲁᛸᲇ;->ᛷᛴᛷᛱ:Ljava/lang/String;

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
    iget-boolean v0, p1, Lxhss/ᛶᲁᛸᲇ;->ᲇᛶᛴᲀ:Z

    .line 56
    .line 57
    iget-boolean v1, p0, Lxhss/ᛶᲁᛸᲇ;->ᲇᛶᛴᲀ:Z

    .line 58
    .line 59
    if-ne v0, v1, :cond_0

    .line 60
    .line 61
    iget-boolean v0, p1, Lxhss/ᛶᲁᛸᲇ;->ᲀᲇᛳᲁ:Z

    .line 62
    .line 63
    iget-boolean v1, p0, Lxhss/ᛶᲁᛸᲇ;->ᲀᲇᛳᲁ:Z

    .line 64
    .line 65
    if-ne v0, v1, :cond_0

    .line 66
    .line 67
    iget-boolean v0, p1, Lxhss/ᛶᲁᛸᲇ;->ᛸᛴᛶᛳ:Z

    .line 68
    .line 69
    iget-boolean v1, p0, Lxhss/ᛶᲁᛸᲇ;->ᛸᛴᛶᛳ:Z

    .line 70
    .line 71
    if-ne v0, v1, :cond_0

    .line 72
    .line 73
    iget-boolean v0, p1, Lxhss/ᛶᲁᛸᲇ;->ᛸᛲᲀᛵ:Z

    .line 74
    .line 75
    iget-boolean v1, p0, Lxhss/ᛶᲁᛸᲇ;->ᛸᛲᲀᛵ:Z

    .line 76
    .line 77
    if-ne v0, v1, :cond_0

    .line 78
    .line 79
    iget-object p1, p1, Lxhss/ᛶᲁᛸᲇ;->ᛸᛷᲈᲈ:Ljava/lang/String;

    .line 80
    .line 81
    iget-object p0, p0, Lxhss/ᛶᲁᛸᲇ;->ᛸᛷᲈᲈ:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {p1, p0}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    .locals 4

    .line 1
    iget-object v0, p0, Lxhss/ᛶᲁᛸᲇ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit16 v0, v0, 0x20f

    .line 8
    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lxhss/ᛶᲁᛸᲇ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-wide v2, p0, Lxhss/ᛶᲁᛸᲇ;->ᛳᲁᲇᛸ:J

    .line 21
    .line 22
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v1

    .line 27
    mul-int/lit8 v0, v0, 0x1f

    .line 28
    .line 29
    iget-object v1, p0, Lxhss/ᛶᲁᛸᲇ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v1, v0

    .line 36
    mul-int/lit8 v1, v1, 0x1f

    .line 37
    .line 38
    iget-object v0, p0, Lxhss/ᛶᲁᛸᲇ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    add-int/2addr v0, v1

    .line 45
    mul-int/lit8 v0, v0, 0x1f

    .line 46
    .line 47
    iget-boolean v1, p0, Lxhss/ᛶᲁᛸᲇ;->ᲇᛶᛴᲀ:Z

    .line 48
    .line 49
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    add-int/2addr v1, v0

    .line 54
    mul-int/lit8 v1, v1, 0x1f

    .line 55
    .line 56
    iget-boolean v0, p0, Lxhss/ᛶᲁᛸᲇ;->ᲀᲇᛳᲁ:Z

    .line 57
    .line 58
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    add-int/2addr v0, v1

    .line 63
    mul-int/lit8 v0, v0, 0x1f

    .line 64
    .line 65
    iget-boolean v1, p0, Lxhss/ᛶᲁᛸᲇ;->ᛸᛴᛶᛳ:Z

    .line 66
    .line 67
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    add-int/2addr v1, v0

    .line 72
    mul-int/lit8 v1, v1, 0x1f

    .line 73
    .line 74
    iget-boolean v0, p0, Lxhss/ᛶᲁᛸᲇ;->ᛸᛲᲀᛵ:Z

    .line 75
    .line 76
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    add-int/2addr v0, v1

    .line 81
    mul-int/lit8 v0, v0, 0x1f

    .line 82
    .line 83
    iget-object p0, p0, Lxhss/ᛶᲁᛸᲇ;->ᛸᛷᲈᲈ:Ljava/lang/String;

    .line 84
    .line 85
    if-eqz p0, :cond_0

    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    goto :goto_0

    .line 92
    :cond_0
    const/4 p0, 0x0

    .line 93
    :goto_0
    add-int/2addr v0, p0

    .line 94
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Lxhss/ᛶᲁᛸᲇ;->ᛷᛵᛵᲈ:Ljava/lang/String;

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
    iget-object v1, p0, Lxhss/ᛶᲁᛸᲇ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, Lxhss/ᛶᲁᛸᲇ;->ᛸᛴᛶᛳ:Z

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    const-wide/high16 v1, -0x8000000000000000L

    .line 23
    .line 24
    iget-wide v3, p0, Lxhss/ᛶᲁᛸᲇ;->ᛳᲁᲇᛸ:J

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
    sget-object v2, Lxhss/ᛸᛲᲀᛳ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛷᲇᛲ;

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
    iget-boolean v1, p0, Lxhss/ᛶᲁᛸᲇ;->ᛸᛲᲀᛵ:Z

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
    iget-object v1, p0, Lxhss/ᛶᲁᛸᲇ;->ᲇᛴᲇᛵ:Ljava/lang/String;

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
    iget-object v1, p0, Lxhss/ᛶᲁᛸᲇ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    iget-boolean v1, p0, Lxhss/ᛶᲁᛸᲇ;->ᲇᛶᛴᲀ:Z

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
    iget-boolean v1, p0, Lxhss/ᛶᲁᛸᲇ;->ᲀᲇᛳᲁ:Z

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
    iget-object p0, p0, Lxhss/ᛶᲁᛸᲇ;->ᛸᛷᲈᲈ:Ljava/lang/String;

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
