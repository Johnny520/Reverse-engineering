.class public final Lb8/d;
.super Lb8/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;


# virtual methods
.method public final c()Lb8/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lb8/j;->g:Lb8/j;

    .line 2
    .line 3
    check-cast v0, Lb8/f;

    .line 4
    .line 5
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lb8/d;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_3

    .line 9
    .line 10
    check-cast p1, Lb8/d;

    .line 11
    .line 12
    iget-object v1, p0, Lb8/d;->h:Ljava/lang/String;

    .line 13
    .line 14
    iget-object p1, p1, Lb8/d;->h:Ljava/lang/String;

    .line 15
    .line 16
    if-ne v1, p1, :cond_1

    .line 17
    .line 18
    return v0

    .line 19
    :cond_1
    if-eqz v1, :cond_3

    .line 20
    .line 21
    if-nez p1, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1

    .line 29
    :cond_3
    :goto_0
    return v2
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lb8/d;->h:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final k(Ljava/io/StringWriter;Z)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lb8/d;->m(Z)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {p1, v0}, Ljava/io/StringWriter;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 7
    .line 8
    .line 9
    const/16 v0, 0x3d

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/io/StringWriter;->append(C)Ljava/lang/Appendable;

    .line 12
    .line 13
    .line 14
    const/16 v0, 0x22

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/io/StringWriter;->append(C)Ljava/lang/Appendable;

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Lb8/d;->n()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {p1, v1}, Ljava/io/StringWriter;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 26
    .line 27
    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Ljava/io/StringWriter;->append(C)Ljava/lang/Appendable;

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final m(Z)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p1, p0, Lb8/d;->h:Ljava/lang/String;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    const/16 v0, 0x3a

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-lez v0, :cond_1

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    const-string v1, ":"

    .line 24
    .line 25
    invoke-static {v0, v1, p1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :cond_2
    return-object p1
.end method

.method public final n()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lb8/d;->i:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    iput-object v0, p0, Lb8/d;->i:Ljava/lang/String;

    .line 8
    .line 9
    :cond_0
    return-object v0
.end method

.method public final o(Lb5/c;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lb8/d;->h:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Lb8/d;->n()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object p1, p1, Lb5/c;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Lb8/f;

    .line 10
    .line 11
    new-instance v2, Lb8/d;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v2}, Lb8/f;->p(Lb8/d;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, v2, Lb8/d;->h:Ljava/lang/String;

    .line 20
    .line 21
    iput-object v1, v2, Lb8/d;->i:Ljava/lang/String;

    .line 22
    .line 23
    iget-object p1, v2, Lb8/j;->g:Lb8/j;

    .line 24
    .line 25
    check-cast p1, Lb8/f;

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const-string p1, "Parent element is null"

    .line 31
    .line 32
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void
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
    const/4 v1, 0x1

    .line 7
    invoke-virtual {p0, v1}, Lb8/d;->m(Z)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, "=\""

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lb8/d;->n()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, "\""

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method
