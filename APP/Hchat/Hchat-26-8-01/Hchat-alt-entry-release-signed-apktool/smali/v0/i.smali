.class public final Lv0/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv0/f;
.implements Lu3/c;


# instance fields
.field public final synthetic g:Lv0/g;

.field public h:Landroidx/lifecycle/s;

.field public i:Lp4/t;


# direct methods
.method public constructor <init>(Lv0/g;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv0/i;->g:Lv0/g;

    .line 5
    .line 6
    const-string v0, "androidx.savedstate.SavedStateRegistry"

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lv0/g;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    instance-of v2, v1, Landroid/os/Bundle;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    check-cast v1, Landroid/os/Bundle;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    :goto_0
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lv0/i;->g(Landroid/os/Bundle;)Lp4/t;

    .line 23
    .line 24
    .line 25
    :cond_1
    new-instance v1, Lv0/a;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-direct {v1, p0, v2}, Lv0/a;-><init>(Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0, v1}, Lv0/g;->e(Ljava/lang/String;Lfg/a;)Lv0/e;

    .line 32
    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/i;->g:Lv0/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lv0/g;->a(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final b()Lm/a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lv0/i;->g(Landroid/os/Bundle;)Lp4/t;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-object v0, v0, Lp4/t;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lm/a;

    .line 9
    .line 10
    return-object v0
.end method

.method public final c()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/i;->g:Lv0/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv0/g;->c()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final d(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/i;->g:Lv0/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lv0/g;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final e(Ljava/lang/String;Lfg/a;)Lv0/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/i;->g:Lv0/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lv0/g;->e(Ljava/lang/String;Lfg/a;)Lv0/e;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final f()Landroidx/lifecycle/s;
    .locals 2

    .line 1
    iget-object v0, p0, Lv0/i;->h:Landroidx/lifecycle/s;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/s;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/s;-><init>(Landroidx/lifecycle/q;Z)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lv0/i;->h:Landroidx/lifecycle/s;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public final g(Landroid/os/Bundle;)Lp4/t;
    .locals 3

    .line 1
    iget-object v0, p0, Lv0/i;->i:Lp4/t;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lpa/c;

    .line 6
    .line 7
    new-instance v1, Li/e0;

    .line 8
    .line 9
    const/16 v2, 0x1c

    .line 10
    .line 11
    invoke-direct {v1, p0, v2}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, Lpa/c;-><init>(Lu3/c;Li/e0;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lp4/t;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Lp4/t;-><init>(Lpa/c;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lv0/i;->i:Lp4/t;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Lp4/t;->F(Landroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_0
    return-object v0
.end method
