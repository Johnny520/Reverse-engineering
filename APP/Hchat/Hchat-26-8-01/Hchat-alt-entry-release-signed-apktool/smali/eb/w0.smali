.class public final synthetic Leb/w0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic i:Lo8/j;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;Lo8/j;Ljava/lang/String;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;I)V
    .locals 0

    .line 1
    iput p5, p0, Leb/w0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Leb/w0;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    iput-object p2, p0, Leb/w0;->i:Lo8/j;

    .line 6
    .line 7
    iput-object p3, p0, Leb/w0;->j:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p4, p0, Leb/w0;->k:Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Leb/w0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Leb/w0;->k:Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;

    .line 7
    .line 8
    check-cast p1, Ljava/lang/Exception;

    .line 9
    .line 10
    iget-object v1, p0, Leb/w0;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    iget-object v2, p0, Leb/w0;->i:Lo8/j;

    .line 13
    .line 14
    iget-object v3, p0, Leb/w0;->j:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v1, v2, v3, v0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->H(Ljava/util/concurrent/atomic/AtomicBoolean;Lo8/j;Ljava/lang/String;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;Ljava/lang/Exception;)Lsf/n;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :pswitch_0
    iget-object v0, p0, Leb/w0;->k:Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;

    .line 22
    .line 23
    check-cast p1, Ljava/io/File;

    .line 24
    .line 25
    iget-object v1, p0, Leb/w0;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    iget-object v2, p0, Leb/w0;->i:Lo8/j;

    .line 28
    .line 29
    iget-object v3, p0, Leb/w0;->j:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v1, v2, v3, v0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->M(Ljava/util/concurrent/atomic/AtomicBoolean;Lo8/j;Ljava/lang/String;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;Ljava/io/File;)Lsf/n;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
