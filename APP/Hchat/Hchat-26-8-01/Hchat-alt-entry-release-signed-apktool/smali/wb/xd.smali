.class public final synthetic Lwb/xd;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lfg/a;

.field public final synthetic j:I

.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Lsf/b;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILandroid/content/Context;Lfg/a;Lfg/l;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/xd;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p3, p0, Lwb/xd;->l:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p6, p0, Lwb/xd;->h:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p7, p0, Lwb/xd;->m:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/xd;->i:Lfg/a;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/xd;->n:Lsf/b;

    .line 16
    .line 17
    iput-object p8, p0, Lwb/xd;->o:Ljava/lang/Object;

    .line 18
    .line 19
    iput p1, p0, Lwb/xd;->j:I

    .line 20
    .line 21
    iput p2, p0, Lwb/xd;->k:I

    .line 22
    .line 23
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;II)V
    .locals 1

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lwb/xd;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/xd;->h:Ljava/lang/String;

    iput-object p2, p0, Lwb/xd;->i:Lfg/a;

    iput-object p3, p0, Lwb/xd;->l:Ljava/lang/Object;

    iput-object p4, p0, Lwb/xd;->n:Lsf/b;

    iput-object p5, p0, Lwb/xd;->m:Ljava/lang/Object;

    iput-object p6, p0, Lwb/xd;->o:Ljava/lang/Object;

    iput p7, p0, Lwb/xd;->j:I

    iput p8, p0, Lwb/xd;->k:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lwb/xd;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/xd;->l:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Landroid/content/Context;

    .line 10
    .line 11
    iget-object v0, p0, Lwb/xd;->m:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, Ljava/util/List;

    .line 15
    .line 16
    iget-object v0, p0, Lwb/xd;->n:Lsf/b;

    .line 17
    .line 18
    move-object v5, v0

    .line 19
    check-cast v5, Lfg/l;

    .line 20
    .line 21
    iget-object v0, p0, Lwb/xd;->o:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v6, v0

    .line 24
    check-cast v6, Ljava/util/List;

    .line 25
    .line 26
    move-object v7, p1

    .line 27
    check-cast v7, Li0/h0;

    .line 28
    .line 29
    check-cast p2, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget p1, p0, Lwb/xd;->j:I

    .line 35
    .line 36
    or-int/lit8 p1, p1, 0x1

    .line 37
    .line 38
    invoke-static {p1}, Li0/r;->C(I)I

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    iget-object v2, p0, Lwb/xd;->h:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v4, p0, Lwb/xd;->i:Lfg/a;

    .line 45
    .line 46
    iget v9, p0, Lwb/xd;->k:I

    .line 47
    .line 48
    invoke-static/range {v1 .. v9}, Lwb/ho;->d3(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Lfg/a;Lfg/l;Ljava/util/List;Li0/h0;II)V

    .line 49
    .line 50
    .line 51
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_0
    iget-object v0, p0, Lwb/xd;->l:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v3, v0

    .line 57
    check-cast v3, Ljava/lang/String;

    .line 58
    .line 59
    iget-object v0, p0, Lwb/xd;->n:Lsf/b;

    .line 60
    .line 61
    move-object v4, v0

    .line 62
    check-cast v4, Lfg/a;

    .line 63
    .line 64
    iget-object v0, p0, Lwb/xd;->m:Ljava/lang/Object;

    .line 65
    .line 66
    move-object v5, v0

    .line 67
    check-cast v5, Ljava/lang/String;

    .line 68
    .line 69
    iget-object v0, p0, Lwb/xd;->o:Ljava/lang/Object;

    .line 70
    .line 71
    move-object v6, v0

    .line 72
    check-cast v6, Lfg/a;

    .line 73
    .line 74
    move-object v7, p1

    .line 75
    check-cast v7, Li0/h0;

    .line 76
    .line 77
    check-cast p2, Ljava/lang/Integer;

    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget p1, p0, Lwb/xd;->j:I

    .line 83
    .line 84
    or-int/lit8 p1, p1, 0x1

    .line 85
    .line 86
    invoke-static {p1}, Li0/r;->C(I)I

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    iget-object v1, p0, Lwb/xd;->h:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v2, p0, Lwb/xd;->i:Lfg/a;

    .line 93
    .line 94
    iget v9, p0, Lwb/xd;->k:I

    .line 95
    .line 96
    invoke-static/range {v1 .. v9}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

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
