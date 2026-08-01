.class public final Lm60;
.super Ly50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final synthetic b:Lq60;

.field public final synthetic c:Lww;


# direct methods
.method public constructor <init>(Lq60;Lww;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm60;->b:Lq60;

    .line 2
    .line 3
    iput-object p2, p0, Lm60;->c:Lww;

    .line 4
    .line 5
    invoke-direct {p0, p3}, Ly50;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final g(Lzd0;Ljava/util/List;J)Lyd0;
    .locals 6

    .line 1
    iget-object v2, p0, Lm60;->b:Lq60;

    .line 2
    .line 3
    iget-object p2, v2, Lq60;->k:Lk60;

    .line 4
    .line 5
    invoke-interface {p1}, Ll30;->getLayoutDirection()Lk50;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p2, Lk60;->d:Lk50;

    .line 10
    .line 11
    invoke-interface {p1}, Lym;->b()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p2, Lk60;->e:F

    .line 16
    .line 17
    invoke-interface {p1}, Lym;->h()F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, p2, Lk60;->f:F

    .line 22
    .line 23
    invoke-interface {p1}, Ll30;->m()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iget-object p0, p0, Lm60;->c:Lww;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    iget-object p1, v2, Lq60;->d:Lb60;

    .line 33
    .line 34
    iget-object p1, p1, Lb60;->l:Lb60;

    .line 35
    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    iput v0, v2, Lq60;->h:I

    .line 39
    .line 40
    iget-object p1, v2, Lq60;->l:Lh60;

    .line 41
    .line 42
    new-instance p2, Lpj;

    .line 43
    .line 44
    invoke-direct {p2, p3, p4}, Lpj;-><init>(J)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p0, p1, p2}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    move-object v1, p0

    .line 52
    check-cast v1, Lyd0;

    .line 53
    .line 54
    iget v3, v2, Lq60;->h:I

    .line 55
    .line 56
    new-instance v0, Ll60;

    .line 57
    .line 58
    const/4 v5, 0x0

    .line 59
    move-object v4, v1

    .line 60
    invoke-direct/range {v0 .. v5}, Ll60;-><init>(Lyd0;Lq60;ILyd0;I)V

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_0
    iput v0, v2, Lq60;->g:I

    .line 65
    .line 66
    new-instance p1, Lpj;

    .line 67
    .line 68
    invoke-direct {p1, p3, p4}, Lpj;-><init>(J)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p0, p2, p1}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    move-object v1, p0

    .line 76
    check-cast v1, Lyd0;

    .line 77
    .line 78
    iget v3, v2, Lq60;->g:I

    .line 79
    .line 80
    new-instance v0, Ll60;

    .line 81
    .line 82
    const/4 v5, 0x1

    .line 83
    move-object v4, v1

    .line 84
    invoke-direct/range {v0 .. v5}, Ll60;-><init>(Lyd0;Lq60;ILyd0;I)V

    .line 85
    .line 86
    .line 87
    return-object v0
.end method
