.class public final Lj/t;
.super Lj/d;
.source "SourceFile"


# instance fields
.field private final f:Ll/e;


# direct methods
.method public constructor <init>(Lj/q;Lj/s;Lj/o;Ll/b;Lk/v;)V
    .locals 6

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lj/d;-><init>(Lj/q;Lj/s;Lj/m;Lj/o;Lk/v;)V

    invoke-virtual {p1}, Lj/q;->b()I

    move-result p2

    const/4 p3, 0x6

    if-ne p2, p3, :cond_1

    if-eqz p4, :cond_0

    iput-object p4, p0, Lj/t;->f:Ll/e;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "catches == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "opcode with invalid branchingness: "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lj/q;->b()I

    move-result p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final b(Lj/f;)V
    .locals 0

    invoke-interface {p1, p0}, Lj/f;->d(Lj/t;)V

    return-void
.end method

.method public final f()Ll/e;
    .locals 1

    iget-object v0, p0, Lj/t;->f:Ll/e;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lj/d;->l()Lk/a;

    move-result-object v0

    invoke-interface {v0}, Ln/k;->a()Ljava/lang/String;

    move-result-object v1

    instance-of v2, v0, Lk/t;

    if-eqz v2, :cond_0

    check-cast v0, Lk/t;

    invoke-virtual {v0}, Lk/t;->k()Ljava/lang/String;

    move-result-object v1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj/t;->f:Ll/e;

    invoke-static {v1}, Lj/u;->l(Ll/e;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
