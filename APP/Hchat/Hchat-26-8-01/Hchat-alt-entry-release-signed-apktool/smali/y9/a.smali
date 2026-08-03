.class public final synthetic Ly9/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lg8/f;


# instance fields
.field public final synthetic a:Lib/b;

.field public final synthetic b:Ly9/c;


# direct methods
.method public synthetic constructor <init>(Lib/b;Ly9/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly9/a;->a:Lib/b;

    .line 5
    .line 6
    iput-object p2, p0, Ly9/a;->b:Ly9/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lb/e;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ly9/a;->a:Lib/b;

    .line 2
    .line 3
    iget-object v0, v0, Lib/b;->a:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    const-string v1, "enable"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1}, Lb/e;->n()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object v0, p0, Ly9/a;->b:Ly9/c;

    .line 30
    .line 31
    iget-object v0, v0, Ly9/c;->e:Ly9/e;

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    invoke-static {p1}, Ly9/e;->g(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->tasks()Lo8/j;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    new-instance v2, Lrb/g;

    .line 49
    .line 50
    const/16 v3, 0x15

    .line 51
    .line 52
    invoke-direct {v2, v0, v3, p1}, Lrb/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v2}, Lo8/j;->e(Ljava/lang/Runnable;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    :goto_0
    return-void
.end method
