.class public final synthetic Lxa/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lxa/m;

.field public final synthetic i:Lxa/i;


# direct methods
.method public synthetic constructor <init>(Lxa/m;Lxa/i;I)V
    .locals 0

    .line 1
    iput p3, p0, Lxa/e;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lxa/e;->h:Lxa/m;

    .line 4
    .line 5
    iput-object p2, p0, Lxa/e;->i:Lxa/i;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lxa/e;->g:I

    .line 2
    .line 3
    check-cast p1, Ljava/lang/String;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lxa/e;->i:Lxa/i;

    .line 12
    .line 13
    iget-object v1, v0, Lxa/i;->a:Landroid/app/Activity;

    .line 14
    .line 15
    new-instance v2, Lwb/xi;

    .line 16
    .line 17
    const/16 v3, 0x1a

    .line 18
    .line 19
    invoke-direct {v2, v0, v3, p1}, Lwb/xi;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lxa/e;->h:Lxa/m;

    .line 23
    .line 24
    const-string v0, "\u6b63\u5728\u4fee\u6539\u597d\u53cb\u5907\u6ce8..."

    .line 25
    .line 26
    invoke-virtual {p1, v1, v0, v2}, Lxa/m;->g(Landroid/app/Activity;Ljava/lang/String;Lfg/a;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    return-object p1

    .line 32
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lxa/e;->i:Lxa/i;

    .line 36
    .line 37
    iget-object v1, v0, Lxa/i;->a:Landroid/app/Activity;

    .line 38
    .line 39
    new-instance v2, Lwb/zh;

    .line 40
    .line 41
    iget-object v3, p0, Lxa/e;->h:Lxa/m;

    .line 42
    .line 43
    invoke-direct {v2, v3, v0, p1}, Lwb/zh;-><init>(Lxa/m;Lxa/i;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string p1, "\u6b63\u5728\u521b\u5efa\u5e76\u6dfb\u52a0\u6807\u7b7e..."

    .line 47
    .line 48
    invoke-virtual {v3, v1, p1, v2}, Lxa/m;->g(Landroid/app/Activity;Ljava/lang/String;Lfg/a;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
