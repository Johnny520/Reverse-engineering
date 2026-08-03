.class public final Lh/Hchat/hooks/items/script/ScriptAudioBridge;
.super Ltb/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final $stable:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Ltb/c;->$stable:I

    .line 2
    .line 3
    sput v0, Lh/Hchat/hooks/items/script/ScriptAudioBridge;->$stable:I

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Lh/Hchat/hooks/items/script/ScriptPluginBridge;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lb0/d0;

    .line 5
    .line 6
    const/16 v1, 0xa

    .line 7
    .line 8
    invoke-direct {v0, p1, v1}, Lb0/d0;-><init>(Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, Ltb/c;-><init>(Lb0/d0;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private static final _init_$lambda$0(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/lang/String;)Lsf/n;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->log(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic e(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/lang/String;)Lsf/n;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lh/Hchat/hooks/items/script/ScriptAudioBridge;->_init_$lambda$0(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/lang/String;)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
