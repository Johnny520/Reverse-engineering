.class public final Lic2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lfc2;
.implements Ltc2;


# instance fields
.field public final synthetic h:Lgc2;

.field public i:Lla1;

.field public j:Lrc2;


# direct methods
.method public constructor <init>(Lgc2;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lic2;->h:Lgc2;

    .line 5
    .line 6
    const-string v0, "androidx.savedstate.SavedStateRegistry"

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lgc2;->d(Ljava/lang/String;)Ljava/lang/Object;

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
    invoke-virtual {p0, v1}, Lic2;->e(Landroid/os/Bundle;)Lrc2;

    .line 23
    .line 24
    .line 25
    :cond_1
    new-instance v1, Lta;

    .line 26
    .line 27
    const/16 v2, 0x13

    .line 28
    .line 29
    invoke-direct {v1, v2, p0}, Lta;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0, v1}, Lgc2;->a(Ljava/lang/String;Lxm0;)Lec2;

    .line 33
    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lxm0;)Lec2;
    .locals 0

    .line 1
    iget-object p0, p0, Lic2;->h:Lgc2;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lgc2;->a(Ljava/lang/String;Lxm0;)Lec2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final b(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lic2;->h:Lgc2;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lgc2;->b(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final c()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lic2;->h:Lgc2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgc2;->c()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final d(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lic2;->h:Lgc2;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lgc2;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final e(Landroid/os/Bundle;)Lrc2;
    .locals 3

    .line 1
    iget-object v0, p0, Lic2;->j:Lrc2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lsc2;

    .line 6
    .line 7
    new-instance v1, Lta;

    .line 8
    .line 9
    const/16 v2, 0x14

    .line 10
    .line 11
    invoke-direct {v1, v2, p0}, Lta;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, Lsc2;-><init>(Ltc2;Lta;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lrc2;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Lrc2;-><init>(Lsc2;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lic2;->j:Lrc2;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Lrc2;->a(Landroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_0
    return-object v0
.end method

.method public final getLifecycle()Lba1;
    .locals 2

    .line 1
    iget-object v0, p0, Lic2;->i:Lla1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lla1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lla1;-><init>(Lia1;Z)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lic2;->i:Lla1;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public final getSavedStateRegistry()Lqc2;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lic2;->e(Landroid/os/Bundle;)Lrc2;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    iget-object p0, p0, Lrc2;->b:Lqc2;

    .line 7
    .line 8
    return-object p0
.end method
