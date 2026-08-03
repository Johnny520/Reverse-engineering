.class public final Lr7/w;
.super Lr7/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lb8/b;


# instance fields
.field public final m:Lr7/v;

.field public final n:Lr7/e;

.field public final o:Lr7/e;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lr7/b;-><init>(I)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lr7/v;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, v1}, Lr7/l;-><init>(Lr7/b;I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, -0x1

    .line 13
    invoke-virtual {v0, v1}, Lr7/l;->k(I)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lr7/w;->m:Lr7/v;

    .line 17
    .line 18
    new-instance v0, Lr7/e;

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v0, p0, v1, v2}, Lr7/e;-><init>(Lr7/b;II)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lr7/w;->n:Lr7/e;

    .line 26
    .line 27
    new-instance v0, Lr7/e;

    .line 28
    .line 29
    const/16 v1, 0x8

    .line 30
    .line 31
    invoke-direct {v0, p0, v1, v2}, Lr7/e;-><init>(Lr7/b;II)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lr7/w;->o:Lr7/e;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lk7/a;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public final e()I
    .locals 1

    .line 1
    iget-object v0, p0, Lr7/w;->o:Lr7/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr7/e;->get()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final f()I
    .locals 1

    .line 1
    iget-object v0, p0, Lr7/w;->n:Lr7/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr7/e;->get()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getTagName()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lr7/w;->m:Lr7/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr7/v;->a()Lr7/s;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, Lr7/r;->m:Ljava/lang/String;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    if-nez v0, :cond_1

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_1
    const/16 v1, 0x3b

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-gez v1, :cond_2

    .line 24
    .line 25
    const/16 v1, 0x20

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    :cond_2
    if-gez v1, :cond_3

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_3
    const/4 v2, 0x0

    .line 35
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lr7/w;->m:Lr7/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr7/v;->a()Lr7/s;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, Lr7/r;->m:Ljava/lang/String;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    if-eqz v0, :cond_7

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_1
    const/4 v2, 0x0

    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/16 v3, 0x20

    .line 29
    .line 30
    if-ne v2, v3, :cond_2

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :cond_2
    const/16 v2, 0x3b

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-gez v2, :cond_3

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    if-ltz v3, :cond_4

    .line 50
    .line 51
    if-ge v3, v2, :cond_4

    .line 52
    .line 53
    :goto_1
    move v2, v3

    .line 54
    :cond_4
    if-gez v2, :cond_5

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-nez v2, :cond_6

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_6
    return-object v0

    .line 71
    :cond_7
    :goto_2
    return-object v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lr7/w;->m:Lr7/v;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " ["

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lr7/w;->n:Lr7/e;

    .line 17
    .line 18
    invoke-virtual {v1}, Lr7/e;->get()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ", "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lr7/w;->o:Lr7/e;

    .line 31
    .line 32
    invoke-virtual {v1}, Lr7/e;->get()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v1, "]"

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0
.end method
