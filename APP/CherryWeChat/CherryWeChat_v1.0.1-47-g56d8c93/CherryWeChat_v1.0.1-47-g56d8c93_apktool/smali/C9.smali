.class public final LC9;
.super Lv5;
.source ""


# instance fields
.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/Integer;

.field public final e:Ljava/util/ArrayList;

.field public final f:LcA;

.field public final g:LcA;

.field public final h:LcA;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIILjava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lv5;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    iput p4, p0, LC9;->b:I

    iput-object p5, p0, LC9;->c:Ljava/lang/String;

    iput-object p6, p0, LC9;->d:Ljava/lang/Integer;

    iput-object p7, p0, LC9;->e:Ljava/util/ArrayList;

    new-instance p2, Lz9;

    const/4 p4, 0x0

    invoke-direct {p2, p4, p0}, Lz9;-><init>(ILjava/lang/Object;)V

    new-instance p4, LcA;

    invoke-direct {p4, p2}, LcA;-><init>(LUi;)V

    iput-object p4, p0, LC9;->f:LcA;

    new-instance p2, LA9;

    invoke-direct {p2, p0, p1, p3}, LA9;-><init>(LC9;Lorg/luckypray/dexkit/DexKitBridge;I)V

    new-instance p4, LcA;

    invoke-direct {p4, p2}, LcA;-><init>(LUi;)V

    iput-object p4, p0, LC9;->g:LcA;

    new-instance p2, LA9;

    invoke-direct {p2, p1, p0, p3}, LA9;-><init>(Lorg/luckypray/dexkit/DexKitBridge;LC9;I)V

    new-instance p1, LcA;

    invoke-direct {p1, p2}, LcA;-><init>(LUi;)V

    iput-object p1, p0, LC9;->h:LcA;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LC9;

    if-eqz v1, :cond_1

    check-cast p1, LC9;

    iget-object p1, p1, LC9;->c:Ljava/lang/String;

    iget-object v1, p0, LC9;->c:Ljava/lang/String;

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final g()LCd;
    .locals 1

    iget-object v0, p0, LC9;->f:LcA;

    invoke-virtual {v0}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCd;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, LC9;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, LC9;->b:I

    if-lez v1, :cond_0

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p0}, LC9;->g()LCd;

    move-result-object v1

    iget-object v1, v1, LCd;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "class "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LC9;->g:LcA;

    invoke-virtual {v1}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LC9;

    if-eqz v1, :cond_1

    const-string v2, " extends "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, LC9;->g()LCd;

    move-result-object v1

    iget-object v1, v1, LCd;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    iget-object v1, p0, LC9;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_2

    const-string v1, " implements "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LC9;->h:LcA;

    invoke-virtual {v1}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LD9;

    sget-object v6, LB9;->c:LB9;

    const/16 v7, 0x1e

    const-string v3, ", "

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lra;->k0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfj;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
