.class public final synthetic Lwb/bn;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Lr/z;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Lfg/l;

.field public final synthetic l:Lfg/a;

.field public final synthetic m:Lfg/a;

.field public final synthetic n:Lfg/l;

.field public final synthetic o:Lfg/p;

.field public final synthetic p:Lfg/l;

.field public final synthetic q:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/String;Lfg/l;Lr/z;Lfg/a;Lfg/a;Lfg/l;Lfg/p;Lfg/l;Lfg/l;I)V
    .locals 0

    .line 1
    const/4 p11, 0x0

    .line 2
    iput p11, p0, Lwb/bn;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/bn;->h:Ljava/util/List;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/bn;->j:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/bn;->k:Lfg/l;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/bn;->i:Lr/z;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/bn;->l:Lfg/a;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/bn;->m:Lfg/a;

    .line 18
    .line 19
    iput-object p7, p0, Lwb/bn;->n:Lfg/l;

    .line 20
    .line 21
    iput-object p8, p0, Lwb/bn;->o:Lfg/p;

    .line 22
    .line 23
    iput-object p9, p0, Lwb/bn;->p:Lfg/l;

    .line 24
    .line 25
    iput-object p10, p0, Lwb/bn;->q:Lfg/l;

    .line 26
    .line 27
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lr/z;Ljava/lang/String;Lfg/l;Lfg/a;Lfg/a;Lfg/l;Lfg/p;Lfg/l;Lfg/l;I)V
    .locals 0

    .line 28
    const/4 p11, 0x1

    iput p11, p0, Lwb/bn;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/bn;->h:Ljava/util/List;

    iput-object p2, p0, Lwb/bn;->i:Lr/z;

    iput-object p3, p0, Lwb/bn;->j:Ljava/lang/String;

    iput-object p4, p0, Lwb/bn;->k:Lfg/l;

    iput-object p5, p0, Lwb/bn;->l:Lfg/a;

    iput-object p6, p0, Lwb/bn;->m:Lfg/a;

    iput-object p7, p0, Lwb/bn;->n:Lfg/l;

    iput-object p8, p0, Lwb/bn;->o:Lfg/p;

    iput-object p9, p0, Lwb/bn;->p:Lfg/l;

    iput-object p10, p0, Lwb/bn;->q:Lfg/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lwb/bn;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v9, p1

    .line 7
    check-cast v9, Li0/h0;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const p1, 0x1b6c01

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Li0/r;->C(I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object v2, p0, Lwb/bn;->l:Lfg/a;

    .line 22
    .line 23
    iget-object v3, p0, Lwb/bn;->m:Lfg/a;

    .line 24
    .line 25
    iget-object v4, p0, Lwb/bn;->k:Lfg/l;

    .line 26
    .line 27
    iget-object v5, p0, Lwb/bn;->n:Lfg/l;

    .line 28
    .line 29
    iget-object v6, p0, Lwb/bn;->p:Lfg/l;

    .line 30
    .line 31
    iget-object v7, p0, Lwb/bn;->q:Lfg/l;

    .line 32
    .line 33
    iget-object v8, p0, Lwb/bn;->o:Lfg/p;

    .line 34
    .line 35
    iget-object v10, p0, Lwb/bn;->j:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v11, p0, Lwb/bn;->h:Ljava/util/List;

    .line 38
    .line 39
    iget-object v12, p0, Lwb/bn;->i:Lr/z;

    .line 40
    .line 41
    invoke-static/range {v1 .. v12}, Lwb/ho;->m(ILfg/a;Lfg/a;Lfg/l;Lfg/l;Lfg/l;Lfg/l;Lfg/p;Li0/h0;Ljava/lang/String;Ljava/util/List;Lr/z;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 45
    .line 46
    return-object p1

    .line 47
    :pswitch_0
    move-object v8, p1

    .line 48
    check-cast v8, Li0/h0;

    .line 49
    .line 50
    check-cast p2, Ljava/lang/Integer;

    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const p1, 0x186181

    .line 56
    .line 57
    .line 58
    invoke-static {p1}, Li0/r;->C(I)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-object v1, p0, Lwb/bn;->l:Lfg/a;

    .line 63
    .line 64
    iget-object v2, p0, Lwb/bn;->m:Lfg/a;

    .line 65
    .line 66
    iget-object v3, p0, Lwb/bn;->k:Lfg/l;

    .line 67
    .line 68
    iget-object v4, p0, Lwb/bn;->n:Lfg/l;

    .line 69
    .line 70
    iget-object v5, p0, Lwb/bn;->p:Lfg/l;

    .line 71
    .line 72
    iget-object v6, p0, Lwb/bn;->q:Lfg/l;

    .line 73
    .line 74
    iget-object v7, p0, Lwb/bn;->o:Lfg/p;

    .line 75
    .line 76
    iget-object v9, p0, Lwb/bn;->j:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v10, p0, Lwb/bn;->h:Ljava/util/List;

    .line 79
    .line 80
    iget-object v11, p0, Lwb/bn;->i:Lr/z;

    .line 81
    .line 82
    invoke-static/range {v0 .. v11}, Lwb/ho;->E(ILfg/a;Lfg/a;Lfg/l;Lfg/l;Lfg/l;Lfg/l;Lfg/p;Li0/h0;Ljava/lang/String;Ljava/util/List;Lr/z;)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
