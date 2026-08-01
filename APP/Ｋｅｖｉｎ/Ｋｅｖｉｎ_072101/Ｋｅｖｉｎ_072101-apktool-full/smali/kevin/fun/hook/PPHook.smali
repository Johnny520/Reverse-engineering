.class public Lkevin/fun/hook/PPHook;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkevin/fun/hook/PPHook$ActivateResult;,
        Lkevin/fun/hook/PPHook$VerifyCallback;
    }
.end annotation


# static fields
.field private static final ACTIVATE_URL:Ljava/lang/String;

.field private static final KEY_ACTIVATED:Ljava/lang/String;

.field private static final KEY_ACTIVATED_ACCOUNTS:Ljava/lang/String;

.field private static final KEY_ACTIVATED_CODE:Ljava/lang/String;

.field private static final KEY_ACTIVATED_UID:Ljava/lang/String;

.field private static final KEY_VIP_WELCOME_SHOWN:Ljava/lang/String;

.field private static final TG_GROUP_LINK:Ljava/lang/String;

.field private static final VIP_LIST_URL:Ljava/lang/String;

.field private static loadingDialog:Landroid/app/Dialog;

.field private static final mainHandler:Landroid/os/Handler;

.field private static sCurrentDyNickname:Ljava/lang/String;

.field private static sCurrentDyUid:Ljava/lang/String;

.field private static volatile sVipListLoaded:Z

