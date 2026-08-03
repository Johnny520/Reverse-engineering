.class public final synthetic Leb/t;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lwa/h;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/function/Consumer;


# direct methods
.method public synthetic constructor <init>(Ljava/util/function/Consumer;I)V
    .locals 0

    .line 1
    iput p2, p0, Leb/t;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Leb/t;->h:Ljava/util/function/Consumer;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    iget v0, p0, Leb/t;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Leb/t;->h:Ljava/util/function/Consumer;

    .line 7
    .line 8
    invoke-static {v0, p2, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->j(Ljava/util/function/Consumer;ZLjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, Leb/t;->h:Ljava/util/function/Consumer;

    .line 13
    .line 14
    invoke-static {v0, p2, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->f(Ljava/util/function/Consumer;ZLjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
