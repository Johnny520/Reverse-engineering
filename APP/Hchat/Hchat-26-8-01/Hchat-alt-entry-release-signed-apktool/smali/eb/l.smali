.class public final synthetic Leb/l;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Leb/l;->g:I

    .line 2
    .line 3
    iput-object p2, p0, Leb/l;->h:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Leb/l;->i:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Leb/l;->j:Ljava/lang/String;

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
    .locals 3

    .line 1
    iget v0, p0, Leb/l;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Leb/l;->j:Ljava/lang/String;

    .line 7
    .line 8
    check-cast p1, Lj8/p;

    .line 9
    .line 10
    iget-object v1, p0, Leb/l;->h:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v2, p0, Leb/l;->i:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v1, v2, v0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    iget-object v0, p0, Leb/l;->j:Ljava/lang/String;

    .line 24
    .line 25
    check-cast p1, Lj8/p;

    .line 26
    .line 27
    iget-object v1, p0, Leb/l;->h:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v2, p0, Leb/l;->i:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v1, v2, v0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :pswitch_1
    iget-object v0, p0, Leb/l;->j:Ljava/lang/String;

    .line 41
    .line 42
    check-cast p1, Lj8/p;

    .line 43
    .line 44
    iget-object v1, p0, Leb/l;->h:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v2, p0, Leb/l;->i:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v1, v2, v0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :pswitch_2
    iget-object v0, p0, Leb/l;->j:Ljava/lang/String;

    .line 58
    .line 59
    check-cast p1, Landroid/app/Activity;

    .line 60
    .line 61
    iget-object v1, p0, Leb/l;->h:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v2, p0, Leb/l;->i:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v1, v2, v0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;)Lsf/n;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
