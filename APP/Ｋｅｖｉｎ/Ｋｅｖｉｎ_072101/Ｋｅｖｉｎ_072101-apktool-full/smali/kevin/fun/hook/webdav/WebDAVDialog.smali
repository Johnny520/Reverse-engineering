.class public Lkevin/fun/hook/webdav/WebDAVDialog;
.super Ljava/lang/Object;


# static fields
.field private static final MAIN_HANDLER:Landroid/os/Handler;

.field private static final REQ_CODE_PICK_BACKUP_FILE:I = 0x2711

.field private static final TAG:Ljava/lang/String;

.field private static passwordEditText:Landroid/widget/EditText;

.field private static pathEditText:Landroid/widget/EditText;

.field private static pendingContext:Landroid/content/Context;

.field private static pendingRestoreCallback:Lkevin/fun/hook/webdav/WebDAVConfig$BackupCallback;

.field private static final short:[S

.field private static urlEditText:Landroid/widget/EditText;

.field private static usernameEditText:Landroid/widget/EditText;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x1ad

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/webdav/WebDAVDialog;->short:[S

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v0

    const/4 v1, 0x0

    sget v2, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v2, v2, 0x16b

    const/16 v3, 0xb91

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/webdav/WebDAVDialog;->TAG:Ljava/lang/String;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۧۤۡۨ()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lkevin/fun/hook/webdav/WebDAVDialog;->MAIN_HANDLER:Landroid/os/Handler;

    return-void

    :array_0
    .array-data 2
        0x3b81s
        0xbdas
        0xbf4s
        0xbe7s
        0xbf8s
        0xbffs
        0x3b80s
        0xbd3s
        0xbf0s
        0xbf2s
        0xbfas
        0xbe4s
        0xbe1s
        -0x7a87s
        0x5b8fs
        0x512cs
        0x72ebs
        0x68fcs
        0x6962s
        0x6da9s
        0x72ebs
        0x5387s
        0x554cs
        0x6babs
        0x5bb7s
        0x5580s
        0x427as
        0xca9s
        0xca9s
        0xca9s
        0x45bs
        0x454s
        0x45es
        0x448s
        0x455s
        0x453s
        0x45es
        0x414s
        0x453s
        0x454s
        0x44es
        0x45fs
        0x454s
        0x44es
        0x414s
        0x45bs
        0x459s
        0x44es
        0x453s
        0x455s
        0x454s
        0x414s
        0x475s
        0x46as
        0x47fs
        0x474s
        0x465s
        0x47es
        0x475s
        0x479s
        0x46fs
        0x477s
        0x47fs
        0x474s
        0x46es
        0x54ds
        0x542s
        0x548s
        0x55es
        0x543s
        0x545s
        0x548s
        0x502s
        0x545s
        0x542s
        0x558s
        0x549s
        0x542s
        0x558s
        0x502s
        0x54fs
        0x54ds
        0x558s
        0x549s
        0x54bs
        0x543s
        0x55es
        0x555s
        0x502s
        0x563s
        0x57cs
        0x569s
        0x562s
        0x56ds
        0x56es
        0x560s
        0x569s
        0x2b6s
        0x2a7s
        0x2a7s
        0x2bbs
        0x2bes
        0x2b4s
        0x2b6s
        0x2a3s
        0x2bes
        0x2b8s
        0x2b9s
        0x2f8s
        0x2bds
        0x2a4s
        0x2b8s
        0x2b9s
        0x7bfs
        0x7b0s
        0x7bas
        0x7acs
        0x7b1s
        0x7b7s
        0x7bas
        0x7f0s
        0x7aes
        0x7acs
        0x7b1s
        0x7a8s
        0x7b7s
        0x7bas
        0x7bbs
        0x7acs
        0x7f0s
        0x7bbs
        0x7a6s
        0x7aas
        0x7acs
        0x7bfs
        0x7f0s
        0x797s
        0x790s
        0x797s
        0x78as
        0x797s
        0x79fs
        0x792s
        0x781s
        0x78bs
        0x78cs
        0x797s
        0x6630s
        0x6f05s
        0x6183s
        0x5cd0s
        0x6657s
        0x4d26s
        -0x6c27s
        0x6139s
        0x55b8s
        0x5385s
        0x554es
        0x4214s
        0x6ce7s
        0x5588s
        0xcabs
        0xcabs
        0xcabs
        0x6824s
        -0x7146s
        0x4b42s
        0x541s
        0x541s
        0x541s
        0x5da3s
        0x5b68s
        0x4c32s
        0x5ba4s
        0x4c5es
        0x28ds
        0x28ds
        0x28ds
        0x5e85s
        0x497fs
        0x498cs
        0x67e0s
        0x5e8fs
        -0x2c3bs
        -0x28c7s
        0xbd8s
        0x6cd4s
        0x5cc8s
        0x52ffs
        0x4505s
        0x6060s
        0x507cs
        0x5e4bs
        0x49b1s
        0x5012s
        0x47e8s
        0x6977s
        0x5018s
        0x2797s
        -0x67s
        0x1b6s
        0x1c1s
        0x1f3s
        0x1f4s
        0x1d2s
        0x1d7s
        0x1c0s
        0x1b6s
        0x4f07s
        0x5891s
        0x4f6bs
        0x5e8ds
        0x7f8as
        0xa82s
        0xaf5s
        0xac7s
        0xac0s
        0xae6s
        0xae3s
        0xaf4s
        0x53b9s
        0x4443s
        0x696cs
        0x7d82s
        0x58a9s
        -0x7d2as
        0x7e7s
        0x7d5s
        0x7d2s
        0x7f4s
        0x7f1s
        0x7e6s
        0x790s
        0x5080s
        0x50f0s
        0x96cs
        0x970s
        0x970s
        0x974s
        0x977s
        0x93es
        0x92bs
        0x92bs
        0x961s
        0x97cs
        0x965s
        0x969s
        0x974s
        0x968s
        0x961s
        0x92as
        0x967s
        0x96bs
        0x969s
        0x92bs
        0x960s
        0x965s
        0x972s
        0x92bs
        -0x75dcs
        0x584fs
        0x7e4s
        0x624cs
        0x493ds
        0x5ef2s
        0x53c6s
        0xb44s
        0xb6as
        0xb79s
        0xb66s
        0xb61s
        0xb4ds
        0xb6es
        0xb6cs
        0xb64s
        0xb7as
        0xb7fs
        0xb20s
        0x744bs
        0x6354s
        0x556es
        0x14cs
        -0x6e33s
        0x7ad2s
        0xacfs
        0xad9s
        0xac3s
        0xac4s
        0xaf6s
        0xad3s
        0xadbs
        0xad7s
        0xadfs
        0xadas
        0xa98s
        0xad5s
        0xad9s
        0xadbs
        0x5335s
        0x70f2s
        0x8dcs
        0x6b7bs
        0x6fb0s
        0x70f2s
        0x4ccs
        0x4ccs
        0x4ccs
        0x4ccs
        0x498s
        0x4f8s
        0x4f8s
        0x498s
        0x4d1s
        0x4d1s
        0x495s
        0x4fds
        0x4fds
        0x48fs
        0x4d8s
        0x4d8s
        0x48fs
        0x4c6s
        0x4c6s
        0x4494s
        0x61bfs
        0x440fs
        0x5399s
        0x4463s
        -0xa7cs
        0x56a5s
        0x6d95s
        -0x7a9cs
        -0x7d0ds
        0x442es
        0x53b8s
        0x4442s
        0x2fces
        0x8fds
        0x552fs
        0x57dds
        0x5cf2s
        0x6b0fs
        0x7fe1s
        0x6dads
        0x6bb3s
        0x51das
        0x4620s
        0x6b32s
        -0x7254s
        -0x7659s
        0x65dcs
        0x4a55s
        0x5dc3s
        0x4a39s
        0x4a4as
        0x64b9s
        0x5dd6s
        0x5623s
        -0x6d43s
        0x6a66s
        0x5735s
        -0x6688s
        0x775bs
        0x5104s
        -0x7af0s
        0x80fs
        0x815s
        0xac3s
        0xac3s
        0xac3s
        0xac3s
        0xa97s
        0xaf7s
        0xaf7s
        0xa97s
        0xades
        0xades
        0xa9as
        0xaf2s
        0xaf2s
        0xa80s
        0xad7s
        0xad7s
        0xa80s
        0xac9s
        0xac9s
        0x4ad6s
        0x6ffds
        0x63f0s
        0x53ecs
        0x5ddbs
        0x4a21s
        -0x43as
        0x5edfs
        0x65efs
        -0x72e2s
        -0x7577s
        0x65e9s
        0x55f5s
        0x5bc2s
        0x4c38s
        -0x72aes
        0x5eces
        0x573cs
        0x685s
        0x6f2s
        0x6c0s
        0x6c7s
        0x6e1s
        0x6e4s
        0x6f3s
        0x685s
        0x5195s
        0x51e5s
        -0x7d3cs
        0x5158s
        0x58aas
        0x7c1bs
        0x6b04s
        0x5d3es
        -0x7343s
        0x5f21s
        0x56d3s
        0x5c8cs
        0x7f4bs
        0x765s
        0x64c2s
        0x6009s
        0x7f4bs
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "Iv1Ko6SttwL9mvV5LxRGgYoC4h"

    invoke-static {v0}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۣۡۧۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

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

.method static bridge synthetic _$$Nest$smshowSafeToast(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۢۥۢ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static bridge synthetic _$$Nest$smupdateLocalStatusText(Landroid/widget/TextView;Landroid/content/Context;)V
    .locals 2

    invoke-static {p0, p1}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۨۥۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/loader/ۡۢۢ;->ۢۥۧ۟()I

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
    const-string v0, "cDcaDorYGT8sBoDIHvjwm7ZP"

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۣۨۤ(Ljava/lang/String;)Ljava/lang/String;

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

.method private static createDivider(Landroid/content/Context;)Landroid/view/View;
    .locals 8

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v3, "\u06e5\u06e8\u06e2"

    move-object v0, v1

    move-object v2, v1

    move v4, v5

    move v6, v5

    move v7, v5

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    sget v5, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    const-string v1, "\u06df\u06e4\u06e5"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_0
    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e0\u06df\u06e8"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    const v1, -0x111383

    xor-int v5, v1, v6

    const-string v1, "\u06e6\u06e5\u06df"

    move-object v3, v1

    move v7, v5

    goto :goto_0

    :sswitch_2
    sget v5, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    const-string v1, "\u06e5\u06e4\u06e7"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_3
    new-instance v1, Landroid/view/View;

    invoke-direct {v1, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const-string v3, "\u06e2\u06e1\u06e0"

    move-object v2, v1

    goto :goto_0

    :sswitch_4
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v7, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const-string v1, "\u06e7\u06e5\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_5
    xor-int/lit16 v5, v6, 0x3be

    const-string v1, "\u06e5\u06e0\u06e8"

    move-object v3, v1

    move v7, v5

    goto :goto_0

    :sswitch_6
    invoke-static {v2, v7}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۤۥۧ(Ljava/lang/Object;I)V

    const-string v1, "\u06e5\u06e6\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_7
    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {p0, v1}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v4

    const-string v1, "\u06e7\u06e0\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_8
    return-object v2

    :sswitch_data_0
    .sparse-switch
        0x1aa7a0 -> :sswitch_5
        0x1aaac9 -> :sswitch_2
        0x1ab281 -> :sswitch_7
        0x1abdad -> :sswitch_4
        0x1abe28 -> :sswitch_1
        0x1abe62 -> :sswitch_8
        0x1abe9f -> :sswitch_3
        0x1ac200 -> :sswitch_6
        0x1ac5c8 -> :sswitch_0
    .end sparse-switch
.end method

.method private static createDouyinButton(Landroid/content/Context;Ljava/lang/String;I)Landroid/widget/TextView;
    .locals 11

    const/high16 v10, 0x41400000    # 12.0f

    const/high16 v9, 0x41200000    # 10.0f

    const/4 v1, 0x0

    const/4 v6, 0x0

    const-string v4, "\u06e4\u06e5\u06e1"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move v5, v6

    move v7, v6

    move v8, v6

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v3, v8}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const-string v1, "\u06e3\u06df\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۥۢۡۦ(Ljava/lang/Object;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v1

    const-string v4, "\u06e0\u06df\u06e3"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v3, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۢۥۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06df\u06e6\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    sget p2, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    const-string v1, "\u06e3\u06e1\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v8, p2, -0x20f

    const-string v1, "\u06df\u06e7\u06e2"

    move-object v4, v1

    goto :goto_0

    :sswitch_4
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v0, v6, v1, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    const-string v1, "\u06e1\u06e2\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    invoke-static {p0, v10}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v5

    const-string v1, "\u06e7\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_6
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v4, "\u06e4\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_7
    invoke-static {p0, v9}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v7

    const-string v1, "\u06e3\u06e6\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_8
    const/high16 v1, 0x41500000    # 13.0f

    invoke-static {v3, v1}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const-string v1, "\u06e2\u06e4\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_9
    invoke-static {v3, p2, v8, v5, v7}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    const-string v1, "\u06e3\u06e0\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_a
    invoke-static {v3, v2}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۢۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e5\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_b
    invoke-static {v3, p1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e1\u06e4\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_c
    invoke-static {v3, p2}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const-string v1, "\u06df\u06e7\u06e5"

    move-object v4, v1

    goto :goto_0

    :sswitch_d
    invoke-static {p0, v10}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result p2

    const-string v1, "\u06e0\u06e3\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_e
    invoke-static {p0, v9}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v8

    const-string v1, "\u06e2\u06e1\u06e1"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_f
    return-object v3

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc7f -> :sswitch_b
        0xdc9f -> :sswitch_f
        0xdcda -> :sswitch_7
        0x1aa7d8 -> :sswitch_0
        0x1aa7fd -> :sswitch_2
        0x1aaac4 -> :sswitch_a
        0x1aab45 -> :sswitch_e
        0x1aaede -> :sswitch_1
        0x1aaf21 -> :sswitch_8
        0x1ab282 -> :sswitch_5
        0x1ab2e5 -> :sswitch_c
        0x1ab605 -> :sswitch_d
        0x1ab62a -> :sswitch_4
        0x1ab64a -> :sswitch_3
        0x1ab6e4 -> :sswitch_9
        0x1aba80 -> :sswitch_6
    .end sparse-switch
.end method

.method private static createDouyinSwitchRow(Landroid/content/Context;Ljava/lang/String;ZLjava/util/function/Consumer;)Landroid/widget/LinearLayout;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/function/Consumer",
            "<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Landroid/widget/LinearLayout;"
        }
    .end annotation

    const/4 v5, 0x0

    const/high16 v4, 0x41600000    # 14.0f

    const/high16 v3, 0x41400000    # 12.0f

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-static {v2, v5}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v0, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v0, v0, -0x6b

    invoke-static {v2, v0}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    invoke-static {p0, v3}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v0

    invoke-static {p0, v4}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v1

    invoke-static {p0, v3}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v3

    invoke-static {p0, v4}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v4

    invoke-static {v2, v0, v1, v3, v4}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    invoke-static {p0}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۥۢۡۦ(Ljava/lang/Object;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v0

    invoke-static {v2, v0}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {v3, p1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41700000    # 15.0f

    invoke-static {v3, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v0, -0xe0e0aa

    sget v1, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/2addr v0, v1

    invoke-static {v3, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->۟ۡۡۧۦ()Landroid/graphics/Typeface;

    move-result-object v0

    invoke-static {v3, v0}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    sget v1, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v1, v1, -0x3a2

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v0, v5, v1, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v3, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۢۥۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Landroid/widget/Switch;

    invoke-direct {v4, p0}, Landroid/widget/Switch;-><init>(Landroid/content/Context;)V

    invoke-static {v4, p2}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۤ۠ۧ(Ljava/lang/Object;Z)V

    sget v0, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v0, v0, -0x22f

    invoke-static {v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢۥۦۥ(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-static {v4, v0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۧۤ(Ljava/lang/Object;Ljava/lang/Object;)V

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
    const v0, -0xa8a9

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    const v0, -0x1f1f20

    :sswitch_5
    invoke-static {v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢۥۦۥ(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-static {v4, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟۠۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda0;

    invoke-direct {v0, p3, v4}, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda0;-><init>(Ljava/util/function/Consumer;Landroid/widget/Switch;)V

    invoke-static {v4, v0}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۡۤ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v3}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v4}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2

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
        0x11 -> :sswitch_3
        0x36 -> :sswitch_5
    .end sparse-switch
.end method

.method private static createEditRow(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Consumer;Ljava/lang/String;)Landroid/widget/LinearLayout;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/function/Consumer",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Landroid/widget/LinearLayout;"
        }
    .end annotation

    const/4 v6, 0x1

    const/high16 v4, 0x41400000    # 12.0f

    const/4 v5, 0x0

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-static {v1, v6}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    invoke-static {p0, v4}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v0

    invoke-static {p0, v4}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v2

    invoke-static {p0, v4}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v3

    invoke-static {p0, v4}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v4

    invoke-static {v1, v0, v2, v3, v4}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    invoke-static {p0}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۥۢۡۦ(Ljava/lang/Object;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v0

    invoke-static {v1, v0}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {v0, p1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v0, v2}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v2, -0x9998e1

    sget v3, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/2addr v2, v3

    invoke-static {v0, v2}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/high16 v2, 0x40c00000    # 6.0f

    invoke-static {p0, v2}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v2

    invoke-static {v0, v5, v5, v5, v2}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v1, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Landroid/widget/EditText;

    invoke-direct {v2, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

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
    invoke-static {v2, p2}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۡۡۦ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_3
    invoke-static {v2, p4}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۣۢ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41600000    # 14.0f

    invoke-static {v2, v0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->۟ۤۧۨۥ(Ljava/lang/Object;F)V

    const v0, 0xe0e124

    sget v3, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/2addr v0, v3

    invoke-static {v2, v0}, Landroidx/vectordrawable/۟ۧۢۧۨ;->۟ۡۦۦۨ(Ljava/lang/Object;I)V

    const/4 v0, 0x0

    invoke-static {v2, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۠۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v6}, Landroidx/loader/ۥۧۨۤ;->۟۟ۧۨ۠(Ljava/lang/Object;Z)V

    new-instance v0, Lkevin/fun/hook/webdav/WebDAVDialog$6;

    invoke-direct {v0, p3}, Lkevin/fun/hook/webdav/WebDAVDialog$6;-><init>(Ljava/util/function/Consumer;)V

    invoke-static {v2, v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {p0, v2}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v2

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    sget v4, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v4, v4, -0x22f

    invoke-direct {v3, v4, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v0, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, -0x111340

    sget v3, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/2addr v2, v3

    invoke-static {v0, v2}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۤۥۧ(Ljava/lang/Object;I)V

    const/high16 v2, 0x40800000    # 4.0f

    invoke-static {p0, v2}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v2

    invoke-static {v0, v5, v2, v5, v5}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۡ۠۟ۤ(Ljava/lang/Object;IIII)V

    invoke-static {v1, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method private static createPasswordRow(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Consumer;)Landroid/widget/LinearLayout;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/function/Consumer",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Landroid/widget/LinearLayout;"
        }
    .end annotation

    const/4 v7, 0x1

    const/high16 v4, 0x41400000    # 12.0f

    const/4 v6, 0x0

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-static {v1, v7}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    invoke-static {p0, v4}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v0

    invoke-static {p0, v4}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v2

    invoke-static {p0, v4}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v3

    invoke-static {p0, v4}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v4

    invoke-static {v1, v0, v2, v3, v4}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    invoke-static {p0}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۥۢۡۦ(Ljava/lang/Object;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v0

    invoke-static {v1, v0}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {v0, p1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v0, v2}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v2, 0x99987e

    sget v3, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/2addr v2, v3

    invoke-static {v0, v2}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/high16 v2, 0x40c00000    # 6.0f

    invoke-static {p0, v2}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v2

    invoke-static {v0, v6, v6, v6, v2}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v1, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Landroid/widget/EditText;

    invoke-direct {v2, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

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
    invoke-static {v2, p2}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۡۡۦ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v0

    const/16 v3, 0xd

    sget v4, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v4, v4, 0x17c

    const/16 v5, 0xaea

    invoke-static {v0, v3, v4, v5}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۣۢ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41600000    # 14.0f

    invoke-static {v2, v0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->۟ۤۧۨۥ(Ljava/lang/Object;F)V

    const v0, -0xe0e19a

    sget v3, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/2addr v0, v3

    invoke-static {v2, v0}, Landroidx/vectordrawable/۟ۧۢۧۨ;->۟ۡۦۦۨ(Ljava/lang/Object;I)V

    const/4 v0, 0x0

    invoke-static {v2, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۠۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v7}, Landroidx/loader/ۥۧۨۤ;->۟۟ۧۨ۠(Ljava/lang/Object;Z)V

    sget v0, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit8 v0, v0, 0xd

    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢۨۢۨ(Ljava/lang/Object;I)V

    new-instance v0, Lkevin/fun/hook/webdav/WebDAVDialog$7;

    invoke-direct {v0, p3}, Lkevin/fun/hook/webdav/WebDAVDialog$7;-><init>(Ljava/util/function/Consumer;)V

    invoke-static {v2, v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {p0, v2}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v2

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    sget v4, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v4, v4, 0x115

    invoke-direct {v3, v4, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v0, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, -0x1110af

    sget v3, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/2addr v2, v3

    invoke-static {v0, v2}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۤۥۧ(Ljava/lang/Object;I)V

    const/high16 v2, 0x40800000    # 4.0f

    invoke-static {p0, v2}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v2

    invoke-static {v0, v6, v2, v6, v6}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۡ۠۟ۤ(Ljava/lang/Object;IIII)V

    invoke-static {v1, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method private static createRippleDrawable(Landroid/content/Context;)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    return-object v0
.end method

.method private static dp(Landroid/content/Context;F)I
    .locals 8

    const/4 v1, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x0

    const-string v3, "\u06e2\u06e2\u06df"

    move-object v0, v1

    move-object v2, v1

    move v5, v6

    move v7, v6

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۨ۟ۨ(Ljava/lang/Object;)Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "\u06e4\u06e5\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟۟ۤۦۤ(Ljava/lang/Object;)Landroid/util/DisplayMetrics;

    move-result-object v1

    const-string v3, "\u06e7\u06e2\u06e0"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    float-to-int v4, p1

    const-string v1, "\u06e3\u06e7\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    const/high16 v1, 0x3f000000    # 0.5f

    add-float p1, v5, v1

    const-string v1, "\u06df\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    mul-float v5, p1, v7

    const-string v1, "\u06e8\u06e6\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    invoke-static {v2}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦۡۧ(Ljava/lang/Object;)F

    move-result v6

    const-string v1, "\u06e3\u06e3\u06e6"

    move-object v3, v1

    move v7, v6

    goto :goto_0

    :sswitch_5
    return v4

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe7 -> :sswitch_1
        0x1ab686 -> :sswitch_3
        0x1ab6fc -> :sswitch_5
        0x1aba7f -> :sswitch_0
        0x1ac565 -> :sswitch_4
        0x1ac9a3 -> :sswitch_2
    .end sparse-switch
.end method

.method public static handleActivityResult(IILandroid/content/Intent;)V
    .locals 5

    const/4 v4, 0x0

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
    const/16 v0, 0x2711

    if-ne p0, v0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz p2, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {p2}, Landroidx/customview/ۡۤۡۤ;->ۨ۠ۥۣ(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v1

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
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۢۥۦۧ()Lkevin/fun/hook/webdav/WebDAVConfig$BackupCallback;

    move-result-object v2

    const v0, 0xbefb

    :goto_4
    const v3, 0xbf0c

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :cond_4
    :sswitch_c
    const v0, 0xbf39

    goto :goto_4

    :sswitch_d
    if-eqz v2, :cond_4

    const v0, 0xc1e3

    goto :goto_4

    :sswitch_e
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۥۤۦۦ()Landroid/content/Context;

    move-result-object v2

    const v0, 0xc202

    :goto_5
    const v3, 0xc213

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_f
    if-eqz v2, :cond_5

    const v0, 0xc25f

    goto :goto_5

    :cond_5
    :sswitch_10
    const v0, 0xc240

    goto :goto_5

    :sswitch_11
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۥۤۦۦ()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroidx/activity/ۣۦۡۥ;->۟ۢۢ(Ljava/lang/Object;)Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥ(Ljava/lang/Object;Ljava/lang/Object;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const v0, 0xc27e

    :goto_6
    const v2, 0xc28f

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :goto_7
    :sswitch_12
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۥۤۦۦ()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۢۥۦۧ()Lkevin/fun/hook/webdav/WebDAVConfig$BackupCallback;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroidx/startup/ۤۧۥۣ;->ۣۣ۟ۨۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    sput-object v4, Lkevin/fun/hook/webdav/WebDAVDialog;->pendingRestoreCallback:Lkevin/fun/hook/webdav/WebDAVConfig$BackupCallback;

    sput-object v4, Lkevin/fun/hook/webdav/WebDAVDialog;->pendingContext:Landroid/content/Context;

    :sswitch_13
    invoke-static {}, Landroidx/loader/ۡۢۢ;->ۢۥۧ۟()I

    move-result v1

    const v0, 0xc2fa

    :goto_8
    const v2, 0xc30b

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_14
    if-ltz v1, :cond_6

    const v0, 0xc5e2

    goto :goto_8

    :sswitch_15
    const v0, 0xc29d

    goto :goto_6

    :cond_6
    :sswitch_16
    const v0, 0xc5c3

    goto :goto_8

    :sswitch_17
    const-string v0, "Hr"

    invoke-static {v0}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۣۤۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_18
    return-void

    :catch_0
    move-exception v0

    goto :goto_7

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_13
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_13
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_13
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_13
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_13
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_14
        0x6af -> :sswitch_16
        0x6c8 -> :sswitch_18
        0x6e9 -> :sswitch_17
    .end sparse-switch
.end method

.method static synthetic lambda$0(Landroid/content/Context;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 4

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v0

    const/16 v1, 0x15

    sget v2, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v2, v2, 0x17d

    const/16 v3, 0xc87

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۢۥۢ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lkevin/fun/hook/webdav/WebDAVDialog$1;

    invoke-direct {v0, p0, p1}, Lkevin/fun/hook/webdav/WebDAVDialog$1;-><init>(Landroid/content/Context;Landroid/widget/TextView;)V

    invoke-static {p0, v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۨ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

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
    const-string v0, "tsEsOIIwAmvX"

    invoke-static {v0}, Landroidx/startup/۟ۦۤۨۧ;->۟۟۟ۨۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

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

.method static synthetic lambda$1(Landroid/content/Context;Landroid/widget/TextView;Landroid/app/Dialog;Landroid/view/View;)V
    .locals 6

    new-instance v1, Landroid/content/Intent;

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v0

    const/16 v2, 0x1e

    sget v3, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v3, v3, 0x145

    const/16 v4, 0x43a

    invoke-static {v0, v2, v3, v4}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v0

    const/16 v2, 0x41

    sget v3, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v3, v3, 0x399

    const/16 v4, 0x52c

    invoke-static {v0, v2, v3, v4}, Landroidx/core/ۤۦ۟ۢ;->ۣۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۠۟۟(Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/Intent;

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v0

    const/16 v2, 0x61

    sget v3, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v3, v3, 0x21e

    const/16 v4, 0x2d7

    invoke-static {v0, v2, v3, v4}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/Intent;

    new-instance v0, Lkevin/fun/hook/DownloadPathConfig;

    invoke-direct {v0, p0}, Lkevin/fun/hook/DownloadPathConfig;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۤۦۣۢ(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v2

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
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v0

    const/16 v3, 0x71

    sget v4, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/lit16 v4, v4, 0x379

    const/16 v5, 0x7de

    invoke-static {v0, v3, v4, v5}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۨۢ۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0, v2}, Landroidx/loader/ۡۢۢ;->ۨۥۨ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/Intent;

    :sswitch_3
    instance-of v2, p0, Landroid/app/Activity;

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-eqz v2, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    new-instance v0, Lkevin/fun/hook/webdav/WebDAVDialog$2;

    invoke-direct {v0, p0, p1}, Lkevin/fun/hook/webdav/WebDAVDialog$2;-><init>(Landroid/content/Context;Landroid/widget/TextView;)V

    sput-object v0, Lkevin/fun/hook/webdav/WebDAVDialog;->pendingRestoreCallback:Lkevin/fun/hook/webdav/WebDAVConfig$BackupCallback;

    sput-object p0, Lkevin/fun/hook/webdav/WebDAVDialog;->pendingContext:Landroid/content/Context;

    check-cast p0, Landroid/app/Activity;

    sget v0, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v0, v0, 0x2542

    invoke-static {p0, v1, v0}, Landroidx/core/ۧ۟ۤۨ;->ۦ۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {p2}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    const v0, 0xbe22

    goto :goto_2

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v0

    const/16 v1, 0x93

    sget v2, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v2, v2, -0x251

    const/16 v3, 0x3d0

    invoke-static {v0, v1, v2, v3}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۢۥۢ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_9
    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣۣ۟۠()I

    move-result v1

    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_a
    const v0, 0xbebd

    goto :goto_3

    :sswitch_b
    if-ltz v1, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_c
    const-string v0, "YPBZ0whVyaFWU3S"

    invoke-static {v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۡ۠ۢ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

    :sswitch_d
    return-void

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
        0x1d7 -> :sswitch_8
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0x2d -> :sswitch_d
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch
.end method

.method static synthetic lambda$10(Landroid/content/Context;Landroid/view/View;)V
    .locals 4

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۦۣۡۤ()Ljava/lang/String;

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
    invoke-static {p0, v1}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۢۥۢ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/core/ۤۦ۟ۢ;->ۣۧۧۡ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const-string v0, "2vvY2DgpOwNLzib3I7"

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۢۥۥ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_2
    :sswitch_6
    return-void

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v0

    const/16 v1, 0x9c

    sget v2, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v2, v2, 0x3a8

    const/16 v3, 0xc85

    invoke-static {v0, v1, v2, v3}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۢۥۢ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lkevin/fun/hook/webdav/WebDAVDialog$5;

    invoke-direct {v0, p0}, Lkevin/fun/hook/webdav/WebDAVDialog$5;-><init>(Landroid/content/Context;)V

    invoke-static {p0, v0}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۣ۟ۡ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

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
.end method

.method static synthetic lambda$11(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$12(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 2

    invoke-static {p0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "cnQLCeLZx"

    invoke-static {v0}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->۟۠ۧۡ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

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

.method static synthetic lambda$13(Ljava/util/function/Consumer;Landroid/widget/Switch;Landroid/widget/CompoundButton;Z)V
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
    if-eqz p0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p3}, Landroidx/loader/ۡۢۢ;->ۤۨۡۥ(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۥۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_3
    sget v0, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v0, v0, 0x1eb

    invoke-static {v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢۥۦۥ(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۧۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-eqz p3, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const v0, -0xa8a9

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    const v1, 0xbe22

    goto :goto_2

    :sswitch_8
    const v0, -0x1f1f20

    :sswitch_9
    invoke-static {v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢۥۦۥ(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-static {p1, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟۠۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

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
        0x1d7 -> :sswitch_8
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb97b -> :sswitch_9
    .end sparse-switch
.end method

.method static synthetic lambda$14(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0, p1, v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۨۡ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->۠۠ۥۣ(Ljava/lang/Object;)V
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

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic lambda$2(Ljava/lang/Boolean;)V
    .locals 2

    invoke-static {p0}, Landroidx/activity/ۤۧۧۧ;->ۦۣۡ۠(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Landroidx/appcompat/ۣۧۤۢ;->۠ۤ۠ۥ(Z)V

    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢ۠ۨ۟()I

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
    const-string v0, "u2wulfJaFIgY0QEDLzqfR"

    invoke-static {v0}, Landroidx/vectordrawable/۟ۧۢۧۨ;->۟ۥۣۧۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

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

.method static synthetic lambda$3(Ljava/lang/Boolean;)V
    .locals 1

    invoke-static {p0}, Landroidx/activity/ۤۧۧۧ;->ۦۣۡ۠(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Landroidx/loader/ۣ۟۟ۧ۠;->۠۠۟ۤ(Z)V

    return-void
.end method

.method static synthetic lambda$8(Landroid/content/Context;Landroid/view/View;)V
    .locals 4

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۦۣۡۤ()Ljava/lang/String;

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
    invoke-static {p0, v1}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۢۥۢ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/appcompat/ۣۧۤۢ;->ۢ۟۟ۨ()I

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
    const-string v0, "kfHK9bYDyJuTNAOS"

    invoke-static {v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۥۦ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_2
    :sswitch_6
    return-void

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v0

    const/16 v1, 0xa4

    sget v2, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v2, v2, 0x30b

    const/16 v3, 0x56f

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۢۥۢ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lkevin/fun/hook/webdav/WebDAVDialog$3;

    invoke-direct {v0, p0}, Lkevin/fun/hook/webdav/WebDAVDialog$3;-><init>(Landroid/content/Context;)V

    invoke-static {p0, v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۡ۟۠۠(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

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
.end method

.method static synthetic lambda$9(Landroid/content/Context;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 4

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۦۣۡۤ()Ljava/lang/String;

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
    invoke-static {p0, v1}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۢۥۢ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    return-void

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v0

    const/16 v1, 0xaa

    sget v2, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    xor-int/lit8 v2, v2, 0xa

    const/16 v3, 0x2a3

    invoke-static {v0, v1, v2, v3}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۢۥۢ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lkevin/fun/hook/webdav/WebDAVDialog$4;

    invoke-direct {v0, p0, p1}, Lkevin/fun/hook/webdav/WebDAVDialog$4;-><init>(Landroid/content/Context;Landroid/widget/TextView;)V

    invoke-static {p0, v0}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣۣ۟ۢۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static showConfigDialog(Landroid/content/Context;)V
    .locals 13

    const/4 v12, 0x1

    :try_start_0
    new-instance v1, Landroid/app/Dialog;

    const v0, 0x1030332

    sget v2, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/2addr v0, v2

    invoke-direct {v1, p0, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/4 v0, 0x1

    invoke-static {v1, v0}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۡۡ۠(Ljava/lang/Object;Z)V

    new-instance v2, Landroid/widget/FrameLayout;

    invoke-direct {v2, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    sget v3, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v3, v3, -0x22f

    invoke-direct {v0, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-static {v2, v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡ۠۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, -0x7ffffe87

    sget v4, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/2addr v0, v4

    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۣۢۧ(Ljava/lang/Object;I)V

    new-instance v4, Landroid/widget/LinearLayout;

    invoke-direct {v4, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    invoke-static {v4, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {p0, v0}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v0

    const/high16 v5, 0x41400000    # 12.0f

    invoke-static {p0, v5}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v5

    const/high16 v6, 0x41800000    # 16.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v6

    const/high16 v7, 0x41a00000    # 20.0f

    invoke-static {p0, v7}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v7

    invoke-static {v4, v0, v5, v6, v7}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    sget v5, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v5, v5, 0x16b

    invoke-direct {v0, v3, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v5, 0x50

    iput v5, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-static {v4, v0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v0, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    const/16 v3, 0x8

    new-array v3, v3, [F

    const/4 v5, 0x0

    const/high16 v6, 0x41800000    # 16.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v6

    int-to-float v6, v6

    aput v6, v3, v5

    const/4 v5, 0x1

    const/high16 v6, 0x41800000    # 16.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v6

    int-to-float v6, v6

    aput v6, v3, v5

    const/4 v5, 0x2

    const/high16 v6, 0x41800000    # 16.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v6

    int-to-float v6, v6

    aput v6, v3, v5

    const/4 v5, 0x3

    const/high16 v6, 0x41800000    # 16.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v6

    int-to-float v6, v6

    aput v6, v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    aput v6, v3, v5

    const/4 v5, 0x5

    const/4 v6, 0x0

    aput v6, v3, v5

    const/4 v5, 0x6

    const/4 v6, 0x0

    aput v6, v3, v5

    const/4 v5, 0x7

    const/4 v6, 0x0

    aput v6, v3, v5

    invoke-static {v0, v3}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣۨۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v0}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v5, 0x42200000    # 40.0f

    invoke-static {p0, v5}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v5

    const/high16 v6, 0x40800000    # 4.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v6

    invoke-direct {v3, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v5, 0x1

    iput v5, v3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    const/high16 v5, 0x41400000    # 12.0f

    invoke-static {p0, v5}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v5

    iput v5, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    const/high16 v5, 0x41000000    # 8.0f

    invoke-static {p0, v5}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v5

    iput v5, v3, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-static {v0, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v5, -0x1f1d9c

    sget v6, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/2addr v5, v6

    invoke-static {v3, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    const/high16 v5, 0x40000000    # 2.0f

    invoke-static {p0, v5}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v5

    int-to-float v5, v5

    invoke-static {v3, v5}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    invoke-static {v0, v3}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x0

    invoke-static {v0, v3}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v3, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v3, v3, -0x5b

    invoke-static {v0, v3}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    const/high16 v3, 0x41000000    # 8.0f

    invoke-static {p0, v3}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v3

    const/high16 v5, 0x41000000    # 8.0f

    invoke-static {p0, v5}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v5

    const/high16 v6, 0x41000000    # 8.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v6

    const/high16 v7, 0x41400000    # 12.0f

    invoke-static {p0, v7}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v7

    invoke-static {v0, v3, v5, v6, v7}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v5

    const/16 v6, 0xb2

    sget v7, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    xor-int/lit16 v7, v7, 0x11b

    const/16 v8, 0x782

    invoke-static {v5, v6, v7, v8}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v5, 0x41900000    # 18.0f

    invoke-static {v3, v5}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->۟ۡۡۧۦ()Landroid/graphics/Typeface;

    move-result-object v5

    invoke-static {v3, v5}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    const v5, -0xe0e274

    sget v6, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/2addr v5, v6

    invoke-static {v3, v5}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, 0x0

    sget v7, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v7, v7, -0x15f

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-direct {v5, v6, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v3, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۢۥۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v3}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Landroid/widget/ScrollView;

    invoke-direct {v3, p0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v5, 0x43fa0000    # 500.0f

    invoke-static {p0, v5}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v5

    sget v6, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v6, v6, 0xec

    invoke-direct {v0, v6, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v3, v0}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧۦ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    invoke-static {v5, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    const/high16 v0, 0x41000000    # 8.0f

    invoke-static {p0, v0}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v0

    const/high16 v6, 0x41000000    # 8.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v6

    const/high16 v7, 0x41000000    # 8.0f

    invoke-static {p0, v7}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v7

    const/high16 v8, 0x41000000    # 8.0f

    invoke-static {p0, v8}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v8

    invoke-static {v5, v0, v6, v7, v8}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v6

    const/16 v7, 0xb7

    sget v8, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v8, v8, -0x16e

    const/16 v9, 0xbf8

    invoke-static {v6, v7, v8, v9}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۨۢ۟([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v6, 0x41600000    # 14.0f

    invoke-static {v0, v6}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->۟ۡۡۧۦ()Landroid/graphics/Typeface;

    move-result-object v6

    invoke-static {v0, v6}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    const v6, 0xcccc2e

    sget v7, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/2addr v6, v7

    invoke-static {v0, v6}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/high16 v6, 0x41000000    # 8.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v6

    const/high16 v7, 0x41400000    # 12.0f

    invoke-static {p0, v7}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v7

    const/high16 v8, 0x41000000    # 8.0f

    invoke-static {p0, v8}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v8

    const/high16 v9, 0x41000000    # 8.0f

    invoke-static {p0, v9}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v9

    invoke-static {v0, v6, v7, v8, v9}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v5, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v6, 0x0

    invoke-static {v0, v6}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    const/high16 v6, 0x41000000    # 8.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v6

    const/high16 v7, 0x40800000    # 4.0f

    invoke-static {p0, v7}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v7

    const/high16 v8, 0x41000000    # 8.0f

    invoke-static {p0, v8}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v8

    const/high16 v9, 0x41000000    # 8.0f

    invoke-static {p0, v9}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v9

    invoke-static {v0, v6, v7, v8, v9}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v6

    const/16 v7, 0xbe

    sget v8, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v8, v8, -0x25e

    const/16 v9, 0x74c

    invoke-static {v6, v7, v8, v9}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v6

    const v7, -0xb35223

    sget v8, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/2addr v7, v8

    invoke-static {p0, v6, v7}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۣ۟ۡ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/widget/TextView;

    move-result-object v6

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v7

    const/16 v8, 0xc2

    sget v9, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v9, v9, -0x1ac

    const/16 v10, 0x915

    invoke-static {v7, v8, v9, v10}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۦۧۦ([SIII)Ljava/lang/String;

    move-result-object v7

    const v8, -0xde6a00

    sget v9, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/2addr v8, v9

    invoke-static {p0, v7, v8}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۣ۟ۡ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/widget/TextView;

    move-result-object v7

    new-instance v8, Landroid/widget/TextView;

    invoke-direct {v8, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    new-instance v9, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda6;

    invoke-direct {v9, p0, v8}, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda6;-><init>(Landroid/content/Context;Landroid/widget/TextView;)V

    invoke-static {v6, v9}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v9, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda10;

    invoke-direct {v9, p0, v8, v1}, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda10;-><init>(Landroid/content/Context;Landroid/widget/TextView;Landroid/app/Dialog;)V

    invoke-static {v7, v9}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v6}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v7}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41300000    # 11.0f

    invoke-static {v8, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v0, 0x6665a5

    sget v6, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/2addr v0, v6

    invoke-static {v8, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/high16 v0, 0x41400000    # 12.0f

    invoke-static {p0, v0}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v0

    const/high16 v6, 0x40800000    # 4.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v6

    const/high16 v7, 0x41000000    # 8.0f

    invoke-static {p0, v7}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v7

    const/high16 v9, 0x41400000    # 12.0f

    invoke-static {p0, v9}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v9

    invoke-static {v8, v0, v6, v7, v9}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v8, p0}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۨۥۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5, v8}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۦۧۢ۠(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    invoke-static {v5, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v6

    const/16 v7, 0xc6

    sget v8, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v8, v8, -0x168

    const/16 v9, 0x196

    invoke-static {v6, v7, v8, v9}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v6, 0x41600000    # 14.0f

    invoke-static {v0, v6}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->۟ۡۡۧۦ()Landroid/graphics/Typeface;

    move-result-object v6

    invoke-static {v0, v6}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    const v6, 0xcccca9

    sget v7, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/2addr v6, v7

    invoke-static {v0, v6}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/high16 v6, 0x41000000    # 8.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v6

    const/high16 v7, 0x41400000    # 12.0f

    invoke-static {p0, v7}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v7

    const/high16 v8, 0x41000000    # 8.0f

    invoke-static {p0, v8}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v8

    const/high16 v9, 0x41000000    # 8.0f

    invoke-static {p0, v9}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v9

    invoke-static {v0, v6, v7, v8, v9}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v5, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v0

    const/16 v6, 0xd3

    sget v7, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v7, v7, -0x1ce

    const/16 v8, 0xaa2

    invoke-static {v0, v6, v7, v8}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۢۥۦۢ()Z

    move-result v6

    new-instance v7, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda11;

    invoke-direct {v7}, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda11;-><init>()V

    invoke-static {p0, v0, v6, v7}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۢ۠ۢۦ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-static {v5, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۦۧۢ۠(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    invoke-static {v5, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v0

    const/16 v6, 0xdc

    sget v7, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v7, v7, 0x3a6

    const/16 v8, 0xabe

    invoke-static {v0, v6, v7, v8}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۤۨۢۦ()Z

    move-result v6

    new-instance v7, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda12;

    invoke-direct {v7}, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda12;-><init>()V

    invoke-static {p0, v0, v6, v7}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۢ۠ۢۦ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-static {v5, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۦۧۢ۠(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    invoke-static {v5, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v0

    const/16 v6, 0xe2

    sget v7, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v7, v7, 0x2f7

    const/16 v8, 0x7b0

    invoke-static {v0, v6, v7, v8}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۧۢۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۨۥ۠ۡ()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda13;

    invoke-direct {v7}, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda13;-><init>()V

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v8

    const/16 v9, 0xeb

    sget v10, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v10, v10, -0x173

    const/16 v11, 0x904

    invoke-static {v8, v9, v10, v11}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v8

    invoke-static {p0, v0, v6, v7, v8}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۣۡۧۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6}, Landroidx/loader/ۣۦ۟ۡ;->ۣۡ۠ۡ(Ljava/lang/Object;)I

    move-result v7

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
    if-le v7, v12, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/4 v0, 0x1

    invoke-static {v6, v0}, Landroidx/activity/ۨ۠۟ۧ;->ۣۣ۠ۨ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    instance-of v7, v0, Landroid/widget/EditText;

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v7, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const/4 v0, 0x1

    invoke-static {v6, v0}, Landroidx/activity/ۨ۠۟ۧ;->ۣۣ۠ۨ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    sput-object v0, Lkevin/fun/hook/webdav/WebDAVDialog;->urlEditText:Landroid/widget/EditText;

    :sswitch_6
    invoke-static {p0}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۦۧۢ۠(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    invoke-static {v5, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v0

    const/16 v6, 0x103

    sget v7, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v7, v7, -0x269

    const/16 v8, 0x7cb

    invoke-static {v0, v6, v7, v8}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۧۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۥ۟ۢۧ()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda14;

    invoke-direct {v7}, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda14;-><init>()V

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v8

    const/16 v9, 0x10a

    sget v10, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v10, v10, 0x288

    const/16 v11, 0xb0f

    invoke-static {v8, v9, v10, v11}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v8

    invoke-static {p0, v0, v6, v7, v8}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۣۡۧۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6}, Landroidx/loader/ۣۦ۟ۡ;->ۣۡ۠ۡ(Ljava/lang/Object;)I

    move-result v7

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    if-le v7, v12, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_8
    const v0, 0xbe41

    goto :goto_2

    :sswitch_9
    const/4 v0, 0x1

    invoke-static {v6, v0}, Landroidx/activity/ۨ۠۟ۧ;->ۣۣ۠ۨ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    instance-of v7, v0, Landroid/widget/EditText;

    const v0, 0xbe7f

    :goto_3
    const v8, 0xbe90

    xor-int/2addr v0, v8

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_a
    const v0, 0xbebd

    goto :goto_3

    :sswitch_b
    if-eqz v7, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_c
    const/4 v0, 0x1

    invoke-static {v6, v0}, Landroidx/activity/ۨ۠۟ۧ;->ۣۣ۠ۨ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    sput-object v0, Lkevin/fun/hook/webdav/WebDAVDialog;->pathEditText:Landroid/widget/EditText;

    :sswitch_d
    invoke-static {p0}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۦۧۢ۠(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    invoke-static {v5, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v0

    const/16 v6, 0x116

    sget v7, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v7, v7, -0x4d

    const/16 v8, 0x163

    invoke-static {v0, v6, v7, v8}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۧۢۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۢۡۧۦ()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda1;

    invoke-direct {v7}, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda1;-><init>()V

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v8

    const/16 v9, 0x11c

    sget v10, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v10, v10, -0x7c

    const/16 v11, 0xab6

    invoke-static {v8, v9, v10, v11}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v8

    invoke-static {p0, v0, v6, v7, v8}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۣۡۧۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6}, Landroidx/loader/ۣۦ۟ۡ;->ۣۡ۠ۡ(Ljava/lang/Object;)I

    move-result v7

    const v0, 0xbefb

    :goto_4
    const v8, 0xbf0c

    xor-int/2addr v0, v8

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :cond_4
    :sswitch_e
    const v0, 0xbf39

    goto :goto_4

    :sswitch_f
    if-le v7, v12, :cond_4

    const v0, 0xc1e3

    goto :goto_4

    :sswitch_10
    const/4 v0, 0x1

    invoke-static {v6, v0}, Landroidx/activity/ۨ۠۟ۧ;->ۣۣ۠ۨ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    instance-of v7, v0, Landroid/widget/EditText;

    const v0, 0xc202

    :goto_5
    const v8, 0xc213

    xor-int/2addr v0, v8

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_11
    if-eqz v7, :cond_5

    const v0, 0xc25f

    goto :goto_5

    :cond_5
    :sswitch_12
    const v0, 0xc240

    goto :goto_5

    :sswitch_13
    const/4 v0, 0x1

    invoke-static {v6, v0}, Landroidx/activity/ۨ۠۟ۧ;->ۣۣ۠ۨ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    sput-object v0, Lkevin/fun/hook/webdav/WebDAVDialog;->usernameEditText:Landroid/widget/EditText;

    :sswitch_14
    invoke-static {p0}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۦۧۢ۠(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    invoke-static {v5, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v0

    const/16 v6, 0x12a

    sget v7, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    xor-int/lit16 v7, v7, -0x3b9

    const/16 v8, 0x8f3

    invoke-static {v0, v6, v7, v8}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۠۟ۦۦ()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda2;

    invoke-direct {v7}, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda2;-><init>()V

    invoke-static {p0, v0, v6, v7}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۥۢۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6}, Landroidx/loader/ۣۦ۟ۡ;->ۣۡ۠ۡ(Ljava/lang/Object;)I

    move-result v7

    const v0, 0xc27e

    :goto_6
    const v8, 0xc28f

    xor-int/2addr v0, v8

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :cond_6
    :sswitch_15
    const v0, 0xc2bc

    goto :goto_6

    :sswitch_16
    if-le v7, v12, :cond_6

    const v0, 0xc2db

    goto :goto_6

    :sswitch_17
    const/4 v0, 0x1

    invoke-static {v6, v0}, Landroidx/activity/ۨ۠۟ۧ;->ۣۣ۠ۨ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    instance-of v7, v0, Landroid/widget/EditText;

    const v0, 0xc2fa

    :goto_7
    const v8, 0xc30b

    xor-int/2addr v0, v8

    sparse-switch v0, :sswitch_data_7

    goto :goto_7

    :sswitch_18
    if-eqz v7, :cond_7

    const v0, 0xc5e2

    goto :goto_7

    :cond_7
    :sswitch_19
    const v0, 0xc5c3

    goto :goto_7

    :sswitch_1a
    const/4 v0, 0x1

    invoke-static {v6, v0}, Landroidx/activity/ۨ۠۟ۧ;->ۣۣ۠ۨ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    sput-object v0, Lkevin/fun/hook/webdav/WebDAVDialog;->passwordEditText:Landroid/widget/EditText;

    :sswitch_1b
    invoke-static {p0}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۦۧۢ۠(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    invoke-static {v5, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Landroid/widget/TextView;

    invoke-direct {v6, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const/high16 v0, 0x41400000    # 12.0f

    invoke-static {v6, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v0, 0x666652

    sget v7, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/2addr v0, v7

    invoke-static {v6, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/4 v0, 0x0

    const/high16 v7, 0x41000000    # 8.0f

    invoke-static {p0, v7}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static {v6, v0, v7, v8, v9}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۧۤۥۤ()J

    move-result-wide v8

    const v0, 0xc601

    :goto_8
    const v7, 0xc612

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_8

    goto :goto_8

    :sswitch_1c
    const-wide/16 v10, 0x0

    cmp-long v0, v8, v10

    if-lez v0, :cond_8

    const v0, 0xc65e

    goto :goto_8

    :cond_8
    :sswitch_1d
    const v0, 0xc63f

    goto :goto_8

    :sswitch_1e
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v7

    const/16 v10, 0x130

    sget v11, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v11, v11, -0x20d

    const/16 v12, 0x4b5

    invoke-static {v7, v10, v11, v12}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۟۠ۡ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۦۥۣ۟()Ljava/util/Locale;

    move-result-object v10

    invoke-direct {v0, v7, v10}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v7, Ljava/util/Date;

    invoke-direct {v7, v8, v9}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0, v7}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۣ۟ۧۡۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v8

    const/16 v9, 0x143

    sget v10, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v10, v10, -0x33

    const/16 v11, 0xa9e

    invoke-static {v8, v9, v10, v11}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-static {v7, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xc67d

    :goto_9
    const v7, 0xc68e

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_9

    goto :goto_9

    :goto_a
    :sswitch_1f
    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۤۨۢۦ()Z

    move-result v7

    sget v8, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    const v0, 0xc984

    :goto_b
    const v9, 0xc995

    xor-int/2addr v0, v9

    sparse-switch v0, :sswitch_data_a

    goto :goto_b

    :sswitch_20
    if-eqz v7, :cond_9

    const v0, 0xc9e1

    goto :goto_b

    :sswitch_21
    const v0, 0xc69c

    goto :goto_9

    :sswitch_22
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v0

    const/16 v7, 0x149

    sget v8, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v8, v8, 0x55

    const/16 v9, 0xabf

    invoke-static {v0, v7, v8, v9}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_a

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v2

    const/16 v3, 0x167

    sget v4, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v4, v4, 0x226

    const/16 v5, 0x835

    invoke-static {v2, v3, v4, v5}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۣ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    :pswitch_0
    return-void

    :cond_9
    :sswitch_23
    const v0, 0xc9c2

    goto :goto_b

    :sswitch_24
    :try_start_1
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const/high16 v7, 0x41300000    # 11.0f

    invoke-static {v0, v7}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v7, -0xaa3c

    xor-int/2addr v7, v8

    invoke-static {v0, v7}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/4 v7, 0x0

    const/high16 v8, 0x40800000    # 4.0f

    invoke-static {p0, v8}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static {v0, v7, v8, v9, v10}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v7

    const/16 v8, 0x150

    sget v9, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/lit16 v9, v9, 0x350

    const/16 v10, 0x8dd

    invoke-static {v7, v8, v9, v10}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۠ۤۥ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v7}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_25
    invoke-static {v5, v6}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v5}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۥۧ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v3}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {p0, v5}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v5

    sget v7, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v7, v7, 0xec

    invoke-direct {v3, v7, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v0, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v3, -0x111320

    sget v5, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/2addr v3, v5

    invoke-static {v0, v3}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۤۥۧ(Ljava/lang/Object;I)V

    const/4 v3, 0x0

    const/high16 v5, 0x41400000    # 12.0f

    invoke-static {p0, v5}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static {v0, v3, v5, v7, v8}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۡ۠۟ۤ(Ljava/lang/Object;IIII)V

    invoke-static {v4, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x0

    invoke-static {v0, v3}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    const/high16 v3, 0x41000000    # 8.0f

    invoke-static {p0, v3}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v3

    const/high16 v5, 0x41400000    # 12.0f

    invoke-static {p0, v5}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v5

    const/high16 v7, 0x41000000    # 8.0f

    invoke-static {p0, v7}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v7

    const/high16 v8, 0x41000000    # 8.0f

    invoke-static {p0, v8}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v8

    invoke-static {v0, v3, v5, v7, v8}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v3

    const/16 v5, 0x15b

    sget v7, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v7, v7, 0xf7

    const/16 v8, 0x679

    invoke-static {v3, v5, v7, v8}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v3

    const v5, 0x999872

    sget v7, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/2addr v5, v7

    invoke-static {p0, v3, v5}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۣ۟ۡ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/widget/TextView;

    move-result-object v3

    new-instance v5, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda3;

    invoke-direct {v5, p0}, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda3;-><init>(Landroid/content/Context;)V

    invoke-static {v3, v5}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v5

    const/16 v7, 0x15f

    sget v8, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v8, v8, -0x37

    const/16 v9, 0x4c4

    invoke-static {v5, v7, v8, v9}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v5

    const v7, -0xa9a5

    sget v8, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/2addr v7, v8

    invoke-static {p0, v5, v7}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۣ۟ۡ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/widget/TextView;

    move-result-object v5

    new-instance v7, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda4;

    invoke-direct {v7, p0, v6}, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda4;-><init>(Landroid/content/Context;Landroid/widget/TextView;)V

    invoke-static {v5, v7}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v6

    const/16 v7, 0x162

    sget v8, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    xor-int/lit8 v8, v8, 0x1

    const/16 v9, 0x4db

    invoke-static {v6, v7, v8, v9}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v6

    const v7, -0xab09

    sget v8, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/2addr v7, v8

    invoke-static {p0, v6, v7}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۣ۟ۡ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/widget/TextView;

    move-result-object v6

    new-instance v7, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda7;

    invoke-direct {v7, p0}, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda7;-><init>(Landroid/content/Context;)V

    invoke-static {v6, v7}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v7

    const/16 v8, 0x165

    sget v9, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v9, v9, 0x11

    const/16 v10, 0x750

    invoke-static {v7, v8, v9, v10}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v7

    const v8, 0x66678d

    sget v9, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/2addr v8, v9

    invoke-static {p0, v7, v8}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۣ۟ۡ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/widget/TextView;

    move-result-object v7

    new-instance v8, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda8;

    invoke-direct {v8, v1}, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda8;-><init>(Landroid/app/Dialog;)V

    invoke-static {v7, v8}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v3}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v5}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v6}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v7}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v4}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۢ۟۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v2}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥۢۨۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x43c80000    # 400.0f

    invoke-static {p0, v0}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟۟ۥۧ(Ljava/lang/Object;F)I

    move-result v0

    int-to-float v0, v0

    invoke-static {v4, v0}, Landroidx/loader/ۡۢۢ;->۠ۡۤۨ(Ljava/lang/Object;F)V

    invoke-static {v4}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۣۤۤ(Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v0, v3}, Landroidx/loader/ۣ۟۟ۧ۠;->ۤۢ۠ۥ(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v4, 0x3d2

    sget v3, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    int-to-long v6, v3

    xor-long/2addr v4, v6

    invoke-static {v0, v4, v5}, Landroidx/loader/ۥۧۨۤ;->ۣۣۧ۠(Ljava/lang/Object;J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۤ۟ۥ(Ljava/lang/Object;)V

    new-instance v0, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda9;

    invoke-direct {v0, v1}, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda9;-><init>(Landroid/app/Dialog;)V

    invoke-static {v2, v0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۥۥۥۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۦۧۤۡ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const v0, 0xca00

    :goto_c
    const v1, 0xca11

    xor-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    :pswitch_1
    goto :goto_c

    :pswitch_2
    const v0, 0xca1f

    goto :goto_c

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
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_d
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0x2d -> :sswitch_d
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_e
        0x35 -> :sswitch_14
        0x1f7 -> :sswitch_f
        0x7eef -> :sswitch_10
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_11
        0x32 -> :sswitch_12
        0x4c -> :sswitch_13
        0x53 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_15
        0x33 -> :sswitch_1b
        0x54 -> :sswitch_17
        0xf1 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_18
        0x6af -> :sswitch_19
        0x6c8 -> :sswitch_1b
        0x6e9 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1c
        0x2d -> :sswitch_22
        0x32 -> :sswitch_1d
        0x4c -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1f
        0xf3 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_20
        0x36 -> :sswitch_23
        0x57 -> :sswitch_25
        0x74 -> :sswitch_24
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private static showSafeToast(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

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
    if-eqz p0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p1}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

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
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۤ۟ۢ۠()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda5;

    invoke-direct {v1, p0, p1}, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda5;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣ۟ۦۣۤ()I

    move-result v1

    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v0, 0xbebd

    goto :goto_3

    :sswitch_9
    if-ltz v1, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_a
    const-string v0, "69"

    invoke-static {v0}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣ۟ۤۧۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :sswitch_b
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_b
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

.method private static updateLocalStatusText(Landroid/widget/TextView;Landroid/content/Context;)V
    .locals 7

    invoke-static {}, Landroidx/appcompat/ۣۧۤۢ;->۟ۦ۟ۢۢ()J

    move-result-wide v2

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
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v1

    const/16 v4, 0x16f

    sget v5, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v5, v5, -0x3d6

    const/16 v6, 0xaba

    invoke-static {v1, v4, v5, v6}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۦۥۣ۟()Ljava/util/Locale;

    move-result-object v4

    invoke-direct {v0, v1, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0, v1}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۣ۟ۧۡۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v2

    const/16 v3, 0x182

    sget v4, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v4, v4, -0x16e

    const/16 v5, 0x4dc

    invoke-static {v2, v3, v4, v5}, Landroidx/startup/۟ۦۤۨۧ;->۟ۦۦۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v0

    const/16 v1, 0x189

    sget v2, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v2, v2, 0xcb

    const/16 v3, 0x2c5

    invoke-static {v0, v1, v2, v3}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_5
    return-void

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
        0x11 -> :sswitch_3
        0x36 -> :sswitch_5
    .end sparse-switch
.end method

.method private static validateConfig()Ljava/lang/String;
    .locals 6

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۥۧۡ۟()Landroid/widget/EditText;

    move-result-object v2

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

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
    if-eqz v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۥۧۡ۟()Landroid/widget/EditText;

    move-result-object v0

    invoke-static {v0}, Landroidx/drawerlayout/ۤۨۡۤ;->۟۠۟ۡۡ(Ljava/lang/Object;)Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroidx/startup/ۤۧۥۣ;->۟۠ۧۨۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->۠۠ۦۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v2, 0x6eb

    goto :goto_1

    :sswitch_4
    move-object v0, v1

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۢۨۡۤ()Landroid/widget/EditText;

    move-result-object v3

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v3, :cond_1

    const v2, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v2, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۢۨۡۤ()Landroid/widget/EditText;

    move-result-object v2

    invoke-static {v2}, Landroidx/drawerlayout/ۤۨۡۤ;->۟۠۟ۡۡ(Ljava/lang/Object;)Landroid/text/Editable;

    move-result-object v2

    invoke-static {v2}, Landroidx/startup/ۤۧۥۣ;->۟۠ۧۨۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroidx/documentfile/ۡۢ۟ۥ;->۠۠ۦۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const v3, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۣۧۢۤ()Landroid/widget/EditText;

    move-result-object v4

    const v3, 0xbefb

    :goto_5
    const v5, 0xbf0c

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_a
    const v3, 0xbf39

    goto :goto_5

    :sswitch_b
    const v3, 0xbe9e

    goto :goto_3

    :sswitch_c
    move-object v2, v1

    goto :goto_4

    :sswitch_d
    if-eqz v4, :cond_2

    const v3, 0xc1e3

    goto :goto_5

    :sswitch_e
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->ۣۧۢۤ()Landroid/widget/EditText;

    move-result-object v1

    invoke-static {v1}, Landroidx/drawerlayout/ۤۨۡۤ;->۟۠۟ۡۡ(Ljava/lang/Object;)Landroid/text/Editable;

    move-result-object v1

    invoke-static {v1}, Landroidx/startup/ۤۧۥۣ;->۟۠ۧۨۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroidx/documentfile/ۡۢ۟ۥ;->۠۠ۦۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :sswitch_f
    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v3

    const v0, 0xc202

    :goto_6
    const v4, 0xc213

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_10
    if-eqz v3, :cond_3

    const v0, 0xc25f

    goto :goto_6

    :cond_3
    :sswitch_11
    const v0, 0xc240

    goto :goto_6

    :sswitch_12
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v0

    const/16 v1, 0x191

    sget v2, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v2, v2, 0x280

    const/16 v3, 0x6a5

    invoke-static {v0, v1, v2, v3}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v0

    :goto_7
    return-object v0

    :sswitch_13
    invoke-static {v2}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xc27e

    :goto_8
    const v3, 0xc28f

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_6

    goto :goto_8

    :cond_4
    :sswitch_14
    const v0, 0xc2bc

    goto :goto_8

    :sswitch_15
    if-eqz v2, :cond_4

    const v0, 0xc2db

    goto :goto_8

    :sswitch_16
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v0

    const/16 v1, 0x19e

    sget v2, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v2, v2, 0x3a6

    const/16 v3, 0x933

    invoke-static {v0, v1, v2, v3}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v0

    goto :goto_7

    :sswitch_17
    invoke-static {v1}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc2fa

    :goto_9
    const v2, 0xc30b

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_7

    goto :goto_9

    :sswitch_18
    if-eqz v1, :cond_5

    const v0, 0xc5e2

    goto :goto_9

    :cond_5
    :sswitch_19
    const v0, 0xc5c3

    goto :goto_9

    :sswitch_1a
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->۟ۡ۠ۤۡ()[S

    move-result-object v0

    const/16 v1, 0x1a4

    sget v2, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v2, v2, 0x38b

    const/16 v3, 0x74a

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v0

    goto :goto_7

    :sswitch_1b
    const/4 v0, 0x0

    goto :goto_7

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
        0xb918 -> :sswitch_c
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_a
        0x35 -> :sswitch_f
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_14
        0x33 -> :sswitch_17
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_18
        0x6af -> :sswitch_19
        0x6c8 -> :sswitch_1b
        0x6e9 -> :sswitch_1a
    .end sparse-switch
.end method

.method public static ۟۟ۥۧ(Ljava/lang/Object;F)I
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۠۠ۥ;->ۡۥ۠ۦ()I

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

    invoke-static {p0, p1}, Lkevin/fun/hook/webdav/WebDAVDialog;->dp(Landroid/content/Context;F)I

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

.method public static ۣ۟ۡ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/widget/TextView;
    .locals 2

    invoke-static {}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۥۦۢ()I

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

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/webdav/WebDAVDialog;->createDouyinButton(Landroid/content/Context;Ljava/lang/String;I)Landroid/widget/TextView;

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

.method public static ۟ۡ۠ۤۡ()[S
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
    sget-object v0, Lkevin/fun/hook/webdav/WebDAVDialog;->short:[S

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

.method public static ۟ۢ۠ۢۦ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Landroid/widget/LinearLayout;
    .locals 2

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    check-cast p1, Ljava/lang/String;

    check-cast p3, Ljava/util/function/Consumer;

    invoke-static {p0, p1, p2, p3}, Lkevin/fun/hook/webdav/WebDAVDialog;->createDouyinSwitchRow(Landroid/content/Context;Ljava/lang/String;ZLjava/util/function/Consumer;)Landroid/widget/LinearLayout;

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

.method public static ۟ۢۥۢ۟(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

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

    invoke-static {p0, p1}, Lkevin/fun/hook/webdav/WebDAVDialog;->showSafeToast(Landroid/content/Context;Ljava/lang/String;)V

    :sswitch_3
    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->۟ۦۨ۠ۥ()I

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
    const-string v0, "L3ilMaRrtjf1Z"

    invoke-static {v0}, Landroidx/emoji2/ۢۧۡۧ;->ۣۢ۠ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

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

.method public static ۟ۢۨۡۤ()Landroid/widget/EditText;
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۤۥ()I

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
    sget-object v0, Lkevin/fun/hook/webdav/WebDAVDialog;->usernameEditText:Landroid/widget/EditText;

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

.method public static ۟ۤ۟ۢ۠()Landroid/os/Handler;
    .locals 2

    invoke-static {}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۠()I

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
    sget-object v0, Lkevin/fun/hook/webdav/WebDAVDialog;->MAIN_HANDLER:Landroid/os/Handler;

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

.method public static ۟ۥۢۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/widget/LinearLayout;
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
    check-cast p0, Landroid/content/Context;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/util/function/Consumer;

    invoke-static {p0, p1, p2, p3}, Lkevin/fun/hook/webdav/WebDAVDialog;->createPasswordRow(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Consumer;)Landroid/widget/LinearLayout;

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

.method public static ۟ۦۣۡۤ()Ljava/lang/String;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۤۧۢ()I

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
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog;->validateConfig()Ljava/lang/String;

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

.method public static ۣۡۧۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/widget/LinearLayout;
    .locals 2

    invoke-static {}, Landroidx/core/ۤۦ۟ۢ;->ۣۧۧۡ()I

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

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/util/function/Consumer;

    check-cast p4, Ljava/lang/String;

    invoke-static {p0, p1, p2, p3, p4}, Lkevin/fun/hook/webdav/WebDAVDialog;->createEditRow(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Consumer;Ljava/lang/String;)Landroid/widget/LinearLayout;

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

.method public static ۢۥۦۧ()Lkevin/fun/hook/webdav/WebDAVConfig$BackupCallback;
    .locals 2

    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۨۧۥ()I

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
    sget-object v0, Lkevin/fun/hook/webdav/WebDAVDialog;->pendingRestoreCallback:Lkevin/fun/hook/webdav/WebDAVConfig$BackupCallback;

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

.method public static ۣۧۢۤ()Landroid/widget/EditText;
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
    sget-object v0, Lkevin/fun/hook/webdav/WebDAVDialog;->passwordEditText:Landroid/widget/EditText;

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

.method public static ۥۢۡۦ(Ljava/lang/Object;)Landroid/graphics/drawable/GradientDrawable;
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lkevin/fun/hook/webdav/WebDAVDialog;->createRippleDrawable(Landroid/content/Context;)Landroid/graphics/drawable/GradientDrawable;

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

.method public static ۥۤۦۦ()Landroid/content/Context;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟۟ۡۡۦ()I

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
    sget-object v0, Lkevin/fun/hook/webdav/WebDAVDialog;->pendingContext:Landroid/content/Context;

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

.method public static ۥۧۡ۟()Landroid/widget/EditText;
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۤ۠ۧۡ()I

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
    sget-object v0, Lkevin/fun/hook/webdav/WebDAVDialog;->urlEditText:Landroid/widget/EditText;

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

.method public static ۦۧۢ۠(Ljava/lang/Object;)Landroid/view/View;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۦۣ۠۠()I

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

    invoke-static {p0}, Lkevin/fun/hook/webdav/WebDAVDialog;->createDivider(Landroid/content/Context;)Landroid/view/View;

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

.method public static ۨۥۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۣۨ()I

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
    check-cast p0, Landroid/widget/TextView;

    check-cast p1, Landroid/content/Context;

    invoke-static {p0, p1}, Lkevin/fun/hook/webdav/WebDAVDialog;->updateLocalStatusText(Landroid/widget/TextView;Landroid/content/Context;)V

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
