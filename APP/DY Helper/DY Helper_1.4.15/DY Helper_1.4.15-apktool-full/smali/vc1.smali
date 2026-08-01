.class public final Lvc1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/lang/String;

.field public final β:Luc1;

.field public final γ:Ljava/util/Map;

.field public final δ:J

.field public final ε:Ljava/lang/Long;

.field public final ζ:Ljava/lang/String;

.field public final η:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Ljava/lang/String;Luc1;Ljava/util/Map;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V
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
    iput-object p1, p0, Lvc1;->α:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Lvc1;->β:Luc1;

    .line 10
    .line 11
    iput-object p3, p0, Lvc1;->γ:Ljava/util/Map;

    .line 12
    .line 13
    iput-wide p4, p0, Lvc1;->δ:J

    .line 14
    .line 15
    iput-object p6, p0, Lvc1;->ε:Ljava/lang/Long;

    .line 16
    .line 17
    iput-object p7, p0, Lvc1;->ζ:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p8, p0, Lvc1;->η:Ljava/lang/Long;

    .line 20
    .line 21
    return-void
.end method

.method public static α(Lvc1;Ljava/util/LinkedHashMap;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;I)Lvc1;
    .locals 9

    .line 1
    iget-object v1, p0, Lvc1;->α:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v2, p0, Lvc1;->β:Luc1;

    .line 4
    .line 5
    and-int/lit8 v0, p5, 0x4

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lvc1;->γ:Ljava/util/Map;

    .line 10
    .line 11
    :cond_0
    move-object v3, p1

    .line 12
    iget-wide v4, p0, Lvc1;->δ:J

    .line 13
    .line 14
    and-int/lit8 p1, p5, 0x10

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    iget-object p2, p0, Lvc1;->ε:Ljava/lang/Long;

    .line 19
    .line 20
    :cond_1
    move-object v6, p2

    .line 21
    and-int/lit8 p1, p5, 0x20

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    iget-object p3, p0, Lvc1;->ζ:Ljava/lang/String;

    .line 26
    .line 27
    :cond_2
    move-object v7, p3

    .line 28
    and-int/lit8 p1, p5, 0x40

    .line 29
    .line 30
    if-eqz p1, :cond_3

    .line 31
    .line 32
    iget-object p4, p0, Lvc1;->η:Ljava/lang/Long;

    .line 33
    .line 34
    :cond_3
    move-object v8, p4

    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance v0, Lvc1;

    .line 39
    .line 40
    invoke-direct/range {v0 .. v8}, Lvc1;-><init>(Ljava/lang/String;Luc1;Ljava/util/Map;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lvc1;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lvc1;

    .line 10
    .line 11
    iget-object v0, p0, Lvc1;->α:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, Lvc1;->α:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, Lvc1;->β:Luc1;

    .line 23
    .line 24
    iget-object v1, p1, Lvc1;->β:Luc1;

    .line 25
    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-object v0, p0, Lvc1;->γ:Ljava/util/Map;

    .line 30
    .line 31
    iget-object v1, p1, Lvc1;->γ:Ljava/util/Map;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-wide v0, p0, Lvc1;->δ:J

    .line 41
    .line 42
    iget-wide v2, p1, Lvc1;->δ:J

    .line 43
    .line 44
    cmp-long v0, v0, v2

    .line 45
    .line 46
    if-eqz v0, :cond_5

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_5
    iget-object v0, p0, Lvc1;->ε:Ljava/lang/Long;

    .line 50
    .line 51
    iget-object v1, p1, Lvc1;->ε:Ljava/lang/Long;

    .line 52
    .line 53
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_6

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_6
    iget-object v0, p0, Lvc1;->ζ:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v1, p1, Lvc1;->ζ:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_7

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_7
    iget-object p0, p0, Lvc1;->η:Ljava/lang/Long;

    .line 72
    .line 73
    iget-object p1, p1, Lvc1;->η:Ljava/lang/Long;

    .line 74
    .line 75
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-nez p0, :cond_8

    .line 80
    .line 81
    :goto_0
    const/4 p0, 0x0

    .line 82
    return p0

    .line 83
    :cond_8
    :goto_1
    const/4 p0, 0x1

    .line 84
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lvc1;->α:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lvc1;->β:Luc1;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, Lvc1;->γ:Ljava/util/Map;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget-wide v2, p0, Lvc1;->δ:J

    .line 27
    .line 28
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v2, 0x0

    .line 33
    iget-object v3, p0, Lvc1;->ε:Ljava/lang/Long;

    .line 34
    .line 35
    if-nez v3, :cond_0

    .line 36
    .line 37
    move v3, v2

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    :goto_0
    add-int/2addr v0, v3

    .line 44
    mul-int/2addr v0, v1

    .line 45
    iget-object v3, p0, Lvc1;->ζ:Ljava/lang/String;

    .line 46
    .line 47
    if-nez v3, :cond_1

    .line 48
    .line 49
    move v3, v2

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    :goto_1
    add-int/2addr v0, v3

    .line 56
    mul-int/2addr v0, v1

    .line 57
    iget-object p0, p0, Lvc1;->η:Ljava/lang/Long;

    .line 58
    .line 59
    if-nez p0, :cond_2

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    :goto_2
    add-int/2addr v0, v2

    .line 67
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CampRequestContext(identity="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lvc1;->α:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", authType="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lvc1;->β:Luc1;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", headers="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lvc1;->γ:Ljava/util/Map;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", capturedAt="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-wide v1, p0, Lvc1;->δ:J

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", conversationShortId="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lvc1;->ε:Ljava/lang/Long;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", conversationId="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lvc1;->ζ:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", otherUid="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object p0, p0, Lvc1;->η:Ljava/lang/Long;

    .line 69
    .line 70
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p0, ")"

    .line 74
    .line 75
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0
.end method

.method public final β()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lvc1;->β:Luc1;

    .line 2
    .line 3
    iget-object p0, p0, Lvc1;->α:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Luc1;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
