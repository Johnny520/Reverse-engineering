.class public abstract LxD;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    return-void
.end method

.method public static a(Lnn;)Lsn;
    .locals 5

    invoke-static {}, Lsn;->z()Lpn;

    move-result-object v0

    invoke-virtual {p0}, Lnn;->B()I

    move-result v1

    invoke-virtual {v0}, Ltj;->e()V

    iget-object v2, v0, Ltj;->b:Lvj;

    check-cast v2, Lsn;

    invoke-static {v2, v1}, Lsn;->w(Lsn;I)V

    invoke-virtual {p0}, Lnn;->A()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmn;

    invoke-static {}, Lrn;->B()Lqn;

    move-result-object v2

    invoke-virtual {v1}, Lmn;->A()LVm;

    move-result-object v3

    invoke-virtual {v3}, LVm;->B()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ltj;->e()V

    iget-object v4, v2, Ltj;->b:Lvj;

    check-cast v4, Lrn;

    invoke-static {v4, v3}, Lrn;->w(Lrn;Ljava/lang/String;)V

    invoke-virtual {v1}, Lmn;->D()Lcn;

    move-result-object v3

    invoke-virtual {v2}, Ltj;->e()V

    iget-object v4, v2, Ltj;->b:Lvj;

    check-cast v4, Lrn;

    invoke-static {v4, v3}, Lrn;->y(Lrn;Lcn;)V

    invoke-virtual {v1}, Lmn;->C()Lyt;

    move-result-object v3

    invoke-virtual {v2}, Ltj;->e()V

    iget-object v4, v2, Ltj;->b:Lvj;

    check-cast v4, Lrn;

    invoke-static {v4, v3}, Lrn;->x(Lrn;Lyt;)V

    invoke-virtual {v1}, Lmn;->B()I

    move-result v1

    invoke-virtual {v2}, Ltj;->e()V

    iget-object v3, v2, Ltj;->b:Lvj;

    check-cast v3, Lrn;

    invoke-static {v3, v1}, Lrn;->z(Lrn;I)V

    invoke-virtual {v2}, Ltj;->b()Lvj;

    move-result-object v1

    check-cast v1, Lrn;

    invoke-virtual {v0}, Ltj;->e()V

    iget-object v2, v0, Ltj;->b:Lvj;

    check-cast v2, Lsn;

    invoke-static {v2, v1}, Lsn;->x(Lsn;Lrn;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ltj;->b()Lvj;

    move-result-object p0

    check-cast p0, Lsn;

    return-object p0
.end method
