.class public final synthetic Leb/p0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:Ljava/util/function/Consumer;

.field public final synthetic h:Lh/Hchat/hooks/items/script/ScriptWaBridge;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/util/Map;

.field public final synthetic k:J


# direct methods
.method public synthetic constructor <init>(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/util/Map;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Leb/p0;->g:Ljava/util/function/Consumer;

    .line 5
    .line 6
    iput-object p2, p0, Leb/p0;->h:Lh/Hchat/hooks/items/script/ScriptWaBridge;

    .line 7
    .line 8
    iput-object p3, p0, Leb/p0;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Leb/p0;->j:Ljava/util/Map;

    .line 11
    .line 12
    iput-wide p5, p0, Leb/p0;->k:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v3, p0, Leb/p0;->j:Ljava/util/Map;

    .line 2
    .line 3
    iget-wide v4, p0, Leb/p0;->k:J

    .line 4
    .line 5
    iget-object v0, p0, Leb/p0;->g:Ljava/util/function/Consumer;

    .line 6
    .line 7
    iget-object v1, p0, Leb/p0;->h:Lh/Hchat/hooks/items/script/ScriptWaBridge;

    .line 8
    .line 9
    iget-object v2, p0, Leb/p0;->i:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static/range {v0 .. v5}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->J(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/util/Map;J)Lsf/n;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method
