.class public final synthetic Lc9/l0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lc9/j1;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:I

.field public final synthetic l:Z

.field public final synthetic m:Lfg/a;

.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(Lc9/j1;Ljava/lang/String;Ljava/lang/String;IZLfg/a;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lc9/l0;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lc9/l0;->h:Lc9/j1;

    .line 8
    .line 9
    iput-object p2, p0, Lc9/l0;->i:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, Lc9/l0;->j:Ljava/lang/String;

    .line 12
    .line 13
    iput p4, p0, Lc9/l0;->k:I

    .line 14
    .line 15
    iput-boolean p5, p0, Lc9/l0;->l:Z

    .line 16
    .line 17
    iput-object p6, p0, Lc9/l0;->m:Lfg/a;

    .line 18
    .line 19
    iput p7, p0, Lc9/l0;->n:I

    .line 20
    .line 21
    return-void
.end method

.method public synthetic constructor <init>(Lc9/j1;Ljava/lang/String;Ljava/lang/String;Lfg/a;ZII)V
    .locals 1

    .line 22
    const/4 v0, 0x0

    iput v0, p0, Lc9/l0;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc9/l0;->h:Lc9/j1;

    iput-object p2, p0, Lc9/l0;->i:Ljava/lang/String;

    iput-object p3, p0, Lc9/l0;->j:Ljava/lang/String;

    iput-object p4, p0, Lc9/l0;->m:Lfg/a;

    iput-boolean p5, p0, Lc9/l0;->l:Z

    iput p6, p0, Lc9/l0;->k:I

    iput p7, p0, Lc9/l0;->n:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lc9/l0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v5, p1

    .line 7
    check-cast v5, Li0/h0;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget p1, p0, Lc9/l0;->n:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, Li0/r;->C(I)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    iget-object v1, p0, Lc9/l0;->h:Lc9/j1;

    .line 23
    .line 24
    iget v2, p0, Lc9/l0;->k:I

    .line 25
    .line 26
    iget-object v4, p0, Lc9/l0;->m:Lfg/a;

    .line 27
    .line 28
    iget-object v6, p0, Lc9/l0;->i:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v7, p0, Lc9/l0;->j:Ljava/lang/String;

    .line 31
    .line 32
    iget-boolean v8, p0, Lc9/l0;->l:Z

    .line 33
    .line 34
    invoke-virtual/range {v1 .. v8}, Lc9/j1;->i(IILfg/a;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 38
    .line 39
    return-object p1

    .line 40
    :pswitch_0
    move-object v4, p1

    .line 41
    check-cast v4, Li0/h0;

    .line 42
    .line 43
    check-cast p2, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget p1, p0, Lc9/l0;->k:I

    .line 49
    .line 50
    or-int/lit8 p1, p1, 0x1

    .line 51
    .line 52
    invoke-static {p1}, Li0/r;->C(I)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    iget-object v0, p0, Lc9/l0;->h:Lc9/j1;

    .line 57
    .line 58
    iget v2, p0, Lc9/l0;->n:I

    .line 59
    .line 60
    iget-object v3, p0, Lc9/l0;->m:Lfg/a;

    .line 61
    .line 62
    iget-object v5, p0, Lc9/l0;->i:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v6, p0, Lc9/l0;->j:Ljava/lang/String;

    .line 65
    .line 66
    iget-boolean v7, p0, Lc9/l0;->l:Z

    .line 67
    .line 68
    invoke-virtual/range {v0 .. v7}, Lc9/j1;->a(IILfg/a;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
