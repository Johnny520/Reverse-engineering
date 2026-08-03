.class public final synthetic Leb/y0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lh/Hchat/hooks/items/script/ScriptWaBridge;

.field public final synthetic i:Ljava/util/function/Consumer;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/util/function/Consumer;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Leb/y0;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Leb/y0;->h:Lh/Hchat/hooks/items/script/ScriptWaBridge;

    .line 8
    .line 9
    iput-object p2, p0, Leb/y0;->i:Ljava/util/function/Consumer;

    .line 10
    .line 11
    iput-object p3, p0, Leb/y0;->j:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, Leb/y0;->k:Ljava/lang/String;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Leb/y0;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb/y0;->i:Ljava/util/function/Consumer;

    iput-object p2, p0, Leb/y0;->h:Lh/Hchat/hooks/items/script/ScriptWaBridge;

    iput-object p3, p0, Leb/y0;->j:Ljava/lang/String;

    iput-object p4, p0, Leb/y0;->k:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Leb/y0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Leb/y0;->j:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v1, p0, Leb/y0;->k:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p0, Leb/y0;->h:Lh/Hchat/hooks/items/script/ScriptWaBridge;

    .line 11
    .line 12
    iget-object v3, p0, Leb/y0;->i:Ljava/util/function/Consumer;

    .line 13
    .line 14
    invoke-static {v2, v3, v0, v1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->k(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/util/function/Consumer;Ljava/lang/String;Ljava/lang/String;)Lsf/n;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :pswitch_0
    iget-object v0, p0, Leb/y0;->j:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v1, p0, Leb/y0;->k:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v2, p0, Leb/y0;->h:Lh/Hchat/hooks/items/script/ScriptWaBridge;

    .line 24
    .line 25
    iget-object v3, p0, Leb/y0;->i:Ljava/util/function/Consumer;

    .line 26
    .line 27
    invoke-static {v2, v3, v0, v1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->K(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/util/function/Consumer;Ljava/lang/String;Ljava/lang/String;)Lsf/n;

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
