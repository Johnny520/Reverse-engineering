.class public final Lb0/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li0/z;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb0/m;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lb0/m;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget v0, p0, Lb0/m;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lb0/m;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast v2, Ly2/x;

    .line 10
    .line 11
    invoke-virtual {v2}, Ly1/a;->f()V

    .line 12
    .line 13
    .line 14
    const v0, 0x7f06007d

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v2, Ly2/x;->v:Landroid/view/WindowManager;

    .line 21
    .line 22
    invoke-interface {v0, v2}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    check-cast v2, Ly2/v;

    .line 27
    .line 28
    invoke-virtual {v2}, Landroid/app/Dialog;->dismiss()V

    .line 29
    .line 30
    .line 31
    iget-object v0, v2, Ly2/v;->m:Ly2/t;

    .line 32
    .line 33
    invoke-virtual {v0}, Ly1/a;->f()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_1
    check-cast v2, Ly1/k1;

    .line 38
    .line 39
    iget-object v0, v2, Ly1/k1;->h:Ly1/m1;

    .line 40
    .line 41
    invoke-virtual {v0}, Ly1/m1;->invoke()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_2
    check-cast v2, Lh0/d1;

    .line 46
    .line 47
    invoke-virtual {v2}, Lh0/d1;->o()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_3
    check-cast v2, Ls/h0;

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    iput-boolean v0, v2, Ls/h0;->f:Z

    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_4
    check-cast v2, Ls/m0;

    .line 58
    .line 59
    iget-object v0, v2, Ls/m0;->c:Lj8/f;

    .line 60
    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    iput-boolean v3, v0, Lj8/f;->a:Z

    .line 65
    .line 66
    :cond_0
    iput-object v1, v2, Ls/m0;->c:Lj8/f;

    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_5
    check-cast v2, Ls/a0;

    .line 70
    .line 71
    iput-object v1, v2, Ls/a0;->d:Ls0/d;

    .line 72
    .line 73
    return-void

    .line 74
    :pswitch_6
    check-cast v2, Li/k1;

    .line 75
    .line 76
    invoke-virtual {v2}, Li/k1;->i()V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_7
    check-cast v2, Ld0/c;

    .line 81
    .line 82
    iget-object v0, v2, Ld0/c;->c:Li0/j1;

    .line 83
    .line 84
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Ld0/b;

    .line 89
    .line 90
    if-eqz v0, :cond_1

    .line 91
    .line 92
    invoke-virtual {v0}, Ld0/b;->close()V

    .line 93
    .line 94
    .line 95
    :cond_1
    return-void

    .line 96
    :pswitch_8
    check-cast v2, Lb0/h;

    .line 97
    .line 98
    iget-object v0, v2, Lb0/h;->e:Lw0/s;

    .line 99
    .line 100
    iget-object v3, v0, Lw0/s;->h:Lq9/a;

    .line 101
    .line 102
    if-eqz v3, :cond_2

    .line 103
    .line 104
    invoke-virtual {v3}, Lq9/a;->e()V

    .line 105
    .line 106
    .line 107
    :cond_2
    invoke-virtual {v0}, Lw0/s;->a()V

    .line 108
    .line 109
    .line 110
    iget-object v0, v2, Lb0/h;->h:Landroid/view/ActionMode;

    .line 111
    .line 112
    if-eqz v0, :cond_3

    .line 113
    .line 114
    invoke-virtual {v0}, Landroid/view/ActionMode;->finish()V

    .line 115
    .line 116
    .line 117
    :cond_3
    iput-object v1, v2, Lb0/h;->h:Landroid/view/ActionMode;

    .line 118
    .line 119
    return-void

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
