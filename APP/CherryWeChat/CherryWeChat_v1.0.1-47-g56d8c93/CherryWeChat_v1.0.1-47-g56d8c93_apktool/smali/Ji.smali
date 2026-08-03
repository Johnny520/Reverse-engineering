.class public abstract LJi;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:LIi;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LIi;->a:LIi;

    sput-object v0, LJi;->a:LIi;

    return-void
.end method

.method public static a(Lhi;)LIi;
    .locals 1

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lhi;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lhi;->f()Lzi;

    :cond_0
    iget-object p0, p0, Lhi;->u:Lhi;

    goto :goto_0

    :cond_1
    sget-object p0, LJi;->a:LIi;

    return-object p0
.end method

.method public static b(LFi;)V
    .locals 1

    const/4 v0, 0x3

    invoke-static {v0}, Lzi;->G(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, LFi;->a:Lhi;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method

.method public static final c(Lhi;Ljava/lang/String;)V
    .locals 3

    new-instance v0, LFi;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to reuse fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " with previous ID "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, LFi;-><init>(Lhi;Ljava/lang/String;)V

    invoke-static {v0}, LJi;->b(LFi;)V

    invoke-static {p0}, LJi;->a(Lhi;)LIi;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
