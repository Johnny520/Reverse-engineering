.class public final synthetic Leb/v;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/BiFunction;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lfg/p;


# direct methods
.method public synthetic constructor <init>(ILfg/p;)V
    .locals 0

    .line 1
    iput p1, p0, Leb/v;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Leb/v;->b:Lfg/p;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Leb/v;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Leb/v;->b:Lfg/p;

    .line 7
    .line 8
    check-cast v0, Log/u;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, Log/u;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ljava/util/List;

    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    iget-object v0, p0, Leb/v;->b:Lfg/p;

    .line 18
    .line 19
    check-cast v0, Li2/y;

    .line 20
    .line 21
    invoke-virtual {v0, p1, p2}, Li2/y;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lp8/c0;

    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_1
    iget-object v0, p0, Leb/v;->b:Lfg/p;

    .line 29
    .line 30
    check-cast v0, Lo9/d;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, Lo9/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lo9/l;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_2
    iget-object v0, p0, Leb/v;->b:Lfg/p;

    .line 40
    .line 41
    check-cast v0, Leb/u;

    .line 42
    .line 43
    invoke-static {v0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->b(Leb/u;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
