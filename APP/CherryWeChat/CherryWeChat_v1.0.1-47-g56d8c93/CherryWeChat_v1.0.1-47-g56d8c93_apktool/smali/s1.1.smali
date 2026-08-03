.class public final Ls1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/Class;

.field public final synthetic b:I


# direct methods
.method public constructor <init>(ILjava/lang/Class;)V
    .locals 0

    iput p1, p0, Ls1;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ls1;->a:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final a(LB;)Ljava/lang/Object;
    .locals 14

    iget v0, p0, Ls1;->b:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, LUF;

    new-instance v0, LW1;

    invoke-virtual {p1}, LUF;->y()Ly6;

    move-result-object p1

    invoke-virtual {p1}, Ly6;->g()[B

    move-result-object p1

    const/4 v1, 0x3

    invoke-direct {v0, v1, p1}, LW1;-><init>(I[B)V

    return-object v0

    :pswitch_0
    check-cast p1, Lzn;

    invoke-virtual {p1}, Lzn;->y()LAn;

    move-result-object v0

    invoke-virtual {v0}, LAn;->y()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwn;->a(Ljava/lang/String;)LE2;

    move-result-object v1

    invoke-virtual {v1, v0}, LE2;->c(Ljava/lang/String;)LW1;

    move-result-object v0

    new-instance v1, Lxn;

    invoke-virtual {p1}, Lzn;->y()LAn;

    move-result-object p1

    invoke-virtual {p1}, LAn;->x()Len;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lxn;-><init>(Len;LW1;)V

    return-object v1

    :pswitch_1
    check-cast p1, Lun;

    invoke-virtual {p1}, Lun;->y()Lvn;

    move-result-object p1

    invoke-virtual {p1}, Lvn;->x()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwn;->a(Ljava/lang/String;)LE2;

    move-result-object v0

    invoke-virtual {v0, p1}, LE2;->c(Ljava/lang/String;)LW1;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, LCk;

    invoke-virtual {p1}, LCk;->B()LIk;

    move-result-object v0

    invoke-virtual {v0}, LIk;->z()Lrk;

    move-result-object v0

    invoke-virtual {p1}, LCk;->A()Ly6;

    move-result-object v1

    invoke-virtual {v1}, Ly6;->g()[B

    move-result-object v1

    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    const-string v3, "HMAC"

    invoke-direct {v2, v1, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-virtual {p1}, LCk;->B()LIk;

    move-result-object p1

    invoke-virtual {p1}, LIk;->A()I

    move-result p1

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    new-instance v0, Lhu;

    new-instance v1, LNi;

    const-string v3, "HMACSHA224"

    invoke-direct {v1, v3, v2}, LNi;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;)V

    invoke-direct {v0, v1, p1}, Lhu;-><init>(Lfu;I)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "unknown hash"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance v0, Lhu;

    new-instance v1, LNi;

    const-string v3, "HMACSHA512"

    invoke-direct {v1, v3, v2}, LNi;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;)V

    invoke-direct {v0, v1, p1}, Lhu;-><init>(Lfu;I)V

    goto :goto_0

    :cond_2
    new-instance v0, Lhu;

    new-instance v1, LNi;

    const-string v3, "HMACSHA256"

    invoke-direct {v1, v3, v2}, LNi;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;)V

    invoke-direct {v0, v1, p1}, Lhu;-><init>(Lfu;I)V

    goto :goto_0

    :cond_3
    new-instance v0, Lhu;

    new-instance v1, LNi;

    const-string v3, "HMACSHA384"

    invoke-direct {v1, v3, v2}, LNi;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;)V

    invoke-direct {v0, v1, p1}, Lhu;-><init>(Lfu;I)V

    goto :goto_0

    :cond_4
    new-instance v0, Lhu;

    new-instance v1, LNi;

    const-string v3, "HMACSHA1"

    invoke-direct {v1, v3, v2}, LNi;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;)V

    invoke-direct {v0, v1, p1}, Lhu;-><init>(Lfu;I)V

    :goto_0
    return-object v0

    :pswitch_3
    check-cast p1, Le7;

    new-instance v0, LW1;

    invoke-virtual {p1}, Le7;->y()Ly6;

    move-result-object p1

    invoke-virtual {p1}, Ly6;->g()[B

    move-result-object p1

    const/4 v1, 0x2

    invoke-direct {v0, v1, p1}, LW1;-><init>(I[B)V

    return-object v0

    :pswitch_4
    check-cast p1, Lo2;

    new-instance v0, Lm2;

    invoke-virtual {p1}, Lo2;->y()Ly6;

    move-result-object p1

    invoke-virtual {p1}, Ly6;->g()[B

    move-result-object p1

    invoke-direct {v0, p1}, Lm2;-><init>([B)V

    return-object v0

    :pswitch_5
    check-cast p1, Lg2;

    new-instance v0, Le2;

    invoke-virtual {p1}, Lg2;->y()Ly6;

    move-result-object p1

    invoke-virtual {p1}, Ly6;->g()[B

    move-result-object p1

    invoke-direct {v0, p1}, Le2;-><init>([B)V

    return-object v0

    :pswitch_6
    check-cast p1, LY1;

    new-instance v0, LW1;

    invoke-virtual {p1}, LY1;->y()Ly6;

    move-result-object p1

    invoke-virtual {p1}, Ly6;->g()[B

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1}, LW1;-><init>(I[B)V

    return-object v0

    :pswitch_7
    check-cast p1, LO1;

    new-instance v0, LM1;

    invoke-virtual {p1}, LO1;->z()Ly6;

    move-result-object v1

    invoke-virtual {v1}, Ly6;->g()[B

    move-result-object v1

    invoke-virtual {p1}, LO1;->A()LU1;

    move-result-object p1

    invoke-virtual {p1}, LU1;->y()I

    move-result p1

    invoke-direct {v0, p1, v1}, LM1;-><init>(I[B)V

    return-object v0

    :pswitch_8
    check-cast p1, LH1;

    new-instance v0, LF1;

    invoke-virtual {p1}, LH1;->A()Ly6;

    move-result-object v1

    invoke-virtual {v1}, Ly6;->g()[B

    move-result-object v1

    invoke-virtual {p1}, LH1;->B()LL1;

    move-result-object p1

    invoke-virtual {p1}, LL1;->y()I

    move-result p1

    invoke-direct {v0, p1, v1}, LF1;-><init>(I[B)V

    return-object v0

    :pswitch_9
    check-cast p1, LB1;

    new-instance v0, LSf;

    new-instance v1, Ls1;

    const/4 v2, 0x2

    const-class v3, Lhl;

    invoke-direct {v1, v2, v3}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v1}, [Ls1;

    move-result-object v1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    array-length v4, v1

    const/4 v5, 0x0

    move v6, v5

    :goto_1
    const-string v7, "KeyTypeManager constructed with duplicate factories for primitive "

    if-ge v6, v4, :cond_6

    aget-object v8, v1, v6

    iget-object v9, v8, Ls1;->a:Ljava/lang/Class;

    invoke-virtual {v2, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    invoke-virtual {v2, v9, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    array-length v4, v1

    if-lez v4, :cond_7

    aget-object v1, v1, v5

    iget-object v1, v1, Ls1;->a:Ljava/lang/Class;

    :cond_7
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, LB1;->z()LH1;

    move-result-object v2

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls1;

    const-string v4, " not supported."

    const-string v6, "Requested primitive class "

    if-eqz v1, :cond_c

    invoke-virtual {v1, v2}, Ls1;->a(LB;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhl;

    new-instance v2, Ls1;

    const/16 v3, 0x8

    const-class v8, LUp;

    invoke-direct {v2, v3, v8}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v2}, [Ls1;

    move-result-object v2

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    array-length v9, v2

    move v10, v5

    :goto_2
    if-ge v10, v9, :cond_9

    aget-object v11, v2, v10

    iget-object v12, v11, Ls1;->a:Ljava/lang/Class;

    invoke-virtual {v3, v12}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_8

    invoke-virtual {v3, v12, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    array-length v7, v2

    if-lez v7, :cond_a

    aget-object v2, v2, v5

    iget-object v2, v2, Ls1;->a:Ljava/lang/Class;

    :cond_a
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1}, LB1;->A()LCk;

    move-result-object v3

    invoke-interface {v2, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls1;

    if-eqz v2, :cond_b

    invoke-virtual {v2, v3}, Ls1;->a(LB;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LUp;

    invoke-virtual {p1}, LB1;->A()LCk;

    move-result-object p1

    invoke-virtual {p1}, LCk;->B()LIk;

    move-result-object p1

    invoke-virtual {p1}, LIk;->A()I

    move-result p1

    invoke-direct {v0, v1, v2, p1}, LSf;-><init>(Lhl;LUp;I)V

    return-object v0

    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_a
    check-cast p1, Ln1;

    new-instance v0, Lhu;

    new-instance v1, Lw4;

    invoke-virtual {p1}, Ln1;->z()Ly6;

    move-result-object v2

    invoke-virtual {v2}, Ly6;->g()[B

    move-result-object v2

    invoke-direct {v1, v2}, Lw4;-><init>([B)V

    invoke-virtual {p1}, Ln1;->A()Ly1;

    move-result-object p1

    invoke-virtual {p1}, Ly1;->y()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lhu;-><init>(Lfu;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
