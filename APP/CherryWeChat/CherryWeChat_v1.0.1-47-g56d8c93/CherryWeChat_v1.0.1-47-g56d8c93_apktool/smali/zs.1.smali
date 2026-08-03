.class public final Lzs;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:Lzs;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzs;

    invoke-direct {v0}, Lzs;-><init>()V

    sput-object v0, Lzs;->b:Lzs;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lqs;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Lqs;-><init>(I)V

    new-instance v2, LKx;

    invoke-direct {v2, v1}, LKx;-><init>(Lqs;)V

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lzs;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final a(LFu;)LTB;
    .locals 8

    iget-object v0, p0, Lzs;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LKx;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, LIx;

    iget-object v3, p1, LFu;->b:Ljava/lang/Object;

    check-cast v3, Lz6;

    const-class v4, LFu;

    invoke-direct {v2, v4, v3}, LIx;-><init>(Ljava/lang/Class;Lz6;)V

    iget-object v1, v1, LKx;->b:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    :try_start_0
    new-instance v0, LKn;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, LFu;->d:Ljava/lang/Object;

    check-cast p1, LUm;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, LFa;

    const-string v1, "Creating a LegacyProtoKey failed"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LKx;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, LIx;

    invoke-direct {v1, v4, v3}, LIx;-><init>(Ljava/lang/Class;Lz6;)V

    iget-object v0, v0, LKx;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2c

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lan;

    iget-object v0, v0, Lan;->b:Lr1;

    iget v0, v0, Lr1;->a:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    iget-object v0, p1, LFu;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v1, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    :try_start_1
    iget-object v0, p1, LFu;->c:Ljava/io/Serializable;

    check-cast v0, Ly6;

    invoke-static {}, LTg;->a()LTg;

    move-result-object v1

    invoke-static {v0, v1}, LUF;->B(Ly6;LTg;)LUF;

    move-result-object v0

    invoke-virtual {v0}, LUF;->z()I

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p1, LFu;->e:Ljava/lang/Object;

    check-cast v1, Lyt;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_4

    const/4 v3, 0x2

    if-eq v2, v3, :cond_3

    const/4 v3, 0x3

    if-eq v2, v3, :cond_2

    const/4 v3, 0x4

    if-ne v2, v3, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Unable to parse OutputPrefixType: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lyt;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    sget-object v1, Lv1;->G:Lv1;

    goto :goto_1

    :cond_3
    :goto_0
    sget-object v1, Lv1;->F:Lv1;

    goto :goto_1

    :cond_4
    sget-object v1, Lv1;->E:Lv1;

    :goto_1
    invoke-virtual {v0}, LUF;->y()Ly6;

    move-result-object v0

    invoke-virtual {v0}, Ly6;->g()[B

    move-result-object v0

    new-instance v2, LXm;

    invoke-static {v0}, Lz6;->a([B)Lz6;

    move-result-object v0

    const/16 v3, 0xd

    invoke-direct {v2, v3, v0}, LXm;-><init>(ILjava/lang/Object;)V

    iget-object p1, p1, LFu;->f:Ljava/io/Serializable;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v1, v2, p1}, LVF;->N(Lv1;LXm;Ljava/lang/Integer;)LVF;

    move-result-object p1

    goto/16 :goto_e

    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch LPl; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing XChaCha20Poly1305Key failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    iget-object v0, p1, LFu;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v1, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    :try_start_2
    iget-object v0, p1, LFu;->c:Ljava/io/Serializable;

    check-cast v0, Ly6;

    invoke-static {}, LTg;->a()LTg;

    move-result-object v1

    invoke-static {v0, v1}, LCk;->E(Ly6;LTg;)LCk;

    move-result-object v0

    invoke-virtual {v0}, LCk;->C()I

    move-result v1

    if-nez v1, :cond_7

    new-instance v1, Lqs;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    iput-object v2, v1, Lqs;->a:Ljava/lang/Object;

    iput-object v2, v1, Lqs;->b:Ljava/lang/Object;

    iput-object v2, v1, Lqs;->c:Ljava/lang/Object;

    sget-object v3, Lv1;->A:Lv1;

    iput-object v3, v1, Lqs;->d:Ljava/lang/Object;

    invoke-virtual {v0}, LCk;->A()Ly6;

    move-result-object v3

    invoke-virtual {v3}, Ly6;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v1, Lqs;->a:Ljava/lang/Object;

    invoke-virtual {v0}, LCk;->B()LIk;

    move-result-object v3

    invoke-virtual {v3}, LIk;->A()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v1, Lqs;->b:Ljava/lang/Object;

    invoke-virtual {v0}, LCk;->B()LIk;

    move-result-object v3

    invoke-virtual {v3}, LIk;->z()Lrk;

    move-result-object v3

    invoke-static {v3}, LJk;->a(Lrk;)Lv1;

    move-result-object v3

    iput-object v3, v1, Lqs;->c:Ljava/lang/Object;

    iget-object v3, p1, LFu;->e:Ljava/lang/Object;

    check-cast v3, Lyt;

    invoke-static {v3}, LJk;->b(Lyt;)Lv1;

    move-result-object v3

    iput-object v3, v1, Lqs;->d:Ljava/lang/Object;

    invoke-virtual {v1}, Lqs;->i()LGk;

    move-result-object v1

    new-instance v3, Lw4;

    const/16 v4, 0xe

    invoke-direct {v3, v4}, Lw4;-><init>(I)V

    iput-object v2, v3, Lw4;->c:Ljava/lang/Object;

    iput-object v2, v3, Lw4;->d:Ljava/lang/Object;

    iput-object v1, v3, Lw4;->b:Ljava/lang/Object;

    invoke-virtual {v0}, LCk;->A()Ly6;

    move-result-object v0

    invoke-virtual {v0}, Ly6;->g()[B

    move-result-object v0

    new-instance v1, LXm;

    invoke-static {v0}, Lz6;->a([B)Lz6;

    move-result-object v0

    const/16 v2, 0xd

    invoke-direct {v1, v2, v0}, LXm;-><init>(ILjava/lang/Object;)V

    iput-object v1, v3, Lw4;->c:Ljava/lang/Object;

    iget-object p1, p1, LFu;->f:Ljava/io/Serializable;

    check-cast p1, Ljava/lang/Integer;

    iput-object p1, v3, Lw4;->d:Ljava/lang/Object;

    invoke-virtual {v3}, Lw4;->j()LDk;

    move-result-object p1

    goto/16 :goto_e

    :cond_7
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catch LPl; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing HmacKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to HmacProtoSerialization.parseKey"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_2
    iget-object v0, p1, LFu;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v1, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    :try_start_3
    iget-object v0, p1, LFu;->c:Ljava/io/Serializable;

    check-cast v0, Ly6;

    invoke-static {}, LTg;->a()LTg;

    move-result-object v1

    invoke-static {v0, v1}, Le7;->B(Ly6;LTg;)Le7;

    move-result-object v0

    invoke-virtual {v0}, Le7;->z()I

    move-result v1

    if-nez v1, :cond_d

    iget-object v1, p1, LFu;->e:Ljava/lang/Object;

    check-cast v1, Lyt;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_c

    const/4 v3, 0x2

    if-eq v2, v3, :cond_b

    const/4 v3, 0x3

    if-eq v2, v3, :cond_a

    const/4 v3, 0x4

    if-ne v2, v3, :cond_9

    goto :goto_2

    :cond_9
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Unable to parse OutputPrefixType: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lyt;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    sget-object v1, Lv1;->r:Lv1;

    goto :goto_3

    :cond_b
    :goto_2
    sget-object v1, Lv1;->q:Lv1;

    goto :goto_3

    :cond_c
    sget-object v1, Lv1;->p:Lv1;

    :goto_3
    invoke-virtual {v0}, Le7;->y()Ly6;

    move-result-object v0

    invoke-virtual {v0}, Ly6;->g()[B

    move-result-object v0

    new-instance v2, LXm;

    invoke-static {v0}, Lz6;->a([B)Lz6;

    move-result-object v0

    const/16 v3, 0xd

    invoke-direct {v2, v3, v0}, LXm;-><init>(ILjava/lang/Object;)V

    iget-object p1, p1, LFu;->f:Ljava/io/Serializable;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v1, v2, p1}, Lf7;->N(Lv1;LXm;Ljava/lang/Integer;)Lf7;

    move-result-object p1

    goto/16 :goto_e

    :cond_d
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catch LPl; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing ChaCha20Poly1305Key failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_3
    iget-object v0, p1, LFu;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    :try_start_4
    iget-object v0, p1, LFu;->c:Ljava/io/Serializable;

    check-cast v0, Ly6;

    invoke-static {}, LTg;->a()LTg;

    move-result-object v1

    invoke-static {v0, v1}, Lg2;->B(Ly6;LTg;)Lg2;

    move-result-object v0

    invoke-virtual {v0}, Lg2;->z()I

    move-result v1

    if-nez v1, :cond_15

    sget-object v1, Lv1;->o:Lv1;

    invoke-virtual {v0}, Lg2;->y()Ly6;

    move-result-object v2

    invoke-virtual {v2}, Ly6;->size()I

    move-result v2

    const/16 v3, 0x10

    if-eq v2, v3, :cond_10

    const/16 v3, 0x20

    if-ne v2, v3, :cond_f

    goto :goto_4

    :cond_f
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    const-string v0, "Invalid key size %d; only 16-byte and 32-byte AES keys are supported"

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_10
    :goto_4
    iget-object v3, p1, LFu;->e:Ljava/lang/Object;

    check-cast v3, Lyt;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/4 v5, 0x1

    if-eq v4, v5, :cond_13

    const/4 v5, 0x2

    if-eq v4, v5, :cond_12

    const/4 v5, 0x3

    if-eq v4, v5, :cond_14

    const/4 v1, 0x4

    if-ne v4, v1, :cond_11

    goto :goto_5

    :cond_11
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to parse OutputPrefixType: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lyt;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_12
    :goto_5
    sget-object v1, Lv1;->n:Lv1;

    goto :goto_6

    :cond_13
    sget-object v1, Lv1;->m:Lv1;

    :cond_14
    :goto_6
    new-instance v3, Lk2;

    invoke-direct {v3, v2, v1}, Lk2;-><init>(ILv1;)V

    new-instance v1, Lw4;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lw4;-><init>(I)V

    const/4 v2, 0x0

    iput-object v2, v1, Lw4;->c:Ljava/lang/Object;

    iput-object v2, v1, Lw4;->d:Ljava/lang/Object;

    iput-object v3, v1, Lw4;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Lg2;->y()Ly6;

    move-result-object v0

    invoke-virtual {v0}, Ly6;->g()[B

    move-result-object v0

    new-instance v2, LXm;

    invoke-static {v0}, Lz6;->a([B)Lz6;

    move-result-object v0

    const/16 v3, 0xd

    invoke-direct {v2, v3, v0}, LXm;-><init>(ILjava/lang/Object;)V

    iput-object v2, v1, Lw4;->c:Ljava/lang/Object;

    iget-object p1, p1, LFu;->f:Ljava/io/Serializable;

    check-cast p1, Ljava/lang/Integer;

    iput-object p1, v1, Lw4;->d:Ljava/lang/Object;

    invoke-virtual {v1}, Lw4;->h()Lh2;

    move-result-object p1

    goto/16 :goto_e

    :cond_15
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_4
    .catch LPl; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing AesGcmSivKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_16
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to AesGcmSivParameters.parseParameters"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_4
    iget-object v0, p1, LFu;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1e

    :try_start_5
    iget-object v0, p1, LFu;->c:Ljava/io/Serializable;

    check-cast v0, Ly6;

    invoke-static {}, LTg;->a()LTg;

    move-result-object v1

    invoke-static {v0, v1}, LY1;->B(Ly6;LTg;)LY1;

    move-result-object v0

    invoke-virtual {v0}, LY1;->z()I

    move-result v1

    if-nez v1, :cond_1d

    sget-object v1, Lv1;->l:Lv1;

    invoke-virtual {v0}, LY1;->y()Ly6;

    move-result-object v2

    invoke-virtual {v2}, Ly6;->size()I

    move-result v2

    const/16 v3, 0x10

    if-eq v2, v3, :cond_18

    const/16 v4, 0x18

    if-eq v2, v4, :cond_18

    const/16 v4, 0x20

    if-ne v2, v4, :cond_17

    goto :goto_7

    :cond_17
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    const-string v0, "Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported"

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_18
    :goto_7
    iget-object v4, p1, LFu;->e:Ljava/lang/Object;

    check-cast v4, Lyt;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    const/4 v6, 0x1

    if-eq v5, v6, :cond_1b

    const/4 v6, 0x2

    if-eq v5, v6, :cond_1a

    const/4 v6, 0x3

    if-eq v5, v6, :cond_1c

    const/4 v1, 0x4

    if-ne v5, v1, :cond_19

    goto :goto_8

    :cond_19
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to parse OutputPrefixType: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lyt;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1a
    :goto_8
    sget-object v1, Lv1;->k:Lv1;

    goto :goto_9

    :cond_1b
    sget-object v1, Lv1;->j:Lv1;

    :cond_1c
    :goto_9
    new-instance v4, Lc2;

    const/16 v5, 0xc

    invoke-direct {v4, v2, v5, v3, v1}, Lc2;-><init>(IIILv1;)V

    new-instance v1, Lw4;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lw4;-><init>(I)V

    const/4 v2, 0x0

    iput-object v2, v1, Lw4;->c:Ljava/lang/Object;

    iput-object v2, v1, Lw4;->d:Ljava/lang/Object;

    iput-object v4, v1, Lw4;->b:Ljava/lang/Object;

    invoke-virtual {v0}, LY1;->y()Ly6;

    move-result-object v0

    invoke-virtual {v0}, Ly6;->g()[B

    move-result-object v0

    new-instance v2, LXm;

    invoke-static {v0}, Lz6;->a([B)Lz6;

    move-result-object v0

    const/16 v3, 0xd

    invoke-direct {v2, v3, v0}, LXm;-><init>(ILjava/lang/Object;)V

    iput-object v2, v1, Lw4;->c:Ljava/lang/Object;

    iget-object p1, p1, LFu;->f:Ljava/io/Serializable;

    check-cast p1, Ljava/lang/Integer;

    iput-object p1, v1, Lw4;->d:Ljava/lang/Object;

    invoke-virtual {v1}, Lw4;->g()LZ1;

    move-result-object p1

    goto/16 :goto_e

    :cond_1d
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_5
    .catch LPl; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing AesGcmKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to AesGcmParameters.parseParameters"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_5
    iget-object v0, p1, LFu;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v1, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_28

    :try_start_6
    iget-object v0, p1, LFu;->c:Ljava/io/Serializable;

    check-cast v0, Ly6;

    invoke-static {}, LTg;->a()LTg;

    move-result-object v1

    invoke-static {v0, v1}, LO1;->D(Ly6;LTg;)LO1;

    move-result-object v0

    invoke-virtual {v0}, LO1;->B()I

    move-result v1

    if-nez v1, :cond_27

    sget-object v1, Lv1;->i:Lv1;

    invoke-virtual {v0}, LO1;->z()Ly6;

    move-result-object v2

    invoke-virtual {v2}, Ly6;->size()I

    move-result v2

    const/16 v3, 0x10

    if-eq v2, v3, :cond_20

    const/16 v4, 0x18

    if-eq v2, v4, :cond_20

    const/16 v4, 0x20

    if-ne v2, v4, :cond_1f

    goto :goto_a

    :cond_1f
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    const-string v0, "Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported"

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_20
    :goto_a
    invoke-virtual {v0}, LO1;->A()LU1;

    move-result-object v4

    invoke-virtual {v4}, LU1;->y()I

    move-result v4

    const/16 v5, 0xc

    if-eq v4, v5, :cond_22

    if-ne v4, v3, :cond_21

    goto :goto_b

    :cond_21
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes"

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_22
    :goto_b
    iget-object v5, p1, LFu;->e:Ljava/lang/Object;

    check-cast v5, Lyt;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    const/4 v7, 0x1

    if-eq v6, v7, :cond_25

    const/4 v7, 0x2

    if-eq v6, v7, :cond_24

    const/4 v7, 0x3

    if-eq v6, v7, :cond_26

    const/4 v1, 0x4

    if-ne v6, v1, :cond_23

    goto :goto_c

    :cond_23
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to parse OutputPrefixType: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Lyt;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_24
    :goto_c
    sget-object v1, Lv1;->h:Lv1;

    goto :goto_d

    :cond_25
    sget-object v1, Lv1;->g:Lv1;

    :cond_26
    :goto_d
    new-instance v5, LS1;

    invoke-direct {v5, v2, v4, v3, v1}, LS1;-><init>(IIILv1;)V

    new-instance v1, Lw4;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lw4;-><init>(I)V

    const/4 v2, 0x0

    iput-object v2, v1, Lw4;->c:Ljava/lang/Object;

    iput-object v2, v1, Lw4;->d:Ljava/lang/Object;

    iput-object v5, v1, Lw4;->b:Ljava/lang/Object;

    invoke-virtual {v0}, LO1;->z()Ly6;

    move-result-object v0

    invoke-virtual {v0}, Ly6;->g()[B

    move-result-object v0

    new-instance v2, LXm;

    invoke-static {v0}, Lz6;->a([B)Lz6;

    move-result-object v0

    const/16 v3, 0xd

    invoke-direct {v2, v3, v0}, LXm;-><init>(ILjava/lang/Object;)V

    iput-object v2, v1, Lw4;->c:Ljava/lang/Object;

    iget-object p1, p1, LFu;->f:Ljava/io/Serializable;

    check-cast p1, Ljava/lang/Integer;

    iput-object p1, v1, Lw4;->d:Ljava/lang/Object;

    invoke-virtual {v1}, Lw4;->f()LP1;

    move-result-object p1

    goto/16 :goto_e

    :cond_27
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_6
    .catch LPl; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing AesEaxcKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_28
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to AesEaxParameters.parseParameters"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_6
    iget-object v0, p1, LFu;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2b

    :try_start_7
    iget-object v0, p1, LFu;->c:Ljava/io/Serializable;

    check-cast v0, Ly6;

    invoke-static {}, LTg;->a()LTg;

    move-result-object v1

    invoke-static {v0, v1}, Ln1;->D(Ly6;LTg;)Ln1;

    move-result-object v0

    invoke-virtual {v0}, Ln1;->B()I

    move-result v1

    if-nez v1, :cond_2a

    new-instance v1, Lw4;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lw4;-><init>(I)V

    const/4 v2, 0x0

    iput-object v2, v1, Lw4;->b:Ljava/lang/Object;

    iput-object v2, v1, Lw4;->c:Ljava/lang/Object;

    sget-object v3, Lv1;->f:Lv1;

    iput-object v3, v1, Lw4;->d:Ljava/lang/Object;

    invoke-virtual {v0}, Ln1;->z()Ly6;

    move-result-object v3

    invoke-virtual {v3}, Ly6;->size()I

    move-result v3

    invoke-virtual {v1, v3}, Lw4;->G(I)V

    invoke-virtual {v0}, Ln1;->A()Ly1;

    move-result-object v3

    invoke-virtual {v3}, Ly1;->y()I

    move-result v3

    const/16 v4, 0xa

    if-lt v3, v4, :cond_29

    const/16 v4, 0x10

    if-lt v4, v3, :cond_29

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v1, Lw4;->c:Ljava/lang/Object;

    iget-object v3, p1, LFu;->e:Ljava/lang/Object;

    check-cast v3, Lyt;

    invoke-static {v3}, Lz1;->a(Lyt;)Lv1;

    move-result-object v3

    iput-object v3, v1, Lw4;->d:Ljava/lang/Object;

    invoke-virtual {v1}, Lw4;->e()Lw1;

    move-result-object v1

    new-instance v3, Lw4;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lw4;-><init>(I)V

    iput-object v2, v3, Lw4;->c:Ljava/lang/Object;

    iput-object v2, v3, Lw4;->d:Ljava/lang/Object;

    iput-object v1, v3, Lw4;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Ln1;->z()Ly6;

    move-result-object v0

    invoke-virtual {v0}, Ly6;->g()[B

    move-result-object v0

    new-instance v1, LXm;

    invoke-static {v0}, Lz6;->a([B)Lz6;

    move-result-object v0

    const/16 v2, 0xd

    invoke-direct {v1, v2, v0}, LXm;-><init>(ILjava/lang/Object;)V

    iput-object v1, v3, Lw4;->c:Ljava/lang/Object;

    iget-object p1, p1, LFu;->f:Ljava/io/Serializable;

    check-cast p1, Ljava/lang/Integer;

    iput-object p1, v3, Lw4;->d:Ljava/lang/Object;

    invoke-virtual {v3}, Lw4;->d()Lo1;

    move-result-object p1

    :goto_e
    return-object p1

    :cond_29
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Invalid tag size for AesCmacParameters: "

    invoke-static {v3, v0}, Lph;->i(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2a
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_7
    .catch LPl; {:try_start_7 .. :try_end_7} :catch_7
    .catch Ljava/lang/IllegalArgumentException; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing AesCmacKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to AesCmacParameters.parseParameters"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2c
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "No Key Parser for requested key type "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " available"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final declared-synchronized b(Lan;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lqs;

    iget-object v1, p0, Lzs;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LKx;

    invoke-direct {v0, v1}, Lqs;-><init>(LKx;)V

    invoke-virtual {v0, p1}, Lqs;->y(Lan;)V

    new-instance p1, LKx;

    invoke-direct {p1, v0}, LKx;-><init>(Lqs;)V

    iget-object v0, p0, Lzs;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized c(Lbn;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lqs;

    iget-object v1, p0, Lzs;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LKx;

    invoke-direct {v0, v1}, Lqs;-><init>(LKx;)V

    invoke-virtual {v0, p1}, Lqs;->z(Lbn;)V

    new-instance p1, LKx;

    invoke-direct {p1, v0}, LKx;-><init>(Lqs;)V

    iget-object v0, p0, Lzs;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized d(LHt;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lqs;

    iget-object v1, p0, Lzs;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LKx;

    invoke-direct {v0, v1}, Lqs;-><init>(LKx;)V

    invoke-virtual {v0, p1}, Lqs;->A(LHt;)V

    new-instance p1, LKx;

    invoke-direct {p1, v0}, LKx;-><init>(Lqs;)V

    iget-object v0, p0, Lzs;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized e(LIt;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lqs;

    iget-object v1, p0, Lzs;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LKx;

    invoke-direct {v0, v1}, Lqs;-><init>(LKx;)V

    invoke-virtual {v0, p1}, Lqs;->B(LIt;)V

    new-instance p1, LKx;

    invoke-direct {p1, v0}, LKx;-><init>(Lqs;)V

    iget-object v0, p0, Lzs;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
