.class public final synthetic Leb/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

.field public final synthetic i:Ljava/util/function/Consumer;


# direct methods
.method public synthetic constructor <init>(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;I)V
    .locals 0

    .line 1
    iput p3, p0, Leb/n;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Leb/n;->h:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 4
    .line 5
    iput-object p2, p0, Leb/n;->i:Ljava/util/function/Consumer;

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
    .locals 2

    .line 1
    iget v0, p0, Leb/n;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Leb/n;->i:Ljava/util/function/Consumer;

    .line 7
    .line 8
    check-cast p1, Ljava/lang/String;

    .line 9
    .line 10
    iget-object v1, p0, Leb/n;->h:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 11
    .line 12
    invoke-static {v1, v0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->a(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Ljava/lang/String;)Lsf/n;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iget-object v0, p0, Leb/n;->h:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 24
    .line 25
    iget-object v1, p0, Leb/n;->i:Ljava/util/function/Consumer;

    .line 26
    .line 27
    invoke-static {v0, v1, p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->n(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Z)Lsf/n;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :pswitch_1
    iget-object v0, p0, Leb/n;->i:Ljava/util/function/Consumer;

    .line 33
    .line 34
    check-cast p1, Ljava/util/Set;

    .line 35
    .line 36
    iget-object v1, p0, Leb/n;->h:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 37
    .line 38
    invoke-static {v1, v0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->i(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Ljava/util/Set;)Lsf/n;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    iget-object v0, p0, Leb/n;->h:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 50
    .line 51
    iget-object v1, p0, Leb/n;->i:Ljava/util/function/Consumer;

    .line 52
    .line 53
    invoke-static {v0, v1, p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->f(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;I)Lsf/n;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
