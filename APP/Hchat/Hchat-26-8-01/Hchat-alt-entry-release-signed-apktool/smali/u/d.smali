.class public final Lu/d;
.super Lk/w;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public T:Z

.field public U:Lfg/l;

.field public final V:Li/e0;


# direct methods
.method public constructor <init>(Lf2/i;Lfg/l;Ln/k;ZZ)V
    .locals 8

    .line 1
    new-instance v7, Lu/c;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v7, v0, p2, p4}, Lu/c;-><init>(ILfg/l;Z)V

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    move-object v0, p0

    .line 11
    move-object v6, p1

    .line 12
    move-object v1, p3

    .line 13
    move v4, p5

    .line 14
    invoke-direct/range {v0 .. v7}, Lk/g;-><init>(Ln/k;Lk/y0;ZZLjava/lang/String;Lf2/i;Lfg/a;)V

    .line 15
    .line 16
    .line 17
    iput-boolean p4, v0, Lu/d;->T:Z

    .line 18
    .line 19
    iput-object p2, v0, Lu/d;->U:Lfg/l;

    .line 20
    .line 21
    new-instance p1, Li/e0;

    .line 22
    .line 23
    const/16 p2, 0x1b

    .line 24
    .line 25
    invoke-direct {p1, p0, p2}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    iput-object p1, v0, Lu/d;->V:Li/e0;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final n1(Lf2/y;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lu/d;->T:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh2/a;->g:Lh2/a;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Lh2/a;->h:Lh2/a;

    .line 9
    .line 10
    :goto_0
    invoke-static {p1, v0}, Lf2/w;->e(Lf2/y;Lh2/a;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lf2/u;->r:Lf2/x;

    .line 14
    .line 15
    sget-object v1, Lf2/w;->a:[Lmg/d;

    .line 16
    .line 17
    const/16 v2, 0x9

    .line 18
    .line 19
    aget-object v2, v1, v2

    .line 20
    .line 21
    sget-object v2, Lz0/k;->b:Lz0/d;

    .line 22
    .line 23
    invoke-interface {p1, v0, v2}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-boolean v0, p0, Lu/d;->T:Z

    .line 27
    .line 28
    new-instance v2, Lz0/f;

    .line 29
    .line 30
    invoke-static {v0}, Landroid/view/autofill/AutofillValue;->forToggle(Z)Landroid/view/autofill/AutofillValue;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-direct {v2, v0}, Lz0/f;-><init>(Landroid/view/autofill/AutofillValue;)V

    .line 35
    .line 36
    .line 37
    sget-object v0, Lf2/u;->s:Lf2/x;

    .line 38
    .line 39
    const/16 v3, 0xa

    .line 40
    .line 41
    aget-object v1, v1, v3

    .line 42
    .line 43
    invoke-interface {p1, v0, v2}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Lnb/a;

    .line 47
    .line 48
    const/16 v1, 0xf

    .line 49
    .line 50
    invoke-direct {v0, p1, v1}, Lnb/a;-><init>(Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v0}, Lf2/w;->b(Lf2/y;Lfg/l;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method
