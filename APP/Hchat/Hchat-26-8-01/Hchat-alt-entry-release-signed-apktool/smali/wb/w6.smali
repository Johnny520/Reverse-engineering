.class public final synthetic Lwb/w6;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(IILi0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/w6;->g:I

    .line 2
    .line 3
    iput p1, p0, Lwb/w6;->h:I

    .line 4
    .line 5
    iput p2, p0, Lwb/w6;->i:I

    .line 6
    .line 7
    iput-object p3, p0, Lwb/w6;->j:Li0/a1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lwb/w6;->g:I

    .line 2
    .line 3
    check-cast p1, Ljava/util/List;

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
    iget-object v0, p0, Lwb/w6;->j:Li0/a1;

    .line 12
    .line 13
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ldb/c;

    .line 18
    .line 19
    iget v2, p0, Lwb/w6;->h:I

    .line 20
    .line 21
    iget v3, p0, Lwb/w6;->i:I

    .line 22
    .line 23
    invoke-static {v1, v2, v3, p1}, Lwb/ho;->n7(Ldb/c;IILjava/util/List;)Ldb/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lwb/w6;->j:Li0/a1;

    .line 37
    .line 38
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Ldb/c;

    .line 43
    .line 44
    iget v2, p0, Lwb/w6;->h:I

    .line 45
    .line 46
    iget v3, p0, Lwb/w6;->i:I

    .line 47
    .line 48
    invoke-static {v1, v2, v3, p1}, Lwb/ho;->n7(Ldb/c;IILjava/util/List;)Ldb/c;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
