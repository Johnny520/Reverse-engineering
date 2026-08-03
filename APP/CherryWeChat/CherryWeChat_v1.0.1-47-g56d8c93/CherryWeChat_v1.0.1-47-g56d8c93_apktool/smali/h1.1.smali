.class public abstract Lh1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Ls1;

    const/4 v1, 0x1

    const-class v2, Lg1;

    invoke-direct {v0, v1, v2}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v0}, [Ls1;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v3, 0x0

    aget-object v4, v0, v3

    iget-object v5, v4, Ls1;->a:Ljava/lang/Class;

    invoke-virtual {v1, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    const-string v7, "KeyTypeManager constructed with duplicate factories for primitive "

    if-nez v6, :cond_7

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    aget-object v0, v0, v3

    iget-object v0, v0, Ls1;->a:Ljava/lang/Class;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    new-instance v0, Ls1;

    const/4 v1, 0x4

    invoke-direct {v0, v1, v2}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v0}, [Ls1;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    aget-object v4, v0, v3

    iget-object v5, v4, Ls1;->a:Ljava/lang/Class;

    invoke-virtual {v1, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    aget-object v0, v0, v3

    iget-object v0, v0, Ls1;->a:Ljava/lang/Class;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    new-instance v0, Ls1;

    const/4 v1, 0x5

    invoke-direct {v0, v1, v2}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v0}, [Ls1;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    aget-object v4, v0, v3

    iget-object v5, v4, Ls1;->a:Ljava/lang/Class;

    invoke-virtual {v1, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    aget-object v0, v0, v3

    iget-object v0, v0, Ls1;->a:Ljava/lang/Class;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    new-instance v0, Ls1;

    const/4 v1, 0x3

    invoke-direct {v0, v1, v2}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v0}, [Ls1;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    aget-object v4, v0, v3

    iget-object v5, v4, Ls1;->a:Ljava/lang/Class;

    invoke-virtual {v1, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    aget-object v0, v0, v3

    iget-object v0, v0, Ls1;->a:Ljava/lang/Class;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    new-instance v0, Ls1;

    const/16 v1, 0x9

    invoke-direct {v0, v1, v2}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v0}, [Ls1;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    aget-object v4, v0, v3

    iget-object v5, v4, Ls1;->a:Ljava/lang/Class;

    invoke-virtual {v1, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    aget-object v0, v0, v3

    iget-object v0, v0, Ls1;->a:Ljava/lang/Class;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    new-instance v0, Ls1;

    const/16 v1, 0xa

    invoke-direct {v0, v1, v2}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v0}, [Ls1;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    aget-object v4, v0, v3

    iget-object v5, v4, Ls1;->a:Ljava/lang/Class;

    invoke-virtual {v1, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    aget-object v0, v0, v3

    iget-object v0, v0, Ls1;->a:Ljava/lang/Class;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    new-instance v0, Ls1;

    const/4 v1, 0x7

    invoke-direct {v0, v1, v2}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v0}, [Ls1;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    aget-object v4, v0, v3

    iget-object v5, v4, Ls1;->a:Ljava/lang/Class;

    invoke-virtual {v1, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    aget-object v0, v0, v3

    iget-object v0, v0, Ls1;->a:Ljava/lang/Class;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    new-instance v0, Ls1;

    const/16 v1, 0xb

    invoke-direct {v0, v1, v2}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v0}, [Ls1;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    aget-object v2, v0, v3

    iget-object v4, v2, Ls1;->a:Ljava/lang/Class;

    invoke-virtual {v1, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    aget-object v0, v0, v3

    iget-object v0, v0, Ls1;->a:Ljava/lang/Class;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    sget v0, LQv;->CONFIG_NAME_FIELD_NUMBER:I

    :try_start_0
    invoke-static {}, Lh1;->a()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a()V
    .locals 8

    sget-object v0, Ll1;->b:Ll1;

    invoke-static {v0}, LOv;->h(Luu;)V

    invoke-static {}, LVp;->a()V

    new-instance v0, Lu1;

    new-instance v1, Ls1;

    const/4 v2, 0x1

    const-class v3, Lg1;

    invoke-direct {v1, v2, v3}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v1}, [Ls1;

    move-result-object v1

    const/4 v4, 0x2

    const-class v5, LB1;

    invoke-direct {v0, v5, v1, v4}, Lu1;-><init>(Ljava/lang/Class;[Ls1;I)V

    invoke-static {v0, v2}, LOv;->f(Lin;Z)V

    new-instance v0, Lu1;

    new-instance v1, Ls1;

    const/4 v4, 0x4

    invoke-direct {v1, v4, v3}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v1}, [Ls1;

    move-result-object v1

    const-class v5, LY1;

    invoke-direct {v0, v5, v1, v4}, Lu1;-><init>(Ljava/lang/Class;[Ls1;I)V

    invoke-static {v0, v2}, LOv;->f(Lin;Z)V

    sget-object v0, Ld2;->a:LIt;

    sget-object v0, Lzs;->b:Lzs;

    sget-object v1, Ld2;->a:LIt;

    invoke-virtual {v0, v1}, Lzs;->e(LIt;)V

    sget-object v1, Ld2;->b:LHt;

    invoke-virtual {v0, v1}, Lzs;->d(LHt;)V

    sget-object v1, Ld2;->c:Lbn;

    invoke-virtual {v0, v1}, Lzs;->c(Lbn;)V

    sget-object v1, Ld2;->d:Lan;

    invoke-virtual {v0, v1}, Lzs;->b(Lan;)V

    invoke-static {}, LhB;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    new-instance v1, Lu1;

    new-instance v4, Ls1;

    const/4 v5, 0x3

    invoke-direct {v4, v5, v3}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v4}, [Ls1;

    move-result-object v4

    const-class v6, LO1;

    invoke-direct {v1, v6, v4, v5}, Lu1;-><init>(Ljava/lang/Class;[Ls1;I)V

    invoke-static {v1, v2}, LOv;->f(Lin;Z)V

    sget-object v1, LV1;->a:LIt;

    invoke-virtual {v0, v1}, Lzs;->e(LIt;)V

    sget-object v1, LV1;->b:LHt;

    invoke-virtual {v0, v1}, Lzs;->d(LHt;)V

    sget-object v1, LV1;->c:Lbn;

    invoke-virtual {v0, v1}, Lzs;->c(Lbn;)V

    sget-object v1, LV1;->d:Lan;

    invoke-virtual {v0, v1}, Lzs;->b(Lan;)V

    :try_start_0
    const-string v1, "AES/GCM-SIV/NoPadding"

    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v1, Lu1;

    new-instance v4, Ls1;

    const/4 v5, 0x5

    invoke-direct {v4, v5, v3}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v4}, [Ls1;

    move-result-object v4

    const-class v6, Lg2;

    invoke-direct {v1, v6, v4, v5}, Lu1;-><init>(Ljava/lang/Class;[Ls1;I)V

    invoke-static {v1, v2}, LOv;->f(Lin;Z)V

    sget-object v1, Ll2;->a:LIt;

    invoke-virtual {v0, v1}, Lzs;->e(LIt;)V

    sget-object v1, Ll2;->b:LHt;

    invoke-virtual {v0, v1}, Lzs;->d(LHt;)V

    sget-object v1, Ll2;->c:Lbn;

    invoke-virtual {v0, v1}, Lzs;->c(Lbn;)V

    sget-object v1, Ll2;->d:Lan;

    invoke-virtual {v0, v1}, Lzs;->b(Lan;)V

    :catch_0
    new-instance v0, Lu1;

    new-instance v1, Ls1;

    const/4 v4, 0x7

    invoke-direct {v1, v4, v3}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v1}, [Ls1;

    move-result-object v1

    const-class v5, Le7;

    invoke-direct {v0, v5, v1, v4}, Lu1;-><init>(Ljava/lang/Class;[Ls1;I)V

    invoke-static {v0, v2}, LOv;->f(Lin;Z)V

    sget-object v0, Lj7;->a:LIt;

    sget-object v0, Lzs;->b:Lzs;

    sget-object v1, Lj7;->a:LIt;

    invoke-virtual {v0, v1}, Lzs;->e(LIt;)V

    sget-object v1, Lj7;->b:LHt;

    invoke-virtual {v0, v1}, Lzs;->d(LHt;)V

    sget-object v1, Lj7;->c:Lbn;

    invoke-virtual {v0, v1}, Lzs;->c(Lbn;)V

    sget-object v1, Lj7;->d:Lan;

    invoke-virtual {v0, v1}, Lzs;->b(Lan;)V

    new-instance v1, Lu1;

    new-instance v4, Ls1;

    const/16 v5, 0x9

    invoke-direct {v4, v5, v3}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v4}, [Ls1;

    move-result-object v4

    const/16 v6, 0x8

    const-class v7, Lun;

    invoke-direct {v1, v7, v4, v6}, Lu1;-><init>(Ljava/lang/Class;[Ls1;I)V

    invoke-static {v1, v2}, LOv;->f(Lin;Z)V

    new-instance v1, Lu1;

    new-instance v4, Ls1;

    const/16 v6, 0xa

    invoke-direct {v4, v6, v3}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v4}, [Ls1;

    move-result-object v4

    const-class v7, Lzn;

    invoke-direct {v1, v7, v4, v5}, Lu1;-><init>(Ljava/lang/Class;[Ls1;I)V

    invoke-static {v1, v2}, LOv;->f(Lin;Z)V

    new-instance v1, Lu1;

    new-instance v4, Ls1;

    const/16 v5, 0xb

    invoke-direct {v4, v5, v3}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v4}, [Ls1;

    move-result-object v3

    const-class v4, LUF;

    invoke-direct {v1, v4, v3, v6}, Lu1;-><init>(Ljava/lang/Class;[Ls1;I)V

    invoke-static {v1, v2}, LOv;->f(Lin;Z)V

    sget-object v1, LYF;->a:LIt;

    invoke-virtual {v0, v1}, Lzs;->e(LIt;)V

    sget-object v1, LYF;->b:LHt;

    invoke-virtual {v0, v1}, Lzs;->d(LHt;)V

    sget-object v1, LYF;->c:Lbn;

    invoke-virtual {v0, v1}, Lzs;->c(Lbn;)V

    sget-object v1, LYF;->d:Lan;

    invoke-virtual {v0, v1}, Lzs;->b(Lan;)V

    return-void
.end method
