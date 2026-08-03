.class public final synthetic Lbe/m0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(ILjava/util/ArrayList;)V
    .locals 0

    .line 1
    iput p1, p0, Lbe/m0;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lbe/m0;->b:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lbe/m0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lud/h;

    .line 7
    .line 8
    invoke-interface {p1}, Lud/h;->g()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Lbe/m0;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    check-cast p1, Lud/a;

    .line 19
    .line 20
    iget-object p1, p1, Lud/a;->l:Ljava/util/ArrayList;

    .line 21
    .line 22
    iget-object v0, p0, Lbe/m0;->b:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    iget-object v0, p0, Lbe/m0;->b:Ljava/util/ArrayList;

    .line 29
    .line 30
    check-cast p1, Lte/b;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_2
    check-cast p1, Ljava/util/Map;

    .line 37
    .line 38
    new-instance v0, Lae/g;

    .line 39
    .line 40
    const/16 v1, 0xd

    .line 41
    .line 42
    invoke-direct {v0, p1, v1}, Lae/g;-><init>(Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lbe/m0;->b:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->forEach(Ljava/util/function/Consumer;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_3
    iget-object v0, p0, Lbe/m0;->b:Ljava/util/ArrayList;

    .line 52
    .line 53
    check-cast p1, Lud/a;

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_4
    iget-object v0, p0, Lbe/m0;->b:Ljava/util/ArrayList;

    .line 60
    .line 61
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 62
    .line 63
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->d(Ljava/util/ArrayList;Ljava/lang/reflect/Constructor;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_5
    iget-object v0, p0, Lbe/m0;->b:Ljava/util/ArrayList;

    .line 68
    .line 69
    check-cast p1, Ljava/nio/file/Path;

    .line 70
    .line 71
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_6
    iget-object v0, p0, Lbe/m0;->b:Ljava/util/ArrayList;

    .line 76
    .line 77
    check-cast p1, Lqd/j;

    .line 78
    .line 79
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
