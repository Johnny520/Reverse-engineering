.class public final synthetic Lwb/uh;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Z

.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lsf/b;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZZLsf/b;II)V
    .locals 0

    .line 1
    iput p6, p0, Lwb/uh;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/uh;->k:Ljava/lang/Object;

    .line 4
    .line 5
    iput-boolean p2, p0, Lwb/uh;->h:Z

    .line 6
    .line 7
    iput-boolean p3, p0, Lwb/uh;->i:Z

    .line 8
    .line 9
    iput-object p4, p0, Lwb/uh;->l:Lsf/b;

    .line 10
    .line 11
    iput p5, p0, Lwb/uh;->j:I

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lwb/uh;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/uh;->k:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Lwb/t0;

    .line 10
    .line 11
    iget-object v0, p0, Lwb/uh;->l:Lsf/b;

    .line 12
    .line 13
    move-object v4, v0

    .line 14
    check-cast v4, Lfg/l;

    .line 15
    .line 16
    move-object v5, p1

    .line 17
    check-cast v5, Li0/h0;

    .line 18
    .line 19
    check-cast p2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget p1, p0, Lwb/uh;->j:I

    .line 25
    .line 26
    or-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    invoke-static {p1}, Li0/r;->C(I)I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    iget-boolean v2, p0, Lwb/uh;->h:Z

    .line 33
    .line 34
    iget-boolean v3, p0, Lwb/uh;->i:Z

    .line 35
    .line 36
    invoke-static/range {v1 .. v6}, Lwb/ho;->Y(Lwb/t0;ZZLfg/l;Li0/h0;I)V

    .line 37
    .line 38
    .line 39
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_0
    iget-object v0, p0, Lwb/uh;->k:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v1, v0

    .line 45
    check-cast v1, Lwb/s0;

    .line 46
    .line 47
    iget-object v0, p0, Lwb/uh;->l:Lsf/b;

    .line 48
    .line 49
    move-object v4, v0

    .line 50
    check-cast v4, Lfg/a;

    .line 51
    .line 52
    move-object v5, p1

    .line 53
    check-cast v5, Li0/h0;

    .line 54
    .line 55
    check-cast p2, Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget p1, p0, Lwb/uh;->j:I

    .line 61
    .line 62
    or-int/lit8 p1, p1, 0x1

    .line 63
    .line 64
    invoke-static {p1}, Li0/r;->C(I)I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    iget-boolean v2, p0, Lwb/uh;->h:Z

    .line 69
    .line 70
    iget-boolean v3, p0, Lwb/uh;->i:Z

    .line 71
    .line 72
    invoke-static/range {v1 .. v6}, Lwb/ho;->a0(Lwb/s0;ZZLfg/a;Li0/h0;I)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
