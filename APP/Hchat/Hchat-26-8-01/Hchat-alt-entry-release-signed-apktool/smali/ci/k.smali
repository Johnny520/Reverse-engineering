.class public final Lci/k;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/m;


# instance fields
.field public final A:Li/c;

.field public B:Lqg/e1;

.field public C:Lqg/e1;

.field public final u:Ln/k;

.field public final v:J

.field public w:Z

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Ln/k;J)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ly0/n;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lci/k;->u:Ln/k;

    .line 8
    .line 9
    iput-wide p2, p0, Lci/k;->v:J

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    const p2, 0x3c23d70a    # 0.01f

    .line 13
    .line 14
    .line 15
    invoke-static {p1, p2}, Li/d;->a(FF)Li/c;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lci/k;->A:Li/c;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final B(Lx1/h0;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Lx1/h0;->e()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lci/k;->A:Li/c;

    .line 5
    .line 6
    invoke-virtual {v0}, Li/c;->d()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/Number;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 13
    .line 14
    .line 15
    move-result v6

    .line 16
    const/4 v0, 0x0

    .line 17
    cmpl-float v0, v6, v0

    .line 18
    .line 19
    if-lez v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p1, Lx1/h0;->g:Lh1/b;

    .line 22
    .line 23
    invoke-interface {v0}, Lh1/d;->a()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    const/4 v7, 0x0

    .line 28
    const/16 v8, 0x72

    .line 29
    .line 30
    iget-wide v2, p0, Lci/k;->v:J

    .line 31
    .line 32
    move-object v1, p1

    .line 33
    invoke-static/range {v1 .. v8}, Lh1/d;->Z(Lh1/d;JJFII)V

    .line 34
    .line 35
    .line 36
    :cond_0
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
    const/4 v2, 0x1

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
