.class public final synthetic Lwb/es;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lwb/y2;

.field public final synthetic i:Lfb/c;

.field public final synthetic j:Z

.field public final synthetic k:J

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Z

.field public final synthetic n:Lfg/a;

.field public final synthetic o:Lfg/a;

.field public final synthetic p:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Lwb/y2;Lfb/c;ZJLjava/lang/String;ZLfg/a;Lfg/a;Lfg/a;II)V
    .locals 0

    .line 1
    iput p12, p0, Lwb/es;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/es;->h:Lwb/y2;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/es;->i:Lfb/c;

    .line 6
    .line 7
    iput-boolean p3, p0, Lwb/es;->j:Z

    .line 8
    .line 9
    iput-wide p4, p0, Lwb/es;->k:J

    .line 10
    .line 11
    iput-object p6, p0, Lwb/es;->l:Ljava/lang/String;

    .line 12
    .line 13
    iput-boolean p7, p0, Lwb/es;->m:Z

    .line 14
    .line 15
    iput-object p8, p0, Lwb/es;->n:Lfg/a;

    .line 16
    .line 17
    iput-object p9, p0, Lwb/es;->o:Lfg/a;

    .line 18
    .line 19
    iput-object p10, p0, Lwb/es;->p:Lfg/a;

    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lwb/es;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v11, p1

    .line 7
    check-cast v11, Li0/h0;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const p1, 0x6000001

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Li0/r;->C(I)I

    .line 18
    .line 19
    .line 20
    move-result v12

    .line 21
    iget-object v1, p0, Lwb/es;->h:Lwb/y2;

    .line 22
    .line 23
    iget-object v2, p0, Lwb/es;->i:Lfb/c;

    .line 24
    .line 25
    iget-boolean v3, p0, Lwb/es;->j:Z

    .line 26
    .line 27
    iget-wide v4, p0, Lwb/es;->k:J

    .line 28
    .line 29
    iget-object v6, p0, Lwb/es;->l:Ljava/lang/String;

    .line 30
    .line 31
    iget-boolean v7, p0, Lwb/es;->m:Z

    .line 32
    .line 33
    iget-object v8, p0, Lwb/es;->n:Lfg/a;

    .line 34
    .line 35
    iget-object v9, p0, Lwb/es;->o:Lfg/a;

    .line 36
    .line 37
    iget-object v10, p0, Lwb/es;->p:Lfg/a;

    .line 38
    .line 39
    invoke-virtual/range {v1 .. v12}, Lwb/y2;->b0(Lfb/c;ZJLjava/lang/String;ZLfg/a;Lfg/a;Lfg/a;Li0/h0;I)V

    .line 40
    .line 41
    .line 42
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_0
    move-object v10, p1

    .line 46
    check-cast v10, Li0/h0;

    .line 47
    .line 48
    check-cast p2, Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    const p1, 0x6000001

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, Li0/r;->C(I)I

    .line 57
    .line 58
    .line 59
    move-result v11

    .line 60
    iget-object v0, p0, Lwb/es;->h:Lwb/y2;

    .line 61
    .line 62
    iget-object v1, p0, Lwb/es;->i:Lfb/c;

    .line 63
    .line 64
    iget-boolean v2, p0, Lwb/es;->j:Z

    .line 65
    .line 66
    iget-wide v3, p0, Lwb/es;->k:J

    .line 67
    .line 68
    iget-object v5, p0, Lwb/es;->l:Ljava/lang/String;

    .line 69
    .line 70
    iget-boolean v6, p0, Lwb/es;->m:Z

    .line 71
    .line 72
    iget-object v7, p0, Lwb/es;->n:Lfg/a;

    .line 73
    .line 74
    iget-object v8, p0, Lwb/es;->o:Lfg/a;

    .line 75
    .line 76
    iget-object v9, p0, Lwb/es;->p:Lfg/a;

    .line 77
    .line 78
    invoke-virtual/range {v0 .. v11}, Lwb/y2;->b0(Lfb/c;ZJLjava/lang/String;ZLfg/a;Lfg/a;Lfg/a;Li0/h0;I)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :pswitch_1
    move-object v10, p1

    .line 83
    check-cast v10, Li0/h0;

    .line 84
    .line 85
    check-cast p2, Ljava/lang/Integer;

    .line 86
    .line 87
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    const p1, 0x6000001

    .line 91
    .line 92
    .line 93
    invoke-static {p1}, Li0/r;->C(I)I

    .line 94
    .line 95
    .line 96
    move-result v11

    .line 97
    iget-object v0, p0, Lwb/es;->h:Lwb/y2;

    .line 98
    .line 99
    iget-object v1, p0, Lwb/es;->i:Lfb/c;

    .line 100
    .line 101
    iget-boolean v2, p0, Lwb/es;->j:Z

    .line 102
    .line 103
    iget-wide v3, p0, Lwb/es;->k:J

    .line 104
    .line 105
    iget-object v5, p0, Lwb/es;->l:Ljava/lang/String;

    .line 106
    .line 107
    iget-boolean v6, p0, Lwb/es;->m:Z

    .line 108
    .line 109
    iget-object v7, p0, Lwb/es;->n:Lfg/a;

    .line 110
    .line 111
    iget-object v8, p0, Lwb/es;->o:Lfg/a;

    .line 112
    .line 113
    iget-object v9, p0, Lwb/es;->p:Lfg/a;

    .line 114
    .line 115
    invoke-virtual/range {v0 .. v11}, Lwb/y2;->b0(Lfb/c;ZJLjava/lang/String;ZLfg/a;Lfg/a;Lfg/a;Li0/h0;I)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
