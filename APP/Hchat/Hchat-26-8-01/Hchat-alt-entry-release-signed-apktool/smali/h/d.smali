.class public final Lh/d;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Ly0/o;

.field public final synthetic j:Ls0/d;

.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Li/k1;Lfg/l;Ly0/o;Lh/r0;Lh/s0;Lfg/p;Ls0/d;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lh/d;->g:I

    .line 3
    .line 4
    iput-object p1, p0, Lh/d;->l:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lh/d;->h:Lfg/l;

    .line 7
    .line 8
    iput-object p3, p0, Lh/d;->i:Ly0/o;

    .line 9
    .line 10
    iput-object p4, p0, Lh/d;->m:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, Lh/d;->n:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p6, p0, Lh/d;->o:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p7, p0, Lh/d;->j:Ls0/d;

    .line 17
    .line 18
    iput p8, p0, Lh/d;->k:I

    .line 19
    .line 20
    const/4 p1, 0x2

    .line 21
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ly0/o;Lfg/l;Ly0/c;Ljava/lang/String;Lfg/l;Ls0/d;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh/d;->g:I

    .line 25
    iput-object p1, p0, Lh/d;->l:Ljava/lang/Object;

    iput-object p2, p0, Lh/d;->i:Ly0/o;

    iput-object p3, p0, Lh/d;->h:Lfg/l;

    iput-object p4, p0, Lh/d;->n:Ljava/lang/Object;

    iput-object p5, p0, Lh/d;->o:Ljava/lang/Object;

    iput-object p6, p0, Lh/d;->m:Ljava/lang/Object;

    iput-object p7, p0, Lh/d;->j:Ls0/d;

    iput p8, p0, Lh/d;->k:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lh/d;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v8, p1

    .line 7
    check-cast v8, Li0/h0;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lh/d;->l:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v1, p1

    .line 17
    check-cast v1, Li/k1;

    .line 18
    .line 19
    iget-object p1, p0, Lh/d;->m:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v4, p1

    .line 22
    check-cast v4, Lh/r0;

    .line 23
    .line 24
    iget-object p1, p0, Lh/d;->n:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v5, p1

    .line 27
    check-cast v5, Lh/s0;

    .line 28
    .line 29
    iget-object p1, p0, Lh/d;->o:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v6, p1

    .line 32
    check-cast v6, Lfg/p;

    .line 33
    .line 34
    iget p1, p0, Lh/d;->k:I

    .line 35
    .line 36
    or-int/lit8 p1, p1, 0x1

    .line 37
    .line 38
    invoke-static {p1}, Li0/r;->C(I)I

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    iget-object v2, p0, Lh/d;->h:Lfg/l;

    .line 43
    .line 44
    iget-object v3, p0, Lh/d;->i:Ly0/o;

    .line 45
    .line 46
    iget-object v7, p0, Lh/d;->j:Ls0/d;

    .line 47
    .line 48
    invoke-static/range {v1 .. v9}, Lh/a0;->a(Li/k1;Lfg/l;Ly0/o;Lh/r0;Lh/s0;Lfg/p;Ls0/d;Li0/h0;I)V

    .line 49
    .line 50
    .line 51
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_0
    move-object v7, p1

    .line 55
    check-cast v7, Li0/h0;

    .line 56
    .line 57
    check-cast p2, Ljava/lang/Number;

    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lh/d;->n:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v3, p1

    .line 65
    check-cast v3, Ly0/c;

    .line 66
    .line 67
    iget-object p1, p0, Lh/d;->o:Ljava/lang/Object;

    .line 68
    .line 69
    move-object v4, p1

    .line 70
    check-cast v4, Ljava/lang/String;

    .line 71
    .line 72
    iget-object p1, p0, Lh/d;->m:Ljava/lang/Object;

    .line 73
    .line 74
    move-object v5, p1

    .line 75
    check-cast v5, Lfg/l;

    .line 76
    .line 77
    iget p1, p0, Lh/d;->k:I

    .line 78
    .line 79
    or-int/lit8 p1, p1, 0x1

    .line 80
    .line 81
    invoke-static {p1}, Li0/r;->C(I)I

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    iget-object v0, p0, Lh/d;->l:Ljava/lang/Object;

    .line 86
    .line 87
    iget-object v1, p0, Lh/d;->i:Ly0/o;

    .line 88
    .line 89
    iget-object v2, p0, Lh/d;->h:Lfg/l;

    .line 90
    .line 91
    iget-object v6, p0, Lh/d;->j:Ls0/d;

    .line 92
    .line 93
    invoke-static/range {v0 .. v8}, Lh/k;->b(Ljava/lang/Object;Ly0/o;Lfg/l;Ly0/c;Ljava/lang/String;Lfg/l;Ls0/d;Li0/h0;I)V

    .line 94
    .line 95
    .line 96
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 97
    .line 98
    return-object p1

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
