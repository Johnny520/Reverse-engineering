.class public final synthetic Lwb/ai;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Z

.field public final synthetic j:Lfg/a;

.field public final synthetic k:Lfg/l;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lk9/j;ZZLfg/l;Lfg/a;Lfg/a;Lfg/a;Lfg/a;I)V
    .locals 0

    .line 1
    const/4 p9, 0x0

    .line 2
    iput p9, p0, Lwb/ai;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/ai;->l:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Lwb/ai;->h:Z

    .line 10
    .line 11
    iput-boolean p3, p0, Lwb/ai;->i:Z

    .line 12
    .line 13
    iput-object p4, p0, Lwb/ai;->k:Lfg/l;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/ai;->j:Lfg/a;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/ai;->m:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object p7, p0, Lwb/ai;->n:Ljava/lang/Object;

    .line 20
    .line 21
    iput-object p8, p0, Lwb/ai;->o:Ljava/lang/Object;

    .line 22
    .line 23
    return-void
.end method

.method public synthetic constructor <init>(Lwb/y2;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;ZLfg/a;Lfg/l;I)V
    .locals 0

    .line 24
    const/4 p9, 0x1

    iput p9, p0, Lwb/ai;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/ai;->l:Ljava/lang/Object;

    iput-object p2, p0, Lwb/ai;->m:Ljava/lang/Object;

    iput-boolean p3, p0, Lwb/ai;->h:Z

    iput-object p4, p0, Lwb/ai;->n:Ljava/lang/Object;

    iput-object p5, p0, Lwb/ai;->o:Ljava/lang/Object;

    iput-boolean p6, p0, Lwb/ai;->i:Z

    iput-object p7, p0, Lwb/ai;->j:Lfg/a;

    iput-object p8, p0, Lwb/ai;->k:Lfg/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lwb/ai;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/ai;->l:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Lwb/y2;

    .line 10
    .line 11
    iget-object v0, p0, Lwb/ai;->m:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v2, v0

    .line 14
    check-cast v2, Ljava/util/List;

    .line 15
    .line 16
    iget-object v0, p0, Lwb/ai;->n:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v4, v0

    .line 19
    check-cast v4, Ljava/lang/String;

    .line 20
    .line 21
    iget-object v0, p0, Lwb/ai;->o:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v5, v0

    .line 24
    check-cast v5, Ljava/lang/String;

    .line 25
    .line 26
    move-object v9, p1

    .line 27
    check-cast v9, Li0/h0;

    .line 28
    .line 29
    check-cast p2, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const p1, 0xc00001

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Li0/r;->C(I)I

    .line 38
    .line 39
    .line 40
    move-result v10

    .line 41
    iget-boolean v3, p0, Lwb/ai;->h:Z

    .line 42
    .line 43
    iget-boolean v6, p0, Lwb/ai;->i:Z

    .line 44
    .line 45
    iget-object v7, p0, Lwb/ai;->j:Lfg/a;

    .line 46
    .line 47
    iget-object v8, p0, Lwb/ai;->k:Lfg/l;

    .line 48
    .line 49
    invoke-virtual/range {v1 .. v10}, Lwb/y2;->t(Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;ZLfg/a;Lfg/l;Li0/h0;I)V

    .line 50
    .line 51
    .line 52
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 53
    .line 54
    return-object p1

    .line 55
    :pswitch_0
    iget-object v0, p0, Lwb/ai;->l:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v1, v0

    .line 58
    check-cast v1, Lk9/j;

    .line 59
    .line 60
    iget-object v0, p0, Lwb/ai;->m:Ljava/lang/Object;

    .line 61
    .line 62
    move-object v6, v0

    .line 63
    check-cast v6, Lfg/a;

    .line 64
    .line 65
    iget-object v0, p0, Lwb/ai;->n:Ljava/lang/Object;

    .line 66
    .line 67
    move-object v7, v0

    .line 68
    check-cast v7, Lfg/a;

    .line 69
    .line 70
    iget-object v0, p0, Lwb/ai;->o:Ljava/lang/Object;

    .line 71
    .line 72
    move-object v8, v0

    .line 73
    check-cast v8, Lfg/a;

    .line 74
    .line 75
    move-object v9, p1

    .line 76
    check-cast v9, Li0/h0;

    .line 77
    .line 78
    check-cast p2, Ljava/lang/Integer;

    .line 79
    .line 80
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    const/4 p1, 0x1

    .line 84
    invoke-static {p1}, Li0/r;->C(I)I

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    iget-boolean v2, p0, Lwb/ai;->h:Z

    .line 89
    .line 90
    iget-boolean v3, p0, Lwb/ai;->i:Z

    .line 91
    .line 92
    iget-object v4, p0, Lwb/ai;->k:Lfg/l;

    .line 93
    .line 94
    iget-object v5, p0, Lwb/ai;->j:Lfg/a;

    .line 95
    .line 96
    invoke-static/range {v1 .. v10}, Lwb/ho;->W0(Lk9/j;ZZLfg/l;Lfg/a;Lfg/a;Lfg/a;Lfg/a;Li0/h0;I)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
