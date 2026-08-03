.class public final synthetic Lw/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lw/n1;

.field public final synthetic i:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Lw/n1;Lfg/l;I)V
    .locals 0

    .line 1
    iput p3, p0, Lw/k;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lw/k;->h:Lw/n1;

    .line 4
    .line 5
    iput-object p2, p0, Lw/k;->i:Lfg/l;

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
    .locals 3

    .line 1
    iget v0, p0, Lw/k;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Li0/a0;

    .line 7
    .line 8
    iget-object p1, p0, Lw/k;->h:Lw/n1;

    .line 9
    .line 10
    iget-object v0, p1, Lw/n1;->c:Lw0/p;

    .line 11
    .line 12
    iget-object v1, p0, Lw/k;->i:Lfg/l;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lw0/p;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    new-instance v0, Lci/w;

    .line 18
    .line 19
    const/16 v2, 0x8

    .line 20
    .line 21
    invoke-direct {v0, p1, v2, v1}, Lci/w;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_0
    check-cast p1, Li2/k0;

    .line 26
    .line 27
    iget-object v0, p0, Lw/k;->h:Lw/n1;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-object v0, v0, Lw/n1;->a:Li0/j1;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object v0, p0, Lw/k;->i:Lfg/l;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 44
    .line 45
    return-object p1

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
