.class public final Lhe;
.super Lv70;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final c:Lhe;

.field public static final d:Lhe;

.field public static final e:Lhe;

.field public static final f:Lhe;

.field public static final g:Lhe;

.field public static final h:Lhe;

.field public static final i:Lhe;


# instance fields
.field public final synthetic b:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lhe;

    .line 2
    .line 3
    const-string v1, "AntiRevokeNoTip.MethodAntiRevokeNoTip"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lhe;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lhe;->c:Lhe;

    .line 10
    .line 11
    new-instance v0, Lhe;

    .line 12
    .line 13
    const-string v1, "BlockXposedDetection.MethodCheckXposed"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lhe;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lhe;->d:Lhe;

    .line 20
    .line 21
    new-instance v0, Lhe;

    .line 22
    .line 23
    const-string v1, "ConversationStorage.MethodDeleteConversation"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lhe;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lhe;->e:Lhe;

    .line 30
    .line 31
    new-instance v0, Lhe;

    .line 32
    .line 33
    const-string v1, "ConversationStorage.MethodUpdateUnReadCount"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lhe;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lhe;->f:Lhe;

    .line 40
    .line 41
    new-instance v0, Lhe;

    .line 42
    .line 43
    const-string v1, "EnableRoundAvatar.MethodGetFixedAvatarBitmap"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, Lhe;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lhe;->g:Lhe;

    .line 50
    .line 51
    new-instance v0, Lhe;

    .line 52
    .line 53
    const-string v1, "FocusPadMode.MethodCheckIsPadMode"

    .line 54
    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-direct {v0, v1, v2}, Lhe;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lhe;->h:Lhe;

    .line 60
    .line 61
    new-instance v0, Lhe;

    .line 62
    .line 63
    const-string v1, "FocusPadMode.MethodUnLockPadModeUI"

    .line 64
    .line 65
    const/4 v2, 0x6

    .line 66
    invoke-direct {v0, v1, v2}, Lhe;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sput-object v0, Lhe;->i:Lhe;

    .line 70
    .line 71
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, Lhe;->b:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lv70;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lorg/luckypray/dexkit/DexKitBridge;)V
    .locals 2

    .line 1
    iget v0, p0, Lhe;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lgs;

    .line 7
    .line 8
    const/16 v1, 0x18

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lgs;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1, v0}, Lv70;->c(Lorg/luckypray/dexkit/DexKitBridge;Lin0;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    new-instance v0, Lgs;

    .line 18
    .line 19
    const/16 v1, 0x17

    .line 20
    .line 21
    invoke-direct {v0, v1}, Lgs;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1, v0}, Lv70;->c(Lorg/luckypray/dexkit/DexKitBridge;Lin0;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    new-instance v0, Lgs;

    .line 29
    .line 30
    const/16 v1, 0x13

    .line 31
    .line 32
    invoke-direct {v0, v1}, Lgs;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1, v0}, Lv70;->c(Lorg/luckypray/dexkit/DexKitBridge;Lin0;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_2
    new-instance v0, Lgs;

    .line 40
    .line 41
    const/4 v1, 0x5

    .line 42
    invoke-direct {v0, v1}, Lgs;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1, v0}, Lv70;->c(Lorg/luckypray/dexkit/DexKitBridge;Lin0;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_3
    new-instance v0, Lgs;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    invoke-direct {v0, v1}, Lgs;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p1, v0}, Lv70;->c(Lorg/luckypray/dexkit/DexKitBridge;Lin0;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_4
    new-instance v0, Lw;

    .line 60
    .line 61
    const/16 v1, 0x16

    .line 62
    .line 63
    invoke-direct {v0, v1}, Lw;-><init>(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p1, v0}, Lv70;->c(Lorg/luckypray/dexkit/DexKitBridge;Lin0;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_5
    new-instance v0, Lw;

    .line 71
    .line 72
    const/16 v1, 0xa

    .line 73
    .line 74
    invoke-direct {v0, v1}, Lw;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p1, v0}, Lv70;->c(Lorg/luckypray/dexkit/DexKitBridge;Lin0;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
