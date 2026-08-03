.class public final Lca/f0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lr8/g;

.field public final b:Lp8/o;

.field public final c:Lb0/t;

.field public final d:Lab/b;

.field public final e:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Lr8/g;Lp8/o;Lb0/t;Lab/b;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lca/f0;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Lca/f0;->b:Lp8/o;

    .line 10
    .line 11
    iput-object p3, p0, Lca/f0;->c:Lb0/t;

    .line 12
    .line 13
    iput-object p4, p0, Lca/f0;->d:Lab/b;

    .line 14
    .line 15
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 16
    .line 17
    const-string p2, "Hchat_message_forward_config"

    .line 18
    .line 19
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lca/f0;->e:Landroid/content/SharedPreferences;

    .line 24
    .line 25
    sget-object p1, Lp8/j;->a:Lp8/j;

    .line 26
    .line 27
    new-instance v0, Lp8/i;

    .line 28
    .line 29
    new-instance v1, Lb0/v;

    .line 30
    .line 31
    const-class p1, Lca/f0;

    .line 32
    .line 33
    invoke-static {p1}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v9, 0x1

    .line 39
    const/4 v2, 0x0

    .line 40
    const-string v5, "isEnabled"

    .line 41
    .line 42
    const-string v6, "isEnabled()Z"

    .line 43
    .line 44
    const/4 v7, 0x0

    .line 45
    move-object v3, p0

    .line 46
    invoke-direct/range {v1 .. v9}, Lb0/v;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 47
    .line 48
    .line 49
    move-object p1, v3

    .line 50
    new-instance v9, Lb0/t;

    .line 51
    .line 52
    const/4 p2, 0x4

    .line 53
    invoke-direct {v9, p0, p2}, Lb0/t;-><init>(Ljava/lang/Object;I)V

    .line 54
    .line 55
    .line 56
    new-instance v8, Lo9/e;

    .line 57
    .line 58
    const/16 p2, 0x9

    .line 59
    .line 60
    invoke-direct {v8, p2}, Lo9/e;-><init>(I)V

    .line 61
    .line 62
    .line 63
    move-object v7, v1

    .line 64
    const-string v1, "message_forward"

    .line 65
    .line 66
    const v2, 0x4843534e    # 200013.22f

    .line 67
    .line 68
    .line 69
    const-string v3, "\u8f6c\u53d1[H]"

    .line 70
    .line 71
    const/16 v4, 0xa

    .line 72
    .line 73
    const/4 v5, 0x0

    .line 74
    const-string v6, "icons_filled_share"

    .line 75
    .line 76
    invoke-direct/range {v0 .. v9}, Lp8/i;-><init>(Ljava/lang/String;ILjava/lang/String;ILfg/a;Ljava/lang/String;Lfg/a;Lfg/l;Lfg/p;)V

    .line 77
    .line 78
    .line 79
    sget-object p2, Lp8/j;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 80
    .line 81
    invoke-virtual {p2, v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    return-void
.end method
