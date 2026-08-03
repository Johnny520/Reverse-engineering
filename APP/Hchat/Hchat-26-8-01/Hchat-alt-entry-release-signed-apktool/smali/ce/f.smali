.class public final synthetic Lce/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/BiConsumer;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lce/f;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lce/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lud/r;

    .line 7
    .line 8
    check-cast p2, Ljava/util/Set;

    .line 9
    .line 10
    invoke-static {p2}, Li4/c0;->j(Ljava/util/Set;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iput-object p2, p1, Lud/r;->H:Ljava/util/List;

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    check-cast p1, Lud/g;

    .line 18
    .line 19
    check-cast p2, Ljava/util/Set;

    .line 20
    .line 21
    invoke-static {p2}, Li4/c0;->j(Ljava/util/Set;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    iput-object p2, p1, Lud/g;->o:Ljava/util/List;

    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    check-cast p1, Lud/e;

    .line 29
    .line 30
    check-cast p2, Ljava/util/Set;

    .line 31
    .line 32
    invoke-static {p2}, Li4/c0;->j(Ljava/util/Set;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    iput-object p2, p1, Lud/e;->C:Ljava/util/List;

    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_2
    check-cast p1, Lud/e;

    .line 40
    .line 41
    check-cast p2, Ljava/util/Set;

    .line 42
    .line 43
    invoke-static {p2}, Li4/c0;->j(Ljava/util/Set;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    iput-object p2, p1, Lud/e;->B:Ljava/util/List;

    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_3
    check-cast p1, Lud/e;

    .line 51
    .line 52
    check-cast p2, Ljava/util/Set;

    .line 53
    .line 54
    invoke-static {p2}, Li4/c0;->j(Ljava/util/Set;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    iput-object p2, p1, Lud/e;->z:Ljava/util/List;

    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_4
    check-cast p1, Lae/f;

    .line 62
    .line 63
    check-cast p2, Ljava/util/List;

    .line 64
    .line 65
    iget-object p1, p1, Lae/f;->d:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-interface {p2, p1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
