.class public final synthetic Lwb/k8;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ly0/o;

.field public final synthetic j:Z

.field public final synthetic k:Lfg/a;

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ly0/o;ZLfg/a;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/k8;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/k8;->h:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/k8;->i:Ly0/o;

    .line 10
    .line 11
    iput-boolean p3, p0, Lwb/k8;->j:Z

    .line 12
    .line 13
    iput-object p4, p0, Lwb/k8;->k:Lfg/a;

    .line 14
    .line 15
    iput p5, p0, Lwb/k8;->l:I

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLfg/a;Ly0/o;I)V
    .locals 1

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lwb/k8;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/k8;->h:Ljava/lang/String;

    iput-boolean p2, p0, Lwb/k8;->j:Z

    iput-object p3, p0, Lwb/k8;->k:Lfg/a;

    iput-object p4, p0, Lwb/k8;->i:Ly0/o;

    iput p5, p0, Lwb/k8;->l:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lwb/k8;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v3, p1

    .line 7
    check-cast v3, Li0/h0;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget p1, p0, Lwb/k8;->l:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, Li0/r;->C(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget-object v2, p0, Lwb/k8;->k:Lfg/a;

    .line 23
    .line 24
    iget-object v4, p0, Lwb/k8;->h:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v5, p0, Lwb/k8;->i:Ly0/o;

    .line 27
    .line 28
    iget-boolean v6, p0, Lwb/k8;->j:Z

    .line 29
    .line 30
    invoke-static/range {v1 .. v6}, Lwb/ho;->N(ILfg/a;Li0/h0;Ljava/lang/String;Ly0/o;Z)V

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
    move-object v2, p1

    .line 37
    check-cast v2, Li0/h0;

    .line 38
    .line 39
    check-cast p2, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget p1, p0, Lwb/k8;->l:I

    .line 45
    .line 46
    or-int/lit8 p1, p1, 0x1

    .line 47
    .line 48
    invoke-static {p1}, Li0/r;->C(I)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v1, p0, Lwb/k8;->k:Lfg/a;

    .line 53
    .line 54
    iget-object v3, p0, Lwb/k8;->h:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v4, p0, Lwb/k8;->i:Ly0/o;

    .line 57
    .line 58
    iget-boolean v5, p0, Lwb/k8;->j:Z

    .line 59
    .line 60
    invoke-static/range {v0 .. v5}, Lwb/ho;->X(ILfg/a;Li0/h0;Ljava/lang/String;Ly0/o;Z)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
