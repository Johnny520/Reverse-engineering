.class public final Lb8/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final g:I

.field public final h:C

.field public final i:Lb8/b;


# direct methods
.method public constructor <init>(ICLb8/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lb8/g;->g:I

    .line 5
    .line 6
    iput-char p2, p0, Lb8/g;->h:C

    .line 7
    .line 8
    iput-object p3, p0, Lb8/g;->i:Lb8/b;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    .line 1
    check-cast p1, Lb8/g;

    .line 2
    .line 3
    if-ne p1, p0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    iget v0, p1, Lb8/g;->g:I

    .line 8
    .line 9
    iget v1, p0, Lb8/g;->g:I

    .line 10
    .line 11
    invoke-static {v1, v0}, Ly7/a;->b(II)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x2

    .line 16
    if-eq v1, v3, :cond_6

    .line 17
    .line 18
    if-ne v0, v3, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    iget-object v3, p0, Lb8/g;->i:Lb8/b;

    .line 22
    .line 23
    invoke-interface {v3}, Lb8/b;->b()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    iget-object p1, p1, Lb8/g;->i:Lb8/b;

    .line 28
    .line 29
    invoke-interface {p1}, Lb8/b;->b()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-static {v3, p1}, Ly7/a;->b(II)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const/4 v3, 0x3

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    if-ne v0, v3, :cond_5

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    if-nez v0, :cond_3

    .line 44
    .line 45
    if-ne v1, v3, :cond_5

    .line 46
    .line 47
    :goto_0
    const/4 p1, 0x1

    .line 48
    return p1

    .line 49
    :cond_3
    if-nez p1, :cond_4

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_4
    if-nez v2, :cond_5

    .line 53
    .line 54
    if-ne v1, v3, :cond_5

    .line 55
    .line 56
    neg-int p1, p1

    .line 57
    :cond_5
    return p1

    .line 58
    :cond_6
    :goto_1
    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    iget v1, p0, Lb8/g;->g:I

    .line 3
    .line 4
    if-ne v1, v0, :cond_0

    .line 5
    .line 6
    iget-char v0, p0, Lb8/g;->h:C

    .line 7
    .line 8
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0

    .line 13
    :cond_0
    const/4 v0, 0x1

    .line 14
    const-string v2, ">"

    .line 15
    .line 16
    iget-object v3, p0, Lb8/g;->i:Lb8/b;

    .line 17
    .line 18
    const-string v4, "<"

    .line 19
    .line 20
    if-ne v1, v0, :cond_1

    .line 21
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v3}, Lb8/b;->getTagName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0

    .line 42
    :cond_1
    if-nez v1, :cond_2

    .line 43
    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v3}, Lb8/b;->getTagName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v1, "/>"

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0

    .line 66
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v1, "</"

    .line 69
    .line 70
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v3}, Lb8/b;->getTagName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    return-object v0
.end method
