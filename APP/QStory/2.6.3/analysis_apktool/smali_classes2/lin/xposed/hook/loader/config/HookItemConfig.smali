.class public Llin/xposed/hook/loader/config/HookItemConfig;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private bypassDefaultLoad:Ljava/lang/Boolean;

.field private enabled:Ljava/lang/Boolean;

.field private itemPath:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Llin/xposed/hook/loader/config/HookItemConfig;->enabled:Ljava/lang/Boolean;

    .line 15
    iput-object v0, p0, Llin/xposed/hook/loader/config/HookItemConfig;->bypassDefaultLoad:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 5
    .line 6
    iput-object v0, p0, Llin/xposed/hook/loader/config/HookItemConfig;->enabled:Ljava/lang/Boolean;

    .line 7
    .line 8
    iput-object v0, p0, Llin/xposed/hook/loader/config/HookItemConfig;->bypassDefaultLoad:Ljava/lang/Boolean;

    .line 9
    .line 10
    iput-object p1, p0, Llin/xposed/hook/loader/config/HookItemConfig;->itemPath:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public getBypassDefaultLoad()Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/loader/config/HookItemConfig;->bypassDefaultLoad:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public getItemPath()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/loader/config/HookItemConfig;->itemPath:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public isEnabled()Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/loader/config/HookItemConfig;->enabled:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public setBypassDefaultLoad(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/loader/config/HookItemConfig;->bypassDefaultLoad:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-void
.end method

.method public setEnabled(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/loader/config/HookItemConfig;->enabled:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-void
.end method

.method public setItemPath(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/loader/config/HookItemConfig;->itemPath:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x30e

    .line 7
    .line 8
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Llin/xposed/hook/loader/config/HookItemConfig;->itemPath:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const/16 v1, 0x27

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x30f

    .line 26
    .line 27
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Llin/xposed/hook/loader/config/HookItemConfig;->enabled:Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const/16 v1, 0x310

    .line 40
    .line 41
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Llin/xposed/hook/loader/config/HookItemConfig;->bypassDefaultLoad:Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const/16 p0, 0x7d

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method
