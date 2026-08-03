.class public final Lk/i0;
.super Lx1/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/z1;
.implements Lx1/n;
.implements Lx1/h;
.implements Lx1/m1;
.implements Lx1/e2;


# static fields
.field public static final C:Lk/b;


# instance fields
.field public A:Lx1/i1;

.field public final B:Ld1/b0;

.field public w:Ln/k;

.field public final x:Lfg/l;

.field public y:Ln/f;

.field public z:Ls/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lk/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk/i0;->C:Lk/b;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ln/k;ILc0/f;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Lx1/j;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk/i0;->w:Ln/k;

    .line 5
    .line 6
    iput-object p3, p0, Lk/i0;->x:Lfg/l;

    .line 7
    .line 8
    new-instance v0, Lia/t;

    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v8, 0x7

    .line 12
    const/4 v1, 0x2

    .line 13
    const-class v3, Lk/i0;

    .line 14
    .line 15
    const-string v4, "onFocusStateChange"

    .line 16
    .line 17
    const-string v5, "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V"

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    move-object v2, p0

    .line 21
    invoke-direct/range {v0 .. v8}, Lia/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 22
    .line 23
    .line 24
    new-instance p1, Ld1/b0;

    .line 25
    .line 26
    const/16 p3, 0xa

    .line 27
    .line 28
    invoke-direct {p1, p2, v0, p3}, Ld1/b0;-><init>(ILfg/p;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lx1/j;->k1(Lx1/i;)Lx1/i;

    .line 32
    .line 33
    .line 34
    iput-object p1, v2, Lk/i0;->B:Ld1/b0;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 3

    .line 1
    new-instance v0, Lgg/u;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Laa/c;

    .line 7
    .line 8
    const/16 v2, 0x15

    .line 9
    .line 10
    invoke-direct {v1, v0, v2, p0}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1}, Lx1/k;->r(Ly0/n;Lfg/a;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ls/h0;

    .line 19
    .line 20
    iget-object v1, p0, Lk/i0;->B:Ld1/b0;

    .line 21
    .line 22
    invoke-virtual {v1}, Ld1/b0;->p1()Ld1/z;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Ld1/z;->a()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    iget-object v1, p0, Lk/i0;->z:Ls/h0;

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v1}, Ls/h0;->b()V

    .line 37
    .line 38
    .line 39
    :cond_0
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0}, Ls/h0;->a()Ls/h0;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v0, 0x0

    .line 46
    :goto_0
    iput-object v0, p0, Lk/i0;->z:Ls/h0;

    .line 47
    .line 48
    :cond_2
    return-void
.end method

.method public final F()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lk/i0;->C:Lk/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final X0(Lf2/y;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lk/i0;->B:Ld1/b0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld1/b0;->p1()Ld1/z;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ld1/z;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sget-object v1, Lf2/w;->a:[Lmg/d;

    .line 12
    .line 13
    sget-object v1, Lf2/u;->l:Lf2/x;

    .line 14
    .line 15
    sget-object v2, Lf2/w;->a:[Lmg/d;

    .line 16
    .line 17
    const/4 v3, 0x4

    .line 18
    aget-object v2, v2, v3

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {p1, v1, v0}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance v2, Lb0/v;

    .line 28
    .line 29
    const/4 v9, 0x0

    .line 30
    const/4 v10, 0x3

    .line 31
    const/4 v3, 0x0

    .line 32
    const-class v5, Lk/i0;

    .line 33
    .line 34
    const-string v6, "requestFocus"

    .line 35
    .line 36
    const-string v7, "requestFocus()Z"

    .line 37
    .line 38
    const/4 v8, 0x0

    .line 39
    move-object v4, p0

    .line 40
    invoke-direct/range {v2 .. v10}, Lb0/v;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 41
    .line 42
    .line 43
    sget-object v0, Lf2/l;->w:Lf2/x;

    .line 44
    .line 45
    new-instance v1, Lf2/a;

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    invoke-direct {v1, v3, v2}, Lf2/a;-><init>(Ljava/lang/String;Lsf/b;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p1, v0, v1}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final Z0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final e1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk/i0;->z:Ls/h0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ls/h0;->b()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lk/i0;->z:Ls/h0;

    .line 10
    .line 11
    return-void
.end method

.method public final n1(Ln/k;Ln/j;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Ly0/n;->t:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Ly0/n;->Y0()Lqg/t;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lvg/c;

    .line 10
    .line 11
    iget-object v0, v0, Lvg/c;->g:Lwf/g;

    .line 12
    .line 13
    sget-object v1, Lqg/q;->h:Lqg/q;

    .line 14
    .line 15
    invoke-interface {v0, v1}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lqg/r0;

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    new-instance v1, Lc9/i;

    .line 25
    .line 26
    const/16 v2, 0x1d

    .line 27
    .line 28
    invoke-direct {v1, p1, v2, p2}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v1}, Lqg/r0;->o(Lfg/l;)Lqg/d0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move-object v4, v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v4, v5

    .line 38
    :goto_0
    invoke-virtual {p0}, Ly0/n;->Y0()Lqg/t;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v1, Lc0/m;

    .line 43
    .line 44
    const/16 v6, 0x8

    .line 45
    .line 46
    move-object v2, p1

    .line 47
    move-object v3, p2

    .line 48
    invoke-direct/range {v1 .. v6}, Lc0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x3

    .line 52
    invoke-static {v0, v5, v1, p1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    move-object v2, p1

    .line 57
    move-object v3, p2

    .line 58
    invoke-virtual {v2, v3}, Ln/k;->b(Ln/j;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final o1(Ln/k;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lk/i0;->w:Ln/k;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lk/i0;->w:Ln/k;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lk/i0;->y:Ln/f;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    new-instance v2, Ln/g;

    .line 18
    .line 19
    invoke-direct {v2, v1}, Ln/g;-><init>(Ln/f;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ln/k;->b(Ln/j;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    iput-object v0, p0, Lk/i0;->y:Ln/f;

    .line 27
    .line 28
    iput-object p1, p0, Lk/i0;->w:Ln/k;

    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public final w(Lx1/i1;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lk/i0;->A:Lx1/i1;

    .line 2
    .line 3
    iget-object v0, p0, Lk/i0;->B:Ld1/b0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ld1/b0;->p1()Ld1/z;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ld1/z;->a()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, Lx1/i1;->r1()Ly0/n;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-boolean p1, p1, Ly0/n;->t:Z

    .line 21
    .line 22
    sget-object v0, Lk/j0;->u:Lk/b;

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget-object p1, p0, Lk/i0;->A:Lx1/i1;

    .line 27
    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    invoke-virtual {p1}, Lx1/i1;->r1()Ly0/n;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-boolean p1, p1, Ly0/n;->t:Z

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    iget-boolean p1, p0, Ly0/n;->t:Z

    .line 39
    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    invoke-static {p0, v0}, Lx1/k;->j(Lx1/j;Ljava/lang/Object;)Lx1/e2;

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    iget-boolean p1, p0, Ly0/n;->t:Z

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    invoke-static {p0, v0}, Lx1/k;->j(Lx1/j;Ljava/lang/Object;)Lx1/e2;

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_0
    return-void
.end method
