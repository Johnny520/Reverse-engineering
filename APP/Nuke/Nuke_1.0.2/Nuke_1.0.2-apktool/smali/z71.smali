.class public final Lz71;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Lcc2;

.field public final b:Lf0;

.field public final c:Lrk1;


# direct methods
.method public constructor <init>(Lcc2;Lf0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz71;->a:Lcc2;

    .line 5
    .line 6
    iput-object p2, p0, Lz71;->b:Lf0;

    .line 7
    .line 8
    sget-object p1, Led2;->a:[J

    .line 9
    .line 10
    new-instance p1, Lrk1;

    .line 11
    .line 12
    invoke-direct {p1}, Lrk1;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lz71;->c:Lrk1;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;Ljava/lang/Object;)Lmn0;
    .locals 6

    .line 1
    iget-object v0, p0, Lz71;->c:Lrk1;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ly71;

    .line 8
    .line 9
    const/16 v2, 0xd

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const v4, 0x30c58c04

    .line 13
    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget v5, v1, Ly71;->c:I

    .line 18
    .line 19
    if-ne v5, p1, :cond_1

    .line 20
    .line 21
    iget-object v5, v1, Ly71;->b:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static {v5, p3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_1

    .line 28
    .line 29
    iget-object p0, v1, Ly71;->d:Lkw;

    .line 30
    .line 31
    if-nez p0, :cond_0

    .line 32
    .line 33
    iget-object p0, v1, Ly71;->e:Lz71;

    .line 34
    .line 35
    new-instance p1, Laf;

    .line 36
    .line 37
    invoke-direct {p1, v2, p0, v1}, Laf;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    new-instance p0, Lkw;

    .line 41
    .line 42
    invoke-direct {p0, v4, v3, p1}, Lkw;-><init>(IZLun0;)V

    .line 43
    .line 44
    .line 45
    iput-object p0, v1, Ly71;->d:Lkw;

    .line 46
    .line 47
    :cond_0
    return-object p0

    .line 48
    :cond_1
    new-instance v1, Ly71;

    .line 49
    .line 50
    invoke-direct {v1, p0, p1, p2, p3}, Ly71;-><init>(Lz71;ILjava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p2, v1}, Lrk1;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, v1, Ly71;->d:Lkw;

    .line 57
    .line 58
    if-nez p1, :cond_2

    .line 59
    .line 60
    new-instance p1, Laf;

    .line 61
    .line 62
    invoke-direct {p1, v2, p0, v1}, Laf;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    new-instance p0, Lkw;

    .line 66
    .line 67
    invoke-direct {p0, v4, v3, p1}, Lkw;-><init>(IZLun0;)V

    .line 68
    .line 69
    .line 70
    iput-object p0, v1, Ly71;->d:Lkw;

    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_2
    return-object p1
.end method

.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lz71;->c:Lrk1;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ly71;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object p0, v0, Ly71;->b:Ljava/lang/Object;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    iget-object p0, p0, Lz71;->b:Lf0;

    .line 18
    .line 19
    invoke-virtual {p0}, Lf0;->a()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Lt81;

    .line 24
    .line 25
    iget-object v0, p0, Lt81;->d:Le9;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Le9;->g(Ljava/lang/Object;)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/4 v0, -0x1

    .line 32
    if-eq p1, v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lt81;->b(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 40
    return-object p0
.end method
