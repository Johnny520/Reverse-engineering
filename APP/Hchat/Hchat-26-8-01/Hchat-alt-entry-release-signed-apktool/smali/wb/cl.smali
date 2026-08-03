.class public final synthetic Lwb/cl;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lx8/r;

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lx8/r;Li0/a1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/cl;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/cl;->h:Lx8/r;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/cl;->i:Li0/a1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lwb/cl;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/cl;->h:Lx8/r;

    .line 7
    .line 8
    invoke-virtual {v0}, Lx8/r;->i()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Lsf/e;

    .line 13
    .line 14
    const-string v2, "\u901a\u8fc7\u540e\u6b22\u8fce\u8bed"

    .line 15
    .line 16
    invoke-direct {v1, v2, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lwb/cl;->i:Li0/a1;

    .line 20
    .line 21
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_0
    iget-object v0, p0, Lwb/cl;->h:Lx8/r;

    .line 28
    .line 29
    invoke-virtual {v0}, Lx8/r;->c()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Lsf/e;

    .line 34
    .line 35
    const-string v2, "\u597d\u53cb\u8bf7\u6c42\u56de\u590d"

    .line 36
    .line 37
    invoke-direct {v1, v2, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lwb/cl;->i:Li0/a1;

    .line 41
    .line 42
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
