.class public final synthetic Lxh/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxh/n;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lxh/n;->h:Li0/a1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lxh/n;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Le1/b;

    .line 7
    .line 8
    iget-object p1, p0, Lxh/n;->h:Li0/a1;

    .line 9
    .line 10
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lfg/a;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-interface {p1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    check-cast p1, Lv1/t;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const-wide/16 v0, 0x0

    .line 30
    .line 31
    invoke-interface {p1, v0, v1}, Lv1/t;->m(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    new-instance p1, Le1/b;

    .line 36
    .line 37
    invoke-direct {p1, v0, v1}, Le1/b;-><init>(J)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lxh/n;->h:Li0/a1;

    .line 41
    .line 42
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 46
    .line 47
    return-object p1

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
