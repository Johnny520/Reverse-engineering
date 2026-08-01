.class public final synthetic Lr0/X0;
.super LN0/f;
.source "SourceFile"

# interfaces
.implements LM0/l;


# virtual methods
.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Landroid/content/Context;

    .line 2
    .line 3
    iget-object v0, p0, LN0/b;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lr0/Y0;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lr0/Y0;->l(Landroid/content/Context;)Landroid/app/Activity;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method
