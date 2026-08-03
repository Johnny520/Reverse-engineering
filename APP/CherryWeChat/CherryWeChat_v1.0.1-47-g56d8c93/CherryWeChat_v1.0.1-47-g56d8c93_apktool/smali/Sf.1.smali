.class public final LSf;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg1;


# instance fields
.field public final a:Lhl;

.field public final b:LUp;

.field public final c:I


# direct methods
.method public constructor <init>(Lhl;LUp;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSf;->a:Lhl;

    iput-object p2, p0, LSf;->b:LUp;

    iput p3, p0, LSf;->c:I

    return-void
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 9

    iget-object v0, p0, LSf;->a:Lhl;

    move-object v1, v0

    check-cast v1, LF1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v0, p1

    iget v2, v1, LF1;->b:I

    const v3, 0x7fffffff

    sub-int/2addr v3, v2

    if-gt v0, v3, :cond_1

    array-length v0, p1

    add-int/2addr v0, v2

    new-array v5, v0, [B

    invoke-static {v2}, Lav;->a(I)[B

    move-result-object v7

    const/4 v0, 0x0

    invoke-static {v7, v0, v5, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v4, p1

    iget v6, v1, LF1;->b:I

    const/4 v8, 0x1

    const/4 v3, 0x0

    move-object v2, p1

    invoke-virtual/range {v1 .. v8}, LF1;->a([BII[BI[BZ)V

    if-nez p2, :cond_0

    new-array p2, v0, [B

    :cond_0
    const/16 p1, 0x8

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    array-length v1, p2

    int-to-long v1, v1

    const-wide/16 v3, 0x8

    mul-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    filled-new-array {p2, v5, p1}, [[B

    move-result-object p1

    invoke-static {p1}, LGu;->e([[B)[B

    move-result-object p1

    iget-object p2, p0, LSf;->b:LUp;

    invoke-interface {p2, p1}, LUp;->b([B)[B

    move-result-object p1

    filled-new-array {v5, p1}, [[B

    move-result-object p1

    invoke-static {p1}, LGu;->e([[B)[B

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "plaintext length can not exceed "

    invoke-static {v3, p2}, Lph;->i(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b([B[B)[B
    .locals 12

    array-length v0, p1

    const-string v1, "ciphertext too short"

    iget v2, p0, LSf;->c:I

    if-lt v0, v2, :cond_2

    array-length v0, p1

    sub-int/2addr v0, v2

    const/4 v3, 0x0

    invoke-static {p1, v3, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v5

    array-length v0, p1

    sub-int/2addr v0, v2

    array-length v2, p1

    invoke-static {p1, v0, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    if-nez p2, :cond_0

    new-array p2, v3, [B

    :cond_0
    const/16 v0, 0x8

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    array-length v4, p2

    int-to-long v6, v4

    const-wide/16 v8, 0x8

    mul-long/2addr v6, v8

    invoke-virtual {v2, v6, v7}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    filled-new-array {p2, v5, v0}, [[B

    move-result-object p2

    invoke-static {p2}, LGu;->e([[B)[B

    move-result-object p2

    iget-object v0, p0, LSf;->b:LUp;

    invoke-interface {v0, p1, p2}, LUp;->a([B[B)V

    iget-object p1, p0, LSf;->a:Lhl;

    move-object v4, p1

    check-cast v4, LF1;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length p1, v5

    iget p2, v4, LF1;->b:I

    if-lt p1, p2, :cond_1

    new-array v10, p2, [B

    invoke-static {v5, v3, v10, v3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length p1, v5

    iget v6, v4, LF1;->b:I

    sub-int/2addr p1, v6

    new-array v8, p1, [B

    array-length p1, v5

    sub-int v7, p1, v6

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-virtual/range {v4 .. v11}, LF1;->a([BII[BI[BZ)V

    return-object v8

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
