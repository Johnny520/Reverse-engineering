.class public final Lzd;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lxd;


# instance fields
.field public final a:Lw4;

.field public final b:LPg;

.field public final c:LPg;


# direct methods
.method public constructor <init>(Lw4;)V
    .locals 2

    sget-object v0, LOj;->g:LPg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd;->a:Lw4;

    iget-object v1, p1, Lw4;->d:Ljava/lang/Object;

    check-cast v1, Les;

    iget-object v1, v1, Les;->a:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lws;->b:Lws;

    iget-object v1, v1, Lws;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvs;

    if-nez v1, :cond_0

    sget-object v1, Lws;->c:Lvs;

    :cond_0
    invoke-static {p1}, LOj;->u(Lw4;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v0, p0, Lzd;->b:LPg;

    iput-object v0, p0, Lzd;->c:LPg;

    return-void

    :cond_1
    iput-object v0, p0, Lzd;->b:LPg;

    iput-object v0, p0, Lzd;->c:LPg;

    return-void
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 4

    iget-object v0, p0, Lzd;->b:LPg;

    iget-object v1, p0, Lzd;->a:Lw4;

    iget-object v1, v1, Lw4;->c:Ljava/lang/Object;

    check-cast v1, Lsu;

    :try_start_0
    iget-object v2, v1, Lsu;->c:[B

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    array-length v3, v2

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v2

    :goto_0
    iget-object v3, v1, Lsu;->b:Ljava/lang/Object;

    check-cast v3, Lxd;

    invoke-interface {v3, p1, p2}, Lxd;->a([B[B)[B

    move-result-object p1

    filled-new-array {v2, p1}, [[B

    move-result-object p1

    invoke-static {p1}, LGu;->e([[B)[B

    move-result-object p1

    iget p2, v1, Lsu;->f:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw p1
.end method

.method public final b([B[B)[B
    .locals 8

    array-length v0, p1

    iget-object v1, p0, Lzd;->a:Lw4;

    iget-object v2, p0, Lzd;->c:LPg;

    const/4 v3, 0x5

    if-le v0, v3, :cond_0

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    array-length v4, p1

    invoke-static {p1, v3, v4}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v3

    invoke-virtual {v1, v0}, Lw4;->w([B)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lsu;

    :try_start_0
    iget-object v4, v4, Lsu;->b:Ljava/lang/Object;

    check-cast v4, Lxd;

    invoke-interface {v4, v3, p2}, Lxd;->b([B[B)[B

    move-result-object v4

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v4

    :catch_0
    move-exception v4

    sget-object v5, LAd;->a:Ljava/util/logging/Logger;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "ciphertext prefix matches a key, but cannot decrypt: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/util/logging/Logger;->info(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lcr;->a:[B

    invoke-virtual {v1, v0}, Lw4;->w([B)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsu;

    :try_start_1
    iget-object v1, v1, Lsu;->b:Ljava/lang/Object;

    check-cast v1, Lxd;

    invoke-interface {v1, p1, p2}, Lxd;->b([B[B)[B

    move-result-object v1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "decryption failed"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
