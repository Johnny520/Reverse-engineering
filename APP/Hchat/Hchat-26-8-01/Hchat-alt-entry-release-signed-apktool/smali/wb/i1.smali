.class public final synthetic Lwb/i1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Lfg/a;

.field public final synthetic k:Lfg/l;

.field public final synthetic l:Lfg/a;

.field public final synthetic m:Lfg/l;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lvb/a;ZLjava/util/List;Lr/z;Lfg/a;Lfg/l;Lfg/a;Lfg/l;I)V
    .locals 0

    .line 1
    const/4 p9, 0x1

    .line 2
    iput p9, p0, Lwb/i1;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/i1;->n:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Lwb/i1;->h:Z

    .line 10
    .line 11
    iput-object p3, p0, Lwb/i1;->i:Ljava/util/List;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/i1;->o:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/i1;->j:Lfg/a;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/i1;->k:Lfg/l;

    .line 18
    .line 19
    iput-object p7, p0, Lwb/i1;->l:Lfg/a;

    .line 20
    .line 21
    iput-object p8, p0, Lwb/i1;->m:Lfg/l;

    .line 22
    .line 23
    return-void
.end method

.method public synthetic constructor <init>(Lwb/h2;Ljava/lang/String;ZLjava/util/List;Lfg/l;Lfg/a;Lfg/a;Lfg/l;I)V
    .locals 0

    .line 24
    const/4 p9, 0x0

    iput p9, p0, Lwb/i1;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/i1;->n:Ljava/lang/Object;

    iput-object p2, p0, Lwb/i1;->o:Ljava/lang/Object;

    iput-boolean p3, p0, Lwb/i1;->h:Z

    iput-object p4, p0, Lwb/i1;->i:Ljava/util/List;

    iput-object p5, p0, Lwb/i1;->k:Lfg/l;

    iput-object p6, p0, Lwb/i1;->j:Lfg/a;

    iput-object p7, p0, Lwb/i1;->l:Lfg/a;

    iput-object p8, p0, Lwb/i1;->m:Lfg/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lwb/i1;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/i1;->n:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Lvb/a;

    .line 10
    .line 11
    iget-object v0, p0, Lwb/i1;->o:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v4, v0

    .line 14
    check-cast v4, Lr/z;

    .line 15
    .line 16
    move-object v9, p1

    .line 17
    check-cast v9, Li0/h0;

    .line 18
    .line 19
    check-cast p2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const p1, 0xd80001

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Li0/r;->C(I)I

    .line 28
    .line 29
    .line 30
    move-result v10

    .line 31
    iget-boolean v2, p0, Lwb/i1;->h:Z

    .line 32
    .line 33
    iget-object v3, p0, Lwb/i1;->i:Ljava/util/List;

    .line 34
    .line 35
    iget-object v5, p0, Lwb/i1;->j:Lfg/a;

    .line 36
    .line 37
    iget-object v6, p0, Lwb/i1;->k:Lfg/l;

    .line 38
    .line 39
    iget-object v7, p0, Lwb/i1;->l:Lfg/a;

    .line 40
    .line 41
    iget-object v8, p0, Lwb/i1;->m:Lfg/l;

    .line 42
    .line 43
    invoke-static/range {v1 .. v10}, Lwb/ho;->l3(Lvb/a;ZLjava/util/List;Lr/z;Lfg/a;Lfg/l;Lfg/a;Lfg/l;Li0/h0;I)V

    .line 44
    .line 45
    .line 46
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_0
    iget-object v0, p0, Lwb/i1;->n:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v1, v0

    .line 52
    check-cast v1, Lwb/h2;

    .line 53
    .line 54
    iget-object v0, p0, Lwb/i1;->o:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v2, v0

    .line 57
    check-cast v2, Ljava/lang/String;

    .line 58
    .line 59
    move-object v9, p1

    .line 60
    check-cast v9, Li0/h0;

    .line 61
    .line 62
    check-cast p2, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    const p1, 0xdb0001

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, Li0/r;->C(I)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    iget-boolean v3, p0, Lwb/i1;->h:Z

    .line 75
    .line 76
    iget-object v4, p0, Lwb/i1;->i:Ljava/util/List;

    .line 77
    .line 78
    iget-object v5, p0, Lwb/i1;->k:Lfg/l;

    .line 79
    .line 80
    iget-object v6, p0, Lwb/i1;->j:Lfg/a;

    .line 81
    .line 82
    iget-object v7, p0, Lwb/i1;->l:Lfg/a;

    .line 83
    .line 84
    iget-object v8, p0, Lwb/i1;->m:Lfg/l;

    .line 85
    .line 86
    invoke-virtual/range {v1 .. v10}, Lwb/h2;->c(Ljava/lang/String;ZLjava/util/List;Lfg/l;Lfg/a;Lfg/a;Lfg/l;Li0/h0;I)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