.field private static volatile sVipUidSet:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v4, 0x0

    const/16 v0, 0x5e3

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/PPHook;->short:[S

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    sget v1, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v1, v1, 0x188

    const/16 v2, 0x344

    invoke-static {v0, v4, v1, v2}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۨۢ۟([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/PPHook;->ACTIVATE_URL:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x37

    sget v2, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v2, v2, -0x337

    const/16 v3, 0x8e8

    invoke-static {v0, v1, v2, v3}, Landroidx/core/ۤۦ۟ۢ;->ۣۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/PPHook;->KEY_ACTIVATED:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x4b

    sget v2, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v2, v2, -0x28

    const/16 v3, 0x1cc

    invoke-static {v0, v1, v2, v3}, Landroidx/startup/ۤۧۥۣ;->۟ۧۦ۠ۦ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/PPHook;->KEY_ACTIVATED_ACCOUNTS:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x5d

    sget v2, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v2, v2, 0x5d

    const/16 v3, 0x46a

    invoke-static {v0, v1, v2, v3}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۦۧۦ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/PPHook;->KEY_ACTIVATED_CODE:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x6c

    sget v2, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v2, v2, 0x17a

    const/16 v3, 0x425

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/PPHook;->KEY_ACTIVATED_UID:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x7a

    sget v2, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v2, v2, 0x282

    const/16 v3, 0xc9d

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/PPHook;->KEY_VIP_WELCOME_SHOWN:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x8b

    sget v2, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v2, v2, 0x394

    const/16 v3, 0x87c

    invoke-static {v0, v1, v2, v3}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/PPHook;->TG_GROUP_LINK:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0xa1

    sget v2, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v2, v2, -0x273

    const/16 v3, 0x7ca

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/PPHook;->VIP_LIST_URL:Ljava/lang/String;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lkevin/fun/hook/PPHook;->sVipUidSet:Ljava/util/Set;

    sput-boolean v4, Lkevin/fun/hook/PPHook;->sVipListLoaded:Z

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/PPHook;->sCurrentDyUid:Ljava/lang/String;

    sput-object v0, Lkevin/fun/hook/PPHook;->sCurrentDyNickname:Ljava/lang/String;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۧۤۡۨ()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lkevin/fun/hook/PPHook;->mainHandler:Landroid/os/Handler;

    const/4 v0, 0x0

    sput-object v0, Lkevin/fun/hook/PPHook;->loadingDialog:Landroid/app/Dialog;

    return-void

    :array_0
    .array-data 2
        0x32cs
        0x330s
        0x330s
        0x334s
        0x337s
        0x37es
        0x36bs
        0x36bs
        0x330s
        0x323s
        0x369s
        0x332s
        0x321s
        0x336s
        0x32ds
        0x322s
        0x33ds
        0x369s
        0x325s
        0x334s
        0x32ds
        0x36as
        0x32fs
        0x321s
        0x332s
        0x32ds
        0x32as
        0x374s
        0x371s
        0x376s
        0x37ds
        0x370s
        0x376s
        0x376s
        0x36as
        0x333s
        0x32bs
        0x336s
        0x32fs
        0x321s
        0x336s
        0x337s
        0x36as
        0x320s
        0x321s
        0x332s
        0x36bs
        0x325s
        0x327s
        0x330s
        0x32ds
        0x332s
        0x325s
        0x330s
        0x321s
        0x889s
        0x88bs
        0x89cs
        0x881s
        0x89es
        0x889s
        0x89cs
        0x881s
        0x887s
        0x886s
        0x8b7s
        0x889s
        0x88bs
        0x89cs
        0x881s
        0x89es
        0x889s
        0x89cs
        0x88ds
        0x88cs
        0x1ads
        0x1afs
        0x1b8s
        0x1a5s
        0x1bas
        0x1ads
        0x1b8s
        0x1a9s
        0x1a8s
        0x193s
        0x1ads
        0x1afs
        0x1afs
        0x1a3s
        0x1b9s
        0x1a2s
        0x1b8s
        0x1bfs
        0x40bs
        0x409s
        0x41es
        0x403s
        0x41cs
        0x40bs
        0x41es
        0x403s
        0x405s
        0x404s
        0x435s
        0x409s
        0x405s
        0x40es
        0x40fs
        0x444s
        0x446s
        0x451s
        0x44cs
        0x453s
        0x444s
        0x451s
        0x44cs
        0x44as
        0x44bs
        0x47as
        0x450s
        0x44cs
        0x441s
        0xcebs
        0xcf4s
        0xceds
        0xcc2s
        0xceas
        0xcf8s
        0xcf1s
        0xcfes
        0xcf2s
        0xcf0s
        0xcf8s
        0xcc2s
        0xcees
        0xcf5s
        0xcf2s
        0xceas
        0xcf3s
        0x814s
        0x808s
        0x808s
        0x80cs
        0x80fs
        0x846s
        0x853s
        0x853s
        0x808s
        0x852s
        0x811s
        0x819s
        0x853s
        0x837s
        0x819s
        0x80as
        0x815s
        0x812s
        0x823s
        0x838s
        0x805s
        0x805s
        0x7a2s
        0x7bes
        0x7bes
        0x7bas
        0x7b9s
        0x7f0s
        0x7e5s
        0x7e5s
        0x7fbs
        0x7fbs
        0x7fbs
        0x7e4s
        0x7a1s
        0x7afs
        0x7bcs
        0x7a3s
        0x7a4s
        0x7fes
        0x7f8s
        0x7e4s
        0x7aes
        0x7bas
        0x7aes
        0x7a4s
        0x7b9s
        0x7e4s
        0x7a5s
        0x7b8s
        0x7ads
        0x7e5s
        0x7bcs
        0x7a3s
        0x7bas
        0x795s
        0x7a6s
        0x7a3s
        0x7b9s
        0x7bes
        0x7e4s
        0x7a0s
        0x7b9s
        0x7a5s
        0x7a4s
        0x6984s
        0x55cfs
        -0x6795s
        -0x76das
        0x6d27s
        0x6fdcs
        0x7ae6s
        0x2c9s
        0x2c9s
        0x2c9s
        -0x61bes
        -0x70f1s
        0x5dffs
        -0x7615s
        0x4f4s
        0x4ees
        0x4ads
        0x4a1s
        0x4a0s
        0x4bas
        0x4abs
        0x4b6s
        0x4bas
        0x4ees
        0x4af4s
        0x4ees
        0x4a0s
        0x4bbs
        0x4a2s
        0x4a2s
        0x25f5s
        0x299s
        -0x76b2s
        0x53f1s
        0x74c2s
        0x5decs
        0x602fs
        -0x6ab6s
        0x6c9as
        0x6370s
        0x66fbs
        0x5980s
        0x6cb9s
        0x6ef8s
        0x7d34s
        0x6926s
        -0x63bds
        -0x796as
        0x5847s
        0x4451s
        0x6bdfs
        0xbbas
        0xbbas
        -0x7fb9s
        0x5af8s
        0x7dcbs
        0x54e5s
        0x6926s
        -0x63bds
        -0xb44s
        0x7a86s
        0x5fbes
        0x5a3ds
        -0x7b95s
        -0x7c04s
        0x6470s
        0x668bs
        0x486s
        0x499s
        0x480s
        0x71f8s
        0x66e7s
        0x559ds
        -0x61a4s
        -0x70efs
        -0x6b36s
        -0x74e9s
        0x4eas
        0x4f0s
        0x485s
        0x499s
        0x494s
        0x4eds
        0x861s
        0x87es
        0x867s
        0x848s
        0x860s
        0x872s
        0x87bs
        0x874s
        0x878s
        0x87as
        0x872s
        0x848s
        0x864s
        0x87fs
        0x878s
        0x860s
        0x879s
        0x779s
        0x77bs
        0x76cs
        0x771s
        0x76es
        0x779s
        0x76cs
        0x771s
        0x777s
        0x776s
        0x747s
        0x779s
        0x77bs
        0x76cs
        0x771s
        0x76es
        0x779s
        0x76cs
        0x77ds
        0x77cs
        0x68es
        0x68cs
        0x69bs
        0x686s
        0x699s
        0x68es
        0x69bs
        0x686s
        0x680s
        0x681s
        0x6b0s
        0x68cs
        0x680s
        0x68bs
        0x68as
        0x75es
        0x75cs
        0x74bs
        0x756s
        0x749s
        0x75es
        0x74bs
        0x756s
        0x750s
        0x751s
        0x760s
        0x74as
        0x756s
        0x75bs
        0x3f2s
        0x3eds
        0x3f4s
        0x3dbs
        0x3f3s
        0x3e1s
        0x3e8s
        0x3e7s
        0x3ebs
        0x3e9s
        0x3e1s
        0x3dbs
        0x3f7s
        0x3ecs
        0x3ebs
        0x3f3s
        0x3eas
        0x599fs
        0x6a68s
        -0x6df7s
        0x6341s
        0x535ds
        0x6bads
        0x6956s
        0x76dbs
        0x646cs
        0x1a3s
        0x1a1s
        0x1b0s
        0x95fs
        0x979s
        0x96fs
        0x978s
        0x927s
        0x94bs
        0x96ds
        0x96fs
        0x964s
        0x97es
        0x390s
        0x3b2s
        0x3a7s
        0x3b4s
        0x3b1s
        0x3b1s
        0x3bcs
        0x3f2s
        0x3e8s
        0x3f3s
        0x3eds
        0x3fds
        0x3f5s
        0x39cs
        0x3b3s
        0x3b9s
        0x3afs
        0x3b2s
        0x3b4s
        0x3b9s
        0x3f4s
        0x3fds
        0x396s
        0x3b8s
        0x3abs
        0x3b4s
        0x3b3s
        0x395s
        0x3b2s
        0x3b2s
        0x3b6s
        0x3f2s
        0x3ecs
        0x3f3s
        0x3eds
        0x1fds
        0x1e1s
        0x1e1s
        0x1e5s
        -0x75bes
        0x6df7s
        0x5884s
        -0x7370s
        -0x147s
        0x7303s
        0x61b4s
        0x79b4s
        0x18fs
        0x195s
        0x4a2s
        0x4a3s
        0x4b1s
        0x4das
        0x4cfs
        0x56ds
        0x56es
        0x57fs
        0x568s
        0x563s
        0x55es
        0x579s
        0x567s
        0x548s
        0x564s
        0x565s
        0x57fs
        0x56es
        0x565s
        0x57fs
        0x5a09s
        0x5b33s
        0x531s
        0x52bs
        0x417s
        0x415s
        0x402s
        0x41fs
        0x400s
        0x417s
        0x402s
        0x413s
        0x412s
        0x429s
        0x417s
        0x415s
        0x415s
        0x419s
        0x403s
        0x418s
        0x402s
        0x405s
        0x659s
        0x931s
        0x92as
        0x933s
        0x933s
        0x1aas
        0x1b1s
        0x1bbs
        0x1bas
        0x1b9s
        0x1b6s
        0x1b1s
        0x1bas
        0x1bbs
        0x3eas
        0x8acs
        0x894s
        0x8dbs
        0x5dc4s
        0x5a9cs
        0x55d3s
        0x6ee3s
        0x5b69s
        -0x794cs
        0x5245s
        0x6bd9s
        -0x93bs
        0x6f4bs
        0x47c4s
        0x5af0s
        -0x677cs
        0x3e7s
        0x3fbs
        0x3fbs
        0x3ffs
        0x3fcs
        0x3b5s
        0x3a0s
        0x3a0s
        0x3bes
        0x3bes
        0x3bes
        0x3a1s
        0x3e4s
        0x3eas
        0x3f9s
        0x3e6s
        0x3e1s
        0x3bbs
        0x3bds
        0x3a1s
        0x3ebs
        0x3ffs
        0x3ebs
        0x3e1s
        0x3fcs
        0x3a1s
        0x3e0s
        0x3fds
        0x3e8s
        0x3a0s
        0x3f9s
        0x3e6s
        0x3ffs
        0x3d0s
        0x3e3s
        0x3e6s
        0x3fcs
        0x3fbs
        0x3a1s
        0x3e5s
        0x3fcs
        0x3e0s
        0x3e1s
        0x5037s
        0x576fs
        0x569as
        -0x74b9s
        0x5d0bs
        -0x76e1s
        -0x4cas
        0x50f7s
        0x5aaes
        0x4a00s
        0x7e40s
        0x55efs
        0x52b7s
        0x5ee0s
        0x5fdas
        0x1d8s
        0x1c2s
        0x2da2s
        0xaces
        -0x7ee7s
        0x5ba6s
        0x7c95s
        0x55bbs
        0x6878s
        -0x62e3s
        0x6b89s
        0x6463s
        0x61e8s
        0x5e93s
        0x6baas
        0x69ebs
        0x7a27s
        0x6e35s
        -0x64b0s
        -0x7e7bs
        0x5f54s
        0x4342s
        0x6cccs
        0xca9s
        0xca9s
        -0x78acs
        0x5debs
        0x7ad8s
        0x53f6s
        0x6e35s
        -0x64b0s
        0x58ads
        0x5d2es
        -0x7c88s
        -0x7b11s
        0x6363s
        0x6198s
        0xca9s
        0x5885s
        0x5ebas
        0x6363s
        0x6198s
        0x74a2s
        0x43b9s
        0x61c9s
        -0x7e66s
        0x5b8bs
        0x6943s
        0x69ebs
        -0x7e7bs
        0x5f54s
        0x42a9s
        -0xc5es
        0x956s
        0x957s
        0x945s
        0x92es
        0x93bs
        0x31bs
        0x317s
        0x31cs
        0x31ds
        0x23es
        0x222s
        0x22fs
        0x64d1s
        0x741es
        -0x691es
        -0x77ecs
        0x2a2s
        0x2bes
        0x2bes
        0x2bas
        0x2b9s
        0x2f0s
        0x2e5s
        0x2e5s
        0x2bes
        0x2ads
        0x2e7s
        0x2bcs
        0x2afs
        0x2b8s
        0x2a3s
        0x2acs
        0x2b3s
        0x2e7s
        0x2abs
        0x2bas
        0x2a3s
        0x2e4s
        0x2a1s
        0x2afs
        0x2bcs
        0x2a3s
        0x2a4s
        0x2fas
        0x2ffs
        0x2f8s
        0x2f3s
        0x2fes
        0x2f8s
        0x2f8s
        0x2e4s
        0x2bds
        0x2a5s
        0x2b8s
        0x2a1s
        0x2afs
        0x2b8s
        0x2b9s
        0x2e4s
        0x2aes
        0x2afs
        0x2bcs
        0x2e5s
        0x2abs
        0x2a9s
        0x2bes
        0x2a3s
        0x2bcs
        0x2abs
        0x2bes
        0x2afs
        0x703s
        0x71cs
        0x700s
        0x707s
        0x3a5s
        0x389s
        0x388s
        0x392s
        0x383s
        0x388s
        0x392s
        0x3cbs
        0x3b2s
        0x39fs
        0x396s
        0x383s
        0xc2fs
        0xc3es
        0xc3es
        0xc22s
        0xc27s
        0xc2ds
        0xc2fs
        0xc3as
        0xc27s
        0xc21s
        0xc20s
        0xc61s
        0xc24s
        0xc3ds
        0xc21s
        0xc20s
        0xc75s
        0xc6es
        0xc2ds
        0xc26s
        0xc2fs
        0xc3cs
        0xc3ds
        0xc2bs
        0xc3as
        0xc73s
        0xc1bs
        0xc1as
        0xc08s
        0xc63s
        0xc76s
        0x71as
        0x738s
        0x738s
        0x73es
        0x72bs
        0x72fs
        0x640s
        0x651s
        0x651s
        0x64ds
        0x648s
        0x642s
        0x640s
        0x655s
        0x648s
        0x64es
        0x64fs
        0x60es
        0x64bs
        0x652s
        0x64es
        0x64fs
        0x5c7s
        0x5ecs
        0x5e5s
        0x5f6s
        0x5f7s
        0x5e1s
        0x5f0s
        0x82as
        0x806s
        0x807s
        0x807s
        0x80cs
        0x80as
        0x81ds
        0x800s
        0x806s
        0x807s
        0x840s
        0x84fs
        0x84cs
        0x850s
        0x846s
        0x320s
        0x306s
        0x310s
        0x307s
        0x358s
        0x334s
        0x312s
        0x310s
        0x31bs
        0x301s
        0xa5as
        0xa78s
        0xa6ds
        0xa7es
        0xa7bs
        0xa7bs
        0xa76s
        0xa38s
        0xa22s
        0xa39s
        0xa27s
        0xa37s
        0xa3fs
        0xa56s
        0xa79s
        0xa73s
        0xa65s
        0xa78s
        0xa7es
        0xa73s
        0xa3es
        0xa37s
        0xa5cs
        0xa72s
        0xa61s
        0xa7es
        0xa79s
        0xa5fs
        0xa78s
        0xa78s
        0xa7cs
        0xa38s
        0xa26s
        0xa39s
        0xa27s
        0xa0ds
        0xa0fs
        0xa18s
        0xa05s
        0xa1as
        0xa0ds
        0xa18s
        0xa09s
        0xa2fs
        0xa03s
        0xa08s
        0xa09s
        0xa4cs
        0xa0ds
        0xa18s
        0xa18s
        0xa09s
        0xa01s
        0xa1cs
        0xa18s
        0xa51s
        0x6a3s
        0x6afs
        0x6fds
        0x6eas
        0x6fcs
        0x6ffs
        0x6e0s
        0x6e1s
        0x6fcs
        0x6eas
        0x6ccs
        0x6e0s
        0x6ebs
        0x6eas
        0x6b2s
        0x928s
        0x924s
        0x976s
        0x961s
        0x977s
        0x974s
        0x939s
        0x45es
        0x45as
        0xa7es
        0xa79s
        0xa6cs
        0xa79s
        0xa78s
        0xa7es
        0x3b1s
        0x3bds
        0x3a7s
        0x3bcs
        0x3a6s
        0x5eas
        0x5fds
        0x5fds
        0x5e0s
        0x5fds
        0x6c02s
        0x59aes
        0x71e0s
        -0x7b25s
        0x5dd1s
        0x7175s
        0x5fc2s
        0x559bs
        -0xbfds
        0xb47s
        0xb5bs
        0xb5bs
        0xb5fs
        0xb32s
        0xb5es
        0xb5cs
        0xb4bs
        0xb56s
        0xb49s
        0xb5es
        0xb4bs
        0xb5as
        0xb7cs
        0xb50s
        0xb5bs
        0xb5as
        0xb1fs
        0x7013s
        0x6016s
        0x5435s
        0x550fs
        0xb0ds
        0xb17s
        0x8fes
        0x8fcs
        0x8ebs
        0x8f6s
        0x8e9s
        0x8fes
        0x8ebs
        0x8fas
        0x8dcs
        0x8f0s
        0x8fbs
        0x8fas
        0x8bfs
        0x5189s
        0x54dds
        0x579ds
        0x56a7s
        0x8a5s
        0x8bfs
        0x66b2s
        -0x7dd1s
        0x524es
        0x53a8s
        0x630es
        -0x6995s
        -0x7342s
        0x526fs
        0x5340s
        0x5e5es
        0x6b39s
        0x7a68s
        0x5346s
        0x6e85s
        -0x6420s
        -0xce1s
        0x6e05s
        0x6b39s
        0x6e03s
        0x5e8cs
        -0x7818s
        0x5fc5s
        0x5e23s
        0x6e85s
        -0x6420s
        0xc33s
        0xc46s
        0xc5as
        0xc57s
        -0xce1s
        0x69f3s
        0x60c6s
        0x63d3s
        0x6128s
        0x3c11s
        0x4e6s
        0x4e2s
        0xbd6s
        0xbdbs
        0xbc5s
        0xbd2s
        0xbd6s
        0xbd3s
        0xbces
        0xb5fs
        0xb5ds
        0xb4as
        0xb57s
        0xb48s
        0xb5fs
        0xb4as
        0xb57s
        0xb51s
        0xb50s
        0xb61s
        0xb5ds
        0xb51s
        0xb5as
        0xb5bs
        0x5919s
        0x5407s
        0x64dcs
        -0x6e47s
        -0x7494s
        0x55bds
        0x5bb8s
        0x7885s
        0x698as
        0x6b71s
        -0x6bas
        0x55a5s
        0x6d29s
        0x5872s
        0x4935s
        0x7362s
        0x6c6bs
        0x511ds
        0x3648s
        0x6d02s
        0x6ff9s
        0x60d2s
        0x505ds
        -0x23ds
        0x2c8s
        0x2c8s
        0x7c13s
        0x5958s
        0x6054s
        -0x6acfs
        0x77eas
        0x60f5s
        -0x228s
        0x603s
        0x595as
        0x5444s
        0x69c9s
        0x6b32s
        0x7e08s
        0x5bfbs
        0x4976s
        0x7321s
        -0x74d1s
        0x55fes
        0x6379s
        -0x6eds
        0xc21s
        0xc3ds
        0x25eds
        0x2c8s
        0x6d28s
        0x6fd3s
        0x60f8s
        0x5077s
        0x69cs
        0x699s
        0x69ds
        0x699s
        0x684s
        0x21b9s
        0x6d5s
        0x6935s
        0x6bces
        0x5fc4s
        -0x7430s
        -0x761fs
        0x6dc4s
        0x6f3fs
        0x7a05s
        0x5ff6s
        -0x7246s
        0x5034s
        0x224s
        0x237s
        0x224s
        0x51f4s
        -0x7646s
        0x5b03s
        0x4c0es
        -0x6bacs
        0x67eds
        0x6516s
        0x511cs
        -0x7af8s
        -0x8dfs
        -0x7c26s
        0x60eds
        0x6fc8s
        0x67eds
        0x6516s
        0x702cs
        0x6e02s
        0x5c0bs
        0x634es
        0x7043s
        0x6755s
        0x65aes
        0x51a4s
        -0x7a50s
        -0x871s
        0x89fs
        0x75b2s
        0x743fs
        -0x6006s
        -0x7ef4s
        0x6568s
        0x6793s
        0x5399s
        -0x7873s
        -0xa4es
        0xaa2s
        0x7885s
        0x7908s
        -0x6d33s
        -0x73c5s
        0x6486s
        0x7b82s
        0x5018s
        -0x723bs
        0x5d81s
        0x782fs
        0x5b89s
        -0x7063s
        0x282s
        0x298s
        0x5944s
        -0x6226s
        0x5a97s
        -0x78b6s
        0x570es
        0x72a0s
        0x5106s
        -0x7aees
        0x80ds
        0x817s
        0x7f2as
        0x5cdes
        0x6c43s
        0x7347s
        0x74aes
        0x6de1s
        0x5544s
        0x70eas
        0x534cs
        -0x78a8s
        0xa47s
        0xa5ds
        -0x2f7as
        -0x2b16s
        0x4b4s
        0x4abs
        0x4b2s
        0x71cas
        0x66d5s
        0x62d8s
        -0x79ccs
        -0x90as
        0x55f0s
        -0x7b31s
        0x7f7es
        0x9das
        0x542s
        -0x22a2s
        -0x2515s
        0x242bs
        0x323s
        0x63abs
        0x5ef1s
        -0x7f4cs
        0x5c94s
        0x355s
        0x34as
        0x353s
        0x717as
        0x6440s
        -0x3f1s
        0x6143s
        0x640as
        0x519cs
        -0x7c02s
        0x5ef1s
        -0x7520s
        -0x69fes
        0x323s
        0x242bs
        0x531as
        0x55d1s
        0x4365s
        0x7932s
        0x6325s
        0x7c21s
        0x54ds
        0x552s
        0x54bs
        0x6e39s
        -0x752bs
        0x5a22s
        0x7f8cs
        0x5c2as
        -0x77c2s
        0x521s
        0x53bs
        0x3f7s
        0x3e8s
        0x3f1s
        0x3des
        0x3f6s
        0x3e4s
        0x3eds
        0x3e2s
        0x3ees
        0x3ecs
        0x3e4s
        0x3des
        0x3f2s
        0x3e9s
        0x3ees
        0x3f6s
        0x3efs
        0x2eds
        0x2f2s
        0x2ebs
        0x2c4s
        0x2ecs
        0x2fes
        0x2f7s
        0x2f8s
        0x2f4s
        0x2f6s
        0x2fes
        0x2c4s
        0x2e8s
        0x2f3s
        0x2f4s
        0x2ecs
        0x2f5s
        -0x20c8s
        -0x25ebs
        0x725s
        -0x776as
        0x5660s
        0x68c5s
        0x6a3es
        0x7f04s
        0x609s
        0x20a3s
        -0x7f4s
        0x623s
        -0x720cs
        0x7e6ds
        -0x7259s
        0x602cs
        0x5950s
        0x544es
        0x7078s
        0x5956s
        -0x74dbs
        0x55f4s
        -0x6f1s
        0x69c3s
        0x6b38s
        0x7e02s
        0x5a05s
        0x78d2s
        0x5d99s
        0x6d67s
        -0x74dbs
        0x55f4s
        -0x6fes
        0x772cs
        0x5267s
        0x7cd5s
        0x6bcas
        -0x919s
        0x7623s
        0x5368s
        0x8a7s
        0x8bbs
        0x8b6s
        -0x818s
        0x2ab6s
        -0xde7s
        0xc36s
        0x6b3cs
        0x64d6s
        0x615ds
        0x5e26s
        0x7a6ds
        0x5343s
        0x7ea0s
        0x6c17s
        0xc1cs
        -0x781fs
        0x5d5es
        0x7a6ds
        0x5343s
        0x6e80s
        -0x641bs
        0x5d9bs
        0x63d6s
        0x612ds
        -0xce6s
        0x5830s
        0x5e0fs
        0x63d6s
        0x612ds
        0x7417s
        0x5010s
        0x617cs
        -0x7ed1s
        -0xce9s
        0x54a1s
        0x5764s
        0x655s
        0x646s
        -0x6170s
        -0x69aes
        -0x759ds
        -0x71f9s
        0x50f1s
        0x6e54s
        0x6cafs
        0x7995s
        0x5751s
        0x690fs
        0x6504s
        0x67ffs
        0x6f9cs
        0x7098s
        0x6662s
        0x6499s
        0x569bs
        0x7335s
        0x5093s
        -0x7b79s
        0x998s
        0x982s
        0x63a3s
        0x7ca7s
        0x6a5ds
        0x68a6s
        0x5aa4s
        0x7f0as
        0x5cacs
        -0x7748s
        0xb82s
        0xb8ds
        0xb87s
        0xb91s
        0xb8cs
        0xb8as
        0xb87s
        0xbcds
        0xb8as
        0xb8ds
        0xb97s
        0xb86s
        0xb8ds
        0xb97s
        0xbcds
        0xb82s
        0xb80s
        0xb97s
        0xb8as
        0xb8cs
        0xb8ds
        0xbcds
        0xbb5s
        0xbaas
        0xba6s
        0xbb4s
        0x9d4s
        0x9c8s
        0x9c8s
        0x9ccs
        0x9cfs
        0x986s
        0x993s
        0x993s
        0x9c8s
        0x992s
        0x9d1s
        0x9d9s
        0x993s
        0x9f7s
        0x9d9s
        0x9cas
        0x9d5s
        0x9d2s
        0x9e3s
        0x9f8s
        0x9c5s
        0x9c5s
        0x6368s
        0x6a5ds
        0x64dbs
        0x5988s
        0x6dcs
        0x6cfs
        0x792cs
        -0x6d8as
        0x652ds
        -0x67cs
        -0x7281s
        0x64c3s
        0x5420s
        0x5428s
        0x57eds
        0x6f28s
        0x538es
        0x6a12s
        0x67c2s
        0x6539s
        -0x8f2s
        0x6223s
        0x5f55s
        0x5404s
        0x6de2s
        0x64d7s
        0x477ds
        0x7d2as
        0x3800s
        0x68bes
        0x6a45s
        0x54a8s
        0x6af6s
        -0x75b9s
        -0x71dds
        0x50d5s
        0x6e70s
        0x6c8bs
        0x79b1s
        0xc2es
        0xc35s
        0xc2cs
        0xc2cs
        0x3e5s
        0x3fes
        0x3f4s
        0x3f5s
        0x3f6s
        0x3f9s
        0x3fes
        0x3f5s
        0x3f4s
        0x685s
        0x684s
        0x696s
        0x6fds
        0x6e8s
        0x38es
        0x38cs
        0x39bs
        0x386s
        0x399s
        0x38es
        0x39bs
        0x38as
        0x38bs
        0x3b0s
        0x38es
        0x38cs
        0x38cs
        0x380s
        0x39as
        0x381s
        0x39bs
        0x39cs
        0x419s
        0xac1s
        0xac3s
        0xad4s
        0xac9s
        0xad6s
        0xac1s
        0xad4s
        0xac9s
        0xacfs
        0xaces
        0xaffs
        0xad5s
        0xac9s
        0xac4s
        0x505s
        0x507s
        0x510s
        0x50ds
        0x512s
        0x505s
        0x510s
        0x50ds
        0x50bs
        0x50as
        0x53bs
        0x505s
        0x507s
        0x510s
        0x50ds
        0x512s
        0x505s
        0x510s
        0x501s
        0x500s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "fUHFUlOgB0ljowJn14Aqk"

    invoke-static {v0}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣ۟ۢۥ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method private static activateCode(Landroid/content/Context;Ljava/lang/String;Lkevin/fun/hook/PPHook$VerifyCallback;)V
    .locals 4

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤۡۨ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook;->ۦۤ۠ۧ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۦۨ۟ۦ()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda2;

    invoke-direct {v1, p0, p2}, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda2;-><init>(Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;)V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    :goto_1
    :sswitch_3
    return-void

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0xcc

    sget v2, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/lit16 v2, v2, -0x1ee

    const/16 v3, 0x2e7

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/PPHook;->۟ۧۦ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda3;

    invoke-direct {v1, p0, p2, p1}, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda3;-><init>(Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۥۦۤۡ(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۨ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_5
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_6
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_7
    const-string v0, "fnKZ4ONEG5nVjwpmBUiN1oI000"

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۣ۟ۧۢۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_6
        0x1d7 -> :sswitch_3
        0x1f4 -> :sswitch_7
    .end sparse-switch
.end method

.method public static checkVerification(Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;)V
    .locals 7

    const/4 v6, 0x0

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez p0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0xd6

    sget v2, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v2, v2, 0x30b

    const/16 v3, 0x4ce

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook;->ۥ۠۟(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۥۦۢ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const-string v0, "46NlMBIL9xMkWRCt"

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۣ۠ۧ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_2
    :sswitch_6
    return-void

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤۡۨ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook;->ۦۤ۠ۧ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    if-eqz v1, :cond_2

    const v0, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbe41

    goto :goto_3

    :sswitch_a
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0xea

    sget v2, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v2, v2, 0x157

    const/16 v3, 0x2b9

    invoke-static {v0, v1, v2, v3}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const/16 v2, 0xf2

    sget v3, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v3, v3, 0x3a4

    const/16 v4, 0xbb0

    invoke-static {v1, v2, v3, v4}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1, v6, p1}, Lkevin/fun/hook/PPHook;->ۥ۠۟ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)V

    goto :goto_2

    :sswitch_b
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤۡۨ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢ۠ۥ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xbe7f

    :goto_4
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_c
    const v0, 0xbebd

    goto :goto_4

    :sswitch_d
    if-eqz v1, :cond_3

    const v0, 0xbedc

    goto :goto_4

    :sswitch_e
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤۡۨ()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v2

    const/16 v3, 0x10f

    sget v4, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v4, v4, -0x3d4

    const/16 v5, 0x4d0

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook;->ۥ۠۟(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤۡۨ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook;->۟ۡۢۤۧ(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x11f

    sget v2, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v2, v2, 0xd2

    const/16 v3, 0x817

    invoke-static {v0, v1, v2, v3}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v1

    const v0, 0xbefb

    :goto_5
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_4
    :sswitch_f
    const v0, 0xbf39

    goto :goto_5

    :sswitch_10
    if-nez v1, :cond_4

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_11
    invoke-static {p0, p1}, Lkevin/fun/hook/PPHook;->۟ۡۡۤۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xc202

    :goto_6
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_12
    const v0, 0xc221

    goto :goto_6

    :sswitch_13
    const v0, 0xc27e

    :goto_7
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :cond_5
    :sswitch_14
    const v0, 0xc2bc

    goto :goto_7

    :sswitch_15
    if-eqz p1, :cond_5

    const v0, 0xc2db

    goto :goto_7

    :sswitch_16
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۦۨ۟ۦ()Landroid/os/Handler;

    move-result-object v0

    invoke-static {p1}, Landroidx/emoji2/ۢۧۡۧ;->۟ۤۤۨۢ(Ljava/lang/Object;)Ljava/lang/Class;

    new-instance v1, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda1;

    invoke-direct {v1, p1}, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda1;-><init>(Lkevin/fun/hook/PPHook$VerifyCallback;)V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto/16 :goto_2

    :sswitch_17
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤۡۨ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook;->۟ۥۨۥۤ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc2fa

    :goto_8
    const v2, 0xc30b

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_18
    if-eqz v1, :cond_6

    const v0, 0xc5e2

    goto :goto_8

    :cond_6
    :sswitch_19
    const v0, 0xc5c3

    goto :goto_8

    :sswitch_1a
    const v0, 0xc601

    :goto_9
    const v1, 0xc612

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_8

    goto :goto_9

    :sswitch_1b
    if-eqz p1, :cond_7

    const v0, 0xc65e

    goto :goto_9

    :cond_7
    :sswitch_1c
    const v0, 0xc63f

    goto :goto_9

    :sswitch_1d
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۦۨ۟ۦ()Landroid/os/Handler;

    move-result-object v0

    invoke-static {p1}, Landroidx/emoji2/ۢۧۡۧ;->۟ۤۤۨۢ(Ljava/lang/Object;)Ljava/lang/Class;

    new-instance v1, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda1;

    invoke-direct {v1, p1}, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda1;-><init>(Lkevin/fun/hook/PPHook$VerifyCallback;)V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto/16 :goto_2

    :sswitch_1e
    invoke-static {p0, p1}, Lkevin/fun/hook/PPHook;->۟ۦۥ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_c
        0x2d -> :sswitch_17
        0x4c -> :sswitch_e
        0xef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_f
        0x35 -> :sswitch_13
        0x1f7 -> :sswitch_10
        0x7eef -> :sswitch_11
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_12
        0x32 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_14
        0x33 -> :sswitch_6
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_18
        0x6af -> :sswitch_19
        0x6c8 -> :sswitch_1e
        0x6e9 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1b
        0x2d -> :sswitch_6
        0x32 -> :sswitch_1c
        0x4c -> :sswitch_1d
    .end sparse-switch
.end method

.method public static clearVerification()V
    .locals 9

    const/4 v1, 0x0

    const/4 v7, 0x0

    const-string v5, "\u06e4\u06e3\u06df"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move v6, v7

    move v8, v7

    :goto_0
    invoke-static {v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v2}, Lkevin/fun/hook/PPHook;->ۥ۠۟(Ljava/lang/Object;)V

    const-string v1, "\u06e5\u06e1\u06e6"

    move-object v5, v1

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const-string v5, "\u06e8\u06df\u06e2"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    sput-boolean v7, Lkevin/fun/hook/PPHook;->sVipListLoaded:Z

    const-string v1, "\u06e2\u06e7\u06e4"

    move-object v5, v1

    goto :goto_0

    :sswitch_2
    const/16 v1, 0x153

    const/16 v3, 0x73f

    invoke-static {v4, v1, v6, v3}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e8\u06e6\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const-string v5, "\u06e8\u06e7\u06e5"

    move-object v4, v1

    goto :goto_0

    :sswitch_4
    sget v8, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    const-string v1, "\u06e4\u06e1\u06e6"

    move-object v5, v1

    goto :goto_0

    :sswitch_5
    const/16 v1, 0x144

    const/16 v3, 0x6ef

    invoke-static {v4, v1, v6, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e7\u06e5\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_6
    sget v8, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    const-string v1, "\u06df\u06e3\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_7
    xor-int/lit8 v6, v8, -0x6b

    const-string v1, "\u06e5\u06df\u06e5"

    move-object v5, v1

    goto :goto_0

    :sswitch_8
    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e4\u06e0\u06e5"

    move-object v2, v1

    goto :goto_0

    :sswitch_9
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const-string v5, "\u06e5\u06df\u06e3"

    move-object v4, v1

    goto :goto_0

    :sswitch_a
    xor-int/lit16 v6, v8, 0x11d

    const-string v1, "\u06e1\u06e6"

    move-object v5, v1

    goto :goto_0

    :sswitch_b
    sget v8, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    const-string v1, "\u06e5\u06df\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_c
    xor-int/lit16 v6, v8, 0x29a

    const-string v1, "\u06e3\u06e7\u06e3"

    move-object v5, v1

    goto :goto_0

    :sswitch_d
    invoke-static {v3, v7}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۥۥۥۤ(Ljava/lang/Object;Z)V

    const-string v1, "\u06e0\u06e6\u06df"

    move-object v5, v1

    goto :goto_0

    :sswitch_e
    invoke-static {v0}, Landroidx/core/ktx/۟۟ۡۢ۠;->۠ۧ۟(Ljava/lang/Object;)V

    const-string v1, "\u06e1\u06e8\u06e4"

    move-object v5, v1

    goto :goto_0

    :sswitch_f
    xor-int/lit16 v6, v8, -0x107

    const-string v1, "\u06e0\u06e6\u06e5"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_10
    const/16 v1, 0x161

    const/16 v3, 0x384

    invoke-static {v4, v1, v6, v3}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e2\u06e5\u06df"

    move-object v3, v1

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۣۢۧۤ()Ljava/util/Set;

    move-result-object v0

    const-string v1, "\u06e8\u06e7\u06e3"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_12
    const/16 v1, 0x172

    const/16 v2, 0x46d

    invoke-static {v4, v1, v6, v2}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e0\u06e8\u06e0"

    move-object v2, v1

    goto/16 :goto_0

    :sswitch_13
    invoke-static {v3, v7}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۥۥۥۤ(Ljava/lang/Object;Z)V

    const-string v1, "\u06e4\u06e8\u06e2"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_14
    xor-int/lit16 v6, v8, 0x396

    const-string v1, "\u06e6\u06e8\u06e3"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_15
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const-string v5, "\u06e2\u06e0\u06e4"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_16
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const-string v5, "\u06e0\u06e6\u06e6"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_17
    invoke-static {v3, v2}, Landroidx/core/ۧ۟ۤۨ;->ۨۢۢۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e8\u06e2\u06e2"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_18
    invoke-static {v3, v2}, Landroidx/core/ۧ۟ۤۨ;->ۨۢۢۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e7\u06e4\u06e7"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_19
    sget v8, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    const-string v1, "\u06e0\u06e7\u06e1"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_1a
    const/16 v1, 0x130

    const/16 v3, 0x718

    invoke-static {v4, v1, v6, v3}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e5\u06e7\u06e6"

    move-object v3, v1

    goto/16 :goto_0

    :sswitch_1b
    sget v8, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    const-string v1, "\u06e3\u06e3\u06e0"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_1c
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc25 -> :sswitch_10
        0x1aa77d -> :sswitch_14
        0x1aab99 -> :sswitch_0
        0x1aab9f -> :sswitch_2
        0x1aaba0 -> :sswitch_19
        0x1aabba -> :sswitch_f
        0x1aaf9d -> :sswitch_3
        0x1ab266 -> :sswitch_1b
        0x1ab2fc -> :sswitch_13
        0x1ab33f -> :sswitch_11
        0x1ab680 -> :sswitch_a
        0x1ab6ff -> :sswitch_12
        0x1ab9e9 -> :sswitch_17
        0x1aba09 -> :sswitch_7
        0x1aba40 -> :sswitch_9
        0x1abade -> :sswitch_1
        0x1abd87 -> :sswitch_c
        0x1abd89 -> :sswitch_6
        0x1abd8b -> :sswitch_5
        0x1abdca -> :sswitch_1c
        0x1abe84 -> :sswitch_d
        0x1ac261 -> :sswitch_1a
        0x1ac5aa -> :sswitch_15
        0x1ac5c9 -> :sswitch_8
        0x1ac8cb -> :sswitch_4
        0x1ac928 -> :sswitch_16
        0x1ac9a2 -> :sswitch_18
        0x1ac9c4 -> :sswitch_e
        0x1ac9c6 -> :sswitch_b
    .end sparse-switch
.end method

.method private static createRoundBg(IF)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    const/4 v0, 0x0

    const-string v1, "\u06e1\u06e2\u06df"

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v0, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    const-string v1, "\u06e3\u06df\u06df"

    goto :goto_0

    :sswitch_0
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-string v1, "\u06e1\u06df\u06e8"

    goto :goto_0

    :sswitch_1
    invoke-static {v0, p1}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    const-string v1, "\u06e0\u06e4\u06e4"

    goto :goto_0

    :sswitch_2
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aab60 -> :sswitch_2
        0x1aaede -> :sswitch_0
        0x1ab603 -> :sswitch_1
    .end sparse-switch
.end method

.method private static dismissLoadingDialog()V
    .locals 3

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۦۨ۟ۦ()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۥۢۧۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "VhYKf"

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۤۡۥۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method private static dp(Landroid/content/Context;F)I
    .locals 2

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez p0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/high16 v0, 0x40400000    # 3.0f

    mul-float/2addr v0, p1

    float-to-int v0, v0

    :goto_1
    return v0

    :sswitch_3
    invoke-static {p0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۨ۟ۨ(Ljava/lang/Object;)Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟۟ۤۦۤ(Ljava/lang/Object;)Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦۡۧ(Ljava/lang/Object;)F

    move-result v0

    mul-float/2addr v0, p1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method private static fetchUrlContent(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    const/4 v1, 0x0

    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۡۨۢ(Ljava/lang/Object;)Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    sget v2, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v2, v2, 0x111b

    invoke-static {v0, v2}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۧ۟ۦۥ(Ljava/lang/Object;I)V

    invoke-static {v0, v2}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣ۟۟ۦ(Ljava/lang/Object;I)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v2

    const/16 v3, 0x17b

    sget v4, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v4, v4, 0x10

    const/16 v5, 0x1e4

    invoke-static {v2, v3, v4, v5}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟۟ۤۢۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۤ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v2

    const/16 v3, 0x17e

    sget v4, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v4, v4, -0x161

    const/16 v5, 0x90a

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v3

    const/16 v4, 0x188

    sget v5, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v5, v5, -0x1c9

    const/16 v6, 0x3dd

    invoke-static {v3, v4, v5, v6}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Landroidx/activity/ۤۧۧۧ;->ۣ۠ۧۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Landroidx/loader/ۣ۟۟ۧ۠;->۟ۤ(Ljava/lang/Object;)I

    move-result v3

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    const/16 v2, 0xc8

    if-eq v3, v2, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v4

    const/16 v5, 0x1ab

    sget v6, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v6, v6, -0x75

    const/16 v7, 0x1b5

    invoke-static {v4, v5, v6, v7}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v3}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/PPHook;->ۥ۠۟(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v0, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    :try_start_2
    invoke-static {v0}, Landroidx/emoji2/ۢۧۡۧ;->ۢۤۤۡ(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :catchall_0
    move-exception v0

    :sswitch_7
    move-object v0, v1

    :goto_3
    return-object v0

    :sswitch_8
    :try_start_3
    invoke-static {v0}, Landroidx/customview/ۤۡۥ;->۠ۢ۠۟(Ljava/lang/Object;)Ljava/io/InputStream;

    move-result-object v3

    new-instance v4, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v5

    const/16 v6, 0x1b9

    sget v7, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v7, v7, -0x31

    const/16 v8, 0x4f7

    invoke-static {v5, v6, v7, v8}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v3, v5}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v4, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    :sswitch_9
    invoke-static {v4}, Landroidx/loader/ۥۧۨۤ;->ۦۥۢ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const v2, 0xbe7f

    :goto_4
    const v7, 0xbe90

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_3

    goto :goto_4

    :cond_2
    :sswitch_a
    const v2, 0xbebd

    goto :goto_4

    :sswitch_b
    if-nez v6, :cond_2

    const v2, 0xbedc

    goto :goto_4

    :sswitch_c
    invoke-static {v4}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۨ۠ۦ۟(Ljava/lang/Object;)V

    invoke-static {v3}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۦۣۦۣ(Ljava/lang/Object;)V

    invoke-static {v5}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    move-result-object v1

    const v2, 0xbefb

    :goto_5
    const v3, 0xbf0c

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_d
    const v2, 0xbf39

    goto :goto_5

    :sswitch_e
    if-eqz v0, :cond_3

    const v2, 0xc1e3

    goto :goto_5

    :sswitch_f
    :try_start_4
    invoke-static {v0}, Landroidx/emoji2/ۢۧۡۧ;->ۢۤۤۡ(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    const v0, 0xc202

    :goto_6
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_10
    const v0, 0xc221

    goto :goto_6

    :catchall_1
    move-exception v0

    :sswitch_11
    move-object v0, v1

    goto :goto_3

    :sswitch_12
    :try_start_5
    invoke-static {v5, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    const v2, 0xc27e

    :goto_7
    const v6, 0xc28f

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_6

    goto :goto_7

    :sswitch_13
    const v2, 0xc29d

    goto :goto_7

    :catchall_2
    move-exception v0

    move-object v2, v0

    move-object v3, v1

    :goto_8
    const v0, 0xc2fa

    :goto_9
    const v1, 0xc30b

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_7

    goto :goto_9

    :sswitch_14
    const v0, 0xc5a4

    goto :goto_9

    :catch_0
    move-exception v0

    move-object v2, v0

    move-object v3, v1

    :goto_a
    :try_start_6
    invoke-static {v2}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v4

    const/16 v5, 0x1be

    sget v6, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v6, v6, -0x100

    const/16 v7, 0x50b

    invoke-static {v4, v5, v6, v7}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook;->ۥ۠۟(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    const v0, 0xc601

    :goto_b
    const v2, 0xc612

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_8

    goto :goto_b

    :sswitch_15
    if-eqz v3, :cond_4

    const v0, 0xc65e

    goto :goto_b

    :cond_4
    :sswitch_16
    const v0, 0xc63f

    goto :goto_b

    :sswitch_17
    :try_start_7
    invoke-static {v3}, Landroidx/emoji2/ۢۧۡۧ;->ۢۤۤۡ(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    const v0, 0xc67d

    :goto_c
    const v2, 0xc68e

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_9

    goto :goto_c

    :goto_d
    :sswitch_18
    move-object v0, v1

    goto/16 :goto_3

    :sswitch_19
    const v0, 0xc69c

    goto :goto_c

    :sswitch_1a
    const v0, 0xc984

    :goto_e
    const v1, 0xc995

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_a

    goto :goto_e

    :sswitch_1b
    if-eqz v3, :cond_5

    const v0, 0xc9e1

    goto :goto_e

    :cond_5
    :sswitch_1c
    const v0, 0xc9c2

    goto :goto_e

    :sswitch_1d
    :try_start_8
    invoke-static {v3}, Landroidx/emoji2/ۢۧۡۧ;->ۢۤۤۡ(Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    const v0, 0xca00

    :goto_f
    const v1, 0xca11

    xor-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_f

    :goto_10
    :pswitch_1
    :sswitch_1e
    throw v2

    :pswitch_2
    const v0, 0xca1f

    goto :goto_f

    :catchall_3
    move-exception v0

    goto :goto_d

    :catchall_4
    move-exception v0

    goto :goto_10

    :catch_1
    move-exception v2

    move-object v3, v0

    goto :goto_a

    :catchall_5
    move-exception v1

    move-object v2, v1

    move-object v3, v0

    goto/16 :goto_8

    :catchall_6
    move-exception v0

    move-object v2, v0

    goto/16 :goto_8

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0x2d -> :sswitch_12
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_11
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_9
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_14
        0x6af -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_15
        0x2d -> :sswitch_18
        0x32 -> :sswitch_16
        0x4c -> :sswitch_17
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_18
        0xf3 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1b
        0x36 -> :sswitch_1c
        0x57 -> :sswitch_1e
        0x74 -> :sswitch_1d
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method private static isAccountActivated(Ljava/lang/String;)Z
    .locals 7

    const/4 v2, 0x1

    const/4 v1, 0x0

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v3, 0x1d1

    sget v4, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v4, v4, 0x23c

    const/16 v5, 0x476

    invoke-static {v0, v3, v4, v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v4

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v4, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v4, 0x1e3

    const/16 v5, 0x675

    invoke-static {v0, v4, v2, v5}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۢۦۣۨ(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/String;

    move-result-object v4

    array-length v5, v4

    move v0, v1

    :sswitch_3
    const/16 v3, 0x6cc

    :goto_1
    xor-int/lit16 v3, v3, 0x6dd

    sparse-switch v3, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-lt v0, v5, :cond_1

    const/16 v3, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v3, 0x70a

    goto :goto_1

    :sswitch_6
    aget-object v3, v4, v0

    invoke-static {v3, p0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const/16 v3, 0x748

    :goto_2
    xor-int/lit16 v3, v3, 0x759

    sparse-switch v3, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    if-eqz v6, :cond_2

    const v3, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_8
    const v3, 0xbe41

    goto :goto_2

    :sswitch_9
    move v1, v2

    :sswitch_a
    return v1

    :sswitch_b
    sget v3, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v3, v3, -0x3c8

    add-int/2addr v0, v3

    const v3, 0xbe7f

    :goto_3
    const v6, 0xbe90

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_3

    goto :goto_3

    :sswitch_c
    const v3, 0xbe9e

    goto :goto_3

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_a
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_a
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_3
        0xef -> :sswitch_c
    .end sparse-switch
.end method

.method private static isInvalidUid(Ljava/lang/String;)Z
    .locals 6

    const/4 v0, 0x1

    invoke-static {p0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v2, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/documentfile/ۡۢ۟ۥ;->۠۠ۦۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroidx/emoji2/ۢۧۡۧ;->ۤۥۨۢ(Ljava/lang/Object;)I

    move-result v3

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v3, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const/16 v3, 0x1e4

    sget v4, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v4, v4, 0x17

    const/16 v5, 0x95f

    invoke-static {v1, v3, v4, v5}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۨۢ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Landroidx/loader/ۥۧۨۤ;->ۦ۟ۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v3, :cond_2

    const v1, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v1, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const/16 v3, 0x1e8

    sget v4, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v4, v4, -0x1e3

    const/16 v5, 0x1df

    invoke-static {v1, v3, v4, v5}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Landroidx/loader/ۥۧۨۤ;->ۦ۟ۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v1, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_9
    const v1, 0xbebd

    goto :goto_3

    :sswitch_a
    if-eqz v3, :cond_3

    const v1, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const/16 v3, 0x1f1

    const/16 v4, 0x3da

    invoke-static {v1, v3, v0, v4}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v1, 0xbefb

    :goto_4
    const v4, 0xbf0c

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :cond_4
    :sswitch_c
    const v1, 0xbf39

    goto :goto_4

    :sswitch_d
    if-eqz v3, :cond_4

    const v1, 0xc1e3

    goto :goto_4

    :sswitch_e
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const/16 v3, 0x1f2

    sget v4, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v4, v4, 0x290

    const/16 v5, 0x8f0

    invoke-static {v1, v3, v4, v5}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣ۟ۢ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xc202

    :goto_5
    const v3, 0xc213

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_5

    goto :goto_5

    :sswitch_f
    if-nez v2, :cond_5

    const v1, 0xc25f

    goto :goto_5

    :cond_5
    :sswitch_10
    const v1, 0xc240

    goto :goto_5

    :sswitch_11
    const/4 v0, 0x0

    :sswitch_12
    return v0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_12
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_8
        0xb939 -> :sswitch_12
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_b
        0x4c -> :sswitch_12
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_e
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_12
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_12
        0x53 -> :sswitch_11
    .end sparse-switch
.end method

.method public static isVipUid(Ljava/lang/String;)Z
    .locals 5

    const/4 v0, 0x0

    invoke-static {p0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v2, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/documentfile/ۡۢ۟ۥ;->۠۠ۦۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/PPHook;->۟۠۟ۦ۟()Z

    move-result v3

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v3, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۣۢۧۤ()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0, v2}, Landroidx/customview/ۤۡۥ;->۟ۤ۟ۤۢ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    :goto_2
    :sswitch_6
    return v0

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const/16 v2, 0x1f5

    sget v3, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v3, v3, 0x152

    const/16 v4, 0x9c9

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/PPHook;->ۥ۠۟(Ljava/lang/Object;)V

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_6
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method static synthetic lambda$0(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۨۡ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->۠۠ۥۣ(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$1()V
    .locals 8

    const/4 v2, 0x0

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x202

    sget v3, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v3, v3, -0x4f

    const/16 v4, 0x38f

    invoke-static {v0, v1, v3, v4}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook;->۟ۡۧ۠ۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v3

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v3, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    move v1, v2

    :sswitch_3
    invoke-static {v3}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۥۤۦۣ(Ljava/lang/Object;)I

    move-result v5

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-lt v1, v5, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    sput-object v4, Lkevin/fun/hook/PPHook;->sVipUidSet:Ljava/util/Set;

    const/4 v0, 0x1

    sput-boolean v0, Lkevin/fun/hook/PPHook;->sVipListLoaded:Z

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    const v0, 0xbe22

    goto :goto_2

    :sswitch_8
    invoke-static {v3, v1}, Landroidx/appcompat/ۣۧۤۢ;->۟ۡۤۤۧ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v6

    const v0, 0xbe7f

    :goto_3
    const v7, 0xbe90

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-nez v6, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static {v5}, Landroidx/documentfile/ۡۢ۟ۥ;->۠۠ۦۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۤۢۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    :sswitch_c
    sget v0, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v0, v0, -0x35

    add-int/2addr v1, v0

    const v0, 0xbefb

    :goto_4
    const v5, 0xbf0c

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :sswitch_d
    const v0, 0xbf1a

    goto :goto_4

    :sswitch_e
    const/4 v0, 0x0

    sput-boolean v0, Lkevin/fun/hook/PPHook;->sVipListLoaded:Z

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x22d

    sget v3, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v3, v3, 0x205

    const/16 v4, 0x43a

    invoke-static {v0, v1, v3, v4}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook;->ۥ۠۟(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const v0, 0xc202

    :goto_5
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_f
    const v0, 0xc221

    goto :goto_5

    :catch_0
    move-exception v0

    sput-boolean v2, Lkevin/fun/hook/PPHook;->sVipListLoaded:Z

    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v2

    const/16 v3, 0x238

    sget v4, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v4, v4, -0x3c6

    const/16 v5, 0x1e2

    invoke-static {v2, v3, v4, v5}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook;->ۥ۠۟(Ljava/lang/Object;)V

    :sswitch_10
    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

    move-result v1

    const v0, 0xc27e

    :goto_6
    const v2, 0xc28f

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :cond_3
    :sswitch_11
    const v0, 0xc2bc

    goto :goto_6

    :sswitch_12
    if-gtz v1, :cond_3

    const v0, 0xc2db

    goto :goto_6

    :sswitch_13
    const-string v0, "C1ov"

    invoke-static {v0}, Landroidx/core/ۧ۟ۤۨ;->ۡۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

    :sswitch_14
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_8
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb97b -> :sswitch_10
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_c
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_3
        0x1f7 -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_11
        0x33 -> :sswitch_14
        0x54 -> :sswitch_13
        0xf1 -> :sswitch_12
    .end sparse-switch
.end method

.method static synthetic lambda$10(Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;)V
    .locals 8

    const/4 v1, 0x0

    const/4 v6, 0x0

    const-string v4, "\u06e1\u06e7\u06e4"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move v5, v6

    move v7, v6

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0, v0, v2, v6, p1}, Lkevin/fun/hook/PPHook;->ۥ۠۟ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)V

    const-string v1, "\u06e0\u06e0\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    xor-int/lit16 v7, v5, 0x38b

    const-string v1, "\u06e3\u06e5\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    const-string v1, "\u06e5\u06e8\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    const/16 v1, 0x246

    const/16 v2, 0xca3

    invoke-static {v3, v1, v7, v2}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v4, "\u06e2\u06e3"

    move-object v2, v1

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const-string v4, "\u06e1\u06df\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    const/16 v0, 0x23e

    const/16 v1, 0xaee

    invoke-static {v3, v0, v7, v1}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e3\u06df\u06e3"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    sget v5, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    const-string v1, "\u06e4\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_6
    const-string v1, "\u06e5\u06e1\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_7
    const-string v1, "\u06e1\u06e2\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_8
    xor-int/lit16 v7, v5, 0x17c

    const-string v1, "\u06e0\u06e3\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_9
    const-string v1, "\u06e0\u06e0\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_a
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const-string v4, "\u06e1\u06df\u06e8"

    move-object v3, v1

    goto :goto_0

    :sswitch_b
    sget v5, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    const-string v1, "\u06e2\u06e0\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_c
    const-string v1, "\u06e1\u06e7\u06e2"

    move-object v4, v1

    goto :goto_0

    :sswitch_d
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc83 -> :sswitch_0
        0x1aaae7 -> :sswitch_d
        0x1aaae8 -> :sswitch_6
        0x1aab3d -> :sswitch_4
        0x1aae84 -> :sswitch_b
        0x1aae8a -> :sswitch_5
        0x1aaee5 -> :sswitch_c
        0x1aaf7c -> :sswitch_3
        0x1aaf7e -> :sswitch_1
        0x1ab269 -> :sswitch_8
        0x1ab607 -> :sswitch_a
        0x1ab6be -> :sswitch_2
        0x1abdc8 -> :sswitch_7
        0x1abea1 -> :sswitch_9
    .end sparse-switch
.end method

.method static synthetic lambda$11(Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;Ljava/lang/String;)V
    .locals 16

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v11

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v2

    const/16 v3, 0x271

    sget v4, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v4, v4, 0x308

    const/16 v5, 0x903

    invoke-static {v2, v3, v4, v5}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v12

    const/4 v9, 0x0

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤۡۨ()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۧۡۡ()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4}, Lkevin/fun/hook/PPHook;->ۦۤ۠ۧ(Ljava/lang/Object;)Z

    move-result v3

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v3, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۦۨ۟ۦ()Landroid/os/Handler;

    move-result-object v2

    new-instance v3, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda6;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v3, v0, v1}, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda6;-><init>(Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;)V

    invoke-static {v2, v3}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_f

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_4
    const/4 v2, 0x0

    :try_start_1
    invoke-static {v2}, Landroidx/emoji2/ۢۧۡۧ;->ۢۤۤۡ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :sswitch_5
    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v2, 0xbe22

    goto :goto_2

    :catchall_0
    move-exception v2

    const v2, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :sswitch_7
    const v2, 0xbe9e

    goto :goto_3

    :sswitch_8
    :try_start_2
    new-instance v13, Lorg/json/JSONObject;

    invoke-direct {v13}, Lorg/json/JSONObject;-><init>()V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v2

    const/16 v3, 0x276

    sget v5, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v5, v5, 0x20a

    const/16 v7, 0x378

    invoke-static {v2, v3, v5, v7}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۠ۤۥ([SIII)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p2

    invoke-static {v13, v2, v0}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v2

    const/16 v3, 0x27a

    sget v5, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v5, v5, 0x3ba

    const/16 v7, 0x24b

    invoke-static {v2, v3, v5, v7}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v13, v2, v4}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_f

    const/4 v2, 0x0

    const/4 v3, 0x1

    move v10, v3

    :goto_4
    const v3, 0xbefb

    :goto_5
    const v5, 0xbf0c

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_4

    goto :goto_5

    :cond_1
    :sswitch_9
    const v3, 0xbf39

    goto :goto_5

    :sswitch_a
    const/4 v3, 0x2

    if-le v10, v3, :cond_1

    const v3, 0xc1e3

    goto :goto_5

    :sswitch_b
    const v3, 0xc202

    :goto_6
    const v4, 0xc213

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_5

    goto :goto_6

    :sswitch_c
    if-eqz v2, :cond_2

    const v3, 0xc25f

    goto :goto_6

    :cond_2
    :sswitch_d
    const v3, 0xc240

    goto :goto_6

    :sswitch_e
    :try_start_3
    invoke-static {v2}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const v3, 0xc27e

    :goto_7
    const v4, 0xc28f

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_6

    goto :goto_7

    :goto_8
    :sswitch_f
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۦۨ۟ۦ()Landroid/os/Handler;

    move-result-object v3

    new-instance v4, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda8;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v4, v0, v2, v1}, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda8;-><init>(Landroid/content/Context;Ljava/lang/String;Lkevin/fun/hook/PPHook$VerifyCallback;)V

    invoke-static {v3, v4}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v2, 0xc2fa

    :goto_9
    const v3, 0xc30b

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_7

    goto :goto_9

    :sswitch_10
    const v2, 0xc5c3

    goto :goto_9

    :sswitch_11
    const v3, 0xc29d

    goto :goto_7

    :sswitch_12
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v2

    const/16 v3, 0x27d

    sget v4, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v4, v4, -0x10d

    const/16 v5, 0x3fb

    invoke-static {v2, v3, v4, v5}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_8

    move-result-object v2

    goto :goto_8

    :sswitch_13
    const/4 v2, 0x0

    :try_start_4
    invoke-static {v2}, Landroidx/emoji2/ۢۧۡۧ;->ۢۤۤۡ(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :sswitch_14
    const v2, 0xc601

    :goto_a
    const v3, 0xc612

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_8

    goto :goto_a

    :sswitch_15
    const v2, 0xc620

    goto :goto_a

    :catchall_1
    move-exception v2

    const v2, 0xc67d

    :goto_b
    const v3, 0xc68e

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_9

    goto :goto_b

    :sswitch_16
    const v2, 0xc69c

    goto :goto_b

    :sswitch_17
    :try_start_5
    new-instance v2, Ljava/net/URL;

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v3

    const/16 v5, 0x281

    sget v7, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v7, v7, -0x1dd

    const/16 v8, 0x2ca

    invoke-static {v3, v5, v7, v8}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۡۨۢ(Ljava/lang/Object;)Ljava/net/URLConnection;

    move-result-object v2

    move-object v0, v2

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v9, v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_6
    .catchall {:try_start_5 .. :try_end_5} :catchall_8

    sget v2, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v2, v2, -0x3b91

    :try_start_6
    invoke-static {v9, v2}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۧ۟ۦۥ(Ljava/lang/Object;I)V

    invoke-static {v9, v2}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣ۟۟ۦ(Ljava/lang/Object;I)V

    const/4 v2, 0x0

    invoke-static {v9, v2}, Landroidx/startup/۟ۦۤۨۧ;->ۣ۟ۧۢۡ(Ljava/lang/Object;Z)V

    const/4 v2, 0x1

    invoke-static {v9, v2}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۡۢۧۨ(Ljava/lang/Object;Z)V

    const/4 v2, 0x1

    invoke-static {v9, v2}, Landroidx/activity/ۨ۠۟ۧ;->ۢ۠ۢۦ(Ljava/lang/Object;Z)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v2

    const/16 v3, 0x2b8

    sget v5, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v5, v5, 0x88

    const/16 v7, 0x753

    invoke-static {v2, v3, v5, v7}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v9, v2}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۤ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v2

    const/16 v3, 0x2bc

    sget v5, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v5, v5, -0x6a

    const/16 v7, 0x3e6

    invoke-static {v2, v3, v5, v7}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v3

    const/16 v5, 0x2c8

    sget v7, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v7, v7, -0x3da

    const/16 v8, 0xc4e

    invoke-static {v3, v5, v7, v8}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۧۢۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v9, v2, v3}, Landroidx/activity/ۤۧۧۧ;->ۣ۠ۧۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v2

    const/16 v3, 0x2e7

    sget v5, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v5, v5, -0x34

    const/16 v7, 0x75b

    invoke-static {v2, v3, v5, v7}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v3

    const/16 v5, 0x2ed

    sget v7, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v7, v7, -0x7f

    const/16 v8, 0x621

    invoke-static {v3, v5, v7, v8}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v9, v2, v3}, Landroidx/activity/ۤۧۧۧ;->ۣ۠ۧۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v2

    const/16 v3, 0x2fd

    sget v5, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v5, v5, -0x66

    const/16 v7, 0x584

    invoke-static {v2, v3, v5, v7}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v9, v2, v12}, Landroidx/activity/ۤۧۧۧ;->ۣ۠ۧۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v2

    const/16 v3, 0x304

    sget v5, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v5, v5, 0x16c

    const/16 v7, 0x869

    invoke-static {v2, v3, v5, v7}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v3

    const/16 v5, 0x30e

    sget v7, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v7, v7, -0x50

    const/16 v8, 0x823

    invoke-static {v3, v5, v7, v8}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v9, v2, v3}, Landroidx/activity/ۤۧۧۧ;->ۣ۠ۧۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v2

    const/16 v3, 0x313

    sget v5, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v5, v5, 0x86

    const/16 v7, 0x375

    invoke-static {v2, v3, v5, v7}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v3

    const/16 v5, 0x31d

    sget v7, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v7, v7, 0xe0

    const/16 v8, 0xa17

    invoke-static {v3, v5, v7, v8}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v9, v2, v3}, Landroidx/activity/ۤۧۧۧ;->ۣ۠ۧۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v13}, Landroidx/viewpager/ۣۢ۟ۤ;->ۣۧۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v12}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۥۥ۠(Ljava/lang/Object;Ljava/lang/Object;)[B

    move-result-object v3

    array-length v2, v3

    invoke-static {v9, v2}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۡۧۨۦ(Ljava/lang/Object;I)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    const/4 v2, 0x0

    :try_start_7
    invoke-static {v9}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۢ۠۟ۢ(Ljava/lang/Object;)Ljava/io/OutputStream;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    move-result-object v2

    :try_start_8
    invoke-static {v2, v3}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۦۢۢۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۢۨۥ(Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    const v3, 0xc984

    :goto_c
    const v5, 0xc995

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_a

    goto :goto_c

    :sswitch_18
    if-eqz v2, :cond_3

    const v3, 0xc9e1

    goto :goto_c

    :cond_3
    :sswitch_19
    const v3, 0xc9c2

    goto :goto_c

    :sswitch_1a
    :try_start_9
    invoke-static {v2}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡۦۣ(Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_e

    const v2, 0xca00

    :goto_d
    const v3, 0xca11

    xor-int/2addr v2, v3

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    goto :goto_d

    :goto_e
    :pswitch_1
    :sswitch_1b
    :try_start_a
    invoke-static {v9}, Landroidx/loader/ۣ۟۟ۧ۠;->۟ۤ(Ljava/lang/Object;)I
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    move-result v3

    :try_start_b
    invoke-static {v9, v3}, Lkevin/fun/hook/PPHook;->۟ۢ۟ۡۧ(Ljava/lang/Object;I)Ljava/lang/String;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    move-result-object v5

    :try_start_c
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v7

    const/16 v8, 0x340

    sget v14, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v14, v14, -0x180

    const/16 v15, 0xa6c

    invoke-static {v7, v8, v14, v15}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v10}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v7

    const/16 v8, 0x355

    sget v14, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v14, v14, -0x7b

    const/16 v15, 0x68f

    invoke-static {v7, v8, v14, v15}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v3}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v7

    const/16 v8, 0x364

    sget v14, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v14, v14, -0x219

    const/16 v15, 0x904

    invoke-static {v7, v8, v14, v15}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/PPHook;->ۥ۠۟(Ljava/lang/Object;)V

    invoke-static {v5}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v7

    const v2, 0xca7c

    :goto_f
    const v8, 0xca8d

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_b

    goto :goto_f

    :sswitch_1c
    if-nez v7, :cond_4

    const v2, 0xcd64

    goto :goto_f

    :pswitch_2
    const v2, 0xca1f

    goto :goto_d

    :cond_4
    :sswitch_1d
    const v2, 0xcd45

    goto :goto_f

    :sswitch_1e
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    new-instance v3, Lkevin/fun/hook/PPHook$ActivateResult;
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_2
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    const/4 v5, 0x0

    :try_start_d
    invoke-direct {v3, v5}, Lkevin/fun/hook/PPHook$ActivateResult;-><init>(Lkevin/fun/hook/PPHook-IA;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v5

    const/16 v7, 0x36b

    sget v8, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v8, v8, 0x11

    const/16 v14, 0x431

    invoke-static {v5, v7, v8, v14}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    invoke-static {v2, v5, v7}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۨۢۦۡ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    iput-boolean v5, v3, Lkevin/fun/hook/PPHook$ActivateResult;->ok:Z

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v5

    const/16 v7, 0x36d

    sget v8, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v8, v8, 0x4f

    const/16 v14, 0xa0d

    invoke-static {v5, v7, v8, v14}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5, v11}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lkevin/fun/hook/PPHook$ActivateResult;->status:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v5

    const/16 v7, 0x373

    sget v8, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v8, v8, 0x20b

    const/16 v14, 0x3d2

    invoke-static {v5, v7, v8, v14}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۧۢ([SIII)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    invoke-static {v2, v5, v7}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۡ۠ۤۦ(Ljava/lang/Object;Ljava/lang/Object;I)I

    move-result v5

    iput v5, v3, Lkevin/fun/hook/PPHook$ActivateResult;->count:I

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v5

    const/16 v7, 0x378

    sget v8, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v8, v8, 0x256

    const/16 v14, 0x58f

    invoke-static {v5, v7, v8, v14}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5, v11}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v3, Lkevin/fun/hook/PPHook$ActivateResult;->error:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۦۨ۟ۦ()Landroid/os/Handler;

    move-result-object v14

    new-instance v2, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda7;
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    move-object/from16 v5, p2

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    :try_start_e
    invoke-direct/range {v2 .. v8}, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda7;-><init>(Lkevin/fun/hook/PPHook$ActivateResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;)V

    invoke-static {v14, v2}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_1
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    const v2, 0xcd83

    :goto_10
    const v3, 0xcd94

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_c

    goto :goto_10

    :sswitch_1f
    if-eqz v9, :cond_5

    const v2, 0xcde0

    goto :goto_10

    :cond_5
    :sswitch_20
    const v2, 0xcdc1

    goto :goto_10

    :sswitch_21
    :try_start_f
    invoke-static {v9}, Landroidx/emoji2/ۢۧۡۧ;->ۢۤۤۡ(Ljava/lang/Object;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    :sswitch_22
    const v2, 0xcdff

    :goto_11
    const v3, 0xce10

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_d

    goto :goto_11

    :sswitch_23
    return-void

    :sswitch_24
    const v2, 0xce1e

    goto :goto_11

    :catchall_2
    move-exception v2

    const v2, 0xd106

    :goto_12
    const v3, 0xd117

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_e

    goto :goto_12

    :sswitch_25
    const v2, 0xd125

    goto :goto_12

    :catch_0
    move-exception v2

    const v3, 0xd182

    :goto_13
    const v5, 0xd193

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_f

    goto :goto_13

    :sswitch_26
    const v3, 0xd1a1

    goto :goto_13

    :sswitch_27
    :try_start_10
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v7

    const/16 v8, 0x37d

    sget v14, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v14, v14, -0x1e6

    const/16 v15, 0xb0f

    invoke-static {v7, v8, v14, v15}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5, v3}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_1
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    :catch_1
    move-exception v2

    const v3, 0xd1fe

    :goto_14
    const v5, 0xd20f

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_10

    goto :goto_14

    :sswitch_28
    const v3, 0xd4a8

    goto :goto_14

    :catch_2
    move-exception v2

    const v3, 0xd505

    :goto_15
    const v5, 0xd516

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_11

    goto :goto_15

    :sswitch_29
    const v3, 0xd524

    goto :goto_15

    :catch_3
    move-exception v2

    const v3, 0xd581

    :goto_16
    const v5, 0xd592

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_12

    goto :goto_16

    :sswitch_2a
    const v3, 0xd5a0

    goto :goto_16

    :catchall_3
    move-exception v3

    const v5, 0xd888

    :goto_17
    const v7, 0xd899

    xor-int/2addr v5, v7

    sparse-switch v5, :sswitch_data_13

    goto :goto_17

    :sswitch_2b
    const v5, 0xd8a7

    goto :goto_17

    :catchall_4
    move-exception v3

    :sswitch_2c
    const v5, 0xd904

    :goto_18
    const v7, 0xd915

    xor-int/2addr v5, v7

    sparse-switch v5, :sswitch_data_14

    goto :goto_18

    :sswitch_2d
    if-eqz v2, :cond_6

    const v5, 0xd961

    goto :goto_18

    :cond_6
    :sswitch_2e
    const v5, 0xd942

    goto :goto_18

    :sswitch_2f
    :try_start_11
    invoke-static {v2}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡۦۣ(Ljava/lang/Object;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    const v2, 0xd980

    :goto_19
    const v5, 0xd991

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_15

    goto :goto_19

    :sswitch_30
    const v2, 0xdc2a

    goto :goto_19

    :catchall_5
    move-exception v2

    :sswitch_31
    :try_start_12
    throw v3
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_4
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    :catch_4
    move-exception v2

    const v3, 0xdd03

    :goto_1a
    const v5, 0xdd14

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_16

    goto :goto_1a

    :sswitch_32
    const v3, 0xdd22

    goto :goto_1a

    :catchall_6
    move-exception v2

    const v3, 0xdc87

    :goto_1b
    const v4, 0xdc98

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_17

    goto :goto_1b

    :sswitch_33
    const v3, 0xdca6

    goto :goto_1b

    :catchall_7
    move-exception v2

    const v3, 0x1700af

    :goto_1c
    const v4, 0x1700c0

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_18

    goto :goto_1c

    :goto_1d
    :sswitch_34
    :try_start_13
    invoke-static {v2}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v5

    const/16 v6, 0x39e

    sget v7, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v7, v7, 0x331

    const/16 v8, 0x89f

    invoke-static {v5, v6, v7, v8}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v4, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/PPHook;->ۥ۠۟(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۦۨ۟ۦ()Landroid/os/Handler;

    move-result-object v3

    new-instance v4, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda9;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v4, v0, v2, v1}, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda9;-><init>(Landroid/content/Context;Ljava/lang/Throwable;Lkevin/fun/hook/PPHook$VerifyCallback;)V

    invoke-static {v3, v4}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_c

    const v2, 0x170cac

    :goto_1e
    const v3, 0x170cbd

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_19

    goto :goto_1e

    :sswitch_35
    if-eqz v9, :cond_9

    const v2, 0x170f94

    goto :goto_1e

    :sswitch_36
    const v3, 0x1700ce

    goto :goto_1c

    :catch_5
    move-exception v2

    const v3, 0x17012b

    :goto_1f
    const v5, 0x17013c

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_1a

    goto :goto_1f

    :sswitch_37
    const v3, 0x17014a

    goto :goto_1f

    :catchall_8
    move-exception v2

    const/4 v9, 0x0

    const v3, 0x1701a7

    :goto_20
    const v4, 0x1701b8

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_1b

    goto :goto_20

    :sswitch_38
    const v3, 0x170451

    goto :goto_20

    :catch_6
    move-exception v2

    const/4 v9, 0x0

    :sswitch_39
    :try_start_14
    invoke-static {v2}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v7

    const/16 v8, 0x38b

    sget v14, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v14, v14, -0x1cb

    const/16 v15, 0xb3f

    invoke-static {v7, v8, v14, v15}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5, v10}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v7

    const/16 v8, 0x399

    sget v14, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v14, v14, 0x387

    const/16 v15, 0xb37

    invoke-static {v7, v8, v14, v15}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۢۦۧ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/PPHook;->ۥ۠۟(Ljava/lang/Object;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_f

    const v3, 0x1704ae

    :goto_21
    const v5, 0x1704bf

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_1c

    goto :goto_21

    :sswitch_3a
    if-eqz v9, :cond_7

    const v3, 0x17050b

    goto :goto_21

    :cond_7
    :sswitch_3b
    const v3, 0x1704ec

    goto :goto_21

    :sswitch_3c
    :try_start_15
    invoke-static {v9}, Landroidx/emoji2/ۢۧۡۧ;->ۢۤۤۡ(Ljava/lang/Object;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_9

    :sswitch_3d
    const v3, 0x17052a

    :goto_22
    const v5, 0x17053b

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_1d

    goto :goto_22

    :sswitch_3e
    const v3, 0x170549

    goto :goto_22

    :catchall_9
    move-exception v3

    const v3, 0x170831

    :goto_23
    const v5, 0x170842

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_1e

    goto :goto_23

    :sswitch_3f
    const v3, 0x170850

    goto :goto_23

    :sswitch_40
    const v3, 0x1708ad

    :goto_24
    const v5, 0x1708be

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_1f

    goto :goto_24

    :sswitch_41
    const/4 v3, 0x2

    if-ge v10, v3, :cond_8

    const v3, 0x17090a

    goto :goto_24

    :cond_8
    :sswitch_42
    const v3, 0x1708eb

    goto :goto_24

    :sswitch_43
    sget v3, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    int-to-long v8, v3

    const-wide/16 v14, 0x1ad

    xor-long/2addr v8, v14

    :try_start_16
    invoke-static {v8, v9}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۡۡۥۨ(J)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_a

    const v3, 0x170929

    :goto_25
    const v5, 0x17093a

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_20

    goto :goto_25

    :sswitch_44
    const v3, 0x170bd3

    goto :goto_25

    :catchall_a
    move-exception v3

    :sswitch_45
    sget v3, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v3, v3, 0x53

    add-int/2addr v3, v10

    const v5, 0x170c30

    :goto_26
    const v7, 0x170c41

    xor-int/2addr v5, v7

    sparse-switch v5, :sswitch_data_21

    goto :goto_26

    :sswitch_46
    move v10, v3

    goto/16 :goto_4

    :sswitch_47
    const v5, 0x170c4f

    goto :goto_26

    :cond_9
    :sswitch_48
    const v2, 0x170cea

    goto/16 :goto_1e

    :sswitch_49
    :try_start_17
    invoke-static {v9}, Landroidx/emoji2/ۢۧۡۧ;->ۢۤۤۡ(Ljava/lang/Object;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_b

    :sswitch_4a
    const v2, 0x170fb3

    :goto_27
    const v3, 0x170fc4

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_22

    goto :goto_27

    :sswitch_4b
    const v2, 0x170fd2

    goto :goto_27

    :catchall_b
    move-exception v2

    const v2, 0x17102f

    :goto_28
    const v3, 0x171040

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_23

    goto :goto_28

    :sswitch_4c
    const v2, 0x17104e

    goto :goto_28

    :catchall_c
    move-exception v2

    const v3, 0x1710ab

    :goto_29
    const v4, 0x1710bc

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_24

    goto :goto_29

    :sswitch_4d
    if-eqz v9, :cond_a

    const v3, 0x171393

    goto :goto_29

    :cond_a
    :sswitch_4e
    const v3, 0x171374

    goto :goto_29

    :sswitch_4f
    :try_start_18
    invoke-static {v9}, Landroidx/emoji2/ۢۧۡۧ;->ۢۤۤۡ(Ljava/lang/Object;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_d

    :sswitch_50
    const v3, 0x1713b2

    :goto_2a
    const v4, 0x1713c3

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_25

    goto :goto_2a

    :sswitch_51
    throw v2

    :sswitch_52
    const v3, 0x1713d1

    goto :goto_2a

    :catchall_d
    move-exception v3

    const v3, 0x17142e

    :goto_2b
    const v4, 0x17143f

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_26

    goto :goto_2b

    :sswitch_53
    const v3, 0x17144d

    goto :goto_2b

    :catchall_e
    move-exception v2

    goto/16 :goto_e

    :catchall_f
    move-exception v2

    goto/16 :goto_1d

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_3
        0x1d7 -> :sswitch_23
        0x1f4 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_23
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_5
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_9
        0x35 -> :sswitch_17
        0x1f7 -> :sswitch_a
        0x7eef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_c
        0x32 -> :sswitch_d
        0x4c -> :sswitch_e
        0x53 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_f
        0xf1 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_10
        0x6af -> :sswitch_10
        0x6c8 -> :sswitch_23
        0x6e9 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_15
        0x32 -> :sswitch_23
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_14
        0xf3 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_18
        0x36 -> :sswitch_19
        0x57 -> :sswitch_1b
        0x74 -> :sswitch_1a
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :sswitch_data_b
    .sparse-switch
        0xf1 -> :sswitch_1c
        0x7ab -> :sswitch_1d
        0x7c8 -> :sswitch_27
        0x7e9 -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0x17 -> :sswitch_1f
        0x36 -> :sswitch_20
        0x55 -> :sswitch_23
        0x74 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0xe -> :sswitch_23
        0x3ef -> :sswitch_24
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0x11 -> :sswitch_25
        0x32 -> :sswitch_22
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_26
        0x32 -> :sswitch_39
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x3f1 -> :sswitch_28
        0x6a7 -> :sswitch_39
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x13 -> :sswitch_29
        0x32 -> :sswitch_39
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_2a
        0x32 -> :sswitch_39
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x11 -> :sswitch_2b
        0x3e -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_2d
        0x36 -> :sswitch_2e
        0x57 -> :sswitch_31
        0x74 -> :sswitch_2f
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_30
        0x5bb -> :sswitch_31
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x17 -> :sswitch_32
        0x36 -> :sswitch_39
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x1f -> :sswitch_33
        0x3e -> :sswitch_34
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0xe -> :sswitch_34
        0x6f -> :sswitch_36
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0x11 -> :sswitch_35
        0x57 -> :sswitch_23
        0x76 -> :sswitch_48
        0x329 -> :sswitch_49
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0x17 -> :sswitch_37
        0x76 -> :sswitch_39
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x1f -> :sswitch_38
        0x5e9 -> :sswitch_34
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x11 -> :sswitch_3a
        0x53 -> :sswitch_40
        0x72 -> :sswitch_3b
        0x1b4 -> :sswitch_3c
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x11 -> :sswitch_3e
        0x72 -> :sswitch_40
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x12 -> :sswitch_3d
        0x73 -> :sswitch_3f
    .end sparse-switch

    :sswitch_data_1f
    .sparse-switch
        0x13 -> :sswitch_41
        0x55 -> :sswitch_45
        0x72 -> :sswitch_42
        0x1b4 -> :sswitch_43
    .end sparse-switch

    :sswitch_data_20
    .sparse-switch
        0x13 -> :sswitch_44
        0x2e9 -> :sswitch_45
    .end sparse-switch

    :sswitch_data_21
    .sparse-switch
        0xe -> :sswitch_46
        0x71 -> :sswitch_47
    .end sparse-switch

    :sswitch_data_22
    .sparse-switch
        0x16 -> :sswitch_23
        0x77 -> :sswitch_4b
    .end sparse-switch

    :sswitch_data_23
    .sparse-switch
        0xe -> :sswitch_4a
        0x6f -> :sswitch_4c
    .end sparse-switch

    :sswitch_data_24
    .sparse-switch
        0x17 -> :sswitch_4d
        0x32f -> :sswitch_4f
        0x3c8 -> :sswitch_51
        0x3e9 -> :sswitch_4e
    .end sparse-switch

    :sswitch_data_25
    .sparse-switch
        0x12 -> :sswitch_51
        0x71 -> :sswitch_52
    .end sparse-switch

    :sswitch_data_26
    .sparse-switch
        0x11 -> :sswitch_53
        0x72 -> :sswitch_50
    .end sparse-switch
.end method

.method static synthetic lambda$12(Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;)V
    .locals 8

    const/4 v1, 0x0

    const/4 v6, 0x0

    const-string v4, "\u06e6\u06e5\u06e6"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move v5, v6

    move v7, v6

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    const-string v1, "\u06e7\u06e3\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0, v0, v2, v6, p1}, Lkevin/fun/hook/PPHook;->ۥ۠۟ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)V

    const-string v1, "\u06e8\u06df\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const-string v4, "\u06e8\u06e2\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    xor-int/lit16 v5, v7, -0x10f

    const-string v1, "\u06e6\u06e2\u06e5"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    sget v7, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    const-string v1, "\u06e8\u06e2\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const-string v4, "\u06df\u06e8\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_5
    sget v7, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    const-string v1, "\u06e4\u06e8\u06e3"

    move-object v4, v1

    goto :goto_0

    :sswitch_6
    const/16 v1, 0x3b9

    const/16 v2, 0xc13

    invoke-static {v3, v1, v5, v2}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v4, "\u06e2\u06e5"

    move-object v2, v1

    goto :goto_0

    :sswitch_7
    const/16 v0, 0x3b1

    const/16 v1, 0x198

    invoke-static {v3, v0, v5, v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e4\u06e7\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_8
    xor-int/lit16 v5, v7, -0x218

    const-string v1, "\u06e7\u06e2\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_9
    const-string v1, "\u06e2\u06e6\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_a
    const-string v1, "\u06e1\u06e6\u06e5"

    move-object v4, v1

    goto :goto_0

    :sswitch_b
    const-string v1, "\u06e1\u06df\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_c
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۧۧ۟ۤ()V

    const-string v1, "\u06e6\u06e5\u06e2"

    move-object v4, v1

    goto :goto_0

    :sswitch_d
    const-string v1, "\u06e6\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_e
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc43 -> :sswitch_0
        0xdcb9 -> :sswitch_a
        0x1aa817 -> :sswitch_3
        0x1aae89 -> :sswitch_4
        0x1aaf60 -> :sswitch_b
        0x1ababe -> :sswitch_1
        0x1abadf -> :sswitch_2
        0x1ac1a9 -> :sswitch_6
        0x1ac203 -> :sswitch_9
        0x1ac207 -> :sswitch_c
        0x1ac56c -> :sswitch_7
        0x1ac585 -> :sswitch_d
        0x1ac8ca -> :sswitch_e
        0x1ac929 -> :sswitch_5
        0x1ac92d -> :sswitch_8
    .end sparse-switch
.end method

.method static synthetic lambda$13(Lkevin/fun/hook/PPHook$ActivateResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;)V
    .locals 6

    const/4 v5, 0x0

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۧۧ۟ۤ()V

    invoke-static {p0}, Lkevin/fun/hook/PPHook;->۟۟۟۟ۦ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x3d4

    sget v2, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v2, v2, -0x1c0

    const/16 v3, 0x489

    invoke-static {v0, v1, v2, v3}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lkevin/fun/hook/PPHook;->۟ۥۣۤۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v2, 0x3d6

    sget v3, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v3, v3, 0x254

    const/16 v4, 0xbb7

    invoke-static {v0, v2, v3, v4}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v2

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/PPHook;->۟ۥۣۤۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {p1}, Lkevin/fun/hook/PPHook;->۟ۡۢۤۧ(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x3dd

    sget v3, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v3, v3, -0xe4

    const/16 v4, 0xb3e

    invoke-static {v0, v1, v3, v4}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Landroidx/core/ۧ۟ۤۨ;->ۨۢۢۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/PPHook;->۟ۥۣۤۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-eqz v1, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x3ec

    sget v2, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v2, v2, -0x24b

    const/16 v3, 0x64a

    invoke-static {v0, v1, v2, v3}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v0

    const v1, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :goto_5
    :sswitch_c
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const/16 v2, 0x41c

    sget v3, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v3, v3, 0x74

    const/16 v4, 0x2e8

    invoke-static {v1, v2, v3, v4}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {p4, v1, v0, v2, p5}, Lkevin/fun/hook/PPHook;->ۥ۠۟ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)V

    const v0, 0xc202

    :goto_6
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_d
    const v0, 0xc221

    goto :goto_6

    :sswitch_e
    const v1, 0xbf1a

    goto :goto_4

    :sswitch_f
    invoke-static {p0}, Lkevin/fun/hook/PPHook;->۟ۤۤۡۧ(Ljava/lang/Object;)I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v2

    const/16 v3, 0x3ff

    sget v4, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v4, v4, 0x168

    const/16 v5, 0x2c2

    invoke-static {v2, v3, v4, v5}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, p3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v2

    const/16 v3, 0x40d

    sget v4, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v4, v4, -0x3a

    const/16 v5, 0x609

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const/16 v2, 0x41a

    sget v3, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v3, v3, -0x12

    const/16 v4, 0xc0e

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :sswitch_10
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x422

    sget v2, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v2, v2, -0x328

    const/16 v3, 0x6f0

    invoke-static {v0, v1, v2, v3}, Landroidx/startup/ۤۧۥۣ;->۟ۧۦ۠ۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lkevin/fun/hook/PPHook;->۟ۥۣۤۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v2, 0x427

    sget v3, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v3, v3, -0x65

    const/16 v4, 0x6f5

    invoke-static {v0, v2, v3, v4}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v2

    const v0, 0xc27e

    :goto_7
    const v3, 0xc28f

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :cond_4
    :sswitch_11
    const v0, 0xc2bc

    goto :goto_7

    :sswitch_12
    if-eqz v1, :cond_4

    const v0, 0xc2db

    goto :goto_7

    :sswitch_13
    invoke-static {p0}, Lkevin/fun/hook/PPHook;->ۢۦۤۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc2fa

    :goto_8
    const v3, 0xc30b

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_14
    if-nez v1, :cond_5

    const v0, 0xc5e2

    goto :goto_8

    :cond_5
    :sswitch_15
    const v0, 0xc5c3

    goto :goto_8

    :sswitch_16
    invoke-static {p0}, Lkevin/fun/hook/PPHook;->ۢۦۤۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const v1, 0xc601

    :goto_9
    const v3, 0xc612

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_8

    goto :goto_9

    :sswitch_17
    const v1, 0xc620

    goto :goto_9

    :sswitch_18
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x42d

    sget v3, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v3, v3, -0x3ca

    const/16 v4, 0x204

    invoke-static {v0, v1, v3, v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v0

    :sswitch_19
    invoke-static {p4, v2, v0, v5, p5}, Lkevin/fun/hook/PPHook;->ۥ۠۟ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)V

    const v0, 0xc67d

    :goto_a
    const v1, 0xc68e

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_9

    goto :goto_a

    :goto_b
    :sswitch_1a
    invoke-static {}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۣۨ()I

    move-result v1

    const v0, 0xca7c

    :goto_c
    const v2, 0xca8d

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_a

    goto :goto_c

    :sswitch_1b
    if-gtz v1, :cond_7

    const v0, 0xcd64

    goto :goto_c

    :sswitch_1c
    const v0, 0xc69c

    goto :goto_a

    :sswitch_1d
    invoke-static {p0}, Lkevin/fun/hook/PPHook;->ۢۦۤۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc984

    :goto_d
    const v3, 0xc995

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_b

    goto :goto_d

    :sswitch_1e
    if-nez v1, :cond_6

    const v0, 0xc9e1

    goto :goto_d

    :cond_6
    :sswitch_1f
    const v0, 0xc9c2

    goto :goto_d

    :sswitch_20
    invoke-static {p0}, Lkevin/fun/hook/PPHook;->ۢۦۤۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const v1, 0xca00

    :goto_e
    const v3, 0xca11

    xor-int/2addr v1, v3

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto :goto_e

    :goto_f
    :pswitch_1
    invoke-static {p4, v2, v0, v5, p5}, Lkevin/fun/hook/PPHook;->ۥ۠۟ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)V

    goto :goto_b

    :pswitch_2
    const v1, 0xca1f

    goto :goto_e

    :sswitch_21
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x43c

    sget v3, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v3, v3, -0x6e

    const/16 v4, 0x82d

    invoke-static {v0, v1, v3, v4}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v0

    goto :goto_f

    :cond_7
    :sswitch_22
    const v0, 0xcd45

    goto :goto_c

    :sswitch_23
    const-string v0, "DI5jJ"

    invoke-static {v0}, Landroidx/customview/ۤۡۥ;->ۥۣۢۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

    :sswitch_24
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_10
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_8
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_10
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_f
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x1f7 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_d
        0x32 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_11
        0x33 -> :sswitch_1d
        0x54 -> :sswitch_13
        0xf1 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_14
        0x6af -> :sswitch_15
        0x6c8 -> :sswitch_18
        0x6e9 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_17
        0x32 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1a
        0xf3 -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0xf1 -> :sswitch_1b
        0x7ab -> :sswitch_22
        0x7c8 -> :sswitch_24
        0x7e9 -> :sswitch_23
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0x11 -> :sswitch_1e
        0x36 -> :sswitch_1f
        0x57 -> :sswitch_21
        0x74 -> :sswitch_20
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic lambda$14(Landroid/content/Context;Ljava/lang/String;Lkevin/fun/hook/PPHook$VerifyCallback;)V
    .locals 5

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۧۧ۟ۤ()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const/16 v2, 0x44b

    sget v3, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v3, v3, 0x2f8

    const/16 v4, 0x895

    invoke-static {v1, v2, v3, v4}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const/16 v2, 0x451

    sget v3, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v3, v3, -0x21c

    const/16 v4, 0xae3

    invoke-static {v1, v2, v3, v4}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p0, v1, v0, v2, p2}, Lkevin/fun/hook/PPHook;->ۥ۠۟ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)V

    invoke-static {}, Landroidx/activity/ۣۦۡۥ;->ۦۧۥۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "ftZ3Edlrz"

    invoke-static {v0}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣ۟ۤۧۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic lambda$15(Landroid/content/Context;Ljava/lang/Throwable;Lkevin/fun/hook/PPHook$VerifyCallback;)V
    .locals 10

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v6, "\u06e4\u06e3\u06e3"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move v7, v8

    move v9, v8

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const-string v6, "\u06e8\u06e3\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u06e2\u06e3\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    sget v7, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    const-string v1, "\u06e1\u06e1\u06e7"

    move-object v6, v1

    goto :goto_0

    :sswitch_2
    const-string v1, "\u06e1\u06e6\u06e6"

    move-object v6, v1

    goto :goto_0

    :sswitch_3
    const/16 v1, 0x45b

    const/16 v2, 0x7d4

    invoke-static {v4, v1, v9, v2}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e3\u06e6\u06e3"

    move-object v2, v1

    goto :goto_0

    :sswitch_4
    const-string v1, "\u06e1\u06e1\u06e8"

    move-object v6, v1

    goto :goto_0

    :sswitch_5
    const-string v1, "\u06e0\u06e8\u06e2"

    move-object v6, v1

    goto :goto_0

    :sswitch_6
    sget v7, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    const-string v1, "\u06e6\u06e7\u06e6"

    move-object v6, v1

    goto :goto_0

    :sswitch_7
    invoke-static {v3, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u06e2\u06e1\u06e6"

    move-object v6, v1

    goto :goto_0

    :sswitch_8
    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e8\u06e7\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_9
    invoke-static {p0, v2, v5, v8, p2}, Lkevin/fun/hook/PPHook;->ۥ۠۟ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)V

    const-string v1, "\u06e4\u06e6\u06e0"

    move-object v6, v1

    goto :goto_0

    :sswitch_a
    const-string v1, "\u06e8\u06e6\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_b
    xor-int/lit8 v9, v7, -0x74

    const-string v1, "\u06e8\u06e3\u06df"

    move-object v6, v1

    goto :goto_0

    :sswitch_c
    invoke-static {v0, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v6, "\u06e7\u06e8\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_d
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۧۧ۟ۤ()V

    const-string v1, "\u06e6\u06e1\u06e6"

    move-object v6, v1

    goto :goto_0

    :sswitch_e
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const-string v6, "\u06e3\u06e6\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_f
    const/16 v1, 0x455

    const/16 v5, 0xaa8

    invoke-static {v4, v1, v9, v5}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۟۠ۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e4\u06e8\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_10
    invoke-static {p1}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06df\u06e5\u06df"

    move-object v2, v1

    goto/16 :goto_0

    :sswitch_11
    xor-int/lit16 v9, v7, -0xe7

    const-string v1, "\u06e3\u06df\u06e7"

    move-object v6, v1

    goto/16 :goto_0

    :sswitch_12
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa7b9 -> :sswitch_0
        0x1aaec7 -> :sswitch_b
        0x1aaec8 -> :sswitch_5
        0x1aaf61 -> :sswitch_a
        0x1ab287 -> :sswitch_c
        0x1ab2c4 -> :sswitch_e
        0x1ab60b -> :sswitch_3
        0x1ab6de -> :sswitch_1
        0x1ab6e0 -> :sswitch_9
        0x1aba44 -> :sswitch_d
        0x1aba9e -> :sswitch_12
        0x1abae3 -> :sswitch_7
        0x1ac18b -> :sswitch_2
        0x1ac245 -> :sswitch_11
        0x1ac623 -> :sswitch_8
        0x1ac944 -> :sswitch_f
        0x1ac94d -> :sswitch_6
        0x1ac9a5 -> :sswitch_10
        0x1ac9c8 -> :sswitch_4
    .end sparse-switch
.end method

.method static synthetic lambda$16(Landroid/content/Context;Ljava/lang/String;)V
    .locals 8

    :try_start_0
    new-instance v0, Landroid/app/Dialog;

    const v1, -0x1030026

    sget v2, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/2addr v1, v2

    invoke-direct {v0, p0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    sput-object v0, Lkevin/fun/hook/PPHook;->loadingDialog:Landroid/app/Dialog;

    invoke-static {}, Lkevin/fun/hook/PPHook;->۟ۧ۟ۤۨ()Landroid/app/Dialog;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۡۡ۠(Ljava/lang/Object;Z)V

    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    sget v2, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v2, v2, 0x3a5

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-static {v0, v1}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡ۠۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, -0x7fffff0d

    sget v3, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/2addr v1, v3

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۣۢۧ(Ljava/lang/Object;I)V

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x1

    invoke-static {v1, v3}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v3, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v3, v3, 0x11d

    invoke-static {v1, v3}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    const/high16 v4, 0x42000000    # 32.0f

    invoke-static {p0, v4}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v4

    const/high16 v5, 0x41c00000    # 24.0f

    invoke-static {p0, v5}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v5

    const/high16 v6, 0x42000000    # 32.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v6

    const/high16 v7, 0x41c00000    # 24.0f

    invoke-static {p0, v7}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v7

    invoke-static {v1, v4, v5, v6, v7}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    const/high16 v5, 0x435c0000    # 220.0f

    invoke-static {p0, v5}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v5

    sget v6, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v6, v6, -0x74

    invoke-direct {v4, v5, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    iput v3, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-static {v1, v4}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v4, 0x41400000    # 12.0f

    invoke-static {p0, v4}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v4

    int-to-float v4, v4

    invoke-static {v2, v4}, Lkevin/fun/hook/PPHook;->ۨۨۨ۠(IF)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {v2, p1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v4, 0x41600000    # 14.0f

    invoke-static {v2, v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v4, -0xccce42

    sget v5, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/2addr v4, v5

    invoke-static {v2, v4}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {v2, v3}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    invoke-static {v1, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v1}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۢ۟۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->۟ۧ۟ۤۨ()Landroid/app/Dialog;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥۢۨۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->۟ۧ۟ۤۨ()Landroid/app/Dialog;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۦۧۤۡ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :goto_1
    :sswitch_0
    return-void

    :sswitch_1
    const/16 v0, 0x66f

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v2

    const/16 v3, 0x45f

    sget v4, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    xor-int/lit16 v4, v4, 0x114

    const/16 v5, 0x2b8

    invoke-static {v2, v3, v4, v5}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook;->ۥ۠۟(Ljava/lang/Object;)V

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic lambda$17()V
    .locals 6

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/PPHook;->۟ۧ۟ۤۨ()Landroid/app/Dialog;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/PPHook;->۟ۧ۟ۤۨ()Landroid/app/Dialog;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۤۥۣۡ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/PPHook;->۟ۧ۟ۤۨ()Landroid/app/Dialog;

    move-result-object v0

    invoke-static {v0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    const/4 v0, 0x0

    sput-object v0, Lkevin/fun/hook/PPHook;->loadingDialog:Landroid/app/Dialog;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v2

    const/16 v3, 0x469

    sget v4, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/lit16 v4, v4, 0x351

    const/16 v5, 0x837

    invoke-static {v2, v3, v4, v5}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook;->ۥ۠۟(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_7
    .end sparse-switch
.end method

.method static synthetic lambda$18(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Lkevin/fun/hook/PPHook$VerifyCallback;)V
    .locals 9

    :try_start_0
    new-instance v2, Landroid/app/Dialog;

    const v0, 0x10301fa

    sget v1, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/2addr v0, v1

    invoke-direct {v2, p0, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/4 v0, 0x0

    invoke-static {v2, v0}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۡۡ۠(Ljava/lang/Object;Z)V

    new-instance v3, Landroid/widget/FrameLayout;

    invoke-direct {v3, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    sget v1, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v4, v1, -0x2ff

    invoke-direct {v0, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-static {v3, v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡ۠۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, -0x7ffffc47

    sget v1, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/2addr v0, v1

    invoke-static {v3, v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۣۢۧ(Ljava/lang/Object;I)V

    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    invoke-static {v5, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    const/high16 v0, 0x41c00000    # 24.0f

    invoke-static {p0, v0}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v0

    const/high16 v1, 0x41c00000    # 24.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v1

    const/high16 v6, 0x41c00000    # 24.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v6

    const/high16 v7, 0x41a00000    # 20.0f

    invoke-static {p0, v7}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v7

    invoke-static {v5, v0, v1, v6, v7}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/high16 v1, 0x43910000    # 290.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v1

    sget v6, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v6, v6, 0x64

    invoke-direct {v0, v1, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x11

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-static {v5, v0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {p0, v0}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v0

    int-to-float v0, v0

    invoke-static {v4, v0}, Lkevin/fun/hook/PPHook;->ۨۨۨ۠(IF)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v0

    invoke-static {v5, v0}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Landroid/widget/TextView;

    invoke-direct {v6, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {v6, p1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41900000    # 18.0f

    invoke-static {v6, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz p2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const v0, -0xb350b0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    const v0, -0xbbcca

    :sswitch_5
    invoke-static {v6, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v6, v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۤۦۤۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    const/16 v0, 0x11

    invoke-static {v6, v0}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v7, 0x0

    const/high16 v8, 0x41400000    # 12.0f

    invoke-static {p0, v8}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v8

    invoke-static {v6, v0, v1, v7, v8}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v5, v6}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {v0, p3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v1, 0x41600000    # 14.0f

    invoke-static {v0, v1}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v1, 0x9999d3

    sget v6, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/2addr v1, v6

    invoke-static {v0, v1}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/16 v1, 0x11

    invoke-static {v0, v1}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/4 v1, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/high16 v8, 0x41a00000    # 20.0f

    invoke-static {p0, v8}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v8

    invoke-static {v0, v1, v6, v7, v8}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v5, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Landroid/widget/Button;

    invoke-direct {v6, p0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x473

    sget v7, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v7, v7, -0x61

    const/16 v8, 0x744

    invoke-static {v0, v1, v7, v8}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41600000    # 14.0f

    invoke-static {v6, v0}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۧ۟ۥۦ(Ljava/lang/Object;F)V

    invoke-static {v6, v4}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣ۟ۢ۟ۤ(Ljava/lang/Object;I)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v6, v0, v1}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۨۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz p2, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    const v0, -0xb350b0

    const v1, 0xbe7f

    :goto_3
    const v7, 0xbe90

    xor-int/2addr v1, v7

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    const/high16 v1, 0x41c80000    # 25.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lkevin/fun/hook/PPHook;->ۨۨۨ۠(IF)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v0

    invoke-static {v6, v0}, Landroidx/activity/ۣۦۡۥ;->ۤۥ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v1, 0x42300000    # 44.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v1

    invoke-direct {v0, v4, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v6, v0}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣ۟ۡۡۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda17;

    invoke-direct {v0, v2, p2, p4, p3}, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda17;-><init>(Landroid/app/Dialog;ZLkevin/fun/hook/PPHook$VerifyCallback;Ljava/lang/String;)V

    invoke-static {v6, v0}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۣۣ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5, v6}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v5}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۢ۟۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v3}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥۢۨۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۦۧۤۡ(Ljava/lang/Object;)V

    const v0, 0x3f666666    # 0.9f

    invoke-static {v5, v0}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۡۦ۟ۦ(Ljava/lang/Object;F)V

    const v0, 0x3f666666    # 0.9f

    invoke-static {v5, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣ۟ۡۢ(Ljava/lang/Object;F)V

    const/4 v0, 0x0

    invoke-static {v5, v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۡۦۦۧ(Ljava/lang/Object;F)V

    invoke-static {v5}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۣۤۤ(Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۡۢۢ(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣۡۦ۠(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Landroidx/documentfile/ۡۢ۟ۥ;->ۣۤۦۦ(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v2, -0x124

    sget v1, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    int-to-long v4, v1

    xor-long/2addr v2, v4

    invoke-static {v0, v2, v3}, Landroidx/loader/ۥۧۨۤ;->ۣۣۧ۠(Ljava/lang/Object;J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۤ۟ۥ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const v0, 0xbefb

    :goto_5
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :goto_6
    :sswitch_a
    invoke-static {}, Landroidx/loader/ۣۦ۟ۡ;->۟ۦ۠ۨ()I

    move-result v1

    const v0, 0xc2fa

    :goto_7
    const v2, 0xc30b

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_7

    :sswitch_b
    if-ltz v1, :cond_4

    const v0, 0xc5e2

    goto :goto_7

    :sswitch_c
    const v1, 0xbe9e

    goto/16 :goto_3

    :sswitch_d
    const v0, -0xbbcca

    goto/16 :goto_4

    :sswitch_e
    const v0, 0xbf1a

    goto :goto_5

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v2

    const/16 v3, 0x475

    sget v4, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v4, v4, 0x58

    const/16 v5, 0xa7d

    invoke-static {v2, v3, v4, v5}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟۟۠ۤۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook;->ۥ۠۟(Ljava/lang/Object;)V

    const v0, 0xc202

    :goto_8
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_8

    :sswitch_f
    if-nez p2, :cond_2

    const v0, 0xc25f

    goto :goto_8

    :cond_2
    :sswitch_10
    const v0, 0xc240

    goto :goto_8

    :sswitch_11
    const v0, 0xc27e

    :goto_9
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_7

    goto :goto_9

    :cond_3
    :sswitch_12
    const v0, 0xc2bc

    goto :goto_9

    :sswitch_13
    if-eqz p4, :cond_3

    const v0, 0xc2db

    goto :goto_9

    :sswitch_14
    invoke-static {p4, p3}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->۠ۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_6

    :cond_4
    :sswitch_15
    const v0, 0xc5c3

    goto :goto_7

    :sswitch_16
    const-string v0, "yLAXQKEFMShHMbRMESwmkSyWoG5"

    invoke-static {v0}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣ۟ۢۥ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_17
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_d
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_a
        0x1f7 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x1f1 -> :sswitch_b
        0x6af -> :sswitch_15
        0x6c8 -> :sswitch_17
        0x6e9 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_a
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_12
        0x33 -> :sswitch_a
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch
.end method

.method static synthetic lambda$19(Landroid/app/Dialog;ZLkevin/fun/hook/PPHook$VerifyCallback;Ljava/lang/String;Landroid/view/View;)V
    .locals 2

    invoke-static {p0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz p1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz p2, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p2}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۣ۟۟ۢۦ(Ljava/lang/Object;)V

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v0, 0xbebd

    goto :goto_3

    :sswitch_9
    if-eqz p2, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_a
    invoke-static {p2, p3}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->۠ۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_b
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_b
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_b
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_b
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch
.end method

.method static synthetic lambda$2(Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;)V
    .locals 12

    const/4 v11, 0x1

    :try_start_0
    new-instance v2, Landroid/app/Dialog;

    const v0, 0x103014f

    sget v1, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/2addr v0, v1

    invoke-direct {v2, p0, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/4 v0, 0x0

    invoke-static {v2, v0}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۡۡ۠(Ljava/lang/Object;Z)V

    new-instance v3, Landroid/widget/FrameLayout;

    invoke-direct {v3, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    sget v1, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/lit16 v1, v1, -0x35c

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-static {v3, v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡ۠۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, -0x7ffffcde

    sget v4, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/2addr v0, v4

    invoke-static {v3, v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۣۢۧ(Ljava/lang/Object;I)V

    new-instance v4, Landroid/widget/LinearLayout;

    invoke-direct {v4, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    invoke-static {v4, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v0, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v5, v0, -0x3b5

    invoke-static {v4, v5}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    const/high16 v0, 0x42000000    # 32.0f

    invoke-static {p0, v0}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v0

    const/high16 v6, 0x42000000    # 32.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v6

    const/high16 v7, 0x42000000    # 32.0f

    invoke-static {p0, v7}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v7

    const/high16 v8, 0x41e00000    # 28.0f

    invoke-static {p0, v8}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v8

    invoke-static {v4, v0, v6, v7, v8}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/high16 v6, 0x43a00000    # 320.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v6

    sget v7, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v7, v7, -0x1ec

    invoke-direct {v0, v6, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    iput v5, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-static {v4, v0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41a00000    # 20.0f

    invoke-static {p0, v0}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v0

    int-to-float v0, v0

    invoke-static {v1, v0}, Lkevin/fun/hook/PPHook;->ۨۨۨ۠(IF)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v0

    invoke-static {v4, v0}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const/16 v6, 0x47f

    sget v7, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v7, v7, 0x28f

    const/16 v8, 0x8bb

    invoke-static {v1, v6, v7, v8}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v1, 0x42400000    # 48.0f

    invoke-static {v0, v1}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {v0, v5}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/4 v1, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/high16 v8, 0x41000000    # 8.0f

    invoke-static {p0, v8}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v8

    invoke-static {v0, v1, v6, v7, v8}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v4, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Landroid/widget/TextView;

    invoke-direct {v6, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۧۡۡ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x481

    sget v7, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v7, v7, -0x32

    const/16 v8, 0x4e2

    invoke-static {v0, v1, v7, v8}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۧۡۡ()Ljava/lang/String;

    move-result-object v0

    :sswitch_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v7

    const/16 v8, 0x486

    sget v9, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    xor-int/lit16 v9, v9, -0x3ba

    const/16 v10, 0x9fa

    invoke-static {v7, v8, v9, v10}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۟۠ۡ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const/16 v7, 0x48d

    sget v8, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v8, v8, 0x8f

    const/16 v9, 0x562

    invoke-static {v1, v7, v8, v9}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41a00000    # 20.0f

    invoke-static {v6, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v0, 0xe0e095

    sget v1, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/2addr v0, v1

    invoke-static {v6, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v6, v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۤۦۤۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v6, v5}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v7, 0x0

    const/high16 v8, 0x41000000    # 8.0f

    invoke-static {p0, v8}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v8

    invoke-static {v6, v0, v1, v7, v8}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v4, v6}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const/16 v6, 0x490

    sget v7, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v7, v7, -0x70

    const/16 v8, 0x303

    invoke-static {v1, v6, v7, v8}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v1, 0x41600000    # 14.0f

    invoke-static {v0, v1}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v1, -0x666436

    sget v6, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/2addr v1, v6

    invoke-static {v0, v1}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {v0, v5}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/high16 v7, 0x41a00000    # 20.0f

    invoke-static {p0, v7}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v7

    invoke-static {v0, v1, v5, v6, v7}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v4, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/Button;

    invoke-direct {v0, p0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const/16 v5, 0x4a5

    sget v6, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v6, v6, -0x25e

    const/16 v7, 0xc1a

    invoke-static {v1, v5, v6, v7}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v0, v1}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۧ۟ۥۦ(Ljava/lang/Object;F)V

    sget v1, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v1, v1, -0x1c0

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣ۟ۢ۟ۤ(Ljava/lang/Object;I)V

    const/4 v1, 0x0

    const/4 v5, 0x1

    invoke-static {v0, v1, v5}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۨۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    const/high16 v1, 0x41c80000    # 25.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v1

    int-to-float v1, v1

    const v5, -0x97d6

    sget v6, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/2addr v5, v6

    invoke-static {v5, v1}, Lkevin/fun/hook/PPHook;->ۨۨۨ۠(IF)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/activity/ۣۦۡۥ;->ۤۥ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v5, 0x42400000    # 48.0f

    invoke-static {p0, v5}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v5

    sget v6, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v6, v6, -0x167

    invoke-direct {v1, v6, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v0, v1}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣ۟ۡۡۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda4;

    invoke-direct {v1, v2, p1}, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda4;-><init>(Landroid/app/Dialog;Lkevin/fun/hook/PPHook$VerifyCallback;)V

    invoke-static {v0, v1}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۣۣ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v4}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۢ۟۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v3}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥۢۨۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۦۧۤۡ(Ljava/lang/Object;)V

    const v0, 0x3f4ccccd    # 0.8f

    invoke-static {v4, v0}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۡۦ۟ۦ(Ljava/lang/Object;F)V

    const v0, 0x3f4ccccd    # 0.8f

    invoke-static {v4, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣ۟ۡۢ(Ljava/lang/Object;F)V

    const/4 v0, 0x0

    invoke-static {v4, v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۡۦۦۧ(Ljava/lang/Object;F)V

    invoke-static {v4}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۣۤۤ(Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۡۢۢ(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣۡۦ۠(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Landroidx/documentfile/ۡۢ۟ۥ;->ۣۤۦۦ(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v2, -0x334

    sget v1, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    int-to-long v4, v1

    xor-long/2addr v2, v4

    invoke-static {v0, v2, v3}, Landroidx/loader/ۥۧۨۤ;->ۣۣۧ۠(Ljava/lang/Object;J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۤ۟ۥ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v2

    const/16 v3, 0x4a9

    sget v4, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/lit16 v4, v4, 0x356

    const/16 v5, 0x51b

    invoke-static {v2, v3, v4, v5}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook;->ۥ۠۟(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x4b6

    sget v2, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v2, v2, -0xf4

    const/16 v3, 0x381

    invoke-static {v0, v1, v2, v3}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v11}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۥۥۥۤ(Ljava/lang/Object;Z)V

    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_1
    :sswitch_7
    const v0, 0xbebd

    goto :goto_3

    :sswitch_8
    if-eqz p1, :cond_1

    const v0, 0xbedc

    goto :goto_3

    :sswitch_9
    invoke-static {p1}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۣ۟۟ۢۦ(Ljava/lang/Object;)V

    :sswitch_a
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_a
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_7
        0x2d -> :sswitch_a
        0x4c -> :sswitch_9
        0xef -> :sswitch_8
    .end sparse-switch
.end method

.method static synthetic lambda$3(Landroid/app/Dialog;Lkevin/fun/hook/PPHook$VerifyCallback;Landroid/view/View;)V
    .locals 4

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x4c7

    sget v2, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v2, v2, -0x334

    const/16 v3, 0x29b

    invoke-static {v0, v1, v2, v3}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۥۥۥۤ(Ljava/lang/Object;Z)V

    invoke-static {p0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz p1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p1}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۣ۟۟ۢۦ(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic lambda$6(Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;)V
    .locals 13

    :try_start_0
    new-instance v2, Landroid/app/Dialog;

    const v0, -0x10301fc

    sget v1, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/2addr v0, v1

    invoke-direct {v2, p0, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/4 v0, 0x0

    invoke-static {v2, v0}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۡۡ۠(Ljava/lang/Object;Z)V

    new-instance v3, Landroid/widget/FrameLayout;

    invoke-direct {v3, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    sget v1, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v4, v1, -0x160

    invoke-direct {v0, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-static {v3, v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡ۠۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0x7fffffec

    sget v1, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/2addr v0, v1

    invoke-static {v3, v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۣۢۧ(Ljava/lang/Object;I)V

    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    invoke-static {v5, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    const/high16 v0, 0x41c00000    # 24.0f

    invoke-static {p0, v0}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v0

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v1

    const/high16 v6, 0x41c00000    # 24.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v6

    const/high16 v7, 0x41a00000    # 20.0f

    invoke-static {p0, v7}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v7

    invoke-static {v5, v0, v1, v6, v7}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/high16 v1, 0x43a00000    # 320.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v1

    sget v6, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v6, v6, -0x10e

    invoke-direct {v0, v1, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    sget v1, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v6, v1, -0x3d8

    iput v6, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-static {v5, v0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {p0, v0}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v0

    int-to-float v0, v0

    invoke-static {v4, v0}, Lkevin/fun/hook/PPHook;->ۨۨۨ۠(IF)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v0

    invoke-static {v5, v0}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const/16 v7, 0x4d8

    sget v8, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v8, v8, 0x226

    const/16 v9, 0x705

    invoke-static {v1, v7, v8, v9}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v1, 0x41900000    # 18.0f

    invoke-static {v0, v1}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v1, -0xe0e0aa

    sget v7, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/2addr v1, v7

    invoke-static {v0, v1}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/4 v1, 0x0

    const/4 v7, 0x1

    invoke-static {v0, v1, v7}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۤۦۤۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v0, v6}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/4 v1, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/high16 v9, 0x41400000    # 12.0f

    invoke-static {p0, v9}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v9

    invoke-static {v0, v1, v7, v8, v9}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v5, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Landroid/widget/TextView;

    invoke-direct {v7, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۧۡۡ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v8, 0x4e0

    sget v9, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v9, v9, 0x24a

    const/16 v10, 0x603

    invoke-static {v0, v8, v9, v10}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v8

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    :try_start_1
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۧۡۡ()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v9

    const/16 v10, 0x4f9

    sget v11, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v11, v11, -0x71

    const/16 v12, 0x9fd

    invoke-static {v9, v10, v11, v12}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v1, v9}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, v8}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤۡۨ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook;->ۦۤ۠ۧ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    if-nez v1, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_6
    const v0, 0xbe41

    goto :goto_2

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤۡۨ()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v9

    const/16 v10, 0x4fe

    sget v11, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v11, v11, -0x21a

    const/16 v12, 0x8f2

    invoke-static {v9, v10, v11, v12}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v1, v9}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, v8}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const v1, 0xbe7f

    :goto_3
    const v8, 0xbe90

    xor-int/2addr v1, v8

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_8
    invoke-static {v7, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41500000    # 13.0f

    invoke-static {v7, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v0, 0x999a5f

    sget v1, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/2addr v0, v1

    invoke-static {v7, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {v7, v6}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v6, 0x0

    const/high16 v8, 0x41800000    # 16.0f

    invoke-static {p0, v8}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v8

    invoke-static {v7, v0, v1, v6, v8}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v5, v7}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/Button;

    invoke-direct {v0, p0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const/16 v6, 0x523

    sget v7, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v7, v7, 0x172

    const/16 v8, 0x601

    invoke-static {v1, v6, v7, v8}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v1, 0x41600000    # 14.0f

    invoke-static {v0, v1}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۧ۟ۥۦ(Ljava/lang/Object;F)V

    invoke-static {v0, v4}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣ۟ۢ۟ۤ(Ljava/lang/Object;I)V

    const/4 v1, 0x0

    const/4 v6, 0x1

    invoke-static {v0, v1, v6}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۨۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    const/high16 v1, 0x41c80000    # 25.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v1

    int-to-float v1, v1

    const v6, 0xd57d10

    sget v7, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/2addr v6, v7

    invoke-static {v6, v1}, Lkevin/fun/hook/PPHook;->ۨۨۨ۠(IF)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/activity/ۣۦۡۥ;->ۤۥ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v6, 0x42300000    # 44.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v6

    invoke-direct {v1, v4, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v4, 0x41400000    # 12.0f

    invoke-static {p0, v4}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v4

    iput v4, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-static {v5, v0, v1}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda12;

    invoke-direct {v1, p0}, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda12;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v1}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۣۣ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/EditText;

    invoke-direct {v0, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const/16 v4, 0x529

    sget v6, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/lit16 v6, v6, 0x35d

    const/16 v7, 0x194

    invoke-static {v1, v4, v6, v7}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۣۢ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v1, 0x41600000    # 14.0f

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->۟ۤۧۨۥ(Ljava/lang/Object;F)V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroidx/loader/ۥۧۨۤ;->۟۟ۧۨ۠(Ljava/lang/Object;Z)V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢۨۢۨ(Ljava/lang/Object;I)V

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v1

    const/high16 v4, 0x41600000    # 14.0f

    invoke-static {p0, v4}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v4

    const/high16 v6, 0x41800000    # 16.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v6

    const/high16 v7, 0x41600000    # 14.0f

    invoke-static {p0, v7}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v7

    invoke-static {v0, v1, v4, v6, v7}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۥۣۨۦ(Ljava/lang/Object;IIII)V

    const v1, 0xe0e14f

    sget v4, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/2addr v1, v4

    invoke-static {v0, v1}, Landroidx/vectordrawable/۟ۧۢۧۨ;->۟ۡۦۦۨ(Ljava/lang/Object;I)V

    const/high16 v1, 0x41c80000    # 25.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v1

    int-to-float v1, v1

    const v4, 0xa09c9

    sget v6, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/2addr v4, v6

    invoke-static {v4, v1}, Lkevin/fun/hook/PPHook;->ۨۨۨ۠(IF)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۠۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    sget v4, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    sget v6, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v6, v6, -0x30e

    xor-int/lit16 v4, v4, 0x3bf

    invoke-direct {v1, v6, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v4, 0x41000000    # 8.0f

    invoke-static {p0, v4}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v4

    iput v4, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    const/high16 v4, 0x41800000    # 16.0f

    invoke-static {p0, v4}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v4

    iput v4, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-static {v5, v0, v1}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v4, 0x0

    invoke-static {v1, v4}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v4, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v4, v4, -0x25

    invoke-static {v1, v4}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v6

    const/16 v7, 0x52f

    sget v8, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v8, v8, 0x251

    const/16 v9, 0x487

    invoke-static {v6, v7, v8, v9}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v6, 0x41600000    # 14.0f

    invoke-static {v4, v6}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v6, 0x666409

    sget v7, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/2addr v6, v7

    invoke-static {v4, v6}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    sget v6, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v6, v6, 0x2

    invoke-static {v4, v6}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/high16 v6, 0x41a00000    # 20.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v6

    const/high16 v7, 0x41400000    # 12.0f

    invoke-static {p0, v7}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v7

    const/high16 v8, 0x41a00000    # 20.0f

    invoke-static {p0, v8}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v8

    const/high16 v9, 0x41400000    # 12.0f

    invoke-static {p0, v9}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v9

    invoke-static {v4, v6, v7, v8, v9}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    new-instance v6, Landroid/widget/TextView;

    invoke-direct {v6, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v7

    const/16 v8, 0x531

    sget v9, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v9, v9, -0x49

    const/16 v10, 0xac4

    invoke-static {v7, v8, v9, v10}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v7, 0x41600000    # 14.0f

    invoke-static {v6, v7}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v7, -0xd57de7

    sget v8, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/2addr v7, v8

    invoke-static {v6, v7}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-static {v6, v7, v8}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۤۦۤۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    sget v7, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v7, v7, -0x105

    invoke-static {v6, v7}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/high16 v7, 0x41a00000    # 20.0f

    invoke-static {p0, v7}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v7

    const/high16 v8, 0x41400000    # 12.0f

    invoke-static {p0, v8}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v8

    const/high16 v9, 0x41a00000    # 20.0f

    invoke-static {p0, v9}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v9

    const/high16 v10, 0x41400000    # 12.0f

    invoke-static {p0, v10}, Lkevin/fun/hook/PPHook;->ۧۧۡ(Ljava/lang/Object;F)I

    move-result v10

    invoke-static {v6, v7, v8, v9, v10}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v8, 0x0

    const/4 v9, -0x2

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-direct {v7, v8, v9, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v1, v4, v7}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v6, v7}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5, v1}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda13;

    invoke-direct {v1, v2, p0, p1}, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda13;-><init>(Landroid/app/Dialog;Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;)V

    invoke-static {v4, v1}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda14;

    invoke-direct {v1, v0, p0, v2, p1}, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda14;-><init>(Landroid/widget/EditText;Landroid/content/Context;Landroid/app/Dialog;Lkevin/fun/hook/PPHook$VerifyCallback;)V

    invoke-static {v6, v1}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v5}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۢ۟۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v3}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥۢۨۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۦۧۤۡ(Ljava/lang/Object;)V

    const v0, 0x3f666666    # 0.9f

    invoke-static {v5, v0}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۡۦ۟ۦ(Ljava/lang/Object;F)V

    const v0, 0x3f666666    # 0.9f

    invoke-static {v5, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣ۟ۡۢ(Ljava/lang/Object;F)V

    const/4 v0, 0x0

    invoke-static {v5, v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۡۦۦۧ(Ljava/lang/Object;F)V

    invoke-static {v5}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۣۤۤ(Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۡۢۢ(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣۡۦ۠(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Landroidx/documentfile/ۡۢ۟ۥ;->ۣۤۦۦ(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v2, 0x34a

    sget v1, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    int-to-long v4, v1

    xor-long/2addr v2, v4

    invoke-static {v0, v2, v3}, Landroidx/loader/ۥۧۨۤ;->ۣۣۧ۠(Ljava/lang/Object;J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۤ۟ۥ(Ljava/lang/Object;)V

    const v0, 0xbefb

    :goto_5
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :goto_6
    :sswitch_9
    return-void

    :sswitch_a
    const v1, 0xbe9e

    goto/16 :goto_3

    :sswitch_b
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x504

    sget v8, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v8, v8, 0x6d

    const/16 v9, 0xc16

    invoke-static {v0, v1, v8, v9}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    goto/16 :goto_4

    :sswitch_c
    const v0, 0xbf1a

    goto :goto_5

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v2

    const/16 v3, 0x533

    sget v4, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v4, v4, 0x78

    const/16 v5, 0x9a2

    invoke-static {v2, v3, v4, v5}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook;->ۥ۠۟(Ljava/lang/Object;)V

    const v0, 0xc202

    :goto_7
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_7

    :sswitch_d
    if-eqz p1, :cond_2

    const v0, 0xc25f

    goto :goto_7

    :cond_2
    :sswitch_e
    const v0, 0xc240

    goto :goto_7

    :sswitch_f
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x53d

    sget v2, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v2, v2, 0x171

    const/16 v3, 0x59d

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۢۧۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->۠ۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_6

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_8
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_7
        0xb97b -> :sswitch_6
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_9
        0x1f7 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_d
        0x32 -> :sswitch_e
        0x4c -> :sswitch_f
        0x53 -> :sswitch_9
    .end sparse-switch
.end method

.method static synthetic lambda$7(Landroid/content/Context;Landroid/view/View;)V
    .locals 6

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const/16 v2, 0x545

    sget v3, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v3, v3, 0x163

    const/16 v4, 0xbe3

    invoke-static {v1, v2, v3, v4}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v2

    const/16 v3, 0x55f

    sget v4, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v4, v4, -0xf5

    const/16 v5, 0x9bc

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroidx/activity/ۣۦۡۥ;->۟ۡۦۧۥ(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-static {p0, v0}, Landroidx/loader/ۣ۟۟ۧ۠;->۟ۡۡۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :goto_1
    :sswitch_0
    return-void

    :sswitch_1
    const/16 v0, 0x66f

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x575

    sget v2, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v2, v2, -0x3ab

    const/16 v3, 0x688

    invoke-static {v0, v1, v2, v3}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/PPHook;->ۡۡۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic lambda$8(Landroid/app/Dialog;Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;Landroid/view/View;)V
    .locals 5

    invoke-static {p0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x584

    sget v2, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v2, v2, -0xe3

    const/16 v3, 0x802

    invoke-static {v0, v1, v2, v3}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const/16 v2, 0x592

    sget v3, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v3, v3, -0x25e

    const/16 v4, 0x77e

    invoke-static {v1, v2, v3, v4}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۧۢ([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2, p2}, Lkevin/fun/hook/PPHook;->ۥ۠۟ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)V

    invoke-static {}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۡۢۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "x3KIrAQIx9xrVhSdYFKBZTWksy"

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۢۥۥ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic lambda$9(Landroid/widget/EditText;Landroid/content/Context;Landroid/app/Dialog;Lkevin/fun/hook/PPHook$VerifyCallback;Landroid/view/View;)V
    .locals 4

    invoke-static {p0}, Landroidx/drawerlayout/ۤۨۡۤ;->۟۠۟ۡۡ(Ljava/lang/Object;)Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroidx/startup/ۤۧۥۣ;->۟۠ۧۨۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->۠۠ۦۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۥۦ۟()Ljava/util/Locale;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->۟ۢۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x596

    sget v2, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v2, v2, 0x3a6

    const/16 v3, 0x1b0

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkevin/fun/hook/PPHook;->ۡۡۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    :sswitch_3
    return-void

    :sswitch_4
    invoke-static {p2}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    invoke-static {p1, v1, p3}, Lkevin/fun/hook/PPHook;->۟۟ۤۢۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣ۟()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_5
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_6
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_7
    const-string v0, "Eh9y3AVErdtLTW452DlXUcu1E6ol"

    invoke-static {v0}, Landroidx/activity/ۤۧۧۧ;->ۣۣۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_6
        0x1d7 -> :sswitch_3
        0x1f4 -> :sswitch_7
    .end sparse-switch
.end method

.method public static loadVipListFromCloud()V
    .locals 2

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda11;

    invoke-direct {v1}, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda11;-><init>()V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۥۦۤۡ(Ljava/lang/Object;)V

    return-void
.end method

.method private static log(Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۧ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "PbsmESaYQNxSaYzXTg6YvUBo"

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۢۥۥ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method private static normalizeValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez p0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/documentfile/ۡۢ۟ۥ;->۠۠ۦۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroidx/emoji2/ۢۧۡۧ;->ۤۥۨۢ(Ljava/lang/Object;)I

    move-result v3

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v3, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v2

    const/16 v3, 0x59c

    sget v4, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v4, v4, -0x3c3

    const/16 v5, 0xc40

    invoke-static {v2, v3, v4, v5}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/loader/ۥۧۨۤ;->ۦ۟ۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v3, :cond_2

    const v2, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v2, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v2

    const/16 v3, 0x5a0

    sget v4, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v4, v4, -0x44

    const/16 v5, 0x390

    invoke-static {v2, v3, v4, v5}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/loader/ۥۧۨۤ;->ۦ۟ۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_9
    const v2, 0xbebd

    goto :goto_3

    :sswitch_a
    if-eqz v3, :cond_3

    const v2, 0xbedc

    goto :goto_3

    :sswitch_b
    move-object v0, v1

    :sswitch_c
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_c
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_8
        0xb939 -> :sswitch_c
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_b
        0x4c -> :sswitch_c
        0xef -> :sswitch_a
    .end sparse-switch
.end method

.method private static readHttpResponse(Ljava/net/HttpURLConnection;I)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v2, 0x0

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    const/16 v0, 0xc8

    if-lt p1, v0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x12c

    if-ge p1, v0, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    :try_start_0
    invoke-static {p0}, Landroidx/customview/ۤۡۥ;->۠ۢ۠۟(Ljava/lang/Object;)Ljava/io/InputStream;

    move-result-object v4

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {p0}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۣۣۨۥ(Ljava/lang/Object;)Ljava/io/InputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    move-result-object v4

    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v0, 0xbebd

    goto :goto_3

    :sswitch_9
    if-nez v4, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_a
    const v0, 0xbefb

    :goto_4
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :sswitch_b
    const v0, 0xbf39

    goto :goto_4

    :sswitch_c
    const/4 v0, 0x0

    :try_start_1
    invoke-static {v0}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۨ۠ۦ۟(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const v0, 0xc202

    :goto_5
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_d
    const v0, 0xc221

    goto :goto_5

    :catchall_0
    move-exception v0

    :sswitch_e
    const v0, 0xc27e

    :goto_6
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :sswitch_f
    const v0, 0xc2bc

    goto :goto_6

    :sswitch_10
    const/4 v0, 0x0

    :try_start_2
    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۤۦۨۡ(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const v0, 0xc2fa

    :goto_7
    const v1, 0xc30b

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_7

    goto :goto_7

    :sswitch_11
    const v0, 0xc5a4

    goto :goto_7

    :catchall_1
    move-exception v0

    :sswitch_12
    const v0, 0xc601

    :goto_8
    const v1, 0xc612

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_8

    goto :goto_8

    :sswitch_13
    if-eqz v4, :cond_3

    const v0, 0xc65e

    goto :goto_8

    :cond_3
    :sswitch_14
    const v0, 0xc63f

    goto :goto_8

    :sswitch_15
    :try_start_3
    invoke-static {v4}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۦۣۦۣ(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    const v0, 0xc67d

    :goto_9
    const v1, 0xc68e

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_9

    goto :goto_9

    :goto_a
    :sswitch_16
    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v0

    :goto_b
    :sswitch_17
    return-object v0

    :sswitch_18
    const v0, 0xc69c

    goto :goto_9

    :sswitch_19
    :try_start_4
    new-instance v3, Ljava/io/InputStreamReader;

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x5a9

    sget v5, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v5, v5, 0x262

    const/16 v6, 0x6d0

    invoke-static {v0, v1, v5, v6}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v4, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_a

    :try_start_5
    new-instance v1, Ljava/io/BufferedReader;

    invoke-direct {v1, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_b

    :try_start_6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    :sswitch_1a
    invoke-static {v1}, Landroidx/loader/ۥۧۨۤ;->ۦۥۢ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const v0, 0xc984

    :goto_c
    const v6, 0xc995

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_a

    goto :goto_c

    :sswitch_1b
    if-nez v5, :cond_4

    const v0, 0xc9e1

    goto :goto_c

    :cond_4
    :sswitch_1c
    const v0, 0xc9c2

    goto :goto_c

    :sswitch_1d
    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_c

    move-result-object v0

    :try_start_7
    invoke-static {v1}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۨ۠ۦ۟(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    const v1, 0xca00

    :goto_d
    const v2, 0xca11

    xor-int/2addr v1, v2

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto :goto_d

    :goto_e
    :pswitch_1
    :try_start_8
    invoke-static {v3}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۤۦۨۡ(Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    const v1, 0xca7c

    :goto_f
    const v2, 0xca8d

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_b

    goto :goto_f

    :sswitch_1e
    const v1, 0xcd26

    goto :goto_f

    :pswitch_2
    const v1, 0xca1f

    goto :goto_d

    :catchall_2
    move-exception v1

    :sswitch_1f
    const v1, 0xcd83

    :goto_10
    const v2, 0xcd94

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_c

    goto :goto_10

    :sswitch_20
    if-eqz v4, :cond_5

    const v1, 0xcde0

    goto :goto_10

    :cond_5
    :sswitch_21
    const v1, 0xcdc1

    goto :goto_10

    :sswitch_22
    :try_start_9
    invoke-static {v4}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۦۣۦۣ(Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    const v1, 0xcdff

    :goto_11
    const v2, 0xce10

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_d

    goto :goto_11

    :sswitch_23
    const v1, 0xce1e

    goto :goto_11

    :sswitch_24
    :try_start_a
    invoke-static {v2, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_c

    const v0, 0xd106

    :goto_12
    const v5, 0xd117

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_e

    goto :goto_12

    :sswitch_25
    const v0, 0xd125

    goto :goto_12

    :catchall_3
    move-exception v0

    move-object v1, v2

    move-object v3, v2

    move-object v4, v2

    :goto_13
    const v2, 0xd182

    :goto_14
    const v5, 0xd193

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_f

    goto :goto_14

    :sswitch_26
    if-eqz v1, :cond_6

    const v2, 0xd1df

    goto :goto_14

    :cond_6
    :sswitch_27
    const v2, 0xd1c0

    goto :goto_14

    :sswitch_28
    :try_start_b
    invoke-static {v1}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۨ۠ۦ۟(Ljava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    const v1, 0xd1fe

    :goto_15
    const v2, 0xd20f

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_10

    goto :goto_15

    :sswitch_29
    const v1, 0xd4a8

    goto :goto_15

    :catchall_4
    move-exception v1

    :sswitch_2a
    const v1, 0xd505

    :goto_16
    const v2, 0xd516

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_11

    goto :goto_16

    :sswitch_2b
    if-eqz v3, :cond_7

    const v1, 0xd562

    goto :goto_16

    :cond_7
    :sswitch_2c
    const v1, 0xd543

    goto :goto_16

    :sswitch_2d
    :try_start_c
    invoke-static {v3}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۤۦۨۡ(Ljava/lang/Object;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    const v1, 0xd581

    :goto_17
    const v2, 0xd592

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_12

    goto :goto_17

    :sswitch_2e
    const v1, 0xd5a0

    goto :goto_17

    :catchall_5
    move-exception v1

    :sswitch_2f
    const v1, 0xd888

    :goto_18
    const v2, 0xd899

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_13

    goto :goto_18

    :sswitch_30
    if-eqz v4, :cond_8

    const v1, 0xd8e5

    goto :goto_18

    :cond_8
    :sswitch_31
    const v1, 0xd8c6

    goto :goto_18

    :sswitch_32
    :try_start_d
    invoke-static {v4}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۦۣۦۣ(Ljava/lang/Object;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    const v1, 0xd904

    :goto_19
    const v2, 0xd915

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_14

    goto :goto_19

    :sswitch_33
    const v1, 0xd923

    goto :goto_19

    :catchall_6
    move-exception v1

    :sswitch_34
    throw v0

    :catchall_7
    move-exception v0

    goto/16 :goto_a

    :catchall_8
    move-exception v1

    goto/16 :goto_e

    :catchall_9
    move-exception v1

    goto/16 :goto_b

    :catchall_a
    move-exception v0

    move-object v1, v2

    move-object v3, v2

    goto/16 :goto_13

    :catchall_b
    move-exception v0

    move-object v1, v2

    goto/16 :goto_13

    :catchall_c
    move-exception v0

    goto/16 :goto_13

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_19
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_19
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x35 -> :sswitch_e
        0x1f7 -> :sswitch_b
        0x7eef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_d
        0x32 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_f
        0x33 -> :sswitch_12
        0x54 -> :sswitch_10
        0xf1 -> :sswitch_f
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_11
        0x6af -> :sswitch_12
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_13
        0x2d -> :sswitch_16
        0x32 -> :sswitch_14
        0x4c -> :sswitch_15
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_16
        0xf3 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1b
        0x36 -> :sswitch_1c
        0x57 -> :sswitch_24
        0x74 -> :sswitch_1d
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :sswitch_data_b
    .sparse-switch
        0xf1 -> :sswitch_1e
        0x7ab -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0x17 -> :sswitch_20
        0x36 -> :sswitch_21
        0x55 -> :sswitch_17
        0x74 -> :sswitch_22
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0xe -> :sswitch_17
        0x3ef -> :sswitch_23
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0x11 -> :sswitch_25
        0x32 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_26
        0x32 -> :sswitch_27
        0x4c -> :sswitch_28
        0x53 -> :sswitch_2a
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x3f1 -> :sswitch_29
        0x6a7 -> :sswitch_2a
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x13 -> :sswitch_2b
        0x32 -> :sswitch_2c
        0x55 -> :sswitch_2f
        0x74 -> :sswitch_2d
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_2e
        0x32 -> :sswitch_2f
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x11 -> :sswitch_30
        0x3e -> :sswitch_31
        0x5f -> :sswitch_34
        0x7c -> :sswitch_32
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_33
        0x36 -> :sswitch_34
    .end sparse-switch
.end method

.method private static saveActivatedAccount(Ljava/lang/String;)V
    .locals 6

    const/4 v5, 0x1

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const/16 v2, 0x5ae

    sget v3, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v3, v3, 0x1f8

    const/16 v4, 0x3ef

    invoke-static {v1, v2, v3, v4}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۧۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v3

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v3, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    move-object v0, p0

    :goto_2
    :sswitch_5
    invoke-static {v2, v0}, Landroidx/core/ۧ۟ۤۨ;->ۨۢۢۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x5c1

    sget v2, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v2, v2, -0x11c

    const/16 v3, 0xaa0

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/core/ۧ۟ۤۨ;->ۨۢۢۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v0

    const/16 v1, 0x5cf

    sget v2, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v2, v2, -0x72

    const/16 v3, 0x564

    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۥۥۥۤ(Ljava/lang/Object;Z)V

    return-void

    :sswitch_6
    invoke-static {p0}, Lkevin/fun/hook/PPHook;->۟ۥۨۥۤ(Ljava/lang/Object;)Z

    move-result v3

    const/16 v1, 0x748

    :goto_3
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_3

    :sswitch_7
    if-nez v3, :cond_1

    const v1, 0xbe60

    goto :goto_3

    :cond_1
    :sswitch_8
    const v1, 0xbe41

    goto :goto_3

    :sswitch_9
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۨۤ۠ۦ()[S

    move-result-object v1

    const/16 v3, 0x5c0

    const/16 v4, 0x435

    invoke-static {v1, v3, v5, v4}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_5
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch
.end method

.method private static showActivateDialog(Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;)V
    .locals 4

    const/4 v1, 0x0

    const-string v3, "\u06e8\u06e3\u06e0"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    new-instance v0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda5;

    invoke-direct {v0, p0, p1}, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda5;-><init>(Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;)V

    const-string v1, "\u06e0\u06e3\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v2, v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const-string v1, "\u06e3\u06e4\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۦۨ۟ۦ()Landroid/os/Handler;

    move-result-object v1

    const-string v3, "\u06e0\u06e6\u06e2"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aab44 -> :sswitch_0
        0x1ab6a2 -> :sswitch_2
        0x1ac945 -> :sswitch_1
    .end sparse-switch
.end method

.method private static showLoadingDialog(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    const/4 v1, 0x0

    const-string v3, "\u06e5\u06e8\u06e1"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Lkevin/fun/hook/PPHook;->ۦۨ۟ۦ()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "\u06e0\u06e4\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    new-instance v1, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda10;

    invoke-direct {v1, p0, p1}, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda10;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const-string v3, "\u06e3\u06e2\u06e1"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v0, v2}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const-string v1, "\u06e1\u06e3\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aab5f -> :sswitch_0
        0x1aaf04 -> :sswitch_2
        0x1ab662 -> :sswitch_1
    .end sparse-switch
.end method

.method private static showResultDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLkevin/fun/hook/PPHook$VerifyCallback;)V
    .locals 7

    const/4 v0, 0x0

    const-string v2, "\u06e3\u06e1\u06e5"

    move-object v6, v0

    move-object v1, v0

    move v3, p3

    :goto_0
    invoke-static {v2}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    return-void

    :sswitch_0
    invoke-static {v6, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-string v0, "\u06df\u06e8\u06e1"

    move-object v2, v0

    goto :goto_0

    :sswitch_1
    new-instance v0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda15;

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda15;-><init>(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Lkevin/fun/hook/PPHook$VerifyCallback;)V

    const-string v2, "\u06e8\u06e8\u06df"

    move-object v1, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۦۨ۟ۦ()Landroid/os/Handler;

    move-result-object v0

    const-string v2, "\u06e6\u06e8\u06e2"

    move-object v6, v0

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1ab647 -> :sswitch_2
        0x1ac260 -> :sswitch_1
        0x1ac9df -> :sswitch_0
    .end sparse-switch
.end method

.method private static showToast(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez p0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۦۨ۟ۦ()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda16;

    invoke-direct {v1, p0, p1}, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda16;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_3
        0xef -> :sswitch_2
    .end sparse-switch
.end method

.method private static showVipWelcomeDialog(Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;)V
    .locals 4

    const/4 v1, 0x0

    const-string v3, "\u06e2\u06e2\u06e2"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return-void

    :sswitch_0
    invoke-static {}, Lkevin/fun/hook/PPHook;->ۦۨ۟ۦ()Landroid/os/Handler;

    move-result-object v1

    const-string v3, "\u06e3\u06e2\u06e0"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    new-instance v0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda18;

    invoke-direct {v0, p0, p1}, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda18;-><init>(Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;)V

    const-string v1, "\u06e7\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v2, v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const-string v1, "\u06e5\u06e0\u06e8"

    move-object v3, v1

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcdb -> :sswitch_2
        0x1ab2a2 -> :sswitch_0
        0x1ab661 -> :sswitch_1
    .end sparse-switch
.end method

.method public static updateCurrentDouyinUser(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {p0}, Lkevin/fun/hook/PPHook;->ۣۣ۟ۤ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/PPHook;->sCurrentDyUid:Ljava/lang/String;

    invoke-static {p1}, Lkevin/fun/hook/PPHook;->ۣۣ۟ۤ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/PPHook;->sCurrentDyNickname:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/PPHook;->۟۠۟ۦ۟()Z

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/viewpager/ۣۢ۟ۤ;->ۨ۟ۧ()V

    :sswitch_3
    invoke-static {}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۣ۟ۦۣۡ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "FbrNOiTARCFP"

    invoke-static {v0}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch
.end method

.method public static ۟۟۟۟ۦ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/activity/ۨ۠۟ۧ;->ۤۥۡ۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/PPHook$ActivateResult;

    iget-boolean v0, p0, Lkevin/fun/hook/PPHook$ActivateResult;->ok:Z

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟۟ۤۢۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/startup/ۤۧۥۣ;->۟۠ۨۢۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lkevin/fun/hook/PPHook$VerifyCallback;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/PPHook;->activateCode(Landroid/content/Context;Ljava/lang/String;Lkevin/fun/hook/PPHook$VerifyCallback;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟۠۟ۦ۟()Z
    .locals 2

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۡۧۦۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-boolean v0, Lkevin/fun/hook/PPHook;->sVipListLoaded:Z

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۡۡۤۡ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    check-cast p1, Lkevin/fun/hook/PPHook$VerifyCallback;

    invoke-static {p0, p1}, Lkevin/fun/hook/PPHook;->showVipWelcomeDialog(Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۡۢۤۧ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۢۡۡۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/PPHook;->saveActivatedAccount(Ljava/lang/String;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۡۧ۠ۡ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/PPHook;->fetchUrlContent(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۢ۟ۡۧ(Ljava/lang/Object;I)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۢۢۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/net/HttpURLConnection;

    invoke-static {p0, p1}, Lkevin/fun/hook/PPHook;->readHttpResponse(Ljava/net/HttpURLConnection;I)Ljava/lang/String;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۣ۟ۤ۠(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۥۢ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/PPHook;->normalizeValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۤۤۡۧ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۤۦ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/PPHook$ActivateResult;

    iget v0, p0, Lkevin/fun/hook/PPHook$ActivateResult;->count:I

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۥۣۤۤ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠ۦۤۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/PPHook$ActivateResult;

    iget-object v0, p0, Lkevin/fun/hook/PPHook$ActivateResult;->status:Ljava/lang/String;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۥۨۥۤ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۧ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/PPHook;->isAccountActivated(Ljava/lang/String;)Z

    move-result v0

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۦۥ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۢۡۡۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    check-cast p1, Lkevin/fun/hook/PPHook$VerifyCallback;

    invoke-static {p0, p1}, Lkevin/fun/hook/PPHook;->showActivateDialog(Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۧ۟ۤۨ()Landroid/app/Dialog;
    .locals 2

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/PPHook;->loadingDialog:Landroid/app/Dialog;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۧۦ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣ۟ۦۣۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lkevin/fun/hook/PPHook;->showLoadingDialog(Landroid/content/Context;Ljava/lang/String;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۡۡۥ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lkevin/fun/hook/PPHook;->showToast(Landroid/content/Context;Ljava/lang/String;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۢۦۤۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥ۠ۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/PPHook$ActivateResult;

    iget-object v0, p0, Lkevin/fun/hook/PPHook$ActivateResult;->error:Ljava/lang/String;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۢۧۤ()Ljava/util/Set;
    .locals 2

    invoke-static {}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۢۡۡۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/PPHook;->sVipUidSet:Ljava/util/Set;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۥ۠۟(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/PPHook;->log(Ljava/lang/String;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۥ۠۟ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣۤۥۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    check-cast p4, Lkevin/fun/hook/PPHook$VerifyCallback;

    invoke-static {p0, p1, p2, p3, p4}, Lkevin/fun/hook/PPHook;->showResultDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLkevin/fun/hook/PPHook$VerifyCallback;)V

    :sswitch_3
    invoke-static {}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۤ۠ۧۡ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "IwlLXzpvLxkKX1Nn4hzFsozxfkHO"

    invoke-static {v0}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۧۢ۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦۤ۠ۧ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/drawerlayout/ۤۨۡۤ;->ۨۧۢۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/PPHook;->isInvalidUid(Ljava/lang/String;)Z

    move-result v0

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦۨ۟ۦ()Landroid/os/Handler;
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/PPHook;->mainHandler:Landroid/os/Handler;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۧۧ۟ۤ()V
    .locals 2

    invoke-static {}, Landroidx/startup/ۤۧۥۣ;->۟۠ۨۢۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/PPHook;->dismissLoadingDialog()V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۧۧۡ(Ljava/lang/Object;F)I
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۢۥ۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    invoke-static {p0, p1}, Lkevin/fun/hook/PPHook;->dp(Landroid/content/Context;F)I

    move-result v0

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۨۤ۠ۦ()[S
    .locals 2

    invoke-static {}, Landroidx/activity/ۨ۠۟ۧ;->ۤۥۡ۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/PPHook;->short:[S

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۨۤۡۨ()Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/PPHook;->sCurrentDyUid:Ljava/lang/String;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۨۧۡۡ()Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۥۢ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/PPHook;->sCurrentDyNickname:Ljava/lang/String;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۨۨۨ۠(IF)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۤۦ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0, p1}, Lkevin/fun/hook/PPHook;->createRoundBg(IF)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method
