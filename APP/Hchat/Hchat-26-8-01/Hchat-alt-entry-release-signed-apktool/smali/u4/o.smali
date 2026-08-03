.class public final Lu4/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lw4/d;
.implements Lz4/k;
.implements Ljava/lang/Comparable;


# static fields
.field public static final j:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final k:Ld6/m;


# instance fields
.field public final g:I

.field public final h:Lw4/d;

.field public final i:Lu4/k;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    const/16 v1, 0x2710

    .line 4
    .line 5
    const/high16 v2, 0x3f400000    # 0.75f

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IF)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lu4/o;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    new-instance v0, Ld6/m;

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-direct {v0, v1}, Ld6/m;-><init>(I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lu4/o;->k:Ld6/m;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(ILw4/d;Lu4/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_1

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iput p1, p0, Lu4/o;->g:I

    .line 9
    .line 10
    iput-object p2, p0, Lu4/o;->h:Lw4/d;

    .line 11
    .line 12
    iput-object p3, p0, Lu4/o;->i:Lu4/k;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p1, "type == null"

    .line 16
    .line 17
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    throw p1

    .line 22
    :cond_1
    const-string p1, "reg < 0"

    .line 23
    .line 24
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    throw p1
.end method

.method public static k(ILw4/d;Lu4/k;)Lu4/o;
    .locals 2

    .line 1
    sget-object v0, Lu4/o;->k:Ld6/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lu4/n;

    .line 8
    .line 9
    iput p0, v0, Lu4/n;->a:I

    .line 10
    .line 11
    iput-object p1, v0, Lu4/n;->b:Lw4/d;

    .line 12
    .line 13
    iput-object p2, v0, Lu4/n;->c:Lu4/k;

    .line 14
    .line 15
    sget-object p0, Lu4/o;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lu4/o;

    .line 22
    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    new-instance p1, Lu4/o;

    .line 26
    .line 27
    iget p2, v0, Lu4/n;->a:I

    .line 28
    .line 29
    iget-object v1, v0, Lu4/n;->b:Lw4/d;

    .line 30
    .line 31
    iget-object v0, v0, Lu4/n;->c:Lu4/k;

    .line 32
    .line 33
    invoke-direct {p1, p2, v1, v0}, Lu4/o;-><init>(ILw4/d;Lu4/k;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Lu4/o;

    .line 41
    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_0
    return-object p1
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lu4/o;->n(Z)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget-object v0, p0, Lu4/o;->h:Lw4/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lw4/d;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lu4/o;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lu4/o;->d(Lu4/o;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final d(Lu4/o;)I
    .locals 2

    .line 1
    iget v0, p1, Lu4/o;->g:I

    .line 2
    .line 3
    iget v1, p0, Lu4/o;->g:I

    .line 4
    .line 5
    if-ge v1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    if-le v1, v0, :cond_1

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_1
    if-ne p0, p1, :cond_2

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_2
    iget-object v0, p0, Lu4/o;->h:Lw4/d;

    .line 15
    .line 16
    invoke-interface {v0}, Lw4/d;->getType()Lw4/c;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p1, Lu4/o;->h:Lw4/d;

    .line 21
    .line 22
    invoke-interface {v1}, Lw4/d;->getType()Lw4/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v0, v0, Lw4/c;->g:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v1, v1, Lw4/c;->g:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    return v0

    .line 37
    :cond_3
    iget-object p1, p1, Lu4/o;->i:Lu4/k;

    .line 38
    .line 39
    iget-object v0, p0, Lu4/o;->i:Lu4/k;

    .line 40
    .line 41
    if-nez v0, :cond_5

    .line 42
    .line 43
    if-nez p1, :cond_4

    .line 44
    .line 45
    :goto_0
    const/4 p1, 0x0

    .line 46
    return p1

    .line 47
    :cond_4
    :goto_1
    const/4 p1, -0x1

    .line 48
    return p1

    .line 49
    :cond_5
    if-nez p1, :cond_6

    .line 50
    .line 51
    :goto_2
    const/4 p1, 0x1

    .line 52
    return p1

    .line 53
    :cond_6
    invoke-virtual {v0, p1}, Lu4/k;->a(Lu4/k;)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    return p1
.end method

.method public final e(ILw4/d;Lu4/k;)Z
    .locals 1

    .line 1
    iget v0, p0, Lu4/o;->g:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, Lu4/o;->h:Lw4/d;

    .line 6
    .line 7
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    iget-object p1, p0, Lu4/o;->i:Lu4/k;

    .line 14
    .line 15
    if-eq p1, p3, :cond_0

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1, p3}, Lu4/k;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    :cond_0
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Lu4/o;

    .line 6
    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    instance-of v0, p1, Lu4/n;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    check-cast p1, Lu4/n;

    .line 14
    .line 15
    iget v0, p1, Lu4/n;->a:I

    .line 16
    .line 17
    iget-object v1, p1, Lu4/n;->b:Lw4/d;

    .line 18
    .line 19
    iget-object p1, p1, Lu4/n;->c:Lu4/k;

    .line 20
    .line 21
    invoke-virtual {p0, v0, v1, p1}, Lu4/o;->e(ILw4/d;Lu4/k;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1

    .line 26
    :cond_1
    const/4 p1, 0x0

    .line 27
    return p1

    .line 28
    :cond_2
    check-cast p1, Lu4/o;

    .line 29
    .line 30
    iget v0, p1, Lu4/o;->g:I

    .line 31
    .line 32
    iget-object v1, p1, Lu4/o;->h:Lw4/d;

    .line 33
    .line 34
    iget-object p1, p1, Lu4/o;->i:Lu4/k;

    .line 35
    .line 36
    invoke-virtual {p0, v0, v1, p1}, Lu4/o;->e(ILw4/d;Lu4/k;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1
.end method

.method public final f()I
    .locals 1

    .line 1
    iget-object v0, p0, Lu4/o;->h:Lw4/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lw4/d;->f()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final g()Lw4/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lu4/o;->h:Lw4/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lw4/d;->g()Lw4/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final getType()Lw4/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lu4/o;->h:Lw4/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lw4/d;->getType()Lw4/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lu4/o;->i:Lu4/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lu4/k;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 12
    .line 13
    iget-object v1, p0, Lu4/o;->h:Lw4/d;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v1, v0

    .line 20
    mul-int/lit8 v1, v1, 0x1f

    .line 21
    .line 22
    iget v0, p0, Lu4/o;->g:I

    .line 23
    .line 24
    add-int/2addr v1, v0

    .line 25
    return v1
.end method

.method public final i(Lu4/o;)Z
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lu4/o;->l(Lu4/o;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget v0, p0, Lu4/o;->g:I

    .line 10
    .line 11
    iget p1, p1, Lu4/o;->g:I

    .line 12
    .line 13
    if-ne v0, p1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_1
    return v1
.end method

.method public final j()I
    .locals 1

    .line 1
    iget-object v0, p0, Lu4/o;->h:Lw4/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lw4/d;->getType()Lw4/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lw4/c;->i()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final l(Lu4/o;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Lu4/o;->h:Lw4/d;

    .line 6
    .line 7
    invoke-interface {v1}, Lw4/d;->getType()Lw4/c;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p1, Lu4/o;->h:Lw4/d;

    .line 12
    .line 13
    invoke-interface {v2}, Lw4/d;->getType()Lw4/c;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v1, v2}, Lw4/c;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object p1, p1, Lu4/o;->i:Lu4/k;

    .line 24
    .line 25
    iget-object v1, p0, Lu4/o;->i:Lu4/k;

    .line 26
    .line 27
    if-eq v1, p1, :cond_1

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Lu4/k;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    :cond_1
    const/4 p1, 0x1

    .line 38
    return p1

    .line 39
    :cond_2
    return v0
.end method

.method public final m()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lu4/o;->g:I

    .line 2
    .line 3
    const-string v1, "v"

    .line 4
    .line 5
    invoke-static {v0, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final n(Z)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x28

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lu4/o;->m()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ":"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lu4/o;->i:Lu4/k;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Lu4/k;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object v1, p0, Lu4/o;->h:Lw4/d;

    .line 32
    .line 33
    invoke-interface {v1}, Lw4/d;->getType()Lw4/c;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    if-eq v2, v1, :cond_3

    .line 41
    .line 42
    const-string v2, "="

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    instance-of v2, v1, Lv4/c0;

    .line 50
    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    check-cast v1, Lv4/c0;

    .line 54
    .line 55
    invoke-virtual {v1}, Lv4/c0;->l()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    if-eqz p1, :cond_2

    .line 64
    .line 65
    instance-of p1, v1, Lv4/a;

    .line 66
    .line 67
    if-eqz p1, :cond_2

    .line 68
    .line 69
    invoke-interface {v1}, Lz4/k;->a()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    :cond_3
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    return-object p1
.end method

.method public final o(I)Lu4/o;
    .locals 2

    .line 1
    iget v0, p0, Lu4/o;->g:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget-object v0, p0, Lu4/o;->h:Lw4/d;

    .line 7
    .line 8
    iget-object v1, p0, Lu4/o;->i:Lu4/k;

    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Lu4/o;->k(ILw4/d;Lu4/k;)Lu4/o;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public final p(Lw4/d;)Lu4/o;
    .locals 2

    .line 1
    iget v0, p0, Lu4/o;->g:I

    .line 2
    .line 3
    iget-object v1, p0, Lu4/o;->i:Lu4/k;

    .line 4
    .line 5
    invoke-static {v0, p1, v1}, Lu4/o;->k(ILw4/d;Lu4/k;)Lu4/o;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lu4/o;->n(Z)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method
