.class public final Lql;
.super Loe0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ltq;


# instance fields
.field public final r:Lg30;

.field public s:Z

.field public t:Z

.field public u:Z


# direct methods
.method public constructor <init>(Lg30;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Loe0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lql;->r:Lg30;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final B(Ld60;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ld60;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v2, p1, Ld60;->d:Ldd;

    .line 5
    .line 6
    iget-boolean v3, p0, Lql;->s:Z

    .line 7
    .line 8
    if-eqz v3, :cond_0

    .line 9
    .line 10
    sget-wide v3, Lff;->b:J

    .line 11
    .line 12
    const v0, 0x3e99999a    # 0.3f

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v3, v4}, Lff;->b(FJ)J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    move-wide v6, v3

    .line 20
    move-object v3, v2

    .line 21
    move-wide v1, v6

    .line 22
    invoke-interface {v3}, Luq;->c()J

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    const/16 v5, 0x7a

    .line 27
    .line 28
    move-object v0, p1

    .line 29
    invoke-static/range {v0 .. v5}, Luq;->v(Luq;JJI)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    move-object v3, v2

    .line 34
    iget-boolean v1, p0, Lql;->t:Z

    .line 35
    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    iget-boolean v0, p0, Lql;->u:Z

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    return-void

    .line 44
    :cond_2
    :goto_0
    sget-wide v0, Lff;->b:J

    .line 45
    .line 46
    const v2, 0x3dcccccd    # 0.1f

    .line 47
    .line 48
    .line 49
    invoke-static {v2, v0, v1}, Lff;->b(FJ)J

    .line 50
    .line 51
    .line 52
    move-result-wide v1

    .line 53
    invoke-interface {v3}, Luq;->c()J

    .line 54
    .line 55
    .line 56
    move-result-wide v3

    .line 57
    const/16 v5, 0x7a

    .line 58
    .line 59
    move-object v0, p1

    .line 60
    invoke-static/range {v0 .. v5}, Luq;->v(Luq;JJI)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final o0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Loe0;->k0()Lyk;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcg;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v1, p0, v3, v2}, Lcg;-><init>(Ljava/lang/Object;Lik;I)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x3

    .line 13
    invoke-static {v0, v3, v1, p0}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 14
    .line 15
    .line 16
    return-void
.end method
