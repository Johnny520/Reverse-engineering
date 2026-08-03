.class public final Ld6/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final e:Ld6/e;


# instance fields
.field public a:Ljava/lang/Comparable;

.field public b:Ljava/lang/Comparable;

.field public c:Z

.field public d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ld6/e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Ld6/e;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ld6/i;->e:Ld6/e;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/Comparable;Ljava/lang/Comparable;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld6/i;->a:Ljava/lang/Comparable;

    .line 5
    .line 6
    iput-object p2, p0, Ld6/i;->b:Ljava/lang/Comparable;

    .line 7
    .line 8
    iput-boolean p3, p0, Ld6/i;->c:Z

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Ld6/i;->d:Z

    .line 12
    .line 13
    return-void
.end method

.method public static a()Ld6/i;
    .locals 2

    .line 1
    new-instance v0, Ld6/i;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Ld6/i;->d:Z

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput-object v1, v0, Ld6/i;->a:Ljava/lang/Comparable;

    .line 11
    .line 12
    iput-object v1, v0, Ld6/i;->b:Ljava/lang/Comparable;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-boolean v1, v0, Ld6/i;->c:Z

    .line 16
    .line 17
    return-object v0
.end method

.method public static g()Ld6/i;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0, v0}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-gtz v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ld6/i;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v1, v0, v0, v2}, Ld6/i;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;Z)V

    .line 16
    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_0
    const-string v0, "lowerBound must be <= upperBound"

    .line 20
    .line 21
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    return-object v0
.end method


# virtual methods
.method public final b(Ljava/lang/Integer;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Ld6/i;->b:Ljava/lang/Comparable;

    .line 2
    .line 3
    iget-object v1, p0, Ld6/i;->a:Ljava/lang/Comparable;

    .line 4
    .line 5
    iget-boolean v2, p0, Ld6/i;->d:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    if-eqz v1, :cond_2

    .line 11
    .line 12
    iget-boolean v2, p0, Ld6/i;->c:Z

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {p1, v1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-gez v1, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    if-eqz v0, :cond_3

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-lez p1, :cond_3

    .line 37
    .line 38
    :goto_0
    const/4 p1, 0x0

    .line 39
    return p1

    .line 40
    :cond_3
    :goto_1
    const/4 p1, 0x1

    .line 41
    return p1
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ld6/i;->a:Ljava/lang/Comparable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ld6/i;->b:Ljava/lang/Comparable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final e(Ld6/i;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ld6/i;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ld6/i;->d()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Ld6/i;->a:Ljava/lang/Comparable;

    .line 14
    .line 15
    iget-object v1, p1, Ld6/i;->b:Ljava/lang/Comparable;

    .line 16
    .line 17
    invoke-interface {v0, v1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-gtz v0, :cond_1

    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Ld6/i;->d()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p1}, Ld6/i;->c()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object p1, p1, Ld6/i;->a:Ljava/lang/Comparable;

    .line 36
    .line 37
    iget-object v0, p0, Ld6/i;->b:Ljava/lang/Comparable;

    .line 38
    .line 39
    invoke-interface {p1, v0}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-gtz p1, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 p1, 0x0

    .line 47
    return p1

    .line 48
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 49
    return p1
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
    instance-of v1, p1, Ld6/i;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Ld6/i;

    .line 11
    .line 12
    iget-boolean v1, p0, Ld6/i;->d:Z

    .line 13
    .line 14
    iget-boolean v2, p1, Ld6/i;->d:Z

    .line 15
    .line 16
    if-eq v1, v2, :cond_2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_2
    iget-object v1, p0, Ld6/i;->a:Ljava/lang/Comparable;

    .line 20
    .line 21
    iget-object v2, p1, Ld6/i;->a:Ljava/lang/Comparable;

    .line 22
    .line 23
    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_3

    .line 28
    .line 29
    iget-object v1, p0, Ld6/i;->b:Ljava/lang/Comparable;

    .line 30
    .line 31
    iget-object v2, p1, Ld6/i;->b:Ljava/lang/Comparable;

    .line 32
    .line 33
    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    iget-boolean v1, p0, Ld6/i;->c:Z

    .line 40
    .line 41
    iget-boolean p1, p1, Ld6/i;->c:Z

    .line 42
    .line 43
    if-ne v1, p1, :cond_3

    .line 44
    .line 45
    return v0

    .line 46
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 47
    return p1
.end method

.method public final f()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Ld6/i;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Ld6/i;->a:Ljava/lang/Comparable;

    .line 6
    .line 7
    iget-object v1, p0, Ld6/i;->b:Ljava/lang/Comparable;

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-boolean v0, p0, Ld6/i;->c:Z

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x1

    .line 21
    return v0

    .line 22
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 23
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-boolean v0, p0, Ld6/i;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "[*]"

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-boolean v0, p0, Ld6/i;->c:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const-string v0, "("

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const-string v0, "["

    .line 16
    .line 17
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Ld6/i;->a:Ljava/lang/Comparable;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, ", "

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Ld6/i;->b:Ljava/lang/Comparable;

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-string v1, "]"

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    return-object v0
.end method
