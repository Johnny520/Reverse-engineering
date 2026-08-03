.class public final Lpd/e;
.super Lud/p;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final s:Lqd/h;

.field public static final t:Lqd/h;

.field public static final u:Lqd/h;

.field public static final v:Lqd/h;


# instance fields
.field public final o:Ljava/lang/Object;

.field public final p:I

.field public final q:I

.field public r:Lqd/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lqd/q;->l:Lqd/q;

    .line 2
    .line 3
    sget-object v1, Lqd/q;->j:Lqd/q;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Lqd/q;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lqd/h;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Lqd/h;-><init>([Lqd/q;)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Lpd/e;->s:Lqd/h;

    .line 15
    .line 16
    sget-object v0, Lqd/q;->m:Lqd/q;

    .line 17
    .line 18
    sget-object v1, Lqd/q;->k:Lqd/q;

    .line 19
    .line 20
    filled-new-array {v0, v1}, [Lqd/q;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, Lqd/h;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Lqd/h;-><init>([Lqd/q;)V

    .line 27
    .line 28
    .line 29
    sput-object v1, Lpd/e;->t:Lqd/h;

    .line 30
    .line 31
    sget-object v0, Lqd/q;->n:Lqd/q;

    .line 32
    .line 33
    sget-object v1, Lqd/q;->o:Lqd/q;

    .line 34
    .line 35
    filled-new-array {v0, v1}, [Lqd/q;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v1, Lqd/h;

    .line 40
    .line 41
    invoke-direct {v1, v0}, Lqd/h;-><init>([Lqd/q;)V

    .line 42
    .line 43
    .line 44
    sput-object v1, Lpd/e;->u:Lqd/h;

    .line 45
    .line 46
    sget-object v0, Lqd/q;->p:Lqd/q;

    .line 47
    .line 48
    sget-object v1, Lqd/q;->q:Lqd/q;

    .line 49
    .line 50
    filled-new-array {v0, v1}, [Lqd/q;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    new-instance v1, Lqd/h;

    .line 55
    .line 56
    invoke-direct {v1, v0}, Lqd/h;-><init>([Lqd/q;)V

    .line 57
    .line 58
    .line 59
    sput-object v1, Lpd/e;->v:Lqd/h;

    .line 60
    .line 61
    return-void
.end method

.method public constructor <init>(IILjava/lang/Object;)V
    .locals 2

    .line 1
    sget-object v0, Lpd/k;->E:Lpd/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, v0, v1}, Lud/p;-><init>(Lpd/k;I)V

    .line 5
    .line 6
    .line 7
    iput-object p3, p0, Lpd/e;->o:Ljava/lang/Object;

    .line 8
    .line 9
    iput p1, p0, Lpd/e;->p:I

    .line 10
    .line 11
    iput p2, p0, Lpd/e;->q:I

    .line 12
    .line 13
    if-eqz p2, :cond_3

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    if-eq p2, p1, :cond_3

    .line 17
    .line 18
    const/4 p1, 0x2

    .line 19
    if-eq p2, p1, :cond_2

    .line 20
    .line 21
    const/4 p1, 0x4

    .line 22
    if-eq p2, p1, :cond_1

    .line 23
    .line 24
    const/16 p1, 0x8

    .line 25
    .line 26
    if-ne p2, p1, :cond_0

    .line 27
    .line 28
    sget-object p1, Lpd/e;->v:Lqd/h;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string p1, "Unknown array element width: "

    .line 32
    .line 33
    invoke-static {p2, p1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    throw p1

    .line 42
    :cond_1
    sget-object p1, Lpd/e;->u:Lqd/h;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    sget-object p1, Lpd/e;->t:Lqd/h;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    sget-object p1, Lpd/e;->s:Lqd/h;

    .line 49
    .line 50
    :goto_0
    iput-object p1, p0, Lpd/e;->r:Lqd/h;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final O()Lud/p;
    .locals 4

    .line 1
    new-instance v0, Lpd/e;

    .line 2
    .line 3
    iget v1, p0, Lpd/e;->p:I

    .line 4
    .line 5
    iget v2, p0, Lpd/e;->q:I

    .line 6
    .line 7
    iget-object v3, p0, Lpd/e;->o:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, Lpd/e;-><init>(IILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lpd/e;->r:Lqd/h;

    .line 13
    .line 14
    iput-object v1, v0, Lpd/e;->r:Lqd/h;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lud/p;->P(Lud/p;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final Y(Lud/p;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lpd/e;

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-super {p0, p1}, Lud/p;->Y(Lud/p;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    check-cast p1, Lpd/e;

    .line 16
    .line 17
    iget-object v0, p0, Lpd/e;->r:Lqd/h;

    .line 18
    .line 19
    iget-object v1, p1, Lpd/e;->r:Lqd/h;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, Lpd/e;->o:Ljava/lang/Object;

    .line 28
    .line 29
    iget-object p1, p1, Lpd/e;->o:Ljava/lang/Object;

    .line 30
    .line 31
    if-ne v0, p1, :cond_2

    .line 32
    .line 33
    :goto_0
    const/4 p1, 0x1

    .line 34
    return p1

    .line 35
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 36
    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-super {p0}, Lud/p;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    iget-object v2, p0, Lpd/e;->o:Ljava/lang/Object;

    .line 7
    .line 8
    iget v3, p0, Lpd/e;->q:I

    .line 9
    .line 10
    if-eq v3, v1, :cond_3

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v3, v1, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    if-eq v3, v1, :cond_1

    .line 17
    .line 18
    const/16 v1, 0x8

    .line 19
    .line 20
    if-eq v3, v1, :cond_0

    .line 21
    .line 22
    const-string v1, "?"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    check-cast v2, [J

    .line 26
    .line 27
    invoke-static {v2}, Ljava/util/Arrays;->toString([J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    check-cast v2, [I

    .line 33
    .line 34
    invoke-static {v2}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    goto :goto_0

    .line 39
    :cond_2
    check-cast v2, [S

    .line 40
    .line 41
    invoke-static {v2}, Ljava/util/Arrays;->toString([S)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    goto :goto_0

    .line 46
    :cond_3
    check-cast v2, [B

    .line 47
    .line 48
    invoke-static {v2}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    :goto_0
    const-string v2, ", data: "

    .line 53
    .line 54
    invoke-static {v0, v2, v1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    return-object v0
.end method
