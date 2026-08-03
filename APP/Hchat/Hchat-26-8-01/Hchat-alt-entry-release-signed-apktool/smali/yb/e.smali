.class public final synthetic Lyb/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Lyb/f;

.field public final synthetic h:Lf1/c0;

.field public final synthetic i:F

.field public final synthetic j:F


# direct methods
.method public synthetic constructor <init>(Lyb/f;Lf1/c0;FF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyb/e;->g:Lyb/f;

    .line 5
    .line 6
    iput-object p2, p0, Lyb/e;->h:Lf1/c0;

    .line 7
    .line 8
    iput p3, p0, Lyb/e;->i:F

    .line 9
    .line 10
    iput p4, p0, Lyb/e;->j:F

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Lh1/d;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lb5/c;->p()Lf1/u;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, Lf1/u;->e()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lyb/e;->g:Lyb/f;

    .line 18
    .line 19
    iget-object v1, v0, Lyb/f;->y:Lf1/j;

    .line 20
    .line 21
    invoke-interface {p1, v1}, Lf1/u;->d(Lf1/j;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, v0, Lyb/f;->x:Lf1/h;

    .line 25
    .line 26
    iget-object v1, p0, Lyb/e;->h:Lf1/c0;

    .line 27
    .line 28
    invoke-static {p1, v1, v0}, Lf1/c0;->i(Lf1/u;Lf1/c0;Lf1/h;)V

    .line 29
    .line 30
    .line 31
    iget v0, p0, Lyb/e;->i:F

    .line 32
    .line 33
    iget v2, p0, Lyb/e;->j:F

    .line 34
    .line 35
    invoke-interface {p1, v0, v2}, Lf1/u;->m(FF)V

    .line 36
    .line 37
    .line 38
    sget-object v3, Lyb/d;->a:Lf1/h;

    .line 39
    .line 40
    invoke-static {p1, v1, v3}, Lf1/c0;->i(Lf1/u;Lf1/c0;Lf1/h;)V

    .line 41
    .line 42
    .line 43
    neg-float v0, v0

    .line 44
    neg-float v1, v2

    .line 45
    invoke-interface {p1, v0, v1}, Lf1/u;->m(FF)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1}, Lf1/u;->p()V

    .line 49
    .line 50
    .line 51
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 52
    .line 53
    return-object p1
.end method
