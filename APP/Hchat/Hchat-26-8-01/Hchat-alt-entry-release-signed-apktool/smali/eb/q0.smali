.class public final synthetic Leb/q0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/function/Consumer;

.field public final synthetic i:Lh/Hchat/hooks/items/script/ScriptWaBridge;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/util/Map;

.field public final synthetic l:J

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;J)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Leb/q0;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Leb/q0;->h:Ljava/util/function/Consumer;

    .line 8
    .line 9
    iput-object p2, p0, Leb/q0;->i:Lh/Hchat/hooks/items/script/ScriptWaBridge;

    .line 10
    .line 11
    iput-object p3, p0, Leb/q0;->j:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, Leb/q0;->m:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Leb/q0;->k:Ljava/util/Map;

    .line 16
    .line 17
    iput-wide p6, p0, Leb/q0;->l:J

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;J)V
    .locals 1

    .line 20
    const/4 v0, 0x0

    iput v0, p0, Leb/q0;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb/q0;->h:Ljava/util/function/Consumer;

    iput-object p2, p0, Leb/q0;->i:Lh/Hchat/hooks/items/script/ScriptWaBridge;

    iput-object p3, p0, Leb/q0;->j:Ljava/lang/String;

    iput-object p4, p0, Leb/q0;->k:Ljava/util/Map;

    iput-object p5, p0, Leb/q0;->m:Ljava/lang/Object;

    iput-wide p6, p0, Leb/q0;->l:J

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Leb/q0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Leb/q0;->m:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v4, v0

    .line 9
    check-cast v4, Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Leb/q0;->k:Ljava/util/Map;

    .line 12
    .line 13
    iget-wide v6, p0, Leb/q0;->l:J

    .line 14
    .line 15
    iget-object v1, p0, Leb/q0;->h:Ljava/util/function/Consumer;

    .line 16
    .line 17
    iget-object v2, p0, Leb/q0;->i:Lh/Hchat/hooks/items/script/ScriptWaBridge;

    .line 18
    .line 19
    iget-object v3, p0, Leb/q0;->j:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static/range {v1 .. v7}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->C(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;J)Lsf/n;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :pswitch_0
    iget-object v0, p0, Leb/q0;->m:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v5, v0

    .line 29
    check-cast v5, Ljava/util/Map;

    .line 30
    .line 31
    iget-wide v6, p0, Leb/q0;->l:J

    .line 32
    .line 33
    iget-object v1, p0, Leb/q0;->h:Ljava/util/function/Consumer;

    .line 34
    .line 35
    iget-object v2, p0, Leb/q0;->i:Lh/Hchat/hooks/items/script/ScriptWaBridge;

    .line 36
    .line 37
    iget-object v3, p0, Leb/q0;->j:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v4, p0, Leb/q0;->k:Ljava/util/Map;

    .line 40
    .line 41
    invoke-static/range {v1 .. v7}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->o(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;J)Lsf/n;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
