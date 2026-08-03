.class public final synthetic Lm/c2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lm/h2;


# direct methods
.method public synthetic constructor <init>(Lm/h2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lm/c2;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lm/c2;->h:Lm/h2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lm/c2;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm/c2;->h:Lm/h2;

    .line 7
    .line 8
    iget-object v0, v0, Lm/h2;->V:Ld1/b0;

    .line 9
    .line 10
    move-object v1, v0

    .line 11
    check-cast v1, Ly0/n;

    .line 12
    .line 13
    iget-object v1, v1, Ly0/n;->g:Ly0/n;

    .line 14
    .line 15
    iget-boolean v1, v1, Ly0/n;->t:Z

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {v0}, Ld1/b0;->p1()Ld1/z;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    if-eq v3, v4, :cond_2

    .line 33
    .line 34
    const/4 v4, 0x2

    .line 35
    if-eq v3, v4, :cond_2

    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    if-ne v3, v0, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-static {}, Lokio/a;->k()V

    .line 42
    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-virtual {v1}, Ld1/z;->a()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ld1/b0;->n1(Lv1/t;)Le1/c;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    goto :goto_0

    .line 57
    :cond_3
    invoke-static {v0}, Lx1/k;->x(Lx1/i;)Lx1/r1;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Ly1/t;

    .line 62
    .line 63
    invoke-virtual {v1}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ld1/p;

    .line 68
    .line 69
    invoke-virtual {v1}, Ld1/p;->f()Ld1/b0;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    if-eqz v1, :cond_4

    .line 74
    .line 75
    invoke-static {v0}, Lx1/k;->v(Lx1/i;)Lx1/i1;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v1, v0}, Ld1/b0;->n1(Lv1/t;)Le1/c;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    :cond_4
    :goto_0
    return-object v2

    .line 84
    :pswitch_0
    iget-object v0, p0, Lm/c2;->h:Lm/h2;

    .line 85
    .line 86
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 87
    .line 88
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    return-object v0

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
