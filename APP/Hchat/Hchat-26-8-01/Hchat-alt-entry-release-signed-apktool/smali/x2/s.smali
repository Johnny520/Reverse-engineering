.class public final Lx2/s;
.super Lx1/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/m1;
.implements Lx1/h;


# instance fields
.field public final w:Ld1/b0;

.field public x:Ls/h0;


# direct methods
.method public constructor <init>()V
    .locals 10

    .line 1
    invoke-direct {p0}, Lx1/j;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ld1/b0;

    .line 5
    .line 6
    new-instance v1, Lia/t;

    .line 7
    .line 8
    const/4 v8, 0x0

    .line 9
    const/16 v9, 0x1b

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    const-class v4, Lx2/s;

    .line 13
    .line 14
    const-string v5, "onFocusStateChange"

    .line 15
    .line 16
    const-string v6, "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V"

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    move-object v3, p0

    .line 20
    invoke-direct/range {v1 .. v9}, Lia/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 21
    .line 22
    .line 23
    const/16 v2, 0x9

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-direct {v0, v4, v1, v2}, Ld1/b0;-><init>(ILfg/p;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lx1/j;->k1(Lx1/i;)Lx1/i;

    .line 30
    .line 31
    .line 32
    iput-object v0, v3, Lx2/s;->w:Ld1/b0;

    .line 33
    .line 34
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
    new-instance v1, Lc1/b;

    .line 7
    .line 8
    const/4 v2, 0x6

    .line 9
    invoke-direct {v1, v0, v2, p0}, Lc1/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, v1}, Lx1/k;->r(Ly0/n;Lfg/a;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ls/h0;

    .line 18
    .line 19
    iget-object v1, p0, Lx2/s;->w:Ld1/b0;

    .line 20
    .line 21
    invoke-virtual {v1}, Ld1/b0;->p1()Ld1/z;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ld1/z;->a()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    iget-object v1, p0, Lx2/s;->x:Ls/h0;

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1}, Ls/h0;->b()V

    .line 36
    .line 37
    .line 38
    :cond_0
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0}, Ls/h0;->a()Ls/h0;

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v0, 0x0

    .line 45
    :goto_0
    iput-object v0, p0, Lx2/s;->x:Ls/h0;

    .line 46
    .line 47
    :cond_2
    return-void
.end method
