.class public abstract Lat0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final a:Lh90;


# direct methods
.method public constructor <init>(Lhw;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lh90;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lh90;-><init>(Lhw;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lat0;->a:Lh90;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;)Lct0;
.end method

.method public b()Lcb1;
    .locals 0

    .line 1
    iget-object p0, p0, Lat0;->a:Lh90;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c(Lct0;Lcb1;)Lcb1;
    .locals 4

    .line 1
    iget-object p0, p1, Lct0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    iget-boolean v0, p1, Lct0;->d:Z

    .line 4
    .line 5
    instance-of v1, p2, Lar;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    move-object v2, p2

    .line 13
    check-cast v2, Lar;

    .line 14
    .line 15
    iget-object p2, v2, Lar;->a:Lgp0;

    .line 16
    .line 17
    invoke-virtual {p1}, Lct0;->a()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p2, v1}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    instance-of v1, p2, Lh41;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    iget-boolean v1, p1, Lct0;->b:Z

    .line 30
    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    :cond_1
    if-nez v0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p1}, Lct0;->a()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast p2, Lh41;

    .line 42
    .line 43
    iget-object v3, p2, Lh41;->a:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-static {v1, v3}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    move-object v2, p2

    .line 52
    :cond_2
    :goto_0
    if-nez v2, :cond_5

    .line 53
    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    new-instance p2, Lar;

    .line 57
    .line 58
    iget-object p1, p1, Lct0;->c:Ln2;

    .line 59
    .line 60
    if-nez p1, :cond_3

    .line 61
    .line 62
    sget-object p1, Ln2;->U:Ln2;

    .line 63
    .line 64
    :cond_3
    new-instance v0, Lgp0;

    .line 65
    .line 66
    invoke-direct {v0, p0, p1}, Lgp0;-><init>(Ljava/lang/Object;Ln2;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p2, v0}, Lar;-><init>(Lgp0;)V

    .line 70
    .line 71
    .line 72
    return-object p2

    .line 73
    :cond_4
    new-instance p0, Lh41;

    .line 74
    .line 75
    invoke-virtual {p1}, Lct0;->a()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-direct {p0, p1}, Lh41;-><init>(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_5
    return-object v2
.end method
