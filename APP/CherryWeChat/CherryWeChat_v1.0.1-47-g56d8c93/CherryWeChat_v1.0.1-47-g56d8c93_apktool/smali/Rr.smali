.class public final LRr;
.super Lv5;
.source ""


# instance fields
.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:LcA;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILjava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lv5;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    iput p5, p0, LRr;->b:I

    iput-object p6, p0, LRr;->c:Ljava/lang/String;

    new-instance p1, Lz9;

    const/4 p2, 0x4

    invoke-direct {p1, p2, p0}, Lz9;-><init>(ILjava/lang/Object;)V

    new-instance p2, LcA;

    invoke-direct {p2, p1}, LcA;-><init>(LUi;)V

    iput-object p2, p0, LRr;->d:LcA;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LRr;

    if-eqz v1, :cond_1

    check-cast p1, LRr;

    iget-object p1, p1, LRr;->c:Ljava/lang/String;

    iget-object v1, p0, LRr;->c:Ljava/lang/String;

    invoke-static {p1, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final g()LDd;
    .locals 1

    iget-object v0, p0, LRr;->d:LcA;

    invoke-virtual {v0}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDd;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, LRr;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " "

    iget v2, p0, LRr;->b:I

    if-eqz v2, :cond_0

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->toString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p0}, LRr;->g()LDd;

    move-result-object v2

    iget-object v2, v2, LDd;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LRr;->g()LDd;

    move-result-object v1

    iget-object v1, v1, LDd;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LRr;->g()LDd;

    move-result-object v1

    iget-object v1, v1, LDd;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LRr;->g()LDd;

    move-result-object v1

    iget-object v2, v1, LDd;->c:Ljava/util/ArrayList;

    const/4 v6, 0x0

    const/16 v7, 0x3e

    const-string v3, ", "

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lra;->k0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfj;I)Ljava/lang/String;

    move-result-object v1

    const-string v2, ")"

    invoke-static {v0, v1, v2}, LEy;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
