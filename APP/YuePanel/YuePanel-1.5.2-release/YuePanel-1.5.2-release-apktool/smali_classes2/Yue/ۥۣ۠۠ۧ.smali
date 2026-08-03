.class public LYue/ۥۣ۠۠ۧ;
.super LYue/ۥۣۣ۠ۥ;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.7"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LYue/ۥۣۣ۠ۥ;-><init>(I)V

    iput-object p1, p0, LYue/ۥۣ۠۠ۧ;->ۥۣ۟۟۠:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LYue/ۥۣ۠۠ۧ;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, LYue/ۥۣ۠۠ۧ;

    iget-object v0, p0, LYue/ۥۣ۠۠ۧ;->ۥۣ۟۟۠:Ljava/lang/Class;

    iget-object p1, p1, LYue/ۥۣ۠۠ۧ;->ۥۣ۟۟۠:Ljava/lang/Class;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic getReflected()LYue/ۥ۠ۦۢۡ;
    .locals 1

    .line 1
    invoke-virtual {p0}, LYue/ۥۣ۠۠ۧ;->getReflected()LYue/ۥ۠ۦۢۧ;

    move-result-object v0

    return-object v0
.end method

.method public getReflected()LYue/ۥ۠ۦۢۧ;
    .locals 2

    .line 2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Functional interface constructor does not support reflection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۠۠ۧ;->ۥۣ۟۟۠:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "fun interface "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۣ۠۠ۧ;->ۥۣ۟۟۠:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
