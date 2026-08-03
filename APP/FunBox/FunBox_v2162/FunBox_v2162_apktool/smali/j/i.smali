.class public final Lj/i;
.super Lj/d;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lj/q;Lj/s;Lj/m;Lj/o;Lk/v;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lj/d;-><init>(Lj/q;Lj/s;Lj/m;Lj/o;Lk/v;)V

    invoke-virtual {p1}, Lj/q;->b()I

    move-result p2

    const/4 p3, 0x1

    if-ne p2, p3, :cond_0

    return-void

    :cond_0
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

    invoke-interface {p1, p0}, Lj/f;->b(Lj/i;)V

    return-void
.end method

.method public final f()Ll/e;
    .locals 1

    sget-object v0, Ll/b;->c:Ll/b;

    return-object v0
.end method
