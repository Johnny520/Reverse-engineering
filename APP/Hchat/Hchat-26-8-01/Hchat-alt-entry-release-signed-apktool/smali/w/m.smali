.class public final synthetic Lw/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ly0/o;

.field public final synthetic i:Z

.field public final synthetic j:Lfg/l;

.field public final synthetic k:I

.field public final synthetic l:I

.field public final synthetic m:Ljava/lang/CharSequence;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ly0/o;ZLd1/v;Lfg/a;Lfg/l;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lw/m;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lw/m;->m:Ljava/lang/CharSequence;

    .line 8
    .line 9
    iput-object p2, p0, Lw/m;->n:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lw/m;->h:Ly0/o;

    .line 12
    .line 13
    iput-boolean p4, p0, Lw/m;->i:Z

    .line 14
    .line 15
    iput-object p5, p0, Lw/m;->o:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, Lw/m;->p:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object p7, p0, Lw/m;->j:Lfg/l;

    .line 20
    .line 21
    iput p8, p0, Lw/m;->k:I

    .line 22
    .line 23
    iput p9, p0, Lw/m;->l:I

    .line 24
    .line 25
    return-void
.end method

.method public synthetic constructor <init>(Ly0/o;Li2/g;Lfg/l;ZLi2/n0;Lm2/d;Lfg/l;II)V
    .locals 1

    .line 26
    const/4 v0, 0x0

    iput v0, p0, Lw/m;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/m;->h:Ly0/o;

    iput-object p2, p0, Lw/m;->m:Ljava/lang/CharSequence;

    iput-object p3, p0, Lw/m;->j:Lfg/l;

    iput-boolean p4, p0, Lw/m;->i:Z

    iput-object p5, p0, Lw/m;->o:Ljava/lang/Object;

    iput-object p6, p0, Lw/m;->p:Ljava/lang/Object;

    iput-object p7, p0, Lw/m;->n:Ljava/lang/Object;

    iput p8, p0, Lw/m;->k:I

    iput p9, p0, Lw/m;->l:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lw/m;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw/m;->m:Ljava/lang/CharSequence;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Ljava/lang/String;

    .line 10
    .line 11
    iget-object v0, p0, Lw/m;->n:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v2, v0

    .line 14
    check-cast v2, Ljava/lang/String;

    .line 15
    .line 16
    iget-object v0, p0, Lw/m;->o:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v5, v0

    .line 19
    check-cast v5, Ld1/v;

    .line 20
    .line 21
    iget-object v0, p0, Lw/m;->p:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v6, v0

    .line 24
    check-cast v6, Lfg/a;

    .line 25
    .line 26
    move-object v8, p1

    .line 27
    check-cast v8, Li0/h0;

    .line 28
    .line 29
    check-cast p2, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget p1, p0, Lw/m;->k:I

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
    iget-object v3, p0, Lw/m;->h:Ly0/o;

    .line 43
    .line 44
    iget-boolean v4, p0, Lw/m;->i:Z

    .line 45
    .line 46
    iget-object v7, p0, Lw/m;->j:Lfg/l;

    .line 47
    .line 48
    iget v10, p0, Lw/m;->l:I

    .line 49
    .line 50
    invoke-static/range {v1 .. v10}, Lwb/ho;->u3(Ljava/lang/String;Ljava/lang/String;Ly0/o;ZLd1/v;Lfg/a;Lfg/l;Li0/h0;II)V

    .line 51
    .line 52
    .line 53
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 54
    .line 55
    return-object p1

    .line 56
    :pswitch_0
    iget-object v0, p0, Lw/m;->m:Ljava/lang/CharSequence;

    .line 57
    .line 58
    move-object v2, v0

    .line 59
    check-cast v2, Li2/g;

    .line 60
    .line 61
    iget-object v0, p0, Lw/m;->o:Ljava/lang/Object;

    .line 62
    .line 63
    move-object v5, v0

    .line 64
    check-cast v5, Li2/n0;

    .line 65
    .line 66
    iget-object v0, p0, Lw/m;->p:Ljava/lang/Object;

    .line 67
    .line 68
    move-object v6, v0

    .line 69
    check-cast v6, Lm2/d;

    .line 70
    .line 71
    iget-object v0, p0, Lw/m;->n:Ljava/lang/Object;

    .line 72
    .line 73
    move-object v7, v0

    .line 74
    check-cast v7, Lfg/l;

    .line 75
    .line 76
    move-object v8, p1

    .line 77
    check-cast v8, Li0/h0;

    .line 78
    .line 79
    check-cast p2, Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget p1, p0, Lw/m;->k:I

    .line 85
    .line 86
    or-int/lit8 p1, p1, 0x1

    .line 87
    .line 88
    invoke-static {p1}, Li0/r;->C(I)I

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    iget p1, p0, Lw/m;->l:I

    .line 93
    .line 94
    invoke-static {p1}, Li0/r;->C(I)I

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    iget-object v1, p0, Lw/m;->h:Ly0/o;

    .line 99
    .line 100
    iget-object v3, p0, Lw/m;->j:Lfg/l;

    .line 101
    .line 102
    iget-boolean v4, p0, Lw/m;->i:Z

    .line 103
    .line 104
    invoke-static/range {v1 .. v10}, Lw/s;->h(Ly0/o;Li2/g;Lfg/l;ZLi2/n0;Lm2/d;Lfg/l;Li0/h0;II)V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
