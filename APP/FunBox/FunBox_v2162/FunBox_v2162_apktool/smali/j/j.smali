.class public final Lj/j;
.super Lj/g;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lj/q;Lj/s;Lj/m;Lj/o;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lj/g;-><init>(Lj/q;Lj/s;Lj/m;Lj/o;)V

    invoke-virtual {p1}, Lj/q;->b()I

    move-result p2

    const/4 p4, 0x5

    if-eq p2, p4, :cond_2

    const/4 p4, 0x6

    if-eq p2, p4, :cond_2

    if-eqz p3, :cond_1

    invoke-virtual {p1}, Lj/q;->b()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "can\'t mix branchingness with result"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void

    :cond_2
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

    invoke-interface {p1, p0}, Lj/f;->c(Lj/j;)V

    return-void
.end method

.method public final f()Ll/e;
    .locals 1

    sget-object v0, Ll/b;->c:Ll/b;

    return-object v0
.end method
