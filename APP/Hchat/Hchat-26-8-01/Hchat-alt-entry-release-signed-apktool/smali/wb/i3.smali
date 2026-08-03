.class public final synthetic Lwb/i3;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lxb/i;

.field public final synthetic i:Z

.field public final synthetic j:Li0/f1;

.field public final synthetic k:Li0/l2;


# direct methods
.method public synthetic constructor <init>(Lxb/i;ZLi0/f1;Li0/l2;I)V
    .locals 0

    .line 1
    iput p5, p0, Lwb/i3;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/i3;->h:Lxb/i;

    .line 4
    .line 5
    iput-boolean p2, p0, Lwb/i3;->i:Z

    .line 6
    .line 7
    iput-object p3, p0, Lwb/i3;->j:Li0/f1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/i3;->k:Li0/l2;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lwb/i3;->g:I

    .line 2
    .line 3
    check-cast p1, Lf1/d0;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lwb/i3;->h:Lxb/i;

    .line 12
    .line 13
    invoke-virtual {v0}, Lxb/i;->c()F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lwb/i3;->j:Li0/f1;

    .line 18
    .line 19
    invoke-virtual {v1}, Li0/f1;->g()F

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    mul-float/2addr v1, v0

    .line 24
    iget-boolean v0, p0, Lwb/i3;->i:Z

    .line 25
    .line 26
    iget-object v2, p0, Lwb/i3;->k:Li0/l2;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-static {v2}, Lwb/o3;->b(Li0/l2;)F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    add-float/2addr v0, v1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    neg-float v0, v1

    .line 37
    invoke-static {v2}, Lwb/o3;->b(Li0/l2;)F

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    add-float/2addr v0, v1

    .line 42
    :goto_0
    invoke-interface {p1, v0}, Lf1/d0;->s(F)V

    .line 43
    .line 44
    .line 45
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_0
    iget-object v0, p0, Lwb/i3;->h:Lxb/i;

    .line 49
    .line 50
    invoke-virtual {v0}, Lxb/i;->c()F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-object v1, p0, Lwb/i3;->j:Li0/f1;

    .line 55
    .line 56
    invoke-virtual {v1}, Li0/f1;->g()F

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    mul-float/2addr v1, v0

    .line 61
    iget-boolean v0, p0, Lwb/i3;->i:Z

    .line 62
    .line 63
    iget-object v2, p0, Lwb/i3;->k:Li0/l2;

    .line 64
    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    invoke-static {v2}, Lwb/o3;->b(Li0/l2;)F

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    add-float/2addr v0, v1

    .line 72
    goto :goto_2

    .line 73
    :cond_1
    neg-float v0, v1

    .line 74
    invoke-static {v2}, Lwb/o3;->b(Li0/l2;)F

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    add-float/2addr v0, v1

    .line 79
    :goto_2
    invoke-interface {p1, v0}, Lf1/d0;->s(F)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
