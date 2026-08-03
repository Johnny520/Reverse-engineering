.class public final Lk/d0;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/m;


# instance fields
.field public final u:Ln/k;

.field public v:Z

.field public w:Z

.field public x:Z


# direct methods
.method public constructor <init>(Ln/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ly0/n;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk/d0;->u:Ln/k;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final B(Lx1/h0;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Lx1/h0;->e()V

    .line 2
    .line 3
    .line 4
    iget-object v1, p1, Lx1/h0;->g:Lh1/b;

    .line 5
    .line 6
    iget-boolean v2, p0, Lk/d0;->v:Z

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    sget-wide v2, Lf1/w;->b:J

    .line 11
    .line 12
    const v4, 0x3e99999a    # 0.3f

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v3, v4}, Lf1/w;->b(JF)J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    move-wide v8, v2

    .line 20
    move-object v3, v1

    .line 21
    move-wide v1, v8

    .line 22
    invoke-interface {v3}, Lh1/d;->a()J

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    const/4 v6, 0x0

    .line 27
    const/16 v7, 0x7a

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    move-object v0, p1

    .line 31
    invoke-static/range {v0 .. v7}, Lh1/d;->Z(Lh1/d;JJFII)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    move-object v3, v1

    .line 36
    iget-boolean v0, p0, Lk/d0;->w:Z

    .line 37
    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    iget-boolean v0, p0, Lk/d0;->x:Z

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-void

    .line 46
    :cond_2
    :goto_0
    sget-wide v0, Lf1/w;->b:J

    .line 47
    .line 48
    const v2, 0x3dcccccd    # 0.1f

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v1, v2}, Lf1/w;->b(JF)J

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    invoke-interface {v3}, Lh1/d;->a()J

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    const/4 v6, 0x0

    .line 60
    const/16 v7, 0x7a

    .line 61
    .line 62
    const/4 v5, 0x0

    .line 63
    move-object v0, p1

    .line 64
    invoke-static/range {v0 .. v7}, Lh1/d;->Z(Lh1/d;JJFII)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final c1()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ly0/n;->Y0()Lqg/t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lci/c;

    .line 6
    .line 7
    const/4 v2, 0x4

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v1, p0, v3, v2}, Lci/c;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x3

    .line 13
    invoke-static {v0, v3, v1, v2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 14
    .line 15
    .line 16
    return-void
.end method
