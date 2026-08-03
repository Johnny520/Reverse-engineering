.class public final synthetic Leb/n0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lh/Hchat/hooks/items/script/ScriptWaBridge;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;

.field public final synthetic k:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/Object;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p5, p0, Leb/n0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Leb/n0;->h:Lh/Hchat/hooks/items/script/ScriptWaBridge;

    .line 4
    .line 5
    iput-object p2, p0, Leb/n0;->i:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Leb/n0;->j:Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;

    .line 8
    .line 9
    iput-object p4, p0, Leb/n0;->k:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Leb/n0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Leb/n0;->j:Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;

    .line 7
    .line 8
    iget-object v1, p0, Leb/n0;->k:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p0, Leb/n0;->h:Lh/Hchat/hooks/items/script/ScriptWaBridge;

    .line 11
    .line 12
    iget-object v3, p0, Leb/n0;->i:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-static {v2, v3, v0, v1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->P(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/Object;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;Ljava/lang/String;)Lsf/n;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :pswitch_0
    iget-object v0, p0, Leb/n0;->j:Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;

    .line 20
    .line 21
    iget-object v1, p0, Leb/n0;->k:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v2, p0, Leb/n0;->h:Lh/Hchat/hooks/items/script/ScriptWaBridge;

    .line 24
    .line 25
    iget-object v3, p0, Leb/n0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {v2, v3, v0, v1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->m(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/Object;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;Ljava/lang/String;)Lsf/n;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
