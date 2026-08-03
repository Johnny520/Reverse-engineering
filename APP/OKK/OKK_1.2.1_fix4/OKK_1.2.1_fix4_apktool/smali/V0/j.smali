.class public abstract LV0/j;
.super LV0/k;
.source "SourceFile"


# direct methods
.method public static A0(LV0/h;)Ljava/util/List;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LV0/h;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p0, LE0/u;->a:LE0/u;

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, LA0/p;->F(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public static y0(LE0/k;LP0/l;)LV0/f;
    .locals 2

    new-instance v0, LV0/f;

    sget-object v1, LV0/n;->i:LV0/n;

    invoke-direct {v0, p0, p1}, LV0/f;-><init>(LE0/k;LP0/l;)V

    return-object v0
.end method

.method public static z0(LV0/e;LP0/l;)LV0/e;
    .locals 2

    new-instance v0, LV0/f;

    invoke-direct {v0, p0, p1}, LV0/f;-><init>(LV0/h;LP0/l;)V

    sget-object p0, LV0/m;->a:LV0/m;

    new-instance p1, LV0/e;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, LV0/e;-><init>(LV0/h;ZLP0/l;)V

    return-object p1
.end method
