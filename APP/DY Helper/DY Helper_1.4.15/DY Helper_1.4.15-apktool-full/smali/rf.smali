.class public final Lrf;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I

.field public β:J

.field public γ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    iput p1, p0, Lrf;->α:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    iput-wide v0, p0, Lrf;->β:J

    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lrk1;)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, Lrf;->α:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lrf;->γ:Ljava/lang/Object;

    const-wide/32 v0, 0x40000

    .line 21
    iput-wide v0, p0, Lrf;->β:J

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lrf;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lrf;->γ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lrf;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-wide v0, p0, Lrf;->β:J

    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lrf;->γ:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Lrf;

    .line 32
    .line 33
    invoke-virtual {v1}, Lrf;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, "xx"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-wide v1, p0, Lrf;->β:J

    .line 46
    .line 47
    invoke-static {v1, v2}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :goto_0
    return-object p0

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public α(I)I
    .locals 6

    .line 1
    iget-object v0, p0, Lrf;->γ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lrf;

    .line 4
    .line 5
    const/16 v1, 0x40

    .line 6
    .line 7
    const-wide/16 v2, 0x1

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-wide v4, p0, Lrf;->β:J

    .line 12
    .line 13
    if-lt p1, v1, :cond_0

    .line 14
    .line 15
    invoke-static {v4, v5}, Ljava/lang/Long;->bitCount(J)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    shl-long p0, v2, p1

    .line 21
    .line 22
    sub-long/2addr p0, v2

    .line 23
    and-long/2addr p0, v4

    .line 24
    invoke-static {p0, p1}, Ljava/lang/Long;->bitCount(J)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0

    .line 29
    :cond_1
    if-ge p1, v1, :cond_2

    .line 30
    .line 31
    iget-wide v0, p0, Lrf;->β:J

    .line 32
    .line 33
    shl-long p0, v2, p1

    .line 34
    .line 35
    sub-long/2addr p0, v2

    .line 36
    and-long/2addr p0, v0

    .line 37
    invoke-static {p0, p1}, Ljava/lang/Long;->bitCount(J)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0

    .line 42
    :cond_2
    sub-int/2addr p1, v1

    .line 43
    invoke-virtual {v0, p1}, Lrf;->α(I)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iget-wide v0, p0, Lrf;->β:J

    .line 48
    .line 49
    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    add-int/2addr p0, p1

    .line 54
    return p0
.end method

.method public β(I)Z
    .locals 4

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lrf;->γ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lrf;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Lrf;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, v2}, Lrf;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lrf;->γ:Ljava/lang/Object;

    .line 18
    .line 19
    :cond_0
    iget-object p0, p0, Lrf;->γ:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Lrf;

    .line 22
    .line 23
    sub-int/2addr p1, v0

    .line 24
    invoke-virtual {p0, p1}, Lrf;->β(I)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0

    .line 29
    :cond_1
    iget-wide v0, p0, Lrf;->β:J

    .line 30
    .line 31
    const-wide/16 v2, 0x1

    .line 32
    .line 33
    shl-long p0, v2, p1

    .line 34
    .line 35
    and-long/2addr p0, v0

    .line 36
    const-wide/16 v0, 0x0

    .line 37
    .line 38
    cmp-long p0, p0, v0

    .line 39
    .line 40
    if-eqz p0, :cond_2

    .line 41
    .line 42
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :cond_2
    const/4 p0, 0x0

    .line 45
    return p0
.end method

.method public γ()Lvc0;
    .locals 7

    .line 1
    new-instance v0, Luc0;

    .line 2
    .line 3
    invoke-direct {v0}, Luc0;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    iget-object v1, p0, Lrf;->γ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lad;

    .line 9
    .line 10
    iget-wide v2, p0, Lrf;->β:J

    .line 11
    .line 12
    invoke-interface {v1, v2, v3}, Lad;->ι(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-wide v2, p0, Lrf;->β:J

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    int-to-long v4, v4

    .line 23
    sub-long/2addr v2, v4

    .line 24
    iput-wide v2, p0, Lrf;->β:J

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0}, Luc0;->α()Lvc0;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_0
    const/4 v2, 0x4

    .line 38
    const/16 v3, 0x3a

    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    invoke-static {v1, v3, v4, v2}, Lq02;->г(Ljava/lang/CharSequence;CII)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    const/4 v5, -0x1

    .line 46
    const/4 v6, 0x0

    .line 47
    if-eq v2, v5, :cond_1

    .line 48
    .line 49
    invoke-virtual {v1, v6, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v0, v3, v1}, Lv81;->β(Luc0;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    const-string v5, ""

    .line 68
    .line 69
    if-ne v2, v3, :cond_2

    .line 70
    .line 71
    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-static {v0, v5, v1}, Lv81;->β(Luc0;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    invoke-static {v0, v5, v1}, Lv81;->β(Luc0;Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0
.end method

.method public δ()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lrf;->β:J

    .line 4
    .line 5
    iget-object p0, p0, Lrf;->γ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lrf;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lrf;->δ()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
