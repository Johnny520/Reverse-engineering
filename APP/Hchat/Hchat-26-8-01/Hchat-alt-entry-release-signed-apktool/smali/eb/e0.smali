.class public final Leb/e0;
.super Landroid/os/FileObserver;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Leb/e0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Leb/e0;->b:Ljava/io/File;

    .line 4
    .line 5
    packed-switch p3, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const/16 p1, 0xfc8

    .line 9
    .line 10
    invoke-direct {p0, p2, p1}, Landroid/os/FileObserver;-><init>(Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    const/16 p1, 0xfc0

    .line 15
    .line 16
    invoke-direct {p0, p2, p1}, Landroid/os/FileObserver;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final onEvent(ILjava/lang/String;)V
    .locals 0

    .line 1
    iget p1, p0, Leb/e0;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 7
    .line 8
    iget-object p2, p0, Leb/e0;->b:Ljava/io/File;

    .line 9
    .line 10
    invoke-static {p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->access$refreshPluginDirObservers(Lh/Hchat/hooks/items/script/ScriptPluginRuntime;Ljava/io/File;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->access$notifyPluginCatalogChanged(Lh/Hchat/hooks/items/script/ScriptPluginRuntime;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    if-eqz p2, :cond_0

    .line 18
    .line 19
    const/16 p1, 0x2f

    .line 20
    .line 21
    invoke-static {p2, p1, p2}, Log/m;->L0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string p1, ""

    .line 27
    .line 28
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-nez p2, :cond_1

    .line 33
    .line 34
    sget-object p1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 35
    .line 36
    invoke-static {p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->access$notifyPluginCatalogChanged(Lh/Hchat/hooks/items/script/ScriptPluginRuntime;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p2, "main.java"

    .line 41
    .line 42
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-eqz p2, :cond_2

    .line 47
    .line 48
    sget-object p1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 49
    .line 50
    invoke-static {p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->access$notifyPluginCatalogChanged(Lh/Hchat/hooks/items/script/ScriptPluginRuntime;)V

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Leb/e0;->b:Ljava/io/File;

    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-static {p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->access$schedulePluginReload(Lh/Hchat/hooks/items/script/ScriptPluginRuntime;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    const-string p2, "info.prop"

    .line 67
    .line 68
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-nez p2, :cond_3

    .line 73
    .line 74
    const-string p2, "README.md"

    .line 75
    .line 76
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_4

    .line 81
    .line 82
    :cond_3
    sget-object p1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 83
    .line 84
    invoke-static {p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->access$notifyPluginCatalogChanged(Lh/Hchat/hooks/items/script/ScriptPluginRuntime;)V

    .line 85
    .line 86
    .line 87
    :cond_4
    :goto_1
    return-void

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
