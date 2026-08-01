.class public final LW/j;
.super Lb0/c;
.source "SourceFile"


# static fields
.field public static final p:LW/i;

.field public static final q:LT/s;


# instance fields
.field public final m:Ljava/util/ArrayList;

.field public n:Ljava/lang/String;

.field public o:LT/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LW/i;

    .line 2
    .line 3
    invoke-direct {v0}, LW/i;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LW/j;->p:LW/i;

    .line 7
    .line 8
    new-instance v0, LT/s;

    .line 9
    .line 10
    const-string v1, "closed"

    .line 11
    .line 12
    invoke-direct {v0, v1}, LT/s;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sput-object v0, LW/j;->q:LT/s;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, LW/j;->p:LW/i;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lb0/c;-><init>(Ljava/io/Writer;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LW/j;->m:Ljava/util/ArrayList;

    .line 12
    .line 13
    sget-object v0, LT/q;->a:LT/q;

    .line 14
    .line 15
    iput-object v0, p0, LW/j;->o:LT/o;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    .line 1
    new-instance v0, LT/n;

    .line 2
    .line 3
    invoke-direct {v0}, LT/n;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, LW/j;->t(LT/o;)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, LW/j;->m:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    new-instance v0, LT/r;

    .line 2
    .line 3
    invoke-direct {v0}, LT/r;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, LW/j;->t(LT/o;)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, LW/j;->m:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, LW/j;->m:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    sget-object v1, LW/j;->q:LT/s;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 16
    .line 17
    const-string v1, "Incomplete document"

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw v0
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, LW/j;->m:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, LW/j;->n:Ljava/lang/String;

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, LW/j;->s()LT/o;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    instance-of v1, v1, LT/n;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    add-int/lit8 v1, v1, -0x1

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 40
    .line 41
    .line 42
    throw v0
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, LW/j;->m:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, LW/j;->n:Ljava/lang/String;

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, LW/j;->s()LT/o;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    instance-of v1, v1, LT/r;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    add-int/lit8 v1, v1, -0x1

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 40
    .line 41
    .line 42
    throw v0
.end method

.method public final flush()V
    .locals 0

    .line 1
    return-void
.end method

.method public final g(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "name == null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LW/j;->m:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, LW/j;->n:Ljava/lang/String;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, LW/j;->s()LT/o;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    instance-of v0, v0, LT/r;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iput-object p1, p0, LW/j;->n:Ljava/lang/String;

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 38
    .line 39
    .line 40
    throw p1
.end method

.method public final i()Lb0/c;
    .locals 1

    .line 1
    sget-object v0, LT/q;->a:LT/q;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, LW/j;->t(LT/o;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final l(D)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lb0/c;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {p1, p2}, Ljava/lang/Double;->isInfinite(D)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, "JSON forbids NaN and infinities: "

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :cond_1
    :goto_0
    new-instance v0, LT/s;

    .line 39
    .line 40
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {v0, p1}, LT/s;-><init>(Ljava/lang/Number;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0}, LW/j;->t(LT/o;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final m(J)V
    .locals 1

    .line 1
    new-instance v0, LT/s;

    .line 2
    .line 3
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, LT/s;-><init>(Ljava/lang/Number;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, LW/j;->t(LT/o;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final n(Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, LT/q;->a:LT/q;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, LW/j;->t(LT/o;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, LT/s;

    .line 10
    .line 11
    invoke-direct {v0, p1}, LT/s;-><init>(Ljava/lang/Boolean;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, LW/j;->t(LT/o;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final o(Ljava/lang/Number;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, LT/q;->a:LT/q;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, LW/j;->t(LT/o;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-boolean v0, p0, Lb0/c;->f:Z

    .line 10
    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v2, "JSON forbids NaN and infinities: "

    .line 35
    .line 36
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :cond_2
    :goto_0
    new-instance v0, LT/s;

    .line 51
    .line 52
    invoke-direct {v0, p1}, LT/s;-><init>(Ljava/lang/Number;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v0}, LW/j;->t(LT/o;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final p(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, LT/q;->a:LT/q;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, LW/j;->t(LT/o;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, LT/s;

    .line 10
    .line 11
    invoke-direct {v0, p1}, LT/s;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, LW/j;->t(LT/o;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final q(Z)V
    .locals 1

    .line 1
    new-instance v0, LT/s;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, LT/s;-><init>(Ljava/lang/Boolean;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, LW/j;->t(LT/o;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final s()LT/o;
    .locals 2

    .line 1
    iget-object v0, p0, LW/j;->m:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, LT/o;

    .line 14
    .line 15
    return-object v0
.end method

.method public final t(LT/o;)V
    .locals 2

    .line 1
    iget-object v0, p0, LW/j;->n:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    instance-of v0, p1, LT/q;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Lb0/c;->i:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, LW/j;->s()LT/o;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, LT/r;

    .line 18
    .line 19
    iget-object v1, p0, LW/j;->n:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v0, v0, LT/r;->a:LV/o;

    .line 22
    .line 23
    invoke-virtual {v0, v1, p1}, LV/o;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    :cond_1
    const/4 p1, 0x0

    .line 27
    iput-object p1, p0, LW/j;->n:Ljava/lang/String;

    .line 28
    .line 29
    return-void

    .line 30
    :cond_2
    iget-object v0, p0, LW/j;->m:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    iput-object p1, p0, LW/j;->o:LT/o;

    .line 39
    .line 40
    return-void

    .line 41
    :cond_3
    invoke-virtual {p0}, LW/j;->s()LT/o;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    instance-of v1, v0, LT/n;

    .line 46
    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    check-cast v0, LT/n;

    .line 50
    .line 51
    iget-object v0, v0, LT/n;->a:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 60
    .line 61
    .line 62
    throw p1
.end method
