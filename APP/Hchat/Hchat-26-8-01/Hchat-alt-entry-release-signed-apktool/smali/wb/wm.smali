.class public final synthetic Lwb/wm;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Lwb/nu;

.field public final synthetic j:Lfg/a;

.field public final synthetic k:Lfg/l;

.field public final synthetic l:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lwb/nu;Lfg/a;Lfg/l;Lfg/a;II)V
    .locals 0

    .line 1
    iput p7, p0, Lwb/wm;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/wm;->h:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/wm;->i:Lwb/nu;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/wm;->j:Lfg/a;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/wm;->k:Lfg/l;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/wm;->l:Lfg/a;

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
    .locals 8

    .line 1
    iget v0, p0, Lwb/wm;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v6, p1

    .line 7
    check-cast v6, Li0/h0;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/16 p1, 0x1c1

    .line 15
    .line 16
    invoke-static {p1}, Li0/r;->C(I)I

    .line 17
    .line 18
    .line 19
    move-result v7

    .line 20
    iget-object v1, p0, Lwb/wm;->h:Landroid/content/Context;

    .line 21
    .line 22
    iget-object v2, p0, Lwb/wm;->i:Lwb/nu;

    .line 23
    .line 24
    iget-object v3, p0, Lwb/wm;->j:Lfg/a;

    .line 25
    .line 26
    iget-object v4, p0, Lwb/wm;->k:Lfg/l;

    .line 27
    .line 28
    iget-object v5, p0, Lwb/wm;->l:Lfg/a;

    .line 29
    .line 30
    invoke-static/range {v1 .. v7}, Lwb/ho;->c4(Landroid/content/Context;Lwb/nu;Lfg/a;Lfg/l;Lfg/a;Li0/h0;I)V

    .line 31
    .line 32
    .line 33
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_0
    move-object v5, p1

    .line 37
    check-cast v5, Li0/h0;

    .line 38
    .line 39
    check-cast p2, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const/16 p1, 0x1c1

    .line 45
    .line 46
    invoke-static {p1}, Li0/r;->C(I)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    iget-object v0, p0, Lwb/wm;->h:Landroid/content/Context;

    .line 51
    .line 52
    iget-object v1, p0, Lwb/wm;->i:Lwb/nu;

    .line 53
    .line 54
    iget-object v2, p0, Lwb/wm;->j:Lfg/a;

    .line 55
    .line 56
    iget-object v3, p0, Lwb/wm;->k:Lfg/l;

    .line 57
    .line 58
    iget-object v4, p0, Lwb/wm;->l:Lfg/a;

    .line 59
    .line 60
    invoke-static/range {v0 .. v6}, Lwb/ho;->c4(Landroid/content/Context;Lwb/nu;Lfg/a;Lfg/l;Lfg/a;Li0/h0;I)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :pswitch_1
    move-object v5, p1

    .line 65
    check-cast v5, Li0/h0;

    .line 66
    .line 67
    check-cast p2, Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    const/16 p1, 0x1c1

    .line 73
    .line 74
    invoke-static {p1}, Li0/r;->C(I)I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    iget-object v0, p0, Lwb/wm;->h:Landroid/content/Context;

    .line 79
    .line 80
    iget-object v1, p0, Lwb/wm;->i:Lwb/nu;

    .line 81
    .line 82
    iget-object v2, p0, Lwb/wm;->j:Lfg/a;

    .line 83
    .line 84
    iget-object v3, p0, Lwb/wm;->k:Lfg/l;

    .line 85
    .line 86
    iget-object v4, p0, Lwb/wm;->l:Lfg/a;

    .line 87
    .line 88
    invoke-static/range {v0 .. v6}, Lwb/ho;->c4(Landroid/content/Context;Lwb/nu;Lfg/a;Lfg/l;Lfg/a;Li0/h0;I)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
