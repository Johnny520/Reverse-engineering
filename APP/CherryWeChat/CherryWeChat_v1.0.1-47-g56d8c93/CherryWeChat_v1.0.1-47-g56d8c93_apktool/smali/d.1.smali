.class public final synthetic Ld;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ld;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lft;)V
    .locals 0

    .line 2
    const/16 p1, 0x14

    iput p1, p0, Ld;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 10

    iget v0, p0, Ld;->a:I

    const-wide v1, -0x2f91cfffff835L

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lio/github/cherrywechat/application/MainApplication;->a:Lio/github/cherrywechat/application/MainApplication;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lgf;->p:Landroid/app/Application;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Landroid/app/AndroidAppHelper;->currentApplication()Landroid/app/Application;

    move-result-object v0

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    :goto_0
    const-string v1, "_androidx_security_master_key_"

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    new-instance v2, Landroid/security/keystore/KeyGenParameterSpec$Builder;

    const/4 v4, 0x3

    invoke-direct {v2, v1, v4}, Landroid/security/keystore/KeyGenParameterSpec$Builder;-><init>(Ljava/lang/String;I)V

    const-string v1, "GCM"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setBlockModes([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v1

    const-string v2, "NoPadding"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setEncryptionPaddings([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v1

    const/16 v2, 0x100

    invoke-virtual {v1, v2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setKeySize(I)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->build()Landroid/security/keystore/KeyGenParameterSpec;

    move-result-object v1

    if-eqz v1, :cond_d

    sget-object v5, Lxq;->a:Ljava/lang/Object;

    invoke-virtual {v1}, Landroid/security/keystore/KeyGenParameterSpec;->getKeySize()I

    move-result v5

    if-ne v5, v2, :cond_c

    invoke-virtual {v1}, Landroid/security/keystore/KeyGenParameterSpec;->getBlockModes()[Ljava/lang/String;

    move-result-object v2

    const-string v5, "GCM"

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-virtual {v1}, Landroid/security/keystore/KeyGenParameterSpec;->getPurposes()I

    move-result v2

    if-ne v2, v4, :cond_a

    invoke-virtual {v1}, Landroid/security/keystore/KeyGenParameterSpec;->getEncryptionPaddings()[Ljava/lang/String;

    move-result-object v2

    const-string v4, "NoPadding"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual {v1}, Landroid/security/keystore/KeyGenParameterSpec;->isUserAuthenticationRequired()Z

    move-result v2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Landroid/security/keystore/KeyGenParameterSpec;->getUserAuthenticationValidityDurationSeconds()I

    move-result v2

    if-lt v2, v4, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    sget-object v2, Lxq;->a:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    invoke-virtual {v1}, Landroid/security/keystore/KeyGenParameterSpec;->getKeystoreAlias()Ljava/lang/String;

    move-result-object v5

    const-string v6, "AndroidKeyStore"

    invoke-static {v6}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V

    invoke-virtual {v6, v5}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-nez v5, :cond_4

    :try_start_1
    const-string v5, "AES"

    const-string v6, "AndroidKeyStore"

    invoke-static {v5, v6}, Ljavax/crypto/KeyGenerator;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/KeyGenerator;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljavax/crypto/KeyGenerator;->init(Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {v5}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;
    :try_end_1
    .catch Ljava/security/ProviderException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    goto :goto_2

    :catch_0
    move-exception v0

    :try_start_2
    new-instance v1, Ljava/security/GeneralSecurityException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_4
    :goto_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {v1}, Landroid/security/keystore/KeyGenParameterSpec;->getKeystoreAlias()Ljava/lang/String;

    move-result-object v1

    const-wide v5, -0x20099fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v5, -0x200a4fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v5, LgG;->b:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x5f

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget v6, LgG;->a:I

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v5

    iget-wide v5, v5, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget v5, Lyd;->a:I

    sget-object v5, LAd;->b:LAd;

    invoke-static {v5}, LOv;->h(Luu;)V

    invoke-static {}, LhB;->a()Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_3

    :cond_5
    new-instance v5, Lu1;

    const-class v6, Lo2;

    new-instance v7, Ls1;

    const-class v8, Lxd;

    const/4 v9, 0x6

    invoke-direct {v7, v9, v8}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v7}, [Ls1;

    move-result-object v7

    invoke-direct {v5, v6, v7, v9}, Lu1;-><init>(Ljava/lang/Class;[Ls1;I)V

    invoke-static {v5, v4}, LOv;->f(Lin;Z)V

    :goto_3
    invoke-static {}, Lh1;->a()V

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v4, LC2;

    invoke-direct {v4}, LC2;-><init>()V

    const-string v5, "AES256_SIV"

    invoke-static {v5}, LfG;->T(Ljava/lang/String;)Lfn;

    move-result-object v5

    iput-object v5, v4, LC2;->g:Ljava/lang/Object;

    const-string v5, "__androidx_security_crypto_encrypted_prefs_key_keyset__"

    if-eqz v0, :cond_8

    iput-object v0, v4, LC2;->b:Ljava/lang/Object;

    iput-object v5, v4, LC2;->c:Ljava/lang/Object;

    iput-object v2, v4, LC2;->d:Ljava/lang/Object;

    const-string v5, "android-keystore://"

    invoke-static {v5, v1}, LEy;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "android-keystore://"

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_7

    iput-object v6, v4, LC2;->e:Ljava/lang/Object;

    invoke-virtual {v4}, LC2;->a()LD2;

    move-result-object v4

    monitor-enter v4

    :try_start_3
    iget-object v6, v4, LD2;->b:Ljava/lang/Object;

    check-cast v6, LXm;

    invoke-virtual {v6}, LXm;->g()Lw4;

    move-result-object v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    new-instance v4, LC2;

    invoke-direct {v4}, LC2;-><init>()V

    const-string v7, "AES256_GCM"

    invoke-static {v7}, LfG;->T(Ljava/lang/String;)Lfn;

    move-result-object v7

    iput-object v7, v4, LC2;->g:Ljava/lang/Object;

    const-string v7, "__androidx_security_crypto_encrypted_prefs_value_keyset__"

    iput-object v0, v4, LC2;->b:Ljava/lang/Object;

    iput-object v7, v4, LC2;->c:Ljava/lang/Object;

    iput-object v2, v4, LC2;->d:Ljava/lang/Object;

    invoke-static {v5, v1}, LEy;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "android-keystore://"

    invoke-virtual {v1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_6

    iput-object v1, v4, LC2;->e:Ljava/lang/Object;

    invoke-virtual {v4}, LC2;->a()LD2;

    move-result-object v1

    monitor-enter v1

    :try_start_4
    iget-object v4, v1, LD2;->b:Ljava/lang/Object;

    check-cast v4, LXm;

    invoke-virtual {v4}, LXm;->g()Lw4;

    move-result-object v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v1

    const-class v1, Lxd;

    invoke-virtual {v6, v1}, Lw4;->v(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxd;

    const-class v5, Lg1;

    invoke-virtual {v4, v5}, Lw4;->v(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg1;

    new-instance v5, LWf;

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-direct {v5, v2, v0, v4, v1}, LWf;-><init>(Ljava/lang/String;Landroid/content/SharedPreferences;Lg1;Lxd;)V

    const-wide v0, -0x200b8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-object v5

    :catchall_0
    move-exception v0

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "key URI must start with android-keystore://"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    :try_start_6
    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "key URI must start with android-keystore://"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "need an Android context"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_2
    move-exception v0

    :try_start_7
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    throw v0

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "invalid padding mode, want NoPadding got "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/security/keystore/KeyGenParameterSpec;->getEncryptionPaddings()[Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/security/keystore/KeyGenParameterSpec;->getPurposes()I

    move-result v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "invalid block mode, want GCM got "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/security/keystore/KeyGenParameterSpec;->getBlockModes()[Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "invalid key size, want 256 bits got "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/security/keystore/KeyGenParameterSpec;->getKeySize()I

    move-result v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " bits"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "KeyGenParameterSpec was null after build() check"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object v0, Lio/github/cherrywechat/application/MainApplication;->a:Lio/github/cherrywechat/application/MainApplication;

    if-eqz v0, :cond_e

    goto :goto_4

    :cond_e
    sget-object v0, Lgf;->p:Landroid/app/Application;

    if-eqz v0, :cond_f

    goto :goto_4

    :cond_f
    invoke-static {}, Landroid/app/AndroidAppHelper;->currentApplication()Landroid/app/Application;

    move-result-object v0

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    :goto_4
    const-wide v1, -0x1a5fcfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lio/github/cherrywechat/network/model/UpdateItem;->a()LQm;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lio/github/cherrywechat/network/model/ThemeStoreData;->a()LQm;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->a()LQm;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lio/github/cherrywechat/network/model/ThemeSimpleData;->a()LQm;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lio/github/cherrywechat/network/model/SavedMusicList;->a()LQm;

    move-result-object v0

    return-object v0

    :pswitch_6
    const-string v2, "kotlin.Unit"

    move v0, v3

    sget-object v3, LCz;->j:LCz;

    new-array v0, v0, [LCx;

    invoke-static {v2}, Ltz;->T(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_11

    sget-object v1, LCz;->g:LCz;

    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    new-instance v6, LG9;

    invoke-direct {v6, v2}, LG9;-><init>(Ljava/lang/String;)V

    new-instance v1, LEx;

    iget-object v4, v6, LG9;->b:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v0}, LP4;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct/range {v1 .. v6}, LEx;-><init>(Ljava/lang/String;LfG;ILjava/util/List;LG9;)V

    return-object v1

    :cond_10
    const-string v0, "For StructureKind.CLASS please use \'buildClassSerialDescriptor\' instead"

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_11
    const-string v0, "Blank serial names are prohibited"

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_7
    invoke-static {}, Lio/github/cherrywechat/network/model/MusicTrack;->a()LQm;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->a()LQm;

    move-result-object v0

    return-object v0

    :pswitch_9
    sget-object v0, Lom;->b:Lnm;

    return-object v0

    :pswitch_a
    sget-object v0, LGm;->b:LFm;

    return-object v0

    :pswitch_b
    sget-object v0, LCm;->a:Lru;

    return-object v0

    :pswitch_c
    sget-object v0, LEm;->b:LEx;

    return-object v0

    :pswitch_d
    sget-object v0, LHm;->b:LEx;

    return-object v0

    :pswitch_e
    invoke-static {}, Lio/github/cherrywechat/network/model/FriendLinkData;->a()LQm;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lio/github/cherrywechat/network/model/FAQCategory;->a()LQm;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lio/github/cherrywechat/network/model/DeveloperGroups;->a()LQm;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lio/github/cherrywechat/network/model/DeveloperGroups;->b()LQm;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lio/github/cherrywechat/network/model/CustomerData;->a()LQm;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->p()LTC;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->R0()LTC;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lio/github/cherrywechat/network/model/AuthorizedThemeData;->a()LQm;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lio/github/cherrywechat/network/model/AnnouncementsWrapper;->a()LQm;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lio/github/cherrywechat/network/model/AnnouncementItem;->a()LQm;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lio/github/cherrywechat/network/model/AdListData;->a()LQm;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lio/github/cherrywechat/network/model/AboutData;->a()LQm;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lio/github/cherrywechat/network/model/AboutData;->b()LQm;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
