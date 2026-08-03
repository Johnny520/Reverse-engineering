.class public final synthetic Lk9/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lq8/p;


# virtual methods
.method public final a(Lb5/c;)V
    .locals 2

    .line 1
    sget-object v0, Lk9/r;->a:Lk9/r;

    .line 2
    .line 3
    iget-object v0, p1, Lb5/c;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/app/Activity;

    .line 6
    .line 7
    iget-object p1, p1, Lb5/c;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Ljava/lang/String;

    .line 10
    .line 11
    const-string v1, "resume"

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance p1, Lk9/p;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {p1, v0, v1}, Lk9/p;-><init>(Landroid/app/Activity;I)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lk9/r;->p(Lfg/a;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    const-string v1, "destroy"

    .line 33
    .line 34
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance p1, Lk9/p;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-direct {p1, v0, v1}, Lk9/p;-><init>(Landroid/app/Activity;I)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Lk9/r;->p(Lfg/a;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void
.end method
