.class public final Lv4/q;
.super Lv4/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:I

.field public final h:Lv4/z;

.field public final i:Lw4/a;

.field public j:Lv4/d0;

.field public k:Lv4/h;

.field public final l:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(ILv4/z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lv4/q;->g:I

    .line 5
    .line 6
    iput-object p2, p0, Lv4/q;->h:Lv4/z;

    .line 7
    .line 8
    iget-object p1, p2, Lv4/z;->h:Lv4/c0;

    .line 9
    .line 10
    invoke-virtual {p1}, Lv4/c0;->a()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Lw4/a;->b(Ljava/lang/String;)Lw4/a;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lv4/q;->i:Lw4/a;

    .line 19
    .line 20
    new-instance p1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lv4/q;->l:Ljava/util/ArrayList;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lv4/q;->j:Lv4/d0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lv4/d0;->g:Lw4/c;

    .line 6
    .line 7
    invoke-virtual {v0}, Lw4/c;->a()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "Unknown"

    .line 13
    .line 14
    :goto_0
    const-string v1, "InvokeDynamic("

    .line 15
    .line 16
    const-string v2, ":"

    .line 17
    .line 18
    invoke-static {v1, v0, v2}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget v1, p0, Lv4/q;->g:I

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ", "

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lv4/q;->h:Lv4/z;

    .line 33
    .line 34
    invoke-virtual {v1}, Lv4/z;->a()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ")"

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0
.end method

.method public final e(Lv4/a;)I
    .locals 2

    .line 1
    check-cast p1, Lv4/q;

    .line 2
    .line 3
    iget v0, p0, Lv4/q;->g:I

    .line 4
    .line 5
    iget v1, p1, Lv4/q;->g:I

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    iget-object v0, p0, Lv4/q;->h:Lv4/z;

    .line 15
    .line 16
    iget-object v1, p1, Lv4/q;->h:Lv4/z;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lv4/a;->d(Lv4/a;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    return v0

    .line 25
    :cond_1
    iget-object v0, p0, Lv4/q;->j:Lv4/d0;

    .line 26
    .line 27
    iget-object v1, p1, Lv4/q;->j:Lv4/d0;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lv4/a;->d(Lv4/a;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    return v0

    .line 36
    :cond_2
    iget-object v0, p0, Lv4/q;->k:Lv4/h;

    .line 37
    .line 38
    iget-object p1, p1, Lv4/q;->k:Lv4/h;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Lv4/a;->d(Lv4/a;)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    return p1
.end method

.method public final i()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "InvokeDynamic"

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lv4/q;->a()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
