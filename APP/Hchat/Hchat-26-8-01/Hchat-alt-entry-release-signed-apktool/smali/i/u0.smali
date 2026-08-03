.class public final synthetic Li/u0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Lgg/u;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Li/g;

.field public final synthetic j:Li/q;

.field public final synthetic k:Li/l;

.field public final synthetic l:F

.field public final synthetic m:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Lgg/u;Ljava/lang/Object;Li/g;Li/q;Li/l;FLfg/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li/u0;->g:Lgg/u;

    .line 5
    .line 6
    iput-object p2, p0, Li/u0;->h:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Li/u0;->i:Li/g;

    .line 9
    .line 10
    iput-object p4, p0, Li/u0;->j:Li/q;

    .line 11
    .line 12
    iput-object p5, p0, Li/u0;->k:Li/l;

    .line 13
    .line 14
    iput p6, p0, Li/u0;->l:F

    .line 15
    .line 16
    iput-object p7, p0, Li/u0;->m:Lfg/l;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, Ljava/lang/Long;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    new-instance v0, Li/j;

    .line 8
    .line 9
    iget-object p1, p0, Li/u0;->i:Li/g;

    .line 10
    .line 11
    move-wide v4, v1

    .line 12
    invoke-interface {p1}, Li/g;->c()Li/m1;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {p1}, Li/g;->g()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    new-instance v9, Li/v0;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    iget-object v10, p0, Li/u0;->k:Li/l;

    .line 24
    .line 25
    invoke-direct {v9, v1, v10}, Li/v0;-><init>(ILi/l;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Li/u0;->h:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v3, p0, Li/u0;->j:Li/q;

    .line 31
    .line 32
    move-wide v7, v4

    .line 33
    invoke-direct/range {v0 .. v9}, Li/j;-><init>(Ljava/lang/Object;Li/m1;Li/q;JLjava/lang/Object;JLfg/a;)V

    .line 34
    .line 35
    .line 36
    iget v3, p0, Li/u0;->l:F

    .line 37
    .line 38
    iget-object v6, p0, Li/u0;->m:Lfg/l;

    .line 39
    .line 40
    move-wide v1, v4

    .line 41
    move-object v5, v10

    .line 42
    move-object v4, p1

    .line 43
    invoke-static/range {v0 .. v6}, Li/d;->m(Li/j;JFLi/g;Li/l;Lfg/l;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Li/u0;->g:Lgg/u;

    .line 47
    .line 48
    iput-object v0, p1, Lgg/u;->g:Ljava/lang/Object;

    .line 49
    .line 50
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 51
    .line 52
    return-object p1
.end method
